package com.habitrpg.android.habitica.ui.adapter;

import com.habitrpg.android.habitica.ui.views.dialogs.HabiticaAlertDialog;
import dc.w;
import pc.p;
import qc.q;
import qc.r;

/* compiled from: CustomizationRecyclerViewAdapter.kt */
/* loaded from: classes4.dex */
final class CustomizationRecyclerViewAdapter$CustomizationViewHolder$onClick$5 extends r implements p<HabiticaAlertDialog, Integer, w> {
    final /* synthetic */ HabiticaAlertDialog $alert;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomizationRecyclerViewAdapter$CustomizationViewHolder$onClick$5(HabiticaAlertDialog habiticaAlertDialog) {
        super(2);
        this.$alert = habiticaAlertDialog;
    }

    @Override // pc.p
    public /* bridge */ /* synthetic */ w invoke(HabiticaAlertDialog habiticaAlertDialog, Integer num) {
        invoke(habiticaAlertDialog, num.intValue());
        return w.f13270a;
    }

    public final void invoke(HabiticaAlertDialog habiticaAlertDialog, int i10) {
        q.i(habiticaAlertDialog, "<anonymous parameter 0>");
        this.$alert.dismiss();
    }
}
