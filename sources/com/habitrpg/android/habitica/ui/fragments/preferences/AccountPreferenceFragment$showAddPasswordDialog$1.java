package com.habitrpg.android.habitica.ui.fragments.preferences;

import java.util.regex.Pattern;
import qc.r;

/* compiled from: AccountPreferenceFragment.kt */
/* loaded from: classes4.dex */
final class AccountPreferenceFragment$showAddPasswordDialog$1 extends r implements pc.l<String, Boolean> {
    public static final AccountPreferenceFragment$showAddPasswordDialog$1 INSTANCE = new AccountPreferenceFragment$showAddPasswordDialog$1();

    AccountPreferenceFragment$showAddPasswordDialog$1() {
        super(1);
    }

    @Override // pc.l
    public final Boolean invoke(String str) {
        Pattern pattern = androidx.core.util.e.f4059j;
        if (str == null) {
            str = "";
        }
        return Boolean.valueOf(pattern.matcher(str).matches());
    }
}
