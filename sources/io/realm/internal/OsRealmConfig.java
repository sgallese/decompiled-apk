package io.realm.internal;

import io.realm.CompactOnLaunchCallback;
import io.realm.internal.OsSharedRealm;
import io.realm.v0;
import java.io.File;
import java.net.Proxy;
import java.net.URI;

/* loaded from: classes4.dex */
public class OsRealmConfig implements h {

    /* renamed from: w  reason: collision with root package name */
    private static final long f17738w = nativeGetFinalizerPtr();

    /* renamed from: f  reason: collision with root package name */
    private final Object f17739f;

    /* renamed from: m  reason: collision with root package name */
    private final Object f17740m;

    /* renamed from: p  reason: collision with root package name */
    private final v0 f17741p;

    /* renamed from: q  reason: collision with root package name */
    private final URI f17742q;

    /* renamed from: r  reason: collision with root package name */
    private final long f17743r;

    /* renamed from: s  reason: collision with root package name */
    private final g f17744s;

    /* renamed from: t  reason: collision with root package name */
    private final CompactOnLaunchCallback f17745t;

    /* renamed from: u  reason: collision with root package name */
    private final OsSharedRealm.MigrationCallback f17746u;

    /* renamed from: v  reason: collision with root package name */
    private final OsSharedRealm.InitializationCallback f17747v;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f17748a;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            f17748a = iArr;
            try {
                iArr[Proxy.Type.HTTP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* loaded from: classes4.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private v0 f17749a;

        /* renamed from: b  reason: collision with root package name */
        private OsSchemaInfo f17750b = null;

        /* renamed from: c  reason: collision with root package name */
        private OsSharedRealm.MigrationCallback f17751c = null;

        /* renamed from: d  reason: collision with root package name */
        private OsSharedRealm.InitializationCallback f17752d = null;

        /* renamed from: e  reason: collision with root package name */
        private boolean f17753e = false;

        /* renamed from: f  reason: collision with root package name */
        private String f17754f = "";

        public b(v0 v0Var) {
            this.f17749a = v0Var;
        }

        public b a(boolean z10) {
            this.f17753e = z10;
            return this;
        }

        public OsRealmConfig b() {
            return new OsRealmConfig(this.f17749a, this.f17754f, this.f17753e, this.f17750b, this.f17751c, this.f17752d, null);
        }

        public b c(File file) {
            this.f17754f = file.getAbsolutePath();
            return this;
        }

        public b d(OsSharedRealm.InitializationCallback initializationCallback) {
            this.f17752d = initializationCallback;
            return this;
        }

        public b e(OsSharedRealm.MigrationCallback migrationCallback) {
            this.f17751c = migrationCallback;
            return this;
        }

        public b f(OsSchemaInfo osSchemaInfo) {
            this.f17750b = osSchemaInfo;
            return this;
        }
    }

    /* loaded from: classes4.dex */
    public enum c {
        FULL(0),
        MEM_ONLY(1);

        final int value;

        c(int i10) {
            this.value = i10;
        }
    }

    /* loaded from: classes4.dex */
    public enum d {
        SCHEMA_MODE_AUTOMATIC((byte) 0),
        SCHEMA_MODE_IMMUTABLE((byte) 1),
        SCHEMA_MODE_READONLY((byte) 2),
        SCHEMA_MODE_SOFT_RESET_FILE((byte) 3),
        SCHEMA_MODE_ADDITIVE_DISCOVERED((byte) 5),
        SCHEMA_MODE_MANUAL((byte) 7);

        final byte value;

        d(byte b10) {
            this.value = b10;
        }

        public byte getNativeValue() {
            return this.value;
        }
    }

    /* synthetic */ OsRealmConfig(v0 v0Var, String str, boolean z10, OsSchemaInfo osSchemaInfo, OsSharedRealm.MigrationCallback migrationCallback, OsSharedRealm.InitializationCallback initializationCallback, a aVar) {
        this(v0Var, str, z10, osSchemaInfo, migrationCallback, initializationCallback);
    }

    private static native long nativeCreate(String str, String str2, boolean z10, long j10);

    private native String nativeCreateAndSetSyncConfig(long j10, long j11, String str, String str2, String str3, String str4, String str5, String str6, byte b10, String str7, String str8, String[] strArr, byte b11, Object obj, Object obj2, String str9, Object obj3);

    private static native void nativeEnableChangeNotification(long j10, boolean z10);

    private static native long nativeGetFinalizerPtr();

    private static native void nativeSetCompactOnLaunchCallback(long j10, CompactOnLaunchCallback compactOnLaunchCallback);

    private static native void nativeSetEncryptionKey(long j10, byte[] bArr);

    private static native void nativeSetInMemory(long j10, boolean z10);

    private native void nativeSetInitializationCallback(long j10, OsSharedRealm.InitializationCallback initializationCallback);

    private native void nativeSetSchemaConfig(long j10, byte b10, long j11, long j12, OsSharedRealm.MigrationCallback migrationCallback);

    private static native void nativeSetSyncConfigProxySettings(long j10, byte b10, String str, int i10);

    private static native void nativeSetSyncConfigSslSettings(long j10, boolean z10, String str);

    /* JADX INFO: Access modifiers changed from: package-private */
    public g a() {
        return this.f17744s;
    }

    public v0 b() {
        return this.f17741p;
    }

    public URI c() {
        return this.f17742q;
    }

    @Override // io.realm.internal.h
    public long getNativeFinalizerPtr() {
        return f17738w;
    }

    @Override // io.realm.internal.h
    public long getNativePtr() {
        return this.f17743r;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0225  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private OsRealmConfig(io.realm.v0 r38, java.lang.String r39, boolean r40, io.realm.internal.OsSchemaInfo r41, io.realm.internal.OsSharedRealm.MigrationCallback r42, io.realm.internal.OsSharedRealm.InitializationCallback r43) {
        /*
            Method dump skipped, instructions count: 643
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.internal.OsRealmConfig.<init>(io.realm.v0, java.lang.String, boolean, io.realm.internal.OsSchemaInfo, io.realm.internal.OsSharedRealm$MigrationCallback, io.realm.internal.OsSharedRealm$InitializationCallback):void");
    }
}
