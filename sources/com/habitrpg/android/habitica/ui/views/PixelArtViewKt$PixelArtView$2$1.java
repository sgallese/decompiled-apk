package com.habitrpg.android.habitica.ui.views;

import com.habitrpg.common.habitica.extensions.DataBindingUtilsKt;
import com.habitrpg.common.habitica.views.PixelArtView;
import dc.w;
import qc.q;
import qc.r;

/* compiled from: PixelArtView.kt */
/* loaded from: classes4.dex */
final class PixelArtViewKt$PixelArtView$2$1 extends r implements pc.l<PixelArtView, w> {
    final /* synthetic */ String $imageFormat;
    final /* synthetic */ String $imageName;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PixelArtViewKt$PixelArtView$2$1(String str, String str2) {
        super(1);
        this.$imageName = str;
        this.$imageFormat = str2;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ w invoke(PixelArtView pixelArtView) {
        invoke2(pixelArtView);
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(PixelArtView pixelArtView) {
        q.i(pixelArtView, "view");
        String str = this.$imageName;
        if (str != null) {
            DataBindingUtilsKt.loadImage(pixelArtView, str, this.$imageFormat);
        } else {
            pixelArtView.setBitmap(null);
        }
    }
}
