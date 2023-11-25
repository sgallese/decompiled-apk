package androidx.compose.ui.platform;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import androidx.compose.ui.graphics.b;

/* compiled from: RenderNodeApi29.android.kt */
/* loaded from: classes.dex */
public final class m3 implements b1 {

    /* renamed from: a  reason: collision with root package name */
    private final AndroidComposeView f2768a;

    /* renamed from: b  reason: collision with root package name */
    private final RenderNode f2769b;

    /* renamed from: c  reason: collision with root package name */
    private int f2770c;

    public m3(AndroidComposeView androidComposeView) {
        qc.q.i(androidComposeView, "ownerView");
        this.f2768a = androidComposeView;
        this.f2769b = e3.a("Compose");
        this.f2770c = androidx.compose.ui.graphics.b.f2438a.a();
    }

    @Override // androidx.compose.ui.platform.b1
    public void A(Outline outline) {
        this.f2769b.setOutline(outline);
    }

    @Override // androidx.compose.ui.platform.b1
    public boolean B() {
        boolean clipToBounds;
        clipToBounds = this.f2769b.getClipToBounds();
        return clipToBounds;
    }

    @Override // androidx.compose.ui.platform.b1
    public int C() {
        int top;
        top = this.f2769b.getTop();
        return top;
    }

    @Override // androidx.compose.ui.platform.b1
    public void D(int i10) {
        this.f2769b.setAmbientShadowColor(i10);
    }

    @Override // androidx.compose.ui.platform.b1
    public boolean E() {
        boolean clipToOutline;
        clipToOutline = this.f2769b.getClipToOutline();
        return clipToOutline;
    }

    @Override // androidx.compose.ui.platform.b1
    public void F(boolean z10) {
        this.f2769b.setClipToOutline(z10);
    }

    @Override // androidx.compose.ui.platform.b1
    public boolean G(boolean z10) {
        boolean hasOverlappingRendering;
        hasOverlappingRendering = this.f2769b.setHasOverlappingRendering(z10);
        return hasOverlappingRendering;
    }

    @Override // androidx.compose.ui.platform.b1
    public void H(int i10) {
        this.f2769b.setSpotShadowColor(i10);
    }

    @Override // androidx.compose.ui.platform.b1
    public void I(Matrix matrix) {
        qc.q.i(matrix, "matrix");
        this.f2769b.getMatrix(matrix);
    }

    @Override // androidx.compose.ui.platform.b1
    public float J() {
        float elevation;
        elevation = this.f2769b.getElevation();
        return elevation;
    }

    @Override // androidx.compose.ui.platform.b1
    public void a(int i10) {
        this.f2769b.offsetLeftAndRight(i10);
    }

    @Override // androidx.compose.ui.platform.b1
    public int b() {
        int left;
        left = this.f2769b.getLeft();
        return left;
    }

    @Override // androidx.compose.ui.platform.b1
    public void c(float f10) {
        this.f2769b.setAlpha(f10);
    }

    @Override // androidx.compose.ui.platform.b1
    public float d() {
        float alpha;
        alpha = this.f2769b.getAlpha();
        return alpha;
    }

    @Override // androidx.compose.ui.platform.b1
    public void e(float f10) {
        this.f2769b.setRotationY(f10);
    }

    @Override // androidx.compose.ui.platform.b1
    public int f() {
        int right;
        right = this.f2769b.getRight();
        return right;
    }

    @Override // androidx.compose.ui.platform.b1
    public int g() {
        int bottom;
        bottom = this.f2769b.getBottom();
        return bottom;
    }

    @Override // androidx.compose.ui.platform.b1
    public int getHeight() {
        int height;
        height = this.f2769b.getHeight();
        return height;
    }

    @Override // androidx.compose.ui.platform.b1
    public int getWidth() {
        int width;
        width = this.f2769b.getWidth();
        return width;
    }

