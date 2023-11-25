package f0;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import n1.y0;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TextField.kt */
/* loaded from: classes.dex */
public final class c2 implements n1.i0 {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f14470a;

    /* renamed from: b  reason: collision with root package name */
    private final float f14471b;

    /* renamed from: c  reason: collision with root package name */
    private final w.s f14472c;

    /* compiled from: TextField.kt */
    /* loaded from: classes.dex */
    static final class a extends qc.r implements pc.p<n1.m, Integer, Integer> {

        /* renamed from: f  reason: collision with root package name */
        public static final a f14473f = new a();

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

    /* compiled from: TextField.kt */
    /* loaded from: classes.dex */
    static final class b extends qc.r implements pc.p<n1.m, Integer, Integer> {

        /* renamed from: f  reason: collision with root package name */
        public static final b f14474f = new b();

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

    /* compiled from: TextField.kt */
    /* loaded from: classes.dex */
    static final class c extends qc.r implements pc.l<y0.a, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ n1.y0 f14475f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ int f14476m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ int f14477p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ int f14478q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ int f14479r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ n1.y0 f14480s;

        /* renamed from: t  reason: collision with root package name */
        final /* synthetic */ n1.y0 f14481t;

        /* renamed from: u  reason: collision with root package name */
        final /* synthetic */ n1.y0 f14482u;

        /* renamed from: v  reason: collision with root package name */
        final /* synthetic */ n1.y0 f14483v;

        /* renamed from: w  reason: collision with root package name */
        final /* synthetic */ c2 f14484w;

        /* renamed from: x  reason: collision with root package name */
        final /* synthetic */ int f14485x;

        /* renamed from: y  reason: collision with root package name */
        final /* synthetic */ int f14486y;

