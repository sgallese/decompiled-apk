package com.google.firebase.perf.session.gauges;

import android.annotation.SuppressLint;
import android.os.Process;
import android.system.Os;
import android.system.OsConstants;
import com.google.firebase.perf.util.Timer;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: CpuGaugeCollector.java */
/* loaded from: classes3.dex */
public class c {

    /* renamed from: g  reason: collision with root package name */
    private static final v9.a f11852g = v9.a.e();

    /* renamed from: h  reason: collision with root package name */
    private static final long f11853h = TimeUnit.SECONDS.toMicros(1);

    /* renamed from: e  reason: collision with root package name */
    private ScheduledFuture f11858e = null;

    /* renamed from: f  reason: collision with root package name */
    private long f11859f = -1;

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentLinkedQueue<ba.e> f11854a = new ConcurrentLinkedQueue<>();

    /* renamed from: b  reason: collision with root package name */
    private final ScheduledExecutorService f11855b = Executors.newSingleThreadScheduledExecutor();

    /* renamed from: c  reason: collision with root package name */
    private final String f11856c = "/proc/" + Integer.toString(Process.myPid()) + "/stat";

    /* renamed from: d  reason: collision with root package name */
    private final long f11857d = e();

    /* JADX INFO: Access modifiers changed from: package-private */
    @SuppressLint({"ThreadPoolCreation"})
    public c() {
    }

    private long d(long j10) {
        return Math.round((j10 / this.f11857d) * f11853h);
    }

    private long e() {
        return Os.sysconf(OsConstants._SC_CLK_TCK);
    }

    public static boolean f(long j10) {
        if (j10 <= 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(Timer timer) {
        ba.e m10 = m(timer);
        if (m10 != null) {
            this.f11854a.add(m10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(Timer timer) {
        ba.e m10 = m(timer);
        if (m10 != null) {
            this.f11854a.add(m10);
        }
    }

    private synchronized void i(final Timer timer) {
        try {
            this.f11855b.schedule(new Runnable() { // from class: com.google.firebase.perf.session.gauges.b
                @Override // java.lang.Runnable
                public final void run() {
                    c.this.g(timer);
                }
            }, 0L, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e10) {
            f11852g.j("Unable to collect Cpu Metric: " + e10.getMessage());
        }
    }

    private synchronized void j(long j10, final Timer timer) {
        this.f11859f = j10;
        try {
            this.f11858e = this.f11855b.scheduleAtFixedRate(new Runnable() { // from class: com.google.firebase.perf.session.gauges.a
                @Override // java.lang.Runnable
                public final void run() {
                    c.this.h(timer);
                }
            }, 0L, j10, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e10) {
            f11852g.j("Unable to start collecting Cpu Metrics: " + e10.getMessage());
        }
    }

    private ba.e m(Timer timer) {
        if (timer == null) {
            return null;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(this.f11856c));
            try {
                long b10 = timer.b();
                String[] split = bufferedReader.readLine().split(" ");
                ba.e build = ba.e.U().E(b10).F(d(Long.parseLong(split[14]) + Long.parseLong(split[16]))).G(d(Long.parseLong(split[13]) + Long.parseLong(split[15]))).build();
                bufferedReader.close();
                return build;
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e10) {
            f11852g.j("Unable to read 'proc/[pid]/stat' file: " + e10.getMessage());
            return null;
        } catch (ArrayIndexOutOfBoundsException e11) {
            e = e11;
            f11852g.j("Unexpected '/proc/[pid]/stat' file format encountered: " + e.getMessage());
            return null;
        } catch (NullPointerException e12) {
            e = e12;
            f11852g.j("Unexpected '/proc/[pid]/stat' file format encountered: " + e.getMessage());
            return null;
        } catch (NumberFormatException e13) {
            e = e13;
            f11852g.j("Unexpected '/proc/[pid]/stat' file format encountered: " + e.getMessage());
            return null;
        }
    }

    public void c(Timer timer) {
        i(timer);
    }

    public void k(long j10, Timer timer) {
        long j11 = this.f11857d;
        if (j11 == -1 || j11 == 0 || f(j10)) {
            return;
        }
        if (this.f11858e != null) {
            if (this.f11859f != j10) {
                l();
                j(j10, timer);
                return;
            }
            return;
        }
        j(j10, timer);
    }

    public void l() {
        ScheduledFuture scheduledFuture = this.f11858e;
        if (scheduledFuture == null) {
            return;
        }
        scheduledFuture.cancel(false);
        this.f11858e = null;
        this.f11859f = -1L;
    }
}
