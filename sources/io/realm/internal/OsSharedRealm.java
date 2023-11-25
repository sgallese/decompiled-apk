package io.realm.internal;

import io.realm.RealmFieldType;
import io.realm.internal.OsRealmConfig;
import io.realm.internal.OsResults;
import io.realm.internal.android.AndroidRealmNotifier;
import io.realm.v0;
import java.io.Closeable;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@Keep
/* loaded from: classes4.dex */
public final class OsSharedRealm implements Closeable, h {
    public static final byte FILE_EXCEPTION_INCOMPATIBLE_SYNC_FILE = 7;
    public static final byte FILE_EXCEPTION_KIND_ACCESS_ERROR = 0;
    public static final byte FILE_EXCEPTION_KIND_BAD_HISTORY = 1;
    public static final byte FILE_EXCEPTION_KIND_EXISTS = 3;
    public static final byte FILE_EXCEPTION_KIND_FORMAT_UPGRADE_REQUIRED = 6;
    public static final byte FILE_EXCEPTION_KIND_INCOMPATIBLE_LOCK_FILE = 5;
    public static final byte FILE_EXCEPTION_KIND_NOT_FOUND = 4;
    public static final byte FILE_EXCEPTION_KIND_PERMISSION_DENIED = 2;
    private static final long nativeFinalizerPtr = nativeGetFinalizerPtr();
    private static final List<OsSharedRealm> sharedRealmsUnderConstruction = new CopyOnWriteArrayList();
    private static volatile File temporaryDirectory;
    public final io.realm.internal.a capabilities;
    public final g context;
    final List<WeakReference<OsResults.a>> iterators;
    private final long nativePtr;
    private final OsRealmConfig osRealmConfig;
    private final List<WeakReference<l>> pendingRows;
    public final RealmNotifier realmNotifier;
    private final OsSchemaInfo schemaInfo;
    private final List<OsSharedRealm> tempSharedRealmsForCallback;

    @Keep
    /* loaded from: classes4.dex */
    public interface InitializationCallback {
        void onInit(OsSharedRealm osSharedRealm);
    }

    @Keep
    /* loaded from: classes4.dex */
    public interface MigrationCallback {
        void onMigrationNeeded(OsSharedRealm osSharedRealm, long j10, long j11);
    }

    @Keep
    /* loaded from: classes4.dex */
    public interface SchemaChangedCallback {
        void onSchemaChanged();
    }

    /* loaded from: classes4.dex */
    public static class a implements Comparable<a> {

        /* renamed from: p  reason: collision with root package name */
        public static final a f17773p = new a(-1, -1);

        /* renamed from: f  reason: collision with root package name */
        public final long f17774f;

        /* renamed from: m  reason: collision with root package name */
        public final long f17775m;

        a(long j10, long j11) {
            this.f17774f = j10;
            this.f17775m = j11;
        }

        @Override // java.lang.Comparable
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public int compareTo(a aVar) {
            if (aVar != null) {
                long j10 = this.f17774f;
                long j11 = aVar.f17774f;
                if (j10 > j11) {
                    return 1;
                }
                if (j10 < j11) {
                    return -1;
                }
                return 0;
            }
            throw new IllegalArgumentException("Version cannot be compared to a null value.");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f17774f == aVar.f17774f && this.f17775m == aVar.f17775m) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            long j10 = this.f17774f;
            int i10 = ((int) (j10 ^ (j10 >>> 32))) * 31;
            long j11 = this.f17775m;
            return i10 + ((int) (j11 ^ (j11 >>> 32)));
        }

