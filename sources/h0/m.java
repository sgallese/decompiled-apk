package h0;

import ad.k0;
import j0.g3;
import t.w;

/* compiled from: Ripple.kt */
/* loaded from: classes.dex */
public abstract class m implements w {

    /* renamed from: f  reason: collision with root package name */
    private final q f16409f;

    public m(boolean z10, g3<f> g3Var) {
        qc.q.i(g3Var, "rippleAlpha");
        this.f16409f = new q(z10, g3Var);
    }

    public abstract void e(v.p pVar, k0 k0Var);

    public final void f(c1.f fVar, float f10, long j10) {
        qc.q.i(fVar, "$this$drawStateLayer");
        this.f16409f.b(fVar, f10, j10);
    }

    public abstract void g(v.p pVar);

    public final void h(v.j jVar, k0 k0Var) {
        qc.q.i(jVar, "interaction");
        qc.q.i(k0Var, "scope");
        this.f16409f.c(jVar, k0Var);
    }
}
