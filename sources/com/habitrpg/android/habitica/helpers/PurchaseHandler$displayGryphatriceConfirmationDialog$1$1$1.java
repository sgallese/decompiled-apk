package com.habitrpg.android.habitica.helpers;

import com.habitrpg.android.habitica.ui.activities.BaseActivity;
import com.habitrpg.android.habitica.ui.activities.PurchaseActivity;
import com.habitrpg.android.habitica.ui.views.dialogs.HabiticaAlertDialog;
import dc.w;
import pc.p;
import qc.q;
import qc.r;

/* compiled from: PurchaseHandler.kt */
/* loaded from: classes4.dex */
final class PurchaseHandler$displayGryphatriceConfirmationDialog$1$1$1 extends r implements p<HabiticaAlertDialog, Integer, w> {
    final /* synthetic */ BaseActivity $activity;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PurchaseHandler$displayGryphatriceConfirmationDialog$1$1$1(BaseActivity baseActivity) {
        super(2);
        this.$activity = baseActivity;
    }

    @Override // pc.p
    public /* bridge */ /* synthetic */ w invoke(HabiticaAlertDialog habiticaAlertDialog, Integer num) {
        invoke(habiticaAlertDialog, num.intValue());
        return w.f13270a;
    }

    public final void invoke(HabiticaAlertDialog habiticaAlertDialog, int i10) {
        q.i(habiticaAlertDialog, "dialog");
        habiticaAlertDialog.dismiss();
        BaseActivity baseActivity = this.$activity;
        if (baseActivity instanceof PurchaseActivity) {
            baseActivity.finish();
        }
    }
}
