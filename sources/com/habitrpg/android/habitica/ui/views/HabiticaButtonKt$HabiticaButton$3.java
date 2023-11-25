package com.habitrpg.android.habitica.ui.views;

import dc.w;
import j0.z1;
import pc.p;
import qc.r;
import w.s;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: HabiticaButton.kt */
/* loaded from: classes4.dex */
public final class HabiticaButtonKt$HabiticaButton$3 extends r implements p<j0.l, Integer, w> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ long $background;
    final /* synthetic */ long $color;
    final /* synthetic */ p<j0.l, Integer, w> $content;
    final /* synthetic */ s $contentPadding;
    final /* synthetic */ long $fontSize;
    final /* synthetic */ androidx.compose.ui.e $modifier;
    final /* synthetic */ pc.a<w> $onClick;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HabiticaButtonKt$HabiticaButton$3(long j10, long j11, pc.a<w> aVar, androidx.compose.ui.e eVar, s sVar, long j12, p<? super j0.l, ? super Integer, w> pVar, int i10, int i11) {
        super(2);
        this.$background = j10;
        this.$color = j11;
        this.$onClick = aVar;
        this.$modifier = eVar;
        this.$contentPadding = sVar;
        this.$fontSize = j12;
        this.$content = pVar;
        this.$$changed = i10;
        this.$$default = i11;
    }

    @Override // pc.p
    public /* bridge */ /* synthetic */ w invoke(j0.l lVar, Integer num) {
        invoke(lVar, num.intValue());
        return w.f13270a;
    }

    public final void invoke(j0.l lVar, int i10) {
        HabiticaButtonKt.m163HabiticaButtonsucejHM(this.$background, this.$color, this.$onClick, this.$modifier, this.$contentPadding, this.$fontSize, this.$content, lVar, z1.a(this.$$changed | 1), this.$$default);
    }
}
