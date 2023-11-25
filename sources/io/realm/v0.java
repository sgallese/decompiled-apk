package io.realm;

import android.content.Context;
import io.realm.exceptions.RealmException;
import io.realm.internal.OsRealmConfig;
import io.realm.internal.Util;
import io.realm.o0;
import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;

/* compiled from: RealmConfiguration.java */
/* loaded from: classes4.dex */
public class v0 {

    /* renamed from: s  reason: collision with root package name */
    private static final Object f18312s;

    /* renamed from: t  reason: collision with root package name */
    protected static final io.realm.internal.p f18313t;

    /* renamed from: a  reason: collision with root package name */
    private final File f18314a;

    /* renamed from: b  reason: collision with root package name */
    private final String f18315b;

    /* renamed from: c  reason: collision with root package name */
    private final String f18316c;

    /* renamed from: d  reason: collision with root package name */
    private final String f18317d;

    /* renamed from: e  reason: collision with root package name */
    private final byte[] f18318e;

    /* renamed from: f  reason: collision with root package name */
    private final long f18319f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f18320g;

    /* renamed from: h  reason: collision with root package name */
    private final OsRealmConfig.c f18321h;

    /* renamed from: i  reason: collision with root package name */
    private final io.realm.internal.p f18322i;

    /* renamed from: j  reason: collision with root package name */
    private final bc.c f18323j;

    /* renamed from: k  reason: collision with root package name */
    private final ub.a f18324k;

    /* renamed from: l  reason: collision with root package name */
    private final o0.a f18325l;

    /* renamed from: m  reason: collision with root package name */
    private final boolean f18326m;

    /* renamed from: n  reason: collision with root package name */
    private final CompactOnLaunchCallback f18327n;

    /* renamed from: o  reason: collision with root package name */
    private final long f18328o;

    /* renamed from: p  reason: collision with root package name */
    private final boolean f18329p;

    /* renamed from: q  reason: collision with root package name */
    private final boolean f18330q;

    /* renamed from: r  reason: collision with root package name */
    private final boolean f18331r;

    /* compiled from: RealmConfiguration.java */
    /* loaded from: classes4.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private File f18332a;

        /* renamed from: b  reason: collision with root package name */
        private String f18333b;

        /* renamed from: c  reason: collision with root package name */
        private String f18334c;

        /* renamed from: d  reason: collision with root package name */
        private byte[] f18335d;

        /* renamed from: e  reason: collision with root package name */
        private long f18336e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f18337f;

        /* renamed from: g  reason: collision with root package name */
        private OsRealmConfig.c f18338g;

        /* renamed from: h  reason: collision with root package name */
        private HashSet<Object> f18339h;

        /* renamed from: i  reason: collision with root package name */
        private HashSet<Class<? extends a1>> f18340i;

        /* renamed from: j  reason: collision with root package name */
        private boolean f18341j;

        /* renamed from: k  reason: collision with root package name */
        private bc.c f18342k;

        /* renamed from: l  reason: collision with root package name */
        private ub.a f18343l;

        /* renamed from: m  reason: collision with root package name */
        private o0.a f18344m;

        /* renamed from: n  reason: collision with root package name */
        private boolean f18345n;

        /* renamed from: o  reason: collision with root package name */
        private CompactOnLaunchCallback f18346o;

        /* renamed from: p  reason: collision with root package name */
        private long f18347p;

        /* renamed from: q  reason: collision with root package name */
        private boolean f18348q;

        /* renamed from: r  reason: collision with root package name */
        private boolean f18349r;

        public a() {
            this(io.realm.a.f17234u);
        }

        private void e(Context context) {
            this.f18332a = context.getFilesDir();
            this.f18333b = "default.realm";
            this.f18335d = null;
            this.f18336e = 0L;
            this.f18337f = false;
            this.f18338g = OsRealmConfig.c.FULL;
            this.f18345n = false;
            this.f18346o = null;
            if (v0.f18312s != null) {
                this.f18339h.add(v0.f18312s);
            }
            this.f18348q = false;
            this.f18349r = true;
        }

        public a a(boolean z10) {
            this.f18348q = z10;
            return this;
        }

