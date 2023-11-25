package io.realm;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import io.realm.exceptions.RealmError;
import io.realm.exceptions.RealmException;
import io.realm.exceptions.RealmMigrationNeededException;
import io.realm.exceptions.RealmPrimaryKeyConstraintException;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.OsSharedRealm;
import io.realm.internal.Table;
import io.realm.internal.Util;
import io.realm.internal.i;
import io.realm.internal.o;
import io.realm.log.RealmLog;
import io.realm.v0;
import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* compiled from: Realm.java */
/* loaded from: classes4.dex */
public class o0 extends io.realm.a {
    private static v0 A;

    /* renamed from: z  reason: collision with root package name */
    private static final Object f18014z = new Object();

    /* renamed from: y  reason: collision with root package name */
    private final h1 f18015y;

    /* compiled from: Realm.java */
    /* loaded from: classes4.dex */
    public interface a {
        void a(o0 o0Var);
    }

    private o0(t0 t0Var, OsSharedRealm.a aVar) {
        super(t0Var, N0(t0Var.j().p()), aVar);
        this.f18015y = new u(this, new io.realm.internal.b(this.f17240p.p(), this.f17242r.getSchemaInfo()));
        if (this.f17240p.u()) {
            io.realm.internal.p p10 = this.f17240p.p();
            Iterator<Class<? extends a1>> it = p10.k().iterator();
            while (it.hasNext()) {
                String r10 = Table.r(p10.m(it.next()));
                if (!this.f17242r.hasTable(r10)) {
                    this.f17242r.close();
                    throw new RealmMigrationNeededException(this.f17240p.l(), String.format(Locale.US, "Cannot open the read only Realm. '%s' is missing.", Table.i(r10)));
                }
            }
        }
    }

    private <E extends a1> E C0(E e10, boolean z10, Map<a1, io.realm.internal.o> map, Set<v> set) {
        e();
        if (c0()) {
            if (!this.f17240p.p().s(Util.d(e10.getClass()))) {
                try {
                    return (E) this.f17240p.p().c(this, e10, z10, map, set);
                } catch (IllegalStateException e11) {
                    if (e11.getMessage().startsWith("Attempting to create an object of type")) {
                        throw new RealmPrimaryKeyConstraintException(e11.getMessage());
                    }
                    throw e11;
                }
            }
            throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
        }
        throw new IllegalStateException("`copyOrUpdate` can only be called inside a write transaction.");
    }

    private <E extends a1> E I0(E e10, int i10, Map<a1, o.a<a1>> map) {
        e();
        return (E) this.f17240p.p().e(e10, i10, map);
    }

