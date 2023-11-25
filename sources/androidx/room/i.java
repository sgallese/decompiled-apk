package androidx.room;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.Looper;
import android.util.Log;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import x3.c;

/* compiled from: RoomDatabase.java */
/* loaded from: classes.dex */
public abstract class i {
    @Deprecated

    /* renamed from: a  reason: collision with root package name */
    protected volatile x3.b f7024a;

    /* renamed from: b  reason: collision with root package name */
    private Executor f7025b;

    /* renamed from: c  reason: collision with root package name */
    private Executor f7026c;

    /* renamed from: d  reason: collision with root package name */
    private x3.c f7027d;

    /* renamed from: f  reason: collision with root package name */
    private boolean f7029f;

    /* renamed from: g  reason: collision with root package name */
    boolean f7030g;
    @Deprecated

    /* renamed from: h  reason: collision with root package name */
    protected List<b> f7031h;

    /* renamed from: i  reason: collision with root package name */
    private final ReentrantReadWriteLock f7032i = new ReentrantReadWriteLock();

    /* renamed from: j  reason: collision with root package name */
    private final ThreadLocal<Integer> f7033j = new ThreadLocal<>();

    /* renamed from: k  reason: collision with root package name */
    private final Map<String, Object> f7034k = new ConcurrentHashMap();

    /* renamed from: e  reason: collision with root package name */
    private final f f7028e = e();

    /* compiled from: RoomDatabase.java */
    /* loaded from: classes.dex */
    public static class a<T extends i> {

        /* renamed from: a  reason: collision with root package name */
        private final Class<T> f7035a;

        /* renamed from: b  reason: collision with root package name */
        private final String f7036b;

        /* renamed from: c  reason: collision with root package name */
        private final Context f7037c;

        /* renamed from: d  reason: collision with root package name */
        private ArrayList<b> f7038d;

        /* renamed from: e  reason: collision with root package name */
        private Executor f7039e;

        /* renamed from: f  reason: collision with root package name */
        private Executor f7040f;

        /* renamed from: g  reason: collision with root package name */
        private c.InterfaceC0584c f7041g;

        /* renamed from: h  reason: collision with root package name */
        private boolean f7042h;

        /* renamed from: j  reason: collision with root package name */
        private boolean f7044j;

        /* renamed from: l  reason: collision with root package name */
        private boolean f7046l;

        /* renamed from: n  reason: collision with root package name */
        private Set<Integer> f7048n;

        /* renamed from: o  reason: collision with root package name */
        private Set<Integer> f7049o;

        /* renamed from: p  reason: collision with root package name */
        private String f7050p;

        /* renamed from: q  reason: collision with root package name */
        private File f7051q;

        /* renamed from: i  reason: collision with root package name */
        private c f7043i = c.AUTOMATIC;

        /* renamed from: k  reason: collision with root package name */
        private boolean f7045k = true;

        /* renamed from: m  reason: collision with root package name */
        private final d f7047m = new d();

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(Context context, Class<T> cls, String str) {
            this.f7037c = context;
            this.f7035a = cls;
            this.f7036b = str;
        }

        public a<T> a(b bVar) {
            if (this.f7038d == null) {
                this.f7038d = new ArrayList<>();
            }
            this.f7038d.add(bVar);
            return this;
        }

        public a<T> b(u3.a... aVarArr) {
            if (this.f7049o == null) {
                this.f7049o = new HashSet();
            }
            for (u3.a aVar : aVarArr) {
                this.f7049o.add(Integer.valueOf(aVar.f24101a));
                this.f7049o.add(Integer.valueOf(aVar.f24102b));
            }
            this.f7047m.b(aVarArr);
            return this;
        }

        public a<T> c() {
            this.f7042h = true;
            return this;
        }