        public v0 b() {
            if (this.f18345n) {
                if (this.f18344m == null) {
                    if (this.f18334c != null) {
                        if (!this.f18337f) {
                            if (this.f18346o != null) {
                                throw new IllegalStateException("'compactOnLaunch()' and read-only Realms cannot be combined");
                            }
                        } else {
                            throw new IllegalStateException("'deleteRealmIfMigrationNeeded()' and read-only Realms cannot be combined");
                        }
                    } else {
                        throw new IllegalStateException("Only Realms provided using 'assetFile(path)' can be marked read-only. No such Realm was provided.");
                    }
                } else {
                    throw new IllegalStateException("This Realm is marked as read-only. Read-only Realms cannot use initialData(Realm.Transaction).");
                }
            }
            if (this.f18342k == null && Util.h()) {
                this.f18342k = new bc.b(true);
            }
            if (this.f18343l == null && Util.f()) {
                this.f18343l = new ub.b(Boolean.TRUE);
            }
            return new v0(new File(this.f18332a, this.f18333b), this.f18334c, this.f18335d, this.f18336e, null, this.f18337f, this.f18338g, v0.b(this.f18339h, this.f18340i, this.f18341j), this.f18342k, this.f18343l, this.f18344m, this.f18345n, this.f18346o, false, this.f18347p, this.f18348q, this.f18349r);
        }

        public a c(CompactOnLaunchCallback compactOnLaunchCallback) {
            if (compactOnLaunchCallback != null) {
                this.f18346o = compactOnLaunchCallback;
                return this;
            }
            throw new IllegalArgumentException("A non-null compactOnLaunch must be provided");
        }

        public a d() {
            String str = this.f18334c;
            if (str != null && str.length() != 0) {
                throw new IllegalStateException("Realm cannot clear its schema when previously configured to use an asset file by calling assetFile().");
            }
            this.f18337f = true;
            return this;
        }

        public a f(long j10) {
            if (j10 >= 0) {
                this.f18336e = j10;
                return this;
            }
            throw new IllegalArgumentException("Realm schema version numbers must be 0 (zero) or higher. Yours was: " + j10);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(Context context) {
            this.f18339h = new HashSet<>();
            this.f18340i = new HashSet<>();
            this.f18341j = false;
            this.f18347p = Long.MAX_VALUE;
            if (context != null) {
                io.realm.internal.n.a(context);
                e(context);
                return;
            }
            throw new IllegalStateException("Call `Realm.init(Context)` before creating a RealmConfiguration");
        }
    }

    static {
        Object a12 = o0.a1();
        f18312s = a12;
        if (a12 != null) {
            io.realm.internal.p k10 = k(a12.getClass().getCanonicalName());
            if (k10.u()) {
                f18313t = k10;
                return;
            }
            throw new ExceptionInInitializerError("RealmTransformer doesn't seem to be applied. Please update the project configuration to use the Realm Gradle plugin. See https://docs.mongodb.com/realm/sdk/android/install/#customize-dependecies-defined-by-the-realm-gradle-plugin");
        }
        f18313t = null;
    }

    protected v0(File file, String str, byte[] bArr, long j10, z0 z0Var, boolean z10, OsRealmConfig.c cVar, io.realm.internal.p pVar, bc.c cVar2, ub.a aVar, o0.a aVar2, boolean z11, CompactOnLaunchCallback compactOnLaunchCallback, boolean z12, long j11, boolean z13, boolean z14) {
        this.f18314a = file.getParentFile();
        this.f18315b = file.getName();
        this.f18316c = file.getAbsolutePath();
        this.f18317d = str;
        this.f18318e = bArr;
        this.f18319f = j10;
        this.f18320g = z10;
        this.f18321h = cVar;
        this.f18322i = pVar;
        this.f18323j = cVar2;
        this.f18324k = aVar;
        this.f18325l = aVar2;
        this.f18326m = z11;
        this.f18327n = compactOnLaunchCallback;
        this.f18331r = z12;
        this.f18328o = j11;
        this.f18329p = z13;
        this.f18330q = z14;
    }

