package okhttp3.internal.cache;

import dc.w;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Flushable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.KotlinNothingValueException;
import nc.b;
import okhttp3.internal.Util;
import okhttp3.internal.cache.DiskLruCache;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.io.FileSystem;
import okhttp3.internal.platform.Platform;
import okio.Source;
import okio.d;
import okio.e;
import okio.l0;
import okio.m;
import okio.y0;
import qc.h;
import qc.q;
import yc.j;
import yc.v;

/* compiled from: DiskLruCache.kt */
/* loaded from: classes4.dex */
public final class DiskLruCache implements Closeable, Flushable {
    private final int appVersion;
    private boolean civilizedFileSystem;
    private final TaskQueue cleanupQueue;
    private final DiskLruCache$cleanupTask$1 cleanupTask;
    private boolean closed;
    private final File directory;
    private final FileSystem fileSystem;
    private boolean hasJournalErrors;
    private boolean initialized;
    private final File journalFile;
    private final File journalFileBackup;
    private final File journalFileTmp;
    private d journalWriter;
    private final LinkedHashMap<String, Entry> lruEntries;
    private long maxSize;
    private boolean mostRecentRebuildFailed;
    private boolean mostRecentTrimFailed;
    private long nextSequenceNumber;
    private int redundantOpCount;
    private long size;
    private final int valueCount;
    public static final Companion Companion = new Companion(null);
    public static final String JOURNAL_FILE = "journal";
    public static final String JOURNAL_FILE_TEMP = "journal.tmp";
    public static final String JOURNAL_FILE_BACKUP = "journal.bkp";
    public static final String MAGIC = "libcore.io.DiskLruCache";
    public static final String VERSION_1 = "1";
    public static final long ANY_SEQUENCE_NUMBER = -1;
    public static final j LEGAL_KEY_PATTERN = new j("[a-z0-9_-]{1,120}");
    public static final String CLEAN = "CLEAN";
    public static final String DIRTY = "DIRTY";
    public static final String REMOVE = "REMOVE";
    public static final String READ = "READ";

