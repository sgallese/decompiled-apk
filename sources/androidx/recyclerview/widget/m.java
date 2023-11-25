package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.Interpolator;
import androidx.core.view.p0;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ItemTouchHelper.java */
/* loaded from: classes.dex */
public class m extends RecyclerView.o implements RecyclerView.r {
    private f A;
    private Rect C;
    private long D;

    /* renamed from: d  reason: collision with root package name */
    float f6865d;

    /* renamed from: e  reason: collision with root package name */
    float f6866e;

    /* renamed from: f  reason: collision with root package name */
    private float f6867f;

    /* renamed from: g  reason: collision with root package name */
    private float f6868g;

    /* renamed from: h  reason: collision with root package name */
    float f6869h;

    /* renamed from: i  reason: collision with root package name */
    float f6870i;

    /* renamed from: j  reason: collision with root package name */
    private float f6871j;

    /* renamed from: k  reason: collision with root package name */
    private float f6872k;

    /* renamed from: m  reason: collision with root package name */
    e f6874m;

    /* renamed from: o  reason: collision with root package name */
    int f6876o;

    /* renamed from: q  reason: collision with root package name */
    private int f6878q;

    /* renamed from: r  reason: collision with root package name */
    RecyclerView f6879r;

    /* renamed from: t  reason: collision with root package name */
    VelocityTracker f6881t;

    /* renamed from: u  reason: collision with root package name */
    private List<RecyclerView.f0> f6882u;

    /* renamed from: v  reason: collision with root package name */
    private List<Integer> f6883v;

    /* renamed from: z  reason: collision with root package name */
    androidx.core.view.o f6887z;

    /* renamed from: a  reason: collision with root package name */
    final List<View> f6862a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private final float[] f6863b = new float[2];

    /* renamed from: c  reason: collision with root package name */
    RecyclerView.f0 f6864c = null;

    /* renamed from: l  reason: collision with root package name */
    int f6873l = -1;

    /* renamed from: n  reason: collision with root package name */
    private int f6875n = 0;

    /* renamed from: p  reason: collision with root package name */
    List<g> f6877p = new ArrayList();

    /* renamed from: s  reason: collision with root package name */
    final Runnable f6880s = new a();

    /* renamed from: w  reason: collision with root package name */
    private RecyclerView.k f6884w = null;

    /* renamed from: x  reason: collision with root package name */
    View f6885x = null;

    /* renamed from: y  reason: collision with root package name */
    int f6886y = -1;
    private final RecyclerView.t B = new b();

