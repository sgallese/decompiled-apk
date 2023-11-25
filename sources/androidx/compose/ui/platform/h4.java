package androidx.compose.ui.platform;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.compose.ui.graphics.b;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* compiled from: ViewLayer.android.kt */
/* loaded from: classes.dex */
public final class h4 extends View implements p1.g1 {
    public static final c B = new c(null);
    private static final pc.p<View, Matrix, dc.w> C = b.f2701f;
    private static final ViewOutlineProvider D = new a();
    private static Method E;
    private static Field F;
    private static boolean G;
    private static boolean H;
    private final long A;

    /* renamed from: f  reason: collision with root package name */
    private final AndroidComposeView f2688f;

    /* renamed from: m  reason: collision with root package name */
    private final e1 f2689m;

    /* renamed from: p  reason: collision with root package name */
    private pc.l<? super a1.h1, dc.w> f2690p;

    /* renamed from: q  reason: collision with root package name */
    private pc.a<dc.w> f2691q;

    /* renamed from: r  reason: collision with root package name */
    private final x1 f2692r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f2693s;

    /* renamed from: t  reason: collision with root package name */
    private Rect f2694t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f2695u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f2696v;

    /* renamed from: w  reason: collision with root package name */
    private final a1.i1 f2697w;

    /* renamed from: x  reason: collision with root package name */
    private final q1<View> f2698x;

    /* renamed from: y  reason: collision with root package name */
    private long f2699y;

    /* renamed from: z  reason: collision with root package name */
    private boolean f2700z;

