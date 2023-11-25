package androidx.compose.ui.draw;

import p1.u0;
import pc.l;
import qc.q;
import x0.i;

/* compiled from: DrawModifier.kt */
/* loaded from: classes.dex */
final class DrawWithCacheElement extends u0<a> {

    /* renamed from: c  reason: collision with root package name */
    private final l<x0.d, i> f2324c;

    /* JADX WARN: Multi-variable type inference failed */
    public DrawWithCacheElement(l<? super x0.d, i> lVar) {
        q.i(lVar, "onBuildDrawCache");
        this.f2324c = lVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof DrawWithCacheElement) && q.d(this.f2324c, ((DrawWithCacheElement) obj).f2324c)) {
            return true;
        }
        return false;
    }

    @Override // p1.u0
    public int hashCode() {
        return this.f2324c.hashCode();
    }

    public String toString() {
        return "DrawWithCacheElement(onBuildDrawCache=" + this.f2324c + ')';
    }

    @Override // p1.u0
    /* renamed from: v  reason: merged with bridge method [inline-methods] */
    public a e() {
        return new a(new x0.d(), this.f2324c);
    }

    @Override // p1.u0
    /* renamed from: x  reason: merged with bridge method [inline-methods] */
    public void m(a aVar) {
        q.i(aVar, "node");
        aVar.K1(this.f2324c);
    }
}
