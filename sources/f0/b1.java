package f0;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import n1.y0;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: OutlinedTextField.kt */
/* loaded from: classes.dex */
public final class b1 implements n1.i0 {

    /* renamed from: a  reason: collision with root package name */
    private final pc.l<z0.l, dc.w> f14405a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f14406b;

    /* renamed from: c  reason: collision with root package name */
    private final float f14407c;

    /* renamed from: d  reason: collision with root package name */
    private final w.s f14408d;

    /* compiled from: OutlinedTextField.kt */
    /* loaded from: classes.dex */
    static final class a extends qc.r implements pc.p<n1.m, Integer, Integer> {

        /* renamed from: f  reason: collision with root package name */
        public static final a f14409f = new a();

        a() {
            super(2);
        }

        public final Integer a(n1.m mVar, int i10) {
            qc.q.i(mVar, "intrinsicMeasurable");
            return Integer.valueOf(mVar.g(i10));
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ Integer invoke(n1.m mVar, Integer num) {
            return a(mVar, num.intValue());
        }
    }

    /* compiled from: OutlinedTextField.kt */
    /* loaded from: classes.dex */
    static final class b extends qc.r implements pc.p<n1.m, Integer, Integer> {

        /* renamed from: f  reason: collision with root package name */
        public static final b f14410f = new b();

        b() {
            super(2);
        }

        public final Integer a(n1.m mVar, int i10) {
            qc.q.i(mVar, "intrinsicMeasurable");
            return Integer.valueOf(mVar.t(i10));
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ Integer invoke(n1.m mVar, Integer num) {
            return a(mVar, num.intValue());
        }
    }

    /* compiled from: OutlinedTextField.kt */
    /* loaded from: classes.dex */
    static final class c extends qc.r implements pc.l<y0.a, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f14411f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ int f14412m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ n1.y0 f14413p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ n1.y0 f14414q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ n1.y0 f14415r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ n1.y0 f14416s;

        /* renamed from: t  reason: collision with root package name */
        final /* synthetic */ n1.y0 f14417t;

        /* renamed from: u  reason: collision with root package name */
        final /* synthetic */ n1.y0 f14418u;

        /* renamed from: v  reason: collision with root package name */
        final /* synthetic */ b1 f14419v;

