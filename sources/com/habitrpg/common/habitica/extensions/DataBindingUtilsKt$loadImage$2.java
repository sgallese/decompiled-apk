package com.habitrpg.common.habitica.extensions;

import com.habitrpg.common.habitica.views.PixelArtView;
import dc.w;
import qc.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DataBindingUtils.kt */
/* loaded from: classes4.dex */
public final class DataBindingUtilsKt$loadImage$2 extends r implements pc.a<w> {
    final /* synthetic */ PixelArtView $this_loadImage;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataBindingUtilsKt$loadImage$2(PixelArtView pixelArtView) {
        super(0);
        this.$this_loadImage = pixelArtView;
    }

    @Override // pc.a
    public /* bridge */ /* synthetic */ w invoke() {
        invoke2();
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$this_loadImage.setTag(null);
        this.$this_loadImage.setImageDrawable(null);
        this.$this_loadImage.setBitmap(null);
    }
}
