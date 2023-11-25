package ad;

import kotlin.coroutines.Continuation;

/* compiled from: CancellableContinuation.kt */
/* loaded from: classes4.dex */
public interface m<T> extends Continuation<T> {

    /* compiled from: CancellableContinuation.kt */
    /* loaded from: classes4.dex */
    public static final class a {
        public static /* synthetic */ boolean a(m mVar, Throwable th, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 1) != 0) {
                    th = null;
                }
                return mVar.o(th);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
        }
    }

    void d(T t10, pc.l<? super Throwable, dc.w> lVar);

    void f(g0 g0Var, T t10);

    void n(pc.l<? super Throwable, dc.w> lVar);

    boolean o(Throwable th);

    Object t(T t10, Object obj, pc.l<? super Throwable, dc.w> lVar);

    void w(Object obj);
}
