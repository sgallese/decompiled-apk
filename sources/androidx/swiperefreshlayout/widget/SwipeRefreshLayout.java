package androidx.swiperefreshlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import android.widget.ListView;
import androidx.core.view.c0;
import androidx.core.view.d0;
import androidx.core.view.e0;
import androidx.core.view.f0;
import androidx.core.view.g0;
import androidx.core.view.p0;

/* loaded from: classes.dex */
public class SwipeRefreshLayout extends ViewGroup implements f0, e0, c0 {

    /* renamed from: f0  reason: collision with root package name */
    private static final String f7102f0 = "SwipeRefreshLayout";

    /* renamed from: g0  reason: collision with root package name */
    private static final int[] f7103g0 = {16842766};
    int A;
    private float B;
    private float C;
    private boolean D;
    private int E;
    boolean F;
    private boolean G;
    private final DecelerateInterpolator H;
    androidx.swiperefreshlayout.widget.a I;
    private int J;
    protected int K;
    float L;
    protected int M;
    int N;
    int O;
    androidx.swiperefreshlayout.widget.b P;
    private Animation Q;
    private Animation R;
    private Animation S;
    private Animation T;
    private Animation U;
    boolean V;
    private int W;

    /* renamed from: a0  reason: collision with root package name */
    boolean f7104a0;

    /* renamed from: b0  reason: collision with root package name */
    private boolean f7105b0;

    /* renamed from: c0  reason: collision with root package name */
    private Animation.AnimationListener f7106c0;

    /* renamed from: d0  reason: collision with root package name */
    private final Animation f7107d0;

    /* renamed from: e0  reason: collision with root package name */
    private final Animation f7108e0;

    /* renamed from: f  reason: collision with root package name */
    private View f7109f;

    /* renamed from: m  reason: collision with root package name */
    j f7110m;

    /* renamed from: p  reason: collision with root package name */
    boolean f7111p;

    /* renamed from: q  reason: collision with root package name */
    private int f7112q;

    /* renamed from: r  reason: collision with root package name */
    private float f7113r;

    /* renamed from: s  reason: collision with root package name */
    private float f7114s;

    /* renamed from: t  reason: collision with root package name */
    private final g0 f7115t;

    /* renamed from: u  reason: collision with root package name */
    private final d0 f7116u;

    /* renamed from: v  reason: collision with root package name */
    private final int[] f7117v;

    /* renamed from: w  reason: collision with root package name */
    private final int[] f7118w;

    /* renamed from: x  reason: collision with root package name */
    private final int[] f7119x;

    /* renamed from: y  reason: collision with root package name */
    private boolean f7120y;

