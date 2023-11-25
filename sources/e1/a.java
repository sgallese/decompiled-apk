package e1;

import a1.a1;
import a1.h1;
import a1.j1;
import a1.p1;
import a1.q1;
import a1.t3;
import a1.v3;
import c1.a;

/* compiled from: DrawCache.kt */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private t3 f13730a;

    /* renamed from: b  reason: collision with root package name */
    private h1 f13731b;

    /* renamed from: c  reason: collision with root package name */
    private j2.e f13732c;

    /* renamed from: d  reason: collision with root package name */
    private j2.r f13733d = j2.r.Ltr;

    /* renamed from: e  reason: collision with root package name */
    private long f13734e = j2.p.f19001b.a();

    /* renamed from: f  reason: collision with root package name */
    private final c1.a f13735f = new c1.a();

    private final void a(c1.f fVar) {
        c1.e.m(fVar, p1.f146b.a(), 0L, 0L, 0.0f, null, null, a1.f62b.a(), 62, null);
    }

    public final void b(long j10, j2.e eVar, j2.r rVar, pc.l<? super c1.f, dc.w> lVar) {
        qc.q.i(eVar, "density");
        qc.q.i(rVar, "layoutDirection");
        qc.q.i(lVar, "block");
        this.f13732c = eVar;
        this.f13733d = rVar;
        t3 t3Var = this.f13730a;
        h1 h1Var = this.f13731b;
        if (t3Var == null || h1Var == null || j2.p.g(j10) > t3Var.getWidth() || j2.p.f(j10) > t3Var.getHeight()) {
            t3Var = v3.b(j2.p.g(j10), j2.p.f(j10), 0, false, null, 28, null);
            h1Var = j1.a(t3Var);
            this.f13730a = t3Var;
            this.f13731b = h1Var;
        }
        this.f13734e = j10;
        c1.a aVar = this.f13735f;
        long c10 = j2.q.c(j10);
        a.C0220a s10 = aVar.s();
        j2.e a10 = s10.a();
        j2.r b10 = s10.b();
        h1 c11 = s10.c();
        long d10 = s10.d();
        a.C0220a s11 = aVar.s();
        s11.j(eVar);
        s11.k(rVar);
        s11.i(h1Var);
        s11.l(c10);
        h1Var.k();
        a(aVar);
        lVar.invoke(aVar);
        h1Var.p();
        a.C0220a s12 = aVar.s();
        s12.j(a10);
        s12.k(b10);
        s12.i(c11);
        s12.l(d10);
        t3Var.a();
    }

    public final void c(c1.f fVar, float f10, q1 q1Var) {
        boolean z10;
        qc.q.i(fVar, "target");
        t3 t3Var = this.f13730a;
        if (t3Var != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            c1.e.g(fVar, t3Var, 0L, this.f13734e, 0L, 0L, f10, null, q1Var, 0, 0, 858, null);
            return;
        }
        throw new IllegalStateException("drawCachedImage must be invoked first before attempting to draw the result into another destination".toString());
    }
}
