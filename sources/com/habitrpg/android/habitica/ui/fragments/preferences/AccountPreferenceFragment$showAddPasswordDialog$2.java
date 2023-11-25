package com.habitrpg.android.habitica.ui.fragments.preferences;

import qc.r;

/* compiled from: AccountPreferenceFragment.kt */
/* loaded from: classes4.dex */
final class AccountPreferenceFragment$showAddPasswordDialog$2 extends r implements pc.l<String, Boolean> {
    public static final AccountPreferenceFragment$showAddPasswordDialog$2 INSTANCE = new AccountPreferenceFragment$showAddPasswordDialog$2();

    AccountPreferenceFragment$showAddPasswordDialog$2() {
        super(1);
    }

    @Override // pc.l
    public final Boolean invoke(String str) {
        return Boolean.valueOf((str != null ? str.length() : 0) >= 8);
    }
}
