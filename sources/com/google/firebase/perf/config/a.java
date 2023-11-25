package com.google.firebase.perf.config;

import android.content.Context;

/* compiled from: ConfigResolver.java */
/* loaded from: classes3.dex */
public class a {

    /* renamed from: d  reason: collision with root package name */
    private static final v9.a f11766d = v9.a.e();

    /* renamed from: e  reason: collision with root package name */
    private static volatile a f11767e;

    /* renamed from: a  reason: collision with root package name */
    private final RemoteConfigManager f11768a;

    /* renamed from: b  reason: collision with root package name */
    private com.google.firebase.perf.util.f f11769b;

    /* renamed from: c  reason: collision with root package name */
    private x f11770c;

    public a(RemoteConfigManager remoteConfigManager, com.google.firebase.perf.util.f fVar, x xVar) {
        this.f11768a = remoteConfigManager == null ? RemoteConfigManager.getInstance() : remoteConfigManager;
        this.f11769b = fVar == null ? new com.google.firebase.perf.util.f() : fVar;
        this.f11770c = xVar == null ? x.e() : xVar;
    }

    private boolean H(long j10) {
        if (j10 >= 0) {
            return true;
        }
        return false;
    }

    private boolean I(String str) {
        if (str.trim().isEmpty()) {
            return false;
        }
        for (String str2 : str.split(";")) {
            if (str2.trim().equals(s9.a.f23041b)) {
                return true;
            }
        }
        return false;
    }

    private boolean J(long j10) {
        if (j10 >= 0) {
            return true;
        }
        return false;
    }

    private boolean L(float f10) {
        if (0.0f <= f10 && f10 <= 1.0f) {
            return true;
        }
        return false;
    }

    private boolean M(long j10) {
        if (j10 > 0) {
            return true;
        }
        return false;
    }

    private boolean N(long j10) {
        if (j10 > 0) {
            return true;
        }
        return false;
    }

    private com.google.firebase.perf.util.g<Boolean> b(v<Boolean> vVar) {
        return this.f11770c.b(vVar.a());
    }

    private com.google.firebase.perf.util.g<Float> c(v<Float> vVar) {
        return this.f11770c.d(vVar.a());
    }

    private com.google.firebase.perf.util.g<Long> d(v<Long> vVar) {
        return this.f11770c.f(vVar.a());
    }

    private com.google.firebase.perf.util.g<String> e(v<String> vVar) {
        return this.f11770c.g(vVar.a());
    }

    public static synchronized a g() {
        a aVar;
        synchronized (a.class) {
            if (f11767e == null) {
                f11767e = new a(null, null, null);
            }
            aVar = f11767e;
        }
        return aVar;
    }

    private boolean k() {
        l e10 = l.e();
        com.google.firebase.perf.util.g<Boolean> u10 = u(e10);
        if (u10.d()) {
            if (this.f11768a.isLastFetchFailed()) {
                return false;
            }
            this.f11770c.m(e10.a(), u10.c().booleanValue());
            return u10.c().booleanValue();
        }
        com.google.firebase.perf.util.g<Boolean> b10 = b(e10);
        if (b10.d()) {
            return b10.c().booleanValue();
        }
        return e10.d().booleanValue();
    }

    private boolean l() {
        k e10 = k.e();
        com.google.firebase.perf.util.g<String> x10 = x(e10);
        if (x10.d()) {
            this.f11770c.l(e10.a(), x10.c());
            return I(x10.c());
        }
        com.google.firebase.perf.util.g<String> e11 = e(e10);
        if (e11.d()) {
            return I(e11.c());
        }
        return I(e10.d());
    }

    private com.google.firebase.perf.util.g<Boolean> n(v<Boolean> vVar) {
        return this.f11769b.b(vVar.b());
    }

    private com.google.firebase.perf.util.g<Float> o(v<Float> vVar) {
        return this.f11769b.c(vVar.b());
    }

    private com.google.firebase.perf.util.g<Long> p(v<Long> vVar) {
        return this.f11769b.e(vVar.b());
    }

    private com.google.firebase.perf.util.g<Boolean> u(v<Boolean> vVar) {
        return this.f11768a.getBoolean(vVar.c());
    }

    private com.google.firebase.perf.util.g<Float> v(v<Float> vVar) {
        return this.f11768a.getFloat(vVar.c());
    }

    private com.google.firebase.perf.util.g<Long> w(v<Long> vVar) {
        return this.f11768a.getLong(vVar.c());
    }

    private com.google.firebase.perf.util.g<String> x(v<String> vVar) {
        return this.f11768a.getString(vVar.c());
    }

    public long A() {
        o e10 = o.e();
        com.google.firebase.perf.util.g<Long> p10 = p(e10);
        if (p10.d() && M(p10.c().longValue())) {
            return p10.c().longValue();
        }
        com.google.firebase.perf.util.g<Long> w10 = w(e10);
        if (w10.d() && M(w10.c().longValue())) {
            this.f11770c.k(e10.a(), w10.c().longValue());
            return w10.c().longValue();
        }
        com.google.firebase.perf.util.g<Long> d10 = d(e10);
        if (d10.d() && M(d10.c().longValue())) {
            return d10.c().longValue();
        }
        return e10.d().longValue();
    }

