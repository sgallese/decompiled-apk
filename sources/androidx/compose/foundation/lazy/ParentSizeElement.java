package androidx.compose.foundation.lazy;

import j0.g3;
import p1.u0;
import qc.q;

/* compiled from: LazyItemScopeImpl.kt */
/* loaded from: classes.dex */
final class ParentSizeElement extends u0<c> {

    /* renamed from: c  reason: collision with root package name */
    private final float f2143c;

    /* renamed from: d  reason: collision with root package name */
    private final g3<Integer> f2144d;

    /* renamed from: e  reason: collision with root package name */
    private final g3<Integer> f2145e;

    /* renamed from: f  reason: collision with root package name */
    private final String f2146f;

    public ParentSizeElement(float f10, g3<Integer> g3Var, g3<Integer> g3Var2, String str) {
        q.i(str, "inspectorName");
        this.f2143c = f10;
        this.f2144d = g3Var;
        this.f2145e = g3Var2;
        this.f2146f = str;
    }

    public boolean equals(Object obj) {
        boolean z10;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f2143c == cVar.I1()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && q.d(this.f2144d, cVar.K1()) && q.d(this.f2145e, cVar.J1())) {
            return true;
        }
        return false;
    }

    @Override // p1.u0
    public int hashCode() {
        int i10;
        g3<Integer> g3Var = this.f2144d;
        int i11 = 0;
        if (g3Var != null) {
            i10 = g3Var.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = i10 * 31;
        g3<Integer> g3Var2 = this.f2145e;
        if (g3Var2 != null) {
            i11 = g3Var2.hashCode();
        }
        return ((i12 + i11) * 31) + Float.floatToIntBits(this.f2143c);
    }

    @Override // p1.u0
    /* renamed from: v  reason: merged with bridge method [inline-methods] */
    public c e() {
        return new c(this.f2143c, this.f2144d, this.f2145e);
    }

    @Override // p1.u0
    /* renamed from: x  reason: merged with bridge method [inline-methods] */
    public void m(c cVar) {
        q.i(cVar, "node");
        cVar.L1(this.f2143c);
        cVar.N1(this.f2144d);
        cVar.M1(this.f2145e);
    }
}
