package androidx.compose.ui.layout;

import dc.w;
import n1.s;
import p1.u0;
import pc.l;
import qc.q;

/* compiled from: OnGloballyPositionedModifier.kt */
/* loaded from: classes.dex */
final class OnGloballyPositionedElement extends u0<d> {

    /* renamed from: c  reason: collision with root package name */
    private final l<s, w> f2473c;

    /* JADX WARN: Multi-variable type inference failed */
    public OnGloballyPositionedElement(l<? super s, w> lVar) {
        q.i(lVar, "onGloballyPositioned");
        this.f2473c = lVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OnGloballyPositionedElement)) {
            return false;
        }
        return q.d(this.f2473c, ((OnGloballyPositionedElement) obj).f2473c);
    }

    @Override // p1.u0
    public int hashCode() {
        return this.f2473c.hashCode();
    }

    @Override // p1.u0
    /* renamed from: v  reason: merged with bridge method [inline-methods] */
    public d e() {
        return new d(this.f2473c);
    }

    @Override // p1.u0
    /* renamed from: x  reason: merged with bridge method [inline-methods] */
    public void m(d dVar) {
        q.i(dVar, "node");
        dVar.I1(this.f2473c);
    }
}