    private static OsSchemaInfo N0(io.realm.internal.p pVar) {
        return new OsSchemaInfo(pVar.h().values());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static o0 R0(t0 t0Var, OsSharedRealm.a aVar) {
        return new o0(t0Var, aVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static o0 T0(OsSharedRealm osSharedRealm) {
        return new o0(osSharedRealm);
    }

    public static v0 Y0() {
        v0 v0Var;
        synchronized (f18014z) {
            v0Var = A;
        }
        return v0Var;
    }

    public static o0 Z0() {
        v0 Y0 = Y0();
        if (Y0 == null) {
            if (io.realm.a.f17234u == null) {
                throw new IllegalStateException("Call `Realm.init(Context)` before calling this method.");
            }
            throw new IllegalStateException("Set default configuration by using `Realm.setDefaultConfiguration(RealmConfiguration)`.");
        }
        return (o0) t0.e(Y0, o0.class);
    }

    public static Object a1() {
        try {
            Constructor<?> constructor = DefaultRealmModule.class.getDeclaredConstructors()[0];
            constructor.setAccessible(true);
            return constructor.newInstance(new Object[0]);
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (IllegalAccessException e10) {
            throw new RealmException("Could not create an instance of io.realm.DefaultRealmModule", e10);
        } catch (InstantiationException e11) {
            throw new RealmException("Could not create an instance of io.realm.DefaultRealmModule", e11);
        } catch (InvocationTargetException e12) {
            throw new RealmException("Could not create an instance of io.realm.DefaultRealmModule", e12);
        }
    }

    public static o0 b1(v0 v0Var) {
        if (v0Var != null) {
            return (o0) t0.e(v0Var, o0.class);
        }
        throw new IllegalArgumentException("A non-null RealmConfiguration must be provided");
    }

    public static synchronized void e1(Context context) {
        synchronized (o0.class) {
            f1(context, "");
        }
    }

    private static void f1(Context context, String str) {
        if (io.realm.a.f17234u == null) {
            if (context != null) {
                i0(context);
                if (!i1(context)) {
                    io.realm.internal.n.a(context);
                    j1(new v0.a(context).b());
                    io.realm.internal.i.e().h(context, str, new i.a() { // from class: io.realm.m0
                    }, new i.b() { // from class: io.realm.n0
                    });
                    if (context.getApplicationContext() != null) {
                        io.realm.a.f17234u = context.getApplicationContext();
                    } else {
                        io.realm.a.f17234u = context;
                    }
                    OsSharedRealm.initialize(new File(context.getFilesDir(), ".realm.temp"));
                    return;
                }
                throw new RealmError("Could not initialize Realm: Instant apps are not currently supported.");
            }
            throw new IllegalArgumentException("Non-null context required.");
        }
    }

    private static void i0(Context context) {
        File filesDir = context.getFilesDir();
        if (filesDir != null) {
            if (filesDir.exists()) {
                return;
            }
            try {
                filesDir.mkdirs();
            } catch (SecurityException unused) {
            }
        }
        if (filesDir == null || !filesDir.exists()) {
            long[] jArr = {1, 2, 5, 10, 16};
            long j10 = 0;
            int i10 = -1;
            do {
                if (context.getFilesDir() != null && context.getFilesDir().exists()) {
                    break;
                }
                i10++;
                long j11 = jArr[Math.min(i10, 4)];
                SystemClock.sleep(j11);
                j10 += j11;
            } while (j10 <= 200);
        }
        if (context.getFilesDir() != null && context.getFilesDir().exists()) {
            return;
        }
        throw new IllegalStateException("Context.getFilesDir() returns " + context.getFilesDir() + " which is not an existing directory. See https://issuetracker.google.com/issues/36918154");
    }

    private static boolean i1(Context context) {
        boolean isInstantApp;
        if (Build.VERSION.SDK_INT >= 26) {
            isInstantApp = context.getPackageManager().isInstantApp();
            return isInstantApp;
        }
        try {
            return ((Boolean) Class.forName("com.google.android.gms.instantapps.PackageManagerCompat").getMethod("isInstantApp", new Class[0]).invoke(Class.forName("com.google.android.gms.instantapps.InstantApps").getMethod("getPackageManagerCompat", Context.class).invoke(null, context), new Object[0])).booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }

    public static void j1(v0 v0Var) {
        if (v0Var != null) {
            synchronized (f18014z) {
                A = v0Var;
            }
            return;
        }
        throw new IllegalArgumentException("A non-null RealmConfiguration must be provided");
    }

    private void k0(Class<? extends a1> cls) {
        if (d1(cls)) {
            return;
        }
        throw new IllegalArgumentException("A RealmObject with no @PrimaryKey cannot be updated: " + cls.toString());
    }

    private void l0(int i10) {
        if (i10 >= 0) {
            return;
        }
        throw new IllegalArgumentException("maxDepth must be > 0. It was: " + i10);
    }

    private <E extends a1> void p0(E e10) {
        if (e10 != null) {
            return;
        }
        throw new IllegalArgumentException("Null objects cannot be copied into Realm.");
    }

    private <E extends a1> void q0(E e10) {
        if (e10 != null) {
            if (d1.isManaged(e10) && d1.isValid(e10)) {
                if (!(e10 instanceof p)) {
                    return;
                }
                throw new IllegalArgumentException("DynamicRealmObject cannot be copied from Realm.");
            }
            throw new IllegalArgumentException("Only valid managed objects can be copied from Realm.");
        }
        throw new IllegalArgumentException("Null objects cannot be copied from Realm.");
    }

    public <E extends a1> List<E> A0(Iterable<E> iterable, int i10) {
        ArrayList arrayList;
        l0(i10);
        if (iterable == null) {
            return new ArrayList(0);
        }
        if (iterable instanceof Collection) {
            arrayList = new ArrayList(((Collection) iterable).size());
        } else {
            arrayList = new ArrayList();
        }
        HashMap hashMap = new HashMap();
        for (E e10 : iterable) {
            q0(e10);
            arrayList.add(I0(e10, i10, hashMap));
        }
        return arrayList;
    }

    public <E extends a1> E D0(E e10, v... vVarArr) {
        p0(e10);
        return (E) C0(e10, false, new HashMap(), Util.i(vVarArr));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <E extends a1> E F0(E e10, v... vVarArr) {
        p0(e10);
        k0(e10.getClass());
        return (E) C0(e10, true, new HashMap(), Util.i(vVarArr));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <E extends a1> E J0(Class<E> cls, a1 a1Var, String str) {
        e();
        Util.c(a1Var, "parentObject");
        Util.a(str, "parentProperty");
        if (d1.isManaged(a1Var) && d1.isValid(a1Var)) {
            return (E) this.f17240p.p().t(cls, this, Q(this.f18015y.h(cls).a(), (io.realm.internal.o) a1Var, str, this.f18015y, this.f18015y.h(a1Var.getClass())), this.f18015y.e(cls), true, Collections.EMPTY_LIST);
        }
        throw new IllegalArgumentException("Only valid, managed objects can be a parent to an embedded object.");
    }

    @Override // io.realm.a
    public /* bridge */ /* synthetic */ v0 L() {
        return super.L();
    }

    @Override // io.realm.a
    public h1 R() {
        return this.f18015y;
    }

    public void V0(a aVar) {
        if (aVar != null) {
            e();
            d();
            beginTransaction();
            try {
                aVar.a(this);
                m();
                return;
            } catch (Throwable th) {
                if (c0()) {
                    b();
                } else {
                    RealmLog.g("Could not cancel transaction, not currently in a transaction.", new Object[0]);
                }
                throw th;
            }
        }
        throw new IllegalArgumentException("Transaction should not be null");
    }

    @Override // io.realm.a
    /* renamed from: X0  reason: merged with bridge method [inline-methods] */
    public o0 z() {
        return (o0) t0.f(this.f17240p, o0.class, this.f17242r.getVersionID());
    }

    @Override // io.realm.a
    public /* bridge */ /* synthetic */ boolean Y() {
        return super.Y();
    }

    @Override // io.realm.a
    public /* bridge */ /* synthetic */ void b() {
        super.b();
    }

    @Override // io.realm.a
    public /* bridge */ /* synthetic */ void beginTransaction() {
        super.beginTransaction();
    }

    @Override // io.realm.a
    public /* bridge */ /* synthetic */ boolean c0() {
        return super.c0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Table c1(Class<? extends a1> cls) {
        return this.f18015y.j(cls);
    }

    @Override // io.realm.a, java.io.Closeable, java.lang.AutoCloseable
    public /* bridge */ /* synthetic */ void close() {
        super.close();
    }

    boolean d1(Class<? extends a1> cls) {
        return this.f17240p.p().o(cls);
    }

    @Override // io.realm.a
    public /* bridge */ /* synthetic */ void f0() {
        super.f0();
    }

    public void g1(a1 a1Var) {
        j();
        if (a1Var != null) {
            this.f17240p.p().q(this, a1Var, new HashMap());
            return;
        }
        throw new IllegalArgumentException("Null object cannot be inserted into Realm.");
    }

    @Override // io.realm.a
    public /* bridge */ /* synthetic */ String getPath() {
        return super.getPath();
    }

    public void h1(Collection<? extends a1> collection) {
        j();
        if (collection != null) {
            if (collection.isEmpty()) {
                return;
            }
            this.f17240p.p().r(this, collection);
            return;
        }
        throw new IllegalArgumentException("Null objects cannot be inserted into Realm.");
    }

    @Override // io.realm.a
    public /* bridge */ /* synthetic */ boolean isClosed() {
        return super.isClosed();
    }

    public <E extends a1> RealmQuery<E> k1(Class<E> cls) {
        e();
        return RealmQuery.f(this, cls);
    }

    @Override // io.realm.a
    public /* bridge */ /* synthetic */ void m() {
        super.m();
    }

    @Override // io.realm.a
    public /* bridge */ /* synthetic */ void q() {
        super.q();
    }

    public <E extends a1> E s0(E e10) {
        return (E) x0(e10, Integer.MAX_VALUE);
    }

    public <E extends a1> E x0(E e10, int i10) {
        l0(i10);
        q0(e10);
        return (E) I0(e10, i10, new HashMap());
    }

    public <E extends a1> List<E> z0(Iterable<E> iterable) {
        return A0(iterable, Integer.MAX_VALUE);
    }

    private o0(OsSharedRealm osSharedRealm) {
        super(osSharedRealm);
        this.f18015y = new u(this, new io.realm.internal.b(this.f17240p.p(), osSharedRealm.getSchemaInfo()));
    }
}
