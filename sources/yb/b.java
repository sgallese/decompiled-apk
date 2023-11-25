package yb;

import io.realm.a1;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.Util;
import io.realm.internal.c;
import io.realm.internal.o;
import io.realm.internal.p;
import io.realm.internal.q;
import io.realm.o0;
import io.realm.v;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: FilterableMediator.java */
/* loaded from: classes4.dex */
public class b extends p {

    /* renamed from: a  reason: collision with root package name */
    private final p f26300a;

    /* renamed from: b  reason: collision with root package name */
    private final Set<Class<? extends a1>> f26301b;

    public b(p pVar, Collection<Class<? extends a1>> collection, boolean z10) {
        this.f26300a = pVar;
        HashSet hashSet = new HashSet();
        if (pVar != null) {
            Set<Class<? extends a1>> k10 = pVar.k();
            if (!z10) {
                for (Class<? extends a1> cls : collection) {
                    if (k10.contains(cls)) {
                        hashSet.add(cls);
                    }
                }
            } else {
                for (Class<? extends a1> cls2 : k10) {
                    if (!collection.contains(cls2)) {
                        hashSet.add(cls2);
                    }
                }
            }
        }
        this.f26301b = Collections.unmodifiableSet(hashSet);
    }

    private void w(Class<? extends a1> cls) {
        if (this.f26301b.contains(cls)) {
            return;
        }
        throw new IllegalArgumentException(cls.getSimpleName() + " is not part of the schema for this Realm");
    }

    @Override // io.realm.internal.p
    public <E extends a1> E c(o0 o0Var, E e10, boolean z10, Map<a1, o> map, Set<v> set) {
        w(Util.d(e10.getClass()));
        return (E) this.f26300a.c(o0Var, e10, z10, map, set);
    }

    @Override // io.realm.internal.p
    public c d(Class<? extends a1> cls, OsSchemaInfo osSchemaInfo) {
        w(cls);
        return this.f26300a.d(cls, osSchemaInfo);
    }

    @Override // io.realm.internal.p
    public <E extends a1> E e(E e10, int i10, Map<a1, o.a<a1>> map) {
        w(Util.d(e10.getClass()));
        return (E) this.f26300a.e(e10, i10, map);
    }

    @Override // io.realm.internal.p
    protected <T extends a1> Class<T> g(String str) {
        return this.f26300a.f(str);
    }

    @Override // io.realm.internal.p
    public Map<Class<? extends a1>, OsObjectSchemaInfo> h() {
        HashMap hashMap = new HashMap();
        for (Map.Entry<Class<? extends a1>, OsObjectSchemaInfo> entry : this.f26300a.h().entrySet()) {
            if (this.f26301b.contains(entry.getKey())) {
                hashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return hashMap;
    }

    @Override // io.realm.internal.p
    public Set<Class<? extends a1>> k() {
        return this.f26301b;
    }

    @Override // io.realm.internal.p
    protected String n(Class<? extends a1> cls) {
        w(cls);
        return this.f26300a.m(cls);
    }

    @Override // io.realm.internal.p
    protected boolean p(Class<? extends a1> cls) {
        return this.f26300a.o(cls);
    }

    @Override // io.realm.internal.p
    public long q(o0 o0Var, a1 a1Var, Map<a1, Long> map) {
        w(Util.d(a1Var.getClass()));
        return this.f26300a.q(o0Var, a1Var, map);
    }

    @Override // io.realm.internal.p
    public void r(o0 o0Var, Collection<? extends a1> collection) {
        w(Util.d(collection.iterator().next().getClass()));
        this.f26300a.r(o0Var, collection);
    }

    @Override // io.realm.internal.p
    public <E extends a1> boolean s(Class<E> cls) {
        w(Util.d(cls));
        return this.f26300a.s(cls);
    }

    @Override // io.realm.internal.p
    public <E extends a1> E t(Class<E> cls, Object obj, q qVar, c cVar, boolean z10, List<String> list) {
        w(cls);
        return (E) this.f26300a.t(cls, obj, qVar, cVar, z10, list);
    }

    @Override // io.realm.internal.p
    public boolean u() {
        p pVar = this.f26300a;
        if (pVar == null) {
            return true;
        }
        return pVar.u();
    }

    @Override // io.realm.internal.p
    public <E extends a1> void v(o0 o0Var, E e10, E e11, Map<a1, o> map, Set<v> set) {
        w(Util.d(e11.getClass()));
        this.f26300a.v(o0Var, e10, e11, map, set);
    }
}
