package com.google.firebase.perf.session.gauges;

import android.annotation.SuppressLint;
import com.google.firebase.perf.util.Timer;
import com.google.firebase.perf.util.n;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: MemoryGaugeCollector.java */
/* loaded from: classes3.dex */
public class l {

    /* renamed from: f  reason: collision with root package name */
    private static final v9.a f11875f = v9.a.e();

    /* renamed from: a  reason: collision with root package name */
    private final ScheduledExecutorService f11876a;

    /* renamed from: b  reason: collision with root package name */
    public final ConcurrentLinkedQueue<ba.b> f11877b;

    /* renamed from: c  reason: collision with root package name */
    private final Runtime f11878c;

    /* renamed from: d  reason: collision with root package name */
    private ScheduledFuture f11879d;

    /* renamed from: e  reason: collision with root package name */
    private long f11880e;

    /* JADX INFO: Access modifiers changed from: package-private */
    @SuppressLint({"ThreadPoolCreation"})
    public l() {
        this(Executors.newSingleThreadScheduledExecutor(), Runtime.getRuntime());
    }

    private int d() {
        return n.c(com.google.firebase.perf.util.k.BYTES.toKilobytes(this.f11878c.totalMemory() - this.f11878c.freeMemory()));
    }

    public static boolean e(long j10) {
        if (j10 <= 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f(Timer timer) {
        ba.b l10 = l(timer);
        if (l10 != null) {
            this.f11877b.add(l10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(Timer timer) {
        ba.b l10 = l(timer);
        if (l10 != null) {
            this.f11877b.add(l10);
        }
    }

    private synchronized void h(final Timer timer) {
        try {
            this.f11876a.schedule(new Runnable() { // from class: com.google.firebase.perf.session.gauges.k
                @Override // java.lang.Runnable
                public final void run() {
                    l.this.f(timer);
                }
            }, 0L, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e10) {
            f11875f.j("Unable to collect Memory Metric: " + e10.getMessage());
        }
    }

    private synchronized void i(long j10, final Timer timer) {
        this.f11880e = j10;
        try {
            this.f11879d = this.f11876a.scheduleAtFixedRate(new Runnable() { // from class: com.google.firebase.perf.session.gauges.j
                @Override // java.lang.Runnable
                public final void run() {
                    l.this.g(timer);
                }
            }, 0L, j10, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e10) {
            f11875f.j("Unable to start collecting Memory Metrics: " + e10.getMessage());
        }
    }

    private ba.b l(Timer timer) {
        if (timer == null) {
            return null;
        }
        return ba.b.T().E(timer.b()).F(d()).build();
    }

    public void c(Timer timer) {
        h(timer);
    }

    public void j(long j10, Timer timer) {
        if (e(j10)) {
            return;
        }
        if (this.f11879d != null) {
            if (this.f11880e != j10) {
                k();
                i(j10, timer);
                return;
            }
            return;
        }
        i(j10, timer);
    }

    public void k() {
        ScheduledFuture scheduledFuture = this.f11879d;
        if (scheduledFuture == null) {
            return;
        }
        scheduledFuture.cancel(false);
        this.f11879d = null;
        this.f11880e = -1L;
    }

    l(ScheduledExecutorService scheduledExecutorService, Runtime runtime) {
        this.f11879d = null;
        this.f11880e = -1L;
        this.f11876a = scheduledExecutorService;
        this.f11877b = new ConcurrentLinkedQueue<>();
        this.f11878c = runtime;
    }
}
