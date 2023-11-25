package r9;

import android.annotation.SuppressLint;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: PoolableExecutors.java */
/* loaded from: classes3.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private static final r9.a f22532a;

    /* renamed from: b  reason: collision with root package name */
    private static volatile r9.a f22533b;

    /* compiled from: PoolableExecutors.java */
    /* renamed from: r9.b$b  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    private static class C0519b implements r9.a {
        private C0519b() {
        }

        @Override // r9.a
        public ExecutorService a(ThreadFactory threadFactory, c cVar) {
            return b(1, threadFactory, cVar);
        }

        @SuppressLint({"ThreadPoolCreation"})
        public ExecutorService b(int i10, ThreadFactory threadFactory, c cVar) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i10, i10, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            return Executors.unconfigurableExecutorService(threadPoolExecutor);
        }
    }

    static {
        C0519b c0519b = new C0519b();
        f22532a = c0519b;
        f22533b = c0519b;
    }

    public static r9.a a() {
        return f22533b;
    }
}
