package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Build;
import android.text.format.DateUtils;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DateStrings.java */
/* loaded from: classes3.dex */
public class d {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(Context context, long j10, boolean z10, boolean z11, boolean z12) {
        String d10 = d(j10);
        if (z10) {
            d10 = String.format(context.getString(v6.j.f24785u), d10);
        }
        if (z11) {
            return String.format(context.getString(v6.j.f24784t), d10);
        }
        if (z12) {
            return String.format(context.getString(v6.j.f24781q), d10);
        }
        return d10;
    }

    static String b(long j10) {
        return c(j10, Locale.getDefault());
    }

    static String c(long j10, Locale locale) {
        String format;
        if (Build.VERSION.SDK_INT >= 24) {
            format = u.b(locale).format(new Date(j10));
            return format;
        }
        return u.f(locale).format(new Date(j10));
    }

    static String d(long j10) {
        if (i(j10)) {
            return b(j10);
        }
        return g(j10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String e(Context context, int i10) {
        if (u.i().get(1) == i10) {
            return String.format(context.getString(v6.j.f24782r), Integer.valueOf(i10));
        }
        return String.format(context.getString(v6.j.f24783s), Integer.valueOf(i10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String f(long j10) {
        String format;
        if (Build.VERSION.SDK_INT >= 24) {
            format = u.n(Locale.getDefault()).format(new Date(j10));
            return format;
        }
        return DateUtils.formatDateTime(null, j10, 8228);
    }

    static String g(long j10) {
        return h(j10, Locale.getDefault());
    }

    static String h(long j10, Locale locale) {
        String format;
        if (Build.VERSION.SDK_INT >= 24) {
            format = u.m(locale).format(new Date(j10));
            return format;
        }
        return u.f(locale).format(new Date(j10));
    }

    private static boolean i(long j10) {
        Calendar i10 = u.i();
        Calendar k10 = u.k();
        k10.setTimeInMillis(j10);
        if (i10.get(1) == k10.get(1)) {
            return true;
        }
        return false;
    }
}
