package com.habitrpg.android.habitica.ui.adapter;

import androidx.core.os.e;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.models.inventory.Equipment;
import com.habitrpg.android.habitica.ui.adapter.CustomizationEquipmentRecyclerViewAdapter;
import com.habitrpg.android.habitica.ui.views.dialogs.HabiticaAlertDialog;
import com.habitrpg.common.habitica.helpers.MainNavigationController;
import dc.w;
import pc.l;
import pc.p;
import qc.q;
import qc.r;

/* compiled from: CustomizationEquipmentRecyclerViewAdapter.kt */
/* loaded from: classes4.dex */
final class CustomizationEquipmentRecyclerViewAdapter$EquipmentViewHolder$onClick$1 extends r implements p<HabiticaAlertDialog, Integer, w> {
    final /* synthetic */ Double $itemValue;
    final /* synthetic */ CustomizationEquipmentRecyclerViewAdapter this$0;
    final /* synthetic */ CustomizationEquipmentRecyclerViewAdapter.EquipmentViewHolder this$1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomizationEquipmentRecyclerViewAdapter$EquipmentViewHolder$onClick$1(CustomizationEquipmentRecyclerViewAdapter customizationEquipmentRecyclerViewAdapter, CustomizationEquipmentRecyclerViewAdapter.EquipmentViewHolder equipmentViewHolder, Double d10) {
        super(2);
        this.this$0 = customizationEquipmentRecyclerViewAdapter;
        this.this$1 = equipmentViewHolder;
        this.$itemValue = d10;
    }

    @Override // pc.p
    public /* bridge */ /* synthetic */ w invoke(HabiticaAlertDialog habiticaAlertDialog, Integer num) {
        invoke(habiticaAlertDialog, num.intValue());
        return w.f13270a;
    }

    public final void invoke(HabiticaAlertDialog habiticaAlertDialog, int i10) {
        l<Equipment, w> onUnlock;
        q.i(habiticaAlertDialog, "<anonymous parameter 0>");
        if (this.this$0.getGemBalance() != null) {
            Double d10 = this.$itemValue;
            if ((d10 != null ? d10.doubleValue() : 0.0d) > r4.intValue()) {
                MainNavigationController.INSTANCE.navigate(R.id.gemPurchaseActivity, e.a(new dc.l("openSubscription", Boolean.FALSE)));
                return;
            }
        }
        Equipment equipment = this.this$1.getEquipment();
        if (equipment == null || (onUnlock = this.this$0.getOnUnlock()) == null) {
            return;
        }
        onUnlock.invoke(equipment);
    }
}
