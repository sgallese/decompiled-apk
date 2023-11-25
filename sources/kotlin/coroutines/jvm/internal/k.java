package kotlin.coroutines.jvm.internal;

import kotlin.coroutines.Continuation;
import qc.g0;
import qc.q;

/* compiled from: ContinuationImpl.kt */
/* loaded from: classes4.dex */
public abstract class k extends j implements qc.l<Object> {

    /* renamed from: f  reason: collision with root package name */
    private final int f19462f;

    public k(int i10, Continuation<Object> continuation) {
        super(continuation);
        this.f19462f = i10;
    }

    @Override // qc.l
    public int getArity() {
        return this.f19462f;
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
}
