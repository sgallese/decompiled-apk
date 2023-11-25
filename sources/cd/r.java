package cd;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;

/* compiled from: Channel.kt */
/* loaded from: classes4.dex */
public interface r<E> {

    /* compiled from: Channel.kt */
    /* loaded from: classes4.dex */
    public static final class a {
        public static /* synthetic */ void a(r rVar, CancellationException cancellationException, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 1) != 0) {
                    cancellationException = null;
                }
                rVar.c(cancellationException);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
        }
    }

    id.f<h<E>> a();

    void c(CancellationException cancellationException);

    Object g();

    Object i(Continuation<? super h<? extends E>> continuation);

    f<E> iterator();

    Object k(Continuation<? super E> continuation);
}
