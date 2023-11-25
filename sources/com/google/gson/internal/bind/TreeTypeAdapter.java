package com.google.gson.internal.bind;

import com.google.gson.JsonParseException;
import com.google.gson.f;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.l;
import com.google.gson.p;
import com.google.gson.q;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.google.gson.t;
import java.io.IOException;
import java.lang.reflect.Type;

/* loaded from: classes3.dex */
public final class TreeTypeAdapter<T> extends s<T> {

    /* renamed from: a  reason: collision with root package name */
    private final q<T> f12174a;

    /* renamed from: b  reason: collision with root package name */
    private final k<T> f12175b;

    /* renamed from: c  reason: collision with root package name */
    final f f12176c;

    /* renamed from: d  reason: collision with root package name */
    private final TypeToken<T> f12177d;

    /* renamed from: e  reason: collision with root package name */
    private final t f12178e;

    /* renamed from: f  reason: collision with root package name */
    private final TreeTypeAdapter<T>.b f12179f = new b();

    /* renamed from: g  reason: collision with root package name */
    private s<T> f12180g;

    /* loaded from: classes3.dex */
    private static final class SingleTypeFactory implements t {

        /* renamed from: f  reason: collision with root package name */
        private final TypeToken<?> f12181f;

        /* renamed from: m  reason: collision with root package name */
        private final boolean f12182m;

        /* renamed from: p  reason: collision with root package name */
        private final Class<?> f12183p;

        /* renamed from: q  reason: collision with root package name */
        private final q<?> f12184q;

        /* renamed from: r  reason: collision with root package name */
        private final k<?> f12185r;

        SingleTypeFactory(Object obj, TypeToken<?> typeToken, boolean z10, Class<?> cls) {
            q<?> qVar;
            boolean z11;
            if (obj instanceof q) {
                qVar = (q) obj;
            } else {
                qVar = null;
            }
            this.f12184q = qVar;
            k<?> kVar = obj instanceof k ? (k) obj : null;
            this.f12185r = kVar;
            if (qVar == null && kVar == null) {
                z11 = false;
            } else {
                z11 = true;
            }
            ga.a.a(z11);
            this.f12181f = typeToken;
            this.f12182m = z10;
            this.f12183p = cls;
        }

        @Override // com.google.gson.t
        public <T> s<T> a(f fVar, TypeToken<T> typeToken) {
            boolean isAssignableFrom;
            TypeToken<?> typeToken2 = this.f12181f;
            if (typeToken2 != null) {
                if (!typeToken2.equals(typeToken) && (!this.f12182m || this.f12181f.getType() != typeToken.getRawType())) {
                    isAssignableFrom = false;
                } else {
                    isAssignableFrom = true;
                }
            } else {
                isAssignableFrom = this.f12183p.isAssignableFrom(typeToken.getRawType());
            }
            if (isAssignableFrom) {
                return new TreeTypeAdapter(this.f12184q, this.f12185r, fVar, typeToken, this);
            }
            return null;
        }
    }

    /* loaded from: classes3.dex */
    private final class b implements p, j {
        private b() {
        }

        @Override // com.google.gson.j
        public <R> R a(l lVar, Type type) throws JsonParseException {
            return (R) TreeTypeAdapter.this.f12176c.g(lVar, type);
        }

        @Override // com.google.gson.p
        public l b(Object obj) {
            return TreeTypeAdapter.this.f12176c.r(obj);
        }
    }

    public TreeTypeAdapter(q<T> qVar, k<T> kVar, f fVar, TypeToken<T> typeToken, t tVar) {
        this.f12174a = qVar;
        this.f12175b = kVar;
        this.f12176c = fVar;
        this.f12177d = typeToken;
        this.f12178e = tVar;
    }

    private s<T> a() {
        s<T> sVar = this.f12180g;
        if (sVar == null) {
            s<T> m10 = this.f12176c.m(this.f12178e, this.f12177d);
            this.f12180g = m10;
            return m10;
        }
        return sVar;
    }

    public static t b(TypeToken<?> typeToken, Object obj) {
        boolean z10;
        if (typeToken.getType() == typeToken.getRawType()) {
            z10 = true;
        } else {
            z10 = false;
        }
        return new SingleTypeFactory(obj, typeToken, z10, null);
    }

    @Override // com.google.gson.s
    public T read(ja.a aVar) throws IOException {
        if (this.f12175b == null) {
            return a().read(aVar);
        }
        l a10 = ga.k.a(aVar);
        if (a10.n()) {
            return null;
        }
        return this.f12175b.deserialize(a10, this.f12177d.getType(), this.f12179f);
    }

    @Override // com.google.gson.s
    public void write(ja.c cVar, T t10) throws IOException {
        q<T> qVar = this.f12174a;
        if (qVar == null) {
            a().write(cVar, t10);
        } else if (t10 == null) {
            cVar.L();
        } else {
            ga.k.b(qVar.serialize(t10, this.f12177d.getType(), this.f12179f), cVar);
        }
    }
}
