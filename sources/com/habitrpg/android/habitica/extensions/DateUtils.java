package com.habitrpg.android.habitica.extensions;

import java.util.Calendar;
import java.util.Date;
import qc.h;
import qc.q;

/* compiled from: DateExtensions.kt */
/* loaded from: classes4.dex */
public final class DateUtils {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);

    /* compiled from: DateExtensions.kt */
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }

        public final Date createDate(int i10, int i11, int i12) {
            Calendar calendar = Calendar.getInstance();
            calendar.set(1, i10);
            calendar.set(2, i11);
            calendar.set(5, i12);
            calendar.set(11, 0);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            Date time = calendar.getTime();
            q.h(time, "getTime(...)");
            return time;
        }

        public final boolean isSameDay(Date date, Date date2) {
            q.i(date, "date1");
            q.i(date2, "date2");
            Calendar calendar = Calendar.getInstance();
            Calendar calendar2 = Calendar.getInstance();
            calendar.setTime(date);
            calendar2.setTime(date2);
            if (calendar.get(6) == calendar2.get(6) && calendar.get(1) == calendar2.get(1)) {
                return true;
            }
            return false;
        }
    }
}
