package v4;

import android.content.res.ColorStateList;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import c5.h;

/* compiled from: ScaleDrawable.kt */
/* loaded from: classes.dex */
public final class d extends Drawable implements Drawable.Callback, Animatable {

    /* renamed from: f  reason: collision with root package name */
    private final Drawable f24587f;

    /* renamed from: m  reason: collision with root package name */
    private final h f24588m;

    /* renamed from: p  reason: collision with root package name */
    private float f24589p;

    /* renamed from: q  reason: collision with root package name */
    private float f24590q;

    /* renamed from: r  reason: collision with root package name */
    private float f24591r = 1.0f;

    public d(Drawable drawable, h hVar) {
        this.f24587f = drawable;
        this.f24588m = hVar;
        drawable.setCallback(this);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int save = canvas.save();
        try {
            canvas.translate(this.f24589p, this.f24590q);
            float f10 = this.f24591r;
            canvas.scale(f10, f10);
            this.f24587f.draw(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f24587f.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.f24587f.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f24587f.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f24587f.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f24587f.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        Drawable drawable = this.f24587f;
        if ((drawable instanceof Animatable) && ((Animatable) drawable).isRunning()) {
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        int c10;
        int c11;
        int intrinsicWidth = this.f24587f.getIntrinsicWidth();
        int intrinsicHeight = this.f24587f.getIntrinsicHeight();
        if (intrinsicWidth > 0 && intrinsicHeight > 0) {
            int width = rect.width();
            int height = rect.height();
            double c12 = t4.h.c(intrinsicWidth, intrinsicHeight, width, height, this.f24588m);
            double d10 = 2;
            c10 = sc.c.c((width - (intrinsicWidth * c12)) / d10);
            c11 = sc.c.c((height - (intrinsicHeight * c12)) / d10);
            this.f24587f.setBounds(c10, c11, intrinsicWidth + c10, intrinsicHeight + c11);
            this.f24589p = rect.left;
            this.f24590q = rect.top;
            this.f24591r = (float) c12;
            return;
        }
        this.f24587f.setBounds(rect);
        this.f24589p = 0.0f;
        this.f24590q = 0.0f;
        this.f24591r = 1.0f;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i10) {
        return this.f24587f.setLevel(i10);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        return this.f24587f.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        scheduleSelf(runnable, j10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f24587f.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f24587f.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i10) {
        this.f24587f.setTint(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintBlendMode(BlendMode blendMode) {
        this.f24587f.setTintBlendMode(blendMode);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f24587f.setTintList(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.f24587f.setTintMode(mode);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Drawable drawable = this.f24587f;
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).start();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        Drawable drawable = this.f24587f;
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).stop();
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
