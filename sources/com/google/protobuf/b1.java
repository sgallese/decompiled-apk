package com.google.protobuf;

import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Protobuf.java */
/* loaded from: classes3.dex */
public final class b1 {

    /* renamed from: c  reason: collision with root package name */
    private static final b1 f12254c = new b1();

    /* renamed from: b  reason: collision with root package name */
    private final ConcurrentMap<Class<?>, f1<?>> f12256b = new ConcurrentHashMap();

    /* renamed from: a  reason: collision with root package name */
    private final g1 f12255a = new i0();

    private b1() {
    }

    public static b1 a() {
        return f12254c;
    }

    public <T> void b(T t10, e1 e1Var, o oVar) throws IOException {
        e(t10).e(t10, e1Var, oVar);
    }

    public f1<?> c(Class<?> cls, f1<?> f1Var) {
        z.b(cls, "messageType");
        z.b(f1Var, "schema");
        return this.f12256b.putIfAbsent(cls, f1Var);
    }

    public <T> f1<T> d(Class<T> cls) {
        z.b(cls, "messageType");
        f1<T> f1Var = (f1<T>) this.f12256b.get(cls);
        if (f1Var == null) {
            f1<T> a10 = this.f12255a.a(cls);
            f1<T> f1Var2 = (f1<T>) c(cls, a10);
            if (f1Var2 != null) {
                return f1Var2;
            }
            return a10;
        }
        return f1Var;
    }

    public <T> f1<T> e(T t10) {
        return d(t10.getClass());
    }
}
