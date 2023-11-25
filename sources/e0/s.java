package e0;

import j0.g2;
import j0.i2;
import j0.l3;
import j0.z1;
import java.util.ArrayList;
import java.util.List;
import n1.g0;
import n1.h0;
import n1.i0;
import n1.j0;
import n1.k0;
import n1.l0;
import n1.y0;
import p1.g;

/* compiled from: SimpleLayout.kt */
/* loaded from: classes.dex */
public final class s {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SimpleLayout.kt */
    /* loaded from: classes.dex */
    public static final class a implements i0 {

        /* renamed from: a  reason: collision with root package name */
        public static final a f13674a = new a();

        /* compiled from: SimpleLayout.kt */
        /* renamed from: e0.s$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        static final class C0325a extends qc.r implements pc.l<y0.a, dc.w> {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ List<y0> f13675f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0325a(List<? extends y0> list) {
                super(1);
                this.f13675f = list;
            }

            @Override // pc.l
            public /* bridge */ /* synthetic */ dc.w invoke(y0.a aVar) {
                invoke2(aVar);
                return dc.w.f13270a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(y0.a aVar) {
                qc.q.i(aVar, "$this$layout");
                List<y0> list = this.f13675f;
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    y0.a.n(aVar, list.get(i10), 0, 0, 0.0f, 4, null);
                }
            }
        }

        a() {
        }

        @Override // n1.i0
        public /* synthetic */ int maxIntrinsicHeight(n1.n nVar, List list, int i10) {
            return h0.a(this, nVar, list, i10);
        }

        @Override // n1.i0
        public /* synthetic */ int maxIntrinsicWidth(n1.n nVar, List list, int i10) {
            return h0.b(this, nVar, list, i10);
        }

        @Override // n1.i0
        /* renamed from: measure-3p2s80s */
        public final j0 mo0measure3p2s80s(l0 l0Var, List<? extends g0> list, long j10) {
            qc.q.i(l0Var, "$this$Layout");
            qc.q.i(list, "measurables");
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            Integer num = 0;
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.add(list.get(i10).w(j10));
            }
            int size2 = arrayList.size();
            Integer num2 = num;
            for (int i11 = 0; i11 < size2; i11++) {
                num2 = Integer.valueOf(Math.max(num2.intValue(), ((y0) arrayList.get(i11)).A0()));
            }
            int intValue = num2.intValue();
            int size3 = arrayList.size();
            for (int i12 = 0; i12 < size3; i12++) {
                num = Integer.valueOf(Math.max(num.intValue(), ((y0) arrayList.get(i12)).l0()));
            }
            return k0.b(l0Var, intValue, num.intValue(), null, new C0325a(arrayList), 4, null);
        }

        @Override // n1.i0
        public /* synthetic */ int minIntrinsicHeight(n1.n nVar, List list, int i10) {
            return h0.c(this, nVar, list, i10);
        }

        @Override // n1.i0
        public /* synthetic */ int minIntrinsicWidth(n1.n nVar, List list, int i10) {
            return h0.d(this, nVar, list, i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SimpleLayout.kt */
    /* loaded from: classes.dex */
    public static final class b extends qc.r implements pc.p<j0.l, Integer, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f13676f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ pc.p<j0.l, Integer, dc.w> f13677m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ int f13678p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ int f13679q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(androidx.compose.ui.e eVar, pc.p<? super j0.l, ? super Integer, dc.w> pVar, int i10, int i11) {
            super(2);
            this.f13676f = eVar;
            this.f13677m = pVar;
            this.f13678p = i10;
            this.f13679q = i11;
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ dc.w invoke(j0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return dc.w.f13270a;
        }

        public final void invoke(j0.l lVar, int i10) {
            s.a(this.f13676f, this.f13677m, lVar, z1.a(this.f13678p | 1), this.f13679q);
        }
    }

    public static final void a(androidx.compose.ui.e eVar, pc.p<? super j0.l, ? super Integer, dc.w> pVar, j0.l lVar, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        qc.q.i(pVar, "content");
        j0.l q10 = lVar.q(-2105228848);
        int i15 = i11 & 1;
        if (i15 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            if (q10.Q(eVar)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            if (q10.l(pVar)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        if ((i12 & 91) == 18 && q10.t()) {
            q10.z();
        } else {
            if (i15 != 0) {
                eVar = androidx.compose.ui.e.f2335a;
            }
            if (j0.n.K()) {
                j0.n.V(-2105228848, i12, -1, "androidx.compose.foundation.text.selection.SimpleLayout (SimpleLayout.kt:31)");
            }
            a aVar = a.f13674a;
            int i16 = ((i12 >> 3) & 14) | ((i12 << 3) & 112);
            q10.e(-1323940314);
            int a10 = j0.j.a(q10, 0);
            j0.v F = q10.F();
            g.a aVar2 = p1.g.f20790l;
            pc.a<p1.g> a11 = aVar2.a();
            pc.q<i2<p1.g>, j0.l, Integer, dc.w> a12 = n1.x.a(eVar);
            int i17 = ((i16 << 9) & 7168) | 6;
            if (!(q10.u() instanceof j0.f)) {
                j0.j.c();
            }
            q10.s();
            if (q10.n()) {
                q10.B(a11);
            } else {
                q10.H();
            }
            j0.l a13 = l3.a(q10);
            l3.b(a13, aVar, aVar2.e());
            l3.b(a13, F, aVar2.g());
            pc.p<p1.g, Integer, dc.w> b10 = aVar2.b();
            if (a13.n() || !qc.q.d(a13.f(), Integer.valueOf(a10))) {
                a13.J(Integer.valueOf(a10));
                a13.I(Integer.valueOf(a10), b10);
            }
            a12.invoke(i2.a(i2.b(q10)), q10, Integer.valueOf((i17 >> 3) & 112));
            q10.e(2058660585);
            pVar.invoke(q10, Integer.valueOf((i17 >> 9) & 14));
            q10.N();
            q10.O();
            q10.N();
            if (j0.n.K()) {
                j0.n.U();
            }
        }
        g2 w10 = q10.w();
        if (w10 != null) {
            w10.a(new b(eVar, pVar, i10, i11));
        }
    }
}
