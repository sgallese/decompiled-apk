package com.google.firebase.crashlytics.internal.common;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: CrashlyticsBackgroundWorker.java */
/* loaded from: classes3.dex */
public class i {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f11362a;

    /* renamed from: b  reason: collision with root package name */
    private Task<Void> f11363b = Tasks.forResult(null);

    /* renamed from: c  reason: collision with root package name */
    private final Object f11364c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private final ThreadLocal<Boolean> f11365d = new ThreadLocal<>();

    /* compiled from: CrashlyticsBackgroundWorker.java */
    /* loaded from: classes3.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            i.this.f11365d.set(Boolean.TRUE);
        }
    }

    /* compiled from: CrashlyticsBackgroundWorker.java */
    /* loaded from: classes3.dex */
    class b implements Callable<Void> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Runnable f11367a;

        b(Runnable runnable) {
            this.f11367a = runnable;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public Void call() throws Exception {
            this.f11367a.run();
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: CrashlyticsBackgroundWorker.java */
    /* loaded from: classes3.dex */
    public class c<T> implements Continuation<Void, T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Callable f11369a;

        c(Callable callable) {
            this.f11369a = callable;
        }

        @Override // com.google.android.gms.tasks.Continuation
        public T then(Task<Void> task) throws Exception {
            return (T) this.f11369a.call();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: CrashlyticsBackgroundWorker.java */
    /* loaded from: classes3.dex */
    public class d<T> implements Continuation<T, Void> {
        d() {
        }

        @Override // com.google.android.gms.tasks.Continuation
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public Void then(Task<T> task) throws Exception {
            return null;
        }
    }

    public i(Executor executor) {
        this.f11362a = executor;
        executor.execute(new a());
    }

    private <T> Task<Void> d(Task<T> task) {
        return task.continueWith(this.f11362a, new d());
    }

    private boolean e() {
        return Boolean.TRUE.equals(this.f11365d.get());
    }

    private <T> Continuation<Void, T> f(Callable<T> callable) {
        return new c(callable);
    }

    public void b() {
        if (e()) {
            return;
        }
        throw new IllegalStateException("Not running on background worker thread as intended.");
    }

    public Executor c() {
        return this.f11362a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Task<Void> g(Runnable runnable) {
        return h(new b(runnable));
    }

    public <T> Task<T> h(Callable<T> callable) {
        Task<T> continueWith;
        synchronized (this.f11364c) {
            continueWith = this.f11363b.continueWith(this.f11362a, f(callable));
            this.f11363b = d(continueWith);
        }
        return continueWith;
    }

    public <T> Task<T> i(Callable<Task<T>> callable) {
        Task<T> continueWithTask;
        synchronized (this.f11364c) {
            continueWithTask = this.f11363b.continueWithTask(this.f11362a, f(callable));
            this.f11363b = d(continueWithTask);
        }
        return continueWithTask;
    }
}