    /* renamed from: z  reason: collision with root package name */
    private int f7121z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b extends Animation {
        b() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f10, Transformation transformation) {
            SwipeRefreshLayout.this.setAnimationProgress(f10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c extends Animation {
        c() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f10, Transformation transformation) {
            SwipeRefreshLayout.this.setAnimationProgress(1.0f - f10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d extends Animation {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f7126f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ int f7127m;

        d(int i10, int i11) {
            this.f7126f = i10;
            this.f7127m = i11;
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f10, Transformation transformation) {
            SwipeRefreshLayout.this.P.setAlpha((int) (this.f7126f + ((this.f7127m - r0) * f10)));
        }
    }

    /* loaded from: classes.dex */
    class f extends Animation {
        f() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f10, Transformation transformation) {
            int i10;
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            if (!swipeRefreshLayout.f7104a0) {
                i10 = swipeRefreshLayout.N - Math.abs(swipeRefreshLayout.M);
            } else {
                i10 = swipeRefreshLayout.N;
            }
            SwipeRefreshLayout swipeRefreshLayout2 = SwipeRefreshLayout.this;
            SwipeRefreshLayout.this.setTargetOffsetTopAndBottom((swipeRefreshLayout2.K + ((int) ((i10 - r1) * f10))) - swipeRefreshLayout2.I.getTop());
            SwipeRefreshLayout.this.P.e(1.0f - f10);
        }
    }

    /* loaded from: classes.dex */
    class g extends Animation {
        g() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f10, Transformation transformation) {
            SwipeRefreshLayout.this.k(f10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class h extends Animation {
        h() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f10, Transformation transformation) {
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            float f11 = swipeRefreshLayout.L;
            swipeRefreshLayout.setAnimationProgress(f11 + ((-f11) * f10));
            SwipeRefreshLayout.this.k(f10);
        }
    }

    /* loaded from: classes.dex */
    public interface i {
    }

    /* loaded from: classes.dex */
    public interface j {
        void onRefresh();
    }

    public SwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7111p = false;
        this.f7113r = -1.0f;
        this.f7117v = new int[2];
        this.f7118w = new int[2];
        this.f7119x = new int[2];
        this.E = -1;
        this.J = -1;
        this.f7106c0 = new a();
        this.f7107d0 = new f();
        this.f7108e0 = new g();
        this.f7112q = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f7121z = getResources().getInteger(17694721);
        setWillNotDraw(false);
        this.H = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.W = (int) (displayMetrics.density * 40.0f);
        d();
        setChildrenDrawingOrderEnabled(true);
        int i10 = (int) (displayMetrics.density * 64.0f);
        this.N = i10;
        this.f7113r = i10;
        this.f7115t = new g0(this);
        this.f7116u = new d0(this);
        setNestedScrollingEnabled(true);
        int i11 = -this.W;
        this.A = i11;
        this.M = i11;
        k(1.0f);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f7103g0);
        setEnabled(obtainStyledAttributes.getBoolean(0, true));
        obtainStyledAttributes.recycle();
    }

    private void a(int i10, Animation.AnimationListener animationListener) {
        this.K = i10;
        this.f7107d0.reset();
        this.f7107d0.setDuration(200L);
        this.f7107d0.setInterpolator(this.H);
        if (animationListener != null) {
            this.I.b(animationListener);
        }
        this.I.clearAnimation();
        this.I.startAnimation(this.f7107d0);
    }

    private void b(int i10, Animation.AnimationListener animationListener) {
        if (this.F) {
            t(i10, animationListener);
            return;
        }
        this.K = i10;
        this.f7108e0.reset();
        this.f7108e0.setDuration(200L);
        this.f7108e0.setInterpolator(this.H);
        if (animationListener != null) {
            this.I.b(animationListener);
        }
        this.I.clearAnimation();
        this.I.startAnimation(this.f7108e0);
    }

    private void d() {
        this.I = new androidx.swiperefreshlayout.widget.a(getContext());
        androidx.swiperefreshlayout.widget.b bVar = new androidx.swiperefreshlayout.widget.b(getContext());
        this.P = bVar;
        bVar.l(1);
        this.I.setImageDrawable(this.P);
        this.I.setVisibility(8);
        addView(this.I);
    }

    private void f() {
        if (this.f7109f == null) {
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                View childAt = getChildAt(i10);
                if (!childAt.equals(this.I)) {
                    this.f7109f = childAt;
                    return;
                }
            }
        }
    }

    private void g(float f10) {
        e eVar;
        if (f10 > this.f7113r) {
            n(true, true);
            return;
        }
        this.f7111p = false;
        this.P.j(0.0f, 0.0f);
        if (!this.F) {
            eVar = new e();
        } else {
            eVar = null;
        }
        b(this.A, eVar);
        this.P.d(false);
    }

    private boolean h(Animation animation) {
        if (animation != null && animation.hasStarted() && !animation.hasEnded()) {
            return true;
        }
        return false;
    }

    private void j(float f10) {
        this.P.d(true);
        float min = Math.min(1.0f, Math.abs(f10 / this.f7113r));
        float max = (((float) Math.max(min - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float abs = Math.abs(f10) - this.f7113r;
        int i10 = this.O;
        if (i10 <= 0) {
            if (this.f7104a0) {
                i10 = this.N - this.M;
            } else {
                i10 = this.N;
            }
        }
        float f11 = i10;
        double max2 = Math.max(0.0f, Math.min(abs, f11 * 2.0f) / f11) / 4.0f;
        float pow = ((float) (max2 - Math.pow(max2, 2.0d))) * 2.0f;
        int i11 = this.M + ((int) ((f11 * min) + (f11 * pow * 2.0f)));
        if (this.I.getVisibility() != 0) {
            this.I.setVisibility(0);
        }
        if (!this.F) {
            this.I.setScaleX(1.0f);
            this.I.setScaleY(1.0f);
        }
        if (this.F) {
            setAnimationProgress(Math.min(1.0f, f10 / this.f7113r));
        }
        if (f10 < this.f7113r) {
            if (this.P.getAlpha() > 76 && !h(this.S)) {
                r();
            }
        } else if (this.P.getAlpha() < 255 && !h(this.T)) {
            q();
        }
        this.P.j(0.0f, Math.min(0.8f, max * 0.8f));
        this.P.e(Math.min(1.0f, max));
        this.P.g((((max * 0.4f) - 0.25f) + (pow * 2.0f)) * 0.5f);
        setTargetOffsetTopAndBottom(i11 - this.A);
    }

    private void l(MotionEvent motionEvent) {
        int i10;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.E) {
            if (actionIndex == 0) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            this.E = motionEvent.getPointerId(i10);
        }
    }

    private void n(boolean z10, boolean z11) {
        if (this.f7111p != z10) {
            this.V = z11;
            f();
            this.f7111p = z10;
            if (z10) {
                a(this.A, this.f7106c0);
            } else {
                s(this.f7106c0);
            }
        }
    }

    private Animation o(int i10, int i11) {
        d dVar = new d(i10, i11);
        dVar.setDuration(300L);
        this.I.b(null);
        this.I.clearAnimation();
        this.I.startAnimation(dVar);
        return dVar;
    }

    private void p(float f10) {
        float f11 = this.C;
        float f12 = f10 - f11;
        int i10 = this.f7112q;
        if (f12 > i10 && !this.D) {
            this.B = f11 + i10;
            this.D = true;
            this.P.setAlpha(76);
        }
    }

    private void q() {
        this.T = o(this.P.getAlpha(), 255);
    }

    private void r() {
        this.S = o(this.P.getAlpha(), 76);
    }

    private void setColorViewAlpha(int i10) {
        this.I.getBackground().setAlpha(i10);
        this.P.setAlpha(i10);
    }

    private void t(int i10, Animation.AnimationListener animationListener) {
        this.K = i10;
        this.L = this.I.getScaleX();
        h hVar = new h();
        this.U = hVar;
        hVar.setDuration(150L);
        if (animationListener != null) {
            this.I.b(animationListener);
        }
        this.I.clearAnimation();
        this.I.startAnimation(this.U);
    }

    private void u(Animation.AnimationListener animationListener) {
        this.I.setVisibility(0);
        this.P.setAlpha(255);
        b bVar = new b();
        this.Q = bVar;
        bVar.setDuration(this.f7121z);
        if (animationListener != null) {
            this.I.b(animationListener);
        }
        this.I.clearAnimation();
        this.I.startAnimation(this.Q);
    }

    public boolean c() {
        View view = this.f7109f;
        if (view instanceof ListView) {
            return androidx.core.widget.g.a((ListView) view, -1);
        }
        return view.canScrollVertically(-1);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f10, float f11, boolean z10) {
        return this.f7116u.a(f10, f11, z10);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f10, float f11) {
        return this.f7116u.b(f10, f11);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return this.f7116u.c(i10, i11, iArr, iArr2);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return this.f7116u.f(i10, i11, i12, i13, iArr);
    }

    public void e(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        if (i14 == 0) {
            this.f7116u.e(i10, i11, i12, i13, iArr, i14, iArr2);
        }
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i10, int i11) {
        int i12 = this.J;
        if (i12 < 0) {
            return i11;
        }
        if (i11 == i10 - 1) {
            return i12;
        }
        if (i11 >= i12) {
            return i11 + 1;
        }
        return i11;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f7115t.a();
    }

    public int getProgressCircleDiameter() {
        return this.W;
    }

    public int getProgressViewEndOffset() {
        return this.N;
    }

    public int getProgressViewStartOffset() {
        return this.M;
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return this.f7116u.k();
    }

    public boolean i() {
        return this.f7111p;
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.f7116u.m();
    }

    void k(float f10) {
        setTargetOffsetTopAndBottom((this.K + ((int) ((this.M - r0) * f10))) - this.I.getTop());
    }

    void m() {
        this.I.clearAnimation();
        this.P.stop();
        this.I.setVisibility(8);
        setColorViewAlpha(255);
        if (this.F) {
            setAnimationProgress(0.0f);
        } else {
            setTargetOffsetTopAndBottom(this.M - this.A);
        }
        this.A = this.I.getTop();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        f();
        int actionMasked = motionEvent.getActionMasked();
        if (this.G && actionMasked == 0) {
            this.G = false;
        }
        if (!isEnabled() || this.G || c() || this.f7111p || this.f7120y) {
            return false;
        }
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked == 6) {
                            l(motionEvent);
                        }
                    }
                } else {
                    int i10 = this.E;
                    if (i10 == -1) {
                        Log.e(f7102f0, "Got ACTION_MOVE event but don't have an active pointer id.");
                        return false;
                    }
                    int findPointerIndex = motionEvent.findPointerIndex(i10);
                    if (findPointerIndex < 0) {
                        return false;
                    }
                    p(motionEvent.getY(findPointerIndex));
                }
            }
            this.D = false;
            this.E = -1;
        } else {
            setTargetOffsetTopAndBottom(this.M - this.I.getTop());
            int pointerId = motionEvent.getPointerId(0);
            this.E = pointerId;
            this.D = false;
            int findPointerIndex2 = motionEvent.findPointerIndex(pointerId);
            if (findPointerIndex2 < 0) {
                return false;
            }
            this.C = motionEvent.getY(findPointerIndex2);
        }
        return this.D;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() == 0) {
            return;
        }
        if (this.f7109f == null) {
            f();
        }
        View view = this.f7109f;
        if (view == null) {
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
        int measuredWidth2 = this.I.getMeasuredWidth();
        int measuredHeight2 = this.I.getMeasuredHeight();
        int i14 = measuredWidth / 2;
        int i15 = measuredWidth2 / 2;
        int i16 = this.A;
        this.I.layout(i14 - i15, i16, i14 + i15, measuredHeight2 + i16);
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f7109f == null) {
            f();
        }
        View view = this.f7109f;
        if (view == null) {
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
        this.I.measure(View.MeasureSpec.makeMeasureSpec(this.W, 1073741824), View.MeasureSpec.makeMeasureSpec(this.W, 1073741824));
        this.J = -1;
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            if (getChildAt(i12) == this.I) {
                this.J = i12;
                return;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        return dispatchNestedFling(f10, f11, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f10, float f11) {
        return dispatchNestedPreFling(f10, f11);
    }

    @Override // androidx.core.view.e0
    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr, int i12) {
        if (i12 == 0) {
            onNestedPreScroll(view, i10, i11, iArr);
        }
    }

    @Override // androidx.core.view.f0
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        if (i14 != 0) {
            return;
        }
        int i15 = iArr[1];
        e(i10, i11, i12, i13, this.f7118w, i14, iArr);
        int i16 = i13 - (iArr[1] - i15);
        if ((i16 == 0 ? i13 + this.f7118w[1] : i16) >= 0 || c()) {
            return;
        }
        float abs = this.f7114s + Math.abs(r1);
        this.f7114s = abs;
        j(abs);
        iArr[1] = iArr[1] + i16;
    }

    @Override // androidx.core.view.e0
    public void onNestedScrollAccepted(View view, View view2, int i10, int i11) {
        if (i11 == 0) {
            onNestedScrollAccepted(view, view2, i10);
        }
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setRefreshing(savedState.f7122f);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        return new SavedState(super.onSaveInstanceState(), this.f7111p);
    }

    @Override // androidx.core.view.e0
    public boolean onStartNestedScroll(View view, View view2, int i10, int i11) {
        if (i11 == 0) {
            return onStartNestedScroll(view, view2, i10);
        }
        return false;
    }

    @Override // androidx.core.view.e0
    public void onStopNestedScroll(View view, int i10) {
        if (i10 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (this.G && actionMasked == 0) {
            this.G = false;
        }
        if (!isEnabled() || this.G || c() || this.f7111p || this.f7120y) {
            return false;
        }
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked == 3) {
                        return false;
                    }
                    if (actionMasked != 5) {
                        if (actionMasked == 6) {
                            l(motionEvent);
                        }
                    } else {
                        int actionIndex = motionEvent.getActionIndex();
                        if (actionIndex < 0) {
                            Log.e(f7102f0, "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                            return false;
                        }
                        this.E = motionEvent.getPointerId(actionIndex);
                    }
                } else {
                    int findPointerIndex = motionEvent.findPointerIndex(this.E);
                    if (findPointerIndex < 0) {
                        Log.e(f7102f0, "Got ACTION_MOVE event but have an invalid active pointer id.");
                        return false;
                    }
                    float y10 = motionEvent.getY(findPointerIndex);
                    p(y10);
                    if (this.D) {
                        float f10 = (y10 - this.B) * 0.5f;
                        if (f10 <= 0.0f) {
                            return false;
                        }
                        getParent().requestDisallowInterceptTouchEvent(true);
                        j(f10);
                    }
                }
            } else {
                int findPointerIndex2 = motionEvent.findPointerIndex(this.E);
                if (findPointerIndex2 < 0) {
                    Log.e(f7102f0, "Got ACTION_UP event but don't have an active pointer id.");
                    return false;
                }
                if (this.D) {
                    float y11 = (motionEvent.getY(findPointerIndex2) - this.B) * 0.5f;
                    this.D = false;
                    g(y11);
                }
                this.E = -1;
                return false;
            }
        } else {
            this.E = motionEvent.getPointerId(0);
            this.D = false;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        ViewParent parent;
        View view = this.f7109f;
        if (view != null && !p0.Z(view)) {
            if (!this.f7105b0 && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(z10);
                return;
            }
            return;
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    void s(Animation.AnimationListener animationListener) {
        c cVar = new c();
        this.R = cVar;
        cVar.setDuration(150L);
        this.I.b(animationListener);
        this.I.clearAnimation();
        this.I.startAnimation(this.R);
    }

    void setAnimationProgress(float f10) {
        this.I.setScaleX(f10);
        this.I.setScaleY(f10);
    }

    @Deprecated
    public void setColorScheme(int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeColors(int... iArr) {
        f();
        this.P.f(iArr);
    }

    public void setColorSchemeResources(int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i10 = 0; i10 < iArr.length; i10++) {
            iArr2[i10] = androidx.core.content.a.c(context, iArr[i10]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setDistanceToTriggerSync(int i10) {
        this.f7113r = i10;
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        if (!z10) {
            m();
        }
    }

    @Deprecated
    public void setLegacyRequestDisallowInterceptTouchEventEnabled(boolean z10) {
        this.f7105b0 = z10;
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z10) {
        this.f7116u.n(z10);
    }

    public void setOnRefreshListener(j jVar) {
        this.f7110m = jVar;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i10) {
        setProgressBackgroundColorSchemeResource(i10);
    }

    public void setProgressBackgroundColorSchemeColor(int i10) {
        this.I.setBackgroundColor(i10);
    }

    public void setProgressBackgroundColorSchemeResource(int i10) {
        setProgressBackgroundColorSchemeColor(androidx.core.content.a.c(getContext(), i10));
    }

    public void setRefreshing(boolean z10) {
        int i10;
        if (z10 && this.f7111p != z10) {
            this.f7111p = z10;
            if (!this.f7104a0) {
                i10 = this.N + this.M;
            } else {
                i10 = this.N;
            }
            setTargetOffsetTopAndBottom(i10 - this.A);
            this.V = false;
            u(this.f7106c0);
            return;
        }
        n(z10, false);
    }

    public void setSize(int i10) {
        if (i10 != 0 && i10 != 1) {
            return;
        }
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        if (i10 == 0) {
            this.W = (int) (displayMetrics.density * 56.0f);
        } else {
            this.W = (int) (displayMetrics.density * 40.0f);
        }
        this.I.setImageDrawable(null);
        this.P.l(i10);
        this.I.setImageDrawable(this.P);
    }

    public void setSlingshotDistance(int i10) {
        this.O = i10;
    }

    void setTargetOffsetTopAndBottom(int i10) {
        this.I.bringToFront();
        p0.f0(this.I, i10);
        this.A = this.I.getTop();
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i10) {
        return this.f7116u.p(i10);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        this.f7116u.r();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: f  reason: collision with root package name */
        final boolean f7122f;

        /* loaded from: classes.dex */
        class a implements Parcelable.Creator<SavedState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a  reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b  reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        SavedState(Parcelable parcelable, boolean z10) {
            super(parcelable);
            this.f7122f = z10;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeByte(this.f7122f ? (byte) 1 : (byte) 0);
        }

        SavedState(Parcel parcel) {
            super(parcel);
            this.f7122f = parcel.readByte() != 0;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        if (i11 > 0) {
            float f10 = this.f7114s;
            if (f10 > 0.0f) {
                float f11 = i11;
                if (f11 > f10) {
                    iArr[1] = (int) f10;
                    this.f7114s = 0.0f;
                } else {
                    this.f7114s = f10 - f11;
                    iArr[1] = i11;
                }
                j(this.f7114s);
            }
        }
        if (this.f7104a0 && i11 > 0 && this.f7114s == 0.0f && Math.abs(i11 - iArr[1]) > 0) {
            this.I.setVisibility(8);
        }
        int[] iArr2 = this.f7117v;
        if (dispatchNestedPreScroll(i10 - iArr[0], i11 - iArr[1], iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i10) {
        this.f7115t.b(view, view2, i10);
        startNestedScroll(i10 & 2);
        this.f7114s = 0.0f;
        this.f7120y = true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i10) {
        return (!isEnabled() || this.G || this.f7111p || (i10 & 2) == 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        this.f7115t.d(view);
        this.f7120y = false;
        float f10 = this.f7114s;
        if (f10 > 0.0f) {
            g(f10);
            this.f7114s = 0.0f;
        }
        stopNestedScroll();
    }

    @Override // androidx.core.view.e0
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13, int i14) {
        onNestedScroll(view, i10, i11, i12, i13, i14, this.f7119x);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        onNestedScroll(view, i10, i11, i12, i13, 0, this.f7119x);
    }

    /* loaded from: classes.dex */
    class a implements Animation.AnimationListener {
        a() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            j jVar;
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            if (swipeRefreshLayout.f7111p) {
                swipeRefreshLayout.P.setAlpha(255);
                SwipeRefreshLayout.this.P.start();
                SwipeRefreshLayout swipeRefreshLayout2 = SwipeRefreshLayout.this;
                if (swipeRefreshLayout2.V && (jVar = swipeRefreshLayout2.f7110m) != null) {
                    jVar.onRefresh();
                }
                SwipeRefreshLayout swipeRefreshLayout3 = SwipeRefreshLayout.this;
                swipeRefreshLayout3.A = swipeRefreshLayout3.I.getTop();
                return;
            }
            swipeRefreshLayout.m();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class e implements Animation.AnimationListener {
        e() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            if (!swipeRefreshLayout.F) {
                swipeRefreshLayout.s(null);
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    public void setOnChildScrollUpCallback(i iVar) {
    }
}
