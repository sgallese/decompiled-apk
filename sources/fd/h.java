package fd;

import java.util.Iterator;
import kotlinx.coroutines.internal.DiagnosticCoroutineContextException;
import kotlinx.coroutines.internal.ExceptionSuccessfullyProcessed;

/* compiled from: CoroutineExceptionHandlerImpl.common.kt */
/* loaded from: classes4.dex */
public final class h {
    public static final void a(hc.f fVar, Throwable th) {
        Iterator<ad.h0> it = g.a().iterator();
        while (it.hasNext()) {
            try {
                it.next().handleException(fVar, th);
            } catch (ExceptionSuccessfullyProcessed unused) {
                return;
            } catch (Throwable th2) {
                g.b(ad.i0.b(th, th2));
            }
        }
        try {
            dc.b.a(th, new DiagnosticCoroutineContextException(fVar));
        } catch (Throwable unused2) {
        }
        g.b(th);
    }
}