    public long B() {
        p e10 = p.e();
        com.google.firebase.perf.util.g<Long> p10 = p(e10);
        if (p10.d() && J(p10.c().longValue())) {
            return p10.c().longValue();
        }
        com.google.firebase.perf.util.g<Long> w10 = w(e10);
        if (w10.d() && J(w10.c().longValue())) {
            this.f11770c.k(e10.a(), w10.c().longValue());
            return w10.c().longValue();
        }
        com.google.firebase.perf.util.g<Long> d10 = d(e10);
        if (d10.d() && J(d10.c().longValue())) {
            return d10.c().longValue();
        }
        return e10.d().longValue();
    }

    public long C() {
        q e10 = q.e();
        com.google.firebase.perf.util.g<Long> p10 = p(e10);
        if (p10.d() && J(p10.c().longValue())) {
            return p10.c().longValue();
        }
        com.google.firebase.perf.util.g<Long> w10 = w(e10);
        if (w10.d() && J(w10.c().longValue())) {
            this.f11770c.k(e10.a(), w10.c().longValue());
            return w10.c().longValue();
        }
        com.google.firebase.perf.util.g<Long> d10 = d(e10);
        if (d10.d() && J(d10.c().longValue())) {
            return d10.c().longValue();
        }
        return e10.d().longValue();
    }

    public float D() {
        r e10 = r.e();
        com.google.firebase.perf.util.g<Float> o10 = o(e10);
        if (o10.d()) {
            float floatValue = o10.c().floatValue() / 100.0f;
            if (L(floatValue)) {
                return floatValue;
            }
        }
        com.google.firebase.perf.util.g<Float> v10 = v(e10);
        if (v10.d() && L(v10.c().floatValue())) {
            this.f11770c.j(e10.a(), v10.c().floatValue());
            return v10.c().floatValue();
        }
        com.google.firebase.perf.util.g<Float> c10 = c(e10);
        if (c10.d() && L(c10.c().floatValue())) {
            return c10.c().floatValue();
        }
        return e10.d().floatValue();
    }

    public long E() {
        s e10 = s.e();
        com.google.firebase.perf.util.g<Long> w10 = w(e10);
        if (w10.d() && H(w10.c().longValue())) {
            this.f11770c.k(e10.a(), w10.c().longValue());
            return w10.c().longValue();
        }
        com.google.firebase.perf.util.g<Long> d10 = d(e10);
        if (d10.d() && H(d10.c().longValue())) {
            return d10.c().longValue();
        }
        return e10.d().longValue();
    }

    public long F() {
        t e10 = t.e();
        com.google.firebase.perf.util.g<Long> w10 = w(e10);
        if (w10.d() && H(w10.c().longValue())) {
            this.f11770c.k(e10.a(), w10.c().longValue());
            return w10.c().longValue();
        }
        com.google.firebase.perf.util.g<Long> d10 = d(e10);
        if (d10.d() && H(d10.c().longValue())) {
            return d10.c().longValue();
        }
        return e10.d().longValue();
    }

    public float G() {
        u e10 = u.e();
        com.google.firebase.perf.util.g<Float> v10 = v(e10);
        if (v10.d() && L(v10.c().floatValue())) {
            this.f11770c.j(e10.a(), v10.c().floatValue());
            return v10.c().floatValue();
        }
        com.google.firebase.perf.util.g<Float> c10 = c(e10);
        if (c10.d() && L(c10.c().floatValue())) {
            return c10.c().floatValue();
        }
        return e10.d().floatValue();
    }

    public boolean K() {
        Boolean j10 = j();
        if ((j10 == null || j10.booleanValue()) && m()) {
            return true;
        }
        return false;
    }

    public void O(Context context) {
        f11766d.i(com.google.firebase.perf.util.n.b(context));
        this.f11770c.i(context);
    }

    public void P(com.google.firebase.perf.util.f fVar) {
        this.f11769b = fVar;
    }

    public String a() {
        String f10;
        f e10 = f.e();
        if (s9.a.f23040a.booleanValue()) {
            return e10.d();
        }
        String c10 = e10.c();
        long j10 = -1;
        if (c10 != null) {
            j10 = ((Long) this.f11768a.getRemoteConfigValueOrDefault(c10, -1L)).longValue();
        }
        String a10 = e10.a();
        if (f.g(j10) && (f10 = f.f(j10)) != null) {
            this.f11770c.l(a10, f10);
            return f10;
        }
        com.google.firebase.perf.util.g<String> e11 = e(e10);
        if (e11.d()) {
            return e11.c();
        }
        return e10.d();
    }

