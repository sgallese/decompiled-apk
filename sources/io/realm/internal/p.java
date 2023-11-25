package io.realm.internal;

import io.realm.a1;
import io.realm.exceptions.RealmException;
import io.realm.internal.o;
import io.realm.o0;
import io.realm.v;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: RealmProxyMediator.java */
/* loaded from: classes4.dex */
public abstract class p {
    /* JADX INFO: Access modifiers changed from: protected */
    public static void a(Class<? extends a1> cls) {
        if (cls != null) {
            return;
        }
        throw new NullPointerException("A class extending RealmObject must be provided");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void b(String str) {
        if (str != null && !str.isEmpty()) {
            return;
        }
        throw new NullPointerException("A class extending RealmObject must be provided");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static RealmException i(Class<? extends a1> cls) {
        return new RealmException(String.format("'%s' is not part of the schema for this Realm.", cls.toString()));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static RealmException j(String str) {
        return new RealmException(String.format("'%s' is not part of the schema for this Realm.", str));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static IllegalStateException l(String str) {
        return new IllegalStateException("This class is not marked embedded: " + str);
    }

    public abstract <E extends a1> E c(o0 o0Var, E e10, boolean z10, Map<a1, o> map, Set<v> set);

    public abstract c d(Class<? extends a1> cls, OsSchemaInfo osSchemaInfo);

    public abstract <E extends a1> E e(E e10, int i10, Map<a1, o.a<a1>> map);

    public boolean equals(Object obj) {
        if (!(obj instanceof p)) {
            return false;
        }
        return k().equals(((p) obj).k());
    }

    public final <T extends a1> Class<T> f(String str) {
        return g(str);
    }

    protected abstract <T extends a1> Class<T> g(String str);

    public abstract Map<Class<? extends a1>, OsObjectSchemaInfo> h();

    public int hashCode() {
        return k().hashCode();
    }

    public abstract Set<Class<? extends a1>> k();

    public final String m(Class<? extends a1> cls) {
        return n(Util.d(cls));
    }

    protected abstract String n(Class<? extends a1> cls);

    public boolean o(Class<? extends a1> cls) {
        return p(cls);
    }

    protected abstract boolean p(Class<? extends a1> cls);

    public abstract long q(o0 o0Var, a1 a1Var, Map<a1, Long> map);

    public abstract void r(o0 o0Var, Collection<? extends a1> collection);

    public abstract <E extends a1> boolean s(Class<E> cls);

    public abstract <E extends a1> E t(Class<E> cls, Object obj, q qVar, c cVar, boolean z10, List<String> list);

    public boolean u() {
        return false;
    }

    public abstract <E extends a1> void v(o0 o0Var, E e10, E e11, Map<a1, o> map, Set<v> set);
}
