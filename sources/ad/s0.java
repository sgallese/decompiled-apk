package ad;

import kotlin.coroutines.Continuation;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Builders.common.kt */
/* loaded from: classes4.dex */
public class s0<T> extends a<T> implements r0<T> {
    public s0(hc.f fVar, boolean z10) {
        super(fVar, true, z10);
    }

    static /* synthetic */ <T> Object X0(s0<T> s0Var, Continuation<? super T> continuation) {
        Object D = s0Var.D(continuation);
        ic.d.d();
        return D;
    }

    @Override // ad.r0
    public Object E(Continuation<? super T> continuation) {
        return X0(this, continuation);
    }

    @Override // ad.r0
    public T getCompleted() {
        return (T) Z();
    }
}
