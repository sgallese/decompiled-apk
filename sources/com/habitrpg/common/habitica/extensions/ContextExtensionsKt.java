package com.habitrpg.common.habitica.extensions;

import android.content.Context;
import android.content.res.Configuration;
import android.util.TypedValue;
import android.view.LayoutInflater;
import java.util.Locale;
import qc.q;

/* compiled from: ContextExtensions.kt */
/* loaded from: classes4.dex */
public final class ContextExtensionsKt {
    public static final Context forceLocale(Context context, Locale locale) {
        q.i(context, "<this>");
        q.i(locale, "locale");
        Locale.setDefault(locale);
        Configuration configuration = new Configuration(context.getResources().getConfiguration());
        configuration.setLocale(locale);
        Context createConfigurationContext = context.createConfigurationContext(configuration);
        q.h(createConfigurationContext, "createConfigurationContext(...)");
        return createConfigurationContext;
    }

    public static final LayoutInflater getLayoutInflater(Context context) {
        q.i(context, "<this>");
        Object systemService = context.getSystemService("layout_inflater");
        q.g(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        return (LayoutInflater) systemService;
    }

    public static final int getThemeColor(Context context, int i10) {
        q.i(context, "<this>");
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i10, typedValue, true);
        return typedValue.data;
    }

    public static final boolean isUsingNightModeResources(Context context) {
        q.i(context, "<this>");
        int i10 = context.getResources().getConfiguration().uiMode & 48;
        if (i10 == 0 || i10 == 16 || i10 != 32) {
            return false;
        }
        return true;
    }
}
