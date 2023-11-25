package com.habitrpg.android.habitica.extensions;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.Window;
import com.habitrpg.android.habitica.R;
import com.habitrpg.common.habitica.extensions.ContextExtensionsKt;
import qc.q;

/* compiled from: WindowExtensions.kt */
/* loaded from: classes4.dex */
public final class WindowExtensionsKt {
    public static final void updateStatusBarColor(Window window, int i10, boolean z10) {
        int i11;
        q.i(window, "<this>");
        if (Build.VERSION.SDK_INT >= 23) {
            window.setStatusBarColor(i10);
            View decorView = window.getDecorView();
            if (z10) {
                i11 = 8192;
            } else {
                i11 = 0;
            }
            decorView.setSystemUiVisibility(i11);
            return;
        }
        Context context = window.getContext();
        q.h(context, "getContext(...)");
        window.setStatusBarColor(ContextExtensionsKt.getThemeColor(context, R.attr.colorPrimaryDark));
    }
}
