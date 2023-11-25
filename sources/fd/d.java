package fd;

/* compiled from: ConcurrentLinkedList.kt */
/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a */
    private static final g0 f15623a = new g0("CLOSED");

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [fd.e] */
    public static final <N extends e<N>> N b(N n10) {
        while (true) {
            Object f10 = n10.f();
            if (f10 == f15623a) {
                return n10;
            }
            ?? r02 = (e) f10;
            if (r02 == 0) {
                if (n10.j()) {
                    return n10;
                }
            } else {
                n10 = r02;
            }
        }
    }

    public static final <S extends d0<S>> Object c(S s10, long j10, pc.p<? super Long, ? super S, ? extends S> pVar) {
        while (true) {
            if (s10.f15625p < j10 || s10.h()) {
                Object f10 = s10.f();
                if (f10 == f15623a) {
                    return e0.a(f15623a);
                }
                S s11 = (S) ((e) f10);
                if (s11 == null) {
                    s11 = pVar.invoke(Long.valueOf(s10.f15625p + 1), s10);
                    if (s10.l(s11)) {
                        if (s10.h()) {
                            s10.k();
                        }
                    }
                }
                s10 = s11;
            } else {
                return e0.a(s10);
            }
        }
    }
}
