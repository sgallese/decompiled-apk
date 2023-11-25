package androidx.compose.ui.layout;

import n1.a0;
import n1.g0;
import n1.j0;
import n1.l0;
import p1.u0;
import pc.q;

/* compiled from: LayoutModifier.kt */
/* loaded from: classes.dex */
final class LayoutElement extends u0<a0> {

    /* renamed from: c  reason: collision with root package name */
    private final q<l0, g0, j2.b, j0> f2471c;

    /* JADX WARN: Multi-variable type inference failed */
    public LayoutElement(q<? super l0, ? super g0, ? super j2.b, ? extends j0> qVar) {
        qc.q.i(qVar, "measure");
        this.f2471c = qVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof LayoutElement) && qc.q.d(this.f2471c, ((LayoutElement) obj).f2471c)) {
            return true;
        }
        return false;
    }

    @Override // p1.u0
    public int hashCode() {
        return this.f2471c.hashCode();
    }

    public String toString() {
        return "LayoutElement(measure=" + this.f2471c + ')';
    }

    @Override // p1.u0
    /* renamed from: v  reason: merged with bridge method [inline-methods] */
    public a0 e() {
        return new a0(this.f2471c);
    }

    @Override // p1.u0
    /* renamed from: x  reason: merged with bridge method [inline-methods] */
    public void m(a0 a0Var) {
        qc.q.i(a0Var, "node");
        a0Var.I1(this.f2471c);
    }
}
