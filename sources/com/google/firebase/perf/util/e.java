package com.google.firebase.perf.util;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: FirstDrawDoneListener.java */
/* loaded from: classes3.dex */
public class e implements ViewTreeObserver.OnDrawListener {
    @SuppressLint({"ThreadPoolCreation"})

    /* renamed from: f  reason: collision with root package name */
    private final Handler f11885f = new Handler(Looper.getMainLooper());

    /* renamed from: m  reason: collision with root package name */
    private final AtomicReference<View> f11886m;

    /* renamed from: p  reason: collision with root package name */
    private final Runnable f11887p;

    /* compiled from: FirstDrawDoneListener.java */
    /* loaded from: classes3.dex */
    class a implements View.OnAttachStateChangeListener {
        a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            view.getViewTreeObserver().addOnDrawListener(e.this);
            view.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            view.removeOnAttachStateChangeListener(this);
        }
    }

    private e(View view, Runnable runnable) {
        this.f11886m = new AtomicReference<>(view);
        this.f11887p = runnable;
    }

    private static boolean b(View view) {
        if (view.getViewTreeObserver().isAlive() && c(view)) {
            return true;
        }
        return false;
    }

    private static boolean c(View view) {
        return view.isAttachedToWindow();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(View view) {
        view.getViewTreeObserver().removeOnDrawListener(this);
    }

    public static void e(View view, Runnable runnable) {
        e eVar = new e(view, runnable);
        if (Build.VERSION.SDK_INT < 26 && !b(view)) {
            view.addOnAttachStateChangeListener(new a());
        } else {
            view.getViewTreeObserver().addOnDrawListener(eVar);
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public void onDraw() {
        final View andSet = this.f11886m.getAndSet(null);
        if (andSet == null) {
            return;
        }
        andSet.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.google.firebase.perf.util.d
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                e.this.d(andSet);
            }
        });
        this.f11885f.postAtFrontOfQueue(this.f11887p);
    }
}
