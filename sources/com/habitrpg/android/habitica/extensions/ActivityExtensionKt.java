package com.habitrpg.android.habitica.extensions;

import android.app.Activity;
import android.view.inputmethod.InputMethodManager;
import qc.q;

/* compiled from: ActivityExtension.kt */
/* loaded from: classes4.dex */
public final class ActivityExtensionKt {
    public static final void hideKeyboard(Activity activity) {
        q.i(activity, "<this>");
        Object systemService = activity.getSystemService("input_method");
        q.g(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).hideSoftInputFromWindow(activity.getWindow().getDecorView().getWindowToken(), 0);
    }
}
