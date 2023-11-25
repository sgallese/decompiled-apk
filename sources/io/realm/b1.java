package io.realm;

import io.realm.internal.OsList;
import java.util.Locale;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ManagedListOperator.java */
/* loaded from: classes4.dex */
public final class b1<T> extends y<T> {

    /* renamed from: d  reason: collision with root package name */
    private final String f17342d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b1(a aVar, OsList osList, Class<T> cls, String str) {
        super(aVar, osList, cls);
        this.f17342d = str;
    }

    @Override // io.realm.y
    public void c(Object obj) {
        a1 a1Var = (a1) obj;
        boolean a10 = g.a(this.f18417a, a1Var, this.f17342d, "list");
        if (g.d(this.f18417a, a1Var)) {
            if (!(obj instanceof p)) {
                g.e((o0) this.f18417a, a1Var, this.f18418b.n());
                return;
            }
            throw new IllegalArgumentException("Embedded objects are not supported by RealmLists of DynamicRealmObjects yet.");
        }
        if (a10) {
            a1Var = g.b(this.f18417a, a1Var);
        }
        this.f18418b.k(((io.realm.internal.o) a1Var).b().g().getObjectKey());
    }

    @Override // io.realm.y
    protected void e(Object obj) {
        if (obj != null) {
            if (obj instanceof a1) {
                return;
            }
            throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Unacceptable value type. Acceptable: %1$s, actual: %2$s .", "java.lang.String", obj.getClass().getName()));
        }
        throw new IllegalArgumentException("RealmList does not accept null values.");
    }

    @Override // io.realm.y
    public boolean f() {
        return true;
    }

    @Override // io.realm.y
    public T g(int i10) {
        return (T) this.f18417a.I(this.f18419c, this.f17342d, this.f18418b.s(i10));
    }

    @Override // io.realm.y
    protected void j(int i10) {
        throw new RuntimeException("Should not reach here.");
    }

    @Override // io.realm.y
    public void k(int i10, Object obj) {
        d(i10);
        a1 a1Var = (a1) obj;
        boolean a10 = g.a(this.f18417a, a1Var, this.f17342d, "list");
        if (g.d(this.f18417a, a1Var)) {
            if (!(obj instanceof p)) {
                g.e((o0) this.f18417a, a1Var, this.f18418b.o(i10));
                return;
            }
            throw new IllegalArgumentException("Embedded objects are not supported by RealmLists of DynamicRealmObjects yet.");
        }
        if (a10) {
            a1Var = g.b(this.f18417a, a1Var);
        }
        this.f18418b.E(i10, ((io.realm.internal.o) a1Var).b().g().getObjectKey());
    }

    @Override // io.realm.y
    protected void q(int i10) {
        throw new RuntimeException("Should not reach here.");
    }

    @Override // io.realm.y
    protected void r(int i10, Object obj) {
        a1 a1Var = (a1) obj;
        boolean a10 = g.a(this.f18417a, a1Var, this.f17342d, "list");
        if (g.d(this.f18417a, a1Var)) {
            if (!(obj instanceof p)) {
                g.e((o0) this.f18417a, a1Var, this.f18418b.p(i10));
                return;
            }
            throw new IllegalArgumentException("Embedded objects are not supported by RealmLists of DynamicRealmObjects yet.");
        }
        if (a10) {
            a1Var = g.b(this.f18417a, a1Var);
        }
        this.f18418b.V(i10, ((io.realm.internal.o) a1Var).b().g().getObjectKey());
    }
}
