package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WrappedDrawableApi14.java */
/* loaded from: classes.dex */
public class e extends Drawable implements Drawable.Callback, d, c {

    /* renamed from: t  reason: collision with root package name */
    static final PorterDuff.Mode f3896t = PorterDuff.Mode.SRC_IN;

    /* renamed from: f  reason: collision with root package name */
    private int f3897f;

    /* renamed from: m  reason: collision with root package name */
    private PorterDuff.Mode f3898m;

    /* renamed from: p  reason: collision with root package name */
    private boolean f3899p;

    /* renamed from: q  reason: collision with root package name */
    g f3900q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f3901r;

    /* renamed from: s  reason: collision with root package name */
    Drawable f3902s;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(g gVar, Resources resources) {
        this.f3900q = gVar;
        e(resources);
    }

    private g d() {
        return new g(this.f3900q);
    }

    private void e(Resources resources) {
        Drawable.ConstantState constantState;
        g gVar = this.f3900q;
        if (gVar != null && (constantState = gVar.f3905b) != null) {
            a(constantState.newDrawable(resources));
        }
    }

    private boolean f(int[] iArr) {
        if (!c()) {
            return false;
        }
        g gVar = this.f3900q;
        ColorStateList colorStateList = gVar.f3906c;
        PorterDuff.Mode mode = gVar.f3907d;
        if (colorStateList != null && mode != null) {
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (!this.f3899p || colorForState != this.f3897f || mode != this.f3898m) {
                setColorFilter(colorForState, mode);
                this.f3897f = colorForState;
                this.f3898m = mode;
                this.f3899p = true;
                return true;
            }
        } else {
            this.f3899p = false;
            clearColorFilter();
        }
        return false;
    }

    @Override // androidx.core.graphics.drawable.d
    public final void a(Drawable drawable) {
        Drawable drawable2 = this.f3902s;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f3902s = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            g gVar = this.f3900q;
            if (gVar != null) {
                gVar.f3905b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    @Override // androidx.core.graphics.drawable.d
    public final Drawable b() {
        return this.f3902s;
    }

    protected boolean c() {
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f3902s.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        int i10;
        int changingConfigurations = super.getChangingConfigurations();
        g gVar = this.f3900q;
        if (gVar != null) {
            i10 = gVar.getChangingConfigurations();
        } else {
            i10 = 0;
        }
        return changingConfigurations | i10 | this.f3902s.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        g gVar = this.f3900q;
        if (gVar != null && gVar.a()) {
            this.f3900q.f3904a = getChangingConfigurations();
            return this.f3900q;
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.f3902s.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f3902s.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f3902s.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getLayoutDirection() {
        return a.f(this.f3902s);
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return this.f3902s.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return this.f3902s.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f3902s.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        return this.f3902s.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public int[] getState() {
        return this.f3902s.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        return this.f3902s.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return a.h(this.f3902s);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        g gVar;
        if (c() && (gVar = this.f3900q) != null) {
            colorStateList = gVar.f3906c;
        } else {
            colorStateList = null;
        }
        if ((colorStateList != null && colorStateList.isStateful()) || this.f3902s.isStateful()) {
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        this.f3902s.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable.ConstantState constantState;
        if (!this.f3901r && super.mutate() == this) {
            this.f3900q = d();
            Drawable drawable = this.f3902s;
            if (drawable != null) {
                drawable.mutate();
            }
            g gVar = this.f3900q;
            if (gVar != null) {
                Drawable drawable2 = this.f3902s;
                if (drawable2 != null) {
                    constantState = drawable2.getConstantState();
                } else {
                    constantState = null;
                }
                gVar.f3905b = constantState;
            }
            this.f3901r = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f3902s;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i10) {
        return a.m(this.f3902s, i10);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i10) {
        return this.f3902s.setLevel(i10);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        scheduleSelf(runnable, j10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f3902s.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z10) {
        a.j(this.f3902s, z10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int i10) {
        this.f3902s.setChangingConfigurations(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f3902s.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z10) {
        this.f3902s.setDither(z10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z10) {
        this.f3902s.setFilterBitmap(z10);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        boolean state = this.f3902s.setState(iArr);
        if (!f(iArr) && !state) {
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i10) {
        setTintList(ColorStateList.valueOf(i10));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f3900q.f3906c = colorStateList;
        f(getState());
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.f3900q.f3907d = mode;
        f(getState());
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        if (!super.setVisible(z10, z11) && !this.f3902s.setVisible(z10, z11)) {
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(Drawable drawable) {
        this.f3900q = d();
        a(drawable);
    }
}
