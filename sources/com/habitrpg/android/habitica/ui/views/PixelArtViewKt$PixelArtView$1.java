package com.habitrpg.android.habitica.ui.views;

import android.content.Context;
import com.habitrpg.common.habitica.views.PixelArtView;
import qc.q;
import qc.r;

/* compiled from: PixelArtView.kt */
/* loaded from: classes4.dex */
final class PixelArtViewKt$PixelArtView$1 extends r implements pc.l<Context, PixelArtView> {
    public static final PixelArtViewKt$PixelArtView$1 INSTANCE = new PixelArtViewKt$PixelArtView$1();

    PixelArtViewKt$PixelArtView$1() {
        super(1);
    }

    @Override // pc.l
    public final PixelArtView invoke(Context context) {
        q.i(context, "context");
        return new PixelArtView(context, null, 0, 6, null);
    }
}
