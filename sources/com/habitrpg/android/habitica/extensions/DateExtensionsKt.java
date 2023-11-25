package com.habitrpg.android.habitica.extensions;

import android.content.res.Resources;
import com.habitrpg.android.habitica.R;
import ec.b0;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import qc.q;
import zc.d;

/* compiled from: DateExtensions.kt */
/* loaded from: classes4.dex */
public final class DateExtensionsKt {
    public static final String formatForLocale(Date date) {
        DateFormat simpleDateFormat;
        q.i(date, "<this>");
        Locale locale = Locale.getDefault();
        if (!q.d(locale, Locale.US) && !q.d(locale, Locale.ENGLISH)) {
            simpleDateFormat = DateFormat.getDateInstance(1, locale);
            q.f(simpleDateFormat);
        } else {
            simpleDateFormat = new SimpleDateFormat("M/d/yy", locale);
        }
        String format = simpleDateFormat.format(date);
        q.h(format, "format(...)");
        return format;
    }

    public static final String getAgoString(Date date, Resources resources) {
        q.i(date, "<this>");
        q.i(resources, "res");
        return getAgoString(date.getTime(), resources);
    }

    /* renamed from: getMinuteOrSeconds-LRDsOJo  reason: not valid java name */
    public static final d m5getMinuteOrSecondsLRDsOJo(long j10) {
        if (zc.a.p(j10) < 1) {
            return d.SECONDS;
        }
        return d.MINUTES;
    }

    public static final String getRemainingString(Date date, Resources resources) {
        q.i(date, "<this>");
        q.i(resources, "res");
        return getRemainingString(date.getTime(), resources);
    }

    public static final String getShortRemainingString(Date date) {
        q.i(date, "<this>");
        return getShortRemainingString(date.getTime());
    }

    public static final String getAgoString(long j10, Resources resources) {
        q.i(resources, "res");
        long p10 = zc.c.p(new Date().getTime() - j10, d.MILLISECONDS);
        long r10 = zc.a.r(p10);
        long p11 = zc.a.p(p10);
        long o10 = zc.a.o(p10);
        long j11 = o10 / 7;
        long j12 = o10 / 30;
        if (j12 != 0) {
            String string = j12 == 1 ? resources.getString(R.string.ago_1month) : resources.getString(R.string.ago_months, Long.valueOf(j12));
            q.f(string);
            return string;
        } else if (j11 != 0) {
            String string2 = j11 == 1 ? resources.getString(R.string.ago_1week) : resources.getString(R.string.ago_weeks, Long.valueOf(j11));
            q.f(string2);
            return string2;
        } else if (o10 != 0) {
            String string3 = o10 == 1 ? resources.getString(R.string.ago_1day) : resources.getString(R.string.ago_days, Long.valueOf(o10));
            q.f(string3);
            return string3;
        } else if (p11 != 0) {
            String string4 = p11 == 1 ? resources.getString(R.string.ago_1hour) : resources.getString(R.string.ago_hours, Long.valueOf(p11));
            q.f(string4);
            return string4;
        } else if (r10 == 1) {
            String string5 = resources.getString(R.string.ago_1Minute);
            q.h(string5, "getString(...)");
            return string5;
        } else {
            String string6 = resources.getString(R.string.ago_minutes, Long.valueOf(r10));
            q.h(string6, "getString(...)");
            return string6;
        }
    }

    public static final String getRemainingString(long j10, Resources resources) {
        q.i(resources, "res");
        long p10 = zc.c.p(j10 - new Date().getTime(), d.MILLISECONDS);
        long r10 = zc.a.r(p10);
        long p11 = zc.a.p(p10);
        long o10 = zc.a.o(p10);
        long j11 = o10 / 7;
        long j12 = o10 / 30;
        if (j12 != 0) {
            String string = j12 == 1 ? resources.getString(R.string.remaining_1month) : resources.getString(R.string.remaining_months, Long.valueOf(j12));
            q.f(string);
            return string;
        } else if (j11 != 0) {
            String string2 = j11 == 1 ? resources.getString(R.string.remaining_1week) : resources.getString(R.string.remaining_weeks, Long.valueOf(j11));
            q.f(string2);
            return string2;
        } else if (o10 != 0) {
            String string3 = o10 == 1 ? resources.getString(R.string.remaining_1day) : resources.getString(R.string.remaining_days, Long.valueOf(o10));
            q.f(string3);
            return string3;
        } else if (p11 != 0) {
            String string4 = p11 == 1 ? resources.getString(R.string.remaining_1hour) : resources.getString(R.string.remaining_hours, Long.valueOf(p11));
            q.f(string4);
            return string4;
        } else if (r10 == 1) {
            String string5 = resources.getString(R.string.remaining_1Minute);
            q.h(string5, "getString(...)");
            return string5;
        } else {
            String string6 = resources.getString(R.string.remaining_minutes, Long.valueOf(r10));
            q.h(string6, "getString(...)");
            return string6;
        }
    }

    public static final String getShortRemainingString(long j10) {
        String k02;
        long p10 = zc.c.p(j10 - new Date().getTime(), d.MILLISECONDS);
        d dVar = d.DAYS;
        int G = zc.a.G(p10, dVar);
        long E = zc.a.E(p10, zc.c.o(G, dVar));
        d dVar2 = d.HOURS;
        int G2 = zc.a.G(E, dVar2);
        long E2 = zc.a.E(E, zc.c.o(G2, dVar2));
        d dVar3 = d.MINUTES;
        int G3 = zc.a.G(E2, dVar3);
        int G4 = zc.a.G(zc.a.E(E2, zc.c.o(G3, dVar3)), d.SECONDS);
        ArrayList arrayList = new ArrayList();
        if (G3 > 0) {
            arrayList.add(G3 + "m");
        }
        if (G2 > 0) {
            arrayList.add(0, G2 + "h");
        }
        if (G > 0) {
            arrayList.add(0, G + "d");
        }
        if (G == 0 && G2 == 0 && G4 > 0) {
            arrayList.add(G4 + "s");
        }
        k02 = b0.k0(arrayList, " ", null, null, 0, null, null, 62, null);
        return k02;
    }
}
