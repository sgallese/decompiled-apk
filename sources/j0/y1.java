package j0;

import java.util.List;

/* compiled from: RecomposeScopeImpl.kt */
/* loaded from: classes.dex */
public final class y1 implements g2, x1 {

    /* renamed from: h  reason: collision with root package name */
    public static final a f18925h = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private int f18926a;

    /* renamed from: b  reason: collision with root package name */
    private a2 f18927b;

    /* renamed from: c  reason: collision with root package name */
    private d f18928c;

    /* renamed from: d  reason: collision with root package name */
    private pc.p<? super l, ? super Integer, dc.w> f18929d;

    /* renamed from: e  reason: collision with root package name */
    private int f18930e;

    /* renamed from: f  reason: collision with root package name */
    private k0.a f18931f;

    /* renamed from: g  reason: collision with root package name */
    private k0.b<b0<?>, Object> f18932g;

    /* compiled from: RecomposeScopeImpl.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }

        public final void a(n2 n2Var, List<d> list, a2 a2Var) {
            y1 y1Var;
            qc.q.i(n2Var, "slots");
            qc.q.i(list, "anchors");
            qc.q.i(a2Var, "newOwner");
            if ((!list.isEmpty()) != false) {
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    Object R0 = n2Var.R0(list.get(i10), 0);
                    if (R0 instanceof y1) {
                        y1Var = (y1) R0;
                    } else {
                        y1Var = null;
                    }
                    if (y1Var != null) {
                        y1Var.g(a2Var);
                    }
                }
            }
        }

        public final boolean b(k2 k2Var, List<d> list) {
            boolean z10;
            boolean z11;
            qc.q.i(k2Var, "slots");
            qc.q.i(list, "anchors");
            if ((!list.isEmpty()) != false) {
                int size = list.size();
                int i10 = 0;
                while (true) {
                    if (i10 < size) {
                        d dVar = list.get(i10);
                        if (k2Var.u(dVar) && (k2Var.w(k2Var.e(dVar), 0) instanceof y1)) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z11) {
                            z10 = true;
                            break;
                        }
                        i10++;
                    } else {
                        z10 = false;
                        break;
                    }
                }
                if (z10) {
                    return true;
                }
            }
            return false;
        }
    }

    /* compiled from: RecomposeScopeImpl.kt */
    /* loaded from: classes.dex */
    static final class b extends qc.r implements pc.l<o, dc.w> {

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ int f18934m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ k0.a f18935p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i10, k0.a aVar) {
            super(1);
            this.f18934m = i10;
            this.f18935p = aVar;
        }

