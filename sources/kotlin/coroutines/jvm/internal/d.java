package kotlin.coroutines.jvm.internal;

import hc.f;
import kotlin.coroutines.Continuation;
import qc.q;

/* compiled from: ContinuationImpl.kt */
/* loaded from: classes4.dex */
public abstract class d extends a {
    private final hc.f _context;
    private transient Continuation<Object> intercepted;

    public d(Continuation<Object> continuation, hc.f fVar) {
        super(continuation);
        this._context = fVar;
    }

    @Override // kotlin.coroutines.Continuation
    public hc.f getContext() {
        hc.f fVar = this._context;
        q.f(fVar);
        return fVar;
    }

    public final Continuation<Object> intercepted() {
        Continuation<Object> continuation = this.intercepted;
        if (continuation == null) {
            hc.d dVar = (hc.d) getContext().get(hc.d.f16598i);
            if (dVar == null || (continuation = dVar.m(this)) == null) {
                continuation = this;
            }
            this.intercepted = continuation;
        }
        return continuation;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.coroutines.jvm.internal.a
    public void releaseIntercepted() {
        Continuation<?> continuation = this.intercepted;
        if (continuation != null && continuation != this) {
            f.b bVar = getContext().get(hc.d.f16598i);
            q.f(bVar);
            ((hc.d) bVar).e(continuation);
        }
        this.intercepted = c.f19455f;
    }

    public d(Continuation<Object> continuation) {
        this(continuation, continuation != null ? continuation.getContext() : null);
    }
}
