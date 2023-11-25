package v4;

import android.content.res.ColorStateList;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import c5.h;
import java.util.ArrayList;
import java.util.List;
import vc.l;

/* compiled from: CrossfadeDrawable.kt */
/* loaded from: classes.dex */
public final class b extends Drawable implements Drawable.Callback, Animatable {

    /* renamed from: z  reason: collision with root package name */
    public static final a f24561z = new a(null);

    /* renamed from: f  reason: collision with root package name */
    private final h f24562f;

    /* renamed from: m  reason: collision with root package name */
    private final int f24563m;

    /* renamed from: p  reason: collision with root package name */
    private final boolean f24564p;

    /* renamed from: q  reason: collision with root package name */
    private final boolean f24565q;

    /* renamed from: r  reason: collision with root package name */
    private final List<androidx.vectordrawable.graphics.drawable.b> f24566r = new ArrayList();

    /* renamed from: s  reason: collision with root package name */
    private final int f24567s;

    /* renamed from: t  reason: collision with root package name */
    private final int f24568t;

    /* renamed from: u  reason: collision with root package name */
    private long f24569u;

    /* renamed from: v  reason: collision with root package name */
    private int f24570v;

    /* renamed from: w  reason: collision with root package name */
    private int f24571w;

    /* renamed from: x  reason: collision with root package name */
    private Drawable f24572x;

    /* renamed from: y  reason: collision with root package name */
    private final Drawable f24573y;

