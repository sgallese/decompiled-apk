package r;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import n1.y0;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AnimatedVisibility.kt */
/* loaded from: classes.dex */
public final class h implements n1.i0 {

    /* renamed from: a  reason: collision with root package name */
    private final k f21889a;

    /* compiled from: AnimatedVisibility.kt */
    /* loaded from: classes.dex */
    static final class a extends qc.r implements pc.l<n1.m, Integer> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f21890f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i10) {
            super(1);
            this.f21890f = i10;
        }

        @Override // pc.l
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final Integer invoke(n1.m mVar) {
            qc.q.i(mVar, "it");
            return Integer.valueOf(mVar.g(this.f21890f));
        }
    }

    /* compiled from: AnimatedVisibility.kt */
    /* loaded from: classes.dex */
    static final class b extends qc.r implements pc.l<n1.m, Integer> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f21891f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i10) {
            super(1);
            this.f21891f = i10;
        }

        @Override // pc.l
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final Integer invoke(n1.m mVar) {
            qc.q.i(mVar, "it");
            return Integer.valueOf(mVar.t(this.f21891f));
        }
    }

    /* compiled from: AnimatedVisibility.kt */
    /* loaded from: classes.dex */
    static final class c extends qc.r implements pc.l<y0.a, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ List<y0> f21892f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(List<? extends y0> list) {
            super(1);
            this.f21892f = list;
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ dc.w invoke(y0.a aVar) {
            invoke2(aVar);
            return dc.w.f13270a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(y0.a aVar) {
            qc.q.i(aVar, "$this$layout");
            List<y0> list = this.f21892f;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                y0.a.n(aVar, list.get(i10), 0, 0, 0.0f, 4, null);
            }
        }
    }

    /* compiled from: AnimatedVisibility.kt */
    /* loaded from: classes.dex */
    static final class d extends qc.r implements pc.l<n1.m, Integer> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f21893f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(int i10) {
            super(1);
            this.f21893f = i10;
        }

        @Override // pc.l
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final Integer invoke(n1.m mVar) {
            qc.q.i(mVar, "it");
            return Integer.valueOf(mVar.a0(this.f21893f));
        }
    }

    /* compiled from: AnimatedVisibility.kt */
    /* loaded from: classes.dex */
    static final class e extends qc.r implements pc.l<n1.m, Integer> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f21894f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(int i10) {
            super(1);
            this.f21894f = i10;
        }

        @Override // pc.l
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final Integer invoke(n1.m mVar) {
            qc.q.i(mVar, "it");
            return Integer.valueOf(mVar.s(this.f21894f));
        }
    }

    public h(k kVar) {
        qc.q.i(kVar, "scope");
        this.f21889a = kVar;
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v16 */
    @Override // n1.i0
    /* renamed from: measure-3p2s80s */
    public n1.j0 mo0measure3p2s80s(n1.l0 l0Var, List<? extends n1.g0> list, long j10) {
        int s10;
        Object obj;
        int k10;
        int i10;
        int i11;
        int k11;
        qc.q.i(l0Var, "$this$measure");
        qc.q.i(list, "measurables");
        List<? extends n1.g0> list2 = list;
        s10 = ec.u.s(list2, 10);
        ArrayList arrayList = new ArrayList(s10);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((n1.g0) it.next()).w(j10));
        }
        y0 y0Var = null;
        int i12 = 1;
        if (arrayList.isEmpty()) {
            obj = null;
        } else {
            obj = arrayList.get(0);
            int A0 = ((y0) obj).A0();
            k10 = ec.t.k(arrayList);
            if (1 <= k10) {
                int i13 = 1;
                while (true) {
                    Object obj2 = arrayList.get(i13);
                    int A02 = ((y0) obj2).A0();
                    if (A0 < A02) {
                        obj = obj2;
                        A0 = A02;
                    }
                    if (i13 == k10) {
                        break;
                    }
                    i13++;
                }
            }
        }
        y0 y0Var2 = (y0) obj;
        if (y0Var2 != null) {
            i10 = y0Var2.A0();
        } else {
            i10 = 0;
        }
        if (!arrayList.isEmpty()) {
            Object obj3 = arrayList.get(0);
            int l02 = ((y0) obj3).l0();
            k11 = ec.t.k(arrayList);
            Object obj4 = obj3;
            if (1 <= k11) {
                while (true) {
                    Object obj5 = arrayList.get(i12);
                    int l03 = ((y0) obj5).l0();
                    obj3 = obj4;
                    if (l02 < l03) {
                        obj3 = obj5;
                        l02 = l03;
                    }
                    if (i12 == k11) {
                        break;
                    }
                    i12++;
                    obj4 = obj3;
                }
            }
            y0Var = obj3;
        }
        y0 y0Var3 = y0Var;
        if (y0Var3 != null) {
            i11 = y0Var3.l0();
        } else {
            i11 = 0;
        }
        this.f21889a.a().setValue(j2.p.b(j2.q.a(i10, i11)));
        return n1.k0.b(l0Var, i10, i11, null, new c(arrayList), 4, null);
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
