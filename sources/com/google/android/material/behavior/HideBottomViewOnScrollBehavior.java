package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes3.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.c<V> {

    /* renamed from: j  reason: collision with root package name */
    private static final int f9553j = v6.b.E;

    /* renamed from: k  reason: collision with root package name */
    private static final int f9554k = v6.b.H;

    /* renamed from: l  reason: collision with root package name */
    private static final int f9555l = v6.b.O;

    /* renamed from: a  reason: collision with root package name */
    private final LinkedHashSet<b> f9556a;

    /* renamed from: b  reason: collision with root package name */
    private int f9557b;

    /* renamed from: c  reason: collision with root package name */
    private int f9558c;

    /* renamed from: d  reason: collision with root package name */
    private TimeInterpolator f9559d;

    /* renamed from: e  reason: collision with root package name */
    private TimeInterpolator f9560e;

    /* renamed from: f  reason: collision with root package name */
    private int f9561f;

    /* renamed from: g  reason: collision with root package name */
    private int f9562g;

    /* renamed from: h  reason: collision with root package name */
    private int f9563h;

    /* renamed from: i  reason: collision with root package name */
    private ViewPropertyAnimator f9564i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            HideBottomViewOnScrollBehavior.this.f9564i = null;
        }
    }

    /* loaded from: classes3.dex */
    public interface b {
        void a(View view, int i10);
    }

    public HideBottomViewOnScrollBehavior() {
        this.f9556a = new LinkedHashSet<>();
        this.f9561f = 0;
        this.f9562g = 2;
        this.f9563h = 0;
    }

    private void F(V v10, int i10, long j10, TimeInterpolator timeInterpolator) {
        this.f9564i = v10.animate().translationY(i10).setInterpolator(timeInterpolator).setDuration(j10).setListener(new a());
    }

    private void N(V v10, int i10) {
        this.f9562g = i10;
        Iterator<b> it = this.f9556a.iterator();
        while (it.hasNext()) {
            it.next().a(v10, this.f9562g);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean A(CoordinatorLayout coordinatorLayout, V v10, View view, View view2, int i10, int i11) {
        if (i10 == 2) {
            return true;
        }
        return false;
    }

    public boolean G() {
        if (this.f9562g == 1) {
            return true;
        }
        return false;
    }

    public boolean H() {
        if (this.f9562g == 2) {
            return true;
        }
        return false;
    }

    public void I(V v10, int i10) {
        this.f9563h = i10;
        if (this.f9562g == 1) {
            v10.setTranslationY(this.f9561f + i10);
        }
    }

    public void J(V v10) {
        K(v10, true);
    }

    public void K(V v10, boolean z10) {
        if (G()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f9564i;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v10.clearAnimation();
        }
        N(v10, 1);
        int i10 = this.f9561f + this.f9563h;
        if (z10) {
            F(v10, i10, this.f9558c, this.f9560e);
        } else {
            v10.setTranslationY(i10);
        }
    }

    public void L(V v10) {
        M(v10, true);
    }

    public void M(V v10, boolean z10) {
        if (H()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f9564i;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v10.clearAnimation();
        }
        N(v10, 2);
        if (z10) {
            F(v10, 0, this.f9557b, this.f9559d);
        } else {
            v10.setTranslationY(0);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(CoordinatorLayout coordinatorLayout, V v10, int i10) {
        this.f9561f = v10.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) v10.getLayoutParams()).bottomMargin;
        this.f9557b = j7.a.f(v10.getContext(), f9553j, 225);
        this.f9558c = j7.a.f(v10.getContext(), f9554k, 175);
        Context context = v10.getContext();
        int i11 = f9555l;
        this.f9559d = j7.a.g(context, i11, w6.a.f25413d);
        this.f9560e = j7.a.g(v10.getContext(), i11, w6.a.f25412c);
        return super.l(coordinatorLayout, v10, i10);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void t(CoordinatorLayout coordinatorLayout, V v10, View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        if (i11 > 0) {
            J(v10);
        } else if (i11 < 0) {
            L(v10);
        }
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9556a = new LinkedHashSet<>();
        this.f9561f = 0;
        this.f9562g = 2;
        this.f9563h = 0;
    }
}
