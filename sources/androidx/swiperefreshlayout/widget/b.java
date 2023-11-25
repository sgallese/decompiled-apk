package androidx.swiperefreshlayout.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.core.util.i;

/* compiled from: CircularProgressDrawable.java */
/* loaded from: classes.dex */
public class b extends Drawable implements Animatable {

    /* renamed from: t  reason: collision with root package name */
    private static final Interpolator f7139t = new LinearInterpolator();

    /* renamed from: u  reason: collision with root package name */
    private static final Interpolator f7140u = new g3.b();

    /* renamed from: v  reason: collision with root package name */
    private static final int[] f7141v = {-16777216};

    /* renamed from: f  reason: collision with root package name */
    private final c f7142f;

    /* renamed from: m  reason: collision with root package name */
    private float f7143m;

    /* renamed from: p  reason: collision with root package name */
    private Resources f7144p;

    /* renamed from: q  reason: collision with root package name */
    private Animator f7145q;

    /* renamed from: r  reason: collision with root package name */
    float f7146r;

    /* renamed from: s  reason: collision with root package name */
    boolean f7147s;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CircularProgressDrawable.java */
    /* loaded from: classes.dex */
    public class a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f7148a;

        a(c cVar) {
            this.f7148a = cVar;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            b.this.n(floatValue, this.f7148a);
            b.this.b(floatValue, this.f7148a, false);
            b.this.invalidateSelf();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: CircularProgressDrawable.java */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        final RectF f7152a = new RectF();

        /* renamed from: b  reason: collision with root package name */
        final Paint f7153b;

        /* renamed from: c  reason: collision with root package name */
        final Paint f7154c;

        /* renamed from: d  reason: collision with root package name */
        final Paint f7155d;

        /* renamed from: e  reason: collision with root package name */
        float f7156e;

        /* renamed from: f  reason: collision with root package name */
        float f7157f;

        /* renamed from: g  reason: collision with root package name */
        float f7158g;

        /* renamed from: h  reason: collision with root package name */
        float f7159h;

        /* renamed from: i  reason: collision with root package name */
        int[] f7160i;

        /* renamed from: j  reason: collision with root package name */
        int f7161j;

        /* renamed from: k  reason: collision with root package name */
        float f7162k;

        /* renamed from: l  reason: collision with root package name */
        float f7163l;

        /* renamed from: m  reason: collision with root package name */
        float f7164m;

        /* renamed from: n  reason: collision with root package name */
        boolean f7165n;

        /* renamed from: o  reason: collision with root package name */
        Path f7166o;

        /* renamed from: p  reason: collision with root package name */
        float f7167p;

        /* renamed from: q  reason: collision with root package name */
        float f7168q;

        /* renamed from: r  reason: collision with root package name */
        int f7169r;

        /* renamed from: s  reason: collision with root package name */
        int f7170s;

        /* renamed from: t  reason: collision with root package name */
        int f7171t;

        /* renamed from: u  reason: collision with root package name */
        int f7172u;

        c() {
            Paint paint = new Paint();
            this.f7153b = paint;
            Paint paint2 = new Paint();
            this.f7154c = paint2;
            Paint paint3 = new Paint();
            this.f7155d = paint3;
            this.f7156e = 0.0f;
            this.f7157f = 0.0f;
            this.f7158g = 0.0f;
            this.f7159h = 5.0f;
            this.f7167p = 1.0f;
            this.f7171t = 255;
            paint.setStrokeCap(Paint.Cap.SQUARE);
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setAntiAlias(true);
            paint3.setColor(0);
        }

        void A() {
            this.f7162k = this.f7156e;
            this.f7163l = this.f7157f;
            this.f7164m = this.f7158g;
        }

        void a(Canvas canvas, Rect rect) {
            RectF rectF = this.f7152a;
            float f10 = this.f7168q;
            float f11 = (this.f7159h / 2.0f) + f10;
            if (f10 <= 0.0f) {
                f11 = (Math.min(rect.width(), rect.height()) / 2.0f) - Math.max((this.f7169r * this.f7167p) / 2.0f, this.f7159h / 2.0f);
            }
            rectF.set(rect.centerX() - f11, rect.centerY() - f11, rect.centerX() + f11, rect.centerY() + f11);
            float f12 = this.f7156e;
            float f13 = this.f7158g;
            float f14 = (f12 + f13) * 360.0f;
            float f15 = ((this.f7157f + f13) * 360.0f) - f14;
            this.f7153b.setColor(this.f7172u);
            this.f7153b.setAlpha(this.f7171t);
            float f16 = this.f7159h / 2.0f;
            rectF.inset(f16, f16);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.f7155d);
            float f17 = -f16;
            rectF.inset(f17, f17);
            canvas.drawArc(rectF, f14, f15, false, this.f7153b);
            b(canvas, f14, f15, rectF);
        }

