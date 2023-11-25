package com.google.gson.internal.bind;

import com.google.gson.f;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import java.io.IOException;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TypeAdapterRuntimeTypeWrapper.java */
/* loaded from: classes3.dex */
public final class c<T> extends s<T> {

    /* renamed from: a  reason: collision with root package name */
    private final f f12234a;

    /* renamed from: b  reason: collision with root package name */
    private final s<T> f12235b;

    /* renamed from: c  reason: collision with root package name */
    private final Type f12236c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(f fVar, s<T> sVar, Type type) {
        this.f12234a = fVar;
        this.f12235b = sVar;
        this.f12236c = type;
    }

    private Type a(Type type, Object obj) {
        if (obj != null) {
            if (type == Object.class || (type instanceof TypeVariable) || (type instanceof Class)) {
                return obj.getClass();
            }
            return type;
        }
        return type;
    }

    @Override // com.google.gson.s
    public T read(ja.a aVar) throws IOException {
        return this.f12235b.read(aVar);
    }

    @Override // com.google.gson.s
    public void write(ja.c cVar, T t10) throws IOException {
        s<T> sVar = this.f12235b;
        Type a10 = a(this.f12236c, t10);
        if (a10 != this.f12236c) {
            sVar = this.f12234a.k(TypeToken.get(a10));
            if (sVar instanceof ReflectiveTypeAdapterFactory.b) {
                s<T> sVar2 = this.f12235b;
                if (!(sVar2 instanceof ReflectiveTypeAdapterFactory.b)) {
                    sVar = sVar2;
                }
            }
        }
        sVar.write(cVar, t10);
    }
}
