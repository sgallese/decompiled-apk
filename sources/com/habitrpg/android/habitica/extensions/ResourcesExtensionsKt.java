package com.habitrpg.android.habitica.extensions;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import com.habitrpg.android.habitica.ui.activities.BaseActivity;
import java.util.Locale;
import qc.q;

/* compiled from: ResourcesExtensions.kt */
/* loaded from: classes4.dex */
public final class ResourcesExtensionsKt {
    public static final void forceLocale(Resources resources, BaseActivity baseActivity, Locale locale) {
        q.i(resources, "<this>");
        q.i(baseActivity, "activity");
        q.i(locale, "locale");
        Locale.setDefault(locale);
        Configuration configuration = new Configuration();
        configuration.setLocale(locale);
        if (Build.VERSION.SDK_INT >= 24) {
            baseActivity.createConfigurationContext(configuration);
        }
        resources.updateConfiguration(configuration, resources.getDisplayMetrics());
        y8.a.a(p9.a.f21284a).f("language", locale.toLanguageTag());
    }
}
