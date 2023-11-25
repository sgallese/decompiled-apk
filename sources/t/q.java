package t;

import androidx.compose.ui.platform.m1;
import androidx.compose.ui.platform.n1;

/* compiled from: AndroidOverscroll.kt */
/* loaded from: classes.dex */
final class q extends n1 implements x0.h {

    /* renamed from: d  reason: collision with root package name */
    private final a f23202d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(a aVar, pc.l<? super m1, dc.w> lVar) {
        super(lVar);
        qc.q.i(aVar, "overscrollEffect");
        qc.q.i(lVar, "inspectorInfo");
        this.f23202d = aVar;
    }

    @Override // androidx.compose.ui.e
    public /* synthetic */ androidx.compose.ui.e a(androidx.compose.ui.e eVar) {
        return v0.d.a(this, eVar);
    }

    @Override // androidx.compose.ui.e
    public /* synthetic */ Object b(Object obj, pc.p pVar) {
        return v0.e.b(this, obj, pVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        return qc.q.d(this.f23202d, ((q) obj).f23202d);
    }

    @Override // androidx.compose.ui.e
    public /* synthetic */ boolean h(pc.l lVar) {
        return v0.e.a(this, lVar);
    }

    public int hashCode() {
        return this.f23202d.hashCode();
    }

    @Override // x0.h
    public void s(c1.c cVar) {
        qc.q.i(cVar, "<this>");
        cVar.d1();
        this.f23202d.w(cVar);
    }

    public String toString() {
        return "DrawOverscrollModifier(overscrollEffect=" + this.f23202d + ')';
    }
}
