package com.habitrpg.android.habitica.ui.views.insufficientCurrency;

import ad.a1;
import ad.i;
import ad.l0;
import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.extensions.AlertDialogExtensionsKt;
import com.habitrpg.android.habitica.helpers.AppConfigManager;
import com.habitrpg.android.habitica.helpers.PurchaseHandler;
import com.habitrpg.android.habitica.helpers.PurchaseTypes;
import com.habitrpg.android.habitica.interactors.InsufficientGemsUseCase;
import com.habitrpg.android.habitica.ui.views.dialogs.HabiticaAlertDialog;
import pc.p;
import qc.q;
import sa.b;

/* compiled from: InsufficientGemsDialog.kt */
/* loaded from: classes4.dex */
public final class InsufficientGemsDialog extends InsufficientCurrencyDialog {
    public static final int $stable = 8;
    public AppConfigManager configManager;
    private int gemPrice;
    private InsufficientGemsUseCase insufficientGemsUseCase;
    private final Activity parentActivity;
    public PurchaseHandler purchaseHandler;

    /* compiled from: InsufficientGemsDialog.kt */
    /* loaded from: classes4.dex */
    public interface InsufficientGemsDialogEntryPoint {
        AppConfigManager configManager();

        InsufficientGemsUseCase insufficientGemsUseCase();

        PurchaseHandler purchaseHandler();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InsufficientGemsDialog(Activity activity, int i10) {
        super(activity);
        q.i(activity, "parentActivity");
        this.parentActivity = activity;
        this.gemPrice = i10;
        InsufficientGemsDialogEntryPoint insufficientGemsDialogEntryPoint = (InsufficientGemsDialogEntryPoint) b.a(activity, InsufficientGemsDialogEntryPoint.class);
        this.insufficientGemsUseCase = insufficientGemsDialogEntryPoint.insufficientGemsUseCase();
        setConfigManager(insufficientGemsDialogEntryPoint.configManager());
        setPurchaseHandler(insufficientGemsDialogEntryPoint.purchaseHandler());
    }

    public final AppConfigManager getConfigManager() {
        AppConfigManager appConfigManager = this.configManager;
        if (appConfigManager != null) {
            return appConfigManager;
        }
        q.z("configManager");
        return null;
    }

    public final int getGemPrice() {
        return this.gemPrice;
    }

    public final InsufficientGemsUseCase getInsufficientGemsUseCase() {
        return this.insufficientGemsUseCase;
    }

    @Override // com.habitrpg.android.habitica.ui.views.insufficientCurrency.InsufficientCurrencyDialog
    public int getLayoutID() {
        return R.layout.dialog_insufficient_gems;
    }

    public final Activity getParentActivity() {
        return this.parentActivity;
    }

    public final PurchaseHandler getPurchaseHandler() {
        PurchaseHandler purchaseHandler = this.purchaseHandler;
        if (purchaseHandler != null) {
            return purchaseHandler;
        }
        q.z("purchaseHandler");
        return null;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        String str;
        super.onAttachedToWindow();
        TextView textView = (TextView) m167getContentView().findViewById(R.id.purchase_textview);
        Button button = (Button) m167getContentView().findViewById(R.id.purchase_button);
        getPurchaseHandler().startListening();
        if (this.gemPrice > 4) {
            textView.setText("21");
            str = PurchaseTypes.Purchase21Gems;
        } else {
            textView.setText("4");
            str = PurchaseTypes.Purchase4Gems;
        }
        i.d(l0.a(a1.b()), null, null, new InsufficientGemsDialog$onAttachedToWindow$1(this, str, button, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.habitrpg.android.habitica.ui.views.insufficientCurrency.InsufficientCurrencyDialog, androidx.appcompat.app.c, androidx.appcompat.app.x, androidx.activity.i, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getTextView().setText(R.string.insufficientGems);
        HabiticaAlertDialog.addButton$default((HabiticaAlertDialog) this, (int) R.string.see_other_options, true, false, false, (p) InsufficientGemsDialog$onCreate$1.INSTANCE, 12, (Object) null);
        AlertDialogExtensionsKt.addCloseButton$default(this, false, null, 3, null);
        m167getContentView().setPadding(0, 0, 0, 0);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        getPurchaseHandler().stopListening();
        super.onDetachedFromWindow();
    }

    public final void setConfigManager(AppConfigManager appConfigManager) {
        q.i(appConfigManager, "<set-?>");
        this.configManager = appConfigManager;
    }

    public final void setGemPrice(int i10) {
        this.gemPrice = i10;
    }

    public final void setInsufficientGemsUseCase(InsufficientGemsUseCase insufficientGemsUseCase) {
        q.i(insufficientGemsUseCase, "<set-?>");
        this.insufficientGemsUseCase = insufficientGemsUseCase;
    }

    public final void setPurchaseHandler(PurchaseHandler purchaseHandler) {
        q.i(purchaseHandler, "<set-?>");
        this.purchaseHandler = purchaseHandler;
    }
}
