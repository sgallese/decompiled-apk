package cd;

import kotlin.coroutines.Continuation;

/* compiled from: Channel.kt */
/* loaded from: classes4.dex */
public interface f<E> {
    Object a(Continuation<? super Boolean> continuation);

    E next();
}
