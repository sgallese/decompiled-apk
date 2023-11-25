package androidx.compose.ui.focus;

import dc.w;
import p1.u0;

/* compiled from: FocusChangedModifier.kt */
/* loaded from: classes.dex */
final class FocusChangedElement extends u0<c> {

    /* renamed from: c  reason: collision with root package name */
    private final pc.l<y0.o, w> f2350c;

    /* JADX WARN: Multi-variable type inference failed */
    public FocusChangedElement(pc.l<? super y0.o, w> lVar) {
        qc.q.i(lVar, "onFocusChanged");
        this.f2350c = lVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof FocusChangedElement) && qc.q.d(this.f2350c, ((FocusChangedElement) obj).f2350c)) {
            return true;
        }
        return false;
    }

    @Override // p1.u0
    public int hashCode() {
        return this.f2350c.hashCode();
    }

    public String toString() {
        return "FocusChangedElement(onFocusChanged=" + this.f2350c + ')';
    }

    @Override // p1.u0
    /* renamed from: v  reason: merged with bridge method [inline-methods] */
    public c e() {
        return new c(this.f2350c);
    }

    @Override // p1.u0
    /* renamed from: x  reason: merged with bridge method [inline-methods] */
    public void m(c cVar) {
        qc.q.i(cVar, "node");
        cVar.I1(this.f2350c);
    }
}
