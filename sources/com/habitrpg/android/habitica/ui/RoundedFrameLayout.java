package com.habitrpg.android.habitica.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import qc.h;
import qc.q;

/* compiled from: RoundedFrameLayout.kt */
/* loaded from: classes4.dex */
public final class RoundedFrameLayout extends FrameLayout {
    public static final int $stable = 8;
    private final Rect bounds;
    private final Path clipPath;
    private boolean isCirclular;
    private float radius;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RoundedFrameLayout(Context context) {
        this(context, null, 0, 6, null);
        q.i(context, "context");
    }

    public final Rect getBounds() {
        return this.bounds;
    }

    public final Path getClipPath() {
        return this.clipPath;
    }

    public final float getRadius() {
        return this.radius;
    }

    public final boolean isCirclular() {
        return this.isCirclular;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        float f10;
        q.i(canvas, "canvas");
        this.clipPath.reset();
        if (this.isCirclular) {
            f10 = canvas.getHeight() / 2;
        } else {
            f10 = this.radius;
        }
        canvas.getClipBounds(this.bounds);
        this.clipPath.addRoundRect(new RectF(this.bounds), f10, f10, Path.Direction.CW);
        canvas.clipPath(this.clipPath);
        super.onDraw(canvas);
    }

    public final void setCirclular(boolean z10) {
        this.isCirclular = z10;
    }

    public final void setRadius(float f10) {
        this.radius = f10;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RoundedFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        q.i(context, "context");
    }

    public /* synthetic */ RoundedFrameLayout(Context context, AttributeSet attributeSet, int i10, int i11, h hVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoundedFrameLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        q.i(context, "context");
        this.radius = 4.0f;
        this.isCirclular = true;
        this.clipPath = new Path();
        this.bounds = new Rect();
    }
}
