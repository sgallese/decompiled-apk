package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.accessibility.n0;
import androidx.core.view.accessibility.s0;
import androidx.core.view.p0;
import androidx.customview.view.AbsSavedState;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.internal.r;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import v6.j;
import v6.k;
import v6.l;
import y2.c;

/* loaded from: classes3.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.c<V> {

    /* renamed from: h0  reason: collision with root package name */
    private static final int f9629h0 = k.f24800j;
    private boolean A;
    private final BottomSheetBehavior<V>.g B;
    private ValueAnimator C;
    int D;
    int E;
    int F;
    float G;
    int H;
    float I;
    boolean J;
    private boolean K;
    private boolean L;
    int M;
    int N;
    y2.c O;
    private boolean P;
    private int Q;
    private boolean R;
    private float S;
    private int T;
    int U;
    int V;
    WeakReference<V> W;
    WeakReference<View> X;
    WeakReference<View> Y;
    private final ArrayList<f> Z;

    /* renamed from: a  reason: collision with root package name */
    private int f9630a;

    /* renamed from: a0  reason: collision with root package name */
    private VelocityTracker f9631a0;

    /* renamed from: b  reason: collision with root package name */
    private boolean f9632b;

    /* renamed from: b0  reason: collision with root package name */
    int f9633b0;

    /* renamed from: c  reason: collision with root package name */
    private boolean f9634c;

    /* renamed from: c0  reason: collision with root package name */
    private int f9635c0;

    /* renamed from: d  reason: collision with root package name */
    private float f9636d;

    /* renamed from: d0  reason: collision with root package name */
    boolean f9637d0;

    /* renamed from: e  reason: collision with root package name */
    private int f9638e;

    /* renamed from: e0  reason: collision with root package name */
    private Map<View, Integer> f9639e0;

    /* renamed from: f  reason: collision with root package name */
    private int f9640f;

    /* renamed from: f0  reason: collision with root package name */
    final SparseIntArray f9641f0;

    /* renamed from: g  reason: collision with root package name */
    private boolean f9642g;

    /* renamed from: g0  reason: collision with root package name */
    private final c.AbstractC0604c f9643g0;

    /* renamed from: h  reason: collision with root package name */
    private int f9644h;

    /* renamed from: i  reason: collision with root package name */
    private int f9645i;

    /* renamed from: j  reason: collision with root package name */
    private p7.g f9646j;

    /* renamed from: k  reason: collision with root package name */
    private ColorStateList f9647k;

    /* renamed from: l  reason: collision with root package name */
    private int f9648l;

    /* renamed from: m  reason: collision with root package name */
    private int f9649m;

    /* renamed from: n  reason: collision with root package name */
    private int f9650n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f9651o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f9652p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f9653q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f9654r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f9655s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f9656t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f9657u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f9658v;

    /* renamed from: w  reason: collision with root package name */
    private int f9659w;

    /* renamed from: x  reason: collision with root package name */
    private int f9660x;

    /* renamed from: y  reason: collision with root package name */
    private boolean f9661y;

    /* renamed from: z  reason: collision with root package name */
    private p7.k f9662z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ View f9668f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ int f9669m;

        a(View view, int i10) {
            this.f9668f = view;
            this.f9669m = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            BottomSheetBehavior.this.X0(this.f9668f, this.f9669m, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class b implements ValueAnimator.AnimatorUpdateListener {
        b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (BottomSheetBehavior.this.f9646j != null) {
                BottomSheetBehavior.this.f9646j.c0(floatValue);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class c implements r.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f9672a;

        c(boolean z10) {
            this.f9672a = z10;
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x0089  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x009a  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00a6  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00b4  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00c3  */
        @Override // com.google.android.material.internal.r.d
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public androidx.core.view.p1 a(android.view.View r11, androidx.core.view.p1 r12, com.google.android.material.internal.r.e r13) {
            /*
                r10 = this;
                int r0 = androidx.core.view.p1.m.d()
                androidx.core.graphics.b r0 = r12.f(r0)
                int r1 = androidx.core.view.p1.m.c()
                androidx.core.graphics.b r1 = r12.f(r1)
                com.google.android.material.bottomsheet.BottomSheetBehavior r2 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r3 = r0.f3873b
                com.google.android.material.bottomsheet.BottomSheetBehavior.P(r2, r3)
                boolean r2 = com.google.android.material.internal.r.f(r11)
                int r3 = r11.getPaddingBottom()
                int r4 = r11.getPaddingLeft()
                int r5 = r11.getPaddingRight()
                com.google.android.material.bottomsheet.BottomSheetBehavior r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.Q(r6)
                if (r6 == 0) goto L41
                com.google.android.material.bottomsheet.BottomSheetBehavior r3 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r6 = r12.i()
                com.google.android.material.bottomsheet.BottomSheetBehavior.S(r3, r6)
                int r3 = r13.f10188d
                com.google.android.material.bottomsheet.BottomSheetBehavior r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.R(r6)
                int r3 = r3 + r6
            L41:
                com.google.android.material.bottomsheet.BottomSheetBehavior r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.T(r6)
                if (r6 == 0) goto L53
                if (r2 == 0) goto L4e
                int r4 = r13.f10187c
                goto L50
            L4e:
                int r4 = r13.f10185a
            L50:
                int r6 = r0.f3872a
                int r4 = r4 + r6
            L53:
                com.google.android.material.bottomsheet.BottomSheetBehavior r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.U(r6)
                if (r6 == 0) goto L66
                if (r2 == 0) goto L60
                int r13 = r13.f10185a
                goto L62
            L60:
                int r13 = r13.f10187c
            L62:
                int r2 = r0.f3874c
                int r5 = r13 + r2
            L66:
                android.view.ViewGroup$LayoutParams r13 = r11.getLayoutParams()
                android.view.ViewGroup$MarginLayoutParams r13 = (android.view.ViewGroup.MarginLayoutParams) r13
                com.google.android.material.bottomsheet.BottomSheetBehavior r2 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r2 = com.google.android.material.bottomsheet.BottomSheetBehavior.V(r2)
                r6 = 0
                r7 = 1
                if (r2 == 0) goto L80
                int r2 = r13.leftMargin
                int r8 = r0.f3872a
                if (r2 == r8) goto L80
                r13.leftMargin = r8
                r2 = 1
                goto L81
            L80:
                r2 = 0
            L81:
                com.google.android.material.bottomsheet.BottomSheetBehavior r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.W(r8)
                if (r8 == 0) goto L92
                int r8 = r13.rightMargin
                int r9 = r0.f3874c
                if (r8 == r9) goto L92
                r13.rightMargin = r9
                r2 = 1
            L92:
                com.google.android.material.bottomsheet.BottomSheetBehavior r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.F(r8)
                if (r8 == 0) goto La3
                int r8 = r13.topMargin
                int r0 = r0.f3873b
                if (r8 == r0) goto La3
                r13.topMargin = r0
                goto La4
            La3:
                r7 = r2
            La4:
                if (r7 == 0) goto La9
                r11.setLayoutParams(r13)
            La9:
                int r13 = r11.getPaddingTop()
                r11.setPadding(r4, r13, r5, r3)
                boolean r11 = r10.f9672a
                if (r11 == 0) goto Lbb
                com.google.android.material.bottomsheet.BottomSheetBehavior r11 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r13 = r1.f3875d
                com.google.android.material.bottomsheet.BottomSheetBehavior.G(r11, r13)
            Lbb:
                com.google.android.material.bottomsheet.BottomSheetBehavior r11 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r11 = com.google.android.material.bottomsheet.BottomSheetBehavior.Q(r11)
                if (r11 != 0) goto Lc7
                boolean r11 = r10.f9672a
                if (r11 == 0) goto Lcc
            Lc7:
                com.google.android.material.bottomsheet.BottomSheetBehavior r11 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                com.google.android.material.bottomsheet.BottomSheetBehavior.H(r11, r6)
            Lcc:
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.c.a(android.view.View, androidx.core.view.p1, com.google.android.material.internal.r$e):androidx.core.view.p1");
        }
    }

    /* loaded from: classes3.dex */
    class d extends c.AbstractC0604c {

        /* renamed from: a  reason: collision with root package name */
        private long f9674a;

        d() {
        }

        private boolean n(View view) {
            int top = view.getTop();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            if (top > (bottomSheetBehavior.V + bottomSheetBehavior.m0()) / 2) {
                return true;
            }
            return false;
        }

        @Override // y2.c.AbstractC0604c
        public int a(View view, int i10, int i11) {
            return view.getLeft();
        }

        @Override // y2.c.AbstractC0604c
        public int b(View view, int i10, int i11) {
            return t2.a.b(i10, BottomSheetBehavior.this.m0(), e(view));
        }

        @Override // y2.c.AbstractC0604c
        public int e(View view) {
            if (BottomSheetBehavior.this.d0()) {
                return BottomSheetBehavior.this.V;
            }
            return BottomSheetBehavior.this.H;
        }

        @Override // y2.c.AbstractC0604c
        public void j(int i10) {
            if (i10 == 1 && BottomSheetBehavior.this.L) {
                BottomSheetBehavior.this.Q0(1);
            }
        }

        @Override // y2.c.AbstractC0604c
        public void k(View view, int i10, int i11, int i12, int i13) {
            BottomSheetBehavior.this.i0(i11);
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0035, code lost:
        
            if (r7.f9675b.S0(r3, (r9 * 100.0f) / r10.V) != false) goto L6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x003c, code lost:
        
            if (r9 > r7.f9675b.F) goto L63;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0091, code lost:
        
            if (java.lang.Math.abs(r8.getTop() - r7.f9675b.m0()) < java.lang.Math.abs(r8.getTop() - r7.f9675b.F)) goto L6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x00d0, code lost:
        
            if (r7.f9675b.V0() == false) goto L63;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x00f2, code lost:
        
            if (java.lang.Math.abs(r9 - r7.f9675b.E) < java.lang.Math.abs(r9 - r7.f9675b.H)) goto L6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x010e, code lost:
        
            if (r7.f9675b.V0() != false) goto L39;
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x0128, code lost:
        
            if (r7.f9675b.V0() == false) goto L63;
         */
        @Override // y2.c.AbstractC0604c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void l(android.view.View r8, float r9, float r10) {
            /*
                Method dump skipped, instructions count: 309
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.d.l(android.view.View, float, float):void");
        }

        @Override // y2.c.AbstractC0604c
        public boolean m(View view, int i10) {
            View view2;
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i11 = bottomSheetBehavior.M;
            if (i11 == 1 || bottomSheetBehavior.f9637d0) {
                return false;
            }
            if (i11 == 3 && bottomSheetBehavior.f9633b0 == i10) {
                WeakReference<View> weakReference = bottomSheetBehavior.Y;
                if (weakReference != null) {
                    view2 = weakReference.get();
                } else {
                    view2 = null;
                }
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            this.f9674a = System.currentTimeMillis();
            WeakReference<V> weakReference2 = BottomSheetBehavior.this.W;
            if (weakReference2 == null || weakReference2.get() != view) {
                return false;
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class e implements s0 {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f9676a;

        e(int i10) {
            this.f9676a = i10;
        }

        @Override // androidx.core.view.accessibility.s0
        public boolean a(View view, s0.a aVar) {
            BottomSheetBehavior.this.P0(this.f9676a);
            return true;
        }
    }

    public BottomSheetBehavior() {
        this.f9630a = 0;
        this.f9632b = true;
        this.f9634c = false;
        this.f9648l = -1;
        this.f9649m = -1;
        this.B = new g(this, null);
        this.G = 0.5f;
        this.I = -1.0f;
        this.L = true;
        this.M = 4;
        this.N = 4;
        this.S = 0.1f;
        this.Z = new ArrayList<>();
        this.f9641f0 = new SparseIntArray();
        this.f9643g0 = new d();
    }

    private void A0(SavedState savedState) {
        int i10 = this.f9630a;
        if (i10 == 0) {
            return;
        }
        if (i10 == -1 || (i10 & 1) == 1) {
            this.f9640f = savedState.f9664q;
        }
        if (i10 == -1 || (i10 & 2) == 2) {
            this.f9632b = savedState.f9665r;
        }
        if (i10 == -1 || (i10 & 4) == 4) {
            this.J = savedState.f9666s;
        }
        if (i10 == -1 || (i10 & 8) == 8) {
            this.K = savedState.f9667t;
        }
    }

    private void B0(V v10, Runnable runnable) {
        if (v0(v10)) {
            v10.post(runnable);
        } else {
            runnable.run();
        }
    }

    private void R0(View view) {
        boolean z10;
        if (Build.VERSION.SDK_INT >= 29 && !s0() && !this.f9642g) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!this.f9652p && !this.f9653q && !this.f9654r && !this.f9656t && !this.f9657u && !this.f9658v && !z10) {
            return;
        }
        r.b(view, new c(z10));
    }

    private boolean T0() {
        if (this.O != null && (this.L || this.M == 1)) {
            return true;
        }
        return false;
    }

    private int X(View view, int i10, int i11) {
        return p0.c(view, view.getResources().getString(i10), f0(i11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void X0(View view, int i10, boolean z10) {
        boolean z11;
        int p02 = p0(i10);
        y2.c cVar = this.O;
        if (cVar != null && (!z10 ? cVar.Q(view, view.getLeft(), p02) : cVar.O(view.getLeft(), p02))) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            Q0(2);
            a1(i10, true);
            this.B.c(i10);
            return;
        }
        Q0(i10);
    }

    private void Y0() {
        WeakReference<V> weakReference = this.W;
        if (weakReference != null) {
            Z0(weakReference.get(), 0);
        }
        WeakReference<View> weakReference2 = this.X;
        if (weakReference2 != null) {
            Z0(weakReference2.get(), 1);
        }
    }

    private void Z() {
        int b02 = b0();
        if (this.f9632b) {
            this.H = Math.max(this.V - b02, this.E);
        } else {
            this.H = this.V - b02;
        }
    }

    private void Z0(View view, int i10) {
        if (view == null) {
            return;
        }
        e0(view, i10);
        int i11 = 6;
        if (!this.f9632b && this.M != 6) {
            this.f9641f0.put(i10, X(view, j.f24765a, 6));
        }
        if (this.J && u0() && this.M != 5) {
            y0(view, n0.a.f4097y, 5);
        }
        int i12 = this.M;
        if (i12 != 3) {
            if (i12 != 4) {
                if (i12 == 6) {
                    y0(view, n0.a.f4096x, 4);
                    y0(view, n0.a.f4095w, 3);
                    return;
                }
                return;
            }
            if (this.f9632b) {
                i11 = 3;
            }
            y0(view, n0.a.f4095w, i11);
            return;
        }
        if (this.f9632b) {
            i11 = 4;
        }
        y0(view, n0.a.f4096x, i11);
    }

    private void a0() {
        this.F = (int) (this.V * (1.0f - this.G));
    }

    private void a1(int i10, boolean z10) {
        boolean r02;
        ValueAnimator valueAnimator;
        if (i10 != 2 && this.A != (r02 = r0()) && this.f9646j != null) {
            this.A = r02;
            float f10 = 0.0f;
            if (z10 && (valueAnimator = this.C) != null) {
                if (valueAnimator.isRunning()) {
                    this.C.reverse();
                    return;
                }
                if (!r02) {
                    f10 = 1.0f;
                }
                this.C.setFloatValues(1.0f - f10, f10);
                this.C.start();
                return;
            }
            ValueAnimator valueAnimator2 = this.C;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.C.cancel();
            }
            p7.g gVar = this.f9646j;
            if (!this.A) {
                f10 = 1.0f;
            }
            gVar.c0(f10);
        }
    }

    private int b0() {
        int i10;
        if (this.f9642g) {
            return Math.min(Math.max(this.f9644h, this.V - ((this.U * 9) / 16)), this.T) + this.f9659w;
        }
        if (!this.f9651o && !this.f9652p && (i10 = this.f9650n) > 0) {
            return Math.max(this.f9640f, i10 + this.f9645i);
        }
        return this.f9640f + this.f9659w;
    }

    private void b1(boolean z10) {
        Map<View, Integer> map;
        WeakReference<V> weakReference = this.W;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = weakReference.get().getParent();
        if (!(parent instanceof CoordinatorLayout)) {
            return;
        }
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
        int childCount = coordinatorLayout.getChildCount();
        if (z10) {
            if (this.f9639e0 == null) {
                this.f9639e0 = new HashMap(childCount);
            } else {
                return;
            }
        }
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = coordinatorLayout.getChildAt(i10);
            if (childAt != this.W.get()) {
                if (z10) {
                    this.f9639e0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                    if (this.f9634c) {
                        p0.F0(childAt, 4);
                    }
                } else if (this.f9634c && (map = this.f9639e0) != null && map.containsKey(childAt)) {
                    p0.F0(childAt, this.f9639e0.get(childAt).intValue());
                }
            }
        }
        if (!z10) {
            this.f9639e0 = null;
        } else if (this.f9634c) {
            this.W.get().sendAccessibilityEvent(8);
        }
    }

    private float c0(int i10) {
        float f10;
        float f11;
        int i11 = this.H;
        if (i10 <= i11 && i11 != m0()) {
            int i12 = this.H;
            f10 = i12 - i10;
            f11 = i12 - m0();
        } else {
            int i13 = this.H;
            f10 = i13 - i10;
            f11 = this.V - i13;
        }
        return f10 / f11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c1(boolean z10) {
        V v10;
        if (this.W != null) {
            Z();
            if (this.M == 4 && (v10 = this.W.get()) != null) {
                if (z10) {
                    P0(4);
                } else {
                    v10.requestLayout();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean d0() {
        if (t0() && u0()) {
            return true;
        }
        return false;
    }

    private void e0(View view, int i10) {
        if (view == null) {
            return;
        }
        p0.o0(view, 524288);
        p0.o0(view, 262144);
        p0.o0(view, 1048576);
        int i11 = this.f9641f0.get(i10, -1);
        if (i11 != -1) {
            p0.o0(view, i11);
            this.f9641f0.delete(i10);
        }
    }

    private s0 f0(int i10) {
        return new e(i10);
    }

    private void g0(Context context) {
        if (this.f9662z == null) {
            return;
        }
        p7.g gVar = new p7.g(this.f9662z);
        this.f9646j = gVar;
        gVar.Q(context);
        ColorStateList colorStateList = this.f9647k;
        if (colorStateList != null) {
            this.f9646j.b0(colorStateList);
            return;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16842801, typedValue, true);
        this.f9646j.setTint(typedValue.data);
    }

    private void h0() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.C = ofFloat;
        ofFloat.setDuration(500L);
        this.C.addUpdateListener(new b());
    }

    public static <V extends View> BottomSheetBehavior<V> k0(V v10) {
        ViewGroup.LayoutParams layoutParams = v10.getLayoutParams();
        if (layoutParams instanceof CoordinatorLayout.f) {
            CoordinatorLayout.c f10 = ((CoordinatorLayout.f) layoutParams).f();
            if (f10 instanceof BottomSheetBehavior) {
                return (BottomSheetBehavior) f10;
            }
            throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
        }
        throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
    }

    private int l0(int i10, int i11, int i12, int i13) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, i11, i13);
        if (i12 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode != 1073741824) {
            if (size != 0) {
                i12 = Math.min(size, i12);
            }
            return View.MeasureSpec.makeMeasureSpec(i12, RecyclerView.UNDEFINED_DURATION);
        }
        return View.MeasureSpec.makeMeasureSpec(Math.min(size, i12), 1073741824);
    }

    private int p0(int i10) {
        if (i10 != 3) {
            if (i10 != 4) {
                if (i10 != 5) {
                    if (i10 == 6) {
                        return this.F;
                    }
                    throw new IllegalArgumentException("Invalid state to get top offset: " + i10);
                }
                return this.V;
            }
            return this.H;
        }
        return m0();
    }

    private float q0() {
        VelocityTracker velocityTracker = this.f9631a0;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(1000, this.f9636d);
        return this.f9631a0.getYVelocity(this.f9633b0);
    }

    private boolean r0() {
        if (this.M == 3 && (this.f9661y || m0() == 0)) {
            return true;
        }
        return false;
    }

    private boolean v0(V v10) {
        ViewParent parent = v10.getParent();
        if (parent != null && parent.isLayoutRequested() && p0.X(v10)) {
            return true;
        }
        return false;
    }

    private void y0(View view, n0.a aVar, int i10) {
        p0.q0(view, aVar, null, f0(i10));
    }

    private void z0() {
        this.f9633b0 = -1;
        VelocityTracker velocityTracker = this.f9631a0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f9631a0 = null;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean A(CoordinatorLayout coordinatorLayout, V v10, View view, View view2, int i10, int i11) {
        this.Q = 0;
        this.R = false;
        if ((i10 & 2) == 0) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0035, code lost:
    
        if (r4.getTop() <= r2.F) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0065, code lost:
    
        if (java.lang.Math.abs(r3 - r2.E) < java.lang.Math.abs(r3 - r2.H)) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x007b, code lost:
    
        if (V0() != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x008b, code lost:
    
        if (java.lang.Math.abs(r3 - r1) < java.lang.Math.abs(r3 - r2.H)) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a7, code lost:
    
        if (java.lang.Math.abs(r3 - r2.F) < java.lang.Math.abs(r3 - r2.H)) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a9, code lost:
    
        r0 = 6;
     */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void C(androidx.coordinatorlayout.widget.CoordinatorLayout r3, V r4, android.view.View r5, int r6) {
        /*
            r2 = this;
            int r3 = r4.getTop()
            int r6 = r2.m0()
            r0 = 3
            if (r3 != r6) goto Lf
            r2.Q0(r0)
            return
        Lf:
            boolean r3 = r2.w0()
            if (r3 == 0) goto L24
            java.lang.ref.WeakReference<android.view.View> r3 = r2.Y
            if (r3 == 0) goto L23
            java.lang.Object r3 = r3.get()
            if (r5 != r3) goto L23
            boolean r3 = r2.R
            if (r3 != 0) goto L24
        L23:
            return
        L24:
            int r3 = r2.Q
            r5 = 6
            if (r3 <= 0) goto L39
            boolean r3 = r2.f9632b
            if (r3 == 0) goto L2f
            goto Laa
        L2f:
            int r3 = r4.getTop()
            int r6 = r2.F
            if (r3 <= r6) goto Laa
            goto La9
        L39:
            boolean r3 = r2.J
            if (r3 == 0) goto L49
            float r3 = r2.q0()
            boolean r3 = r2.U0(r4, r3)
            if (r3 == 0) goto L49
            r0 = 5
            goto Laa
        L49:
            int r3 = r2.Q
            r6 = 4
            if (r3 != 0) goto L8e
            int r3 = r4.getTop()
            boolean r1 = r2.f9632b
            if (r1 == 0) goto L68
            int r5 = r2.E
            int r5 = r3 - r5
            int r5 = java.lang.Math.abs(r5)
            int r1 = r2.H
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r5 >= r3) goto L92
            goto Laa
        L68:
            int r1 = r2.F
            if (r3 >= r1) goto L7e
            int r1 = r2.H
            int r1 = r3 - r1
            int r1 = java.lang.Math.abs(r1)
            if (r3 >= r1) goto L77
            goto Laa
        L77:
            boolean r3 = r2.V0()
            if (r3 == 0) goto La9
            goto L92
        L7e:
            int r0 = r3 - r1
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.H
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L92
            goto La9
        L8e:
            boolean r3 = r2.f9632b
            if (r3 == 0) goto L94
        L92:
            r0 = 4
            goto Laa
        L94:
            int r3 = r4.getTop()
            int r0 = r2.F
            int r0 = r3 - r0
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.H
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L92
        La9:
            r0 = 6
        Laa:
            r3 = 0
            r2.X0(r4, r0, r3)
            r2.R = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.C(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void");
    }

    public void C0(boolean z10) {
        this.L = z10;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean D(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
        if (!v10.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.M == 1 && actionMasked == 0) {
            return true;
        }
        if (T0()) {
            this.O.F(motionEvent);
        }
        if (actionMasked == 0) {
            z0();
        }
        if (this.f9631a0 == null) {
            this.f9631a0 = VelocityTracker.obtain();
        }
        this.f9631a0.addMovement(motionEvent);
        if (T0() && actionMasked == 2 && !this.P && Math.abs(this.f9635c0 - motionEvent.getY()) > this.O.z()) {
            this.O.b(v10, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.P;
    }

    public void D0(int i10) {
        if (i10 >= 0) {
            this.D = i10;
            a1(this.M, true);
            return;
        }
        throw new IllegalArgumentException("offset must be greater than or equal to 0");
    }

    public void E0(boolean z10) {
        int i10;
        if (this.f9632b == z10) {
            return;
        }
        this.f9632b = z10;
        if (this.W != null) {
            Z();
        }
        if (this.f9632b && this.M == 6) {
            i10 = 3;
        } else {
            i10 = this.M;
        }
        Q0(i10);
        a1(this.M, true);
        Y0();
    }

    public void F0(boolean z10) {
        this.f9651o = z10;
    }

    public void G0(float f10) {
        if (f10 > 0.0f && f10 < 1.0f) {
            this.G = f10;
            if (this.W != null) {
                a0();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
    }

    public void H0(boolean z10) {
        if (this.J != z10) {
            this.J = z10;
            if (!z10 && this.M == 5) {
                P0(4);
            }
            Y0();
        }
    }

    public void I0(int i10) {
        this.f9649m = i10;
    }

    public void J0(int i10) {
        this.f9648l = i10;
    }

    public void K0(int i10) {
        L0(i10, false);
    }

    public final void L0(int i10, boolean z10) {
        boolean z11 = true;
        if (i10 == -1) {
            if (!this.f9642g) {
                this.f9642g = true;
            }
            z11 = false;
        } else {
            if (this.f9642g || this.f9640f != i10) {
                this.f9642g = false;
                this.f9640f = Math.max(0, i10);
            }
            z11 = false;
        }
        if (z11) {
            c1(z10);
        }
    }

    public void M0(int i10) {
        this.f9630a = i10;
    }

    public void N0(int i10) {
        this.f9638e = i10;
    }

    public void O0(boolean z10) {
        this.K = z10;
    }

    public void P0(int i10) {
        String str;
        int i11;
        if (i10 != 1 && i10 != 2) {
            if (!this.J && i10 == 5) {
                Log.w("BottomSheetBehavior", "Cannot set state: " + i10);
                return;
            }
            if (i10 == 6 && this.f9632b && p0(i10) <= this.E) {
                i11 = 3;
            } else {
                i11 = i10;
            }
            WeakReference<V> weakReference = this.W;
            if (weakReference != null && weakReference.get() != null) {
                V v10 = this.W.get();
                B0(v10, new a(v10, i11));
                return;
            }
            Q0(i10);
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("STATE_");
        if (i10 == 1) {
            str = "DRAGGING";
        } else {
            str = "SETTLING";
        }
        sb2.append(str);
        sb2.append(" should not be set externally.");
        throw new IllegalArgumentException(sb2.toString());
    }

    void Q0(int i10) {
        V v10;
        if (this.M == i10) {
            return;
        }
        this.M = i10;
        if (i10 == 4 || i10 == 3 || i10 == 6 || (this.J && i10 == 5)) {
            this.N = i10;
        }
        WeakReference<V> weakReference = this.W;
        if (weakReference == null || (v10 = weakReference.get()) == null) {
            return;
        }
        if (i10 == 3) {
            b1(true);
        } else if (i10 == 6 || i10 == 5 || i10 == 4) {
            b1(false);
        }
        a1(i10, true);
        for (int i11 = 0; i11 < this.Z.size(); i11++) {
            this.Z.get(i11).onStateChanged(v10, i10);
        }
        Y0();
    }

    public boolean S0(long j10, float f10) {
        return false;
    }

    boolean U0(View view, float f10) {
        if (this.K) {
            return true;
        }
        if (!u0() || view.getTop() < this.H) {
            return false;
        }
        if (Math.abs((view.getTop() + (f10 * this.S)) - this.H) / b0() > 0.5f) {
            return true;
        }
        return false;
    }

    public boolean V0() {
        return false;
    }

    public boolean W0() {
        return true;
    }

    public void Y(f fVar) {
        if (!this.Z.contains(fVar)) {
            this.Z.add(fVar);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void g(CoordinatorLayout.f fVar) {
        super.g(fVar);
        this.W = null;
        this.O = null;
    }

    void i0(int i10) {
        V v10 = this.W.get();
        if (v10 != null && !this.Z.isEmpty()) {
            float c02 = c0(i10);
            for (int i11 = 0; i11 < this.Z.size(); i11++) {
                this.Z.get(i11).onSlide(v10, c02);
            }
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void j() {
        super.j();
        this.W = null;
        this.O = null;
    }

    View j0(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        if (p0.Z(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View j02 = j0(viewGroup.getChildAt(i10));
                if (j02 != null) {
                    return j02;
                }
            }
        }
        return null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean k(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
        boolean z10;
        View view;
        y2.c cVar;
        if (v10.isShown() && this.L) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                z0();
            }
            if (this.f9631a0 == null) {
                this.f9631a0 = VelocityTracker.obtain();
            }
            this.f9631a0.addMovement(motionEvent);
            View view2 = null;
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    this.f9637d0 = false;
                    this.f9633b0 = -1;
                    if (this.P) {
                        this.P = false;
                        return false;
                    }
                }
            } else {
                int x10 = (int) motionEvent.getX();
                this.f9635c0 = (int) motionEvent.getY();
                if (this.M != 2) {
                    WeakReference<View> weakReference = this.Y;
                    if (weakReference != null) {
                        view = weakReference.get();
                    } else {
                        view = null;
                    }
                    if (view != null && coordinatorLayout.v(view, x10, this.f9635c0)) {
                        this.f9633b0 = motionEvent.getPointerId(motionEvent.getActionIndex());
                        this.f9637d0 = true;
                    }
                }
                if (this.f9633b0 == -1 && !coordinatorLayout.v(v10, x10, this.f9635c0)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.P = z10;
            }
            if (!this.P && (cVar = this.O) != null && cVar.P(motionEvent)) {
                return true;
            }
            WeakReference<View> weakReference2 = this.Y;
            if (weakReference2 != null) {
                view2 = weakReference2.get();
            }
            if (actionMasked != 2 || view2 == null || this.P || this.M == 1 || coordinatorLayout.v(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.O == null || Math.abs(this.f9635c0 - motionEvent.getY()) <= this.O.z()) {
                return false;
            }
            return true;
        }
        this.P = true;
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(CoordinatorLayout coordinatorLayout, V v10, int i10) {
        if (p0.B(coordinatorLayout) && !p0.B(v10)) {
            v10.setFitsSystemWindows(true);
        }
        if (this.W == null) {
            this.f9644h = coordinatorLayout.getResources().getDimensionPixelSize(v6.d.f24665b);
            R0(v10);
            p0.R0(v10, new com.google.android.material.bottomsheet.c(v10));
            this.W = new WeakReference<>(v10);
            p7.g gVar = this.f9646j;
            if (gVar != null) {
                p0.y0(v10, gVar);
                p7.g gVar2 = this.f9646j;
                float f10 = this.I;
                if (f10 == -1.0f) {
                    f10 = p0.y(v10);
                }
                gVar2.a0(f10);
            } else {
                ColorStateList colorStateList = this.f9647k;
                if (colorStateList != null) {
                    p0.z0(v10, colorStateList);
                }
            }
            Y0();
            if (p0.C(v10) == 0) {
                p0.F0(v10, 1);
            }
        }
        if (this.O == null) {
            this.O = y2.c.o(coordinatorLayout, this.f9643g0);
        }
        int top = v10.getTop();
        coordinatorLayout.C(v10, i10);
        this.U = coordinatorLayout.getWidth();
        this.V = coordinatorLayout.getHeight();
        int height = v10.getHeight();
        this.T = height;
        int i11 = this.V;
        int i12 = i11 - height;
        int i13 = this.f9660x;
        if (i12 < i13) {
            if (this.f9655s) {
                this.T = i11;
            } else {
                this.T = i11 - i13;
            }
        }
        this.E = Math.max(0, i11 - this.T);
        a0();
        Z();
        int i14 = this.M;
        if (i14 == 3) {
            p0.f0(v10, m0());
        } else if (i14 == 6) {
            p0.f0(v10, this.F);
        } else if (this.J && i14 == 5) {
            p0.f0(v10, this.V);
        } else if (i14 == 4) {
            p0.f0(v10, this.H);
        } else if (i14 == 1 || i14 == 2) {
            p0.f0(v10, top - v10.getTop());
        }
        a1(this.M, false);
        this.Y = new WeakReference<>(j0(v10));
        for (int i15 = 0; i15 < this.Z.size(); i15++) {
            this.Z.get(i15).onLayout(v10);
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean m(CoordinatorLayout coordinatorLayout, V v10, int i10, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v10.getLayoutParams();
        v10.measure(l0(i10, coordinatorLayout.getPaddingLeft() + coordinatorLayout.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, this.f9648l, marginLayoutParams.width), l0(i12, coordinatorLayout.getPaddingTop() + coordinatorLayout.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, this.f9649m, marginLayoutParams.height));
        return true;
    }

    public int m0() {
        int i10;
        if (this.f9632b) {
            return this.E;
        }
        int i11 = this.D;
        if (this.f9655s) {
            i10 = 0;
        } else {
            i10 = this.f9660x;
        }
        return Math.max(i11, i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public p7.g n0() {
        return this.f9646j;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean o(CoordinatorLayout coordinatorLayout, V v10, View view, float f10, float f11) {
        WeakReference<View> weakReference;
        if (!w0() || (weakReference = this.Y) == null || view != weakReference.get()) {
            return false;
        }
        if (this.M == 3 && !super.o(coordinatorLayout, v10, view, f10, f11)) {
            return false;
        }
        return true;
    }

    public int o0() {
        return this.M;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void q(CoordinatorLayout coordinatorLayout, V v10, View view, int i10, int i11, int[] iArr, int i12) {
        View view2;
        if (i12 == 1) {
            return;
        }
        WeakReference<View> weakReference = this.Y;
        if (weakReference != null) {
            view2 = weakReference.get();
        } else {
            view2 = null;
        }
        if (w0() && view != view2) {
            return;
        }
        int top = v10.getTop();
        int i13 = top - i11;
        if (i11 > 0) {
            if (i13 < m0()) {
                int m02 = top - m0();
                iArr[1] = m02;
                p0.f0(v10, -m02);
                Q0(3);
            } else if (!this.L) {
                return;
            } else {
                iArr[1] = i11;
                p0.f0(v10, -i11);
                Q0(1);
            }
        } else if (i11 < 0 && !view.canScrollVertically(-1)) {
            if (i13 > this.H && !d0()) {
                int i14 = top - this.H;
                iArr[1] = i14;
                p0.f0(v10, -i14);
                Q0(4);
            } else if (!this.L) {
                return;
            } else {
                iArr[1] = i11;
                p0.f0(v10, -i11);
                Q0(1);
            }
        }
        i0(v10.getTop());
        this.Q = i11;
        this.R = true;
    }

    public boolean s0() {
        return this.f9651o;
    }

    public boolean t0() {
        return this.J;
    }

    public boolean u0() {
        return true;
    }

    public boolean w0() {
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void x(CoordinatorLayout coordinatorLayout, V v10, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.x(coordinatorLayout, v10, savedState.a());
        A0(savedState);
        int i10 = savedState.f9663p;
        if (i10 != 1 && i10 != 2) {
            this.M = i10;
            this.N = i10;
            return;
        }
        this.M = 4;
        this.N = 4;
    }

    public void x0(f fVar) {
        this.Z.remove(fVar);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public Parcelable y(CoordinatorLayout coordinatorLayout, V v10) {
        return new SavedState(super.y(coordinatorLayout, v10), (BottomSheetBehavior<?>) this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class g {

        /* renamed from: a  reason: collision with root package name */
        private int f9678a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f9679b;

        /* renamed from: c  reason: collision with root package name */
        private final Runnable f9680c;

        /* loaded from: classes3.dex */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                g.this.f9679b = false;
                y2.c cVar = BottomSheetBehavior.this.O;
                if (cVar != null && cVar.m(true)) {
                    g gVar = g.this;
                    gVar.c(gVar.f9678a);
                    return;
                }
                g gVar2 = g.this;
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (bottomSheetBehavior.M == 2) {
                    bottomSheetBehavior.Q0(gVar2.f9678a);
                }
            }
        }

        private g() {
            this.f9680c = new a();
        }

        void c(int i10) {
            WeakReference<V> weakReference = BottomSheetBehavior.this.W;
            if (weakReference != null && weakReference.get() != null) {
                this.f9678a = i10;
                if (!this.f9679b) {
                    p0.m0(BottomSheetBehavior.this.W.get(), this.f9680c);
                    this.f9679b = true;
                }
            }
        }

        /* synthetic */ g(BottomSheetBehavior bottomSheetBehavior, a aVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes3.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: p  reason: collision with root package name */
        final int f9663p;

        /* renamed from: q  reason: collision with root package name */
        int f9664q;

        /* renamed from: r  reason: collision with root package name */
        boolean f9665r;

        /* renamed from: s  reason: collision with root package name */
        boolean f9666s;

        /* renamed from: t  reason: collision with root package name */
        boolean f9667t;

        /* loaded from: classes3.dex */
        class a implements Parcelable.ClassLoaderCreator<SavedState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a  reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
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
            this.f9663p = parcel.readInt();
            this.f9664q = parcel.readInt();
            this.f9665r = parcel.readInt() == 1;
            this.f9666s = parcel.readInt() == 1;
            this.f9667t = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f9663p);
            parcel.writeInt(this.f9664q);
            parcel.writeInt(this.f9665r ? 1 : 0);
            parcel.writeInt(this.f9666s ? 1 : 0);
            parcel.writeInt(this.f9667t ? 1 : 0);
        }

        public SavedState(Parcelable parcelable, BottomSheetBehavior<?> bottomSheetBehavior) {
            super(parcelable);
            this.f9663p = bottomSheetBehavior.M;
            this.f9664q = ((BottomSheetBehavior) bottomSheetBehavior).f9640f;
            this.f9665r = ((BottomSheetBehavior) bottomSheetBehavior).f9632b;
            this.f9666s = bottomSheetBehavior.J;
            this.f9667t = ((BottomSheetBehavior) bottomSheetBehavior).K;
        }
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i10;
        this.f9630a = 0;
        this.f9632b = true;
        this.f9634c = false;
        this.f9648l = -1;
        this.f9649m = -1;
        this.B = new g(this, null);
        this.G = 0.5f;
        this.I = -1.0f;
        this.L = true;
        this.M = 4;
        this.N = 4;
        this.S = 0.1f;
        this.Z = new ArrayList<>();
        this.f9641f0 = new SparseIntArray();
        this.f9643g0 = new d();
        this.f9645i = context.getResources().getDimensionPixelSize(v6.d.f24668c0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.f24948n0);
        int i11 = l.f24988r0;
        if (obtainStyledAttributes.hasValue(i11)) {
            this.f9647k = m7.c.a(context, obtainStyledAttributes, i11);
        }
        if (obtainStyledAttributes.hasValue(l.J0)) {
            this.f9662z = p7.k.e(context, attributeSet, v6.b.f24630e, f9629h0).m();
        }
        g0(context);
        h0();
        this.I = obtainStyledAttributes.getDimension(l.f24978q0, -1.0f);
        int i12 = l.f24958o0;
        if (obtainStyledAttributes.hasValue(i12)) {
            J0(obtainStyledAttributes.getDimensionPixelSize(i12, -1));
        }
        int i13 = l.f24968p0;
        if (obtainStyledAttributes.hasValue(i13)) {
            I0(obtainStyledAttributes.getDimensionPixelSize(i13, -1));
        }
        int i14 = l.f25048x0;
        TypedValue peekValue = obtainStyledAttributes.peekValue(i14);
        if (peekValue != null && (i10 = peekValue.data) == -1) {
            K0(i10);
        } else {
            K0(obtainStyledAttributes.getDimensionPixelSize(i14, -1));
        }
        H0(obtainStyledAttributes.getBoolean(l.f25038w0, false));
        F0(obtainStyledAttributes.getBoolean(l.B0, false));
        E0(obtainStyledAttributes.getBoolean(l.f25018u0, true));
        O0(obtainStyledAttributes.getBoolean(l.A0, false));
        C0(obtainStyledAttributes.getBoolean(l.f24998s0, true));
        M0(obtainStyledAttributes.getInt(l.f25058y0, 0));
        G0(obtainStyledAttributes.getFloat(l.f25028v0, 0.5f));
        int i15 = l.f25008t0;
        TypedValue peekValue2 = obtainStyledAttributes.peekValue(i15);
        if (peekValue2 != null && peekValue2.type == 16) {
            D0(peekValue2.data);
        } else {
            D0(obtainStyledAttributes.getDimensionPixelOffset(i15, 0));
        }
        N0(obtainStyledAttributes.getInt(l.f25068z0, 500));
        this.f9652p = obtainStyledAttributes.getBoolean(l.F0, false);
        this.f9653q = obtainStyledAttributes.getBoolean(l.G0, false);
        this.f9654r = obtainStyledAttributes.getBoolean(l.H0, false);
        this.f9655s = obtainStyledAttributes.getBoolean(l.I0, true);
        this.f9656t = obtainStyledAttributes.getBoolean(l.C0, false);
        this.f9657u = obtainStyledAttributes.getBoolean(l.D0, false);
        this.f9658v = obtainStyledAttributes.getBoolean(l.E0, false);
        this.f9661y = obtainStyledAttributes.getBoolean(l.K0, true);
        obtainStyledAttributes.recycle();
        this.f9636d = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    /* loaded from: classes3.dex */
    public static abstract class f {
        public abstract void onSlide(View view, float f10);

        public abstract void onStateChanged(View view, int i10);

        void onLayout(View view) {
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void t(CoordinatorLayout coordinatorLayout, V v10, View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
    }
}
