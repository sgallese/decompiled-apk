package com.google.protobuf;

import com.google.protobuf.j0;
import java.util.Map;

/* compiled from: MapFieldSchemaLite.java */
/* loaded from: classes3.dex */
class m0 implements l0 {
    private static <K, V> int i(int i10, Object obj, Object obj2) {
        k0 k0Var = (k0) obj;
        j0 j0Var = (j0) obj2;
        int i11 = 0;
        if (k0Var.isEmpty()) {
            return 0;
        }
        for (Map.Entry<K, V> entry : k0Var.entrySet()) {
            i11 += j0Var.a(i10, entry.getKey(), entry.getValue());
        }
        return i11;
    }

    private static <K, V> k0<K, V> j(Object obj, Object obj2) {
        k0<K, V> k0Var = (k0) obj;
        k0<K, V> k0Var2 = (k0) obj2;
        if (!k0Var2.isEmpty()) {
            if (!k0Var.i()) {
                k0Var = k0Var.l();
            }
            k0Var.k(k0Var2);
        }
        return k0Var;
    }

    @Override // com.google.protobuf.l0
    public Object a(Object obj, Object obj2) {
        return j(obj, obj2);
    }

    @Override // com.google.protobuf.l0
    public Object b(Object obj) {
        ((k0) obj).j();
        return obj;
    }

    @Override // com.google.protobuf.l0
    public j0.a<?, ?> c(Object obj) {
        return ((j0) obj).c();
    }

    @Override // com.google.protobuf.l0
    public Map<?, ?> d(Object obj) {
        return (k0) obj;
    }

    @Override // com.google.protobuf.l0
    public Object e(Object obj) {
        return k0.d().l();
    }

    @Override // com.google.protobuf.l0
    public int f(int i10, Object obj, Object obj2) {
        return i(i10, obj, obj2);
    }

    @Override // com.google.protobuf.l0
    public boolean g(Object obj) {
        return !((k0) obj).i();
    }

    @Override // com.google.protobuf.l0
    public Map<?, ?> h(Object obj) {
        return (k0) obj;
    }
}
