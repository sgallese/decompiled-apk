package com.habitrpg.android.habitica.ui.views;

import a1.t3;
import dc.w;
import j0.z1;
import pc.p;
import qc.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PixelArtView.kt */
/* loaded from: classes4.dex */
public final class PixelArtViewKt$PixelArtView$6 extends r implements p<j0.l, Integer, w> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ t3 $bitmap;
    final /* synthetic */ androidx.compose.ui.e $modifier;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PixelArtViewKt$PixelArtView$6(t3 t3Var, androidx.compose.ui.e eVar, int i10, int i11) {
        super(2);
        this.$bitmap = t3Var;
        this.$modifier = eVar;
        this.$$changed = i10;
        this.$$default = i11;
    }

    @Override // pc.p
    public /* bridge */ /* synthetic */ w invoke(j0.l lVar, Integer num) {
        invoke(lVar, num.intValue());
        return w.f13270a;
    }

    public final void invoke(j0.l lVar, int i10) {
        PixelArtViewKt.PixelArtView(this.$bitmap, this.$modifier, lVar, z1.a(this.$$changed | 1), this.$$default);
    }
}
