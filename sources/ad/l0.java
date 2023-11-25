package ad;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;

/* compiled from: CoroutineScope.kt */
/* loaded from: classes4.dex */
public final class l0 {
    public static final k0 a(hc.f fVar) {
        y b10;
        if (fVar.get(x1.f574b) == null) {
            b10 = c2.b(null, 1, null);
            fVar = fVar.plus(b10);
        }
        return new fd.f(fVar);
    }

    public static final k0 b() {
        return new fd.f(s2.b(null, 1, null).plus(a1.c()));
    }

    public static final void c(k0 k0Var, CancellationException cancellationException) {
        x1 x1Var = (x1) k0Var.getCoroutineContext().get(x1.f574b);
        if (x1Var != null) {
            x1Var.c(cancellationException);
            return;
        }
        throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + k0Var).toString());
    }

    public static /* synthetic */ void d(k0 k0Var, CancellationException cancellationException, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cancellationException = null;
        }
        c(k0Var, cancellationException);
    }

    public static final <R> Object e(pc.p<? super k0, ? super Continuation<? super R>, ? extends Object> pVar, Continuation<? super R> continuation) {
        Object d10;
        fd.c0 c0Var = new fd.c0(continuation.getContext(), continuation);
        Object c10 = gd.b.c(c0Var, c0Var, pVar);
        d10 = ic.d.d();
        if (c10 == d10) {
            kotlin.coroutines.jvm.internal.h.c(continuation);
        }
        return c10;
    }

    public static final void f(k0 k0Var) {
        a2.k(k0Var.getCoroutineContext());
    }

    public static final boolean g(k0 k0Var) {
        x1 x1Var = (x1) k0Var.getCoroutineContext().get(x1.f574b);
        if (x1Var != null) {
            return x1Var.b();
        }
        return true;
    }
}
