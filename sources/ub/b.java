package ub;

import dd.g;
import io.realm.a1;
import io.realm.g1;
import io.realm.n;
import io.realm.o0;
import io.realm.p;

/* compiled from: RealmFlowFactory.java */
/* loaded from: classes4.dex */
public class b implements a {

    /* renamed from: a  reason: collision with root package name */
    private final xb.b f24224a;

    public b(Boolean bool) {
        this.f24224a = new xb.b(bool.booleanValue());
    }

    @Override // ub.a
    public <T extends a1> g<T> a(o0 o0Var, T t10) {
        return this.f24224a.a(o0Var, t10);
    }

    @Override // ub.a
    public g<p> b(n nVar, p pVar) {
        return this.f24224a.b(nVar, pVar);
    }

    @Override // ub.a
    public <T> g<g1<T>> c(o0 o0Var, g1<T> g1Var) {
        return this.f24224a.c(o0Var, g1Var);
    }

    @Override // ub.a
    public <T> g<g1<T>> d(n nVar, g1<T> g1Var) {
        return this.f24224a.d(nVar, g1Var);
    }
}
