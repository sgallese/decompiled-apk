package com.habitrpg.android.habitica.ui.fragments.preferences;

import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.ui.views.dialogs.HabiticaAlertDialog;
import com.habitrpg.common.habitica.helpers.MainNavigationController;
import dc.w;
import pc.p;
import qc.q;
import qc.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AccountPreferenceFragment.kt */
/* loaded from: classes4.dex */
public final class AccountPreferenceFragment$showAccountDeleteConfirmation$1 extends r implements p<HabiticaAlertDialog, Integer, w> {
    public static final AccountPreferenceFragment$showAccountDeleteConfirmation$1 INSTANCE = new AccountPreferenceFragment$showAccountDeleteConfirmation$1();

    AccountPreferenceFragment$showAccountDeleteConfirmation$1() {
        super(2);
    }

    @Override // pc.p
    public /* bridge */ /* synthetic */ w invoke(HabiticaAlertDialog habiticaAlertDialog, Integer num) {
        invoke(habiticaAlertDialog, num.intValue());
        return w.f13270a;
    }

    public final void invoke(HabiticaAlertDialog habiticaAlertDialog, int i10) {
        q.i(habiticaAlertDialog, "<anonymous parameter 0>");
        MainNavigationController.navigate$default(MainNavigationController.INSTANCE, R.id.subscriptionPurchaseActivity, null, 2, null);
    }
}
