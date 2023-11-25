package com.habitrpg.android.habitica.ui.fragments.social;

import com.habitrpg.android.habitica.ui.activities.MainActivity;
import com.habitrpg.android.habitica.ui.helpers.KeyboardUtilKt;
import com.habitrpg.android.habitica.ui.views.dialogs.HabiticaAlertDialog;
import dc.w;
import pc.p;
import qc.q;
import qc.r;

/* compiled from: InboxOverviewFragment.kt */
/* loaded from: classes4.dex */
final class InboxOverviewFragment$openNewMessageDialog$1$2 extends r implements p<HabiticaAlertDialog, Integer, w> {
    final /* synthetic */ MainActivity $thisActivity;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InboxOverviewFragment$openNewMessageDialog$1$2(MainActivity mainActivity) {
        super(2);
        this.$thisActivity = mainActivity;
    }

    @Override // pc.p
    public /* bridge */ /* synthetic */ w invoke(HabiticaAlertDialog habiticaAlertDialog, Integer num) {
        invoke(habiticaAlertDialog, num.intValue());
        return w.f13270a;
    }

    public final void invoke(HabiticaAlertDialog habiticaAlertDialog, int i10) {
        q.i(habiticaAlertDialog, "<anonymous parameter 0>");
        KeyboardUtilKt.dismissKeyboard(this.$thisActivity);
    }
}
