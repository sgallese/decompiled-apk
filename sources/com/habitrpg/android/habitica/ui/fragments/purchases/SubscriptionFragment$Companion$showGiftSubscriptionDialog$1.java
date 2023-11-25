package com.habitrpg.android.habitica.ui.fragments.purchases;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.ui.activities.GiftSubscriptionActivity;
import com.habitrpg.android.habitica.ui.views.dialogs.HabiticaAlertDialog;
import dc.w;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SubscriptionFragment.kt */
/* loaded from: classes4.dex */
public final class SubscriptionFragment$Companion$showGiftSubscriptionDialog$1 extends qc.r implements pc.p<HabiticaAlertDialog, Integer, w> {
    final /* synthetic */ View $chooseRecipientDialogView;
    final /* synthetic */ Context $context;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubscriptionFragment$Companion$showGiftSubscriptionDialog$1(View view, Context context) {
        super(2);
        this.$chooseRecipientDialogView = view;
        this.$context = context;
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
        Intent intent = new Intent(this.$context, GiftSubscriptionActivity.class);
        intent.putExtra("username", String.valueOf(editText != null ? editText.getText() : null));
        this.$context.startActivity(intent);
    }
}