    /* compiled from: ItemTouchHelper.java */
    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            m mVar = m.this;
            if (mVar.f6864c != null && mVar.v()) {
                m mVar2 = m.this;
                RecyclerView.f0 f0Var = mVar2.f6864c;
                if (f0Var != null) {
                    mVar2.q(f0Var);
                }
                m mVar3 = m.this;
                mVar3.f6879r.removeCallbacks(mVar3.f6880s);
                p0.m0(m.this.f6879r, this);
            }
        }
    }

    /* compiled from: ItemTouchHelper.java */
    /* loaded from: classes.dex */
    class b implements RecyclerView.t {
        b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public boolean onInterceptTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
            int findPointerIndex;
            g j10;
            m.this.f6887z.a(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                m.this.f6873l = motionEvent.getPointerId(0);
                m.this.f6865d = motionEvent.getX();
                m.this.f6866e = motionEvent.getY();
                m.this.r();
                m mVar = m.this;
                if (mVar.f6864c == null && (j10 = mVar.j(motionEvent)) != null) {
                    m mVar2 = m.this;
                    mVar2.f6865d -= j10.f6907j;
                    mVar2.f6866e -= j10.f6908k;
                    mVar2.i(j10.f6902e, true);
                    if (m.this.f6862a.remove(j10.f6902e.itemView)) {
                        m mVar3 = m.this;
                        mVar3.f6874m.clearView(mVar3.f6879r, j10.f6902e);
                    }
                    m.this.w(j10.f6902e, j10.f6903f);
                    m mVar4 = m.this;
                    mVar4.B(motionEvent, mVar4.f6876o, 0);
                }
            } else if (actionMasked != 3 && actionMasked != 1) {
                int i10 = m.this.f6873l;
                if (i10 != -1 && (findPointerIndex = motionEvent.findPointerIndex(i10)) >= 0) {
                    m.this.f(actionMasked, motionEvent, findPointerIndex);
                }
            } else {
                m mVar5 = m.this;
                mVar5.f6873l = -1;
                mVar5.w(null, 0);
            }
            VelocityTracker velocityTracker = m.this.f6881t;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            if (m.this.f6864c != null) {
                return true;
            }
            return false;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public void onRequestDisallowInterceptTouchEvent(boolean z10) {
            if (!z10) {
                return;
            }
            m.this.w(null, 0);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public void onTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
            m.this.f6887z.a(motionEvent);
            VelocityTracker velocityTracker = m.this.f6881t;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            if (m.this.f6873l == -1) {
                return;
            }
            int actionMasked = motionEvent.getActionMasked();
            int findPointerIndex = motionEvent.findPointerIndex(m.this.f6873l);
            if (findPointerIndex >= 0) {
                m.this.f(actionMasked, motionEvent, findPointerIndex);
            }
            m mVar = m.this;
            RecyclerView.f0 f0Var = mVar.f6864c;
            if (f0Var == null) {
                return;
            }
            int i10 = 0;
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked == 6) {
                            int actionIndex = motionEvent.getActionIndex();
                            int pointerId = motionEvent.getPointerId(actionIndex);
                            m mVar2 = m.this;
                            if (pointerId == mVar2.f6873l) {
                                if (actionIndex == 0) {
                                    i10 = 1;
                                }
                                mVar2.f6873l = motionEvent.getPointerId(i10);
                                m mVar3 = m.this;
                                mVar3.B(motionEvent, mVar3.f6876o, actionIndex);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    VelocityTracker velocityTracker2 = mVar.f6881t;
                    if (velocityTracker2 != null) {
                        velocityTracker2.clear();
                    }
                } else if (findPointerIndex >= 0) {
                    mVar.B(motionEvent, mVar.f6876o, findPointerIndex);
                    m.this.q(f0Var);
                    m mVar4 = m.this;
                    mVar4.f6879r.removeCallbacks(mVar4.f6880s);
                    m.this.f6880s.run();
                    m.this.f6879r.invalidate();
                    return;
                } else {
                    return;
                }
            }
            m.this.w(null, 0);
            m.this.f6873l = -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ItemTouchHelper.java */
    /* loaded from: classes.dex */
    public class c extends g {

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ int f6890o;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ RecyclerView.f0 f6891p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(RecyclerView.f0 f0Var, int i10, int i11, float f10, float f11, float f12, float f13, int i12, RecyclerView.f0 f0Var2) {
            super(f0Var, i10, i11, f10, f11, f12, f13);
            this.f6890o = i12;
            this.f6891p = f0Var2;
        }

        @Override // androidx.recyclerview.widget.m.g, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (this.f6909l) {
                return;
            }
            if (this.f6890o <= 0) {
                m mVar = m.this;
                mVar.f6874m.clearView(mVar.f6879r, this.f6891p);
            } else {
                m.this.f6862a.add(this.f6891p.itemView);
                this.f6906i = true;
                int i10 = this.f6890o;
                if (i10 > 0) {
                    m.this.s(this, i10);
                }
            }
            m mVar2 = m.this;
            View view = mVar2.f6885x;
            View view2 = this.f6891p.itemView;
            if (view == view2) {
                mVar2.u(view2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ItemTouchHelper.java */
    /* loaded from: classes.dex */
    public class d implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ g f6893f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ int f6894m;

        d(g gVar, int i10) {
            this.f6893f = gVar;
            this.f6894m = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = m.this.f6879r;
            if (recyclerView != null && recyclerView.isAttachedToWindow()) {
                g gVar = this.f6893f;
                if (!gVar.f6909l && gVar.f6902e.getAbsoluteAdapterPosition() != -1) {
                    RecyclerView.m itemAnimator = m.this.f6879r.getItemAnimator();
                    if ((itemAnimator == null || !itemAnimator.isRunning(null)) && !m.this.o()) {
                        m.this.f6874m.onSwiped(this.f6893f.f6902e, this.f6894m);
                    } else {
                        m.this.f6879r.post(this);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ItemTouchHelper.java */
    /* loaded from: classes.dex */
    public class f extends GestureDetector.SimpleOnGestureListener {

        /* renamed from: a  reason: collision with root package name */
        private boolean f6896a = true;

        f() {
        }

        void a() {
            this.f6896a = false;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
            View k10;
            RecyclerView.f0 childViewHolder;
            if (this.f6896a && (k10 = m.this.k(motionEvent)) != null && (childViewHolder = m.this.f6879r.getChildViewHolder(k10)) != null) {
                m mVar = m.this;
                if (!mVar.f6874m.hasDragFlag(mVar.f6879r, childViewHolder)) {
                    return;
                }
                int pointerId = motionEvent.getPointerId(0);
                int i10 = m.this.f6873l;
                if (pointerId == i10) {
                    int findPointerIndex = motionEvent.findPointerIndex(i10);
                    float x10 = motionEvent.getX(findPointerIndex);
                    float y10 = motionEvent.getY(findPointerIndex);
                    m mVar2 = m.this;
                    mVar2.f6865d = x10;
                    mVar2.f6866e = y10;
                    mVar2.f6870i = 0.0f;
                    mVar2.f6869h = 0.0f;
                    if (mVar2.f6874m.isLongPressDragEnabled()) {
                        m.this.w(childViewHolder, 2);
                    }
                }
            }
        }
    }

    /* compiled from: ItemTouchHelper.java */
    /* loaded from: classes.dex */
    public interface h {
        void h(View view, View view2, int i10, int i11);
    }

    public m(e eVar) {
        this.f6874m = eVar;
    }

    private int A(RecyclerView.f0 f0Var) {
        if (this.f6875n == 2) {
            return 0;
        }
        int movementFlags = this.f6874m.getMovementFlags(this.f6879r, f0Var);
        int convertToAbsoluteDirection = (this.f6874m.convertToAbsoluteDirection(movementFlags, p0.E(this.f6879r)) & 65280) >> 8;
        if (convertToAbsoluteDirection == 0) {
            return 0;
        }
        int i10 = (movementFlags & 65280) >> 8;
        if (Math.abs(this.f6869h) > Math.abs(this.f6870i)) {
            int e10 = e(f0Var, convertToAbsoluteDirection);
            if (e10 > 0) {
                if ((i10 & e10) == 0) {
                    return e.convertToRelativeDirection(e10, p0.E(this.f6879r));
                }
                return e10;
            }
            int g10 = g(f0Var, convertToAbsoluteDirection);
            if (g10 > 0) {
                return g10;
            }
        } else {
            int g11 = g(f0Var, convertToAbsoluteDirection);
            if (g11 > 0) {
                return g11;
            }
            int e11 = e(f0Var, convertToAbsoluteDirection);
            if (e11 > 0) {
                if ((i10 & e11) == 0) {
                    return e.convertToRelativeDirection(e11, p0.E(this.f6879r));
                }
                return e11;
            }
        }
        return 0;
    }

    private int e(RecyclerView.f0 f0Var, int i10) {
        int i11;
        if ((i10 & 12) != 0) {
            int i12 = 8;
            if (this.f6869h > 0.0f) {
                i11 = 8;
            } else {
                i11 = 4;
            }
            VelocityTracker velocityTracker = this.f6881t;
            if (velocityTracker != null && this.f6873l > -1) {
                velocityTracker.computeCurrentVelocity(1000, this.f6874m.getSwipeVelocityThreshold(this.f6868g));
                float xVelocity = this.f6881t.getXVelocity(this.f6873l);
                float yVelocity = this.f6881t.getYVelocity(this.f6873l);
                if (xVelocity <= 0.0f) {
                    i12 = 4;
                }
                float abs = Math.abs(xVelocity);
                if ((i12 & i10) != 0 && i11 == i12 && abs >= this.f6874m.getSwipeEscapeVelocity(this.f6867f) && abs > Math.abs(yVelocity)) {
                    return i12;
                }
            }
            float width = this.f6879r.getWidth() * this.f6874m.getSwipeThreshold(f0Var);
            if ((i10 & i11) != 0 && Math.abs(this.f6869h) > width) {
                return i11;
            }
            return 0;
        }
        return 0;
    }

    private int g(RecyclerView.f0 f0Var, int i10) {
        int i11;
        if ((i10 & 3) != 0) {
            int i12 = 2;
            if (this.f6870i > 0.0f) {
                i11 = 2;
            } else {
                i11 = 1;
            }
            VelocityTracker velocityTracker = this.f6881t;
            if (velocityTracker != null && this.f6873l > -1) {
                velocityTracker.computeCurrentVelocity(1000, this.f6874m.getSwipeVelocityThreshold(this.f6868g));
                float xVelocity = this.f6881t.getXVelocity(this.f6873l);
                float yVelocity = this.f6881t.getYVelocity(this.f6873l);
                if (yVelocity <= 0.0f) {
                    i12 = 1;
                }
                float abs = Math.abs(yVelocity);
                if ((i12 & i10) != 0 && i12 == i11 && abs >= this.f6874m.getSwipeEscapeVelocity(this.f6867f) && abs > Math.abs(xVelocity)) {
                    return i12;
                }
            }
            float height = this.f6879r.getHeight() * this.f6874m.getSwipeThreshold(f0Var);
            if ((i10 & i11) != 0 && Math.abs(this.f6870i) > height) {
                return i11;
            }
            return 0;
        }
        return 0;
    }

    private void h() {
        this.f6879r.removeItemDecoration(this);
        this.f6879r.removeOnItemTouchListener(this.B);
        this.f6879r.removeOnChildAttachStateChangeListener(this);
        for (int size = this.f6877p.size() - 1; size >= 0; size--) {
            g gVar = this.f6877p.get(0);
            gVar.a();
            this.f6874m.clearView(this.f6879r, gVar.f6902e);
        }
        this.f6877p.clear();
        this.f6885x = null;
        this.f6886y = -1;
        t();
        z();
    }

    private List<RecyclerView.f0> l(RecyclerView.f0 f0Var) {
        RecyclerView.f0 f0Var2 = f0Var;
        List<RecyclerView.f0> list = this.f6882u;
        if (list == null) {
            this.f6882u = new ArrayList();
            this.f6883v = new ArrayList();
        } else {
            list.clear();
            this.f6883v.clear();
        }
        int boundingBoxMargin = this.f6874m.getBoundingBoxMargin();
        int round = Math.round(this.f6871j + this.f6869h) - boundingBoxMargin;
        int round2 = Math.round(this.f6872k + this.f6870i) - boundingBoxMargin;
        int i10 = boundingBoxMargin * 2;
        int width = f0Var2.itemView.getWidth() + round + i10;
        int height = f0Var2.itemView.getHeight() + round2 + i10;
        int i11 = (round + width) / 2;
        int i12 = (round2 + height) / 2;
        RecyclerView.p layoutManager = this.f6879r.getLayoutManager();
        int V = layoutManager.V();
        int i13 = 0;
        while (i13 < V) {
            View U = layoutManager.U(i13);
            if (U != f0Var2.itemView && U.getBottom() >= round2 && U.getTop() <= height && U.getRight() >= round && U.getLeft() <= width) {
                RecyclerView.f0 childViewHolder = this.f6879r.getChildViewHolder(U);
                if (this.f6874m.canDropOver(this.f6879r, this.f6864c, childViewHolder)) {
                    int abs = Math.abs(i11 - ((U.getLeft() + U.getRight()) / 2));
                    int abs2 = Math.abs(i12 - ((U.getTop() + U.getBottom()) / 2));
                    int i14 = (abs * abs) + (abs2 * abs2);
                    int size = this.f6882u.size();
                    int i15 = 0;
                    for (int i16 = 0; i16 < size && i14 > this.f6883v.get(i16).intValue(); i16++) {
                        i15++;
                    }
                    this.f6882u.add(i15, childViewHolder);
                    this.f6883v.add(i15, Integer.valueOf(i14));
                }
            }
            i13++;
            f0Var2 = f0Var;
        }
        return this.f6882u;
    }

    private RecyclerView.f0 m(MotionEvent motionEvent) {
        View k10;
        RecyclerView.p layoutManager = this.f6879r.getLayoutManager();
        int i10 = this.f6873l;
        if (i10 == -1) {
            return null;
        }
        int findPointerIndex = motionEvent.findPointerIndex(i10);
        float x10 = motionEvent.getX(findPointerIndex) - this.f6865d;
        float y10 = motionEvent.getY(findPointerIndex) - this.f6866e;
        float abs = Math.abs(x10);
        float abs2 = Math.abs(y10);
        int i11 = this.f6878q;
        if (abs < i11 && abs2 < i11) {
            return null;
        }
        if (abs > abs2 && layoutManager.w()) {
            return null;
        }
        if ((abs2 > abs && layoutManager.x()) || (k10 = k(motionEvent)) == null) {
            return null;
        }
        return this.f6879r.getChildViewHolder(k10);
    }

    private void n(float[] fArr) {
        if ((this.f6876o & 12) != 0) {
            fArr[0] = (this.f6871j + this.f6869h) - this.f6864c.itemView.getLeft();
        } else {
            fArr[0] = this.f6864c.itemView.getTranslationX();
        }
        if ((this.f6876o & 3) != 0) {
            fArr[1] = (this.f6872k + this.f6870i) - this.f6864c.itemView.getTop();
        } else {
            fArr[1] = this.f6864c.itemView.getTranslationY();
        }
    }

    private static boolean p(View view, float f10, float f11, float f12, float f13) {
        if (f10 >= f12 && f10 <= f12 + view.getWidth() && f11 >= f13 && f11 <= f13 + view.getHeight()) {
            return true;
        }
        return false;
    }

    private void t() {
        VelocityTracker velocityTracker = this.f6881t;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f6881t = null;
        }
    }

    private void x() {
        this.f6878q = ViewConfiguration.get(this.f6879r.getContext()).getScaledTouchSlop();
        this.f6879r.addItemDecoration(this);
        this.f6879r.addOnItemTouchListener(this.B);
        this.f6879r.addOnChildAttachStateChangeListener(this);
        y();
    }

    private void y() {
        this.A = new f();
        this.f6887z = new androidx.core.view.o(this.f6879r.getContext(), this.A);
    }

    private void z() {
        f fVar = this.A;
        if (fVar != null) {
            fVar.a();
            this.A = null;
        }
        if (this.f6887z != null) {
            this.f6887z = null;
        }
    }

    void B(MotionEvent motionEvent, int i10, int i11) {
        float x10 = motionEvent.getX(i11);
        float y10 = motionEvent.getY(i11);
        float f10 = x10 - this.f6865d;
        this.f6869h = f10;
        this.f6870i = y10 - this.f6866e;
        if ((i10 & 4) == 0) {
            this.f6869h = Math.max(0.0f, f10);
        }
        if ((i10 & 8) == 0) {
            this.f6869h = Math.min(0.0f, this.f6869h);
        }
        if ((i10 & 1) == 0) {
            this.f6870i = Math.max(0.0f, this.f6870i);
        }
        if ((i10 & 2) == 0) {
            this.f6870i = Math.min(0.0f, this.f6870i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public void a(View view) {
        u(view);
        RecyclerView.f0 childViewHolder = this.f6879r.getChildViewHolder(view);
        if (childViewHolder == null) {
            return;
        }
        RecyclerView.f0 f0Var = this.f6864c;
        if (f0Var != null && childViewHolder == f0Var) {
            w(null, 0);
            return;
        }
        i(childViewHolder, false);
        if (this.f6862a.remove(childViewHolder.itemView)) {
            this.f6874m.clearView(this.f6879r, childViewHolder);
        }
    }

    public void d(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f6879r;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            h();
        }
        this.f6879r = recyclerView;
        if (recyclerView != null) {
            Resources resources = recyclerView.getResources();
            this.f6867f = resources.getDimension(t3.b.f23527f);
            this.f6868g = resources.getDimension(t3.b.f23526e);
            x();
        }
    }

    void f(int i10, MotionEvent motionEvent, int i11) {
        RecyclerView.f0 m10;
        int absoluteMovementFlags;
        if (this.f6864c != null || i10 != 2 || this.f6875n == 2 || !this.f6874m.isItemViewSwipeEnabled() || this.f6879r.getScrollState() == 1 || (m10 = m(motionEvent)) == null || (absoluteMovementFlags = (this.f6874m.getAbsoluteMovementFlags(this.f6879r, m10) & 65280) >> 8) == 0) {
            return;
        }
        float x10 = motionEvent.getX(i11);
        float y10 = motionEvent.getY(i11);
        float f10 = x10 - this.f6865d;
        float f11 = y10 - this.f6866e;
        float abs = Math.abs(f10);
        float abs2 = Math.abs(f11);
        int i12 = this.f6878q;
        if (abs < i12 && abs2 < i12) {
            return;
        }
        if (abs > abs2) {
            if (f10 < 0.0f && (absoluteMovementFlags & 4) == 0) {
                return;
            }
            if (f10 > 0.0f && (absoluteMovementFlags & 8) == 0) {
                return;
            }
        } else if (f11 < 0.0f && (absoluteMovementFlags & 1) == 0) {
            return;
        } else {
            if (f11 > 0.0f && (absoluteMovementFlags & 2) == 0) {
                return;
            }
        }
        this.f6870i = 0.0f;
        this.f6869h = 0.0f;
        this.f6873l = motionEvent.getPointerId(0);
        w(m10, 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    @SuppressLint({"UnknownNullness"})
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.b0 b0Var) {
        rect.setEmpty();
    }

    void i(RecyclerView.f0 f0Var, boolean z10) {
        for (int size = this.f6877p.size() - 1; size >= 0; size--) {
            g gVar = this.f6877p.get(size);
            if (gVar.f6902e == f0Var) {
                gVar.f6909l |= z10;
                if (!gVar.f6910m) {
                    gVar.a();
                }
                this.f6877p.remove(size);
                return;
            }
        }
    }

    g j(MotionEvent motionEvent) {
        if (this.f6877p.isEmpty()) {
            return null;
        }
        View k10 = k(motionEvent);
        for (int size = this.f6877p.size() - 1; size >= 0; size--) {
            g gVar = this.f6877p.get(size);
            if (gVar.f6902e.itemView == k10) {
                return gVar;
            }
        }
        return null;
    }

    View k(MotionEvent motionEvent) {
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        RecyclerView.f0 f0Var = this.f6864c;
        if (f0Var != null) {
            View view = f0Var.itemView;
            if (p(view, x10, y10, this.f6871j + this.f6869h, this.f6872k + this.f6870i)) {
                return view;
            }
        }
        for (int size = this.f6877p.size() - 1; size >= 0; size--) {
            g gVar = this.f6877p.get(size);
            View view2 = gVar.f6902e.itemView;
            if (p(view2, x10, y10, gVar.f6907j, gVar.f6908k)) {
                return view2;
            }
        }
        return this.f6879r.findChildViewUnder(x10, y10);
    }

    boolean o() {
        int size = this.f6877p.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!this.f6877p.get(i10).f6910m) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    @SuppressLint({"UnknownNullness"})
    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.b0 b0Var) {
        float f10;
        float f11;
        this.f6886y = -1;
        if (this.f6864c != null) {
            n(this.f6863b);
            float[] fArr = this.f6863b;
            float f12 = fArr[0];
            f11 = fArr[1];
            f10 = f12;
        } else {
            f10 = 0.0f;
            f11 = 0.0f;
        }
        this.f6874m.onDraw(canvas, recyclerView, this.f6864c, this.f6877p, this.f6875n, f10, f11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.b0 b0Var) {
        float f10;
        float f11;
        if (this.f6864c != null) {
            n(this.f6863b);
            float[] fArr = this.f6863b;
            float f12 = fArr[0];
            f11 = fArr[1];
            f10 = f12;
        } else {
            f10 = 0.0f;
            f11 = 0.0f;
        }
        this.f6874m.onDrawOver(canvas, recyclerView, this.f6864c, this.f6877p, this.f6875n, f10, f11);
    }

    void q(RecyclerView.f0 f0Var) {
        if (this.f6879r.isLayoutRequested() || this.f6875n != 2) {
            return;
        }
        float moveThreshold = this.f6874m.getMoveThreshold(f0Var);
        int i10 = (int) (this.f6871j + this.f6869h);
        int i11 = (int) (this.f6872k + this.f6870i);
        if (Math.abs(i11 - f0Var.itemView.getTop()) < f0Var.itemView.getHeight() * moveThreshold && Math.abs(i10 - f0Var.itemView.getLeft()) < f0Var.itemView.getWidth() * moveThreshold) {
            return;
        }
        List<RecyclerView.f0> l10 = l(f0Var);
        if (l10.size() == 0) {
            return;
        }
        RecyclerView.f0 chooseDropTarget = this.f6874m.chooseDropTarget(f0Var, l10, i10, i11);
        if (chooseDropTarget == null) {
            this.f6882u.clear();
            this.f6883v.clear();
            return;
        }
        int absoluteAdapterPosition = chooseDropTarget.getAbsoluteAdapterPosition();
        int absoluteAdapterPosition2 = f0Var.getAbsoluteAdapterPosition();
        if (this.f6874m.onMove(this.f6879r, f0Var, chooseDropTarget)) {
            this.f6874m.onMoved(this.f6879r, f0Var, absoluteAdapterPosition2, chooseDropTarget, absoluteAdapterPosition, i10, i11);
        }
    }

    void r() {
        VelocityTracker velocityTracker = this.f6881t;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.f6881t = VelocityTracker.obtain();
    }

    void s(g gVar, int i10) {
        this.f6879r.post(new d(gVar, i10));
    }

    void u(View view) {
        if (view == this.f6885x) {
            this.f6885x = null;
            if (this.f6884w != null) {
                this.f6879r.setChildDrawingOrderCallback(null);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c1, code lost:
    
        if (r1 > 0) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0100 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x010c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    boolean v() {
        /*
            Method dump skipped, instructions count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.m.v():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0137  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void w(androidx.recyclerview.widget.RecyclerView.f0 r24, int r25) {
        /*
            Method dump skipped, instructions count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.m.w(androidx.recyclerview.widget.RecyclerView$f0, int):void");
    }

    private void c() {
    }

    /* compiled from: ItemTouchHelper.java */
    /* loaded from: classes.dex */
    public static abstract class e {
        private static final int ABS_HORIZONTAL_DIR_FLAGS = 789516;
        public static final int DEFAULT_DRAG_ANIMATION_DURATION = 200;
        public static final int DEFAULT_SWIPE_ANIMATION_DURATION = 250;
        private static final long DRAG_SCROLL_ACCELERATION_LIMIT_TIME_MS = 2000;
        static final int RELATIVE_DIR_FLAGS = 3158064;
        private static final Interpolator sDragScrollInterpolator = new a();
        private static final Interpolator sDragViewScrollCapInterpolator = new b();
        private int mCachedMaxScrollSpeed = -1;

        /* compiled from: ItemTouchHelper.java */
        /* loaded from: classes.dex */
        class a implements Interpolator {
            a() {
            }

            @Override // android.animation.TimeInterpolator
            public float getInterpolation(float f10) {
                return f10 * f10 * f10 * f10 * f10;
            }
        }

        /* compiled from: ItemTouchHelper.java */
        /* loaded from: classes.dex */
        class b implements Interpolator {
            b() {
            }

            @Override // android.animation.TimeInterpolator
            public float getInterpolation(float f10) {
                float f11 = f10 - 1.0f;
                return (f11 * f11 * f11 * f11 * f11) + 1.0f;
            }
        }

        public static int convertToRelativeDirection(int i10, int i11) {
            int i12;
            int i13 = i10 & ABS_HORIZONTAL_DIR_FLAGS;
            if (i13 == 0) {
                return i10;
            }
            int i14 = i10 & (~i13);
            if (i11 == 0) {
                i12 = i13 << 2;
            } else {
                int i15 = i13 << 1;
                i14 |= (-789517) & i15;
                i12 = (i15 & ABS_HORIZONTAL_DIR_FLAGS) << 2;
            }
            return i14 | i12;
        }

        public static n getDefaultUIUtil() {
            return o.f6913a;
        }

        private int getMaxDragScroll(RecyclerView recyclerView) {
            if (this.mCachedMaxScrollSpeed == -1) {
                this.mCachedMaxScrollSpeed = recyclerView.getResources().getDimensionPixelSize(t3.b.f23525d);
            }
            return this.mCachedMaxScrollSpeed;
        }

        public static int makeFlag(int i10, int i11) {
            return i11 << (i10 * 8);
        }

        public static int makeMovementFlags(int i10, int i11) {
            return makeFlag(2, i10) | makeFlag(1, i11) | makeFlag(0, i11 | i10);
        }

        public boolean canDropOver(RecyclerView recyclerView, RecyclerView.f0 f0Var, RecyclerView.f0 f0Var2) {
            return true;
        }

        @SuppressLint({"UnknownNullness"})
        public RecyclerView.f0 chooseDropTarget(RecyclerView.f0 f0Var, List<RecyclerView.f0> list, int i10, int i11) {
            int bottom;
            int abs;
            int top;
            int abs2;
            int left;
            int abs3;
            int right;
            int abs4;
            int width = i10 + f0Var.itemView.getWidth();
            int height = i11 + f0Var.itemView.getHeight();
            int left2 = i10 - f0Var.itemView.getLeft();
            int top2 = i11 - f0Var.itemView.getTop();
            int size = list.size();
            RecyclerView.f0 f0Var2 = null;
            int i12 = -1;
            for (int i13 = 0; i13 < size; i13++) {
                RecyclerView.f0 f0Var3 = list.get(i13);
                if (left2 > 0 && (right = f0Var3.itemView.getRight() - width) < 0 && f0Var3.itemView.getRight() > f0Var.itemView.getRight() && (abs4 = Math.abs(right)) > i12) {
                    f0Var2 = f0Var3;
                    i12 = abs4;
                }
                if (left2 < 0 && (left = f0Var3.itemView.getLeft() - i10) > 0 && f0Var3.itemView.getLeft() < f0Var.itemView.getLeft() && (abs3 = Math.abs(left)) > i12) {
                    f0Var2 = f0Var3;
                    i12 = abs3;
                }
                if (top2 < 0 && (top = f0Var3.itemView.getTop() - i11) > 0 && f0Var3.itemView.getTop() < f0Var.itemView.getTop() && (abs2 = Math.abs(top)) > i12) {
                    f0Var2 = f0Var3;
                    i12 = abs2;
                }
                if (top2 > 0 && (bottom = f0Var3.itemView.getBottom() - height) < 0 && f0Var3.itemView.getBottom() > f0Var.itemView.getBottom() && (abs = Math.abs(bottom)) > i12) {
                    f0Var2 = f0Var3;
                    i12 = abs;
                }
            }
            return f0Var2;
        }

        public void clearView(RecyclerView recyclerView, RecyclerView.f0 f0Var) {
            o.f6913a.a(f0Var.itemView);
        }

        public int convertToAbsoluteDirection(int i10, int i11) {
            int i12;
            int i13 = i10 & RELATIVE_DIR_FLAGS;
            if (i13 == 0) {
                return i10;
            }
            int i14 = i10 & (~i13);
            if (i11 == 0) {
                i12 = i13 >> 2;
            } else {
                int i15 = i13 >> 1;
                i14 |= (-3158065) & i15;
                i12 = (i15 & RELATIVE_DIR_FLAGS) >> 2;
            }
            return i14 | i12;
        }

        final int getAbsoluteMovementFlags(RecyclerView recyclerView, RecyclerView.f0 f0Var) {
            return convertToAbsoluteDirection(getMovementFlags(recyclerView, f0Var), p0.E(recyclerView));
        }

        public long getAnimationDuration(RecyclerView recyclerView, int i10, float f10, float f11) {
            RecyclerView.m itemAnimator = recyclerView.getItemAnimator();
            if (itemAnimator == null) {
                if (i10 == 8) {
                    return 200L;
                }
                return 250L;
            } else if (i10 == 8) {
                return itemAnimator.getMoveDuration();
            } else {
                return itemAnimator.getRemoveDuration();
            }
        }

        public int getBoundingBoxMargin() {
            return 0;
        }

        public float getMoveThreshold(RecyclerView.f0 f0Var) {
            return 0.5f;
        }

        public abstract int getMovementFlags(RecyclerView recyclerView, RecyclerView.f0 f0Var);

        public float getSwipeThreshold(RecyclerView.f0 f0Var) {
            return 0.5f;
        }

        boolean hasDragFlag(RecyclerView recyclerView, RecyclerView.f0 f0Var) {
            if ((getAbsoluteMovementFlags(recyclerView, f0Var) & 16711680) != 0) {
                return true;
            }
            return false;
        }

        boolean hasSwipeFlag(RecyclerView recyclerView, RecyclerView.f0 f0Var) {
            if ((getAbsoluteMovementFlags(recyclerView, f0Var) & 65280) != 0) {
                return true;
            }
            return false;
        }

        public int interpolateOutOfBoundsScroll(RecyclerView recyclerView, int i10, int i11, int i12, long j10) {
            int maxDragScroll = getMaxDragScroll(recyclerView);
            float f10 = 1.0f;
            int signum = (int) (((int) Math.signum(i11)) * maxDragScroll * sDragViewScrollCapInterpolator.getInterpolation(Math.min(1.0f, (Math.abs(i11) * 1.0f) / i10)));
            if (j10 <= DRAG_SCROLL_ACCELERATION_LIMIT_TIME_MS) {
                f10 = ((float) j10) / 2000.0f;
            }
            int interpolation = (int) (signum * sDragScrollInterpolator.getInterpolation(f10));
            if (interpolation == 0) {
                if (i11 > 0) {
                    return 1;
                }
                return -1;
            }
            return interpolation;
        }

        public boolean isItemViewSwipeEnabled() {
            return true;
        }

        public boolean isLongPressDragEnabled() {
            return true;
        }

        public void onChildDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.f0 f0Var, float f10, float f11, int i10, boolean z10) {
            o.f6913a.d(canvas, recyclerView, f0Var.itemView, f10, f11, i10, z10);
        }

        public void onChildDrawOver(Canvas canvas, RecyclerView recyclerView, @SuppressLint({"UnknownNullness"}) RecyclerView.f0 f0Var, float f10, float f11, int i10, boolean z10) {
            o.f6913a.c(canvas, recyclerView, f0Var.itemView, f10, f11, i10, z10);
        }

        void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.f0 f0Var, List<g> list, int i10, float f10, float f11) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                g gVar = list.get(i11);
                gVar.e();
                int save = canvas.save();
                onChildDraw(canvas, recyclerView, gVar.f6902e, gVar.f6907j, gVar.f6908k, gVar.f6903f, false);
                canvas.restoreToCount(save);
            }
            if (f0Var != null) {
                int save2 = canvas.save();
                onChildDraw(canvas, recyclerView, f0Var, f10, f11, i10, true);
                canvas.restoreToCount(save2);
            }
        }

        void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.f0 f0Var, List<g> list, int i10, float f10, float f11) {
            int size = list.size();
            boolean z10 = false;
            for (int i11 = 0; i11 < size; i11++) {
                g gVar = list.get(i11);
                int save = canvas.save();
                onChildDrawOver(canvas, recyclerView, gVar.f6902e, gVar.f6907j, gVar.f6908k, gVar.f6903f, false);
                canvas.restoreToCount(save);
            }
            if (f0Var != null) {
                int save2 = canvas.save();
                onChildDrawOver(canvas, recyclerView, f0Var, f10, f11, i10, true);
                canvas.restoreToCount(save2);
            }
            for (int i12 = size - 1; i12 >= 0; i12--) {
                g gVar2 = list.get(i12);
                boolean z11 = gVar2.f6910m;
                if (z11 && !gVar2.f6906i) {
                    list.remove(i12);
                } else if (!z11) {
                    z10 = true;
                }
            }
            if (z10) {
                recyclerView.invalidate();
            }
        }

        public abstract boolean onMove(RecyclerView recyclerView, RecyclerView.f0 f0Var, RecyclerView.f0 f0Var2);

        public void onMoved(RecyclerView recyclerView, RecyclerView.f0 f0Var, int i10, RecyclerView.f0 f0Var2, int i11, int i12, int i13) {
            RecyclerView.p layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof h) {
                ((h) layoutManager).h(f0Var.itemView, f0Var2.itemView, i12, i13);
                return;
            }
            if (layoutManager.w()) {
                if (layoutManager.c0(f0Var2.itemView) <= recyclerView.getPaddingLeft()) {
                    recyclerView.scrollToPosition(i11);
                }
                if (layoutManager.f0(f0Var2.itemView) >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                    recyclerView.scrollToPosition(i11);
                }
            }
            if (layoutManager.x()) {
                if (layoutManager.g0(f0Var2.itemView) <= recyclerView.getPaddingTop()) {
                    recyclerView.scrollToPosition(i11);
                }
                if (layoutManager.a0(f0Var2.itemView) >= recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                    recyclerView.scrollToPosition(i11);
                }
            }
        }

        public void onSelectedChanged(RecyclerView.f0 f0Var, int i10) {
            if (f0Var != null) {
                o.f6913a.b(f0Var.itemView);
            }
        }

        public abstract void onSwiped(RecyclerView.f0 f0Var, int i10);

        public float getSwipeEscapeVelocity(float f10) {
            return f10;
        }

        public float getSwipeVelocityThreshold(float f10) {
            return f10;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ItemTouchHelper.java */
    /* loaded from: classes.dex */
    public static class g implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        final float f6898a;

        /* renamed from: b  reason: collision with root package name */
        final float f6899b;

        /* renamed from: c  reason: collision with root package name */
        final float f6900c;

        /* renamed from: d  reason: collision with root package name */
        final float f6901d;

        /* renamed from: e  reason: collision with root package name */
        final RecyclerView.f0 f6902e;

        /* renamed from: f  reason: collision with root package name */
        final int f6903f;

        /* renamed from: g  reason: collision with root package name */
        final ValueAnimator f6904g;

        /* renamed from: h  reason: collision with root package name */
        final int f6905h;

        /* renamed from: i  reason: collision with root package name */
        boolean f6906i;

        /* renamed from: j  reason: collision with root package name */
        float f6907j;

        /* renamed from: k  reason: collision with root package name */
        float f6908k;

        /* renamed from: l  reason: collision with root package name */
        boolean f6909l = false;

        /* renamed from: m  reason: collision with root package name */
        boolean f6910m = false;

        /* renamed from: n  reason: collision with root package name */
        private float f6911n;

        /* compiled from: ItemTouchHelper.java */
        /* loaded from: classes.dex */
        class a implements ValueAnimator.AnimatorUpdateListener {
            a() {
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                g.this.c(valueAnimator.getAnimatedFraction());
            }
        }

        g(RecyclerView.f0 f0Var, int i10, int i11, float f10, float f11, float f12, float f13) {
            this.f6903f = i11;
            this.f6905h = i10;
            this.f6902e = f0Var;
            this.f6898a = f10;
            this.f6899b = f11;
            this.f6900c = f12;
            this.f6901d = f13;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f6904g = ofFloat;
            ofFloat.addUpdateListener(new a());
            ofFloat.setTarget(f0Var.itemView);
            ofFloat.addListener(this);
            c(0.0f);
        }

        public void a() {
            this.f6904g.cancel();
        }

        public void b(long j10) {
            this.f6904g.setDuration(j10);
        }

        public void c(float f10) {
            this.f6911n = f10;
        }

        public void d() {
            this.f6902e.setIsRecyclable(false);
            this.f6904g.start();
        }

        public void e() {
            float f10 = this.f6898a;
            float f11 = this.f6900c;
            if (f10 == f11) {
                this.f6907j = this.f6902e.itemView.getTranslationX();
            } else {
                this.f6907j = f10 + (this.f6911n * (f11 - f10));
            }
            float f12 = this.f6899b;
            float f13 = this.f6901d;
            if (f12 == f13) {
                this.f6908k = this.f6902e.itemView.getTranslationY();
            } else {
                this.f6908k = f12 + (this.f6911n * (f13 - f12));
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            c(1.0f);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.f6910m) {
                this.f6902e.setIsRecyclable(true);
            }
            this.f6910m = true;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public void b(View view) {
    }
}
