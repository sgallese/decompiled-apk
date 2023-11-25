package com.habitrpg.android.habitica.ui.views.progress;

import androidx.compose.ui.e;
import dc.w;
import j0.l;
import j0.z1;
import pc.p;
import qc.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: HabiticaCircularProgressView.kt */
/* loaded from: classes4.dex */
public final class HabiticaCircularProgressViewKt$HabiticaCircularProgressView$3 extends r implements p<l, Integer, w> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ boolean $animate;
    final /* synthetic */ int $animationDuration;
    final /* synthetic */ float $indicatorSize;
    final /* synthetic */ e $modifier;
    final /* synthetic */ float $partialDisplay;
    final /* synthetic */ float $strokeWidth;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HabiticaCircularProgressViewKt$HabiticaCircularProgressView$3(e eVar, float f10, boolean z10, float f11, int i10, float f12, int i11, int i12) {
        super(2);
        this.$modifier = eVar;
        this.$partialDisplay = f10;
        this.$animate = z10;
        this.$indicatorSize = f11;
        this.$animationDuration = i10;
        this.$strokeWidth = f12;
        this.$$changed = i11;
        this.$$default = i12;
    }

    @Override // pc.p
    public /* bridge */ /* synthetic */ w invoke(l lVar, Integer num) {
        invoke(lVar, num.intValue());
        return w.f13270a;
    }

    public final void invoke(l lVar, int i10) {
        HabiticaCircularProgressViewKt.m171HabiticaCircularProgressViewQuyCDyQ(this.$modifier, this.$partialDisplay, this.$animate, this.$indicatorSize, this.$animationDuration, this.$strokeWidth, lVar, z1.a(this.$$changed | 1), this.$$default);
    }
}
