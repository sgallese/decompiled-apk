package s;

import java.util.concurrent.CancellationException;

/* compiled from: InternalMutatorMutex.kt */
/* loaded from: classes.dex */
final class s0 extends CancellationException {
    public s0() {
        super("Mutation interrupted");
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
