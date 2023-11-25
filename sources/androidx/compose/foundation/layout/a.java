package androidx.compose.foundation.layout;

import androidx.compose.ui.platform.k1;
import androidx.compose.ui.platform.m1;
import dc.w;
import j2.h;
import n1.g0;
import n1.j0;
import n1.k0;
import n1.l0;
import n1.y0;
import qc.q;
import qc.r;

/* compiled from: AlignmentLine.kt */
/* loaded from: classes.dex */
public final class a {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AlignmentLine.kt */
    /* renamed from: androidx.compose.foundation.layout.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0024a extends r implements pc.l<y0.a, w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ n1.a f2052f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ float f2053m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ int f2054p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ int f2055q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ int f2056r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ y0 f2057s;

        /* renamed from: t  reason: collision with root package name */
        final /* synthetic */ int f2058t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0024a(n1.a aVar, float f10, int i10, int i11, int i12, y0 y0Var, int i13) {
            super(1);
            this.f2052f = aVar;
            this.f2053m = f10;
            this.f2054p = i10;
            this.f2055q = i11;
            this.f2056r = i12;
            this.f2057s = y0Var;
            this.f2058t = i13;
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ w invoke(y0.a aVar) {
            invoke2(aVar);
            return w.f13270a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(y0.a aVar) {
            int A0;
            int l02;
            q.i(aVar, "$this$layout");
            if (a.d(this.f2052f)) {
                A0 = 0;
            } else {
                A0 = !j2.h.l(this.f2053m, j2.h.f18979m.b()) ? this.f2054p : (this.f2055q - this.f2056r) - this.f2057s.A0();
            }
            if (a.d(this.f2052f)) {
                l02 = !j2.h.l(this.f2053m, j2.h.f18979m.b()) ? this.f2054p : (this.f2058t - this.f2056r) - this.f2057s.l0();
            } else {
                l02 = 0;
            }
            y0.a.r(aVar, this.f2057s, A0, l02, 0.0f, 4, null);
        }
    }

    /* compiled from: InspectableValue.kt */
    /* loaded from: classes.dex */
    public static final class b extends r implements pc.l<m1, w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ n1.a f2059f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ float f2060m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ float f2061p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(n1.a aVar, float f10, float f11) {
            super(1);
            this.f2059f = aVar;
            this.f2060m = f10;
            this.f2061p = f11;
        }

        public final void a(m1 m1Var) {
            q.i(m1Var, "$this$null");
            m1Var.b("paddingFrom");
            m1Var.a().c("alignmentLine", this.f2059f);
            m1Var.a().c("before", j2.h.f(this.f2060m));
            m1Var.a().c("after", j2.h.f(this.f2061p));
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ w invoke(m1 m1Var) {
            a(m1Var);
            return w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j0 c(l0 l0Var, n1.a aVar, float f10, float f11, g0 g0Var, long j10) {
        long e10;
        int A0;
        int n10;
        int i10;
        int l10;
        int i11;
        int l11;
        int max;
        int l02;
        if (d(aVar)) {
            e10 = j2.b.e(j10, 0, 0, 0, 0, 11, null);
        } else {
            e10 = j2.b.e(j10, 0, 0, 0, 0, 14, null);
        }
        y0 w10 = g0Var.w(e10);
        int G = w10.G(aVar);
        if (G == Integer.MIN_VALUE) {
            G = 0;
        }
        if (d(aVar)) {
            A0 = w10.l0();
        } else {
            A0 = w10.A0();
        }
        if (d(aVar)) {
            n10 = j2.b.m(j10);
        } else {
            n10 = j2.b.n(j10);
        }
        h.a aVar2 = j2.h.f18979m;
        if (!j2.h.l(f10, aVar2.b())) {
            i10 = l0Var.K0(f10);
        } else {
            i10 = 0;
        }
        int i12 = n10 - A0;
        l10 = vc.l.l(i10 - G, 0, i12);
        if (!j2.h.l(f11, aVar2.b())) {
            i11 = l0Var.K0(f11);
        } else {
            i11 = 0;
        }
        l11 = vc.l.l((i11 - A0) + G, 0, i12 - l10);
        if (d(aVar)) {
            max = w10.A0();
        } else {
            max = Math.max(w10.A0() + l10 + l11, j2.b.p(j10));
        }
        int i13 = max;
        if (d(aVar)) {
            l02 = Math.max(w10.l0() + l10 + l11, j2.b.o(j10));
        } else {
            l02 = w10.l0();
        }
        int i14 = l02;
        return k0.b(l0Var, i13, i14, null, new C0024a(aVar, f10, l10, i13, l11, w10, i14), 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(n1.a aVar) {
        return aVar instanceof n1.k;
    }

    public static final androidx.compose.ui.e e(androidx.compose.ui.e eVar, n1.a aVar, float f10, float f11) {
        pc.l a10;
        q.i(eVar, "$this$paddingFrom");
        q.i(aVar, "alignmentLine");
        if (k1.c()) {
            a10 = new b(aVar, f10, f11);
        } else {
            a10 = k1.a();
        }
        return eVar.a(new AlignmentLineOffsetDpElement(aVar, f10, f11, a10, null));
    }

    public static /* synthetic */ androidx.compose.ui.e f(androidx.compose.ui.e eVar, n1.a aVar, float f10, float f11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f10 = j2.h.f18979m.b();
        }
        if ((i10 & 4) != 0) {
            f11 = j2.h.f18979m.b();
        }
        return e(eVar, aVar, f10, f11);
    }

    public static final androidx.compose.ui.e g(androidx.compose.ui.e eVar, float f10, float f11) {
        androidx.compose.ui.e eVar2;
        androidx.compose.ui.e eVar3;
        q.i(eVar, "$this$paddingFromBaseline");
        h.a aVar = j2.h.f18979m;
        if (!j2.h.l(f10, aVar.b())) {
            eVar2 = f(androidx.compose.ui.e.f2335a, n1.b.a(), f10, 0.0f, 4, null);
        } else {
            eVar2 = androidx.compose.ui.e.f2335a;
        }
        androidx.compose.ui.e a10 = eVar.a(eVar2);
        if (!j2.h.l(f11, aVar.b())) {
            eVar3 = f(androidx.compose.ui.e.f2335a, n1.b.b(), 0.0f, f11, 2, null);
        } else {
            eVar3 = androidx.compose.ui.e.f2335a;
        }
        return a10.a(eVar3);
    }
}
