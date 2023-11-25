package androidx.compose.ui;

import java.util.concurrent.CancellationException;

/* compiled from: Modifier.kt */
/* loaded from: classes.dex */
final class f extends CancellationException {
    public f() {
        super("The Modifier.Node was detached");
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
