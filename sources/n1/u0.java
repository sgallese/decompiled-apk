package n1;

import androidx.compose.ui.platform.m1;
import androidx.compose.ui.platform.n1;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: OnRemeasuredModifier.kt */
/* loaded from: classes.dex */
final class u0 extends n1 implements s0 {

    /* renamed from: d  reason: collision with root package name */
    private final pc.l<j2.p, dc.w> f20031d;

    /* renamed from: e  reason: collision with root package name */
    private long f20032e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public u0(pc.l<? super j2.p, dc.w> lVar, pc.l<? super m1, dc.w> lVar2) {
        super(lVar2);
        qc.q.i(lVar, "onSizeChanged");
        qc.q.i(lVar2, "inspectorInfo");
        this.f20031d = lVar;
        this.f20032e = j2.q.a(RecyclerView.UNDEFINED_DURATION, RecyclerView.UNDEFINED_DURATION);
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
        if (!(obj instanceof u0)) {
            return false;
        }
        return qc.q.d(this.f20031d, ((u0) obj).f20031d);
    }

    @Override // n1.s0
    public void g(long j10) {
        if (!j2.p.e(this.f20032e, j10)) {
            this.f20031d.invoke(j2.p.b(j10));
            this.f20032e = j10;
        }
    }

    @Override // androidx.compose.ui.e
    public /* synthetic */ boolean h(pc.l lVar) {
        return v0.e.a(this, lVar);
    }

    public int hashCode() {
        return this.f20031d.hashCode();
    }
}
