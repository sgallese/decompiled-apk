package com.google.gson;

import com.google.gson.internal.Excluder;
import com.google.gson.internal.bind.ArrayTypeAdapter;
import com.google.gson.internal.bind.CollectionTypeAdapterFactory;
import com.google.gson.internal.bind.DateTypeAdapter;
import com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory;
import com.google.gson.internal.bind.MapTypeAdapterFactory;
import com.google.gson.internal.bind.ObjectTypeAdapter;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.internal.bind.SqlDateTypeAdapter;
import com.google.gson.internal.bind.TimeTypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.MalformedJsonException;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* compiled from: Gson.java */
/* loaded from: classes3.dex */
public final class f {

    /* renamed from: v  reason: collision with root package name */
    private static final TypeToken<?> f12078v = TypeToken.get(Object.class);

    /* renamed from: a  reason: collision with root package name */
    private final ThreadLocal<Map<TypeToken<?>, C0253f<?>>> f12079a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<TypeToken<?>, s<?>> f12080b;

    /* renamed from: c  reason: collision with root package name */
    private final ga.c f12081c;

    /* renamed from: d  reason: collision with root package name */
    private final JsonAdapterAnnotationTypeAdapterFactory f12082d;

    /* renamed from: e  reason: collision with root package name */
    final List<t> f12083e;

    /* renamed from: f  reason: collision with root package name */
    final Excluder f12084f;

    /* renamed from: g  reason: collision with root package name */
    final com.google.gson.e f12085g;

    /* renamed from: h  reason: collision with root package name */
    final Map<Type, h<?>> f12086h;

    /* renamed from: i  reason: collision with root package name */
    final boolean f12087i;

    /* renamed from: j  reason: collision with root package name */
    final boolean f12088j;

    /* renamed from: k  reason: collision with root package name */
    final boolean f12089k;

    /* renamed from: l  reason: collision with root package name */
    final boolean f12090l;

    /* renamed from: m  reason: collision with root package name */
    final boolean f12091m;

    /* renamed from: n  reason: collision with root package name */
    final boolean f12092n;

    /* renamed from: o  reason: collision with root package name */
    final boolean f12093o;

    /* renamed from: p  reason: collision with root package name */
    final String f12094p;

    /* renamed from: q  reason: collision with root package name */
    final int f12095q;

    /* renamed from: r  reason: collision with root package name */
    final int f12096r;

    /* renamed from: s  reason: collision with root package name */
    final r f12097s;

    /* renamed from: t  reason: collision with root package name */
    final List<t> f12098t;

    /* renamed from: u  reason: collision with root package name */
    final List<t> f12099u;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Gson.java */
    /* loaded from: classes3.dex */
    public class a extends s<Number> {
        a() {
        }

        @Override // com.google.gson.s
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public Double read(ja.a aVar) throws IOException {
            if (aVar.l0() == ja.b.NULL) {
                aVar.c0();
                return null;
            }
            return Double.valueOf(aVar.Q());
        }

