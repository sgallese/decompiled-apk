package io.realm.internal;

import io.realm.a1;
import io.realm.exceptions.RealmException;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

/* compiled from: ColumnIndices.java */
/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final Map<Class<? extends a1>, c> f17798a = new ConcurrentHashMap();

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, c> f17799b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private final p f17800c;

    /* renamed from: d  reason: collision with root package name */
    private final OsSchemaInfo f17801d;

    public b(p pVar, OsSchemaInfo osSchemaInfo) {
        this.f17800c = pVar;
        this.f17801d = osSchemaInfo;
    }

    public c a(Class<? extends a1> cls) {
        c cVar = this.f17798a.get(cls);
        if (cVar == null) {
            c d10 = this.f17800c.d(cls, this.f17801d);
            this.f17798a.put(cls, d10);
            return d10;
        }
        return cVar;
    }

    public c b(String str) {
        c cVar = this.f17799b.get(str);
        if (cVar == null) {
            Iterator<Class<? extends a1>> it = this.f17800c.k().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Class<? extends a1> next = it.next();
                if (this.f17800c.m(next).equals(str)) {
                    cVar = a(next);
                    this.f17799b.put(str, cVar);
                    break;
                }
            }
        }
        if (cVar != null) {
            return cVar;
        }
        throw new RealmException(String.format(Locale.US, "'%s' doesn't exist in current schema.", str));
    }

    public void c() {
        for (Map.Entry<Class<? extends a1>, c> entry : this.f17798a.entrySet()) {
            entry.getValue().c(this.f17800c.d(entry.getKey(), this.f17801d));
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ColumnIndices[");
        boolean z10 = false;
        for (Map.Entry<Class<? extends a1>, c> entry : this.f17798a.entrySet()) {
            if (z10) {
                sb2.append(",");
            }
            sb2.append(entry.getKey().getSimpleName());
            sb2.append("->");
            sb2.append(entry.getValue());
            z10 = true;
        }
        sb2.append("]");
        return sb2.toString();
    }
}
