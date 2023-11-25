package ad;

import hc.d;
import kotlin.coroutines.Continuation;

/* compiled from: Builders.common.kt */
/* loaded from: classes4.dex */
public final /* synthetic */ class i {
    public static final <T> r0<T> a(k0 k0Var, hc.f fVar, m0 m0Var, pc.p<? super k0, ? super Continuation<? super T>, ? extends Object> pVar) {
        s0 s0Var;
        hc.f d10 = f0.d(k0Var, fVar);
        if (m0Var.isLazy()) {
            s0Var = new g2(d10, pVar);
        } else {
            s0Var = new s0(d10, true);
        }
        ((a) s0Var).W0(m0Var, s0Var, pVar);
        return s0Var;
    }

    public static /* synthetic */ r0 b(k0 k0Var, hc.f fVar, m0 m0Var, pc.p pVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            fVar = hc.g.f16601f;
        }
        if ((i10 & 2) != 0) {
            m0Var = m0.DEFAULT;
        }
        return g.a(k0Var, fVar, m0Var, pVar);
    }

    public static final x1 c(k0 k0Var, hc.f fVar, m0 m0Var, pc.p<? super k0, ? super Continuation<? super dc.w>, ? extends Object> pVar) {
        a q2Var;
        hc.f d10 = f0.d(k0Var, fVar);
        if (m0Var.isLazy()) {
            q2Var = new h2(d10, pVar);
        } else {
            q2Var = new q2(d10, true);
        }
        q2Var.W0(m0Var, q2Var, pVar);
        return q2Var;
    }

    public static /* synthetic */ x1 d(k0 k0Var, hc.f fVar, m0 m0Var, pc.p pVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            fVar = hc.g.f16601f;
        }
        if ((i10 & 2) != 0) {
            m0Var = m0.DEFAULT;
        }
        return g.c(k0Var, fVar, m0Var, pVar);
    }

    public static final <T> Object e(hc.f fVar, pc.p<? super k0, ? super Continuation<? super T>, ? extends Object> pVar, Continuation<? super T> continuation) {
        Object X0;
        Object d10;
        hc.f context = continuation.getContext();
        hc.f e10 = f0.e(context, fVar);
        a2.k(e10);
        if (e10 == context) {
            fd.c0 c0Var = new fd.c0(e10, continuation);
            X0 = gd.b.c(c0Var, c0Var, pVar);
        } else {
            d.b bVar = hc.d.f16598i;
            if (qc.q.d(e10.get(bVar), context.get(bVar))) {
                z2 z2Var = new z2(e10, continuation);
                hc.f context2 = z2Var.getContext();
                Object c10 = fd.k0.c(context2, null);
                try {
                    Object c11 = gd.b.c(z2Var, z2Var, pVar);
                    fd.k0.a(context2, c10);
                    X0 = c11;
                } catch (Throwable th) {
                    fd.k0.a(context2, c10);
                    throw th;
                }
            } else {
                w0 w0Var = new w0(e10, continuation);
                gd.a.e(pVar, w0Var, w0Var, null, 4, null);
                X0 = w0Var.X0();
            }
        }
        d10 = ic.d.d();
        if (X0 == d10) {
            kotlin.coroutines.jvm.internal.h.c(continuation);
        }
        return X0;
    }
}
