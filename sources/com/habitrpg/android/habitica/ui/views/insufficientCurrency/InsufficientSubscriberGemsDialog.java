package com.habitrpg.android.habitica.ui.views.insufficientCurrency;

import android.content.Context;
import android.os.Bundle;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.ui.views.dialogs.HabiticaAlertDialog;
import pc.p;
import qc.q;

/* compiled from: InsufficientSubscriberGemsDialog.kt */
/* loaded from: classes4.dex */
public final class InsufficientSubscriberGemsDialog extends InsufficientCurrencyDialog {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InsufficientSubscriberGemsDialog(Context context) {
        super(context);
        q.i(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.habitrpg.android.habitica.ui.views.insufficientCurrency.InsufficientCurrencyDialog, androidx.appcompat.app.c, androidx.appcompat.app.x, androidx.activity.i, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getImageView().setImageResource(R.drawable.subscriber_gem_cap);
        getTextView().setText(getContext().getString(R.string.insufficientSubscriberGems));
        HabiticaAlertDialog.addButton$default((HabiticaAlertDialog) this, (int) R.string.take_me_back, true, false, false, (p) null, 28, (Object) null);
    }
}
