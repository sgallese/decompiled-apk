package com.habitrpg.android.habitica.ui.adapter;

import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.ui.views.dialogs.HabiticaAlertDialog;
import com.habitrpg.common.habitica.helpers.MainNavigationController;
import dc.w;
import pc.p;
import qc.q;
import qc.r;

/* compiled from: CustomizationRecyclerViewAdapter.kt */
/* loaded from: classes4.dex */
final class CustomizationRecyclerViewAdapter$CustomizationViewHolder$onClick$1 extends r implements p<HabiticaAlertDialog, Integer, w> {
    public static final CustomizationRecyclerViewAdapter$CustomizationViewHolder$onClick$1 INSTANCE = new CustomizationRecyclerViewAdapter$CustomizationViewHolder$onClick$1();

    CustomizationRecyclerViewAdapter$CustomizationViewHolder$onClick$1() {
        super(2);
    }

    @Override // pc.p
    public /* bridge */ /* synthetic */ w invoke(HabiticaAlertDialog habiticaAlertDialog, Integer num) {
        invoke(habiticaAlertDialog, num.intValue());
        return w.f13270a;
    }

    public final void invoke(HabiticaAlertDialog habiticaAlertDialog, int i10) {
        q.i(habiticaAlertDialog, "<anonymous parameter 0>");
        MainNavigationController.navigate$default(MainNavigationController.INSTANCE, R.id.timeTravelersShopFragment, null, 2, null);
    }
}