        /* renamed from: w  reason: collision with root package name */
        final /* synthetic */ n1.l0 f14420w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(int i10, int i11, n1.y0 y0Var, n1.y0 y0Var2, n1.y0 y0Var3, n1.y0 y0Var4, n1.y0 y0Var5, n1.y0 y0Var6, b1 b1Var, n1.l0 l0Var) {
            super(1);
            this.f14411f = i10;
            this.f14412m = i11;
            this.f14413p = y0Var;
            this.f14414q = y0Var2;
            this.f14415r = y0Var3;
            this.f14416s = y0Var4;
            this.f14417t = y0Var5;
            this.f14418u = y0Var6;
            this.f14419v = b1Var;
            this.f14420w = l0Var;
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ dc.w invoke(y0.a aVar) {
            invoke2(aVar);
            return dc.w.f13270a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(y0.a aVar) {
            qc.q.i(aVar, "$this$layout");
            a1.i(aVar, this.f14411f, this.f14412m, this.f14413p, this.f14414q, this.f14415r, this.f14416s, this.f14417t, this.f14418u, this.f14419v.f14407c, this.f14419v.f14406b, this.f14420w.getDensity(), this.f14420w.getLayoutDirection(), this.f14419v.f14408d);
        }
    }

    /* compiled from: OutlinedTextField.kt */
    /* loaded from: classes.dex */
    static final class d extends qc.r implements pc.p<n1.m, Integer, Integer> {

        /* renamed from: f  reason: collision with root package name */
        public static final d f14421f = new d();

        d() {
            super(2);
        }

        public final Integer a(n1.m mVar, int i10) {
            qc.q.i(mVar, "intrinsicMeasurable");
            return Integer.valueOf(mVar.a0(i10));
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ Integer invoke(n1.m mVar, Integer num) {
            return a(mVar, num.intValue());
        }
    }

    /* compiled from: OutlinedTextField.kt */
    /* loaded from: classes.dex */
    static final class e extends qc.r implements pc.p<n1.m, Integer, Integer> {

        /* renamed from: f  reason: collision with root package name */
        public static final e f14422f = new e();

        e() {
            super(2);
        }

        public final Integer a(n1.m mVar, int i10) {
            qc.q.i(mVar, "intrinsicMeasurable");
            return Integer.valueOf(mVar.s(i10));
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ Integer invoke(n1.m mVar, Integer num) {
            return a(mVar, num.intValue());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b1(pc.l<? super z0.l, dc.w> lVar, boolean z10, float f10, w.s sVar) {
        qc.q.i(lVar, "onLabelMeasured");
        qc.q.i(sVar, "paddingValues");
        this.f14405a = lVar;
        this.f14406b = z10;
        this.f14407c = f10;
        this.f14408d = sVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final int d(n1.n nVar, List<? extends n1.m> list, int i10, pc.p<? super n1.m, ? super Integer, Integer> pVar) {
        Object obj;
        Object obj2;
        int i11;
        Object obj3;
        int i12;
        Object obj4;
        int i13;
        int i14;
        int f10;
        List<? extends n1.m> list2 = list;
        for (Object obj5 : list2) {
            if (qc.q.d(a2.e((n1.m) obj5), "TextField")) {
                int intValue = pVar.invoke(obj5, Integer.valueOf(i10)).intValue();
                Iterator<T> it = list2.iterator();
                while (true) {
                    obj = null;
                    if (it.hasNext()) {
                        obj2 = it.next();
                        if (qc.q.d(a2.e((n1.m) obj2), "Label")) {
                            break;
                        }
                    } else {
                        obj2 = null;
                        break;
                    }
                }
                n1.m mVar = (n1.m) obj2;
                if (mVar != null) {
                    i11 = pVar.invoke(mVar, Integer.valueOf(i10)).intValue();
                } else {
                    i11 = 0;
                }
                Iterator<T> it2 = list2.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        obj3 = it2.next();
                        if (qc.q.d(a2.e((n1.m) obj3), "Trailing")) {
                            break;
                        }
                    } else {
                        obj3 = null;
                        break;
                    }
                }
                n1.m mVar2 = (n1.m) obj3;
                if (mVar2 != null) {
                    i12 = pVar.invoke(mVar2, Integer.valueOf(i10)).intValue();
                } else {
                    i12 = 0;
                }
                Iterator<T> it3 = list2.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        obj4 = it3.next();
                        if (qc.q.d(a2.e((n1.m) obj4), "Leading")) {
                            break;
                        }
                    } else {
                        obj4 = null;
                        break;
                    }
                }
                n1.m mVar3 = (n1.m) obj4;
                if (mVar3 != null) {
                    i13 = pVar.invoke(mVar3, Integer.valueOf(i10)).intValue();
                } else {
                    i13 = 0;
                }
                Iterator<T> it4 = list2.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        break;
                    }
                    Object next = it4.next();
                    if (qc.q.d(a2.e((n1.m) next), "Hint")) {
                        obj = next;
                        break;
                    }
                }
                n1.m mVar4 = (n1.m) obj;
                if (mVar4 != null) {
                    i14 = pVar.invoke(mVar4, Integer.valueOf(i10)).intValue();
                } else {
                    i14 = 0;
                }
                f10 = a1.f(i13, i12, intValue, i11, i14, this.f14407c, a2.g(), nVar.getDensity(), this.f14408d);
                return f10;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final int e(n1.n nVar, List<? extends n1.m> list, int i10, pc.p<? super n1.m, ? super Integer, Integer> pVar) {
        Object obj;
        Object obj2;
        int i11;
        Object obj3;
        int i12;
        Object obj4;
        int i13;
        int i14;
        int g10;
        List<? extends n1.m> list2 = list;
        for (Object obj5 : list2) {
            if (qc.q.d(a2.e((n1.m) obj5), "TextField")) {
                int intValue = pVar.invoke(obj5, Integer.valueOf(i10)).intValue();
                Iterator<T> it = list2.iterator();
                while (true) {
                    obj = null;
                    if (it.hasNext()) {
                        obj2 = it.next();
                        if (qc.q.d(a2.e((n1.m) obj2), "Label")) {
                            break;
                        }
                    } else {
                        obj2 = null;
                        break;
                    }
                }
                n1.m mVar = (n1.m) obj2;
                if (mVar != null) {
                    i11 = pVar.invoke(mVar, Integer.valueOf(i10)).intValue();
                } else {
                    i11 = 0;
                }
                Iterator<T> it2 = list2.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        obj3 = it2.next();
                        if (qc.q.d(a2.e((n1.m) obj3), "Trailing")) {
                            break;
                        }
                    } else {
                        obj3 = null;
                        break;
                    }
                }
                n1.m mVar2 = (n1.m) obj3;
                if (mVar2 != null) {
                    i12 = pVar.invoke(mVar2, Integer.valueOf(i10)).intValue();
                } else {
                    i12 = 0;
                }
                Iterator<T> it3 = list2.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        obj4 = it3.next();
                        if (qc.q.d(a2.e((n1.m) obj4), "Leading")) {
                            break;
                        }
                    } else {
                        obj4 = null;
                        break;
                    }
                }
                n1.m mVar3 = (n1.m) obj4;
                if (mVar3 != null) {
                    i13 = pVar.invoke(mVar3, Integer.valueOf(i10)).intValue();
                } else {
                    i13 = 0;
                }
                Iterator<T> it4 = list2.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        break;
                    }
                    Object next = it4.next();
                    if (qc.q.d(a2.e((n1.m) next), "Hint")) {
                        obj = next;
                        break;
                    }
                }
                n1.m mVar4 = (n1.m) obj;
                if (mVar4 != null) {
                    i14 = pVar.invoke(mVar4, Integer.valueOf(i10)).intValue();
                } else {
                    i14 = 0;
                }
                g10 = a1.g(i13, i12, intValue, i11, i14, this.f14407c, a2.g(), nVar.getDensity(), this.f14408d);
                return g10;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // n1.i0
    public int maxIntrinsicHeight(n1.n nVar, List<? extends n1.m> list, int i10) {
        qc.q.i(nVar, "<this>");
        qc.q.i(list, "measurables");
        return d(nVar, list, i10, a.f14409f);
    }

