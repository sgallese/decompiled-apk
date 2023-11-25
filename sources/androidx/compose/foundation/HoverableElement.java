package androidx.compose.foundation;

import p1.u0;

/* compiled from: Hoverable.kt */
/* loaded from: classes.dex */
final class HoverableElement extends u0<q> {

    /* renamed from: c  reason: collision with root package name */
    private final v.m f1842c;

    public HoverableElement(v.m mVar) {
        qc.q.i(mVar, "interactionSource");
        this.f1842c = mVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof HoverableElement) && qc.q.d(((HoverableElement) obj).f1842c, this.f1842c)) {
            return true;
        }
        return false;
    }

    @Override // p1.u0
    public int hashCode() {
        return this.f1842c.hashCode() * 31;
    }

    @Override // p1.u0
    /* renamed from: v  reason: merged with bridge method [inline-methods] */
    public q e() {
        return new q(this.f1842c);
    }

    @Override // p1.u0
    /* renamed from: x  reason: merged with bridge method [inline-methods] */
    public void m(q qVar) {
        qc.q.i(qVar, "node");
        qVar.L1(this.f1842c);
    }
}
