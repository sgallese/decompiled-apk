package com.google.gson.internal.bind;

import com.google.gson.f;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.google.gson.t;
import ga.g;
import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class ObjectTypeAdapter extends s<Object> {

    /* renamed from: b  reason: collision with root package name */
    public static final t f12150b = new t() { // from class: com.google.gson.internal.bind.ObjectTypeAdapter.1
        @Override // com.google.gson.t
        public <T> s<T> a(f fVar, TypeToken<T> typeToken) {
            if (typeToken.getRawType() == Object.class) {
                return new ObjectTypeAdapter(fVar);
            }
            return null;
        }
    };

    /* renamed from: a  reason: collision with root package name */
    private final f f12151a;

    /* loaded from: classes3.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f12152a;

        static {
            int[] iArr = new int[ja.b.values().length];
            f12152a = iArr;
            try {
                iArr[ja.b.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12152a[ja.b.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12152a[ja.b.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12152a[ja.b.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f12152a[ja.b.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f12152a[ja.b.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    ObjectTypeAdapter(f fVar) {
        this.f12151a = fVar;
    }

    @Override // com.google.gson.s
    public Object read(ja.a aVar) throws IOException {
        switch (a.f12152a[aVar.l0().ordinal()]) {
            case 1:
                ArrayList arrayList = new ArrayList();
                aVar.b();
                while (aVar.z()) {
                    arrayList.add(read(aVar));
                }
                aVar.m();
                return arrayList;
            case 2:
                g gVar = new g();
                aVar.c();
                while (aVar.z()) {
                    gVar.put(aVar.V(), read(aVar));
                }
                aVar.q();
                return gVar;
            case 3:
                return aVar.i0();
            case 4:
                return Double.valueOf(aVar.Q());
            case 5:
                return Boolean.valueOf(aVar.L());
            case 6:
                aVar.c0();
                return null;
            default:
                throw new IllegalStateException();
        }
    }

    @Override // com.google.gson.s
    public void write(ja.c cVar, Object obj) throws IOException {
        if (obj == null) {
            cVar.L();
            return;
        }
        s l10 = this.f12151a.l(obj.getClass());
        if (l10 instanceof ObjectTypeAdapter) {
            cVar.e();
            cVar.q();
            return;
        }
        l10.write(cVar, obj);
    }
}
