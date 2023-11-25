package com.google.gson.internal;

import com.google.gson.b;
import com.google.gson.f;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.google.gson.t;
import fa.d;
import fa.e;
import ja.c;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class Excluder implements t, Cloneable {

    /* renamed from: t  reason: collision with root package name */
    public static final Excluder f12122t = new Excluder();

    /* renamed from: q  reason: collision with root package name */
    private boolean f12126q;

    /* renamed from: f  reason: collision with root package name */
    private double f12123f = -1.0d;

    /* renamed from: m  reason: collision with root package name */
    private int f12124m = 136;

    /* renamed from: p  reason: collision with root package name */
    private boolean f12125p = true;

    /* renamed from: r  reason: collision with root package name */
    private List<b> f12127r = Collections.emptyList();

    /* renamed from: s  reason: collision with root package name */
    private List<b> f12128s = Collections.emptyList();

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes3.dex */
    class a<T> extends s<T> {

        /* renamed from: a  reason: collision with root package name */
        private s<T> f12129a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f12130b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f12131c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ f f12132d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ TypeToken f12133e;

        a(boolean z10, boolean z11, f fVar, TypeToken typeToken) {
            this.f12130b = z10;
            this.f12131c = z11;
            this.f12132d = fVar;
            this.f12133e = typeToken;
        }

        private s<T> a() {
            s<T> sVar = this.f12129a;
            if (sVar == null) {
                s<T> m10 = this.f12132d.m(Excluder.this, this.f12133e);
                this.f12129a = m10;
                return m10;
            }
            return sVar;
        }

        @Override // com.google.gson.s
        public T read(ja.a aVar) throws IOException {
            if (this.f12130b) {
                aVar.I0();
                return null;
            }
            return a().read(aVar);
        }

        @Override // com.google.gson.s
        public void write(c cVar, T t10) throws IOException {
            if (this.f12131c) {
                cVar.L();
            } else {
                a().write(cVar, t10);
            }
        }
    }

    private boolean d(Class<?> cls) {
        if (this.f12123f != -1.0d && !l((d) cls.getAnnotation(d.class), (e) cls.getAnnotation(e.class))) {
            return true;
        }
        if ((!this.f12125p && h(cls)) || g(cls)) {
            return true;
        }
        return false;
    }

    private boolean e(Class<?> cls, boolean z10) {
        List<b> list;
        if (z10) {
            list = this.f12127r;
        } else {
            list = this.f12128s;
        }
        Iterator<b> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().b(cls)) {
                return true;
            }
        }
        return false;
    }

    private boolean g(Class<?> cls) {
        if (!Enum.class.isAssignableFrom(cls) && (cls.isAnonymousClass() || cls.isLocalClass())) {
            return true;
        }
        return false;
    }

    private boolean h(Class<?> cls) {
        if (cls.isMemberClass() && !i(cls)) {
            return true;
        }
        return false;
    }

    private boolean i(Class<?> cls) {
        if ((cls.getModifiers() & 8) != 0) {
            return true;
        }
        return false;
    }

    private boolean j(d dVar) {
        if (dVar != null && dVar.value() > this.f12123f) {
            return false;
        }
        return true;
    }

    private boolean k(e eVar) {
        if (eVar != null && eVar.value() <= this.f12123f) {
            return false;
        }
        return true;
    }

    private boolean l(d dVar, e eVar) {
        if (j(dVar) && k(eVar)) {
            return true;
        }
        return false;
    }

    @Override // com.google.gson.t
    public <T> s<T> a(f fVar, TypeToken<T> typeToken) {
        boolean z10;
        boolean z11;
        Class<? super T> rawType = typeToken.getRawType();
        boolean d10 = d(rawType);
        if (!d10 && !e(rawType, true)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!d10 && !e(rawType, false)) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (!z10 && !z11) {
            return null;
        }
        return new a(z11, z10, fVar, typeToken);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b  reason: merged with bridge method [inline-methods] */
    public Excluder clone() {
        try {
            return (Excluder) super.clone();
        } catch (CloneNotSupportedException e10) {
            throw new AssertionError(e10);
        }
    }

    public boolean c(Class<?> cls, boolean z10) {
        if (!d(cls) && !e(cls, z10)) {
            return false;
        }
        return true;
    }

    public boolean f(Field field, boolean z10) {
        List<b> list;
        fa.a aVar;
        if ((this.f12124m & field.getModifiers()) != 0) {
            return true;
        }
        if ((this.f12123f != -1.0d && !l((d) field.getAnnotation(d.class), (e) field.getAnnotation(e.class))) || field.isSynthetic()) {
            return true;
        }
        if (this.f12126q && ((aVar = (fa.a) field.getAnnotation(fa.a.class)) == null || (!z10 ? !aVar.deserialize() : !aVar.serialize()))) {
            return true;
        }
        if ((!this.f12125p && h(field.getType())) || g(field.getType())) {
            return true;
        }
        if (z10) {
            list = this.f12127r;
        } else {
            list = this.f12128s;
        }
        if (!list.isEmpty()) {
            com.google.gson.c cVar = new com.google.gson.c(field);
            Iterator<b> it = list.iterator();
            while (it.hasNext()) {
                if (it.next().a(cVar)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }
}
