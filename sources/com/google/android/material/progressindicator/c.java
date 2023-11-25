package com.google.android.material.progressindicator;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;

/* compiled from: CircularDrawingDelegate.java */
/* loaded from: classes3.dex */
final class c extends h<e> {

    /* renamed from: c  reason: collision with root package name */
    private int f10213c;

    /* renamed from: d  reason: collision with root package name */
    private float f10214d;

    /* renamed from: e  reason: collision with root package name */
    private float f10215e;

    /* renamed from: f  reason: collision with root package name */
    private float f10216f;

    public c(e eVar) {
        super(eVar);
        this.f10213c = 1;
    }

    private void h(Canvas canvas, Paint paint, float f10, float f11, float f12) {
        canvas.save();
        canvas.rotate(f12);
        float f13 = this.f10216f;
        float f14 = f10 / 2.0f;
        canvas.drawRoundRect(new RectF(f13 - f14, f11, f13 + f14, -f11), f11, f11, paint);
        canvas.restore();
    }

    private int i() {
        S s10 = this.f10250a;
        return ((e) s10).f10232g + (((e) s10).f10233h * 2);
    }

    @Override // com.google.android.material.progressindicator.h
    public void a(Canvas canvas, Rect rect, float f10) {
        int i10;
        float width = rect.width() / e();
        float height = rect.height() / d();
        S s10 = this.f10250a;
        float f11 = (((e) s10).f10232g / 2.0f) + ((e) s10).f10233h;
        canvas.translate((f11 * width) + rect.left, (f11 * height) + rect.top);
        canvas.scale(width, height);
        canvas.rotate(-90.0f);
        float f12 = -f11;
        canvas.clipRect(f12, f12, f11, f11);
        if (((e) this.f10250a).f10234i == 0) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        this.f10213c = i10;
        this.f10214d = ((e) r8).f10207a * f10;
        this.f10215e = ((e) r8).f10208b * f10;
        this.f10216f = (((e) r8).f10232g - ((e) r8).f10207a) / 2.0f;
        if ((this.f10251b.k() && ((e) this.f10250a).f10211e == 2) || (this.f10251b.j() && ((e) this.f10250a).f10212f == 1)) {
            this.f10216f += ((1.0f - f10) * ((e) this.f10250a).f10207a) / 2.0f;
        } else if ((this.f10251b.k() && ((e) this.f10250a).f10211e == 1) || (this.f10251b.j() && ((e) this.f10250a).f10212f == 2)) {
            this.f10216f -= ((1.0f - f10) * ((e) this.f10250a).f10207a) / 2.0f;
        }
    }

    @Override // com.google.android.material.progressindicator.h
    void b(Canvas canvas, Paint paint, float f10, float f11, int i10) {
        float f12;
        if (f10 == f11) {
            return;
        }
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        paint.setColor(i10);
        paint.setStrokeWidth(this.f10214d);
        int i11 = this.f10213c;
        float f13 = f10 * 360.0f * i11;
        if (f11 >= f10) {
            f12 = f11 - f10;
        } else {
            f12 = (1.0f + f11) - f10;
        }
        float f14 = f12 * 360.0f * i11;
        float f15 = this.f10216f;
        canvas.drawArc(new RectF(-f15, -f15, f15, f15), f13, f14, false, paint);
        if (this.f10215e > 0.0f && Math.abs(f14) < 360.0f) {
            paint.setStyle(Paint.Style.FILL);
            h(canvas, paint, this.f10214d, this.f10215e, f13);
            h(canvas, paint, this.f10214d, this.f10215e, f13 + f14);
        }
    }

    @Override // com.google.android.material.progressindicator.h
    void c(Canvas canvas, Paint paint) {
        int a10 = d7.a.a(((e) this.f10250a).f10210d, this.f10251b.getAlpha());
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        paint.setColor(a10);
        paint.setStrokeWidth(this.f10214d);
        float f10 = this.f10216f;
        canvas.drawArc(new RectF(-f10, -f10, f10, f10), 0.0f, 360.0f, false, paint);
    }

    @Override // com.google.android.material.progressindicator.h
    public int d() {
        return i();
    }

    @Override // com.google.android.material.progressindicator.h
    public int e() {
        return i();
    }
}
