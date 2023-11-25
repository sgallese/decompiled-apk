package com.google.android.material.appbar;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.accessibility.n0;
import androidx.core.view.accessibility.s0;
import androidx.core.view.c0;
import androidx.core.view.h0;
import androidx.core.view.p0;
import androidx.core.view.p1;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.appbar.AppBarLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public class AppBarLayout extends LinearLayout implements CoordinatorLayout.b {
    private static final int L = v6.k.f24799i;
    private WeakReference<View> A;
    private final ColorStateList B;
    private ValueAnimator C;
    private ValueAnimator.AnimatorUpdateListener D;
    private final List<f> E;
    private final long F;
    private final TimeInterpolator G;
    private int[] H;
    private Drawable I;
    private final float J;
    private Behavior K;

    /* renamed from: f  reason: collision with root package name */
    private int f9409f;

    /* renamed from: m  reason: collision with root package name */
    private int f9410m;

    /* renamed from: p  reason: collision with root package name */
    private int f9411p;

    /* renamed from: q  reason: collision with root package name */
    private int f9412q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f9413r;

    /* renamed from: s  reason: collision with root package name */
    private int f9414s;

    /* renamed from: t  reason: collision with root package name */
    private p1 f9415t;

    /* renamed from: u  reason: collision with root package name */
    private List<b> f9416u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f9417v;

    /* renamed from: w  reason: collision with root package name */
    private boolean f9418w;

    /* renamed from: x  reason: collision with root package name */
    private boolean f9419x;

    /* renamed from: y  reason: collision with root package name */
    private boolean f9420y;

    /* renamed from: z  reason: collision with root package name */
    private int f9421z;

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes3.dex */
    public static class BaseBehavior<T extends AppBarLayout> extends k<T> {

        /* renamed from: k  reason: collision with root package name */
        private int f9422k;

        /* renamed from: l  reason: collision with root package name */
        private int f9423l;

        /* renamed from: m  reason: collision with root package name */
        private ValueAnimator f9424m;

        /* renamed from: n  reason: collision with root package name */
        private SavedState f9425n;

        /* renamed from: o  reason: collision with root package name */
        private WeakReference<View> f9426o;

        /* renamed from: p  reason: collision with root package name */
        private boolean f9427p;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes3.dex */
        public class a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ CoordinatorLayout f9433a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ AppBarLayout f9434b;

            a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
                this.f9433a = coordinatorLayout;
                this.f9434b = appBarLayout;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                BaseBehavior.this.P(this.f9433a, this.f9434b, ((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes3.dex */
        public class b extends androidx.core.view.a {
            b() {
            }

            @Override // androidx.core.view.a
            public void g(View view, n0 n0Var) {
                super.g(view, n0Var);
                n0Var.P0(BaseBehavior.this.f9427p);
                n0Var.n0(ScrollView.class.getName());
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes3.dex */
        public class c implements s0 {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ CoordinatorLayout f9437a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ AppBarLayout f9438b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ View f9439c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ int f9440d;

            c(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10) {
                this.f9437a = coordinatorLayout;
                this.f9438b = appBarLayout;
                this.f9439c = view;
                this.f9440d = i10;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.core.view.accessibility.s0
            public boolean a(View view, s0.a aVar) {
                BaseBehavior.this.q(this.f9437a, this.f9438b, this.f9439c, 0, this.f9440d, new int[]{0, 0}, 1);
                return true;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes3.dex */
        public class d implements s0 {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ AppBarLayout f9442a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ boolean f9443b;

            d(AppBarLayout appBarLayout, boolean z10) {
                this.f9442a = appBarLayout;
                this.f9443b = z10;
            }

            @Override // androidx.core.view.accessibility.s0
            public boolean a(View view, s0.a aVar) {
                this.f9442a.setExpanded(this.f9443b);
                return true;
            }
        }

        public BaseBehavior() {
        }

        private boolean A0(CoordinatorLayout coordinatorLayout, T t10) {
            List<View> m10 = coordinatorLayout.m(t10);
            int size = m10.size();
            for (int i10 = 0; i10 < size; i10++) {
                CoordinatorLayout.c f10 = ((CoordinatorLayout.f) m10.get(i10).getLayoutParams()).f();
                if (f10 instanceof ScrollingViewBehavior) {
                    if (((ScrollingViewBehavior) f10).K() == 0) {
                        return false;
                    }
                    return true;
                }
            }
            return false;
        }

        private void B0(CoordinatorLayout coordinatorLayout, T t10) {
            int topInset = t10.getTopInset() + t10.getPaddingTop();
            int M = M() - topInset;
            int h02 = h0(t10, M);
            if (h02 >= 0) {
                View childAt = t10.getChildAt(h02);
                e eVar = (e) childAt.getLayoutParams();
                int c10 = eVar.c();
                if ((c10 & 17) == 17) {
                    int i10 = -childAt.getTop();
                    int i11 = -childAt.getBottom();
                    if (h02 == 0 && p0.B(t10) && p0.B(childAt)) {
                        i10 -= t10.getTopInset();
                    }
                    if (c0(c10, 2)) {
                        i11 += p0.F(childAt);
                    } else if (c0(c10, 5)) {
                        int F = p0.F(childAt) + i11;
                        if (M < F) {
                            i10 = F;
                        } else {
                            i11 = F;
                        }
                    }
                    if (c0(c10, 32)) {
                        i10 += ((LinearLayout.LayoutParams) eVar).topMargin;
                        i11 -= ((LinearLayout.LayoutParams) eVar).bottomMargin;
                    }
                    X(coordinatorLayout, t10, t2.a.b(Z(M, i11, i10) + topInset, -t10.getTotalScrollRange(), 0), 0.0f);
                }
            }
        }

        private void C0(CoordinatorLayout coordinatorLayout, T t10) {
            View i02;
            p0.o0(coordinatorLayout, n0.a.f4089q.b());
            p0.o0(coordinatorLayout, n0.a.f4090r.b());
            if (t10.getTotalScrollRange() == 0 || (i02 = i0(coordinatorLayout)) == null || !d0(t10)) {
                return;
            }
            if (!p0.S(coordinatorLayout)) {
                p0.u0(coordinatorLayout, new b());
            }
            this.f9427p = V(coordinatorLayout, t10, i02);
        }

        private void D0(CoordinatorLayout coordinatorLayout, T t10, int i10, int i11, boolean z10) {
            View g02 = g0(t10, i10);
            boolean z11 = false;
            if (g02 != null) {
                int c10 = ((e) g02.getLayoutParams()).c();
                if ((c10 & 1) != 0) {
                    int F = p0.F(g02);
                    if (i11 <= 0 || (c10 & 12) == 0 ? !((c10 & 2) == 0 || (-i10) < (g02.getBottom() - F) - t10.getTopInset()) : (-i10) >= (g02.getBottom() - F) - t10.getTopInset()) {
                        z11 = true;
                    }
                }
            }
            if (t10.p()) {
                z11 = t10.D(f0(coordinatorLayout));
            }
            boolean A = t10.A(z11);
            if (z10 || (A && A0(coordinatorLayout, t10))) {
                t10.jumpDrawablesToCurrentState();
            }
        }

        private boolean V(CoordinatorLayout coordinatorLayout, T t10, View view) {
            boolean z10 = false;
            if (M() != (-t10.getTotalScrollRange())) {
                W(coordinatorLayout, t10, n0.a.f4089q, false);
                z10 = true;
            }
            if (M() != 0) {
                if (view.canScrollVertically(-1)) {
                    int i10 = -t10.getDownNestedPreScrollRange();
                    if (i10 != 0) {
                        p0.q0(coordinatorLayout, n0.a.f4090r, null, new c(coordinatorLayout, t10, view, i10));
                        return true;
                    }
                } else {
                    W(coordinatorLayout, t10, n0.a.f4090r, true);
                    return true;
                }
            }
            return z10;
        }

        private void W(CoordinatorLayout coordinatorLayout, T t10, n0.a aVar, boolean z10) {
            p0.q0(coordinatorLayout, aVar, null, new d(t10, z10));
        }

        private void X(CoordinatorLayout coordinatorLayout, T t10, int i10, float f10) {
            int height;
            int abs = Math.abs(M() - i10);
            float abs2 = Math.abs(f10);
            if (abs2 > 0.0f) {
                height = Math.round((abs / abs2) * 1000.0f) * 3;
            } else {
                height = (int) (((abs / t10.getHeight()) + 1.0f) * 150.0f);
            }
            Y(coordinatorLayout, t10, i10, height);
        }

        private void Y(CoordinatorLayout coordinatorLayout, T t10, int i10, int i11) {
            int M = M();
            if (M == i10) {
                ValueAnimator valueAnimator = this.f9424m;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f9424m.cancel();
                    return;
                }
                return;
            }
            ValueAnimator valueAnimator2 = this.f9424m;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.f9424m = valueAnimator3;
                valueAnimator3.setInterpolator(w6.a.f25414e);
                this.f9424m.addUpdateListener(new a(coordinatorLayout, t10));
            } else {
                valueAnimator2.cancel();
            }
            this.f9424m.setDuration(Math.min(i11, 600));
            this.f9424m.setIntValues(M, i10);
            this.f9424m.start();
        }

        private int Z(int i10, int i11, int i12) {
            if (i10 >= (i11 + i12) / 2) {
                return i12;
            }
            return i11;
        }

        private boolean b0(CoordinatorLayout coordinatorLayout, T t10, View view) {
            if (t10.l() && coordinatorLayout.getHeight() - view.getHeight() <= t10.getHeight()) {
                return true;
            }
            return false;
        }

        private static boolean c0(int i10, int i11) {
            if ((i10 & i11) == i11) {
                return true;
            }
            return false;
        }

        private boolean d0(AppBarLayout appBarLayout) {
            int childCount = appBarLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                if (((e) appBarLayout.getChildAt(i10).getLayoutParams()).f9448a != 0) {
                    return true;
                }
            }
            return false;
        }

        private void e0(KeyEvent keyEvent, View view, AppBarLayout appBarLayout) {
            if (keyEvent.getAction() == 0 || keyEvent.getAction() == 1) {
                int keyCode = keyEvent.getKeyCode();
                if (keyCode != 19 && keyCode != 280 && keyCode != 92) {
                    if ((keyCode == 20 || keyCode == 281 || keyCode == 93) && view.getScrollY() > 0) {
                        appBarLayout.setExpanded(false);
                    }
                } else if (view.getScrollY() < view.getMeasuredHeight() * 0.1d) {
                    appBarLayout.setExpanded(true);
                }
            }
        }

        private View f0(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = coordinatorLayout.getChildAt(i10);
                if ((childAt instanceof c0) || (childAt instanceof AbsListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        private static View g0(AppBarLayout appBarLayout, int i10) {
            int abs = Math.abs(i10);
            int childCount = appBarLayout.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = appBarLayout.getChildAt(i11);
                if (abs >= childAt.getTop() && abs <= childAt.getBottom()) {
                    return childAt;
                }
            }
            return null;
        }

        private int h0(T t10, int i10) {
            int childCount = t10.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = t10.getChildAt(i11);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                e eVar = (e) childAt.getLayoutParams();
                if (c0(eVar.c(), 32)) {
                    top -= ((LinearLayout.LayoutParams) eVar).topMargin;
                    bottom += ((LinearLayout.LayoutParams) eVar).bottomMargin;
                }
                int i12 = -i10;
                if (top <= i12 && bottom >= i12) {
                    return i11;
                }
            }
            return -1;
        }

        private View i0(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = coordinatorLayout.getChildAt(i10);
                if (((CoordinatorLayout.f) childAt.getLayoutParams()).f() instanceof ScrollingViewBehavior) {
                    return childAt;
                }
            }
            return null;
        }

        private int l0(T t10, int i10) {
            int abs = Math.abs(i10);
            int childCount = t10.getChildCount();
            int i11 = 0;
            int i12 = 0;
            while (true) {
                if (i12 >= childCount) {
                    break;
                }
                View childAt = t10.getChildAt(i12);
                e eVar = (e) childAt.getLayoutParams();
                Interpolator d10 = eVar.d();
                if (abs >= childAt.getTop() && abs <= childAt.getBottom()) {
                    if (d10 != null) {
                        int c10 = eVar.c();
                        if ((c10 & 1) != 0) {
                            i11 = 0 + childAt.getHeight() + ((LinearLayout.LayoutParams) eVar).topMargin + ((LinearLayout.LayoutParams) eVar).bottomMargin;
                            if ((c10 & 2) != 0) {
                                i11 -= p0.F(childAt);
                            }
                        }
                        if (p0.B(childAt)) {
                            i11 -= t10.getTopInset();
                        }
                        if (i11 > 0) {
                            float f10 = i11;
                            return Integer.signum(i10) * (childAt.getTop() + Math.round(f10 * d10.getInterpolation((abs - childAt.getTop()) / f10)));
                        }
                    }
                } else {
                    i12++;
                }
            }
            return i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ boolean m0(View view, AppBarLayout appBarLayout, View view2, KeyEvent keyEvent) {
            e0(keyEvent, view, appBarLayout);
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ boolean n0(View view, AppBarLayout appBarLayout, View view2, int i10, KeyEvent keyEvent) {
            e0(keyEvent, view, appBarLayout);
            return false;
        }

        @Override // com.google.android.material.appbar.k
        int M() {
            return E() + this.f9422k;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.k
        /* renamed from: a0  reason: merged with bridge method [inline-methods] */
        public boolean H(T t10) {
            WeakReference<View> weakReference = this.f9426o;
            if (weakReference == null) {
                return true;
            }
            View view = weakReference.get();
            if (view != null && view.isShown() && !view.canScrollVertically(-1)) {
                return true;
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.k
        /* renamed from: j0  reason: merged with bridge method [inline-methods] */
        public int K(T t10) {
            return -t10.getDownNestedScrollRange();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.k
        /* renamed from: k0  reason: merged with bridge method [inline-methods] */
        public int L(T t10) {
            return t10.getTotalScrollRange();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.k
        /* renamed from: o0  reason: merged with bridge method [inline-methods] */
        public void N(CoordinatorLayout coordinatorLayout, T t10) {
            B0(coordinatorLayout, t10);
            if (t10.p()) {
                t10.A(t10.D(f0(coordinatorLayout)));
            }
        }

        @Override // com.google.android.material.appbar.m, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: p0  reason: merged with bridge method [inline-methods] */
        public boolean l(CoordinatorLayout coordinatorLayout, final T t10, int i10) {
            boolean z10;
            int round;
            boolean l10 = super.l(coordinatorLayout, t10, i10);
            int pendingAction = t10.getPendingAction();
            SavedState savedState = this.f9425n;
            if (savedState != null && (pendingAction & 8) == 0) {
                if (savedState.f9428p) {
                    P(coordinatorLayout, t10, -t10.getTotalScrollRange());
                } else if (savedState.f9429q) {
                    P(coordinatorLayout, t10, 0);
                } else {
                    View childAt = t10.getChildAt(savedState.f9430r);
                    int i11 = -childAt.getBottom();
                    if (this.f9425n.f9432t) {
                        round = p0.F(childAt) + t10.getTopInset();
                    } else {
                        round = Math.round(childAt.getHeight() * this.f9425n.f9431s);
                    }
                    P(coordinatorLayout, t10, i11 + round);
                }
            } else if (pendingAction != 0) {
                if ((pendingAction & 4) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if ((pendingAction & 2) != 0) {
                    int i12 = -t10.getUpNestedPreScrollRange();
                    if (z10) {
                        X(coordinatorLayout, t10, i12, 0.0f);
                    } else {
                        P(coordinatorLayout, t10, i12);
                    }
                } else if ((pendingAction & 1) != 0) {
                    if (z10) {
                        X(coordinatorLayout, t10, 0, 0.0f);
                    } else {
                        P(coordinatorLayout, t10, 0);
                    }
                }
            }
            t10.w();
            this.f9425n = null;
            G(t2.a.b(E(), -t10.getTotalScrollRange(), 0));
            D0(coordinatorLayout, t10, E(), 0, true);
            t10.s(E());
            C0(coordinatorLayout, t10);
            final View f02 = f0(coordinatorLayout);
            if (f02 != null) {
                if (Build.VERSION.SDK_INT >= 28) {
                    f02.addOnUnhandledKeyEventListener(new View.OnUnhandledKeyEventListener() { // from class: com.google.android.material.appbar.e
                        @Override // android.view.View.OnUnhandledKeyEventListener
                        public final boolean onUnhandledKeyEvent(View view, KeyEvent keyEvent) {
                            boolean m02;
                            m02 = AppBarLayout.BaseBehavior.this.m0(f02, t10, view, keyEvent);
                            return m02;
                        }
                    });
                } else {
                    f02.setOnKeyListener(new View.OnKeyListener() { // from class: com.google.android.material.appbar.f
                        @Override // android.view.View.OnKeyListener
                        public final boolean onKey(View view, int i13, KeyEvent keyEvent) {
                            boolean n02;
                            n02 = AppBarLayout.BaseBehavior.this.n0(f02, t10, view, i13, keyEvent);
                            return n02;
                        }
                    });
                }
            }
            return l10;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: q0  reason: merged with bridge method [inline-methods] */
        public boolean m(CoordinatorLayout coordinatorLayout, T t10, int i10, int i11, int i12, int i13) {
            if (((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) t10.getLayoutParams())).height == -2) {
                coordinatorLayout.D(t10, i10, i11, View.MeasureSpec.makeMeasureSpec(0, 0), i13);
                return true;
            }
            return super.m(coordinatorLayout, t10, i10, i11, i12, i13);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: r0  reason: merged with bridge method [inline-methods] */
        public void q(CoordinatorLayout coordinatorLayout, T t10, View view, int i10, int i11, int[] iArr, int i12) {
            int i13;
            int i14;
            if (i11 != 0) {
                if (i11 < 0) {
                    int i15 = -t10.getTotalScrollRange();
                    i13 = i15;
                    i14 = t10.getDownNestedPreScrollRange() + i15;
                } else {
                    i13 = -t10.getUpNestedPreScrollRange();
                    i14 = 0;
                }
                if (i13 != i14) {
                    iArr[1] = O(coordinatorLayout, t10, i11, i13, i14);
                }
            }
            if (t10.p()) {
                t10.A(t10.D(view));
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: s0  reason: merged with bridge method [inline-methods] */
        public void t(CoordinatorLayout coordinatorLayout, T t10, View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
            if (i13 < 0) {
                iArr[1] = O(coordinatorLayout, t10, i13, -t10.getDownNestedScrollRange(), 0);
            }
            if (i13 == 0) {
                C0(coordinatorLayout, t10);
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: t0  reason: merged with bridge method [inline-methods] */
        public void x(CoordinatorLayout coordinatorLayout, T t10, Parcelable parcelable) {
            if (parcelable instanceof SavedState) {
                x0((SavedState) parcelable, true);
                super.x(coordinatorLayout, t10, this.f9425n.a());
                return;
            }
            super.x(coordinatorLayout, t10, parcelable);
            this.f9425n = null;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: u0  reason: merged with bridge method [inline-methods] */
        public Parcelable y(CoordinatorLayout coordinatorLayout, T t10) {
            Parcelable y10 = super.y(coordinatorLayout, t10);
            SavedState y02 = y0(y10, t10);
            if (y02 != null) {
                return y02;
            }
            return y10;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: v0  reason: merged with bridge method [inline-methods] */
        public boolean A(CoordinatorLayout coordinatorLayout, T t10, View view, View view2, int i10, int i11) {
            boolean z10;
            ValueAnimator valueAnimator;
            if ((i10 & 2) != 0 && (t10.p() || b0(coordinatorLayout, t10, view))) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 && (valueAnimator = this.f9424m) != null) {
                valueAnimator.cancel();
            }
            this.f9426o = null;
            this.f9423l = i11;
            return z10;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: w0  reason: merged with bridge method [inline-methods] */
        public void C(CoordinatorLayout coordinatorLayout, T t10, View view, int i10) {
            if (this.f9423l == 0 || i10 == 1) {
                B0(coordinatorLayout, t10);
                if (t10.p()) {
                    t10.A(t10.D(view));
                }
            }
            this.f9426o = new WeakReference<>(view);
        }

        void x0(SavedState savedState, boolean z10) {
            if (this.f9425n == null || z10) {
                this.f9425n = savedState;
            }
        }

        SavedState y0(Parcelable parcelable, T t10) {
            boolean z10;
            boolean z11;
            int E = E();
            int childCount = t10.getChildCount();
            boolean z12 = false;
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = t10.getChildAt(i10);
                int bottom = childAt.getBottom() + E;
                if (childAt.getTop() + E <= 0 && bottom >= 0) {
                    if (parcelable == null) {
                        parcelable = AbsSavedState.f4318m;
                    }
                    SavedState savedState = new SavedState(parcelable);
                    if (E == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    savedState.f9429q = z10;
                    if (!z10 && (-E) >= t10.getTotalScrollRange()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    savedState.f9428p = z11;
                    savedState.f9430r = i10;
                    if (bottom == p0.F(childAt) + t10.getTopInset()) {
                        z12 = true;
                    }
                    savedState.f9432t = z12;
                    savedState.f9431s = bottom / childAt.getHeight();
                    return savedState;
                }
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.k
        /* renamed from: z0  reason: merged with bridge method [inline-methods] */
        public int Q(CoordinatorLayout coordinatorLayout, T t10, int i10, int i11, int i12) {
            int i13;
            int i14;
            int M = M();
            int i15 = 0;
            if (i11 != 0 && M >= i11 && M <= i12) {
                int b10 = t2.a.b(i10, i11, i12);
                if (M != b10) {
                    if (t10.j()) {
                        i13 = l0(t10, b10);
                    } else {
                        i13 = b10;
                    }
                    boolean G = G(i13);
                    int i16 = M - b10;
                    this.f9422k = b10 - i13;
                    if (G) {
                        while (i15 < t10.getChildCount()) {
                            e eVar = (e) t10.getChildAt(i15).getLayoutParams();
                            c b11 = eVar.b();
                            if (b11 != null && (eVar.c() & 1) != 0) {
                                b11.a(t10, t10.getChildAt(i15), E());
                            }
                            i15++;
                        }
                    }
                    if (!G && t10.j()) {
                        coordinatorLayout.f(t10);
                    }
                    t10.s(E());
                    if (b10 < M) {
                        i14 = -1;
                    } else {
                        i14 = 1;
                    }
                    D0(coordinatorLayout, t10, b10, i14, false);
                    i15 = i16;
                }
            } else {
                this.f9422k = 0;
            }
            C0(coordinatorLayout, t10);
            return i15;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* loaded from: classes3.dex */
        public static class SavedState extends AbsSavedState {
            public static final Parcelable.Creator<SavedState> CREATOR = new a();

            /* renamed from: p  reason: collision with root package name */
            boolean f9428p;

            /* renamed from: q  reason: collision with root package name */
            boolean f9429q;

            /* renamed from: r  reason: collision with root package name */
            int f9430r;

            /* renamed from: s  reason: collision with root package name */
            float f9431s;

            /* renamed from: t  reason: collision with root package name */
            boolean f9432t;

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

            public SavedState(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.f9428p = parcel.readByte() != 0;
                this.f9429q = parcel.readByte() != 0;
                this.f9430r = parcel.readInt();
                this.f9431s = parcel.readFloat();
                this.f9432t = parcel.readByte() != 0;
            }

            @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i10) {
                super.writeToParcel(parcel, i10);
                parcel.writeByte(this.f9428p ? (byte) 1 : (byte) 0);
                parcel.writeByte(this.f9429q ? (byte) 1 : (byte) 0);
                parcel.writeInt(this.f9430r);
                parcel.writeFloat(this.f9431s);
                parcel.writeByte(this.f9432t ? (byte) 1 : (byte) 0);
            }

            public SavedState(Parcelable parcelable) {
                super(parcelable);
            }
        }
    }

    /* loaded from: classes3.dex */
    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        @Override // com.google.android.material.appbar.k, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean D(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return super.D(coordinatorLayout, view, motionEvent);
        }

        @Override // com.google.android.material.appbar.m
        public /* bridge */ /* synthetic */ int E() {
            return super.E();
        }

        @Override // com.google.android.material.appbar.m
        public /* bridge */ /* synthetic */ boolean G(int i10) {
            return super.G(i10);
        }

        @Override // com.google.android.material.appbar.k, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return super.k(coordinatorLayout, view, motionEvent);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: p0 */
        public /* bridge */ /* synthetic */ boolean l(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10) {
            return super.l(coordinatorLayout, appBarLayout, i10);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: q0 */
        public /* bridge */ /* synthetic */ boolean m(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10, int i11, int i12, int i13) {
            return super.m(coordinatorLayout, appBarLayout, i10, i11, i12, i13);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: r0 */
        public /* bridge */ /* synthetic */ void q(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10, int i11, int[] iArr, int i12) {
            super.q(coordinatorLayout, appBarLayout, view, i10, i11, iArr, i12);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: s0 */
        public /* bridge */ /* synthetic */ void t(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
            super.t(coordinatorLayout, appBarLayout, view, i10, i11, i12, i13, i14, iArr);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: t0 */
        public /* bridge */ /* synthetic */ void x(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, Parcelable parcelable) {
            super.x(coordinatorLayout, appBarLayout, parcelable);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: u0 */
        public /* bridge */ /* synthetic */ Parcelable y(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            return super.y(coordinatorLayout, appBarLayout);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: v0 */
        public /* bridge */ /* synthetic */ boolean A(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i10, int i11) {
            return super.A(coordinatorLayout, appBarLayout, view, view2, i10, i11);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: w0 */
        public /* bridge */ /* synthetic */ void C(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10) {
            super.C(coordinatorLayout, appBarLayout, view, i10);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* loaded from: classes3.dex */
    public static class ScrollingViewBehavior extends l {
        public ScrollingViewBehavior() {
        }

        private static int R(AppBarLayout appBarLayout) {
            CoordinatorLayout.c f10 = ((CoordinatorLayout.f) appBarLayout.getLayoutParams()).f();
            if (f10 instanceof BaseBehavior) {
                return ((BaseBehavior) f10).M();
            }
            return 0;
        }

        private void S(View view, View view2) {
            CoordinatorLayout.c f10 = ((CoordinatorLayout.f) view2.getLayoutParams()).f();
            if (f10 instanceof BaseBehavior) {
                p0.f0(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) f10).f9422k) + M()) - I(view2));
            }
        }

        private void T(View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.p()) {
                    appBarLayout.A(appBarLayout.D(view));
                }
            }
        }

        @Override // com.google.android.material.appbar.l
        float J(View view) {
            int i10;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                int R = R(appBarLayout);
                if ((downNestedPreScrollRange == 0 || totalScrollRange + R > downNestedPreScrollRange) && (i10 = totalScrollRange - downNestedPreScrollRange) != 0) {
                    return (R / i10) + 1.0f;
                }
            }
            return 0.0f;
        }

        @Override // com.google.android.material.appbar.l
        int L(View view) {
            if (view instanceof AppBarLayout) {
                return ((AppBarLayout) view).getTotalScrollRange();
            }
            return super.L(view);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.l
        /* renamed from: Q  reason: merged with bridge method [inline-methods] */
        public AppBarLayout H(List<View> list) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                View view = list.get(i10);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean e(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            S(view, view2);
            T(view, view2);
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public void i(CoordinatorLayout coordinatorLayout, View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                p0.o0(coordinatorLayout, n0.a.f4089q.b());
                p0.o0(coordinatorLayout, n0.a.f4090r.b());
                p0.u0(coordinatorLayout, null);
            }
        }

        @Override // com.google.android.material.appbar.m, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean l(CoordinatorLayout coordinatorLayout, View view, int i10) {
            return super.l(coordinatorLayout, view, i10);
        }

        @Override // com.google.android.material.appbar.l, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean m(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int i13) {
            return super.m(coordinatorLayout, view, i10, i11, i12, i13);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean w(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z10) {
            AppBarLayout H = H(coordinatorLayout.l(view));
            if (H != null) {
                Rect rect2 = new Rect(rect);
                rect2.offset(view.getLeft(), view.getTop());
                Rect rect3 = this.f9496d;
                rect3.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect3.contains(rect2)) {
                    H.x(false, !z10);
                    return true;
                }
            }
            return false;
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, v6.l.E5);
            O(obtainStyledAttributes.getDimensionPixelSize(v6.l.F5, 0));
            obtainStyledAttributes.recycle();
        }
    }

    /* loaded from: classes3.dex */
    class a implements h0 {
        a() {
        }

        @Override // androidx.core.view.h0
        public p1 a(View view, p1 p1Var) {
            return AppBarLayout.this.t(p1Var);
        }
    }

    /* loaded from: classes3.dex */
    public interface b<T extends AppBarLayout> {
        void a(T t10, int i10);
    }

    /* loaded from: classes3.dex */
    public static abstract class c {
        public abstract void a(AppBarLayout appBarLayout, View view, float f10);
    }

    /* loaded from: classes3.dex */
    public static class d extends c {

        /* renamed from: a  reason: collision with root package name */
        private final Rect f9446a = new Rect();

        /* renamed from: b  reason: collision with root package name */
        private final Rect f9447b = new Rect();

        private static void b(Rect rect, AppBarLayout appBarLayout, View view) {
            view.getDrawingRect(rect);
            appBarLayout.offsetDescendantRectToMyCoords(view, rect);
            rect.offset(0, -appBarLayout.getTopInset());
        }

        @Override // com.google.android.material.appbar.AppBarLayout.c
        public void a(AppBarLayout appBarLayout, View view, float f10) {
            b(this.f9446a, appBarLayout, view);
            float abs = this.f9446a.top - Math.abs(f10);
            if (abs <= 0.0f) {
                float a10 = 1.0f - t2.a.a(Math.abs(abs / this.f9446a.height()), 0.0f, 1.0f);
                float height = (-abs) - ((this.f9446a.height() * 0.3f) * (1.0f - (a10 * a10)));
                view.setTranslationY(height);
                view.getDrawingRect(this.f9447b);
                this.f9447b.offset(0, (int) (-height));
                p0.B0(view, this.f9447b);
                return;
            }
            p0.B0(view, null);
            view.setTranslationY(0.0f);
        }
    }

    /* loaded from: classes3.dex */
    public interface f {
        void a(float f10, int i10);
    }

    /* loaded from: classes3.dex */
    public interface g extends b<AppBarLayout> {
    }

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, v6.b.f24622a);
    }

    private boolean C() {
        if (this.I != null && getTopInset() > 0) {
            return true;
        }
        return false;
    }

    private boolean E() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        if (childAt.getVisibility() == 8 || p0.B(childAt)) {
            return false;
        }
        return true;
    }

    private void F(float f10, float f11) {
        ValueAnimator valueAnimator = this.C;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f11);
        this.C = ofFloat;
        ofFloat.setDuration(this.F);
        this.C.setInterpolator(this.G);
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.D;
        if (animatorUpdateListener != null) {
            this.C.addUpdateListener(animatorUpdateListener);
        }
        this.C.start();
    }

    private void G() {
        setWillNotDraw(!C());
    }

    private void e() {
        WeakReference<View> weakReference = this.A;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.A = null;
    }

    private View f(View view) {
        int i10;
        View view2;
        if (this.A == null && (i10 = this.f9421z) != -1) {
            if (view != null) {
                view2 = view.findViewById(i10);
            } else {
                view2 = null;
            }
            if (view2 == null && (getParent() instanceof ViewGroup)) {
                view2 = ((ViewGroup) getParent()).findViewById(this.f9421z);
            }
            if (view2 != null) {
                this.A = new WeakReference<>(view2);
            }
        }
        WeakReference<View> weakReference = this.A;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    private boolean k() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            if (((e) getChildAt(i10).getLayoutParams()).e()) {
                return true;
            }
        }
        return false;
    }

    private void m(final p7.g gVar) {
        int i10;
        if (this.f9419x) {
            i10 = 255;
        } else {
            i10 = 0;
        }
        gVar.setAlpha(i10);
        gVar.b0(this.B);
        this.D = new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.appbar.b
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                AppBarLayout.this.q(gVar, valueAnimator);
            }
        };
    }

    private void n(Context context, final p7.g gVar) {
        gVar.Q(context);
        this.D = new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.appbar.c
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                AppBarLayout.this.r(gVar, valueAnimator);
            }
        };
    }

    private void o() {
        BaseBehavior.SavedState savedState;
        Behavior behavior = this.K;
        if (behavior != null && this.f9410m != -1 && this.f9414s == 0) {
            savedState = behavior.y0(AbsSavedState.f4318m, this);
        } else {
            savedState = null;
        }
        this.f9410m = -1;
        this.f9411p = -1;
        this.f9412q = -1;
        if (savedState != null) {
            this.K.x0(savedState, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q(p7.g gVar, ValueAnimator valueAnimator) {
        int floatValue = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
        gVar.setAlpha(floatValue);
        for (f fVar : this.E) {
            if (gVar.x() != null) {
                fVar.a(0.0f, gVar.x().withAlpha(floatValue).getDefaultColor());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r(p7.g gVar, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        gVar.a0(floatValue);
        Drawable drawable = this.I;
        if (drawable instanceof p7.g) {
            ((p7.g) drawable).a0(floatValue);
        }
        Iterator<f> it = this.E.iterator();
        while (it.hasNext()) {
            it.next().a(floatValue, gVar.A());
        }
    }

    private void y(boolean z10, boolean z11, boolean z12) {
        int i10;
        int i11;
        if (z10) {
            i10 = 1;
        } else {
            i10 = 2;
        }
        int i12 = 0;
        if (z11) {
            i11 = 4;
        } else {
            i11 = 0;
        }
        int i13 = i10 | i11;
        if (z12) {
            i12 = 8;
        }
        this.f9414s = i13 | i12;
        requestLayout();
    }

    private boolean z(boolean z10) {
        if (this.f9418w != z10) {
            this.f9418w = z10;
            refreshDrawableState();
            return true;
        }
        return false;
    }

    boolean A(boolean z10) {
        return B(z10, !this.f9417v);
    }

    boolean B(boolean z10, boolean z11) {
        float f10;
        float f11;
        if (z11 && this.f9419x != z10) {
            this.f9419x = z10;
            refreshDrawableState();
            if (this.f9420y && (getBackground() instanceof p7.g)) {
                float f12 = 0.0f;
                if (this.B != null) {
                    if (z10) {
                        f11 = 0.0f;
                    } else {
                        f11 = 255.0f;
                    }
                    if (z10) {
                        f12 = 255.0f;
                    }
                    F(f11, f12);
                    return true;
                }
                if (z10) {
                    f10 = 0.0f;
                } else {
                    f10 = this.J;
                }
                if (z10) {
                    f12 = this.J;
                }
                F(f10, f12);
                return true;
            }
            return true;
        }
        return false;
    }

    boolean D(View view) {
        View f10 = f(view);
        if (f10 != null) {
            view = f10;
        }
        if (view != null && (view.canScrollVertically(-1) || view.getScrollY() > 0)) {
            return true;
        }
        return false;
    }

    public void c(b bVar) {
        if (this.f9416u == null) {
            this.f9416u = new ArrayList();
        }
        if (bVar != null && !this.f9416u.contains(bVar)) {
            this.f9416u.add(bVar);
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    public void d(g gVar) {
        c(gVar);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (C()) {
            int save = canvas.save();
            canvas.translate(0.0f, -this.f9409f);
            this.I.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.I;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: g  reason: merged with bridge method [inline-methods] */
    public e generateDefaultLayoutParams() {
        return new e(-1, -2);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public CoordinatorLayout.c<AppBarLayout> getBehavior() {
        Behavior behavior = new Behavior();
        this.K = behavior;
        return behavior;
    }

    int getDownNestedPreScrollRange() {
        int i10;
        int F;
        int i11 = this.f9411p;
        if (i11 != -1) {
            return i11;
        }
        int i12 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i13 = eVar.f9448a;
                if ((i13 & 5) == 5) {
                    int i14 = ((LinearLayout.LayoutParams) eVar).topMargin + ((LinearLayout.LayoutParams) eVar).bottomMargin;
                    if ((i13 & 8) != 0) {
                        F = p0.F(childAt);
                    } else if ((i13 & 2) != 0) {
                        F = measuredHeight - p0.F(childAt);
                    } else {
                        i10 = i14 + measuredHeight;
                        if (childCount == 0 && p0.B(childAt)) {
                            i10 = Math.min(i10, measuredHeight - getTopInset());
                        }
                        i12 += i10;
                    }
                    i10 = i14 + F;
                    if (childCount == 0) {
                        i10 = Math.min(i10, measuredHeight - getTopInset());
                    }
                    i12 += i10;
                } else if (i12 > 0) {
                    break;
                }
            }
        }
        int max = Math.max(0, i12);
        this.f9411p = max;
        return max;
    }

    int getDownNestedScrollRange() {
        int i10 = this.f9412q;
        if (i10 != -1) {
            return i10;
        }
        int childCount = getChildCount();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i11 >= childCount) {
                break;
            }
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight() + ((LinearLayout.LayoutParams) eVar).topMargin + ((LinearLayout.LayoutParams) eVar).bottomMargin;
                int i13 = eVar.f9448a;
                if ((i13 & 1) == 0) {
                    break;
                }
                i12 += measuredHeight;
                if ((i13 & 2) != 0) {
                    i12 -= p0.F(childAt);
                    break;
                }
            }
            i11++;
        }
        int max = Math.max(0, i12);
        this.f9412q = max;
        return max;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.f9421z;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        int F = p0.F(this);
        if (F == 0) {
            int childCount = getChildCount();
            if (childCount >= 1) {
                F = p0.F(getChildAt(childCount - 1));
            } else {
                F = 0;
            }
            if (F == 0) {
                return getHeight() / 3;
            }
        }
        return (F * 2) + topInset;
    }

    int getPendingAction() {
        return this.f9414s;
    }

    public Drawable getStatusBarForeground() {
        return this.I;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    final int getTopInset() {
        p1 p1Var = this.f9415t;
        if (p1Var != null) {
            return p1Var.l();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i10 = this.f9410m;
        if (i10 != -1) {
            return i10;
        }
        int childCount = getChildCount();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i11 >= childCount) {
                break;
            }
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i13 = eVar.f9448a;
                if ((i13 & 1) == 0) {
                    break;
                }
                i12 += measuredHeight + ((LinearLayout.LayoutParams) eVar).topMargin + ((LinearLayout.LayoutParams) eVar).bottomMargin;
                if (i11 == 0 && p0.B(childAt)) {
                    i12 -= getTopInset();
                }
                if ((i13 & 2) != 0) {
                    i12 -= p0.F(childAt);
                    break;
                }
            }
            i11++;
        }
        int max = Math.max(0, i12);
        this.f9410m = max;
        return max;
    }

    int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: h  reason: merged with bridge method [inline-methods] */
    public e generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: i  reason: merged with bridge method [inline-methods] */
    public e generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            return new e((LinearLayout.LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new e((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new e(layoutParams);
    }

    boolean j() {
        return this.f9413r;
    }

    boolean l() {
        if (getTotalScrollRange() != 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        p7.h.e(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i10) {
        int i11;
        int i12;
        if (this.H == null) {
            this.H = new int[4];
        }
        int[] iArr = this.H;
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + iArr.length);
        boolean z10 = this.f9418w;
        int i13 = v6.b.Z;
        if (!z10) {
            i13 = -i13;
        }
        iArr[0] = i13;
        if (z10 && this.f9419x) {
            i11 = v6.b.f24623a0;
        } else {
            i11 = -v6.b.f24623a0;
        }
        iArr[1] = i11;
        int i14 = v6.b.V;
        if (!z10) {
            i14 = -i14;
        }
        iArr[2] = i14;
        if (z10 && this.f9419x) {
            i12 = v6.b.U;
        } else {
            i12 = -v6.b.U;
        }
        iArr[3] = i12;
        return View.mergeDrawableStates(onCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        boolean z11 = true;
        if (p0.B(this) && E()) {
            int topInset = getTopInset();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                p0.f0(getChildAt(childCount), topInset);
            }
        }
        o();
        this.f9413r = false;
        int childCount2 = getChildCount();
        int i14 = 0;
        while (true) {
            if (i14 >= childCount2) {
                break;
            } else if (((e) getChildAt(i14).getLayoutParams()).d() != null) {
                this.f9413r = true;
                break;
            } else {
                i14++;
            }
        }
        Drawable drawable = this.I;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (!this.f9417v) {
            if (!this.f9420y && !k()) {
                z11 = false;
            }
            z(z11);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i11);
        if (mode != 1073741824 && p0.B(this) && E()) {
            int measuredHeight = getMeasuredHeight();
            if (mode != Integer.MIN_VALUE) {
                if (mode == 0) {
                    measuredHeight += getTopInset();
                }
            } else {
                measuredHeight = t2.a.b(getMeasuredHeight() + getTopInset(), 0, View.MeasureSpec.getSize(i11));
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
        o();
    }

    public boolean p() {
        return this.f9420y;
    }

    void s(int i10) {
        this.f9409f = i10;
        if (!willNotDraw()) {
            p0.l0(this);
        }
        List<b> list = this.f9416u;
        if (list != null) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                b bVar = this.f9416u.get(i11);
                if (bVar != null) {
                    bVar.a(this, i10);
                }
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        p7.h.d(this, f10);
    }

    public void setExpanded(boolean z10) {
        x(z10, p0.Y(this));
    }

    public void setLiftOnScroll(boolean z10) {
        this.f9420y = z10;
    }

    public void setLiftOnScrollTargetView(View view) {
        this.f9421z = -1;
        if (view == null) {
            e();
        } else {
            this.A = new WeakReference<>(view);
        }
    }

    public void setLiftOnScrollTargetViewId(int i10) {
        this.f9421z = i10;
        e();
    }

    public void setLiftableOverrideEnabled(boolean z10) {
        this.f9417v = z10;
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i10) {
        if (i10 == 1) {
            super.setOrientation(i10);
            return;
        }
        throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
    }

    public void setStatusBarForeground(Drawable drawable) {
        boolean z10;
        Drawable drawable2 = this.I;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.I = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.I.setState(getDrawableState());
                }
                androidx.core.graphics.drawable.a.m(this.I, p0.E(this));
                Drawable drawable4 = this.I;
                if (getVisibility() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                drawable4.setVisible(z10, false);
                this.I.setCallback(this);
            }
            G();
            p0.l0(this);
        }
    }

    public void setStatusBarForegroundColor(int i10) {
        setStatusBarForeground(new ColorDrawable(i10));
    }

    public void setStatusBarForegroundResource(int i10) {
        setStatusBarForeground(h.a.b(getContext(), i10));
    }

    @Deprecated
    public void setTargetElevation(float f10) {
        o.b(this, f10);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        boolean z10;
        super.setVisibility(i10);
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Drawable drawable = this.I;
        if (drawable != null) {
            drawable.setVisible(z10, false);
        }
    }

    p1 t(p1 p1Var) {
        p1 p1Var2;
        if (p0.B(this)) {
            p1Var2 = p1Var;
        } else {
            p1Var2 = null;
        }
        if (!androidx.core.util.c.a(this.f9415t, p1Var2)) {
            this.f9415t = p1Var2;
            G();
            requestLayout();
        }
        return p1Var;
    }

    public void u(b bVar) {
        List<b> list = this.f9416u;
        if (list != null && bVar != null) {
            list.remove(bVar);
        }
    }

    public void v(g gVar) {
        u(gVar);
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.I) {
            return false;
        }
        return true;
    }

    void w() {
        this.f9414s = 0;
    }

    public void x(boolean z10, boolean z11) {
        y(z10, z11, true);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AppBarLayout(android.content.Context r10, android.util.AttributeSet r11, int r12) {
        /*
            r9 = this;
            int r4 = com.google.android.material.appbar.AppBarLayout.L
            android.content.Context r10 = s7.a.c(r10, r11, r12, r4)
            r9.<init>(r10, r11, r12)
            r10 = -1
            r9.f9410m = r10
            r9.f9411p = r10
            r9.f9412q = r10
            r6 = 0
            r9.f9414s = r6
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r9.E = r0
            android.content.Context r7 = r9.getContext()
            r0 = 1
            r9.setOrientation(r0)
            int r8 = android.os.Build.VERSION.SDK_INT
            android.view.ViewOutlineProvider r0 = r9.getOutlineProvider()
            android.view.ViewOutlineProvider r1 = android.view.ViewOutlineProvider.BACKGROUND
            if (r0 != r1) goto L2f
            com.google.android.material.appbar.o.a(r9)
        L2f:
            com.google.android.material.appbar.o.c(r9, r11, r12, r4)
            int[] r2 = v6.l.f24917k
            int[] r5 = new int[r6]
            r0 = r7
            r1 = r11
            r3 = r12
            android.content.res.TypedArray r11 = com.google.android.material.internal.p.i(r0, r1, r2, r3, r4, r5)
            int r12 = v6.l.f24927l
            android.graphics.drawable.Drawable r12 = r11.getDrawable(r12)
            androidx.core.view.p0.y0(r9, r12)
            int r12 = v6.l.f24987r
            android.content.res.ColorStateList r12 = m7.c.a(r7, r11, r12)
            r9.B = r12
            android.graphics.drawable.Drawable r0 = r9.getBackground()
            boolean r0 = r0 instanceof android.graphics.drawable.ColorDrawable
            if (r0 == 0) goto L78
            android.graphics.drawable.Drawable r0 = r9.getBackground()
            android.graphics.drawable.ColorDrawable r0 = (android.graphics.drawable.ColorDrawable) r0
            p7.g r1 = new p7.g
            r1.<init>()
            int r0 = r0.getColor()
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            r1.b0(r0)
            if (r12 == 0) goto L72
            r9.m(r1)
            goto L75
        L72:
            r9.n(r7, r1)
        L75:
            androidx.core.view.p0.y0(r9, r1)
        L78:
            int r12 = v6.b.G
            android.content.res.Resources r0 = r9.getResources()
            int r1 = v6.g.f24738a
            int r0 = r0.getInteger(r1)
            int r12 = j7.a.f(r7, r12, r0)
            long r0 = (long) r12
            r9.F = r0
            int r12 = v6.b.Q
            android.animation.TimeInterpolator r0 = w6.a.f25410a
            android.animation.TimeInterpolator r12 = j7.a.g(r7, r12, r0)
            r9.G = r12
            int r12 = v6.l.f24967p
            boolean r0 = r11.hasValue(r12)
            if (r0 == 0) goto La4
            boolean r12 = r11.getBoolean(r12, r6)
            r9.y(r12, r6, r6)
        La4:
            int r12 = v6.l.f24957o
            boolean r0 = r11.hasValue(r12)
            if (r0 == 0) goto Lb4
            int r12 = r11.getDimensionPixelSize(r12, r6)
            float r12 = (float) r12
            com.google.android.material.appbar.o.b(r9, r12)
        Lb4:
            r12 = 26
            if (r8 < r12) goto Ld6
            int r12 = v6.l.f24947n
            boolean r0 = r11.hasValue(r12)
            if (r0 == 0) goto Lc7
            boolean r12 = r11.getBoolean(r12, r6)
            com.google.android.material.appbar.a.a(r9, r12)
        Lc7:
            int r12 = v6.l.f24937m
            boolean r0 = r11.hasValue(r12)
            if (r0 == 0) goto Ld6
            boolean r12 = r11.getBoolean(r12, r6)
            r9.setTouchscreenBlocksFocus(r12)
        Ld6:
            android.content.res.Resources r12 = r9.getResources()
            int r0 = v6.d.f24663a
            float r12 = r12.getDimension(r0)
            r9.J = r12
            int r12 = v6.l.f24977q
            boolean r12 = r11.getBoolean(r12, r6)
            r9.f9420y = r12
            int r12 = v6.l.f24997s
            int r10 = r11.getResourceId(r12, r10)
            r9.f9421z = r10
            int r10 = v6.l.f25007t
            android.graphics.drawable.Drawable r10 = r11.getDrawable(r10)
            r9.setStatusBarForeground(r10)
            r11.recycle()
            com.google.android.material.appbar.AppBarLayout$a r10 = new com.google.android.material.appbar.AppBarLayout$a
            r10.<init>()
            androidx.core.view.p0.J0(r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    /* loaded from: classes3.dex */
    public static class e extends LinearLayout.LayoutParams {

        /* renamed from: a  reason: collision with root package name */
        int f9448a;

        /* renamed from: b  reason: collision with root package name */
        private c f9449b;

        /* renamed from: c  reason: collision with root package name */
        Interpolator f9450c;

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f9448a = 1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, v6.l.f25027v);
            this.f9448a = obtainStyledAttributes.getInt(v6.l.f25047x, 0);
            f(obtainStyledAttributes.getInt(v6.l.f25037w, 0));
            int i10 = v6.l.f25057y;
            if (obtainStyledAttributes.hasValue(i10)) {
                this.f9450c = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(i10, 0));
            }
            obtainStyledAttributes.recycle();
        }

        private c a(int i10) {
            if (i10 != 1) {
                return null;
            }
            return new d();
        }

        public c b() {
            return this.f9449b;
        }

        public int c() {
            return this.f9448a;
        }

        public Interpolator d() {
            return this.f9450c;
        }

        boolean e() {
            int i10 = this.f9448a;
            if ((i10 & 1) == 1 && (i10 & 10) != 0) {
                return true;
            }
            return false;
        }

        public void f(int i10) {
            this.f9449b = a(i10);
        }

        public void g(int i10) {
            this.f9448a = i10;
        }

        public e(int i10, int i11) {
            super(i10, i11);
            this.f9448a = 1;
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f9448a = 1;
        }

        public e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f9448a = 1;
        }

        public e(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
            this.f9448a = 1;
        }
    }
}
