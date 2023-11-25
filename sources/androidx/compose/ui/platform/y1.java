package androidx.compose.ui.platform;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import androidx.compose.ui.graphics.b;

/* compiled from: RenderNodeApi23.android.kt */
/* loaded from: classes.dex */
public final class y1 implements b1 {

    /* renamed from: j  reason: collision with root package name */
    private static boolean f2957j;

    /* renamed from: a  reason: collision with root package name */
    private final AndroidComposeView f2959a;

    /* renamed from: b  reason: collision with root package name */
    private final RenderNode f2960b;

    /* renamed from: c  reason: collision with root package name */
    private int f2961c;

    /* renamed from: d  reason: collision with root package name */
    private int f2962d;

    /* renamed from: e  reason: collision with root package name */
    private int f2963e;

    /* renamed from: f  reason: collision with root package name */
    private int f2964f;

    /* renamed from: g  reason: collision with root package name */
    private int f2965g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f2966h;

    /* renamed from: i  reason: collision with root package name */
    public static final a f2956i = new a(null);

    /* renamed from: k  reason: collision with root package name */
    private static boolean f2958k = true;

    /* compiled from: RenderNodeApi23.android.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }
    }

    public y1(AndroidComposeView androidComposeView) {
        qc.q.i(androidComposeView, "ownerView");
        this.f2959a = androidComposeView;
        RenderNode create = RenderNode.create("Compose", androidComposeView);
        qc.q.h(create, "create(\"Compose\", ownerView)");
        this.f2960b = create;
        this.f2961c = androidx.compose.ui.graphics.b.f2438a.a();
        if (f2958k) {
            create.setScaleX(create.getScaleX());
            create.setScaleY(create.getScaleY());
            create.setTranslationX(create.getTranslationX());
            create.setTranslationY(create.getTranslationY());
            create.setElevation(create.getElevation());
            create.setRotation(create.getRotation());
            create.setRotationX(create.getRotationX());
            create.setRotationY(create.getRotationY());
            create.setCameraDistance(create.getCameraDistance());
            create.setPivotX(create.getPivotX());
            create.setPivotY(create.getPivotY());
            create.setClipToOutline(create.getClipToOutline());
            create.setClipToBounds(false);
            create.setAlpha(create.getAlpha());
            create.isValid();
            create.setLeftTopRightBottom(0, 0, 0, 0);
            create.offsetLeftAndRight(0);
            create.offsetTopAndBottom(0);
            P(create);
            K();
            create.setLayerType(0);
            create.setHasOverlappingRendering(create.hasOverlappingRendering());
            f2958k = false;
        }
        if (!f2957j) {
            return;
        }
        throw new NoClassDefFoundError();
    }

    private final void K() {
        if (Build.VERSION.SDK_INT >= 24) {
            r3.f2815a.a(this.f2960b);
        } else {
            q3.f2810a.a(this.f2960b);
        }
    }

    private final void P(RenderNode renderNode) {
        if (Build.VERSION.SDK_INT >= 28) {
            s3 s3Var = s3.f2822a;
            s3Var.c(renderNode, s3Var.a(renderNode));
            s3Var.d(renderNode, s3Var.b(renderNode));
        }
    }

    @Override // androidx.compose.ui.platform.b1
    public void A(Outline outline) {
        this.f2960b.setOutline(outline);
    }

    @Override // androidx.compose.ui.platform.b1
    public boolean B() {
        return this.f2966h;
    }

    @Override // androidx.compose.ui.platform.b1
    public int C() {
        return this.f2963e;
    }

    @Override // androidx.compose.ui.platform.b1
    public void D(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            s3.f2822a.c(this.f2960b, i10);
        }
    }

    @Override // androidx.compose.ui.platform.b1
    public boolean E() {
        return this.f2960b.getClipToOutline();
    }

    @Override // androidx.compose.ui.platform.b1
    public void F(boolean z10) {
        this.f2960b.setClipToOutline(z10);
    }

    @Override // androidx.compose.ui.platform.b1
    public boolean G(boolean z10) {
        return this.f2960b.setHasOverlappingRendering(z10);
    }

    @Override // androidx.compose.ui.platform.b1
    public void H(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            s3.f2822a.d(this.f2960b, i10);
        }
    }

    @Override // androidx.compose.ui.platform.b1
    public void I(Matrix matrix) {
        qc.q.i(matrix, "matrix");
        this.f2960b.getMatrix(matrix);
    }

    @Override // androidx.compose.ui.platform.b1
    public float J() {
        return this.f2960b.getElevation();
    }

    public void L(int i10) {
        this.f2965g = i10;
    }

    public void M(int i10) {
        this.f2962d = i10;
    }

    public void N(int i10) {
        this.f2964f = i10;
    }

    public void O(int i10) {
        this.f2963e = i10;
    }

    @Override // androidx.compose.ui.platform.b1
    public void a(int i10) {
        M(b() + i10);
        N(f() + i10);
        this.f2960b.offsetLeftAndRight(i10);
    }

    @Override // androidx.compose.ui.platform.b1
    public int b() {
        return this.f2962d;
    }

    @Override // androidx.compose.ui.platform.b1
    public void c(float f10) {
        this.f2960b.setAlpha(f10);
    }

    @Override // androidx.compose.ui.platform.b1
    public float d() {
        return this.f2960b.getAlpha();
    }

    @Override // androidx.compose.ui.platform.b1
    public void e(float f10) {
        this.f2960b.setRotationY(f10);
    }

    @Override // androidx.compose.ui.platform.b1
    public int f() {
        return this.f2964f;
    }

    @Override // androidx.compose.ui.platform.b1
    public int g() {
        return this.f2965g;
    }

    @Override // androidx.compose.ui.platform.b1
    public int getHeight() {
        return g() - C();
    }

    @Override // androidx.compose.ui.platform.b1
    public int getWidth() {
        return f() - b();
    }

    @Override // androidx.compose.ui.platform.b1
    public void h(float f10) {
        this.f2960b.setRotation(f10);
    }

    @Override // androidx.compose.ui.platform.b1
    public void i(float f10) {
        this.f2960b.setTranslationY(f10);
    }

    @Override // androidx.compose.ui.platform.b1
    public void j(Canvas canvas) {
        qc.q.i(canvas, "canvas");
        ((DisplayListCanvas) canvas).drawRenderNode(this.f2960b);
    }

    @Override // androidx.compose.ui.platform.b1
    public void k(float f10) {
        this.f2960b.setScaleY(f10);
    }

    @Override // androidx.compose.ui.platform.b1
    public void m(int i10) {
        b.a aVar = androidx.compose.ui.graphics.b.f2438a;
        if (androidx.compose.ui.graphics.b.e(i10, aVar.c())) {
            this.f2960b.setLayerType(2);
            this.f2960b.setHasOverlappingRendering(true);
        } else if (androidx.compose.ui.graphics.b.e(i10, aVar.b())) {
            this.f2960b.setLayerType(0);
            this.f2960b.setHasOverlappingRendering(false);
        } else {
            this.f2960b.setLayerType(0);
            this.f2960b.setHasOverlappingRendering(true);
        }
        this.f2961c = i10;
    }

    @Override // androidx.compose.ui.platform.b1
    public void n(float f10) {
        this.f2960b.setPivotX(f10);
    }

    @Override // androidx.compose.ui.platform.b1
    public void o(boolean z10) {
        this.f2966h = z10;
        this.f2960b.setClipToBounds(z10);
    }

    @Override // androidx.compose.ui.platform.b1
    public boolean p(int i10, int i11, int i12, int i13) {
        M(i10);
        O(i11);
        N(i12);
        L(i13);
        return this.f2960b.setLeftTopRightBottom(i10, i11, i12, i13);
    }

    @Override // androidx.compose.ui.platform.b1
    public void q(float f10) {
        this.f2960b.setScaleX(f10);
    }

    @Override // androidx.compose.ui.platform.b1
    public void r() {
        K();
    }

    @Override // androidx.compose.ui.platform.b1
    public void s(a1.i1 i1Var, a1.e4 e4Var, pc.l<? super a1.h1, dc.w> lVar) {
        qc.q.i(i1Var, "canvasHolder");
        qc.q.i(lVar, "drawBlock");
        DisplayListCanvas start = this.f2960b.start(getWidth(), getHeight());
        qc.q.h(start, "renderNode.start(width, height)");
        Canvas v10 = i1Var.a().v();
        i1Var.a().w((Canvas) start);
        a1.e0 a10 = i1Var.a();
        if (e4Var != null) {
            a10.k();
            a1.g1.c(a10, e4Var, 0, 2, null);
        }
        lVar.invoke(a10);
        if (e4Var != null) {
            a10.p();
        }
        i1Var.a().w(v10);
        this.f2960b.end(start);
    }

    @Override // androidx.compose.ui.platform.b1
    public void t(float f10) {
        this.f2960b.setPivotY(f10);
    }

    @Override // androidx.compose.ui.platform.b1
    public void u(float f10) {
        this.f2960b.setTranslationX(f10);
    }

    @Override // androidx.compose.ui.platform.b1
    public void v(float f10) {
        this.f2960b.setCameraDistance(-f10);
    }

    @Override // androidx.compose.ui.platform.b1
    public void w(float f10) {
        this.f2960b.setElevation(f10);
    }

    @Override // androidx.compose.ui.platform.b1
    public void x(float f10) {
        this.f2960b.setRotationX(f10);
    }

    @Override // androidx.compose.ui.platform.b1
    public void y(int i10) {
        O(C() + i10);
        L(g() + i10);
        this.f2960b.offsetTopAndBottom(i10);
    }

    @Override // androidx.compose.ui.platform.b1
    public boolean z() {
        return this.f2960b.isValid();
    }

    @Override // androidx.compose.ui.platform.b1
    public void l(a1.l4 l4Var) {
    }
}
