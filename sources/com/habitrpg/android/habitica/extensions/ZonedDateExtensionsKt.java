package com.habitrpg.android.habitica.extensions;

import j$.time.DayOfWeek;
import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.ZonedDateTime;
import j$.time.format.DateTimeFormatter;
import j$.time.format.DateTimeFormatterBuilder;
import j$.time.format.TextStyle;
import j$.time.temporal.TemporalAccessor;
import j$.util.DesugarDate;
import java.util.Date;
import java.util.Locale;
import qc.q;

/* compiled from: ZonedDateExtensions.kt */
/* loaded from: classes4.dex */
public final class ZonedDateExtensionsKt {
    public static final String dayOfWeekString(ZonedDateTime zonedDateTime) {
        q.i(zonedDateTime, "<this>");
        String displayName = DayOfWeek.from(zonedDateTime).getDisplayName(TextStyle.FULL, Locale.getDefault());
        q.h(displayName, "getDisplayName(...)");
        return displayName;
    }

    public static final DateTimeFormatter formatter() {
        DateTimeFormatter formatter = new DateTimeFormatterBuilder().append(DateTimeFormatter.ISO_LOCAL_DATE).appendPattern("['T'][' ']").append(DateTimeFormatter.ISO_LOCAL_TIME).appendPattern("[XX]").toFormatter();
        q.h(formatter, "toFormatter(...)");
        return formatter;
    }

    public static final ZonedDateTime parseToZonedDateTime(String str) {
        q.i(str, "<this>");
        TemporalAccessor parseBest = formatter().parseBest(str, new b(), new c());
        q.h(parseBest, "parseBest(...)");
        if (parseBest instanceof ZonedDateTime) {
            return (ZonedDateTime) parseBest;
        }
        ZoneId of = ZoneId.of("UTC");
        q.h(of, "of(...)");
        return ((LocalDateTime) parseBest).atZone(of);
    }

    public static final ZonedDateTime toZonedDateTime(Date date) {
        Instant instant;
        q.i(date, "<this>");
        instant = DesugarDate.toInstant(date);
        return instant.atZone(ZoneId.systemDefault());
    }
}
