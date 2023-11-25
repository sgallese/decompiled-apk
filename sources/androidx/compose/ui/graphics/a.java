package androidx.compose.ui.graphics;

import androidx.compose.ui.e;
import dc.w;
import n1.g0;
import n1.j0;
import n1.k0;
import n1.l0;
import n1.m;
import n1.n;
import n1.y0;
import p1.d0;
import p1.e0;
import p1.k;
import p1.x0;
import p1.z0;
import pc.l;
import qc.q;
import qc.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GraphicsLayerModifier.kt */
/* loaded from: classes.dex */
public final class a extends e.c implements e0 {
    private l<? super d, w> A;

    /* compiled from: GraphicsLayerModifier.kt */
    /* renamed from: androidx.compose.ui.graphics.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static final class C0034a extends r implements l<y0.a, w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ y0 f2436f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ a f2437m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0034a(y0 y0Var, a aVar) {
            super(1);
            this.f2436f = y0Var;
            this.f2437m = aVar;
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ w invoke(y0.a aVar) {
            invoke2(aVar);
            return w.f13270a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(y0.a aVar) {
            q.i(aVar, "$this$layout");
            y0.a.x(aVar, this.f2436f, 0, 0, 0.0f, this.f2437m.I1(), 4, null);
        }
    }

    public a(l<? super d, w> lVar) {
        q.i(lVar, "layerBlock");
        this.A = lVar;
    }

    public final l<d, w> I1() {
        return this.A;
    }

    public final void J1() {
        x0 U1 = k.h(this, z0.a(2)).U1();
        if (U1 != null) {
            U1.E2(this.A, true);
        }
    }

    public final void K1(l<? super d, w> lVar) {
        q.i(lVar, "<set-?>");
        this.A = lVar;
    }

    @Override // p1.e0
    public j0 d(l0 l0Var, g0 g0Var, long j10) {
        q.i(l0Var, "$this$measure");
        q.i(g0Var, "measurable");
        y0 w10 = g0Var.w(j10);
        return k0.b(l0Var, w10.A0(), w10.l0(), null, new C0034a(w10, this), 4, null);
    }

    @Override // p1.e0
    public /* synthetic */ int f(n nVar, m mVar, int i10) {
        return d0.b(this, nVar, mVar, i10);
    }

    @Override // p1.e0
    public /* synthetic */ int n(n nVar, m mVar, int i10) {
        return d0.c(this, nVar, mVar, i10);
    }

    @Override // androidx.compose.ui.e.c
    public boolean n1() {
        return false;
    }

    @Override // p1.e0
    public /* synthetic */ int r(n nVar, m mVar, int i10) {
        return d0.a(this, nVar, mVar, i10);
    }

    @Override // p1.e0
    public /* synthetic */ int t(n nVar, m mVar, int i10) {
        return d0.d(this, nVar, mVar, i10);
    }

    public String toString() {
        return "BlockGraphicsLayerModifier(block=" + this.A + ')';
    }
}
