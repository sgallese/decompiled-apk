package com.habitrpg.android.habitica.ui.views.insufficientCurrency;

import android.content.Context;
import android.os.Bundle;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.extensions.AlertDialogExtensionsKt;
import com.habitrpg.android.habitica.ui.views.HabiticaIconsHelper;
import com.habitrpg.android.habitica.ui.views.dialogs.HabiticaAlertDialog;
import pc.p;
import qc.q;

/* compiled from: InsufficientHourglassesDialog.kt */
/* loaded from: classes4.dex */
public final class InsufficientHourglassesDialog extends InsufficientCurrencyDialog {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InsufficientHourglassesDialog(Context context) {
        super(context);
        q.i(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.habitrpg.android.habitica.ui.views.insufficientCurrency.InsufficientCurrencyDialog, androidx.appcompat.app.c, androidx.appcompat.app.x, androidx.activity.i, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getImageView().setImageBitmap(HabiticaIconsHelper.imageOfHourglassShop());
        getTextView().setText(R.string.insufficientHourglasses);
        HabiticaAlertDialog.addButton$default((HabiticaAlertDialog) this, (int) R.string.get_hourglasses, true, false, false, (p) InsufficientHourglassesDialog$onCreate$1.INSTANCE, 12, (Object) null);
        AlertDialogExtensionsKt.addCloseButton$default(this, false, null, 3, null);
    }
}
