package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.appcompat.view.menu.m;
import androidx.core.view.p1;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;

@SuppressLint({"UnknownNullness"})
/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements h0, androidx.core.view.e0, androidx.core.view.f0 {
    static final int[] S = {g.a.f15691b, 16842841};
    private final Rect A;
    private final Rect B;
    private final Rect C;
    private final Rect D;
    private final Rect E;
    private final Rect F;
    private final Rect G;
    private androidx.core.view.p1 H;
    private androidx.core.view.p1 I;
    private androidx.core.view.p1 J;
    private androidx.core.view.p1 K;
    private d L;
    private OverScroller M;
    ViewPropertyAnimator N;
    final AnimatorListenerAdapter O;
    private final Runnable P;
    private final Runnable Q;
    private final androidx.core.view.g0 R;

    /* renamed from: f  reason: collision with root package name */
    private int f1227f;

    /* renamed from: m  reason: collision with root package name */
    private int f1228m;

    /* renamed from: p  reason: collision with root package name */
    private ContentFrameLayout f1229p;

    /* renamed from: q  reason: collision with root package name */
    ActionBarContainer f1230q;

    /* renamed from: r  reason: collision with root package name */
    private i0 f1231r;

    /* renamed from: s  reason: collision with root package name */
    private Drawable f1232s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f1233t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f1234u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f1235v;

    /* renamed from: w  reason: collision with root package name */
    private boolean f1236w;

    /* renamed from: x  reason: collision with root package name */
    boolean f1237x;

    /* renamed from: y  reason: collision with root package name */
    private int f1238y;

    /* renamed from: z  reason: collision with root package name */
    private int f1239z;

    /* loaded from: classes.dex */
    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.N = null;
            actionBarOverlayLayout.f1237x = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.N = null;
            actionBarOverlayLayout.f1237x = false;
        }
    }

    /* loaded from: classes.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.o();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.N = actionBarOverlayLayout.f1230q.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.O);
        }
    }

    /* loaded from: classes.dex */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.o();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.N = actionBarOverlayLayout.f1230q.animate().translationY(-ActionBarOverlayLayout.this.f1230q.getHeight()).setListener(ActionBarOverlayLayout.this.O);
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        void a();

        void b();

        void c(boolean z10);

        void d();

        void e();

        void onWindowVisibilityChanged(int i10);
    }

    /* loaded from: classes.dex */
    public static class e extends ViewGroup.MarginLayoutParams {
        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public e(int i10, int i11) {
            super(i10, i11);
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1228m = 0;
        this.A = new Rect();
        this.B = new Rect();
        this.C = new Rect();
        this.D = new Rect();
        this.E = new Rect();
        this.F = new Rect();
        this.G = new Rect();
        androidx.core.view.p1 p1Var = androidx.core.view.p1.f4206b;
        this.H = p1Var;
        this.I = p1Var;
        this.J = p1Var;
        this.K = p1Var;
        this.O = new a();
        this.P = new b();
        this.Q = new c();
        p(context);
        this.R = new androidx.core.view.g0(this);
    }

    private void a() {
        o();
        this.Q.run();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean k(android.view.View r3, android.graphics.Rect r4, boolean r5, boolean r6, boolean r7, boolean r8) {
        /*
            r2 = this;
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.appcompat.widget.ActionBarOverlayLayout$e r3 = (androidx.appcompat.widget.ActionBarOverlayLayout.e) r3
            r0 = 1
            if (r5 == 0) goto L13
            int r5 = r3.leftMargin
            int r1 = r4.left
            if (r5 == r1) goto L13
            r3.leftMargin = r1
            r5 = 1
            goto L14
        L13:
            r5 = 0
        L14:
            if (r6 == 0) goto L1f
            int r6 = r3.topMargin
            int r1 = r4.top
            if (r6 == r1) goto L1f
            r3.topMargin = r1
            r5 = 1
        L1f:
            if (r8 == 0) goto L2a
            int r6 = r3.rightMargin
            int r8 = r4.right
            if (r6 == r8) goto L2a
            r3.rightMargin = r8
            r5 = 1
        L2a:
            if (r7 == 0) goto L35
            int r6 = r3.bottomMargin
            int r4 = r4.bottom
            if (r6 == r4) goto L35
            r3.bottomMargin = r4
            goto L36
        L35:
            r0 = r5
        L36:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.k(android.view.View, android.graphics.Rect, boolean, boolean, boolean, boolean):boolean");
    }

    private i0 n(View view) {
        if (view instanceof i0) {
            return (i0) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        throw new IllegalStateException("Can't make a decor toolbar out of " + view.getClass().getSimpleName());
    }

    private void p(Context context) {
        boolean z10;
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(S);
        boolean z11 = false;
        this.f1227f = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f1232s = drawable;
        if (drawable == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        setWillNotDraw(z10);
        obtainStyledAttributes.recycle();
        if (context.getApplicationInfo().targetSdkVersion < 19) {
            z11 = true;
        }
        this.f1233t = z11;
        this.M = new OverScroller(context);
    }

    private void r() {
        o();
        postDelayed(this.Q, 600L);
    }

    private void s() {
        o();
        postDelayed(this.P, 600L);
    }

    private void u() {
        o();
        this.P.run();
    }

    private boolean v(float f10) {
        this.M.fling(0, 0, 0, (int) f10, 0, 0, RecyclerView.UNDEFINED_DURATION, Integer.MAX_VALUE);
        if (this.M.getFinalY() > this.f1230q.getHeight()) {
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.widget.h0
    public void b(Menu menu, m.a aVar) {
        t();
        this.f1231r.b(menu, aVar);
    }

    @Override // androidx.appcompat.widget.h0
    public boolean c() {
        t();
        return this.f1231r.c();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    @Override // androidx.appcompat.widget.h0
    public void d() {
        t();
        this.f1231r.d();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int i10;
        super.draw(canvas);
        if (this.f1232s != null && !this.f1233t) {
            if (this.f1230q.getVisibility() == 0) {
                i10 = (int) (this.f1230q.getBottom() + this.f1230q.getTranslationY() + 0.5f);
            } else {
                i10 = 0;
            }
            this.f1232s.setBounds(0, i10, getWidth(), this.f1232s.getIntrinsicHeight() + i10);
            this.f1232s.draw(canvas);
        }
    }

    @Override // androidx.appcompat.widget.h0
    public boolean e() {
        t();
        return this.f1231r.e();
    }

    @Override // androidx.appcompat.widget.h0
    public boolean f() {
        t();
        return this.f1231r.f();
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // androidx.appcompat.widget.h0
    public boolean g() {
        t();
        return this.f1231r.g();
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f1230q;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.R.a();
    }

    public CharSequence getTitle() {
        t();
        return this.f1231r.getTitle();
    }

    @Override // androidx.appcompat.widget.h0
    public boolean h() {
        t();
        return this.f1231r.h();
    }

    @Override // androidx.appcompat.widget.h0
    public void i(int i10) {
        t();
        if (i10 != 2) {
            if (i10 != 5) {
                if (i10 == 109) {
                    setOverlayMode(true);
                    return;
                }
                return;
            }
            this.f1231r.z();
            return;
        }
        this.f1231r.y();
    }

    @Override // androidx.appcompat.widget.h0
    public void j() {
        t();
        this.f1231r.i();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: l  reason: merged with bridge method [inline-methods] */
    public e generateDefaultLayoutParams() {
        return new e(-1, -1);
    }

    @Override // android.view.ViewGroup
    /* renamed from: m  reason: merged with bridge method [inline-methods] */
    public e generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    void o() {
        removeCallbacks(this.P);
        removeCallbacks(this.Q);
        ViewPropertyAnimator viewPropertyAnimator = this.N;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        t();
        androidx.core.view.p1 w10 = androidx.core.view.p1.w(windowInsets, this);
        boolean k10 = k(this.f1230q, new Rect(w10.j(), w10.l(), w10.k(), w10.i()), true, true, false, true);
        androidx.core.view.p0.h(this, w10, this.A);
        Rect rect = this.A;
        androidx.core.view.p1 m10 = w10.m(rect.left, rect.top, rect.right, rect.bottom);
        this.H = m10;
        boolean z10 = true;
        if (!this.I.equals(m10)) {
            this.I = this.H;
            k10 = true;
        }
        if (!this.B.equals(this.A)) {
            this.B.set(this.A);
        } else {
            z10 = k10;
        }
        if (z10) {
            requestLayout();
        }
        return w10.a().c().b().u();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        p(getContext());
        androidx.core.view.p0.r0(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        o();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i15 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin + paddingLeft;
                int i16 = ((ViewGroup.MarginLayoutParams) eVar).topMargin + paddingTop;
                childAt.layout(i15, i16, measuredWidth + i15, measuredHeight + i16);
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        boolean z10;
        int measuredHeight;
        t();
        measureChildWithMargins(this.f1230q, i10, 0, i11, 0);
        e eVar = (e) this.f1230q.getLayoutParams();
        int max = Math.max(0, this.f1230q.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin);
        int max2 = Math.max(0, this.f1230q.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f1230q.getMeasuredState());
        if ((androidx.core.view.p0.Q(this) & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            measuredHeight = this.f1227f;
            if (this.f1235v && this.f1230q.getTabContainer() != null) {
                measuredHeight += this.f1227f;
            }
        } else {
            measuredHeight = this.f1230q.getVisibility() != 8 ? this.f1230q.getMeasuredHeight() : 0;
        }
        this.C.set(this.A);
        androidx.core.view.p1 p1Var = this.H;
        this.J = p1Var;
        if (!this.f1234u && !z10) {
            Rect rect = this.C;
            rect.top += measuredHeight;
            rect.bottom += 0;
            this.J = p1Var.m(0, measuredHeight, 0, 0);
        } else {
            this.J = new p1.b(this.J).d(androidx.core.graphics.b.b(p1Var.j(), this.J.l() + measuredHeight, this.J.k(), this.J.i() + 0)).a();
        }
        k(this.f1229p, this.C, true, true, true, true);
        if (!this.K.equals(this.J)) {
            androidx.core.view.p1 p1Var2 = this.J;
            this.K = p1Var2;
            androidx.core.view.p0.i(this.f1229p, p1Var2);
        }
        measureChildWithMargins(this.f1229p, i10, 0, i11, 0);
        e eVar2 = (e) this.f1229p.getLayoutParams();
        int max3 = Math.max(max, this.f1229p.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar2).leftMargin + ((ViewGroup.MarginLayoutParams) eVar2).rightMargin);
        int max4 = Math.max(max2, this.f1229p.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar2).topMargin + ((ViewGroup.MarginLayoutParams) eVar2).bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f1229p.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i10, combineMeasuredStates2), View.resolveSizeAndState(Math.max(max4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i11, combineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        if (this.f1236w && z10) {
            if (v(f11)) {
                a();
            } else {
                u();
            }
            this.f1237x = true;
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f10, float f11) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
    }

    @Override // androidx.core.view.f0
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        onNestedScroll(view, i10, i11, i12, i13, i14);
    }

    @Override // androidx.core.view.e0
    public void onNestedScrollAccepted(View view, View view2, int i10, int i11) {
        if (i11 == 0) {
            onNestedScrollAccepted(view, view2, i10);
        }
    }

    @Override // androidx.core.view.e0
    public boolean onStartNestedScroll(View view, View view2, int i10, int i11) {
        return i11 == 0 && onStartNestedScroll(view, view2, i10);
    }

    @Override // androidx.core.view.e0
    public void onStopNestedScroll(View view, int i10) {
        if (i10 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.View
    @Deprecated
    public void onWindowSystemUiVisibilityChanged(int i10) {
        boolean z10;
        super.onWindowSystemUiVisibilityChanged(i10);
        t();
        int i11 = this.f1239z ^ i10;
        this.f1239z = i10;
        boolean z11 = false;
        if ((i10 & 4) == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((i10 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0) {
            z11 = true;
        }
        d dVar = this.L;
        if (dVar != null) {
            dVar.c(!z11);
            if (!z10 && z11) {
                this.L.d();
            } else {
                this.L.a();
            }
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 && this.L != null) {
            androidx.core.view.p0.r0(this);
        }
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        this.f1228m = i10;
        d dVar = this.L;
        if (dVar != null) {
            dVar.onWindowVisibilityChanged(i10);
        }
    }

    public boolean q() {
        return this.f1234u;
    }

    public void setActionBarHideOffset(int i10) {
        o();
        this.f1230q.setTranslationY(-Math.max(0, Math.min(i10, this.f1230q.getHeight())));
    }

    public void setActionBarVisibilityCallback(d dVar) {
        this.L = dVar;
        if (getWindowToken() != null) {
            this.L.onWindowVisibilityChanged(this.f1228m);
            int i10 = this.f1239z;
            if (i10 != 0) {
                onWindowSystemUiVisibilityChanged(i10);
                androidx.core.view.p0.r0(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z10) {
        this.f1235v = z10;
    }

    public void setHideOnContentScrollEnabled(boolean z10) {
        if (z10 != this.f1236w) {
            this.f1236w = z10;
            if (!z10) {
                o();
                setActionBarHideOffset(0);
            }
        }
    }

    public void setIcon(int i10) {
        t();
        this.f1231r.setIcon(i10);
    }

    public void setLogo(int i10) {
        t();
        this.f1231r.o(i10);
    }

    public void setOverlayMode(boolean z10) {
        boolean z11;
        this.f1234u = z10;
        if (z10 && getContext().getApplicationInfo().targetSdkVersion < 19) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f1233t = z11;
    }

    @Override // androidx.appcompat.widget.h0
    public void setWindowCallback(Window.Callback callback) {
        t();
        this.f1231r.setWindowCallback(callback);
    }

    @Override // androidx.appcompat.widget.h0
    public void setWindowTitle(CharSequence charSequence) {
        t();
        this.f1231r.setWindowTitle(charSequence);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    void t() {
        if (this.f1229p == null) {
            this.f1229p = (ContentFrameLayout) findViewById(g.f.f15767b);
            this.f1230q = (ActionBarContainer) findViewById(g.f.f15768c);
            this.f1231r = n(findViewById(g.f.f15766a));
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new e(layoutParams);
    }

    @Override // androidx.core.view.e0
    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr, int i12) {
        if (i12 == 0) {
            onNestedPreScroll(view, i10, i11, iArr);
        }
    }

    @Override // androidx.core.view.e0
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13, int i14) {
        if (i14 == 0) {
            onNestedScroll(view, i10, i11, i12, i13);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i10) {
        this.R.b(view, view2, i10);
        this.f1238y = getActionBarHideOffset();
        o();
        d dVar = this.L;
        if (dVar != null) {
            dVar.e();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i10) {
        if ((i10 & 2) == 0 || this.f1230q.getVisibility() != 0) {
            return false;
        }
        return this.f1236w;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        if (this.f1236w && !this.f1237x) {
            if (this.f1238y <= this.f1230q.getHeight()) {
                s();
            } else {
                r();
            }
        }
        d dVar = this.L;
        if (dVar != null) {
            dVar.b();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        int i14 = this.f1238y + i11;
        this.f1238y = i14;
        setActionBarHideOffset(i14);
    }

    public void setIcon(Drawable drawable) {
        t();
        this.f1231r.setIcon(drawable);
    }

    public void setShowingForActionMode(boolean z10) {
    }

    public void setUiOptions(int i10) {
    }
}
