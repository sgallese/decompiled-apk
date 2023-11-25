package io.realm.internal;

/* loaded from: classes4.dex */
public class OsMap implements h {

    /* renamed from: q  reason: collision with root package name */
    private static final long f17722q = nativeGetFinalizerPtr();

    /* renamed from: f  reason: collision with root package name */
    private final long f17723f;

    /* renamed from: m  reason: collision with root package name */
    private final g f17724m;

    /* renamed from: p  reason: collision with root package name */
    private final Table f17725p;

    public OsMap(UncheckedRow uncheckedRow, long j10) {
        OsSharedRealm q10 = uncheckedRow.getTable().q();
        long[] nativeCreate = nativeCreate(q10.getNativePtr(), uncheckedRow.getNativePtr(), j10);
        this.f17723f = nativeCreate[0];
        if (nativeCreate[1] != -1) {
            this.f17725p = new Table(q10, nativeCreate[1]);
        } else {
            this.f17725p = null;
        }
        g gVar = q10.context;
        this.f17724m = gVar;
        gVar.a(this);
    }

    private static native void nativeClear(long j10);

    private static native boolean nativeContainsBinary(long j10, byte[] bArr);

    private static native boolean nativeContainsBoolean(long j10, boolean z10);

    private static native boolean nativeContainsDate(long j10, long j11);

    private static native boolean nativeContainsDecimal128(long j10, long j11, long j12);

    private static native boolean nativeContainsFloat(long j10, float f10);

    private static native boolean nativeContainsKey(long j10, String str);

    private static native boolean nativeContainsLong(long j10, long j11);

    private static native boolean nativeContainsNull(long j10);

    private static native boolean nativeContainsObjectId(long j10, String str);

    private static native boolean nativeContainsRealmAny(long j10, long j11);

    private static native boolean nativeContainsRealmModel(long j10, long j11, long j12);

    private static native boolean nativeContainsString(long j10, String str);

    private static native boolean nativeContainsUUID(long j10, String str);

    private static native long[] nativeCreate(long j10, long j11, long j12);

    private static native long nativeCreateAndPutEmbeddedObject(long j10, String str);

    private static native long nativeFreeze(long j10, long j11);

    private static native Object[] nativeGetEntryForModel(long j10, int i10);

    private static native Object[] nativeGetEntryForPrimitive(long j10, int i10);

    private static native Object[] nativeGetEntryForRealmAny(long j10, int i10);

    private static native long nativeGetFinalizerPtr();

    private static native long nativeGetRealmAnyPtr(long j10, String str);

    private static native long nativeGetRow(long j10, String str);

    private static native Object nativeGetValue(long j10, String str);

    private static native boolean nativeIsValid(long j10);

    private static native long nativeKeys(long j10);

    private static native void nativePutBinary(long j10, String str, byte[] bArr);

    private static native void nativePutBoolean(long j10, String str, boolean z10);

    private static native void nativePutDate(long j10, String str, long j11);

    private static native void nativePutDecimal128(long j10, String str, long j11, long j12);

    private static native void nativePutDouble(long j10, String str, double d10);

    private static native void nativePutFloat(long j10, String str, float f10);

    private static native void nativePutLong(long j10, String str, long j11);

    private static native void nativePutNull(long j10, String str);

    private static native void nativePutObjectId(long j10, String str, String str2);

    private static native void nativePutRealmAny(long j10, String str, long j11);

    private static native void nativePutRow(long j10, String str, long j11);

    private static native void nativePutString(long j10, String str, String str2);

    private static native void nativePutUUID(long j10, String str, String str2);

    private static native void nativeRemove(long j10, String str);

    private static native long nativeSize(long j10);

    private static native void nativeStartListening(long j10, ObservableMap observableMap);

    private static native void nativeStopListening(long j10);

    private static native long nativeValues(long j10);

    public long a() {
        return nativeSize(this.f17723f);
    }

    @Override // io.realm.internal.h
    public long getNativeFinalizerPtr() {
        return f17722q;
    }

    @Override // io.realm.internal.h
    public long getNativePtr() {
        return this.f17723f;
    }
}
