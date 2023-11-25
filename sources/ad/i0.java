package ad;

/* compiled from: CoroutineExceptionHandler.kt */
/* loaded from: classes4.dex */
public final class i0 {
    public static final void a(hc.f fVar, Throwable th) {
        try {
            h0 h0Var = (h0) fVar.get(h0.f516a);
            if (h0Var != null) {
                h0Var.handleException(fVar, th);
            } else {
                fd.h.a(fVar, th);
            }
        } catch (Throwable th2) {
            fd.h.a(fVar, b(th, th2));
        }
    }

    public static final Throwable b(Throwable th, Throwable th2) {
        if (th == th2) {
            return th;
        }
        RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
        dc.b.a(runtimeException, th);
        return runtimeException;
    }
}
