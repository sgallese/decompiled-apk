package com.google.android.material.datepicker;

import java.util.Calendar;
import java.util.TimeZone;

/* compiled from: TimeSource.java */
/* loaded from: classes3.dex */
class o {

    /* renamed from: c  reason: collision with root package name */
    private static final o f9995c = new o(null, null);

    /* renamed from: a  reason: collision with root package name */
    private final Long f9996a;

    /* renamed from: b  reason: collision with root package name */
    private final TimeZone f9997b;

    private o(Long l10, TimeZone timeZone) {
        this.f9996a = l10;
        this.f9997b = timeZone;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static o c() {
        return f9995c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Calendar a() {
        return b(this.f9997b);
    }

    Calendar b(TimeZone timeZone) {
        Calendar calendar;
        if (timeZone == null) {
            calendar = Calendar.getInstance();
        } else {
            calendar = Calendar.getInstance(timeZone);
        }
        Long l10 = this.f9996a;
        if (l10 != null) {
            calendar.setTimeInMillis(l10.longValue());
        }
        return calendar;
    }
}
