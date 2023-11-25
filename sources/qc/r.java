package qc;

import java.io.Serializable;

/* compiled from: Lambda.kt */
/* loaded from: classes4.dex */
public abstract class r<R> implements l<R>, Serializable {
    private final int arity;

    public r(int i10) {
        this.arity = i10;
    }

    @Override // qc.l
    public int getArity() {
        return this.arity;
    }

    public String toString() {
        String h10 = g0.h(this);
        q.h(h10, "renderLambdaToString(this)");
        return h10;
    }
}
