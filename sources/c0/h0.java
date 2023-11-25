package c0;

import a1.b4;
import a1.h1;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import v1.d;

/* compiled from: TextFieldDelegate.kt */
/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: a  reason: collision with root package name */
    public static final a f8440a = new a(null);

    /* compiled from: TextFieldDelegate.kt */
    /* loaded from: classes.dex */
    public static final class a {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: TextFieldDelegate.kt */
        /* renamed from: c0.h0$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0207a extends qc.r implements pc.l<List<? extends b2.f>, dc.w> {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ b2.h f8441f;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ pc.l<b2.j0, dc.w> f8442m;

            /* renamed from: p  reason: collision with root package name */
            final /* synthetic */ qc.f0<b2.r0> f8443p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0207a(b2.h hVar, pc.l<? super b2.j0, dc.w> lVar, qc.f0<b2.r0> f0Var) {
                super(1);
                this.f8441f = hVar;
                this.f8442m = lVar;
                this.f8443p = f0Var;
            }

            @Override // pc.l
            public /* bridge */ /* synthetic */ dc.w invoke(List<? extends b2.f> list) {
                invoke2(list);
                return dc.w.f13270a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(List<? extends b2.f> list) {
                qc.q.i(list, "it");
                h0.f8440a.f(list, this.f8441f, this.f8442m, this.f8443p.f21676f);
            }
        }

        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }

        public final b2.s0 a(long j10, b2.s0 s0Var) {
            qc.q.i(s0Var, "transformed");
            d.a aVar = new d.a(s0Var.b());
            aVar.b(new v1.b0(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, g2.k.f16065b.d(), null, null, null, 61439, null), s0Var.a().b(v1.i0.n(j10)), s0Var.a().b(v1.i0.i(j10)));
            return new b2.s0(aVar.l(), s0Var.a());
        }

        public final void b(h1 h1Var, b2.j0 j0Var, b2.x xVar, v1.g0 g0Var, b4 b4Var) {
            int b10;
            int b11;
            qc.q.i(h1Var, "canvas");
            qc.q.i(j0Var, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            qc.q.i(xVar, "offsetMapping");
            qc.q.i(g0Var, "textLayoutResult");
            qc.q.i(b4Var, "selectionPaint");
            if (!v1.i0.h(j0Var.g()) && (b10 = xVar.b(v1.i0.l(j0Var.g()))) != (b11 = xVar.b(v1.i0.k(j0Var.g())))) {
                h1Var.j(g0Var.y(b10, b11), b4Var);
            }
            v1.h0.f24462a.a(h1Var, g0Var);
        }

        public final dc.q<Integer, Integer, v1.g0> c(d0 d0Var, long j10, j2.r rVar, v1.g0 g0Var) {
            qc.q.i(d0Var, "textDelegate");
            qc.q.i(rVar, "layoutDirection");
            v1.g0 l10 = d0Var.l(j10, rVar, g0Var);
            return new dc.q<>(Integer.valueOf(j2.p.g(l10.A())), Integer.valueOf(j2.p.f(l10.A())), l10);
        }

        public final void d(b2.j0 j0Var, d0 d0Var, v1.g0 g0Var, n1.s sVar, b2.r0 r0Var, boolean z10, b2.x xVar) {
            z0.h hVar;
            qc.q.i(j0Var, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            qc.q.i(d0Var, "textDelegate");
            qc.q.i(g0Var, "textLayoutResult");
            qc.q.i(sVar, "layoutCoordinates");
            qc.q.i(r0Var, "textInputSession");
            qc.q.i(xVar, "offsetMapping");
            if (!z10) {
                return;
            }
            int b10 = xVar.b(v1.i0.k(j0Var.g()));
            if (b10 < g0Var.k().j().length()) {
                hVar = g0Var.c(b10);
            } else if (b10 != 0) {
                hVar = g0Var.c(b10 - 1);
            } else {
                hVar = new z0.h(0.0f, 0.0f, 1.0f, j2.p.f(i0.b(d0Var.j(), d0Var.a(), d0Var.b(), null, 0, 24, null)));
            }
            long U = sVar.U(z0.g.a(hVar.i(), hVar.l()));
            r0Var.d(z0.i.b(z0.g.a(z0.f.o(U), z0.f.p(U)), z0.m.a(hVar.n(), hVar.h())));
        }

        public final void e(b2.r0 r0Var, b2.h hVar, pc.l<? super b2.j0, dc.w> lVar) {
            qc.q.i(r0Var, "textInputSession");
            qc.q.i(hVar, "editProcessor");
            qc.q.i(lVar, "onValueChange");
            lVar.invoke(b2.j0.d(hVar.f(), null, 0L, null, 3, null));
            r0Var.a();
        }

        public final void f(List<? extends b2.f> list, b2.h hVar, pc.l<? super b2.j0, dc.w> lVar, b2.r0 r0Var) {
            qc.q.i(list, "ops");
            qc.q.i(hVar, "editProcessor");
            qc.q.i(lVar, "onValueChange");
            b2.j0 b10 = hVar.b(list);
            if (r0Var != null) {
                r0Var.f(null, b10);
            }
            lVar.invoke(b10);
        }

        public final b2.r0 g(b2.l0 l0Var, b2.j0 j0Var, b2.h hVar, b2.p pVar, pc.l<? super b2.j0, dc.w> lVar, pc.l<? super b2.o, dc.w> lVar2) {
            qc.q.i(l0Var, "textInputService");
            qc.q.i(j0Var, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            qc.q.i(hVar, "editProcessor");
            qc.q.i(pVar, "imeOptions");
            qc.q.i(lVar, "onValueChange");
            qc.q.i(lVar2, "onImeActionPerformed");
            return h(l0Var, j0Var, hVar, pVar, lVar, lVar2);
        }

        /* JADX WARN: Type inference failed for: r3v1, types: [b2.r0, T] */
        public final b2.r0 h(b2.l0 l0Var, b2.j0 j0Var, b2.h hVar, b2.p pVar, pc.l<? super b2.j0, dc.w> lVar, pc.l<? super b2.o, dc.w> lVar2) {
            qc.q.i(l0Var, "textInputService");
            qc.q.i(j0Var, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            qc.q.i(hVar, "editProcessor");
            qc.q.i(pVar, "imeOptions");
            qc.q.i(lVar, "onValueChange");
            qc.q.i(lVar2, "onImeActionPerformed");
            qc.f0 f0Var = new qc.f0();
            ?? b10 = l0Var.b(j0Var, pVar, new C0207a(hVar, lVar, f0Var), lVar2);
            f0Var.f21676f = b10;
            return b10;
        }

        public final void i(long j10, v0 v0Var, b2.h hVar, b2.x xVar, pc.l<? super b2.j0, dc.w> lVar) {
            qc.q.i(v0Var, "textLayoutResult");
            qc.q.i(hVar, "editProcessor");
            qc.q.i(xVar, "offsetMapping");
            qc.q.i(lVar, "onValueChange");
            lVar.invoke(b2.j0.d(hVar.f(), null, v1.j0.a(xVar.a(v0.h(v0Var, j10, false, 2, null))), null, 5, null));
        }
    }
}
