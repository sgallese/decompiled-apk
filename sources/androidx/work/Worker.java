package androidx.work;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.work.ListenableWorker;

/* loaded from: classes.dex */
public abstract class Worker extends ListenableWorker {
    androidx.work.impl.utils.futures.c<ListenableWorker.a> mFuture;

    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Worker.this.mFuture.o(Worker.this.doWork());
            } catch (Throwable th) {
                Worker.this.mFuture.p(th);
            }
        }
    }

    @Keep
    @SuppressLint({"BanKeepAnnotation"})
    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public abstract ListenableWorker.a doWork();

    @Override // androidx.work.ListenableWorker
    public final com.google.common.util.concurrent.a<ListenableWorker.a> startWork() {
        this.mFuture = androidx.work.impl.utils.futures.c.s();
        getBackgroundExecutor().execute(new a());
        return this.mFuture;
    }
}
