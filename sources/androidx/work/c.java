package androidx.work;

import android.os.Build;

/* compiled from: Constraints.java */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: i  reason: collision with root package name */
    public static final c f7423i = new a().a();

    /* renamed from: a  reason: collision with root package name */
    private m f7424a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f7425b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f7426c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f7427d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f7428e;

    /* renamed from: f  reason: collision with root package name */
    private long f7429f;

    /* renamed from: g  reason: collision with root package name */
    private long f7430g;

    /* renamed from: h  reason: collision with root package name */
    private d f7431h;

    /* compiled from: Constraints.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        boolean f7432a = false;

        /* renamed from: b  reason: collision with root package name */
        boolean f7433b = false;

        /* renamed from: c  reason: collision with root package name */
        m f7434c = m.NOT_REQUIRED;

        /* renamed from: d  reason: collision with root package name */
        boolean f7435d = false;

        /* renamed from: e  reason: collision with root package name */
        boolean f7436e = false;

        /* renamed from: f  reason: collision with root package name */
        long f7437f = -1;

        /* renamed from: g  reason: collision with root package name */
        long f7438g = -1;

        /* renamed from: h  reason: collision with root package name */
        d f7439h = new d();

        public c a() {
            return new c(this);
        }

        public a b(m mVar) {
            this.f7434c = mVar;
            return this;
        }
    }

    public c() {
        this.f7424a = m.NOT_REQUIRED;
        this.f7429f = -1L;
        this.f7430g = -1L;
        this.f7431h = new d();
    }

    public d a() {
        return this.f7431h;
    }

    public m b() {
        return this.f7424a;
    }

    public long c() {
        return this.f7429f;
    }

    public long d() {
        return this.f7430g;
    }

    public boolean e() {
        if (this.f7431h.c() > 0) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f7425b != cVar.f7425b || this.f7426c != cVar.f7426c || this.f7427d != cVar.f7427d || this.f7428e != cVar.f7428e || this.f7429f != cVar.f7429f || this.f7430g != cVar.f7430g || this.f7424a != cVar.f7424a) {
            return false;
        }
        return this.f7431h.equals(cVar.f7431h);
    }

    public boolean f() {
        return this.f7427d;
    }

    public boolean g() {
        return this.f7425b;
    }

    public boolean h() {
        return this.f7426c;
    }

    public int hashCode() {
        int hashCode = ((((((((this.f7424a.hashCode() * 31) + (this.f7425b ? 1 : 0)) * 31) + (this.f7426c ? 1 : 0)) * 31) + (this.f7427d ? 1 : 0)) * 31) + (this.f7428e ? 1 : 0)) * 31;
        long j10 = this.f7429f;
        int i10 = (hashCode + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f7430g;
        return ((i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31) + this.f7431h.hashCode();
    }

    public boolean i() {
        return this.f7428e;
    }

    public void j(d dVar) {
        this.f7431h = dVar;
    }

    public void k(m mVar) {
        this.f7424a = mVar;
    }

    public void l(boolean z10) {
        this.f7427d = z10;
    }

    public void m(boolean z10) {
        this.f7425b = z10;
    }

    public void n(boolean z10) {
        this.f7426c = z10;
    }

    public void o(boolean z10) {
        this.f7428e = z10;
    }

    public void p(long j10) {
        this.f7429f = j10;
    }

    public void q(long j10) {
        this.f7430g = j10;
    }

    c(a aVar) {
        this.f7424a = m.NOT_REQUIRED;
        this.f7429f = -1L;
        this.f7430g = -1L;
        this.f7431h = new d();
        this.f7425b = aVar.f7432a;
        int i10 = Build.VERSION.SDK_INT;
        this.f7426c = i10 >= 23 && aVar.f7433b;
        this.f7424a = aVar.f7434c;
        this.f7427d = aVar.f7435d;
        this.f7428e = aVar.f7436e;
        if (i10 >= 24) {
            this.f7431h = aVar.f7439h;
            this.f7429f = aVar.f7437f;
            this.f7430g = aVar.f7438g;
        }
    }

    public c(c cVar) {
        this.f7424a = m.NOT_REQUIRED;
        this.f7429f = -1L;
        this.f7430g = -1L;
        this.f7431h = new d();
        this.f7425b = cVar.f7425b;
        this.f7426c = cVar.f7426c;
        this.f7424a = cVar.f7424a;
        this.f7427d = cVar.f7427d;
        this.f7428e = cVar.f7428e;
        this.f7431h = cVar.f7431h;
    }
}
