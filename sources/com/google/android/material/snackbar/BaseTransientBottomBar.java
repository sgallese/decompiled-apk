package com.google.android.material.snackbar;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.accessibility.n0;
import androidx.core.view.h0;
import androidx.core.view.p0;
import androidx.core.view.p1;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class BaseTransientBottomBar<B extends BaseTransientBottomBar<B>> {
    public static final int ANIMATION_MODE_FADE = 1;
    public static final int ANIMATION_MODE_SLIDE = 0;
    private static final float ANIMATION_SCALE_FROM_VALUE = 0.8f;
    static final int DEFAULT_ANIMATION_FADE_DURATION = 180;
    private static final int DEFAULT_ANIMATION_FADE_IN_DURATION = 150;
    private static final int DEFAULT_ANIMATION_FADE_OUT_DURATION = 75;
    static final int DEFAULT_SLIDE_ANIMATION_DURATION = 250;
    public static final int LENGTH_INDEFINITE = -2;
    public static final int LENGTH_LONG = 0;
    public static final int LENGTH_SHORT = -1;
    static final int MSG_DISMISS = 1;
    static final int MSG_SHOW = 0;
    private final AccessibilityManager accessibilityManager;
    private q anchor;
    private boolean anchorViewLayoutListenerEnabled;
    private final int animationFadeInDuration;
    private final TimeInterpolator animationFadeInterpolator;
    private final int animationFadeOutDuration;
    private final TimeInterpolator animationScaleInterpolator;
    private final int animationSlideDuration;
    private final TimeInterpolator animationSlideInterpolator;
    private int appliedBottomMarginGestureInset;
    private Behavior behavior;
    private final Runnable bottomMarginGestureInsetRunnable;
    private List<r<B>> callbacks;
    private final com.google.android.material.snackbar.b contentViewCallback;
    private final Context context;
    private int duration;
    private int extraBottomMarginAnchorView;
    private int extraBottomMarginGestureInset;
    private int extraBottomMarginWindowInset;
    private int extraLeftMarginWindowInset;
    private int extraRightMarginWindowInset;
    private boolean gestureInsetBottomIgnored;
    c.b managerCallback;
    private boolean pendingShowingView;
    private final ViewGroup targetParent;
    protected final t view;
    private static final TimeInterpolator DEFAULT_ANIMATION_SLIDE_INTERPOLATOR = w6.a.f25411b;
    private static final TimeInterpolator DEFAULT_ANIMATION_FADE_INTERPOLATOR = w6.a.f25410a;
    private static final TimeInterpolator DEFAULT_ANIMATION_SCALE_INTERPOLATOR = w6.a.f25413d;
    private static final boolean USE_OFFSET_API = false;
    private static final int[] SNACKBAR_STYLE_ATTR = {v6.b.T};
    private static final String TAG = BaseTransientBottomBar.class.getSimpleName();
    static final Handler handler = new Handler(Looper.getMainLooper(), new h());

    /* loaded from: classes3.dex */
    public static class Behavior extends SwipeDismissBehavior<View> {

        /* renamed from: l  reason: collision with root package name */
        private final s f10318l = new s(this);

        /* JADX INFO: Access modifiers changed from: private */
        public void Q(BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f10318l.c(baseTransientBottomBar);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior
        public boolean F(View view) {
            return this.f10318l.a(view);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            this.f10318l.b(coordinatorLayout, view, motionEvent);
            return super.k(coordinatorLayout, view, motionEvent);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f10319a;

        a(int i10) {
            this.f10319a = i10;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.onViewHidden(this.f10319a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class b implements ValueAnimator.AnimatorUpdateListener {
        b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            BaseTransientBottomBar.this.view.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class c implements ValueAnimator.AnimatorUpdateListener {
        c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            BaseTransientBottomBar.this.view.setScaleX(floatValue);
            BaseTransientBottomBar.this.view.setScaleY(floatValue);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class d extends AnimatorListenerAdapter {
        d() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.onViewShown();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BaseTransientBottomBar.this.contentViewCallback.animateContentIn(BaseTransientBottomBar.this.animationSlideDuration - BaseTransientBottomBar.this.animationFadeInDuration, BaseTransientBottomBar.this.animationFadeInDuration);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class e implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        private int f10324a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f10325b;

        e(int i10) {
            this.f10325b = i10;
            this.f10324a = i10;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            if (BaseTransientBottomBar.USE_OFFSET_API) {
                p0.f0(BaseTransientBottomBar.this.view, intValue - this.f10324a);
            } else {
                BaseTransientBottomBar.this.view.setTranslationY(intValue);
            }
            this.f10324a = intValue;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class f extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f10327a;

        f(int i10) {
            this.f10327a = i10;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.onViewHidden(this.f10327a);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BaseTransientBottomBar.this.contentViewCallback.animateContentOut(0, BaseTransientBottomBar.this.animationFadeOutDuration);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class g implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        private int f10329a = 0;

        g() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            if (BaseTransientBottomBar.USE_OFFSET_API) {
                p0.f0(BaseTransientBottomBar.this.view, intValue - this.f10329a);
            } else {
                BaseTransientBottomBar.this.view.setTranslationY(intValue);
            }
            this.f10329a = intValue;
        }
    }

    /* loaded from: classes3.dex */
    class h implements Handler.Callback {
        h() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 != 0) {
                if (i10 != 1) {
                    return false;
                }
                ((BaseTransientBottomBar) message.obj).hideView(message.arg1);
                return true;
            }
            ((BaseTransientBottomBar) message.obj).showView();
            return true;
        }
    }

    /* loaded from: classes3.dex */
    class i implements Runnable {
        i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseTransientBottomBar baseTransientBottomBar = BaseTransientBottomBar.this;
            if (baseTransientBottomBar.view != null && baseTransientBottomBar.context != null) {
                int height = (com.google.android.material.internal.t.a(BaseTransientBottomBar.this.context).height() - BaseTransientBottomBar.this.getViewAbsoluteBottom()) + ((int) BaseTransientBottomBar.this.view.getTranslationY());
                if (height >= BaseTransientBottomBar.this.extraBottomMarginGestureInset) {
                    BaseTransientBottomBar baseTransientBottomBar2 = BaseTransientBottomBar.this;
                    baseTransientBottomBar2.appliedBottomMarginGestureInset = baseTransientBottomBar2.extraBottomMarginGestureInset;
                    return;
                }
                ViewGroup.LayoutParams layoutParams = BaseTransientBottomBar.this.view.getLayoutParams();
                if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                    Log.w(BaseTransientBottomBar.TAG, "Unable to apply gesture inset because layout params are not MarginLayoutParams");
                    return;
                }
                BaseTransientBottomBar baseTransientBottomBar3 = BaseTransientBottomBar.this;
                baseTransientBottomBar3.appliedBottomMarginGestureInset = baseTransientBottomBar3.extraBottomMarginGestureInset;
                ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin += BaseTransientBottomBar.this.extraBottomMarginGestureInset - height;
                BaseTransientBottomBar.this.view.requestLayout();
            }
        }
    }

    /* loaded from: classes3.dex */
    class j implements h0 {
        j() {
        }

        @Override // androidx.core.view.h0
        public p1 a(View view, p1 p1Var) {
            BaseTransientBottomBar.this.extraBottomMarginWindowInset = p1Var.i();
            BaseTransientBottomBar.this.extraLeftMarginWindowInset = p1Var.j();
            BaseTransientBottomBar.this.extraRightMarginWindowInset = p1Var.k();
            BaseTransientBottomBar.this.updateMargins();
            return p1Var;
        }
    }

    /* loaded from: classes3.dex */
    class k extends androidx.core.view.a {
        k() {
        }

        @Override // androidx.core.view.a
        public void g(View view, n0 n0Var) {
            super.g(view, n0Var);
            n0Var.a(1048576);
            n0Var.t0(true);
        }

        @Override // androidx.core.view.a
        public boolean j(View view, int i10, Bundle bundle) {
            if (i10 == 1048576) {
                BaseTransientBottomBar.this.dismiss();
                return true;
            }
            return super.j(view, i10, bundle);
        }
    }

    /* loaded from: classes3.dex */
    class l implements c.b {
        l() {
        }

        @Override // com.google.android.material.snackbar.c.b
        public void a(int i10) {
            Handler handler = BaseTransientBottomBar.handler;
            handler.sendMessage(handler.obtainMessage(1, i10, 0, BaseTransientBottomBar.this));
        }

        @Override // com.google.android.material.snackbar.c.b
        public void c() {
            Handler handler = BaseTransientBottomBar.handler;
            handler.sendMessage(handler.obtainMessage(0, BaseTransientBottomBar.this));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class m implements Runnable {
        m() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseTransientBottomBar.this.onViewHidden(3);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class n implements SwipeDismissBehavior.c {
        n() {
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior.c
        public void a(View view) {
            if (view.getParent() != null) {
                view.setVisibility(8);
            }
            BaseTransientBottomBar.this.dispatchDismiss(0);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior.c
        public void b(int i10) {
            if (i10 != 0) {
                if (i10 == 1 || i10 == 2) {
                    com.google.android.material.snackbar.c.c().k(BaseTransientBottomBar.this.managerCallback);
                    return;
                }
                return;
            }
            com.google.android.material.snackbar.c.c().l(BaseTransientBottomBar.this.managerCallback);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class o implements Runnable {
        o() {
        }

        @Override // java.lang.Runnable
        public void run() {
            t tVar = BaseTransientBottomBar.this.view;
            if (tVar == null) {
                return;
            }
            if (tVar.getParent() != null) {
                BaseTransientBottomBar.this.view.setVisibility(0);
            }
            if (BaseTransientBottomBar.this.view.getAnimationMode() == 1) {
                BaseTransientBottomBar.this.startFadeInAnimation();
            } else {
                BaseTransientBottomBar.this.startSlideInAnimation();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class p extends AnimatorListenerAdapter {
        p() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.onViewShown();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class q implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: f  reason: collision with root package name */
        private final WeakReference<BaseTransientBottomBar> f10339f;

        /* renamed from: m  reason: collision with root package name */
        private final WeakReference<View> f10340m;

        private q(BaseTransientBottomBar baseTransientBottomBar, View view) {
            this.f10339f = new WeakReference<>(baseTransientBottomBar);
            this.f10340m = new WeakReference<>(view);
        }

        static q a(BaseTransientBottomBar baseTransientBottomBar, View view) {
            q qVar = new q(baseTransientBottomBar, view);
            if (p0.X(view)) {
                com.google.android.material.internal.r.a(view, qVar);
            }
            view.addOnAttachStateChangeListener(qVar);
            return qVar;
        }

        private boolean d() {
            if (this.f10339f.get() == null) {
                c();
                return true;
            }
            return false;
        }

        View b() {
            return this.f10340m.get();
        }

        void c() {
            if (this.f10340m.get() != null) {
                this.f10340m.get().removeOnAttachStateChangeListener(this);
                com.google.android.material.internal.r.h(this.f10340m.get(), this);
            }
            this.f10340m.clear();
            this.f10339f.clear();
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!d() && this.f10339f.get().anchorViewLayoutListenerEnabled) {
                this.f10339f.get().recalculateAndUpdateMargins();
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            if (d()) {
                return;
            }
            com.google.android.material.internal.r.a(view, this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            if (d()) {
                return;
            }
            com.google.android.material.internal.r.h(view, this);
        }
    }

    /* loaded from: classes3.dex */
    public static class s {

        /* renamed from: a  reason: collision with root package name */
        private c.b f10341a;

        public s(SwipeDismissBehavior<?> swipeDismissBehavior) {
            swipeDismissBehavior.M(0.1f);
            swipeDismissBehavior.K(0.6f);
            swipeDismissBehavior.N(0);
        }

        public boolean a(View view) {
            return view instanceof t;
        }

        public void b(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    com.google.android.material.snackbar.c.c().l(this.f10341a);
                }
            } else if (coordinatorLayout.v(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                com.google.android.material.snackbar.c.c().k(this.f10341a);
            }
        }

        public void c(BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f10341a = baseTransientBottomBar.managerCallback;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes3.dex */
    public static class t extends FrameLayout {

        /* renamed from: y  reason: collision with root package name */
        private static final View.OnTouchListener f10342y = new a();

        /* renamed from: f  reason: collision with root package name */
        private BaseTransientBottomBar<?> f10343f;

        /* renamed from: m  reason: collision with root package name */
        p7.k f10344m;

        /* renamed from: p  reason: collision with root package name */
        private int f10345p;

        /* renamed from: q  reason: collision with root package name */
        private final float f10346q;

        /* renamed from: r  reason: collision with root package name */
        private final float f10347r;

        /* renamed from: s  reason: collision with root package name */
        private final int f10348s;

        /* renamed from: t  reason: collision with root package name */
        private final int f10349t;

        /* renamed from: u  reason: collision with root package name */
        private ColorStateList f10350u;

        /* renamed from: v  reason: collision with root package name */
        private PorterDuff.Mode f10351v;

        /* renamed from: w  reason: collision with root package name */
        private Rect f10352w;

        /* renamed from: x  reason: collision with root package name */
        private boolean f10353x;

        /* loaded from: classes3.dex */
        class a implements View.OnTouchListener {
            a() {
            }

            @Override // android.view.View.OnTouchListener
            @SuppressLint({"ClickableViewAccessibility"})
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public t(Context context, AttributeSet attributeSet) {
            super(s7.a.c(context, attributeSet, 0, 0), attributeSet);
            Context context2 = getContext();
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, v6.l.f24844c6);
            if (obtainStyledAttributes.hasValue(v6.l.f24914j6)) {
                p0.C0(this, obtainStyledAttributes.getDimensionPixelSize(r2, 0));
            }
            this.f10345p = obtainStyledAttributes.getInt(v6.l.f24874f6, 0);
            if (obtainStyledAttributes.hasValue(v6.l.f24934l6) || obtainStyledAttributes.hasValue(v6.l.f24944m6)) {
                this.f10344m = p7.k.e(context2, attributeSet, 0, 0).m();
            }
            this.f10346q = obtainStyledAttributes.getFloat(v6.l.f24884g6, 1.0f);
            setBackgroundTintList(m7.c.a(context2, obtainStyledAttributes, v6.l.f24894h6));
            setBackgroundTintMode(com.google.android.material.internal.r.g(obtainStyledAttributes.getInt(v6.l.f24904i6, -1), PorterDuff.Mode.SRC_IN));
            this.f10347r = obtainStyledAttributes.getFloat(v6.l.f24864e6, 1.0f);
            this.f10348s = obtainStyledAttributes.getDimensionPixelSize(v6.l.f24854d6, -1);
            this.f10349t = obtainStyledAttributes.getDimensionPixelSize(v6.l.f24924k6, -1);
            obtainStyledAttributes.recycle();
            setOnTouchListener(f10342y);
            setFocusable(true);
            if (getBackground() == null) {
                p0.y0(this, d());
            }
        }

        private Drawable d() {
            int k10 = d7.a.k(this, v6.b.f24647q, v6.b.f24643m, getBackgroundOverlayColorAlpha());
            p7.k kVar = this.f10344m;
            Drawable createMaterialShapeDrawableBackground = kVar != null ? BaseTransientBottomBar.createMaterialShapeDrawableBackground(k10, kVar) : BaseTransientBottomBar.createGradientDrawableBackground(k10, getResources());
            if (this.f10350u != null) {
                Drawable r10 = androidx.core.graphics.drawable.a.r(createMaterialShapeDrawableBackground);
                androidx.core.graphics.drawable.a.o(r10, this.f10350u);
                return r10;
            }
            return androidx.core.graphics.drawable.a.r(createMaterialShapeDrawableBackground);
        }

        private void e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            this.f10352w = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBaseTransientBottomBar(BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f10343f = baseTransientBottomBar;
        }

        void c(ViewGroup viewGroup) {
            this.f10353x = true;
            viewGroup.addView(this);
            this.f10353x = false;
        }

        float getActionTextColorAlpha() {
            return this.f10347r;
        }

        int getAnimationMode() {
            return this.f10345p;
        }

        float getBackgroundOverlayColorAlpha() {
            return this.f10346q;
        }

        int getMaxInlineActionWidth() {
            return this.f10349t;
        }

        int getMaxWidth() {
            return this.f10348s;
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f10343f;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.onAttachedToWindow();
            }
            p0.r0(this);
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f10343f;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.onDetachedFromWindow();
            }
        }

        @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
            super.onLayout(z10, i10, i11, i12, i13);
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f10343f;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.onLayoutChange();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.widget.FrameLayout, android.view.View
        public void onMeasure(int i10, int i11) {
            super.onMeasure(i10, i11);
            if (this.f10348s > 0) {
                int measuredWidth = getMeasuredWidth();
                int i12 = this.f10348s;
                if (measuredWidth > i12) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), i11);
                }
            }
        }

        void setAnimationMode(int i10) {
            this.f10345p = i10;
        }

        @Override // android.view.View
        public void setBackground(Drawable drawable) {
            setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundDrawable(Drawable drawable) {
            if (drawable != null && this.f10350u != null) {
                drawable = androidx.core.graphics.drawable.a.r(drawable.mutate());
                androidx.core.graphics.drawable.a.o(drawable, this.f10350u);
                androidx.core.graphics.drawable.a.p(drawable, this.f10351v);
            }
            super.setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundTintList(ColorStateList colorStateList) {
            this.f10350u = colorStateList;
            if (getBackground() != null) {
                Drawable r10 = androidx.core.graphics.drawable.a.r(getBackground().mutate());
                androidx.core.graphics.drawable.a.o(r10, colorStateList);
                androidx.core.graphics.drawable.a.p(r10, this.f10351v);
                if (r10 != getBackground()) {
                    super.setBackgroundDrawable(r10);
                }
            }
        }

        @Override // android.view.View
        public void setBackgroundTintMode(PorterDuff.Mode mode) {
            this.f10351v = mode;
            if (getBackground() != null) {
                Drawable r10 = androidx.core.graphics.drawable.a.r(getBackground().mutate());
                androidx.core.graphics.drawable.a.p(r10, mode);
                if (r10 != getBackground()) {
                    super.setBackgroundDrawable(r10);
                }
            }
        }

        @Override // android.view.View
        public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            super.setLayoutParams(layoutParams);
            if (!this.f10353x && (layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                e((ViewGroup.MarginLayoutParams) layoutParams);
                BaseTransientBottomBar<?> baseTransientBottomBar = this.f10343f;
                if (baseTransientBottomBar != null) {
                    baseTransientBottomBar.updateMargins();
                }
            }
        }

        @Override // android.view.View
        public void setOnClickListener(View.OnClickListener onClickListener) {
            View.OnTouchListener onTouchListener;
            if (onClickListener != null) {
                onTouchListener = null;
            } else {
                onTouchListener = f10342y;
            }
            setOnTouchListener(onTouchListener);
            super.setOnClickListener(onClickListener);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public BaseTransientBottomBar(ViewGroup viewGroup, View view, com.google.android.material.snackbar.b bVar) {
        this(viewGroup.getContext(), viewGroup, view, bVar);
    }

    private void animateViewOut(int i10) {
        if (this.view.getAnimationMode() == 1) {
            startFadeOutAnimation(i10);
        } else {
            startSlideOutAnimation(i10);
        }
    }

    private int calculateBottomMarginForAnchorView() {
        if (getAnchorView() == null) {
            return 0;
        }
        int[] iArr = new int[2];
        getAnchorView().getLocationOnScreen(iArr);
        int i10 = iArr[1];
        int[] iArr2 = new int[2];
        this.targetParent.getLocationOnScreen(iArr2);
        return (iArr2[1] + this.targetParent.getHeight()) - i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static GradientDrawable createGradientDrawableBackground(int i10, Resources resources) {
        float dimension = resources.getDimension(v6.d.f24678h0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(dimension);
        gradientDrawable.setColor(i10);
        return gradientDrawable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static p7.g createMaterialShapeDrawableBackground(int i10, p7.k kVar) {
        p7.g gVar = new p7.g(kVar);
        gVar.b0(ColorStateList.valueOf(i10));
        return gVar;
    }

    private ValueAnimator getAlphaAnimator(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(this.animationFadeInterpolator);
        ofFloat.addUpdateListener(new b());
        return ofFloat;
    }

    private ValueAnimator getScaleAnimator(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(this.animationScaleInterpolator);
        ofFloat.addUpdateListener(new c());
        return ofFloat;
    }

    private int getTranslationYBottom() {
        int height = this.view.getHeight();
        ViewGroup.LayoutParams layoutParams = this.view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return height + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        }
        return height;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getViewAbsoluteBottom() {
        int[] iArr = new int[2];
        this.view.getLocationOnScreen(iArr);
        return iArr[1] + this.view.getHeight();
    }

    private boolean isSwipeDismissable() {
        ViewGroup.LayoutParams layoutParams = this.view.getLayoutParams();
        if ((layoutParams instanceof CoordinatorLayout.f) && (((CoordinatorLayout.f) layoutParams).f() instanceof SwipeDismissBehavior)) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void recalculateAndUpdateMargins() {
        this.extraBottomMarginAnchorView = calculateBottomMarginForAnchorView();
        updateMargins();
    }

    private void setUpBehavior(CoordinatorLayout.f fVar) {
        SwipeDismissBehavior<? extends View> swipeDismissBehavior = this.behavior;
        if (swipeDismissBehavior == null) {
            swipeDismissBehavior = getNewBehavior();
        }
        if (swipeDismissBehavior instanceof Behavior) {
            ((Behavior) swipeDismissBehavior).Q(this);
        }
        swipeDismissBehavior.L(new n());
        fVar.o(swipeDismissBehavior);
        if (getAnchorView() == null) {
            fVar.f3598g = 80;
        }
    }

    private boolean shouldUpdateGestureInset() {
        if (this.extraBottomMarginGestureInset > 0 && !this.gestureInsetBottomIgnored && isSwipeDismissable()) {
            return true;
        }
        return false;
    }

    private void showViewImpl() {
        if (shouldAnimate()) {
            animateViewIn();
            return;
        }
        if (this.view.getParent() != null) {
            this.view.setVisibility(0);
        }
        onViewShown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startFadeInAnimation() {
        ValueAnimator alphaAnimator = getAlphaAnimator(0.0f, 1.0f);
        ValueAnimator scaleAnimator = getScaleAnimator(ANIMATION_SCALE_FROM_VALUE, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(alphaAnimator, scaleAnimator);
        animatorSet.setDuration(this.animationFadeInDuration);
        animatorSet.addListener(new p());
        animatorSet.start();
    }

    private void startFadeOutAnimation(int i10) {
        ValueAnimator alphaAnimator = getAlphaAnimator(1.0f, 0.0f);
        alphaAnimator.setDuration(this.animationFadeOutDuration);
        alphaAnimator.addListener(new a(i10));
        alphaAnimator.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startSlideInAnimation() {
        int translationYBottom = getTranslationYBottom();
        if (USE_OFFSET_API) {
            p0.f0(this.view, translationYBottom);
        } else {
            this.view.setTranslationY(translationYBottom);
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(translationYBottom, 0);
        valueAnimator.setInterpolator(this.animationSlideInterpolator);
        valueAnimator.setDuration(this.animationSlideDuration);
        valueAnimator.addListener(new d());
        valueAnimator.addUpdateListener(new e(translationYBottom));
        valueAnimator.start();
    }

    private void startSlideOutAnimation(int i10) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(0, getTranslationYBottom());
        valueAnimator.setInterpolator(this.animationSlideInterpolator);
        valueAnimator.setDuration(this.animationSlideDuration);
        valueAnimator.addListener(new f(i10));
        valueAnimator.addUpdateListener(new g());
        valueAnimator.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateMargins() {
        int i10;
        boolean z10;
        ViewGroup.LayoutParams layoutParams = this.view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            Log.w(TAG, "Unable to update margins because layout params are not MarginLayoutParams");
        } else if (this.view.f10352w == null) {
            Log.w(TAG, "Unable to update margins because original view margins are not set");
        } else if (this.view.getParent() == null) {
        } else {
            if (getAnchorView() != null) {
                i10 = this.extraBottomMarginAnchorView;
            } else {
                i10 = this.extraBottomMarginWindowInset;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            int i11 = this.view.f10352w.bottom + i10;
            int i12 = this.view.f10352w.left + this.extraLeftMarginWindowInset;
            int i13 = this.view.f10352w.right + this.extraRightMarginWindowInset;
            int i14 = this.view.f10352w.top;
            if (marginLayoutParams.bottomMargin == i11 && marginLayoutParams.leftMargin == i12 && marginLayoutParams.rightMargin == i13 && marginLayoutParams.topMargin == i14) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                marginLayoutParams.bottomMargin = i11;
                marginLayoutParams.leftMargin = i12;
                marginLayoutParams.rightMargin = i13;
                marginLayoutParams.topMargin = i14;
                this.view.requestLayout();
            }
            if ((z10 || this.appliedBottomMarginGestureInset != this.extraBottomMarginGestureInset) && Build.VERSION.SDK_INT >= 29 && shouldUpdateGestureInset()) {
                this.view.removeCallbacks(this.bottomMarginGestureInsetRunnable);
                this.view.post(this.bottomMarginGestureInsetRunnable);
            }
        }
    }

    public B addCallback(r<B> rVar) {
        if (rVar == null) {
            return this;
        }
        if (this.callbacks == null) {
            this.callbacks = new ArrayList();
        }
        this.callbacks.add(rVar);
        return this;
    }

    void animateViewIn() {
        this.view.post(new o());
    }

    public void dismiss() {
        dispatchDismiss(3);
    }

    protected void dispatchDismiss(int i10) {
        com.google.android.material.snackbar.c.c().b(this.managerCallback, i10);
    }

    public View getAnchorView() {
        q qVar = this.anchor;
        if (qVar == null) {
            return null;
        }
        return qVar.b();
    }

    public int getAnimationMode() {
        return this.view.getAnimationMode();
    }

    public Behavior getBehavior() {
        return this.behavior;
    }

    public Context getContext() {
        return this.context;
    }

    public int getDuration() {
        return this.duration;
    }

    protected SwipeDismissBehavior<? extends View> getNewBehavior() {
        return new Behavior();
    }

    protected int getSnackbarBaseLayoutResId() {
        if (hasSnackbarStyleAttr()) {
            return v6.h.f24761u;
        }
        return v6.h.f24742b;
    }

    public View getView() {
        return this.view;
    }

    protected boolean hasSnackbarStyleAttr() {
        TypedArray obtainStyledAttributes = this.context.obtainStyledAttributes(SNACKBAR_STYLE_ATTR);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        if (resourceId == -1) {
            return false;
        }
        return true;
    }

    final void hideView(int i10) {
        if (shouldAnimate() && this.view.getVisibility() == 0) {
            animateViewOut(i10);
        } else {
            onViewHidden(i10);
        }
    }

    public boolean isAnchorViewLayoutListenerEnabled() {
        return this.anchorViewLayoutListenerEnabled;
    }

    public boolean isGestureInsetBottomIgnored() {
        return this.gestureInsetBottomIgnored;
    }

    public boolean isShown() {
        return com.google.android.material.snackbar.c.c().e(this.managerCallback);
    }

    public boolean isShownOrQueued() {
        return com.google.android.material.snackbar.c.c().f(this.managerCallback);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0006, code lost:
    
        r0 = r2.view.getRootWindowInsets();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void onAttachedToWindow() {
        /*
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L1b
            com.google.android.material.snackbar.BaseTransientBottomBar$t r0 = r2.view
            android.view.WindowInsets r0 = com.google.android.material.snackbar.a.a(r0)
            if (r0 == 0) goto L1b
            android.graphics.Insets r0 = androidx.core.view.d2.a(r0)
            int r0 = androidx.appcompat.widget.m0.a(r0)
            r2.extraBottomMarginGestureInset = r0
            r2.updateMargins()
        L1b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.snackbar.BaseTransientBottomBar.onAttachedToWindow():void");
    }

    void onDetachedFromWindow() {
        if (isShownOrQueued()) {
            handler.post(new m());
        }
    }

    void onLayoutChange() {
        if (this.pendingShowingView) {
            showViewImpl();
            this.pendingShowingView = false;
        }
    }

    void onViewHidden(int i10) {
        com.google.android.material.snackbar.c.c().i(this.managerCallback);
        List<r<B>> list = this.callbacks;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.callbacks.get(size).a(this, i10);
            }
        }
        ViewParent parent = this.view.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.view);
        }
    }

    void onViewShown() {
        com.google.android.material.snackbar.c.c().j(this.managerCallback);
        List<r<B>> list = this.callbacks;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.callbacks.get(size).b(this);
            }
        }
    }

    public B removeCallback(r<B> rVar) {
        if (rVar == null) {
            return this;
        }
        List<r<B>> list = this.callbacks;
        if (list == null) {
            return this;
        }
        list.remove(rVar);
        return this;
    }

    public B setAnchorView(View view) {
        q qVar = this.anchor;
        if (qVar != null) {
            qVar.c();
        }
        this.anchor = view == null ? null : q.a(this, view);
        return this;
    }

    public void setAnchorViewLayoutListenerEnabled(boolean z10) {
        this.anchorViewLayoutListenerEnabled = z10;
    }

    public B setAnimationMode(int i10) {
        this.view.setAnimationMode(i10);
        return this;
    }

    public B setBehavior(Behavior behavior) {
        this.behavior = behavior;
        return this;
    }

    public B setDuration(int i10) {
        this.duration = i10;
        return this;
    }

    public B setGestureInsetBottomIgnored(boolean z10) {
        this.gestureInsetBottomIgnored = z10;
        return this;
    }

    boolean shouldAnimate() {
        AccessibilityManager accessibilityManager = this.accessibilityManager;
        if (accessibilityManager == null) {
            return true;
        }
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1);
        if (enabledAccessibilityServiceList != null && enabledAccessibilityServiceList.isEmpty()) {
            return true;
        }
        return false;
    }

    public void show() {
        com.google.android.material.snackbar.c.c().n(getDuration(), this.managerCallback);
    }

    final void showView() {
        if (this.view.getParent() == null) {
            ViewGroup.LayoutParams layoutParams = this.view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.f) {
                setUpBehavior((CoordinatorLayout.f) layoutParams);
            }
            this.view.c(this.targetParent);
            recalculateAndUpdateMargins();
            this.view.setVisibility(4);
        }
        if (p0.Y(this.view)) {
            showViewImpl();
        } else {
            this.pendingShowingView = true;
        }
    }

    protected BaseTransientBottomBar(Context context, ViewGroup viewGroup, View view, com.google.android.material.snackbar.b bVar) {
        this.anchorViewLayoutListenerEnabled = false;
        this.bottomMarginGestureInsetRunnable = new i();
        this.managerCallback = new l();
        if (viewGroup == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null parent");
        }
        if (view == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null content");
        }
        if (bVar != null) {
            this.targetParent = viewGroup;
            this.contentViewCallback = bVar;
            this.context = context;
            com.google.android.material.internal.p.a(context);
            t tVar = (t) LayoutInflater.from(context).inflate(getSnackbarBaseLayoutResId(), viewGroup, false);
            this.view = tVar;
            tVar.setBaseTransientBottomBar(this);
            if (view instanceof SnackbarContentLayout) {
                SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) view;
                snackbarContentLayout.a(tVar.getActionTextColorAlpha());
                snackbarContentLayout.setMaxInlineActionWidth(tVar.getMaxInlineActionWidth());
            }
            tVar.addView(view);
            p0.w0(tVar, 1);
            p0.F0(tVar, 1);
            p0.D0(tVar, true);
            p0.J0(tVar, new j());
            p0.u0(tVar, new k());
            this.accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
            int i10 = v6.b.E;
            this.animationSlideDuration = j7.a.f(context, i10, 250);
            this.animationFadeInDuration = j7.a.f(context, i10, DEFAULT_ANIMATION_FADE_IN_DURATION);
            this.animationFadeOutDuration = j7.a.f(context, v6.b.F, 75);
            int i11 = v6.b.O;
            this.animationFadeInterpolator = j7.a.g(context, i11, DEFAULT_ANIMATION_FADE_INTERPOLATOR);
            this.animationScaleInterpolator = j7.a.g(context, i11, DEFAULT_ANIMATION_SCALE_INTERPOLATOR);
            this.animationSlideInterpolator = j7.a.g(context, i11, DEFAULT_ANIMATION_SLIDE_INTERPOLATOR);
            return;
        }
        throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
    }

    public B setAnchorView(int i10) {
        View findViewById = this.targetParent.findViewById(i10);
        if (findViewById != null) {
            return setAnchorView(findViewById);
        }
        throw new IllegalArgumentException("Unable to find anchor view with id: " + i10);
    }

    /* loaded from: classes3.dex */
    public static abstract class r<B> {
        public void b(B b10) {
        }

        public void a(B b10, int i10) {
        }
    }
}