        public String toString() {
            return "VersionID{version=" + this.f17774f + ", index=" + this.f17775m + '}';
        }
    }

    private OsSharedRealm(OsRealmConfig osRealmConfig, a aVar) {
        ArrayList arrayList = new ArrayList();
        this.tempSharedRealmsForCallback = arrayList;
        this.pendingRows = new CopyOnWriteArrayList();
        this.iterators = new ArrayList();
        vb.a aVar2 = new vb.a();
        AndroidRealmNotifier androidRealmNotifier = new AndroidRealmNotifier(this, aVar2);
        g a10 = osRealmConfig.a();
        this.context = a10;
        List<OsSharedRealm> list = sharedRealmsUnderConstruction;
        list.add(this);
        try {
            long nativeGetSharedRealm = nativeGetSharedRealm(osRealmConfig.getNativePtr(), aVar.f17774f, aVar.f17775m, androidRealmNotifier);
            this.nativePtr = nativeGetSharedRealm;
            arrayList.clear();
            list.remove(this);
            this.osRealmConfig = osRealmConfig;
            this.schemaInfo = new OsSchemaInfo(nativeGetSchemaInfo(nativeGetSharedRealm), this);
            a10.a(this);
            this.capabilities = aVar2;
            this.realmNotifier = androidRealmNotifier;
            if (aVar.equals(a.f17773p)) {
                nativeSetAutoRefresh(nativeGetSharedRealm, aVar2.a());
            }
        } catch (Throwable th) {
            try {
                for (OsSharedRealm osSharedRealm : this.tempSharedRealmsForCallback) {
                    if (!osSharedRealm.isClosed()) {
                        osSharedRealm.close();
                    }
                }
                throw th;
            } catch (Throwable th2) {
                this.tempSharedRealmsForCallback.clear();
                sharedRealmsUnderConstruction.remove(this);
                throw th2;
            }
        }
    }

    private void detachIterators() {
        Iterator<WeakReference<OsResults.a>> it = this.iterators.iterator();
        while (it.hasNext()) {
            OsResults.a aVar = it.next().get();
            if (aVar != null) {
                aVar.c();
            }
        }
        this.iterators.clear();
    }

    private void executePendingRowQueries() {
        Iterator<WeakReference<l>> it = this.pendingRows.iterator();
        while (it.hasNext()) {
            l lVar = it.next().get();
            if (lVar != null) {
                lVar.b();
            }
        }
        this.pendingRows.clear();
    }

    public static OsSharedRealm getInstance(v0 v0Var, a aVar) {
        return getInstance(new OsRealmConfig.b(v0Var), aVar);
    }

    public static File getTemporaryDirectory() {
        return temporaryDirectory;
    }

    public static void initialize(File file) {
        if (temporaryDirectory != null) {
            return;
        }
        String absolutePath = file.getAbsolutePath();
        if (!file.isDirectory() && !file.mkdirs() && !file.isDirectory()) {
            throw new IOException("failed to create temporary directory: " + absolutePath);
        }
        if (!absolutePath.endsWith("/")) {
            absolutePath = absolutePath + "/";
        }
        nativeInit(absolutePath);
        temporaryDirectory = file;
    }

    private static native void nativeBeginTransaction(long j10);

    private static native void nativeCancelTransaction(long j10);

    private static native void nativeCloseSharedRealm(long j10);

    private static native void nativeCommitTransaction(long j10);

    private static native boolean nativeCompact(long j10);

    private static native long nativeCreateTable(long j10, String str);

    private static native long nativeCreateTableWithPrimaryKeyField(long j10, String str, String str2, int i10, boolean z10);

    private static native long nativeFreeze(long j10);

    private static native long nativeGetActiveSubscriptionSet(long j10);

    private static native long nativeGetFinalizerPtr();

    private static native long nativeGetLatestSubscriptionSet(long j10);

    private static native long nativeGetSchemaInfo(long j10);

    private static native long nativeGetSharedRealm(long j10, long j11, long j12, RealmNotifier realmNotifier);

    private static native long nativeGetTableRef(long j10, String str);

    private static native String[] nativeGetTablesName(long j10);

    private static native long[] nativeGetVersionID(long j10);

    private static native boolean nativeHasTable(long j10, String str);

    private static native void nativeInit(String str);

    private static native boolean nativeIsAutoRefresh(long j10);

    private static native boolean nativeIsClosed(long j10);

    private static native boolean nativeIsEmpty(long j10);

    private static native boolean nativeIsFrozen(long j10);

    private static native boolean nativeIsInTransaction(long j10);

    private static native long nativeNumberOfVersions(long j10);

    private static native void nativeRefresh(long j10);

    private static native void nativeRegisterSchemaChangedCallback(long j10, SchemaChangedCallback schemaChangedCallback);

    private static native void nativeRenameTable(long j10, String str, String str2);

    private static native void nativeSetAutoRefresh(long j10, boolean z10);

    private static native long nativeSize(long j10);

    private static native void nativeStopWaitForChange(long j10);

    private static native boolean nativeWaitForChange(long j10);

    private static native void nativeWriteCopy(long j10, String str, byte[] bArr);

    private static void runInitializationCallback(long j10, OsRealmConfig osRealmConfig, InitializationCallback initializationCallback) {
        initializationCallback.onInit(new OsSharedRealm(j10, osRealmConfig));
    }

    private static void runMigrationCallback(long j10, OsRealmConfig osRealmConfig, MigrationCallback migrationCallback, long j11) {
        migrationCallback.onMigrationNeeded(new OsSharedRealm(j10, osRealmConfig), j11, osRealmConfig.b().q());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void addIterator(OsResults.a aVar) {
        this.iterators.add(new WeakReference<>(aVar));
    }

    void addPendingRow(l lVar) {
        this.pendingRows.add(new WeakReference<>(lVar));
    }

    public void beginTransaction() {
        detachIterators();
        executePendingRowQueries();
        nativeBeginTransaction(this.nativePtr);
    }

    public void cancelTransaction() {
        nativeCancelTransaction(this.nativePtr);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        RealmNotifier realmNotifier = this.realmNotifier;
        if (realmNotifier != null) {
            realmNotifier.close();
        }
        synchronized (this.context) {
            nativeCloseSharedRealm(this.nativePtr);
        }
    }

    public void commitTransaction() {
        nativeCommitTransaction(this.nativePtr);
    }

    public boolean compact() {
        return nativeCompact(this.nativePtr);
    }

    public Table createTable(String str) {
        return new Table(this, nativeCreateTable(this.nativePtr, str));
    }

    public Table createTableWithPrimaryKey(String str, String str2, RealmFieldType realmFieldType, boolean z10) {
        return new Table(this, nativeCreateTableWithPrimaryKeyField(this.nativePtr, str, str2, realmFieldType.getNativeValue(), z10));
    }

    public OsSharedRealm freeze() {
        return new OsSharedRealm(this.osRealmConfig, getVersionID());
    }

    public v0 getConfiguration() {
        return this.osRealmConfig.b();
    }

    @Override // io.realm.internal.h
    public long getNativeFinalizerPtr() {
        return nativeFinalizerPtr;
    }

    @Override // io.realm.internal.h
    public long getNativePtr() {
        return this.nativePtr;
    }

    public long getNumberOfVersions() {
        return nativeNumberOfVersions(this.nativePtr);
    }

    public String getPath() {
        return this.osRealmConfig.b().l();
    }

    public OsSchemaInfo getSchemaInfo() {
        return this.schemaInfo;
    }

    public Table getTable(String str) {
        return new Table(this, nativeGetTableRef(this.nativePtr, str));
    }

    public String[] getTablesNames() {
        String[] nativeGetTablesName = nativeGetTablesName(this.nativePtr);
        if (nativeGetTablesName == null) {
            return new String[0];
        }
        return nativeGetTablesName;
    }

    public a getVersionID() {
        long[] nativeGetVersionID = nativeGetVersionID(this.nativePtr);
        if (nativeGetVersionID != null) {
            return new a(nativeGetVersionID[0], nativeGetVersionID[1]);
        }
        throw new IllegalStateException("Cannot get versionId, this could be related to a non existing read/write transaction");
    }

    public boolean hasTable(String str) {
        return nativeHasTable(this.nativePtr, str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void invalidateIterators() {
        Iterator<WeakReference<OsResults.a>> it = this.iterators.iterator();
        while (it.hasNext()) {
            OsResults.a aVar = it.next().get();
            if (aVar != null) {
                aVar.f();
            }
        }
        this.iterators.clear();
    }

    public boolean isAutoRefresh() {
        return nativeIsAutoRefresh(this.nativePtr);
    }

    public boolean isClosed() {
        return nativeIsClosed(this.nativePtr);
    }

    public boolean isEmpty() {
        return nativeIsEmpty(this.nativePtr);
    }

    public boolean isFrozen() {
        return nativeIsFrozen(this.nativePtr);
    }

    public boolean isInTransaction() {
        return nativeIsInTransaction(this.nativePtr);
    }

    public boolean isSyncRealm() {
        if (this.osRealmConfig.c() != null) {
            return true;
        }
        return false;
    }

    public void refresh() {
        if (!isFrozen()) {
            nativeRefresh(this.nativePtr);
            return;
        }
        throw new IllegalStateException("It is not possible to refresh frozen Realms.");
    }

    public void registerSchemaChangedCallback(SchemaChangedCallback schemaChangedCallback) {
        nativeRegisterSchemaChangedCallback(this.nativePtr, schemaChangedCallback);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void removePendingRow(l lVar) {
        for (WeakReference<l> weakReference : this.pendingRows) {
            l lVar2 = weakReference.get();
            if (lVar2 == null || lVar2 == lVar) {
                this.pendingRows.remove(weakReference);
            }
        }
    }

    public void renameTable(String str, String str2) {
        nativeRenameTable(this.nativePtr, str, str2);
    }

    public void setAutoRefresh(boolean z10) {
        this.capabilities.c(null);
        nativeSetAutoRefresh(this.nativePtr, z10);
    }

    public long size() {
        return nativeSize(this.nativePtr);
    }

    public void stopWaitForChange() {
        nativeStopWaitForChange(this.nativePtr);
    }

    public boolean waitForChange() {
        return nativeWaitForChange(this.nativePtr);
    }

    public void writeCopy(File file, byte[] bArr) {
        if (file.isFile() && file.exists()) {
            throw new IllegalArgumentException("The destination file must not exist");
        }
        if (isSyncRealm()) {
            Util.b("writeCopyTo() cannot be called from the main thread when using synchronized Realms.");
        }
        try {
            nativeWriteCopy(this.nativePtr, file.getAbsolutePath(), bArr);
        } catch (RuntimeException e10) {
            String message = e10.getMessage();
            if (message.contains("Could not write file as not all client changes are integrated in server")) {
                throw new IllegalStateException(message);
            }
            throw e10;
        }
    }

    public static OsSharedRealm getInstance(OsRealmConfig.b bVar, a aVar) {
        OsRealmConfig b10 = bVar.b();
        i.e().j(b10);
        return new OsSharedRealm(b10, aVar);
    }

    OsSharedRealm(long j10, OsRealmConfig osRealmConfig) {
        this(j10, osRealmConfig, osRealmConfig.a());
        boolean z10;
        Iterator<OsSharedRealm> it = sharedRealmsUnderConstruction.iterator();
        while (true) {
            if (!it.hasNext()) {
                z10 = false;
                break;
            }
            OsSharedRealm next = it.next();
            if (next.context == osRealmConfig.a()) {
                next.tempSharedRealmsForCallback.add(this);
                z10 = true;
                break;
            }
        }
        if (!z10) {
            throw new IllegalStateException("Cannot find the parent 'OsSharedRealm' which is under construction.");
        }
    }

    OsSharedRealm(long j10, OsRealmConfig osRealmConfig, g gVar) {
        this.tempSharedRealmsForCallback = new ArrayList();
        this.pendingRows = new CopyOnWriteArrayList();
        this.iterators = new ArrayList();
        this.nativePtr = j10;
        this.osRealmConfig = osRealmConfig;
        this.schemaInfo = new OsSchemaInfo(nativeGetSchemaInfo(j10), this);
        this.context = gVar;
        gVar.a(this);
        this.capabilities = new vb.a();
        this.realmNotifier = null;
        nativeSetAutoRefresh(j10, false);
    }
}
