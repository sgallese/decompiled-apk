package com.google.firebase.perf.util;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PreDrawListener.java */
/* loaded from: classes3.dex */
public class h implements ViewTreeObserver.OnPreDrawListener {
    @SuppressLint({"ThreadPoolCreation"})

    /* renamed from: f  reason: collision with root package name */
    private final Handler f11892f = new Handler(Looper.getMainLooper());

    /* renamed from: m  reason: collision with root package name */
    private final AtomicReference<View> f11893m;

    /* renamed from: p  reason: collision with root package name */
    private final Runnable f11894p;

    /* renamed from: q  reason: collision with root package name */
    private final Runnable f11895q;

    private h(View view, Runnable runnable, Runnable runnable2) {
        this.f11893m = new AtomicReference<>(view);
        this.f11894p = runnable;
        this.f11895q = runnable2;
    }

    public static void a(View view, Runnable runnable, Runnable runnable2) {
        view.getViewTreeObserver().addOnPreDrawListener(new h(view, runnable, runnable2));
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        View andSet = this.f11893m.getAndSet(null);
        if (andSet == null) {
            return true;
        }
        andSet.getViewTreeObserver().removeOnPreDrawListener(this);
        this.f11892f.post(this.f11894p);
        this.f11892f.postAtFrontOfQueue(this.f11895q);
        return true;
    }
}