        void b(Canvas canvas, float f10, float f11, RectF rectF) {
            if (this.f7165n) {
                Path path = this.f7166o;
                if (path == null) {
                    Path path2 = new Path();
                    this.f7166o = path2;
                    path2.setFillType(Path.FillType.EVEN_ODD);
                } else {
                    path.reset();
                }
                float min = Math.min(rectF.width(), rectF.height()) / 2.0f;
                float f12 = (this.f7169r * this.f7167p) / 2.0f;
                this.f7166o.moveTo(0.0f, 0.0f);
                this.f7166o.lineTo(this.f7169r * this.f7167p, 0.0f);
                Path path3 = this.f7166o;
                float f13 = this.f7169r;
                float f14 = this.f7167p;
                path3.lineTo((f13 * f14) / 2.0f, this.f7170s * f14);
                this.f7166o.offset((min + rectF.centerX()) - f12, rectF.centerY() + (this.f7159h / 2.0f));
                this.f7166o.close();
                this.f7154c.setColor(this.f7172u);
                this.f7154c.setAlpha(this.f7171t);
                canvas.save();
                canvas.rotate(f10 + f11, rectF.centerX(), rectF.centerY());
                canvas.drawPath(this.f7166o, this.f7154c);
                canvas.restore();
            }
        }

        int c() {
            return this.f7171t;
        }

        float d() {
            return this.f7157f;
        }

        int e() {
            return this.f7160i[f()];
        }

        int f() {
            return (this.f7161j + 1) % this.f7160i.length;
        }

        float g() {
            return this.f7156e;
        }

        int h() {
            return this.f7160i[this.f7161j];
        }

        float i() {
            return this.f7163l;
        }

        float j() {
            return this.f7164m;
        }

        float k() {
            return this.f7162k;
        }

        void l() {
            t(f());
        }

        void m() {
            this.f7162k = 0.0f;
            this.f7163l = 0.0f;
            this.f7164m = 0.0f;
            y(0.0f);
            v(0.0f);
            w(0.0f);
        }

        void n(int i10) {
            this.f7171t = i10;
        }

        void o(float f10, float f11) {
            this.f7169r = (int) f10;
            this.f7170s = (int) f11;
        }

        void p(float f10) {
            if (f10 != this.f7167p) {
                this.f7167p = f10;
            }
        }

        void q(float f10) {
            this.f7168q = f10;
        }

        void r(int i10) {
            this.f7172u = i10;
        }

        void s(ColorFilter colorFilter) {
            this.f7153b.setColorFilter(colorFilter);
        }

        void t(int i10) {
            this.f7161j = i10;
            this.f7172u = this.f7160i[i10];
        }

        void u(int[] iArr) {
            this.f7160i = iArr;
            t(0);
        }

        void v(float f10) {
            this.f7157f = f10;
        }

        void w(float f10) {
            this.f7158g = f10;
        }

        void x(boolean z10) {
            if (this.f7165n != z10) {
                this.f7165n = z10;
            }
        }

        void y(float f10) {
            this.f7156e = f10;
        }