    /* compiled from: CrossfadeDrawable.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }
    }

    public b(Drawable drawable, Drawable drawable2, h hVar, int i10, boolean z10, boolean z11) {
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        Drawable drawable3;
        boolean z12;
        this.f24562f = hVar;
        this.f24563m = i10;
        this.f24564p = z10;
        this.f24565q = z11;
        if (drawable != null) {
            num = Integer.valueOf(drawable.getIntrinsicWidth());
        } else {
            num = null;
        }
        if (drawable2 != null) {
            num2 = Integer.valueOf(drawable2.getIntrinsicWidth());
        } else {
            num2 = null;
        }
        this.f24567s = a(num, num2);
        if (drawable != null) {
            num3 = Integer.valueOf(drawable.getIntrinsicHeight());
        } else {
            num3 = null;
        }
        if (drawable2 != null) {
            num4 = Integer.valueOf(drawable2.getIntrinsicHeight());
        } else {
            num4 = null;
        }
        this.f24568t = a(num3, num4);
        this.f24570v = 255;
        if (drawable != null) {
            drawable3 = drawable.mutate();
        } else {
            drawable3 = null;
        }
        this.f24572x = drawable3;
        Drawable mutate = drawable2 != null ? drawable2.mutate() : null;
        this.f24573y = mutate;
        if (i10 > 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z12) {
            Drawable drawable4 = this.f24572x;
            if (drawable4 != null) {
                drawable4.setCallback(this);
            }
            if (mutate != null) {
                mutate.setCallback(this);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("durationMillis must be > 0.".toString());
    }

    private final int a(Integer num, Integer num2) {
        int i10;
        int i11 = -1;
        if (!this.f24565q && ((num != null && num.intValue() == -1) || (num2 != null && num2.intValue() == -1))) {
            return -1;
        }
        if (num != null) {
            i10 = num.intValue();
        } else {
            i10 = -1;
        }
        if (num2 != null) {
            i11 = num2.intValue();
        }
        return Math.max(i10, i11);
    }

    private final void b() {
        this.f24571w = 2;
        this.f24572x = null;
        List<androidx.vectordrawable.graphics.drawable.b> list = this.f24566r;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            list.get(i10).b(this);
        }
    }

    public final void c(Drawable drawable, Rect rect) {
        int c10;
        int c11;
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth > 0 && intrinsicHeight > 0) {
            int width = rect.width();
            int height = rect.height();
            double c12 = t4.h.c(intrinsicWidth, intrinsicHeight, width, height, this.f24562f);
            double d10 = 2;
            c10 = sc.c.c((width - (intrinsicWidth * c12)) / d10);
            c11 = sc.c.c((height - (c12 * intrinsicHeight)) / d10);
            drawable.setBounds(rect.left + c10, rect.top + c11, rect.right - c10, rect.bottom - c11);
            return;
        }
        drawable.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        double j10;
        boolean z10;
        int save;
        Drawable drawable;
        int i10 = this.f24571w;
        if (i10 == 0) {
            Drawable drawable2 = this.f24572x;
            if (drawable2 != null) {
                drawable2.setAlpha(this.f24570v);
                save = canvas.save();
                try {
                    drawable2.draw(canvas);
                } finally {
                }
            }
        } else if (i10 == 2) {
            Drawable drawable3 = this.f24573y;
            if (drawable3 != null) {
                drawable3.setAlpha(this.f24570v);
                save = canvas.save();
                try {
                    drawable3.draw(canvas);
                } finally {
                }
            }
        } else {
            double uptimeMillis = (SystemClock.uptimeMillis() - this.f24569u) / this.f24563m;
            j10 = l.j(uptimeMillis, 0.0d, 1.0d);
            int i11 = this.f24570v;
            int i12 = (int) (j10 * i11);
            if (this.f24564p) {
                i11 -= i12;
            }
            if (uptimeMillis >= 1.0d) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10 && (drawable = this.f24572x) != null) {
                drawable.setAlpha(i11);
                save = canvas.save();
                try {
                    drawable.draw(canvas);
                } finally {
                }
            }
            Drawable drawable4 = this.f24573y;
            if (drawable4 != null) {
                drawable4.setAlpha(i12);
                save = canvas.save();
                try {
                    drawable4.draw(canvas);
                } finally {
                }
            }
            if (z10) {
                b();
            } else {
                invalidateSelf();
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f24570v;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        ColorFilter colorFilter;
        Drawable drawable;
        int i10 = this.f24571w;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2 || (drawable = this.f24573y) == null) {
                    return null;
                }
                return drawable.getColorFilter();
            }
            Drawable drawable2 = this.f24573y;
            if (drawable2 != null && (colorFilter = drawable2.getColorFilter()) != null) {
                return colorFilter;
            }
            Drawable drawable3 = this.f24572x;
            if (drawable3 == null) {
                return null;
            }
            return drawable3.getColorFilter();
        }
        Drawable drawable4 = this.f24572x;
        if (drawable4 == null) {
            return null;
        }
        return drawable4.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f24568t;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f24567s;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f24572x;
        Drawable drawable2 = this.f24573y;
        int i10 = this.f24571w;
        if (i10 == 0) {
            if (drawable == null) {
                return -2;
            }
            return drawable.getOpacity();
        } else if (i10 == 2) {
            if (drawable2 == null) {
                return -2;
            }
            return drawable2.getOpacity();
        } else if (drawable != null && drawable2 != null) {
            return Drawable.resolveOpacity(drawable.getOpacity(), drawable2.getOpacity());
        } else {
            if (drawable != null) {
                return drawable.getOpacity();
            }
            if (drawable2 == null) {
                return -2;
            }
            return drawable2.getOpacity();
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        if (this.f24571w == 1) {
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f24572x;
        if (drawable != null) {
            c(drawable, rect);
        }
        Drawable drawable2 = this.f24573y;
        if (drawable2 != null) {
            c(drawable2, rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i10) {
        boolean z10;
        boolean z11;
        Drawable drawable = this.f24572x;
        if (drawable != null) {
            z10 = drawable.setLevel(i10);
        } else {
            z10 = false;
        }
        Drawable drawable2 = this.f24573y;
        if (drawable2 != null) {
            z11 = drawable2.setLevel(i10);
        } else {
            z11 = false;
        }
        if (!z10 && !z11) {
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        boolean z10;
        boolean z11;
        Drawable drawable = this.f24572x;
        if (drawable != null) {
            z10 = drawable.setState(iArr);
        } else {
            z10 = false;
        }
        Drawable drawable2 = this.f24573y;
        if (drawable2 != null) {
            z11 = drawable2.setState(iArr);
        } else {
            z11 = false;
        }
        if (!z10 && !z11) {
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        scheduleSelf(runnable, j10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        boolean z10 = false;
        if (i10 >= 0 && i10 < 256) {
            z10 = true;
        }
        if (z10) {
            this.f24570v = i10;
            return;
        }
        throw new IllegalArgumentException(("Invalid alpha: " + i10).toString());
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f24572x;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
        Drawable drawable2 = this.f24573y;
        if (drawable2 != null) {
            drawable2.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i10) {
        Drawable drawable = this.f24572x;
        if (drawable != null) {
            drawable.setTint(i10);
        }
        Drawable drawable2 = this.f24573y;
        if (drawable2 != null) {
            drawable2.setTint(i10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintBlendMode(BlendMode blendMode) {
        Drawable drawable = this.f24572x;
        if (drawable != null) {
            drawable.setTintBlendMode(blendMode);
        }
        Drawable drawable2 = this.f24573y;
        if (drawable2 != null) {
            drawable2.setTintBlendMode(blendMode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f24572x;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        }
        Drawable drawable2 = this.f24573y;
        if (drawable2 != null) {
            drawable2.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f24572x;
        if (drawable != null) {
            drawable.setTintMode(mode);
        }
        Drawable drawable2 = this.f24573y;
        if (drawable2 != null) {
            drawable2.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Animatable animatable;
        Drawable drawable = this.f24572x;
        Animatable animatable2 = null;
        if (drawable instanceof Animatable) {
            animatable = (Animatable) drawable;
        } else {
            animatable = null;
        }
        if (animatable != null) {
            animatable.start();
        }
        Drawable drawable2 = this.f24573y;
        if (drawable2 instanceof Animatable) {
            animatable2 = (Animatable) drawable2;
        }
        if (animatable2 != null) {
            animatable2.start();
        }
        if (this.f24571w != 0) {
            return;
        }
        this.f24571w = 1;
        this.f24569u = SystemClock.uptimeMillis();
        List<androidx.vectordrawable.graphics.drawable.b> list = this.f24566r;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            list.get(i10).c(this);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        Animatable animatable;
        Drawable drawable = this.f24572x;
        Animatable animatable2 = null;
        if (drawable instanceof Animatable) {
            animatable = (Animatable) drawable;
        } else {
            animatable = null;
        }
        if (animatable != null) {
            animatable.stop();
        }
        Drawable drawable2 = this.f24573y;
        if (drawable2 instanceof Animatable) {
            animatable2 = (Animatable) drawable2;
        }
        if (animatable2 != null) {
            animatable2.stop();
        }
        if (this.f24571w != 2) {
            b();
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
