package kotlin.coroutines.jvm.internal;

import kotlin.coroutines.Continuation;

/* compiled from: ContinuationImpl.kt */
/* loaded from: classes4.dex */
public abstract class j extends a {
    public j(Continuation<Object> continuation) {
        super(continuation);
        boolean z10;
        if (continuation != null) {
            if (continuation.getContext() == hc.g.f16601f) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext".toString());
            }
        }
    }

    @Override // kotlin.coroutines.Continuation
    public hc.f getContext() {
        return hc.g.f16601f;
    }
}
