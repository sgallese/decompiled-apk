package androidx.core.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* compiled from: ViewPropertyAnimatorCompat.java */
/* loaded from: classes.dex */
public final class x0 {

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference<View> f4271a;

    /* renamed from: b  reason: collision with root package name */
    Runnable f4272b = null;

    /* renamed from: c  reason: collision with root package name */
    Runnable f4273c = null;

    /* renamed from: d  reason: collision with root package name */
    int f4274d = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewPropertyAnimatorCompat.java */
    /* loaded from: classes.dex */
    public class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ y0 f4275a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f4276b;

        a(y0 y0Var, View view) {
            this.f4275a = y0Var;
            this.f4276b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f4275a.a(this.f4276b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f4275a.b(this.f4276b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f4275a.c(this.f4276b);
        }
    }

    /* compiled from: ViewPropertyAnimatorCompat.java */
    /* loaded from: classes.dex */
    static class b {
        static ViewPropertyAnimator a(ViewPropertyAnimator viewPropertyAnimator, Runnable runnable) {
            return viewPropertyAnimator.withEndAction(runnable);
        }

        static ViewPropertyAnimator b(ViewPropertyAnimator viewPropertyAnimator) {
            return viewPropertyAnimator.withLayer();
        }

        static ViewPropertyAnimator c(ViewPropertyAnimator viewPropertyAnimator, Runnable runnable) {
            return viewPropertyAnimator.withStartAction(runnable);
        }
    }

    /* compiled from: ViewPropertyAnimatorCompat.java */
    /* loaded from: classes.dex */
    static class c {
        static ViewPropertyAnimator a(ViewPropertyAnimator viewPropertyAnimator, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
            return viewPropertyAnimator.setUpdateListener(animatorUpdateListener);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public x0(View view) {
        this.f4271a = new WeakReference<>(view);
    }

    private void k(View view, y0 y0Var) {
        if (y0Var != null) {
            view.animate().setListener(new a(y0Var, view));
        } else {
            view.animate().setListener(null);
        }
    }

    public x0 b(float f10) {
        View view = this.f4271a.get();
        if (view != null) {
            view.animate().alpha(f10);
        }
        return this;
    }

    public void c() {
        View view = this.f4271a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public long d() {
        View view = this.f4271a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0L;
    }

    public x0 f(float f10) {
        View view = this.f4271a.get();
        if (view != null) {
            view.animate().scaleX(f10);
        }
        return this;
    }

    public x0 g(float f10) {
        View view = this.f4271a.get();
        if (view != null) {
            view.animate().scaleY(f10);
        }
        return this;
    }

    public x0 h(long j10) {
        View view = this.f4271a.get();
        if (view != null) {
            view.animate().setDuration(j10);
        }
        return this;
    }

    public x0 i(Interpolator interpolator) {
        View view = this.f4271a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    public x0 j(y0 y0Var) {
        View view = this.f4271a.get();
        if (view != null) {
            k(view, y0Var);
        }
        return this;
    }

    public x0 l(long j10) {
        View view = this.f4271a.get();
        if (view != null) {
            view.animate().setStartDelay(j10);
        }
        return this;
    }

    public x0 m(final a1 a1Var) {
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener;
        final View view = this.f4271a.get();
        if (view != null) {
            if (a1Var != null) {
                animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.core.view.w0
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        a1.this.a(view);
                    }
                };
            } else {
                animatorUpdateListener = null;
            }
            c.a(view.animate(), animatorUpdateListener);
        }
        return this;
    }

    public void n() {
        View view = this.f4271a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    public x0 o(float f10) {
        View view = this.f4271a.get();
        if (view != null) {
            view.animate().translationY(f10);
        }
        return this;
    }

    public x0 p(Runnable runnable) {
        View view = this.f4271a.get();
        if (view != null) {
            b.a(view.animate(), runnable);
        }
        return this;
    }
}
