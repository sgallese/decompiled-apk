package v8;

import android.annotation.SuppressLint;
import android.database.SQLException;
import android.os.SystemClock;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.crashlytics.internal.common.p;
import com.google.firebase.crashlytics.internal.common.t0;
import g6.f;
import g6.h;
import i6.l;
import java.util.Locale;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import r8.b0;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ReportQueue.java */
/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    private final double f25091a;

    /* renamed from: b  reason: collision with root package name */
    private final double f25092b;

    /* renamed from: c  reason: collision with root package name */
    private final long f25093c;

    /* renamed from: d  reason: collision with root package name */
    private final long f25094d;

    /* renamed from: e  reason: collision with root package name */
    private final int f25095e;

    /* renamed from: f  reason: collision with root package name */
    private final BlockingQueue<Runnable> f25096f;

    /* renamed from: g  reason: collision with root package name */
    private final ThreadPoolExecutor f25097g;

    /* renamed from: h  reason: collision with root package name */
    private final f<b0> f25098h;

    /* renamed from: i  reason: collision with root package name */
    private final com.google.firebase.crashlytics.internal.common.b0 f25099i;

    /* renamed from: j  reason: collision with root package name */
    private int f25100j;

    /* renamed from: k  reason: collision with root package name */
    private long f25101k;

    /* compiled from: ReportQueue.java */
    /* loaded from: classes3.dex */
    private final class b implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        private final p f25102f;

        /* renamed from: m  reason: collision with root package name */
        private final TaskCompletionSource<p> f25103m;

        @Override // java.lang.Runnable
        public void run() {
            e.this.p(this.f25102f, this.f25103m);
            e.this.f25099i.c();
            double g10 = e.this.g();
            n8.f.f().b("Delay for: " + String.format(Locale.US, "%.2f", Double.valueOf(g10 / 1000.0d)) + " s for report: " + this.f25102f.d());
            e.q(g10);
        }

        private b(p pVar, TaskCompletionSource<p> taskCompletionSource) {
            this.f25102f = pVar;
            this.f25103m = taskCompletionSource;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(f<b0> fVar, w8.d dVar, com.google.firebase.crashlytics.internal.common.b0 b0Var) {
        this(dVar.f25449f, dVar.f25450g, dVar.f25451h * 1000, fVar, b0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public double g() {
        return Math.min(3600000.0d, (60000.0d / this.f25091a) * Math.pow(this.f25092b, h()));
    }

    private int h() {
        int max;
        if (this.f25101k == 0) {
            this.f25101k = o();
        }
        int o10 = (int) ((o() - this.f25101k) / this.f25093c);
        if (l()) {
            max = Math.min(100, this.f25100j + o10);
        } else {
            max = Math.max(0, this.f25100j - o10);
        }
        if (this.f25100j != max) {
            this.f25100j = max;
            this.f25101k = o();
        }
        return max;
    }

    private boolean k() {
        if (this.f25096f.size() < this.f25095e) {
            return true;
        }
        return false;
    }

    private boolean l() {
        if (this.f25096f.size() == this.f25095e) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m(CountDownLatch countDownLatch) {
        try {
            l.a(this.f25098h, g6.d.HIGHEST);
        } catch (SQLException unused) {
        }
        countDownLatch.countDown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n(TaskCompletionSource taskCompletionSource, boolean z10, p pVar, Exception exc) {
        if (exc != null) {
            taskCompletionSource.trySetException(exc);
            return;
        }
        if (z10) {
            j();
        }
        taskCompletionSource.trySetResult(pVar);
    }

    private long o() {
        return System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p(final p pVar, final TaskCompletionSource<p> taskCompletionSource) {
        final boolean z10;
        n8.f.f().b("Sending report through Google DataTransport: " + pVar.d());
        if (SystemClock.elapsedRealtime() - this.f25094d < 2000) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f25098h.b(g6.c.e(pVar.b()), new h() { // from class: v8.c
            @Override // g6.h
            public final void a(Exception exc) {
                e.this.n(taskCompletionSource, z10, pVar, exc);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void q(double d10) {
        try {
            Thread.sleep((long) d10);
        } catch (InterruptedException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public TaskCompletionSource<p> i(p pVar, boolean z10) {
        synchronized (this.f25096f) {
            TaskCompletionSource<p> taskCompletionSource = new TaskCompletionSource<>();
            if (z10) {
                this.f25099i.b();
                if (k()) {
                    n8.f.f().b("Enqueueing report: " + pVar.d());
                    n8.f.f().b("Queue size: " + this.f25096f.size());
                    this.f25097g.execute(new b(pVar, taskCompletionSource));
                    n8.f.f().b("Closing task for report: " + pVar.d());
                    taskCompletionSource.trySetResult(pVar);
                    return taskCompletionSource;
                }
                h();
                n8.f.f().b("Dropping report due to queue being full: " + pVar.d());
                this.f25099i.a();
                taskCompletionSource.trySetResult(pVar);
                return taskCompletionSource;
            }
            p(pVar, taskCompletionSource);
            return taskCompletionSource;
        }
    }

    @SuppressLint({"DiscouragedApi", "ThreadPoolCreation"})
    public void j() {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        new Thread(new Runnable() { // from class: v8.d
            @Override // java.lang.Runnable
            public final void run() {
                e.this.m(countDownLatch);
            }
        }).start();
        t0.g(countDownLatch, 2L, TimeUnit.SECONDS);
    }

    @SuppressLint({"ThreadPoolCreation"})
    e(double d10, double d11, long j10, f<b0> fVar, com.google.firebase.crashlytics.internal.common.b0 b0Var) {
        this.f25091a = d10;
        this.f25092b = d11;
        this.f25093c = j10;
        this.f25098h = fVar;
        this.f25099i = b0Var;
        this.f25094d = SystemClock.elapsedRealtime();
        int i10 = (int) d10;
        this.f25095e = i10;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i10);
        this.f25096f = arrayBlockingQueue;
        this.f25097g = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.f25100j = 0;
        this.f25101k = 0L;
    }
}
