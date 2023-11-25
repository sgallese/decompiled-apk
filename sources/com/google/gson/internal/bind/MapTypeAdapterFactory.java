package com.google.gson.internal.bind;

import com.google.gson.JsonSyntaxException;
import com.google.gson.f;
import com.google.gson.l;
import com.google.gson.o;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.google.gson.t;
import ga.e;
import ga.h;
import ga.k;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes3.dex */
public final class MapTypeAdapterFactory implements t {

    /* renamed from: f  reason: collision with root package name */
    private final ga.c f12144f;

    /* renamed from: m  reason: collision with root package name */
    final boolean f12145m;

    /* loaded from: classes3.dex */
    private final class a<K, V> extends s<Map<K, V>> {

        /* renamed from: a  reason: collision with root package name */
        private final s<K> f12146a;

        /* renamed from: b  reason: collision with root package name */
        private final s<V> f12147b;

        /* renamed from: c  reason: collision with root package name */
        private final h<? extends Map<K, V>> f12148c;

        public a(f fVar, Type type, s<K> sVar, Type type2, s<V> sVar2, h<? extends Map<K, V>> hVar) {
            this.f12146a = new c(fVar, sVar, type);
            this.f12147b = new c(fVar, sVar2, type2);
            this.f12148c = hVar;
        }

        private String a(l lVar) {
            if (lVar.p()) {
                o j10 = lVar.j();
                if (j10.v()) {
                    return String.valueOf(j10.s());
                }
                if (j10.t()) {
                    return Boolean.toString(j10.a());
                }
                if (j10.x()) {
                    return j10.l();
                }
                throw new AssertionError();
            } else if (lVar.n()) {
                return "null";
            } else {
                throw new AssertionError();
            }
        }

        @Override // com.google.gson.s
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public Map<K, V> read(ja.a aVar) throws IOException {
            ja.b l02 = aVar.l0();
            if (l02 == ja.b.NULL) {
                aVar.c0();
                return null;
            }
            Map<K, V> a10 = this.f12148c.a();
            if (l02 == ja.b.BEGIN_ARRAY) {
                aVar.b();
                while (aVar.z()) {
                    aVar.b();
                    K read = this.f12146a.read(aVar);
                    if (a10.put(read, this.f12147b.read(aVar)) == null) {
                        aVar.m();
                    } else {
                        throw new JsonSyntaxException("duplicate key: " + read);
                    }
                }
                aVar.m();
            } else {
                aVar.c();
                while (aVar.z()) {
                    e.f16290a.a(aVar);
                    K read2 = this.f12146a.read(aVar);
                    if (a10.put(read2, this.f12147b.read(aVar)) != null) {
                        throw new JsonSyntaxException("duplicate key: " + read2);
                    }
                }
                aVar.q();
            }
            return a10;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.gson.s
        /* renamed from: c  reason: merged with bridge method [inline-methods] */
        public void write(ja.c cVar, Map<K, V> map) throws IOException {
            boolean z10;
            if (map == null) {
                cVar.L();
            } else if (!MapTypeAdapterFactory.this.f12145m) {
                cVar.e();
                for (Map.Entry<K, V> entry : map.entrySet()) {
                    cVar.E(String.valueOf(entry.getKey()));
                    this.f12147b.write(cVar, entry.getValue());
                }
                cVar.q();
            } else {
                ArrayList arrayList = new ArrayList(map.size());
                ArrayList arrayList2 = new ArrayList(map.size());
                int i10 = 0;
                boolean z11 = false;
                for (Map.Entry<K, V> entry2 : map.entrySet()) {
                    l jsonTree = this.f12146a.toJsonTree(entry2.getKey());
                    arrayList.add(jsonTree);
                    arrayList2.add(entry2.getValue());
                    if (!jsonTree.m() && !jsonTree.o()) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    z11 |= z10;
                }
                if (z11) {
                    cVar.d();
                    int size = arrayList.size();
                    while (i10 < size) {
                        cVar.d();
                        k.b((l) arrayList.get(i10), cVar);
                        this.f12147b.write(cVar, arrayList2.get(i10));
                        cVar.m();
                        i10++;
                    }
                    cVar.m();
                    return;
                }
                cVar.e();
                int size2 = arrayList.size();
                while (i10 < size2) {
                    cVar.E(a((l) arrayList.get(i10)));
                    this.f12147b.write(cVar, arrayList2.get(i10));
                    i10++;
                }
                cVar.q();
            }
        }
    }

    public MapTypeAdapterFactory(ga.c cVar, boolean z10) {
        this.f12144f = cVar;
        this.f12145m = z10;
    }

    private s<?> b(f fVar, Type type) {
        if (type != Boolean.TYPE && type != Boolean.class) {
            return fVar.k(TypeToken.get(type));
        }
        return TypeAdapters.f12192f;
    }

    @Override // com.google.gson.t
    public <T> s<T> a(f fVar, TypeToken<T> typeToken) {
        Type type = typeToken.getType();
        if (!Map.class.isAssignableFrom(typeToken.getRawType())) {
            return null;
        }
        Type[] j10 = ga.b.j(type, ga.b.k(type));
        return new a(fVar, j10[0], b(fVar, j10[0]), j10[1], fVar.k(TypeToken.get(j10[1])), this.f12144f.a(typeToken));
    }
}
