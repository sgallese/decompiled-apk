package w;

import java.util.List;
import n1.g0;
import n1.i0;
import n1.j0;
import n1.k0;
import n1.l0;
import n1.y0;

/* compiled from: RowColumnImpl.kt */
/* loaded from: classes.dex */
public final class u {

    /* compiled from: RowColumnImpl.kt */
    /* loaded from: classes.dex */
    public static final class a implements i0 {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p f25223a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ pc.s<Integer, int[], j2.r, j2.e, int[], dc.w> f25224b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ float f25225c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ c0 f25226d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ l f25227e;

        /* compiled from: RowColumnImpl.kt */
        /* renamed from: w.u$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        static final class C0580a extends qc.r implements pc.l<y0.a, dc.w> {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ w f25228f;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ v f25229m;

            /* renamed from: p  reason: collision with root package name */
            final /* synthetic */ l0 f25230p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0580a(w wVar, v vVar, l0 l0Var) {
                super(1);
                this.f25228f = wVar;
                this.f25229m = vVar;
                this.f25230p = l0Var;
            }

            @Override // pc.l
            public /* bridge */ /* synthetic */ dc.w invoke(y0.a aVar) {
                invoke2(aVar);
                return dc.w.f13270a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(y0.a aVar) {
                qc.q.i(aVar, "$this$layout");
                this.f25228f.f(aVar, this.f25229m, 0, this.f25230p.getLayoutDirection());
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        a(p pVar, pc.s<? super Integer, ? super int[], ? super j2.r, ? super j2.e, ? super int[], dc.w> sVar, float f10, c0 c0Var, l lVar) {
            this.f25223a = pVar;
            this.f25224b = sVar;
            this.f25225c = f10;
            this.f25226d = c0Var;
            this.f25227e = lVar;
        }

        @Override // n1.i0
        public int maxIntrinsicHeight(n1.n nVar, List<? extends n1.m> list, int i10) {
            qc.q.i(nVar, "<this>");
            qc.q.i(list, "measurables");
            return ((Number) u.a(this.f25223a).invoke(list, Integer.valueOf(i10), Integer.valueOf(nVar.K0(this.f25225c)))).intValue();
        }

        @Override // n1.i0
        public int maxIntrinsicWidth(n1.n nVar, List<? extends n1.m> list, int i10) {
            qc.q.i(nVar, "<this>");
            qc.q.i(list, "measurables");
            return ((Number) u.b(this.f25223a).invoke(list, Integer.valueOf(i10), Integer.valueOf(nVar.K0(this.f25225c)))).intValue();
        }

        @Override // n1.i0
        /* renamed from: measure-3p2s80s */
        public j0 mo0measure3p2s80s(l0 l0Var, List<? extends g0> list, long j10) {
            int b10;
            int e10;
            qc.q.i(l0Var, "$this$measure");
            qc.q.i(list, "measurables");
            w wVar = new w(this.f25223a, this.f25224b, this.f25225c, this.f25226d, this.f25227e, list, new y0[list.size()], null);
            v e11 = wVar.e(l0Var, j10, 0, list.size());
            if (this.f25223a == p.Horizontal) {
                b10 = e11.e();
                e10 = e11.b();
            } else {
                b10 = e11.b();
                e10 = e11.e();
            }
            return k0.b(l0Var, b10, e10, null, new C0580a(wVar, e11, l0Var), 4, null);
        }

        @Override // n1.i0
        public int minIntrinsicHeight(n1.n nVar, List<? extends n1.m> list, int i10) {
            qc.q.i(nVar, "<this>");
            qc.q.i(list, "measurables");
            return ((Number) u.c(this.f25223a).invoke(list, Integer.valueOf(i10), Integer.valueOf(nVar.K0(this.f25225c)))).intValue();
        }

        @Override // n1.i0
        public int minIntrinsicWidth(n1.n nVar, List<? extends n1.m> list, int i10) {
            qc.q.i(nVar, "<this>");
            qc.q.i(list, "measurables");
            return ((Number) u.d(this.f25223a).invoke(list, Integer.valueOf(i10), Integer.valueOf(nVar.K0(this.f25225c)))).intValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final pc.q<List<? extends n1.m>, Integer, Integer, Integer> a(p pVar) {
        if (pVar == p.Horizontal) {
            return o.f25186a.a();
        }
        return o.f25186a.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final pc.q<List<? extends n1.m>, Integer, Integer, Integer> b(p pVar) {
        if (pVar == p.Horizontal) {
            return o.f25186a.b();
        }
        return o.f25186a.f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final pc.q<List<? extends n1.m>, Integer, Integer, Integer> c(p pVar) {
        if (pVar == p.Horizontal) {
            return o.f25186a.c();
        }
        return o.f25186a.g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final pc.q<List<? extends n1.m>, Integer, Integer, Integer> d(p pVar) {
        if (pVar == p.Horizontal) {
            return o.f25186a.d();
        }
        return o.f25186a.h();
    }

    public static final l j(x xVar) {
        if (xVar != null) {
            return xVar.a();
        }
        return null;
    }

    public static final boolean k(x xVar) {
        if (xVar != null) {
            return xVar.b();
        }
        return true;
    }

    public static final x l(n1.m mVar) {
        qc.q.i(mVar, "<this>");
        Object A = mVar.A();
        if (A instanceof x) {
            return (x) A;
        }
        return null;
    }

    public static final float m(x xVar) {
        if (xVar != null) {
            return xVar.c();
        }
        return 0.0f;
    }

    private static final int n(List<? extends n1.m> list, pc.p<? super n1.m, ? super Integer, Integer> pVar, pc.p<? super n1.m, ? super Integer, Integer> pVar2, int i10, int i11) {
        int d10;
        int i12;
        boolean z10;
        boolean z11 = true;
        int min = Math.min((list.size() - 1) * i11, i10);
        int size = list.size();
        float f10 = 0.0f;
        int i13 = 0;
        for (int i14 = 0; i14 < size; i14++) {
            n1.m mVar = list.get(i14);
            float m10 = m(l(mVar));
            if (m10 == 0.0f) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                int min2 = Math.min(pVar.invoke(mVar, Integer.MAX_VALUE).intValue(), i10 - min);
                min += min2;
                i13 = Math.max(i13, pVar2.invoke(mVar, Integer.valueOf(min2)).intValue());
            } else if (m10 > 0.0f) {
                f10 += m10;
            }
        }
        if (f10 != 0.0f) {
            z11 = false;
        }
        if (z11) {
            d10 = 0;
        } else if (i10 != Integer.MAX_VALUE) {
            d10 = sc.c.d(Math.max(i10 - min, 0) / f10);
        } else {
            d10 = Integer.MAX_VALUE;
        }
        int size2 = list.size();
        for (int i15 = 0; i15 < size2; i15++) {
            n1.m mVar2 = list.get(i15);
            float m11 = m(l(mVar2));
            if (m11 > 0.0f) {
                if (d10 != Integer.MAX_VALUE) {
                    i12 = sc.c.d(d10 * m11);
                } else {
                    i12 = Integer.MAX_VALUE;
                }
                i13 = Math.max(i13, pVar2.invoke(mVar2, Integer.valueOf(i12)).intValue());
            }
        }
        return i13;
    }

    private static final int o(List<? extends n1.m> list, pc.p<? super n1.m, ? super Integer, Integer> pVar, int i10, int i11) {
        int d10;
        int d11;
        int size = list.size();
        int i12 = 0;
        int i13 = 0;
        float f10 = 0.0f;
        int i14 = 0;
        while (true) {
            boolean z10 = true;
            if (i12 >= size) {
                d10 = sc.c.d(i13 * f10);
                return d10 + i14 + ((list.size() - 1) * i11);
            }
            n1.m mVar = list.get(i12);
            float m10 = m(l(mVar));
            int intValue = pVar.invoke(mVar, Integer.valueOf(i10)).intValue();
            if (m10 != 0.0f) {
                z10 = false;
            }
            if (z10) {
                i14 += intValue;
            } else if (m10 > 0.0f) {
                f10 += m10;
                d11 = sc.c.d(intValue / m10);
                i13 = Math.max(i13, d11);
            }
            i12++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int p(List<? extends n1.m> list, pc.p<? super n1.m, ? super Integer, Integer> pVar, pc.p<? super n1.m, ? super Integer, Integer> pVar2, int i10, int i11, p pVar3, p pVar4) {
        if (pVar3 == pVar4) {
            return o(list, pVar, i10, i11);
        }
        return n(list, pVar2, pVar, i10, i11);
    }

    public static final boolean q(x xVar) {
        l j10 = j(xVar);
        if (j10 != null) {
            return j10.c();
        }
        return false;
    }

    public static final i0 r(p pVar, pc.s<? super Integer, ? super int[], ? super j2.r, ? super j2.e, ? super int[], dc.w> sVar, float f10, c0 c0Var, l lVar) {
        qc.q.i(pVar, "orientation");
        qc.q.i(sVar, "arrangement");
        qc.q.i(c0Var, "crossAxisSize");
        qc.q.i(lVar, "crossAxisAlignment");
        return new a(pVar, sVar, f10, c0Var, lVar);
    }
}