    protected static io.realm.internal.p b(Set<Object> set, Set<Class<? extends a1>> set2, boolean z10) {
        if (set2.size() > 0) {
            return new yb.b(f18313t, set2, z10);
        }
        if (set.size() == 1) {
            return k(set.iterator().next().getClass().getCanonicalName());
        }
        io.realm.internal.p[] pVarArr = new io.realm.internal.p[set.size()];
        Iterator<Object> it = set.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            pVarArr[i10] = k(it.next().getClass().getCanonicalName());
            i10++;
        }
        return new yb.a(pVarArr);
    }

    private static io.realm.internal.p k(String str) {
        String[] split = str.split("\\.");
        String format = String.format(Locale.US, "io.realm.%s%s", split[split.length - 1], "Mediator");
        try {
            Constructor<?> constructor = Class.forName(format).getDeclaredConstructors()[0];
            constructor.setAccessible(true);
            return (io.realm.internal.p) constructor.newInstance(new Object[0]);
        } catch (ClassNotFoundException e10) {
            throw new RealmException("Could not find " + format, e10);
        } catch (IllegalAccessException e11) {
            throw new RealmException("Could not create an instance of " + format, e11);
        } catch (InstantiationException e12) {
            throw new RealmException("Could not create an instance of " + format, e12);
        } catch (InvocationTargetException e13) {
            throw new RealmException("Could not create an instance of " + format, e13);
        }
    }

    public String c() {
        return this.f18317d;
    }

    public CompactOnLaunchCallback d() {
        return this.f18327n;
    }

    public OsRealmConfig.c e() {
        return this.f18321h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        v0 v0Var = (v0) obj;
        if (this.f18319f != v0Var.f18319f || this.f18320g != v0Var.f18320g || this.f18326m != v0Var.f18326m || this.f18331r != v0Var.f18331r) {
            return false;
        }
        File file = this.f18314a;
        if (file == null ? v0Var.f18314a != null : !file.equals(v0Var.f18314a)) {
            return false;
        }
        String str = this.f18315b;
        if (str == null ? v0Var.f18315b != null : !str.equals(v0Var.f18315b)) {
            return false;
        }
        if (!this.f18316c.equals(v0Var.f18316c)) {
            return false;
        }
        String str2 = this.f18317d;
        if (str2 == null ? v0Var.f18317d != null : !str2.equals(v0Var.f18317d)) {
            return false;
        }
        if (!Arrays.equals(this.f18318e, v0Var.f18318e) || this.f18321h != v0Var.f18321h || !this.f18322i.equals(v0Var.f18322i)) {
            return false;
        }
        bc.c cVar = this.f18323j;
        if (cVar == null ? v0Var.f18323j != null : !cVar.equals(v0Var.f18323j)) {
            return false;
        }
        o0.a aVar = this.f18325l;
        if (aVar == null ? v0Var.f18325l != null : !aVar.equals(v0Var.f18325l)) {
            return false;
        }
        CompactOnLaunchCallback compactOnLaunchCallback = this.f18327n;
        if (compactOnLaunchCallback == null ? v0Var.f18327n != null : !compactOnLaunchCallback.equals(v0Var.f18327n)) {
            return false;
        }
        if (this.f18328o == v0Var.f18328o) {
            return true;
        }
        return false;
    }

    public byte[] f() {
        byte[] bArr = this.f18318e;
        if (bArr == null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }

    public ub.a g() {
        ub.a aVar = this.f18324k;
        if (aVar != null) {
            return aVar;
        }
        throw new UnsupportedOperationException("The coroutines framework is missing from the classpath. Remember to add it as an implementation dependency. See https://github.com/Kotlin/kotlinx.coroutines#android for more details");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public o0.a h() {
        return this.f18325l;
    }

    public int hashCode() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        File file = this.f18314a;
        int i15 = 0;
        if (file != null) {
            i10 = file.hashCode();
        } else {
            i10 = 0;
        }
        int i16 = i10 * 31;
        String str = this.f18315b;
        if (str != null) {
            i11 = str.hashCode();
        } else {
            i11 = 0;
        }
        int hashCode = (((i16 + i11) * 31) + this.f18316c.hashCode()) * 31;
        String str2 = this.f18317d;
        if (str2 != null) {
            i12 = str2.hashCode();
        } else {
            i12 = 0;
        }
        int hashCode2 = (((hashCode + i12) * 31) + Arrays.hashCode(this.f18318e)) * 31;
        long j10 = this.f18319f;
        int hashCode3 = (((((((((hashCode2 + ((int) (j10 ^ (j10 >>> 32)))) * 31) + 0) * 31) + (this.f18320g ? 1 : 0)) * 31) + this.f18321h.hashCode()) * 31) + this.f18322i.hashCode()) * 31;
        bc.c cVar = this.f18323j;
        if (cVar != null) {
            i13 = cVar.hashCode();
        } else {
            i13 = 0;
        }
        int i17 = (hashCode3 + i13) * 31;
        o0.a aVar = this.f18325l;
        if (aVar != null) {
            i14 = aVar.hashCode();
        } else {
            i14 = 0;
        }
        int i18 = (((i17 + i14) * 31) + (this.f18326m ? 1 : 0)) * 31;
        CompactOnLaunchCallback compactOnLaunchCallback = this.f18327n;
        if (compactOnLaunchCallback != null) {
            i15 = compactOnLaunchCallback.hashCode();
        }
        int i19 = (((i18 + i15) * 31) + (this.f18331r ? 1 : 0)) * 31;
        long j11 = this.f18328o;
        return i19 + ((int) (j11 ^ (j11 >>> 32)));
    }

    public long i() {
        return this.f18328o;
    }

    public z0 j() {
        return null;
    }

    public String l() {
        return this.f18316c;
    }

    public File m() {
        return this.f18314a;
    }

    public String n() {
        return this.f18315b;
    }

    public bc.c o() {
        bc.c cVar = this.f18323j;
        if (cVar != null) {
            return cVar;
        }
        throw new UnsupportedOperationException("RxJava seems to be missing from the classpath. Remember to add it as an implementation dependency. See https://github.com/realm/realm-java/tree/master/examples/rxJavaExample for more details.");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public io.realm.internal.p p() {
        return this.f18322i;
    }

    public long q() {
        return this.f18319f;
    }

    public boolean r() {
        return !Util.g(this.f18317d);
    }

    public boolean s() {
        return this.f18330q;
    }

    public boolean t() {
        return this.f18329p;
    }

    public String toString() {
        String str;
        int i10;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("realmDirectory: ");
        File file = this.f18314a;
        if (file != null) {
            str = file.toString();
        } else {
            str = "";
        }
        sb2.append(str);
        sb2.append("\n");
        sb2.append("realmFileName : ");
        sb2.append(this.f18315b);
        sb2.append("\n");
        sb2.append("canonicalPath: ");
        sb2.append(this.f18316c);
        sb2.append("\n");
        sb2.append("key: ");
        sb2.append("[length: ");
        if (this.f18318e == null) {
            i10 = 0;
        } else {
            i10 = 64;
        }
        sb2.append(i10);
        sb2.append("]");
        sb2.append("\n");
        sb2.append("schemaVersion: ");
        sb2.append(Long.toString(this.f18319f));
        sb2.append("\n");
        sb2.append("migration: ");
        sb2.append((Object) null);
        sb2.append("\n");
        sb2.append("deleteRealmIfMigrationNeeded: ");
        sb2.append(this.f18320g);
        sb2.append("\n");
        sb2.append("durability: ");
        sb2.append(this.f18321h);
        sb2.append("\n");
        sb2.append("schemaMediator: ");
        sb2.append(this.f18322i);
        sb2.append("\n");
        sb2.append("readOnly: ");
        sb2.append(this.f18326m);
        sb2.append("\n");
        sb2.append("compactOnLaunch: ");
        sb2.append(this.f18327n);
        sb2.append("\n");
        sb2.append("maxNumberOfActiveVersions: ");
        sb2.append(this.f18328o);
        return sb2.toString();
    }

    public boolean u() {
        return this.f18326m;
    }

    public boolean v() {
        return this.f18331r;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean w() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean x() {
        return new File(this.f18316c).exists();
    }

    public boolean y() {
        return this.f18320g;
    }
}
