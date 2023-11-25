package com.google.android.material.datepicker;

import android.annotation.TargetApi;
import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import j$.util.DesugarTimeZone;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: UtcDates.java */
/* loaded from: classes3.dex */
public class u {

    /* renamed from: a  reason: collision with root package name */
    static AtomicReference<o> f9998a = new AtomicReference<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long a(long j10) {
        Calendar k10 = k();
        k10.setTimeInMillis(j10);
        return d(k10).getTimeInMillis();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @TargetApi(24)
    public static DateFormat b(Locale locale) {
        return c("MMMEd", locale);
    }

    @TargetApi(24)
    private static DateFormat c(String str, Locale locale) {
        DateFormat instanceForSkeleton;
        DisplayContext displayContext;
        instanceForSkeleton = DateFormat.getInstanceForSkeleton(str, locale);
        instanceForSkeleton.setTimeZone(j());
        displayContext = DisplayContext.CAPITALIZATION_FOR_STANDALONE;
        instanceForSkeleton.setContext(displayContext);
        return instanceForSkeleton;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Calendar d(Calendar calendar) {
        Calendar l10 = l(calendar);
        Calendar k10 = k();
        k10.set(l10.get(1), l10.get(2), l10.get(5));
        return k10;
    }

    private static java.text.DateFormat e(int i10, Locale locale) {
        java.text.DateFormat dateInstance = java.text.DateFormat.getDateInstance(i10, locale);
        dateInstance.setTimeZone(h());
        return dateInstance;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static java.text.DateFormat f(Locale locale) {
        return e(0, locale);
    }

    static o g() {
        o oVar = f9998a.get();
        if (oVar == null) {
            return o.c();
        }
        return oVar;
    }

    private static TimeZone h() {
        return DesugarTimeZone.getTimeZone("UTC");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Calendar i() {
        Calendar a10 = g().a();
        a10.set(11, 0);
        a10.set(12, 0);
        a10.set(13, 0);
        a10.set(14, 0);
        a10.setTimeZone(h());
        return a10;
    }

    @TargetApi(24)
    private static android.icu.util.TimeZone j() {
        android.icu.util.TimeZone timeZone;
        timeZone = android.icu.util.TimeZone.getTimeZone("UTC");
        return timeZone;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Calendar k() {
        return l(null);
    }

    static Calendar l(Calendar calendar) {
        Calendar calendar2 = Calendar.getInstance(h());
        if (calendar == null) {
            calendar2.clear();
        } else {
            calendar2.setTimeInMillis(calendar.getTimeInMillis());
        }
        return calendar2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @TargetApi(24)
    public static DateFormat m(Locale locale) {
        return c("yMMMEd", locale);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @TargetApi(24)
    public static DateFormat n(Locale locale) {
        return c("yMMMM", locale);
    }
}
