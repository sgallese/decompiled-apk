package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: FcmExecutors.java */
/* loaded from: classes3.dex */
class n {
    @SuppressLint({"ThreadPoolCreation"})
    private static Executor a(String str) {
        return new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new NamedThreadFactory(str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Executor b() {
        return a("Firebase-Messaging-File-Io");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SuppressLint({"ThreadPoolCreation"})
    public static ScheduledExecutorService c() {
        return new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("Firebase-Messaging-Init"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SuppressLint({"ThreadPoolCreation"})
    public static ExecutorService d() {
        return r9.b.a().a(new NamedThreadFactory("Firebase-Messaging-Intent-Handle"), r9.c.HIGH_SPEED);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SuppressLint({"ThreadPoolCreation"})
    public static ExecutorService e() {
        return Executors.newSingleThreadExecutor(new NamedThreadFactory("Firebase-Messaging-Network-Io"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SuppressLint({"ThreadPoolCreation"})
    public static ExecutorService f() {
        return Executors.newSingleThreadExecutor(new NamedThreadFactory("Firebase-Messaging-Task"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SuppressLint({"ThreadPoolCreation"})
    public static ScheduledExecutorService g() {
        return new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("Firebase-Messaging-Topics-Io"));
    }
}
