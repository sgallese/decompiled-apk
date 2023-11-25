package androidx.loader.content;

import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.util.Log;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: ModernAsyncTask.java */
/* loaded from: classes.dex */
abstract class c<Params, Progress, Result> {

    /* renamed from: s  reason: collision with root package name */
    private static final ThreadFactory f5105s;

    /* renamed from: t  reason: collision with root package name */
    private static final BlockingQueue<Runnable> f5106t;

    /* renamed from: u  reason: collision with root package name */
    public static final Executor f5107u;

    /* renamed from: v  reason: collision with root package name */
    private static f f5108v;

    /* renamed from: w  reason: collision with root package name */
    private static volatile Executor f5109w;

    /* renamed from: f  reason: collision with root package name */
    private final h<Params, Result> f5110f;

    /* renamed from: m  reason: collision with root package name */
    private final FutureTask<Result> f5111m;

    /* renamed from: p  reason: collision with root package name */
    private volatile g f5112p = g.PENDING;

    /* renamed from: q  reason: collision with root package name */
    final AtomicBoolean f5113q = new AtomicBoolean();

    /* renamed from: r  reason: collision with root package name */
    final AtomicBoolean f5114r = new AtomicBoolean();

    /* compiled from: ModernAsyncTask.java */
    /* loaded from: classes.dex */
    static class a implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        private final AtomicInteger f5115a = new AtomicInteger(1);

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "ModernAsyncTask #" + this.f5115a.getAndIncrement());
        }
    }

    /* compiled from: ModernAsyncTask.java */
    /* loaded from: classes.dex */
    class b extends h<Params, Result> {
        b() {
        }

        @Override // java.util.concurrent.Callable
        public Result call() throws Exception {
            c.this.f5114r.set(true);
            Result result = null;
            try {
                Process.setThreadPriority(10);
                result = (Result) c.this.b(this.f5121a);
                Binder.flushPendingCommands();
                return result;
            } finally {
            }
        }
    }

    /* compiled from: ModernAsyncTask.java */
    /* renamed from: androidx.loader.content.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0108c extends FutureTask<Result> {
        C0108c(Callable callable) {
            super(callable);
        }

        @Override // java.util.concurrent.FutureTask
        protected void done() {
            try {
                c.this.m(get());
            } catch (InterruptedException e10) {
                Log.w("AsyncTask", e10);
            } catch (CancellationException unused) {
                c.this.m(null);
            } catch (ExecutionException e11) {
                throw new RuntimeException("An error occurred while executing doInBackground()", e11.getCause());
            } catch (Throwable th) {
                throw new RuntimeException("An error occurred while executing doInBackground()", th);
            }
        }
    }

    /* compiled from: ModernAsyncTask.java */
    /* loaded from: classes.dex */
    static /* synthetic */ class d {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f5118a;

        static {
            int[] iArr = new int[g.values().length];
            f5118a = iArr;
            try {
                iArr[g.RUNNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5118a[g.FINISHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ModernAsyncTask.java */
    /* loaded from: classes.dex */
    public static class e<Data> {

        /* renamed from: a  reason: collision with root package name */
        final c f5119a;

        /* renamed from: b  reason: collision with root package name */
        final Data[] f5120b;

        e(c cVar, Data... dataArr) {
            this.f5119a = cVar;
            this.f5120b = dataArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ModernAsyncTask.java */
    /* loaded from: classes.dex */
    public static class f extends Handler {
        f() {
            super(Looper.getMainLooper());
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            e eVar = (e) message.obj;
            int i10 = message.what;
            if (i10 != 1) {
                if (i10 == 2) {
                    eVar.f5119a.k(eVar.f5120b);
                    return;
                }
                return;
            }
            eVar.f5119a.d(eVar.f5120b[0]);
        }
    }

    /* compiled from: ModernAsyncTask.java */
    /* loaded from: classes.dex */
    public enum g {
        PENDING,
        RUNNING,
        FINISHED
    }

    /* compiled from: ModernAsyncTask.java */
    /* loaded from: classes.dex */
    private static abstract class h<Params, Result> implements Callable<Result> {

        /* renamed from: a  reason: collision with root package name */
        Params[] f5121a;

        h() {
        }
    }

    static {
        a aVar = new a();
        f5105s = aVar;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(10);
        f5106t = linkedBlockingQueue;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 128, 1L, TimeUnit.SECONDS, linkedBlockingQueue, aVar);
        f5107u = threadPoolExecutor;
        f5109w = threadPoolExecutor;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c() {
        b bVar = new b();
        this.f5110f = bVar;
        this.f5111m = new C0108c(bVar);
    }

    private static Handler e() {
        f fVar;
        synchronized (c.class) {
            if (f5108v == null) {
                f5108v = new f();
            }
            fVar = f5108v;
        }
        return fVar;
    }

    public final boolean a(boolean z10) {
        this.f5113q.set(true);
        return this.f5111m.cancel(z10);
    }

    protected abstract Result b(Params... paramsArr);

    public final c<Params, Progress, Result> c(Executor executor, Params... paramsArr) {
        if (this.f5112p != g.PENDING) {
            int i10 = d.f5118a[this.f5112p.ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("We should never reach this state");
                }
                throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
            }
            throw new IllegalStateException("Cannot execute task: the task is already running.");
        }
        this.f5112p = g.RUNNING;
        j();
        this.f5110f.f5121a = paramsArr;
        executor.execute(this.f5111m);
        return this;
    }

    void d(Result result) {
        if (f()) {
            h(result);
        } else {
            i(result);
        }
        this.f5112p = g.FINISHED;
    }

    public final boolean f() {
        return this.f5113q.get();
    }

    protected void h(Result result) {
        g();
    }

    Result l(Result result) {
        e().obtainMessage(1, new e(this, result)).sendToTarget();
        return result;
    }

    void m(Result result) {
        if (!this.f5114r.get()) {
            l(result);
        }
    }

    protected void g() {
    }

    protected void j() {
    }

    protected void i(Result result) {
    }

    protected void k(Progress... progressArr) {
    }
}