        public final void a(o oVar) {
            boolean z10;
            b0<?> b0Var;
            qc.q.i(oVar, "composition");
            if (y1.this.f18930e == this.f18934m && qc.q.d(this.f18935p, y1.this.f18931f) && (oVar instanceof r)) {
                k0.a aVar = this.f18935p;
                int i10 = this.f18934m;
                y1 y1Var = y1.this;
                Object[] e10 = aVar.e();
                int[] g10 = aVar.g();
                int f10 = aVar.f();
                int i11 = 0;
                for (int i12 = 0; i12 < f10; i12++) {
                    Object obj = e10[i12];
                    qc.q.g(obj, "null cannot be cast to non-null type kotlin.Any");
                    int i13 = g10[i12];
                    if (i13 != i10) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        r rVar = (r) oVar;
                        rVar.F(obj, y1Var);
                        if (obj instanceof b0) {
                            b0Var = (b0) obj;
                        } else {
                            b0Var = null;
                        }
                        if (b0Var != null) {
                            rVar.E(b0Var);
                            k0.b bVar = y1Var.f18932g;
                            if (bVar != null) {
                                bVar.k(b0Var);
                                if (bVar.h() == 0) {
                                    y1Var.f18932g = null;
                                }
                            }
                        }
                    }
                    if (!z10) {
                        if (i11 != i12) {
                            e10[i11] = obj;
                            g10[i11] = i13;
                        }
                        i11++;
                    }
                }
                for (int i14 = i11; i14 < f10; i14++) {
                    e10[i14] = null;
                }
                aVar.f19120a = i11;
                if (this.f18935p.f() == 0) {
                    y1.this.f18931f = null;
                }
            }
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ dc.w invoke(o oVar) {
            a(oVar);
            return dc.w.f13270a;
        }
    }

    public y1(a2 a2Var) {
        this.f18927b = a2Var;
    }

    private final void D(boolean z10) {
        if (z10) {
            this.f18926a |= 32;
        } else {
            this.f18926a &= -33;
        }
    }

    private final void E(boolean z10) {
        if (z10) {
            this.f18926a |= 16;
        } else {
            this.f18926a &= -17;
        }
    }

    private final boolean o() {
        if ((this.f18926a & 32) != 0) {
            return true;
        }
        return false;
    }

    public final void A(boolean z10) {
        if (z10) {
            this.f18926a |= 2;
        } else {
            this.f18926a &= -3;
        }
    }

    public final void B(boolean z10) {
        if (z10) {
            this.f18926a |= 4;
        } else {
            this.f18926a &= -5;
        }
    }

    public final void C(boolean z10) {
        if (z10) {
            this.f18926a |= 8;
        } else {
            this.f18926a &= -9;
        }
    }

    public final void F(boolean z10) {
        if (z10) {
            this.f18926a |= 1;
        } else {
            this.f18926a &= -2;
        }
    }

    public final void G(int i10) {
        this.f18930e = i10;
        E(false);
    }

    @Override // j0.g2
    public void a(pc.p<? super l, ? super Integer, dc.w> pVar) {
        qc.q.i(pVar, "block");
        this.f18929d = pVar;
    }

    public final void g(a2 a2Var) {
        qc.q.i(a2Var, "owner");
        this.f18927b = a2Var;
    }

    public final void h(l lVar) {
        dc.w wVar;
        qc.q.i(lVar, "composer");
        pc.p<? super l, ? super Integer, dc.w> pVar = this.f18929d;
        if (pVar != null) {
            pVar.invoke(lVar, 1);
            wVar = dc.w.f13270a;
        } else {
            wVar = null;
        }
        if (wVar != null) {
            return;
        }
        throw new IllegalStateException("Invalid restart scope".toString());
    }

    public final pc.l<o, dc.w> i(int i10) {
        boolean z10;
        k0.a aVar = this.f18931f;
        if (aVar == null || p()) {
            return null;
        }
        Object[] e10 = aVar.e();
        int[] g10 = aVar.g();
        int f10 = aVar.f();
        boolean z11 = false;
        int i11 = 0;
        while (true) {
            if (i11 >= f10) {
                break;
            }
            qc.q.g(e10[i11], "null cannot be cast to non-null type kotlin.Any");
            if (g10[i11] != i10) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                z11 = true;
                break;
            }
            i11++;
        }
        if (!z11) {
            return null;
        }
        return new b(i10, aVar);
    }

    @Override // j0.x1
    public void invalidate() {
        a2 a2Var = this.f18927b;
        if (a2Var != null) {
            a2Var.d(this, null);
        }
    }

    public final d j() {
        return this.f18928c;
    }

    public final boolean k() {
        if (this.f18929d != null) {
            return true;
        }
        return false;
    }

    public final boolean l() {
        if ((this.f18926a & 2) != 0) {
            return true;
        }
        return false;
    }

    public final boolean m() {
        if ((this.f18926a & 4) != 0) {
            return true;
        }
        return false;
    }

    public final boolean n() {
        if ((this.f18926a & 8) != 0) {
            return true;
        }
        return false;
    }

    public final boolean p() {
        if ((this.f18926a & 16) != 0) {
            return true;
        }
        return false;
    }

    public final boolean q() {
        if ((this.f18926a & 1) != 0) {
            return true;
        }
        return false;
    }

    public final boolean r() {
        boolean z10;
        if (this.f18927b == null) {
            return false;
        }
        d dVar = this.f18928c;
        if (dVar != null) {
            z10 = dVar.b();
        } else {
            z10 = false;
        }
        if (!z10) {
            return false;
        }
        return true;
    }

    public final p0 s(Object obj) {
        p0 d10;
        a2 a2Var = this.f18927b;
        if (a2Var == null || (d10 = a2Var.d(this, obj)) == null) {
            return p0.IGNORED;
        }
        return d10;
    }

    public final boolean t() {
        if (this.f18932g != null) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x004d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[LOOP:0: B:14:0x001c->B:34:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean u(k0.c<java.lang.Object> r7) {
        /*
            r6 = this;
            r0 = 1
            if (r7 != 0) goto L4
            return r0
        L4:
            k0.b<j0.b0<?>, java.lang.Object> r1 = r6.f18932g
            if (r1 != 0) goto L9
            return r0
        L9:
            boolean r2 = r7.k()
            if (r2 == 0) goto L51
            boolean r2 = r7.isEmpty()
            r3 = 0
            if (r2 == 0) goto L18
        L16:
            r7 = 1
            goto L4e
        L18:
            java.util.Iterator r7 = r7.iterator()
        L1c:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L16
            java.lang.Object r2 = r7.next()
            boolean r4 = r2 instanceof j0.b0
            if (r4 == 0) goto L4a
            j0.b0 r2 = (j0.b0) r2
            j0.x2 r4 = r2.c()
            if (r4 != 0) goto L36
            j0.x2 r4 = j0.y2.o()
        L36:
            j0.b0$a r5 = r2.q()
            java.lang.Object r5 = r5.a()
            java.lang.Object r2 = r1.f(r2)
            boolean r2 = r4.a(r5, r2)
            if (r2 == 0) goto L4a
            r2 = 1
            goto L4b
        L4a:
            r2 = 0
        L4b:
            if (r2 != 0) goto L1c
            r7 = 0
        L4e:
            if (r7 == 0) goto L51
            return r3
        L51:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.y1.u(k0.c):boolean");
    }

    public final boolean v(Object obj) {
        qc.q.i(obj, "instance");
        int i10 = 0;
        if (o()) {
            return false;
        }
        k0.a aVar = this.f18931f;
        if (aVar == null) {
            aVar = new k0.a();
            this.f18931f = aVar;
        }
        int i11 = 1;
        if (aVar.b(obj, this.f18930e) == this.f18930e) {
            return true;
        }
        if (obj instanceof b0) {
            k0.b<b0<?>, Object> bVar = this.f18932g;
            if (bVar == null) {
                bVar = new k0.b<>(i10, i11, null);
                this.f18932g = bVar;
            }
            bVar.l(obj, ((b0) obj).q().a());
        }
        return false;
    }

    public final void w() {
        a2 a2Var = this.f18927b;
        if (a2Var != null) {
            a2Var.c(this);
        }
        this.f18927b = null;
        this.f18931f = null;
        this.f18932g = null;
    }

    public final void x() {
        k0.a aVar;
        a2 a2Var = this.f18927b;
        if (a2Var != null && (aVar = this.f18931f) != null) {
            D(true);
            try {
                Object[] e10 = aVar.e();
                int[] g10 = aVar.g();
                int f10 = aVar.f();
                for (int i10 = 0; i10 < f10; i10++) {
                    Object obj = e10[i10];
                    qc.q.g(obj, "null cannot be cast to non-null type kotlin.Any");
                    int i11 = g10[i10];
                    a2Var.a(obj);
                }
            } finally {
                D(false);
            }
        }
    }

    public final void y() {
        E(true);
    }

    public final void z(d dVar) {
        this.f18928c = dVar;
    }
}
