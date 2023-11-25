package com.habitrpg.android.habitica.utils;

import android.os.Build;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.l;
import com.google.gson.o;
import com.google.gson.p;
import com.google.gson.q;
import com.habitrpg.android.habitica.ui.activities.TaskFormActivity;
import j$.util.DesugarTimeZone;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* compiled from: DateDeserializer.kt */
/* loaded from: classes4.dex */
public final class DateDeserializer implements k<Date>, q<Date> {
    public static final int $stable = 8;
    private List<DateFormat> dateFormats = new ArrayList();

    public DateDeserializer() {
        addFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        addFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
        addFormat("E MMM dd yyyy HH:mm:ss zzzz");
        addFormat("yyyy-MM-dd'T'HH:mm:sszzz");
        if (Build.VERSION.SDK_INT >= 24) {
            addFormat("yyyy-MM-dd'T'HH:mmX");
        } else {
            addFormat("yyyy-MM-dd'T'HH:mm");
        }
        addFormat("yyyy-MM-dd");
    }

    private final void addFormat(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.US);
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        this.dateFormats.add(simpleDateFormat);
    }

    @Override // com.google.gson.k
    public synchronized Date deserialize(l lVar, Type type, j jVar) {
        qc.q.i(lVar, "jsonElement");
        qc.q.i(type, TaskFormActivity.TASK_TYPE_KEY);
        qc.q.i(jVar, "jsonDeserializationContext");
        Date date = null;
        if (lVar.m()) {
            if (lVar.h().size() == 0) {
                return null;
            }
            lVar = lVar.h().t(0);
            qc.q.h(lVar, "get(...)");
        }
        String l10 = lVar.l();
        qc.q.h(l10, "getAsString(...)");
        if (l10.length() == 0) {
            return null;
        }
        String l11 = lVar.l();
        Date date2 = null;
        for (int i10 = 0; i10 < this.dateFormats.size() && date2 == null; i10++) {
            try {
                date2 = this.dateFormats.get(i10).parse(l11);
            } catch (ParseException unused) {
            }
        }
        if (date2 == null) {
            try {
                date = new Date(lVar.k());
            } catch (NumberFormatException unused2) {
            }
            date2 = date;
        }
        return date2;
    }

    @Override // com.google.gson.q
    public l serialize(Date date, Type type, p pVar) {
        qc.q.i(type, "typeOfSrc");
        qc.q.i(pVar, "context");
        if (date == null) {
            return new o("");
        }
        return new o(this.dateFormats.get(0).format(date));
    }
}
