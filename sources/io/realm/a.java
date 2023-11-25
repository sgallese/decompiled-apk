package io.realm;

import android.content.Context;
import io.realm.exceptions.RealmException;
import io.realm.internal.CheckedRow;
import io.realm.internal.OsObjectStore;
import io.realm.internal.OsRealmConfig;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.OsSharedRealm;
import io.realm.internal.Table;
import io.realm.internal.UncheckedRow;
import io.realm.log.RealmLog;
import io.realm.o0;
import java.io.Closeable;
import java.io.File;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BaseRealm.java */
/* loaded from: classes4.dex */
public abstract class a implements Closeable {

    /* renamed from: u  reason: collision with root package name */
    static volatile Context f17234u;

    /* renamed from: v  reason: collision with root package name */
    static final wb.a f17235v = wb.a.c();

    /* renamed from: w  reason: collision with root package name */
    public static final wb.a f17236w = wb.a.e();

    /* renamed from: x  reason: collision with root package name */
    public static final d f17237x = new d();

    /* renamed from: f  reason: collision with root package name */
    final boolean f17238f;

    /* renamed from: m  reason: collision with root package name */
    final long f17239m;

    /* renamed from: p  reason: collision with root package name */
    protected final v0 f17240p;

    /* renamed from: q  reason: collision with root package name */
    private t0 f17241q;

    /* renamed from: r  reason: collision with root package name */
    public OsSharedRealm f17242r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f17243s;

    /* renamed from: t  reason: collision with root package name */
    private OsSharedRealm.SchemaChangedCallback f17244t;

    /* compiled from: BaseRealm.java */
    /* renamed from: io.realm.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    class C0410a implements OsSharedRealm.SchemaChangedCallback {
        C0410a() {
        }

        @Override // io.realm.internal.OsSharedRealm.SchemaChangedCallback
        public void onSchemaChanged() {
            h1 R = a.this.R();
            if (R != null) {
                R.n();
            }
            if (a.this instanceof o0) {
                R.c();
            }
        }
    }

    /* compiled from: BaseRealm.java */
    /* loaded from: classes4.dex */
    class b implements OsSharedRealm.InitializationCallback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o0.a f17246a;

        b(o0.a aVar) {
            this.f17246a = aVar;
        }

