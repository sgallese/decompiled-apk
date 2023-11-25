package ad;

import hc.f;
import kotlin.coroutines.Continuation;

/* compiled from: Delay.kt */
/* loaded from: classes4.dex */
public final class u0 {
    public static final Object a(long j10, Continuation<? super dc.w> continuation) {
        Continuation c10;
        Object d10;
        Object d11;
        if (j10 > 0) {
            c10 = ic.c.c(continuation);
            n nVar = new n(c10, 1);
            nVar.A();
            if (j10 < Long.MAX_VALUE) {
                c(nVar.getContext()).j(j10, nVar);
            }
            Object x10 = nVar.x();
            d10 = ic.d.d();
            if (x10 == d10) {
                kotlin.coroutines.jvm.internal.h.c(continuation);
            }
            d11 = ic.d.d();
            if (x10 == d11) {
                return x10;
            }
            return dc.w.f13270a;
        }
        return dc.w.f13270a;
    }

    public static final Object b(long j10, Continuation<? super dc.w> continuation) {
        Object d10;
        Object a10 = a(d(j10), continuation);
        d10 = ic.d.d();
        if (a10 == d10) {
            return a10;
        }
        return dc.w.f13270a;
    }

    public static final t0 c(hc.f fVar) {
        t0 t0Var;
        f.b bVar = fVar.get(hc.d.f16598i);
        if (bVar instanceof t0) {
            t0Var = (t0) bVar;
        } else {
            t0Var = null;
        }
        if (t0Var == null) {
            return q0.a();
        }
        return t0Var;
    }

    public static final long d(long j10) {
        long e10;
        if (zc.a.j(j10, zc.a.f26431m.a()) > 0) {
            e10 = vc.l.e(zc.a.q(j10), 1L);
            return e10;
        }
        return 0L;
    }
}
