package com.habitrpg.common.habitica.views;

import android.graphics.Paint;
import qc.r;

/* compiled from: PixelArtView.kt */
/* loaded from: classes4.dex */
final class PixelArtView$paint$2 extends r implements pc.a<Paint> {
    public static final PixelArtView$paint$2 INSTANCE = new PixelArtView$paint$2();

    PixelArtView$paint$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // pc.a
    public final Paint invoke() {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setFilterBitmap(false);
        return paint;
    }
}
