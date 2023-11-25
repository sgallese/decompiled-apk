package kotlin.coroutines;

import hc.f;

/* compiled from: Continuation.kt */
/* loaded from: classes4.dex */
public interface Continuation<T> {
    f getContext();

    void resumeWith(Object obj);
}
