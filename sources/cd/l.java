package cd;

import ad.l1;
import java.util.concurrent.CancellationException;

/* compiled from: Channels.common.kt */
/* loaded from: classes4.dex */
final /* synthetic */ class l {
    public static final void a(r<?> rVar, Throwable th) {
        CancellationException cancellationException = null;
        if (th != null) {
            if (th instanceof CancellationException) {
                cancellationException = (CancellationException) th;
            }
            if (cancellationException == null) {
                cancellationException = l1.a("Channel was consumed, consumer had failed", th);
            }
        }
        rVar.c(cancellationException);
    }
}
