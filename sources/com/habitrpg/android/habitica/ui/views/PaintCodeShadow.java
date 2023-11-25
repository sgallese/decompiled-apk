package com.habitrpg.android.habitica.ui.views;

import android.graphics.BlurMaskFilter;
import android.graphics.Paint;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: HabiticaIcons.java */
/* loaded from: classes4.dex */
public class PaintCodeShadow {
    private BlurMaskFilter blurMaskFilter;
    int color;
    float dx;
    float dy;
    private float radius;

    /* JADX INFO: Access modifiers changed from: package-private */
    public PaintCodeShadow get(int i10) {
        this.color = i10;
        this.dx = 0.0f;
        this.dy = 1.0f;
        if (this.radius != 1.0f) {
            this.blurMaskFilter = null;
            this.radius = 1.0f;
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setBlurOfPaint(Paint paint) {
        if (this.radius <= 0.0f) {
            return;
        }
        if (this.blurMaskFilter == null) {
            this.blurMaskFilter = new BlurMaskFilter(this.radius, BlurMaskFilter.Blur.NORMAL);
        }
        paint.setMaskFilter(this.blurMaskFilter);
    }
}
