package ad;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: Executors.kt */
/* loaded from: classes4.dex */
public final class n1 extends m1 implements t0 {

    /* renamed from: p  reason: collision with root package name */
    private final Executor f542p;

    public n1(Executor executor) {
        this.f542p = executor;
        fd.c.a(J0());
    }

    private final void I0(hc.f fVar, RejectedExecutionException rejectedExecutionException) {
        a2.d(fVar, l1.a("The task was rejected", rejectedExecutionException));
    }

    private final ScheduledFuture<?> N0(ScheduledExecutorService scheduledExecutorService, Runnable runnable, hc.f fVar, long j10) {
        try {
            return scheduledExecutorService.schedule(runnable, j10, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e10) {
            I0(fVar, e10);
            return null;
        }
    }

    @Override // ad.g0
    public void A0(hc.f fVar, Runnable runnable) {
        try {
            Executor J0 = J0();
            c.a();
            J0.execute(runnable);
        } catch (RejectedExecutionException e10) {
            c.a();
            I0(fVar, e10);
            a1.b().A0(fVar, runnable);
        }
    }

    public Executor J0() {
        return this.f542p;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        ExecutorService executorService;
        Executor J0 = J0();
        if (J0 instanceof ExecutorService) {
            executorService = (ExecutorService) J0;
        } else {
            executorService = null;
        }
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public boolean equals(Object obj) {
        if ((obj instanceof n1) && ((n1) obj).J0() == J0()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return System.identityHashCode(J0());
    }

    @Override // ad.t0
    public void j(long j10, m<? super dc.w> mVar) {
        ScheduledExecutorService scheduledExecutorService;
        Executor J0 = J0();
        ScheduledFuture<?> scheduledFuture = null;
        if (J0 instanceof ScheduledExecutorService) {
            scheduledExecutorService = (ScheduledExecutorService) J0;
        } else {
            scheduledExecutorService = null;
        }
        if (scheduledExecutorService != null) {
            scheduledFuture = N0(scheduledExecutorService, new p2(this, mVar), mVar.getContext(), j10);
        }
        if (scheduledFuture != null) {
            a2.h(mVar, scheduledFuture);
        } else {
            p0.f546u.j(j10, mVar);
        }
    }

    @Override // ad.t0
    public c1 p0(long j10, Runnable runnable, hc.f fVar) {
        ScheduledExecutorService scheduledExecutorService;
        Executor J0 = J0();
        ScheduledFuture<?> scheduledFuture = null;
        if (J0 instanceof ScheduledExecutorService) {
            scheduledExecutorService = (ScheduledExecutorService) J0;
        } else {
            scheduledExecutorService = null;
        }
        if (scheduledExecutorService != null) {
            scheduledFuture = N0(scheduledExecutorService, runnable, fVar, j10);
        }
        if (scheduledFuture != null) {
            return new b1(scheduledFuture);
        }
        return p0.f546u.p0(j10, runnable, fVar);
    }

    @Override // ad.g0
    public String toString() {
        return J0().toString();
    }
}
