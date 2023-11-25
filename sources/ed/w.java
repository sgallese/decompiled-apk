package ed;

import kotlin.coroutines.Continuation;

/* compiled from: ChannelFlow.kt */
/* loaded from: classes4.dex */
final class w<T> implements Continuation<T>, kotlin.coroutines.jvm.internal.e {

    /* renamed from: f  reason: collision with root package name */
    private final Continuation<T> f14293f;

    /* renamed from: m  reason: collision with root package name */
    private final hc.f f14294m;

    /* JADX WARN: Multi-variable type inference failed */
    public w(Continuation<? super T> continuation, hc.f fVar) {
        this.f14293f = continuation;
        this.f14294m = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.e
    public kotlin.coroutines.jvm.internal.e getCallerFrame() {
        Continuation<T> continuation = this.f14293f;
        if (continuation instanceof kotlin.coroutines.jvm.internal.e) {
            return (kotlin.coroutines.jvm.internal.e) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.Continuation
    public hc.f getContext() {
        return this.f14294m;
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(Object obj) {
        this.f14293f.resumeWith(obj);
    }
}