        @Override // io.realm.internal.OsSharedRealm.InitializationCallback
        public void onInit(OsSharedRealm osSharedRealm) {
            this.f17246a.a(o0.T0(osSharedRealm));
        }
    }

    /* compiled from: BaseRealm.java */
    /* loaded from: classes4.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        private a f17248a;

        /* renamed from: b  reason: collision with root package name */
        private io.realm.internal.q f17249b;

        /* renamed from: c  reason: collision with root package name */
        private io.realm.internal.c f17250c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f17251d;

        /* renamed from: e  reason: collision with root package name */
        private List<String> f17252e;

        public void a() {
            this.f17248a = null;
            this.f17249b = null;
            this.f17250c = null;
            this.f17251d = false;
            this.f17252e = null;
        }

        public boolean b() {
            return this.f17251d;
        }

        public io.realm.internal.c c() {
            return this.f17250c;
        }

        public List<String> d() {
            return this.f17252e;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public a e() {
            return this.f17248a;
        }

        public io.realm.internal.q f() {
            return this.f17249b;
        }

        public void g(a aVar, io.realm.internal.q qVar, io.realm.internal.c cVar, boolean z10, List<String> list) {
            this.f17248a = aVar;
            this.f17249b = qVar;
            this.f17250c = cVar;
            this.f17251d = z10;
            this.f17252e = list;
        }
    }

    /* compiled from: BaseRealm.java */
    /* loaded from: classes4.dex */
    static final class d extends ThreadLocal<c> {
        d() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public c initialValue() {
            return new c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(t0 t0Var, OsSchemaInfo osSchemaInfo, OsSharedRealm.a aVar) {
        this(t0Var.j(), osSchemaInfo, aVar);
        this.f17241q = t0Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public <E extends a1> E B(Class<E> cls, long j10, boolean z10, List<String> list) {
        return (E) this.f17240p.p().t(cls, this, R().j(cls).s(j10), R().e(cls), z10, list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public <E extends a1> E E(Class<E> cls, String str, long j10) {
        boolean z10;
        Table j11;
        io.realm.internal.q qVar;
        io.realm.internal.q qVar2;
        if (str != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            j11 = R().k(str);
        } else {
            j11 = R().j(cls);
        }
        if (z10) {
            if (j10 != -1) {
                qVar2 = j11.g(j10);
            } else {
                qVar2 = io.realm.internal.f.INSTANCE;
            }
            return new p(this, qVar2);
        }
        io.realm.internal.p p10 = this.f17240p.p();
        if (j10 != -1) {
            qVar = j11.s(j10);
        } else {
            qVar = io.realm.internal.f.INSTANCE;
        }
        return (E) p10.t(cls, this, qVar, R().e(cls), false, Collections.emptyList());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public <E extends a1> E I(Class<E> cls, String str, UncheckedRow uncheckedRow) {
        boolean z10;
        if (str != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return new p(this, CheckedRow.f(uncheckedRow));
        }
        return (E) this.f17240p.p().t(cls, this, uncheckedRow, R().e(cls), false, Collections.emptyList());
    }

    public v0 L() {
        return this.f17240p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public io.realm.internal.q Q(String str, io.realm.internal.o oVar, String str2, h1 h1Var, f1 f1Var) {
        long b10 = f1Var.b(str2);
        RealmFieldType c10 = f1Var.c(str2);
        io.realm.internal.q g10 = oVar.b().g();
        if (f1Var.g(f1Var.c(str2))) {
            String d10 = f1Var.d(str2);
            if (d10.equals(str)) {
                return h1Var.k(str).g(g10.createEmbeddedObject(b10, c10));
            }
            throw new IllegalArgumentException(String.format("Parent type %s expects that property '%s' be of type %s but was %s.", f1Var.a(), str2, d10, str));
        }
        throw new IllegalArgumentException(String.format("Field '%s' does not contain a valid link", str2));
    }

    public abstract h1 R();

    /* JADX INFO: Access modifiers changed from: package-private */
    public OsSharedRealm T() {
        return this.f17242r;
    }

    public long V() {
        return OsObjectStore.c(this.f17242r);
    }

    public boolean Y() {
        OsSharedRealm osSharedRealm = this.f17242r;
        if (osSharedRealm != null && !osSharedRealm.isClosed()) {
            return this.f17238f;
        }
        throw new IllegalStateException("This Realm instance has already been closed, making it unusable.");
    }

    public void b() {
        e();
        this.f17242r.cancelTransaction();
    }

    public void beginTransaction() {
        e();
        this.f17242r.beginTransaction();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void c() {
        if (T().capabilities.b() && !L().s()) {
            throw new RealmException("Queries on the UI thread have been disabled. They can be enabled by setting 'RealmConfiguration.Builder.allowQueriesOnUiThread(true)'.");
        }
    }

    public boolean c0() {
        e();
        return this.f17242r.isInTransaction();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (!this.f17238f && this.f17239m != Thread.currentThread().getId()) {
            throw new IllegalStateException("Realm access from incorrect thread. Realm instance can only be closed on the thread it was created.");
        }
        t0 t0Var = this.f17241q;
        if (t0Var != null) {
            t0Var.p(this);
        } else {
            x();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void d() {
        if (T().capabilities.b() && !L().t()) {
            throw new RealmException("Running transactions on the UI thread has been disabled. It can be enabled by setting 'RealmConfiguration.Builder.allowWritesOnUiThread(true)'.");
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void e() {
        OsSharedRealm osSharedRealm = this.f17242r;
        if (osSharedRealm != null && !osSharedRealm.isClosed()) {
            if (!this.f17238f && this.f17239m != Thread.currentThread().getId()) {
                throw new IllegalStateException("Realm access from incorrect thread. Realm objects can only be accessed on the thread they were created.");
            }
            return;
        }
        throw new IllegalStateException("This Realm instance has already been closed, making it unusable.");
    }

    public void f0() {
        e();
        c();
        if (!c0()) {
            this.f17242r.refresh();
            return;
        }
        throw new IllegalStateException("Cannot refresh a Realm instance inside a transaction.");
    }

    protected void finalize() throws Throwable {
        OsSharedRealm osSharedRealm;
        if (this.f17243s && (osSharedRealm = this.f17242r) != null && !osSharedRealm.isClosed()) {
            RealmLog.g("Remember to call close() on all Realm instances. Realm %s is being finalized without being closed, this can lead to running out of native memory.", this.f17240p.l());
            t0 t0Var = this.f17241q;
            if (t0Var != null) {
                t0Var.o();
            }
        }
        super.finalize();
    }

    public String getPath() {
        return this.f17240p.l();
    }

    public boolean isClosed() {
        if (!this.f17238f && this.f17239m != Thread.currentThread().getId()) {
            throw new IllegalStateException("Realm access from incorrect thread. Realm objects can only be accessed on the thread they were created.");
        }
        OsSharedRealm osSharedRealm = this.f17242r;
        if (osSharedRealm != null && !osSharedRealm.isClosed()) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void j() {
        if (c0()) {
            return;
        }
        throw new IllegalStateException("Changing Realm data can only be done from inside a transaction.");
    }

    public void m() {
        e();
        this.f17242r.commitTransaction();
    }

    public void q() {
        e();
        Iterator<f1> it = R().d().iterator();
        while (it.hasNext()) {
            R().k(it.next().a()).b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void x() {
        this.f17241q = null;
        OsSharedRealm osSharedRealm = this.f17242r;
        if (osSharedRealm != null && this.f17243s) {
            osSharedRealm.close();
            this.f17242r = null;
        }
    }

    public abstract a z();

    a(v0 v0Var, OsSchemaInfo osSchemaInfo, OsSharedRealm.a aVar) {
        this.f17244t = new C0410a();
        this.f17239m = Thread.currentThread().getId();
        this.f17240p = v0Var;
        this.f17241q = null;
        if (osSchemaInfo != null) {
            v0Var.j();
        }
        o0.a h10 = v0Var.h();
        OsSharedRealm osSharedRealm = OsSharedRealm.getInstance(new OsRealmConfig.b(v0Var).c(new File(f17234u.getFilesDir(), ".realm.temp")).a(true).e(null).f(osSchemaInfo).d(h10 != null ? new b(h10) : null), aVar);
        this.f17242r = osSharedRealm;
        this.f17238f = osSharedRealm.isFrozen();
        this.f17243s = true;
        this.f17242r.registerSchemaChangedCallback(this.f17244t);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(OsSharedRealm osSharedRealm) {
        this.f17244t = new C0410a();
        this.f17239m = Thread.currentThread().getId();
        this.f17240p = osSharedRealm.getConfiguration();
        this.f17241q = null;
        this.f17242r = osSharedRealm;
        this.f17238f = osSharedRealm.isFrozen();
        this.f17243s = false;
    }
}