    @Override // n1.i0
    public int maxIntrinsicWidth(n1.n nVar, List<? extends n1.m> list, int i10) {
        qc.q.i(nVar, "<this>");
        qc.q.i(list, "measurables");
        return e(nVar, list, i10, b.f14410f);
    }

    @Override // n1.i0
    /* renamed from: measure-3p2s80s */
    public n1.j0 mo0measure3p2s80s(n1.l0 l0Var, List<? extends n1.g0> list, long j10) {
        Object obj;
        n1.y0 y0Var;
        Object obj2;
        n1.y0 y0Var2;
        Object obj3;
        n1.y0 y0Var3;
        Object obj4;
        n1.y0 y0Var4;
        int g10;
        int f10;
        int i10;
        int i11;
        qc.q.i(l0Var, "$this$measure");
        qc.q.i(list, "measurables");
        int K0 = l0Var.K0(this.f14408d.a());
        long e10 = j2.b.e(j10, 0, 0, 0, 0, 10, null);
        List<? extends n1.g0> list2 = list;
        Iterator<T> it = list2.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (qc.q.d(androidx.compose.ui.layout.a.a((n1.g0) obj), "Leading")) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        n1.g0 g0Var = (n1.g0) obj;
        if (g0Var != null) {
            y0Var = g0Var.w(e10);
        } else {
            y0Var = null;
        }
        int i12 = a2.i(y0Var) + 0;
        Iterator<T> it2 = list2.iterator();
        while (true) {
            if (it2.hasNext()) {
                obj2 = it2.next();
                if (qc.q.d(androidx.compose.ui.layout.a.a((n1.g0) obj2), "Trailing")) {
                    break;
                }
            } else {
                obj2 = null;
                break;
            }
        }
        n1.g0 g0Var2 = (n1.g0) obj2;
        if (g0Var2 != null) {
            y0Var2 = g0Var2.w(j2.c.i(e10, -i12, 0, 2, null));
        } else {
            y0Var2 = null;
        }
        int i13 = i12 + a2.i(y0Var2);
        int K02 = l0Var.K0(this.f14408d.c(l0Var.getLayoutDirection())) + l0Var.K0(this.f14408d.b(l0Var.getLayoutDirection()));
        int i14 = -i13;
        int i15 = -K0;
        long h10 = j2.c.h(e10, k2.a.b(i14 - K02, -K02, this.f14407c), i15);
        Iterator<T> it3 = list2.iterator();
        while (true) {
            if (it3.hasNext()) {
                obj3 = it3.next();
                if (qc.q.d(androidx.compose.ui.layout.a.a((n1.g0) obj3), "Label")) {
                    break;
                }
            } else {
                obj3 = null;
                break;
            }
        }
        n1.g0 g0Var3 = (n1.g0) obj3;
        if (g0Var3 != null) {
            y0Var3 = g0Var3.w(h10);
        } else {
            y0Var3 = null;
        }
        if (y0Var3 != null) {
            this.f14405a.invoke(z0.l.c(z0.m.a(y0Var3.A0(), y0Var3.l0())));
        }
        long e11 = j2.b.e(j2.c.h(j10, i14, i15 - Math.max(a2.h(y0Var3) / 2, l0Var.K0(this.f14408d.d()))), 0, 0, 0, 0, 11, null);
        for (n1.g0 g0Var4 : list2) {
            if (qc.q.d(androidx.compose.ui.layout.a.a(g0Var4), "TextField")) {
                n1.y0 w10 = g0Var4.w(e11);
                long e12 = j2.b.e(e11, 0, 0, 0, 0, 14, null);
                Iterator<T> it4 = list2.iterator();
                while (true) {
                    if (it4.hasNext()) {
                        obj4 = it4.next();
                        if (qc.q.d(androidx.compose.ui.layout.a.a((n1.g0) obj4), "Hint")) {
                            break;
                        }
                    } else {
                        obj4 = null;
                        break;
                    }
                }
                n1.g0 g0Var5 = (n1.g0) obj4;
                if (g0Var5 != null) {
                    y0Var4 = g0Var5.w(e12);
                } else {
                    y0Var4 = null;
                }
                g10 = a1.g(a2.i(y0Var), a2.i(y0Var2), w10.A0(), a2.i(y0Var3), a2.i(y0Var4), this.f14407c, j10, l0Var.getDensity(), this.f14408d);
                f10 = a1.f(a2.h(y0Var), a2.h(y0Var2), w10.l0(), a2.h(y0Var3), a2.h(y0Var4), this.f14407c, j10, l0Var.getDensity(), this.f14408d);
                for (n1.g0 g0Var6 : list2) {
                    if (qc.q.d(androidx.compose.ui.layout.a.a(g0Var6), "border")) {
                        if (g10 != Integer.MAX_VALUE) {
                            i10 = g10;
                        } else {
                            i10 = 0;
                        }
                        if (f10 != Integer.MAX_VALUE) {
                            i11 = f10;
                        } else {
                            i11 = 0;
                        }
                        return n1.k0.b(l0Var, g10, f10, null, new c(f10, g10, y0Var, y0Var2, w10, y0Var3, y0Var4, g0Var6.w(j2.c.a(i10, g10, i11, f10)), this, l0Var), 4, null);
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // n1.i0
    public int minIntrinsicHeight(n1.n nVar, List<? extends n1.m> list, int i10) {
        qc.q.i(nVar, "<this>");
        qc.q.i(list, "measurables");
        return d(nVar, list, i10, d.f14421f);
    }

    @Override // n1.i0
    public int minIntrinsicWidth(n1.n nVar, List<? extends n1.m> list, int i10) {
        qc.q.i(nVar, "<this>");
        qc.q.i(list, "measurables");
        return e(nVar, list, i10, e.f14422f);
    }
}
