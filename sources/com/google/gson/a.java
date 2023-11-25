package com.google.gson;

import java.io.IOException;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: DefaultDateTypeAdapter.java */
/* loaded from: classes3.dex */
final class a extends s<Date> {

    /* renamed from: a  reason: collision with root package name */
    private final Class<? extends Date> f12075a;

    /* renamed from: b  reason: collision with root package name */
    private final List<DateFormat> f12076b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(Class<? extends Date> cls, String str) {
        ArrayList arrayList = new ArrayList();
        this.f12076b = arrayList;
        this.f12075a = c(cls);
        Locale locale = Locale.US;
        arrayList.add(new SimpleDateFormat(str, locale));
        if (Locale.getDefault().equals(locale)) {
            return;
        }
        arrayList.add(new SimpleDateFormat(str));
    }

    private Date a(String str) {
        synchronized (this.f12076b) {
            Iterator<DateFormat> it = this.f12076b.iterator();
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
    }

    private static Class<? extends Date> c(Class<? extends Date> cls) {
        if (cls != Date.class && cls != java.sql.Date.class && cls != Timestamp.class) {
            throw new IllegalArgumentException("Date type must be one of " + Date.class + ", " + Timestamp.class + ", or " + java.sql.Date.class + " but was " + cls);
        }
        return cls;
    }

    @Override // com.google.gson.s
    /* renamed from: b  reason: merged with bridge method [inline-methods] */
    public Date read(ja.a aVar) throws IOException {
        if (aVar.l0() == ja.b.NULL) {
            aVar.c0();
            return null;
        }
        Date a10 = a(aVar.i0());
        Class<? extends Date> cls = this.f12075a;
        if (cls == Date.class) {
            return a10;
        }
        if (cls == Timestamp.class) {
            return new Timestamp(a10.getTime());
        }
        if (cls == java.sql.Date.class) {
            return new java.sql.Date(a10.getTime());
        }
        throw new AssertionError();
    }

    @Override // com.google.gson.s
    /* renamed from: d  reason: merged with bridge method [inline-methods] */
    public void write(ja.c cVar, Date date) throws IOException {
        if (date == null) {
            cVar.L();
            return;
        }
        synchronized (this.f12076b) {
            cVar.s0(this.f12076b.get(0).format(date));
        }
    }

    public String toString() {
        DateFormat dateFormat = this.f12076b.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            return "DefaultDateTypeAdapter(" + ((SimpleDateFormat) dateFormat).toPattern() + ')';
        }
        return "DefaultDateTypeAdapter(" + dateFormat.getClass().getSimpleName() + ')';
    }

    public a(Class<? extends Date> cls, int i10, int i11) {
        ArrayList arrayList = new ArrayList();
        this.f12076b = arrayList;
        this.f12075a = c(cls);
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(i10, i11, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(i10, i11));
        }
        if (ga.d.e()) {
            arrayList.add(ga.i.c(i10, i11));
        }
    }
}
