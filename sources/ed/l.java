package ed;

import fd.c0;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.internal.ChildCancelledException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FlowCoroutine.kt */
/* loaded from: classes4.dex */
public final class l<T> extends c0<T> {
    public l(hc.f fVar, Continuation<? super T> continuation) {
        super(fVar, continuation);
    }

    @Override // ad.e2
    public boolean O(Throwable th) {
        if (th instanceof ChildCancelledException) {
            return true;
        }
        return H(th);
    }
}
