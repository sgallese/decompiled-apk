package com.habitrpg.android.habitica.ui.fragments.preferences;

import qc.r;

/* compiled from: AccountPreferenceFragment.kt */
/* loaded from: classes4.dex */
final class AccountPreferenceFragment$showChangePasswordDialog$1 extends r implements pc.l<String, Boolean> {
    public static final AccountPreferenceFragment$showChangePasswordDialog$1 INSTANCE = new AccountPreferenceFragment$showChangePasswordDialog$1();

    AccountPreferenceFragment$showChangePasswordDialog$1() {
        super(1);
    }

    @Override // pc.l
    public final Boolean invoke(String str) {
        return Boolean.valueOf((str != null ? str.length() : 0) >= 8);
    }
}
