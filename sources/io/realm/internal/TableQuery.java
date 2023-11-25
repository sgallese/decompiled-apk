package io.realm.internal;

import io.realm.internal.core.NativeRealmAny;
import io.realm.internal.objectstore.OsKeyPathMapping;
import io.realm.j1;
import io.realm.p0;
import io.realm.r0;

/* loaded from: classes4.dex */
public class TableQuery implements h {

    /* renamed from: r  reason: collision with root package name */
    private static final long f17786r = nativeGetFinalizerPtr();

    /* renamed from: f  reason: collision with root package name */
    private final Table f17787f;

    /* renamed from: m  reason: collision with root package name */
    private final long f17788m;

    /* renamed from: p  reason: collision with root package name */
    private final r0 f17789p = new r0();

    /* renamed from: q  reason: collision with root package name */
    private boolean f17790q = true;

    public TableQuery(g gVar, Table table, long j10) {
        this.f17787f = table;
        this.f17788m = j10;
        gVar.a(this);
    }

    public static String c(String[] strArr, j1[] j1VarArr) {
        String str;
        StringBuilder sb2 = new StringBuilder("SORT(");
        String str2 = "";
        int i10 = 0;
        while (i10 < strArr.length) {
            String str3 = strArr[i10];
            sb2.append(str2);
            sb2.append(i(str3));
            sb2.append(" ");
            if (j1VarArr[i10] == j1.ASCENDING) {
                str = "ASC";
            } else {
                str = "DESC";
            }
            sb2.append(str);
            i10++;
            str2 = ", ";
        }
        sb2.append(")");
        return sb2.toString();
    }

    private static String i(String str) {
        if (str == null) {
            return null;
        }
        return str.replace(" ", "\\ ");
    }

    private native long[] nativeAverageDecimal128(long j10, long j11);

    private native double nativeAverageDouble(long j10, long j11);

    private native double nativeAverageFloat(long j10, long j11);

    private native double nativeAverageInt(long j10, long j11);

    private native long[] nativeAverageRealmAny(long j10, long j11);

    private native void nativeBeginGroup(long j10);

    private native long nativeCount(long j10);

    private native void nativeEndGroup(long j10);

    private native long nativeFind(long j10);

    private static native long nativeGetFinalizerPtr();

    private native long[] nativeMaximumDecimal128(long j10, long j11);

    private native Double nativeMaximumDouble(long j10, long j11);

    private native Float nativeMaximumFloat(long j10, long j11);

    private native Long nativeMaximumInt(long j10, long j11);

    private native NativeRealmAny nativeMaximumRealmAny(long j10, long j11);

    private native Long nativeMaximumTimestamp(long j10, long j11);

    private native long[] nativeMinimumDecimal128(long j10, long j11);

    private native Double nativeMinimumDouble(long j10, long j11);

    private native Float nativeMinimumFloat(long j10, long j11);

    private native Long nativeMinimumInt(long j10, long j11);

    private native NativeRealmAny nativeMinimumRealmAny(long j10, long j11);

    private native Long nativeMinimumTimestamp(long j10, long j11);

    private native void nativeNot(long j10);

    private native void nativeOr(long j10);

    private native void nativeRawDescriptor(long j10, String str, long j11);

    private native void nativeRawPredicate(long j10, String str, long[] jArr, long j11);

    private native long nativeRemove(long j10);

    private native long[] nativeSumDecimal128(long j10, long j11);

    private native double nativeSumDouble(long j10, long j11);

    private native double nativeSumFloat(long j10, long j11);

    private native long nativeSumInt(long j10, long j11);

    private native long[] nativeSumRealmAny(long j10, long j11);

    private native String nativeValidateQuery(long j10);

    private void w(OsKeyPathMapping osKeyPathMapping, String str) {
        long j10;
        long j11 = this.f17788m;
        if (osKeyPathMapping != null) {
            j10 = osKeyPathMapping.getNativePtr();
        } else {
            j10 = 0;
        }
        nativeRawDescriptor(j11, str, j10);
    }

    public TableQuery a() {
        x(null, "FALSEPREDICATE", new long[0]);
        this.f17790q = false;
        return this;
    }

    public TableQuery b() {
        nativeBeginGroup(this.f17788m);
        this.f17790q = false;
        return this;
    }

    public TableQuery d(OsKeyPathMapping osKeyPathMapping, String str, p0 p0Var) {
        this.f17789p.c(this, osKeyPathMapping, i(str) + " CONTAINS $0", p0Var);
        this.f17790q = false;
        return this;
    }

    public TableQuery e(OsKeyPathMapping osKeyPathMapping, String str, p0 p0Var) {
        this.f17789p.c(this, osKeyPathMapping, i(str) + " CONTAINS[c] $0", p0Var);
        this.f17790q = false;
        return this;
    }

    public TableQuery f() {
        nativeEndGroup(this.f17788m);
        this.f17790q = false;
        return this;
    }

