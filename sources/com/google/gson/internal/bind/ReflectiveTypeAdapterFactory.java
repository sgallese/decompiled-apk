package com.google.gson.internal.bind;

import com.google.gson.JsonSyntaxException;
import com.google.gson.e;
import com.google.gson.f;
import com.google.gson.internal.Excluder;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.google.gson.t;
import ga.h;
import ga.j;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class ReflectiveTypeAdapterFactory implements t {

    /* renamed from: f  reason: collision with root package name */
    private final ga.c f12153f;

    /* renamed from: m  reason: collision with root package name */
    private final e f12154m;

    /* renamed from: p  reason: collision with root package name */
    private final Excluder f12155p;

    /* renamed from: q  reason: collision with root package name */
    private final JsonAdapterAnnotationTypeAdapterFactory f12156q;

    /* renamed from: r  reason: collision with root package name */
    private final ia.b f12157r = ia.b.a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a extends c {

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Field f12158d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f12159e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ s f12160f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ f f12161g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ TypeToken f12162h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ boolean f12163i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, boolean z10, boolean z11, Field field, boolean z12, s sVar, f fVar, TypeToken typeToken, boolean z13) {
            super(str, z10, z11);
            this.f12158d = field;
            this.f12159e = z12;
            this.f12160f = sVar;
            this.f12161g = fVar;
            this.f12162h = typeToken;
            this.f12163i = z13;
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.c
        void a(ja.a aVar, Object obj) throws IOException, IllegalAccessException {
            Object read = this.f12160f.read(aVar);
            if (read != null || !this.f12163i) {
                this.f12158d.set(obj, read);
            }
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.c
        void b(ja.c cVar, Object obj) throws IOException, IllegalAccessException {
            s cVar2;
            Object obj2 = this.f12158d.get(obj);
            if (this.f12159e) {
                cVar2 = this.f12160f;
            } else {
                cVar2 = new com.google.gson.internal.bind.c(this.f12161g, this.f12160f, this.f12162h.getType());
            }
            cVar2.write(cVar, obj2);
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.c
        public boolean c(Object obj) throws IOException, IllegalAccessException {
            if (!this.f12168b || this.f12158d.get(obj) == obj) {
                return false;
            }
            return true;
        }
    }

    /* loaded from: classes3.dex */
    public static final class b<T> extends s<T> {

        /* renamed from: a  reason: collision with root package name */
        private final h<T> f12165a;

        /* renamed from: b  reason: collision with root package name */
        private final Map<String, c> f12166b;

        b(h<T> hVar, Map<String, c> map) {
            this.f12165a = hVar;
            this.f12166b = map;
        }

        @Override // com.google.gson.s
        public T read(ja.a aVar) throws IOException {
            if (aVar.l0() == ja.b.NULL) {
                aVar.c0();
                return null;
            }
            T a10 = this.f12165a.a();
            try {
                aVar.c();
                while (aVar.z()) {
                    c cVar = this.f12166b.get(aVar.V());
                    if (cVar != null && cVar.f12169c) {
                        cVar.a(aVar, a10);
                    }
                    aVar.I0();
                }
                aVar.q();
                return a10;
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            } catch (IllegalStateException e11) {
                throw new JsonSyntaxException(e11);
            }
        }

        @Override // com.google.gson.s
        public void write(ja.c cVar, T t10) throws IOException {
            if (t10 == null) {
                cVar.L();
                return;
            }
            cVar.e();
            try {
                for (c cVar2 : this.f12166b.values()) {
                    if (cVar2.c(t10)) {
                        cVar.E(cVar2.f12167a);
                        cVar2.b(cVar, t10);
                    }
                }
                cVar.q();
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static abstract class c {

        /* renamed from: a  reason: collision with root package name */
        final String f12167a;

        /* renamed from: b  reason: collision with root package name */
        final boolean f12168b;

        /* renamed from: c  reason: collision with root package name */
        final boolean f12169c;

        protected c(String str, boolean z10, boolean z11) {
            this.f12167a = str;
            this.f12168b = z10;
            this.f12169c = z11;
        }

        abstract void a(ja.a aVar, Object obj) throws IOException, IllegalAccessException;

        abstract void b(ja.c cVar, Object obj) throws IOException, IllegalAccessException;

        abstract boolean c(Object obj) throws IOException, IllegalAccessException;
    }

    public ReflectiveTypeAdapterFactory(ga.c cVar, e eVar, Excluder excluder, JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory) {
        this.f12153f = cVar;
        this.f12154m = eVar;
        this.f12155p = excluder;
        this.f12156q = jsonAdapterAnnotationTypeAdapterFactory;
    }

    private c b(f fVar, Field field, String str, TypeToken<?> typeToken, boolean z10, boolean z11) {
        s<?> sVar;
        boolean z12;
        boolean b10 = j.b(typeToken.getRawType());
        fa.b bVar = (fa.b) field.getAnnotation(fa.b.class);
        if (bVar != null) {
            sVar = this.f12156q.b(this.f12153f, fVar, typeToken, bVar);
        } else {
            sVar = null;
        }
        if (sVar != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (sVar == null) {
            sVar = fVar.k(typeToken);
        }
        return new a(str, z10, z11, field, z12, sVar, fVar, typeToken, b10);
    }

    static boolean d(Field field, boolean z10, Excluder excluder) {
        if (!excluder.c(field.getType(), z10) && !excluder.f(field, z10)) {
            return true;
        }
        return false;
    }

    private Map<String, c> e(f fVar, TypeToken<?> typeToken, Class<?> cls) {
        boolean z10;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (cls.isInterface()) {
            return linkedHashMap;
        }
        Type type = typeToken.getType();
        TypeToken<?> typeToken2 = typeToken;
        Class<?> cls2 = cls;
        while (cls2 != Object.class) {
            Field[] declaredFields = cls2.getDeclaredFields();
            int length = declaredFields.length;
            boolean z11 = false;
            int i10 = 0;
            while (i10 < length) {
                Field field = declaredFields[i10];
                boolean c10 = c(field, true);
                boolean c11 = c(field, z11);
                if (c10 || c11) {
                    this.f12157r.b(field);
                    Type p10 = ga.b.p(typeToken2.getType(), cls2, field.getGenericType());
                    List<String> f10 = f(field);
                    int size = f10.size();
                    c cVar = null;
                    int i11 = 0;
                    while (i11 < size) {
                        String str = f10.get(i11);
                        if (i11 != 0) {
                            z10 = false;
                        } else {
                            z10 = c10;
                        }
                        int i12 = i11;
                        c cVar2 = cVar;
                        int i13 = size;
                        List<String> list = f10;
                        Field field2 = field;
                        c cVar3 = (c) linkedHashMap.put(str, b(fVar, field, str, TypeToken.get(p10), z10, c11));
                        if (cVar2 == null) {
                            cVar = cVar3;
                        } else {
                            cVar = cVar2;
                        }
                        i11 = i12 + 1;
                        c10 = z10;
                        f10 = list;
                        size = i13;
                        field = field2;
                    }
                    c cVar4 = cVar;
                    if (cVar4 != null) {
                        throw new IllegalArgumentException(type + " declares multiple JSON fields named " + cVar4.f12167a);
                    }
                }
                i10++;
                z11 = false;
            }
            typeToken2 = TypeToken.get(ga.b.p(typeToken2.getType(), cls2, cls2.getGenericSuperclass()));
            cls2 = typeToken2.getRawType();
        }
        return linkedHashMap;
    }

    private List<String> f(Field field) {
        fa.c cVar = (fa.c) field.getAnnotation(fa.c.class);
        if (cVar == null) {
            return Collections.singletonList(this.f12154m.translateName(field));
        }
        String value = cVar.value();
        String[] alternate = cVar.alternate();
        if (alternate.length == 0) {
            return Collections.singletonList(value);
        }
        ArrayList arrayList = new ArrayList(alternate.length + 1);
        arrayList.add(value);
        for (String str : alternate) {
            arrayList.add(str);
        }
        return arrayList;
    }

    @Override // com.google.gson.t
    public <T> s<T> a(f fVar, TypeToken<T> typeToken) {
        Class<? super T> rawType = typeToken.getRawType();
        if (!Object.class.isAssignableFrom(rawType)) {
            return null;
        }
        return new b(this.f12153f.a(typeToken), e(fVar, typeToken, rawType));
    }

    public boolean c(Field field, boolean z10) {
        return d(field, z10, this.f12155p);
    }
}
