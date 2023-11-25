package com.google.firebase.crashlytics.internal.common;

import java.lang.Thread;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: CrashlyticsUncaughtExceptionHandler.java */
/* loaded from: classes3.dex */
class q implements Thread.UncaughtExceptionHandler {

    /* renamed from: a  reason: collision with root package name */
    private final a f11459a;

    /* renamed from: b  reason: collision with root package name */
    private final w8.i f11460b;

    /* renamed from: c  reason: collision with root package name */
    private final Thread.UncaughtExceptionHandler f11461c;

    /* renamed from: d  reason: collision with root package name */
    private final n8.a f11462d;

    /* renamed from: e  reason: collision with root package name */
    private final AtomicBoolean f11463e = new AtomicBoolean(false);

    /* compiled from: CrashlyticsUncaughtExceptionHandler.java */
    /* loaded from: classes3.dex */
    interface a {
        void a(w8.i iVar, Thread thread, Throwable th);
    }

    public q(a aVar, w8.i iVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, n8.a aVar2) {
        this.f11459a = aVar;
        this.f11460b = iVar;
        this.f11461c = uncaughtExceptionHandler;
        this.f11462d = aVar2;
    }

    private boolean b(Thread thread, Throwable th) {
        if (thread == null) {
            n8.f.f().d("Crashlytics will not record uncaught exception; null thread");
            return false;
        } else if (th == null) {
            n8.f.f().d("Crashlytics will not record uncaught exception; null throwable");
            return false;
        } else if (this.f11462d.b()) {
            n8.f.f().b("Crashlytics will not record uncaught exception; native crash exists for session.");
            return false;
        } else {
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a() {
        return this.f11463e.get();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Thread$UncaughtExceptionHandler] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Thread$UncaughtExceptionHandler] */
    /* JADX WARN: Type inference failed for: r2v3, types: [n8.f] */
    /* JADX WARN: Type inference failed for: r3v1, types: [n8.f] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Thread] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Thread] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.concurrent.atomic.AtomicBoolean] */
    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        ?? r02 = "Completed exception processing. Invoking default exception handler.";
        this.f11463e.set(true);
        try {
            try {
                if (b(thread, th)) {
                    this.f11459a.a(this.f11460b, thread, th);
                } else {
                    n8.f.f().b("Uncaught exception will not be recorded by Crashlytics.");
                }
            } catch (Exception e10) {
                n8.f.f().e("An error occurred in the uncaught exception handler", e10);
            }
        } finally {
            n8.f.f().b(r02);
            this.f11461c.uncaughtException(thread, th);
            this.f11463e.set(false);
        }
    }
}