        @Override // com.google.gson.s
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void write(ja.c cVar, Number number) throws IOException {
            if (number == null) {
                cVar.L();
                return;
            }
            f.d(number.doubleValue());
            cVar.q0(number);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Gson.java */
    /* loaded from: classes3.dex */
    public class b extends s<Number> {
        b() {
        }

        @Override // com.google.gson.s
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public Float read(ja.a aVar) throws IOException {
            if (aVar.l0() == ja.b.NULL) {
                aVar.c0();
                return null;
            }
            return Float.valueOf((float) aVar.Q());
        }

        @Override // com.google.gson.s
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void write(ja.c cVar, Number number) throws IOException {
            if (number == null) {
                cVar.L();
                return;
            }
            f.d(number.floatValue());
            cVar.q0(number);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Gson.java */
    /* loaded from: classes3.dex */
    public static class c extends s<Number> {
        c() {
        }

        @Override // com.google.gson.s
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public Number read(ja.a aVar) throws IOException {
            if (aVar.l0() == ja.b.NULL) {
                aVar.c0();
                return null;
            }
            return Long.valueOf(aVar.T());
        }

        @Override // com.google.gson.s
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void write(ja.c cVar, Number number) throws IOException {
            if (number == null) {
                cVar.L();
            } else {
                cVar.s0(number.toString());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Gson.java */
    /* loaded from: classes3.dex */
    public static class d extends s<AtomicLong> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ s f12102a;

        d(s sVar) {
            this.f12102a = sVar;
        }

        @Override // com.google.gson.s
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public AtomicLong read(ja.a aVar) throws IOException {
            return new AtomicLong(((Number) this.f12102a.read(aVar)).longValue());
        }

        @Override // com.google.gson.s
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void write(ja.c cVar, AtomicLong atomicLong) throws IOException {
            this.f12102a.write(cVar, Long.valueOf(atomicLong.get()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Gson.java */
    /* loaded from: classes3.dex */
    public static class e extends s<AtomicLongArray> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ s f12103a;

        e(s sVar) {
            this.f12103a = sVar;
        }

        @Override // com.google.gson.s
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public AtomicLongArray read(ja.a aVar) throws IOException {
            ArrayList arrayList = new ArrayList();
            aVar.b();
            while (aVar.z()) {
                arrayList.add(Long.valueOf(((Number) this.f12103a.read(aVar)).longValue()));
            }
            aVar.m();
            int size = arrayList.size();
            AtomicLongArray atomicLongArray = new AtomicLongArray(size);
            for (int i10 = 0; i10 < size; i10++) {
                atomicLongArray.set(i10, ((Long) arrayList.get(i10)).longValue());
            }
            return atomicLongArray;
        }

        @Override // com.google.gson.s
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void write(ja.c cVar, AtomicLongArray atomicLongArray) throws IOException {
            cVar.d();
            int length = atomicLongArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                this.f12103a.write(cVar, Long.valueOf(atomicLongArray.get(i10)));
            }
            cVar.m();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Gson.java */
    /* renamed from: com.google.gson.f$f  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static class C0253f<T> extends s<T> {

        /* renamed from: a  reason: collision with root package name */
        private s<T> f12104a;

        C0253f() {
        }

        public void a(s<T> sVar) {
            if (this.f12104a == null) {
                this.f12104a = sVar;
                return;
            }
            throw new AssertionError();
        }

        @Override // com.google.gson.s
        public T read(ja.a aVar) throws IOException {
            s<T> sVar = this.f12104a;
            if (sVar != null) {
                return sVar.read(aVar);
            }
            throw new IllegalStateException();
        }

        @Override // com.google.gson.s
        public void write(ja.c cVar, T t10) throws IOException {
            s<T> sVar = this.f12104a;
            if (sVar != null) {
                sVar.write(cVar, t10);
                return;
            }
            throw new IllegalStateException();
        }
    }

    public f() {
        this(Excluder.f12122t, com.google.gson.d.IDENTITY, Collections.emptyMap(), false, false, false, true, false, false, false, r.DEFAULT, null, 2, 2, Collections.emptyList(), Collections.emptyList(), Collections.emptyList());
    }

    private static void a(Object obj, ja.a aVar) {
        if (obj != null) {
            try {
                if (aVar.l0() != ja.b.END_DOCUMENT) {
                    throw new JsonIOException("JSON document was not fully consumed.");
                }
            } catch (MalformedJsonException e10) {
                throw new JsonSyntaxException(e10);
            } catch (IOException e11) {
                throw new JsonIOException(e11);
            }
        }
    }

    private static s<AtomicLong> b(s<Number> sVar) {
        return new d(sVar).nullSafe();
    }

    private static s<AtomicLongArray> c(s<Number> sVar) {
        return new e(sVar).nullSafe();
    }

    static void d(double d10) {
        if (!Double.isNaN(d10) && !Double.isInfinite(d10)) {
            return;
        }
        throw new IllegalArgumentException(d10 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
    }

    private s<Number> e(boolean z10) {
        if (z10) {
            return TypeAdapters.f12208v;
        }
        return new a();
    }

    private s<Number> f(boolean z10) {
        if (z10) {
            return TypeAdapters.f12207u;
        }
        return new b();
    }

    private static s<Number> n(r rVar) {
        if (rVar == r.DEFAULT) {
            return TypeAdapters.f12206t;
        }
        return new c();
    }

    public <T> T g(l lVar, Type type) throws JsonSyntaxException {
        if (lVar == null) {
            return null;
        }
        return (T) h(new com.google.gson.internal.bind.a(lVar), type);
    }

    public <T> T h(ja.a aVar, Type type) throws JsonIOException, JsonSyntaxException {
        boolean B = aVar.B();
        boolean z10 = true;
        aVar.z0(true);
        try {
            try {
                try {
                    aVar.l0();
                    z10 = false;
                    return k(TypeToken.get(type)).read(aVar);
                } catch (IOException e10) {
                    throw new JsonSyntaxException(e10);
                } catch (IllegalStateException e11) {
                    throw new JsonSyntaxException(e11);
                }
            } catch (EOFException e12) {
                if (z10) {
                    aVar.z0(B);
                    return null;
                }
                throw new JsonSyntaxException(e12);
            } catch (AssertionError e13) {
                throw new AssertionError("AssertionError (GSON 2.8.5): " + e13.getMessage(), e13);
            }
        } finally {
            aVar.z0(B);
        }
    }

    public <T> T i(Reader reader, Type type) throws JsonIOException, JsonSyntaxException {
        ja.a o10 = o(reader);
        T t10 = (T) h(o10, type);
        a(t10, o10);
        return t10;
    }

    public <T> T j(String str, Type type) throws JsonSyntaxException {
        if (str == null) {
            return null;
        }
        return (T) i(new StringReader(str), type);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> s<T> k(TypeToken<T> typeToken) {
        Object obj;
        boolean z10;
        Map<TypeToken<?>, s<?>> map = this.f12080b;
        if (typeToken == null) {
            obj = f12078v;
        } else {
            obj = typeToken;
        }
        s<T> sVar = (s<T>) map.get(obj);
        if (sVar != null) {
            return sVar;
        }
        Map<TypeToken<?>, C0253f<?>> map2 = this.f12079a.get();
        if (map2 == null) {
            map2 = new HashMap<>();
            this.f12079a.set(map2);
            z10 = true;
        } else {
            z10 = false;
        }
        C0253f<?> c0253f = map2.get(typeToken);
        if (c0253f != null) {
            return c0253f;
        }
        try {
            C0253f<?> c0253f2 = new C0253f<>();
            map2.put(typeToken, c0253f2);
            Iterator<t> it = this.f12083e.iterator();
            while (it.hasNext()) {
                s sVar2 = (s<T>) it.next().a(this, typeToken);
                if (sVar2 != null) {
                    c0253f2.a(sVar2);
                    this.f12080b.put(typeToken, sVar2);
                    return sVar2;
                }
            }
            throw new IllegalArgumentException("GSON (2.8.5) cannot handle " + typeToken);
        } finally {
            map2.remove(typeToken);
            if (z10) {
                this.f12079a.remove();
            }
        }
    }

    public <T> s<T> l(Class<T> cls) {
        return k(TypeToken.get((Class) cls));
    }

    public <T> s<T> m(t tVar, TypeToken<T> typeToken) {
        if (!this.f12083e.contains(tVar)) {
            tVar = this.f12082d;
        }
        boolean z10 = false;
        for (t tVar2 : this.f12083e) {
            if (!z10) {
                if (tVar2 == tVar) {
                    z10 = true;
                }
            } else {
                s<T> a10 = tVar2.a(this, typeToken);
                if (a10 != null) {
                    return a10;
                }
            }
        }
        throw new IllegalArgumentException("GSON cannot serialize " + typeToken);
    }

    public ja.a o(Reader reader) {
        ja.a aVar = new ja.a(reader);
        aVar.z0(this.f12092n);
        return aVar;
    }

    public ja.c p(Writer writer) throws IOException {
        if (this.f12089k) {
            writer.write(")]}'\n");
        }
        ja.c cVar = new ja.c(writer);
        if (this.f12091m) {
            cVar.c0("  ");
        }
        cVar.i0(this.f12087i);
        return cVar;
    }

    public void q(Object obj, Type type, ja.c cVar) throws JsonIOException {
        s k10 = k(TypeToken.get(type));
        boolean B = cVar.B();
        cVar.f0(true);
        boolean z10 = cVar.z();
        cVar.Y(this.f12090l);
        boolean x10 = cVar.x();
        cVar.i0(this.f12087i);
        try {
            try {
                k10.write(cVar, obj);
            } catch (IOException e10) {
                throw new JsonIOException(e10);
            } catch (AssertionError e11) {
                throw new AssertionError("AssertionError (GSON 2.8.5): " + e11.getMessage(), e11);
            }
        } finally {
            cVar.f0(B);
            cVar.Y(z10);
            cVar.i0(x10);
        }
    }

    public l r(Object obj) {
        if (obj == null) {
            return m.f12237f;
        }
        return s(obj, obj.getClass());
    }

    public l s(Object obj, Type type) {
        com.google.gson.internal.bind.b bVar = new com.google.gson.internal.bind.b();
        q(obj, type, bVar);
        return bVar.A0();
    }

    public String toString() {
        return "{serializeNulls:" + this.f12087i + ",factories:" + this.f12083e + ",instanceCreators:" + this.f12081c + "}";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(Excluder excluder, com.google.gson.e eVar, Map<Type, h<?>> map, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, r rVar, String str, int i10, int i11, List<t> list, List<t> list2, List<t> list3) {
        this.f12079a = new ThreadLocal<>();
        this.f12080b = new ConcurrentHashMap();
        this.f12084f = excluder;
        this.f12085g = eVar;
        this.f12086h = map;
        ga.c cVar = new ga.c(map);
        this.f12081c = cVar;
        this.f12087i = z10;
        this.f12088j = z11;
        this.f12089k = z12;
        this.f12090l = z13;
        this.f12091m = z14;
        this.f12092n = z15;
        this.f12093o = z16;
        this.f12097s = rVar;
        this.f12094p = str;
        this.f12095q = i10;
        this.f12096r = i11;
        this.f12098t = list;
        this.f12099u = list2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(TypeAdapters.Y);
        arrayList.add(ObjectTypeAdapter.f12150b);
        arrayList.add(excluder);
        arrayList.addAll(list3);
        arrayList.add(TypeAdapters.D);
        arrayList.add(TypeAdapters.f12199m);
        arrayList.add(TypeAdapters.f12193g);
        arrayList.add(TypeAdapters.f12195i);
        arrayList.add(TypeAdapters.f12197k);
        s<Number> n10 = n(rVar);
        arrayList.add(TypeAdapters.c(Long.TYPE, Long.class, n10));
        arrayList.add(TypeAdapters.c(Double.TYPE, Double.class, e(z16)));
        arrayList.add(TypeAdapters.c(Float.TYPE, Float.class, f(z16)));
        arrayList.add(TypeAdapters.f12210x);
        arrayList.add(TypeAdapters.f12201o);
        arrayList.add(TypeAdapters.f12203q);
        arrayList.add(TypeAdapters.b(AtomicLong.class, b(n10)));
        arrayList.add(TypeAdapters.b(AtomicLongArray.class, c(n10)));
        arrayList.add(TypeAdapters.f12205s);
        arrayList.add(TypeAdapters.f12212z);
        arrayList.add(TypeAdapters.F);
        arrayList.add(TypeAdapters.H);
        arrayList.add(TypeAdapters.b(BigDecimal.class, TypeAdapters.B));
        arrayList.add(TypeAdapters.b(BigInteger.class, TypeAdapters.C));
        arrayList.add(TypeAdapters.J);
        arrayList.add(TypeAdapters.L);
        arrayList.add(TypeAdapters.P);
        arrayList.add(TypeAdapters.R);
        arrayList.add(TypeAdapters.W);
        arrayList.add(TypeAdapters.N);
        arrayList.add(TypeAdapters.f12190d);
        arrayList.add(DateTypeAdapter.f12141b);
        arrayList.add(TypeAdapters.U);
        arrayList.add(TimeTypeAdapter.f12172b);
        arrayList.add(SqlDateTypeAdapter.f12170b);
        arrayList.add(TypeAdapters.S);
        arrayList.add(ArrayTypeAdapter.f12135c);
        arrayList.add(TypeAdapters.f12188b);
        arrayList.add(new CollectionTypeAdapterFactory(cVar));
        arrayList.add(new MapTypeAdapterFactory(cVar, z11));
        JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory = new JsonAdapterAnnotationTypeAdapterFactory(cVar);
        this.f12082d = jsonAdapterAnnotationTypeAdapterFactory;
        arrayList.add(jsonAdapterAnnotationTypeAdapterFactory);
        arrayList.add(TypeAdapters.Z);
        arrayList.add(new ReflectiveTypeAdapterFactory(cVar, eVar, excluder, jsonAdapterAnnotationTypeAdapterFactory));
        this.f12083e = Collections.unmodifiableList(arrayList);
    }
}
