package cd;

import dc.w;
import kotlin.coroutines.Continuation;

/* compiled from: Channel.kt */
/* loaded from: classes4.dex */
public interface s<E> {

    /* compiled from: Channel.kt */
    /* loaded from: classes4.dex */
    public static final class a {
        public static /* synthetic */ boolean a(s sVar, Throwable th, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 1) != 0) {
                    th = null;
                }
                return sVar.l(th);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: close");
        }
    }

    void h(pc.l<? super Throwable, w> lVar);

    boolean l(Throwable th);

    Object p(E e10);

    Object r(E e10, Continuation<? super w> continuation);

    boolean s();
}