    public float f() {
        e e10 = e.e();
        com.google.firebase.perf.util.g<Float> o10 = o(e10);
        if (o10.d()) {
            float floatValue = o10.c().floatValue() / 100.0f;
            if (L(floatValue)) {
                return floatValue;
            }
        }
        com.google.firebase.perf.util.g<Float> v10 = v(e10);
        if (v10.d() && L(v10.c().floatValue())) {
            this.f11770c.j(e10.a(), v10.c().floatValue());
            return v10.c().floatValue();
        }
        com.google.firebase.perf.util.g<Float> c10 = c(e10);
        if (c10.d() && L(c10.c().floatValue())) {
            return c10.c().floatValue();
        }
        return e10.d().floatValue();
    }

    public boolean h() {
        d e10 = d.e();
        com.google.firebase.perf.util.g<Boolean> n10 = n(e10);
        if (n10.d()) {
            return n10.c().booleanValue();
        }
        com.google.firebase.perf.util.g<Boolean> u10 = u(e10);
        if (u10.d()) {
            this.f11770c.m(e10.a(), u10.c().booleanValue());
            return u10.c().booleanValue();
        }
        com.google.firebase.perf.util.g<Boolean> b10 = b(e10);
        if (b10.d()) {
            return b10.c().booleanValue();
        }
        return e10.d().booleanValue();
    }

    public Boolean i() {
        b e10 = b.e();
        com.google.firebase.perf.util.g<Boolean> n10 = n(e10);
        if (n10.d()) {
            return n10.c();
        }
        return e10.d();
    }

    public Boolean j() {
        if (i().booleanValue()) {
            return Boolean.FALSE;
        }
        c d10 = c.d();
        com.google.firebase.perf.util.g<Boolean> b10 = b(d10);
        if (b10.d()) {
            return b10.c();
        }
        com.google.firebase.perf.util.g<Boolean> n10 = n(d10);
        if (n10.d()) {
            return n10.c();
        }
        return null;
    }

    public boolean m() {
        if (k() && !l()) {
            return true;
        }
        return false;
    }

    public long q() {
        g e10 = g.e();
        com.google.firebase.perf.util.g<Long> w10 = w(e10);
        if (w10.d() && H(w10.c().longValue())) {
            this.f11770c.k(e10.a(), w10.c().longValue());
            return w10.c().longValue();
        }
        com.google.firebase.perf.util.g<Long> d10 = d(e10);
        if (d10.d() && H(d10.c().longValue())) {
            return d10.c().longValue();
        }
        return e10.d().longValue();
    }

    public long r() {
        h e10 = h.e();
        com.google.firebase.perf.util.g<Long> w10 = w(e10);
        if (w10.d() && H(w10.c().longValue())) {
            this.f11770c.k(e10.a(), w10.c().longValue());
            return w10.c().longValue();
        }
        com.google.firebase.perf.util.g<Long> d10 = d(e10);
        if (d10.d() && H(d10.c().longValue())) {
            return d10.c().longValue();
        }
        return e10.d().longValue();
    }

    public float s() {
        i e10 = i.e();
        com.google.firebase.perf.util.g<Float> v10 = v(e10);
        if (v10.d() && L(v10.c().floatValue())) {
            this.f11770c.j(e10.a(), v10.c().floatValue());
            return v10.c().floatValue();
        }
        com.google.firebase.perf.util.g<Float> c10 = c(e10);
        if (c10.d() && L(c10.c().floatValue())) {
            return c10.c().floatValue();
        }
        return e10.d().floatValue();
    }

    public long t() {
        j e10 = j.e();
        com.google.firebase.perf.util.g<Long> w10 = w(e10);
        if (w10.d() && N(w10.c().longValue())) {
            this.f11770c.k(e10.a(), w10.c().longValue());
            return w10.c().longValue();
        }
        com.google.firebase.perf.util.g<Long> d10 = d(e10);
        if (d10.d() && N(d10.c().longValue())) {
            return d10.c().longValue();
        }
        return e10.d().longValue();
    }

    public long y() {
        m e10 = m.e();
        com.google.firebase.perf.util.g<Long> p10 = p(e10);
        if (p10.d() && J(p10.c().longValue())) {
            return p10.c().longValue();
        }
        com.google.firebase.perf.util.g<Long> w10 = w(e10);
        if (w10.d() && J(w10.c().longValue())) {
            this.f11770c.k(e10.a(), w10.c().longValue());
            return w10.c().longValue();
        }
        com.google.firebase.perf.util.g<Long> d10 = d(e10);
        if (d10.d() && J(d10.c().longValue())) {
            return d10.c().longValue();
        }
        return e10.d().longValue();
    }

    public long z() {
        n e10 = n.e();
        com.google.firebase.perf.util.g<Long> p10 = p(e10);
        if (p10.d() && J(p10.c().longValue())) {
            return p10.c().longValue();
        }
        com.google.firebase.perf.util.g<Long> w10 = w(e10);
        if (w10.d() && J(w10.c().longValue())) {
            this.f11770c.k(e10.a(), w10.c().longValue());
            return w10.c().longValue();
        }
        com.google.firebase.perf.util.g<Long> d10 = d(e10);
        if (d10.d() && J(d10.c().longValue())) {
            return d10.c().longValue();
        }
        return e10.d().longValue();
    }
}
