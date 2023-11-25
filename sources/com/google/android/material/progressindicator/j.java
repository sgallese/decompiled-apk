package com.google.android.material.progressindicator;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import com.google.android.material.progressindicator.b;

/* compiled from: IndeterminateDrawable.java */
/* loaded from: classes3.dex */
public final class j<S extends b> extends g {
    private h<S> C;
    private i<ObjectAnimator> D;

    j(Context context, b bVar, h<S> hVar, i<ObjectAnimator> iVar) {
        super(context, bVar);
        x(hVar);
        w(iVar);
    }

    public static j<e> t(Context context, e eVar) {
        return new j<>(context, eVar, new c(eVar), new d(eVar));
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect rect = new Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            canvas.save();
            this.C.g(canvas, getBounds(), h());
            this.C.c(canvas, this.f10247z);
            int i10 = 0;
            while (true) {
                i<ObjectAnimator> iVar = this.D;
                int[] iArr = iVar.f10254c;
                if (i10 < iArr.length) {
                    h<S> hVar = this.C;
                    Paint paint = this.f10247z;
                    float[] fArr = iVar.f10253b;
                    int i11 = i10 * 2;
                    hVar.b(canvas, paint, fArr[i11], fArr[i11 + 1], iArr[i10]);
                    i10++;
                } else {
                    canvas.restore();
                    return;
                }
            }
        }
    }

    @Override // com.google.android.material.progressindicator.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.C.d();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.C.e();
    }

    @Override // com.google.android.material.progressindicator.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getOpacity() {
        return super.getOpacity();
    }

    @Override // com.google.android.material.progressindicator.g
    public /* bridge */ /* synthetic */ boolean i() {
        return super.i();
    }

    @Override // com.google.android.material.progressindicator.g, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ boolean isRunning() {
        return super.isRunning();
    }

    @Override // com.google.android.material.progressindicator.g
    public /* bridge */ /* synthetic */ boolean j() {
        return super.j();
    }

    @Override // com.google.android.material.progressindicator.g
    public /* bridge */ /* synthetic */ boolean k() {
        return super.k();
    }

    @Override // com.google.android.material.progressindicator.g
    public /* bridge */ /* synthetic */ void m(androidx.vectordrawable.graphics.drawable.b bVar) {
        super.m(bVar);
    }

    @Override // com.google.android.material.progressindicator.g
    public /* bridge */ /* synthetic */ boolean q(boolean z10, boolean z11, boolean z12) {
        return super.q(z10, z11, z12);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.progressindicator.g
    public boolean r(boolean z10, boolean z11, boolean z12) {
        boolean r10 = super.r(z10, z11, z12);
        if (!isRunning()) {
            this.D.a();
        }
        float a10 = this.f10237p.a(this.f10235f.getContentResolver());
        if (z10 && (z12 || (Build.VERSION.SDK_INT <= 22 && a10 > 0.0f))) {
            this.D.g();
        }
        return r10;
    }

    @Override // com.google.android.material.progressindicator.g
    public /* bridge */ /* synthetic */ boolean s(androidx.vectordrawable.graphics.drawable.b bVar) {
        return super.s(bVar);
    }

    @Override // com.google.android.material.progressindicator.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setAlpha(int i10) {
        super.setAlpha(i10);
    }

    @Override // com.google.android.material.progressindicator.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }

    @Override // com.google.android.material.progressindicator.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setVisible(boolean z10, boolean z11) {
        return super.setVisible(z10, z11);
    }

    @Override // com.google.android.material.progressindicator.g, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ void start() {
        super.start();
    }

    @Override // com.google.android.material.progressindicator.g, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ void stop() {
        super.stop();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public i<ObjectAnimator> u() {
        return this.D;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public h<S> v() {
        return this.C;
    }

    void w(i<ObjectAnimator> iVar) {
        this.D = iVar;
        iVar.e(this);
    }

    void x(h<S> hVar) {
        this.C = hVar;
        hVar.f(this);
    }
}
