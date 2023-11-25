package com.habitrpg.android.habitica.ui.fragments.preferences;

import com.habitrpg.android.habitica.ui.helpers.KeyboardUtil;
import com.habitrpg.android.habitica.ui.views.ValidatingEditText;
import com.habitrpg.android.habitica.ui.views.dialogs.HabiticaAlertDialog;
import dc.w;
import pc.p;
import qc.q;
import qc.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AccountPreferenceFragment.kt */
/* loaded from: classes4.dex */
public final class AccountPreferenceFragment$showSingleEntryDialog$1$1 extends r implements p<HabiticaAlertDialog, Integer, w> {
    final /* synthetic */ ValidatingEditText $editText;
    final /* synthetic */ pc.l<String, w> $onChange;
    final /* synthetic */ AccountPreferenceFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AccountPreferenceFragment$showSingleEntryDialog$1$1(AccountPreferenceFragment accountPreferenceFragment, ValidatingEditText validatingEditText, pc.l<? super String, w> lVar) {
        super(2);
        this.this$0 = accountPreferenceFragment;
        this.$editText = validatingEditText;
        this.$onChange = lVar;
    }

    @Override // pc.p
    public /* bridge */ /* synthetic */ w invoke(HabiticaAlertDialog habiticaAlertDialog, Integer num) {
        invoke(habiticaAlertDialog, num.intValue());
        return w.f13270a;
    }

    public final void invoke(HabiticaAlertDialog habiticaAlertDialog, int i10) {
        q.i(habiticaAlertDialog, "dialog");
        KeyboardUtil.Companion.dismissKeyboard(this.this$0.getActivity());
        ValidatingEditText validatingEditText = this.$editText;
        if (validatingEditText != null) {
            ValidatingEditText.showErrorIfNecessary$default(validatingEditText, null, 1, null);
        }
        ValidatingEditText validatingEditText2 = this.$editText;
        if (validatingEditText2 != null && validatingEditText2.isValid()) {
            this.$onChange.invoke(this.$editText.getText());
            habiticaAlertDialog.dismiss();
        }
    }
}
