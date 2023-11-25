package p1;

import a1.b4;
import a1.c4;
import androidx.recyclerview.widget.RecyclerView;
import p1.j0;
import p1.o0;

/* compiled from: InnerNodeCoordinator.kt */
/* loaded from: classes.dex */
public final class x extends x0 {
    public static final a W = new a(null);
    private static final b4 X;
    private final v1 U;
    private s0 V;

    /* compiled from: InnerNodeCoordinator.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }
    }

    /* compiled from: InnerNodeCoordinator.kt */
    /* loaded from: classes.dex */
    private final class b extends s0 {
        public b() {
            super(x.this);
        }

        @Override // p1.r0
        public int Y0(n1.a aVar) {
            int i10;
            qc.q.i(aVar, "alignmentLine");
            Integer num = r1().j().get(aVar);
            if (num != null) {
                i10 = num.intValue();
            } else {
                i10 = RecyclerView.UNDEFINED_DURATION;
            }
            t1().put(aVar, Integer.valueOf(i10));
            return i10;
        }

        @Override // p1.s0, n1.m
        public int a0(int i10) {
            return f1().R().i(i10);
        }

        @Override // p1.s0, n1.m
        public int g(int i10) {
            return f1().R().d(i10);
        }

        @Override // p1.s0, n1.m
        public int s(int i10) {
            return f1().R().j(i10);
        }

        @Override // p1.s0, n1.m
        public int t(int i10) {
            return f1().R().e(i10);
        }

        @Override // n1.g0
        public n1.y0 w(long j10) {
            s0.p1(this, j10);
            k0.f<j0> t02 = f1().t0();
            int o10 = t02.o();
            if (o10 > 0) {
                j0[] n10 = t02.n();
                int i10 = 0;
                do {
                    o0.a Y = n10[i10].Y();
                    qc.q.f(Y);
                    Y.w1(j0.g.NotUsed);
                    i10++;
                } while (i10 < o10);
            }
            s0.q1(this, f1().d0().mo0measure3p2s80s(this, f1().D(), j10));
            return this;
        }

        @Override // p1.s0
        protected void w1() {
            o0.a Y = f1().Y();
            qc.q.f(Y);
            Y.s1();
        }
    }

