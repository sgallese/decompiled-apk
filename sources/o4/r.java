package o4;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* compiled from: WorkTimer.java */
/* loaded from: classes.dex */
public class r {

    /* renamed from: f  reason: collision with root package name */
    private static final String f20529f = androidx.work.l.f("WorkTimer");

    /* renamed from: a  reason: collision with root package name */
    private final ThreadFactory f20530a;

    /* renamed from: b  reason: collision with root package name */
    private final ScheduledExecutorService f20531b;

    /* renamed from: c  reason: collision with root package name */
    final Map<String, c> f20532c;

    /* renamed from: d  reason: collision with root package name */
    final Map<String, b> f20533d;

    /* renamed from: e  reason: collision with root package name */
    final Object f20534e;

    /* compiled from: WorkTimer.java */
    /* loaded from: classes.dex */
    class a implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        private int f20535a = 0;

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
            newThread.setName("WorkManager-WorkTimer-thread-" + this.f20535a);
            this.f20535a = this.f20535a + 1;
            return newThread;
        }
    }

    /* compiled from: WorkTimer.java */
    /* loaded from: classes.dex */
    public interface b {
        void a(String str);
    }

    /* compiled from: WorkTimer.java */
    /* loaded from: classes.dex */
    public static class c implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        private final r f20537f;

        /* renamed from: m  reason: collision with root package name */
        private final String f20538m;

        c(r rVar, String str) {
            this.f20537f = rVar;
            this.f20538m = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f20537f.f20534e) {
                if (this.f20537f.f20532c.remove(this.f20538m) != null) {
                    b remove = this.f20537f.f20533d.remove(this.f20538m);
                    if (remove != null) {
                        remove.a(this.f20538m);
                    }
                } else {
                    androidx.work.l.c().a("WrkTimerRunnable", String.format("Timer with %s is already marked as complete.", this.f20538m), new Throwable[0]);
                }
            }
        }
    }

    public r() {
        a aVar = new a();
        this.f20530a = aVar;
        this.f20532c = new HashMap();
        this.f20533d = new HashMap();
        this.f20534e = new Object();
        this.f20531b = Executors.newSingleThreadScheduledExecutor(aVar);
    }

    public void a() {
        if (!this.f20531b.isShutdown()) {
            this.f20531b.shutdownNow();
        }
    }

    public void b(String str, long j10, b bVar) {
        synchronized (this.f20534e) {
            androidx.work.l.c().a(f20529f, String.format("Starting timer for %s", str), new Throwable[0]);
            c(str);
            c cVar = new c(this, str);
            this.f20532c.put(str, cVar);
            this.f20533d.put(str, bVar);
            this.f20531b.schedule(cVar, j10, TimeUnit.MILLISECONDS);
        }
    }

    public void c(String str) {
        synchronized (this.f20534e) {
            if (this.f20532c.remove(str) != null) {
                androidx.work.l.c().a(f20529f, String.format("Stopping timer for %s", str), new Throwable[0]);
                this.f20533d.remove(str);
            }
        }
    }
}
