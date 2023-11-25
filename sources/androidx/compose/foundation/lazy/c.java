package androidx.compose.foundation.lazy;

import androidx.compose.ui.e;
import dc.w;
import j0.g3;
import n1.g0;
import n1.j0;
import n1.k0;
import n1.l0;
import n1.m;
import n1.n;
import n1.y0;
import p1.d0;
import p1.e0;
import pc.l;
import qc.q;
import qc.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LazyItemScopeImpl.kt */
/* loaded from: classes.dex */
public final class c extends e.c implements e0 {
    private float A;
    private g3<Integer> B;
    private g3<Integer> C;

    /* compiled from: LazyItemScopeImpl.kt */
    /* loaded from: classes.dex */
    static final class a extends r implements l<y0.a, w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ y0 f2149f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(y0 y0Var) {
            super(1);
            this.f2149f = y0Var;
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ w invoke(y0.a aVar) {
            invoke2(aVar);
            return w.f13270a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(y0.a aVar) {
            q.i(aVar, "$this$layout");
            y0.a.n(aVar, this.f2149f, 0, 0, 0.0f, 4, null);
        }
    }

    public c(float f10, g3<Integer> g3Var, g3<Integer> g3Var2) {
        this.A = f10;
        this.B = g3Var;
        this.C = g3Var2;
    }

    public final float I1() {
        return this.A;
    }

    public final g3<Integer> J1() {
        return this.C;
    }

    public final g3<Integer> K1() {
        return this.B;
    }

    public final void L1(float f10) {
        this.A = f10;
    }

    public final void M1(g3<Integer> g3Var) {
        this.C = g3Var;
    }

    public final void N1(g3<Integer> g3Var) {
        this.B = g3Var;
    }

    @Override // p1.e0
    public j0 d(l0 l0Var, g0 g0Var, long j10) {
        int i10;
        int i11;
        int p10;
        int o10;
        q.i(l0Var, "$this$measure");
        q.i(g0Var, "measurable");
        g3<Integer> g3Var = this.B;
        if (g3Var != null && g3Var.getValue().intValue() != Integer.MAX_VALUE) {
            i10 = sc.c.d(g3Var.getValue().floatValue() * this.A);
        } else {
            i10 = Integer.MAX_VALUE;
        }
        g3<Integer> g3Var2 = this.C;
        if (g3Var2 != null && g3Var2.getValue().intValue() != Integer.MAX_VALUE) {
            i11 = sc.c.d(g3Var2.getValue().floatValue() * this.A);
        } else {
            i11 = Integer.MAX_VALUE;
        }
        if (i10 != Integer.MAX_VALUE) {
            p10 = i10;
        } else {
            p10 = j2.b.p(j10);
        }
        if (i11 != Integer.MAX_VALUE) {
            o10 = i11;
        } else {
            o10 = j2.b.o(j10);
        }
        if (i10 == Integer.MAX_VALUE) {
            i10 = j2.b.n(j10);
        }
        if (i11 == Integer.MAX_VALUE) {
            i11 = j2.b.m(j10);
        }
        y0 w10 = g0Var.w(j2.c.a(p10, i10, o10, i11));
        return k0.b(l0Var, w10.A0(), w10.l0(), null, new a(w10), 4, null);
    }

    @Override // p1.e0
    public /* synthetic */ int f(n nVar, m mVar, int i10) {
        return d0.b(this, nVar, mVar, i10);
    }

    @Override // p1.e0
    public /* synthetic */ int n(n nVar, m mVar, int i10) {
        return d0.c(this, nVar, mVar, i10);
    }

    @Override // p1.e0
    public /* synthetic */ int r(n nVar, m mVar, int i10) {
        return d0.a(this, nVar, mVar, i10);
    }

    @Override // p1.e0
    public /* synthetic */ int t(n nVar, m mVar, int i10) {
        return d0.d(this, nVar, mVar, i10);
    }
}
