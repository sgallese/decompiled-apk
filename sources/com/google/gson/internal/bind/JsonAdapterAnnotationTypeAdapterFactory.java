package com.google.gson.internal.bind;

import com.google.gson.f;
import com.google.gson.k;
import com.google.gson.q;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.google.gson.t;

/* loaded from: classes3.dex */
public final class JsonAdapterAnnotationTypeAdapterFactory implements t {

    /* renamed from: f  reason: collision with root package name */
    private final ga.c f12143f;

    public JsonAdapterAnnotationTypeAdapterFactory(ga.c cVar) {
        this.f12143f = cVar;
    }

    @Override // com.google.gson.t
    public <T> s<T> a(f fVar, TypeToken<T> typeToken) {
        fa.b bVar = (fa.b) typeToken.getRawType().getAnnotation(fa.b.class);
        if (bVar == null) {
            return null;
        }
        return (s<T>) b(this.f12143f, fVar, typeToken, bVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public s<?> b(ga.c cVar, f fVar, TypeToken<?> typeToken, fa.b bVar) {
        q qVar;
        s<?> treeTypeAdapter;
        Object a10 = cVar.a(TypeToken.get((Class) bVar.value())).a();
        if (a10 instanceof s) {
            treeTypeAdapter = (s) a10;
        } else if (a10 instanceof t) {
            treeTypeAdapter = ((t) a10).a(fVar, typeToken);
        } else {
            boolean z10 = a10 instanceof q;
            if (!z10 && !(a10 instanceof k)) {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + a10.getClass().getName() + " as a @JsonAdapter for " + typeToken.toString() + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
            k kVar = null;
            if (z10) {
                qVar = (q) a10;
            } else {
                qVar = null;
            }
            if (a10 instanceof k) {
                kVar = (k) a10;
            }
            treeTypeAdapter = new TreeTypeAdapter<>(qVar, kVar, fVar, typeToken, null);
        }
        if (treeTypeAdapter != null && bVar.nullSafe()) {
            return treeTypeAdapter.nullSafe();
        }
        return treeTypeAdapter;
    }
}
