package k1;

import java.util.concurrent.CancellationException;

/* compiled from: SuspendingPointerInputFilter.kt */
/* loaded from: classes.dex */
final class f extends CancellationException {

    /* renamed from: f  reason: collision with root package name */
    public static final f f19172f = new f();

    private f() {
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