    /* compiled from: ViewLayer.android.kt */
    /* loaded from: classes.dex */
    public static final class a extends ViewOutlineProvider {
        a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            qc.q.i(view, "view");
            qc.q.i(outline, "outline");
            Outline c10 = ((h4) view).f2692r.c();
            qc.q.f(c10);
            outline.set(c10);
        }
    }

    /* compiled from: ViewLayer.android.kt */
    /* loaded from: classes.dex */
    static final class b extends qc.r implements pc.p<View, Matrix, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        public static final b f2701f = new b();

        b() {
            super(2);
        }

        public final void a(View view, Matrix matrix) {
            qc.q.i(view, "view");
            qc.q.i(matrix, "matrix");
            matrix.set(view.getMatrix());
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ dc.w invoke(View view, Matrix matrix) {
            a(view, matrix);
            return dc.w.f13270a;
        }
    }

    /* compiled from: ViewLayer.android.kt */
    /* loaded from: classes.dex */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(qc.h hVar) {
            this();
        }

        public final boolean a() {
            return h4.G;
        }

        public final boolean b() {
            return h4.H;
        }

        public final void c(boolean z10) {
            h4.H = z10;
        }

        @SuppressLint({"BanUncheckedReflection"})
        public final void d(View view) {
            qc.q.i(view, "view");
            try {
                if (!a()) {
                    h4.G = true;
                    if (Build.VERSION.SDK_INT < 28) {
                        h4.E = View.class.getDeclaredMethod("updateDisplayListIfDirty", new Class[0]);
                        h4.F = View.class.getDeclaredField("mRecreateDisplayList");
                    } else {
                        h4.E = (Method) Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass()).invoke(View.class, "updateDisplayListIfDirty", new Class[0]);
                        h4.F = (Field) Class.class.getDeclaredMethod("getDeclaredField", String.class).invoke(View.class, "mRecreateDisplayList");
                    }
                    Method method = h4.E;
                    if (method != null) {
                        method.setAccessible(true);
                    }
                    Field field = h4.F;
                    if (field != null) {
                        field.setAccessible(true);
                    }
                }
                Field field2 = h4.F;
                if (field2 != null) {
                    field2.setBoolean(view, true);
                }
                Method method2 = h4.E;
                if (method2 != null) {
                    method2.invoke(view, new Object[0]);
                }
            } catch (Throwable unused) {
                c(true);
            }
        }
    }

    /* compiled from: ViewLayer.android.kt */
    /* loaded from: classes.dex */
    private static final class d {

        /* renamed from: a  reason: collision with root package name */
        public static final d f2702a = new d();

        private d() {
        }

        public static final long a(View view) {
            long uniqueDrawingId;
            qc.q.i(view, "view");
            uniqueDrawingId = view.getUniqueDrawingId();
            return uniqueDrawingId;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h4(AndroidComposeView androidComposeView, e1 e1Var, pc.l<? super a1.h1, dc.w> lVar, pc.a<dc.w> aVar) {
        super(androidComposeView.getContext());
        qc.q.i(androidComposeView, "ownerView");
        qc.q.i(e1Var, "container");
        qc.q.i(lVar, "drawBlock");
        qc.q.i(aVar, "invalidateParentLayer");
        this.f2688f = androidComposeView;
        this.f2689m = e1Var;
        this.f2690p = lVar;
        this.f2691q = aVar;
        this.f2692r = new x1(androidComposeView.getDensity());
        this.f2697w = new a1.i1();
        this.f2698x = new q1<>(C);
        this.f2699y = androidx.compose.ui.graphics.g.f2458b.a();
        this.f2700z = true;
        setWillNotDraw(false);
        e1Var.addView(this);
        this.A = View.generateViewId();
    }

    private final a1.e4 getManualClipPath() {
        if (getClipToOutline() && !this.f2692r.d()) {
            return this.f2692r.b();
        }
        return null;
    }

    private final void setInvalidated(boolean z10) {
        if (z10 != this.f2695u) {
            this.f2695u = z10;
            this.f2688f.h0(this, z10);
        }
    }

    private final void t() {
        Rect rect;
        if (this.f2693s) {
            Rect rect2 = this.f2694t;
            if (rect2 == null) {
                this.f2694t = new Rect(0, 0, getWidth(), getHeight());
            } else {
                qc.q.f(rect2);
                rect2.set(0, 0, getWidth(), getHeight());
            }
            rect = this.f2694t;
        } else {
            rect = null;
        }
        setClipBounds(rect);
    }

    private final void u() {
        ViewOutlineProvider viewOutlineProvider;
        if (this.f2692r.c() != null) {
            viewOutlineProvider = D;
        } else {
            viewOutlineProvider = null;
        }
        setOutlineProvider(viewOutlineProvider);
    }

    @Override // p1.g1
    public void a(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, long j10, a1.q4 q4Var, boolean z10, a1.l4 l4Var, long j11, long j12, int i10, j2.r rVar, j2.e eVar) {
        pc.a<dc.w> aVar;
        qc.q.i(q4Var, "shape");
        qc.q.i(rVar, "layoutDirection");
        qc.q.i(eVar, "density");
        this.f2699y = j10;
        setScaleX(f10);
        setScaleY(f11);
        setAlpha(f12);
        setTranslationX(f13);
        setTranslationY(f14);
        setElevation(f15);
        setRotation(f18);
        setRotationX(f16);
        setRotationY(f17);
        setPivotX(androidx.compose.ui.graphics.g.f(this.f2699y) * getWidth());
        setPivotY(androidx.compose.ui.graphics.g.g(this.f2699y) * getHeight());
        setCameraDistancePx(f19);
        boolean z11 = true;
        this.f2693s = z10 && q4Var == a1.k4.a();
        t();
        boolean z12 = getManualClipPath() != null;
        setClipToOutline(z10 && q4Var != a1.k4.a());
        boolean g10 = this.f2692r.g(q4Var, getAlpha(), getClipToOutline(), getElevation(), rVar, eVar);
        u();
        boolean z13 = getManualClipPath() != null;
        if (z12 != z13 || (z13 && g10)) {
            invalidate();
        }
        if (!this.f2696v && getElevation() > 0.0f && (aVar = this.f2691q) != null) {
            aVar.invoke();
        }
        this.f2698x.c();
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 28) {
            m4 m4Var = m4.f2771a;
            m4Var.a(this, a1.r1.k(j11));
            m4Var.b(this, a1.r1.k(j12));
        }
        if (i11 >= 31) {
            o4.f2783a.a(this, l4Var);
        }
        b.a aVar2 = androidx.compose.ui.graphics.b.f2438a;
        if (androidx.compose.ui.graphics.b.e(i10, aVar2.c())) {
            setLayerType(2, null);
        } else if (androidx.compose.ui.graphics.b.e(i10, aVar2.b())) {
            setLayerType(0, null);
            z11 = false;
        } else {
            setLayerType(0, null);
        }
        this.f2700z = z11;
    }

    @Override // p1.g1
    public void b(pc.l<? super a1.h1, dc.w> lVar, pc.a<dc.w> aVar) {
        qc.q.i(lVar, "drawBlock");
        qc.q.i(aVar, "invalidateParentLayer");
        if (Build.VERSION.SDK_INT < 23 && !H) {
            setVisibility(0);
        } else {
            this.f2689m.addView(this);
        }
        this.f2693s = false;
        this.f2696v = false;
        this.f2699y = androidx.compose.ui.graphics.g.f2458b.a();
        this.f2690p = lVar;
        this.f2691q = aVar;
    }

    @Override // p1.g1
    public void c(z0.d dVar, boolean z10) {
        qc.q.i(dVar, "rect");
        if (z10) {
            float[] a10 = this.f2698x.a(this);
            if (a10 != null) {
                a1.x3.g(a10, dVar);
                return;
            } else {
                dVar.g(0.0f, 0.0f, 0.0f, 0.0f);
                return;
            }
        }
        a1.x3.g(this.f2698x.b(this), dVar);
    }

    @Override // p1.g1
    public boolean d(long j10) {
        float o10 = z0.f.o(j10);
        float p10 = z0.f.p(j10);
        if (this.f2693s) {
            if (0.0f <= o10 && o10 < getWidth() && 0.0f <= p10 && p10 < getHeight()) {
                return true;
            }
            return false;
        } else if (!getClipToOutline()) {
            return true;
        } else {
            return this.f2692r.e(j10);
        }
    }

    @Override // p1.g1
    public void destroy() {
        setInvalidated(false);
        this.f2688f.o0();
        this.f2690p = null;
        this.f2691q = null;
        boolean m02 = this.f2688f.m0(this);
        if (Build.VERSION.SDK_INT < 23 && !H && m02) {
            setVisibility(8);
        } else {
            this.f2689m.removeViewInLayout(this);
        }
    }

    @Override // android.view.View
    protected void dispatchDraw(Canvas canvas) {
        qc.q.i(canvas, "canvas");
        boolean z10 = false;
        setInvalidated(false);
        a1.i1 i1Var = this.f2697w;
        Canvas v10 = i1Var.a().v();
        i1Var.a().w(canvas);
        a1.e0 a10 = i1Var.a();
        if (getManualClipPath() != null || !canvas.isHardwareAccelerated()) {
            a10.k();
            this.f2692r.a(a10);
            z10 = true;
        }
        pc.l<? super a1.h1, dc.w> lVar = this.f2690p;
        if (lVar != null) {
            lVar.invoke(a10);
        }
        if (z10) {
            a10.p();
        }
        i1Var.a().w(v10);
    }

    @Override // p1.g1
    public long e(long j10, boolean z10) {
        if (z10) {
            float[] a10 = this.f2698x.a(this);
            if (a10 != null) {
                return a1.x3.f(a10, j10);
            }
            return z0.f.f26354b.a();
        }
        return a1.x3.f(this.f2698x.b(this), j10);
    }

    @Override // p1.g1
    public void f(long j10) {
        int g10 = j2.p.g(j10);
        int f10 = j2.p.f(j10);
        if (g10 != getWidth() || f10 != getHeight()) {
            float f11 = g10;
            setPivotX(androidx.compose.ui.graphics.g.f(this.f2699y) * f11);
            float f12 = f10;
            setPivotY(androidx.compose.ui.graphics.g.g(this.f2699y) * f12);
            this.f2692r.h(z0.m.a(f11, f12));
            u();
            layout(getLeft(), getTop(), getLeft() + g10, getTop() + f10);
            t();
            this.f2698x.c();
        }
    }

    @Override // p1.g1
    public void g(a1.h1 h1Var) {
        boolean z10;
        qc.q.i(h1Var, "canvas");
        if (getElevation() > 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f2696v = z10;
        if (z10) {
            h1Var.u();
        }
        this.f2689m.a(h1Var, this, getDrawingTime());
        if (this.f2696v) {
            h1Var.m();
        }
    }

    public final float getCameraDistancePx() {
        return getCameraDistance() / getResources().getDisplayMetrics().densityDpi;
    }

    public final e1 getContainer() {
        return this.f2689m;
    }

    public long getLayerId() {
        return this.A;
    }

    public final AndroidComposeView getOwnerView() {
        return this.f2688f;
    }

    public long getOwnerViewId() {
        if (Build.VERSION.SDK_INT >= 29) {
            return d.a(this.f2688f);
        }
        return -1L;
    }

    @Override // p1.g1
    public void h(long j10) {
        int j11 = j2.l.j(j10);
        if (j11 != getLeft()) {
            offsetLeftAndRight(j11 - getLeft());
            this.f2698x.c();
        }
        int k10 = j2.l.k(j10);
        if (k10 != getTop()) {
            offsetTopAndBottom(k10 - getTop());
            this.f2698x.c();
        }
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return this.f2700z;
    }

    @Override // p1.g1
    public void i() {
        if (this.f2695u && !H) {
            setInvalidated(false);
            B.d(this);
        }
    }

    @Override // android.view.View, p1.g1
    public void invalidate() {
        if (!this.f2695u) {
            setInvalidated(true);
            super.invalidate();
            this.f2688f.invalidate();
        }
    }

    public final boolean s() {
        return this.f2695u;
    }

    public final void setCameraDistancePx(float f10) {
        setCameraDistance(f10 * getResources().getDisplayMetrics().densityDpi);
    }

    @Override // android.view.View
    public void forceLayout() {
    }

    @Override // android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }
}
