package io.realm.internal;

import io.realm.RealmFieldType;
import java.util.Date;

/* loaded from: classes4.dex */
public class Table implements h {

    /* renamed from: q  reason: collision with root package name */
    private static final String f17780q;

    /* renamed from: r  reason: collision with root package name */
    public static final int f17781r;

    /* renamed from: s  reason: collision with root package name */
    private static final long f17782s;

    /* renamed from: f  reason: collision with root package name */
    private final long f17783f;

    /* renamed from: m  reason: collision with root package name */
    private final g f17784m;

    /* renamed from: p  reason: collision with root package name */
    private final OsSharedRealm f17785p;

    static {
        String e10 = Util.e();
        f17780q = e10;
        f17781r = 63 - e10.length();
        f17782s = nativeGetFinalizerPtr();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Table(OsSharedRealm osSharedRealm, long j10) {
        g gVar = osSharedRealm.context;
        this.f17784m = gVar;
        this.f17785p = osSharedRealm;
        this.f17783f = j10;
        gVar.a(this);
    }

    private static void I() {
        throw new IllegalStateException("Cannot modify managed objects outside of a write transaction.");
    }

    public static String i(String str) {
        if (str == null) {
            return null;
        }
        String str2 = f17780q;
        if (!str.startsWith(str2)) {
            return str;
        }
        return str.substring(str2.length());
    }

    private native long nativeAddColumn(long j10, int i10, String str, boolean z10);

    private native long nativeAddColumnDictionaryLink(long j10, int i10, String str, long j11);

    private native long nativeAddColumnLink(long j10, int i10, String str, long j11);

    private native long nativeAddColumnSetLink(long j10, int i10, String str, long j11);

    private native long nativeAddPrimitiveDictionaryColumn(long j10, int i10, String str, boolean z10);

    private native long nativeAddPrimitiveListColumn(long j10, int i10, String str, boolean z10);

    private native long nativeAddPrimitiveSetColumn(long j10, int i10, String str, boolean z10);

    private native void nativeAddSearchIndex(long j10, long j11);

    private native void nativeClear(long j10);

    private native void nativeConvertColumnToNotNullable(long j10, long j11, boolean z10);

    private native void nativeConvertColumnToNullable(long j10, long j11, boolean z10);

    private native long nativeCountDouble(long j10, long j11, double d10);

    private native long nativeCountFloat(long j10, long j11, float f10);

    private native long nativeCountLong(long j10, long j11, long j12);

    private native long nativeCountString(long j10, long j11, String str);

    private native long nativeFindFirstBool(long j10, long j11, boolean z10);

    public static native long nativeFindFirstDecimal128(long j10, long j11, long j12, long j13);

    private native long nativeFindFirstDouble(long j10, long j11, double d10);

    private native long nativeFindFirstFloat(long j10, long j11, float f10);

    public static native long nativeFindFirstInt(long j10, long j11, long j12);

    public static native long nativeFindFirstNull(long j10, long j11);

    public static native long nativeFindFirstObjectId(long j10, long j11, String str);

    public static native long nativeFindFirstString(long j10, long j11, String str);

    private native long nativeFindFirstTimestamp(long j10, long j11, long j12);

    public static native long nativeFindFirstUUID(long j10, long j11, String str);

    private static native long nativeFreeze(long j10, long j11);

    private native boolean nativeGetBoolean(long j10, long j11, long j12);

    private native byte[] nativeGetByteArray(long j10, long j11, long j12);

    private native long nativeGetColumnCount(long j10);

    private native long nativeGetColumnKey(long j10, String str);

    private native String nativeGetColumnName(long j10, long j11);

    private native String[] nativeGetColumnNames(long j10);

    private native int nativeGetColumnType(long j10, long j11);

    private native long[] nativeGetDecimal128(long j10, long j11, long j12);

    private native double nativeGetDouble(long j10, long j11, long j12);

    private static native long nativeGetFinalizerPtr();

    private native float nativeGetFloat(long j10, long j11, long j12);

    private native long nativeGetLink(long j10, long j11, long j12);

    private native long nativeGetLinkTarget(long j10, long j11);

    private native long nativeGetLong(long j10, long j11, long j12);

    private native String nativeGetName(long j10);

    private native String nativeGetObjectId(long j10, long j11, long j12);

    private native String nativeGetString(long j10, long j11, long j12);

    private native long nativeGetTimestamp(long j10, long j11, long j12);

    private native boolean nativeHasSameSchema(long j10, long j11);

    private native boolean nativeHasSearchIndex(long j10, long j11);

    public static native void nativeIncrementLong(long j10, long j11, long j12, long j13);

    private native boolean nativeIsColumnNullable(long j10, long j11);

    private static native boolean nativeIsEmbedded(long j10);

    private native boolean nativeIsNull(long j10, long j11, long j12);

    private native boolean nativeIsNullLink(long j10, long j11, long j12);

    private native boolean nativeIsValid(long j10);

    private native void nativeMoveLastOver(long j10, long j11);

    public static native void nativeNullifyLink(long j10, long j11, long j12);

    private native void nativeRemoveColumn(long j10, long j11);

    private native void nativeRemoveSearchIndex(long j10, long j11);

    private native void nativeRenameColumn(long j10, long j11, String str);

    public static native void nativeSetBoolean(long j10, long j11, long j12, boolean z10, boolean z11);

    public static native void nativeSetByteArray(long j10, long j11, long j12, byte[] bArr, boolean z10);

    public static native void nativeSetDecimal128(long j10, long j11, long j12, long j13, long j14, boolean z10);

    public static native void nativeSetDouble(long j10, long j11, long j12, double d10, boolean z10);

    private static native boolean nativeSetEmbedded(long j10, boolean z10);

    public static native void nativeSetFloat(long j10, long j11, long j12, float f10, boolean z10);

    public static native void nativeSetLink(long j10, long j11, long j12, long j13, boolean z10);

    public static native void nativeSetLong(long j10, long j11, long j12, long j13, boolean z10);

    public static native void nativeSetNull(long j10, long j11, long j12, boolean z10);

    public static native void nativeSetObjectId(long j10, long j11, long j12, String str, boolean z10);

    public static native void nativeSetRealmAny(long j10, long j11, long j12, long j13, boolean z10);

    public static native void nativeSetString(long j10, long j11, long j12, String str, boolean z10);

    public static native void nativeSetTimestamp(long j10, long j11, long j12, long j13, boolean z10);

    public static native void nativeSetUUID(long j10, long j11, long j12, String str, boolean z10);

    private native long nativeSize(long j10);

    private native long nativeWhere(long j10);

    public static String r(String str) {
        if (str == null) {
            return null;
        }
        return f17780q + str;
    }

    public void A(long j10, long j11, Date date, boolean z10) {
        if (date != null) {
            a();
            nativeSetTimestamp(this.f17783f, j10, j11, date.getTime(), z10);
            return;
        }
        throw new IllegalArgumentException("Null Date is not allowed.");
    }

    public void B(long j10, long j11, double d10, boolean z10) {
        a();
        nativeSetDouble(this.f17783f, j10, j11, d10, z10);
    }

    public void C(long j10, long j11, float f10, boolean z10) {
        a();
        nativeSetFloat(this.f17783f, j10, j11, f10, z10);
    }

    public void D(long j10, long j11, long j12, boolean z10) {
        a();
        nativeSetLink(this.f17783f, j10, j11, j12, z10);
    }

    public void E(long j10, long j11, long j12, boolean z10) {
        a();
        nativeSetLong(this.f17783f, j10, j11, j12, z10);
    }

    public void F(long j10, long j11, boolean z10) {
        a();
        nativeSetNull(this.f17783f, j10, j11, z10);
    }

    public void G(long j10, long j11, String str, boolean z10) {
        a();
        if (str == null) {
            nativeSetNull(this.f17783f, j10, j11, z10);
        } else {
            nativeSetString(this.f17783f, j10, j11, str, z10);
        }
    }

    public long H() {
        return nativeSize(this.f17783f);
    }

    public TableQuery J() {
        return new TableQuery(this.f17784m, this, nativeWhere(this.f17783f));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        if (w()) {
            I();
        }
    }

    public void b() {
        a();
        nativeClear(this.f17783f);
    }

    public long c(long j10, long j11) {
        return nativeFindFirstInt(this.f17783f, j10, j11);
    }

    public long d(long j10) {
        return nativeFindFirstNull(this.f17783f, j10);
    }

    public long e(long j10, String str) {
        if (str != null) {
            return nativeFindFirstString(this.f17783f, j10, str);
        }
        throw new IllegalArgumentException("null is not supported");
    }

    public Table f(OsSharedRealm osSharedRealm) {
        if (osSharedRealm.isFrozen()) {
            return new Table(osSharedRealm, nativeFreeze(osSharedRealm.getNativePtr(), this.f17783f));
        }
        throw new IllegalArgumentException("Frozen Realm required");
    }

    public CheckedRow g(long j10) {
        return CheckedRow.e(this.f17784m, this, j10);
    }

    @Override // io.realm.internal.h
    public long getNativeFinalizerPtr() {
        return f17782s;
    }

    @Override // io.realm.internal.h
    public long getNativePtr() {
        return this.f17783f;
    }

    public String h() {
        String i10 = i(p());
        if (!Util.g(i10)) {
            return i10;
        }
        throw new IllegalStateException("This object class is no longer part of the schema for the Realm file. It is therefor not possible to access the schema name.");
    }

    public long j() {
        return nativeGetColumnCount(this.f17783f);
    }

    public long k(String str) {
        if (str != null) {
            return nativeGetColumnKey(this.f17783f, str);
        }
        throw new IllegalArgumentException("Column name can not be null.");
    }

    public String l(long j10) {
        return nativeGetColumnName(this.f17783f, j10);
    }

    public String[] m() {
        return nativeGetColumnNames(this.f17783f);
    }

    public RealmFieldType n(long j10) {
        return RealmFieldType.fromNativeValue(nativeGetColumnType(this.f17783f, j10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public native long nativeGetRowPtr(long j10, long j11);

    public Table o(long j10) {
        return new Table(this.f17785p, nativeGetLinkTarget(this.f17783f, j10));
    }

    public String p() {
        return nativeGetName(this.f17783f);
    }

    public OsSharedRealm q() {
        return this.f17785p;
    }

    public UncheckedRow s(long j10) {
        return UncheckedRow.a(this.f17784m, this, j10);
    }

    public UncheckedRow t(long j10) {
        return UncheckedRow.b(this.f17784m, this, j10);
    }

    public String toString() {
        long j10 = j();
        String p10 = p();
        StringBuilder sb2 = new StringBuilder("The Table ");
        if (p10 != null && !p10.isEmpty()) {
            sb2.append(p());
            sb2.append(" ");
        }
        sb2.append("contains ");
        sb2.append(j10);
        sb2.append(" columns: ");
        String[] m10 = m();
        int length = m10.length;
        boolean z10 = true;
        int i10 = 0;
        while (i10 < length) {
            String str = m10[i10];
            if (!z10) {
                sb2.append(", ");
            }
            sb2.append(str);
            i10++;
            z10 = false;
        }
        sb2.append(".");
        sb2.append(" And ");
        sb2.append(H());
        sb2.append(" rows.");
        return sb2.toString();
    }

    public boolean u(long j10) {
        return nativeIsColumnNullable(this.f17783f, j10);
    }

    public boolean v() {
        return nativeIsEmbedded(this.f17783f);
    }

    boolean w() {
        OsSharedRealm osSharedRealm = this.f17785p;
        if (osSharedRealm != null && !osSharedRealm.isInTransaction()) {
            return true;
        }
        return false;
    }

    public boolean x() {
        long j10 = this.f17783f;
        if (j10 != 0 && nativeIsValid(j10)) {
            return true;
        }
        return false;
    }

    public void y(long j10) {
        a();
        nativeMoveLastOver(this.f17783f, j10);
    }

    public void z(long j10, long j11, boolean z10, boolean z11) {
        a();
        nativeSetBoolean(this.f17783f, j10, j11, z10, z11);
    }
}
