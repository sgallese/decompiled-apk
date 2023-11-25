package io.realm;

import io.realm.a1;
import io.realm.internal.OsObject;
import io.realm.internal.OsSharedRealm;
import io.realm.internal.UncheckedRow;
import io.realm.internal.j;
import io.realm.internal.l;
import java.util.List;

/* compiled from: ProxyState.java */
/* loaded from: classes4.dex */
public final class l0<E extends a1> implements l.a {

    /* renamed from: i  reason: collision with root package name */
    private static b f17934i = new b();

    /* renamed from: a  reason: collision with root package name */
    private E f17935a;

    /* renamed from: c  reason: collision with root package name */
    private io.realm.internal.q f17937c;

    /* renamed from: d  reason: collision with root package name */
    private OsObject f17938d;

    /* renamed from: e  reason: collision with root package name */
    private io.realm.a f17939e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f17940f;

    /* renamed from: g  reason: collision with root package name */
    private List<String> f17941g;

    /* renamed from: b  reason: collision with root package name */
    private boolean f17936b = true;

    /* renamed from: h  reason: collision with root package name */
    private io.realm.internal.j<OsObject.b> f17942h = new io.realm.internal.j<>();

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ProxyState.java */
    /* loaded from: classes4.dex */
    public static class b implements j.a<OsObject.b> {
        private b() {
        }

        @Override // io.realm.internal.j.a
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void a(OsObject.b bVar, Object obj) {
            bVar.a((a1) obj, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProxyState.java */
    /* loaded from: classes4.dex */
    public static class c<T extends a1> implements e1<T> {

        /* renamed from: a  reason: collision with root package name */
        private final u0<T> f17943a;

        /* JADX INFO: Access modifiers changed from: package-private */
        public c(u0<T> u0Var) {
            if (u0Var != null) {
                this.f17943a = u0Var;
                return;
            }
            throw new IllegalArgumentException("Listener should not be null");
        }

        @Override // io.realm.e1
        public void a(T t10, d0 d0Var) {
            this.f17943a.a(t10);
        }

        public boolean equals(Object obj) {
            if ((obj instanceof c) && this.f17943a == ((c) obj).f17943a) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f17943a.hashCode();
        }
    }

    public l0(E e10) {
        this.f17935a = e10;
    }

    private void k() {
        this.f17942h.c(f17934i);
    }

    private void l() {
        OsSharedRealm osSharedRealm = this.f17939e.f17242r;
        if (osSharedRealm != null && !osSharedRealm.isClosed() && this.f17937c.isValid() && this.f17938d == null) {
            OsObject osObject = new OsObject(this.f17939e.f17242r, (UncheckedRow) this.f17937c);
            this.f17938d = osObject;
            osObject.setObserverPairs(this.f17942h);
            this.f17942h = null;
        }
    }

    @Override // io.realm.internal.l.a
    public void a(io.realm.internal.q qVar) {
        this.f17937c = qVar;
        k();
        if (qVar.isValid()) {
            l();
        }
    }

    public void b(e1<E> e1Var) {
        io.realm.internal.q qVar = this.f17937c;
        if (qVar instanceof io.realm.internal.l) {
            this.f17942h.a(new OsObject.b(this.f17935a, e1Var));
        } else if (qVar instanceof UncheckedRow) {
            l();
            OsObject osObject = this.f17938d;
            if (osObject != null) {
                osObject.addListener(this.f17935a, e1Var);
            }
        }
    }

    public void c(a1 a1Var) {
        if (d1.isValid(a1Var) && d1.isManaged(a1Var)) {
            if (((io.realm.internal.o) a1Var).b().f() == f()) {
                return;
            }
            throw new IllegalArgumentException("'value' belongs to a different Realm.");
        }
        throw new IllegalArgumentException("'value' is not a valid managed object.");
    }

    public boolean d() {
        return this.f17940f;
    }

    public List<String> e() {
        return this.f17941g;
    }

    public io.realm.a f() {
        return this.f17939e;
    }

    public io.realm.internal.q g() {
        return this.f17937c;
    }

    public boolean h() {
        return this.f17937c.isLoaded();
    }

    public boolean i() {
        return this.f17936b;
    }

    public void j() {
        io.realm.internal.q qVar = this.f17937c;
        if (qVar instanceof io.realm.internal.l) {
            ((io.realm.internal.l) qVar).b();
        }
    }

    public void m() {
        OsObject osObject = this.f17938d;
        if (osObject != null) {
            osObject.removeListener(this.f17935a);
        } else {
            this.f17942h.b();
        }
    }

    public void n(e1<E> e1Var) {
        OsObject osObject = this.f17938d;
        if (osObject != null) {
            osObject.removeListener(this.f17935a, e1Var);
        } else {
            this.f17942h.e(this.f17935a, e1Var);
        }
    }

    public void o(boolean z10) {
        this.f17940f = z10;
    }

    public void p() {
        this.f17936b = false;
        this.f17941g = null;
    }

    public void q(List<String> list) {
        this.f17941g = list;
    }

    public void r(io.realm.a aVar) {
        this.f17939e = aVar;
    }

    public void s(io.realm.internal.q qVar) {
        this.f17937c = qVar;
    }
}
