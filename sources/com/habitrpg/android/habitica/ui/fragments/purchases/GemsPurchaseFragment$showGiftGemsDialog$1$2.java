package com.habitrpg.android.habitica.ui.fragments.purchases;

import com.habitrpg.android.habitica.ui.helpers.KeyboardUtilKt;
import com.habitrpg.android.habitica.ui.views.dialogs.HabiticaAlertDialog;
import dc.w;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GemsPurchaseFragment.kt */
/* loaded from: classes4.dex */
public final class GemsPurchaseFragment$showGiftGemsDialog$1$2 extends qc.r implements pc.p<HabiticaAlertDialog, Integer, w> {
    final /* synthetic */ androidx.fragment.app.q $thisActivity;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GemsPurchaseFragment$showGiftGemsDialog$1$2(androidx.fragment.app.q qVar) {
        super(2);
        this.$thisActivity = qVar;
    }

    @Override // pc.p
    public /* bridge */ /* synthetic */ w invoke(HabiticaAlertDialog habiticaAlertDialog, Integer num) {
        invoke(habiticaAlertDialog, num.intValue());
        return w.f13270a;
    }

    public final void invoke(HabiticaAlertDialog habiticaAlertDialog, int i10) {
        qc.q.i(habiticaAlertDialog, "<anonymous parameter 0>");
        androidx.fragment.app.q qVar = this.$thisActivity;
        qc.q.h(qVar, "$thisActivity");
        KeyboardUtilKt.dismissKeyboard(qVar);
    }
}
