package androidx.compose.ui.draw;

import dc.w;
import p1.u0;
import pc.l;
import qc.q;

/* compiled from: DrawModifier.kt */
/* loaded from: classes.dex */
final class DrawWithContentElement extends u0<c> {

    /* renamed from: c  reason: collision with root package name */
    private final l<c1.c, w> f2325c;

    /* JADX WARN: Multi-variable type inference failed */
    public DrawWithContentElement(l<? super c1.c, w> lVar) {
        q.i(lVar, "onDraw");
        this.f2325c = lVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof DrawWithContentElement) && q.d(this.f2325c, ((DrawWithContentElement) obj).f2325c)) {
            return true;
        }
        return false;
    }

    @Override // p1.u0
    public int hashCode() {
        return this.f2325c.hashCode();
    }

    public String toString() {
        return "DrawWithContentElement(onDraw=" + this.f2325c + ')';
    }

    @Override // p1.u0
    /* renamed from: v  reason: merged with bridge method [inline-methods] */
    public c e() {
        return new c(this.f2325c);
    }

    @Override // p1.u0
    /* renamed from: x  reason: merged with bridge method [inline-methods] */
    public void m(c cVar) {
        q.i(cVar, "node");
        cVar.I1(this.f2325c);
    }
}
