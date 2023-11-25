package ad;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Future;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class a2 {
    public static final y a(x1 x1Var) {
        return c2.a(x1Var);
    }

    public static final void c(x1 x1Var, String str, Throwable th) {
        c2.c(x1Var, str, th);
    }

    public static final void d(hc.f fVar, CancellationException cancellationException) {
        c2.d(fVar, cancellationException);
    }

    public static final Object g(x1 x1Var, Continuation<? super dc.w> continuation) {
        return c2.g(x1Var, continuation);
    }

    public static final void h(m<?> mVar, Future<?> future) {
        b2.a(mVar, future);
    }

    public static final c1 i(x1 x1Var, c1 c1Var) {
        return c2.h(x1Var, c1Var);
    }

    public static final void j(x1 x1Var) {
        c2.i(x1Var);
    }

    public static final void k(hc.f fVar) {
        c2.j(fVar);
    }

    public static final x1 l(hc.f fVar) {
        return c2.k(fVar);
    }

    public static final boolean m(hc.f fVar) {
        return c2.l(fVar);
    }
}
