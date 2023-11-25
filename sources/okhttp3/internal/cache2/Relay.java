package okhttp3.internal.cache2;

import dc.w;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import okhttp3.internal.Util;
import okio.Source;
import okio.a1;
import okio.c;
import okio.f;
import qc.h;
import qc.q;

/* compiled from: Relay.kt */
/* loaded from: classes4.dex */
public final class Relay {
    public static final Companion Companion = new Companion(null);
    private static final long FILE_HEADER_SIZE = 32;
    public static final f PREFIX_CLEAN;
    public static final f PREFIX_DIRTY;
    private static final int SOURCE_FILE = 2;
    private static final int SOURCE_UPSTREAM = 1;
    private final c buffer;
    private final long bufferMaxSize;
    private boolean complete;
    private RandomAccessFile file;
    private final f metadata;
    private int sourceCount;
    private Source upstream;
    private final c upstreamBuffer;
    private long upstreamPos;
    private Thread upstreamReader;

    /* compiled from: Relay.kt */
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }

        public final Relay edit(File file, Source source, f fVar, long j10) throws IOException {
            q.i(file, "file");
            q.i(source, "upstream");
            q.i(fVar, "metadata");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            Relay relay = new Relay(randomAccessFile, source, 0L, fVar, j10, null);
            randomAccessFile.setLength(0L);
            relay.writeHeader(Relay.PREFIX_DIRTY, -1L, -1L);
            return relay;
        }

        public final Relay read(File file) throws IOException {
            q.i(file, "file");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            FileChannel channel = randomAccessFile.getChannel();
            q.h(channel, "randomAccessFile.channel");
            FileOperator fileOperator = new FileOperator(channel);
            c cVar = new c();
            fileOperator.read(0L, cVar, Relay.FILE_HEADER_SIZE);
            if (q.d(cVar.l(r1.D()), Relay.PREFIX_CLEAN)) {
                long readLong = cVar.readLong();
                long readLong2 = cVar.readLong();
                c cVar2 = new c();
                fileOperator.read(readLong + Relay.FILE_HEADER_SIZE, cVar2, readLong2);
                return new Relay(randomAccessFile, null, readLong, cVar2.j0(), 0L, null);
            }
            throw new IOException("unreadable cache file");
        }
    }

    /* compiled from: Relay.kt */
    /* loaded from: classes4.dex */
    public final class RelaySource implements Source {
        private FileOperator fileOperator;
        private long sourcePos;
        final /* synthetic */ Relay this$0;
        private final a1 timeout;

        public RelaySource(Relay relay) {
            q.i(relay, "this$0");
            this.this$0 = relay;
            this.timeout = new a1();
            RandomAccessFile file = relay.getFile();
            q.f(file);
            FileChannel channel = file.getChannel();
            q.h(channel, "file!!.channel");
            this.fileOperator = new FileOperator(channel);
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.fileOperator == null) {
                return;
            }
            RandomAccessFile randomAccessFile = null;
            this.fileOperator = null;
            Relay relay = this.this$0;
            synchronized (relay) {
                relay.setSourceCount(relay.getSourceCount() - 1);
                if (relay.getSourceCount() == 0) {
                    RandomAccessFile file = relay.getFile();
                    relay.setFile(null);
                    randomAccessFile = file;
                }
                w wVar = w.f13270a;
            }
            if (randomAccessFile != null) {
                Util.closeQuietly(randomAccessFile);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:27:0x0079, code lost:
        
            if (r4 != 2) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x007b, code lost:
        
            r10 = java.lang.Math.min(r21, r19.this$0.getUpstreamPos() - r19.sourcePos);
            r2 = r19.fileOperator;
            qc.q.f(r2);
            r2.read(r19.sourcePos + okhttp3.internal.cache2.Relay.FILE_HEADER_SIZE, r20, r10);
            r19.sourcePos += r10;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x009b, code lost:
        
            return r10;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x009d, code lost:
        
            r0 = r19.this$0.getUpstream();
            qc.q.f(r0);
            r14 = r0.read(r19.this$0.getUpstreamBuffer(), r19.this$0.getBufferMaxSize());
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x00b8, code lost:
        
            if (r14 != (-1)) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x00ba, code lost:
        
            r0 = r19.this$0;
            r0.commit(r0.getUpstreamPos());
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x00c3, code lost:
        
            r2 = r19.this$0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00c5, code lost:
        
            monitor-enter(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x00c6, code lost:
        
            r2.setUpstreamReader(null);
            r2.notifyAll();
            r0 = dc.w.f13270a;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x00ce, code lost:
        
            monitor-exit(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x00cf, code lost:
        
            return -1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x00d3, code lost:
        
            r11 = java.lang.Math.min(r14, r21);
            r19.this$0.getUpstreamBuffer().j(r20, 0, r11);
            r19.sourcePos += r11;
            r13 = r19.fileOperator;
            qc.q.f(r13);
            r13.write(r19.this$0.getUpstreamPos() + okhttp3.internal.cache2.Relay.FILE_HEADER_SIZE, r19.this$0.getUpstreamBuffer().clone(), r14);
            r2 = r19.this$0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x010a, code lost:
        
            monitor-enter(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x010b, code lost:
        
            r2.getBuffer().write(r2.getUpstreamBuffer(), r14);
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x0124, code lost:
        
            if (r2.getBuffer().s0() <= r2.getBufferMaxSize()) goto L47;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x0126, code lost:
        
            r2.getBuffer().skip(r2.getBuffer().s0() - r2.getBufferMaxSize());
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x013a, code lost:
        
            r2.setUpstreamPos(r2.getUpstreamPos() + r14);
            r0 = dc.w.f13270a;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x0144, code lost:
        
            monitor-exit(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x0145, code lost:
        
            r2 = r19.this$0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x0147, code lost:
        
            monitor-enter(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x0148, code lost:
        
            r2.setUpstreamReader(null);
            r2.notifyAll();
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x014e, code lost:
        
            monitor-exit(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x014f, code lost:
        
            return r11;
         */
        /* JADX WARN: Code restructure failed: missing block: B:60:0x0156, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x0157, code lost:
        
            r2 = r19.this$0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:62:0x0159, code lost:
        
            monitor-enter(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:63:0x015a, code lost:
        
            r2.setUpstreamReader(null);
            r2.notifyAll();
            r3 = dc.w.f13270a;
         */
        /* JADX WARN: Code restructure failed: missing block: B:65:0x0163, code lost:
        
            throw r0;
         */
        @Override // okio.Source
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public long read(okio.c r20, long r21) throws java.io.IOException {
            /*
                Method dump skipped, instructions count: 374
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache2.Relay.RelaySource.read(okio.c, long):long");
        }

        @Override // okio.Source
        public a1 timeout() {
            return this.timeout;
        }
    }

    static {
        f.a aVar = f.f20621q;
        PREFIX_CLEAN = aVar.d("OkHttp cache v1\n");
        PREFIX_DIRTY = aVar.d("OkHttp DIRTY :(\n");
    }

    public /* synthetic */ Relay(RandomAccessFile randomAccessFile, Source source, long j10, f fVar, long j11, h hVar) {
        this(randomAccessFile, source, j10, fVar, j11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void writeHeader(f fVar, long j10, long j11) throws IOException {
        boolean z10;
        c cVar = new c();
        cVar.B0(fVar);
        cVar.V0(j10);
        cVar.V0(j11);
        if (cVar.s0() == FILE_HEADER_SIZE) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            RandomAccessFile randomAccessFile = this.file;
            q.f(randomAccessFile);
            FileChannel channel = randomAccessFile.getChannel();
            q.h(channel, "file!!.channel");
            new FileOperator(channel).write(0L, cVar, FILE_HEADER_SIZE);
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    private final void writeMetadata(long j10) throws IOException {
        c cVar = new c();
        cVar.B0(this.metadata);
        RandomAccessFile randomAccessFile = this.file;
        q.f(randomAccessFile);
        FileChannel channel = randomAccessFile.getChannel();
        q.h(channel, "file!!.channel");
        new FileOperator(channel).write(FILE_HEADER_SIZE + j10, cVar, this.metadata.D());
    }

    public final void commit(long j10) throws IOException {
        writeMetadata(j10);
        RandomAccessFile randomAccessFile = this.file;
        q.f(randomAccessFile);
        randomAccessFile.getChannel().force(false);
        writeHeader(PREFIX_CLEAN, j10, this.metadata.D());
        RandomAccessFile randomAccessFile2 = this.file;
        q.f(randomAccessFile2);
        randomAccessFile2.getChannel().force(false);
        synchronized (this) {
            setComplete(true);
            w wVar = w.f13270a;
        }
        Source source = this.upstream;
        if (source != null) {
            Util.closeQuietly(source);
        }
        this.upstream = null;
    }

    public final c getBuffer() {
        return this.buffer;
    }

    public final long getBufferMaxSize() {
        return this.bufferMaxSize;
    }

    public final boolean getComplete() {
        return this.complete;
    }

    public final RandomAccessFile getFile() {
        return this.file;
    }

    public final int getSourceCount() {
        return this.sourceCount;
    }

    public final Source getUpstream() {
        return this.upstream;
    }

    public final c getUpstreamBuffer() {
        return this.upstreamBuffer;
    }

    public final long getUpstreamPos() {
        return this.upstreamPos;
    }

    public final Thread getUpstreamReader() {
        return this.upstreamReader;
    }

    public final boolean isClosed() {
        if (this.file == null) {
            return true;
        }
        return false;
    }

    public final f metadata() {
        return this.metadata;
    }

    public final Source newSource() {
        synchronized (this) {
            if (getFile() == null) {
                return null;
            }
            setSourceCount(getSourceCount() + 1);
            return new RelaySource(this);
        }
    }

    public final void setComplete(boolean z10) {
        this.complete = z10;
    }

    public final void setFile(RandomAccessFile randomAccessFile) {
        this.file = randomAccessFile;
    }

    public final void setSourceCount(int i10) {
        this.sourceCount = i10;
    }

    public final void setUpstream(Source source) {
        this.upstream = source;
    }

    public final void setUpstreamPos(long j10) {
        this.upstreamPos = j10;
    }

    public final void setUpstreamReader(Thread thread) {
        this.upstreamReader = thread;
    }

    private Relay(RandomAccessFile randomAccessFile, Source source, long j10, f fVar, long j11) {
        this.file = randomAccessFile;
        this.upstream = source;
        this.upstreamPos = j10;
        this.metadata = fVar;
        this.bufferMaxSize = j11;
        this.upstreamBuffer = new c();
        this.complete = this.upstream == null;
        this.buffer = new c();
    }
}
