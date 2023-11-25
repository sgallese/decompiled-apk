package androidx.drawerlayout.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.accessibility.n0;
import androidx.core.view.accessibility.s0;
import androidx.core.view.p;
import androidx.core.view.p0;
import androidx.customview.view.AbsSavedState;
import java.util.ArrayList;
import java.util.List;
import y2.c;

/* loaded from: classes.dex */
public class DrawerLayout extends ViewGroup {

    /* renamed from: b0  reason: collision with root package name */
    private static final int[] f4320b0 = {16843828};

    /* renamed from: c0  reason: collision with root package name */
    static final int[] f4321c0 = {16842931};

    /* renamed from: d0  reason: collision with root package name */
    static final boolean f4322d0;

    /* renamed from: e0  reason: collision with root package name */
    private static final boolean f4323e0;

    /* renamed from: f0  reason: collision with root package name */
    private static boolean f4324f0;
    private int A;
    private int B;
    private int C;
    private int D;
    private boolean E;
    private e F;
    private List<e> G;
    private float H;
    private float I;
    private Drawable J;
    private Drawable K;
    private Drawable L;
    private CharSequence M;
    private CharSequence N;
    private Object O;
    private boolean P;
    private Drawable Q;
    private Drawable R;
    private Drawable S;
    private Drawable T;
    private final ArrayList<View> U;
    private Rect V;
    private Matrix W;

    /* renamed from: a0  reason: collision with root package name */
    private final s0 f4325a0;

    /* renamed from: f  reason: collision with root package name */
    private final d f4326f;

    /* renamed from: m  reason: collision with root package name */
    private float f4327m;

    /* renamed from: p  reason: collision with root package name */
    private int f4328p;

    /* renamed from: q  reason: collision with root package name */
    private int f4329q;

    /* renamed from: r  reason: collision with root package name */
    private float f4330r;

    /* renamed from: s  reason: collision with root package name */
    private Paint f4331s;

    /* renamed from: t  reason: collision with root package name */
    private final y2.c f4332t;

    /* renamed from: u  reason: collision with root package name */
    private final y2.c f4333u;

    /* renamed from: v  reason: collision with root package name */
    private final g f4334v;

    /* renamed from: w  reason: collision with root package name */
    private final g f4335w;

    /* renamed from: x  reason: collision with root package name */
    private int f4336x;

    /* renamed from: y  reason: collision with root package name */
    private boolean f4337y;

    /* renamed from: z  reason: collision with root package name */
    private boolean f4338z;

    /* loaded from: classes.dex */
    class a implements s0 {
        a() {
        }

        @Override // androidx.core.view.accessibility.s0
        public boolean a(View view, s0.a aVar) {
            if (DrawerLayout.this.D(view) && DrawerLayout.this.r(view) != 2) {
                DrawerLayout.this.f(view);
                return true;
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    class b implements View.OnApplyWindowInsetsListener {
        b() {
        }

        @Override // android.view.View.OnApplyWindowInsetsListener
        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            boolean z10;
            DrawerLayout drawerLayout = (DrawerLayout) view;
            if (windowInsets.getSystemWindowInsetTop() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            drawerLayout.S(windowInsets, z10);
            return windowInsets.consumeSystemWindowInsets();
        }
    }

    /* loaded from: classes.dex */
    class c extends androidx.core.view.a {

        /* renamed from: d  reason: collision with root package name */
        private final Rect f4346d = new Rect();

        c() {
        }

        private void n(n0 n0Var, ViewGroup viewGroup) {
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (DrawerLayout.A(childAt)) {
                    n0Var.c(childAt);
                }
            }
        }

        private void o(n0 n0Var, n0 n0Var2) {
            Rect rect = this.f4346d;
            n0Var2.n(rect);
            n0Var.k0(rect);
            n0Var.c1(n0Var2.Z());
            n0Var.H0(n0Var2.z());
            n0Var.n0(n0Var2.q());
            n0Var.r0(n0Var2.t());
            n0Var.v0(n0Var2.O());
            n0Var.y0(n0Var2.Q());
            n0Var.h0(n0Var2.J());
            n0Var.Q0(n0Var2.W());
            n0Var.a(n0Var2.k());
        }

        @Override // androidx.core.view.a
        public boolean a(View view, AccessibilityEvent accessibilityEvent) {
            if (accessibilityEvent.getEventType() == 32) {
                List<CharSequence> text = accessibilityEvent.getText();
                View p10 = DrawerLayout.this.p();
                if (p10 != null) {
                    CharSequence s10 = DrawerLayout.this.s(DrawerLayout.this.t(p10));
                    if (s10 != null) {
                        text.add(s10);
                        return true;
                    }
                    return true;
                }
                return true;
            }
            return super.a(view, accessibilityEvent);
        }

        @Override // androidx.core.view.a
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            super.f(view, accessibilityEvent);
            accessibilityEvent.setClassName("androidx.drawerlayout.widget.DrawerLayout");
        }

        @Override // androidx.core.view.a
        public void g(View view, n0 n0Var) {
            if (DrawerLayout.f4322d0) {
                super.g(view, n0Var);
            } else {
                n0 c02 = n0.c0(n0Var);
                super.g(view, c02);
                n0Var.S0(view);
                ViewParent K = p0.K(view);
                if (K instanceof View) {
                    n0Var.J0((View) K);
                }
                o(n0Var, c02);
                c02.e0();
                n(n0Var, (ViewGroup) view);
            }
            n0Var.n0("androidx.drawerlayout.widget.DrawerLayout");
            n0Var.x0(false);
            n0Var.y0(false);
            n0Var.f0(n0.a.f4077e);
            n0Var.f0(n0.a.f4078f);
        }

        @Override // androidx.core.view.a
        public boolean i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (!DrawerLayout.f4322d0 && !DrawerLayout.A(view)) {
                return false;
            }
            return super.i(viewGroup, view, accessibilityEvent);
        }
    }

