package com.habitrpg.android.habitica.ui.helpers;

import android.app.Activity;
import android.os.IBinder;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import qc.h;

/* compiled from: KeyboardUtil.kt */
/* loaded from: classes4.dex */
public final class KeyboardUtil {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);

    /* compiled from: KeyboardUtil.kt */
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }

        public final void dismissKeyboard(Activity activity) {
            InputMethodManager inputMethodManager;
            if (activity != null && activity.getCurrentFocus() != null) {
                Object systemService = activity.getSystemService("input_method");
                IBinder iBinder = null;
                if (systemService instanceof InputMethodManager) {
                    inputMethodManager = (InputMethodManager) systemService;
                } else {
                    inputMethodManager = null;
                }
                if (inputMethodManager != null) {
                    View currentFocus = activity.getCurrentFocus();
                    if (currentFocus != null) {
                        iBinder = currentFocus.getWindowToken();
                    }
                    inputMethodManager.hideSoftInputFromWindow(iBinder, 0);
                }
            }
        }
    }
}
