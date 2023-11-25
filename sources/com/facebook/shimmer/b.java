package com.facebook.shimmer;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* compiled from: ShimmerDrawable.java */
/* loaded from: classes.dex */
public final class b extends Drawable {

    /* renamed from: a  reason: collision with root package name */
    private final ValueAnimator.AnimatorUpdateListener f9279a = new a();

    /* renamed from: b  reason: collision with root package name */
    private final Paint f9280b;

    /* renamed from: c  reason: collision with root package name */
    private final Rect f9281c;

    /* renamed from: d  reason: collision with root package name */
    private final Matrix f9282d;

    /* renamed from: e  reason: collision with root package name */
    private ValueAnimator f9283e;

    /* renamed from: f  reason: collision with root package name */
    private com.facebook.shimmer.a f9284f;

    /* compiled from: ShimmerDrawable.java */
    /* loaded from: classes.dex */
    class a implements ValueAnimator.AnimatorUpdateListener {
        a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            b.this.invalidateSelf();
        }
    }

    public b() {
        Paint paint = new Paint();
        this.f9280b = paint;
        this.f9281c = new Rect();
        this.f9282d = new Matrix();
        paint.setAntiAlias(true);
    }

    private float c(float f10, float f11, float f12) {
        return f10 + ((f11 - f10) * f12);
    }

    private void g() {
        com.facebook.shimmer.a aVar;
        Shader radialGradient;
        Rect bounds = getBounds();
        int width = bounds.width();
        int height = bounds.height();
        if (width != 0 && height != 0 && (aVar = this.f9284f) != null) {
            int d10 = aVar.d(width);
            int a10 = this.f9284f.a(height);
            com.facebook.shimmer.a aVar2 = this.f9284f;
            boolean z10 = true;
            if (aVar2.f9263g != 1) {
                int i10 = aVar2.f9260d;
                if (i10 != 1 && i10 != 3) {
                    z10 = false;
                }
                if (z10) {
                    d10 = 0;
                }
                if (!z10) {
                    a10 = 0;
                }
                float f10 = a10;
                com.facebook.shimmer.a aVar3 = this.f9284f;
                radialGradient = new LinearGradient(0.0f, 0.0f, d10, f10, aVar3.f9258b, aVar3.f9257a, Shader.TileMode.CLAMP);
            } else {
                float f11 = a10 / 2.0f;
                float max = (float) (Math.max(d10, a10) / Math.sqrt(2.0d));
                com.facebook.shimmer.a aVar4 = this.f9284f;
                radialGradient = new RadialGradient(d10 / 2.0f, f11, max, aVar4.f9258b, aVar4.f9257a, Shader.TileMode.CLAMP);
            }
            this.f9280b.setShader(radialGradient);
        }
    }

    private void h() {
        boolean z10;
        if (this.f9284f == null) {
            return;
        }
        ValueAnimator valueAnimator = this.f9283e;
        if (valueAnimator != null) {
            z10 = valueAnimator.isStarted();
            this.f9283e.cancel();
            this.f9283e.removeAllUpdateListeners();
        } else {
            z10 = false;
        }
        com.facebook.shimmer.a aVar = this.f9284f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, ((float) (aVar.f9277u / aVar.f9276t)) + 1.0f);
        this.f9283e = ofFloat;
        ofFloat.setRepeatMode(this.f9284f.f9275s);
        this.f9283e.setRepeatCount(this.f9284f.f9274r);
        ValueAnimator valueAnimator2 = this.f9283e;
        com.facebook.shimmer.a aVar2 = this.f9284f;
        valueAnimator2.setDuration(aVar2.f9276t + aVar2.f9277u);
        this.f9283e.addUpdateListener(this.f9279a);
        if (z10) {
            this.f9283e.start();
        }
    }

    public boolean a() {
        ValueAnimator valueAnimator = this.f9283e;
        if (valueAnimator != null && valueAnimator.isStarted()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        com.facebook.shimmer.a aVar;
        ValueAnimator valueAnimator = this.f9283e;
        if (valueAnimator != null && !valueAnimator.isStarted() && (aVar = this.f9284f) != null && aVar.f9272p && getCallback() != null) {
            this.f9283e.start();
        }
    }

    public void d(com.facebook.shimmer.a aVar) {
        PorterDuff.Mode mode;
        this.f9284f = aVar;
        if (aVar != null) {
            Paint paint = this.f9280b;
            if (this.f9284f.f9273q) {
                mode = PorterDuff.Mode.DST_IN;
            } else {
                mode = PorterDuff.Mode.SRC_IN;
            }
            paint.setXfermode(new PorterDuffXfermode(mode));
        }
        g();
        h();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        float f10;
        float c10;
        float c11;
        if (this.f9284f != null && this.f9280b.getShader() != null) {
            float tan = (float) Math.tan(Math.toRadians(this.f9284f.f9270n));
            float height = this.f9281c.height() + (this.f9281c.width() * tan);
            float width = this.f9281c.width() + (tan * this.f9281c.height());
            ValueAnimator valueAnimator = this.f9283e;
            float f11 = 0.0f;
            if (valueAnimator != null) {
                f10 = valueAnimator.getAnimatedFraction();
            } else {
                f10 = 0.0f;
            }
            int i10 = this.f9284f.f9260d;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        c11 = c(-width, width, f10);
                    } else {
                        c10 = c(height, -height, f10);
                    }
                } else {
                    c11 = c(width, -width, f10);
                }
                f11 = c11;
                c10 = 0.0f;
            } else {
                c10 = c(-height, height, f10);
            }
            this.f9282d.reset();
            this.f9282d.setRotate(this.f9284f.f9270n, this.f9281c.width() / 2.0f, this.f9281c.height() / 2.0f);
            this.f9282d.postTranslate(f11, c10);
            this.f9280b.getShader().setLocalMatrix(this.f9282d);
            canvas.drawRect(this.f9281c, this.f9280b);
        }
    }

    public void e() {
        if (this.f9283e != null && !a() && getCallback() != null) {
            this.f9283e.start();
        }
    }

    public void f() {
        if (this.f9283e != null && a()) {
            this.f9283e.cancel();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        com.facebook.shimmer.a aVar = this.f9284f;
        if (aVar != null && (aVar.f9271o || aVar.f9273q)) {
            return -3;
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f9281c.set(0, 0, rect.width(), rect.height());
        g();
        b();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