        /* renamed from: z  reason: collision with root package name */
        final /* synthetic */ n1.l0 f14487z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(n1.y0 y0Var, int i10, int i11, int i12, int i13, n1.y0 y0Var2, n1.y0 y0Var3, n1.y0 y0Var4, n1.y0 y0Var5, c2 c2Var, int i14, int i15, n1.l0 l0Var) {
            super(1);
            this.f14475f = y0Var;
            this.f14476m = i10;
            this.f14477p = i11;
            this.f14478q = i12;
            this.f14479r = i13;
            this.f14480s = y0Var2;
            this.f14481t = y0Var3;
            this.f14482u = y0Var4;
            this.f14483v = y0Var5;
            this.f14484w = c2Var;
            this.f14485x = i14;
            this.f14486y = i15;
            this.f14487z = l0Var;
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ dc.w invoke(y0.a aVar) {
            invoke2(aVar);
            return dc.w.f13270a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(y0.a aVar) {
            int d10;
            qc.q.i(aVar, "$this$layout");
            if (this.f14475f != null) {
                d10 = vc.l.d(this.f14476m - this.f14477p, 0);
                b2.m(aVar, this.f14478q, this.f14479r, this.f14480s, this.f14475f, this.f14481t, this.f14482u, this.f14483v, this.f14484w.f14470a, d10, this.f14486y + this.f14485x, this.f14484w.f14471b, this.f14487z.getDensity());
                return;
            }
            b2.n(aVar, this.f14478q, this.f14479r, this.f14480s, this.f14481t, this.f14482u, this.f14483v, this.f14484w.f14470a, this.f14487z.getDensity(), this.f14484w.f14472c);
        }
    }

    /* compiled from: TextField.kt */
    /* loaded from: classes.dex */
    static final class d extends qc.r implements pc.p<n1.m, Integer, Integer> {

        /* renamed from: f  reason: collision with root package name */
        public static final d f14488f = new d();

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

    /* compiled from: TextField.kt */
    /* loaded from: classes.dex */
    static final class e extends qc.r implements pc.p<n1.m, Integer, Integer> {

        /* renamed from: f  reason: collision with root package name */
        public static final e f14489f = new e();

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

    public c2(boolean z10, float f10, w.s sVar) {
        qc.q.i(sVar, "paddingValues");
        this.f14470a = z10;
        this.f14471b = f10;
        this.f14472c = sVar;
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
        boolean z10;
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
                if (i11 > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                g10 = b2.g(intValue, z10, i11, i13, i12, i14, a2.g(), nVar.getDensity(), this.f14472c);
                return g10;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final int e(List<? extends n1.m> list, int i10, pc.p<? super n1.m, ? super Integer, Integer> pVar) {
        Object obj;
        Object obj2;
        int i11;
        Object obj3;
        int i12;
        Object obj4;
        int i13;
        int i14;
        int h10;
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
                h10 = b2.h(i13, i12, intValue, i11, i14, a2.g());
                return h10;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // n1.i0
    public int maxIntrinsicHeight(n1.n nVar, List<? extends n1.m> list, int i10) {
        qc.q.i(nVar, "<this>");
        qc.q.i(list, "measurables");
        return d(nVar, list, i10, a.f14473f);
    }

    @Override // n1.i0
    public int maxIntrinsicWidth(n1.n nVar, List<? extends n1.m> list, int i10) {
        qc.q.i(nVar, "<this>");
        qc.q.i(list, "measurables");
        return e(list, i10, b.f14474f);
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
        int i10;
        int i11;
        Object obj4;
        n1.y0 y0Var4;
        int h10;
        boolean z10;
        int g10;
        qc.q.i(l0Var, "$this$measure");
        qc.q.i(list, "measurables");
        int K0 = l0Var.K0(this.f14472c.d());
        int K02 = l0Var.K0(this.f14472c.a());
        int K03 = l0Var.K0(b2.l());
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
        int i13 = -K02;
        int i14 = -(i12 + a2.i(y0Var2));
        long h11 = j2.c.h(e10, i14, i13);
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
            y0Var3 = g0Var3.w(h11);
        } else {
            y0Var3 = null;
        }
        if (y0Var3 != null) {
            i10 = y0Var3.G(n1.b.b());
            if (i10 == Integer.MIN_VALUE) {
                i10 = y0Var3.l0();
            }
        } else {
            i10 = 0;
        }
        int max = Math.max(i10, K0);
        if (y0Var3 != null) {
            i11 = (i13 - K03) - max;
        } else {
            i11 = (-K0) - K02;
        }
        long h12 = j2.c.h(j2.b.e(j10, 0, 0, 0, 0, 11, null), i14, i11);
        for (n1.g0 g0Var4 : list2) {
            if (qc.q.d(androidx.compose.ui.layout.a.a(g0Var4), "TextField")) {
                n1.y0 w10 = g0Var4.w(h12);
                long e11 = j2.b.e(h12, 0, 0, 0, 0, 14, null);
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
                    y0Var4 = g0Var5.w(e11);
                } else {
                    y0Var4 = null;
                }
                h10 = b2.h(a2.i(y0Var), a2.i(y0Var2), w10.A0(), a2.i(y0Var3), a2.i(y0Var4), j10);
                int l02 = w10.l0();
                if (y0Var3 != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                g10 = b2.g(l02, z10, max, a2.h(y0Var), a2.h(y0Var2), a2.h(y0Var4), j10, l0Var.getDensity(), this.f14472c);
                return n1.k0.b(l0Var, h10, g10, null, new c(y0Var3, K0, i10, h10, g10, w10, y0Var4, y0Var, y0Var2, this, max, K03, l0Var), 4, null);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // n1.i0
    public int minIntrinsicHeight(n1.n nVar, List<? extends n1.m> list, int i10) {
        qc.q.i(nVar, "<this>");
        qc.q.i(list, "measurables");
        return d(nVar, list, i10, d.f14488f);
    }

    @Override // n1.i0
    public int minIntrinsicWidth(n1.n nVar, List<? extends n1.m> list, int i10) {
        qc.q.i(nVar, "<this>");
        qc.q.i(list, "measurables");
        return e(list, i10, e.f14489f);
    }
}
