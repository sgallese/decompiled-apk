package kotlinx.coroutines;

import ad.x1;
import java.util.concurrent.CancellationException;
import qc.q;

/* compiled from: Exceptions.kt */
/* loaded from: classes4.dex */
public final class JobCancellationException extends CancellationException {

    /* renamed from: f  reason: collision with root package name */
    public final transient x1 f19463f;

    public JobCancellationException(String str, Throwable th, x1 x1Var) {
        super(str);
        this.f19463f = x1Var;
        if (th != null) {
            initCause(th);
        }
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof JobCancellationException) {
                JobCancellationException jobCancellationException = (JobCancellationException) obj;
                if (!q.d(jobCancellationException.getMessage(), getMessage()) || !q.d(jobCancellationException.f19463f, this.f19463f) || !q.d(jobCancellationException.getCause(), getCause())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public int hashCode() {
        int i10;
        String message = getMessage();
        q.f(message);
        int hashCode = ((message.hashCode() * 31) + this.f19463f.hashCode()) * 31;
        Throwable cause = getCause();
        if (cause != null) {
            i10 = cause.hashCode();
        } else {
            i10 = 0;
        }
        return hashCode + i10;
    }

    @Override // java.lang.Throwable
    public String toString() {
        return super.toString() + "; job=" + this.f19463f;
    }
}
