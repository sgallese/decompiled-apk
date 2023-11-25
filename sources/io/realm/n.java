package io.realm;

import io.realm.internal.OsObjectStore;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.OsSharedRealm;
import io.realm.t0;

/* compiled from: DynamicRealm.java */
/* loaded from: classes4.dex */
public class n extends io.realm.a {

    /* renamed from: y  reason: collision with root package name */
    private final h1 f17996y;

    /* compiled from: DynamicRealm.java */
    /* loaded from: classes4.dex */
    class a implements t0.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ t0 f17997a;

        a(t0 t0Var) {
            this.f17997a = t0Var;
        }

        @Override // io.realm.t0.b
        public void a(int i10) {
            if (i10 > 0 || this.f17997a.j().u() || OsObjectStore.c(n.this.f17242r) != -1) {
                return;
            }
            n.this.f17242r.beginTransaction();
            if (OsObjectStore.c(n.this.f17242r) == -1) {
                OsObjectStore.d(n.this.f17242r, -1L);
            }
            n.this.f17242r.commitTransaction();
        }
    }

    private n(t0 t0Var, OsSharedRealm.a aVar) {
        super(t0Var, (OsSchemaInfo) null, aVar);
        t0.n(t0Var.j(), new a(t0Var));
        this.f17996y = new b0(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static n i0(t0 t0Var, OsSharedRealm.a aVar) {
        return new n(t0Var, aVar);
    }

    public static n l0(v0 v0Var) {
        if (v0Var != null) {
            return (n) t0.e(v0Var, n.class);
        }
        throw new IllegalArgumentException("A non-null RealmConfiguration must be provided");
    }

    @Override // io.realm.a
    public /* bridge */ /* synthetic */ v0 L() {
        return super.L();
    }

    @Override // io.realm.a
    public h1 R() {
        return this.f17996y;
    }

    @Override // io.realm.a
    public /* bridge */ /* synthetic */ long V() {
        return super.V();
    }

    @Override // io.realm.a
    public /* bridge */ /* synthetic */ boolean Y() {
        return super.Y();
    }

    @Override // io.realm.a
    public /* bridge */ /* synthetic */ boolean c0() {
        return super.c0();
    }

    @Override // io.realm.a, java.io.Closeable, java.lang.AutoCloseable
    public /* bridge */ /* synthetic */ void close() {
        super.close();
    }

    @Override // io.realm.a
    public /* bridge */ /* synthetic */ void f0() {
        super.f0();
    }

    @Override // io.realm.a
    public /* bridge */ /* synthetic */ String getPath() {
        return super.getPath();
    }

    @Override // io.realm.a
    public /* bridge */ /* synthetic */ boolean isClosed() {
        return super.isClosed();
    }

    @Override // io.realm.a
    /* renamed from: k0  reason: merged with bridge method [inline-methods] */
    public n z() {
        OsSharedRealm.a versionID;
        try {
            versionID = this.f17242r.getVersionID();
        } catch (IllegalStateException unused) {
            V();
            versionID = this.f17242r.getVersionID();
        }
        return (n) t0.f(this.f17240p, n.class, versionID);
    }
}
