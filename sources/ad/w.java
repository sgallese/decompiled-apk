package ad;

import kotlin.coroutines.Continuation;

/* compiled from: CompletableDeferred.kt */
/* loaded from: classes4.dex */
final class w<T> extends e2 implements v<T> {
    public w(x1 x1Var) {
        super(true);
        m0(x1Var);
    }

    @Override // ad.r0
    public Object E(Continuation<? super T> continuation) {
        Object D = D(continuation);
        ic.d.d();
        return D;
    }

    @Override // ad.e2
    public boolean d0() {
        return true;
    }

    @Override // ad.r0
    public T getCompleted() {
        return (T) Z();
    }

    @Override // ad.v
    public boolean i0(T t10) {
        return t0(t10);
    }
}
