package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TopicsStore.java */
/* loaded from: classes3.dex */
public final class w0 {

    /* renamed from: d  reason: collision with root package name */
    private static WeakReference<w0> f11712d;

    /* renamed from: a  reason: collision with root package name */
    private final SharedPreferences f11713a;

    /* renamed from: b  reason: collision with root package name */
    private s0 f11714b;

    /* renamed from: c  reason: collision with root package name */
    private final Executor f11715c;

    private w0(SharedPreferences sharedPreferences, Executor executor) {
        this.f11715c = executor;
        this.f11713a = sharedPreferences;
    }

    public static synchronized w0 a(Context context, Executor executor) {
        w0 w0Var;
        synchronized (w0.class) {
            WeakReference<w0> weakReference = f11712d;
            if (weakReference != null) {
                w0Var = weakReference.get();
            } else {
                w0Var = null;
            }
            if (w0Var == null) {
                w0Var = new w0(context.getSharedPreferences("com.google.android.gms.appid", 0), executor);
                w0Var.c();
                f11712d = new WeakReference<>(w0Var);
            }
        }
        return w0Var;
    }

    private synchronized void c() {
        this.f11714b = s0.c(this.f11713a, "topic_operation_queue", ",", this.f11715c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized v0 b() {
        return v0.a(this.f11714b.e());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized boolean d(v0 v0Var) {
        return this.f11714b.f(v0Var.e());
    }
}
