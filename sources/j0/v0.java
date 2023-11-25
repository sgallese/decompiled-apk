package j0;

import java.util.concurrent.CancellationException;

/* compiled from: Effects.kt */
/* loaded from: classes.dex */
final class v0 extends CancellationException {
    public v0() {
        super("The coroutine scope left the composition");
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