        void z(float f10) {
            this.f7159h = f10;
            this.f7153b.setStrokeWidth(f10);
        }
    }

    public b(Context context) {
        this.f7144p = ((Context) i.g(context)).getResources();
        c cVar = new c();
        this.f7142f = cVar;
        cVar.u(f7141v);
        k(2.5f);
        m();
    }

    private void a(float f10, c cVar) {
        n(f10, cVar);
        float floor = (float) (Math.floor(cVar.j() / 0.8f) + 1.0d);
        cVar.y(cVar.k() + (((cVar.i() - 0.01f) - cVar.k()) * f10));
        cVar.v(cVar.i());
        cVar.w(cVar.j() + ((floor - cVar.j()) * f10));
    }

    private int c(float f10, int i10, int i11) {
        return ((((i10 >> 24) & 255) + ((int) ((((i11 >> 24) & 255) - r0) * f10))) << 24) | ((((i10 >> 16) & 255) + ((int) ((((i11 >> 16) & 255) - r1) * f10))) << 16) | ((((i10 >> 8) & 255) + ((int) ((((i11 >> 8) & 255) - r2) * f10))) << 8) | ((i10 & 255) + ((int) (f10 * ((i11 & 255) - r8))));
    }

    private void h(float f10) {
        this.f7143m = f10;
    }

    private void i(float f10, float f11, float f12, float f13) {
        c cVar = this.f7142f;
        float f14 = this.f7144p.getDisplayMetrics().density;
        cVar.z(f11 * f14);
        cVar.q(f10 * f14);
        cVar.t(0);
        cVar.o(f12 * f14, f13 * f14);
    }

    private void m() {
        c cVar = this.f7142f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new a(cVar));
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(f7139t);
        ofFloat.addListener(new C0164b(cVar));
        this.f7145q = ofFloat;
    }

    void b(float f10, c cVar, boolean z10) {
        float interpolation;
        float f11;
        if (this.f7147s) {
            a(f10, cVar);
        } else if (f10 != 1.0f || z10) {
            float j10 = cVar.j();
            if (f10 < 0.5f) {
                interpolation = cVar.k();
                f11 = (f7140u.getInterpolation(f10 / 0.5f) * 0.79f) + 0.01f + interpolation;
            } else {
                float k10 = cVar.k() + 0.79f;
                interpolation = k10 - (((1.0f - f7140u.getInterpolation((f10 - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                f11 = k10;
            }
            float f12 = j10 + (0.20999998f * f10);
            float f13 = (f10 + this.f7146r) * 216.0f;
            cVar.y(interpolation);
            cVar.v(f11);
            cVar.w(f12);
            h(f13);
        }
    }

    public void d(boolean z10) {
        this.f7142f.x(z10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f7143m, bounds.exactCenterX(), bounds.exactCenterY());
        this.f7142f.a(canvas, bounds);
        canvas.restore();
    }

    public void e(float f10) {
        this.f7142f.p(f10);
        invalidateSelf();
    }

    public void f(int... iArr) {
        this.f7142f.u(iArr);
        this.f7142f.t(0);
        invalidateSelf();
    }

    public void g(float f10) {
        this.f7142f.w(f10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f7142f.c();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f7145q.isRunning();
    }

    public void j(float f10, float f11) {
        this.f7142f.y(f10);
        this.f7142f.v(f11);
        invalidateSelf();
    }

    public void k(float f10) {
        this.f7142f.z(f10);
        invalidateSelf();
    }

    public void l(int i10) {
        if (i10 == 0) {
            i(11.0f, 3.0f, 12.0f, 6.0f);
        } else {
            i(7.5f, 2.5f, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    void n(float f10, c cVar) {
        if (f10 > 0.75f) {
            cVar.r(c((f10 - 0.75f) / 0.25f, cVar.h(), cVar.e()));
        } else {
            cVar.r(cVar.h());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f7142f.n(i10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f7142f.s(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.f7145q.cancel();
        this.f7142f.A();
        if (this.f7142f.d() != this.f7142f.g()) {
            this.f7147s = true;
            this.f7145q.setDuration(666L);
            this.f7145q.start();
            return;
        }
        this.f7142f.t(0);
        this.f7142f.m();
        this.f7145q.setDuration(1332L);
        this.f7145q.start();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f7145q.cancel();
        h(0.0f);
        this.f7142f.x(false);
        this.f7142f.t(0);
        this.f7142f.m();
        invalidateSelf();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CircularProgressDrawable.java */
    /* renamed from: androidx.swiperefreshlayout.widget.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0164b implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f7150a;

        C0164b(c cVar) {
            this.f7150a = cVar;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            b.this.b(1.0f, this.f7150a, true);
            this.f7150a.A();
            this.f7150a.l();
            b bVar = b.this;
            if (bVar.f7147s) {
                bVar.f7147s = false;
                animator.cancel();
                animator.setDuration(1332L);
                animator.start();
                this.f7150a.x(false);
                return;
            }
            bVar.f7146r += 1.0f;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            b.this.f7146r = 0.0f;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }
    }
}
