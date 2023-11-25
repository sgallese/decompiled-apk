package com.habitrpg.android.habitica.ui.views.insufficientCurrency;

import androidx.core.os.e;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.ui.views.dialogs.HabiticaAlertDialog;
import com.habitrpg.common.habitica.helpers.MainNavigationController;
import dc.l;
import dc.w;
import pc.p;
import qc.q;
import qc.r;

/* compiled from: InsufficientHourglassesDialog.kt */
/* loaded from: classes4.dex */
final class InsufficientHourglassesDialog$onCreate$1 extends r implements p<HabiticaAlertDialog, Integer, w> {
    public static final InsufficientHourglassesDialog$onCreate$1 INSTANCE = new InsufficientHourglassesDialog$onCreate$1();

    InsufficientHourglassesDialog$onCreate$1() {
        super(2);
    }

    @Override // pc.p
    public /* bridge */ /* synthetic */ w invoke(HabiticaAlertDialog habiticaAlertDialog, Integer num) {
        invoke(habiticaAlertDialog, num.intValue());
        return w.f13270a;
    }

    public final void invoke(HabiticaAlertDialog habiticaAlertDialog, int i10) {
        q.i(habiticaAlertDialog, "<anonymous parameter 0>");
        MainNavigationController.INSTANCE.navigate(R.id.gemPurchaseActivity, e.a(new l("openSubscription", Boolean.TRUE)));
    }
}
