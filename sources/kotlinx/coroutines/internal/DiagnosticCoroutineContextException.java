package kotlinx.coroutines.internal;

import hc.f;

/* compiled from: CoroutineExceptionHandlerImpl.kt */
/* loaded from: classes4.dex */
public final class DiagnosticCoroutineContextException extends RuntimeException {

    /* renamed from: f  reason: collision with root package name */
    private final transient f f19466f;

    public DiagnosticCoroutineContextException(f fVar) {
        this.f19466f = fVar;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public String getLocalizedMessage() {
        return this.f19466f.toString();
    }
}
