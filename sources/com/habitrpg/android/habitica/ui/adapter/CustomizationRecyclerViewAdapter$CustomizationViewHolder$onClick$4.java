package com.habitrpg.android.habitica.ui.adapter;

import com.habitrpg.android.habitica.models.inventory.Customization;
import com.habitrpg.android.habitica.ui.adapter.CustomizationRecyclerViewAdapter;
import com.habitrpg.android.habitica.ui.views.dialogs.HabiticaAlertDialog;
import dc.w;
import pc.l;
import pc.p;
import qc.q;
import qc.r;

/* compiled from: CustomizationRecyclerViewAdapter.kt */
/* loaded from: classes4.dex */
final class CustomizationRecyclerViewAdapter$CustomizationViewHolder$onClick$4 extends r implements p<HabiticaAlertDialog, Integer, w> {
    final /* synthetic */ CustomizationRecyclerViewAdapter.CustomizationViewHolder this$0;
    final /* synthetic */ CustomizationRecyclerViewAdapter this$1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomizationRecyclerViewAdapter$CustomizationViewHolder$onClick$4(CustomizationRecyclerViewAdapter.CustomizationViewHolder customizationViewHolder, CustomizationRecyclerViewAdapter customizationRecyclerViewAdapter) {
        super(2);
        this.this$0 = customizationViewHolder;
        this.this$1 = customizationRecyclerViewAdapter;
    }

    @Override // pc.p
    public /* bridge */ /* synthetic */ w invoke(HabiticaAlertDialog habiticaAlertDialog, Integer num) {
        invoke(habiticaAlertDialog, num.intValue());
        return w.f13270a;
    }

    public final void invoke(HabiticaAlertDialog habiticaAlertDialog, int i10) {
        l<Customization, w> onCustomizationSelected;
        q.i(habiticaAlertDialog, "<anonymous parameter 0>");
        Customization customization = this.this$0.getCustomization();
        if (customization == null || (onCustomizationSelected = this.this$1.getOnCustomizationSelected()) == null) {
            return;
        }
        onCustomizationSelected.invoke(customization);
    }
}
