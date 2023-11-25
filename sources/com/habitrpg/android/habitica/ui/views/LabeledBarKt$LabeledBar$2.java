package com.habitrpg.android.habitica.ui.views;

import android.graphics.Bitmap;
import dc.w;
import j0.z1;
import pc.p;
import qc.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LabeledBar.kt */
/* loaded from: classes4.dex */
public final class LabeledBarKt$LabeledBar$2 extends r implements p<j0.l, Integer, w> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$default;
    final /* synthetic */ boolean $abbreviateMax;
    final /* synthetic */ boolean $abbreviateValue;
    final /* synthetic */ boolean $animated;
    final /* synthetic */ long $barColor;
    final /* synthetic */ float $barHeight;
    final /* synthetic */ long $color;
    final /* synthetic */ boolean $disabled;
    final /* synthetic */ boolean $displayCompact;
    final /* synthetic */ Bitmap $icon;
    final /* synthetic */ String $label;
    final /* synthetic */ double $maxValue;
    final /* synthetic */ androidx.compose.ui.e $modifier;
    final /* synthetic */ double $value;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LabeledBarKt$LabeledBar$2(androidx.compose.ui.e eVar, Bitmap bitmap, String str, long j10, long j11, double d10, double d11, boolean z10, float f10, boolean z11, boolean z12, boolean z13, boolean z14, int i10, int i11, int i12) {
        super(2);
        this.$modifier = eVar;
        this.$icon = bitmap;
        this.$label = str;
        this.$color = j10;
        this.$barColor = j11;
        this.$value = d10;
        this.$maxValue = d11;
        this.$displayCompact = z10;
        this.$barHeight = f10;
        this.$disabled = z11;
        this.$abbreviateValue = z12;
        this.$abbreviateMax = z13;
        this.$animated = z14;
        this.$$changed = i10;
        this.$$changed1 = i11;
        this.$$default = i12;
    }

    @Override // pc.p
    public /* bridge */ /* synthetic */ w invoke(j0.l lVar, Integer num) {
        invoke(lVar, num.intValue());
        return w.f13270a;
    }

    public final void invoke(j0.l lVar, int i10) {
        LabeledBarKt.m164LabeledBarVOtfePw(this.$modifier, this.$icon, this.$label, this.$color, this.$barColor, this.$value, this.$maxValue, this.$displayCompact, this.$barHeight, this.$disabled, this.$abbreviateValue, this.$abbreviateMax, this.$animated, lVar, z1.a(this.$$changed | 1), z1.a(this.$$changed1), this.$$default);
    }
}
