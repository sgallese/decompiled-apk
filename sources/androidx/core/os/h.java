package androidx.core.os;

import android.os.OutcomeReceiver;
import dc.m;
import java.lang.Throwable;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.Continuation;

/* compiled from: OutcomeReceiver.kt */
/* loaded from: classes.dex */
final class h<R, E extends Throwable> extends AtomicBoolean implements OutcomeReceiver<R, E> {

    /* renamed from: f  reason: collision with root package name */
    private final Continuation<R> f3941f;

    /* JADX WARN: Multi-variable type inference failed */
    public h(Continuation<? super R> continuation) {
        super(false);
        this.f3941f = continuation;
    }

    @Override // android.os.OutcomeReceiver
    public void onError(E e10) {
        if (compareAndSet(false, true)) {
            Continuation<R> continuation = this.f3941f;
            m.a aVar = dc.m.f13253f;
            continuation.resumeWith(dc.m.a(dc.n.a(e10)));
        }
    }

    @Override // android.os.OutcomeReceiver
    public void onResult(R r10) {
        if (compareAndSet(false, true)) {
            this.f3941f.resumeWith(dc.m.a(r10));
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public String toString() {
        return "ContinuationOutcomeReceiver(outcomeReceived = " + get() + ')';
    }
}
