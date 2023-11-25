package com.google.gson.internal.bind;

import com.google.gson.JsonSyntaxException;
import com.google.gson.f;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.google.gson.t;
import ga.d;
import ga.i;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class DateTypeAdapter extends s<Date> {

    /* renamed from: b  reason: collision with root package name */
    public static final t f12141b = new t() { // from class: com.google.gson.internal.bind.DateTypeAdapter.1
        @Override // com.google.gson.t
        public <T> s<T> a(f fVar, TypeToken<T> typeToken) {
            if (typeToken.getRawType() == Date.class) {
                return new DateTypeAdapter();
            }
            return null;
        }
    };

    /* renamed from: a  reason: collision with root package name */
    private final List<DateFormat> f12142a;

    public DateTypeAdapter() {
        ArrayList arrayList = new ArrayList();
        this.f12142a = arrayList;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (d.e()) {
            arrayList.add(i.c(2, 2));
        }
    }

    private synchronized Date a(String str) {
        Iterator<DateFormat> it = this.f12142a.iterator();
        while (it.hasNext()) {
            try {
                return it.next().parse(str);
            } catch (ParseException unused) {
            }
        }
        try {
            return ha.a.c(str, new ParsePosition(0));
        } catch (ParseException e10) {
            throw new JsonSyntaxException(str, e10);
        }
    }

    @Override // com.google.gson.s
    /* renamed from: b  reason: merged with bridge method [inline-methods] */
    public Date read(ja.a aVar) throws IOException {
        if (aVar.l0() == ja.b.NULL) {
            aVar.c0();
            return null;
        }
        return a(aVar.i0());
    }

    @Override // com.google.gson.s
    /* renamed from: c  reason: merged with bridge method [inline-methods] */
    public synchronized void write(ja.c cVar, Date date) throws IOException {
        if (date == null) {
            cVar.L();
        } else {
            cVar.s0(this.f12142a.get(0).format(date));
        }
    }
}
