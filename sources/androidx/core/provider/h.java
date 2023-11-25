package androidx.core.provider;

import android.os.Handler;
import android.os.Process;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: RequestExecutor.java */
/* loaded from: classes.dex */
class h {

    /* compiled from: RequestExecutor.java */
    /* loaded from: classes.dex */
    private static class a implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        private String f3995a;

        /* renamed from: b  reason: collision with root package name */
        private int f3996b;

        /* compiled from: RequestExecutor.java */
        /* renamed from: androidx.core.provider.h$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        private static class C0074a extends Thread {

            /* renamed from: f  reason: collision with root package name */
            private final int f3997f;

            C0074a(Runnable runnable, String str, int i10) {
                super(runnable, str);
                this.f3997f = i10;
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(this.f3997f);
                super.run();
            }
        }

        a(String str, int i10) {
            this.f3995a = str;
            this.f3996b = i10;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new C0074a(runnable, this.f3995a, this.f3996b);
        }
    }

    /* compiled from: RequestExecutor.java */
    /* loaded from: classes.dex */
    private static class b<T> implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        private Callable<T> f3998f;

        /* renamed from: m  reason: collision with root package name */
        private androidx.core.util.a<T> f3999m;

        /* renamed from: p  reason: collision with root package name */
        private Handler f4000p;

        /* compiled from: RequestExecutor.java */
        /* loaded from: classes.dex */
        class a implements Runnable {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ androidx.core.util.a f4001f;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ Object f4002m;

            a(androidx.core.util.a aVar, Object obj) {
                this.f4001f = aVar;
                this.f4002m = obj;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public void run() {
                this.f4001f.a(this.f4002m);
            }
        }

        b(Handler handler, Callable<T> callable, androidx.core.util.a<T> aVar) {
            this.f3998f = callable;
            this.f3999m = aVar;
            this.f4000p = handler;
        }

        @Override // java.lang.Runnable
        public void run() {
            T t10;
            try {
                t10 = this.f3998f.call();
            } catch (Exception unused) {
                t10 = null;
            }
            this.f4000p.post(new a(this.f3999m, t10));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ThreadPoolExecutor a(String str, int i10, int i11) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, i11, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new a(str, i10));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> void b(Executor executor, Callable<T> callable, androidx.core.util.a<T> aVar) {
        executor.execute(new b(androidx.core.provider.b.a(), callable, aVar));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> T c(ExecutorService executorService, Callable<T> callable, int i10) throws InterruptedException {
        try {
            return executorService.submit(callable).get(i10, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e10) {
            throw e10;
        } catch (ExecutionException e11) {
            throw new RuntimeException(e11);
        } catch (TimeoutException unused) {
            throw new InterruptedException("timeout");
        }
    }
}