    /* loaded from: classes.dex */
    static final class d extends androidx.core.view.a {
        d() {
        }

        @Override // androidx.core.view.a
        public void g(View view, n0 n0Var) {
            super.g(view, n0Var);
            if (!DrawerLayout.A(view)) {
                n0Var.J0(null);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface e {
        void onDrawerClosed(View view);

        void onDrawerOpened(View view);

        void onDrawerSlide(View view, float f10);

        void onDrawerStateChanged(int i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class g extends c.AbstractC0604c {

        /* renamed from: a  reason: collision with root package name */
        private final int f4352a;

        /* renamed from: b  reason: collision with root package name */
        private y2.c f4353b;

        /* renamed from: c  reason: collision with root package name */
        private final Runnable f4354c = new a();

        /* loaded from: classes.dex */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                g.this.o();
            }
        }

        g(int i10) {
            this.f4352a = i10;
        }

        private void n() {
            int i10 = 3;
            if (this.f4352a == 3) {
                i10 = 5;
            }
            View n10 = DrawerLayout.this.n(i10);
            if (n10 != null) {
                DrawerLayout.this.f(n10);
            }
        }

        @Override // y2.c.AbstractC0604c
        public int a(View view, int i10, int i11) {
            if (DrawerLayout.this.c(view, 3)) {
                return Math.max(-view.getWidth(), Math.min(i10, 0));
            }
            int width = DrawerLayout.this.getWidth();
            return Math.max(width - view.getWidth(), Math.min(i10, width));
        }

        @Override // y2.c.AbstractC0604c
        public int b(View view, int i10, int i11) {
            return view.getTop();
        }

        @Override // y2.c.AbstractC0604c
        public int d(View view) {
            if (DrawerLayout.this.E(view)) {
                return view.getWidth();
            }
            return 0;
        }

        @Override // y2.c.AbstractC0604c
        public void f(int i10, int i11) {
            View n10;
            if ((i10 & 1) == 1) {
                n10 = DrawerLayout.this.n(3);
            } else {
                n10 = DrawerLayout.this.n(5);
            }
            if (n10 != null && DrawerLayout.this.r(n10) == 0) {
                this.f4353b.b(n10, i11);
            }
        }

        @Override // y2.c.AbstractC0604c
        public boolean g(int i10) {
            return false;
        }

        @Override // y2.c.AbstractC0604c
        public void h(int i10, int i11) {
            DrawerLayout.this.postDelayed(this.f4354c, 160L);
        }

        @Override // y2.c.AbstractC0604c
        public void i(View view, int i10) {
            ((f) view.getLayoutParams()).f4350c = false;
            n();
        }

        @Override // y2.c.AbstractC0604c
        public void j(int i10) {
            DrawerLayout.this.X(i10, this.f4353b.v());
        }

        @Override // y2.c.AbstractC0604c
        public void k(View view, int i10, int i11, int i12, int i13) {
            float width;
            int i14;
            int width2 = view.getWidth();
            if (DrawerLayout.this.c(view, 3)) {
                width = i10 + width2;
            } else {
                width = DrawerLayout.this.getWidth() - i10;
            }
            float f10 = width / width2;
            DrawerLayout.this.U(view, f10);
            if (f10 == 0.0f) {
                i14 = 4;
            } else {
                i14 = 0;
            }
            view.setVisibility(i14);
            DrawerLayout.this.invalidate();
        }

        @Override // y2.c.AbstractC0604c
        public void l(View view, float f10, float f11) {
            int i10;
            float u10 = DrawerLayout.this.u(view);
            int width = view.getWidth();
            if (DrawerLayout.this.c(view, 3)) {
                if (f10 <= 0.0f && (f10 != 0.0f || u10 <= 0.5f)) {
                    i10 = -width;
                } else {
                    i10 = 0;
                }
            } else {
                int width2 = DrawerLayout.this.getWidth();
                if (f10 < 0.0f || (f10 == 0.0f && u10 > 0.5f)) {
                    width2 -= width;
                }
                i10 = width2;
            }
            this.f4353b.O(i10, view.getTop());
            DrawerLayout.this.invalidate();
        }

        @Override // y2.c.AbstractC0604c
        public boolean m(View view, int i10) {
            if (DrawerLayout.this.E(view) && DrawerLayout.this.c(view, this.f4352a) && DrawerLayout.this.r(view) == 0) {
                return true;
            }
            return false;
        }

        void o() {
            boolean z10;
            View n10;
            int width;
            int x10 = this.f4353b.x();
            int i10 = 0;
            if (this.f4352a == 3) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                n10 = DrawerLayout.this.n(3);
                if (n10 != null) {
                    i10 = -n10.getWidth();
                }
                width = i10 + x10;
            } else {
                n10 = DrawerLayout.this.n(5);
                width = DrawerLayout.this.getWidth() - x10;
            }
            if (n10 != null) {
                if (((z10 && n10.getLeft() < width) || (!z10 && n10.getLeft() > width)) && DrawerLayout.this.r(n10) == 0) {
                    f fVar = (f) n10.getLayoutParams();
                    this.f4353b.Q(n10, width, n10.getTop());
                    fVar.f4350c = true;
                    DrawerLayout.this.invalidate();
                    n();
                    DrawerLayout.this.b();
                }
            }
        }

        public void p() {
            DrawerLayout.this.removeCallbacks(this.f4354c);
        }

        public void q(y2.c cVar) {
            this.f4353b = cVar;
        }
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        boolean z10 = true;
        f4322d0 = true;
        f4323e0 = true;
        if (i10 < 29) {
            z10 = false;
        }
        f4324f0 = z10;
    }

    public DrawerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, z2.a.f26394a);
    }

