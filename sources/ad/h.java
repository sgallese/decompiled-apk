package ad;

import kotlin.coroutines.Continuation;

/* compiled from: Builders.kt */
/* loaded from: classes4.dex */
public final /* synthetic */ class h {
    public static final <T> T a(hc.f fVar, pc.p<? super k0, ? super Continuation<? super T>, ? extends Object> pVar) throws InterruptedException {
        g1 g1Var;
        g1 a10;
        hc.f d10;
        Thread currentThread = Thread.currentThread();
        hc.d dVar = (hc.d) fVar.get(hc.d.f16598i);
        if (dVar == null) {
            a10 = u2.f562a.b();
            d10 = f0.d(p1.f548f, fVar.plus(a10));
        } else {
            g1 g1Var2 = null;
            if (dVar instanceof g1) {
                g1Var = (g1) dVar;
            } else {
                g1Var = null;
            }
            if (g1Var != null) {
                if (g1Var.c1()) {
                    g1Var2 = g1Var;
                }
                if (g1Var2 != null) {
                    a10 = g1Var2;
                    d10 = f0.d(p1.f548f, fVar);
                }
            }
            a10 = u2.f562a.a();
            d10 = f0.d(p1.f548f, fVar);
        }
        e eVar = new e(d10, currentThread, a10);
        eVar.W0(m0.DEFAULT, eVar, pVar);
        return (T) eVar.X0();
    }

    public static /* synthetic */ Object b(hc.f fVar, pc.p pVar, int i10, Object obj) throws InterruptedException {
        if ((i10 & 1) != 0) {
            fVar = hc.g.f16601f;
        }
        return g.e(fVar, pVar);
    }
}
