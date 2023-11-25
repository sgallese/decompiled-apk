package com.habitrpg.android.habitica.data.implementation;

import com.habitrpg.android.habitica.models.inventory.Equipment;
import dc.w;
import io.realm.o0;
import pc.l;
import qc.q;
import qc.r;

/* compiled from: InventoryRepositoryImpl.kt */
/* loaded from: classes4.dex */
final class InventoryRepositoryImpl$openMysteryItem$2 extends r implements l<o0, w> {
    final /* synthetic */ Equipment $liveEquipment;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InventoryRepositoryImpl$openMysteryItem$2(Equipment equipment) {
        super(1);
        this.$liveEquipment = equipment;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ w invoke(o0 o0Var) {
        invoke2(o0Var);
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(o0 o0Var) {
        q.i(o0Var, "it");
        Equipment equipment = this.$liveEquipment;
        if (equipment == null) {
            return;
        }
        equipment.setOwned(Boolean.TRUE);
    }
}
