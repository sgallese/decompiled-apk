package com.google.android.material.progressindicator;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import com.google.android.material.progressindicator.b;

/* compiled from: DeterminateDrawable.java */
/* loaded from: classes3.dex */
public final class f<S extends b> extends g {
    private static final b3.c<f> H = new a("indicatorLevel");
    private h<S> C;
    private final b3.e D;
    private final b3.d E;
    private float F;
    private boolean G;

    /* compiled from: DeterminateDrawable.java */
    /* loaded from: classes3.dex */
    class a extends b3.c<f> {
        a(String str) {
            super(str);
        }

        @Override // b3.c
        /* renamed from: c  reason: merged with bridge method [inline-methods] */
        public float a(f fVar) {
            return fVar.x() * 10000.0f;
        }

        @Override // b3.c
        /* renamed from: d  reason: merged with bridge method [inline-methods] */
        public void b(f fVar, float f10) {
            fVar.z(f10 / 10000.0f);
        }
    }

    f(Context context, b bVar, h<S> hVar) {
        super(context, bVar);
        this.G = false;
        y(hVar);
        b3.e eVar = new b3.e();
        this.D = eVar;
        eVar.d(1.0f);
        eVar.f(50.0f);
        b3.d dVar = new b3.d(this, H);
        this.E = dVar;
        dVar.p(eVar);
        n(1.0f);
    }

    public static f<e> v(Context context, e eVar) {
        return new f<>(context, eVar, new c(eVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float x() {
        return this.F;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z(float f10) {
        this.F = f10;
        invalidateSelf();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void A(float f10) {
        setLevel((int) (f10 * 10000.0f));
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect rect = new Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            canvas.save();
            this.C.g(canvas, getBounds(), h());
            this.C.c(canvas, this.f10247z);
            this.C.b(canvas, this.f10247z, 0.0f, x(), d7.a.a(this.f10236m.f10209c[0], getAlpha()));
            canvas.restore();
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

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        this.E.q();
        z(getLevel() / 10000.0f);
    }

    @Override // com.google.android.material.progressindicator.g
    public /* bridge */ /* synthetic */ boolean k() {
        return super.k();
    }

    @Override // com.google.android.material.progressindicator.g
    public /* bridge */ /* synthetic */ void m(androidx.vectordrawable.graphics.drawable.b bVar) {
        super.m(bVar);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i10) {
        if (this.G) {
            this.E.q();
            z(i10 / 10000.0f);
            return true;
        }
        this.E.h(x() * 10000.0f);
        this.E.l(i10);
        return true;
    }

    @Override // com.google.android.material.progressindicator.g
    public /* bridge */ /* synthetic */ boolean q(boolean z10, boolean z11, boolean z12) {
        return super.q(z10, z11, z12);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.progressindicator.g
    public boolean r(boolean z10, boolean z11, boolean z12) {
        boolean r10 = super.r(z10, z11, z12);
        float a10 = this.f10237p.a(this.f10235f.getContentResolver());
        if (a10 == 0.0f) {
            this.G = true;
        } else {
            this.G = false;
            this.D.f(50.0f / a10);
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
    public h<S> w() {
        return this.C;
    }

    void y(h<S> hVar) {
        this.C = hVar;
        hVar.f(this);
    }
}