    @Override // androidx.compose.ui.platform.b1
    public void h(float f10) {
        this.f2769b.setRotationZ(f10);
    }

    @Override // androidx.compose.ui.platform.b1
    public void i(float f10) {
        this.f2769b.setTranslationY(f10);
    }

    @Override // androidx.compose.ui.platform.b1
    public void j(Canvas canvas) {
        qc.q.i(canvas, "canvas");
        canvas.drawRenderNode(this.f2769b);
    }

    @Override // androidx.compose.ui.platform.b1
    public void k(float f10) {
        this.f2769b.setScaleY(f10);
    }

    @Override // androidx.compose.ui.platform.b1
    public void l(a1.l4 l4Var) {
        if (Build.VERSION.SDK_INT >= 31) {
            o3.f2782a.a(this.f2769b, l4Var);
        }
    }

    @Override // androidx.compose.ui.platform.b1
    public void m(int i10) {
        RenderNode renderNode = this.f2769b;
        b.a aVar = androidx.compose.ui.graphics.b.f2438a;
        if (androidx.compose.ui.graphics.b.e(i10, aVar.c())) {
            renderNode.setUseCompositingLayer(true, null);
            renderNode.setHasOverlappingRendering(true);
        } else if (androidx.compose.ui.graphics.b.e(i10, aVar.b())) {
            renderNode.setUseCompositingLayer(false, null);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setUseCompositingLayer(false, null);
            renderNode.setHasOverlappingRendering(true);
        }
        this.f2770c = i10;
    }

    @Override // androidx.compose.ui.platform.b1
    public void n(float f10) {
        this.f2769b.setPivotX(f10);
    }

    @Override // androidx.compose.ui.platform.b1
    public void o(boolean z10) {
        this.f2769b.setClipToBounds(z10);
    }

    @Override // androidx.compose.ui.platform.b1
    public boolean p(int i10, int i11, int i12, int i13) {
        boolean position;
        position = this.f2769b.setPosition(i10, i11, i12, i13);
        return position;
    }

    @Override // androidx.compose.ui.platform.b1
    public void q(float f10) {
        this.f2769b.setScaleX(f10);
    }

    @Override // androidx.compose.ui.platform.b1
    public void r() {
        this.f2769b.discardDisplayList();
    }

    @Override // androidx.compose.ui.platform.b1
    public void s(a1.i1 i1Var, a1.e4 e4Var, pc.l<? super a1.h1, dc.w> lVar) {
        RecordingCanvas beginRecording;
        qc.q.i(i1Var, "canvasHolder");
        qc.q.i(lVar, "drawBlock");
        beginRecording = this.f2769b.beginRecording();
        qc.q.h(beginRecording, "renderNode.beginRecording()");
        Canvas v10 = i1Var.a().v();
        i1Var.a().w(beginRecording);
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
        this.f2769b.endRecording();
    }

    @Override // androidx.compose.ui.platform.b1
    public void t(float f10) {
        this.f2769b.setPivotY(f10);
    }

    @Override // androidx.compose.ui.platform.b1
    public void u(float f10) {
        this.f2769b.setTranslationX(f10);
    }

    @Override // androidx.compose.ui.platform.b1
    public void v(float f10) {
        this.f2769b.setCameraDistance(f10);
    }

    @Override // androidx.compose.ui.platform.b1
    public void w(float f10) {
        this.f2769b.setElevation(f10);
    }

    @Override // androidx.compose.ui.platform.b1
    public void x(float f10) {
        this.f2769b.setRotationX(f10);
    }

    @Override // androidx.compose.ui.platform.b1
    public void y(int i10) {
        this.f2769b.offsetTopAndBottom(i10);
    }

    @Override // androidx.compose.ui.platform.b1
    public boolean z() {
        boolean hasDisplayList;
        hasDisplayList = this.f2769b.hasDisplayList();
        return hasDisplayList;
    }
}
