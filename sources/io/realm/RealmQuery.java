package io.realm;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import io.realm.internal.OsList;
import io.realm.internal.OsResults;
import io.realm.internal.Table;
import io.realm.internal.TableQuery;
import io.realm.internal.Util;
import java.util.Date;

/* loaded from: classes4.dex */
public class RealmQuery<E> {

    /* renamed from: a  reason: collision with root package name */
    private final Table f17226a;

    /* renamed from: b  reason: collision with root package name */
    private final a f17227b;

    /* renamed from: c  reason: collision with root package name */
    private final TableQuery f17228c;

    /* renamed from: d  reason: collision with root package name */
    private final f1 f17229d;

    /* renamed from: e  reason: collision with root package name */
    private Class<E> f17230e;

    /* renamed from: f  reason: collision with root package name */
    private String f17231f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f17232g;

    /* renamed from: h  reason: collision with root package name */
    private final io.realm.internal.k f17233h;

    private RealmQuery(o0 o0Var, Class<E> cls) {
        this.f17227b = o0Var;
        this.f17230e = cls;
        boolean z10 = !x(cls);
        this.f17232g = z10;
        if (!z10) {
            f1 h10 = o0Var.R().h(cls);
            this.f17229d = h10;
            Table e10 = h10.e();
            this.f17226a = e10;
            this.f17233h = null;
            this.f17228c = e10.J();
            return;
        }
        throw new UnsupportedOperationException("Queries on primitive lists are not yet supported");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <E extends a1> RealmQuery<E> f(o0 o0Var, Class<E> cls) {
        return new RealmQuery<>(o0Var, cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <E> RealmQuery<E> g(x0<E> x0Var) {
        if (x0Var.f18407f == null) {
            return new RealmQuery<>(x0Var.f18410q, x0Var.m(), x0Var.f18408m);
        }
        return new RealmQuery<>(x0Var.f18410q, x0Var.m(), x0Var.f18407f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <E> RealmQuery<E> h(g1<E> g1Var) {
        Class<E> cls = g1Var.f17619m;
        if (cls == null) {
            return new RealmQuery<>((g1<p>) g1Var, g1Var.f17620p);
        }
        return new RealmQuery<>(g1Var, cls);
    }

    private g1<E> i(TableQuery tableQuery, boolean z10) {
        g1<E> g1Var;
        OsResults f10 = OsResults.f(this.f17227b.f17242r, tableQuery);
        if (y()) {
            g1Var = new g1<>(this.f17227b, f10, this.f17231f);
        } else {
            g1Var = new g1<>(this.f17227b, f10, this.f17230e);
        }
        if (z10) {
            g1Var.n();
        }
        return g1Var;
    }

    private static native String nativeSerializeQuery(long j10);

    private long r() {
        return this.f17228c.j();
    }

    private static boolean x(Class<?> cls) {
        return a1.class.isAssignableFrom(cls);
    }

    private boolean y() {
        if (this.f17231f != null) {
            return true;
        }
        return false;
    }

    public RealmQuery<E> A(String str) {
        this.f17227b.e();
        this.f17228c.q(this.f17227b.R().g(), str);
        return this;
    }

    public RealmQuery<E> B(String str, double d10) {
        this.f17227b.e();
        this.f17228c.r(this.f17227b.R().g(), str, p0.g(Double.valueOf(d10)));
        return this;
    }

    public RealmQuery<E> C(String str, Date date) {
        this.f17227b.e();
        this.f17228c.r(this.f17227b.R().g(), str, p0.j(date));
        return this;
    }

    public RealmQuery<E> D(String str, Date date) {
        this.f17227b.e();
        this.f17228c.s(this.f17227b.R().g(), str, p0.j(date));
        return this;
    }

    public RealmQuery<E> E(String str, p0 p0Var, f fVar) {
        this.f17227b.e();
        if (fVar == f.SENSITIVE) {
            this.f17228c.t(this.f17227b.R().g(), str, p0Var);
        } else {
            this.f17228c.u(this.f17227b.R().g(), str, p0Var);
        }
        return this;
    }

    public RealmQuery<E> F(String str, String str2) {
        return G(str, str2, f.SENSITIVE);
    }

    public RealmQuery<E> G(String str, String str2, f fVar) {
        this.f17227b.e();
        E(str, p0.i(str2), fVar);
        return this;
    }

    public RealmQuery<E> H() {
        this.f17227b.e();
        this.f17228c.v();
        return this;
    }

    public RealmQuery<E> I(String str) {
        this.f17227b.e();
        return J(str, j1.ASCENDING);
    }

    public RealmQuery<E> J(String str, j1 j1Var) {
        this.f17227b.e();
        return L(new String[]{str}, new j1[]{j1Var});
    }

    public RealmQuery<E> K(String str, j1 j1Var, String str2, j1 j1Var2) {
        this.f17227b.e();
        return L(new String[]{str, str2}, new j1[]{j1Var, j1Var2});
    }

    public RealmQuery<E> L(String[] strArr, j1[] j1VarArr) {
        if (j1VarArr != null && j1VarArr.length != 0) {
            if (strArr.length == j1VarArr.length) {
                this.f17227b.e();
                this.f17228c.y(this.f17227b.R().g(), strArr, j1VarArr);
                return this;
            }
            throw new IllegalArgumentException("Number of fields and sort orders do not match.");
        }
        throw new IllegalArgumentException("You must provide at least one sort order.");
    }

    public RealmQuery<E> a() {
        this.f17227b.e();
        this.f17228c.a();
        return this;
    }

    public RealmQuery<E> b() {
        this.f17227b.e();
        this.f17228c.b();
        return this;
    }

    public RealmQuery<E> c(String str, p0 p0Var, f fVar) {
        this.f17227b.e();
        if (fVar == f.SENSITIVE) {
            this.f17228c.d(this.f17227b.R().g(), str, p0Var);
        } else {
            this.f17228c.e(this.f17227b.R().g(), str, p0Var);
        }
        return this;
    }

    public RealmQuery<E> d(String str, String str2) {
        return e(str, str2, f.SENSITIVE);
    }

    public RealmQuery<E> e(String str, String str2, f fVar) {
        Util.c(str2, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        this.f17227b.e();
        c(str, p0.i(str2), fVar);
        return this;
    }

    public RealmQuery<E> j() {
        this.f17227b.e();
        this.f17228c.f();
        return this;
    }

    public RealmQuery<E> k(String str, p0 p0Var, f fVar) {
        this.f17227b.e();
        if (fVar == f.SENSITIVE) {
            this.f17228c.g(this.f17227b.R().g(), str, p0Var);
        } else {
            this.f17228c.h(this.f17227b.R().g(), str, p0Var);
        }
        return this;
    }

    public RealmQuery<E> l(String str, Boolean bool) {
        this.f17227b.e();
        this.f17228c.g(this.f17227b.R().g(), str, p0.f(bool));
        return this;
    }

    public RealmQuery<E> m(String str, Integer num) {
        this.f17227b.e();
        this.f17228c.g(this.f17227b.R().g(), str, p0.h(num));
        return this;
    }

    public RealmQuery<E> n(String str, String str2) {
        return o(str, str2, f.SENSITIVE);
    }

    public RealmQuery<E> o(String str, String str2, f fVar) {
        this.f17227b.e();
        k(str, p0.i(str2), fVar);
        return this;
    }

    public g1<E> p() {
        this.f17227b.e();
        this.f17227b.c();
        return i(this.f17228c, true);
    }

    public E q() {
        this.f17227b.e();
        this.f17227b.c();
        if (this.f17232g) {
            return null;
        }
        long r10 = r();
        if (r10 < 0) {
            return null;
        }
        return (E) this.f17227b.E(this.f17230e, this.f17231f, r10);
    }

    public RealmQuery<E> s(String str, Date date) {
        this.f17227b.e();
        this.f17228c.l(this.f17227b.R().g(), str, p0.j(date));
        return this;
    }

    public RealmQuery<E> t(String str, double d10) {
        this.f17227b.e();
        this.f17228c.m(this.f17227b.R().g(), str, p0.g(Double.valueOf(d10)));
        return this;
    }

    public RealmQuery<E> u(String str, Date date) {
        this.f17227b.e();
        this.f17228c.m(this.f17227b.R().g(), str, p0.j(date));
        return this;
    }

    public RealmQuery<E> v(String str, String[] strArr) {
        return w(str, strArr, f.SENSITIVE);
    }

    public RealmQuery<E> w(String str, String[] strArr, f fVar) {
        this.f17227b.e();
        if (strArr != null && strArr.length != 0) {
            p0[] p0VarArr = new p0[strArr.length];
            for (int i10 = 0; i10 < strArr.length; i10++) {
                String str2 = strArr[i10];
                if (str2 != null) {
                    p0VarArr[i10] = p0.i(str2);
                } else {
                    p0VarArr[i10] = null;
                }
            }
            if (fVar == f.SENSITIVE) {
                this.f17228c.n(this.f17227b.R().g(), str, p0VarArr);
            } else {
                this.f17228c.o(this.f17227b.R().g(), str, p0VarArr);
            }
        } else {
            a();
        }
        return this;
    }

    public RealmQuery<E> z(String str) {
        this.f17227b.e();
        this.f17228c.p(this.f17227b.R().g(), str);
        return this;
    }

    private RealmQuery(g1<E> g1Var, Class<E> cls) {
        a aVar = g1Var.f17618f;
        this.f17227b = aVar;
        this.f17230e = cls;
        boolean z10 = !x(cls);
        this.f17232g = z10;
        if (!z10) {
            this.f17229d = aVar.R().h(cls);
            this.f17226a = g1Var.i();
            this.f17233h = null;
            this.f17228c = g1Var.h().t();
            return;
        }
        throw new UnsupportedOperationException("Queries on primitive lists are not yet supported");
    }

    private RealmQuery(a aVar, OsList osList, Class<E> cls) {
        this.f17227b = aVar;
        this.f17230e = cls;
        boolean z10 = !x(cls);
        this.f17232g = z10;
        if (!z10) {
            f1 h10 = aVar.R().h(cls);
            this.f17229d = h10;
            this.f17226a = h10.e();
            this.f17233h = osList;
            this.f17228c = osList.r();
            return;
        }
        throw new UnsupportedOperationException("Queries on primitive lists are not yet supported");
    }

    private RealmQuery(g1<p> g1Var, String str) {
        a aVar = g1Var.f17618f;
        this.f17227b = aVar;
        this.f17231f = str;
        this.f17232g = false;
        f1 i10 = aVar.R().i(str);
        this.f17229d = i10;
        this.f17226a = i10.e();
        this.f17228c = g1Var.h().t();
        this.f17233h = null;
    }

    private RealmQuery(a aVar, OsList osList, String str) {
        this.f17227b = aVar;
        this.f17231f = str;
        this.f17232g = false;
        f1 i10 = aVar.R().i(str);
        this.f17229d = i10;
        this.f17226a = i10.e();
        this.f17228c = osList.r();
        this.f17233h = osList;
    }
}
