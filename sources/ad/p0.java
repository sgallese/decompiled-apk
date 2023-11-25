package ad;

import ad.h1;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* compiled from: DefaultExecutor.kt */
/* loaded from: classes4.dex */
public final class p0 extends h1 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* renamed from: u  reason: collision with root package name */
    public static final p0 f546u;

    /* renamed from: v  reason: collision with root package name */
    private static final long f547v;

    static {
        Long l10;
        p0 p0Var = new p0();
        f546u = p0Var;
        g1.X0(p0Var, false, 1, null);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l10 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l10 = 1000L;
        }
        f547v = timeUnit.toNanos(l10.longValue());
    }

    private p0() {
    }

    private final synchronized void t1() {
        if (!w1()) {
            return;
        }
        debugStatus = 3;
        n1();
        qc.q.g(this, "null cannot be cast to non-null type java.lang.Object");
        notifyAll();
    }

    private final synchronized Thread u1() {
        Thread thread;
        thread = _thread;
        if (thread == null) {
            thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
            _thread = thread;
            thread.setDaemon(true);
            thread.start();
        }
        return thread;
    }

    private final boolean v1() {
        if (debugStatus == 4) {
            return true;
        }
        return false;
    }

    private final boolean w1() {
        int i10 = debugStatus;
        if (i10 != 2 && i10 != 3) {
            return false;
        }
        return true;
    }

    private final synchronized boolean x1() {
        if (w1()) {
            return false;
        }
        debugStatus = 1;
        qc.q.g(this, "null cannot be cast to non-null type java.lang.Object");
        notifyAll();
        return true;
    }

    private final void y1() {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // ad.i1
    protected Thread d1() {
        Thread thread = _thread;
        if (thread == null) {
            return u1();
        }
        return thread;
    }

    @Override // ad.i1
    protected void e1(long j10, h1.c cVar) {
        y1();
    }

    @Override // ad.h1
    public void j1(Runnable runnable) {
        if (v1()) {
            y1();
        }
        super.j1(runnable);
    }

    @Override // ad.h1, ad.t0
    public c1 p0(long j10, Runnable runnable, hc.f fVar) {
        return q1(j10, runnable);
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean l12;
        u2.f562a.d(this);
        c.a();
        try {
            if (!x1()) {
                if (!l12) {
                    return;
                }
                return;
            }
            long j10 = Long.MAX_VALUE;
            while (true) {
                Thread.interrupted();
                long a12 = a1();
                if (a12 == Long.MAX_VALUE) {
                    c.a();
                    long nanoTime = System.nanoTime();
                    if (j10 == Long.MAX_VALUE) {
                        j10 = f547v + nanoTime;
                    }
                    long j11 = j10 - nanoTime;
                    if (j11 > 0) {
                        a12 = vc.l.i(a12, j11);
                    } else {
                        _thread = null;
                        t1();
                        c.a();
                        if (!l1()) {
                            d1();
                            return;
                        }
                        return;
                    }
                } else {
                    j10 = Long.MAX_VALUE;
                }
                if (a12 > 0) {
                    if (w1()) {
                        _thread = null;
                        t1();
                        c.a();
                        if (!l1()) {
                            d1();
                            return;
                        }
                        return;
                    }
                    c.a();
                    LockSupport.parkNanos(this, a12);
                }
            }
        } finally {
            _thread = null;
            t1();
            c.a();
            if (!l1()) {
                d1();
            }
        }
    }

    @Override // ad.h1, ad.g1
    public void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }
}
