package ad;

import hc.f;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;

/* compiled from: Job.kt */
/* loaded from: classes4.dex */
public interface x1 extends f.b {

    /* renamed from: b  reason: collision with root package name */
    public static final b f574b = b.f575f;

    /* compiled from: Job.kt */
    /* loaded from: classes4.dex */
    public static final class a {
        public static /* synthetic */ void a(x1 x1Var, CancellationException cancellationException, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 1) != 0) {
                    cancellationException = null;
                }
                x1Var.c(cancellationException);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
        }

        public static <R> R b(x1 x1Var, R r10, pc.p<? super R, ? super f.b, ? extends R> pVar) {
            return (R) f.b.a.a(x1Var, r10, pVar);
        }

        public static <E extends f.b> E c(x1 x1Var, f.c<E> cVar) {
            return (E) f.b.a.b(x1Var, cVar);
        }

        public static /* synthetic */ c1 d(x1 x1Var, boolean z10, boolean z11, pc.l lVar, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 1) != 0) {
                    z10 = false;
                }
                if ((i10 & 2) != 0) {
                    z11 = true;
                }
                return x1Var.Q(z10, z11, lVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invokeOnCompletion");
        }

        public static hc.f e(x1 x1Var, f.c<?> cVar) {
            return f.b.a.c(x1Var, cVar);
        }

        public static hc.f f(x1 x1Var, hc.f fVar) {
            return f.b.a.d(x1Var, fVar);
        }
    }

    /* compiled from: Job.kt */
    /* loaded from: classes4.dex */
    public static final class b implements f.c<x1> {

        /* renamed from: f  reason: collision with root package name */
        static final /* synthetic */ b f575f = new b();

        private b() {
        }
    }

    CancellationException B();

    s L(u uVar);

    c1 Q(boolean z10, boolean z11, pc.l<? super Throwable, dc.w> lVar);

    boolean b();

    void c(CancellationException cancellationException);

    x1 getParent();

    boolean isCancelled();

    c1 s0(pc.l<? super Throwable, dc.w> lVar);

    boolean start();

    xc.g<x1> x();

    boolean x0();

    Object z(Continuation<? super dc.w> continuation);
}
