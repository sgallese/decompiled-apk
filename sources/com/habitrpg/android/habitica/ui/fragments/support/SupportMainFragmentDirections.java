package com.habitrpg.android.habitica.ui.fragments.support;

import com.habitrpg.android.habitica.MainNavDirections;
import com.habitrpg.android.habitica.R;

/* loaded from: classes4.dex */
public class SupportMainFragmentDirections {
    private SupportMainFragmentDirections() {
    }

    public static MainNavDirections.ActionGlobalClassSelectionActivity actionGlobalClassSelectionActivity() {
        return MainNavDirections.actionGlobalClassSelectionActivity();
    }

    public static MainNavDirections.ActionGlobalReportMessageActivity actionGlobalReportMessageActivity(String str, String str2, String str3, String str4) {
        return MainNavDirections.actionGlobalReportMessageActivity(str, str2, str3, str4);
    }

    public static MainNavDirections.OpenArmoireActivity openArmoireActivity(String str, String str2, String str3, String str4) {
        return MainNavDirections.openArmoireActivity(str, str2, str3, str4);
    }

    public static MainNavDirections.OpenProfileActivity openProfileActivity(String str) {
        return MainNavDirections.openProfileActivity(str);
    }

    public static k3.k showFAQFragment() {
        return new k3.a(R.id.showFAQFragment);
    }
}