        @SuppressLint({"RestrictedApi"})
        public T d() {
            Executor executor;
            if (this.f7037c != null) {
                if (this.f7035a != null) {
                    Executor executor2 = this.f7039e;
                    if (executor2 == null && this.f7040f == null) {
                        Executor f10 = l.c.f();
                        this.f7040f = f10;
                        this.f7039e = f10;
                    } else if (executor2 != null && this.f7040f == null) {
                        this.f7040f = executor2;
                    } else if (executor2 == null && (executor = this.f7040f) != null) {
                        this.f7039e = executor;
                    }
                    Set<Integer> set = this.f7049o;
                    if (set != null && this.f7048n != null) {
                        for (Integer num : set) {
                            if (this.f7048n.contains(num)) {
                                throw new IllegalArgumentException("Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: " + num);
                            }
                        }
                    }
                    if (this.f7041g == null) {
                        this.f7041g = new y3.c();
                    }
                    String str = this.f7050p;
                    if (str != null || this.f7051q != null) {
                        if (this.f7036b != null) {
                            if (str != null && this.f7051q != null) {
                                throw new IllegalArgumentException("Both createFromAsset() and createFromFile() was called on this Builder but the database can only be created using one of the two configurations.");
                            }
                            this.f7041g = new n(str, this.f7051q, this.f7041g);
                        } else {
                            throw new IllegalArgumentException("Cannot create from asset or file for an in-memory database.");
                        }
                    }
                    Context context = this.f7037c;
                    androidx.room.a aVar = new androidx.room.a(context, this.f7036b, this.f7041g, this.f7047m, this.f7038d, this.f7042h, this.f7043i.resolve(context), this.f7039e, this.f7040f, this.f7044j, this.f7045k, this.f7046l, this.f7048n, this.f7050p, this.f7051q);
                    T t10 = (T) h.b(this.f7035a, "_Impl");
                    t10.l(aVar);
                    return t10;
                }
                throw new IllegalArgumentException("Must provide an abstract class that extends RoomDatabase");
            }
            throw new IllegalArgumentException("Cannot provide null context for the database.");
        }

        public a<T> e() {
            this.f7045k = false;
            this.f7046l = true;
            return this;
        }

        public a<T> f(c.InterfaceC0584c interfaceC0584c) {
            this.f7041g = interfaceC0584c;
            return this;
        }

        public a<T> g(Executor executor) {
            this.f7039e = executor;
            return this;
        }
    }

    /* compiled from: RoomDatabase.java */
    /* loaded from: classes.dex */
    public enum c {
        AUTOMATIC,
        TRUNCATE,
        WRITE_AHEAD_LOGGING;

        private static boolean isLowRamDevice(ActivityManager activityManager) {
            return activityManager.isLowRamDevice();
        }

