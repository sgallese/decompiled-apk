package com.google.gson.internal.bind;

import com.google.gson.f;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.google.gson.t;
import ga.h;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class CollectionTypeAdapterFactory implements t {

    /* renamed from: f  reason: collision with root package name */
    private final ga.c f12138f;

    /* loaded from: classes3.dex */
    private static final class a<E> extends s<Collection<E>> {

        /* renamed from: a  reason: collision with root package name */
        private final s<E> f12139a;

        /* renamed from: b  reason: collision with root package name */
        private final h<? extends Collection<E>> f12140b;

        public a(f fVar, Type type, s<E> sVar, h<? extends Collection<E>> hVar) {
            this.f12139a = new c(fVar, sVar, type);
            this.f12140b = hVar;
        }

        @Override // com.google.gson.s
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public Collection<E> read(ja.a aVar) throws IOException {
            if (aVar.l0() == ja.b.NULL) {
                aVar.c0();
                return null;
            }
            Collection<E> a10 = this.f12140b.a();
            aVar.b();
            while (aVar.z()) {
                a10.add(this.f12139a.read(aVar));
            }
            aVar.m();
            return a10;
        }

        @Override // com.google.gson.s
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void write(ja.c cVar, Collection<E> collection) throws IOException {
            if (collection == null) {
                cVar.L();
                return;
            }
            cVar.d();
            Iterator<E> it = collection.iterator();
            while (it.hasNext()) {
                this.f12139a.write(cVar, it.next());
            }
            cVar.m();
        }
    }

    public CollectionTypeAdapterFactory(ga.c cVar) {
        this.f12138f = cVar;
    }

    @Override // com.google.gson.t
    public <T> s<T> a(f fVar, TypeToken<T> typeToken) {
        Type type = typeToken.getType();
        Class<? super T> rawType = typeToken.getRawType();
        if (!Collection.class.isAssignableFrom(rawType)) {
            return null;
        }
        Type h10 = ga.b.h(type, rawType);
        return new a(fVar, h10, fVar.k(TypeToken.get(h10)), this.f12138f.a(typeToken));
    }
}
