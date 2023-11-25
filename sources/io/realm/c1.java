package io.realm;

import io.realm.internal.core.NativeRealmAny;
import io.realm.p0;
import java.util.Collections;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RealmAnyOperator.java */
/* loaded from: classes4.dex */
public class c1 extends s0 {

    /* renamed from: c  reason: collision with root package name */
    private final Class<? extends a1> f17343c;

    /* renamed from: d  reason: collision with root package name */
    private final a1 f17344d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c1(a1 a1Var) {
        super(p0.a.OBJECT);
        this.f17344d = a1Var;
        this.f17343c = a1Var.getClass();
    }

    private static <T extends a1> T h(a aVar, Class<T> cls, NativeRealmAny nativeRealmAny) {
        return (T) aVar.B(cls, nativeRealmAny.getRealmModelRowKey(), false, Collections.emptyList());
    }

    @Override // io.realm.s0
    protected NativeRealmAny a() {
        if (this.f17344d instanceof io.realm.internal.o) {
            return new NativeRealmAny((io.realm.internal.o) g(io.realm.internal.o.class));
        }
        throw new IllegalStateException("Native RealmAny instances only allow managed Realm objects or primitives");
    }

    public boolean equals(Object obj) {
        if (obj == null || !getClass().equals(obj.getClass())) {
            return false;
        }
        a1 a1Var = this.f17344d;
        a1 a1Var2 = ((c1) obj).f17344d;
        if (a1Var == null) {
            if (a1Var2 != null) {
                return false;
            }
            return true;
        }
        return a1Var.equals(a1Var2);
    }

    @Override // io.realm.s0
    Class<?> f() {
        if (io.realm.internal.o.class.isAssignableFrom(this.f17343c)) {
            return this.f17343c.getSuperclass();
        }
        return this.f17343c;
    }

    @Override // io.realm.s0
    <T> T g(Class<T> cls) {
        return cls.cast(this.f17344d);
    }

    public int hashCode() {
        return this.f17344d.hashCode();
    }

    public String toString() {
        return this.f17344d.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public <T extends a1> c1(a aVar, NativeRealmAny nativeRealmAny, Class<T> cls) {
        super(p0.a.OBJECT, nativeRealmAny);
        this.f17343c = cls;
        this.f17344d = h(aVar, cls, nativeRealmAny);
    }
}
