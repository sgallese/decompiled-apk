package androidx.viewpager2.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.accessibility.n0;
import androidx.core.view.accessibility.s0;
import androidx.core.view.p0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.v;

/* loaded from: classes.dex */
public final class ViewPager2 extends ViewGroup {
    static boolean H = true;
    private androidx.viewpager2.widget.c A;
    private androidx.viewpager2.widget.d B;
    private RecyclerView.m C;
    private boolean D;
    private boolean E;
    private int F;
    e G;

    /* renamed from: f  reason: collision with root package name */
    private final Rect f7325f;

    /* renamed from: m  reason: collision with root package name */
    private final Rect f7326m;

    /* renamed from: p  reason: collision with root package name */
    private androidx.viewpager2.widget.b f7327p;

    /* renamed from: q  reason: collision with root package name */
    int f7328q;

    /* renamed from: r  reason: collision with root package name */
    boolean f7329r;

    /* renamed from: s  reason: collision with root package name */
    private RecyclerView.j f7330s;

    /* renamed from: t  reason: collision with root package name */
    LinearLayoutManager f7331t;

    /* renamed from: u  reason: collision with root package name */
    private int f7332u;

    /* renamed from: v  reason: collision with root package name */
    private Parcelable f7333v;

    /* renamed from: w  reason: collision with root package name */
    RecyclerView f7334w;

    /* renamed from: x  reason: collision with root package name */
    private v f7335x;

    /* renamed from: y  reason: collision with root package name */
    androidx.viewpager2.widget.e f7336y;

    /* renamed from: z  reason: collision with root package name */
    private androidx.viewpager2.widget.b f7337z;

