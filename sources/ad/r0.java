package ad;

import kotlin.coroutines.Continuation;

/* compiled from: Deferred.kt */
/* loaded from: classes4.dex */
public interface r0<T> extends x1 {
    Object E(Continuation<? super T> continuation);

    T getCompleted();
}
