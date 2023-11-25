package androidx.compose.foundation.lazy;

import j2.l;
import p1.u0;
import qc.q;
import s.e0;

/* compiled from: LazyItemScopeImpl.kt */
/* loaded from: classes.dex */
final class AnimateItemPlacementElement extends u0<a> {

    /* renamed from: c  reason: collision with root package name */
    private final e0<l> f2142c;

    public AnimateItemPlacementElement(e0<l> e0Var) {
        q.i(e0Var, "animationSpec");
        this.f2142c = e0Var;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnimateItemPlacementElement)) {
            return false;
        }
        return !q.d(this.f2142c, ((AnimateItemPlacementElement) obj).f2142c);
    }

    @Override // p1.u0
    public int hashCode() {
        return this.f2142c.hashCode();
    }

    @Override // p1.u0
    /* renamed from: v  reason: merged with bridge method [inline-methods] */
    public a e() {
        return new a(this.f2142c);
    }

    @Override // p1.u0
    /* renamed from: x  reason: merged with bridge method [inline-methods] */
    public void m(a aVar) {
        q.i(aVar, "node");
        aVar.N1().T1(this.f2142c);
    }
}
