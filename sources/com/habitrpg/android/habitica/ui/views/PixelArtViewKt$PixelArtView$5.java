package com.habitrpg.android.habitica.ui.views;

import a1.l0;
import a1.t3;
import com.habitrpg.common.habitica.views.PixelArtView;
import dc.w;
import qc.q;
import qc.r;

/* compiled from: PixelArtView.kt */
/* loaded from: classes4.dex */
final class PixelArtViewKt$PixelArtView$5 extends r implements pc.l<PixelArtView, w> {
    final /* synthetic */ t3 $bitmap;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PixelArtViewKt$PixelArtView$5(t3 t3Var) {
        super(1);
        this.$bitmap = t3Var;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ w invoke(PixelArtView pixelArtView) {
        invoke2(pixelArtView);
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(PixelArtView pixelArtView) {
        q.i(pixelArtView, "view");
        pixelArtView.setBitmap(l0.b(this.$bitmap));
    }
}
