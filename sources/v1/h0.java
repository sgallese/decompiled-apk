package v1;

import a1.e1;
import a1.g1;
import a1.h1;
import a1.o4;
import a1.p1;
import g2.o;

/* compiled from: TextPainter.kt */
/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: a  reason: collision with root package name */
    public static final h0 f24462a = new h0();

    private h0() {
    }

    public final void a(h1 h1Var, g0 g0Var) {
        boolean z10;
        long a10;
        float f10;
        qc.q.i(h1Var, "canvas");
        qc.q.i(g0Var, "textLayoutResult");
        if (g0Var.h() && !g2.u.e(g0Var.k().f(), g2.u.f16099a.c())) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            z0.h b10 = z0.i.b(z0.f.f26354b.c(), z0.m.a(j2.p.g(g0Var.A()), j2.p.f(g0Var.A())));
            h1Var.k();
            g1.e(h1Var, b10, 0, 2, null);
        }
        b0 y10 = g0Var.k().i().y();
        g2.k s10 = y10.s();
        if (s10 == null) {
            s10 = g2.k.f16065b.c();
        }
        g2.k kVar = s10;
        o4 r10 = y10.r();
        if (r10 == null) {
            r10 = o4.f137d.a();
        }
        o4 o4Var = r10;
        c1.g h10 = y10.h();
        if (h10 == null) {
            h10 = c1.k.f8683a;
        }
        c1.g gVar = h10;
        try {
            e1 f11 = y10.f();
            if (f11 != null) {
                if (y10.t() != o.b.f16081b) {
                    f10 = y10.t().d();
                } else {
                    f10 = 1.0f;
                }
                h.D(g0Var.v(), h1Var, f11, f10, o4Var, kVar, gVar, 0, 64, null);
            } else {
                if (y10.t() != o.b.f16081b) {
                    a10 = y10.t().e();
                } else {
                    a10 = p1.f146b.a();
                }
                h.B(g0Var.v(), h1Var, a10, o4Var, kVar, gVar, 0, 32, null);
            }
        } finally {
            if (z10) {
                h1Var.p();
            }
        }
    }
}
