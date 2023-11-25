package com.google.android.material.timepicker;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.core.view.p0;
import androidx.recyclerview.widget.m;
import com.google.android.material.internal.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import v6.k;
import v6.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class ClockHandView extends View {
    private final RectF A;
    private final int B;
    private float C;
    private boolean D;
    private double E;
    private int F;
    private int G;

    /* renamed from: f  reason: collision with root package name */
    private final int f10640f;

    /* renamed from: m  reason: collision with root package name */
    private final TimeInterpolator f10641m;

    /* renamed from: p  reason: collision with root package name */
    private final ValueAnimator f10642p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f10643q;

    /* renamed from: r  reason: collision with root package name */
    private float f10644r;

    /* renamed from: s  reason: collision with root package name */
    private float f10645s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f10646t;

    /* renamed from: u  reason: collision with root package name */
    private final int f10647u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f10648v;

    /* renamed from: w  reason: collision with root package name */
    private final List<b> f10649w;

    /* renamed from: x  reason: collision with root package name */
    private final int f10650x;

    /* renamed from: y  reason: collision with root package name */
    private final float f10651y;

    /* renamed from: z  reason: collision with root package name */
    private final Paint f10652z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            animator.end();
        }
    }

    /* loaded from: classes3.dex */
    public interface b {
        void a(float f10, boolean z10);
    }

    public ClockHandView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, v6.b.C);
    }

    private void c(float f10, float f11) {
        int i10 = 2;
        if (i7.a.a(getWidth() / 2, getHeight() / 2, f10, f11) > h(2) + r.c(getContext(), 12)) {
            i10 = 1;
        }
        this.G = i10;
    }

    private void d(Canvas canvas) {
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float f10 = width;
        float h10 = h(this.G);
        float cos = (((float) Math.cos(this.E)) * h10) + f10;
        float f11 = height;
        float sin = (h10 * ((float) Math.sin(this.E))) + f11;
        this.f10652z.setStrokeWidth(0.0f);
        canvas.drawCircle(cos, sin, this.f10650x, this.f10652z);
        double sin2 = Math.sin(this.E);
        double cos2 = Math.cos(this.E);
        this.f10652z.setStrokeWidth(this.B);
        canvas.drawLine(f10, f11, width + ((int) (cos2 * r7)), height + ((int) (r7 * sin2)), this.f10652z);
        canvas.drawCircle(f10, f11, this.f10651y, this.f10652z);
    }

    private int f(float f10, float f11) {
        int degrees = ((int) Math.toDegrees(Math.atan2(f11 - (getHeight() / 2), f10 - (getWidth() / 2)))) + 90;
        if (degrees < 0) {
            return degrees + 360;
        }
        return degrees;
    }

    private int h(int i10) {
        if (i10 == 2) {
            return Math.round(this.F * 0.66f);
        }
        return this.F;
    }

    private Pair<Float, Float> j(float f10) {
        float g10 = g();
        if (Math.abs(g10 - f10) > 180.0f) {
            if (g10 > 180.0f && f10 < 180.0f) {
                f10 += 360.0f;
            }
            if (g10 < 180.0f && f10 > 180.0f) {
                g10 += 360.0f;
            }
        }
        return new Pair<>(Float.valueOf(g10), Float.valueOf(f10));
    }

    private boolean k(float f10, float f11, boolean z10, boolean z11, boolean z12) {
        boolean z13;
        float f12 = f(f10, f11);
        boolean z14 = false;
        if (g() != f12) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (z11 && z13) {
            return true;
        }
        if (!z13 && !z10) {
            return false;
        }
        if (z12 && this.f10643q) {
            z14 = true;
        }
        o(f12, z14);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l(ValueAnimator valueAnimator) {
        p(((Float) valueAnimator.getAnimatedValue()).floatValue(), true);
    }

    private void p(float f10, boolean z10) {
        float f11 = f10 % 360.0f;
        this.C = f11;
        this.E = Math.toRadians(f11 - 90.0f);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float h10 = h(this.G);
        float cos = width + (((float) Math.cos(this.E)) * h10);
        float sin = height + (h10 * ((float) Math.sin(this.E)));
        RectF rectF = this.A;
        int i10 = this.f10650x;
        rectF.set(cos - i10, sin - i10, cos + i10, sin + i10);
        Iterator<b> it = this.f10649w.iterator();
        while (it.hasNext()) {
            it.next().a(f11, z10);
        }
        invalidate();
    }

    public void b(b bVar) {
        this.f10649w.add(bVar);
    }

    public RectF e() {
        return this.A;
    }

    public float g() {
        return this.C;
    }

    public int i() {
        return this.f10650x;
    }

    public void m(int i10) {
        this.F = i10;
        invalidate();
    }

    public void n(float f10) {
        o(f10, false);
    }

    public void o(float f10, boolean z10) {
        ValueAnimator valueAnimator = this.f10642p;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!z10) {
            p(f10, false);
            return;
        }
        Pair<Float, Float> j10 = j(f10);
        this.f10642p.setFloatValues(((Float) j10.first).floatValue(), ((Float) j10.second).floatValue());
        this.f10642p.setDuration(this.f10640f);
        this.f10642p.setInterpolator(this.f10641m);
        this.f10642p.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.timepicker.b
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                ClockHandView.this.l(valueAnimator2);
            }
        });
        this.f10642p.addListener(new a());
        this.f10642p.start();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        d(canvas);
    }

    @Override // android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (!this.f10642p.isRunning()) {
            n(g());
        }
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int actionMasked = motionEvent.getActionMasked();
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        if (actionMasked != 0) {
            if (actionMasked != 1 && actionMasked != 2) {
                z10 = false;
                z11 = false;
            } else {
                int i10 = (int) (x10 - this.f10644r);
                int i11 = (int) (y10 - this.f10645s);
                if ((i10 * i10) + (i11 * i11) > this.f10647u) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                this.f10646t = z13;
                z10 = this.D;
                if (actionMasked == 1) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (this.f10648v) {
                    c(x10, y10);
                }
                z12 = z14;
                z11 = false;
                this.D |= k(x10, y10, z10, z11, z12);
                return true;
            }
        } else {
            this.f10644r = x10;
            this.f10645s = y10;
            this.f10646t = true;
            this.D = false;
            z10 = false;
            z11 = true;
        }
        z12 = false;
        this.D |= k(x10, y10, z10, z11, z12);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void q(boolean z10) {
        if (this.f10648v && !z10) {
            this.G = 1;
        }
        this.f10648v = z10;
        invalidate();
    }

    public ClockHandView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f10642p = new ValueAnimator();
        this.f10649w = new ArrayList();
        Paint paint = new Paint();
        this.f10652z = paint;
        this.A = new RectF();
        this.G = 1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.O1, i10, k.G);
        this.f10640f = j7.a.f(context, v6.b.E, m.e.DEFAULT_DRAG_ANIMATION_DURATION);
        this.f10641m = j7.a.g(context, v6.b.O, w6.a.f25411b);
        this.F = obtainStyledAttributes.getDimensionPixelSize(l.Q1, 0);
        this.f10650x = obtainStyledAttributes.getDimensionPixelSize(l.R1, 0);
        this.B = getResources().getDimensionPixelSize(v6.d.f24699x);
        this.f10651y = r7.getDimensionPixelSize(v6.d.f24697v);
        int color = obtainStyledAttributes.getColor(l.P1, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        n(0.0f);
        this.f10647u = ViewConfiguration.get(context).getScaledTouchSlop();
        p0.F0(this, 2);
        obtainStyledAttributes.recycle();
    }
}