        @SuppressLint({"NewApi"})
        c resolve(Context context) {
            if (this != AUTOMATIC) {
                return this;
            }
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager != null && !isLowRamDevice(activityManager)) {
                return WRITE_AHEAD_LOGGING;
            }
            return TRUNCATE;
        }
    }

    /* compiled from: RoomDatabase.java */
    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        private HashMap<Integer, TreeMap<Integer, u3.a>> f7052a = new HashMap<>();

        private void a(u3.a aVar) {
            int i10 = aVar.f24101a;
            int i11 = aVar.f24102b;
            TreeMap<Integer, u3.a> treeMap = this.f7052a.get(Integer.valueOf(i10));
            if (treeMap == null) {
                treeMap = new TreeMap<>();
                this.f7052a.put(Integer.valueOf(i10), treeMap);
            }
            u3.a aVar2 = treeMap.get(Integer.valueOf(i11));
            if (aVar2 != null) {
                Log.w("ROOM", "Overriding migration " + aVar2 + " with " + aVar);
            }
            treeMap.put(Integer.valueOf(i11), aVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x0016 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0017  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private java.util.List<u3.a> d(java.util.List<u3.a> r7, boolean r8, int r9, int r10) {
            /*
                r6 = this;
            L0:
                if (r8 == 0) goto L5
                if (r9 >= r10) goto L57
                goto L7
            L5:
                if (r9 <= r10) goto L57
            L7:
                java.util.HashMap<java.lang.Integer, java.util.TreeMap<java.lang.Integer, u3.a>> r0 = r6.f7052a
                java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
                java.lang.Object r0 = r0.get(r1)
                java.util.TreeMap r0 = (java.util.TreeMap) r0
                r1 = 0
                if (r0 != 0) goto L17
                return r1
            L17:
                if (r8 == 0) goto L1e
                java.util.NavigableSet r2 = r0.descendingKeySet()
                goto L22
            L1e:
                java.util.Set r2 = r0.keySet()
            L22:
                java.util.Iterator r2 = r2.iterator()
            L26:
                boolean r3 = r2.hasNext()
                r4 = 0
                if (r3 == 0) goto L54
                java.lang.Object r3 = r2.next()
                java.lang.Integer r3 = (java.lang.Integer) r3
                int r3 = r3.intValue()
                r5 = 1
                if (r8 == 0) goto L40
                if (r3 > r10) goto L45
                if (r3 <= r9) goto L45
            L3e:
                r4 = 1
                goto L45
            L40:
                if (r3 < r10) goto L45
                if (r3 >= r9) goto L45
                goto L3e
            L45:
                if (r4 == 0) goto L26
                java.lang.Integer r9 = java.lang.Integer.valueOf(r3)
                java.lang.Object r9 = r0.get(r9)
                r7.add(r9)
                r9 = r3
                r4 = 1
            L54:
                if (r4 != 0) goto L0
                return r1
            L57:
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.room.i.d.d(java.util.List, boolean, int, int):java.util.List");
        }

        public void b(u3.a... aVarArr) {
            for (u3.a aVar : aVarArr) {
                a(aVar);
            }
        }

        public List<u3.a> c(int i10, int i11) {
            boolean z10;
            if (i10 == i11) {
                return Collections.emptyList();
            }
            if (i11 > i10) {
                z10 = true;
            } else {
                z10 = false;
            }
            return d(new ArrayList(), z10, i10, i11);
        }
    }

    private static boolean n() {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return true;
        }
        return false;
    }

    public void a() {
        if (this.f7029f || !n()) {
            return;
        }
        throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
    }

    public void b() {
        if (!k() && this.f7033j.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    @Deprecated
    public void c() {
        a();
        x3.b X = this.f7027d.X();
        this.f7028e.m(X);
        X.beginTransaction();
    }

    public x3.f d(String str) {
        a();
        b();
        return this.f7027d.X().v(str);
    }

    protected abstract f e();

    protected abstract x3.c f(androidx.room.a aVar);

    @Deprecated
    public void g() {
        this.f7027d.X().e0();
        if (!k()) {
            this.f7028e.f();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Lock h() {
        return this.f7032i.readLock();
    }

    public x3.c i() {
        return this.f7027d;
    }

    public Executor j() {
        return this.f7025b;
    }

    public boolean k() {
        return this.f7027d.X().w0();
    }

    public void l(androidx.room.a aVar) {
        boolean z10;
        x3.c f10 = f(aVar);
        this.f7027d = f10;
        if (f10 instanceof m) {
            ((m) f10).c(aVar);
        }
        if (aVar.f6966g == c.WRITE_AHEAD_LOGGING) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f7027d.setWriteAheadLoggingEnabled(z10);
        this.f7031h = aVar.f6964e;
        this.f7025b = aVar.f6967h;
        this.f7026c = new p(aVar.f6968i);
        this.f7029f = aVar.f6965f;
        this.f7030g = z10;
        if (aVar.f6969j) {
            this.f7028e.i(aVar.f6961b, aVar.f6962c);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void m(x3.b bVar) {
        this.f7028e.d(bVar);
    }

    public boolean o() {
        x3.b bVar = this.f7024a;
        if (bVar != null && bVar.isOpen()) {
            return true;
        }
        return false;
    }

    public Cursor p(x3.e eVar) {
        return q(eVar, null);
    }

    public Cursor q(x3.e eVar, CancellationSignal cancellationSignal) {
        a();
        b();
        if (cancellationSignal != null) {
            return this.f7027d.X().n(eVar, cancellationSignal);
        }
        return this.f7027d.X().K0(eVar);
    }

    @Deprecated
    public void r() {
        this.f7027d.X().O();
    }

    /* compiled from: RoomDatabase.java */
    /* loaded from: classes.dex */
    public static abstract class b {
        public void a(x3.b bVar) {
        }

        public void b(x3.b bVar) {
        }

        public void c(x3.b bVar) {
        }
    }
}