    static boolean A(View view) {
        if (p0.C(view) != 4 && p0.C(view) != 2) {
            return true;
        }
        return false;
    }

    private boolean H(float f10, float f11, View view) {
        if (this.V == null) {
            this.V = new Rect();
        }
        view.getHitRect(this.V);
        return this.V.contains((int) f10, (int) f11);
    }

    private void I(Drawable drawable, int i10) {
        if (drawable != null && androidx.core.graphics.drawable.a.h(drawable)) {
            androidx.core.graphics.drawable.a.m(drawable, i10);
        }
    }

    private Drawable P() {
        int E = p0.E(this);
        if (E == 0) {
            Drawable drawable = this.Q;
            if (drawable != null) {
                I(drawable, E);
                return this.Q;
            }
        } else {
            Drawable drawable2 = this.R;
            if (drawable2 != null) {
                I(drawable2, E);
                return this.R;
            }
        }
        return this.S;
    }

    private Drawable Q() {
        int E = p0.E(this);
        if (E == 0) {
            Drawable drawable = this.R;
            if (drawable != null) {
                I(drawable, E);
                return this.R;
            }
        } else {
            Drawable drawable2 = this.Q;
            if (drawable2 != null) {
                I(drawable2, E);
                return this.Q;
            }
        }
        return this.T;
    }

    private void R() {
        if (f4323e0) {
            return;
        }
        this.K = P();
        this.L = Q();
    }

    private void V(View view) {
        n0.a aVar = n0.a.f4097y;
        p0.o0(view, aVar.b());
        if (D(view) && r(view) != 2) {
            p0.q0(view, aVar, null, this.f4325a0);
        }
    }

