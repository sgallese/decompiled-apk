package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.p0;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.internal.r;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p7.h;
import v6.k;

/* loaded from: classes3.dex */
public class BottomAppBar extends Toolbar implements CoordinatorLayout.b {
    private static final int G0 = k.f24810t;
    private static final int H0 = v6.b.E;
    private static final int I0 = v6.b.O;
    private boolean A0;
    private Behavior B0;
    private int C0;
    private int D0;
    private int E0;
    AnimatorListenerAdapter F0;

    /* renamed from: k0  reason: collision with root package name */
    private Integer f9584k0;

    /* renamed from: l0  reason: collision with root package name */
    private final p7.g f9585l0;

    /* renamed from: m0  reason: collision with root package name */
    private Animator f9586m0;

    /* renamed from: n0  reason: collision with root package name */
    private Animator f9587n0;

    /* renamed from: o0  reason: collision with root package name */
    private int f9588o0;

    /* renamed from: p0  reason: collision with root package name */
    private int f9589p0;

    /* renamed from: q0  reason: collision with root package name */
    private int f9590q0;

    /* renamed from: r0  reason: collision with root package name */
    private final int f9591r0;

    /* renamed from: s0  reason: collision with root package name */
    private int f9592s0;

    /* renamed from: t0  reason: collision with root package name */
    private int f9593t0;

    /* renamed from: u0  reason: collision with root package name */
    private final boolean f9594u0;

    /* renamed from: v0  reason: collision with root package name */
    private boolean f9595v0;

    /* renamed from: w0  reason: collision with root package name */
    private int f9596w0;

    /* renamed from: x0  reason: collision with root package name */
    private ArrayList<g> f9597x0;

    /* renamed from: y0  reason: collision with root package name */
    private int f9598y0;

    /* renamed from: z0  reason: collision with root package name */
    private boolean f9599z0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: p  reason: collision with root package name */
        int f9605p;

        /* renamed from: q  reason: collision with root package name */
        boolean f9606q;

