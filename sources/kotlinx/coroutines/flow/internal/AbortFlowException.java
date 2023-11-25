package kotlinx.coroutines.flow.internal;

import dd.h;
import java.util.concurrent.CancellationException;

/* compiled from: FlowExceptions.kt */
/* loaded from: classes4.dex */
public final class AbortFlowException extends CancellationException {

    /* renamed from: f  reason: collision with root package name */
    public final transient h<?> f19465f;

    public AbortFlowException(h<?> hVar) {
        super("Flow was aborted, no more elements needed");
        this.f19465f = hVar;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
