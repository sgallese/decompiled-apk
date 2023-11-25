package com.habitrpg.common.habitica.views;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import dc.f;
import qc.h;
import qc.q;

/* compiled from: PixelArtView.kt */
/* loaded from: classes4.dex */
public final class PixelArtView extends AppCompatImageView {
    private Bitmap bitmap;
    private final f paint$delegate;
    private Rect targetRect;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PixelArtView(Context context) {
        this(context, null, 0, 6, null);
        q.i(context, "context");
    }

    private final Paint getPaint() {
        return (Paint) this.paint$delegate.getValue();
    }

    private final void updateTargetRect() {
        int i10;
        int i11;
        int i12;
        Bitmap bitmap = this.bitmap;
        int i13 = 0;
        if (bitmap != null) {
            i10 = bitmap.getWidth();
        } else {
            i10 = 0;
        }
        Bitmap bitmap2 = this.bitmap;
        if (bitmap2 != null) {
            i13 = bitmap2.getHeight();
        }
        int min = Math.min(getWidth(), getHeight());
        if (i10 % 3 == 0 && i13 % 3 == 0) {
            i11 = 3;
        } else {
            i11 = 2;
        }
        int i14 = 1;
        if (min > 0 && i10 > 0 && min != i10) {
            i12 = min / (i10 / i11);
        } else {
            i12 = 1;
        }
        if (min > 0 && i13 > 0 && min != i13) {
            i14 = min / (i13 / i11);
        }
        int min2 = Math.min(i12, i14);
        int i15 = (i10 / i11) * min2;
        int i16 = (i13 / i11) * min2;
        int width = (getWidth() - i15) / 2;
        int height = (getHeight() - i16) / 2;
        this.targetRect = new Rect(width, height, i15 + width, i16 + height);
    }

    public final Bitmap getBitmap() {
        return this.bitmap;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        q.i(canvas, "canvas");
        Bitmap bitmap = this.bitmap;
        if (bitmap == null) {
            super.onDraw(canvas);
        } else if (bitmap == null) {
        } else {
            canvas.drawBitmap(bitmap, (Rect) null, this.targetRect, getPaint());
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        updateTargetRect();
    }

    public final void setBitmap(Bitmap bitmap) {
        this.bitmap = bitmap;
        updateTargetRect();
        invalidate();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PixelArtView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        q.i(context, "context");
    }

    public /* synthetic */ PixelArtView(Context context, AttributeSet attributeSet, int i10, int i11, h hVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PixelArtView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        f b10;
        q.i(context, "context");
        this.targetRect = new Rect(0, 0, 0, 0);
        b10 = dc.h.b(PixelArtView$paint$2.INSTANCE);
        this.paint$delegate = b10;
    }
}
