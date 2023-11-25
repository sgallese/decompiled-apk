package androidx.compose.foundation.layout;

import androidx.compose.ui.e;
import dc.w;
import n1.g0;
import n1.j0;
import n1.k0;
import n1.l0;
import n1.y0;
import p1.d0;
import p1.e0;
import qc.q;
import qc.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Offset.kt */
/* loaded from: classes.dex */
public final class h extends e.c implements e0 {
    private float A;
    private float B;
    private boolean C;

    /* compiled from: Offset.kt */
    /* loaded from: classes.dex */
    static final class a extends r implements pc.l<y0.a, w> {

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ y0 f2090m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ l0 f2091p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(y0 y0Var, l0 l0Var) {
            super(1);
            this.f2090m = y0Var;
            this.f2091p = l0Var;
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ w invoke(y0.a aVar) {
            invoke2(aVar);
            return w.f13270a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(y0.a aVar) {
            q.i(aVar, "$this$layout");
            if (h.this.I1()) {
                y0.a.r(aVar, this.f2090m, this.f2091p.K0(h.this.J1()), this.f2091p.K0(h.this.K1()), 0.0f, 4, null);
            } else {
                y0.a.n(aVar, this.f2090m, this.f2091p.K0(h.this.J1()), this.f2091p.K0(h.this.K1()), 0.0f, 4, null);
            }
        }
    }

    public /* synthetic */ h(float f10, float f11, boolean z10, qc.h hVar) {
        this(f10, f11, z10);
    }

    public final boolean I1() {
        return this.C;
    }

    public final float J1() {
        return this.A;
    }

    public final float K1() {
        return this.B;
    }

    public final void L1(boolean z10) {
        this.C = z10;
    }

    public final void M1(float f10) {
        this.A = f10;
    }

    public final void N1(float f10) {
        this.B = f10;
    }

    @Override // p1.e0
    public j0 d(l0 l0Var, g0 g0Var, long j10) {
        q.i(l0Var, "$this$measure");
        q.i(g0Var, "measurable");
        y0 w10 = g0Var.w(j10);
        return k0.b(l0Var, w10.A0(), w10.l0(), null, new a(w10, l0Var), 4, null);
    }

    @Override // p1.e0
    public /* synthetic */ int f(n1.n nVar, n1.m mVar, int i10) {
        return d0.b(this, nVar, mVar, i10);
    }

    @Override // p1.e0
    public /* synthetic */ int n(n1.n nVar, n1.m mVar, int i10) {
        return d0.c(this, nVar, mVar, i10);
    }

    @Override // p1.e0
    public /* synthetic */ int r(n1.n nVar, n1.m mVar, int i10) {
        return d0.a(this, nVar, mVar, i10);
    }

    @Override // p1.e0
    public /* synthetic */ int t(n1.n nVar, n1.m mVar, int i10) {
        return d0.d(this, nVar, mVar, i10);
    }

    private h(float f10, float f11, boolean z10) {
        this.A = f10;
        this.B = f11;
        this.C = z10;
    }
}
