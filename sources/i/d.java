package i;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import g.i;
import g.j;

/* compiled from: DrawerArrowDrawable.java */
/* loaded from: classes.dex */
public class d extends Drawable {

    /* renamed from: m  reason: collision with root package name */
    private static final float f16702m = (float) Math.toRadians(45.0d);

    /* renamed from: a  reason: collision with root package name */
    private final Paint f16703a;

    /* renamed from: b  reason: collision with root package name */
    private float f16704b;

    /* renamed from: c  reason: collision with root package name */
    private float f16705c;

    /* renamed from: d  reason: collision with root package name */
    private float f16706d;

    /* renamed from: e  reason: collision with root package name */
    private float f16707e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f16708f;

    /* renamed from: g  reason: collision with root package name */
    private final Path f16709g;

    /* renamed from: h  reason: collision with root package name */
    private final int f16710h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f16711i;

    /* renamed from: j  reason: collision with root package name */
    private float f16712j;

    /* renamed from: k  reason: collision with root package name */
    private float f16713k;

    /* renamed from: l  reason: collision with root package name */
    private int f16714l;

    public d(Context context) {
        Paint paint = new Paint();
        this.f16703a = paint;
        this.f16709g = new Path();
        this.f16711i = false;
        this.f16714l = 2;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.MITER);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, j.Z0, g.a.A, i.f15827b);
        c(obtainStyledAttributes.getColor(j.f15851d1, 0));
        b(obtainStyledAttributes.getDimension(j.f15871h1, 0.0f));
        e(obtainStyledAttributes.getBoolean(j.f15866g1, true));
        d(Math.round(obtainStyledAttributes.getDimension(j.f15861f1, 0.0f)));
        this.f16710h = obtainStyledAttributes.getDimensionPixelSize(j.f15856e1, 0);
        this.f16705c = Math.round(obtainStyledAttributes.getDimension(j.f15846c1, 0.0f));
        this.f16704b = Math.round(obtainStyledAttributes.getDimension(j.f15834a1, 0.0f));
        this.f16706d = obtainStyledAttributes.getDimension(j.f15840b1, 0.0f);
        obtainStyledAttributes.recycle();
    }

    private static float a(float f10, float f11, float f12) {
        return f10 + ((f11 - f10) * f12);
    }

    public void b(float f10) {
        if (this.f16703a.getStrokeWidth() != f10) {
            this.f16703a.setStrokeWidth(f10);
            this.f16713k = (float) ((f10 / 2.0f) * Math.cos(f16702m));
            invalidateSelf();
        }
    }

    public void c(int i10) {
        if (i10 != this.f16703a.getColor()) {
            this.f16703a.setColor(i10);
            invalidateSelf();
        }
    }

    public void d(float f10) {
        if (f10 != this.f16707e) {
            this.f16707e = f10;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        float f10;
        float f11;
        int i10;
        Rect bounds = getBounds();
        int i11 = this.f16714l;
        boolean z10 = false;
        if (i11 != 0 && (i11 == 1 || (i11 == 3 ? androidx.core.graphics.drawable.a.f(this) == 0 : androidx.core.graphics.drawable.a.f(this) == 1))) {
            z10 = true;
        }
        float f12 = this.f16704b;
        float a10 = a(this.f16705c, (float) Math.sqrt(f12 * f12 * 2.0f), this.f16712j);
        float a11 = a(this.f16705c, this.f16706d, this.f16712j);
        float round = Math.round(a(0.0f, this.f16713k, this.f16712j));
        float a12 = a(0.0f, f16702m, this.f16712j);
        if (z10) {
            f10 = 0.0f;
        } else {
            f10 = -180.0f;
        }
        if (z10) {
            f11 = 180.0f;
        } else {
            f11 = 0.0f;
        }
        float a13 = a(f10, f11, this.f16712j);
        double d10 = a10;
        double d11 = a12;
        boolean z11 = z10;
        float round2 = (float) Math.round(Math.cos(d11) * d10);
        float round3 = (float) Math.round(d10 * Math.sin(d11));
        this.f16709g.rewind();
        float a14 = a(this.f16707e + this.f16703a.getStrokeWidth(), -this.f16713k, this.f16712j);
        float f13 = (-a11) / 2.0f;
        this.f16709g.moveTo(f13 + round, 0.0f);
        this.f16709g.rLineTo(a11 - (round * 2.0f), 0.0f);
        this.f16709g.moveTo(f13, a14);
        this.f16709g.rLineTo(round2, round3);
        this.f16709g.moveTo(f13, -a14);
        this.f16709g.rLineTo(round2, -round3);
        this.f16709g.close();
        canvas.save();
        float strokeWidth = this.f16703a.getStrokeWidth();
        float height = bounds.height() - (3.0f * strokeWidth);
        canvas.translate(bounds.centerX(), ((((int) (height - (2.0f * r5))) / 4) * 2) + (strokeWidth * 1.5f) + this.f16707e);
        if (this.f16708f) {
            if (this.f16711i ^ z11) {
                i10 = -1;
            } else {
                i10 = 1;
            }
            canvas.rotate(a13 * i10);
        } else if (z11) {
            canvas.rotate(180.0f);
        }
        canvas.drawPath(this.f16709g, this.f16703a);
        canvas.restore();
    }

    public void e(boolean z10) {
        if (this.f16708f != z10) {
            this.f16708f = z10;
            invalidateSelf();
        }
    }

    public void f(boolean z10) {
        if (this.f16711i != z10) {
            this.f16711i = z10;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f16710h;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f16710h;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        if (i10 != this.f16703a.getAlpha()) {
            this.f16703a.setAlpha(i10);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f16703a.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void setProgress(float f10) {
        if (this.f16712j != f10) {
            this.f16712j = f10;
            invalidateSelf();
        }
    }
}
