package androidx.recyclerview.widget;

import android.animation.LayoutTransition;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.core.view.accessibility.n0;
import androidx.core.view.p0;
import androidx.core.view.r0;
import androidx.customview.view.AbsSavedState;
import androidx.recyclerview.widget.a;
import androidx.recyclerview.widget.b0;
import androidx.recyclerview.widget.c0;
import androidx.recyclerview.widget.e;
import androidx.recyclerview.widget.l;
import androidx.recyclerview.widget.w;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements androidx.core.view.c0 {
    static final boolean ALLOW_SIZE_IN_UNSPECIFIED_SPEC;
    static final boolean ALLOW_THREAD_GAP_WORK;
    static final int DEFAULT_ORIENTATION = 1;
    static final boolean DISPATCH_TEMP_DETACH = false;
    private static final float FLING_DESTRETCH_FACTOR = 4.0f;
    private static final boolean FORCE_ABS_FOCUS_SEARCH_DIRECTION;
    static final boolean FORCE_INVALIDATE_DISPLAY_LIST;
    static final long FOREVER_NS = Long.MAX_VALUE;
    public static final int HORIZONTAL = 0;
    private static final boolean IGNORE_DETACHED_FOCUSED_CHILD;
    private static final float INFLEXION = 0.35f;
    private static final int INVALID_POINTER = -1;
    public static final int INVALID_TYPE = -1;
    private static final Class<?>[] LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE;
    static final int MAX_SCROLL_DURATION = 2000;
    public static final long NO_ID = -1;
    public static final int NO_POSITION = -1;
    static final boolean POST_UPDATES_ON_ANIMATION;
    private static final float SCROLL_FRICTION = 0.015f;
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    static final String TAG = "RecyclerView";
    public static final int TOUCH_SLOP_DEFAULT = 0;
    public static final int TOUCH_SLOP_PAGING = 1;
    static final String TRACE_BIND_VIEW_TAG = "RV OnBindView";
    static final String TRACE_CREATE_VIEW_TAG = "RV CreateView";
    private static final String TRACE_HANDLE_ADAPTER_UPDATES_TAG = "RV PartialInvalidate";
    static final String TRACE_NESTED_PREFETCH_TAG = "RV Nested Prefetch";
    private static final String TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG = "RV FullInvalidate";
    private static final String TRACE_ON_LAYOUT_TAG = "RV OnLayout";
    static final String TRACE_PREFETCH_TAG = "RV Prefetch";
    static final String TRACE_SCROLL_TAG = "RV Scroll";
    public static final int UNDEFINED_DURATION = Integer.MIN_VALUE;
    static final boolean VERBOSE_TRACING = false;
    public static final int VERTICAL = 1;
    static boolean sDebugAssertionsEnabled = false;
    static final c0 sDefaultEdgeEffectFactory;
    static final Interpolator sQuinticInterpolator;
    static boolean sVerboseLoggingEnabled = false;
    androidx.recyclerview.widget.w mAccessibilityDelegate;
    private final AccessibilityManager mAccessibilityManager;
    h mAdapter;
    androidx.recyclerview.widget.a mAdapterHelper;
    boolean mAdapterUpdateDuringMeasure;
    private EdgeEffect mBottomGlow;
    private k mChildDrawingOrderCallback;
    androidx.recyclerview.widget.e mChildHelper;
    boolean mClipToPadding;
    boolean mDataSetHasChangedAfterLayout;
    boolean mDispatchItemsChangedEvent;
    private int mDispatchScrollCounter;
    private int mEatenAccessibilityChangeFlags;
    private l mEdgeEffectFactory;
    boolean mEnableFastScroller;
    boolean mFirstLayoutComplete;
    androidx.recyclerview.widget.l mGapWorker;
    boolean mHasFixedSize;
    private boolean mIgnoreMotionEventTillDown;
    private int mInitialTouchX;
    private int mInitialTouchY;
    private int mInterceptRequestLayoutDepth;
    private t mInterceptingOnItemTouchListener;
    boolean mIsAttached;
    m mItemAnimator;
    private m.b mItemAnimatorListener;
    private Runnable mItemAnimatorRunner;
    final ArrayList<o> mItemDecorations;
    boolean mItemsAddedOrRemoved;
    boolean mItemsChanged;
    private int mLastAutoMeasureNonExactMeasuredHeight;
    private int mLastAutoMeasureNonExactMeasuredWidth;
    private boolean mLastAutoMeasureSkippedDueToExact;
    private int mLastTouchX;
    private int mLastTouchY;
    p mLayout;
    private int mLayoutOrScrollCounter;
    boolean mLayoutSuppressed;
    boolean mLayoutWasDefered;
    private EdgeEffect mLeftGlow;
    private final int mMaxFlingVelocity;
    private final int mMinFlingVelocity;
    private final int[] mMinMaxLayoutPositions;
    private final int[] mNestedOffsets;
    private final y mObserver;
    private List<r> mOnChildAttachStateListeners;
    private s mOnFlingListener;
    private final ArrayList<t> mOnItemTouchListeners;
    final List<f0> mPendingAccessibilityImportanceChange;
    SavedState mPendingSavedState;
    private final float mPhysicalCoef;
    boolean mPostedAnimatorRunner;
    l.b mPrefetchRegistry;
    private boolean mPreserveFocusAfterLayout;
    final w mRecycler;
    x mRecyclerListener;
    final List<x> mRecyclerListeners;
    final int[] mReusableIntPair;
    private EdgeEffect mRightGlow;
    private float mScaledHorizontalScrollFactor;
    private float mScaledVerticalScrollFactor;
    private u mScrollListener;
    private List<u> mScrollListeners;
    private final int[] mScrollOffset;
    private int mScrollPointerId;
    private int mScrollState;
    private androidx.core.view.d0 mScrollingChildHelper;
    final b0 mState;
    final Rect mTempRect;
    private final Rect mTempRect2;
    final RectF mTempRectF;
    private EdgeEffect mTopGlow;
    private int mTouchSlop;
    final Runnable mUpdateChildViewsRunnable;
    private VelocityTracker mVelocityTracker;
    final e0 mViewFlinger;
    private final c0.b mViewInfoProcessCallback;
    final androidx.recyclerview.widget.c0 mViewInfoStore;
    private static final int[] NESTED_SCROLLING_ATTRS = {16843830};
    private static final float DECELERATION_RATE = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mFirstLayoutComplete && !recyclerView.isLayoutRequested()) {
                RecyclerView recyclerView2 = RecyclerView.this;
                if (!recyclerView2.mIsAttached) {
                    recyclerView2.requestLayout();
                } else if (recyclerView2.mLayoutSuppressed) {
                    recyclerView2.mLayoutWasDefered = true;
                } else {
                    recyclerView2.consumePendingUpdateOperations();
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class a0 {

        /* renamed from: b  reason: collision with root package name */
        private RecyclerView f6539b;

        /* renamed from: c  reason: collision with root package name */
        private p f6540c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f6541d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f6542e;

        /* renamed from: f  reason: collision with root package name */
        private View f6543f;

        /* renamed from: h  reason: collision with root package name */
        private boolean f6545h;

        /* renamed from: a  reason: collision with root package name */
        private int f6538a = -1;

        /* renamed from: g  reason: collision with root package name */
        private final a f6544g = new a(0, 0);

        /* loaded from: classes.dex */
        public static class a {

            /* renamed from: a  reason: collision with root package name */
            private int f6546a;

            /* renamed from: b  reason: collision with root package name */
            private int f6547b;

            /* renamed from: c  reason: collision with root package name */
            private int f6548c;

            /* renamed from: d  reason: collision with root package name */
            private int f6549d;

            /* renamed from: e  reason: collision with root package name */
            private Interpolator f6550e;

            /* renamed from: f  reason: collision with root package name */
            private boolean f6551f;

            /* renamed from: g  reason: collision with root package name */
            private int f6552g;

            public a(int i10, int i11) {
                this(i10, i11, RecyclerView.UNDEFINED_DURATION, null);
            }

            private void e() {
                if (this.f6550e != null && this.f6548c < 1) {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                }
                if (this.f6548c >= 1) {
                    return;
                }
                throw new IllegalStateException("Scroll duration must be a positive number");
            }

            boolean a() {
                if (this.f6549d >= 0) {
                    return true;
                }
                return false;
            }

            public void b(int i10) {
                this.f6549d = i10;
            }

            void c(RecyclerView recyclerView) {
                int i10 = this.f6549d;
                if (i10 >= 0) {
                    this.f6549d = -1;
                    recyclerView.jumpToPositionForSmoothScroller(i10);
                    this.f6551f = false;
                } else if (this.f6551f) {
                    e();
                    recyclerView.mViewFlinger.e(this.f6546a, this.f6547b, this.f6548c, this.f6550e);
                    int i11 = this.f6552g + 1;
                    this.f6552g = i11;
                    if (i11 > 10) {
                        Log.e(RecyclerView.TAG, "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                    }
                    this.f6551f = false;
                } else {
                    this.f6552g = 0;
                }
            }

            public void d(int i10, int i11, int i12, Interpolator interpolator) {
                this.f6546a = i10;
                this.f6547b = i11;
                this.f6548c = i12;
                this.f6550e = interpolator;
                this.f6551f = true;
            }

            public a(int i10, int i11, int i12, Interpolator interpolator) {
                this.f6549d = -1;
                this.f6551f = false;
                this.f6552g = 0;
                this.f6546a = i10;
                this.f6547b = i11;
                this.f6548c = i12;
                this.f6550e = interpolator;
            }
        }

        /* loaded from: classes.dex */
        public interface b {
            PointF b(int i10);
        }

        public PointF a(int i10) {
            p e10 = e();
            if (e10 instanceof b) {
                return ((b) e10).b(i10);
            }
            Log.w(RecyclerView.TAG, "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + b.class.getCanonicalName());
            return null;
        }

        public View b(int i10) {
            return this.f6539b.mLayout.O(i10);
        }

        public int c() {
            return this.f6539b.mLayout.V();
        }

        public int d(View view) {
            return this.f6539b.getChildLayoutPosition(view);
        }

        public p e() {
            return this.f6540c;
        }

        public int f() {
            return this.f6538a;
        }

        public boolean g() {
            return this.f6541d;
        }

        public boolean h() {
            return this.f6542e;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public void i(PointF pointF) {
            float f10 = pointF.x;
            float f11 = pointF.y;
            float sqrt = (float) Math.sqrt((f10 * f10) + (f11 * f11));
            pointF.x /= sqrt;
            pointF.y /= sqrt;
        }

        void j(int i10, int i11) {
            PointF a10;
            RecyclerView recyclerView = this.f6539b;
            if (this.f6538a == -1 || recyclerView == null) {
                r();
            }
            if (this.f6541d && this.f6543f == null && this.f6540c != null && (a10 = a(this.f6538a)) != null) {
                float f10 = a10.x;
                if (f10 != RecyclerView.DECELERATION_RATE || a10.y != RecyclerView.DECELERATION_RATE) {
                    recyclerView.scrollStep((int) Math.signum(f10), (int) Math.signum(a10.y), null);
                }
            }
            this.f6541d = false;
            View view = this.f6543f;
            if (view != null) {
                if (d(view) == this.f6538a) {
                    o(this.f6543f, recyclerView.mState, this.f6544g);
                    this.f6544g.c(recyclerView);
                    r();
                } else {
                    Log.e(RecyclerView.TAG, "Passed over target position while smooth scrolling.");
                    this.f6543f = null;
                }
            }
            if (this.f6542e) {
                l(i10, i11, recyclerView.mState, this.f6544g);
                boolean a11 = this.f6544g.a();
                this.f6544g.c(recyclerView);
                if (a11 && this.f6542e) {
                    this.f6541d = true;
                    recyclerView.mViewFlinger.d();
                }
            }
        }

        protected void k(View view) {
            if (d(view) == f()) {
                this.f6543f = view;
                if (RecyclerView.sVerboseLoggingEnabled) {
                    Log.d(RecyclerView.TAG, "smooth scroll target view has been attached");
                }
            }
        }

        protected abstract void l(int i10, int i11, b0 b0Var, a aVar);

        protected abstract void m();

        protected abstract void n();

        protected abstract void o(View view, b0 b0Var, a aVar);

        public void p(int i10) {
            this.f6538a = i10;
        }

        void q(RecyclerView recyclerView, p pVar) {
            recyclerView.mViewFlinger.f();
            if (this.f6545h) {
                Log.w(RecyclerView.TAG, "An instance of " + getClass().getSimpleName() + " was started more than once. Each instance of" + getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
            }
            this.f6539b = recyclerView;
            this.f6540c = pVar;
            int i10 = this.f6538a;
            if (i10 != -1) {
                recyclerView.mState.f6554a = i10;
                this.f6542e = true;
                this.f6541d = true;
                this.f6543f = b(f());
                m();
                this.f6539b.mViewFlinger.d();
                this.f6545h = true;
                return;
            }
            throw new IllegalArgumentException("Invalid target position");
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public final void r() {
            if (!this.f6542e) {
                return;
            }
            this.f6542e = false;
            n();
            this.f6539b.mState.f6554a = -1;
            this.f6543f = null;
            this.f6538a = -1;
            this.f6541d = false;
            this.f6540c.o1(this);
            this.f6540c = null;
            this.f6539b = null;
        }
    }

    /* loaded from: classes.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            m mVar = RecyclerView.this.mItemAnimator;
            if (mVar != null) {
                mVar.runPendingAnimations();
            }
            RecyclerView.this.mPostedAnimatorRunner = false;
        }
    }

    /* loaded from: classes.dex */
    public static class b0 {

        /* renamed from: b  reason: collision with root package name */
        private SparseArray<Object> f6555b;

        /* renamed from: m  reason: collision with root package name */
        int f6566m;

        /* renamed from: n  reason: collision with root package name */
        long f6567n;

        /* renamed from: o  reason: collision with root package name */
        int f6568o;

        /* renamed from: p  reason: collision with root package name */
        int f6569p;

        /* renamed from: q  reason: collision with root package name */
        int f6570q;

        /* renamed from: a  reason: collision with root package name */
        int f6554a = -1;

        /* renamed from: c  reason: collision with root package name */
        int f6556c = 0;

        /* renamed from: d  reason: collision with root package name */
        int f6557d = 0;

        /* renamed from: e  reason: collision with root package name */
        int f6558e = 1;

        /* renamed from: f  reason: collision with root package name */
        int f6559f = 0;

        /* renamed from: g  reason: collision with root package name */
        boolean f6560g = false;

        /* renamed from: h  reason: collision with root package name */
        boolean f6561h = false;

        /* renamed from: i  reason: collision with root package name */
        boolean f6562i = false;

        /* renamed from: j  reason: collision with root package name */
        boolean f6563j = false;

        /* renamed from: k  reason: collision with root package name */
        boolean f6564k = false;

        /* renamed from: l  reason: collision with root package name */
        boolean f6565l = false;

        void a(int i10) {
            if ((this.f6558e & i10) != 0) {
                return;
            }
            throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i10) + " but it is " + Integer.toBinaryString(this.f6558e));
        }

        public int b() {
            if (this.f6561h) {
                return this.f6556c - this.f6557d;
            }
            return this.f6559f;
        }

        public int c() {
            return this.f6554a;
        }

        public boolean d() {
            if (this.f6554a != -1) {
                return true;
            }
            return false;
        }

        public boolean e() {
            return this.f6561h;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void f(h hVar) {
            this.f6558e = 1;
            this.f6559f = hVar.getItemCount();
            this.f6561h = false;
            this.f6562i = false;
            this.f6563j = false;
        }

        public boolean g() {
            return this.f6565l;
        }

        public String toString() {
            return "State{mTargetPosition=" + this.f6554a + ", mData=" + this.f6555b + ", mItemCount=" + this.f6559f + ", mIsMeasuring=" + this.f6563j + ", mPreviousLayoutItemCount=" + this.f6556c + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f6557d + ", mStructureChanged=" + this.f6560g + ", mInPreLayout=" + this.f6561h + ", mRunSimpleAnimations=" + this.f6564k + ", mRunPredictiveAnimations=" + this.f6565l + '}';
        }
    }

    /* loaded from: classes.dex */
    class c implements Interpolator {
        c() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    }

    /* loaded from: classes.dex */
    static class c0 extends l {
        c0() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.l
        protected EdgeEffect a(RecyclerView recyclerView, int i10) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    /* loaded from: classes.dex */
    class d implements c0.b {
        d() {
        }

        @Override // androidx.recyclerview.widget.c0.b
        public void a(f0 f0Var) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.mLayout.w1(f0Var.itemView, recyclerView.mRecycler);
        }

        @Override // androidx.recyclerview.widget.c0.b
        public void b(f0 f0Var, m.c cVar, m.c cVar2) {
            RecyclerView.this.animateAppearance(f0Var, cVar, cVar2);
        }

        @Override // androidx.recyclerview.widget.c0.b
        public void c(f0 f0Var, m.c cVar, m.c cVar2) {
            RecyclerView.this.mRecycler.O(f0Var);
            RecyclerView.this.animateDisappearance(f0Var, cVar, cVar2);
        }

        @Override // androidx.recyclerview.widget.c0.b
        public void d(f0 f0Var, m.c cVar, m.c cVar2) {
            f0Var.setIsRecyclable(false);
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mDataSetHasChangedAfterLayout) {
                if (recyclerView.mItemAnimator.animateChange(f0Var, f0Var, cVar, cVar2)) {
                    RecyclerView.this.postAnimationRunner();
                }
            } else if (recyclerView.mItemAnimator.animatePersistence(f0Var, cVar, cVar2)) {
                RecyclerView.this.postAnimationRunner();
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class d0 {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class e implements e.b {
        e() {
        }

        @Override // androidx.recyclerview.widget.e.b
        public View a(int i10) {
            return RecyclerView.this.getChildAt(i10);
        }

        @Override // androidx.recyclerview.widget.e.b
        public void b(View view) {
            f0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt != null) {
                childViewHolderInt.onEnteredHiddenState(RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.e.b
        public int c() {
            return RecyclerView.this.getChildCount();
        }

        @Override // androidx.recyclerview.widget.e.b
        public void d() {
            int c10 = c();
            for (int i10 = 0; i10 < c10; i10++) {
                View a10 = a(i10);
                RecyclerView.this.dispatchChildDetached(a10);
                a10.clearAnimation();
            }
            RecyclerView.this.removeAllViews();
        }

        @Override // androidx.recyclerview.widget.e.b
        public int e(View view) {
            return RecyclerView.this.indexOfChild(view);
        }

        @Override // androidx.recyclerview.widget.e.b
        public f0 f(View view) {
            return RecyclerView.getChildViewHolderInt(view);
        }

        @Override // androidx.recyclerview.widget.e.b
        public void g(int i10) {
            View a10 = a(i10);
            if (a10 != null) {
                f0 childViewHolderInt = RecyclerView.getChildViewHolderInt(a10);
                if (childViewHolderInt != null) {
                    if (childViewHolderInt.isTmpDetached() && !childViewHolderInt.shouldIgnore()) {
                        throw new IllegalArgumentException("called detach on an already detached child " + childViewHolderInt + RecyclerView.this.exceptionLabel());
                    }
                    if (RecyclerView.sVerboseLoggingEnabled) {
                        Log.d(RecyclerView.TAG, "tmpDetach " + childViewHolderInt);
                    }
                    childViewHolderInt.addFlags(UserVerificationMethods.USER_VERIFY_HANDPRINT);
                }
            } else if (RecyclerView.sDebugAssertionsEnabled) {
                throw new IllegalArgumentException("No view at offset " + i10 + RecyclerView.this.exceptionLabel());
            }
            RecyclerView.this.detachViewFromParent(i10);
        }

        @Override // androidx.recyclerview.widget.e.b
        public void h(View view) {
            f0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt != null) {
                childViewHolderInt.onLeftHiddenState(RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.e.b
        public void i(View view, int i10) {
            RecyclerView.this.addView(view, i10);
            RecyclerView.this.dispatchChildAttached(view);
        }

        @Override // androidx.recyclerview.widget.e.b
        public void j(int i10) {
            View childAt = RecyclerView.this.getChildAt(i10);
            if (childAt != null) {
                RecyclerView.this.dispatchChildDetached(childAt);
                childAt.clearAnimation();
            }
            RecyclerView.this.removeViewAt(i10);
        }

        @Override // androidx.recyclerview.widget.e.b
        public void k(View view, int i10, ViewGroup.LayoutParams layoutParams) {
            f0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt != null) {
                if (!childViewHolderInt.isTmpDetached() && !childViewHolderInt.shouldIgnore()) {
                    throw new IllegalArgumentException("Called attach on a child which is not detached: " + childViewHolderInt + RecyclerView.this.exceptionLabel());
                }
                if (RecyclerView.sVerboseLoggingEnabled) {
                    Log.d(RecyclerView.TAG, "reAttach " + childViewHolderInt);
                }
                childViewHolderInt.clearTmpDetachFlag();
            } else if (RecyclerView.sDebugAssertionsEnabled) {
                throw new IllegalArgumentException("No ViewHolder found for child: " + view + ", index: " + i10 + RecyclerView.this.exceptionLabel());
            }
            RecyclerView.this.attachViewToParent(view, i10, layoutParams);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class e0 implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        private int f6573f;

        /* renamed from: m  reason: collision with root package name */
        private int f6574m;

        /* renamed from: p  reason: collision with root package name */
        OverScroller f6575p;

        /* renamed from: q  reason: collision with root package name */
        Interpolator f6576q;

        /* renamed from: r  reason: collision with root package name */
        private boolean f6577r;

        /* renamed from: s  reason: collision with root package name */
        private boolean f6578s;

        e0() {
            Interpolator interpolator = RecyclerView.sQuinticInterpolator;
            this.f6576q = interpolator;
            this.f6577r = false;
            this.f6578s = false;
            this.f6575p = new OverScroller(RecyclerView.this.getContext(), interpolator);
        }

        private int a(int i10, int i11) {
            boolean z10;
            int height;
            int abs = Math.abs(i10);
            int abs2 = Math.abs(i11);
            if (abs > abs2) {
                z10 = true;
            } else {
                z10 = false;
            }
            RecyclerView recyclerView = RecyclerView.this;
            if (z10) {
                height = recyclerView.getWidth();
            } else {
                height = recyclerView.getHeight();
            }
            if (!z10) {
                abs = abs2;
            }
            return Math.min((int) (((abs / height) + 1.0f) * 300.0f), 2000);
        }

        private void c() {
            RecyclerView.this.removeCallbacks(this);
            p0.m0(RecyclerView.this, this);
        }

        public void b(int i10, int i11) {
            RecyclerView.this.setScrollState(2);
            this.f6574m = 0;
            this.f6573f = 0;
            Interpolator interpolator = this.f6576q;
            Interpolator interpolator2 = RecyclerView.sQuinticInterpolator;
            if (interpolator != interpolator2) {
                this.f6576q = interpolator2;
                this.f6575p = new OverScroller(RecyclerView.this.getContext(), interpolator2);
            }
            this.f6575p.fling(0, 0, i10, i11, RecyclerView.UNDEFINED_DURATION, Integer.MAX_VALUE, RecyclerView.UNDEFINED_DURATION, Integer.MAX_VALUE);
            d();
        }

        void d() {
            if (this.f6577r) {
                this.f6578s = true;
            } else {
                c();
            }
        }

        public void e(int i10, int i11, int i12, Interpolator interpolator) {
            if (i12 == Integer.MIN_VALUE) {
                i12 = a(i10, i11);
            }
            int i13 = i12;
            if (interpolator == null) {
                interpolator = RecyclerView.sQuinticInterpolator;
            }
            if (this.f6576q != interpolator) {
                this.f6576q = interpolator;
                this.f6575p = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            this.f6574m = 0;
            this.f6573f = 0;
            RecyclerView.this.setScrollState(2);
            this.f6575p.startScroll(0, 0, i10, i11, i13);
            if (Build.VERSION.SDK_INT < 23) {
                this.f6575p.computeScrollOffset();
            }
            d();
        }

        public void f() {
            RecyclerView.this.removeCallbacks(this);
            this.f6575p.abortAnimation();
        }

        @Override // java.lang.Runnable
        public void run() {
            int i10;
            int i11;
            boolean z10;
            boolean z11;
            boolean z12;
            boolean z13;
            int i12;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mLayout == null) {
                f();
                return;
            }
            this.f6578s = false;
            this.f6577r = true;
            recyclerView.consumePendingUpdateOperations();
            OverScroller overScroller = this.f6575p;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i13 = currX - this.f6573f;
                int i14 = currY - this.f6574m;
                this.f6573f = currX;
                this.f6574m = currY;
                int consumeFlingInHorizontalStretch = RecyclerView.this.consumeFlingInHorizontalStretch(i13);
                int consumeFlingInVerticalStretch = RecyclerView.this.consumeFlingInVerticalStretch(i14);
                RecyclerView recyclerView2 = RecyclerView.this;
                int[] iArr = recyclerView2.mReusableIntPair;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView2.dispatchNestedPreScroll(consumeFlingInHorizontalStretch, consumeFlingInVerticalStretch, iArr, null, 1)) {
                    int[] iArr2 = RecyclerView.this.mReusableIntPair;
                    consumeFlingInHorizontalStretch -= iArr2[0];
                    consumeFlingInVerticalStretch -= iArr2[1];
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.considerReleasingGlowsOnScroll(consumeFlingInHorizontalStretch, consumeFlingInVerticalStretch);
                }
                RecyclerView recyclerView3 = RecyclerView.this;
                if (recyclerView3.mAdapter != null) {
                    int[] iArr3 = recyclerView3.mReusableIntPair;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    recyclerView3.scrollStep(consumeFlingInHorizontalStretch, consumeFlingInVerticalStretch, iArr3);
                    RecyclerView recyclerView4 = RecyclerView.this;
                    int[] iArr4 = recyclerView4.mReusableIntPair;
                    i11 = iArr4[0];
                    i10 = iArr4[1];
                    consumeFlingInHorizontalStretch -= i11;
                    consumeFlingInVerticalStretch -= i10;
                    a0 a0Var = recyclerView4.mLayout.f6593t;
                    if (a0Var != null && !a0Var.g() && a0Var.h()) {
                        int b10 = RecyclerView.this.mState.b();
                        if (b10 == 0) {
                            a0Var.r();
                        } else if (a0Var.f() >= b10) {
                            a0Var.p(b10 - 1);
                            a0Var.j(i11, i10);
                        } else {
                            a0Var.j(i11, i10);
                        }
                    }
                } else {
                    i10 = 0;
                    i11 = 0;
                }
                if (!RecyclerView.this.mItemDecorations.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                RecyclerView recyclerView5 = RecyclerView.this;
                int[] iArr5 = recyclerView5.mReusableIntPair;
                iArr5[0] = 0;
                iArr5[1] = 0;
                recyclerView5.dispatchNestedScroll(i11, i10, consumeFlingInHorizontalStretch, consumeFlingInVerticalStretch, null, 1, iArr5);
                RecyclerView recyclerView6 = RecyclerView.this;
                int[] iArr6 = recyclerView6.mReusableIntPair;
                int i15 = consumeFlingInHorizontalStretch - iArr6[0];
                int i16 = consumeFlingInVerticalStretch - iArr6[1];
                if (i11 != 0 || i10 != 0) {
                    recyclerView6.dispatchOnScrolled(i11, i10);
                }
                if (!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                if (overScroller.getCurrX() == overScroller.getFinalX()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (overScroller.getCurrY() == overScroller.getFinalY()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!overScroller.isFinished() && ((!z10 && i15 == 0) || (!z11 && i16 == 0))) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                a0 a0Var2 = RecyclerView.this.mLayout.f6593t;
                if (a0Var2 != null && a0Var2.g()) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (!z13 && z12) {
                    if (RecyclerView.this.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        if (i15 < 0) {
                            i12 = -currVelocity;
                        } else if (i15 > 0) {
                            i12 = currVelocity;
                        } else {
                            i12 = 0;
                        }
                        if (i16 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i16 <= 0) {
                            currVelocity = 0;
                        }
                        RecyclerView.this.absorbGlows(i12, currVelocity);
                    }
                    if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
                        RecyclerView.this.mPrefetchRegistry.b();
                    }
                } else {
                    d();
                    RecyclerView recyclerView7 = RecyclerView.this;
                    androidx.recyclerview.widget.l lVar = recyclerView7.mGapWorker;
                    if (lVar != null) {
                        lVar.f(recyclerView7, i11, i10);
                    }
                }
            }
            a0 a0Var3 = RecyclerView.this.mLayout.f6593t;
            if (a0Var3 != null && a0Var3.g()) {
                a0Var3.j(0, 0);
            }
            this.f6577r = false;
            if (this.f6578s) {
                c();
                return;
            }
            RecyclerView.this.setScrollState(0);
            RecyclerView.this.stopNestedScroll(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class f implements a.InterfaceC0153a {
        f() {
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0153a
        public void a(int i10, int i11) {
            RecyclerView.this.offsetPositionRecordsForMove(i10, i11);
            RecyclerView.this.mItemsAddedOrRemoved = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0153a
        public void b(a.b bVar) {
            i(bVar);
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0153a
        public void c(int i10, int i11, Object obj) {
            RecyclerView.this.viewRangeUpdate(i10, i11, obj);
            RecyclerView.this.mItemsChanged = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0153a
        public void d(a.b bVar) {
            i(bVar);
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0153a
        public f0 e(int i10) {
            f0 findViewHolderForPosition = RecyclerView.this.findViewHolderForPosition(i10, true);
            if (findViewHolderForPosition == null) {
                return null;
            }
            if (RecyclerView.this.mChildHelper.n(findViewHolderForPosition.itemView)) {
                if (RecyclerView.sVerboseLoggingEnabled) {
                    Log.d(RecyclerView.TAG, "assuming view holder cannot be find because it is hidden");
                }
                return null;
            }
            return findViewHolderForPosition;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0153a
        public void f(int i10, int i11) {
            RecyclerView.this.offsetPositionRecordsForRemove(i10, i11, false);
            RecyclerView.this.mItemsAddedOrRemoved = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0153a
        public void g(int i10, int i11) {
            RecyclerView.this.offsetPositionRecordsForInsert(i10, i11);
            RecyclerView.this.mItemsAddedOrRemoved = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0153a
        public void h(int i10, int i11) {
            RecyclerView.this.offsetPositionRecordsForRemove(i10, i11, true);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.mItemsAddedOrRemoved = true;
            recyclerView.mState.f6557d += i11;
        }

        void i(a.b bVar) {
            int i10 = bVar.f6669a;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 4) {
                        if (i10 == 8) {
                            RecyclerView recyclerView = RecyclerView.this;
                            recyclerView.mLayout.c1(recyclerView, bVar.f6670b, bVar.f6672d, 1);
                            return;
                        }
                        return;
                    }
                    RecyclerView recyclerView2 = RecyclerView.this;
                    recyclerView2.mLayout.f1(recyclerView2, bVar.f6670b, bVar.f6672d, bVar.f6671c);
                    return;
                }
                RecyclerView recyclerView3 = RecyclerView.this;
                recyclerView3.mLayout.d1(recyclerView3, bVar.f6670b, bVar.f6672d);
                return;
            }
            RecyclerView recyclerView4 = RecyclerView.this;
            recyclerView4.mLayout.a1(recyclerView4, bVar.f6670b, bVar.f6672d);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class f0 {
        static final int FLAG_ADAPTER_FULLUPDATE = 1024;
        static final int FLAG_ADAPTER_POSITION_UNKNOWN = 512;
        static final int FLAG_APPEARED_IN_PRE_LAYOUT = 4096;
        static final int FLAG_BOUNCED_FROM_HIDDEN_LIST = 8192;
        static final int FLAG_BOUND = 1;
        static final int FLAG_IGNORE = 128;
        static final int FLAG_INVALID = 4;
        static final int FLAG_MOVED = 2048;
        static final int FLAG_NOT_RECYCLABLE = 16;
        static final int FLAG_REMOVED = 8;
        static final int FLAG_RETURNED_FROM_SCRAP = 32;
        static final int FLAG_TMP_DETACHED = 256;
        static final int FLAG_UPDATE = 2;
        private static final List<Object> FULLUPDATE_PAYLOADS = Collections.emptyList();
        static final int PENDING_ACCESSIBILITY_STATE_NOT_SET = -1;
        public final View itemView;
        h<? extends f0> mBindingAdapter;
        int mFlags;
        WeakReference<RecyclerView> mNestedRecyclerView;
        RecyclerView mOwnerRecyclerView;
        int mPosition = -1;
        int mOldPosition = -1;
        long mItemId = -1;
        int mItemViewType = -1;
        int mPreLayoutPosition = -1;
        f0 mShadowedHolder = null;
        f0 mShadowingHolder = null;
        List<Object> mPayloads = null;
        List<Object> mUnmodifiedPayloads = null;
        private int mIsRecyclableCount = 0;
        w mScrapContainer = null;
        boolean mInChangeScrap = false;
        private int mWasImportantForAccessibilityBeforeHidden = 0;
        int mPendingAccessibilityState = -1;

        public f0(View view) {
            if (view != null) {
                this.itemView = view;
                return;
            }
            throw new IllegalArgumentException("itemView may not be null");
        }

        private void createPayloadsIfNeeded() {
            if (this.mPayloads == null) {
                ArrayList arrayList = new ArrayList();
                this.mPayloads = arrayList;
                this.mUnmodifiedPayloads = Collections.unmodifiableList(arrayList);
            }
        }

        void addChangePayload(Object obj) {
            if (obj == null) {
                addFlags(1024);
            } else if ((1024 & this.mFlags) == 0) {
                createPayloadsIfNeeded();
                this.mPayloads.add(obj);
            }
        }

        void addFlags(int i10) {
            this.mFlags = i10 | this.mFlags;
        }

        void clearOldPosition() {
            this.mOldPosition = -1;
            this.mPreLayoutPosition = -1;
        }

        void clearPayload() {
            List<Object> list = this.mPayloads;
            if (list != null) {
                list.clear();
            }
            this.mFlags &= -1025;
        }

        void clearReturnedFromScrapFlag() {
            this.mFlags &= -33;
        }

        void clearTmpDetachFlag() {
            this.mFlags &= -257;
        }

        boolean doesTransientStatePreventRecycling() {
            if ((this.mFlags & 16) == 0 && p0.V(this.itemView)) {
                return true;
            }
            return false;
        }

        void flagRemovedAndOffsetPosition(int i10, int i11, boolean z10) {
            addFlags(8);
            offsetPosition(i11, z10);
            this.mPosition = i10;
        }

        public final int getAbsoluteAdapterPosition() {
            RecyclerView recyclerView = this.mOwnerRecyclerView;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.getAdapterPositionInRecyclerView(this);
        }

        @Deprecated
        public final int getAdapterPosition() {
            return getBindingAdapterPosition();
        }

        public final h<? extends f0> getBindingAdapter() {
            return this.mBindingAdapter;
        }

        public final int getBindingAdapterPosition() {
            RecyclerView recyclerView;
            h adapter;
            int adapterPositionInRecyclerView;
            if (this.mBindingAdapter == null || (recyclerView = this.mOwnerRecyclerView) == null || (adapter = recyclerView.getAdapter()) == null || (adapterPositionInRecyclerView = this.mOwnerRecyclerView.getAdapterPositionInRecyclerView(this)) == -1) {
                return -1;
            }
            return adapter.findRelativeAdapterPositionIn(this.mBindingAdapter, this, adapterPositionInRecyclerView);
        }

        public final long getItemId() {
            return this.mItemId;
        }

        public final int getItemViewType() {
            return this.mItemViewType;
        }

        public final int getLayoutPosition() {
            int i10 = this.mPreLayoutPosition;
            if (i10 == -1) {
                return this.mPosition;
            }
            return i10;
        }

        public final int getOldPosition() {
            return this.mOldPosition;
        }

        @Deprecated
        public final int getPosition() {
            int i10 = this.mPreLayoutPosition;
            if (i10 == -1) {
                return this.mPosition;
            }
            return i10;
        }

        List<Object> getUnmodifiedPayloads() {
            if ((this.mFlags & 1024) == 0) {
                List<Object> list = this.mPayloads;
                if (list != null && list.size() != 0) {
                    return this.mUnmodifiedPayloads;
                }
                return FULLUPDATE_PAYLOADS;
            }
            return FULLUPDATE_PAYLOADS;
        }

        boolean hasAnyOfTheFlags(int i10) {
            if ((i10 & this.mFlags) != 0) {
                return true;
            }
            return false;
        }

        boolean isAdapterPositionUnknown() {
            if ((this.mFlags & 512) == 0 && !isInvalid()) {
                return false;
            }
            return true;
        }

        boolean isAttachedToTransitionOverlay() {
            if (this.itemView.getParent() != null && this.itemView.getParent() != this.mOwnerRecyclerView) {
                return true;
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean isBound() {
            if ((this.mFlags & 1) != 0) {
                return true;
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean isInvalid() {
            if ((this.mFlags & 4) != 0) {
                return true;
            }
            return false;
        }

        public final boolean isRecyclable() {
            if ((this.mFlags & 16) == 0 && !p0.V(this.itemView)) {
                return true;
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean isRemoved() {
            if ((this.mFlags & 8) != 0) {
                return true;
            }
            return false;
        }

        boolean isScrap() {
            if (this.mScrapContainer != null) {
                return true;
            }
            return false;
        }

        boolean isTmpDetached() {
            if ((this.mFlags & 256) != 0) {
                return true;
            }
            return false;
        }

        boolean isUpdated() {
            if ((this.mFlags & 2) != 0) {
                return true;
            }
            return false;
        }

        boolean needsUpdate() {
            if ((this.mFlags & 2) != 0) {
                return true;
            }
            return false;
        }

        void offsetPosition(int i10, boolean z10) {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
            if (this.mPreLayoutPosition == -1) {
                this.mPreLayoutPosition = this.mPosition;
            }
            if (z10) {
                this.mPreLayoutPosition += i10;
            }
            this.mPosition += i10;
            if (this.itemView.getLayoutParams() != null) {
                ((q) this.itemView.getLayoutParams()).f6608p = true;
            }
        }

        void onEnteredHiddenState(RecyclerView recyclerView) {
            int i10 = this.mPendingAccessibilityState;
            if (i10 != -1) {
                this.mWasImportantForAccessibilityBeforeHidden = i10;
            } else {
                this.mWasImportantForAccessibilityBeforeHidden = p0.C(this.itemView);
            }
            recyclerView.setChildImportantForAccessibilityInternal(this, 4);
        }

        void onLeftHiddenState(RecyclerView recyclerView) {
            recyclerView.setChildImportantForAccessibilityInternal(this, this.mWasImportantForAccessibilityBeforeHidden);
            this.mWasImportantForAccessibilityBeforeHidden = 0;
        }

        void resetInternal() {
            if (RecyclerView.sDebugAssertionsEnabled && isTmpDetached()) {
                throw new IllegalStateException("Attempting to reset temp-detached ViewHolder: " + this + ". ViewHolders should be fully detached before resetting.");
            }
            this.mFlags = 0;
            this.mPosition = -1;
            this.mOldPosition = -1;
            this.mItemId = -1L;
            this.mPreLayoutPosition = -1;
            this.mIsRecyclableCount = 0;
            this.mShadowedHolder = null;
            this.mShadowingHolder = null;
            clearPayload();
            this.mWasImportantForAccessibilityBeforeHidden = 0;
            this.mPendingAccessibilityState = -1;
            RecyclerView.clearNestedRecyclerViewIfNotNested(this);
        }

        void saveOldPosition() {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
        }

        void setFlags(int i10, int i11) {
            this.mFlags = (i10 & i11) | (this.mFlags & (~i11));
        }

        public final void setIsRecyclable(boolean z10) {
            int i10;
            int i11 = this.mIsRecyclableCount;
            if (z10) {
                i10 = i11 - 1;
            } else {
                i10 = i11 + 1;
            }
            this.mIsRecyclableCount = i10;
            if (i10 < 0) {
                this.mIsRecyclableCount = 0;
                if (!RecyclerView.sDebugAssertionsEnabled) {
                    Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                } else {
                    throw new RuntimeException("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                }
            } else if (!z10 && i10 == 1) {
                this.mFlags |= 16;
            } else if (z10 && i10 == 0) {
                this.mFlags &= -17;
            }
            if (RecyclerView.sVerboseLoggingEnabled) {
                Log.d(RecyclerView.TAG, "setIsRecyclable val:" + z10 + ":" + this);
            }
        }

        void setScrapContainer(w wVar, boolean z10) {
            this.mScrapContainer = wVar;
            this.mInChangeScrap = z10;
        }

        boolean shouldBeKeptAsChild() {
            if ((this.mFlags & 16) != 0) {
                return true;
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean shouldIgnore() {
            if ((this.mFlags & 128) != 0) {
                return true;
            }
            return false;
        }

        void stopIgnoring() {
            this.mFlags &= -129;
        }

        public String toString() {
            String simpleName;
            String str;
            if (getClass().isAnonymousClass()) {
                simpleName = "ViewHolder";
            } else {
                simpleName = getClass().getSimpleName();
            }
            StringBuilder sb2 = new StringBuilder(simpleName + "{" + Integer.toHexString(hashCode()) + " position=" + this.mPosition + " id=" + this.mItemId + ", oldPos=" + this.mOldPosition + ", pLpos:" + this.mPreLayoutPosition);
            if (isScrap()) {
                sb2.append(" scrap ");
                if (this.mInChangeScrap) {
                    str = "[changeScrap]";
                } else {
                    str = "[attachedScrap]";
                }
                sb2.append(str);
            }
            if (isInvalid()) {
                sb2.append(" invalid");
            }
            if (!isBound()) {
                sb2.append(" unbound");
            }
            if (needsUpdate()) {
                sb2.append(" update");
            }
            if (isRemoved()) {
                sb2.append(" removed");
            }
            if (shouldIgnore()) {
                sb2.append(" ignored");
            }
            if (isTmpDetached()) {
                sb2.append(" tmpDetached");
            }
            if (!isRecyclable()) {
                sb2.append(" not recyclable(" + this.mIsRecyclableCount + ")");
            }
            if (isAdapterPositionUnknown()) {
                sb2.append(" undefined adapter position");
            }
            if (this.itemView.getParent() == null) {
                sb2.append(" no parent");
            }
            sb2.append("}");
            return sb2.toString();
        }

        void unScrap() {
            this.mScrapContainer.O(this);
        }

        boolean wasReturnedFromScrap() {
            if ((this.mFlags & 32) != 0) {
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class g {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f6581a;

        static {
            int[] iArr = new int[h.a.values().length];
            f6581a = iArr;
            try {
                iArr[h.a.PREVENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6581a[h.a.PREVENT_WHEN_EMPTY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class h<VH extends f0> {
        private final i mObservable = new i();
        private boolean mHasStableIds = false;
        private a mStateRestorationPolicy = a.ALLOW;

        /* loaded from: classes.dex */
        public enum a {
            ALLOW,
            PREVENT_WHEN_EMPTY,
            PREVENT
        }

        public final void bindViewHolder(VH vh, int i10) {
            boolean z10;
            if (vh.mBindingAdapter == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                vh.mPosition = i10;
                if (hasStableIds()) {
                    vh.mItemId = getItemId(i10);
                }
                vh.setFlags(1, 519);
                androidx.core.os.t.a(RecyclerView.TRACE_BIND_VIEW_TAG);
            }
            vh.mBindingAdapter = this;
            if (RecyclerView.sDebugAssertionsEnabled) {
                if (vh.itemView.getParent() == null && p0.X(vh.itemView) != vh.isTmpDetached()) {
                    throw new IllegalStateException("Temp-detached state out of sync with reality. holder.isTmpDetached(): " + vh.isTmpDetached() + ", attached to window: " + p0.X(vh.itemView) + ", holder: " + vh);
                } else if (vh.itemView.getParent() == null && p0.X(vh.itemView)) {
                    throw new IllegalStateException("Attempting to bind attached holder with no parent (AKA temp detached): " + vh);
                }
            }
            onBindViewHolder(vh, i10, vh.getUnmodifiedPayloads());
            if (z10) {
                vh.clearPayload();
                ViewGroup.LayoutParams layoutParams = vh.itemView.getLayoutParams();
                if (layoutParams instanceof q) {
                    ((q) layoutParams).f6608p = true;
                }
                androidx.core.os.t.b();
            }
        }

        boolean canRestoreState() {
            int i10 = g.f6581a[this.mStateRestorationPolicy.ordinal()];
            if (i10 == 1) {
                return false;
            }
            if (i10 == 2 && getItemCount() <= 0) {
                return false;
            }
            return true;
        }

        public final VH createViewHolder(ViewGroup viewGroup, int i10) {
            try {
                androidx.core.os.t.a(RecyclerView.TRACE_CREATE_VIEW_TAG);
                VH onCreateViewHolder = onCreateViewHolder(viewGroup, i10);
                if (onCreateViewHolder.itemView.getParent() == null) {
                    onCreateViewHolder.mItemViewType = i10;
                    return onCreateViewHolder;
                }
                throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
            } finally {
                androidx.core.os.t.b();
            }
        }

        public int findRelativeAdapterPositionIn(h<? extends f0> hVar, f0 f0Var, int i10) {
            if (hVar == this) {
                return i10;
            }
            return -1;
        }

        public abstract int getItemCount();

        public long getItemId(int i10) {
            return -1L;
        }

        public int getItemViewType(int i10) {
            return 0;
        }

        public final a getStateRestorationPolicy() {
            return this.mStateRestorationPolicy;
        }

        public final boolean hasObservers() {
            return this.mObservable.a();
        }

        public final boolean hasStableIds() {
            return this.mHasStableIds;
        }

        public final void notifyDataSetChanged() {
            this.mObservable.b();
        }

        public final void notifyItemChanged(int i10) {
            this.mObservable.d(i10, 1);
        }

        public final void notifyItemInserted(int i10) {
            this.mObservable.f(i10, 1);
        }

        public final void notifyItemMoved(int i10, int i11) {
            this.mObservable.c(i10, i11);
        }

        public final void notifyItemRangeChanged(int i10, int i11) {
            this.mObservable.d(i10, i11);
        }

        public final void notifyItemRangeInserted(int i10, int i11) {
            this.mObservable.f(i10, i11);
        }

        public final void notifyItemRangeRemoved(int i10, int i11) {
            this.mObservable.g(i10, i11);
        }

        public final void notifyItemRemoved(int i10) {
            this.mObservable.g(i10, 1);
        }

        public abstract void onBindViewHolder(VH vh, int i10);

        public void onBindViewHolder(VH vh, int i10, List<Object> list) {
            onBindViewHolder(vh, i10);
        }

        public abstract VH onCreateViewHolder(ViewGroup viewGroup, int i10);

        public boolean onFailedToRecycleView(VH vh) {
            return false;
        }

        public void registerAdapterDataObserver(j jVar) {
            this.mObservable.registerObserver(jVar);
        }

        public void setHasStableIds(boolean z10) {
            if (!hasObservers()) {
                this.mHasStableIds = z10;
                return;
            }
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }

        public void setStateRestorationPolicy(a aVar) {
            this.mStateRestorationPolicy = aVar;
            this.mObservable.h();
        }

        public void unregisterAdapterDataObserver(j jVar) {
            this.mObservable.unregisterObserver(jVar);
        }

        public final void notifyItemChanged(int i10, Object obj) {
            this.mObservable.e(i10, 1, obj);
        }

        public final void notifyItemRangeChanged(int i10, int i11, Object obj) {
            this.mObservable.e(i10, i11, obj);
        }

        public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        }

        public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        }

        public void onViewAttachedToWindow(VH vh) {
        }

        public void onViewDetachedFromWindow(VH vh) {
        }

        public void onViewRecycled(VH vh) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class i extends Observable<j> {
        i() {
        }

        public boolean a() {
            return !((Observable) this).mObservers.isEmpty();
        }

        public void b() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).onChanged();
            }
        }

        public void c(int i10, int i11) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).onItemRangeMoved(i10, i11, 1);
            }
        }

        public void d(int i10, int i11) {
            e(i10, i11, null);
        }

        public void e(int i10, int i11, Object obj) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).onItemRangeChanged(i10, i11, obj);
            }
        }

        public void f(int i10, int i11) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).onItemRangeInserted(i10, i11);
            }
        }

        public void g(int i10, int i11) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).onItemRangeRemoved(i10, i11);
            }
        }

        public void h() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).onStateRestorationPolicyChanged();
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class j {
        public void onItemRangeChanged(int i10, int i11) {
        }

        public void onItemRangeChanged(int i10, int i11, Object obj) {
            onItemRangeChanged(i10, i11);
        }

        public void onChanged() {
        }

        public void onStateRestorationPolicyChanged() {
        }

        public void onItemRangeInserted(int i10, int i11) {
        }

        public void onItemRangeRemoved(int i10, int i11) {
        }

        public void onItemRangeMoved(int i10, int i11, int i12) {
        }
    }

    /* loaded from: classes.dex */
    public interface k {
        int a(int i10, int i11);
    }

    /* loaded from: classes.dex */
    public static class l {
        protected EdgeEffect a(RecyclerView recyclerView, int i10) {
            throw null;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class m {
        public static final int FLAG_APPEARED_IN_PRE_LAYOUT = 4096;
        public static final int FLAG_CHANGED = 2;
        public static final int FLAG_INVALIDATED = 4;
        public static final int FLAG_MOVED = 2048;
        public static final int FLAG_REMOVED = 8;
        private b mListener = null;
        private ArrayList<a> mFinishedListeners = new ArrayList<>();
        private long mAddDuration = 120;
        private long mRemoveDuration = 120;
        private long mMoveDuration = 250;
        private long mChangeDuration = 250;

        /* loaded from: classes.dex */
        public interface a {
            void a();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public interface b {
            void a(f0 f0Var);
        }

        /* loaded from: classes.dex */
        public static class c {

            /* renamed from: a  reason: collision with root package name */
            public int f6582a;

            /* renamed from: b  reason: collision with root package name */
            public int f6583b;

            /* renamed from: c  reason: collision with root package name */
            public int f6584c;

            /* renamed from: d  reason: collision with root package name */
            public int f6585d;

            public c a(f0 f0Var) {
                return b(f0Var, 0);
            }

            public c b(f0 f0Var, int i10) {
                View view = f0Var.itemView;
                this.f6582a = view.getLeft();
                this.f6583b = view.getTop();
                this.f6584c = view.getRight();
                this.f6585d = view.getBottom();
                return this;
            }
        }

        static int buildAdapterChangeFlagsForAnimations(f0 f0Var) {
            int i10 = f0Var.mFlags & 14;
            if (f0Var.isInvalid()) {
                return 4;
            }
            if ((i10 & 4) == 0) {
                int oldPosition = f0Var.getOldPosition();
                int absoluteAdapterPosition = f0Var.getAbsoluteAdapterPosition();
                if (oldPosition != -1 && absoluteAdapterPosition != -1 && oldPosition != absoluteAdapterPosition) {
                    return i10 | FLAG_MOVED;
                }
                return i10;
            }
            return i10;
        }

        public abstract boolean animateAppearance(f0 f0Var, c cVar, c cVar2);

        public abstract boolean animateChange(f0 f0Var, f0 f0Var2, c cVar, c cVar2);

        public abstract boolean animateDisappearance(f0 f0Var, c cVar, c cVar2);

        public abstract boolean animatePersistence(f0 f0Var, c cVar, c cVar2);

        public boolean canReuseUpdatedViewHolder(f0 f0Var) {
            return true;
        }

        public final void dispatchAnimationFinished(f0 f0Var) {
            onAnimationFinished(f0Var);
            b bVar = this.mListener;
            if (bVar != null) {
                bVar.a(f0Var);
            }
        }

        public final void dispatchAnimationStarted(f0 f0Var) {
            onAnimationStarted(f0Var);
        }

        public final void dispatchAnimationsFinished() {
            int size = this.mFinishedListeners.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.mFinishedListeners.get(i10).a();
            }
            this.mFinishedListeners.clear();
        }

        public abstract void endAnimation(f0 f0Var);

        public abstract void endAnimations();

        public long getAddDuration() {
            return this.mAddDuration;
        }

        public long getChangeDuration() {
            return this.mChangeDuration;
        }

        public long getMoveDuration() {
            return this.mMoveDuration;
        }

        public long getRemoveDuration() {
            return this.mRemoveDuration;
        }

        public abstract boolean isRunning();

        public final boolean isRunning(a aVar) {
            boolean isRunning = isRunning();
            if (aVar != null) {
                if (!isRunning) {
                    aVar.a();
                } else {
                    this.mFinishedListeners.add(aVar);
                }
            }
            return isRunning;
        }

        public c obtainHolderInfo() {
            return new c();
        }

        public c recordPostLayoutInformation(b0 b0Var, f0 f0Var) {
            return obtainHolderInfo().a(f0Var);
        }

        public c recordPreLayoutInformation(b0 b0Var, f0 f0Var, int i10, List<Object> list) {
            return obtainHolderInfo().a(f0Var);
        }

        public abstract void runPendingAnimations();

        public void setAddDuration(long j10) {
            this.mAddDuration = j10;
        }

        public void setChangeDuration(long j10) {
            this.mChangeDuration = j10;
        }

        void setListener(b bVar) {
            this.mListener = bVar;
        }

        public void setMoveDuration(long j10) {
            this.mMoveDuration = j10;
        }

        public void setRemoveDuration(long j10) {
            this.mRemoveDuration = j10;
        }

        public boolean canReuseUpdatedViewHolder(f0 f0Var, List<Object> list) {
            return canReuseUpdatedViewHolder(f0Var);
        }

        public void onAnimationFinished(f0 f0Var) {
        }

        public void onAnimationStarted(f0 f0Var) {
        }
    }

    /* loaded from: classes.dex */
    private class n implements m.b {
        n() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.m.b
        public void a(f0 f0Var) {
            f0Var.setIsRecyclable(true);
            if (f0Var.mShadowedHolder != null && f0Var.mShadowingHolder == null) {
                f0Var.mShadowedHolder = null;
            }
            f0Var.mShadowingHolder = null;
            if (!f0Var.shouldBeKeptAsChild() && !RecyclerView.this.removeAnimatingView(f0Var.itemView) && f0Var.isTmpDetached()) {
                RecyclerView.this.removeDetachedView(f0Var.itemView, false);
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class o {
        @Deprecated
        public void getItemOffsets(Rect rect, int i10, RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }

        @Deprecated
        public void onDraw(Canvas canvas, RecyclerView recyclerView) {
        }

        @Deprecated
        public void onDrawOver(Canvas canvas, RecyclerView recyclerView) {
        }

        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, b0 b0Var) {
            getItemOffsets(rect, ((q) view.getLayoutParams()).a(), recyclerView);
        }

        public void onDraw(Canvas canvas, RecyclerView recyclerView, b0 b0Var) {
            onDraw(canvas, recyclerView);
        }

        public void onDrawOver(Canvas canvas, RecyclerView recyclerView, b0 b0Var) {
            onDrawOver(canvas, recyclerView);
        }
    }

    /* loaded from: classes.dex */
    public interface r {
        void a(View view);

        void b(View view);
    }

    /* loaded from: classes.dex */
    public static abstract class s {
        public abstract boolean a(int i10, int i11);
    }

    /* loaded from: classes.dex */
    public interface t {
        boolean onInterceptTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent);

        void onRequestDisallowInterceptTouchEvent(boolean z10);

        void onTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent);
    }

    /* loaded from: classes.dex */
    public static class v {

        /* renamed from: a  reason: collision with root package name */
        SparseArray<a> f6610a = new SparseArray<>();

        /* renamed from: b  reason: collision with root package name */
        int f6611b = 0;

        /* renamed from: c  reason: collision with root package name */
        Set<h<?>> f6612c = Collections.newSetFromMap(new IdentityHashMap());

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public static class a {

            /* renamed from: a  reason: collision with root package name */
            final ArrayList<f0> f6613a = new ArrayList<>();

            /* renamed from: b  reason: collision with root package name */
            int f6614b = 5;

            /* renamed from: c  reason: collision with root package name */
            long f6615c = 0;

            /* renamed from: d  reason: collision with root package name */
            long f6616d = 0;

            a() {
            }
        }

        private a i(int i10) {
            a aVar = this.f6610a.get(i10);
            if (aVar == null) {
                a aVar2 = new a();
                this.f6610a.put(i10, aVar2);
                return aVar2;
            }
            return aVar;
        }

        void a() {
            this.f6611b++;
        }

        void b(h<?> hVar) {
            this.f6612c.add(hVar);
        }

        public void c() {
            for (int i10 = 0; i10 < this.f6610a.size(); i10++) {
                a valueAt = this.f6610a.valueAt(i10);
                Iterator<f0> it = valueAt.f6613a.iterator();
                while (it.hasNext()) {
                    x2.a.b(it.next().itemView);
                }
                valueAt.f6613a.clear();
            }
        }

        void d() {
            this.f6611b--;
        }

        void e(h<?> hVar, boolean z10) {
            this.f6612c.remove(hVar);
            if (this.f6612c.size() == 0 && !z10) {
                for (int i10 = 0; i10 < this.f6610a.size(); i10++) {
                    SparseArray<a> sparseArray = this.f6610a;
                    ArrayList<f0> arrayList = sparseArray.get(sparseArray.keyAt(i10)).f6613a;
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        x2.a.b(arrayList.get(i11).itemView);
                    }
                }
            }
        }

        void f(int i10, long j10) {
            a i11 = i(i10);
            i11.f6616d = l(i11.f6616d, j10);
        }

        void g(int i10, long j10) {
            a i11 = i(i10);
            i11.f6615c = l(i11.f6615c, j10);
        }

        public f0 h(int i10) {
            a aVar = this.f6610a.get(i10);
            if (aVar != null && !aVar.f6613a.isEmpty()) {
                ArrayList<f0> arrayList = aVar.f6613a;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    if (!arrayList.get(size).isAttachedToTransitionOverlay()) {
                        return arrayList.remove(size);
                    }
                }
                return null;
            }
            return null;
        }

        void j(h<?> hVar, h<?> hVar2, boolean z10) {
            if (hVar != null) {
                d();
            }
            if (!z10 && this.f6611b == 0) {
                c();
            }
            if (hVar2 != null) {
                a();
            }
        }

        public void k(f0 f0Var) {
            int itemViewType = f0Var.getItemViewType();
            ArrayList<f0> arrayList = i(itemViewType).f6613a;
            if (this.f6610a.get(itemViewType).f6614b <= arrayList.size()) {
                x2.a.b(f0Var.itemView);
            } else if (RecyclerView.sDebugAssertionsEnabled && arrayList.contains(f0Var)) {
                throw new IllegalArgumentException("this scrap item already exists");
            } else {
                f0Var.resetInternal();
                arrayList.add(f0Var);
            }
        }

        long l(long j10, long j11) {
            if (j10 == 0) {
                return j11;
            }
            return ((j10 / 4) * 3) + (j11 / 4);
        }

        boolean m(int i10, long j10, long j11) {
            long j12 = i(i10).f6616d;
            if (j12 != 0 && j10 + j12 >= j11) {
                return false;
            }
            return true;
        }

        boolean n(int i10, long j10, long j11) {
            long j12 = i(i10).f6615c;
            if (j12 != 0 && j10 + j12 >= j11) {
                return false;
            }
            return true;
        }
    }

    /* loaded from: classes.dex */
    public interface x {
        void a(f0 f0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class y extends j {
        y() {
        }

        void a() {
            if (RecyclerView.POST_UPDATES_ON_ANIMATION) {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.mHasFixedSize && recyclerView.mIsAttached) {
                    p0.m0(recyclerView, recyclerView.mUpdateChildViewsRunnable);
                    return;
                }
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            recyclerView2.mAdapterUpdateDuringMeasure = true;
            recyclerView2.requestLayout();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void onChanged() {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.mState.f6560g = true;
            recyclerView.processDataSetCompletelyChanged(true);
            if (!RecyclerView.this.mAdapterHelper.p()) {
                RecyclerView.this.requestLayout();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void onItemRangeChanged(int i10, int i11, Object obj) {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            if (RecyclerView.this.mAdapterHelper.r(i10, i11, obj)) {
                a();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void onItemRangeInserted(int i10, int i11) {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            if (RecyclerView.this.mAdapterHelper.s(i10, i11)) {
                a();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void onItemRangeMoved(int i10, int i11, int i12) {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            if (RecyclerView.this.mAdapterHelper.t(i10, i11, i12)) {
                a();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void onItemRangeRemoved(int i10, int i11) {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            if (RecyclerView.this.mAdapterHelper.u(i10, i11)) {
                a();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void onStateRestorationPolicyChanged() {
            h hVar;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mPendingSavedState != null && (hVar = recyclerView.mAdapter) != null && hVar.canRestoreState()) {
                RecyclerView.this.requestLayout();
            }
        }
    }

    static {
        boolean z10;
        int i10 = Build.VERSION.SDK_INT;
        FORCE_INVALIDATE_DISPLAY_LIST = false;
        if (i10 >= 23) {
            z10 = true;
        } else {
            z10 = false;
        }
        ALLOW_SIZE_IN_UNSPECIFIED_SPEC = z10;
        POST_UPDATES_ON_ANIMATION = true;
        ALLOW_THREAD_GAP_WORK = true;
        FORCE_ABS_FOCUS_SEARCH_DIRECTION = false;
        IGNORE_DETACHED_FOCUSED_CHILD = false;
        Class<?> cls = Integer.TYPE;
        LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE = new Class[]{Context.class, AttributeSet.class, cls, cls};
        sQuinticInterpolator = new c();
        sDefaultEdgeEffectFactory = new c0();
    }

    public RecyclerView(Context context) {
        this(context, null);
    }

    private void addAnimatingView(f0 f0Var) {
        boolean z10;
        View view = f0Var.itemView;
        if (view.getParent() == this) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.mRecycler.O(getChildViewHolder(view));
        if (f0Var.isTmpDetached()) {
            this.mChildHelper.c(view, -1, view.getLayoutParams(), true);
        } else if (!z10) {
            this.mChildHelper.b(view, true);
        } else {
            this.mChildHelper.k(view);
        }
    }

    private void animateChange(f0 f0Var, f0 f0Var2, m.c cVar, m.c cVar2, boolean z10, boolean z11) {
        f0Var.setIsRecyclable(false);
        if (z10) {
            addAnimatingView(f0Var);
        }
        if (f0Var != f0Var2) {
            if (z11) {
                addAnimatingView(f0Var2);
            }
            f0Var.mShadowedHolder = f0Var2;
            addAnimatingView(f0Var);
            this.mRecycler.O(f0Var);
            f0Var2.setIsRecyclable(false);
            f0Var2.mShadowingHolder = f0Var;
        }
        if (this.mItemAnimator.animateChange(f0Var, f0Var2, cVar, cVar2)) {
            postAnimationRunner();
        }
    }

    private void cancelScroll() {
        resetScroll();
        setScrollState(0);
    }

    static void clearNestedRecyclerViewIfNotNested(f0 f0Var) {
        WeakReference<RecyclerView> weakReference = f0Var.mNestedRecyclerView;
        if (weakReference != null) {
            RecyclerView recyclerView = weakReference.get();
            while (recyclerView != null) {
                if (recyclerView == f0Var.itemView) {
                    return;
                }
                ViewParent parent = recyclerView.getParent();
                if (parent instanceof View) {
                    recyclerView = (View) parent;
                } else {
                    recyclerView = null;
                }
            }
            f0Var.mNestedRecyclerView = null;
        }
    }

    private int consumeFlingInStretch(int i10, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i11) {
        if (i10 > 0 && edgeEffect != null && androidx.core.widget.d.b(edgeEffect) != DECELERATION_RATE) {
            int round = Math.round(((-i11) / FLING_DESTRETCH_FACTOR) * androidx.core.widget.d.d(edgeEffect, ((-i10) * FLING_DESTRETCH_FACTOR) / i11, 0.5f));
            if (round != i10) {
                edgeEffect.finish();
            }
            return i10 - round;
        } else if (i10 < 0 && edgeEffect2 != null && androidx.core.widget.d.b(edgeEffect2) != DECELERATION_RATE) {
            float f10 = i11;
            int round2 = Math.round((f10 / FLING_DESTRETCH_FACTOR) * androidx.core.widget.d.d(edgeEffect2, (i10 * FLING_DESTRETCH_FACTOR) / f10, 0.5f));
            if (round2 != i10) {
                edgeEffect2.finish();
            }
            return i10 - round2;
        } else {
            return i10;
        }
    }

    private void createLayoutManager(Context context, String str, AttributeSet attributeSet, int i10, int i11) {
        ClassLoader classLoader;
        Constructor constructor;
        Object[] objArr;
        if (str != null) {
            String trim = str.trim();
            if (!trim.isEmpty()) {
                String fullClassName = getFullClassName(context, trim);
                try {
                    if (isInEditMode()) {
                        classLoader = getClass().getClassLoader();
                    } else {
                        classLoader = context.getClassLoader();
                    }
                    Class<? extends U> asSubclass = Class.forName(fullClassName, false, classLoader).asSubclass(p.class);
                    try {
                        constructor = asSubclass.getConstructor(LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE);
                        objArr = new Object[]{context, attributeSet, Integer.valueOf(i10), Integer.valueOf(i11)};
                    } catch (NoSuchMethodException e10) {
                        try {
                            constructor = asSubclass.getConstructor(new Class[0]);
                            objArr = null;
                        } catch (NoSuchMethodException e11) {
                            e11.initCause(e10);
                            throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + fullClassName, e11);
                        }
                    }
                    constructor.setAccessible(true);
                    setLayoutManager((p) constructor.newInstance(objArr));
                } catch (ClassCastException e12) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + fullClassName, e12);
                } catch (ClassNotFoundException e13) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + fullClassName, e13);
                } catch (IllegalAccessException e14) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + fullClassName, e14);
                } catch (InstantiationException e15) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + fullClassName, e15);
                } catch (InvocationTargetException e16) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + fullClassName, e16);
                }
            }
        }
    }

    private boolean didChildRangeChange(int i10, int i11) {
        findMinMaxChildLayoutPositions(this.mMinMaxLayoutPositions);
        int[] iArr = this.mMinMaxLayoutPositions;
        if (iArr[0] == i10 && iArr[1] == i11) {
            return false;
        }
        return true;
    }

    private void dispatchContentChangedIfNecessary() {
        int i10 = this.mEatenAccessibilityChangeFlags;
        this.mEatenAccessibilityChangeFlags = 0;
        if (i10 != 0 && isAccessibilityEnabled()) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain();
            obtain.setEventType(m.FLAG_MOVED);
            androidx.core.view.accessibility.b.b(obtain, i10);
            sendAccessibilityEventUnchecked(obtain);
        }
    }

    private void dispatchLayoutStep1() {
        boolean z10 = true;
        this.mState.a(1);
        fillRemainingScrollValues(this.mState);
        this.mState.f6563j = false;
        startInterceptRequestLayout();
        this.mViewInfoStore.f();
        onEnterLayoutOrScroll();
        processAdapterUpdatesAndSetAnimationFlags();
        saveFocusInfo();
        b0 b0Var = this.mState;
        if (!b0Var.f6564k || !this.mItemsChanged) {
            z10 = false;
        }
        b0Var.f6562i = z10;
        this.mItemsChanged = false;
        this.mItemsAddedOrRemoved = false;
        b0Var.f6561h = b0Var.f6565l;
        b0Var.f6559f = this.mAdapter.getItemCount();
        findMinMaxChildLayoutPositions(this.mMinMaxLayoutPositions);
        if (this.mState.f6564k) {
            int g10 = this.mChildHelper.g();
            for (int i10 = 0; i10 < g10; i10++) {
                f0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.f(i10));
                if (!childViewHolderInt.shouldIgnore() && (!childViewHolderInt.isInvalid() || this.mAdapter.hasStableIds())) {
                    this.mViewInfoStore.e(childViewHolderInt, this.mItemAnimator.recordPreLayoutInformation(this.mState, childViewHolderInt, m.buildAdapterChangeFlagsForAnimations(childViewHolderInt), childViewHolderInt.getUnmodifiedPayloads()));
                    if (this.mState.f6562i && childViewHolderInt.isUpdated() && !childViewHolderInt.isRemoved() && !childViewHolderInt.shouldIgnore() && !childViewHolderInt.isInvalid()) {
                        this.mViewInfoStore.c(getChangedHolderKey(childViewHolderInt), childViewHolderInt);
                    }
                }
            }
        }
        if (this.mState.f6565l) {
            saveOldPositions();
            b0 b0Var2 = this.mState;
            boolean z11 = b0Var2.f6560g;
            b0Var2.f6560g = false;
            this.mLayout.g1(this.mRecycler, b0Var2);
            this.mState.f6560g = z11;
            for (int i11 = 0; i11 < this.mChildHelper.g(); i11++) {
                f0 childViewHolderInt2 = getChildViewHolderInt(this.mChildHelper.f(i11));
                if (!childViewHolderInt2.shouldIgnore() && !this.mViewInfoStore.i(childViewHolderInt2)) {
                    int buildAdapterChangeFlagsForAnimations = m.buildAdapterChangeFlagsForAnimations(childViewHolderInt2);
                    boolean hasAnyOfTheFlags = childViewHolderInt2.hasAnyOfTheFlags(8192);
                    if (!hasAnyOfTheFlags) {
                        buildAdapterChangeFlagsForAnimations |= m.FLAG_APPEARED_IN_PRE_LAYOUT;
                    }
                    m.c recordPreLayoutInformation = this.mItemAnimator.recordPreLayoutInformation(this.mState, childViewHolderInt2, buildAdapterChangeFlagsForAnimations, childViewHolderInt2.getUnmodifiedPayloads());
                    if (hasAnyOfTheFlags) {
                        recordAnimationInfoIfBouncedHiddenView(childViewHolderInt2, recordPreLayoutInformation);
                    } else {
                        this.mViewInfoStore.a(childViewHolderInt2, recordPreLayoutInformation);
                    }
                }
            }
            clearOldPositions();
        } else {
            clearOldPositions();
        }
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        this.mState.f6558e = 2;
    }

    private void dispatchLayoutStep2() {
        boolean z10;
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        this.mState.a(6);
        this.mAdapterHelper.j();
        this.mState.f6559f = this.mAdapter.getItemCount();
        this.mState.f6557d = 0;
        if (this.mPendingSavedState != null && this.mAdapter.canRestoreState()) {
            Parcelable parcelable = this.mPendingSavedState.f6536p;
            if (parcelable != null) {
                this.mLayout.l1(parcelable);
            }
            this.mPendingSavedState = null;
        }
        b0 b0Var = this.mState;
        b0Var.f6561h = false;
        this.mLayout.g1(this.mRecycler, b0Var);
        b0 b0Var2 = this.mState;
        b0Var2.f6560g = false;
        if (b0Var2.f6564k && this.mItemAnimator != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        b0Var2.f6564k = z10;
        b0Var2.f6558e = 4;
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
    }

    private void dispatchLayoutStep3() {
        this.mState.a(4);
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        b0 b0Var = this.mState;
        b0Var.f6558e = 1;
        if (b0Var.f6564k) {
            for (int g10 = this.mChildHelper.g() - 1; g10 >= 0; g10--) {
                f0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.f(g10));
                if (!childViewHolderInt.shouldIgnore()) {
                    long changedHolderKey = getChangedHolderKey(childViewHolderInt);
                    m.c recordPostLayoutInformation = this.mItemAnimator.recordPostLayoutInformation(this.mState, childViewHolderInt);
                    f0 g11 = this.mViewInfoStore.g(changedHolderKey);
                    if (g11 != null && !g11.shouldIgnore()) {
                        boolean h10 = this.mViewInfoStore.h(g11);
                        boolean h11 = this.mViewInfoStore.h(childViewHolderInt);
                        if (h10 && g11 == childViewHolderInt) {
                            this.mViewInfoStore.d(childViewHolderInt, recordPostLayoutInformation);
                        } else {
                            m.c n10 = this.mViewInfoStore.n(g11);
                            this.mViewInfoStore.d(childViewHolderInt, recordPostLayoutInformation);
                            m.c m10 = this.mViewInfoStore.m(childViewHolderInt);
                            if (n10 == null) {
                                handleMissingPreInfoForChangeError(changedHolderKey, childViewHolderInt, g11);
                            } else {
                                animateChange(g11, childViewHolderInt, n10, m10, h10, h11);
                            }
                        }
                    } else {
                        this.mViewInfoStore.d(childViewHolderInt, recordPostLayoutInformation);
                    }
                }
            }
            this.mViewInfoStore.o(this.mViewInfoProcessCallback);
        }
        this.mLayout.v1(this.mRecycler);
        b0 b0Var2 = this.mState;
        b0Var2.f6556c = b0Var2.f6559f;
        this.mDataSetHasChangedAfterLayout = false;
        this.mDispatchItemsChangedEvent = false;
        b0Var2.f6564k = false;
        b0Var2.f6565l = false;
        this.mLayout.f6594u = false;
        ArrayList<f0> arrayList = this.mRecycler.f6618b;
        if (arrayList != null) {
            arrayList.clear();
        }
        p pVar = this.mLayout;
        if (pVar.A) {
            pVar.f6599z = 0;
            pVar.A = false;
            this.mRecycler.P();
        }
        this.mLayout.h1(this.mState);
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        this.mViewInfoStore.f();
        int[] iArr = this.mMinMaxLayoutPositions;
        if (didChildRangeChange(iArr[0], iArr[1])) {
            dispatchOnScrolled(0, 0);
        }
        recoverFocusFromState();
        resetFocusInfo();
    }

    private boolean dispatchToOnItemTouchListeners(MotionEvent motionEvent) {
        t tVar = this.mInterceptingOnItemTouchListener;
        if (tVar == null) {
            if (motionEvent.getAction() == 0) {
                return false;
            }
            return findInterceptingOnItemTouchListener(motionEvent);
        }
        tVar.onTouchEvent(this, motionEvent);
        int action = motionEvent.getAction();
        if (action == 3 || action == 1) {
            this.mInterceptingOnItemTouchListener = null;
        }
        return true;
    }

    private boolean findInterceptingOnItemTouchListener(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.mOnItemTouchListeners.size();
        for (int i10 = 0; i10 < size; i10++) {
            t tVar = this.mOnItemTouchListeners.get(i10);
            if (tVar.onInterceptTouchEvent(this, motionEvent) && action != 3) {
                this.mInterceptingOnItemTouchListener = tVar;
                return true;
            }
        }
        return false;
    }

    private void findMinMaxChildLayoutPositions(int[] iArr) {
        int g10 = this.mChildHelper.g();
        if (g10 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i10 = Integer.MAX_VALUE;
        int i11 = UNDEFINED_DURATION;
        for (int i12 = 0; i12 < g10; i12++) {
            f0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.f(i12));
            if (!childViewHolderInt.shouldIgnore()) {
                int layoutPosition = childViewHolderInt.getLayoutPosition();
                if (layoutPosition < i10) {
                    i10 = layoutPosition;
                }
                if (layoutPosition > i11) {
                    i11 = layoutPosition;
                }
            }
        }
        iArr[0] = i10;
        iArr[1] = i11;
    }

    static RecyclerView findNestedRecyclerView(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            RecyclerView findNestedRecyclerView = findNestedRecyclerView(viewGroup.getChildAt(i10));
            if (findNestedRecyclerView != null) {
                return findNestedRecyclerView;
            }
        }
        return null;
    }

    private View findNextViewToFocus() {
        f0 findViewHolderForAdapterPosition;
        b0 b0Var = this.mState;
        int i10 = b0Var.f6566m;
        if (i10 == -1) {
            i10 = 0;
        }
        int b10 = b0Var.b();
        for (int i11 = i10; i11 < b10; i11++) {
            f0 findViewHolderForAdapterPosition2 = findViewHolderForAdapterPosition(i11);
            if (findViewHolderForAdapterPosition2 == null) {
                break;
            } else if (findViewHolderForAdapterPosition2.itemView.hasFocusable()) {
                return findViewHolderForAdapterPosition2.itemView;
            }
        }
        int min = Math.min(b10, i10);
        do {
            min--;
            if (min < 0 || (findViewHolderForAdapterPosition = findViewHolderForAdapterPosition(min)) == null) {
                return null;
            }
        } while (!findViewHolderForAdapterPosition.itemView.hasFocusable());
        return findViewHolderForAdapterPosition.itemView;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static f0 getChildViewHolderInt(View view) {
        if (view == null) {
            return null;
        }
        return ((q) view.getLayoutParams()).f6606f;
    }

    static void getDecoratedBoundsWithMarginsInt(View view, Rect rect) {
        q qVar = (q) view.getLayoutParams();
        Rect rect2 = qVar.f6607m;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) qVar).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) qVar).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) qVar).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin);
    }

    private int getDeepestFocusedViewWithId(View view) {
        int id2 = view.getId();
        while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
            view = ((ViewGroup) view).getFocusedChild();
            if (view.getId() != -1) {
                id2 = view.getId();
            }
        }
        return id2;
    }

    private String getFullClassName(Context context, String str) {
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        } else if (str.contains(".")) {
            return str;
        } else {
            return RecyclerView.class.getPackage().getName() + '.' + str;
        }
    }

    private androidx.core.view.d0 getScrollingChildHelper() {
        if (this.mScrollingChildHelper == null) {
            this.mScrollingChildHelper = new androidx.core.view.d0(this);
        }
        return this.mScrollingChildHelper;
    }

    private float getSplineFlingDistance(int i10) {
        double log = Math.log((Math.abs(i10) * INFLEXION) / (this.mPhysicalCoef * SCROLL_FRICTION));
        float f10 = DECELERATION_RATE;
        return (float) (this.mPhysicalCoef * SCROLL_FRICTION * Math.exp((f10 / (f10 - 1.0d)) * log));
    }

    private void handleMissingPreInfoForChangeError(long j10, f0 f0Var, f0 f0Var2) {
        int g10 = this.mChildHelper.g();
        for (int i10 = 0; i10 < g10; i10++) {
            f0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.f(i10));
            if (childViewHolderInt != f0Var && getChangedHolderKey(childViewHolderInt) == j10) {
                h hVar = this.mAdapter;
                if (hVar != null && hVar.hasStableIds()) {
                    throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + childViewHolderInt + " \n View Holder 2:" + f0Var + exceptionLabel());
                }
                throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + childViewHolderInt + " \n View Holder 2:" + f0Var + exceptionLabel());
            }
        }
        Log.e(TAG, "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + f0Var2 + " cannot be found but it is necessary for " + f0Var + exceptionLabel());
    }

    private boolean hasUpdatedView() {
        int g10 = this.mChildHelper.g();
        for (int i10 = 0; i10 < g10; i10++) {
            f0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.f(i10));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && childViewHolderInt.isUpdated()) {
                return true;
            }
        }
        return false;
    }

    @SuppressLint({"InlinedApi"})
    private void initAutofill() {
        if (p0.D(this) == 0) {
            p0.H0(this, 8);
        }
    }

    private void initChildrenHelper() {
        this.mChildHelper = new androidx.recyclerview.widget.e(new e());
    }

    private boolean isPreferredNextFocus(View view, View view2, int i10) {
        int i11;
        int i12;
        if (view2 == null || view2 == this || view2 == view || findContainingItemView(view2) == null) {
            return false;
        }
        if (view == null || findContainingItemView(view) == null) {
            return true;
        }
        this.mTempRect.set(0, 0, view.getWidth(), view.getHeight());
        this.mTempRect2.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.mTempRect);
        offsetDescendantRectToMyCoords(view2, this.mTempRect2);
        char c10 = 65535;
        if (this.mLayout.l0() == 1) {
            i11 = -1;
        } else {
            i11 = 1;
        }
        Rect rect = this.mTempRect;
        int i13 = rect.left;
        Rect rect2 = this.mTempRect2;
        int i14 = rect2.left;
        if ((i13 < i14 || rect.right <= i14) && rect.right < rect2.right) {
            i12 = 1;
        } else {
            int i15 = rect.right;
            int i16 = rect2.right;
            if ((i15 > i16 || i13 >= i16) && i13 > i14) {
                i12 = -1;
            } else {
                i12 = 0;
            }
        }
        int i17 = rect.top;
        int i18 = rect2.top;
        if ((i17 < i18 || rect.bottom <= i18) && rect.bottom < rect2.bottom) {
            c10 = 1;
        } else {
            int i19 = rect.bottom;
            int i20 = rect2.bottom;
            if ((i19 <= i20 && i17 < i20) || i17 <= i18) {
                c10 = 0;
            }
        }
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 17) {
                    if (i10 != 33) {
                        if (i10 != 66) {
                            if (i10 == 130) {
                                if (c10 <= 0) {
                                    return false;
                                }
                                return true;
                            }
                            throw new IllegalArgumentException("Invalid direction: " + i10 + exceptionLabel());
                        } else if (i12 <= 0) {
                            return false;
                        } else {
                            return true;
                        }
                    } else if (c10 >= 0) {
                        return false;
                    } else {
                        return true;
                    }
                } else if (i12 >= 0) {
                    return false;
                } else {
                    return true;
                }
            } else if (c10 <= 0 && (c10 != 0 || i12 * i11 <= 0)) {
                return false;
            } else {
                return true;
            }
        } else if (c10 >= 0 && (c10 != 0 || i12 * i11 >= 0)) {
            return false;
        } else {
            return true;
        }
    }

    private void nestedScrollByInternal(int i10, int i11, MotionEvent motionEvent, int i12) {
        int i13;
        float y10;
        float x10;
        int i14;
        int i15;
        int i16;
        p pVar = this.mLayout;
        if (pVar == null) {
            Log.e(TAG, "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (this.mLayoutSuppressed) {
        } else {
            int[] iArr = this.mReusableIntPair;
            int i17 = 0;
            iArr[0] = 0;
            iArr[1] = 0;
            boolean w10 = pVar.w();
            boolean x11 = this.mLayout.x();
            if (x11) {
                i13 = w10 | 2;
            } else {
                i13 = w10;
            }
            if (motionEvent == null) {
                y10 = getHeight() / 2.0f;
            } else {
                y10 = motionEvent.getY();
            }
            if (motionEvent == null) {
                x10 = getWidth() / 2.0f;
            } else {
                x10 = motionEvent.getX();
            }
            int releaseHorizontalGlow = i10 - releaseHorizontalGlow(i10, y10);
            int releaseVerticalGlow = i11 - releaseVerticalGlow(i11, x10);
            startNestedScroll(i13, i12);
            if (w10 != 0) {
                i14 = releaseHorizontalGlow;
            } else {
                i14 = 0;
            }
            if (x11) {
                i15 = releaseVerticalGlow;
            } else {
                i15 = 0;
            }
            if (dispatchNestedPreScroll(i14, i15, this.mReusableIntPair, this.mScrollOffset, i12)) {
                int[] iArr2 = this.mReusableIntPair;
                releaseHorizontalGlow -= iArr2[0];
                releaseVerticalGlow -= iArr2[1];
            }
            if (w10 != 0) {
                i16 = releaseHorizontalGlow;
            } else {
                i16 = 0;
            }
            if (x11) {
                i17 = releaseVerticalGlow;
            }
            scrollByInternal(i16, i17, motionEvent, i12);
            androidx.recyclerview.widget.l lVar = this.mGapWorker;
            if (lVar != null && (releaseHorizontalGlow != 0 || releaseVerticalGlow != 0)) {
                lVar.f(this, releaseHorizontalGlow, releaseVerticalGlow);
            }
            stopNestedScroll(i12);
        }
    }

    private void onPointerUp(MotionEvent motionEvent) {
        int i10;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.mScrollPointerId) {
            if (actionIndex == 0) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            this.mScrollPointerId = motionEvent.getPointerId(i10);
            int x10 = (int) (motionEvent.getX(i10) + 0.5f);
            this.mLastTouchX = x10;
            this.mInitialTouchX = x10;
            int y10 = (int) (motionEvent.getY(i10) + 0.5f);
            this.mLastTouchY = y10;
            this.mInitialTouchY = y10;
        }
    }

    private boolean predictiveItemAnimationsEnabled() {
        if (this.mItemAnimator != null && this.mLayout.V1()) {
            return true;
        }
        return false;
    }

    private void processAdapterUpdatesAndSetAnimationFlags() {
        boolean z10;
        boolean z11;
        boolean z12;
        if (this.mDataSetHasChangedAfterLayout) {
            this.mAdapterHelper.y();
            if (this.mDispatchItemsChangedEvent) {
                this.mLayout.b1(this);
            }
        }
        if (predictiveItemAnimationsEnabled()) {
            this.mAdapterHelper.w();
        } else {
            this.mAdapterHelper.j();
        }
        boolean z13 = false;
        if (!this.mItemsAddedOrRemoved && !this.mItemsChanged) {
            z10 = false;
        } else {
            z10 = true;
        }
        b0 b0Var = this.mState;
        if (this.mFirstLayoutComplete && this.mItemAnimator != null && (((z12 = this.mDataSetHasChangedAfterLayout) || z10 || this.mLayout.f6594u) && (!z12 || this.mAdapter.hasStableIds()))) {
            z11 = true;
        } else {
            z11 = false;
        }
        b0Var.f6564k = z11;
        b0 b0Var2 = this.mState;
        if (b0Var2.f6564k && z10 && !this.mDataSetHasChangedAfterLayout && predictiveItemAnimationsEnabled()) {
            z13 = true;
        }
        b0Var2.f6565l = z13;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void pullGlows(float r7, float r8, float r9, float r10) {
        /*
            r6 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            r1 = 1
            r2 = 0
            int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r3 >= 0) goto L21
            r6.ensureLeftGlow()
            android.widget.EdgeEffect r3 = r6.mLeftGlow
            float r4 = -r8
            int r5 = r6.getWidth()
            float r5 = (float) r5
            float r4 = r4 / r5
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            float r9 = r0 - r9
            androidx.core.widget.d.d(r3, r4, r9)
        L1f:
            r9 = 1
            goto L3c
        L21:
            int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r3 <= 0) goto L3b
            r6.ensureRightGlow()
            android.widget.EdgeEffect r3 = r6.mRightGlow
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r4 = r8 / r4
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            androidx.core.widget.d.d(r3, r4, r9)
            goto L1f
        L3b:
            r9 = 0
        L3c:
            int r3 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r3 >= 0) goto L56
            r6.ensureTopGlow()
            android.widget.EdgeEffect r9 = r6.mTopGlow
            float r0 = -r10
            int r3 = r6.getHeight()
            float r3 = (float) r3
            float r0 = r0 / r3
            int r3 = r6.getWidth()
            float r3 = (float) r3
            float r7 = r7 / r3
            androidx.core.widget.d.d(r9, r0, r7)
            goto L72
        L56:
            int r3 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r3 <= 0) goto L71
            r6.ensureBottomGlow()
            android.widget.EdgeEffect r9 = r6.mBottomGlow
            int r3 = r6.getHeight()
            float r3 = (float) r3
            float r3 = r10 / r3
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r7 = r7 / r4
            float r0 = r0 - r7
            androidx.core.widget.d.d(r9, r3, r0)
            goto L72
        L71:
            r1 = r9
        L72:
            if (r1 != 0) goto L7c
            int r7 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r7 != 0) goto L7c
            int r7 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r7 == 0) goto L7f
        L7c:
            androidx.core.view.p0.l0(r6)
        L7f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.pullGlows(float, float, float, float):void");
    }

    private void recoverFocusFromState() {
        f0 f0Var;
        View findViewById;
        if (this.mPreserveFocusAfterLayout && this.mAdapter != null && hasFocus() && getDescendantFocusability() != 393216) {
            if (getDescendantFocusability() != 131072 || !isFocused()) {
                if (!isFocused()) {
                    View focusedChild = getFocusedChild();
                    if (IGNORE_DETACHED_FOCUSED_CHILD && (focusedChild.getParent() == null || !focusedChild.hasFocus())) {
                        if (this.mChildHelper.g() == 0) {
                            requestFocus();
                            return;
                        }
                    } else if (!this.mChildHelper.n(focusedChild)) {
                        return;
                    }
                }
                View view = null;
                if (this.mState.f6567n != -1 && this.mAdapter.hasStableIds()) {
                    f0Var = findViewHolderForItemId(this.mState.f6567n);
                } else {
                    f0Var = null;
                }
                if (f0Var != null && !this.mChildHelper.n(f0Var.itemView) && f0Var.itemView.hasFocusable()) {
                    view = f0Var.itemView;
                } else if (this.mChildHelper.g() > 0) {
                    view = findNextViewToFocus();
                }
                if (view != null) {
                    int i10 = this.mState.f6568o;
                    if (i10 != -1 && (findViewById = view.findViewById(i10)) != null && findViewById.isFocusable()) {
                        view = findViewById;
                    }
                    view.requestFocus();
                }
            }
        }
    }

    private void releaseGlows() {
        boolean z10;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z10 = this.mLeftGlow.isFinished();
        } else {
            z10 = false;
        }
        EdgeEffect edgeEffect2 = this.mTopGlow;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z10 |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mRightGlow;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z10 |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z10 |= this.mBottomGlow.isFinished();
        }
        if (z10) {
            p0.l0(this);
        }
    }

    private int releaseHorizontalGlow(int i10, float f10) {
        float height = f10 / getHeight();
        float width = i10 / getWidth();
        EdgeEffect edgeEffect = this.mLeftGlow;
        float f11 = DECELERATION_RATE;
        if (edgeEffect != null && androidx.core.widget.d.b(edgeEffect) != DECELERATION_RATE) {
            if (canScrollHorizontally(-1)) {
                this.mLeftGlow.onRelease();
            } else {
                float f12 = -androidx.core.widget.d.d(this.mLeftGlow, -width, 1.0f - height);
                if (androidx.core.widget.d.b(this.mLeftGlow) == DECELERATION_RATE) {
                    this.mLeftGlow.onRelease();
                }
                f11 = f12;
            }
            invalidate();
        } else {
            EdgeEffect edgeEffect2 = this.mRightGlow;
            if (edgeEffect2 != null && androidx.core.widget.d.b(edgeEffect2) != DECELERATION_RATE) {
                if (canScrollHorizontally(1)) {
                    this.mRightGlow.onRelease();
                } else {
                    float d10 = androidx.core.widget.d.d(this.mRightGlow, width, height);
                    if (androidx.core.widget.d.b(this.mRightGlow) == DECELERATION_RATE) {
                        this.mRightGlow.onRelease();
                    }
                    f11 = d10;
                }
                invalidate();
            }
        }
        return Math.round(f11 * getWidth());
    }

    private int releaseVerticalGlow(int i10, float f10) {
        float width = f10 / getWidth();
        float height = i10 / getHeight();
        EdgeEffect edgeEffect = this.mTopGlow;
        float f11 = DECELERATION_RATE;
        if (edgeEffect != null && androidx.core.widget.d.b(edgeEffect) != DECELERATION_RATE) {
            if (canScrollVertically(-1)) {
                this.mTopGlow.onRelease();
            } else {
                float f12 = -androidx.core.widget.d.d(this.mTopGlow, -height, width);
                if (androidx.core.widget.d.b(this.mTopGlow) == DECELERATION_RATE) {
                    this.mTopGlow.onRelease();
                }
                f11 = f12;
            }
            invalidate();
        } else {
            EdgeEffect edgeEffect2 = this.mBottomGlow;
            if (edgeEffect2 != null && androidx.core.widget.d.b(edgeEffect2) != DECELERATION_RATE) {
                if (canScrollVertically(1)) {
                    this.mBottomGlow.onRelease();
                } else {
                    float d10 = androidx.core.widget.d.d(this.mBottomGlow, height, 1.0f - width);
                    if (androidx.core.widget.d.b(this.mBottomGlow) == DECELERATION_RATE) {
                        this.mBottomGlow.onRelease();
                    }
                    f11 = d10;
                }
                invalidate();
            }
        }
        return Math.round(f11 * getHeight());
    }

    private void requestChildOnScreen(View view, View view2) {
        View view3;
        boolean z10;
        if (view2 != null) {
            view3 = view2;
        } else {
            view3 = view;
        }
        this.mTempRect.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof q) {
            q qVar = (q) layoutParams;
            if (!qVar.f6608p) {
                Rect rect = qVar.f6607m;
                Rect rect2 = this.mTempRect;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.mTempRect);
            offsetRectIntoDescendantCoords(view, this.mTempRect);
        }
        p pVar = this.mLayout;
        Rect rect3 = this.mTempRect;
        boolean z11 = !this.mFirstLayoutComplete;
        if (view2 == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        pVar.C1(this, view, rect3, z11, z10);
    }

    private void resetFocusInfo() {
        b0 b0Var = this.mState;
        b0Var.f6567n = -1L;
        b0Var.f6566m = -1;
        b0Var.f6568o = -1;
    }

    private void resetScroll() {
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        stopNestedScroll(0);
        releaseGlows();
    }

    private void saveFocusInfo() {
        View view;
        long j10;
        int absoluteAdapterPosition;
        f0 f0Var = null;
        if (this.mPreserveFocusAfterLayout && hasFocus() && this.mAdapter != null) {
            view = getFocusedChild();
        } else {
            view = null;
        }
        if (view != null) {
            f0Var = findContainingViewHolder(view);
        }
        if (f0Var == null) {
            resetFocusInfo();
            return;
        }
        b0 b0Var = this.mState;
        if (this.mAdapter.hasStableIds()) {
            j10 = f0Var.getItemId();
        } else {
            j10 = -1;
        }
        b0Var.f6567n = j10;
        b0 b0Var2 = this.mState;
        if (this.mDataSetHasChangedAfterLayout) {
            absoluteAdapterPosition = -1;
        } else if (f0Var.isRemoved()) {
            absoluteAdapterPosition = f0Var.mOldPosition;
        } else {
            absoluteAdapterPosition = f0Var.getAbsoluteAdapterPosition();
        }
        b0Var2.f6566m = absoluteAdapterPosition;
        this.mState.f6568o = getDeepestFocusedViewWithId(f0Var.itemView);
    }

    private void setAdapterInternal(h<?> hVar, boolean z10, boolean z11) {
        h hVar2 = this.mAdapter;
        if (hVar2 != null) {
            hVar2.unregisterAdapterDataObserver(this.mObserver);
            this.mAdapter.onDetachedFromRecyclerView(this);
        }
        if (!z10 || z11) {
            removeAndRecycleViews();
        }
        this.mAdapterHelper.y();
        h<?> hVar3 = this.mAdapter;
        this.mAdapter = hVar;
        if (hVar != null) {
            hVar.registerAdapterDataObserver(this.mObserver);
            hVar.onAttachedToRecyclerView(this);
        }
        p pVar = this.mLayout;
        if (pVar != null) {
            pVar.N0(hVar3, this.mAdapter);
        }
        this.mRecycler.y(hVar3, this.mAdapter, z10);
        this.mState.f6560g = true;
    }

    public static void setDebugAssertionsEnabled(boolean z10) {
        sDebugAssertionsEnabled = z10;
    }

    public static void setVerboseLoggingEnabled(boolean z10) {
        sVerboseLoggingEnabled = z10;
    }

    private boolean shouldAbsorb(EdgeEffect edgeEffect, int i10, int i11) {
        if (i10 > 0) {
            return true;
        }
        if (getSplineFlingDistance(-i10) < androidx.core.widget.d.b(edgeEffect) * i11) {
            return true;
        }
        return false;
    }

    private boolean stopGlowAnimations(MotionEvent motionEvent) {
        boolean z10;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect != null && androidx.core.widget.d.b(edgeEffect) != DECELERATION_RATE && !canScrollHorizontally(-1)) {
            androidx.core.widget.d.d(this.mLeftGlow, DECELERATION_RATE, 1.0f - (motionEvent.getY() / getHeight()));
            z10 = true;
        } else {
            z10 = false;
        }
        EdgeEffect edgeEffect2 = this.mRightGlow;
        if (edgeEffect2 != null && androidx.core.widget.d.b(edgeEffect2) != DECELERATION_RATE && !canScrollHorizontally(1)) {
            androidx.core.widget.d.d(this.mRightGlow, DECELERATION_RATE, motionEvent.getY() / getHeight());
            z10 = true;
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && androidx.core.widget.d.b(edgeEffect3) != DECELERATION_RATE && !canScrollVertically(-1)) {
            androidx.core.widget.d.d(this.mTopGlow, DECELERATION_RATE, motionEvent.getX() / getWidth());
            z10 = true;
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null && androidx.core.widget.d.b(edgeEffect4) != DECELERATION_RATE && !canScrollVertically(1)) {
            androidx.core.widget.d.d(this.mBottomGlow, DECELERATION_RATE, 1.0f - (motionEvent.getX() / getWidth()));
            return true;
        }
        return z10;
    }

    private void stopScrollersInternal() {
        this.mViewFlinger.f();
        p pVar = this.mLayout;
        if (pVar != null) {
            pVar.U1();
        }
    }

    void absorbGlows(int i10, int i11) {
        if (i10 < 0) {
            ensureLeftGlow();
            if (this.mLeftGlow.isFinished()) {
                this.mLeftGlow.onAbsorb(-i10);
            }
        } else if (i10 > 0) {
            ensureRightGlow();
            if (this.mRightGlow.isFinished()) {
                this.mRightGlow.onAbsorb(i10);
            }
        }
        if (i11 < 0) {
            ensureTopGlow();
            if (this.mTopGlow.isFinished()) {
                this.mTopGlow.onAbsorb(-i11);
            }
        } else if (i11 > 0) {
            ensureBottomGlow();
            if (this.mBottomGlow.isFinished()) {
                this.mBottomGlow.onAbsorb(i11);
            }
        }
        if (i10 != 0 || i11 != 0) {
            p0.l0(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i10, int i11) {
        p pVar = this.mLayout;
        if (pVar == null || !pVar.O0(this, arrayList, i10, i11)) {
            super.addFocusables(arrayList, i10, i11);
        }
    }

    public void addItemDecoration(o oVar, int i10) {
        p pVar = this.mLayout;
        if (pVar != null) {
            pVar.s("Cannot add item decoration during a scroll  or layout");
        }
        if (this.mItemDecorations.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i10 < 0) {
            this.mItemDecorations.add(oVar);
        } else {
            this.mItemDecorations.add(i10, oVar);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void addOnChildAttachStateChangeListener(r rVar) {
        if (this.mOnChildAttachStateListeners == null) {
            this.mOnChildAttachStateListeners = new ArrayList();
        }
        this.mOnChildAttachStateListeners.add(rVar);
    }

    public void addOnItemTouchListener(t tVar) {
        this.mOnItemTouchListeners.add(tVar);
    }

    public void addOnScrollListener(u uVar) {
        if (this.mScrollListeners == null) {
            this.mScrollListeners = new ArrayList();
        }
        this.mScrollListeners.add(uVar);
    }

    public void addRecyclerListener(x xVar) {
        boolean z10;
        if (xVar != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        androidx.core.util.i.b(z10, "'listener' arg cannot be null.");
        this.mRecyclerListeners.add(xVar);
    }

    void animateAppearance(f0 f0Var, m.c cVar, m.c cVar2) {
        f0Var.setIsRecyclable(false);
        if (this.mItemAnimator.animateAppearance(f0Var, cVar, cVar2)) {
            postAnimationRunner();
        }
    }

    void animateDisappearance(f0 f0Var, m.c cVar, m.c cVar2) {
        addAnimatingView(f0Var);
        f0Var.setIsRecyclable(false);
        if (this.mItemAnimator.animateDisappearance(f0Var, cVar, cVar2)) {
            postAnimationRunner();
        }
    }

    void assertInLayoutOrScroll(String str) {
        if (!isComputingLayout()) {
            if (str == null) {
                throw new IllegalStateException("Cannot call this method unless RecyclerView is computing a layout or scrolling" + exceptionLabel());
            }
            throw new IllegalStateException(str + exceptionLabel());
        }
    }

    void assertNotInLayoutOrScroll(String str) {
        if (isComputingLayout()) {
            if (str == null) {
                throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + exceptionLabel());
            }
            throw new IllegalStateException(str);
        } else if (this.mDispatchScrollCounter > 0) {
            Log.w(TAG, "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + exceptionLabel()));
        }
    }

    boolean canReuseUpdatedViewHolder(f0 f0Var) {
        m mVar = this.mItemAnimator;
        if (mVar != null && !mVar.canReuseUpdatedViewHolder(f0Var, f0Var.getUnmodifiedPayloads())) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if ((layoutParams instanceof q) && this.mLayout.y((q) layoutParams)) {
            return true;
        }
        return false;
    }

    void clearOldPositions() {
        int j10 = this.mChildHelper.j();
        for (int i10 = 0; i10 < j10; i10++) {
            f0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.i(i10));
            if (!childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.clearOldPosition();
            }
        }
        this.mRecycler.d();
    }

    public void clearOnChildAttachStateChangeListeners() {
        List<r> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            list.clear();
        }
    }

    public void clearOnScrollListeners() {
        List<u> list = this.mScrollListeners;
        if (list != null) {
            list.clear();
        }
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        p pVar = this.mLayout;
        if (pVar == null || !pVar.w()) {
            return 0;
        }
        return this.mLayout.C(this.mState);
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        p pVar = this.mLayout;
        if (pVar == null || !pVar.w()) {
            return 0;
        }
        return this.mLayout.D(this.mState);
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        p pVar = this.mLayout;
        if (pVar == null || !pVar.w()) {
            return 0;
        }
        return this.mLayout.E(this.mState);
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        p pVar = this.mLayout;
        if (pVar == null || !pVar.x()) {
            return 0;
        }
        return this.mLayout.F(this.mState);
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        p pVar = this.mLayout;
        if (pVar == null || !pVar.x()) {
            return 0;
        }
        return this.mLayout.G(this.mState);
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        p pVar = this.mLayout;
        if (pVar == null || !pVar.x()) {
            return 0;
        }
        return this.mLayout.H(this.mState);
    }

    void considerReleasingGlowsOnScroll(int i10, int i11) {
        boolean z10;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect != null && !edgeEffect.isFinished() && i10 > 0) {
            this.mLeftGlow.onRelease();
            z10 = this.mLeftGlow.isFinished();
        } else {
            z10 = false;
        }
        EdgeEffect edgeEffect2 = this.mRightGlow;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i10 < 0) {
            this.mRightGlow.onRelease();
            z10 |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i11 > 0) {
            this.mTopGlow.onRelease();
            z10 |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i11 < 0) {
            this.mBottomGlow.onRelease();
            z10 |= this.mBottomGlow.isFinished();
        }
        if (z10) {
            p0.l0(this);
        }
    }

    int consumeFlingInHorizontalStretch(int i10) {
        return consumeFlingInStretch(i10, this.mLeftGlow, this.mRightGlow, getWidth());
    }

    int consumeFlingInVerticalStretch(int i10) {
        return consumeFlingInStretch(i10, this.mTopGlow, this.mBottomGlow, getHeight());
    }

    void consumePendingUpdateOperations() {
        if (this.mFirstLayoutComplete && !this.mDataSetHasChangedAfterLayout) {
            if (!this.mAdapterHelper.p()) {
                return;
            }
            if (this.mAdapterHelper.o(4) && !this.mAdapterHelper.o(11)) {
                androidx.core.os.t.a(TRACE_HANDLE_ADAPTER_UPDATES_TAG);
                startInterceptRequestLayout();
                onEnterLayoutOrScroll();
                this.mAdapterHelper.w();
                if (!this.mLayoutWasDefered) {
                    if (hasUpdatedView()) {
                        dispatchLayout();
                    } else {
                        this.mAdapterHelper.i();
                    }
                }
                stopInterceptRequestLayout(true);
                onExitLayoutOrScroll();
                androidx.core.os.t.b();
                return;
            } else if (this.mAdapterHelper.p()) {
                androidx.core.os.t.a(TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG);
                dispatchLayout();
                androidx.core.os.t.b();
                return;
            } else {
                return;
            }
        }
        androidx.core.os.t.a(TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG);
        dispatchLayout();
        androidx.core.os.t.b();
    }

    void defaultOnMeasure(int i10, int i11) {
        setMeasuredDimension(p.z(i10, getPaddingLeft() + getPaddingRight(), p0.G(this)), p.z(i11, getPaddingTop() + getPaddingBottom(), p0.F(this)));
    }

    void dispatchChildAttached(View view) {
        f0 childViewHolderInt = getChildViewHolderInt(view);
        onChildAttachedToWindow(view);
        h hVar = this.mAdapter;
        if (hVar != null && childViewHolderInt != null) {
            hVar.onViewAttachedToWindow(childViewHolderInt);
        }
        List<r> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mOnChildAttachStateListeners.get(size).b(view);
            }
        }
    }

    void dispatchChildDetached(View view) {
        f0 childViewHolderInt = getChildViewHolderInt(view);
        onChildDetachedFromWindow(view);
        h hVar = this.mAdapter;
        if (hVar != null && childViewHolderInt != null) {
            hVar.onViewDetachedFromWindow(childViewHolderInt);
        }
        List<r> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mOnChildAttachStateListeners.get(size).a(view);
            }
        }
    }

    void dispatchLayout() {
        boolean z10;
        if (this.mAdapter == null) {
            Log.w(TAG, "No adapter attached; skipping layout");
        } else if (this.mLayout == null) {
            Log.e(TAG, "No layout manager attached; skipping layout");
        } else {
            this.mState.f6563j = false;
            if (this.mLastAutoMeasureSkippedDueToExact && (this.mLastAutoMeasureNonExactMeasuredWidth != getWidth() || this.mLastAutoMeasureNonExactMeasuredHeight != getHeight())) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.mLastAutoMeasureNonExactMeasuredWidth = 0;
            this.mLastAutoMeasureNonExactMeasuredHeight = 0;
            this.mLastAutoMeasureSkippedDueToExact = false;
            if (this.mState.f6558e == 1) {
                dispatchLayoutStep1();
                this.mLayout.J1(this);
                dispatchLayoutStep2();
            } else if (!this.mAdapterHelper.q() && !z10 && this.mLayout.w0() == getWidth() && this.mLayout.i0() == getHeight()) {
                this.mLayout.J1(this);
            } else {
                this.mLayout.J1(this);
                dispatchLayoutStep2();
            }
            dispatchLayoutStep3();
        }
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f10, float f11, boolean z10) {
        return getScrollingChildHelper().a(f10, f11, z10);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f10, float f11) {
        return getScrollingChildHelper().b(f10, f11);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i10, i11, iArr, iArr2);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return getScrollingChildHelper().f(i10, i11, i12, i13, iArr);
    }

    void dispatchOnScrollStateChanged(int i10) {
        p pVar = this.mLayout;
        if (pVar != null) {
            pVar.n1(i10);
        }
        onScrollStateChanged(i10);
        u uVar = this.mScrollListener;
        if (uVar != null) {
            uVar.onScrollStateChanged(this, i10);
        }
        List<u> list = this.mScrollListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mScrollListeners.get(size).onScrollStateChanged(this, i10);
            }
        }
    }

    void dispatchOnScrolled(int i10, int i11) {
        this.mDispatchScrollCounter++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i10, scrollY - i11);
        onScrolled(i10, i11);
        u uVar = this.mScrollListener;
        if (uVar != null) {
            uVar.onScrolled(this, i10, i11);
        }
        List<u> list = this.mScrollListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mScrollListeners.get(size).onScrolled(this, i10, i11);
            }
        }
        this.mDispatchScrollCounter--;
    }

    void dispatchPendingImportantForAccessibilityChanges() {
        int i10;
        for (int size = this.mPendingAccessibilityImportanceChange.size() - 1; size >= 0; size--) {
            f0 f0Var = this.mPendingAccessibilityImportanceChange.get(size);
            if (f0Var.itemView.getParent() == this && !f0Var.shouldIgnore() && (i10 = f0Var.mPendingAccessibilityState) != -1) {
                p0.F0(f0Var.itemView, i10);
                f0Var.mPendingAccessibilityState = -1;
            }
        }
        this.mPendingAccessibilityImportanceChange.clear();
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z10;
        int i10;
        boolean z11;
        boolean z12;
        int i11;
        super.draw(canvas);
        int size = this.mItemDecorations.size();
        boolean z13 = false;
        for (int i12 = 0; i12 < size; i12++) {
            this.mItemDecorations.get(i12).onDrawOver(canvas, this, this.mState);
        }
        EdgeEffect edgeEffect = this.mLeftGlow;
        boolean z14 = true;
        if (edgeEffect != null && !edgeEffect.isFinished()) {
            int save = canvas.save();
            if (this.mClipToPadding) {
                i11 = getPaddingBottom();
            } else {
                i11 = 0;
            }
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + i11, DECELERATION_RATE);
            EdgeEffect edgeEffect2 = this.mLeftGlow;
            if (edgeEffect2 != null && edgeEffect2.draw(canvas)) {
                z10 = true;
            } else {
                z10 = false;
            }
            canvas.restoreToCount(save);
        } else {
            z10 = false;
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.mClipToPadding) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.mTopGlow;
            if (edgeEffect4 != null && edgeEffect4.draw(canvas)) {
                z12 = true;
            } else {
                z12 = false;
            }
            z10 |= z12;
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.mRightGlow;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            if (this.mClipToPadding) {
                i10 = getPaddingTop();
            } else {
                i10 = 0;
            }
            canvas.rotate(90.0f);
            canvas.translate(i10, -width);
            EdgeEffect edgeEffect6 = this.mRightGlow;
            if (edgeEffect6 != null && edgeEffect6.draw(canvas)) {
                z11 = true;
            } else {
                z11 = false;
            }
            z10 |= z11;
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.mBottomGlow;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.mClipToPadding) {
                canvas.translate((-getWidth()) + getPaddingRight(), (-getHeight()) + getPaddingBottom());
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.mBottomGlow;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z13 = true;
            }
            z10 |= z13;
            canvas.restoreToCount(save4);
        }
        if (z10 || this.mItemAnimator == null || this.mItemDecorations.size() <= 0 || !this.mItemAnimator.isRunning()) {
            z14 = z10;
        }
        if (z14) {
            p0.l0(this);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        return super.drawChild(canvas, view, j10);
    }

    void ensureBottomGlow() {
        if (this.mBottomGlow != null) {
            return;
        }
        EdgeEffect a10 = this.mEdgeEffectFactory.a(this, 3);
        this.mBottomGlow = a10;
        if (this.mClipToPadding) {
            a10.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            a10.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    void ensureLeftGlow() {
        if (this.mLeftGlow != null) {
            return;
        }
        EdgeEffect a10 = this.mEdgeEffectFactory.a(this, 0);
        this.mLeftGlow = a10;
        if (this.mClipToPadding) {
            a10.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            a10.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    void ensureRightGlow() {
        if (this.mRightGlow != null) {
            return;
        }
        EdgeEffect a10 = this.mEdgeEffectFactory.a(this, 2);
        this.mRightGlow = a10;
        if (this.mClipToPadding) {
            a10.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            a10.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    void ensureTopGlow() {
        if (this.mTopGlow != null) {
            return;
        }
        EdgeEffect a10 = this.mEdgeEffectFactory.a(this, 1);
        this.mTopGlow = a10;
        if (this.mClipToPadding) {
            a10.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            a10.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    String exceptionLabel() {
        return " " + super.toString() + ", adapter:" + this.mAdapter + ", layout:" + this.mLayout + ", context:" + getContext();
    }

    final void fillRemainingScrollValues(b0 b0Var) {
        if (getScrollState() == 2) {
            OverScroller overScroller = this.mViewFlinger.f6575p;
            b0Var.f6569p = overScroller.getFinalX() - overScroller.getCurrX();
            b0Var.f6570q = overScroller.getFinalY() - overScroller.getCurrY();
            return;
        }
        b0Var.f6569p = 0;
        b0Var.f6570q = 0;
    }

    public View findChildViewUnder(float f10, float f11) {
        for (int g10 = this.mChildHelper.g() - 1; g10 >= 0; g10--) {
            View f12 = this.mChildHelper.f(g10);
            float translationX = f12.getTranslationX();
            float translationY = f12.getTranslationY();
            if (f10 >= f12.getLeft() + translationX && f10 <= f12.getRight() + translationX && f11 >= f12.getTop() + translationY && f11 <= f12.getBottom() + translationY) {
                return f12;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:?, code lost:
    
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View findContainingItemView(android.view.View r3) {
        /*
            r2 = this;
            android.view.ViewParent r0 = r3.getParent()
        L4:
            if (r0 == 0) goto L14
            if (r0 == r2) goto L14
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L14
            r3 = r0
            android.view.View r3 = (android.view.View) r3
            android.view.ViewParent r0 = r3.getParent()
            goto L4
        L14:
            if (r0 != r2) goto L17
            goto L18
        L17:
            r3 = 0
        L18:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.findContainingItemView(android.view.View):android.view.View");
    }

    public f0 findContainingViewHolder(View view) {
        View findContainingItemView = findContainingItemView(view);
        if (findContainingItemView == null) {
            return null;
        }
        return getChildViewHolder(findContainingItemView);
    }

    public f0 findViewHolderForAdapterPosition(int i10) {
        f0 f0Var = null;
        if (this.mDataSetHasChangedAfterLayout) {
            return null;
        }
        int j10 = this.mChildHelper.j();
        for (int i11 = 0; i11 < j10; i11++) {
            f0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.i(i11));
            if (childViewHolderInt != null && !childViewHolderInt.isRemoved() && getAdapterPositionInRecyclerView(childViewHolderInt) == i10) {
                if (this.mChildHelper.n(childViewHolderInt.itemView)) {
                    f0Var = childViewHolderInt;
                } else {
                    return childViewHolderInt;
                }
            }
        }
        return f0Var;
    }

    public f0 findViewHolderForItemId(long j10) {
        h hVar = this.mAdapter;
        f0 f0Var = null;
        if (hVar != null && hVar.hasStableIds()) {
            int j11 = this.mChildHelper.j();
            for (int i10 = 0; i10 < j11; i10++) {
                f0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.i(i10));
                if (childViewHolderInt != null && !childViewHolderInt.isRemoved() && childViewHolderInt.getItemId() == j10) {
                    if (this.mChildHelper.n(childViewHolderInt.itemView)) {
                        f0Var = childViewHolderInt;
                    } else {
                        return childViewHolderInt;
                    }
                }
            }
        }
        return f0Var;
    }

    public f0 findViewHolderForLayoutPosition(int i10) {
        return findViewHolderForPosition(i10, false);
    }

    @Deprecated
    public f0 findViewHolderForPosition(int i10) {
        return findViewHolderForPosition(i10, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00e0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00f0  */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean fling(int r8, int r9) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.fling(int, int):boolean");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public View focusSearch(View view, int i10) {
        boolean z10;
        View view2;
        boolean z11;
        boolean z12;
        boolean z13;
        int i11;
        int i12;
        View Z0 = this.mLayout.Z0(view, i10);
        if (Z0 != null) {
            return Z0;
        }
        boolean z14 = true;
        if (this.mAdapter != null && this.mLayout != null && !isComputingLayout() && !this.mLayoutSuppressed) {
            z10 = true;
        } else {
            z10 = false;
        }
        FocusFinder focusFinder = FocusFinder.getInstance();
        if (z10 && (i10 == 2 || i10 == 1)) {
            if (this.mLayout.x()) {
                if (i10 == 2) {
                    i12 = 130;
                } else {
                    i12 = 33;
                }
                if (focusFinder.findNextFocus(this, view, i12) == null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (FORCE_ABS_FOCUS_SEARCH_DIRECTION) {
                    i10 = i12;
                }
            } else {
                z11 = false;
            }
            if (!z11 && this.mLayout.w()) {
                if (this.mLayout.l0() == 1) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (i10 == 2) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (z12 ^ z13) {
                    i11 = 66;
                } else {
                    i11 = 17;
                }
                if (focusFinder.findNextFocus(this, view, i11) != null) {
                    z14 = false;
                }
                if (FORCE_ABS_FOCUS_SEARCH_DIRECTION) {
                    i10 = i11;
                }
                z11 = z14;
            }
            if (z11) {
                consumePendingUpdateOperations();
                if (findContainingItemView(view) == null) {
                    return null;
                }
                startInterceptRequestLayout();
                this.mLayout.S0(view, i10, this.mRecycler, this.mState);
                stopInterceptRequestLayout(false);
            }
            view2 = focusFinder.findNextFocus(this, view, i10);
        } else {
            View findNextFocus = focusFinder.findNextFocus(this, view, i10);
            if (findNextFocus == null && z10) {
                consumePendingUpdateOperations();
                if (findContainingItemView(view) == null) {
                    return null;
                }
                startInterceptRequestLayout();
                view2 = this.mLayout.S0(view, i10, this.mRecycler, this.mState);
                stopInterceptRequestLayout(false);
            } else {
                view2 = findNextFocus;
            }
        }
        if (view2 != null && !view2.hasFocusable()) {
            if (getFocusedChild() == null) {
                return super.focusSearch(view, i10);
            }
            requestChildOnScreen(view2, null);
            return view;
        } else if (!isPreferredNextFocus(view, view2, i10)) {
            return super.focusSearch(view, i10);
        } else {
            return view2;
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        p pVar = this.mLayout;
        if (pVar != null) {
            return pVar.P();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + exceptionLabel());
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        p pVar = this.mLayout;
        if (pVar != null) {
            return pVar.Q(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + exceptionLabel());
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public h getAdapter() {
        return this.mAdapter;
    }

    int getAdapterPositionInRecyclerView(f0 f0Var) {
        if (!f0Var.hasAnyOfTheFlags(524) && f0Var.isBound()) {
            return this.mAdapterHelper.e(f0Var.mPosition);
        }
        return -1;
    }

    @Override // android.view.View
    public int getBaseline() {
        p pVar = this.mLayout;
        if (pVar != null) {
            return pVar.S();
        }
        return super.getBaseline();
    }

    long getChangedHolderKey(f0 f0Var) {
        if (this.mAdapter.hasStableIds()) {
            return f0Var.getItemId();
        }
        return f0Var.mPosition;
    }

    public int getChildAdapterPosition(View view) {
        f0 childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.getAbsoluteAdapterPosition();
        }
        return -1;
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i10, int i11) {
        k kVar = this.mChildDrawingOrderCallback;
        if (kVar == null) {
            return super.getChildDrawingOrder(i10, i11);
        }
        return kVar.a(i10, i11);
    }

    public long getChildItemId(View view) {
        f0 childViewHolderInt;
        h hVar = this.mAdapter;
        if (hVar == null || !hVar.hasStableIds() || (childViewHolderInt = getChildViewHolderInt(view)) == null) {
            return -1L;
        }
        return childViewHolderInt.getItemId();
    }

    public int getChildLayoutPosition(View view) {
        f0 childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.getLayoutPosition();
        }
        return -1;
    }

    @Deprecated
    public int getChildPosition(View view) {
        return getChildAdapterPosition(view);
    }

    public f0 getChildViewHolder(View view) {
        ViewParent parent = view.getParent();
        if (parent != null && parent != this) {
            throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
        }
        return getChildViewHolderInt(view);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.mClipToPadding;
    }

    public androidx.recyclerview.widget.w getCompatAccessibilityDelegate() {
        return this.mAccessibilityDelegate;
    }

    public void getDecoratedBoundsWithMargins(View view, Rect rect) {
        getDecoratedBoundsWithMarginsInt(view, rect);
    }

    public l getEdgeEffectFactory() {
        return this.mEdgeEffectFactory;
    }

    public m getItemAnimator() {
        return this.mItemAnimator;
    }

    Rect getItemDecorInsetsForChild(View view) {
        q qVar = (q) view.getLayoutParams();
        if (!qVar.f6608p) {
            return qVar.f6607m;
        }
        if (this.mState.e() && (qVar.b() || qVar.d())) {
            return qVar.f6607m;
        }
        Rect rect = qVar.f6607m;
        rect.set(0, 0, 0, 0);
        int size = this.mItemDecorations.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.mTempRect.set(0, 0, 0, 0);
            this.mItemDecorations.get(i10).getItemOffsets(this.mTempRect, view, this, this.mState);
            int i11 = rect.left;
            Rect rect2 = this.mTempRect;
            rect.left = i11 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        qVar.f6608p = false;
        return rect;
    }

    public o getItemDecorationAt(int i10) {
        int itemDecorationCount = getItemDecorationCount();
        if (i10 >= 0 && i10 < itemDecorationCount) {
            return this.mItemDecorations.get(i10);
        }
        throw new IndexOutOfBoundsException(i10 + " is an invalid index for size " + itemDecorationCount);
    }

    public int getItemDecorationCount() {
        return this.mItemDecorations.size();
    }

    public p getLayoutManager() {
        return this.mLayout;
    }

    public int getMaxFlingVelocity() {
        return this.mMaxFlingVelocity;
    }

    public int getMinFlingVelocity() {
        return this.mMinFlingVelocity;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long getNanoTime() {
        if (ALLOW_THREAD_GAP_WORK) {
            return System.nanoTime();
        }
        return 0L;
    }

    public s getOnFlingListener() {
        return this.mOnFlingListener;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.mPreserveFocusAfterLayout;
    }

    public v getRecycledViewPool() {
        return this.mRecycler.i();
    }

    public int getScrollState() {
        return this.mScrollState;
    }

    public boolean hasFixedSize() {
        return this.mHasFixedSize;
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().k();
    }

    public boolean hasPendingAdapterUpdates() {
        if (this.mFirstLayoutComplete && !this.mDataSetHasChangedAfterLayout && !this.mAdapterHelper.p()) {
            return false;
        }
        return true;
    }

    void initAdapterManager() {
        this.mAdapterHelper = new androidx.recyclerview.widget.a(new f());
    }

    void initFastScroller(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable != null && drawable != null && stateListDrawable2 != null && drawable2 != null) {
            Resources resources = getContext().getResources();
            new androidx.recyclerview.widget.k(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(t3.b.f23522a), resources.getDimensionPixelSize(t3.b.f23524c), resources.getDimensionPixelOffset(t3.b.f23523b));
            return;
        }
        throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + exceptionLabel());
    }

    void invalidateGlows() {
        this.mBottomGlow = null;
        this.mTopGlow = null;
        this.mRightGlow = null;
        this.mLeftGlow = null;
    }

    public void invalidateItemDecorations() {
        if (this.mItemDecorations.size() == 0) {
            return;
        }
        p pVar = this.mLayout;
        if (pVar != null) {
            pVar.s("Cannot invalidate item decorations during a scroll or layout");
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    boolean isAccessibilityEnabled() {
        AccessibilityManager accessibilityManager = this.mAccessibilityManager;
        if (accessibilityManager != null && accessibilityManager.isEnabled()) {
            return true;
        }
        return false;
    }

    public boolean isAnimating() {
        m mVar = this.mItemAnimator;
        if (mVar != null && mVar.isRunning()) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return this.mIsAttached;
    }

    public boolean isComputingLayout() {
        if (this.mLayoutOrScrollCounter > 0) {
            return true;
        }
        return false;
    }

    @Deprecated
    public boolean isLayoutFrozen() {
        return isLayoutSuppressed();
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.mLayoutSuppressed;
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().m();
    }

    void jumpToPositionForSmoothScroller(int i10) {
        if (this.mLayout == null) {
            return;
        }
        setScrollState(2);
        this.mLayout.H1(i10);
        awakenScrollBars();
    }

    void markItemDecorInsetsDirty() {
        int j10 = this.mChildHelper.j();
        for (int i10 = 0; i10 < j10; i10++) {
            ((q) this.mChildHelper.i(i10).getLayoutParams()).f6608p = true;
        }
        this.mRecycler.s();
    }

    void markKnownViewsInvalid() {
        int j10 = this.mChildHelper.j();
        for (int i10 = 0; i10 < j10; i10++) {
            f0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.i(i10));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.addFlags(6);
            }
        }
        markItemDecorInsetsDirty();
        this.mRecycler.t();
    }

    public void nestedScrollBy(int i10, int i11) {
        nestedScrollByInternal(i10, i11, null, 1);
    }

    public void offsetChildrenHorizontal(int i10) {
        int g10 = this.mChildHelper.g();
        for (int i11 = 0; i11 < g10; i11++) {
            this.mChildHelper.f(i11).offsetLeftAndRight(i10);
        }
    }

    public void offsetChildrenVertical(int i10) {
        int g10 = this.mChildHelper.g();
        for (int i11 = 0; i11 < g10; i11++) {
            this.mChildHelper.f(i11).offsetTopAndBottom(i10);
        }
    }

    void offsetPositionRecordsForInsert(int i10, int i11) {
        int j10 = this.mChildHelper.j();
        for (int i12 = 0; i12 < j10; i12++) {
            f0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.i(i12));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && childViewHolderInt.mPosition >= i10) {
                if (sVerboseLoggingEnabled) {
                    Log.d(TAG, "offsetPositionRecordsForInsert attached child " + i12 + " holder " + childViewHolderInt + " now at position " + (childViewHolderInt.mPosition + i11));
                }
                childViewHolderInt.offsetPosition(i11, false);
                this.mState.f6560g = true;
            }
        }
        this.mRecycler.v(i10, i11);
        requestLayout();
    }

    void offsetPositionRecordsForMove(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int j10 = this.mChildHelper.j();
        if (i10 < i11) {
            i14 = -1;
            i13 = i10;
            i12 = i11;
        } else {
            i12 = i10;
            i13 = i11;
            i14 = 1;
        }
        for (int i16 = 0; i16 < j10; i16++) {
            f0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.i(i16));
            if (childViewHolderInt != null && (i15 = childViewHolderInt.mPosition) >= i13 && i15 <= i12) {
                if (sVerboseLoggingEnabled) {
                    Log.d(TAG, "offsetPositionRecordsForMove attached child " + i16 + " holder " + childViewHolderInt);
                }
                if (childViewHolderInt.mPosition == i10) {
                    childViewHolderInt.offsetPosition(i11 - i10, false);
                } else {
                    childViewHolderInt.offsetPosition(i14, false);
                }
                this.mState.f6560g = true;
            }
        }
        this.mRecycler.w(i10, i11);
        requestLayout();
    }

    void offsetPositionRecordsForRemove(int i10, int i11, boolean z10) {
        int i12 = i10 + i11;
        int j10 = this.mChildHelper.j();
        for (int i13 = 0; i13 < j10; i13++) {
            f0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.i(i13));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore()) {
                int i14 = childViewHolderInt.mPosition;
                if (i14 >= i12) {
                    if (sVerboseLoggingEnabled) {
                        Log.d(TAG, "offsetPositionRecordsForRemove attached child " + i13 + " holder " + childViewHolderInt + " now at position " + (childViewHolderInt.mPosition - i11));
                    }
                    childViewHolderInt.offsetPosition(-i11, z10);
                    this.mState.f6560g = true;
                } else if (i14 >= i10) {
                    if (sVerboseLoggingEnabled) {
                        Log.d(TAG, "offsetPositionRecordsForRemove attached child " + i13 + " holder " + childViewHolderInt + " now REMOVED");
                    }
                    childViewHolderInt.flagRemovedAndOffsetPosition(i10 - 1, -i11, z10);
                    this.mState.f6560g = true;
                }
            }
        }
        this.mRecycler.x(i10, i11, z10);
        requestLayout();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0050, code lost:
    
        if (r1 >= 30.0f) goto L22;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onAttachedToWindow() {
        /*
            r5 = this;
            super.onAttachedToWindow()
            r0 = 0
            r5.mLayoutOrScrollCounter = r0
            r1 = 1
            r5.mIsAttached = r1
            boolean r2 = r5.mFirstLayoutComplete
            if (r2 == 0) goto L14
            boolean r2 = r5.isLayoutRequested()
            if (r2 != 0) goto L14
            goto L15
        L14:
            r1 = 0
        L15:
            r5.mFirstLayoutComplete = r1
            androidx.recyclerview.widget.RecyclerView$w r1 = r5.mRecycler
            r1.z()
            androidx.recyclerview.widget.RecyclerView$p r1 = r5.mLayout
            if (r1 == 0) goto L23
            r1.L(r5)
        L23:
            r5.mPostedAnimatorRunner = r0
            boolean r0 = androidx.recyclerview.widget.RecyclerView.ALLOW_THREAD_GAP_WORK
            if (r0 == 0) goto L66
            java.lang.ThreadLocal<androidx.recyclerview.widget.l> r0 = androidx.recyclerview.widget.l.f6847r
            java.lang.Object r1 = r0.get()
            androidx.recyclerview.widget.l r1 = (androidx.recyclerview.widget.l) r1
            r5.mGapWorker = r1
            if (r1 != 0) goto L61
            androidx.recyclerview.widget.l r1 = new androidx.recyclerview.widget.l
            r1.<init>()
            r5.mGapWorker = r1
            android.view.Display r1 = androidx.core.view.p0.x(r5)
            boolean r2 = r5.isInEditMode()
            if (r2 != 0) goto L53
            if (r1 == 0) goto L53
            float r1 = r1.getRefreshRate()
            r2 = 1106247680(0x41f00000, float:30.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 < 0) goto L53
            goto L55
        L53:
            r1 = 1114636288(0x42700000, float:60.0)
        L55:
            androidx.recyclerview.widget.l r2 = r5.mGapWorker
            r3 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r3 = r3 / r1
            long r3 = (long) r3
            r2.f6851p = r3
            r0.set(r2)
        L61:
            androidx.recyclerview.widget.l r0 = r5.mGapWorker
            r0.a(r5)
        L66:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onAttachedToWindow():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        androidx.recyclerview.widget.l lVar;
        super.onDetachedFromWindow();
        m mVar = this.mItemAnimator;
        if (mVar != null) {
            mVar.endAnimations();
        }
        stopScroll();
        this.mIsAttached = false;
        p pVar = this.mLayout;
        if (pVar != null) {
            pVar.M(this, this.mRecycler);
        }
        this.mPendingAccessibilityImportanceChange.clear();
        removeCallbacks(this.mItemAnimatorRunner);
        this.mViewInfoStore.j();
        this.mRecycler.A();
        x2.a.c(this);
        if (ALLOW_THREAD_GAP_WORK && (lVar = this.mGapWorker) != null) {
            lVar.j(this);
            this.mGapWorker = null;
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.mItemDecorations.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.mItemDecorations.get(i10).onDraw(canvas, this, this.mState);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void onEnterLayoutOrScroll() {
        this.mLayoutOrScrollCounter++;
    }

    void onExitLayoutOrScroll() {
        onExitLayoutOrScroll(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0066  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onGenericMotionEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            androidx.recyclerview.widget.RecyclerView$p r0 = r5.mLayout
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r0 = r5.mLayoutSuppressed
            if (r0 == 0) goto Lb
            return r1
        Lb:
            int r0 = r6.getAction()
            r2 = 8
            if (r0 != r2) goto L78
            int r0 = r6.getSource()
            r0 = r0 & 2
            r2 = 0
            if (r0 == 0) goto L3c
            androidx.recyclerview.widget.RecyclerView$p r0 = r5.mLayout
            boolean r0 = r0.x()
            if (r0 == 0) goto L2c
            r0 = 9
            float r0 = r6.getAxisValue(r0)
            float r0 = -r0
            goto L2d
        L2c:
            r0 = 0
        L2d:
            androidx.recyclerview.widget.RecyclerView$p r3 = r5.mLayout
            boolean r3 = r3.w()
            if (r3 == 0) goto L61
            r3 = 10
            float r3 = r6.getAxisValue(r3)
            goto L62
        L3c:
            int r0 = r6.getSource()
            r3 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 & r3
            if (r0 == 0) goto L60
            r0 = 26
            float r0 = r6.getAxisValue(r0)
            androidx.recyclerview.widget.RecyclerView$p r3 = r5.mLayout
            boolean r3 = r3.x()
            if (r3 == 0) goto L55
            float r0 = -r0
            goto L61
        L55:
            androidx.recyclerview.widget.RecyclerView$p r3 = r5.mLayout
            boolean r3 = r3.w()
            if (r3 == 0) goto L60
            r3 = r0
            r0 = 0
            goto L62
        L60:
            r0 = 0
        L61:
            r3 = 0
        L62:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L6a
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 == 0) goto L78
        L6a:
            float r2 = r5.mScaledHorizontalScrollFactor
            float r3 = r3 * r2
            int r2 = (int) r3
            float r3 = r5.mScaledVerticalScrollFactor
            float r0 = r0 * r3
            int r0 = (int) r0
            r3 = 1
            r5.nestedScrollByInternal(r2, r0, r6, r3)
        L78:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        if (this.mLayoutSuppressed) {
            return false;
        }
        this.mInterceptingOnItemTouchListener = null;
        if (findInterceptingOnItemTouchListener(motionEvent)) {
            cancelScroll();
            return true;
        }
        p pVar = this.mLayout;
        if (pVar == null) {
            return false;
        }
        boolean w10 = pVar.w();
        boolean x10 = this.mLayout.x();
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked != 5) {
                            if (actionMasked == 6) {
                                onPointerUp(motionEvent);
                            }
                        } else {
                            this.mScrollPointerId = motionEvent.getPointerId(actionIndex);
                            int x11 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                            this.mLastTouchX = x11;
                            this.mInitialTouchX = x11;
                            int y10 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                            this.mLastTouchY = y10;
                            this.mInitialTouchY = y10;
                        }
                    } else {
                        cancelScroll();
                    }
                } else {
                    int findPointerIndex = motionEvent.findPointerIndex(this.mScrollPointerId);
                    if (findPointerIndex < 0) {
                        Log.e(TAG, "Error processing scroll; pointer index for id " + this.mScrollPointerId + " not found. Did any MotionEvents get skipped?");
                        return false;
                    }
                    int x12 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                    int y11 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                    if (this.mScrollState != 1) {
                        int i10 = x12 - this.mInitialTouchX;
                        int i11 = y11 - this.mInitialTouchY;
                        if (w10 && Math.abs(i10) > this.mTouchSlop) {
                            this.mLastTouchX = x12;
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (x10 && Math.abs(i11) > this.mTouchSlop) {
                            this.mLastTouchY = y11;
                            z10 = true;
                        }
                        if (z10) {
                            setScrollState(1);
                        }
                    }
                }
            } else {
                this.mVelocityTracker.clear();
                stopNestedScroll(0);
            }
        } else {
            if (this.mIgnoreMotionEventTillDown) {
                this.mIgnoreMotionEventTillDown = false;
            }
            this.mScrollPointerId = motionEvent.getPointerId(0);
            int x13 = (int) (motionEvent.getX() + 0.5f);
            this.mLastTouchX = x13;
            this.mInitialTouchX = x13;
            int y12 = (int) (motionEvent.getY() + 0.5f);
            this.mLastTouchY = y12;
            this.mInitialTouchY = y12;
            if (stopGlowAnimations(motionEvent) || this.mScrollState == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                stopNestedScroll(1);
            }
            int[] iArr = this.mNestedOffsets;
            iArr[1] = 0;
            iArr[0] = 0;
            int i12 = w10;
            if (x10) {
                i12 = (w10 ? 1 : 0) | 2;
            }
            startNestedScroll(i12, 0);
        }
        if (this.mScrollState != 1) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        androidx.core.os.t.a(TRACE_ON_LAYOUT_TAG);
        dispatchLayout();
        androidx.core.os.t.b();
        this.mFirstLayoutComplete = true;
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        p pVar = this.mLayout;
        if (pVar == null) {
            defaultOnMeasure(i10, i11);
            return;
        }
        boolean z10 = false;
        if (pVar.A0()) {
            int mode = View.MeasureSpec.getMode(i10);
            int mode2 = View.MeasureSpec.getMode(i11);
            this.mLayout.i1(this.mRecycler, this.mState, i10, i11);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z10 = true;
            }
            this.mLastAutoMeasureSkippedDueToExact = z10;
            if (!z10 && this.mAdapter != null) {
                if (this.mState.f6558e == 1) {
                    dispatchLayoutStep1();
                }
                this.mLayout.K1(i10, i11);
                this.mState.f6563j = true;
                dispatchLayoutStep2();
                this.mLayout.N1(i10, i11);
                if (this.mLayout.Q1()) {
                    this.mLayout.K1(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                    this.mState.f6563j = true;
                    dispatchLayoutStep2();
                    this.mLayout.N1(i10, i11);
                }
                this.mLastAutoMeasureNonExactMeasuredWidth = getMeasuredWidth();
                this.mLastAutoMeasureNonExactMeasuredHeight = getMeasuredHeight();
            }
        } else if (this.mHasFixedSize) {
            this.mLayout.i1(this.mRecycler, this.mState, i10, i11);
        } else {
            if (this.mAdapterUpdateDuringMeasure) {
                startInterceptRequestLayout();
                onEnterLayoutOrScroll();
                processAdapterUpdatesAndSetAnimationFlags();
                onExitLayoutOrScroll();
                b0 b0Var = this.mState;
                if (b0Var.f6565l) {
                    b0Var.f6561h = true;
                } else {
                    this.mAdapterHelper.j();
                    this.mState.f6561h = false;
                }
                this.mAdapterUpdateDuringMeasure = false;
                stopInterceptRequestLayout(false);
            } else if (this.mState.f6565l) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            h hVar = this.mAdapter;
            if (hVar != null) {
                this.mState.f6559f = hVar.getItemCount();
            } else {
                this.mState.f6559f = 0;
            }
            startInterceptRequestLayout();
            this.mLayout.i1(this.mRecycler, this.mState, i10, i11);
            stopInterceptRequestLayout(false);
            this.mState.f6561h = false;
        }
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i10, Rect rect) {
        if (isComputingLayout()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i10, rect);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.mPendingSavedState = savedState;
        super.onRestoreInstanceState(savedState.a());
        requestLayout();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SavedState savedState2 = this.mPendingSavedState;
        if (savedState2 != null) {
            savedState.b(savedState2);
        } else {
            p pVar = this.mLayout;
            if (pVar != null) {
                savedState.f6536p = pVar.m1();
            } else {
                savedState.f6536p = null;
            }
        }
        return savedState;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 != i12 || i11 != i13) {
            invalidateGlows();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f8  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            Method dump skipped, instructions count: 499
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    void postAnimationRunner() {
        if (!this.mPostedAnimatorRunner && this.mIsAttached) {
            p0.m0(this, this.mItemAnimatorRunner);
            this.mPostedAnimatorRunner = true;
        }
    }

    void processDataSetCompletelyChanged(boolean z10) {
        this.mDispatchItemsChangedEvent = z10 | this.mDispatchItemsChangedEvent;
        this.mDataSetHasChangedAfterLayout = true;
        markKnownViewsInvalid();
    }

    void recordAnimationInfoIfBouncedHiddenView(f0 f0Var, m.c cVar) {
        f0Var.setFlags(0, 8192);
        if (this.mState.f6562i && f0Var.isUpdated() && !f0Var.isRemoved() && !f0Var.shouldIgnore()) {
            this.mViewInfoStore.c(getChangedHolderKey(f0Var), f0Var);
        }
        this.mViewInfoStore.e(f0Var, cVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void removeAndRecycleViews() {
        m mVar = this.mItemAnimator;
        if (mVar != null) {
            mVar.endAnimations();
        }
        p pVar = this.mLayout;
        if (pVar != null) {
            pVar.u1(this.mRecycler);
            this.mLayout.v1(this.mRecycler);
        }
        this.mRecycler.c();
    }

    boolean removeAnimatingView(View view) {
        startInterceptRequestLayout();
        boolean r10 = this.mChildHelper.r(view);
        if (r10) {
            f0 childViewHolderInt = getChildViewHolderInt(view);
            this.mRecycler.O(childViewHolderInt);
            this.mRecycler.H(childViewHolderInt);
            if (sVerboseLoggingEnabled) {
                Log.d(TAG, "after removing animated view: " + view + ", " + this);
            }
        }
        stopInterceptRequestLayout(!r10);
        return r10;
    }

    @Override // android.view.ViewGroup
    protected void removeDetachedView(View view, boolean z10) {
        f0 childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            if (childViewHolderInt.isTmpDetached()) {
                childViewHolderInt.clearTmpDetachFlag();
            } else if (!childViewHolderInt.shouldIgnore()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + childViewHolderInt + exceptionLabel());
            }
        } else if (sDebugAssertionsEnabled) {
            throw new IllegalArgumentException("No ViewHolder found for child: " + view + exceptionLabel());
        }
        view.clearAnimation();
        dispatchChildDetached(view);
        super.removeDetachedView(view, z10);
    }

    public void removeItemDecoration(o oVar) {
        boolean z10;
        p pVar = this.mLayout;
        if (pVar != null) {
            pVar.s("Cannot remove item decoration during a scroll  or layout");
        }
        this.mItemDecorations.remove(oVar);
        if (this.mItemDecorations.isEmpty()) {
            if (getOverScrollMode() == 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            setWillNotDraw(z10);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void removeItemDecorationAt(int i10) {
        int itemDecorationCount = getItemDecorationCount();
        if (i10 >= 0 && i10 < itemDecorationCount) {
            removeItemDecoration(getItemDecorationAt(i10));
            return;
        }
        throw new IndexOutOfBoundsException(i10 + " is an invalid index for size " + itemDecorationCount);
    }

    public void removeOnChildAttachStateChangeListener(r rVar) {
        List<r> list = this.mOnChildAttachStateListeners;
        if (list == null) {
            return;
        }
        list.remove(rVar);
    }

    public void removeOnItemTouchListener(t tVar) {
        this.mOnItemTouchListeners.remove(tVar);
        if (this.mInterceptingOnItemTouchListener == tVar) {
            this.mInterceptingOnItemTouchListener = null;
        }
    }

    public void removeOnScrollListener(u uVar) {
        List<u> list = this.mScrollListeners;
        if (list != null) {
            list.remove(uVar);
        }
    }

    public void removeRecyclerListener(x xVar) {
        this.mRecyclerListeners.remove(xVar);
    }

    void repositionShadowingViews() {
        f0 f0Var;
        int g10 = this.mChildHelper.g();
        for (int i10 = 0; i10 < g10; i10++) {
            View f10 = this.mChildHelper.f(i10);
            f0 childViewHolder = getChildViewHolder(f10);
            if (childViewHolder != null && (f0Var = childViewHolder.mShadowingHolder) != null) {
                View view = f0Var.itemView;
                int left = f10.getLeft();
                int top = f10.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (!this.mLayout.k1(this, this.mState, view, view2) && view2 != null) {
            requestChildOnScreen(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        return this.mLayout.B1(this, view, rect, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        int size = this.mOnItemTouchListeners.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.mOnItemTouchListeners.get(i10).onRequestDisallowInterceptTouchEvent(z10);
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.mInterceptRequestLayoutDepth == 0 && !this.mLayoutSuppressed) {
            super.requestLayout();
        } else {
            this.mLayoutWasDefered = true;
        }
    }

    void saveOldPositions() {
        int j10 = this.mChildHelper.j();
        for (int i10 = 0; i10 < j10; i10++) {
            f0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.i(i10));
            if (sDebugAssertionsEnabled && childViewHolderInt.mPosition == -1 && !childViewHolderInt.isRemoved()) {
                throw new IllegalStateException("view holder cannot have position -1 unless it is removed" + exceptionLabel());
            }
            if (!childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.saveOldPosition();
            }
        }
    }

    @Override // android.view.View
    public void scrollBy(int i10, int i11) {
        p pVar = this.mLayout;
        if (pVar == null) {
            Log.e(TAG, "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (this.mLayoutSuppressed) {
        } else {
            boolean w10 = pVar.w();
            boolean x10 = this.mLayout.x();
            if (w10 || x10) {
                if (!w10) {
                    i10 = 0;
                }
                if (!x10) {
                    i11 = 0;
                }
                scrollByInternal(i10, i11, null, 0);
            }
        }
    }

    boolean scrollByInternal(int i10, int i11, MotionEvent motionEvent, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        boolean z10;
        consumePendingUpdateOperations();
        if (this.mAdapter != null) {
            int[] iArr = this.mReusableIntPair;
            iArr[0] = 0;
            iArr[1] = 0;
            scrollStep(i10, i11, iArr);
            int[] iArr2 = this.mReusableIntPair;
            int i17 = iArr2[0];
            int i18 = iArr2[1];
            i13 = i18;
            i14 = i17;
            i15 = i10 - i17;
            i16 = i11 - i18;
        } else {
            i13 = 0;
            i14 = 0;
            i15 = 0;
            i16 = 0;
        }
        if (!this.mItemDecorations.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.mReusableIntPair;
        iArr3[0] = 0;
        iArr3[1] = 0;
        dispatchNestedScroll(i14, i13, i15, i16, this.mScrollOffset, i12, iArr3);
        int[] iArr4 = this.mReusableIntPair;
        int i19 = iArr4[0];
        int i20 = i15 - i19;
        int i21 = iArr4[1];
        int i22 = i16 - i21;
        if (i19 == 0 && i21 == 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        int i23 = this.mLastTouchX;
        int[] iArr5 = this.mScrollOffset;
        int i24 = iArr5[0];
        this.mLastTouchX = i23 - i24;
        int i25 = this.mLastTouchY;
        int i26 = iArr5[1];
        this.mLastTouchY = i25 - i26;
        int[] iArr6 = this.mNestedOffsets;
        iArr6[0] = iArr6[0] + i24;
        iArr6[1] = iArr6[1] + i26;
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && !androidx.core.view.b0.a(motionEvent, 8194)) {
                pullGlows(motionEvent.getX(), i20, motionEvent.getY(), i22);
            }
            considerReleasingGlowsOnScroll(i10, i11);
        }
        if (i14 != 0 || i13 != 0) {
            dispatchOnScrolled(i14, i13);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        if (z10 || i14 != 0 || i13 != 0) {
            return true;
        }
        return false;
    }

    void scrollStep(int i10, int i11, int[] iArr) {
        int i12;
        int i13;
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        androidx.core.os.t.a(TRACE_SCROLL_TAG);
        fillRemainingScrollValues(this.mState);
        if (i10 != 0) {
            i12 = this.mLayout.G1(i10, this.mRecycler, this.mState);
        } else {
            i12 = 0;
        }
        if (i11 != 0) {
            i13 = this.mLayout.I1(i11, this.mRecycler, this.mState);
        } else {
            i13 = 0;
        }
        androidx.core.os.t.b();
        repositionShadowingViews();
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        if (iArr != null) {
            iArr[0] = i12;
            iArr[1] = i13;
        }
    }

    @Override // android.view.View
    public void scrollTo(int i10, int i11) {
        Log.w(TAG, "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    public void scrollToPosition(int i10) {
        if (this.mLayoutSuppressed) {
            return;
        }
        stopScroll();
        p pVar = this.mLayout;
        if (pVar == null) {
            Log.e(TAG, "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        pVar.H1(i10);
        awakenScrollBars();
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (shouldDeferAccessibilityEvent(accessibilityEvent)) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(androidx.recyclerview.widget.w wVar) {
        this.mAccessibilityDelegate = wVar;
        p0.u0(this, wVar);
    }

    public void setAdapter(h hVar) {
        setLayoutFrozen(false);
        setAdapterInternal(hVar, false, true);
        processDataSetCompletelyChanged(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(k kVar) {
        boolean z10;
        if (kVar == this.mChildDrawingOrderCallback) {
            return;
        }
        this.mChildDrawingOrderCallback = kVar;
        if (kVar != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        setChildrenDrawingOrderEnabled(z10);
    }

    boolean setChildImportantForAccessibilityInternal(f0 f0Var, int i10) {
        if (isComputingLayout()) {
            f0Var.mPendingAccessibilityState = i10;
            this.mPendingAccessibilityImportanceChange.add(f0Var);
            return false;
        }
        p0.F0(f0Var.itemView, i10);
        return true;
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z10) {
        if (z10 != this.mClipToPadding) {
            invalidateGlows();
        }
        this.mClipToPadding = z10;
        super.setClipToPadding(z10);
        if (this.mFirstLayoutComplete) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(l lVar) {
        androidx.core.util.i.g(lVar);
        this.mEdgeEffectFactory = lVar;
        invalidateGlows();
    }

    public void setHasFixedSize(boolean z10) {
        this.mHasFixedSize = z10;
    }

    public void setItemAnimator(m mVar) {
        m mVar2 = this.mItemAnimator;
        if (mVar2 != null) {
            mVar2.endAnimations();
            this.mItemAnimator.setListener(null);
        }
        this.mItemAnimator = mVar;
        if (mVar != null) {
            mVar.setListener(this.mItemAnimatorListener);
        }
    }

    public void setItemViewCacheSize(int i10) {
        this.mRecycler.L(i10);
    }

    @Deprecated
    public void setLayoutFrozen(boolean z10) {
        suppressLayout(z10);
    }

    public void setLayoutManager(p pVar) {
        if (pVar == this.mLayout) {
            return;
        }
        stopScroll();
        if (this.mLayout != null) {
            m mVar = this.mItemAnimator;
            if (mVar != null) {
                mVar.endAnimations();
            }
            this.mLayout.u1(this.mRecycler);
            this.mLayout.v1(this.mRecycler);
            this.mRecycler.c();
            if (this.mIsAttached) {
                this.mLayout.M(this, this.mRecycler);
            }
            this.mLayout.O1(null);
            this.mLayout = null;
        } else {
            this.mRecycler.c();
        }
        this.mChildHelper.o();
        this.mLayout = pVar;
        if (pVar != null) {
            if (pVar.f6588m == null) {
                pVar.O1(this);
                if (this.mIsAttached) {
                    this.mLayout.L(this);
                }
            } else {
                throw new IllegalArgumentException("LayoutManager " + pVar + " is already attached to a RecyclerView:" + pVar.f6588m.exceptionLabel());
            }
        }
        this.mRecycler.P();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition == null) {
            super.setLayoutTransition(null);
            return;
        }
        throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z10) {
        getScrollingChildHelper().n(z10);
    }

    public void setOnFlingListener(s sVar) {
        this.mOnFlingListener = sVar;
    }

    @Deprecated
    public void setOnScrollListener(u uVar) {
        this.mScrollListener = uVar;
    }

    public void setPreserveFocusAfterLayout(boolean z10) {
        this.mPreserveFocusAfterLayout = z10;
    }

    public void setRecycledViewPool(v vVar) {
        this.mRecycler.J(vVar);
    }

    @Deprecated
    public void setRecyclerListener(x xVar) {
        this.mRecyclerListener = xVar;
    }

    void setScrollState(int i10) {
        if (i10 == this.mScrollState) {
            return;
        }
        if (sVerboseLoggingEnabled) {
            Log.d(TAG, "setting scroll state to " + i10 + " from " + this.mScrollState, new Exception());
        }
        this.mScrollState = i10;
        if (i10 != 2) {
            stopScrollersInternal();
        }
        dispatchOnScrollStateChanged(i10);
    }

    public void setScrollingTouchSlop(int i10) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i10 != 0) {
            if (i10 != 1) {
                Log.w(TAG, "setScrollingTouchSlop(): bad argument constant " + i10 + "; using default value");
            } else {
                this.mTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
        }
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(d0 d0Var) {
        this.mRecycler.K(d0Var);
    }

    boolean shouldDeferAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        int i10;
        int i11 = 0;
        if (!isComputingLayout()) {
            return false;
        }
        if (accessibilityEvent != null) {
            i10 = androidx.core.view.accessibility.b.a(accessibilityEvent);
        } else {
            i10 = 0;
        }
        if (i10 != 0) {
            i11 = i10;
        }
        this.mEatenAccessibilityChangeFlags |= i11;
        return true;
    }

    public void smoothScrollBy(int i10, int i11) {
        smoothScrollBy(i10, i11, null);
    }

    public void smoothScrollToPosition(int i10) {
        if (this.mLayoutSuppressed) {
            return;
        }
        p pVar = this.mLayout;
        if (pVar == null) {
            Log.e(TAG, "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            pVar.S1(this, this.mState, i10);
        }
    }

    void startInterceptRequestLayout() {
        int i10 = this.mInterceptRequestLayoutDepth + 1;
        this.mInterceptRequestLayoutDepth = i10;
        if (i10 == 1 && !this.mLayoutSuppressed) {
            this.mLayoutWasDefered = false;
        }
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i10) {
        return getScrollingChildHelper().p(i10);
    }

    void stopInterceptRequestLayout(boolean z10) {
        if (this.mInterceptRequestLayoutDepth < 1) {
            if (!sDebugAssertionsEnabled) {
                this.mInterceptRequestLayoutDepth = 1;
            } else {
                throw new IllegalStateException("stopInterceptRequestLayout was called more times than startInterceptRequestLayout." + exceptionLabel());
            }
        }
        if (!z10 && !this.mLayoutSuppressed) {
            this.mLayoutWasDefered = false;
        }
        if (this.mInterceptRequestLayoutDepth == 1) {
            if (z10 && this.mLayoutWasDefered && !this.mLayoutSuppressed && this.mLayout != null && this.mAdapter != null) {
                dispatchLayout();
            }
            if (!this.mLayoutSuppressed) {
                this.mLayoutWasDefered = false;
            }
        }
        this.mInterceptRequestLayoutDepth--;
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        getScrollingChildHelper().r();
    }

    public void stopScroll() {
        setScrollState(0);
        stopScrollersInternal();
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z10) {
        if (z10 != this.mLayoutSuppressed) {
            assertNotInLayoutOrScroll("Do not suppressLayout in layout or scroll");
            if (!z10) {
                this.mLayoutSuppressed = false;
                if (this.mLayoutWasDefered && this.mLayout != null && this.mAdapter != null) {
                    requestLayout();
                }
                this.mLayoutWasDefered = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, DECELERATION_RATE, DECELERATION_RATE, 0));
            this.mLayoutSuppressed = true;
            this.mIgnoreMotionEventTillDown = true;
            stopScroll();
        }
    }

    public void swapAdapter(h hVar, boolean z10) {
        setLayoutFrozen(false);
        setAdapterInternal(hVar, true, z10);
        processDataSetCompletelyChanged(true);
        requestLayout();
    }

    void viewRangeUpdate(int i10, int i11, Object obj) {
        int i12;
        int j10 = this.mChildHelper.j();
        int i13 = i10 + i11;
        for (int i14 = 0; i14 < j10; i14++) {
            View i15 = this.mChildHelper.i(i14);
            f0 childViewHolderInt = getChildViewHolderInt(i15);
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && (i12 = childViewHolderInt.mPosition) >= i10 && i12 < i13) {
                childViewHolderInt.addFlags(2);
                childViewHolderInt.addChangePayload(obj);
                ((q) i15.getLayoutParams()).f6608p = true;
            }
        }
        this.mRecycler.R(i10, i11);
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, t3.a.f23521a);
    }

    public boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2, int i12) {
        return getScrollingChildHelper().d(i10, i11, iArr, iArr2, i12);
    }

    public boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr, int i14) {
        return getScrollingChildHelper().g(i10, i11, i12, i13, iArr, i14);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0036 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    androidx.recyclerview.widget.RecyclerView.f0 findViewHolderForPosition(int r6, boolean r7) {
        /*
            r5 = this;
            androidx.recyclerview.widget.e r0 = r5.mChildHelper
            int r0 = r0.j()
            r1 = 0
            r2 = 0
        L8:
            if (r2 >= r0) goto L3a
            androidx.recyclerview.widget.e r3 = r5.mChildHelper
            android.view.View r3 = r3.i(r2)
            androidx.recyclerview.widget.RecyclerView$f0 r3 = getChildViewHolderInt(r3)
            if (r3 == 0) goto L37
            boolean r4 = r3.isRemoved()
            if (r4 != 0) goto L37
            if (r7 == 0) goto L23
            int r4 = r3.mPosition
            if (r4 == r6) goto L2a
            goto L37
        L23:
            int r4 = r3.getLayoutPosition()
            if (r4 == r6) goto L2a
            goto L37
        L2a:
            androidx.recyclerview.widget.e r1 = r5.mChildHelper
            android.view.View r4 = r3.itemView
            boolean r1 = r1.n(r4)
            if (r1 == 0) goto L36
            r1 = r3
            goto L37
        L36:
            return r3
        L37:
            int r2 = r2 + 1
            goto L8
        L3a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.findViewHolderForPosition(int, boolean):androidx.recyclerview.widget.RecyclerView$f0");
    }

    public boolean hasNestedScrollingParent(int i10) {
        return getScrollingChildHelper().l(i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void onExitLayoutOrScroll(boolean z10) {
        int i10 = this.mLayoutOrScrollCounter - 1;
        this.mLayoutOrScrollCounter = i10;
        if (i10 < 1) {
            if (sDebugAssertionsEnabled && i10 < 0) {
                throw new IllegalStateException("layout or scroll counter cannot go below zero.Some calls are not matching" + exceptionLabel());
            }
            this.mLayoutOrScrollCounter = 0;
            if (z10) {
                dispatchContentChangedIfNecessary();
                dispatchPendingImportantForAccessibilityChanges();
            }
        }
    }

    public void smoothScrollBy(int i10, int i11, Interpolator interpolator) {
        smoothScrollBy(i10, i11, interpolator, UNDEFINED_DURATION);
    }

    public boolean startNestedScroll(int i10, int i11) {
        return getScrollingChildHelper().q(i10, i11);
    }

    public void stopNestedScroll(int i10) {
        getScrollingChildHelper().s(i10);
    }

    /* loaded from: classes.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: p  reason: collision with root package name */
        Parcelable f6536p;

        /* loaded from: classes.dex */
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

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f6536p = parcel.readParcelable(classLoader == null ? p.class.getClassLoader() : classLoader);
        }

        void b(SavedState savedState) {
            this.f6536p = savedState.f6536p;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeParcelable(this.f6536p, 0);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.mObserver = new y();
        this.mRecycler = new w();
        this.mViewInfoStore = new androidx.recyclerview.widget.c0();
        this.mUpdateChildViewsRunnable = new a();
        this.mTempRect = new Rect();
        this.mTempRect2 = new Rect();
        this.mTempRectF = new RectF();
        this.mRecyclerListeners = new ArrayList();
        this.mItemDecorations = new ArrayList<>();
        this.mOnItemTouchListeners = new ArrayList<>();
        this.mInterceptRequestLayoutDepth = 0;
        this.mDataSetHasChangedAfterLayout = false;
        this.mDispatchItemsChangedEvent = false;
        this.mLayoutOrScrollCounter = 0;
        this.mDispatchScrollCounter = 0;
        this.mEdgeEffectFactory = sDefaultEdgeEffectFactory;
        this.mItemAnimator = new androidx.recyclerview.widget.h();
        this.mScrollState = 0;
        this.mScrollPointerId = -1;
        this.mScaledHorizontalScrollFactor = Float.MIN_VALUE;
        this.mScaledVerticalScrollFactor = Float.MIN_VALUE;
        this.mPreserveFocusAfterLayout = true;
        this.mViewFlinger = new e0();
        this.mPrefetchRegistry = ALLOW_THREAD_GAP_WORK ? new l.b() : null;
        this.mState = new b0();
        this.mItemsAddedOrRemoved = false;
        this.mItemsChanged = false;
        this.mItemAnimatorListener = new n();
        this.mPostedAnimatorRunner = false;
        this.mMinMaxLayoutPositions = new int[2];
        this.mScrollOffset = new int[2];
        this.mNestedOffsets = new int[2];
        this.mReusableIntPair = new int[2];
        this.mPendingAccessibilityImportanceChange = new ArrayList();
        this.mItemAnimatorRunner = new b();
        this.mLastAutoMeasureNonExactMeasuredWidth = 0;
        this.mLastAutoMeasureNonExactMeasuredHeight = 0;
        this.mViewInfoProcessCallback = new d();
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
        this.mScaledHorizontalScrollFactor = r0.c(viewConfiguration, context);
        this.mScaledVerticalScrollFactor = r0.e(viewConfiguration, context);
        this.mMinFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
        this.mMaxFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        this.mPhysicalCoef = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        setWillNotDraw(getOverScrollMode() == 2);
        this.mItemAnimator.setListener(this.mItemAnimatorListener);
        initAdapterManager();
        initChildrenHelper();
        initAutofill();
        if (p0.C(this) == 0) {
            p0.F0(this, 1);
        }
        this.mAccessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new androidx.recyclerview.widget.w(this));
        int[] iArr = t3.d.f23529a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i10, 0);
        p0.s0(this, context, iArr, attributeSet, obtainStyledAttributes, i10, 0);
        String string = obtainStyledAttributes.getString(t3.d.f23538j);
        if (obtainStyledAttributes.getInt(t3.d.f23532d, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.mClipToPadding = obtainStyledAttributes.getBoolean(t3.d.f23531c, true);
        boolean z10 = obtainStyledAttributes.getBoolean(t3.d.f23533e, false);
        this.mEnableFastScroller = z10;
        if (z10) {
            initFastScroller((StateListDrawable) obtainStyledAttributes.getDrawable(t3.d.f23536h), obtainStyledAttributes.getDrawable(t3.d.f23537i), (StateListDrawable) obtainStyledAttributes.getDrawable(t3.d.f23534f), obtainStyledAttributes.getDrawable(t3.d.f23535g));
        }
        obtainStyledAttributes.recycle();
        createLayoutManager(context, string, attributeSet, i10, 0);
        int[] iArr2 = NESTED_SCROLLING_ATTRS;
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i10, 0);
        p0.s0(this, context, iArr2, attributeSet, obtainStyledAttributes2, i10, 0);
        boolean z11 = obtainStyledAttributes2.getBoolean(0, true);
        obtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z11);
        x2.a.h(this, true);
    }

    public final void dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        getScrollingChildHelper().e(i10, i11, i12, i13, iArr, i14, iArr2);
    }

    public void smoothScrollBy(int i10, int i11, Interpolator interpolator, int i12) {
        smoothScrollBy(i10, i11, interpolator, i12, false);
    }

    /* loaded from: classes.dex */
    public static class q extends ViewGroup.MarginLayoutParams {

        /* renamed from: f  reason: collision with root package name */
        f0 f6606f;

        /* renamed from: m  reason: collision with root package name */
        final Rect f6607m;

        /* renamed from: p  reason: collision with root package name */
        boolean f6608p;

        /* renamed from: q  reason: collision with root package name */
        boolean f6609q;

        public q(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f6607m = new Rect();
            this.f6608p = true;
            this.f6609q = false;
        }

        public int a() {
            return this.f6606f.getLayoutPosition();
        }

        public boolean b() {
            return this.f6606f.isUpdated();
        }

        public boolean c() {
            return this.f6606f.isRemoved();
        }

        public boolean d() {
            return this.f6606f.isInvalid();
        }

        public q(int i10, int i11) {
            super(i10, i11);
            this.f6607m = new Rect();
            this.f6608p = true;
            this.f6609q = false;
        }

        public q(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f6607m = new Rect();
            this.f6608p = true;
            this.f6609q = false;
        }

        public q(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f6607m = new Rect();
            this.f6608p = true;
            this.f6609q = false;
        }

        public q(q qVar) {
            super((ViewGroup.LayoutParams) qVar);
            this.f6607m = new Rect();
            this.f6608p = true;
            this.f6609q = false;
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        p pVar = this.mLayout;
        if (pVar != null) {
            return pVar.R(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + exceptionLabel());
    }

    void smoothScrollBy(int i10, int i11, Interpolator interpolator, int i12, boolean z10) {
        p pVar = this.mLayout;
        if (pVar == null) {
            Log.e(TAG, "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (this.mLayoutSuppressed) {
        } else {
            if (!pVar.w()) {
                i10 = 0;
            }
            if (!this.mLayout.x()) {
                i11 = 0;
            }
            if (i10 == 0 && i11 == 0) {
                return;
            }
            if (i12 == Integer.MIN_VALUE || i12 > 0) {
                if (z10) {
                    int i13 = i10 != 0 ? 1 : 0;
                    if (i11 != 0) {
                        i13 |= 2;
                    }
                    startNestedScroll(i13, 1);
                }
                this.mViewFlinger.e(i10, i11, i12, interpolator);
                return;
            }
            scrollBy(i10, i11);
        }
    }

    public void addItemDecoration(o oVar) {
        addItemDecoration(oVar, -1);
    }

    /* loaded from: classes.dex */
    public static abstract class p {
        boolean A;
        private int B;
        private int C;
        private int D;
        private int E;

        /* renamed from: f  reason: collision with root package name */
        androidx.recyclerview.widget.e f6587f;

        /* renamed from: m  reason: collision with root package name */
        RecyclerView f6588m;

        /* renamed from: p  reason: collision with root package name */
        private final b0.b f6589p;

        /* renamed from: q  reason: collision with root package name */
        private final b0.b f6590q;

        /* renamed from: r  reason: collision with root package name */
        androidx.recyclerview.widget.b0 f6591r;

        /* renamed from: s  reason: collision with root package name */
        androidx.recyclerview.widget.b0 f6592s;

        /* renamed from: t  reason: collision with root package name */
        a0 f6593t;

        /* renamed from: u  reason: collision with root package name */
        boolean f6594u;

        /* renamed from: v  reason: collision with root package name */
        boolean f6595v;

        /* renamed from: w  reason: collision with root package name */
        boolean f6596w;

        /* renamed from: x  reason: collision with root package name */
        private boolean f6597x;

        /* renamed from: y  reason: collision with root package name */
        private boolean f6598y;

        /* renamed from: z  reason: collision with root package name */
        int f6599z;

        /* loaded from: classes.dex */
        class a implements b0.b {
            a() {
            }

            @Override // androidx.recyclerview.widget.b0.b
            public View a(int i10) {
                return p.this.U(i10);
            }

            @Override // androidx.recyclerview.widget.b0.b
            public int b(View view) {
                return p.this.c0(view) - ((ViewGroup.MarginLayoutParams) ((q) view.getLayoutParams())).leftMargin;
            }

            @Override // androidx.recyclerview.widget.b0.b
            public int c() {
                return p.this.getPaddingLeft();
            }

            @Override // androidx.recyclerview.widget.b0.b
            public int d() {
                return p.this.w0() - p.this.getPaddingRight();
            }

            @Override // androidx.recyclerview.widget.b0.b
            public int e(View view) {
                return p.this.f0(view) + ((ViewGroup.MarginLayoutParams) ((q) view.getLayoutParams())).rightMargin;
            }
        }

        /* loaded from: classes.dex */
        class b implements b0.b {
            b() {
            }

            @Override // androidx.recyclerview.widget.b0.b
            public View a(int i10) {
                return p.this.U(i10);
            }

            @Override // androidx.recyclerview.widget.b0.b
            public int b(View view) {
                return p.this.g0(view) - ((ViewGroup.MarginLayoutParams) ((q) view.getLayoutParams())).topMargin;
            }

            @Override // androidx.recyclerview.widget.b0.b
            public int c() {
                return p.this.getPaddingTop();
            }

            @Override // androidx.recyclerview.widget.b0.b
            public int d() {
                return p.this.i0() - p.this.getPaddingBottom();
            }

            @Override // androidx.recyclerview.widget.b0.b
            public int e(View view) {
                return p.this.a0(view) + ((ViewGroup.MarginLayoutParams) ((q) view.getLayoutParams())).bottomMargin;
            }
        }

        /* loaded from: classes.dex */
        public interface c {
            void a(int i10, int i11);
        }

        /* loaded from: classes.dex */
        public static class d {

            /* renamed from: a  reason: collision with root package name */
            public int f6602a;

            /* renamed from: b  reason: collision with root package name */
            public int f6603b;

            /* renamed from: c  reason: collision with root package name */
            public boolean f6604c;

            /* renamed from: d  reason: collision with root package name */
            public boolean f6605d;
        }

        public p() {
            a aVar = new a();
            this.f6589p = aVar;
            b bVar = new b();
            this.f6590q = bVar;
            this.f6591r = new androidx.recyclerview.widget.b0(aVar);
            this.f6592s = new androidx.recyclerview.widget.b0(bVar);
            this.f6594u = false;
            this.f6595v = false;
            this.f6596w = false;
            this.f6597x = true;
            this.f6598y = true;
        }

        private boolean B0(RecyclerView recyclerView, int i10, int i11) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int w02 = w0() - getPaddingRight();
            int i02 = i0() - getPaddingBottom();
            Rect rect = this.f6588m.mTempRect;
            b0(focusedChild, rect);
            if (rect.left - i10 >= w02 || rect.right - i10 <= paddingLeft || rect.top - i11 >= i02 || rect.bottom - i11 <= paddingTop) {
                return false;
            }
            return true;
        }

        private static boolean F0(int i10, int i11, int i12) {
            int mode = View.MeasureSpec.getMode(i11);
            int size = View.MeasureSpec.getSize(i11);
            if (i12 > 0 && i10 != i12) {
                return false;
            }
            if (mode != Integer.MIN_VALUE) {
                if (mode == 0) {
                    return true;
                }
                if (mode != 1073741824 || size != i10) {
                    return false;
                }
                return true;
            } else if (size < i10) {
                return false;
            } else {
                return true;
            }
        }

        private void F1(w wVar, int i10, View view) {
            f0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt.shouldIgnore()) {
                if (RecyclerView.sVerboseLoggingEnabled) {
                    Log.d(RecyclerView.TAG, "ignoring view " + childViewHolderInt);
                }
            } else if (childViewHolderInt.isInvalid() && !childViewHolderInt.isRemoved() && !this.f6588m.mAdapter.hasStableIds()) {
                A1(i10);
                wVar.H(childViewHolderInt);
            } else {
                J(i10);
                wVar.I(view);
                this.f6588m.mViewInfoStore.k(childViewHolderInt);
            }
        }

        private void K(int i10, View view) {
            this.f6587f.d(i10);
        }

        /* JADX WARN: Code restructure failed: missing block: B:9:0x0017, code lost:
        
            if (r5 == 1073741824) goto L14;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static int W(int r4, int r5, int r6, int r7, boolean r8) {
            /*
                int r4 = r4 - r6
                r6 = 0
                int r4 = java.lang.Math.max(r6, r4)
                r0 = -2
                r1 = -1
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = 1073741824(0x40000000, float:2.0)
                if (r8 == 0) goto L1a
                if (r7 < 0) goto L11
                goto L1c
            L11:
                if (r7 != r1) goto L2f
                if (r5 == r2) goto L21
                if (r5 == 0) goto L2f
                if (r5 == r3) goto L21
                goto L2f
            L1a:
                if (r7 < 0) goto L1f
            L1c:
                r5 = 1073741824(0x40000000, float:2.0)
                goto L31
            L1f:
                if (r7 != r1) goto L23
            L21:
                r7 = r4
                goto L31
            L23:
                if (r7 != r0) goto L2f
                if (r5 == r2) goto L2c
                if (r5 != r3) goto L2a
                goto L2c
            L2a:
                r5 = 0
                goto L21
            L2c:
                r5 = -2147483648(0xffffffff80000000, float:-0.0)
                goto L21
            L2f:
                r5 = 0
                r7 = 0
            L31:
                int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r5)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.p.W(int, int, int, int, boolean):int");
        }

        private int[] X(View view, Rect rect) {
            int[] iArr = new int[2];
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int w02 = w0() - getPaddingRight();
            int i02 = i0() - getPaddingBottom();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int width = rect.width() + left;
            int height = rect.height() + top;
            int i10 = left - paddingLeft;
            int min = Math.min(0, i10);
            int i11 = top - paddingTop;
            int min2 = Math.min(0, i11);
            int i12 = width - w02;
            int max = Math.max(0, i12);
            int max2 = Math.max(0, height - i02);
            if (l0() == 1) {
                if (max == 0) {
                    max = Math.max(min, i12);
                }
            } else {
                if (min == 0) {
                    min = Math.min(i10, max);
                }
                max = min;
            }
            if (min2 == 0) {
                min2 = Math.min(i11, max2);
            }
            iArr[0] = max;
            iArr[1] = min2;
            return iArr;
        }

        public static d q0(Context context, AttributeSet attributeSet, int i10, int i11) {
            d dVar = new d();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t3.d.f23529a, i10, i11);
            dVar.f6602a = obtainStyledAttributes.getInt(t3.d.f23530b, 1);
            dVar.f6603b = obtainStyledAttributes.getInt(t3.d.f23540l, 1);
            dVar.f6604c = obtainStyledAttributes.getBoolean(t3.d.f23539k, false);
            dVar.f6605d = obtainStyledAttributes.getBoolean(t3.d.f23541m, false);
            obtainStyledAttributes.recycle();
            return dVar;
        }

        private void r(View view, int i10, boolean z10) {
            f0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (!z10 && !childViewHolderInt.isRemoved()) {
                this.f6588m.mViewInfoStore.p(childViewHolderInt);
            } else {
                this.f6588m.mViewInfoStore.b(childViewHolderInt);
            }
            q qVar = (q) view.getLayoutParams();
            if (!childViewHolderInt.wasReturnedFromScrap() && !childViewHolderInt.isScrap()) {
                if (view.getParent() == this.f6588m) {
                    int m10 = this.f6587f.m(view);
                    if (i10 == -1) {
                        i10 = this.f6587f.g();
                    }
                    if (m10 != -1) {
                        if (m10 != i10) {
                            this.f6588m.mLayout.K0(m10, i10);
                        }
                    } else {
                        throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.f6588m.indexOfChild(view) + this.f6588m.exceptionLabel());
                    }
                } else {
                    this.f6587f.a(view, i10, false);
                    qVar.f6608p = true;
                    a0 a0Var = this.f6593t;
                    if (a0Var != null && a0Var.h()) {
                        this.f6593t.k(view);
                    }
                }
            } else {
                if (childViewHolderInt.isScrap()) {
                    childViewHolderInt.unScrap();
                } else {
                    childViewHolderInt.clearReturnedFromScrapFlag();
                }
                this.f6587f.c(view, i10, view.getLayoutParams(), false);
            }
            if (qVar.f6609q) {
                if (RecyclerView.sVerboseLoggingEnabled) {
                    Log.d(RecyclerView.TAG, "consuming pending invalidate on child " + qVar.f6606f);
                }
                childViewHolderInt.itemView.invalidate();
                qVar.f6609q = false;
            }
        }

        public static int z(int i10, int i11, int i12) {
            int mode = View.MeasureSpec.getMode(i10);
            int size = View.MeasureSpec.getSize(i10);
            if (mode != Integer.MIN_VALUE) {
                if (mode != 1073741824) {
                    return Math.max(i11, i12);
                }
                return size;
            }
            return Math.min(size, Math.max(i11, i12));
        }

        public boolean A0() {
            return this.f6596w;
        }

        public void A1(int i10) {
            if (U(i10) != null) {
                this.f6587f.q(i10);
            }
        }

        public boolean B1(RecyclerView recyclerView, View view, Rect rect, boolean z10) {
            return C1(recyclerView, view, rect, z10, false);
        }

        public int C(b0 b0Var) {
            return 0;
        }

        public final boolean C0() {
            return this.f6598y;
        }

        public boolean C1(RecyclerView recyclerView, View view, Rect rect, boolean z10, boolean z11) {
            int[] X = X(view, rect);
            int i10 = X[0];
            int i11 = X[1];
            if ((z11 && !B0(recyclerView, i10, i11)) || (i10 == 0 && i11 == 0)) {
                return false;
            }
            if (z10) {
                recyclerView.scrollBy(i10, i11);
            } else {
                recyclerView.smoothScrollBy(i10, i11);
            }
            return true;
        }

        public int D(b0 b0Var) {
            return 0;
        }

        public boolean D0(w wVar, b0 b0Var) {
            return false;
        }

        public void D1() {
            RecyclerView recyclerView = this.f6588m;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        public int E(b0 b0Var) {
            return 0;
        }

        public boolean E0() {
            return this.f6597x;
        }

        public void E1() {
            this.f6594u = true;
        }

        public int F(b0 b0Var) {
            return 0;
        }

        public int G(b0 b0Var) {
            return 0;
        }

        public boolean G0() {
            a0 a0Var = this.f6593t;
            if (a0Var != null && a0Var.h()) {
                return true;
            }
            return false;
        }

        @SuppressLint({"UnknownNullness"})
        public int G1(int i10, w wVar, b0 b0Var) {
            return 0;
        }

        public int H(b0 b0Var) {
            return 0;
        }

        public boolean H0(View view, boolean z10, boolean z11) {
            boolean z12;
            if (this.f6591r.b(view, 24579) && this.f6592s.b(view, 24579)) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z10) {
                return z12;
            }
            return !z12;
        }

        public void H1(int i10) {
            if (RecyclerView.sVerboseLoggingEnabled) {
                Log.e(RecyclerView.TAG, "You MUST implement scrollToPosition. It will soon become abstract");
            }
        }

        public void I(w wVar) {
            for (int V = V() - 1; V >= 0; V--) {
                F1(wVar, V, U(V));
            }
        }

        public void I0(View view, int i10, int i11, int i12, int i13) {
            q qVar = (q) view.getLayoutParams();
            Rect rect = qVar.f6607m;
            view.layout(i10 + rect.left + ((ViewGroup.MarginLayoutParams) qVar).leftMargin, i11 + rect.top + ((ViewGroup.MarginLayoutParams) qVar).topMargin, (i12 - rect.right) - ((ViewGroup.MarginLayoutParams) qVar).rightMargin, (i13 - rect.bottom) - ((ViewGroup.MarginLayoutParams) qVar).bottomMargin);
        }

        @SuppressLint({"UnknownNullness"})
        public int I1(int i10, w wVar, b0 b0Var) {
            return 0;
        }

        public void J(int i10) {
            K(i10, U(i10));
        }

        public void J0(View view, int i10, int i11) {
            q qVar = (q) view.getLayoutParams();
            Rect itemDecorInsetsForChild = this.f6588m.getItemDecorInsetsForChild(view);
            int i12 = i10 + itemDecorInsetsForChild.left + itemDecorInsetsForChild.right;
            int i13 = i11 + itemDecorInsetsForChild.top + itemDecorInsetsForChild.bottom;
            int W = W(w0(), x0(), getPaddingLeft() + getPaddingRight() + ((ViewGroup.MarginLayoutParams) qVar).leftMargin + ((ViewGroup.MarginLayoutParams) qVar).rightMargin + i12, ((ViewGroup.MarginLayoutParams) qVar).width, w());
            int W2 = W(i0(), j0(), getPaddingTop() + getPaddingBottom() + ((ViewGroup.MarginLayoutParams) qVar).topMargin + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin + i13, ((ViewGroup.MarginLayoutParams) qVar).height, x());
            if (P1(view, W, W2, qVar)) {
                view.measure(W, W2);
            }
        }

        void J1(RecyclerView recyclerView) {
            K1(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        public void K0(int i10, int i11) {
            View U = U(i10);
            if (U != null) {
                J(i10);
                t(U, i11);
                return;
            }
            throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i10 + this.f6588m.toString());
        }

        void K1(int i10, int i11) {
            this.D = View.MeasureSpec.getSize(i10);
            int mode = View.MeasureSpec.getMode(i10);
            this.B = mode;
            if (mode == 0 && !RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
                this.D = 0;
            }
            this.E = View.MeasureSpec.getSize(i11);
            int mode2 = View.MeasureSpec.getMode(i11);
            this.C = mode2;
            if (mode2 == 0 && !RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
                this.E = 0;
            }
        }

        void L(RecyclerView recyclerView) {
            this.f6595v = true;
            P0(recyclerView);
        }

        public void L0(int i10) {
            RecyclerView recyclerView = this.f6588m;
            if (recyclerView != null) {
                recyclerView.offsetChildrenHorizontal(i10);
            }
        }

        public void L1(int i10, int i11) {
            this.f6588m.setMeasuredDimension(i10, i11);
        }

        void M(RecyclerView recyclerView, w wVar) {
            this.f6595v = false;
            R0(recyclerView, wVar);
        }

        public void M0(int i10) {
            RecyclerView recyclerView = this.f6588m;
            if (recyclerView != null) {
                recyclerView.offsetChildrenVertical(i10);
            }
        }

        public void M1(Rect rect, int i10, int i11) {
            L1(z(i10, rect.width() + getPaddingLeft() + getPaddingRight(), o0()), z(i11, rect.height() + getPaddingTop() + getPaddingBottom(), n0()));
        }

        public View N(View view) {
            View findContainingItemView;
            RecyclerView recyclerView = this.f6588m;
            if (recyclerView == null || (findContainingItemView = recyclerView.findContainingItemView(view)) == null || this.f6587f.n(findContainingItemView)) {
                return null;
            }
            return findContainingItemView;
        }

        void N1(int i10, int i11) {
            int V = V();
            if (V == 0) {
                this.f6588m.defaultOnMeasure(i10, i11);
                return;
            }
            int i12 = RecyclerView.UNDEFINED_DURATION;
            int i13 = RecyclerView.UNDEFINED_DURATION;
            int i14 = Integer.MAX_VALUE;
            int i15 = Integer.MAX_VALUE;
            for (int i16 = 0; i16 < V; i16++) {
                View U = U(i16);
                Rect rect = this.f6588m.mTempRect;
                b0(U, rect);
                int i17 = rect.left;
                if (i17 < i14) {
                    i14 = i17;
                }
                int i18 = rect.right;
                if (i18 > i12) {
                    i12 = i18;
                }
                int i19 = rect.top;
                if (i19 < i15) {
                    i15 = i19;
                }
                int i20 = rect.bottom;
                if (i20 > i13) {
                    i13 = i20;
                }
            }
            this.f6588m.mTempRect.set(i14, i15, i12, i13);
            M1(this.f6588m.mTempRect, i10, i11);
        }

        public View O(int i10) {
            int V = V();
            for (int i11 = 0; i11 < V; i11++) {
                View U = U(i11);
                f0 childViewHolderInt = RecyclerView.getChildViewHolderInt(U);
                if (childViewHolderInt != null && childViewHolderInt.getLayoutPosition() == i10 && !childViewHolderInt.shouldIgnore() && (this.f6588m.mState.e() || !childViewHolderInt.isRemoved())) {
                    return U;
                }
            }
            return null;
        }

        public boolean O0(RecyclerView recyclerView, ArrayList<View> arrayList, int i10, int i11) {
            return false;
        }

        void O1(RecyclerView recyclerView) {
            if (recyclerView == null) {
                this.f6588m = null;
                this.f6587f = null;
                this.D = 0;
                this.E = 0;
            } else {
                this.f6588m = recyclerView;
                this.f6587f = recyclerView.mChildHelper;
                this.D = recyclerView.getWidth();
                this.E = recyclerView.getHeight();
            }
            this.B = 1073741824;
            this.C = 1073741824;
        }

        @SuppressLint({"UnknownNullness"})
        public abstract q P();

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean P1(View view, int i10, int i11, q qVar) {
            if (!view.isLayoutRequested() && this.f6597x && F0(view.getWidth(), i10, ((ViewGroup.MarginLayoutParams) qVar).width) && F0(view.getHeight(), i11, ((ViewGroup.MarginLayoutParams) qVar).height)) {
                return false;
            }
            return true;
        }

        @SuppressLint({"UnknownNullness"})
        public q Q(Context context, AttributeSet attributeSet) {
            return new q(context, attributeSet);
        }

        boolean Q1() {
            return false;
        }

        @SuppressLint({"UnknownNullness"})
        public q R(ViewGroup.LayoutParams layoutParams) {
            if (layoutParams instanceof q) {
                return new q((q) layoutParams);
            }
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                return new q((ViewGroup.MarginLayoutParams) layoutParams);
            }
            return new q(layoutParams);
        }

        @SuppressLint({"UnknownNullness"})
        public void R0(RecyclerView recyclerView, w wVar) {
            Q0(recyclerView);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean R1(View view, int i10, int i11, q qVar) {
            if (this.f6597x && F0(view.getMeasuredWidth(), i10, ((ViewGroup.MarginLayoutParams) qVar).width) && F0(view.getMeasuredHeight(), i11, ((ViewGroup.MarginLayoutParams) qVar).height)) {
                return false;
            }
            return true;
        }

        public int S() {
            return -1;
        }

        public View S0(View view, int i10, w wVar, b0 b0Var) {
            return null;
        }

        @SuppressLint({"UnknownNullness"})
        public void S1(RecyclerView recyclerView, b0 b0Var, int i10) {
            Log.e(RecyclerView.TAG, "You must override smoothScrollToPosition to support smooth scrolling");
        }

        public int T(View view) {
            return ((q) view.getLayoutParams()).f6607m.bottom;
        }

        public void T0(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f6588m;
            U0(recyclerView.mRecycler, recyclerView.mState, accessibilityEvent);
        }

        @SuppressLint({"UnknownNullness"})
        public void T1(a0 a0Var) {
            a0 a0Var2 = this.f6593t;
            if (a0Var2 != null && a0Var != a0Var2 && a0Var2.h()) {
                this.f6593t.r();
            }
            this.f6593t = a0Var;
            a0Var.q(this.f6588m, this);
        }

        public View U(int i10) {
            androidx.recyclerview.widget.e eVar = this.f6587f;
            if (eVar != null) {
                return eVar.f(i10);
            }
            return null;
        }

        public void U0(w wVar, b0 b0Var, AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f6588m;
            if (recyclerView != null && accessibilityEvent != null) {
                boolean z10 = true;
                if (!recyclerView.canScrollVertically(1) && !this.f6588m.canScrollVertically(-1) && !this.f6588m.canScrollHorizontally(-1) && !this.f6588m.canScrollHorizontally(1)) {
                    z10 = false;
                }
                accessibilityEvent.setScrollable(z10);
                h hVar = this.f6588m.mAdapter;
                if (hVar != null) {
                    accessibilityEvent.setItemCount(hVar.getItemCount());
                }
            }
        }

        void U1() {
            a0 a0Var = this.f6593t;
            if (a0Var != null) {
                a0Var.r();
            }
        }

        public int V() {
            androidx.recyclerview.widget.e eVar = this.f6587f;
            if (eVar != null) {
                return eVar.g();
            }
            return 0;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void V0(n0 n0Var) {
            RecyclerView recyclerView = this.f6588m;
            W0(recyclerView.mRecycler, recyclerView.mState, n0Var);
        }

        public boolean V1() {
            return false;
        }

        public void W0(w wVar, b0 b0Var, n0 n0Var) {
            if (this.f6588m.canScrollVertically(-1) || this.f6588m.canScrollHorizontally(-1)) {
                n0Var.a(8192);
                n0Var.P0(true);
            }
            if (this.f6588m.canScrollVertically(1) || this.f6588m.canScrollHorizontally(1)) {
                n0Var.a(m.FLAG_APPEARED_IN_PRE_LAYOUT);
                n0Var.P0(true);
            }
            n0Var.p0(n0.f.a(s0(wVar, b0Var), Z(wVar, b0Var), D0(wVar, b0Var), t0(wVar, b0Var)));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void X0(View view, n0 n0Var) {
            f0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt != null && !childViewHolderInt.isRemoved() && !this.f6587f.n(childViewHolderInt.itemView)) {
                RecyclerView recyclerView = this.f6588m;
                Y0(recyclerView.mRecycler, recyclerView.mState, view, n0Var);
            }
        }

        public boolean Y() {
            RecyclerView recyclerView = this.f6588m;
            if (recyclerView != null && recyclerView.mClipToPadding) {
                return true;
            }
            return false;
        }

        public int Z(w wVar, b0 b0Var) {
            return -1;
        }

        public View Z0(View view, int i10) {
            return null;
        }

        public int a0(View view) {
            return view.getBottom() + T(view);
        }

        public void b0(View view, Rect rect) {
            RecyclerView.getDecoratedBoundsWithMarginsInt(view, rect);
        }

        public int c0(View view) {
            return view.getLeft() - m0(view);
        }

        public int d0(View view) {
            Rect rect = ((q) view.getLayoutParams()).f6607m;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        public int e0(View view) {
            Rect rect = ((q) view.getLayoutParams()).f6607m;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        public int f0(View view) {
            return view.getRight() + r0(view);
        }

        public void f1(RecyclerView recyclerView, int i10, int i11, Object obj) {
            e1(recyclerView, i10, i11);
        }

        public int g0(View view) {
            return view.getTop() - u0(view);
        }

        @SuppressLint({"UnknownNullness"})
        public void g1(w wVar, b0 b0Var) {
            Log.e(RecyclerView.TAG, "You must override onLayoutChildren(Recycler recycler, State state) ");
        }

        public int getPaddingBottom() {
            RecyclerView recyclerView = this.f6588m;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        public int getPaddingEnd() {
            RecyclerView recyclerView = this.f6588m;
            if (recyclerView != null) {
                return p0.I(recyclerView);
            }
            return 0;
        }

        public int getPaddingLeft() {
            RecyclerView recyclerView = this.f6588m;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        public int getPaddingRight() {
            RecyclerView recyclerView = this.f6588m;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        public int getPaddingStart() {
            RecyclerView recyclerView = this.f6588m;
            if (recyclerView != null) {
                return p0.J(recyclerView);
            }
            return 0;
        }

        public int getPaddingTop() {
            RecyclerView recyclerView = this.f6588m;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        public View h0() {
            View focusedChild;
            RecyclerView recyclerView = this.f6588m;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.f6587f.n(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        public int i0() {
            return this.E;
        }

        public void i1(w wVar, b0 b0Var, int i10, int i11) {
            this.f6588m.defaultOnMeasure(i10, i11);
        }

        public int j0() {
            return this.C;
        }

        @Deprecated
        public boolean j1(RecyclerView recyclerView, View view, View view2) {
            if (!G0() && !recyclerView.isComputingLayout()) {
                return false;
            }
            return true;
        }

        public int k0() {
            h hVar;
            RecyclerView recyclerView = this.f6588m;
            if (recyclerView != null) {
                hVar = recyclerView.getAdapter();
            } else {
                hVar = null;
            }
            if (hVar != null) {
                return hVar.getItemCount();
            }
            return 0;
        }

        public boolean k1(RecyclerView recyclerView, b0 b0Var, View view, View view2) {
            return j1(recyclerView, view, view2);
        }

        public int l0() {
            return p0.E(this.f6588m);
        }

        public int m0(View view) {
            return ((q) view.getLayoutParams()).f6607m.left;
        }

        public Parcelable m1() {
            return null;
        }

        @SuppressLint({"UnknownNullness"})
        public void n(View view) {
            o(view, -1);
        }

        public int n0() {
            return p0.F(this.f6588m);
        }

        @SuppressLint({"UnknownNullness"})
        public void o(View view, int i10) {
            r(view, i10, true);
        }

        public int o0() {
            return p0.G(this.f6588m);
        }

        void o1(a0 a0Var) {
            if (this.f6593t == a0Var) {
                this.f6593t = null;
            }
        }

        @SuppressLint({"UnknownNullness"})
        public void p(View view) {
            q(view, -1);
        }

        public int p0(View view) {
            return ((q) view.getLayoutParams()).a();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean p1(int i10, Bundle bundle) {
            RecyclerView recyclerView = this.f6588m;
            return q1(recyclerView.mRecycler, recyclerView.mState, i10, bundle);
        }

        @SuppressLint({"UnknownNullness"})
        public void q(View view, int i10) {
            r(view, i10, false);
        }

        public boolean q1(w wVar, b0 b0Var, int i10, Bundle bundle) {
            int i11;
            int paddingLeft;
            int i12;
            int i13;
            if (this.f6588m == null) {
                return false;
            }
            int i02 = i0();
            int w02 = w0();
            Rect rect = new Rect();
            if (this.f6588m.getMatrix().isIdentity() && this.f6588m.getGlobalVisibleRect(rect)) {
                i02 = rect.height();
                w02 = rect.width();
            }
            if (i10 != 4096) {
                if (i10 != 8192) {
                    i13 = 0;
                    i12 = 0;
                } else {
                    if (this.f6588m.canScrollVertically(-1)) {
                        i11 = -((i02 - getPaddingTop()) - getPaddingBottom());
                    } else {
                        i11 = 0;
                    }
                    if (this.f6588m.canScrollHorizontally(-1)) {
                        paddingLeft = -((w02 - getPaddingLeft()) - getPaddingRight());
                        i12 = i11;
                        i13 = paddingLeft;
                    }
                    i12 = i11;
                    i13 = 0;
                }
            } else {
                if (this.f6588m.canScrollVertically(1)) {
                    i11 = (i02 - getPaddingTop()) - getPaddingBottom();
                } else {
                    i11 = 0;
                }
                if (this.f6588m.canScrollHorizontally(1)) {
                    paddingLeft = (w02 - getPaddingLeft()) - getPaddingRight();
                    i12 = i11;
                    i13 = paddingLeft;
                }
                i12 = i11;
                i13 = 0;
            }
            if (i12 == 0 && i13 == 0) {
                return false;
            }
            this.f6588m.smoothScrollBy(i13, i12, null, RecyclerView.UNDEFINED_DURATION, true);
            return true;
        }

        public int r0(View view) {
            return ((q) view.getLayoutParams()).f6607m.right;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean r1(View view, int i10, Bundle bundle) {
            RecyclerView recyclerView = this.f6588m;
            return s1(recyclerView.mRecycler, recyclerView.mState, view, i10, bundle);
        }

        @SuppressLint({"UnknownNullness"})
        public void s(String str) {
            RecyclerView recyclerView = this.f6588m;
            if (recyclerView != null) {
                recyclerView.assertNotInLayoutOrScroll(str);
            }
        }

        public int s0(w wVar, b0 b0Var) {
            return -1;
        }

        public boolean s1(w wVar, b0 b0Var, View view, int i10, Bundle bundle) {
            return false;
        }

        public void t(View view, int i10) {
            u(view, i10, (q) view.getLayoutParams());
        }

        public int t0(w wVar, b0 b0Var) {
            return 0;
        }

        public void t1() {
            for (int V = V() - 1; V >= 0; V--) {
                this.f6587f.q(V);
            }
        }

        public void u(View view, int i10, q qVar) {
            f0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt.isRemoved()) {
                this.f6588m.mViewInfoStore.b(childViewHolderInt);
            } else {
                this.f6588m.mViewInfoStore.p(childViewHolderInt);
            }
            this.f6587f.c(view, i10, qVar, childViewHolderInt.isRemoved());
        }

        public int u0(View view) {
            return ((q) view.getLayoutParams()).f6607m.top;
        }

        public void u1(w wVar) {
            for (int V = V() - 1; V >= 0; V--) {
                if (!RecyclerView.getChildViewHolderInt(U(V)).shouldIgnore()) {
                    x1(V, wVar);
                }
            }
        }

        public void v(View view, Rect rect) {
            RecyclerView recyclerView = this.f6588m;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.getItemDecorInsetsForChild(view));
            }
        }

        public void v0(View view, boolean z10, Rect rect) {
            Matrix matrix;
            if (z10) {
                Rect rect2 = ((q) view.getLayoutParams()).f6607m;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (this.f6588m != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
                RectF rectF = this.f6588m.mTempRectF;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        void v1(w wVar) {
            int j10 = wVar.j();
            for (int i10 = j10 - 1; i10 >= 0; i10--) {
                View n10 = wVar.n(i10);
                f0 childViewHolderInt = RecyclerView.getChildViewHolderInt(n10);
                if (!childViewHolderInt.shouldIgnore()) {
                    childViewHolderInt.setIsRecyclable(false);
                    if (childViewHolderInt.isTmpDetached()) {
                        this.f6588m.removeDetachedView(n10, false);
                    }
                    m mVar = this.f6588m.mItemAnimator;
                    if (mVar != null) {
                        mVar.endAnimation(childViewHolderInt);
                    }
                    childViewHolderInt.setIsRecyclable(true);
                    wVar.D(n10);
                }
            }
            wVar.e();
            if (j10 > 0) {
                this.f6588m.invalidate();
            }
        }

        public boolean w() {
            return false;
        }

        public int w0() {
            return this.D;
        }

        public void w1(View view, w wVar) {
            z1(view);
            wVar.G(view);
        }

        public boolean x() {
            return false;
        }

        public int x0() {
            return this.B;
        }

        public void x1(int i10, w wVar) {
            View U = U(i10);
            A1(i10);
            wVar.G(U);
        }

        public boolean y(q qVar) {
            if (qVar != null) {
                return true;
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean y0() {
            int V = V();
            for (int i10 = 0; i10 < V; i10++) {
                ViewGroup.LayoutParams layoutParams = U(i10).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
            return false;
        }

        public boolean y1(Runnable runnable) {
            RecyclerView recyclerView = this.f6588m;
            if (recyclerView != null) {
                return recyclerView.removeCallbacks(runnable);
            }
            return false;
        }

        public boolean z0() {
            return this.f6595v;
        }

        @SuppressLint({"UnknownNullness"})
        public void z1(View view) {
            this.f6587f.p(view);
        }

        public void P0(RecyclerView recyclerView) {
        }

        @Deprecated
        public void Q0(RecyclerView recyclerView) {
        }

        public void b1(RecyclerView recyclerView) {
        }

        @SuppressLint({"UnknownNullness"})
        public void h1(b0 b0Var) {
        }

        @SuppressLint({"UnknownNullness"})
        public void l1(Parcelable parcelable) {
        }

        public void n1(int i10) {
        }

        @SuppressLint({"UnknownNullness"})
        public void B(int i10, c cVar) {
        }

        public void N0(h hVar, h hVar2) {
        }

        public void a1(RecyclerView recyclerView, int i10, int i11) {
        }

        public void d1(RecyclerView recyclerView, int i10, int i11) {
        }

        public void e1(RecyclerView recyclerView, int i10, int i11) {
        }

        @SuppressLint({"UnknownNullness"})
        public void A(int i10, int i11, b0 b0Var, c cVar) {
        }

        public void Y0(w wVar, b0 b0Var, View view, n0 n0Var) {
        }

        public void c1(RecyclerView recyclerView, int i10, int i11, int i12) {
        }
    }

    /* loaded from: classes.dex */
    public final class w {

        /* renamed from: a  reason: collision with root package name */
        final ArrayList<f0> f6617a;

        /* renamed from: b  reason: collision with root package name */
        ArrayList<f0> f6618b;

        /* renamed from: c  reason: collision with root package name */
        final ArrayList<f0> f6619c;

        /* renamed from: d  reason: collision with root package name */
        private final List<f0> f6620d;

        /* renamed from: e  reason: collision with root package name */
        private int f6621e;

        /* renamed from: f  reason: collision with root package name */
        int f6622f;

        /* renamed from: g  reason: collision with root package name */
        v f6623g;

        public w() {
            ArrayList<f0> arrayList = new ArrayList<>();
            this.f6617a = arrayList;
            this.f6618b = null;
            this.f6619c = new ArrayList<>();
            this.f6620d = Collections.unmodifiableList(arrayList);
            this.f6621e = 2;
            this.f6622f = 2;
        }

        private void B(h<?> hVar) {
            C(hVar, false);
        }

        private void C(h<?> hVar, boolean z10) {
            v vVar = this.f6623g;
            if (vVar != null) {
                vVar.e(hVar, z10);
            }
        }

        private boolean M(f0 f0Var, int i10, int i11, long j10) {
            f0Var.mBindingAdapter = null;
            f0Var.mOwnerRecyclerView = RecyclerView.this;
            int itemViewType = f0Var.getItemViewType();
            long nanoTime = RecyclerView.this.getNanoTime();
            boolean z10 = false;
            if (j10 != RecyclerView.FOREVER_NS && !this.f6623g.m(itemViewType, nanoTime, j10)) {
                return false;
            }
            if (f0Var.isTmpDetached()) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.attachViewToParent(f0Var.itemView, recyclerView.getChildCount(), f0Var.itemView.getLayoutParams());
                z10 = true;
            }
            RecyclerView.this.mAdapter.bindViewHolder(f0Var, i10);
            if (z10) {
                RecyclerView.this.detachViewFromParent(f0Var.itemView);
            }
            this.f6623g.f(f0Var.getItemViewType(), RecyclerView.this.getNanoTime() - nanoTime);
            b(f0Var);
            if (RecyclerView.this.mState.e()) {
                f0Var.mPreLayoutPosition = i11;
            }
            return true;
        }

        private void b(f0 f0Var) {
            if (RecyclerView.this.isAccessibilityEnabled()) {
                View view = f0Var.itemView;
                if (p0.C(view) == 0) {
                    p0.F0(view, 1);
                }
                androidx.recyclerview.widget.w wVar = RecyclerView.this.mAccessibilityDelegate;
                if (wVar == null) {
                    return;
                }
                androidx.core.view.a n10 = wVar.n();
                if (n10 instanceof w.a) {
                    ((w.a) n10).o(view);
                }
                p0.u0(view, n10);
            }
        }

        private void q(ViewGroup viewGroup, boolean z10) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    q((ViewGroup) childAt, true);
                }
            }
            if (!z10) {
                return;
            }
            if (viewGroup.getVisibility() == 4) {
                viewGroup.setVisibility(0);
                viewGroup.setVisibility(4);
                return;
            }
            int visibility = viewGroup.getVisibility();
            viewGroup.setVisibility(4);
            viewGroup.setVisibility(visibility);
        }

        private void r(f0 f0Var) {
            View view = f0Var.itemView;
            if (view instanceof ViewGroup) {
                q((ViewGroup) view, false);
            }
        }

        private void u() {
            if (this.f6623g != null) {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.mAdapter != null && recyclerView.isAttachedToWindow()) {
                    this.f6623g.b(RecyclerView.this.mAdapter);
                }
            }
        }

        void A() {
            for (int i10 = 0; i10 < this.f6619c.size(); i10++) {
                x2.a.b(this.f6619c.get(i10).itemView);
            }
            B(RecyclerView.this.mAdapter);
        }

        void D(View view) {
            f0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            childViewHolderInt.mScrapContainer = null;
            childViewHolderInt.mInChangeScrap = false;
            childViewHolderInt.clearReturnedFromScrapFlag();
            H(childViewHolderInt);
        }

        void E() {
            for (int size = this.f6619c.size() - 1; size >= 0; size--) {
                F(size);
            }
            this.f6619c.clear();
            if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
                RecyclerView.this.mPrefetchRegistry.b();
            }
        }

        void F(int i10) {
            if (RecyclerView.sVerboseLoggingEnabled) {
                Log.d(RecyclerView.TAG, "Recycling cached view at index " + i10);
            }
            f0 f0Var = this.f6619c.get(i10);
            if (RecyclerView.sVerboseLoggingEnabled) {
                Log.d(RecyclerView.TAG, "CachedViewHolder to be recycled: " + f0Var);
            }
            a(f0Var, true);
            this.f6619c.remove(i10);
        }

        public void G(View view) {
            f0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt.isTmpDetached()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (childViewHolderInt.isScrap()) {
                childViewHolderInt.unScrap();
            } else if (childViewHolderInt.wasReturnedFromScrap()) {
                childViewHolderInt.clearReturnedFromScrapFlag();
            }
            H(childViewHolderInt);
            if (RecyclerView.this.mItemAnimator != null && !childViewHolderInt.isRecyclable()) {
                RecyclerView.this.mItemAnimator.endAnimation(childViewHolderInt);
            }
        }

        void H(f0 f0Var) {
            boolean z10;
            boolean z11;
            boolean z12 = false;
            boolean z13 = true;
            if (!f0Var.isScrap() && f0Var.itemView.getParent() == null) {
                if (!f0Var.isTmpDetached()) {
                    if (!f0Var.shouldIgnore()) {
                        boolean doesTransientStatePreventRecycling = f0Var.doesTransientStatePreventRecycling();
                        h hVar = RecyclerView.this.mAdapter;
                        if (hVar != null && doesTransientStatePreventRecycling && hVar.onFailedToRecycleView(f0Var)) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (RecyclerView.sDebugAssertionsEnabled && this.f6619c.contains(f0Var)) {
                            throw new IllegalArgumentException("cached view received recycle internal? " + f0Var + RecyclerView.this.exceptionLabel());
                        }
                        if (!z10 && !f0Var.isRecyclable()) {
                            if (RecyclerView.sVerboseLoggingEnabled) {
                                Log.d(RecyclerView.TAG, "trying to recycle a non-recycleable holder. Hopefully, it will re-visit here. We are still removing it from animation lists" + RecyclerView.this.exceptionLabel());
                            }
                        } else {
                            if (this.f6622f > 0 && !f0Var.hasAnyOfTheFlags(526)) {
                                int size = this.f6619c.size();
                                if (size >= this.f6622f && size > 0) {
                                    F(0);
                                    size--;
                                }
                                if (RecyclerView.ALLOW_THREAD_GAP_WORK && size > 0 && !RecyclerView.this.mPrefetchRegistry.d(f0Var.mPosition)) {
                                    int i10 = size - 1;
                                    while (i10 >= 0) {
                                        if (!RecyclerView.this.mPrefetchRegistry.d(this.f6619c.get(i10).mPosition)) {
                                            break;
                                        }
                                        i10--;
                                    }
                                    size = i10 + 1;
                                }
                                this.f6619c.add(size, f0Var);
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (!z11) {
                                a(f0Var, true);
                                z12 = z11;
                                RecyclerView.this.mViewInfoStore.q(f0Var);
                                if (z12 && !z13 && doesTransientStatePreventRecycling) {
                                    x2.a.b(f0Var.itemView);
                                    f0Var.mBindingAdapter = null;
                                    f0Var.mOwnerRecyclerView = null;
                                    return;
                                }
                                return;
                            }
                            z12 = z11;
                        }
                        z13 = false;
                        RecyclerView.this.mViewInfoStore.q(f0Var);
                        if (z12) {
                            return;
                        }
                        return;
                    }
                    throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + RecyclerView.this.exceptionLabel());
                }
                throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + f0Var + RecyclerView.this.exceptionLabel());
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Scrapped or attached views may not be recycled. isScrap:");
            sb2.append(f0Var.isScrap());
            sb2.append(" isAttached:");
            if (f0Var.itemView.getParent() != null) {
                z12 = true;
            }
            sb2.append(z12);
            sb2.append(RecyclerView.this.exceptionLabel());
            throw new IllegalArgumentException(sb2.toString());
        }

        void I(View view) {
            f0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (!childViewHolderInt.hasAnyOfTheFlags(12) && childViewHolderInt.isUpdated() && !RecyclerView.this.canReuseUpdatedViewHolder(childViewHolderInt)) {
                if (this.f6618b == null) {
                    this.f6618b = new ArrayList<>();
                }
                childViewHolderInt.setScrapContainer(this, true);
                this.f6618b.add(childViewHolderInt);
            } else if (childViewHolderInt.isInvalid() && !childViewHolderInt.isRemoved() && !RecyclerView.this.mAdapter.hasStableIds()) {
                throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + RecyclerView.this.exceptionLabel());
            } else {
                childViewHolderInt.setScrapContainer(this, false);
                this.f6617a.add(childViewHolderInt);
            }
        }

        void J(v vVar) {
            B(RecyclerView.this.mAdapter);
            v vVar2 = this.f6623g;
            if (vVar2 != null) {
                vVar2.d();
            }
            this.f6623g = vVar;
            if (vVar != null && RecyclerView.this.getAdapter() != null) {
                this.f6623g.a();
            }
            u();
        }

        public void L(int i10) {
            this.f6621e = i10;
            P();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX WARN: Removed duplicated region for block: B:103:0x0226 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x005f  */
        /* JADX WARN: Removed duplicated region for block: B:72:0x0175  */
        /* JADX WARN: Removed duplicated region for block: B:96:0x01fc  */
        /* JADX WARN: Removed duplicated region for block: B:97:0x020a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public androidx.recyclerview.widget.RecyclerView.f0 N(int r19, boolean r20, long r21) {
            /*
                Method dump skipped, instructions count: 613
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.w.N(int, boolean, long):androidx.recyclerview.widget.RecyclerView$f0");
        }

        void O(f0 f0Var) {
            if (f0Var.mInChangeScrap) {
                this.f6618b.remove(f0Var);
            } else {
                this.f6617a.remove(f0Var);
            }
            f0Var.mScrapContainer = null;
            f0Var.mInChangeScrap = false;
            f0Var.clearReturnedFromScrapFlag();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void P() {
            int i10;
            p pVar = RecyclerView.this.mLayout;
            if (pVar != null) {
                i10 = pVar.f6599z;
            } else {
                i10 = 0;
            }
            this.f6622f = this.f6621e + i10;
            for (int size = this.f6619c.size() - 1; size >= 0 && this.f6619c.size() > this.f6622f; size--) {
                F(size);
            }
        }

        boolean Q(f0 f0Var) {
            if (f0Var.isRemoved()) {
                if (RecyclerView.sDebugAssertionsEnabled && !RecyclerView.this.mState.e()) {
                    throw new IllegalStateException("should not receive a removed view unless it is pre layout" + RecyclerView.this.exceptionLabel());
                }
                return RecyclerView.this.mState.e();
            }
            int i10 = f0Var.mPosition;
            if (i10 >= 0 && i10 < RecyclerView.this.mAdapter.getItemCount()) {
                if (!RecyclerView.this.mState.e() && RecyclerView.this.mAdapter.getItemViewType(f0Var.mPosition) != f0Var.getItemViewType()) {
                    return false;
                }
                if (RecyclerView.this.mAdapter.hasStableIds() && f0Var.getItemId() != RecyclerView.this.mAdapter.getItemId(f0Var.mPosition)) {
                    return false;
                }
                return true;
            }
            throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + f0Var + RecyclerView.this.exceptionLabel());
        }

        void R(int i10, int i11) {
            int i12;
            int i13 = i11 + i10;
            for (int size = this.f6619c.size() - 1; size >= 0; size--) {
                f0 f0Var = this.f6619c.get(size);
                if (f0Var != null && (i12 = f0Var.mPosition) >= i10 && i12 < i13) {
                    f0Var.addFlags(2);
                    F(size);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void a(f0 f0Var, boolean z10) {
            androidx.core.view.a aVar;
            RecyclerView.clearNestedRecyclerViewIfNotNested(f0Var);
            View view = f0Var.itemView;
            androidx.recyclerview.widget.w wVar = RecyclerView.this.mAccessibilityDelegate;
            if (wVar != null) {
                androidx.core.view.a n10 = wVar.n();
                if (n10 instanceof w.a) {
                    aVar = ((w.a) n10).n(view);
                } else {
                    aVar = null;
                }
                p0.u0(view, aVar);
            }
            if (z10) {
                g(f0Var);
            }
            f0Var.mBindingAdapter = null;
            f0Var.mOwnerRecyclerView = null;
            i().k(f0Var);
        }

        public void c() {
            this.f6617a.clear();
            E();
        }

        void d() {
            int size = this.f6619c.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f6619c.get(i10).clearOldPosition();
            }
            int size2 = this.f6617a.size();
            for (int i11 = 0; i11 < size2; i11++) {
                this.f6617a.get(i11).clearOldPosition();
            }
            ArrayList<f0> arrayList = this.f6618b;
            if (arrayList != null) {
                int size3 = arrayList.size();
                for (int i12 = 0; i12 < size3; i12++) {
                    this.f6618b.get(i12).clearOldPosition();
                }
            }
        }

        void e() {
            this.f6617a.clear();
            ArrayList<f0> arrayList = this.f6618b;
            if (arrayList != null) {
                arrayList.clear();
            }
        }

        public int f(int i10) {
            if (i10 >= 0 && i10 < RecyclerView.this.mState.b()) {
                if (!RecyclerView.this.mState.e()) {
                    return i10;
                }
                return RecyclerView.this.mAdapterHelper.m(i10);
            }
            throw new IndexOutOfBoundsException("invalid position " + i10 + ". State item count is " + RecyclerView.this.mState.b() + RecyclerView.this.exceptionLabel());
        }

        void g(f0 f0Var) {
            x xVar = RecyclerView.this.mRecyclerListener;
            if (xVar != null) {
                xVar.a(f0Var);
            }
            int size = RecyclerView.this.mRecyclerListeners.size();
            for (int i10 = 0; i10 < size; i10++) {
                RecyclerView.this.mRecyclerListeners.get(i10).a(f0Var);
            }
            h hVar = RecyclerView.this.mAdapter;
            if (hVar != null) {
                hVar.onViewRecycled(f0Var);
            }
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mState != null) {
                recyclerView.mViewInfoStore.q(f0Var);
            }
            if (RecyclerView.sVerboseLoggingEnabled) {
                Log.d(RecyclerView.TAG, "dispatchViewRecycled: " + f0Var);
            }
        }

        f0 h(int i10) {
            int size;
            int m10;
            ArrayList<f0> arrayList = this.f6618b;
            if (arrayList != null && (size = arrayList.size()) != 0) {
                for (int i11 = 0; i11 < size; i11++) {
                    f0 f0Var = this.f6618b.get(i11);
                    if (!f0Var.wasReturnedFromScrap() && f0Var.getLayoutPosition() == i10) {
                        f0Var.addFlags(32);
                        return f0Var;
                    }
                }
                if (RecyclerView.this.mAdapter.hasStableIds() && (m10 = RecyclerView.this.mAdapterHelper.m(i10)) > 0 && m10 < RecyclerView.this.mAdapter.getItemCount()) {
                    long itemId = RecyclerView.this.mAdapter.getItemId(m10);
                    for (int i12 = 0; i12 < size; i12++) {
                        f0 f0Var2 = this.f6618b.get(i12);
                        if (!f0Var2.wasReturnedFromScrap() && f0Var2.getItemId() == itemId) {
                            f0Var2.addFlags(32);
                            return f0Var2;
                        }
                    }
                }
            }
            return null;
        }

        v i() {
            if (this.f6623g == null) {
                this.f6623g = new v();
                u();
            }
            return this.f6623g;
        }

        int j() {
            return this.f6617a.size();
        }

        public List<f0> k() {
            return this.f6620d;
        }

        f0 l(long j10, int i10, boolean z10) {
            for (int size = this.f6617a.size() - 1; size >= 0; size--) {
                f0 f0Var = this.f6617a.get(size);
                if (f0Var.getItemId() == j10 && !f0Var.wasReturnedFromScrap()) {
                    if (i10 == f0Var.getItemViewType()) {
                        f0Var.addFlags(32);
                        if (f0Var.isRemoved() && !RecyclerView.this.mState.e()) {
                            f0Var.setFlags(2, 14);
                        }
                        return f0Var;
                    } else if (!z10) {
                        this.f6617a.remove(size);
                        RecyclerView.this.removeDetachedView(f0Var.itemView, false);
                        D(f0Var.itemView);
                    }
                }
            }
            int size2 = this.f6619c.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    return null;
                }
                f0 f0Var2 = this.f6619c.get(size2);
                if (f0Var2.getItemId() == j10 && !f0Var2.isAttachedToTransitionOverlay()) {
                    if (i10 == f0Var2.getItemViewType()) {
                        if (!z10) {
                            this.f6619c.remove(size2);
                        }
                        return f0Var2;
                    } else if (!z10) {
                        F(size2);
                        return null;
                    }
                }
            }
        }

        f0 m(int i10, boolean z10) {
            View e10;
            int size = this.f6617a.size();
            for (int i11 = 0; i11 < size; i11++) {
                f0 f0Var = this.f6617a.get(i11);
                if (!f0Var.wasReturnedFromScrap() && f0Var.getLayoutPosition() == i10 && !f0Var.isInvalid() && (RecyclerView.this.mState.f6561h || !f0Var.isRemoved())) {
                    f0Var.addFlags(32);
                    return f0Var;
                }
            }
            if (!z10 && (e10 = RecyclerView.this.mChildHelper.e(i10)) != null) {
                f0 childViewHolderInt = RecyclerView.getChildViewHolderInt(e10);
                RecyclerView.this.mChildHelper.s(e10);
                int m10 = RecyclerView.this.mChildHelper.m(e10);
                if (m10 != -1) {
                    RecyclerView.this.mChildHelper.d(m10);
                    I(e10);
                    childViewHolderInt.addFlags(8224);
                    return childViewHolderInt;
                }
                throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + childViewHolderInt + RecyclerView.this.exceptionLabel());
            }
            int size2 = this.f6619c.size();
            for (int i12 = 0; i12 < size2; i12++) {
                f0 f0Var2 = this.f6619c.get(i12);
                if (!f0Var2.isInvalid() && f0Var2.getLayoutPosition() == i10 && !f0Var2.isAttachedToTransitionOverlay()) {
                    if (!z10) {
                        this.f6619c.remove(i12);
                    }
                    if (RecyclerView.sVerboseLoggingEnabled) {
                        Log.d(RecyclerView.TAG, "getScrapOrHiddenOrCachedHolderForPosition(" + i10 + ") found match in cache: " + f0Var2);
                    }
                    return f0Var2;
                }
            }
            return null;
        }

        View n(int i10) {
            return this.f6617a.get(i10).itemView;
        }

        public View o(int i10) {
            return p(i10, false);
        }

        View p(int i10, boolean z10) {
            return N(i10, z10, RecyclerView.FOREVER_NS).itemView;
        }

        void s() {
            int size = this.f6619c.size();
            for (int i10 = 0; i10 < size; i10++) {
                q qVar = (q) this.f6619c.get(i10).itemView.getLayoutParams();
                if (qVar != null) {
                    qVar.f6608p = true;
                }
            }
        }

        void t() {
            int size = this.f6619c.size();
            for (int i10 = 0; i10 < size; i10++) {
                f0 f0Var = this.f6619c.get(i10);
                if (f0Var != null) {
                    f0Var.addFlags(6);
                    f0Var.addChangePayload(null);
                }
            }
            h hVar = RecyclerView.this.mAdapter;
            if (hVar == null || !hVar.hasStableIds()) {
                E();
            }
        }

        void v(int i10, int i11) {
            int size = this.f6619c.size();
            for (int i12 = 0; i12 < size; i12++) {
                f0 f0Var = this.f6619c.get(i12);
                if (f0Var != null && f0Var.mPosition >= i10) {
                    if (RecyclerView.sVerboseLoggingEnabled) {
                        Log.d(RecyclerView.TAG, "offsetPositionRecordsForInsert cached " + i12 + " holder " + f0Var + " now at position " + (f0Var.mPosition + i11));
                    }
                    f0Var.offsetPosition(i11, false);
                }
            }
        }

        void w(int i10, int i11) {
            int i12;
            int i13;
            int i14;
            int i15;
            if (i10 < i11) {
                i12 = -1;
                i14 = i10;
                i13 = i11;
            } else {
                i12 = 1;
                i13 = i10;
                i14 = i11;
            }
            int size = this.f6619c.size();
            for (int i16 = 0; i16 < size; i16++) {
                f0 f0Var = this.f6619c.get(i16);
                if (f0Var != null && (i15 = f0Var.mPosition) >= i14 && i15 <= i13) {
                    if (i15 == i10) {
                        f0Var.offsetPosition(i11 - i10, false);
                    } else {
                        f0Var.offsetPosition(i12, false);
                    }
                    if (RecyclerView.sVerboseLoggingEnabled) {
                        Log.d(RecyclerView.TAG, "offsetPositionRecordsForMove cached child " + i16 + " holder " + f0Var);
                    }
                }
            }
        }

        void x(int i10, int i11, boolean z10) {
            int i12 = i10 + i11;
            for (int size = this.f6619c.size() - 1; size >= 0; size--) {
                f0 f0Var = this.f6619c.get(size);
                if (f0Var != null) {
                    int i13 = f0Var.mPosition;
                    if (i13 >= i12) {
                        if (RecyclerView.sVerboseLoggingEnabled) {
                            Log.d(RecyclerView.TAG, "offsetPositionRecordsForRemove cached " + size + " holder " + f0Var + " now at position " + (f0Var.mPosition - i11));
                        }
                        f0Var.offsetPosition(-i11, z10);
                    } else if (i13 >= i10) {
                        f0Var.addFlags(8);
                        F(size);
                    }
                }
            }
        }

        void y(h<?> hVar, h<?> hVar2, boolean z10) {
            c();
            C(hVar, true);
            i().j(hVar, hVar2, z10);
            u();
        }

        void z() {
            u();
        }

        void K(d0 d0Var) {
        }
    }

    /* loaded from: classes.dex */
    public static class z implements t {
        @Override // androidx.recyclerview.widget.RecyclerView.t
        public boolean onInterceptTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
            return false;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public void onRequestDisallowInterceptTouchEvent(boolean z10) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public void onTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
        }
    }

    public void onChildAttachedToWindow(View view) {
    }

    public void onChildDetachedFromWindow(View view) {
    }

    public void onScrollStateChanged(int i10) {
    }

    /* loaded from: classes.dex */
    public static abstract class u {
        public void onScrollStateChanged(RecyclerView recyclerView, int i10) {
        }

        public void onScrolled(RecyclerView recyclerView, int i10, int i11) {
        }
    }

    public void onScrolled(int i10, int i11) {
    }
}
