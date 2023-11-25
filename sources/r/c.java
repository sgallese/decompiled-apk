package r;

import java.util.List;
import n1.y0;
import r.g;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AnimatedContent.kt */
/* loaded from: classes.dex */
public final class c implements n1.i0 {

    /* renamed from: a  reason: collision with root package name */
    private final g<?> f21848a;

    /* compiled from: AnimatedContent.kt */
    /* loaded from: classes.dex */
    static final class a extends qc.r implements pc.l<n1.m, Integer> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f21849f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i10) {
            super(1);
            this.f21849f = i10;
        }

        @Override // pc.l
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final Integer invoke(n1.m mVar) {
            qc.q.i(mVar, "it");
            return Integer.valueOf(mVar.g(this.f21849f));
        }
    }

    /* compiled from: AnimatedContent.kt */
    /* loaded from: classes.dex */
    static final class b extends qc.r implements pc.l<n1.m, Integer> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f21850f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i10) {
            super(1);
            this.f21850f = i10;
        }

        @Override // pc.l
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final Integer invoke(n1.m mVar) {
            qc.q.i(mVar, "it");
            return Integer.valueOf(mVar.t(this.f21850f));
        }
    }

    /* compiled from: AnimatedContent.kt */
    /* renamed from: r.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static final class C0489c extends qc.r implements pc.l<y0.a, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ y0[] f21851f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ c f21852m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ int f21853p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ int f21854q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0489c(y0[] y0VarArr, c cVar, int i10, int i11) {
            super(1);
            this.f21851f = y0VarArr;
            this.f21852m = cVar;
            this.f21853p = i10;
            this.f21854q = i11;
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ dc.w invoke(y0.a aVar) {
            invoke2(aVar);
            return dc.w.f13270a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(y0.a aVar) {
            qc.q.i(aVar, "$this$layout");
            y0[] y0VarArr = this.f21851f;
            c cVar = this.f21852m;
            int i10 = this.f21853p;
            int i11 = this.f21854q;
            for (y0 y0Var : y0VarArr) {
                if (y0Var != null) {
                    long a10 = cVar.a().g().a(j2.q.a(y0Var.A0(), y0Var.l0()), j2.q.a(i10, i11), j2.r.Ltr);
                    y0.a.n(aVar, y0Var, j2.l.j(a10), j2.l.k(a10), 0.0f, 4, null);
                }
            }
        }
    }

    /* compiled from: AnimatedContent.kt */
    /* loaded from: classes.dex */
    static final class d extends qc.r implements pc.l<n1.m, Integer> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f21855f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(int i10) {
            super(1);
            this.f21855f = i10;
        }

        @Override // pc.l
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final Integer invoke(n1.m mVar) {
            qc.q.i(mVar, "it");
            return Integer.valueOf(mVar.a0(this.f21855f));
        }
    }

    /* compiled from: AnimatedContent.kt */
    /* loaded from: classes.dex */
    static final class e extends qc.r implements pc.l<n1.m, Integer> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f21856f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(int i10) {
            super(1);
            this.f21856f = i10;
        }

        @Override // pc.l
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final Integer invoke(n1.m mVar) {
            qc.q.i(mVar, "it");
            return Integer.valueOf(mVar.s(this.f21856f));
        }
    }

    public c(g<?> gVar) {
        qc.q.i(gVar, "rootScope");
        this.f21848a = gVar;
    }

    public final g<?> a() {
        return this.f21848a;
    }

    @Override // n1.i0
    public int maxIntrinsicHeight(n1.n nVar, List<? extends n1.m> list, int i10) {
        xc.g R;
        xc.g w10;
        Comparable y10;
        qc.q.i(nVar, "<this>");
        qc.q.i(list, "measurables");
        R = ec.b0.R(list);
        w10 = xc.o.w(R, new a(i10));
        y10 = xc.o.y(w10);
        Integer num = (Integer) y10;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @Override // n1.i0
    public int maxIntrinsicWidth(n1.n nVar, List<? extends n1.m> list, int i10) {
        xc.g R;
        xc.g w10;
        Comparable y10;
        qc.q.i(nVar, "<this>");
        qc.q.i(list, "measurables");
        R = ec.b0.R(list);
        w10 = xc.o.w(R, new b(i10));
        y10 = xc.o.y(w10);
        Integer num = (Integer) y10;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @Override // n1.i0
    /* renamed from: measure-3p2s80s */
    public n1.j0 mo0measure3p2s80s(n1.l0 l0Var, List<? extends n1.g0> list, long j10) {
        y0 y0Var;
        boolean z10;
        y0 y0Var2;
        int P;
        int i10;
        int i11;
        int i12;
        boolean z11;
        int i13;
        int P2;
        int i14;
        int i15;
        qc.q.i(l0Var, "$this$measure");
        qc.q.i(list, "measurables");
        int size = list.size();
        y0[] y0VarArr = new y0[size];
        int size2 = list.size();
        int i16 = 0;
        while (true) {
            y0Var = null;
            g.a aVar = null;
            boolean z12 = true;
            if (i16 >= size2) {
                break;
            }
            n1.g0 g0Var = list.get(i16);
            Object A = g0Var.A();
            if (A instanceof g.a) {
                aVar = (g.a) A;
            }
            if (aVar == null || !aVar.e()) {
                z12 = false;
            }
            if (z12) {
                y0VarArr[i16] = g0Var.w(j10);
            }
            i16++;
        }
        int size3 = list.size();
        for (int i17 = 0; i17 < size3; i17++) {
            n1.g0 g0Var2 = list.get(i17);
            if (y0VarArr[i17] == null) {
                y0VarArr[i17] = g0Var2.w(j10);
            }
        }
        if (size == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            y0Var2 = null;
        } else {
            y0Var2 = y0VarArr[0];
            P = ec.p.P(y0VarArr);
            if (P != 0) {
                if (y0Var2 != null) {
                    i10 = y0Var2.A0();
                } else {
                    i10 = 0;
                }
                ec.h0 it = new vc.f(1, P).iterator();
                while (it.hasNext()) {
                    y0 y0Var3 = y0VarArr[it.a()];
                    if (y0Var3 != null) {
                        i11 = y0Var3.A0();
                    } else {
                        i11 = 0;
                    }
                    if (i10 < i11) {
                        y0Var2 = y0Var3;
                        i10 = i11;
                    }
                }
            }
        }
        if (y0Var2 != null) {
            i12 = y0Var2.A0();
        } else {
            i12 = 0;
        }
        if (size == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            y0Var = y0VarArr[0];
            P2 = ec.p.P(y0VarArr);
            if (P2 != 0) {
                if (y0Var != null) {
                    i14 = y0Var.l0();
                } else {
                    i14 = 0;
                }
                ec.h0 it2 = new vc.f(1, P2).iterator();
                while (it2.hasNext()) {
                    y0 y0Var4 = y0VarArr[it2.a()];
                    if (y0Var4 != null) {
                        i15 = y0Var4.l0();
                    } else {
                        i15 = 0;
                    }
                    if (i14 < i15) {
                        y0Var = y0Var4;
                        i14 = i15;
                    }
                }
            }
        }
        if (y0Var != null) {
            i13 = y0Var.l0();
        } else {
            i13 = 0;
        }
        this.f21848a.l(j2.q.a(i12, i13));
        return n1.k0.b(l0Var, i12, i13, null, new C0489c(y0VarArr, this, i12, i13), 4, null);
    }

    @Override // n1.i0
    public int minIntrinsicHeight(n1.n nVar, List<? extends n1.m> list, int i10) {
        xc.g R;
        xc.g w10;
        Comparable y10;
        qc.q.i(nVar, "<this>");
        qc.q.i(list, "measurables");
        R = ec.b0.R(list);
        w10 = xc.o.w(R, new d(i10));
        y10 = xc.o.y(w10);
        Integer num = (Integer) y10;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @Override // n1.i0
    public int minIntrinsicWidth(n1.n nVar, List<? extends n1.m> list, int i10) {
        xc.g R;
        xc.g w10;
        Comparable y10;
        qc.q.i(nVar, "<this>");
        qc.q.i(list, "measurables");
        R = ec.b0.R(list);
        w10 = xc.o.w(R, new e(i10));
        y10 = xc.o.y(w10);
        Integer num = (Integer) y10;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }
}