    static {
        b4 a10 = a1.o0.a();
        a10.v(a1.p1.f146b.c());
        a10.x(1.0f);
        a10.u(c4.f89a.b());
        X = a10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(j0 j0Var) {
        super(j0Var);
        b bVar;
        qc.q.i(j0Var, "layoutNode");
        this.U = new v1();
        T1().H1(this);
        if (j0Var.Z() != null) {
            bVar = new b();
        } else {
            bVar = null;
        }
        this.V = bVar;
    }

    @Override // p1.x0
    public void H1() {
        if (P1() == null) {
            K2(new b());
        }
    }

    @Override // p1.x0
    /* renamed from: J2  reason: merged with bridge method [inline-methods] */
    public v1 T1() {
        return this.U;
    }

    protected void K2(s0 s0Var) {
        this.V = s0Var;
    }

    @Override // p1.x0
    public s0 P1() {
        return this.V;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p1.x0, n1.y0
    public void Q0(long j10, float f10, pc.l<? super androidx.compose.ui.graphics.d, dc.w> lVar) {
        super.Q0(j10, f10, lVar);
        if (l1()) {
            return;
        }
        o2();
        f1().b0().t1();
    }

    @Override // p1.r0
    public int Y0(n1.a aVar) {
        qc.q.i(aVar, "alignmentLine");
        s0 P1 = P1();
        if (P1 != null) {
            return P1.Y0(aVar);
        }
        Integer num = L1().j().get(aVar);
        if (num != null) {
            return num.intValue();
        }
        return RecyclerView.UNDEFINED_DURATION;
    }

    @Override // n1.m
    public int a0(int i10) {
        return f1().R().g(i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a0 A[EDGE_INSN: B:38:0x00a0->B:36:0x00a0 BREAK  A[LOOP:0: B:21:0x0064->B:40:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    @Override // p1.x0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d2(p1.x0.f r20, long r21, p1.v r23, boolean r24, boolean r25) {
        /*
            r19 = this;
            r0 = r19
            r8 = r20
            r9 = r21
            r11 = r23
            java.lang.String r1 = "hitTestSource"
            qc.q.i(r8, r1)
            java.lang.String r1 = "hitTestResult"
            qc.q.i(r11, r1)
            p1.j0 r1 = r19.f1()
            boolean r1 = r8.d(r1)
            r12 = 1
            r13 = 0
            if (r1 == 0) goto L46
            boolean r1 = r0.I2(r9)
            if (r1 == 0) goto L28
            r14 = r25
            r1 = 1
            goto L49
        L28:
            if (r24 == 0) goto L46
            long r1 = r19.Q1()
            float r1 = r0.D1(r9, r1)
            boolean r2 = java.lang.Float.isInfinite(r1)
            if (r2 != 0) goto L40
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L40
            r1 = 1
            goto L41
        L40:
            r1 = 0
        L41:
            if (r1 == 0) goto L46
            r1 = 1
            r14 = 0
            goto L49
        L46:
            r14 = r25
            r1 = 0
        L49:
            if (r1 == 0) goto La3
            int r15 = p1.v.e(r23)
            p1.j0 r1 = r19.f1()
            k0.f r1 = r1.s0()
            int r2 = r1.o()
            if (r2 <= 0) goto La0
            int r2 = r2 - r12
            java.lang.Object[] r16 = r1.n()
            r17 = r2
        L64:
            r1 = r16[r17]
            r18 = r1
            p1.j0 r18 = (p1.j0) r18
            boolean r1 = r18.f()
            if (r1 == 0) goto L99
            r1 = r20
            r2 = r18
            r3 = r21
            r5 = r23
            r6 = r24
            r7 = r14
            r1.b(r2, r3, r5, r6, r7)
            boolean r1 = r23.n()
            if (r1 != 0) goto L86
        L84:
            r1 = 1
            goto L95
        L86:
            p1.x0 r1 = r18.j0()
            boolean r1 = r1.z2()
            if (r1 == 0) goto L94
            r23.a()
            goto L84
        L94:
            r1 = 0
        L95:
            if (r1 != 0) goto L99
            r1 = 1
            goto L9a
        L99:
            r1 = 0
        L9a:
            if (r1 != 0) goto La0
            int r17 = r17 + (-1)
            if (r17 >= 0) goto L64
        La0:
            p1.v.h(r11, r15)
        La3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p1.x.d2(p1.x0$f, long, p1.v, boolean, boolean):void");
    }

    @Override // n1.m
    public int g(int i10) {
        return f1().R().b(i10);
    }

    @Override // p1.x0
    public void q2(a1.h1 h1Var) {
        qc.q.i(h1Var, "canvas");
        i1 b10 = n0.b(f1());
        k0.f<j0> s02 = f1().s0();
        int o10 = s02.o();
        if (o10 > 0) {
            j0[] n10 = s02.n();
            int i10 = 0;
            do {
                j0 j0Var = n10[i10];
                if (j0Var.f()) {
                    j0Var.A(h1Var);
                }
                i10++;
            } while (i10 < o10);
        }
        if (b10.getShowLayoutBounds()) {
            F1(h1Var, X);
        }
    }

    @Override // n1.m
    public int s(int i10) {
        return f1().R().h(i10);
    }

    @Override // n1.m
    public int t(int i10) {
        return f1().R().c(i10);
    }

    @Override // n1.g0
    public n1.y0 w(long j10) {
        U0(j10);
        k0.f<j0> t02 = f1().t0();
        int o10 = t02.o();
        if (o10 > 0) {
            j0[] n10 = t02.n();
            int i10 = 0;
            do {
                n10[i10].b0().y1(j0.g.NotUsed);
                i10++;
            } while (i10 < o10);
        }
        v2(f1().d0().mo0measure3p2s80s(this, f1().E(), j10));
        n2();
        return this;
    }
}
