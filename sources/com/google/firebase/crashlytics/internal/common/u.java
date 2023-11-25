package com.google.firebase.crashlytics.internal.common;

import android.annotation.SuppressLint;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: ExecutorUtils.java */
/* loaded from: classes3.dex */
public final class u {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ExecutorUtils.java */
    /* loaded from: classes3.dex */
    public class a implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f11479a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AtomicLong f11480b;

        /* compiled from: ExecutorUtils.java */
        /* renamed from: com.google.firebase.crashlytics.internal.common.u$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        class C0248a extends c {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ Runnable f11481f;

            C0248a(Runnable runnable) {
                this.f11481f = runnable;
            }

            @Override // com.google.firebase.crashlytics.internal.common.c
            public void a() {
                this.f11481f.run();
            }
        }

        a(String str, AtomicLong atomicLong) {
            this.f11479a = str;
            this.f11480b = atomicLong;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread newThread = Executors.defaultThreadFactory().newThread(new C0248a(runnable));
            newThread.setName(this.f11479a + this.f11480b.getAndIncrement());
            return newThread;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ExecutorUtils.java */
    /* loaded from: classes3.dex */
    public class b extends c {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f11483f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ ExecutorService f11484m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ long f11485p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ TimeUnit f11486q;

        b(String str, ExecutorService executorService, long j10, TimeUnit timeUnit) {
            this.f11483f = str;
            this.f11484m = executorService;
            this.f11485p = j10;
            this.f11486q = timeUnit;
        }

        @Override // com.google.firebase.crashlytics.internal.common.c
        public void a() {
            try {
                n8.f.f().b("Executing shutdown hook for " + this.f11483f);
                this.f11484m.shutdown();
                if (!this.f11484m.awaitTermination(this.f11485p, this.f11486q)) {
                    n8.f.f().b(this.f11483f + " did not shut down in the allocated time. Requesting immediate shutdown.");
                    this.f11484m.shutdownNow();
                }
            } catch (InterruptedException unused) {
                n8.f.f().b(String.format(Locale.US, "Interrupted while waiting for %s to shut down. Requesting immediate shutdown.", this.f11483f));
                this.f11484m.shutdownNow();
            }
        }
    }

    private static void a(String str, ExecutorService executorService) {
        b(str, executorService, 2L, TimeUnit.SECONDS);
    }

    @SuppressLint({"ThreadPoolCreation"})
    private static void b(String str, ExecutorService executorService, long j10, TimeUnit timeUnit) {
        Runtime.getRuntime().addShutdownHook(new Thread(new b(str, executorService, j10, timeUnit), "Crashlytics Shutdown Hook for " + str));
    }

    public static ExecutorService c(String str) {
        ExecutorService e10 = e(d(str), new ThreadPoolExecutor.DiscardPolicy());
        a(str, e10);
        return e10;
    }

    public static ThreadFactory d(String str) {
        return new a(str, new AtomicLong(1L));
    }

    @SuppressLint({"ThreadPoolCreation"})
    private static ExecutorService e(ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
        return Executors.unconfigurableExecutorService(new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), threadFactory, rejectedExecutionHandler));
    }
}
