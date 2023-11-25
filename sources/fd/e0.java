package fd;

import fd.d0;

/* compiled from: ConcurrentLinkedList.kt */
/* loaded from: classes4.dex */
public final class e0<S extends d0<S>> {
    public static final S b(Object obj) {
        if (obj != d.f15623a) {
            qc.q.g(obj, "null cannot be cast to non-null type S of kotlinx.coroutines.internal.SegmentOrClosed");
            return (S) obj;
        }
        throw new IllegalStateException("Does not contain segment".toString());
    }

    public static final boolean c(Object obj) {
        if (obj == d.f15623a) {
            return true;
        }
        return false;
    }

    public static <S extends d0<S>> Object a(Object obj) {
        return obj;
    }
}
