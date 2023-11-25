package io.realm.internal;

import io.realm.RealmFieldType;

/* loaded from: classes4.dex */
public class OsObjectSchemaInfo implements h {

    /* renamed from: m  reason: collision with root package name */
    private static final long f17729m = nativeGetFinalizerPtr();

    /* renamed from: f  reason: collision with root package name */
    private long f17730f;

    /* loaded from: classes4.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private final String f17731a;

        /* renamed from: b  reason: collision with root package name */
        private final String f17732b;

        /* renamed from: c  reason: collision with root package name */
        private final long[] f17733c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f17734d;

        /* renamed from: f  reason: collision with root package name */
        private final long[] f17736f;

        /* renamed from: e  reason: collision with root package name */
        private int f17735e = 0;

        /* renamed from: g  reason: collision with root package name */
        private int f17737g = 0;

        public b(String str, String str2, boolean z10, int i10, int i11) {
            this.f17732b = str;
            this.f17731a = str2;
            this.f17734d = z10;
            this.f17733c = new long[i10];
            this.f17736f = new long[i11];
        }

        public b a(String str, String str2, RealmFieldType realmFieldType, String str3) {
            long nativeCreatePersistedLinkProperty = Property.nativeCreatePersistedLinkProperty(str2, str, Property.a(realmFieldType, false), str3);
            long[] jArr = this.f17733c;
            int i10 = this.f17735e;
            jArr[i10] = nativeCreatePersistedLinkProperty;
            this.f17735e = i10 + 1;
            return this;
        }

        public b b(String str, String str2, RealmFieldType realmFieldType, boolean z10, boolean z11, boolean z12) {
            long nativeCreatePersistedProperty = Property.nativeCreatePersistedProperty(str2, str, Property.a(realmFieldType, z12), z10, z11);
            long[] jArr = this.f17733c;
            int i10 = this.f17735e;
            jArr[i10] = nativeCreatePersistedProperty;
            this.f17735e = i10 + 1;
            return this;
        }

        public b c(String str, String str2, RealmFieldType realmFieldType, boolean z10) {
            long nativeCreatePersistedProperty = Property.nativeCreatePersistedProperty(str2, str, Property.a(realmFieldType, z10), false, false);
            long[] jArr = this.f17733c;
            int i10 = this.f17735e;
            jArr[i10] = nativeCreatePersistedProperty;
            this.f17735e = i10 + 1;
            return this;
        }

        public OsObjectSchemaInfo d() {
            if (this.f17735e != -1 && this.f17737g != -1) {
                OsObjectSchemaInfo osObjectSchemaInfo = new OsObjectSchemaInfo(this.f17732b, this.f17731a, this.f17734d);
                OsObjectSchemaInfo.nativeAddProperties(osObjectSchemaInfo.f17730f, this.f17733c, this.f17736f);
                this.f17735e = -1;
                this.f17737g = -1;
                return osObjectSchemaInfo;
            }
            throw new IllegalStateException("'OsObjectSchemaInfo.build()' has been called before on this object.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeAddProperties(long j10, long[] jArr, long[] jArr2);

    private static native long nativeCreateRealmObjectSchema(String str, String str2, boolean z10);

    private static native String nativeGetClassName(long j10);

    private static native long nativeGetFinalizerPtr();

    private static native long nativeGetPrimaryKeyProperty(long j10);

    private static native long nativeGetProperty(long j10, String str);

    private static native boolean nativeIsEmbedded(long j10);

    public Property c(String str) {
        return new Property(nativeGetProperty(this.f17730f, str));
    }

    @Override // io.realm.internal.h
    public long getNativeFinalizerPtr() {
        return f17729m;
    }

    @Override // io.realm.internal.h
    public long getNativePtr() {
        return this.f17730f;
    }

    private OsObjectSchemaInfo(String str, String str2, boolean z10) {
        this(nativeCreateRealmObjectSchema(str, str2, z10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public OsObjectSchemaInfo(long j10) {
        this.f17730f = j10;
        g.f17814c.a(this);
    }
}