    /* loaded from: classes.dex */
    class a extends g {
        a() {
            super(null);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.g, androidx.recyclerview.widget.RecyclerView.j
        public void onChanged() {
            ViewPager2 viewPager2 = ViewPager2.this;
            viewPager2.f7329r = true;
            viewPager2.f7336y.j();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b extends i {
        b() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.i
        public void onPageScrollStateChanged(int i10) {
            if (i10 == 0) {
                ViewPager2.this.o();
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.i
        public void onPageSelected(int i10) {
            ViewPager2 viewPager2 = ViewPager2.this;
            if (viewPager2.f7328q != i10) {
                viewPager2.f7328q = i10;
                viewPager2.G.r();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c extends i {
        c() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.i
        public void onPageSelected(int i10) {
            ViewPager2.this.clearFocus();
            if (ViewPager2.this.hasFocus()) {
                ViewPager2.this.f7334w.requestFocus(2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public abstract class e {
        private e() {
        }

        boolean a() {
            return false;
        }

        boolean b(int i10) {
            return false;
        }

        boolean c(int i10, Bundle bundle) {
            return false;
        }

        boolean d() {
            return false;
        }

        String g() {
            throw new IllegalStateException("Not implemented.");
        }

        boolean l(int i10) {
            throw new IllegalStateException("Not implemented.");
        }

        boolean m(int i10, Bundle bundle) {
            throw new IllegalStateException("Not implemented.");
        }

        CharSequence o() {
            throw new IllegalStateException("Not implemented.");
        }

        /* synthetic */ e(ViewPager2 viewPager2, a aVar) {
            this();
        }

        void n() {
        }

        void q() {
        }

        void r() {
        }

        void s() {
        }

        void t() {
        }

        void e(RecyclerView.h<?> hVar) {
        }

        void f(RecyclerView.h<?> hVar) {
        }

        void i(AccessibilityNodeInfo accessibilityNodeInfo) {
        }

        void j(n0 n0Var) {
        }

        void p(AccessibilityEvent accessibilityEvent) {
        }

        void h(androidx.viewpager2.widget.b bVar, RecyclerView recyclerView) {
        }

        void k(View view, n0 n0Var) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class f extends e {
        f() {
            super(ViewPager2.this, null);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public boolean b(int i10) {
            if ((i10 == 8192 || i10 == 4096) && !ViewPager2.this.e()) {
                return true;
            }
            return false;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public boolean d() {
            return true;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void j(n0 n0Var) {
            if (!ViewPager2.this.e()) {
                n0Var.f0(n0.a.f4090r);
                n0Var.f0(n0.a.f4089q);
                n0Var.P0(false);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public boolean l(int i10) {
            if (b(i10)) {
                return false;
            }
            throw new IllegalStateException();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public CharSequence o() {
            if (d()) {
                return "androidx.viewpager.widget.ViewPager";
            }
            throw new IllegalStateException();
        }
    }

    /* loaded from: classes.dex */
    private static abstract class g extends RecyclerView.j {
        private g() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public abstract void onChanged();

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void onItemRangeChanged(int i10, int i11) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void onItemRangeInserted(int i10, int i11) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void onItemRangeMoved(int i10, int i11, int i12) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void onItemRangeRemoved(int i10, int i11) {
            onChanged();
        }

        /* synthetic */ g(a aVar) {
            this();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void onItemRangeChanged(int i10, int i11, Object obj) {
            onChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class h extends LinearLayoutManager {
        h(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.p
        public boolean C1(RecyclerView recyclerView, View view, Rect rect, boolean z10, boolean z11) {
            return false;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.p
        public void W0(RecyclerView.w wVar, RecyclerView.b0 b0Var, n0 n0Var) {
            super.W0(wVar, b0Var, n0Var);
            ViewPager2.this.G.j(n0Var);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.recyclerview.widget.LinearLayoutManager
        public void W1(RecyclerView.b0 b0Var, int[] iArr) {
            int offscreenPageLimit = ViewPager2.this.getOffscreenPageLimit();
            if (offscreenPageLimit == -1) {
                super.W1(b0Var, iArr);
                return;
            }
            int pageSize = ViewPager2.this.getPageSize() * offscreenPageLimit;
            iArr[0] = pageSize;
            iArr[1] = pageSize;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.p
        public void Y0(RecyclerView.w wVar, RecyclerView.b0 b0Var, View view, n0 n0Var) {
            ViewPager2.this.G.k(view, n0Var);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.p
        public boolean q1(RecyclerView.w wVar, RecyclerView.b0 b0Var, int i10, Bundle bundle) {
            if (ViewPager2.this.G.b(i10)) {
                return ViewPager2.this.G.l(i10);
            }
            return super.q1(wVar, b0Var, i10, bundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class j extends e {

        /* renamed from: b  reason: collision with root package name */
        private final s0 f7347b;

        /* renamed from: c  reason: collision with root package name */
        private final s0 f7348c;

        /* renamed from: d  reason: collision with root package name */
        private RecyclerView.j f7349d;

        /* loaded from: classes.dex */
        class a implements s0 {
            a() {
            }

            @Override // androidx.core.view.accessibility.s0
            public boolean a(View view, s0.a aVar) {
                j.this.x(((ViewPager2) view).getCurrentItem() + 1);
                return true;
            }
        }

        /* loaded from: classes.dex */
        class b implements s0 {
            b() {
            }

            @Override // androidx.core.view.accessibility.s0
            public boolean a(View view, s0.a aVar) {
                j.this.x(((ViewPager2) view).getCurrentItem() - 1);
                return true;
            }
        }

        /* loaded from: classes.dex */
        class c extends g {
            c() {
                super(null);
            }

            @Override // androidx.viewpager2.widget.ViewPager2.g, androidx.recyclerview.widget.RecyclerView.j
            public void onChanged() {
                j.this.y();
            }
        }

        j() {
            super(ViewPager2.this, null);
            this.f7347b = new a();
            this.f7348c = new b();
        }

        private void u(n0 n0Var) {
            int i10;
            int i11;
            if (ViewPager2.this.getAdapter() != null) {
                i11 = 1;
                if (ViewPager2.this.getOrientation() == 1) {
                    i11 = ViewPager2.this.getAdapter().getItemCount();
                    i10 = 1;
                } else {
                    i10 = ViewPager2.this.getAdapter().getItemCount();
                }
            } else {
                i10 = 0;
                i11 = 0;
            }
            n0Var.p0(n0.f.a(i11, i10, false, 0));
        }

        private void v(View view, n0 n0Var) {
            int i10;
            int i11;
            if (ViewPager2.this.getOrientation() == 1) {
                i10 = ViewPager2.this.f7331t.p0(view);
            } else {
                i10 = 0;
            }
            if (ViewPager2.this.getOrientation() == 0) {
                i11 = ViewPager2.this.f7331t.p0(view);
            } else {
                i11 = 0;
            }
            n0Var.q0(n0.g.a(i10, 1, i11, 1, false, false));
        }

        private void w(n0 n0Var) {
            int itemCount;
            RecyclerView.h adapter = ViewPager2.this.getAdapter();
            if (adapter != null && (itemCount = adapter.getItemCount()) != 0 && ViewPager2.this.e()) {
                if (ViewPager2.this.f7328q > 0) {
                    n0Var.a(8192);
                }
                if (ViewPager2.this.f7328q < itemCount - 1) {
                    n0Var.a(RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT);
                }
                n0Var.P0(true);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public boolean a() {
            return true;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public boolean c(int i10, Bundle bundle) {
            if (i10 != 8192 && i10 != 4096) {
                return false;
            }
            return true;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void e(RecyclerView.h<?> hVar) {
            y();
            if (hVar != null) {
                hVar.registerAdapterDataObserver(this.f7349d);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void f(RecyclerView.h<?> hVar) {
            if (hVar != null) {
                hVar.unregisterAdapterDataObserver(this.f7349d);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public String g() {
            if (a()) {
                return "androidx.viewpager.widget.ViewPager";
            }
            throw new IllegalStateException();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void h(androidx.viewpager2.widget.b bVar, RecyclerView recyclerView) {
            p0.F0(recyclerView, 2);
            this.f7349d = new c();
            if (p0.C(ViewPager2.this) == 0) {
                p0.F0(ViewPager2.this, 1);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void i(AccessibilityNodeInfo accessibilityNodeInfo) {
            n0 e12 = n0.e1(accessibilityNodeInfo);
            u(e12);
            w(e12);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        void k(View view, n0 n0Var) {
            v(view, n0Var);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public boolean m(int i10, Bundle bundle) {
            int currentItem;
            if (c(i10, bundle)) {
                if (i10 == 8192) {
                    currentItem = ViewPager2.this.getCurrentItem() - 1;
                } else {
                    currentItem = ViewPager2.this.getCurrentItem() + 1;
                }
                x(currentItem);
                return true;
            }
            throw new IllegalStateException();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void n() {
            y();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void p(AccessibilityEvent accessibilityEvent) {
            accessibilityEvent.setSource(ViewPager2.this);
            accessibilityEvent.setClassName(g());
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void q() {
            y();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void r() {
            y();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void s() {
            y();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void t() {
            y();
        }

        void x(int i10) {
            if (ViewPager2.this.e()) {
                ViewPager2.this.k(i10, true);
            }
        }

        void y() {
            int itemCount;
            int i10;
            ViewPager2 viewPager2 = ViewPager2.this;
            int i11 = 16908360;
            p0.o0(viewPager2, 16908360);
            p0.o0(viewPager2, 16908361);
            p0.o0(viewPager2, 16908358);
            p0.o0(viewPager2, 16908359);
            if (ViewPager2.this.getAdapter() == null || (itemCount = ViewPager2.this.getAdapter().getItemCount()) == 0 || !ViewPager2.this.e()) {
                return;
            }
            if (ViewPager2.this.getOrientation() == 0) {
                boolean d10 = ViewPager2.this.d();
                if (d10) {
                    i10 = 16908360;
                } else {
                    i10 = 16908361;
                }
                if (d10) {
                    i11 = 16908361;
                }
                if (ViewPager2.this.f7328q < itemCount - 1) {
                    p0.q0(viewPager2, new n0.a(i10, null), null, this.f7347b);
                }
                if (ViewPager2.this.f7328q > 0) {
                    p0.q0(viewPager2, new n0.a(i11, null), null, this.f7348c);
                    return;
                }
                return;
            }
            if (ViewPager2.this.f7328q < itemCount - 1) {
                p0.q0(viewPager2, new n0.a(16908359, null), null, this.f7347b);
            }
            if (ViewPager2.this.f7328q > 0) {
                p0.q0(viewPager2, new n0.a(16908358, null), null, this.f7348c);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface k {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class l extends v {
        l() {
        }

        @Override // androidx.recyclerview.widget.v, androidx.recyclerview.widget.z
        public View f(RecyclerView.p pVar) {
            if (ViewPager2.this.c()) {
                return null;
            }
            return super.f(pVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class m extends RecyclerView {
        m(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
        public CharSequence getAccessibilityClassName() {
            if (ViewPager2.this.G.d()) {
                return ViewPager2.this.G.o();
            }
            return super.getAccessibilityClassName();
        }

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setFromIndex(ViewPager2.this.f7328q);
            accessibilityEvent.setToIndex(ViewPager2.this.f7328q);
            ViewPager2.this.G.p(accessibilityEvent);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (ViewPager2.this.e() && super.onInterceptTouchEvent(motionEvent)) {
                return true;
            }
            return false;
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouchEvent(MotionEvent motionEvent) {
            if (ViewPager2.this.e() && super.onTouchEvent(motionEvent)) {
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class n implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        private final int f7356f;

        /* renamed from: m  reason: collision with root package name */
        private final RecyclerView f7357m;

        n(int i10, RecyclerView recyclerView) {
            this.f7356f = i10;
            this.f7357m = recyclerView;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f7357m.smoothScrollToPosition(this.f7356f);
        }
    }

    public ViewPager2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7325f = new Rect();
        this.f7326m = new Rect();
        this.f7327p = new androidx.viewpager2.widget.b(3);
        this.f7329r = false;
        this.f7330s = new a();
        this.f7332u = -1;
        this.C = null;
        this.D = false;
        this.E = true;
        this.F = -1;
        b(context, attributeSet);
    }

    private RecyclerView.r a() {
        return new d();
    }

    private void b(Context context, AttributeSet attributeSet) {
        e fVar;
        if (H) {
            fVar = new j();
        } else {
            fVar = new f();
        }
        this.G = fVar;
        m mVar = new m(context);
        this.f7334w = mVar;
        mVar.setId(p0.m());
        this.f7334w.setDescendantFocusability(131072);
        h hVar = new h(context);
        this.f7331t = hVar;
        this.f7334w.setLayoutManager(hVar);
        this.f7334w.setScrollingTouchSlop(1);
        l(context, attributeSet);
        this.f7334w.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.f7334w.addOnChildAttachStateChangeListener(a());
        androidx.viewpager2.widget.e eVar = new androidx.viewpager2.widget.e(this);
        this.f7336y = eVar;
        this.A = new androidx.viewpager2.widget.c(this, eVar, this.f7334w);
        l lVar = new l();
        this.f7335x = lVar;
        lVar.b(this.f7334w);
        this.f7334w.addOnScrollListener(this.f7336y);
        androidx.viewpager2.widget.b bVar = new androidx.viewpager2.widget.b(3);
        this.f7337z = bVar;
        this.f7336y.m(bVar);
        b bVar2 = new b();
        c cVar = new c();
        this.f7337z.a(bVar2);
        this.f7337z.a(cVar);
        this.G.h(this.f7337z, this.f7334w);
        this.f7337z.a(this.f7327p);
        androidx.viewpager2.widget.d dVar = new androidx.viewpager2.widget.d(this.f7331t);
        this.B = dVar;
        this.f7337z.a(dVar);
        RecyclerView recyclerView = this.f7334w;
        attachViewToParent(recyclerView, 0, recyclerView.getLayoutParams());
    }

    private void f(RecyclerView.h<?> hVar) {
        if (hVar != null) {
            hVar.registerAdapterDataObserver(this.f7330s);
        }
    }

    private void i() {
        RecyclerView.h adapter;
        if (this.f7332u == -1 || (adapter = getAdapter()) == null) {
            return;
        }
        Parcelable parcelable = this.f7333v;
        if (parcelable != null) {
            if (adapter instanceof androidx.viewpager2.adapter.b) {
                ((androidx.viewpager2.adapter.b) adapter).restoreState(parcelable);
            }
            this.f7333v = null;
        }
        int max = Math.max(0, Math.min(this.f7332u, adapter.getItemCount() - 1));
        this.f7328q = max;
        this.f7332u = -1;
        this.f7334w.scrollToPosition(max);
        this.G.n();
    }

    private void l(Context context, AttributeSet attributeSet) {
        int[] iArr = f4.a.f15440a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        p0.s0(this, context, iArr, attributeSet, obtainStyledAttributes, 0, 0);
        try {
            setOrientation(obtainStyledAttributes.getInt(f4.a.f15441b, 0));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    private void m(RecyclerView.h<?> hVar) {
        if (hVar != null) {
            hVar.unregisterAdapterDataObserver(this.f7330s);
        }
    }

    public boolean c() {
        return this.A.a();
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i10) {
        return this.f7334w.canScrollHorizontally(i10);
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i10) {
        return this.f7334w.canScrollVertically(i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean d() {
        if (this.f7331t.l0() == 1) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        Parcelable parcelable = sparseArray.get(getId());
        if (parcelable instanceof SavedState) {
            int i10 = ((SavedState) parcelable).f7338f;
            sparseArray.put(this.f7334w.getId(), sparseArray.get(i10));
            sparseArray.remove(i10);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        i();
    }

    public boolean e() {
        return this.E;
    }

    public void g(i iVar) {
        this.f7327p.a(iVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        if (this.G.a()) {
            return this.G.g();
        }
        return super.getAccessibilityClassName();
    }

    public RecyclerView.h getAdapter() {
        return this.f7334w.getAdapter();
    }

    public int getCurrentItem() {
        return this.f7328q;
    }

    public int getItemDecorationCount() {
        return this.f7334w.getItemDecorationCount();
    }

    public int getOffscreenPageLimit() {
        return this.F;
    }

    public int getOrientation() {
        if (this.f7331t.v2() == 1) {
            return 1;
        }
        return 0;
    }

    int getPageSize() {
        int height;
        int paddingBottom;
        RecyclerView recyclerView = this.f7334w;
        if (getOrientation() == 0) {
            height = recyclerView.getWidth() - recyclerView.getPaddingLeft();
            paddingBottom = recyclerView.getPaddingRight();
        } else {
            height = recyclerView.getHeight() - recyclerView.getPaddingTop();
            paddingBottom = recyclerView.getPaddingBottom();
        }
        return height - paddingBottom;
    }

    public int getScrollState() {
        return this.f7336y.f();
    }

    public void h() {
        this.B.a();
    }

    public void j(int i10, boolean z10) {
        if (!c()) {
            k(i10, z10);
            return;
        }
        throw new IllegalStateException("Cannot change current item when ViewPager2 is fake dragging");
    }

    void k(int i10, boolean z10) {
        int i11;
        RecyclerView.h adapter = getAdapter();
        if (adapter == null) {
            if (this.f7332u != -1) {
                this.f7332u = Math.max(i10, 0);
            }
        } else if (adapter.getItemCount() <= 0) {
        } else {
            int min = Math.min(Math.max(i10, 0), adapter.getItemCount() - 1);
            if (min == this.f7328q && this.f7336y.h()) {
                return;
            }
            int i12 = this.f7328q;
            if (min == i12 && z10) {
                return;
            }
            double d10 = i12;
            this.f7328q = min;
            this.G.r();
            if (!this.f7336y.h()) {
                d10 = this.f7336y.e();
            }
            this.f7336y.k(min, z10);
            if (!z10) {
                this.f7334w.scrollToPosition(min);
                return;
            }
            double d11 = min;
            if (Math.abs(d11 - d10) > 3.0d) {
                RecyclerView recyclerView = this.f7334w;
                if (d11 > d10) {
                    i11 = min - 3;
                } else {
                    i11 = min + 3;
                }
                recyclerView.scrollToPosition(i11);
                RecyclerView recyclerView2 = this.f7334w;
                recyclerView2.post(new n(min, recyclerView2));
                return;
            }
            this.f7334w.smoothScrollToPosition(min);
        }
    }

    public void n(i iVar) {
        this.f7327p.b(iVar);
    }

    void o() {
        v vVar = this.f7335x;
        if (vVar != null) {
            View f10 = vVar.f(this.f7331t);
            if (f10 == null) {
                return;
            }
            int p02 = this.f7331t.p0(f10);
            if (p02 != this.f7328q && getScrollState() == 0) {
                this.f7337z.onPageSelected(p02);
            }
            this.f7329r = false;
            return;
        }
        throw new IllegalStateException("Design assumption violated.");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.G.i(accessibilityNodeInfo);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int measuredWidth = this.f7334w.getMeasuredWidth();
        int measuredHeight = this.f7334w.getMeasuredHeight();
        this.f7325f.left = getPaddingLeft();
        this.f7325f.right = (i12 - i10) - getPaddingRight();
        this.f7325f.top = getPaddingTop();
        this.f7325f.bottom = (i13 - i11) - getPaddingBottom();
        Gravity.apply(8388659, measuredWidth, measuredHeight, this.f7325f, this.f7326m);
        RecyclerView recyclerView = this.f7334w;
        Rect rect = this.f7326m;
        recyclerView.layout(rect.left, rect.top, rect.right, rect.bottom);
        if (this.f7329r) {
            o();
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        measureChild(this.f7334w, i10, i11);
        int measuredWidth = this.f7334w.getMeasuredWidth();
        int measuredHeight = this.f7334w.getMeasuredHeight();
        int measuredState = this.f7334w.getMeasuredState();
        int paddingLeft = measuredWidth + getPaddingLeft() + getPaddingRight();
        int paddingTop = measuredHeight + getPaddingTop() + getPaddingBottom();
        setMeasuredDimension(View.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i10, measuredState), View.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i11, measuredState << 16));
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f7332u = savedState.f7339m;
        this.f7333v = savedState.f7340p;
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f7338f = this.f7334w.getId();
        int i10 = this.f7332u;
        if (i10 == -1) {
            i10 = this.f7328q;
        }
        savedState.f7339m = i10;
        Parcelable parcelable = this.f7333v;
        if (parcelable != null) {
            savedState.f7340p = parcelable;
        } else {
            RecyclerView.h adapter = this.f7334w.getAdapter();
            if (adapter instanceof androidx.viewpager2.adapter.b) {
                savedState.f7340p = ((androidx.viewpager2.adapter.b) adapter).saveState();
            }
        }
        return savedState;
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        throw new IllegalStateException(ViewPager2.class.getSimpleName() + " does not support direct child views");
    }

    @Override // android.view.View
    public boolean performAccessibilityAction(int i10, Bundle bundle) {
        if (this.G.c(i10, bundle)) {
            return this.G.m(i10, bundle);
        }
        return super.performAccessibilityAction(i10, bundle);
    }

    public void setAdapter(RecyclerView.h hVar) {
        RecyclerView.h adapter = this.f7334w.getAdapter();
        this.G.f(adapter);
        m(adapter);
        this.f7334w.setAdapter(hVar);
        this.f7328q = 0;
        i();
        this.G.e(hVar);
        f(hVar);
    }

    public void setCurrentItem(int i10) {
        j(i10, true);
    }

    @Override // android.view.View
    public void setLayoutDirection(int i10) {
        super.setLayoutDirection(i10);
        this.G.q();
    }

    public void setOffscreenPageLimit(int i10) {
        if (i10 < 1 && i10 != -1) {
            throw new IllegalArgumentException("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
        }
        this.F = i10;
        this.f7334w.requestLayout();
    }

    public void setOrientation(int i10) {
        this.f7331t.J2(i10);
        this.G.s();
    }

    public void setPageTransformer(k kVar) {
        if (kVar != null) {
            if (!this.D) {
                this.C = this.f7334w.getItemAnimator();
                this.D = true;
            }
            this.f7334w.setItemAnimator(null);
        } else if (this.D) {
            this.f7334w.setItemAnimator(this.C);
            this.C = null;
            this.D = false;
        }
        this.B.a();
        if (kVar == null) {
            return;
        }
        this.B.b(kVar);
        h();
    }

    public void setUserInputEnabled(boolean z10) {
        this.E = z10;
        this.G.t();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: f  reason: collision with root package name */
        int f7338f;

        /* renamed from: m  reason: collision with root package name */
        int f7339m;

        /* renamed from: p  reason: collision with root package name */
        Parcelable f7340p;

        /* loaded from: classes.dex */
        class a implements Parcelable.ClassLoaderCreator<SavedState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a  reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return createFromParcel(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b  reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                if (Build.VERSION.SDK_INT >= 24) {
                    return new SavedState(parcel, classLoader);
                }
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c  reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        @SuppressLint({"ClassVerificationFailure"})
        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            a(parcel, classLoader);
        }

        private void a(Parcel parcel, ClassLoader classLoader) {
            this.f7338f = parcel.readInt();
            this.f7339m = parcel.readInt();
            this.f7340p = parcel.readParcelable(classLoader);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f7338f);
            parcel.writeInt(this.f7339m);
            parcel.writeParcelable(this.f7340p, i10);
        }

        SavedState(Parcel parcel) {
            super(parcel);
            a(parcel, null);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d implements RecyclerView.r {
        d() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.r
        public void b(View view) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            if (((ViewGroup.MarginLayoutParams) qVar).width == -1 && ((ViewGroup.MarginLayoutParams) qVar).height == -1) {
                return;
            }
            throw new IllegalStateException("Pages must fill the whole ViewPager2 (use match_parent)");
        }

        @Override // androidx.recyclerview.widget.RecyclerView.r
        public void a(View view) {
        }
    }

    /* loaded from: classes.dex */
    public static abstract class i {
        public void onPageScrollStateChanged(int i10) {
        }

        public void onPageSelected(int i10) {
        }

        public void onPageScrolled(int i10, float f10, int i11) {
        }
    }
}
