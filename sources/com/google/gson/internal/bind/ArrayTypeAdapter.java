package com.google.gson.internal.bind;

import com.google.gson.f;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.google.gson.t;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class ArrayTypeAdapter<E> extends s<Object> {

    /* renamed from: c  reason: collision with root package name */
    public static final t f12135c = new t() { // from class: com.google.gson.internal.bind.ArrayTypeAdapter.1
        @Override // com.google.gson.t
        public <T> s<T> a(f fVar, TypeToken<T> typeToken) {
            Type type = typeToken.getType();
            if (!(type instanceof GenericArrayType) && (!(type instanceof Class) || !((Class) type).isArray())) {
                return null;
            }
            Type g10 = ga.b.g(type);
            return new ArrayTypeAdapter(fVar, fVar.k(TypeToken.get(g10)), ga.b.k(g10));
        }
    };

    /* renamed from: a  reason: collision with root package name */
    private final Class<E> f12136a;

    /* renamed from: b  reason: collision with root package name */
    private final s<E> f12137b;

    public ArrayTypeAdapter(f fVar, s<E> sVar, Class<E> cls) {
        this.f12137b = new c(fVar, sVar, cls);
        this.f12136a = cls;
    }

    @Override // com.google.gson.s
    public Object read(ja.a aVar) throws IOException {
        if (aVar.l0() == ja.b.NULL) {
            aVar.c0();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        aVar.b();
        while (aVar.z()) {
            arrayList.add(this.f12137b.read(aVar));
        }
        aVar.m();
        int size = arrayList.size();
        Object newInstance = Array.newInstance((Class<?>) this.f12136a, size);
        for (int i10 = 0; i10 < size; i10++) {
            Array.set(newInstance, i10, arrayList.get(i10));
        }
        return newInstance;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.gson.s
    public void write(ja.c cVar, Object obj) throws IOException {
        if (obj == null) {
            cVar.L();
            return;
        }
        cVar.d();
        int length = Array.getLength(obj);
        for (int i10 = 0; i10 < length; i10++) {
            this.f12137b.write(cVar, Array.get(obj, i10));
        }
        cVar.m();
    }
}
