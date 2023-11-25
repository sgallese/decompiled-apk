package kotlin.coroutines.jvm.internal;

import dc.m;
import dc.n;
import dc.w;
import java.io.Serializable;
import kotlin.coroutines.Continuation;
import qc.q;

/* compiled from: ContinuationImpl.kt */
/* loaded from: classes4.dex */
public abstract class a implements Continuation<Object>, e, Serializable {
    private final Continuation<Object> completion;

    public a(Continuation<Object> continuation) {
        this.completion = continuation;
    }

    public Continuation<w> create(Continuation<?> continuation) {
        q.i(continuation, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    public e getCallerFrame() {
        Continuation<Object> continuation = this.completion;
        if (continuation instanceof e) {
            return (e) continuation;
        }
        return null;
    }

    public final Continuation<Object> getCompletion() {
        return this.completion;
    }

    public StackTraceElement getStackTraceElement() {
        return g.d(this);
    }

    protected abstract Object invokeSuspend(Object obj);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object obj) {
        Object invokeSuspend;
        Object d10;
        Continuation continuation = this;
        while (true) {
            h.b(continuation);
            a aVar = (a) continuation;
            Continuation continuation2 = aVar.completion;
            q.f(continuation2);
            try {
                invokeSuspend = aVar.invokeSuspend(obj);
                d10 = ic.d.d();
            } catch (Throwable th) {
                m.a aVar2 = m.f13253f;
                obj = m.a(n.a(th));
            }
            if (invokeSuspend == d10) {
                return;
            }
            obj = m.a(invokeSuspend);
            aVar.releaseIntercepted();
            if (continuation2 instanceof a) {
                continuation = continuation2;
            } else {
                continuation2.resumeWith(obj);
                return;
            }
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb2.append(stackTraceElement);
        return sb2.toString();
    }

    public Continuation<w> create(Object obj, Continuation<?> continuation) {
        q.i(continuation, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    protected void releaseIntercepted() {
    }
}
