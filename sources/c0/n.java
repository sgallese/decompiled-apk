package c0;

import a2.l;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.k1;
import androidx.compose.ui.platform.m1;
import j0.g3;

/* compiled from: HeightInLinesModifier.kt */
/* loaded from: classes.dex */
public final class n {

    /* compiled from: InspectableValue.kt */
    /* loaded from: classes.dex */
    public static final class a extends qc.r implements pc.l<m1, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f8492f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ int f8493m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ v1.k0 f8494p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i10, int i11, v1.k0 k0Var) {
            super(1);
            this.f8492f = i10;
            this.f8493m = i11;
            this.f8494p = k0Var;
        }

        public final void a(m1 m1Var) {
            qc.q.i(m1Var, "$this$null");
            m1Var.b("heightInLines");
            m1Var.a().c("minLines", Integer.valueOf(this.f8492f));
            m1Var.a().c("maxLines", Integer.valueOf(this.f8493m));
            m1Var.a().c("textStyle", this.f8494p);
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ dc.w invoke(m1 m1Var) {
            a(m1Var);
            return dc.w.f13270a;
        }
    }

    /* compiled from: HeightInLinesModifier.kt */
    /* loaded from: classes.dex */
    static final class b extends qc.r implements pc.q<androidx.compose.ui.e, j0.l, Integer, androidx.compose.ui.e> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f8495f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ int f8496m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ v1.k0 f8497p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i10, int i11, v1.k0 k0Var) {
            super(3);
            this.f8495f = i10;
            this.f8496m = i11;
            this.f8497p = k0Var;
        }

        private static final Object b(g3<? extends Object> g3Var) {
            return g3Var.getValue();
        }

        public final androidx.compose.ui.e a(androidx.compose.ui.e eVar, j0.l lVar, int i10) {
            int b10;
            int a10;
            Integer valueOf;
            float b11;
            float b12;
            qc.q.i(eVar, "$this$composed");
            lVar.e(408240218);
            if (j0.n.K()) {
                j0.n.V(408240218, i10, -1, "androidx.compose.foundation.text.heightInLines.<anonymous> (HeightInLinesModifier.kt:58)");
            }
            n.b(this.f8495f, this.f8496m);
            if (this.f8495f == 1 && this.f8496m == Integer.MAX_VALUE) {
                e.a aVar = androidx.compose.ui.e.f2335a;
                if (j0.n.K()) {
                    j0.n.U();
                }
                lVar.N();
                return aVar;
            }
            j2.e eVar2 = (j2.e) lVar.C(androidx.compose.ui.platform.z0.e());
            l.b bVar = (l.b) lVar.C(androidx.compose.ui.platform.z0.g());
            j2.r rVar = (j2.r) lVar.C(androidx.compose.ui.platform.z0.j());
            v1.k0 k0Var = this.f8497p;
            lVar.e(511388516);
            boolean Q = lVar.Q(k0Var) | lVar.Q(rVar);
            Object f10 = lVar.f();
            if (Q || f10 == j0.l.f18688a.a()) {
                f10 = v1.l0.d(k0Var, rVar);
                lVar.J(f10);
            }
            lVar.N();
            v1.k0 k0Var2 = (v1.k0) f10;
            lVar.e(511388516);
            boolean Q2 = lVar.Q(bVar) | lVar.Q(k0Var2);
            Object f11 = lVar.f();
            if (Q2 || f11 == j0.l.f18688a.a()) {
                a2.l j10 = k0Var2.j();
                a2.c0 o10 = k0Var2.o();
                if (o10 == null) {
                    o10 = a2.c0.f239m.e();
                }
                a2.x m10 = k0Var2.m();
                if (m10 != null) {
                    b10 = m10.i();
                } else {
                    b10 = a2.x.f339b.b();
                }
                a2.y n10 = k0Var2.n();
                if (n10 != null) {
                    a10 = n10.m();
                } else {
                    a10 = a2.y.f348b.a();
                }
                f11 = bVar.a(j10, o10, b10, a10);
                lVar.J(f11);
            }
            lVar.N();
            g3 g3Var = (g3) f11;
            Object[] objArr = {eVar2, bVar, this.f8497p, rVar, b(g3Var)};
            lVar.e(-568225417);
            boolean z10 = false;
            for (int i11 = 0; i11 < 5; i11++) {
                z10 |= lVar.Q(objArr[i11]);
            }
            Object f12 = lVar.f();
            if (z10 || f12 == j0.l.f18688a.a()) {
                f12 = Integer.valueOf(j2.p.f(i0.a(k0Var2, eVar2, bVar, i0.c(), 1)));
                lVar.J(f12);
            }
            lVar.N();
            int intValue = ((Number) f12).intValue();
            Object[] objArr2 = {eVar2, bVar, this.f8497p, rVar, b(g3Var)};
            lVar.e(-568225417);
            boolean z11 = false;
            for (int i12 = 0; i12 < 5; i12++) {
                z11 |= lVar.Q(objArr2[i12]);
            }
            Object f13 = lVar.f();
            if (z11 || f13 == j0.l.f18688a.a()) {
                f13 = Integer.valueOf(j2.p.f(i0.a(k0Var2, eVar2, bVar, i0.c() + '\n' + i0.c(), 2)));
                lVar.J(f13);
            }
            lVar.N();
            int intValue2 = ((Number) f13).intValue() - intValue;
            int i13 = this.f8495f;
            Integer num = null;
            if (i13 == 1) {
                valueOf = null;
            } else {
                valueOf = Integer.valueOf(((i13 - 1) * intValue2) + intValue);
            }
            int i14 = this.f8496m;
            if (i14 != Integer.MAX_VALUE) {
                num = Integer.valueOf(intValue + (intValue2 * (i14 - 1)));
            }
            e.a aVar2 = androidx.compose.ui.e.f2335a;
            if (valueOf != null) {
                b11 = eVar2.h0(valueOf.intValue());
            } else {
                b11 = j2.h.f18979m.b();
            }
            if (num != null) {
                b12 = eVar2.h0(num.intValue());
            } else {
                b12 = j2.h.f18979m.b();
            }
            androidx.compose.ui.e j11 = androidx.compose.foundation.layout.m.j(aVar2, b11, b12);
            if (j0.n.K()) {
                j0.n.U();
            }
            lVar.N();
            return j11;
        }

        @Override // pc.q
        public /* bridge */ /* synthetic */ androidx.compose.ui.e invoke(androidx.compose.ui.e eVar, j0.l lVar, Integer num) {
            return a(eVar, lVar, num.intValue());
        }
    }

    public static final androidx.compose.ui.e a(androidx.compose.ui.e eVar, v1.k0 k0Var, int i10, int i11) {
        pc.l a10;
        qc.q.i(eVar, "<this>");
        qc.q.i(k0Var, "textStyle");
        if (k1.c()) {
            a10 = new a(i10, i11, k0Var);
        } else {
            a10 = k1.a();
        }
        return androidx.compose.ui.c.a(eVar, a10, new b(i10, i11, k0Var));
    }

    public static final void b(int i10, int i11) {
        boolean z10;
        boolean z11 = true;
        if (i10 > 0 && i11 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (i10 > i11) {
                z11 = false;
            }
            if (z11) {
                return;
            }
            throw new IllegalArgumentException(("minLines " + i10 + " must be less than or equal to maxLines " + i11).toString());
        }
        throw new IllegalArgumentException(("both minLines " + i10 + " and maxLines " + i11 + " must be greater than zero").toString());
    }
}
