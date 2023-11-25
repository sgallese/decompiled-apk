package j0;

import kotlin.coroutines.Continuation;

/* compiled from: MonotonicFrameClock.kt */
/* loaded from: classes.dex */
public final class z0 {
    public static final y0 a(hc.f fVar) {
        qc.q.i(fVar, "<this>");
        y0 y0Var = (y0) fVar.get(y0.f18923k);
        if (y0Var != null) {
            return y0Var;
        }
        throw new IllegalStateException("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.".toString());
    }

    public static final <R> Object b(pc.l<? super Long, ? extends R> lVar, Continuation<? super R> continuation) {
        return a(continuation.getContext()).R(lVar, continuation);
    }
}
