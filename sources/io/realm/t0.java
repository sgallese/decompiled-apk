package io.realm;

import io.realm.internal.OsObjectStore;
import io.realm.internal.OsRealmConfig;
import io.realm.internal.OsSharedRealm;
import io.realm.internal.Util;
import io.realm.log.RealmLog;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RealmCache.java */
/* loaded from: classes4.dex */
public final class t0 {

    /* renamed from: f  reason: collision with root package name */
    private static final List<WeakReference<t0>> f18219f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    private static final Collection<t0> f18220g = new ConcurrentLinkedQueue();

    /* renamed from: b  reason: collision with root package name */
    private final String f18222b;

    /* renamed from: c  reason: collision with root package name */
    private v0 f18223c;

    /* renamed from: a  reason: collision with root package name */
    private final Map<zb.a<d, OsSharedRealm.a>, e> f18221a = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private final AtomicBoolean f18224d = new AtomicBoolean(false);

    /* renamed from: e  reason: collision with root package name */
    private final Set<String> f18225e = new HashSet();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RealmCache.java */
    /* loaded from: classes4.dex */
    public class a implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ File f18226f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ v0 f18227m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ boolean f18228p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ String f18229q;

        a(File file, v0 v0Var, boolean z10, String str) {
            this.f18226f = file;
            this.f18227m = v0Var;
            this.f18228p = z10;
            this.f18229q = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f18226f != null) {
                t0.c(this.f18227m.c(), this.f18226f);
            }
            if (this.f18228p) {
                t0.c(io.realm.internal.i.c(this.f18227m.w()).f(this.f18227m), new File(this.f18229q));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RealmCache.java */
    /* loaded from: classes4.dex */
    public interface b {
        void a(int i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: RealmCache.java */
    /* loaded from: classes4.dex */
    public static class c extends e {

        /* renamed from: c  reason: collision with root package name */
        private io.realm.a f18230c;

        private c() {
            super(null);
        }

        @Override // io.realm.t0.e
        public void a() {
            String path = this.f18230c.getPath();
            this.f18231a.set(null);
            this.f18230c = null;
            if (this.f18232b.decrementAndGet() >= 0) {
                return;
            }
            throw new IllegalStateException("Global reference counter of Realm" + path + " not be negative.");
        }

        @Override // io.realm.t0.e
        io.realm.a c() {
            return this.f18230c;
        }

        @Override // io.realm.t0.e
        int d() {
            return this.f18232b.get();
        }

        @Override // io.realm.t0.e
        boolean e() {
            if (this.f18230c != null) {
                return true;
            }
            return false;
        }

        @Override // io.realm.t0.e
        void g(io.realm.a aVar) {
            this.f18230c = aVar;
            this.f18231a.set(0);
            this.f18232b.incrementAndGet();
        }

        /* synthetic */ c(a aVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: RealmCache.java */
    /* loaded from: classes4.dex */
    public enum d {
        TYPED_REALM,
        DYNAMIC_REALM;

        static d valueOf(Class<? extends io.realm.a> cls) {
            if (cls == o0.class) {
                return TYPED_REALM;
            }
            if (cls == n.class) {
                return DYNAMIC_REALM;
            }
            throw new IllegalArgumentException("The type of Realm class must be Realm or DynamicRealm.");
        }
    }

    private t0(String str) {
        this.f18222b = str;
    }

    private static void b(v0 v0Var) {
        File file;
        if (v0Var.r()) {
            file = new File(v0Var.m(), v0Var.n());
        } else {
            file = null;
        }
        String g10 = io.realm.internal.i.c(v0Var.w()).g(v0Var);
        boolean z10 = !Util.g(g10);
        if (file != null || z10) {
            OsObjectStore.a(v0Var, new a(file, v0Var, z10, g10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:56:0x008e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0087 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void c(java.lang.String r6, java.io.File r7) {
        /*
            boolean r0 = r7.exists()
            if (r0 == 0) goto L7
            return
        L7:
            r0 = 0
            android.content.Context r1 = io.realm.a.f17234u     // Catch: java.lang.Throwable -> L66 java.io.IOException -> L69
            android.content.res.AssetManager r1 = r1.getAssets()     // Catch: java.lang.Throwable -> L66 java.io.IOException -> L69
            java.io.InputStream r1 = r1.open(r6)     // Catch: java.lang.Throwable -> L66 java.io.IOException -> L69
            if (r1 == 0) goto L4d
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L45 java.io.IOException -> L49
            r2.<init>(r7)     // Catch: java.lang.Throwable -> L45 java.io.IOException -> L49
            r7 = 4096(0x1000, float:5.74E-42)
            byte[] r7 = new byte[r7]     // Catch: java.lang.Throwable -> L41 java.io.IOException -> L43
        L1d:
            int r3 = r1.read(r7)     // Catch: java.lang.Throwable -> L41 java.io.IOException -> L43
            r4 = -1
            if (r3 <= r4) goto L29
            r4 = 0
            r2.write(r7, r4, r3)     // Catch: java.lang.Throwable -> L41 java.io.IOException -> L43
            goto L1d
        L29:
            r1.close()     // Catch: java.io.IOException -> L2d
            goto L2e
        L2d:
            r0 = move-exception
        L2e:
            r2.close()     // Catch: java.io.IOException -> L32
            goto L36
        L32:
            r6 = move-exception
            if (r0 != 0) goto L36
            r0 = r6
        L36:
            if (r0 != 0) goto L39
            return
        L39:
            io.realm.exceptions.RealmFileException r6 = new io.realm.exceptions.RealmFileException
            io.realm.exceptions.RealmFileException$Kind r7 = io.realm.exceptions.RealmFileException.Kind.ACCESS_ERROR
            r6.<init>(r7, r0)
            throw r6
        L41:
            r6 = move-exception
            goto L47
        L43:
            r7 = move-exception
            goto L4b
        L45:
            r6 = move-exception
            r2 = r0
        L47:
            r0 = r1
            goto L85
        L49:
            r7 = move-exception
            r2 = r0
        L4b:
            r0 = r1
            goto L6b
        L4d:
            io.realm.exceptions.RealmFileException r7 = new io.realm.exceptions.RealmFileException     // Catch: java.lang.Throwable -> L45 java.io.IOException -> L49
            io.realm.exceptions.RealmFileException$Kind r2 = io.realm.exceptions.RealmFileException.Kind.ACCESS_ERROR     // Catch: java.lang.Throwable -> L45 java.io.IOException -> L49
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L45 java.io.IOException -> L49
            r3.<init>()     // Catch: java.lang.Throwable -> L45 java.io.IOException -> L49
            java.lang.String r4 = "Invalid input stream to the asset file: "
            r3.append(r4)     // Catch: java.lang.Throwable -> L45 java.io.IOException -> L49
            r3.append(r6)     // Catch: java.lang.Throwable -> L45 java.io.IOException -> L49
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L45 java.io.IOException -> L49
            r7.<init>(r2, r3)     // Catch: java.lang.Throwable -> L45 java.io.IOException -> L49
            throw r7     // Catch: java.lang.Throwable -> L45 java.io.IOException -> L49
        L66:
            r6 = move-exception
            r2 = r0
            goto L85
        L69:
            r7 = move-exception
            r2 = r0
        L6b:
            io.realm.exceptions.RealmFileException r1 = new io.realm.exceptions.RealmFileException     // Catch: java.lang.Throwable -> L84
            io.realm.exceptions.RealmFileException$Kind r3 = io.realm.exceptions.RealmFileException.Kind.ACCESS_ERROR     // Catch: java.lang.Throwable -> L84
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L84
            r4.<init>()     // Catch: java.lang.Throwable -> L84
            java.lang.String r5 = "Could not resolve the path to the asset file: "
            r4.append(r5)     // Catch: java.lang.Throwable -> L84
            r4.append(r6)     // Catch: java.lang.Throwable -> L84
            java.lang.String r6 = r4.toString()     // Catch: java.lang.Throwable -> L84
            r1.<init>(r3, r6, r7)     // Catch: java.lang.Throwable -> L84
            throw r1     // Catch: java.lang.Throwable -> L84
        L84:
            r6 = move-exception
        L85:
            if (r0 == 0) goto L8c
            r0.close()     // Catch: java.io.IOException -> L8b
            goto L8c
        L8b:
        L8c:
            if (r2 == 0) goto L91
            r2.close()     // Catch: java.io.IOException -> L91
        L91:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.t0.c(java.lang.String, java.io.File):void");
    }

    private <E extends io.realm.a> void d(Class<E> cls, e eVar, OsSharedRealm.a aVar) {
        io.realm.a i02;
        if (cls == o0.class) {
            i02 = o0.R0(this, aVar);
            i02.R().c();
        } else if (cls == n.class) {
            i02 = n.i0(this, aVar);
        } else {
            throw new IllegalArgumentException("The type of Realm class must be Realm or DynamicRealm.");
        }
        eVar.g(i02);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <E extends io.realm.a> E e(v0 v0Var, Class<E> cls) {
        return (E) i(v0Var.l(), true).g(v0Var, cls, OsSharedRealm.a.f17773p);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <E extends io.realm.a> E f(v0 v0Var, Class<E> cls, OsSharedRealm.a aVar) {
        return (E) i(v0Var.l(), true).g(v0Var, cls, aVar);
    }

    private synchronized <E extends io.realm.a> E g(v0 v0Var, Class<E> cls, OsSharedRealm.a aVar) {
        boolean z10;
        E e10;
        e k10 = k(cls, aVar);
        boolean z11 = false;
        if (l() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            b(v0Var);
            if (!v0Var.x()) {
                z11 = true;
            }
            if (v0Var.w() && (z11 || this.f18225e.contains(v0Var.l()))) {
                io.realm.internal.i.e().j(new OsRealmConfig.b(v0Var).b());
                io.realm.internal.i.e().b(v0Var);
                this.f18225e.remove(v0Var.l());
            }
            this.f18223c = v0Var;
        } else {
            q(v0Var);
        }
        if (!k10.e()) {
            d(cls, k10, aVar);
        }
        k10.f(1);
        e10 = (E) k10.c();
        if (z10) {
            io.realm.internal.i.e().a(o0.T0(e10.f17242r), v0Var);
            if (!v0Var.u()) {
                e10.f0();
            }
        }
        return e10;
    }

    private synchronized void h(b bVar) {
        bVar.a(l());
    }

    private static t0 i(String str, boolean z10) {
        t0 t0Var;
        List<WeakReference<t0>> list = f18219f;
        synchronized (list) {
            Iterator<WeakReference<t0>> it = list.iterator();
            t0Var = null;
            while (it.hasNext()) {
                t0 t0Var2 = it.next().get();
                if (t0Var2 == null) {
                    it.remove();
                } else if (t0Var2.f18222b.equals(str)) {
                    t0Var = t0Var2;
                }
            }
            if (t0Var == null && z10) {
                t0Var = new t0(str);
                f18219f.add(new WeakReference<>(t0Var));
            }
        }
        return t0Var;
    }

    private <E extends io.realm.a> e k(Class<E> cls, OsSharedRealm.a aVar) {
        zb.a<d, OsSharedRealm.a> aVar2 = new zb.a<>(d.valueOf(cls), aVar);
        e eVar = this.f18221a.get(aVar2);
        if (eVar == null) {
            boolean equals = aVar.equals(OsSharedRealm.a.f17773p);
            a aVar3 = null;
            if (equals) {
                eVar = new f(aVar3);
            } else {
                eVar = new c(aVar3);
            }
            this.f18221a.put(aVar2, eVar);
        }
        return eVar;
    }

    private int l() {
        Iterator<e> it = this.f18221a.values().iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10 += it.next().b();
        }
        return i10;
    }

    private int m() {
        int i10 = 0;
        for (e eVar : this.f18221a.values()) {
            if (eVar instanceof f) {
                i10 += eVar.b();
            }
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void n(v0 v0Var, b bVar) {
        synchronized (f18219f) {
            t0 i10 = i(v0Var.l(), false);
            if (i10 == null) {
                bVar.a(0);
            } else {
                i10.h(bVar);
            }
        }
    }

    private void q(v0 v0Var) {
        if (this.f18223c.equals(v0Var)) {
            return;
        }
        if (Arrays.equals(this.f18223c.f(), v0Var.f())) {
            v0Var.j();
            this.f18223c.j();
            throw new IllegalArgumentException("Configurations cannot be different if used to open the same file. \nCached configuration: \n" + this.f18223c + "\n\nNew configuration: \n" + v0Var);
        }
        throw new IllegalArgumentException("Wrong key used to decrypt Realm.");
    }

    public v0 j() {
        return this.f18223c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void o() {
        if (!this.f18224d.getAndSet(true)) {
            f18220g.add(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void p(io.realm.a aVar) {
        OsSharedRealm.a aVar2;
        io.realm.a c10;
        String path = aVar.getPath();
        Class<?> cls = aVar.getClass();
        if (aVar.Y()) {
            aVar2 = aVar.f17242r.getVersionID();
        } else {
            aVar2 = OsSharedRealm.a.f17773p;
        }
        e k10 = k(cls, aVar2);
        int d10 = k10.d();
        if (d10 <= 0) {
            RealmLog.g("%s has been closed already. refCount is %s", path, Integer.valueOf(d10));
            return;
        }
        int i10 = d10 - 1;
        if (i10 == 0) {
            k10.a();
            aVar.x();
            if (m() == 0) {
                this.f18223c = null;
                for (e eVar : this.f18221a.values()) {
                    if ((eVar instanceof c) && (c10 = eVar.c()) != null) {
                        while (!c10.isClosed()) {
                            c10.close();
                        }
                    }
                }
                io.realm.internal.i.c(aVar.L().w()).i(aVar.L());
            }
        } else {
            k10.h(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: RealmCache.java */
    /* loaded from: classes4.dex */
    public static class f extends e {

        /* renamed from: c  reason: collision with root package name */
        private final ThreadLocal<io.realm.a> f18233c;

        private f() {
            super(null);
            this.f18233c = new ThreadLocal<>();
        }

        @Override // io.realm.t0.e
        public void a() {
            String path = this.f18233c.get().getPath();
            this.f18231a.set(null);
            this.f18233c.set(null);
            if (this.f18232b.decrementAndGet() >= 0) {
                return;
            }
            throw new IllegalStateException("Global reference counter of Realm" + path + " can not be negative.");
        }

        @Override // io.realm.t0.e
        public io.realm.a c() {
            return this.f18233c.get();
        }

        @Override // io.realm.t0.e
        public int d() {
            Integer num = this.f18231a.get();
            if (num != null) {
                return num.intValue();
            }
            return 0;
        }

        @Override // io.realm.t0.e
        public boolean e() {
            if (this.f18233c.get() != null) {
                return true;
            }
            return false;
        }

        @Override // io.realm.t0.e
        public void g(io.realm.a aVar) {
            this.f18233c.set(aVar);
            this.f18231a.set(0);
            this.f18232b.incrementAndGet();
        }

        /* synthetic */ f(a aVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: RealmCache.java */
    /* loaded from: classes4.dex */
    public static abstract class e {

        /* renamed from: a  reason: collision with root package name */
        protected final ThreadLocal<Integer> f18231a;

        /* renamed from: b  reason: collision with root package name */
        protected AtomicInteger f18232b;

        private e() {
            this.f18231a = new ThreadLocal<>();
            this.f18232b = new AtomicInteger(0);
        }

        abstract void a();

        public int b() {
            return this.f18232b.get();
        }

        abstract io.realm.a c();

        abstract int d();

        abstract boolean e();

        public void f(int i10) {
            Integer num = this.f18231a.get();
            ThreadLocal<Integer> threadLocal = this.f18231a;
            if (num != null) {
                i10 += num.intValue();
            }
            threadLocal.set(Integer.valueOf(i10));
        }

        abstract void g(io.realm.a aVar);

        public void h(int i10) {
            this.f18231a.set(Integer.valueOf(i10));
        }

        /* synthetic */ e(a aVar) {
            this();
        }
    }
}