    public TableQuery g(OsKeyPathMapping osKeyPathMapping, String str, p0 p0Var) {
        this.f17789p.c(this, osKeyPathMapping, i(str) + " = $0", p0Var);
        this.f17790q = false;
        return this;
    }

    @Override // io.realm.internal.h
    public long getNativeFinalizerPtr() {
        return f17786r;
    }

    @Override // io.realm.internal.h
    public long getNativePtr() {
        return this.f17788m;
    }

    public TableQuery h(OsKeyPathMapping osKeyPathMapping, String str, p0 p0Var) {
        this.f17789p.c(this, osKeyPathMapping, i(str) + " =[c] $0", p0Var);
        this.f17790q = false;
        return this;
    }

    public long j() {
        z();
        return nativeFind(this.f17788m);
    }

    public Table k() {
        return this.f17787f;
    }

    public TableQuery l(OsKeyPathMapping osKeyPathMapping, String str, p0 p0Var) {
        this.f17789p.c(this, osKeyPathMapping, i(str) + " > $0", p0Var);
        this.f17790q = false;
        return this;
    }

    public TableQuery m(OsKeyPathMapping osKeyPathMapping, String str, p0 p0Var) {
        this.f17789p.c(this, osKeyPathMapping, i(str) + " >= $0", p0Var);
        this.f17790q = false;
        return this;
    }

    public TableQuery n(OsKeyPathMapping osKeyPathMapping, String str, p0[] p0VarArr) {
        String i10 = i(str);
        b();
        int length = p0VarArr.length;
        boolean z10 = true;
        int i11 = 0;
        while (i11 < length) {
            p0 p0Var = p0VarArr[i11];
            if (!z10) {
                v();
            }
            if (p0Var == null) {
                q(osKeyPathMapping, i10);
            } else {
                g(osKeyPathMapping, i10, p0Var);
            }
            i11++;
            z10 = false;
        }
        f();
        this.f17790q = false;
        return this;
    }

    public TableQuery o(OsKeyPathMapping osKeyPathMapping, String str, p0[] p0VarArr) {
        String i10 = i(str);
        b();
        int length = p0VarArr.length;
        boolean z10 = true;
        int i11 = 0;
        while (i11 < length) {
            p0 p0Var = p0VarArr[i11];
            if (!z10) {
                v();
            }
            if (p0Var == null) {
                q(osKeyPathMapping, i10);
            } else {
                h(osKeyPathMapping, i10, p0Var);
            }
            i11++;
            z10 = false;
        }
        f();
        this.f17790q = false;
        return this;
    }

    public TableQuery p(OsKeyPathMapping osKeyPathMapping, String str) {
        x(osKeyPathMapping, i(str) + " != NULL", new long[0]);
        this.f17790q = false;
        return this;
    }

    public TableQuery q(OsKeyPathMapping osKeyPathMapping, String str) {
        x(osKeyPathMapping, i(str) + " = NULL", new long[0]);
        this.f17790q = false;
        return this;
    }

    public TableQuery r(OsKeyPathMapping osKeyPathMapping, String str, p0 p0Var) {
        this.f17789p.c(this, osKeyPathMapping, i(str) + " < $0", p0Var);
        this.f17790q = false;
        return this;
    }

    public TableQuery s(OsKeyPathMapping osKeyPathMapping, String str, p0 p0Var) {
        this.f17789p.c(this, osKeyPathMapping, i(str) + " <= $0", p0Var);
        this.f17790q = false;
        return this;
    }

    public TableQuery t(OsKeyPathMapping osKeyPathMapping, String str, p0 p0Var) {
        this.f17789p.c(this, osKeyPathMapping, i(str) + " != $0", p0Var);
        this.f17790q = false;
        return this;
    }

    public TableQuery u(OsKeyPathMapping osKeyPathMapping, String str, p0 p0Var) {
        this.f17789p.c(this, osKeyPathMapping, i(str) + " !=[c] $0", p0Var);
        this.f17790q = false;
        return this;
    }

    public TableQuery v() {
        nativeOr(this.f17788m);
        this.f17790q = false;
        return this;
    }

    public void x(OsKeyPathMapping osKeyPathMapping, String str, long... jArr) {
        long j10;
        long j11 = this.f17788m;
        if (osKeyPathMapping != null) {
            j10 = osKeyPathMapping.getNativePtr();
        } else {
            j10 = 0;
        }
        nativeRawPredicate(j11, str, jArr, j10);
    }

    public TableQuery y(OsKeyPathMapping osKeyPathMapping, String[] strArr, j1[] j1VarArr) {
        w(osKeyPathMapping, c(strArr, j1VarArr));
        return this;
    }

    public void z() {
        if (!this.f17790q) {
            String nativeValidateQuery = nativeValidateQuery(this.f17788m);
            if ("".equals(nativeValidateQuery)) {
                this.f17790q = true;
                return;
            }
            throw new UnsupportedOperationException(nativeValidateQuery);
        }
    }
}
