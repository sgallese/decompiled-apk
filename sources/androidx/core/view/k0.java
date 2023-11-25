package androidx.core.view;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: OneShotPreDrawListener.java */
/* loaded from: classes.dex */
public final class k0 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: f  reason: collision with root package name */
    private final View f4166f;

    /* renamed from: m  reason: collision with root package name */
    private ViewTreeObserver f4167m;

    /* renamed from: p  reason: collision with root package name */
    private final Runnable f4168p;

    private k0(View view, Runnable runnable) {
        this.f4166f = view;
        this.f4167m = view.getViewTreeObserver();
        this.f4168p = runnable;
    }

    public static k0 a(View view, Runnable runnable) {
        if (view != null) {
            if (runnable != null) {
                k0 k0Var = new k0(view, runnable);
                view.getViewTreeObserver().addOnPreDrawListener(k0Var);
                view.addOnAttachStateChangeListener(k0Var);
                return k0Var;
            }
            throw new NullPointerException("runnable == null");
        }
        throw new NullPointerException("view == null");
    }

    public void b() {
        if (this.f4167m.isAlive()) {
            this.f4167m.removeOnPreDrawListener(this);
        } else {
            this.f4166f.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f4166f.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        b();
        this.f4168p.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        this.f4167m = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        b();
    }
}
