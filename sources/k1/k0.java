package k1;

import java.util.concurrent.CancellationException;

/* compiled from: SuspendingPointerInputFilter.kt */
/* loaded from: classes.dex */
final class k0 extends CancellationException {
    public k0() {
        super("Pointer input was reset");
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
