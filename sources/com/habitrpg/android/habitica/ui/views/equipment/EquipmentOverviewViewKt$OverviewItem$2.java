package com.habitrpg.android.habitica.ui.views.equipment;

import androidx.compose.ui.e;
import dc.w;
import j0.l;
import j0.z1;
import pc.p;
import qc.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: EquipmentOverviewView.kt */
/* loaded from: classes4.dex */
public final class EquipmentOverviewViewKt$OverviewItem$2 extends r implements p<l, Integer, w> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ String $iconName;
    final /* synthetic */ boolean $isTwoHanded;
    final /* synthetic */ e $modifier;
    final /* synthetic */ String $text;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EquipmentOverviewViewKt$OverviewItem$2(String str, String str2, e eVar, boolean z10, int i10, int i11) {
        super(2);
        this.$text = str;
        this.$iconName = str2;
        this.$modifier = eVar;
        this.$isTwoHanded = z10;
        this.$$changed = i10;
        this.$$default = i11;
    }

    @Override // pc.p
    public /* bridge */ /* synthetic */ w invoke(l lVar, Integer num) {
        invoke(lVar, num.intValue());
        return w.f13270a;
    }

    public final void invoke(l lVar, int i10) {
        EquipmentOverviewViewKt.OverviewItem(this.$text, this.$iconName, this.$modifier, this.$isTwoHanded, lVar, z1.a(this.$$changed | 1), this.$$default);
    }
}
