package com.habitrpg.android.habitica.ui.fragments.purchases;

import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.ui.activities.GiftGemsActivity;
import com.habitrpg.android.habitica.ui.views.dialogs.HabiticaAlertDialog;
import dc.w;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GemsPurchaseFragment.kt */
/* loaded from: classes4.dex */
public final class GemsPurchaseFragment$showGiftGemsDialog$1$1 extends qc.r implements pc.p<HabiticaAlertDialog, Integer, w> {
    final /* synthetic */ View $chooseRecipientDialogView;
    final /* synthetic */ androidx.fragment.app.q $thisActivity;
    final /* synthetic */ GemsPurchaseFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GemsPurchaseFragment$showGiftGemsDialog$1$1(View view, androidx.fragment.app.q qVar, GemsPurchaseFragment gemsPurchaseFragment) {
        super(2);
        this.$chooseRecipientDialogView = view;
        this.$thisActivity = qVar;
        this.this$0 = gemsPurchaseFragment;
    }

    @Override // pc.p
    public /* bridge */ /* synthetic */ w invoke(HabiticaAlertDialog habiticaAlertDialog, Integer num) {
        invoke(habiticaAlertDialog, num.intValue());
        return w.f13270a;
    }

    public final void invoke(HabiticaAlertDialog habiticaAlertDialog, int i10) {
        qc.q.i(habiticaAlertDialog, "<anonymous parameter 0>");
        View view = this.$chooseRecipientDialogView;
        View findViewById = view != null ? view.findViewById(R.id.uuidEditText) : null;
        EditText editText = findViewById instanceof EditText ? (EditText) findViewById : null;
        Intent intent = new Intent(this.$thisActivity, GiftGemsActivity.class);
        intent.putExtra("username", String.valueOf(editText != null ? editText.getText() : null));
        this.this$0.startActivity(intent);
    }
}