    private void W(View view, boolean z10) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if ((!z10 && !E(childAt)) || (z10 && childAt == view)) {
                p0.F0(childAt, 1);
            } else {
                p0.F0(childAt, 4);
            }
        }
    }

    private boolean m(MotionEvent motionEvent, View view) {
        if (!view.getMatrix().isIdentity()) {
            MotionEvent v10 = v(motionEvent, view);
            boolean dispatchGenericMotionEvent = view.dispatchGenericMotionEvent(v10);
            v10.recycle();
            return dispatchGenericMotionEvent;
        }
        float scrollX = getScrollX() - view.getLeft();
        float scrollY = getScrollY() - view.getTop();
        motionEvent.offsetLocation(scrollX, scrollY);
        boolean dispatchGenericMotionEvent2 = view.dispatchGenericMotionEvent(motionEvent);
        motionEvent.offsetLocation(-scrollX, -scrollY);
        return dispatchGenericMotionEvent2;
    }

    private MotionEvent v(MotionEvent motionEvent, View view) {
        float scrollX = getScrollX() - view.getLeft();
        float scrollY = getScrollY() - view.getTop();
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation(scrollX, scrollY);
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            if (this.W == null) {
                this.W = new Matrix();
            }
            matrix.invert(this.W);
            obtain.transform(this.W);
        }
        return obtain;
    }

    static String w(int i10) {
        if ((i10 & 3) == 3) {
            return "LEFT";
        }
        if ((i10 & 5) == 5) {
            return "RIGHT";
        }
        return Integer.toHexString(i10);
    }

    private static boolean x(View view) {
        Drawable background = view.getBackground();
        if (background == null || background.getOpacity() != -1) {
            return false;
        }
        return true;
    }

    private boolean y() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            if (((f) getChildAt(i10).getLayoutParams()).f4350c) {
                return true;
            }
        }
        return false;
    }

    private boolean z() {
        if (p() != null) {
            return true;
        }
        return false;
    }

    boolean B(View view) {
        if (((f) view.getLayoutParams()).f4348a == 0) {
            return true;
        }
        return false;
    }

    public boolean C(int i10) {
        View n10 = n(i10);
        if (n10 != null) {
            return D(n10);
        }
        return false;
    }

    public boolean D(View view) {
        if (E(view)) {
            if ((((f) view.getLayoutParams()).f4351d & 1) == 1) {
                return true;
            }
            return false;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    boolean E(View view) {
        int b10 = p.b(((f) view.getLayoutParams()).f4348a, p0.E(view));
        if ((b10 & 3) != 0 || (b10 & 5) != 0) {
            return true;
        }
        return false;
    }

    public boolean F(int i10) {
        View n10 = n(i10);
        if (n10 != null) {
            return G(n10);
        }
        return false;
    }

    public boolean G(View view) {
        if (E(view)) {
            if (((f) view.getLayoutParams()).f4349b > 0.0f) {
                return true;
            }
            return false;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    void J(View view, float f10) {
        float u10 = u(view);
        float width = view.getWidth();
        int i10 = ((int) (width * f10)) - ((int) (u10 * width));
        if (!c(view, 3)) {
            i10 = -i10;
        }
        view.offsetLeftAndRight(i10);
        U(view, f10);
    }

    public void K(int i10) {
        L(i10, true);
    }

    public void L(int i10, boolean z10) {
        View n10 = n(i10);
        if (n10 != null) {
            N(n10, z10);
            return;
        }
        throw new IllegalArgumentException("No drawer view found with gravity " + w(i10));
    }

    public void M(View view) {
        N(view, true);
    }

    public void N(View view, boolean z10) {
        if (E(view)) {
            f fVar = (f) view.getLayoutParams();
            if (this.f4338z) {
                fVar.f4349b = 1.0f;
                fVar.f4351d = 1;
                W(view, true);
                V(view);
            } else if (z10) {
                fVar.f4351d |= 2;
                if (c(view, 3)) {
                    this.f4332t.Q(view, 0, view.getTop());
                } else {
                    this.f4333u.Q(view, getWidth() - view.getWidth(), view.getTop());
                }
            } else {
                J(view, 1.0f);
                X(0, view);
                view.setVisibility(0);
            }
            invalidate();
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
    }

    public void O(e eVar) {
        List<e> list;
        if (eVar == null || (list = this.G) == null) {
            return;
        }
        list.remove(eVar);
    }

    public void S(Object obj, boolean z10) {
        boolean z11;
        this.O = obj;
        this.P = z10;
        if (!z10 && getBackground() == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        setWillNotDraw(z11);
        requestLayout();
    }

    public void T(int i10, int i11) {
        View n10;
        y2.c cVar;
        int b10 = p.b(i11, p0.E(this));
        if (i11 != 3) {
            if (i11 != 5) {
                if (i11 != 8388611) {
                    if (i11 == 8388613) {
                        this.D = i10;
                    }
                } else {
                    this.C = i10;
                }
            } else {
                this.B = i10;
            }
        } else {
            this.A = i10;
        }
        if (i10 != 0) {
            if (b10 == 3) {
                cVar = this.f4332t;
            } else {
                cVar = this.f4333u;
            }
            cVar.a();
        }
        if (i10 != 1) {
            if (i10 == 2 && (n10 = n(b10)) != null) {
                M(n10);
                return;
            }
            return;
        }
        View n11 = n(b10);
        if (n11 != null) {
            f(n11);
        }
    }

    void U(View view, float f10) {
        f fVar = (f) view.getLayoutParams();
        if (f10 == fVar.f4349b) {
            return;
        }
        fVar.f4349b = f10;
        l(view, f10);
    }

    void X(int i10, View view) {
        int i11;
        int A = this.f4332t.A();
        int A2 = this.f4333u.A();
        if (A != 1 && A2 != 1) {
            i11 = 2;
            if (A != 2 && A2 != 2) {
                i11 = 0;
            }
        } else {
            i11 = 1;
        }
        if (view != null && i10 == 0) {
            float f10 = ((f) view.getLayoutParams()).f4349b;
            if (f10 == 0.0f) {
                j(view);
            } else if (f10 == 1.0f) {
                k(view);
            }
        }
        if (i11 != this.f4336x) {
            this.f4336x = i11;
            List<e> list = this.G;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.G.get(size).onDrawerStateChanged(i11);
                }
            }
        }
    }

    public void a(e eVar) {
        if (eVar == null) {
            return;
        }
        if (this.G == null) {
            this.G = new ArrayList();
        }
        this.G.add(eVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i10, int i11) {
        if (getDescendantFocusability() == 393216) {
            return;
        }
        int childCount = getChildCount();
        boolean z10 = false;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (E(childAt)) {
                if (D(childAt)) {
                    childAt.addFocusables(arrayList, i10, i11);
                    z10 = true;
                }
            } else {
                this.U.add(childAt);
            }
        }
        if (!z10) {
            int size = this.U.size();
            for (int i13 = 0; i13 < size; i13++) {
                View view = this.U.get(i13);
                if (view.getVisibility() == 0) {
                    view.addFocusables(arrayList, i10, i11);
                }
            }
        }
        this.U.clear();
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        if (o() == null && !E(view)) {
            p0.F0(view, 1);
        } else {
            p0.F0(view, 4);
        }
        if (!f4322d0) {
            p0.u0(view, this.f4326f);
        }
    }

    void b() {
        if (!this.E) {
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                getChildAt(i10).dispatchTouchEvent(obtain);
            }
            obtain.recycle();
            this.E = true;
        }
    }

    boolean c(View view, int i10) {
        if ((t(view) & i10) == i10) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if ((layoutParams instanceof f) && super.checkLayoutParams(layoutParams)) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public void computeScroll() {
        int childCount = getChildCount();
        float f10 = 0.0f;
        for (int i10 = 0; i10 < childCount; i10++) {
            f10 = Math.max(f10, ((f) getChildAt(i10).getLayoutParams()).f4349b);
        }
        this.f4330r = f10;
        boolean m10 = this.f4332t.m(true);
        boolean m11 = this.f4333u.m(true);
        if (m10 || m11) {
            p0.l0(this);
        }
    }

    public void d(int i10) {
        e(i10, true);
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) != 0 && motionEvent.getAction() != 10 && this.f4330r > 0.0f) {
            int childCount = getChildCount();
            if (childCount != 0) {
                float x10 = motionEvent.getX();
                float y10 = motionEvent.getY();
                for (int i10 = childCount - 1; i10 >= 0; i10--) {
                    View childAt = getChildAt(i10);
                    if (H(x10, y10, childAt) && !B(childAt) && m(motionEvent, childAt)) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }
        return super.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j10) {
        int height = getHeight();
        boolean B = B(view);
        int width = getWidth();
        int save = canvas.save();
        int i10 = 0;
        if (B) {
            int childCount = getChildCount();
            int i11 = 0;
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = getChildAt(i12);
                if (childAt != view && childAt.getVisibility() == 0 && x(childAt) && E(childAt) && childAt.getHeight() >= height) {
                    if (c(childAt, 3)) {
                        int right = childAt.getRight();
                        if (right > i11) {
                            i11 = right;
                        }
                    } else {
                        int left = childAt.getLeft();
                        if (left < width) {
                            width = left;
                        }
                    }
                }
            }
            canvas.clipRect(i11, 0, width, getHeight());
            i10 = i11;
        }
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restoreToCount(save);
        float f10 = this.f4330r;
        if (f10 > 0.0f && B) {
            this.f4331s.setColor((this.f4329q & 16777215) | (((int) ((((-16777216) & r2) >>> 24) * f10)) << 24));
            canvas.drawRect(i10, 0.0f, width, getHeight(), this.f4331s);
        } else if (this.K != null && c(view, 3)) {
            int intrinsicWidth = this.K.getIntrinsicWidth();
            int right2 = view.getRight();
            float max = Math.max(0.0f, Math.min(right2 / this.f4332t.x(), 1.0f));
            this.K.setBounds(right2, view.getTop(), intrinsicWidth + right2, view.getBottom());
            this.K.setAlpha((int) (max * 255.0f));
            this.K.draw(canvas);
        } else if (this.L != null && c(view, 5)) {
            int intrinsicWidth2 = this.L.getIntrinsicWidth();
            int left2 = view.getLeft();
            float max2 = Math.max(0.0f, Math.min((getWidth() - left2) / this.f4333u.x(), 1.0f));
            this.L.setBounds(left2 - intrinsicWidth2, view.getTop(), left2, view.getBottom());
            this.L.setAlpha((int) (max2 * 255.0f));
            this.L.draw(canvas);
        }
        return drawChild;
    }

    public void e(int i10, boolean z10) {
        View n10 = n(i10);
        if (n10 != null) {
            g(n10, z10);
            return;
        }
        throw new IllegalArgumentException("No drawer view found with gravity " + w(i10));
    }

    public void f(View view) {
        g(view, true);
    }

    public void g(View view, boolean z10) {
        if (E(view)) {
            f fVar = (f) view.getLayoutParams();
            if (this.f4338z) {
                fVar.f4349b = 0.0f;
                fVar.f4351d = 0;
            } else if (z10) {
                fVar.f4351d |= 4;
                if (c(view, 3)) {
                    this.f4332t.Q(view, -view.getWidth(), view.getTop());
                } else {
                    this.f4333u.Q(view, getWidth(), view.getTop());
                }
            } else {
                J(view, 0.0f);
                X(0, view);
                view.setVisibility(4);
            }
            invalidate();
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new f(-1, -1);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof f) {
            return new f((f) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new f((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new f(layoutParams);
    }

    public float getDrawerElevation() {
        if (f4323e0) {
            return this.f4327m;
        }
        return 0.0f;
    }

    public Drawable getStatusBarBackgroundDrawable() {
        return this.J;
    }

    public void h() {
        i(false);
    }

    void i(boolean z10) {
        boolean Q;
        int childCount = getChildCount();
        boolean z11 = false;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            f fVar = (f) childAt.getLayoutParams();
            if (E(childAt) && (!z10 || fVar.f4350c)) {
                int width = childAt.getWidth();
                if (c(childAt, 3)) {
                    Q = this.f4332t.Q(childAt, -width, childAt.getTop());
                } else {
                    Q = this.f4333u.Q(childAt, getWidth(), childAt.getTop());
                }
                z11 |= Q;
                fVar.f4350c = false;
            }
        }
        this.f4334v.p();
        this.f4335w.p();
        if (z11) {
            invalidate();
        }
    }

    void j(View view) {
        View rootView;
        f fVar = (f) view.getLayoutParams();
        if ((fVar.f4351d & 1) == 1) {
            fVar.f4351d = 0;
            List<e> list = this.G;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.G.get(size).onDrawerClosed(view);
                }
            }
            W(view, false);
            V(view);
            if (hasWindowFocus() && (rootView = getRootView()) != null) {
                rootView.sendAccessibilityEvent(32);
            }
        }
    }

    void k(View view) {
        f fVar = (f) view.getLayoutParams();
        if ((fVar.f4351d & 1) == 0) {
            fVar.f4351d = 1;
            List<e> list = this.G;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.G.get(size).onDrawerOpened(view);
                }
            }
            W(view, true);
            V(view);
            if (hasWindowFocus()) {
                sendAccessibilityEvent(32);
            }
        }
    }

    void l(View view, float f10) {
        List<e> list = this.G;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.G.get(size).onDrawerSlide(view, f10);
            }
        }
    }

    View n(int i10) {
        int b10 = p.b(i10, p0.E(this)) & 7;
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if ((t(childAt) & 7) == b10) {
                return childAt;
            }
        }
        return null;
    }

    View o() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if ((((f) childAt.getLayoutParams()).f4351d & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f4338z = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f4338z = true;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i10;
        super.onDraw(canvas);
        if (this.P && this.J != null) {
            Object obj = this.O;
            if (obj != null) {
                i10 = ((WindowInsets) obj).getSystemWindowInsetTop();
            } else {
                i10 = 0;
            }
            if (i10 > 0) {
                this.J.setBounds(0, 0, getWidth(), i10);
                this.J.draw(canvas);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001b, code lost:
    
        if (r0 != 3) goto L13;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            int r0 = r7.getActionMasked()
            y2.c r1 = r6.f4332t
            boolean r1 = r1.P(r7)
            y2.c r2 = r6.f4333u
            boolean r2 = r2.P(r7)
            r1 = r1 | r2
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L38
            if (r0 == r2) goto L31
            r7 = 2
            r4 = 3
            if (r0 == r7) goto L1e
            if (r0 == r4) goto L31
            goto L36
        L1e:
            y2.c r7 = r6.f4332t
            boolean r7 = r7.d(r4)
            if (r7 == 0) goto L36
            androidx.drawerlayout.widget.DrawerLayout$g r7 = r6.f4334v
            r7.p()
            androidx.drawerlayout.widget.DrawerLayout$g r7 = r6.f4335w
            r7.p()
            goto L36
        L31:
            r6.i(r2)
            r6.E = r3
        L36:
            r7 = 0
            goto L60
        L38:
            float r0 = r7.getX()
            float r7 = r7.getY()
            r6.H = r0
            r6.I = r7
            float r4 = r6.f4330r
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L5d
            y2.c r4 = r6.f4332t
            int r0 = (int) r0
            int r7 = (int) r7
            android.view.View r7 = r4.t(r0, r7)
            if (r7 == 0) goto L5d
            boolean r7 = r6.B(r7)
            if (r7 == 0) goto L5d
            r7 = 1
            goto L5e
        L5d:
            r7 = 0
        L5e:
            r6.E = r3
        L60:
            if (r1 != 0) goto L70
            if (r7 != 0) goto L70
            boolean r7 = r6.y()
            if (r7 != 0) goto L70
            boolean r7 = r6.E
            if (r7 == 0) goto L6f
            goto L70
        L6f:
            r2 = 0
        L70:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (i10 == 4 && z()) {
            keyEvent.startTracking();
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        if (i10 == 4) {
            View p10 = p();
            if (p10 != null && r(p10) == 0) {
                h();
            }
            if (p10 != null) {
                return true;
            }
            return false;
        }
        return super.onKeyUp(i10, keyEvent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00d3, code lost:
    
        r1 = getRootWindowInsets();
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onLayout(boolean r17, int r18, int r19, int r20, int r21) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    @SuppressLint({"WrongConstant"})
    protected void onMeasure(int i10, int i11) {
        boolean z10;
        boolean z11;
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        if (mode != 1073741824 || mode2 != 1073741824) {
            if (isInEditMode()) {
                if (mode == 0) {
                    size = 300;
                }
                if (mode2 == 0) {
                    size2 = 300;
                }
            } else {
                throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
            }
        }
        setMeasuredDimension(size, size2);
        if (this.O != null && p0.B(this)) {
            z10 = true;
        } else {
            z10 = false;
        }
        int E = p0.E(this);
        int childCount = getChildCount();
        boolean z12 = false;
        boolean z13 = false;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (z10) {
                    int b10 = p.b(fVar.f4348a, E);
                    if (p0.B(childAt)) {
                        WindowInsets windowInsets = (WindowInsets) this.O;
                        if (b10 == 3) {
                            windowInsets = windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), 0, windowInsets.getSystemWindowInsetBottom());
                        } else if (b10 == 5) {
                            windowInsets = windowInsets.replaceSystemWindowInsets(0, windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
                        }
                        childAt.dispatchApplyWindowInsets(windowInsets);
                    } else {
                        WindowInsets windowInsets2 = (WindowInsets) this.O;
                        if (b10 == 3) {
                            windowInsets2 = windowInsets2.replaceSystemWindowInsets(windowInsets2.getSystemWindowInsetLeft(), windowInsets2.getSystemWindowInsetTop(), 0, windowInsets2.getSystemWindowInsetBottom());
                        } else if (b10 == 5) {
                            windowInsets2 = windowInsets2.replaceSystemWindowInsets(0, windowInsets2.getSystemWindowInsetTop(), windowInsets2.getSystemWindowInsetRight(), windowInsets2.getSystemWindowInsetBottom());
                        }
                        ((ViewGroup.MarginLayoutParams) fVar).leftMargin = windowInsets2.getSystemWindowInsetLeft();
                        ((ViewGroup.MarginLayoutParams) fVar).topMargin = windowInsets2.getSystemWindowInsetTop();
                        ((ViewGroup.MarginLayoutParams) fVar).rightMargin = windowInsets2.getSystemWindowInsetRight();
                        ((ViewGroup.MarginLayoutParams) fVar).bottomMargin = windowInsets2.getSystemWindowInsetBottom();
                    }
                }
                if (B(childAt)) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((size - ((ViewGroup.MarginLayoutParams) fVar).leftMargin) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec((size2 - ((ViewGroup.MarginLayoutParams) fVar).topMargin) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin, 1073741824));
                } else if (E(childAt)) {
                    if (f4323e0) {
                        float y10 = p0.y(childAt);
                        float f10 = this.f4327m;
                        if (y10 != f10) {
                            p0.C0(childAt, f10);
                        }
                    }
                    int t10 = t(childAt) & 7;
                    if (t10 == 3) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if ((z11 && z12) || (!z11 && z13)) {
                        throw new IllegalStateException("Child drawer has absolute gravity " + w(t10) + " but this DrawerLayout already has a drawer view along that edge");
                    }
                    if (z11) {
                        z12 = true;
                    } else {
                        z13 = true;
                    }
                    childAt.measure(ViewGroup.getChildMeasureSpec(i10, this.f4328p + ((ViewGroup.MarginLayoutParams) fVar).leftMargin + ((ViewGroup.MarginLayoutParams) fVar).rightMargin, ((ViewGroup.MarginLayoutParams) fVar).width), ViewGroup.getChildMeasureSpec(i11, ((ViewGroup.MarginLayoutParams) fVar).topMargin + ((ViewGroup.MarginLayoutParams) fVar).bottomMargin, ((ViewGroup.MarginLayoutParams) fVar).height));
                } else {
                    throw new IllegalStateException("Child " + childAt + " at index " + i12 + " does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY");
                }
            }
        }
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        View n10;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        int i10 = savedState.f4339p;
        if (i10 != 0 && (n10 = n(i10)) != null) {
            M(n10);
        }
        int i11 = savedState.f4340q;
        if (i11 != 3) {
            T(i11, 3);
        }
        int i12 = savedState.f4341r;
        if (i12 != 3) {
            T(i12, 5);
        }
        int i13 = savedState.f4342s;
        if (i13 != 3) {
            T(i13, 8388611);
        }
        int i14 = savedState.f4343t;
        if (i14 != 3) {
            T(i14, 8388613);
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i10) {
        R();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        boolean z10;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            f fVar = (f) getChildAt(i10).getLayoutParams();
            int i11 = fVar.f4351d;
            boolean z11 = true;
            if (i11 == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (i11 != 2) {
                z11 = false;
            }
            if (z10 || z11) {
                savedState.f4339p = fVar.f4348a;
                break;
            }
        }
        savedState.f4340q = this.A;
        savedState.f4341r = this.B;
        savedState.f4342s = this.C;
        savedState.f4343t = this.D;
        return savedState;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005b, code lost:
    
        if (r(r7) != 2) goto L20;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            y2.c r0 = r6.f4332t
            r0.F(r7)
            y2.c r0 = r6.f4333u
            r0.F(r7)
            int r0 = r7.getAction()
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L62
            if (r0 == r2) goto L20
            r7 = 3
            if (r0 == r7) goto L1a
            goto L70
        L1a:
            r6.i(r2)
            r6.E = r1
            goto L70
        L20:
            float r0 = r7.getX()
            float r7 = r7.getY()
            y2.c r3 = r6.f4332t
            int r4 = (int) r0
            int r5 = (int) r7
            android.view.View r3 = r3.t(r4, r5)
            if (r3 == 0) goto L5d
            boolean r3 = r6.B(r3)
            if (r3 == 0) goto L5d
            float r3 = r6.H
            float r0 = r0 - r3
            float r3 = r6.I
            float r7 = r7 - r3
            y2.c r3 = r6.f4332t
            int r3 = r3.z()
            float r0 = r0 * r0
            float r7 = r7 * r7
            float r0 = r0 + r7
            int r3 = r3 * r3
            float r7 = (float) r3
            int r7 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r7 >= 0) goto L5d
            android.view.View r7 = r6.o()
            if (r7 == 0) goto L5d
            int r7 = r6.r(r7)
            r0 = 2
            if (r7 != r0) goto L5e
        L5d:
            r1 = 1
        L5e:
            r6.i(r1)
            goto L70
        L62:
            float r0 = r7.getX()
            float r7 = r7.getY()
            r6.H = r0
            r6.I = r7
            r6.E = r1
        L70:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    View p() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (E(childAt) && G(childAt)) {
                return childAt;
            }
        }
        return null;
    }

    public int q(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int E = p0.E(this);
        if (i10 != 3) {
            if (i10 != 5) {
                if (i10 != 8388611) {
                    if (i10 == 8388613) {
                        int i15 = this.D;
                        if (i15 != 3) {
                            return i15;
                        }
                        if (E == 0) {
                            i14 = this.B;
                        } else {
                            i14 = this.A;
                        }
                        if (i14 != 3) {
                            return i14;
                        }
                        return 0;
                    }
                    return 0;
                }
                int i16 = this.C;
                if (i16 != 3) {
                    return i16;
                }
                if (E == 0) {
                    i13 = this.A;
                } else {
                    i13 = this.B;
                }
                if (i13 != 3) {
                    return i13;
                }
                return 0;
            }
            int i17 = this.B;
            if (i17 != 3) {
                return i17;
            }
            if (E == 0) {
                i12 = this.D;
            } else {
                i12 = this.C;
            }
            if (i12 != 3) {
                return i12;
            }
            return 0;
        }
        int i18 = this.A;
        if (i18 != 3) {
            return i18;
        }
        if (E == 0) {
            i11 = this.C;
        } else {
            i11 = this.D;
        }
        if (i11 != 3) {
            return i11;
        }
        return 0;
    }

    public int r(View view) {
        if (E(view)) {
            return q(((f) view.getLayoutParams()).f4348a);
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        super.requestDisallowInterceptTouchEvent(z10);
        if (z10) {
            i(true);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (!this.f4337y) {
            super.requestLayout();
        }
    }

    public CharSequence s(int i10) {
        int b10 = p.b(i10, p0.E(this));
        if (b10 == 3) {
            return this.M;
        }
        if (b10 == 5) {
            return this.N;
        }
        return null;
    }

    public void setDrawerElevation(float f10) {
        this.f4327m = f10;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (E(childAt)) {
                p0.C0(childAt, this.f4327m);
            }
        }
    }

    @Deprecated
    public void setDrawerListener(e eVar) {
        e eVar2 = this.F;
        if (eVar2 != null) {
            O(eVar2);
        }
        if (eVar != null) {
            a(eVar);
        }
        this.F = eVar;
    }

    public void setDrawerLockMode(int i10) {
        T(i10, 3);
        T(i10, 5);
    }

    public void setScrimColor(int i10) {
        this.f4329q = i10;
        invalidate();
    }

    public void setStatusBarBackground(Drawable drawable) {
        this.J = drawable;
        invalidate();
    }

    public void setStatusBarBackgroundColor(int i10) {
        this.J = new ColorDrawable(i10);
        invalidate();
    }

    int t(View view) {
        return p.b(((f) view.getLayoutParams()).f4348a, p0.E(this));
    }

    float u(View view) {
        return ((f) view.getLayoutParams()).f4349b;
    }

    public DrawerLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f4326f = new d();
        this.f4329q = -1728053248;
        this.f4331s = new Paint();
        this.f4338z = true;
        this.A = 3;
        this.B = 3;
        this.C = 3;
        this.D = 3;
        this.Q = null;
        this.R = null;
        this.S = null;
        this.T = null;
        this.f4325a0 = new a();
        setDescendantFocusability(262144);
        float f10 = getResources().getDisplayMetrics().density;
        this.f4328p = (int) ((64.0f * f10) + 0.5f);
        float f11 = f10 * 400.0f;
        g gVar = new g(3);
        this.f4334v = gVar;
        g gVar2 = new g(5);
        this.f4335w = gVar2;
        y2.c n10 = y2.c.n(this, 1.0f, gVar);
        this.f4332t = n10;
        n10.M(1);
        n10.N(f11);
        gVar.q(n10);
        y2.c n11 = y2.c.n(this, 1.0f, gVar2);
        this.f4333u = n11;
        n11.M(2);
        n11.N(f11);
        gVar2.q(n11);
        setFocusableInTouchMode(true);
        p0.F0(this, 1);
        p0.u0(this, new c());
        setMotionEventSplittingEnabled(false);
        if (p0.B(this)) {
            setOnApplyWindowInsetsListener(new b());
            setSystemUiVisibility(1280);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f4320b0);
            try {
                this.J = obtainStyledAttributes.getDrawable(0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, z2.c.f26397b, i10, 0);
        try {
            int i11 = z2.c.f26398c;
            if (obtainStyledAttributes2.hasValue(i11)) {
                this.f4327m = obtainStyledAttributes2.getDimension(i11, 0.0f);
            } else {
                this.f4327m = getResources().getDimension(z2.b.f26395a);
            }
            obtainStyledAttributes2.recycle();
            this.U = new ArrayList<>();
        } catch (Throwable th) {
            obtainStyledAttributes2.recycle();
            throw th;
        }
    }

    public void setStatusBarBackground(int i10) {
        this.J = i10 != 0 ? androidx.core.content.a.e(getContext(), i10) : null;
        invalidate();
    }

    /* loaded from: classes.dex */
    public static class f extends ViewGroup.MarginLayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public int f4348a;

        /* renamed from: b  reason: collision with root package name */
        float f4349b;

        /* renamed from: c  reason: collision with root package name */
        boolean f4350c;

        /* renamed from: d  reason: collision with root package name */
        int f4351d;

        public f(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f4348a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, DrawerLayout.f4321c0);
            this.f4348a = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        }

        public f(int i10, int i11) {
            super(i10, i11);
            this.f4348a = 0;
        }

        public f(f fVar) {
            super((ViewGroup.MarginLayoutParams) fVar);
            this.f4348a = 0;
            this.f4348a = fVar.f4348a;
        }

        public f(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f4348a = 0;
        }

        public f(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f4348a = 0;
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new f(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: p  reason: collision with root package name */
        int f4339p;

        /* renamed from: q  reason: collision with root package name */
        int f4340q;

        /* renamed from: r  reason: collision with root package name */
        int f4341r;

        /* renamed from: s  reason: collision with root package name */
        int f4342s;

        /* renamed from: t  reason: collision with root package name */
        int f4343t;

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

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f4339p = 0;
            this.f4339p = parcel.readInt();
            this.f4340q = parcel.readInt();
            this.f4341r = parcel.readInt();
            this.f4342s = parcel.readInt();
            this.f4343t = parcel.readInt();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f4339p);
            parcel.writeInt(this.f4340q);
            parcel.writeInt(this.f4341r);
            parcel.writeInt(this.f4342s);
            parcel.writeInt(this.f4343t);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
            this.f4339p = 0;
        }
    }
}
