package androidx.core.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import androidx.core.view.accessibility.n0;
import androidx.core.view.accessibility.r0;
import androidx.core.view.b0;
import androidx.core.view.c0;
import androidx.core.view.d0;
import androidx.core.view.f0;
import androidx.core.view.g0;
import androidx.core.view.p0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements f0, c0 {
    static final int ANIMATED_SCROLL_GAP = 250;
    private static final int DEFAULT_SMOOTH_SCROLL_DURATION = 250;
    private static final float FLING_DESTRETCH_FACTOR = 4.0f;
    private static final float INFLEXION = 0.35f;
    private static final int INVALID_POINTER = -1;
    static final float MAX_SCROLL_FACTOR = 0.5f;
    private static final float SCROLL_FRICTION = 0.015f;
    private static final String TAG = "NestedScrollView";
    private int mActivePointerId;
    private final d0 mChildHelper;
    private View mChildToScrollTo;
    public EdgeEffect mEdgeGlowBottom;
    public EdgeEffect mEdgeGlowTop;
    private boolean mFillViewport;
    private boolean mIsBeingDragged;
    private boolean mIsLaidOut;
    private boolean mIsLayoutDirty;
    private int mLastMotionY;
    private long mLastScroll;
    private int mLastScrollerY;
    private int mMaximumVelocity;
    private int mMinimumVelocity;
    private int mNestedYOffset;
    private c mOnScrollChangeListener;
    private final g0 mParentHelper;
    private final float mPhysicalCoeff;
    private SavedState mSavedState;
    private final int[] mScrollConsumed;
    private final int[] mScrollOffset;
    private OverScroller mScroller;
    private boolean mSmoothScrollingEnabled;
    private final Rect mTempRect;
    private int mTouchSlop;
    private VelocityTracker mVelocityTracker;
    private float mVerticalScrollFactor;
    private static final float DECELERATION_RATE = (float) (Math.log(0.78d) / Math.log(0.9d));
    private static final a ACCESSIBILITY_DELEGATE = new a();
    private static final int[] SCROLLVIEW_STYLEABLE = {16843130};

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: f  reason: collision with root package name */
        public int f4280f;

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

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.f4280f + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f4280f);
        }

        SavedState(Parcel parcel) {
            super(parcel);
            this.f4280f = parcel.readInt();
        }
    }

    /* loaded from: classes.dex */
    static class a extends androidx.core.view.a {
        a() {
        }

        @Override // androidx.core.view.a
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            boolean z10;
            super.f(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            if (nestedScrollView.getScrollRange() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            accessibilityEvent.setScrollable(z10);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            r0.a(accessibilityEvent, nestedScrollView.getScrollX());
            r0.b(accessibilityEvent, nestedScrollView.getScrollRange());
        }

        @Override // androidx.core.view.a
        public void g(View view, n0 n0Var) {
            int scrollRange;
            super.g(view, n0Var);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            n0Var.n0(ScrollView.class.getName());
            if (nestedScrollView.isEnabled() && (scrollRange = nestedScrollView.getScrollRange()) > 0) {
                n0Var.P0(true);
                if (nestedScrollView.getScrollY() > 0) {
                    n0Var.b(n0.a.f4090r);
                    n0Var.b(n0.a.C);
                }
                if (nestedScrollView.getScrollY() < scrollRange) {
                    n0Var.b(n0.a.f4089q);
                    n0Var.b(n0.a.E);
                }
            }
        }

        @Override // androidx.core.view.a
        public boolean j(View view, int i10, Bundle bundle) {
            if (super.j(view, i10, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            int height = nestedScrollView.getHeight();
            Rect rect = new Rect();
            if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
                height = rect.height();
            }
            if (i10 != 4096) {
                if (i10 != 8192 && i10 != 16908344) {
                    if (i10 != 16908346) {
                        return false;
                    }
                } else {
                    int max = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                    if (max == nestedScrollView.getScrollY()) {
                        return false;
                    }
                    nestedScrollView.smoothScrollTo(0, max, true);
                    return true;
                }
            }
            int min = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
            if (min == nestedScrollView.getScrollY()) {
                return false;
            }
            nestedScrollView.smoothScrollTo(0, min, true);
            return true;
        }
    }

    /* loaded from: classes.dex */
    static class b {
        static boolean a(ViewGroup viewGroup) {
            return viewGroup.getClipToPadding();
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        void a(NestedScrollView nestedScrollView, int i10, int i11, int i12, int i13);
    }

    public NestedScrollView(Context context) {
        this(context, null);
    }

    private void abortAnimatedScroll() {
        this.mScroller.abortAnimation();
        stopNestedScroll(1);
    }

    private boolean canOverScroll() {
        int overScrollMode = getOverScrollMode();
        if (overScrollMode == 0) {
            return true;
        }
        if (overScrollMode == 1 && getScrollRange() > 0) {
            return true;
        }
        return false;
    }

    private boolean canScroll() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin <= (getHeight() - getPaddingTop()) - getPaddingBottom()) {
            return false;
        }
        return true;
    }

    private static int clamp(int i10, int i11, int i12) {
        if (i11 < i12 && i10 >= 0) {
            if (i11 + i10 > i12) {
                return i12 - i11;
            }
            return i10;
        }
        return 0;
    }

    private void doScrollY(int i10) {
        if (i10 != 0) {
            if (this.mSmoothScrollingEnabled) {
                smoothScrollBy(0, i10);
            } else {
                scrollBy(0, i10);
            }
        }
    }

    private boolean edgeEffectFling(int i10) {
        if (d.b(this.mEdgeGlowTop) != DECELERATION_RATE) {
            if (shouldAbsorb(this.mEdgeGlowTop, i10)) {
                this.mEdgeGlowTop.onAbsorb(i10);
            } else {
                fling(-i10);
            }
        } else if (d.b(this.mEdgeGlowBottom) != DECELERATION_RATE) {
            int i11 = -i10;
            if (shouldAbsorb(this.mEdgeGlowBottom, i11)) {
                this.mEdgeGlowBottom.onAbsorb(i11);
            } else {
                fling(i11);
            }
        } else {
            return false;
        }
        return true;
    }

    private void endTouchDrag() {
        this.mActivePointerId = -1;
        this.mIsBeingDragged = false;
        recycleVelocityTracker();
        stopNestedScroll(0);
        this.mEdgeGlowTop.onRelease();
        this.mEdgeGlowBottom.onRelease();
    }

    private View findFocusableViewInBounds(boolean z10, int i10, int i11) {
        boolean z11;
        boolean z12;
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z13 = false;
        for (int i12 = 0; i12 < size; i12++) {
            View view2 = focusables.get(i12);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i10 < bottom && top < i11) {
                if (i10 < top && bottom < i11) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (view == null) {
                    view = view2;
                    z13 = z11;
                } else {
                    if ((z10 && top < view.getTop()) || (!z10 && bottom > view.getBottom())) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z13) {
                        if (z11) {
                            if (!z12) {
                            }
                            view = view2;
                        }
                    } else if (z11) {
                        view = view2;
                        z13 = true;
                    } else {
                        if (!z12) {
                        }
                        view = view2;
                    }
                }
            }
        }
        return view;
    }

    private float getSplineFlingDistance(int i10) {
        double log = Math.log((Math.abs(i10) * INFLEXION) / (this.mPhysicalCoeff * SCROLL_FRICTION));
        float f10 = DECELERATION_RATE;
        return (float) (this.mPhysicalCoeff * SCROLL_FRICTION * Math.exp((f10 / (f10 - 1.0d)) * log));
    }

    private float getVerticalScrollFactorCompat() {
        if (this.mVerticalScrollFactor == DECELERATION_RATE) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                this.mVerticalScrollFactor = typedValue.getDimension(context.getResources().getDisplayMetrics());
            } else {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
        }
        return this.mVerticalScrollFactor;
    }

    private boolean inChild(int i10, int i11) {
        if (getChildCount() <= 0) {
            return false;
        }
        int scrollY = getScrollY();
        View childAt = getChildAt(0);
        if (i11 < childAt.getTop() - scrollY || i11 >= childAt.getBottom() - scrollY || i10 < childAt.getLeft() || i10 >= childAt.getRight()) {
            return false;
        }
        return true;
    }

    private void initOrResetVelocityTracker() {
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    private void initScrollView() {
        this.mScroller = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
        this.mMinimumVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
        this.mMaximumVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    private void initVelocityTrackerIfNotExists() {
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
    }

    private void initializeTouchDrag(int i10, int i11) {
        this.mLastMotionY = i10;
        this.mActivePointerId = i11;
        startNestedScroll(2, 0);
    }

    private boolean isOffScreen(View view) {
        return !isWithinDeltaOfScreen(view, 0, getHeight());
    }

    private static boolean isViewDescendantOf(View view, View view2) {
        if (view == view2) {
            return true;
        }
        ViewParent parent = view.getParent();
        if ((parent instanceof ViewGroup) && isViewDescendantOf((View) parent, view2)) {
            return true;
        }
        return false;
    }

    private boolean isWithinDeltaOfScreen(View view, int i10, int i11) {
        view.getDrawingRect(this.mTempRect);
        offsetDescendantRectToMyCoords(view, this.mTempRect);
        if (this.mTempRect.bottom + i10 >= getScrollY() && this.mTempRect.top - i10 <= getScrollY() + i11) {
            return true;
        }
        return false;
    }

    private void onNestedScrollInternal(int i10, int i11, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i10);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.mChildHelper.e(0, scrollY2, 0, i10 - scrollY2, null, i11, iArr);
    }

    private void onSecondaryPointerUp(MotionEvent motionEvent) {
        int i10;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.mActivePointerId) {
            if (actionIndex == 0) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            this.mLastMotionY = (int) motionEvent.getY(i10);
            this.mActivePointerId = motionEvent.getPointerId(i10);
            VelocityTracker velocityTracker = this.mVelocityTracker;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    private void recycleVelocityTracker() {
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.mVelocityTracker = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int releaseVerticalGlow(int r4, float r5) {
        /*
            r3 = this;
            int r0 = r3.getWidth()
            float r0 = (float) r0
            float r5 = r5 / r0
            float r4 = (float) r4
            int r0 = r3.getHeight()
            float r0 = (float) r0
            float r4 = r4 / r0
            android.widget.EdgeEffect r0 = r3.mEdgeGlowTop
            float r0 = androidx.core.widget.d.b(r0)
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L31
            android.widget.EdgeEffect r0 = r3.mEdgeGlowTop
            float r4 = -r4
            float r4 = androidx.core.widget.d.d(r0, r4, r5)
            float r4 = -r4
            android.widget.EdgeEffect r5 = r3.mEdgeGlowTop
            float r5 = androidx.core.widget.d.b(r5)
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto L2f
            android.widget.EdgeEffect r5 = r3.mEdgeGlowTop
            r5.onRelease()
        L2f:
            r1 = r4
            goto L54
        L31:
            android.widget.EdgeEffect r0 = r3.mEdgeGlowBottom
            float r0 = androidx.core.widget.d.b(r0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L54
            android.widget.EdgeEffect r0 = r3.mEdgeGlowBottom
            r2 = 1065353216(0x3f800000, float:1.0)
            float r2 = r2 - r5
            float r4 = androidx.core.widget.d.d(r0, r4, r2)
            android.widget.EdgeEffect r5 = r3.mEdgeGlowBottom
            float r5 = androidx.core.widget.d.b(r5)
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto L2f
            android.widget.EdgeEffect r5 = r3.mEdgeGlowBottom
            r5.onRelease()
            goto L2f
        L54:
            int r4 = r3.getHeight()
            float r4 = (float) r4
            float r1 = r1 * r4
            int r4 = java.lang.Math.round(r1)
            if (r4 == 0) goto L64
            r3.invalidate()
        L64:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.releaseVerticalGlow(int, float):int");
    }

    private void runAnimatedScroll(boolean z10) {
        if (z10) {
            startNestedScroll(2, 1);
        } else {
            stopNestedScroll(1);
        }
        this.mLastScrollerY = getScrollY();
        p0.l0(this);
    }

    private boolean scrollAndFocus(int i10, int i11, int i12) {
        boolean z10;
        int i13;
        int height = getHeight();
        int scrollY = getScrollY();
        int i14 = height + scrollY;
        boolean z11 = false;
        if (i10 == 33) {
            z10 = true;
        } else {
            z10 = false;
        }
        View findFocusableViewInBounds = findFocusableViewInBounds(z10, i11, i12);
        if (findFocusableViewInBounds == null) {
            findFocusableViewInBounds = this;
        }
        if (i11 < scrollY || i12 > i14) {
            if (z10) {
                i13 = i11 - scrollY;
            } else {
                i13 = i12 - i14;
            }
            scrollBy(i13, 0, 1, true);
            z11 = true;
        }
        if (findFocusableViewInBounds != findFocus()) {
            findFocusableViewInBounds.requestFocus(i10);
        }
        return z11;
    }

    private int scrollBy(int i10, int i11, int i12, boolean z10) {
        int i13;
        int i14;
        boolean z11;
        boolean z12;
        if (i12 == 1) {
            startNestedScroll(2, i12);
        }
        boolean z13 = false;
        if (dispatchNestedPreScroll(0, i10, this.mScrollConsumed, this.mScrollOffset, i12)) {
            i13 = i10 - this.mScrollConsumed[1];
            i14 = this.mScrollOffset[1] + 0;
        } else {
            i13 = i10;
            i14 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        if (canOverScroll() && !z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (overScrollByCompat(0, i13, 0, scrollY, 0, scrollRange, 0, 0, true) && !hasNestedScrollingParent(i12)) {
            z12 = true;
        } else {
            z12 = false;
        }
        int scrollY2 = getScrollY() - scrollY;
        int[] iArr = this.mScrollConsumed;
        iArr[1] = 0;
        dispatchNestedScroll(0, scrollY2, 0, i13 - scrollY2, this.mScrollOffset, i12, iArr);
        int i15 = i14 + this.mScrollOffset[1];
        int i16 = i13 - this.mScrollConsumed[1];
        int i17 = scrollY + i16;
        if (i17 < 0) {
            if (z11) {
                d.d(this.mEdgeGlowTop, (-i16) / getHeight(), i11 / getWidth());
                if (!this.mEdgeGlowBottom.isFinished()) {
                    this.mEdgeGlowBottom.onRelease();
                }
            }
        } else if (i17 > scrollRange && z11) {
            d.d(this.mEdgeGlowBottom, i16 / getHeight(), 1.0f - (i11 / getWidth()));
            if (!this.mEdgeGlowTop.isFinished()) {
                this.mEdgeGlowTop.onRelease();
            }
        }
        if (this.mEdgeGlowTop.isFinished() && this.mEdgeGlowBottom.isFinished()) {
            z13 = z12;
        } else {
            p0.l0(this);
        }
        if (z13 && i12 == 0) {
            this.mVelocityTracker.clear();
        }
        if (i12 == 1) {
            stopNestedScroll(i12);
            this.mEdgeGlowTop.onRelease();
            this.mEdgeGlowBottom.onRelease();
        }
        return i15;
    }

    private void scrollToChild(View view) {
        view.getDrawingRect(this.mTempRect);
        offsetDescendantRectToMyCoords(view, this.mTempRect);
        int computeScrollDeltaToGetChildRectOnScreen = computeScrollDeltaToGetChildRectOnScreen(this.mTempRect);
        if (computeScrollDeltaToGetChildRectOnScreen != 0) {
            scrollBy(0, computeScrollDeltaToGetChildRectOnScreen);
        }
    }

    private boolean scrollToChildRect(Rect rect, boolean z10) {
        boolean z11;
        int computeScrollDeltaToGetChildRectOnScreen = computeScrollDeltaToGetChildRectOnScreen(rect);
        if (computeScrollDeltaToGetChildRectOnScreen != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            if (z10) {
                scrollBy(0, computeScrollDeltaToGetChildRectOnScreen);
            } else {
                smoothScrollBy(0, computeScrollDeltaToGetChildRectOnScreen);
            }
        }
        return z11;
    }

    private boolean shouldAbsorb(EdgeEffect edgeEffect, int i10) {
        if (i10 > 0) {
            return true;
        }
        if (getSplineFlingDistance(-i10) < d.b(edgeEffect) * getHeight()) {
            return true;
        }
        return false;
    }

    private boolean stopGlowAnimations(MotionEvent motionEvent) {
        boolean z10;
        if (d.b(this.mEdgeGlowTop) != DECELERATION_RATE) {
            d.d(this.mEdgeGlowTop, DECELERATION_RATE, motionEvent.getX() / getWidth());
            z10 = true;
        } else {
            z10 = false;
        }
        if (d.b(this.mEdgeGlowBottom) != DECELERATION_RATE) {
            d.d(this.mEdgeGlowBottom, DECELERATION_RATE, 1.0f - (motionEvent.getX() / getWidth()));
            return true;
        }
        return z10;
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public boolean arrowScroll(int i10) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i10);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus != null && isWithinDeltaOfScreen(findNextFocus, maxScrollAmount, getHeight())) {
            findNextFocus.getDrawingRect(this.mTempRect);
            offsetDescendantRectToMyCoords(findNextFocus, this.mTempRect);
            scrollBy(computeScrollDeltaToGetChildRectOnScreen(this.mTempRect), 0, 1, true);
            findNextFocus.requestFocus(i10);
        } else {
            if (i10 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i10 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i10 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            scrollBy(maxScrollAmount, 0, 1, true);
        }
        if (findFocus != null && findFocus.isFocused() && isOffScreen(findFocus)) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.mScroller.isFinished()) {
            return;
        }
        this.mScroller.computeScrollOffset();
        int currY = this.mScroller.getCurrY();
        int consumeFlingInVerticalStretch = consumeFlingInVerticalStretch(currY - this.mLastScrollerY);
        this.mLastScrollerY = currY;
        int[] iArr = this.mScrollConsumed;
        boolean z10 = false;
        iArr[1] = 0;
        dispatchNestedPreScroll(0, consumeFlingInVerticalStretch, iArr, null, 1);
        int i10 = consumeFlingInVerticalStretch - this.mScrollConsumed[1];
        int scrollRange = getScrollRange();
        if (i10 != 0) {
            int scrollY = getScrollY();
            overScrollByCompat(0, i10, getScrollX(), scrollY, 0, scrollRange, 0, 0, false);
            int scrollY2 = getScrollY() - scrollY;
            int i11 = i10 - scrollY2;
            int[] iArr2 = this.mScrollConsumed;
            iArr2[1] = 0;
            dispatchNestedScroll(0, scrollY2, 0, i11, this.mScrollOffset, 1, iArr2);
            i10 = i11 - this.mScrollConsumed[1];
        }
        if (i10 != 0) {
            int overScrollMode = getOverScrollMode();
            if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                z10 = true;
            }
            if (z10) {
                if (i10 < 0) {
                    if (this.mEdgeGlowTop.isFinished()) {
                        this.mEdgeGlowTop.onAbsorb((int) this.mScroller.getCurrVelocity());
                    }
                } else if (this.mEdgeGlowBottom.isFinished()) {
                    this.mEdgeGlowBottom.onAbsorb((int) this.mScroller.getCurrVelocity());
                }
            }
            abortAnimatedScroll();
        }
        if (!this.mScroller.isFinished()) {
            p0.l0(this);
        } else {
            stopNestedScroll(1);
        }
    }

    protected int computeScrollDeltaToGetChildRectOnScreen(Rect rect) {
        int i10;
        int i11;
        int i12;
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i13 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        if (rect.bottom < childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin) {
            i10 = i13 - verticalFadingEdgeLength;
        } else {
            i10 = i13;
        }
        int i14 = rect.bottom;
        if (i14 > i10 && rect.top > scrollY) {
            if (rect.height() > height) {
                i12 = rect.top - scrollY;
            } else {
                i12 = rect.bottom - i10;
            }
            return Math.min(i12 + 0, (childAt.getBottom() + layoutParams.bottomMargin) - i13);
        } else if (rect.top >= scrollY || i14 >= i10) {
            return 0;
        } else {
            if (rect.height() > height) {
                i11 = 0 - (i10 - rect.bottom);
            } else {
                i11 = 0 - (scrollY - rect.top);
            }
            return Math.max(i11, -getScrollY());
        }
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        if (scrollY < 0) {
            return bottom - scrollY;
        }
        if (scrollY > max) {
            return bottom + (scrollY - max);
        }
        return bottom;
    }

    int consumeFlingInVerticalStretch(int i10) {
        int height = getHeight();
        if (i10 > 0 && d.b(this.mEdgeGlowTop) != DECELERATION_RATE) {
            int round = Math.round(((-height) / FLING_DESTRETCH_FACTOR) * d.d(this.mEdgeGlowTop, ((-i10) * FLING_DESTRETCH_FACTOR) / height, MAX_SCROLL_FACTOR));
            if (round != i10) {
                this.mEdgeGlowTop.finish();
            }
            return i10 - round;
        } else if (i10 < 0 && d.b(this.mEdgeGlowBottom) != DECELERATION_RATE) {
            float f10 = height;
            int round2 = Math.round((f10 / FLING_DESTRETCH_FACTOR) * d.d(this.mEdgeGlowBottom, (i10 * FLING_DESTRETCH_FACTOR) / f10, MAX_SCROLL_FACTOR));
            if (round2 != i10) {
                this.mEdgeGlowBottom.finish();
            }
            return i10 - round2;
        } else {
            return i10;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!super.dispatchKeyEvent(keyEvent) && !executeKeyEvent(keyEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f10, float f11, boolean z10) {
        return this.mChildHelper.a(f10, f11, z10);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f10, float f11) {
        return this.mChildHelper.b(f10, f11);
    }

    public boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2, int i12) {
        return this.mChildHelper.d(i10, i11, iArr, iArr2, i12);
    }

    public void dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        this.mChildHelper.e(i10, i11, i12, i13, iArr, i14, iArr2);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int i10;
        super.draw(canvas);
        int scrollY = getScrollY();
        int i11 = 0;
        if (!this.mEdgeGlowTop.isFinished()) {
            int save = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(0, scrollY);
            if (b.a(this)) {
                width -= getPaddingLeft() + getPaddingRight();
                i10 = getPaddingLeft() + 0;
            } else {
                i10 = 0;
            }
            if (b.a(this)) {
                height -= getPaddingTop() + getPaddingBottom();
                min += getPaddingTop();
            }
            canvas.translate(i10, min);
            this.mEdgeGlowTop.setSize(width, height);
            if (this.mEdgeGlowTop.draw(canvas)) {
                p0.l0(this);
            }
            canvas.restoreToCount(save);
        }
        if (!this.mEdgeGlowBottom.isFinished()) {
            int save2 = canvas.save();
            int width2 = getWidth();
            int height2 = getHeight();
            int max = Math.max(getScrollRange(), scrollY) + height2;
            if (b.a(this)) {
                width2 -= getPaddingLeft() + getPaddingRight();
                i11 = 0 + getPaddingLeft();
            }
            if (b.a(this)) {
                height2 -= getPaddingTop() + getPaddingBottom();
                max -= getPaddingBottom();
            }
            canvas.translate(i11 - width2, max);
            canvas.rotate(180.0f, width2, DECELERATION_RATE);
            this.mEdgeGlowBottom.setSize(width2, height2);
            if (this.mEdgeGlowBottom.draw(canvas)) {
                p0.l0(this);
            }
            canvas.restoreToCount(save2);
        }
    }

    public boolean executeKeyEvent(KeyEvent keyEvent) {
        this.mTempRect.setEmpty();
        int i10 = 130;
        if (!canScroll()) {
            if (!isFocused() || keyEvent.getKeyCode() == 4) {
                return false;
            }
            View findFocus = findFocus();
            if (findFocus == this) {
                findFocus = null;
            }
            View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, 130);
            if (findNextFocus == null || findNextFocus == this || !findNextFocus.requestFocus(130)) {
                return false;
            }
            return true;
        } else if (keyEvent.getAction() != 0) {
            return false;
        } else {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 19) {
                if (keyCode != 20) {
                    if (keyCode != 62) {
                        if (keyCode != 92) {
                            if (keyCode != 93) {
                                if (keyCode != 122) {
                                    if (keyCode != 123) {
                                        return false;
                                    }
                                    pageScroll(130);
                                    return false;
                                }
                                pageScroll(33);
                                return false;
                            }
                            return fullScroll(130);
                        }
                        return fullScroll(33);
                    }
                    if (keyEvent.isShiftPressed()) {
                        i10 = 33;
                    }
                    pageScroll(i10);
                    return false;
                } else if (keyEvent.isAltPressed()) {
                    return fullScroll(130);
                } else {
                    return arrowScroll(130);
                }
            } else if (keyEvent.isAltPressed()) {
                return fullScroll(33);
            } else {
                return arrowScroll(33);
            }
        }
    }

    public void fling(int i10) {
        if (getChildCount() > 0) {
            this.mScroller.fling(getScrollX(), getScrollY(), 0, i10, 0, 0, RecyclerView.UNDEFINED_DURATION, Integer.MAX_VALUE, 0, 0);
            runAnimatedScroll(true);
        }
    }

    public boolean fullScroll(int i10) {
        boolean z10;
        int childCount;
        if (i10 == 130) {
            z10 = true;
        } else {
            z10 = false;
        }
        int height = getHeight();
        Rect rect = this.mTempRect;
        rect.top = 0;
        rect.bottom = height;
        if (z10 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.mTempRect.bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
            Rect rect2 = this.mTempRect;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.mTempRect;
        return scrollAndFocus(i10, rect3.top, rect3.bottom);
    }

    @Override // android.view.View
    protected float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return DECELERATION_RATE;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * MAX_SCROLL_FACTOR);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.mParentHelper.a();
    }

    int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    protected float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return DECELERATION_RATE;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public boolean hasNestedScrollingParent(int i10) {
        return this.mChildHelper.l(i10);
    }

    public boolean isFillViewport() {
        return this.mFillViewport;
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.mChildHelper.m();
    }

    public boolean isSmoothScrollingEnabled() {
        return this.mSmoothScrollingEnabled;
    }

    @Override // android.view.ViewGroup
    protected void measureChild(View view, int i10, int i11) {
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    protected void measureChildWithMargins(View view, int i10, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mIsLaidOut = false;
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f10;
        int i10;
        if (motionEvent.getAction() != 8 || this.mIsBeingDragged) {
            return false;
        }
        if (b0.a(motionEvent, 2)) {
            f10 = motionEvent.getAxisValue(9);
            i10 = (int) motionEvent.getX();
        } else if (b0.a(motionEvent, 4194304)) {
            float axisValue = motionEvent.getAxisValue(26);
            i10 = getWidth() / 2;
            f10 = axisValue;
        } else {
            f10 = DECELERATION_RATE;
            i10 = 0;
        }
        if (f10 == DECELERATION_RATE) {
            return false;
        }
        scrollBy(-((int) (f10 * getVerticalScrollFactorCompat())), i10, 1, b0.a(motionEvent, 8194));
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z10 = true;
        if (action == 2 && this.mIsBeingDragged) {
            return true;
        }
        int i10 = action & 255;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 == 6) {
                            onSecondaryPointerUp(motionEvent);
                        }
                    }
                } else {
                    int i11 = this.mActivePointerId;
                    if (i11 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i11);
                        if (findPointerIndex == -1) {
                            Log.e(TAG, "Invalid pointerId=" + i11 + " in onInterceptTouchEvent");
                        } else {
                            int y10 = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y10 - this.mLastMotionY) > this.mTouchSlop && (2 & getNestedScrollAxes()) == 0) {
                                this.mIsBeingDragged = true;
                                this.mLastMotionY = y10;
                                initVelocityTrackerIfNotExists();
                                this.mVelocityTracker.addMovement(motionEvent);
                                this.mNestedYOffset = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                }
            }
            this.mIsBeingDragged = false;
            this.mActivePointerId = -1;
            recycleVelocityTracker();
            if (this.mScroller.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                p0.l0(this);
            }
            stopNestedScroll(0);
        } else {
            int y11 = (int) motionEvent.getY();
            if (!inChild((int) motionEvent.getX(), y11)) {
                if (!stopGlowAnimations(motionEvent) && this.mScroller.isFinished()) {
                    z10 = false;
                }
                this.mIsBeingDragged = z10;
                recycleVelocityTracker();
            } else {
                this.mLastMotionY = y11;
                this.mActivePointerId = motionEvent.getPointerId(0);
                initOrResetVelocityTracker();
                this.mVelocityTracker.addMovement(motionEvent);
                this.mScroller.computeScrollOffset();
                if (!stopGlowAnimations(motionEvent) && this.mScroller.isFinished()) {
                    z10 = false;
                }
                this.mIsBeingDragged = z10;
                startNestedScroll(2, 0);
            }
        }
        return this.mIsBeingDragged;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int i14 = 0;
        this.mIsLayoutDirty = false;
        View view = this.mChildToScrollTo;
        if (view != null && isViewDescendantOf(view, this)) {
            scrollToChild(this.mChildToScrollTo);
        }
        this.mChildToScrollTo = null;
        if (!this.mIsLaidOut) {
            if (this.mSavedState != null) {
                scrollTo(getScrollX(), this.mSavedState.f4280f);
                this.mSavedState = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i14 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i13 - i11) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int clamp = clamp(scrollY, paddingTop, i14);
            if (clamp != scrollY) {
                scrollTo(getScrollX(), clamp);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.mIsLaidOut = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.mFillViewport && View.MeasureSpec.getMode(i11) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        if (!z10) {
            dispatchNestedFling(DECELERATION_RATE, f11, true);
            fling((int) f11);
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f10, float f11) {
        return dispatchNestedPreFling(f10, f11);
    }

    @Override // androidx.core.view.e0
    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr, int i12) {
        dispatchNestedPreScroll(i10, i11, iArr, null, i12);
    }

    @Override // androidx.core.view.f0
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        onNestedScrollInternal(i13, i14, iArr);
    }

    @Override // androidx.core.view.e0
    public void onNestedScrollAccepted(View view, View view2, int i10, int i11) {
        this.mParentHelper.c(view, view2, i10, i11);
        startNestedScroll(2, i11);
    }

    @Override // android.view.View
    protected void onOverScrolled(int i10, int i11, boolean z10, boolean z11) {
        super.scrollTo(i10, i11);
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i10, Rect rect) {
        View findNextFocusFromRect;
        if (i10 == 2) {
            i10 = 130;
        } else if (i10 == 1) {
            i10 = 33;
        }
        if (rect == null) {
            findNextFocusFromRect = FocusFinder.getInstance().findNextFocus(this, null, i10);
        } else {
            findNextFocusFromRect = FocusFinder.getInstance().findNextFocusFromRect(this, rect, i10);
        }
        if (findNextFocusFromRect == null || isOffScreen(findNextFocusFromRect)) {
            return false;
        }
        return findNextFocusFromRect.requestFocus(i10, rect);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.mSavedState = savedState;
        requestLayout();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f4280f = getScrollY();
        return savedState;
    }

    @Override // android.view.View
    protected void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        c cVar = this.mOnScrollChangeListener;
        if (cVar != null) {
            cVar.a(this, i10, i11, i12, i13);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        View findFocus = findFocus();
        if (findFocus != null && this != findFocus && isWithinDeltaOfScreen(findFocus, 0, i13)) {
            findFocus.getDrawingRect(this.mTempRect);
            offsetDescendantRectToMyCoords(findFocus, this.mTempRect);
            doScrollY(computeScrollDeltaToGetChildRectOnScreen(this.mTempRect));
        }
    }

    @Override // androidx.core.view.e0
    public boolean onStartNestedScroll(View view, View view2, int i10, int i11) {
        return (i10 & 2) != 0;
    }

    @Override // androidx.core.view.e0
    public void onStopNestedScroll(View view, int i10) {
        this.mParentHelper.e(view, i10);
        stopNestedScroll(i10);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        initVelocityTrackerIfNotExists();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.mNestedYOffset = 0;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation(DECELERATION_RATE, this.mNestedYOffset);
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked != 5) {
                            if (actionMasked == 6) {
                                onSecondaryPointerUp(motionEvent);
                                this.mLastMotionY = (int) motionEvent.getY(motionEvent.findPointerIndex(this.mActivePointerId));
                            }
                        } else {
                            int actionIndex = motionEvent.getActionIndex();
                            this.mLastMotionY = (int) motionEvent.getY(actionIndex);
                            this.mActivePointerId = motionEvent.getPointerId(actionIndex);
                        }
                    } else {
                        if (this.mIsBeingDragged && getChildCount() > 0 && this.mScroller.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                            p0.l0(this);
                        }
                        endTouchDrag();
                    }
                } else {
                    int findPointerIndex = motionEvent.findPointerIndex(this.mActivePointerId);
                    if (findPointerIndex == -1) {
                        Log.e(TAG, "Invalid pointerId=" + this.mActivePointerId + " in onTouchEvent");
                    } else {
                        int y10 = (int) motionEvent.getY(findPointerIndex);
                        int i10 = this.mLastMotionY - y10;
                        int releaseVerticalGlow = i10 - releaseVerticalGlow(i10, motionEvent.getX(findPointerIndex));
                        if (!this.mIsBeingDragged && Math.abs(releaseVerticalGlow) > this.mTouchSlop) {
                            ViewParent parent2 = getParent();
                            if (parent2 != null) {
                                parent2.requestDisallowInterceptTouchEvent(true);
                            }
                            this.mIsBeingDragged = true;
                            releaseVerticalGlow = releaseVerticalGlow > 0 ? releaseVerticalGlow - this.mTouchSlop : releaseVerticalGlow + this.mTouchSlop;
                        }
                        if (this.mIsBeingDragged) {
                            int scrollBy = scrollBy(releaseVerticalGlow, (int) motionEvent.getX(findPointerIndex), 0, false);
                            this.mLastMotionY = y10 - scrollBy;
                            this.mNestedYOffset += scrollBy;
                        }
                    }
                }
            } else {
                VelocityTracker velocityTracker = this.mVelocityTracker;
                velocityTracker.computeCurrentVelocity(1000, this.mMaximumVelocity);
                int yVelocity = (int) velocityTracker.getYVelocity(this.mActivePointerId);
                if (Math.abs(yVelocity) >= this.mMinimumVelocity) {
                    if (!edgeEffectFling(yVelocity)) {
                        int i11 = -yVelocity;
                        float f10 = i11;
                        if (!dispatchNestedPreFling(DECELERATION_RATE, f10)) {
                            dispatchNestedFling(DECELERATION_RATE, f10, true);
                            fling(i11);
                        }
                    }
                } else if (this.mScroller.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    p0.l0(this);
                }
                endTouchDrag();
            }
        } else if (getChildCount() == 0) {
            return false;
        } else {
            if (this.mIsBeingDragged && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.mScroller.isFinished()) {
                abortAnimatedScroll();
            }
            initializeTouchDrag((int) motionEvent.getY(), motionEvent.getPointerId(0));
        }
        VelocityTracker velocityTracker2 = this.mVelocityTracker;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0083 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    boolean overScrollByCompat(int r13, int r14, int r15, int r16, int r17, int r18, int r19, int r20, boolean r21) {
        /*
            r12 = this;
            r0 = r12
            int r1 = r12.getOverScrollMode()
            int r2 = r12.computeHorizontalScrollRange()
            int r3 = r12.computeHorizontalScrollExtent()
            r4 = 0
            r5 = 1
            if (r2 <= r3) goto L13
            r2 = 1
            goto L14
        L13:
            r2 = 0
        L14:
            int r3 = r12.computeVerticalScrollRange()
            int r6 = r12.computeVerticalScrollExtent()
            if (r3 <= r6) goto L20
            r3 = 1
            goto L21
        L20:
            r3 = 0
        L21:
            if (r1 == 0) goto L2a
            if (r1 != r5) goto L28
            if (r2 == 0) goto L28
            goto L2a
        L28:
            r2 = 0
            goto L2b
        L2a:
            r2 = 1
        L2b:
            if (r1 == 0) goto L34
            if (r1 != r5) goto L32
            if (r3 == 0) goto L32
            goto L34
        L32:
            r1 = 0
            goto L35
        L34:
            r1 = 1
        L35:
            int r3 = r15 + r13
            if (r2 != 0) goto L3b
            r2 = 0
            goto L3d
        L3b:
            r2 = r19
        L3d:
            int r6 = r16 + r14
            if (r1 != 0) goto L43
            r1 = 0
            goto L45
        L43:
            r1 = r20
        L45:
            int r7 = -r2
            int r2 = r2 + r17
            int r8 = -r1
            int r1 = r1 + r18
            if (r3 <= r2) goto L50
            r3 = r2
        L4e:
            r2 = 1
            goto L55
        L50:
            if (r3 >= r7) goto L54
            r3 = r7
            goto L4e
        L54:
            r2 = 0
        L55:
            if (r6 <= r1) goto L5a
            r6 = r1
        L58:
            r1 = 1
            goto L5f
        L5a:
            if (r6 >= r8) goto L5e
            r6 = r8
            goto L58
        L5e:
            r1 = 0
        L5f:
            if (r1 == 0) goto L7e
            boolean r7 = r12.hasNestedScrollingParent(r5)
            if (r7 != 0) goto L7e
            android.widget.OverScroller r7 = r0.mScroller
            r8 = 0
            r9 = 0
            r10 = 0
            int r11 = r12.getScrollRange()
            r13 = r7
            r14 = r3
            r15 = r6
            r16 = r8
            r17 = r9
            r18 = r10
            r19 = r11
            r13.springBack(r14, r15, r16, r17, r18, r19)
        L7e:
            r12.onOverScrolled(r3, r6, r2, r1)
            if (r2 != 0) goto L85
            if (r1 == 0) goto L86
        L85:
            r4 = 1
        L86:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.overScrollByCompat(int, int, int, int, int, int, int, int, boolean):boolean");
    }

    public boolean pageScroll(int i10) {
        boolean z10;
        if (i10 == 130) {
            z10 = true;
        } else {
            z10 = false;
        }
        int height = getHeight();
        if (z10) {
            this.mTempRect.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
                Rect rect = this.mTempRect;
                if (rect.top + height > bottom) {
                    rect.top = bottom - height;
                }
            }
        } else {
            this.mTempRect.top = getScrollY() - height;
            Rect rect2 = this.mTempRect;
            if (rect2.top < 0) {
                rect2.top = 0;
            }
        }
        Rect rect3 = this.mTempRect;
        int i11 = rect3.top;
        int i12 = height + i11;
        rect3.bottom = i12;
        return scrollAndFocus(i10, i11, i12);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (!this.mIsLayoutDirty) {
            scrollToChild(view2);
        } else {
            this.mChildToScrollTo = view2;
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        return scrollToChildRect(rect, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        if (z10) {
            recycleVelocityTracker();
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.mIsLayoutDirty = true;
        super.requestLayout();
    }

    @Override // android.view.View
    public void scrollTo(int i10, int i11) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int clamp = clamp(i10, width, width2);
            int clamp2 = clamp(i11, height, height2);
            if (clamp != getScrollX() || clamp2 != getScrollY()) {
                super.scrollTo(clamp, clamp2);
            }
        }
    }

    public void setFillViewport(boolean z10) {
        if (z10 != this.mFillViewport) {
            this.mFillViewport = z10;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z10) {
        this.mChildHelper.n(z10);
    }

    public void setOnScrollChangeListener(c cVar) {
        this.mOnScrollChangeListener = cVar;
    }

    public void setSmoothScrollingEnabled(boolean z10) {
        this.mSmoothScrollingEnabled = z10;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    public final void smoothScrollBy(int i10, int i11) {
        smoothScrollBy(i10, i11, m.e.DEFAULT_SWIPE_ANIMATION_DURATION, false);
    }

    public final void smoothScrollTo(int i10, int i11) {
        smoothScrollTo(i10, i11, m.e.DEFAULT_SWIPE_ANIMATION_DURATION, false);
    }

    public boolean startNestedScroll(int i10, int i11) {
        return this.mChildHelper.q(i10, i11);
    }

    public void stopNestedScroll(int i10) {
        this.mChildHelper.s(i10);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, r2.a.f22072c);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return dispatchNestedPreScroll(i10, i11, iArr, iArr2, 0);
    }

    public boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr, int i14) {
        return this.mChildHelper.g(i10, i11, i12, i13, iArr, i14);
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return hasNestedScrollingParent(0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        onNestedPreScroll(view, i10, i11, iArr, 0);
    }

    @Override // androidx.core.view.e0
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13, int i14) {
        onNestedScrollInternal(i13, i14, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i10) {
        return onStartNestedScroll(view, view2, i10, 0);
    }

    public final void smoothScrollBy(int i10, int i11, int i12) {
        smoothScrollBy(i10, i11, i12, false);
    }

    public final void smoothScrollTo(int i10, int i11, int i12) {
        smoothScrollTo(i10, i11, i12, false);
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i10) {
        return startNestedScroll(i10, 0);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        stopNestedScroll(0);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.mTempRect = new Rect();
        this.mIsLayoutDirty = true;
        this.mIsLaidOut = false;
        this.mChildToScrollTo = null;
        this.mIsBeingDragged = false;
        this.mSmoothScrollingEnabled = true;
        this.mActivePointerId = -1;
        this.mScrollOffset = new int[2];
        this.mScrollConsumed = new int[2];
        this.mEdgeGlowTop = d.a(context, attributeSet);
        this.mEdgeGlowBottom = d.a(context, attributeSet);
        this.mPhysicalCoeff = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        initScrollView();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, SCROLLVIEW_STYLEABLE, i10, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.mParentHelper = new g0(this);
        this.mChildHelper = new d0(this);
        setNestedScrollingEnabled(true);
        p0.u0(this, ACCESSIBILITY_DELEGATE);
    }

    private void smoothScrollBy(int i10, int i11, int i12, boolean z10) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.mLastScroll > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            this.mScroller.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i11 + scrollY, Math.max(0, height - height2))) - scrollY, i12);
            runAnimatedScroll(z10);
        } else {
            if (!this.mScroller.isFinished()) {
                abortAnimatedScroll();
            }
            scrollBy(i10, i11);
        }
        this.mLastScroll = AnimationUtils.currentAnimationTimeMillis();
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return this.mChildHelper.f(i10, i11, i12, i13, iArr);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        onNestedScrollInternal(i13, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i10) {
        onNestedScrollAccepted(view, view2, i10, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        onStopNestedScroll(view, 0);
    }

    void smoothScrollTo(int i10, int i11, boolean z10) {
        smoothScrollTo(i10, i11, m.e.DEFAULT_SWIPE_ANIMATION_DURATION, z10);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10) {
        if (getChildCount() <= 0) {
            super.addView(view, i10);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    void smoothScrollTo(int i10, int i11, int i12, boolean z10) {
        smoothScrollBy(i10 - getScrollX(), i11 - getScrollY(), i12, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i10, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }
}
