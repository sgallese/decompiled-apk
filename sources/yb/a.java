package yb;

import io.realm.a1;
import io.realm.exceptions.RealmException;
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
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: CompositeMediator.java */
/* loaded from: classes4.dex */
public class a extends p {

    /* renamed from: a  reason: collision with root package name */
    private final Map<Class<? extends a1>, p> f26298a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, Class<? extends a1>> f26299b = new HashMap();

    public a(p... pVarArr) {
        HashMap hashMap = new HashMap();
        if (pVarArr != null) {
            for (p pVar : pVarArr) {
                for (Class<? extends a1> cls : pVar.k()) {
                    String m10 = pVar.m(cls);
                    Class<? extends a1> cls2 = this.f26299b.get(m10);
                    if (cls2 != null && !cls2.equals(cls)) {
                        throw new IllegalStateException(String.format("It is not allowed for two different model classes to share the same internal name in Realm. The classes %s and %s are being included from the modules '%s' and '%s' and they share the same internal name '%s'.", cls2, cls, hashMap.get(cls2), pVar, m10));
                    }
                    hashMap.put(cls, pVar);
                    this.f26299b.put(m10, cls);
                }
            }
        }
        this.f26298a = Collections.unmodifiableMap(hashMap);
    }

    private p w(Class<? extends a1> cls) {
        p pVar = this.f26298a.get(Util.d(cls));
        if (pVar != null) {
            return pVar;
        }
        throw new RealmException(cls.getSimpleName() + " is not part of the schema for this Realm");
    }

    private p x(String str) {
        return w(this.f26299b.get(str));
    }

    @Override // io.realm.internal.p
    public <E extends a1> E c(o0 o0Var, E e10, boolean z10, Map<a1, o> map, Set<v> set) {
        return (E) w(Util.d(e10.getClass())).c(o0Var, e10, z10, map, set);
    }

    @Override // io.realm.internal.p
    public c d(Class<? extends a1> cls, OsSchemaInfo osSchemaInfo) {
        return w(cls).d(cls, osSchemaInfo);
    }

    @Override // io.realm.internal.p
    public <E extends a1> E e(E e10, int i10, Map<a1, o.a<a1>> map) {
        return (E) w(Util.d(e10.getClass())).e(e10, i10, map);
    }

    @Override // io.realm.internal.p
    protected <T extends a1> Class<T> g(String str) {
        return x(str).f(str);
    }

    @Override // io.realm.internal.p
    public Map<Class<? extends a1>, OsObjectSchemaInfo> h() {
        HashMap hashMap = new HashMap();
        Iterator<p> it = this.f26298a.values().iterator();
        while (it.hasNext()) {
            hashMap.putAll(it.next().h());
        }
        return hashMap;
    }

    @Override // io.realm.internal.p
    public Set<Class<? extends a1>> k() {
        return this.f26298a.keySet();
    }

    @Override // io.realm.internal.p
    protected String n(Class<? extends a1> cls) {
        return w(cls).m(cls);
    }

    @Override // io.realm.internal.p
    protected boolean p(Class<? extends a1> cls) {
        return w(cls).o(cls);
    }

    @Override // io.realm.internal.p
    public long q(o0 o0Var, a1 a1Var, Map<a1, Long> map) {
        return w(Util.d(a1Var.getClass())).q(o0Var, a1Var, map);
    }

    @Override // io.realm.internal.p
    public void r(o0 o0Var, Collection<? extends a1> collection) {
        w(Util.d(Util.d(collection.iterator().next().getClass()))).r(o0Var, collection);
    }

    @Override // io.realm.internal.p
    public <E extends a1> boolean s(Class<E> cls) {
        return w(Util.d(cls)).s(cls);
    }

    @Override // io.realm.internal.p
    public <E extends a1> E t(Class<E> cls, Object obj, q qVar, c cVar, boolean z10, List<String> list) {
        return (E) w(cls).t(cls, obj, qVar, cVar, z10, list);
    }

    @Override // io.realm.internal.p
    public boolean u() {
        Iterator<Map.Entry<Class<? extends a1>, p>> it = this.f26298a.entrySet().iterator();
        while (it.hasNext()) {
            if (!it.next().getValue().u()) {
                return false;
            }
        }
        return true;
    }

    @Override // io.realm.internal.p
    public <E extends a1> void v(o0 o0Var, E e10, E e11, Map<a1, o> map, Set<v> set) {
        w(Util.d(e11.getClass())).v(o0Var, e10, e11, map, set);
    }
}
