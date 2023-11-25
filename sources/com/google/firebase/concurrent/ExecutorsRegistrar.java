package com.google.firebase.concurrent;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.StrictMode;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import k8.b0;
import k8.u;

@SuppressLint({"ThreadPoolCreation"})
/* loaded from: classes3.dex */
public class ExecutorsRegistrar implements ComponentRegistrar {

    /* renamed from: a  reason: collision with root package name */
    static final u<ScheduledExecutorService> f11280a = new u<>(new i9.b() { // from class: l8.c
        @Override // i9.b
        public final Object get() {
            ScheduledExecutorService p10;
            p10 = ExecutorsRegistrar.p();
            return p10;
        }
    });

    /* renamed from: b  reason: collision with root package name */
    static final u<ScheduledExecutorService> f11281b = new u<>(new i9.b() { // from class: l8.d
        @Override // i9.b
        public final Object get() {
            ScheduledExecutorService q10;
            q10 = ExecutorsRegistrar.q();
            return q10;
        }
    });

    /* renamed from: c  reason: collision with root package name */
    static final u<ScheduledExecutorService> f11282c = new u<>(new i9.b() { // from class: l8.e
        @Override // i9.b
        public final Object get() {
            ScheduledExecutorService r10;
            r10 = ExecutorsRegistrar.r();
            return r10;
        }
    });

    /* renamed from: d  reason: collision with root package name */
    static final u<ScheduledExecutorService> f11283d = new u<>(new i9.b() { // from class: l8.f
        @Override // i9.b
        public final Object get() {
            ScheduledExecutorService s10;
            s10 = ExecutorsRegistrar.s();
            return s10;
        }
    });

    private static StrictMode.ThreadPolicy i() {
        StrictMode.ThreadPolicy.Builder detectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 23) {
            detectNetwork.detectResourceMismatches();
            if (i10 >= 26) {
                detectNetwork.detectUnbufferedIo();
            }
        }
        return detectNetwork.penaltyLog().build();
    }

    private static ThreadFactory j(String str, int i10) {
        return new b(str, i10, null);
    }

    private static ThreadFactory k(String str, int i10, StrictMode.ThreadPolicy threadPolicy) {
        return new b(str, i10, threadPolicy);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService l(k8.e eVar) {
        return f11280a.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService m(k8.e eVar) {
        return f11282c.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService n(k8.e eVar) {
        return f11281b.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Executor o(k8.e eVar) {
        return l8.m.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService p() {
        return u(Executors.newFixedThreadPool(4, k("Firebase Background", 10, i())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService q() {
        return u(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), k("Firebase Lite", 0, t())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService r() {
        return u(Executors.newCachedThreadPool(j("Firebase Blocking", 11)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService s() {
        return Executors.newSingleThreadScheduledExecutor(j("Firebase Scheduler", 0));
    }

    private static StrictMode.ThreadPolicy t() {
        return new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build();
    }

    private static ScheduledExecutorService u(ExecutorService executorService) {
        return new o(executorService, f11283d.get());
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<k8.c<?>> getComponents() {
        return Arrays.asList(k8.c.f(b0.a(j8.a.class, ScheduledExecutorService.class), b0.a(j8.a.class, ExecutorService.class), b0.a(j8.a.class, Executor.class)).f(new k8.h() { // from class: l8.g
            @Override // k8.h
            public final Object a(k8.e eVar) {
                ScheduledExecutorService l10;
                l10 = ExecutorsRegistrar.l(eVar);
                return l10;
            }
        }).d(), k8.c.f(b0.a(j8.b.class, ScheduledExecutorService.class), b0.a(j8.b.class, ExecutorService.class), b0.a(j8.b.class, Executor.class)).f(new k8.h() { // from class: l8.h
            @Override // k8.h
            public final Object a(k8.e eVar) {
                ScheduledExecutorService m10;
                m10 = ExecutorsRegistrar.m(eVar);
                return m10;
            }
        }).d(), k8.c.f(b0.a(j8.c.class, ScheduledExecutorService.class), b0.a(j8.c.class, ExecutorService.class), b0.a(j8.c.class, Executor.class)).f(new k8.h() { // from class: l8.i
            @Override // k8.h
            public final Object a(k8.e eVar) {
                ScheduledExecutorService n10;
                n10 = ExecutorsRegistrar.n(eVar);
                return n10;
            }
        }).d(), k8.c.e(b0.a(j8.d.class, Executor.class)).f(new k8.h() { // from class: l8.j
            @Override // k8.h
            public final Object a(k8.e eVar) {
                Executor o10;
                o10 = ExecutorsRegistrar.o(eVar);
                return o10;
            }
        }).d());
    }
}
