package com.google.gson.internal.bind;

import com.google.gson.JsonSyntaxException;
import com.google.gson.f;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.google.gson.t;
import java.io.IOException;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/* loaded from: classes3.dex */
public final class TimeTypeAdapter extends s<Time> {

    /* renamed from: b  reason: collision with root package name */
    public static final t f12172b = new t() { // from class: com.google.gson.internal.bind.TimeTypeAdapter.1
        @Override // com.google.gson.t
        public <T> s<T> a(f fVar, TypeToken<T> typeToken) {
            if (typeToken.getRawType() == Time.class) {
                return new TimeTypeAdapter();
            }
            return null;
        }
    };

    /* renamed from: a  reason: collision with root package name */
    private final DateFormat f12173a = new SimpleDateFormat("hh:mm:ss a");

    @Override // com.google.gson.s
    /* renamed from: a  reason: merged with bridge method [inline-methods] */
    public synchronized Time read(ja.a aVar) throws IOException {
        if (aVar.l0() == ja.b.NULL) {
            aVar.c0();
            return null;
        }
        try {
            return new Time(this.f12173a.parse(aVar.i0()).getTime());
        } catch (ParseException e10) {
            throw new JsonSyntaxException(e10);
        }
    }

    @Override // com.google.gson.s
    /* renamed from: b  reason: merged with bridge method [inline-methods] */
    public synchronized void write(ja.c cVar, Time time) throws IOException {
        String format;
        if (time == null) {
            format = null;
        } else {
            format = this.f12173a.format((Date) time);
        }
        cVar.s0(format);
    }
}
