package kotlin.coroutines.jvm.internal;

import kotlin.coroutines.Continuation;
import qc.q;

/* compiled from: DebugProbes.kt */
/* loaded from: classes4.dex */
public final class h {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> Continuation<T> a(Continuation<? super T> continuation) {
        q.i(continuation, "completion");
        return continuation;
    }

    public static final void b(Continuation<?> continuation) {
        q.i(continuation, "frame");
    }

    public static final void c(Continuation<?> continuation) {
        q.i(continuation, "frame");
    }
}
