package com.habitrpg.android.habitica.ui.views;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.habitrpg.android.habitica.R;
import com.habitrpg.common.habitica.extensions.IntExtensionsKt;
import qc.q;

/* compiled from: SparkView.kt */
/* loaded from: classes4.dex */
public final class SparkView extends View {
    public static final int $stable = 8;
    private long animationDuration;
    private int length;
    private int maxSpacing;
    private Paint paint;
    private float spacing;
    private int thickness;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SparkView(Context context) {
        this(context, null, 0, 6, null);
        q.i(context, "context");
    }

    private final void drawHorizontal(Canvas canvas, float f10, float f11) {
        int i10 = this.thickness;
        canvas.drawRoundRect(f10, f11 - (i10 / 2), f10 + this.length, f11 + (i10 / 2), i10 / 2.0f, i10 / 2.0f, this.paint);
    }

    private final void drawVertical(Canvas canvas, float f10, float f11) {
        int i10 = this.thickness;
        canvas.drawRoundRect(f10 - (i10 / 2), f11, f10 + (i10 / 2), f11 + this.length, i10 / 2.0f, i10 / 2.0f, this.paint);
    }

    private final void setSpacing(float f10) {
        this.spacing = f10;
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startAnimating$lambda$1(SparkView sparkView, ValueAnimator valueAnimator) {
        q.i(sparkView, "this$0");
        q.i(valueAnimator, "it");
        Object animatedValue = valueAnimator.getAnimatedValue();
        q.g(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        sparkView.setSpacing(((Float) animatedValue).floatValue());
    }

    public final long getAnimationDuration() {
        return this.animationDuration;
    }

    public final int getColor() {
        return this.paint.getColor();
    }

    public final int getLength() {
        return this.length;
    }

    public final int getMaxSpacing() {
        return this.maxSpacing;
    }

    public final int getThickness() {
        return this.thickness;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        q.i(canvas, "canvas");
        super.onDraw(canvas);
        float height = getHeight() / 2.0f;
        float f10 = (this.maxSpacing - this.spacing) / 2;
        drawHorizontal(canvas, f10, height);
        drawHorizontal(canvas, (getWidth() - this.length) - f10, height);
        drawVertical(canvas, getWidth() / 2.0f, f10);
        drawVertical(canvas, height, (getHeight() - this.length) - f10);
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int i12 = (this.length * 2) + this.maxSpacing;
        int mode = View.MeasureSpec.getMode(i10);
        if (mode != Integer.MIN_VALUE) {
            if (mode != 1073741824) {
                size = i12;
            }
        } else {
            size = Math.min(i12, size);
        }
        int mode2 = View.MeasureSpec.getMode(i11);
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 != 1073741824) {
                size2 = i12;
            }
        } else {
            size2 = Math.min(i12, size2);
        }
        setMeasuredDimension(size, size2);
    }

    public final void setAnimationDuration(long j10) {
        this.animationDuration = j10;
    }

    public final void setColor(int i10) {
        this.paint.setColor(i10);
    }

    public final void setLength(int i10) {
        this.length = i10;
    }

    public final void setMaxSpacing(int i10) {
        this.maxSpacing = i10;
    }

    public final void setThickness(int i10) {
        this.thickness = i10;
    }

    public final void startAnimating() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.thickness, this.maxSpacing);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.habitrpg.android.habitica.ui.views.k
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                SparkView.startAnimating$lambda$1(SparkView.this, valueAnimator);
            }
        });
        ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(2);
        ofFloat.setDuration(this.animationDuration);
        ofFloat.start();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SparkView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        q.i(context, "context");
    }

    public /* synthetic */ SparkView(Context context, AttributeSet attributeSet, int i10, int i11, qc.h hVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SparkView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        TypedArray obtainStyledAttributes;
        q.i(context, "context");
        this.paint = new Paint();
        this.thickness = IntExtensionsKt.dpToPx(3, context);
        this.length = IntExtensionsKt.dpToPx(6, context);
        int dpToPx = IntExtensionsKt.dpToPx(5, context);
        this.maxSpacing = dpToPx;
        this.animationDuration = 2500L;
        setSpacing(dpToPx);
        Resources.Theme theme = context.getTheme();
        if (theme != null && (obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, R.styleable.SparkView, 0, 0)) != null) {
            this.thickness = obtainStyledAttributes.getDimensionPixelSize(4, IntExtensionsKt.dpToPx(3, context));
            this.length = obtainStyledAttributes.getDimensionPixelSize(2, IntExtensionsKt.dpToPx(6, context));
            this.maxSpacing = obtainStyledAttributes.getDimensionPixelSize(3, IntExtensionsKt.dpToPx(5, context));
            this.animationDuration = obtainStyledAttributes.getInt(1, 2500);
            setColor(obtainStyledAttributes.getInt(0, androidx.core.content.a.c(context, R.color.white)));
        }
        this.paint.setStyle(Paint.Style.FILL);
    }
}
