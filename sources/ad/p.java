package ad;

import kotlin.coroutines.Continuation;

/* compiled from: CancellableContinuation.kt */
/* loaded from: classes4.dex */
public final class p {
    public static final void a(m<?> mVar, c1 c1Var) {
        mVar.n(new d1(c1Var));
    }

    public static final <T> n<T> b(Continuation<? super T> continuation) {
        if (!(continuation instanceof fd.i)) {
            return new n<>(continuation, 1);
        }
        n<T> k10 = ((fd.i) continuation).k();
        if (k10 != null) {
            if (!k10.K()) {
                k10 = null;
            }
            if (k10 != null) {
                return k10;
            }
        }
        return new n<>(continuation, 2);
    }
}
