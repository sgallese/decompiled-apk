package com.google.firebase.concurrent;

import android.os.Process;
import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CustomThreadFactory.java */
/* loaded from: classes3.dex */
public class b implements ThreadFactory {

    /* renamed from: e  reason: collision with root package name */
    private static final ThreadFactory f11286e = Executors.defaultThreadFactory();

    /* renamed from: a  reason: collision with root package name */
    private final AtomicLong f11287a = new AtomicLong();

    /* renamed from: b  reason: collision with root package name */
    private final String f11288b;

    /* renamed from: c  reason: collision with root package name */
    private final int f11289c;

    /* renamed from: d  reason: collision with root package name */
    private final StrictMode.ThreadPolicy f11290d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(String str, int i10, StrictMode.ThreadPolicy threadPolicy) {
        this.f11288b = str;
        this.f11289c = i10;
        this.f11290d = threadPolicy;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(Runnable runnable) {
        Process.setThreadPriority(this.f11289c);
        StrictMode.ThreadPolicy threadPolicy = this.f11290d;
        if (threadPolicy != null) {
            StrictMode.setThreadPolicy(threadPolicy);
        }
        runnable.run();
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(final Runnable runnable) {
        Thread newThread = f11286e.newThread(new Runnable() { // from class: com.google.firebase.concurrent.a
            @Override // java.lang.Runnable
            public final void run() {
                b.this.b(runnable);
            }
        });
        newThread.setName(String.format(Locale.ROOT, "%s Thread #%d", this.f11288b, Long.valueOf(this.f11287a.getAndIncrement())));
        return newThread;
    }
}
