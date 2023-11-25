package com.google.gson.internal.bind;

import com.google.gson.JsonSyntaxException;
import com.google.gson.f;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.google.gson.t;
import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/* loaded from: classes3.dex */
public final class SqlDateTypeAdapter extends s<Date> {

    /* renamed from: b  reason: collision with root package name */
    public static final t f12170b = new t() { // from class: com.google.gson.internal.bind.SqlDateTypeAdapter.1
        @Override // com.google.gson.t
        public <T> s<T> a(f fVar, TypeToken<T> typeToken) {
            if (typeToken.getRawType() == Date.class) {
                return new SqlDateTypeAdapter();
            }
            return null;
        }
    };

    /* renamed from: a  reason: collision with root package name */
    private final DateFormat f12171a = new SimpleDateFormat("MMM d, yyyy");

    @Override // com.google.gson.s
    /* renamed from: a  reason: merged with bridge method [inline-methods] */
    public synchronized Date read(ja.a aVar) throws IOException {
        if (aVar.l0() == ja.b.NULL) {
            aVar.c0();
            return null;
        }
        try {
            return new Date(this.f12171a.parse(aVar.i0()).getTime());
        } catch (ParseException e10) {
            throw new JsonSyntaxException(e10);
        }
    }

    @Override // com.google.gson.s
    /* renamed from: b  reason: merged with bridge method [inline-methods] */
    public synchronized void write(ja.c cVar, Date date) throws IOException {
        String format;
        if (date == null) {
            format = null;
        } else {
            format = this.f12171a.format((java.util.Date) date);
        }
        cVar.s0(format);
    }
}