        /* loaded from: classes3.dex */
        class a implements Parcelable.ClassLoaderCreator<SavedState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a  reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b  reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c  reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f9605p);
            parcel.writeInt(this.f9606q ? 1 : 0);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f9605p = parcel.readInt();
            this.f9606q = parcel.readInt() != 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BottomAppBar.this.s0();
            BottomAppBar.this.f9586m0 = null;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.t0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class b extends FloatingActionButton.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f9608a;

        /* loaded from: classes3.dex */
        class a extends FloatingActionButton.b {
            a() {
            }

            @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.b
            public void b(FloatingActionButton floatingActionButton) {
                BottomAppBar.this.s0();
            }
        }

        b(int i10) {
            this.f9608a = i10;
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.b
        public void a(FloatingActionButton floatingActionButton) {
            floatingActionButton.setTranslationX(BottomAppBar.this.x0(this.f9608a));
            floatingActionButton.r(new a());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class c extends AnimatorListenerAdapter {
        c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BottomAppBar.this.s0();
            BottomAppBar.this.f9599z0 = false;
            BottomAppBar.this.f9587n0 = null;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.t0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class d extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public boolean f9612a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ActionMenuView f9613b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f9614c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f9615d;

        d(ActionMenuView actionMenuView, int i10, boolean z10) {
            this.f9613b = actionMenuView;
            this.f9614c = i10;
            this.f9615d = z10;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f9612a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            boolean z10;
            if (!this.f9612a) {
                if (BottomAppBar.this.f9598y0 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                BottomAppBar bottomAppBar = BottomAppBar.this;
                bottomAppBar.D0(bottomAppBar.f9598y0);
                BottomAppBar.this.J0(this.f9613b, this.f9614c, this.f9615d, z10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class e implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ ActionMenuView f9617f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ int f9618m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ boolean f9619p;

        e(ActionMenuView actionMenuView, int i10, boolean z10) {
            this.f9617f = actionMenuView;
            this.f9618m = i10;
            this.f9619p = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f9617f.setTranslationX(BottomAppBar.this.w0(r0, this.f9618m, this.f9619p));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class f extends AnimatorListenerAdapter {
        f() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.F0.onAnimationStart(animator);
            FloatingActionButton u02 = BottomAppBar.this.u0();
            if (u02 != null) {
                u02.setTranslationX(BottomAppBar.this.getFabTranslationX());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public interface g {
        void a(BottomAppBar bottomAppBar);

        void b(BottomAppBar bottomAppBar);
    }

    private void A0(int i10, boolean z10) {
        if (!p0.Y(this)) {
            this.f9599z0 = false;
            D0(this.f9598y0);
            return;
        }
        Animator animator = this.f9587n0;
        if (animator != null) {
            animator.cancel();
        }
        ArrayList arrayList = new ArrayList();
        if (!y0()) {
            i10 = 0;
            z10 = false;
        }
        r0(i10, z10, arrayList);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        this.f9587n0 = animatorSet;
        animatorSet.addListener(new c());
        this.f9587n0.start();
    }

    private void B0(int i10) {
        if (this.f9588o0 != i10 && p0.Y(this)) {
            Animator animator = this.f9586m0;
            if (animator != null) {
                animator.cancel();
            }
            ArrayList arrayList = new ArrayList();
            if (this.f9589p0 == 1) {
                q0(i10, arrayList);
            } else {
                p0(i10, arrayList);
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(arrayList);
            animatorSet.setInterpolator(j7.a.g(getContext(), I0, w6.a.f25410a));
            this.f9586m0 = animatorSet;
            animatorSet.addListener(new a());
            this.f9586m0.start();
        }
    }

    private Drawable C0(Drawable drawable) {
        if (drawable != null && this.f9584k0 != null) {
            Drawable r10 = androidx.core.graphics.drawable.a.r(drawable.mutate());
            androidx.core.graphics.drawable.a.n(r10, this.f9584k0.intValue());
            return r10;
        }
        return drawable;
    }

    private void E0() {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView != null && this.f9587n0 == null) {
            actionMenuView.setAlpha(1.0f);
            if (!y0()) {
                I0(actionMenuView, 0, false);
            } else {
                I0(actionMenuView, this.f9588o0, this.A0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F0() {
        float f10;
        getTopEdgeTreatment().n(getFabTranslationX());
        p7.g gVar = this.f9585l0;
        if (this.A0 && y0() && this.f9590q0 == 1) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        gVar.c0(f10);
        View v02 = v0();
        if (v02 != null) {
            v02.setTranslationY(getFabTranslationY());
            v02.setTranslationX(getFabTranslationX());
        }
    }

    private void I0(ActionMenuView actionMenuView, int i10, boolean z10) {
        J0(actionMenuView, i10, z10, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J0(ActionMenuView actionMenuView, int i10, boolean z10, boolean z11) {
        e eVar = new e(actionMenuView, i10, z10);
        if (z11) {
            actionMenuView.post(eVar);
        } else {
            eVar.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void K0(BottomAppBar bottomAppBar, View view) {
        CoordinatorLayout.f fVar = (CoordinatorLayout.f) view.getLayoutParams();
        fVar.f3595d = 17;
        int i10 = bottomAppBar.f9590q0;
        if (i10 == 1) {
            fVar.f3595d = 17 | 48;
        }
        if (i10 == 0) {
            fVar.f3595d |= 80;
        }
    }

    private ActionMenuView getActionMenuView() {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getBottomInset() {
        return this.C0;
    }

    private int getFabAlignmentAnimationDuration() {
        return j7.a.f(getContext(), H0, 300);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getFabTranslationX() {
        return x0(this.f9588o0);
    }

    private float getFabTranslationY() {
        int i10;
        if (this.f9590q0 == 1) {
            return -getTopEdgeTreatment().c();
        }
        View v02 = v0();
        if (v02 != null) {
            i10 = (-((getMeasuredHeight() + getBottomInset()) - v02.getMeasuredHeight())) / 2;
        } else {
            i10 = 0;
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getLeftInset() {
        return this.E0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getRightInset() {
        return this.D0;
    }

    private com.google.android.material.bottomappbar.b getTopEdgeTreatment() {
        return (com.google.android.material.bottomappbar.b) this.f9585l0.E().p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n0(FloatingActionButton floatingActionButton) {
        floatingActionButton.e(this.F0);
        floatingActionButton.f(new f());
        floatingActionButton.g(null);
    }

    private void o0() {
        Animator animator = this.f9587n0;
        if (animator != null) {
            animator.cancel();
        }
        Animator animator2 = this.f9586m0;
        if (animator2 != null) {
            animator2.cancel();
        }
    }

    private void q0(int i10, List<Animator> list) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(u0(), "translationX", x0(i10));
        ofFloat.setDuration(getFabAlignmentAnimationDuration());
        list.add(ofFloat);
    }

    private void r0(int i10, boolean z10, List<Animator> list) {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView == null) {
            return;
        }
        float fabAlignmentAnimationDuration = getFabAlignmentAnimationDuration();
        Animator ofFloat = ObjectAnimator.ofFloat(actionMenuView, "alpha", 1.0f);
        ofFloat.setDuration(0.8f * fabAlignmentAnimationDuration);
        if (Math.abs(actionMenuView.getTranslationX() - w0(actionMenuView, i10, z10)) > 1.0f) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(actionMenuView, "alpha", 0.0f);
            ofFloat2.setDuration(fabAlignmentAnimationDuration * 0.2f);
            ofFloat2.addListener(new d(actionMenuView, i10, z10));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playSequentially(ofFloat2, ofFloat);
            list.add(animatorSet);
        } else if (actionMenuView.getAlpha() < 1.0f) {
            list.add(ofFloat);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s0() {
        ArrayList<g> arrayList;
        int i10 = this.f9596w0 - 1;
        this.f9596w0 = i10;
        if (i10 == 0 && (arrayList = this.f9597x0) != null) {
            Iterator<g> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().b(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t0() {
        ArrayList<g> arrayList;
        int i10 = this.f9596w0;
        this.f9596w0 = i10 + 1;
        if (i10 == 0 && (arrayList = this.f9597x0) != null) {
            Iterator<g> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().a(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public FloatingActionButton u0() {
        View v02 = v0();
        if (v02 instanceof FloatingActionButton) {
            return (FloatingActionButton) v02;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public View v0() {
        if (!(getParent() instanceof CoordinatorLayout)) {
            return null;
        }
        for (View view : ((CoordinatorLayout) getParent()).m(this)) {
            if ((view instanceof FloatingActionButton) || (view instanceof ExtendedFloatingActionButton)) {
                return view;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float x0(int i10) {
        int i11;
        int i12;
        boolean f10 = r.f(this);
        int i13 = 1;
        if (i10 == 1) {
            View v02 = v0();
            if (f10) {
                i11 = this.E0;
            } else {
                i11 = this.D0;
            }
            if (this.f9592s0 != -1 && v02 != null) {
                i12 = (v02.getMeasuredWidth() / 2) + this.f9592s0;
            } else {
                i12 = this.f9591r0;
            }
            int measuredWidth = (getMeasuredWidth() / 2) - (i11 + i12);
            if (f10) {
                i13 = -1;
            }
            return measuredWidth * i13;
        }
        return 0.0f;
    }

    private boolean y0() {
        FloatingActionButton u02 = u0();
        if (u02 != null && u02.o()) {
            return true;
        }
        return false;
    }

    public void D0(int i10) {
        if (i10 != 0) {
            this.f9598y0 = 0;
            getMenu().clear();
            x(i10);
        }
    }

    public void G0(int i10, int i11) {
        this.f9598y0 = i11;
        this.f9599z0 = true;
        A0(i10, this.A0);
        B0(i10);
        this.f9588o0 = i10;
    }

    boolean H0(int i10) {
        float f10 = i10;
        if (f10 != getTopEdgeTreatment().g()) {
            getTopEdgeTreatment().l(f10);
            this.f9585l0.invalidateSelf();
            return true;
        }
        return false;
    }

    public ColorStateList getBackgroundTint() {
        return this.f9585l0.I();
    }

    public float getCradleVerticalOffset() {
        return getTopEdgeTreatment().c();
    }

    public int getFabAlignmentMode() {
        return this.f9588o0;
    }

    public int getFabAlignmentModeEndMargin() {
        return this.f9592s0;
    }

    public int getFabAnchorMode() {
        return this.f9590q0;
    }

    public int getFabAnimationMode() {
        return this.f9589p0;
    }

    public float getFabCradleMargin() {
        return getTopEdgeTreatment().e();
    }

    public float getFabCradleRoundedCornerRadius() {
        return getTopEdgeTreatment().f();
    }

    public boolean getHideOnScroll() {
        return this.f9595v0;
    }

    public int getMenuAlignmentMode() {
        return this.f9593t0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        h.f(this, this.f9585l0);
        if (getParent() instanceof ViewGroup) {
            ((ViewGroup) getParent()).setClipChildren(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10) {
            o0();
            F0();
            final View v02 = v0();
            if (v02 != null && p0.Y(v02)) {
                v02.post(new Runnable() { // from class: com.google.android.material.bottomappbar.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        v02.requestLayout();
                    }
                });
            }
        }
        E0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        this.f9588o0 = savedState.f9605p;
        this.A0 = savedState.f9606q;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f9605p = this.f9588o0;
        savedState.f9606q = this.A0;
        return savedState;
    }

    protected void p0(int i10, List<Animator> list) {
        FloatingActionButton u02 = u0();
        if (u02 != null && !u02.n()) {
            t0();
            u02.l(new b(i10));
        }
    }

    public void setBackgroundTint(ColorStateList colorStateList) {
        androidx.core.graphics.drawable.a.o(this.f9585l0, colorStateList);
    }

    public void setCradleVerticalOffset(float f10) {
        if (f10 != getCradleVerticalOffset()) {
            getTopEdgeTreatment().h(f10);
            this.f9585l0.invalidateSelf();
            F0();
        }
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        this.f9585l0.a0(f10);
        getBehavior().I(this, this.f9585l0.D() - this.f9585l0.C());
    }

    public void setFabAlignmentMode(int i10) {
        G0(i10, 0);
    }

    public void setFabAlignmentModeEndMargin(int i10) {
        if (this.f9592s0 != i10) {
            this.f9592s0 = i10;
            F0();
        }
    }

    public void setFabAnchorMode(int i10) {
        this.f9590q0 = i10;
        F0();
        View v02 = v0();
        if (v02 != null) {
            K0(this, v02);
            v02.requestLayout();
            this.f9585l0.invalidateSelf();
        }
    }

    public void setFabAnimationMode(int i10) {
        this.f9589p0 = i10;
    }

    void setFabCornerSize(float f10) {
        if (f10 != getTopEdgeTreatment().d()) {
            getTopEdgeTreatment().i(f10);
            this.f9585l0.invalidateSelf();
        }
    }

    public void setFabCradleMargin(float f10) {
        if (f10 != getFabCradleMargin()) {
            getTopEdgeTreatment().j(f10);
            this.f9585l0.invalidateSelf();
        }
    }

    public void setFabCradleRoundedCornerRadius(float f10) {
        if (f10 != getFabCradleRoundedCornerRadius()) {
            getTopEdgeTreatment().k(f10);
            this.f9585l0.invalidateSelf();
        }
    }

    public void setHideOnScroll(boolean z10) {
        this.f9595v0 = z10;
    }

    public void setMenuAlignmentMode(int i10) {
        if (this.f9593t0 != i10) {
            this.f9593t0 = i10;
            ActionMenuView actionMenuView = getActionMenuView();
            if (actionMenuView != null) {
                I0(actionMenuView, this.f9588o0, y0());
            }
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        super.setNavigationIcon(C0(drawable));
    }

    public void setNavigationIconTint(int i10) {
        this.f9584k0 = Integer.valueOf(i10);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    protected int w0(ActionMenuView actionMenuView, int i10, boolean z10) {
        int i11;
        int left;
        int i12;
        boolean z11;
        int i13 = 0;
        if (this.f9593t0 != 1 && (i10 != 1 || !z10)) {
            return 0;
        }
        boolean f10 = r.f(this);
        if (f10) {
            i11 = getMeasuredWidth();
        } else {
            i11 = 0;
        }
        for (int i14 = 0; i14 < getChildCount(); i14++) {
            View childAt = getChildAt(i14);
            if ((childAt.getLayoutParams() instanceof Toolbar.g) && (((Toolbar.g) childAt.getLayoutParams()).f763a & 8388615) == 8388611) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                if (f10) {
                    i11 = Math.min(i11, childAt.getLeft());
                } else {
                    i11 = Math.max(i11, childAt.getRight());
                }
            }
        }
        if (f10) {
            left = actionMenuView.getRight();
        } else {
            left = actionMenuView.getLeft();
        }
        if (f10) {
            i12 = this.D0;
        } else {
            i12 = -this.E0;
        }
        if (getNavigationIcon() == null) {
            i13 = getResources().getDimensionPixelOffset(v6.d.f24687m);
            if (!f10) {
                i13 = -i13;
            }
        }
        return i11 - ((left + i12) + i13);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public Behavior getBehavior() {
        if (this.B0 == null) {
            this.B0 = new Behavior();
        }
        return this.B0;
    }

    /* loaded from: classes3.dex */
    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {

        /* renamed from: m  reason: collision with root package name */
        private final Rect f9600m;

        /* renamed from: n  reason: collision with root package name */
        private WeakReference<BottomAppBar> f9601n;

        /* renamed from: o  reason: collision with root package name */
        private int f9602o;

        /* renamed from: p  reason: collision with root package name */
        private final View.OnLayoutChangeListener f9603p;

        /* loaded from: classes3.dex */
        class a implements View.OnLayoutChangeListener {
            a() {
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                BottomAppBar bottomAppBar = (BottomAppBar) Behavior.this.f9601n.get();
                if (bottomAppBar != null && ((view instanceof FloatingActionButton) || (view instanceof ExtendedFloatingActionButton))) {
                    int height = view.getHeight();
                    if (view instanceof FloatingActionButton) {
                        FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                        floatingActionButton.j(Behavior.this.f9600m);
                        int height2 = Behavior.this.f9600m.height();
                        bottomAppBar.H0(height2);
                        bottomAppBar.setFabCornerSize(floatingActionButton.getShapeAppearanceModel().r().a(new RectF(Behavior.this.f9600m)));
                        height = height2;
                    }
                    CoordinatorLayout.f fVar = (CoordinatorLayout.f) view.getLayoutParams();
                    if (Behavior.this.f9602o == 0) {
                        if (bottomAppBar.f9590q0 == 1) {
                            ((ViewGroup.MarginLayoutParams) fVar).bottomMargin = bottomAppBar.getBottomInset() + (bottomAppBar.getResources().getDimensionPixelOffset(v6.d.O) - ((view.getMeasuredHeight() - height) / 2));
                        }
                        ((ViewGroup.MarginLayoutParams) fVar).leftMargin = bottomAppBar.getLeftInset();
                        ((ViewGroup.MarginLayoutParams) fVar).rightMargin = bottomAppBar.getRightInset();
                        if (r.f(view)) {
                            ((ViewGroup.MarginLayoutParams) fVar).leftMargin += bottomAppBar.f9591r0;
                        } else {
                            ((ViewGroup.MarginLayoutParams) fVar).rightMargin += bottomAppBar.f9591r0;
                        }
                    }
                    bottomAppBar.F0();
                    return;
                }
                view.removeOnLayoutChangeListener(this);
            }
        }

        public Behavior() {
            this.f9603p = new a();
            this.f9600m = new Rect();
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: R  reason: merged with bridge method [inline-methods] */
        public boolean l(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, int i10) {
            this.f9601n = new WeakReference<>(bottomAppBar);
            View v02 = bottomAppBar.v0();
            if (v02 != null && !p0.Y(v02)) {
                BottomAppBar.K0(bottomAppBar, v02);
                this.f9602o = ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) v02.getLayoutParams())).bottomMargin;
                if (v02 instanceof FloatingActionButton) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) v02;
                    if (bottomAppBar.f9590q0 == 0 && bottomAppBar.f9594u0) {
                        p0.C0(floatingActionButton, 0.0f);
                        floatingActionButton.setCompatElevation(0.0f);
                    }
                    if (floatingActionButton.getShowMotionSpec() == null) {
                        floatingActionButton.setShowMotionSpecResource(v6.a.f24619b);
                    }
                    if (floatingActionButton.getHideMotionSpec() == null) {
                        floatingActionButton.setHideMotionSpecResource(v6.a.f24618a);
                    }
                    bottomAppBar.n0(floatingActionButton);
                }
                v02.addOnLayoutChangeListener(this.f9603p);
                bottomAppBar.F0();
            }
            coordinatorLayout.C(bottomAppBar, i10);
            return super.l(coordinatorLayout, bottomAppBar, i10);
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: S  reason: merged with bridge method [inline-methods] */
        public boolean A(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, View view, View view2, int i10, int i11) {
            if (bottomAppBar.getHideOnScroll() && super.A(coordinatorLayout, bottomAppBar, view, view2, i10, i11)) {
                return true;
            }
            return false;
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f9603p = new a();
            this.f9600m = new Rect();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }
}
