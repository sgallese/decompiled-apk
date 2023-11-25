package io.realm;

import io.realm.internal.Table;
import io.realm.internal.Util;
import io.realm.internal.objectstore.OsKeyPathMapping;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: RealmSchema.java */
/* loaded from: classes4.dex */
public abstract class h1 {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, Table> f17611a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final Map<Class<? extends a1>, Table> f17612b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private final Map<Class<? extends a1>, f1> f17613c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private final Map<String, f1> f17614d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    private OsKeyPathMapping f17615e = null;

    /* renamed from: f  reason: collision with root package name */
    final a f17616f;

    /* renamed from: g  reason: collision with root package name */
    private final io.realm.internal.b f17617g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h1(a aVar, io.realm.internal.b bVar) {
        this.f17616f = aVar;
        this.f17617g = bVar;
    }

    private void a() {
        if (l()) {
            return;
        }
        throw new IllegalStateException("Attempt to use column key before set.");
    }

    private boolean m(Class<? extends a1> cls, Class<? extends a1> cls2) {
        return cls.equals(cls2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(String str, String str2) {
        if (str != null && !str.isEmpty()) {
            return;
        }
        throw new IllegalArgumentException(str2);
    }

    public void c() {
        this.f17615e = new OsKeyPathMapping(this.f17616f.f17242r.getNativePtr());
    }

    public abstract Set<f1> d();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final io.realm.internal.c e(Class<? extends a1> cls) {
        a();
        return this.f17617g.a(cls);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final io.realm.internal.c f(String str) {
        a();
        return this.f17617g.b(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final OsKeyPathMapping g() {
        return this.f17615e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f1 h(Class<? extends a1> cls) {
        f1 f1Var = this.f17613c.get(cls);
        if (f1Var != null) {
            return f1Var;
        }
        Class<? extends a1> d10 = Util.d(cls);
        if (m(d10, cls)) {
            f1Var = this.f17613c.get(d10);
        }
        if (f1Var == null) {
            t tVar = new t(this.f17616f, this, j(cls), e(d10));
            this.f17613c.put(d10, tVar);
            f1Var = tVar;
        }
        if (m(d10, cls)) {
            this.f17613c.put(cls, f1Var);
        }
        return f1Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f1 i(String str) {
        String r10 = Table.r(str);
        f1 f1Var = this.f17614d.get(r10);
        if (f1Var == null || !f1Var.e().x() || !f1Var.a().equals(str)) {
            if (this.f17616f.T().hasTable(r10)) {
                a aVar = this.f17616f;
                t tVar = new t(aVar, this, aVar.T().getTable(r10));
                this.f17614d.put(r10, tVar);
                return tVar;
            }
            throw new IllegalArgumentException("The class " + str + " doesn't exist in this Realm.");
        }
        return f1Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Table j(Class<? extends a1> cls) {
        Table table = this.f17612b.get(cls);
        if (table != null) {
            return table;
        }
        Class<? extends a1> d10 = Util.d(cls);
        if (m(d10, cls)) {
            table = this.f17612b.get(d10);
        }
        if (table == null) {
            table = this.f17616f.T().getTable(Table.r(this.f17616f.L().p().m(d10)));
            this.f17612b.put(d10, table);
        }
        if (m(d10, cls)) {
            this.f17612b.put(cls, table);
        }
        return table;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Table k(String str) {
        String r10 = Table.r(str);
        Table table = this.f17611a.get(r10);
        if (table != null) {
            return table;
        }
        Table table2 = this.f17616f.T().getTable(r10);
        this.f17611a.put(r10, table2);
        return table2;
    }

    final boolean l() {
        if (this.f17617g != null) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void n() {
        io.realm.internal.b bVar = this.f17617g;
        if (bVar != null) {
            bVar.c();
        }
        this.f17611a.clear();
        this.f17612b.clear();
        this.f17613c.clear();
        this.f17614d.clear();
    }
}
