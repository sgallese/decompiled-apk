package com.habitrpg.android.habitica.ui.views.equipment;

import com.habitrpg.android.habitica.models.user.Outfit;
import dc.w;
import pc.a;
import pc.p;
import qc.r;

/* compiled from: EquipmentOverviewView.kt */
/* loaded from: classes4.dex */
final class EquipmentOverviewViewKt$EquipmentOverviewView$1$1$8 extends r implements a<w> {
    final /* synthetic */ p<String, String, w> $onEquipmentTap;
    final /* synthetic */ Outfit $outfit;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public EquipmentOverviewViewKt$EquipmentOverviewView$1$1$8(p<? super String, ? super String, w> pVar, Outfit outfit) {
        super(0);
        this.$onEquipmentTap = pVar;
        this.$outfit = outfit;
    }

    @Override // pc.a
    public /* bridge */ /* synthetic */ w invoke() {
        invoke2();
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        p<String, String, w> pVar = this.$onEquipmentTap;
        Outfit outfit = this.$outfit;
        pVar.invoke("armor", outfit != null ? outfit.getArmor() : null);
    }
}
