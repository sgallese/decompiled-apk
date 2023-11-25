package kotlin.coroutines.jvm.internal;

import kotlin.coroutines.Continuation;
import qc.g0;
import qc.q;

/* compiled from: ContinuationImpl.kt */
/* loaded from: classes4.dex */
public abstract class l extends d implements qc.l<Object> {
    private final int arity;

    public l(int i10, Continuation<Object> continuation) {
        super(continuation);
        this.arity = i10;
    }

    @Override // qc.l
    public int getArity() {
        return this.arity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public String toString() {
        if (getCompletion() == null) {
            String g10 = g0.g(this);
            q.h(g10, "renderLambdaToString(this)");
            return g10;
        }
        return super.toString();
    }

    public l(int i10) {
        this(i10, null);
    }
}
