package com.habitrpg.android.habitica.ui.views;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.RectF;
import android.graphics.Shader;

/* compiled from: HabiticaIcons.java */
/* loaded from: classes4.dex */
class PaintCodeBitmap {
    private Bitmap bitmap;
    private RectF bounds;
    private BitmapShader shader;

    /* JADX INFO: Access modifiers changed from: package-private */
    public PaintCodeBitmap get(Bitmap bitmap) {
        if (this.bitmap != bitmap) {
            this.bitmap = bitmap;
            this.bounds = new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight());
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            this.shader = new BitmapShader(bitmap, tileMode, tileMode);
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public RectF getBounds() {
        return this.bounds;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BitmapShader getShader() {
        return this.shader;
    }
}
