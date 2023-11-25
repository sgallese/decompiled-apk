package com.habitrpg.android.habitica.ui.views.equipment;

import androidx.compose.ui.e;
import com.habitrpg.android.habitica.models.user.Outfit;
import dc.w;
import j0.l;
import j0.z1;
import pc.p;
import qc.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: EquipmentOverviewView.kt */
/* loaded from: classes4.dex */
public final class EquipmentOverviewViewKt$EquipmentOverviewView$2 extends r implements p<l, Integer, w> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ boolean $isUsingTwohanded;
    final /* synthetic */ e $modifier;
    final /* synthetic */ p<String, String, w> $onEquipmentTap;
    final /* synthetic */ Outfit $outfit;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public EquipmentOverviewViewKt$EquipmentOverviewView$2(Outfit outfit, boolean z10, p<? super String, ? super String, w> pVar, e eVar, int i10, int i11) {
        super(2);
        this.$outfit = outfit;
        this.$isUsingTwohanded = z10;
        this.$onEquipmentTap = pVar;
        this.$modifier = eVar;
        this.$$changed = i10;
        this.$$default = i11;
    }

    @Override // pc.p
    public /* bridge */ /* synthetic */ w invoke(l lVar, Integer num) {
        invoke(lVar, num.intValue());
        return w.f13270a;
    }

    public final void invoke(l lVar, int i10) {
        EquipmentOverviewViewKt.EquipmentOverviewView(this.$outfit, this.$isUsingTwohanded, this.$onEquipmentTap, this.$modifier, lVar, z1.a(this.$$changed | 1), this.$$default);
    }
}
