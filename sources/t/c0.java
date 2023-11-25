package t;

import java.util.concurrent.CancellationException;

/* compiled from: MutatorMutex.kt */
/* loaded from: classes.dex */
final class c0 extends CancellationException {
    public c0() {
        super("Mutation interrupted");
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
