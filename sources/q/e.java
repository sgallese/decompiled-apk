package q;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* compiled from: RoundRectDrawable.java */
/* loaded from: classes.dex */
class e extends Drawable {

    /* renamed from: a  reason: collision with root package name */
    private float f21297a;

    /* renamed from: c  reason: collision with root package name */
    private final RectF f21299c;

    /* renamed from: d  reason: collision with root package name */
    private final Rect f21300d;

    /* renamed from: e  reason: collision with root package name */
    private float f21301e;

    /* renamed from: h  reason: collision with root package name */
    private ColorStateList f21304h;

    /* renamed from: i  reason: collision with root package name */
    private PorterDuffColorFilter f21305i;

    /* renamed from: j  reason: collision with root package name */
    private ColorStateList f21306j;

    /* renamed from: f  reason: collision with root package name */
    private boolean f21302f = false;

    /* renamed from: g  reason: collision with root package name */
    private boolean f21303g = true;

    /* renamed from: k  reason: collision with root package name */
    private PorterDuff.Mode f21307k = PorterDuff.Mode.SRC_IN;

    /* renamed from: b  reason: collision with root package name */
    private final Paint f21298b = new Paint(5);

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(ColorStateList colorStateList, float f10) {
        this.f21297a = f10;
        e(colorStateList);
        this.f21299c = new RectF();
        this.f21300d = new Rect();
    }

    private PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList != null && mode != null) {
            return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
        }
        return null;
    }

    private void e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f21304h = colorStateList;
        this.f21298b.setColor(colorStateList.getColorForState(getState(), this.f21304h.getDefaultColor()));
    }

    private void i(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.f21299c.set(rect.left, rect.top, rect.right, rect.bottom);
        this.f21300d.set(rect);
        if (this.f21302f) {
            this.f21300d.inset((int) Math.ceil(f.a(this.f21301e, this.f21297a, this.f21303g)), (int) Math.ceil(f.b(this.f21301e, this.f21297a, this.f21303g)));
            this.f21299c.set(this.f21300d);
        }
    }

    public ColorStateList b() {
        return this.f21304h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float c() {
        return this.f21301e;
    }

    public float d() {
        return this.f21297a;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        boolean z10;
        Paint paint = this.f21298b;
        if (this.f21305i != null && paint.getColorFilter() == null) {
            paint.setColorFilter(this.f21305i);
            z10 = true;
        } else {
            z10 = false;
        }
        RectF rectF = this.f21299c;
        float f10 = this.f21297a;
        canvas.drawRoundRect(rectF, f10, f10, paint);
        if (z10) {
            paint.setColorFilter(null);
        }
    }

    public void f(ColorStateList colorStateList) {
        e(colorStateList);
        invalidateSelf();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(float f10, boolean z10, boolean z11) {
        if (f10 == this.f21301e && this.f21302f == z10 && this.f21303g == z11) {
            return;
        }
        this.f21301e = f10;
        this.f21302f = z10;
        this.f21303g = z11;
        i(null);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        outline.setRoundRect(this.f21300d, this.f21297a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h(float f10) {
        if (f10 == this.f21297a) {
            return;
        }
        this.f21297a = f10;
        i(null);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f21306j;
        if ((colorStateList2 != null && colorStateList2.isStateful()) || (((colorStateList = this.f21304h) != null && colorStateList.isStateful()) || super.isStateful())) {
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        i(rect);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        boolean z10;
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f21304h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (colorForState != this.f21298b.getColor()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.f21298b.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f21306j;
        if (colorStateList2 != null && (mode = this.f21307k) != null) {
            this.f21305i = a(colorStateList2, mode);
            return true;
        }
        return z10;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f21298b.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f21298b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f21306j = colorStateList;
        this.f21305i = a(colorStateList, this.f21307k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.f21307k = mode;
        this.f21305i = a(this.f21306j, mode);
        invalidateSelf();
    }
}
