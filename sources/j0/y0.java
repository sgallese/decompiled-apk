package j0;

import hc.f;
import kotlin.coroutines.Continuation;

/* compiled from: MonotonicFrameClock.kt */
/* loaded from: classes.dex */
public interface y0 extends f.b {

    /* renamed from: k  reason: collision with root package name */
    public static final b f18923k = b.f18924f;

    /* compiled from: MonotonicFrameClock.kt */
    /* loaded from: classes.dex */
    public static final class a {
        public static <R> R a(y0 y0Var, R r10, pc.p<? super R, ? super f.b, ? extends R> pVar) {
            qc.q.i(pVar, "operation");
            return (R) f.b.a.a(y0Var, r10, pVar);
        }

        public static <E extends f.b> E b(y0 y0Var, f.c<E> cVar) {
            qc.q.i(cVar, "key");
            return (E) f.b.a.b(y0Var, cVar);
        }

        public static hc.f c(y0 y0Var, f.c<?> cVar) {
            qc.q.i(cVar, "key");
            return f.b.a.c(y0Var, cVar);
        }

        public static hc.f d(y0 y0Var, hc.f fVar) {
            qc.q.i(fVar, "context");
            return f.b.a.d(y0Var, fVar);
        }
    }

    /* compiled from: MonotonicFrameClock.kt */
    /* loaded from: classes.dex */
    public static final class b implements f.c<y0> {

        /* renamed from: f  reason: collision with root package name */
        static final /* synthetic */ b f18924f = new b();

        private b() {
        }
    }

    <R> Object R(pc.l<? super Long, ? extends R> lVar, Continuation<? super R> continuation);
}
