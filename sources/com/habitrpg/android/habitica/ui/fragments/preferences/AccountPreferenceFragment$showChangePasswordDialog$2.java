package com.habitrpg.android.habitica.ui.fragments.preferences;

import com.habitrpg.android.habitica.ui.views.ValidatingEditText;
import qc.q;
import qc.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AccountPreferenceFragment.kt */
/* loaded from: classes4.dex */
public final class AccountPreferenceFragment$showChangePasswordDialog$2 extends r implements pc.l<String, Boolean> {
    final /* synthetic */ ValidatingEditText $passwordEditText;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountPreferenceFragment$showChangePasswordDialog$2(ValidatingEditText validatingEditText) {
        super(1);
        this.$passwordEditText = validatingEditText;
    }

    @Override // pc.l
    public final Boolean invoke(String str) {
        ValidatingEditText validatingEditText = this.$passwordEditText;
        return Boolean.valueOf(q.d(str, validatingEditText != null ? validatingEditText.getText() : null));
    }
}
