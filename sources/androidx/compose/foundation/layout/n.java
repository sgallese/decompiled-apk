package androidx.compose.foundation.layout;

import androidx.compose.ui.e;
import dc.w;
import j2.h;
import n1.g0;
import n1.j0;
import n1.k0;
import n1.l0;
import n1.y0;
import p1.e0;
import qc.q;
import qc.r;

/* compiled from: Size.kt */
/* loaded from: classes.dex */
final class n extends e.c implements e0 {
    private float A;
    private float B;
    private float C;
    private float D;
    private boolean E;

    /* compiled from: Size.kt */
    /* loaded from: classes.dex */
    static final class a extends r implements pc.l<y0.a, w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ y0 f2135f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(y0 y0Var) {
            super(1);
            this.f2135f = y0Var;
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ w invoke(y0.a aVar) {
            invoke2(aVar);
            return w.f13270a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(y0.a aVar) {
            q.i(aVar, "$this$layout");
            y0.a.r(aVar, this.f2135f, 0, 0, 0.0f, 4, null);
        }
    }

    public /* synthetic */ n(float f10, float f11, float f12, float f13, boolean z10, qc.h hVar) {
        this(f10, f11, f12, f13, z10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0054, code lost:
    
        if (r5 != Integer.MAX_VALUE) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final long I1(j2.e r8) {
        /*
            r7 = this;
            float r0 = r7.C
            j2.h$a r1 = j2.h.f18979m
            float r2 = r1.b()
            boolean r0 = j2.h.l(r0, r2)
            r2 = 2147483647(0x7fffffff, float:NaN)
            r3 = 0
            if (r0 != 0) goto L1d
            float r0 = r7.C
            int r0 = r8.K0(r0)
            int r0 = vc.j.d(r0, r3)
            goto L20
        L1d:
            r0 = 2147483647(0x7fffffff, float:NaN)
        L20:
            float r4 = r7.D
            float r5 = r1.b()
            boolean r4 = j2.h.l(r4, r5)
            if (r4 != 0) goto L37
            float r4 = r7.D
            int r4 = r8.K0(r4)
            int r4 = vc.j.d(r4, r3)
            goto L3a
        L37:
            r4 = 2147483647(0x7fffffff, float:NaN)
        L3a:
            float r5 = r7.A
            float r6 = r1.b()
            boolean r5 = j2.h.l(r5, r6)
            if (r5 != 0) goto L57
            float r5 = r7.A
            int r5 = r8.K0(r5)
            int r5 = vc.j.h(r5, r0)
            int r5 = vc.j.d(r5, r3)
            if (r5 == r2) goto L57
            goto L58
        L57:
            r5 = 0
        L58:
            float r6 = r7.B
            float r1 = r1.b()
            boolean r1 = j2.h.l(r6, r1)
            if (r1 != 0) goto L75
            float r1 = r7.B
            int r8 = r8.K0(r1)
            int r8 = vc.j.h(r8, r4)
            int r8 = vc.j.d(r8, r3)
            if (r8 == r2) goto L75
            r3 = r8
        L75:
            long r0 = j2.c.a(r5, r0, r3, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.n.I1(j2.e):long");
    }

    public final void J1(boolean z10) {
        this.E = z10;
    }

    public final void K1(float f10) {
        this.D = f10;
    }

    public final void L1(float f10) {
        this.C = f10;
    }

    public final void M1(float f10) {
        this.B = f10;
    }

    public final void N1(float f10) {
        this.A = f10;
    }

    @Override // p1.e0
    public j0 d(l0 l0Var, g0 g0Var, long j10) {
        int h10;
        int d10;
        int h11;
        int d11;
        long a10;
        q.i(l0Var, "$this$measure");
        q.i(g0Var, "measurable");
        long I1 = I1(l0Var);
        if (this.E) {
            a10 = j2.c.e(j10, I1);
        } else {
            float f10 = this.A;
            h.a aVar = j2.h.f18979m;
            if (j2.h.l(f10, aVar.b())) {
                h10 = vc.l.h(j2.b.p(j10), j2.b.n(I1));
            } else {
                h10 = j2.b.p(I1);
            }
            if (j2.h.l(this.C, aVar.b())) {
                d10 = vc.l.d(j2.b.n(j10), j2.b.p(I1));
            } else {
                d10 = j2.b.n(I1);
            }
            if (j2.h.l(this.B, aVar.b())) {
                h11 = vc.l.h(j2.b.o(j10), j2.b.m(I1));
            } else {
                h11 = j2.b.o(I1);
            }
            if (j2.h.l(this.D, aVar.b())) {
                d11 = vc.l.d(j2.b.m(j10), j2.b.o(I1));
            } else {
                d11 = j2.b.m(I1);
            }
            a10 = j2.c.a(h10, d10, h11, d11);
        }
        y0 w10 = g0Var.w(a10);
        return k0.b(l0Var, w10.A0(), w10.l0(), null, new a(w10), 4, null);
    }

    @Override // p1.e0
    public int f(n1.n nVar, n1.m mVar, int i10) {
        q.i(nVar, "<this>");
        q.i(mVar, "measurable");
        long I1 = I1(nVar);
        if (j2.b.l(I1)) {
            return j2.b.n(I1);
        }
        return j2.c.g(I1, mVar.t(i10));
    }

    @Override // p1.e0
    public int n(n1.n nVar, n1.m mVar, int i10) {
        q.i(nVar, "<this>");
        q.i(mVar, "measurable");
        long I1 = I1(nVar);
        if (j2.b.k(I1)) {
            return j2.b.m(I1);
        }
        return j2.c.f(I1, mVar.a0(i10));
    }

    @Override // p1.e0
    public int r(n1.n nVar, n1.m mVar, int i10) {
        q.i(nVar, "<this>");
        q.i(mVar, "measurable");
        long I1 = I1(nVar);
        if (j2.b.k(I1)) {
            return j2.b.m(I1);
        }
        return j2.c.f(I1, mVar.g(i10));
    }

    @Override // p1.e0
    public int t(n1.n nVar, n1.m mVar, int i10) {
        q.i(nVar, "<this>");
        q.i(mVar, "measurable");
        long I1 = I1(nVar);
        if (j2.b.l(I1)) {
            return j2.b.n(I1);
        }
        return j2.c.g(I1, mVar.s(i10));
    }

    private n(float f10, float f11, float f12, float f13, boolean z10) {
        this.A = f10;
        this.B = f11;
        this.C = f12;
        this.D = f13;
        this.E = z10;
    }
}
