package io.realm.internal;

/* loaded from: classes4.dex */
public class OsSet implements h, k {

    /* renamed from: r  reason: collision with root package name */
    private static final long f17768r = nativeGetFinalizerPtr();

    /* renamed from: f  reason: collision with root package name */
    private final long f17769f;

    /* renamed from: m  reason: collision with root package name */
    private final g f17770m;

    /* renamed from: p  reason: collision with root package name */
    private final OsSharedRealm f17771p;

    /* renamed from: q  reason: collision with root package name */
    private final Table f17772q;

    public OsSet(UncheckedRow uncheckedRow, long j10) {
        OsSharedRealm q10 = uncheckedRow.getTable().q();
        this.f17771p = q10;
        long[] nativeCreate = nativeCreate(q10.getNativePtr(), uncheckedRow.getNativePtr(), j10);
        this.f17769f = nativeCreate[0];
        g gVar = q10.context;
        this.f17770m = gVar;
        gVar.a(this);
        if (nativeCreate[1] != 0) {
            this.f17772q = new Table(q10, nativeCreate[1]);
        } else {
            this.f17772q = null;
        }
    }

    private static native boolean nativeAddAllRealmAnyCollection(long j10, long j11);

    private static native long[] nativeAddBinary(long j10, byte[] bArr);

    private static native long[] nativeAddBoolean(long j10, boolean z10);

    private static native long[] nativeAddDate(long j10, long j11);

    private static native long[] nativeAddDecimal128(long j10, long j11, long j12);

    private static native long[] nativeAddDouble(long j10, double d10);

    private static native long[] nativeAddFloat(long j10, float f10);

    private static native long[] nativeAddLong(long j10, long j11);

    private static native long[] nativeAddNull(long j10);

    private static native long[] nativeAddObjectId(long j10, String str);

    private static native long[] nativeAddRealmAny(long j10, long j11);

    private static native long[] nativeAddRow(long j10, long j11);

    private static native long[] nativeAddString(long j10, String str);

    private static native long[] nativeAddUUID(long j10, String str);

    private static native boolean nativeAsymmetricDifference(long j10, long j11);

    private static native void nativeClear(long j10);

    private static native boolean nativeContainsAll(long j10, long j11);

    private static native boolean nativeContainsAllRealmAnyCollection(long j10, long j11);

    private static native boolean nativeContainsBinary(long j10, byte[] bArr);

    private static native boolean nativeContainsBoolean(long j10, boolean z10);

    private static native boolean nativeContainsDate(long j10, long j11);

    private static native boolean nativeContainsDecimal128(long j10, long j11, long j12);

    private static native boolean nativeContainsDouble(long j10, double d10);

    private static native boolean nativeContainsFloat(long j10, float f10);

    private static native boolean nativeContainsLong(long j10, long j11);

    private static native boolean nativeContainsNull(long j10);

    private static native boolean nativeContainsObjectId(long j10, String str);

    private static native boolean nativeContainsRealmAny(long j10, long j11);

    private static native boolean nativeContainsRow(long j10, long j11);

    private static native boolean nativeContainsString(long j10, String str);

    private static native boolean nativeContainsUUID(long j10, String str);

    private static native long[] nativeCreate(long j10, long j11, long j12);

    private static native void nativeDeleteAll(long j10);

    private static native long nativeFreeze(long j10, long j11);

    private static native long nativeGetFinalizerPtr();

    private static native long nativeGetQuery(long j10);

    private static native long nativeGetRealmAny(long j10, int i10);

    private static native long nativeGetRow(long j10, int i10);

    private static native Object nativeGetValueAtIndex(long j10, int i10);

    private static native boolean nativeIntersect(long j10, long j11);

    private static native boolean nativeIsValid(long j10);

    private static native boolean nativeRemoveAllRealmAnyCollection(long j10, long j11);

    private static native long[] nativeRemoveBinary(long j10, byte[] bArr);

    private static native long[] nativeRemoveBoolean(long j10, boolean z10);

    private static native long[] nativeRemoveDate(long j10, long j11);

    private static native long[] nativeRemoveDecimal128(long j10, long j11, long j12);

    private static native long[] nativeRemoveDouble(long j10, double d10);

    private static native long[] nativeRemoveFloat(long j10, float f10);

    private static native long[] nativeRemoveLong(long j10, long j11);

    private static native long[] nativeRemoveNull(long j10);

    private static native long[] nativeRemoveObjectId(long j10, String str);

    private static native long[] nativeRemoveRealmAny(long j10, long j11);

    private static native long[] nativeRemoveRow(long j10, long j11);

    private static native long[] nativeRemoveString(long j10, String str);

    private static native long[] nativeRemoveUUID(long j10, String str);

    private static native boolean nativeRetainAllRealmAnyCollection(long j10, long j11);

    private static native long nativeSize(long j10);

    private static native void nativeStartListening(long j10, ObservableSet observableSet);

    private static native void nativeStopListening(long j10);

    private static native boolean nativeUnion(long j10, long j11);

    public long a() {
        return nativeSize(this.f17769f);
    }

    @Override // io.realm.internal.h
    public long getNativeFinalizerPtr() {
        return f17768r;
    }

    @Override // io.realm.internal.h
    public long getNativePtr() {
        return this.f17769f;
    }
}