    /* compiled from: DiskLruCache.kt */
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }
    }

    /* compiled from: DiskLruCache.kt */
    /* loaded from: classes4.dex */
    public final class Editor {
        private boolean done;
        private final Entry entry;
        final /* synthetic */ DiskLruCache this$0;
        private final boolean[] written;

        public Editor(DiskLruCache diskLruCache, Entry entry) {
            boolean[] zArr;
            q.i(diskLruCache, "this$0");
            q.i(entry, "entry");
            this.this$0 = diskLruCache;
            this.entry = entry;
            if (entry.getReadable$okhttp()) {
                zArr = null;
            } else {
                zArr = new boolean[diskLruCache.getValueCount$okhttp()];
            }
            this.written = zArr;
        }

        public final void abort() throws IOException {
            DiskLruCache diskLruCache = this.this$0;
            synchronized (diskLruCache) {
                if ((!this.done) != false) {
                    if (q.d(getEntry$okhttp().getCurrentEditor$okhttp(), this)) {
                        diskLruCache.completeEdit$okhttp(this, false);
                    }
                    this.done = true;
                    w wVar = w.f13270a;
                } else {
                    throw new IllegalStateException("Check failed.".toString());
                }
            }
        }

        public final void commit() throws IOException {
            DiskLruCache diskLruCache = this.this$0;
            synchronized (diskLruCache) {
                if ((!this.done) != false) {
                    if (q.d(getEntry$okhttp().getCurrentEditor$okhttp(), this)) {
                        diskLruCache.completeEdit$okhttp(this, true);
                    }
                    this.done = true;
                    w wVar = w.f13270a;
                } else {
                    throw new IllegalStateException("Check failed.".toString());
                }
            }
        }

        public final void detach$okhttp() {
            if (q.d(this.entry.getCurrentEditor$okhttp(), this)) {
                if (this.this$0.civilizedFileSystem) {
                    this.this$0.completeEdit$okhttp(this, false);
                } else {
                    this.entry.setZombie$okhttp(true);
                }
            }
        }

        public final Entry getEntry$okhttp() {
            return this.entry;
        }

        public final boolean[] getWritten$okhttp() {
            return this.written;
        }

        public final y0 newSink(int i10) {
            DiskLruCache diskLruCache = this.this$0;
            synchronized (diskLruCache) {
                if ((!this.done) != false) {
                    if (!q.d(getEntry$okhttp().getCurrentEditor$okhttp(), this)) {
                        return l0.b();
                    }
                    if (!getEntry$okhttp().getReadable$okhttp()) {
                        boolean[] written$okhttp = getWritten$okhttp();
                        q.f(written$okhttp);
                        written$okhttp[i10] = true;
                    }
                    try {
                        return new FaultHidingSink(diskLruCache.getFileSystem$okhttp().sink(getEntry$okhttp().getDirtyFiles$okhttp().get(i10)), new DiskLruCache$Editor$newSink$1$1(diskLruCache, this));
                    } catch (FileNotFoundException unused) {
                        return l0.b();
                    }
                }
                throw new IllegalStateException("Check failed.".toString());
            }
        }

        public final Source newSource(int i10) {
            DiskLruCache diskLruCache = this.this$0;
            synchronized (diskLruCache) {
                if ((!this.done) != false) {
                    Source source = null;
                    if (!getEntry$okhttp().getReadable$okhttp() || !q.d(getEntry$okhttp().getCurrentEditor$okhttp(), this) || getEntry$okhttp().getZombie$okhttp()) {
                        return null;
                    }
                    try {
                        source = diskLruCache.getFileSystem$okhttp().source(getEntry$okhttp().getCleanFiles$okhttp().get(i10));
                    } catch (FileNotFoundException unused) {
                    }
                    return source;
                }
                throw new IllegalStateException("Check failed.".toString());
            }
        }
    }

    /* compiled from: DiskLruCache.kt */
    /* loaded from: classes4.dex */
    public final class Entry {
        private final List<File> cleanFiles;
        private Editor currentEditor;
        private final List<File> dirtyFiles;
        private final String key;
        private final long[] lengths;
        private int lockingSourceCount;
        private boolean readable;
        private long sequenceNumber;
        final /* synthetic */ DiskLruCache this$0;
        private boolean zombie;

        public Entry(DiskLruCache diskLruCache, String str) {
            q.i(diskLruCache, "this$0");
            q.i(str, "key");
            this.this$0 = diskLruCache;
            this.key = str;
            this.lengths = new long[diskLruCache.getValueCount$okhttp()];
            this.cleanFiles = new ArrayList();
            this.dirtyFiles = new ArrayList();
            StringBuilder sb2 = new StringBuilder(str);
            sb2.append('.');
            int length = sb2.length();
            int valueCount$okhttp = diskLruCache.getValueCount$okhttp();
            for (int i10 = 0; i10 < valueCount$okhttp; i10++) {
                sb2.append(i10);
                this.cleanFiles.add(new File(this.this$0.getDirectory(), sb2.toString()));
                sb2.append(".tmp");
                this.dirtyFiles.add(new File(this.this$0.getDirectory(), sb2.toString()));
                sb2.setLength(length);
            }
        }

        private final Void invalidLengths(List<String> list) throws IOException {
            throw new IOException(q.q("unexpected journal line: ", list));
        }

        private final Source newSource(int i10) {
            final Source source = this.this$0.getFileSystem$okhttp().source(this.cleanFiles.get(i10));
            if (this.this$0.civilizedFileSystem) {
                return source;
            }
            this.lockingSourceCount++;
            final DiskLruCache diskLruCache = this.this$0;
            return new m(diskLruCache, this) { // from class: okhttp3.internal.cache.DiskLruCache$Entry$newSource$1
                private boolean closed;
                final /* synthetic */ DiskLruCache this$0;
                final /* synthetic */ DiskLruCache.Entry this$1;

                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(Source.this);
                    this.this$0 = diskLruCache;
                    this.this$1 = this;
                }

                @Override // okio.m, okio.Source, java.io.Closeable, java.lang.AutoCloseable
                public void close() {
                    super.close();
                    if (!this.closed) {
                        this.closed = true;
                        DiskLruCache diskLruCache2 = this.this$0;
                        DiskLruCache.Entry entry = this.this$1;
                        synchronized (diskLruCache2) {
                            entry.setLockingSourceCount$okhttp(entry.getLockingSourceCount$okhttp() - 1);
                            if (entry.getLockingSourceCount$okhttp() == 0 && entry.getZombie$okhttp()) {
                                diskLruCache2.removeEntry$okhttp(entry);
                            }
                            w wVar = w.f13270a;
                        }
                    }
                }
            };
        }

        public final List<File> getCleanFiles$okhttp() {
            return this.cleanFiles;
        }

        public final Editor getCurrentEditor$okhttp() {
            return this.currentEditor;
        }

        public final List<File> getDirtyFiles$okhttp() {
            return this.dirtyFiles;
        }

        public final String getKey$okhttp() {
            return this.key;
        }

        public final long[] getLengths$okhttp() {
            return this.lengths;
        }

        public final int getLockingSourceCount$okhttp() {
            return this.lockingSourceCount;
        }

        public final boolean getReadable$okhttp() {
            return this.readable;
        }

        public final long getSequenceNumber$okhttp() {
            return this.sequenceNumber;
        }

        public final boolean getZombie$okhttp() {
            return this.zombie;
        }

        public final void setCurrentEditor$okhttp(Editor editor) {
            this.currentEditor = editor;
        }

        public final void setLengths$okhttp(List<String> list) throws IOException {
            q.i(list, "strings");
            if (list.size() == this.this$0.getValueCount$okhttp()) {
                try {
                    int size = list.size();
                    int i10 = 0;
                    while (i10 < size) {
                        int i11 = i10 + 1;
                        this.lengths[i10] = Long.parseLong(list.get(i10));
                        i10 = i11;
                    }
                    return;
                } catch (NumberFormatException unused) {
                    invalidLengths(list);
                    throw new KotlinNothingValueException();
                }
            }
            invalidLengths(list);
            throw new KotlinNothingValueException();
        }

        public final void setLockingSourceCount$okhttp(int i10) {
            this.lockingSourceCount = i10;
        }

        public final void setReadable$okhttp(boolean z10) {
            this.readable = z10;
        }

        public final void setSequenceNumber$okhttp(long j10) {
            this.sequenceNumber = j10;
        }

        public final void setZombie$okhttp(boolean z10) {
            this.zombie = z10;
        }

        public final Snapshot snapshot$okhttp() {
            DiskLruCache diskLruCache = this.this$0;
            if (Util.assertionsEnabled && !Thread.holdsLock(diskLruCache)) {
                throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST hold lock on " + diskLruCache);
            } else if (!this.readable) {
                return null;
            } else {
                if (!this.this$0.civilizedFileSystem && (this.currentEditor != null || this.zombie)) {
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                long[] jArr = (long[]) this.lengths.clone();
                try {
                    int valueCount$okhttp = this.this$0.getValueCount$okhttp();
                    for (int i10 = 0; i10 < valueCount$okhttp; i10++) {
                        arrayList.add(newSource(i10));
                    }
                    return new Snapshot(this.this$0, this.key, this.sequenceNumber, arrayList, jArr);
                } catch (FileNotFoundException unused) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        Util.closeQuietly((Source) it.next());
                    }
                    try {
                        this.this$0.removeEntry$okhttp(this);
                    } catch (IOException unused2) {
                    }
                    return null;
                }
            }
        }

        public final void writeLengths$okhttp(d dVar) throws IOException {
            q.i(dVar, "writer");
            long[] jArr = this.lengths;
            int length = jArr.length;
            int i10 = 0;
            while (i10 < length) {
                long j10 = jArr[i10];
                i10++;
                dVar.D(32).P0(j10);
            }
        }
    }

    /* compiled from: DiskLruCache.kt */
    /* loaded from: classes4.dex */
    public final class Snapshot implements Closeable {
        private final String key;
        private final long[] lengths;
        private final long sequenceNumber;
        private final List<Source> sources;
        final /* synthetic */ DiskLruCache this$0;

        /* JADX WARN: Multi-variable type inference failed */
        public Snapshot(DiskLruCache diskLruCache, String str, long j10, List<? extends Source> list, long[] jArr) {
            q.i(diskLruCache, "this$0");
            q.i(str, "key");
            q.i(list, "sources");
            q.i(jArr, "lengths");
            this.this$0 = diskLruCache;
            this.key = str;
            this.sequenceNumber = j10;
            this.sources = list;
            this.lengths = jArr;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            Iterator<Source> it = this.sources.iterator();
            while (it.hasNext()) {
                Util.closeQuietly(it.next());
            }
        }

        public final Editor edit() throws IOException {
            return this.this$0.edit(this.key, this.sequenceNumber);
        }

        public final long getLength(int i10) {
            return this.lengths[i10];
        }

        public final Source getSource(int i10) {
            return this.sources.get(i10);
        }

        public final String key() {
            return this.key;
        }
    }

    /* JADX WARN: Type inference failed for: r11v2, types: [okhttp3.internal.cache.DiskLruCache$cleanupTask$1] */
    public DiskLruCache(FileSystem fileSystem, File file, int i10, int i11, long j10, TaskRunner taskRunner) {
        boolean z10;
        q.i(fileSystem, "fileSystem");
        q.i(file, "directory");
        q.i(taskRunner, "taskRunner");
        this.fileSystem = fileSystem;
        this.directory = file;
        this.appVersion = i10;
        this.valueCount = i11;
        this.maxSize = j10;
        this.lruEntries = new LinkedHashMap<>(0, 0.75f, true);
        this.cleanupQueue = taskRunner.newQueue();
        final String q10 = q.q(Util.okHttpName, " Cache");
        this.cleanupTask = new Task(q10) { // from class: okhttp3.internal.cache.DiskLruCache$cleanupTask$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                int i12 = 2;
                h hVar = null;
                boolean z11 = false;
            }

            @Override // okhttp3.internal.concurrent.Task
            public long runOnce() {
                boolean z11;
                boolean journalRebuildRequired;
                DiskLruCache diskLruCache = DiskLruCache.this;
                synchronized (diskLruCache) {
                    z11 = diskLruCache.initialized;
                    if (!z11 || diskLruCache.getClosed$okhttp()) {
                        return -1L;
                    }
                    try {
                        diskLruCache.trimToSize();
                    } catch (IOException unused) {
                        diskLruCache.mostRecentTrimFailed = true;
                    }
                    try {
                        journalRebuildRequired = diskLruCache.journalRebuildRequired();
                        if (journalRebuildRequired) {
                            diskLruCache.rebuildJournal$okhttp();
                            diskLruCache.redundantOpCount = 0;
                        }
                    } catch (IOException unused2) {
                        diskLruCache.mostRecentRebuildFailed = true;
                        diskLruCache.journalWriter = l0.c(l0.b());
                    }
                    return -1L;
                }
            }
        };
        if (j10 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (i11 > 0) {
                this.journalFile = new File(file, JOURNAL_FILE);
                this.journalFileTmp = new File(file, JOURNAL_FILE_TEMP);
                this.journalFileBackup = new File(file, JOURNAL_FILE_BACKUP);
                return;
            }
            throw new IllegalArgumentException("valueCount <= 0".toString());
        }
        throw new IllegalArgumentException("maxSize <= 0".toString());
    }

    private final synchronized void checkNotClosed() {
        if ((!this.closed) == false) {
            throw new IllegalStateException("cache is closed".toString());
        }
    }

    public static /* synthetic */ Editor edit$default(DiskLruCache diskLruCache, String str, long j10, int i10, Object obj) throws IOException {
        if ((i10 & 2) != 0) {
            j10 = ANY_SEQUENCE_NUMBER;
        }
        return diskLruCache.edit(str, j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean journalRebuildRequired() {
        int i10 = this.redundantOpCount;
        if (i10 >= 2000 && i10 >= this.lruEntries.size()) {
            return true;
        }
        return false;
    }

    private final d newJournalWriter() throws FileNotFoundException {
        return l0.c(new FaultHidingSink(this.fileSystem.appendingSink(this.journalFile), new DiskLruCache$newJournalWriter$faultHidingSink$1(this)));
    }

    private final void processJournal() throws IOException {
        this.fileSystem.delete(this.journalFileTmp);
        Iterator<Entry> it = this.lruEntries.values().iterator();
        while (it.hasNext()) {
            Entry next = it.next();
            q.h(next, "i.next()");
            Entry entry = next;
            int i10 = 0;
            if (entry.getCurrentEditor$okhttp() == null) {
                int i11 = this.valueCount;
                while (i10 < i11) {
                    this.size += entry.getLengths$okhttp()[i10];
                    i10++;
                }
            } else {
                entry.setCurrentEditor$okhttp(null);
                int i12 = this.valueCount;
                while (i10 < i12) {
                    this.fileSystem.delete(entry.getCleanFiles$okhttp().get(i10));
                    this.fileSystem.delete(entry.getDirtyFiles$okhttp().get(i10));
                    i10++;
                }
                it.remove();
            }
        }
    }

    private final void readJournal() throws IOException {
        boolean z10;
        e d10 = l0.d(this.fileSystem.source(this.journalFile));
        try {
            String t02 = d10.t0();
            String t03 = d10.t0();
            String t04 = d10.t0();
            String t05 = d10.t0();
            String t06 = d10.t0();
            if (q.d(MAGIC, t02) && q.d(VERSION_1, t03) && q.d(String.valueOf(this.appVersion), t04) && q.d(String.valueOf(getValueCount$okhttp()), t05)) {
                int i10 = 0;
                if (t06.length() > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    while (true) {
                        try {
                            readJournalLine(d10.t0());
                            i10++;
                        } catch (EOFException unused) {
                            this.redundantOpCount = i10 - getLruEntries$okhttp().size();
                            if (!d10.C()) {
                                rebuildJournal$okhttp();
                            } else {
                                this.journalWriter = newJournalWriter();
                            }
                            w wVar = w.f13270a;
                            b.a(d10, null);
                            return;
                        }
                    }
                }
            }
            throw new IOException("unexpected journal header: [" + t02 + ", " + t03 + ", " + t05 + ", " + t06 + ']');
        } finally {
        }
    }

    private final void readJournalLine(String str) throws IOException {
        int W;
        int W2;
        String substring;
        boolean F;
        boolean F2;
        boolean F3;
        List<String> w02;
        boolean F4;
        W = yc.w.W(str, ' ', 0, false, 6, null);
        if (W != -1) {
            int i10 = W + 1;
            W2 = yc.w.W(str, ' ', i10, false, 4, null);
            if (W2 == -1) {
                substring = str.substring(i10);
                q.h(substring, "this as java.lang.String).substring(startIndex)");
                String str2 = REMOVE;
                if (W == str2.length()) {
                    F4 = v.F(str, str2, false, 2, null);
                    if (F4) {
                        this.lruEntries.remove(substring);
                        return;
                    }
                }
            } else {
                substring = str.substring(i10, W2);
                q.h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            Entry entry = this.lruEntries.get(substring);
            if (entry == null) {
                entry = new Entry(this, substring);
                this.lruEntries.put(substring, entry);
            }
            if (W2 != -1) {
                String str3 = CLEAN;
                if (W == str3.length()) {
                    F3 = v.F(str, str3, false, 2, null);
                    if (F3) {
                        String substring2 = str.substring(W2 + 1);
                        q.h(substring2, "this as java.lang.String).substring(startIndex)");
                        w02 = yc.w.w0(substring2, new char[]{' '}, false, 0, 6, null);
                        entry.setReadable$okhttp(true);
                        entry.setCurrentEditor$okhttp(null);
                        entry.setLengths$okhttp(w02);
                        return;
                    }
                }
            }
            if (W2 == -1) {
                String str4 = DIRTY;
                if (W == str4.length()) {
                    F2 = v.F(str, str4, false, 2, null);
                    if (F2) {
                        entry.setCurrentEditor$okhttp(new Editor(this, entry));
                        return;
                    }
                }
            }
            if (W2 == -1) {
                String str5 = READ;
                if (W == str5.length()) {
                    F = v.F(str, str5, false, 2, null);
                    if (F) {
                        return;
                    }
                }
            }
            throw new IOException(q.q("unexpected journal line: ", str));
        }
        throw new IOException(q.q("unexpected journal line: ", str));
    }

    private final boolean removeOldestEntry() {
        for (Entry entry : this.lruEntries.values()) {
            if (!entry.getZombie$okhttp()) {
                q.h(entry, "toEvict");
                removeEntry$okhttp(entry);
                return true;
            }
        }
        return false;
    }

    private final void validateKey(String str) {
        if (LEGAL_KEY_PATTERN.f(str)) {
            return;
        }
        throw new IllegalArgumentException(("keys must match regex [a-z0-9_-]{1,120}: \"" + str + '\"').toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        Editor currentEditor$okhttp;
        if (this.initialized && !this.closed) {
            Collection<Entry> values = this.lruEntries.values();
            q.h(values, "lruEntries.values");
            int i10 = 0;
            Object[] array = values.toArray(new Entry[0]);
            if (array != null) {
                Entry[] entryArr = (Entry[]) array;
                int length = entryArr.length;
                while (i10 < length) {
                    Entry entry = entryArr[i10];
                    i10++;
                    if (entry.getCurrentEditor$okhttp() != null && (currentEditor$okhttp = entry.getCurrentEditor$okhttp()) != null) {
                        currentEditor$okhttp.detach$okhttp();
                    }
                }
                trimToSize();
                d dVar = this.journalWriter;
                q.f(dVar);
                dVar.close();
                this.journalWriter = null;
                this.closed = true;
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        this.closed = true;
    }

    public final synchronized void completeEdit$okhttp(Editor editor, boolean z10) throws IOException {
        q.i(editor, "editor");
        Entry entry$okhttp = editor.getEntry$okhttp();
        if (q.d(entry$okhttp.getCurrentEditor$okhttp(), editor)) {
            int i10 = 0;
            if (z10 && !entry$okhttp.getReadable$okhttp()) {
                int i11 = this.valueCount;
                int i12 = 0;
                while (i12 < i11) {
                    int i13 = i12 + 1;
                    boolean[] written$okhttp = editor.getWritten$okhttp();
                    q.f(written$okhttp);
                    if (written$okhttp[i12]) {
                        if (!this.fileSystem.exists(entry$okhttp.getDirtyFiles$okhttp().get(i12))) {
                            editor.abort();
                            return;
                        }
                        i12 = i13;
                    } else {
                        editor.abort();
                        throw new IllegalStateException(q.q("Newly created entry didn't create value for index ", Integer.valueOf(i12)));
                    }
                }
            }
            int i14 = this.valueCount;
            while (i10 < i14) {
                int i15 = i10 + 1;
                File file = entry$okhttp.getDirtyFiles$okhttp().get(i10);
                if (z10 && !entry$okhttp.getZombie$okhttp()) {
                    if (this.fileSystem.exists(file)) {
                        File file2 = entry$okhttp.getCleanFiles$okhttp().get(i10);
                        this.fileSystem.rename(file, file2);
                        long j10 = entry$okhttp.getLengths$okhttp()[i10];
                        long size = this.fileSystem.size(file2);
                        entry$okhttp.getLengths$okhttp()[i10] = size;
                        this.size = (this.size - j10) + size;
                    }
                } else {
                    this.fileSystem.delete(file);
                }
                i10 = i15;
            }
            entry$okhttp.setCurrentEditor$okhttp(null);
            if (entry$okhttp.getZombie$okhttp()) {
                removeEntry$okhttp(entry$okhttp);
                return;
            }
            this.redundantOpCount++;
            d dVar = this.journalWriter;
            q.f(dVar);
            if (!entry$okhttp.getReadable$okhttp() && !z10) {
                getLruEntries$okhttp().remove(entry$okhttp.getKey$okhttp());
                dVar.W(REMOVE).D(32);
                dVar.W(entry$okhttp.getKey$okhttp());
                dVar.D(10);
                dVar.flush();
                if (this.size <= this.maxSize || journalRebuildRequired()) {
                    TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
                }
                return;
            }
            entry$okhttp.setReadable$okhttp(true);
            dVar.W(CLEAN).D(32);
            dVar.W(entry$okhttp.getKey$okhttp());
            entry$okhttp.writeLengths$okhttp(dVar);
            dVar.D(10);
            if (z10) {
                long j11 = this.nextSequenceNumber;
                this.nextSequenceNumber = 1 + j11;
                entry$okhttp.setSequenceNumber$okhttp(j11);
            }
            dVar.flush();
            if (this.size <= this.maxSize) {
            }
            TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final void delete() throws IOException {
        close();
        this.fileSystem.deleteContents(this.directory);
    }

    public final Editor edit(String str) throws IOException {
        q.i(str, "key");
        return edit$default(this, str, 0L, 2, null);
    }

    public final synchronized void evictAll() throws IOException {
        initialize();
        Collection<Entry> values = this.lruEntries.values();
        q.h(values, "lruEntries.values");
        Object[] array = values.toArray(new Entry[0]);
        if (array != null) {
            Entry[] entryArr = (Entry[]) array;
            int length = entryArr.length;
            int i10 = 0;
            while (i10 < length) {
                Entry entry = entryArr[i10];
                i10++;
                q.h(entry, "entry");
                removeEntry$okhttp(entry);
            }
            this.mostRecentTrimFailed = false;
        } else {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
    }

    @Override // java.io.Flushable
    public synchronized void flush() throws IOException {
        if (!this.initialized) {
            return;
        }
        checkNotClosed();
        trimToSize();
        d dVar = this.journalWriter;
        q.f(dVar);
        dVar.flush();
    }

    public final synchronized Snapshot get(String str) throws IOException {
        q.i(str, "key");
        initialize();
        checkNotClosed();
        validateKey(str);
        Entry entry = this.lruEntries.get(str);
        if (entry == null) {
            return null;
        }
        Snapshot snapshot$okhttp = entry.snapshot$okhttp();
        if (snapshot$okhttp == null) {
            return null;
        }
        this.redundantOpCount++;
        d dVar = this.journalWriter;
        q.f(dVar);
        dVar.W(READ).D(32).W(str).D(10);
        if (journalRebuildRequired()) {
            TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
        }
        return snapshot$okhttp;
    }

    public final boolean getClosed$okhttp() {
        return this.closed;
    }

    public final File getDirectory() {
        return this.directory;
    }

    public final FileSystem getFileSystem$okhttp() {
        return this.fileSystem;
    }

    public final LinkedHashMap<String, Entry> getLruEntries$okhttp() {
        return this.lruEntries;
    }

    public final synchronized long getMaxSize() {
        return this.maxSize;
    }

    public final int getValueCount$okhttp() {
        return this.valueCount;
    }

    public final synchronized void initialize() throws IOException {
        if (Util.assertionsEnabled && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST hold lock on " + this);
        }
        if (this.initialized) {
            return;
        }
        if (this.fileSystem.exists(this.journalFileBackup)) {
            if (this.fileSystem.exists(this.journalFile)) {
                this.fileSystem.delete(this.journalFileBackup);
            } else {
                this.fileSystem.rename(this.journalFileBackup, this.journalFile);
            }
        }
        this.civilizedFileSystem = Util.isCivilized(this.fileSystem, this.journalFileBackup);
        if (this.fileSystem.exists(this.journalFile)) {
            try {
                readJournal();
                processJournal();
                this.initialized = true;
                return;
            } catch (IOException e10) {
                Platform.Companion.get().log("DiskLruCache " + this.directory + " is corrupt: " + ((Object) e10.getMessage()) + ", removing", 5, e10);
                try {
                    delete();
                    this.closed = false;
                } catch (Throwable th) {
                    this.closed = false;
                    throw th;
                }
            }
        }
        rebuildJournal$okhttp();
        this.initialized = true;
    }

    public final synchronized boolean isClosed() {
        return this.closed;
    }

    public final synchronized void rebuildJournal$okhttp() throws IOException {
        d dVar = this.journalWriter;
        if (dVar != null) {
            dVar.close();
        }
        d c10 = l0.c(this.fileSystem.sink(this.journalFileTmp));
        try {
            c10.W(MAGIC).D(10);
            c10.W(VERSION_1).D(10);
            c10.P0(this.appVersion).D(10);
            c10.P0(getValueCount$okhttp()).D(10);
            c10.D(10);
            for (Entry entry : getLruEntries$okhttp().values()) {
                if (entry.getCurrentEditor$okhttp() != null) {
                    c10.W(DIRTY).D(32);
                    c10.W(entry.getKey$okhttp());
                    c10.D(10);
                } else {
                    c10.W(CLEAN).D(32);
                    c10.W(entry.getKey$okhttp());
                    entry.writeLengths$okhttp(c10);
                    c10.D(10);
                }
            }
            w wVar = w.f13270a;
            b.a(c10, null);
            if (this.fileSystem.exists(this.journalFile)) {
                this.fileSystem.rename(this.journalFile, this.journalFileBackup);
            }
            this.fileSystem.rename(this.journalFileTmp, this.journalFile);
            this.fileSystem.delete(this.journalFileBackup);
            this.journalWriter = newJournalWriter();
            this.hasJournalErrors = false;
            this.mostRecentRebuildFailed = false;
        } finally {
        }
    }

    public final synchronized boolean remove(String str) throws IOException {
        q.i(str, "key");
        initialize();
        checkNotClosed();
        validateKey(str);
        Entry entry = this.lruEntries.get(str);
        if (entry == null) {
            return false;
        }
        boolean removeEntry$okhttp = removeEntry$okhttp(entry);
        if (removeEntry$okhttp && this.size <= this.maxSize) {
            this.mostRecentTrimFailed = false;
        }
        return removeEntry$okhttp;
    }

    public final boolean removeEntry$okhttp(Entry entry) throws IOException {
        d dVar;
        q.i(entry, "entry");
        if (!this.civilizedFileSystem) {
            if (entry.getLockingSourceCount$okhttp() > 0 && (dVar = this.journalWriter) != null) {
                dVar.W(DIRTY);
                dVar.D(32);
                dVar.W(entry.getKey$okhttp());
                dVar.D(10);
                dVar.flush();
            }
            if (entry.getLockingSourceCount$okhttp() > 0 || entry.getCurrentEditor$okhttp() != null) {
                entry.setZombie$okhttp(true);
                return true;
            }
        }
        Editor currentEditor$okhttp = entry.getCurrentEditor$okhttp();
        if (currentEditor$okhttp != null) {
            currentEditor$okhttp.detach$okhttp();
        }
        int i10 = this.valueCount;
        for (int i11 = 0; i11 < i10; i11++) {
            this.fileSystem.delete(entry.getCleanFiles$okhttp().get(i11));
            this.size -= entry.getLengths$okhttp()[i11];
            entry.getLengths$okhttp()[i11] = 0;
        }
        this.redundantOpCount++;
        d dVar2 = this.journalWriter;
        if (dVar2 != null) {
            dVar2.W(REMOVE);
            dVar2.D(32);
            dVar2.W(entry.getKey$okhttp());
            dVar2.D(10);
        }
        this.lruEntries.remove(entry.getKey$okhttp());
        if (journalRebuildRequired()) {
            TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
        }
        return true;
    }

    public final void setClosed$okhttp(boolean z10) {
        this.closed = z10;
    }

    public final synchronized void setMaxSize(long j10) {
        this.maxSize = j10;
        if (this.initialized) {
            TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
        }
    }

    public final synchronized long size() throws IOException {
        initialize();
        return this.size;
    }

    public final synchronized Iterator<Snapshot> snapshots() throws IOException {
        initialize();
        return new DiskLruCache$snapshots$1(this);
    }

    public final void trimToSize() throws IOException {
        while (this.size > this.maxSize) {
            if (!removeOldestEntry()) {
                return;
            }
        }
        this.mostRecentTrimFailed = false;
    }

    public final synchronized Editor edit(String str, long j10) throws IOException {
        q.i(str, "key");
        initialize();
        checkNotClosed();
        validateKey(str);
        Entry entry = this.lruEntries.get(str);
        if (j10 == ANY_SEQUENCE_NUMBER || (entry != null && entry.getSequenceNumber$okhttp() == j10)) {
            if ((entry == null ? null : entry.getCurrentEditor$okhttp()) != null) {
                return null;
            }
            if (entry == null || entry.getLockingSourceCount$okhttp() == 0) {
                if (!this.mostRecentTrimFailed && !this.mostRecentRebuildFailed) {
                    d dVar = this.journalWriter;
                    q.f(dVar);
                    dVar.W(DIRTY).D(32).W(str).D(10);
                    dVar.flush();
                    if (this.hasJournalErrors) {
                        return null;
                    }
                    if (entry == null) {
                        entry = new Entry(this, str);
                        this.lruEntries.put(str, entry);
                    }
                    Editor editor = new Editor(this, entry);
                    entry.setCurrentEditor$okhttp(editor);
                    return editor;
                }
                TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
                return null;
            }
            return null;
        }
        return null;
    }
}
