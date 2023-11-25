package com.google.android.material.internal;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;

/* compiled from: FadeThroughDrawable.java */
/* loaded from: classes3.dex */
public class e extends Drawable {

    /* renamed from: a  reason: collision with root package name */
    private final Drawable f10140a;

    /* renamed from: b  reason: collision with root package name */
    private final Drawable f10141b;

    /* renamed from: c  reason: collision with root package name */
    private final float[] f10142c;

    /* renamed from: d  reason: collision with root package name */
    private float f10143d;

    public void a(float f10) {
        if (this.f10143d != f10) {
            this.f10143d = f10;
            f.a(f10, this.f10142c);
            this.f10140a.setAlpha((int) (this.f10142c[0] * 255.0f));
            this.f10141b.setAlpha((int) (this.f10142c[1] * 255.0f));
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f10140a.draw(canvas);
        this.f10141b.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return Math.max(this.f10140a.getIntrinsicHeight(), this.f10141b.getIntrinsicHeight());
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return Math.max(this.f10140a.getIntrinsicWidth(), this.f10141b.getIntrinsicWidth());
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return Math.max(this.f10140a.getMinimumHeight(), this.f10141b.getMinimumHeight());
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return Math.max(this.f10140a.getMinimumWidth(), this.f10141b.getMinimumWidth());
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (!this.f10140a.isStateful() && !this.f10141b.isStateful()) {
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        if (this.f10143d <= 0.5f) {
            this.f10140a.setAlpha(i10);
            this.f10141b.setAlpha(0);
        } else {
            this.f10140a.setAlpha(0);
            this.f10141b.setAlpha(i10);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i10, int i11, int i12, int i13) {
        super.setBounds(i10, i11, i12, i13);
        this.f10140a.setBounds(i10, i11, i12, i13);
        this.f10141b.setBounds(i10, i11, i12, i13);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f10140a.setColorFilter(colorFilter);
        this.f10141b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        boolean state = this.f10140a.setState(iArr);
        boolean state2 = this.f10141b.setState(iArr);
        if (!state && !state2) {
            return false;
        }
        return true;
    }
}
