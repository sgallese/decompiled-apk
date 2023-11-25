package com.facebook.shimmer;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.facebook.shimmer.a;

/* loaded from: classes.dex */
public class ShimmerFrameLayout extends FrameLayout {

    /* renamed from: f  reason: collision with root package name */
    private final Paint f9254f;

    /* renamed from: m  reason: collision with root package name */
    private final b f9255m;

    /* renamed from: p  reason: collision with root package name */
    private boolean f9256p;

    public ShimmerFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9254f = new Paint();
        this.f9255m = new b();
        this.f9256p = true;
        a(context, attributeSet);
    }

    private void a(Context context, AttributeSet attributeSet) {
        a.b c0228a;
        setWillNotDraw(false);
        this.f9255m.setCallback(this);
        if (attributeSet == null) {
            b(new a.C0228a().a());
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z5.a.f26404a, 0, 0);
        try {
            int i10 = z5.a.f26409f;
            if (obtainStyledAttributes.hasValue(i10) && obtainStyledAttributes.getBoolean(i10, false)) {
                c0228a = new a.c();
            } else {
                c0228a = new a.C0228a();
            }
            b(c0228a.c(obtainStyledAttributes).a());
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public ShimmerFrameLayout b(a aVar) {
        this.f9255m.d(aVar);
        if (aVar != null && aVar.f9271o) {
            setLayerType(2, this.f9254f);
        } else {
            setLayerType(0, null);
        }
        return this;
    }

    public void c() {
        this.f9255m.e();
    }

    public void d() {
        this.f9255m.f();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f9256p) {
            this.f9255m.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f9255m.b();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f9255m.setBounds(0, 0, getWidth(), getHeight());
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f9255m) {
            return false;
        }
        return true;
    }
}
