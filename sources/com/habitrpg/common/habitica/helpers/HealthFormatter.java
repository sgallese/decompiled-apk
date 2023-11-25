package com.habitrpg.common.habitica.helpers;

import android.os.Build;
import java.text.NumberFormat;
import java.util.Locale;
import qc.q;

/* compiled from: HealthFormatter.kt */
/* loaded from: classes4.dex */
public final class HealthFormatter {
    public static final HealthFormatter INSTANCE = new HealthFormatter();

    private HealthFormatter() {
    }

    public static final String formatToString(double d10) {
        return formatToString$default(d10, null, 2, null);
    }

    public static /* synthetic */ String formatToString$default(HealthFormatter healthFormatter, int i10, Locale locale, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            locale = healthFormatter.getDefaultLocale();
            q.h(locale, "getDefaultLocale(...)");
        }
        return healthFormatter.formatToString(i10, locale);
    }

    private final Locale getDefaultLocale() {
        Locale.Category category;
        Locale locale;
        if (Build.VERSION.SDK_INT >= 24) {
            category = Locale.Category.FORMAT;
            locale = Locale.getDefault(category);
            return locale;
        }
        return Locale.getDefault();
    }

    public final double format(int i10) {
        return format(i10);
    }

    public static final double format(double d10) {
        if (d10 < 1.0d && d10 > 0.0d) {
            double d11 = 10;
            return Math.ceil(d10 * d11) / d11;
        }
        return Math.floor(d10);
    }

    public static /* synthetic */ String formatToString$default(double d10, Locale locale, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            locale = INSTANCE.getDefaultLocale();
            q.h(locale, "getDefaultLocale(...)");
        }
        return formatToString(d10, locale);
    }

    public final String formatToString(int i10, Locale locale) {
        q.i(locale, "locale");
        return formatToString(i10, locale);
    }

    public static final String formatToString(double d10, Locale locale) {
        q.i(locale, "locale");
        double format = format(d10);
        NumberFormat numberFormat = NumberFormat.getInstance(locale);
        numberFormat.setMaximumFractionDigits(1);
        String format2 = numberFormat.format(format);
        q.h(format2, "format(...)");
        return format2;
    }
}
