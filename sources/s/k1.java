package s;

import j2.h;
import j2.j;
import j2.l;
import j2.p;
import z0.f;
import z0.h;
import z0.l;

/* compiled from: VectorConverters.kt */
/* loaded from: classes.dex */
public final class k1 {

    /* renamed from: a  reason: collision with root package name */
    private static final i1<Float, s.n> f22727a = a(e.f22740f, f.f22741f);

    /* renamed from: b  reason: collision with root package name */
    private static final i1<Integer, s.n> f22728b = a(k.f22746f, l.f22747f);

    /* renamed from: c  reason: collision with root package name */
    private static final i1<j2.h, s.n> f22729c = a(c.f22738f, d.f22739f);

    /* renamed from: d  reason: collision with root package name */
    private static final i1<j2.j, s.o> f22730d = a(a.f22736f, b.f22737f);

    /* renamed from: e  reason: collision with root package name */
    private static final i1<z0.l, s.o> f22731e = a(q.f22752f, r.f22753f);

    /* renamed from: f  reason: collision with root package name */
    private static final i1<z0.f, s.o> f22732f = a(m.f22748f, n.f22749f);

    /* renamed from: g  reason: collision with root package name */
    private static final i1<j2.l, s.o> f22733g = a(g.f22742f, h.f22743f);

    /* renamed from: h  reason: collision with root package name */
    private static final i1<j2.p, s.o> f22734h = a(i.f22744f, j.f22745f);

    /* renamed from: i  reason: collision with root package name */
    private static final i1<z0.h, s.p> f22735i = a(o.f22750f, p.f22751f);

    /* compiled from: VectorConverters.kt */
    /* loaded from: classes.dex */
    static final class a extends qc.r implements pc.l<j2.j, s.o> {

        /* renamed from: f  reason: collision with root package name */
        public static final a f22736f = new a();

        a() {
            super(1);
        }

        public final s.o a(long j10) {
            return new s.o(j2.j.e(j10), j2.j.f(j10));
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ s.o invoke(j2.j jVar) {
            return a(jVar.i());
        }
    }

    /* compiled from: VectorConverters.kt */
    /* loaded from: classes.dex */
    static final class b extends qc.r implements pc.l<s.o, j2.j> {

        /* renamed from: f  reason: collision with root package name */
        public static final b f22737f = new b();

        b() {
            super(1);
        }

        public final long a(s.o oVar) {
            qc.q.i(oVar, "it");
            return j2.i.a(j2.h.j(oVar.f()), j2.h.j(oVar.g()));
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ j2.j invoke(s.o oVar) {
            return j2.j.b(a(oVar));
        }
    }

    /* compiled from: VectorConverters.kt */
    /* loaded from: classes.dex */
    static final class c extends qc.r implements pc.l<j2.h, s.n> {

        /* renamed from: f  reason: collision with root package name */
        public static final c f22738f = new c();

        c() {
            super(1);
        }

        public final s.n a(float f10) {
            return new s.n(f10);
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ s.n invoke(j2.h hVar) {
            return a(hVar.o());
        }
    }

    /* compiled from: VectorConverters.kt */
    /* loaded from: classes.dex */
    static final class d extends qc.r implements pc.l<s.n, j2.h> {

        /* renamed from: f  reason: collision with root package name */
        public static final d f22739f = new d();

        d() {
            super(1);
        }

        public final float a(s.n nVar) {
            qc.q.i(nVar, "it");
            return j2.h.j(nVar.f());
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ j2.h invoke(s.n nVar) {
            return j2.h.f(a(nVar));
        }
    }

    /* compiled from: VectorConverters.kt */
    /* loaded from: classes.dex */
    static final class e extends qc.r implements pc.l<Float, s.n> {

        /* renamed from: f  reason: collision with root package name */
        public static final e f22740f = new e();

        e() {
            super(1);
        }

        public final s.n a(float f10) {
            return new s.n(f10);
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ s.n invoke(Float f10) {
            return a(f10.floatValue());
        }
    }

    /* compiled from: VectorConverters.kt */
    /* loaded from: classes.dex */
    static final class f extends qc.r implements pc.l<s.n, Float> {

        /* renamed from: f  reason: collision with root package name */
        public static final f f22741f = new f();

        f() {
            super(1);
        }

        @Override // pc.l
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final Float invoke(s.n nVar) {
            qc.q.i(nVar, "it");
            return Float.valueOf(nVar.f());
        }
    }

    /* compiled from: VectorConverters.kt */
    /* loaded from: classes.dex */
    static final class g extends qc.r implements pc.l<j2.l, s.o> {

        /* renamed from: f  reason: collision with root package name */
        public static final g f22742f = new g();

        g() {
            super(1);
        }

        public final s.o a(long j10) {
            return new s.o(j2.l.j(j10), j2.l.k(j10));
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ s.o invoke(j2.l lVar) {
            return a(lVar.n());
        }
    }

    /* compiled from: VectorConverters.kt */
    /* loaded from: classes.dex */
    static final class h extends qc.r implements pc.l<s.o, j2.l> {

        /* renamed from: f  reason: collision with root package name */
        public static final h f22743f = new h();

        h() {
            super(1);
        }

        public final long a(s.o oVar) {
            int d10;
            int d11;
            qc.q.i(oVar, "it");
            d10 = sc.c.d(oVar.f());
            d11 = sc.c.d(oVar.g());
            return j2.m.a(d10, d11);
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ j2.l invoke(s.o oVar) {
            return j2.l.b(a(oVar));
        }
    }

    /* compiled from: VectorConverters.kt */
    /* loaded from: classes.dex */
    static final class i extends qc.r implements pc.l<j2.p, s.o> {

        /* renamed from: f  reason: collision with root package name */
        public static final i f22744f = new i();

        i() {
            super(1);
        }

        public final s.o a(long j10) {
            return new s.o(j2.p.g(j10), j2.p.f(j10));
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ s.o invoke(j2.p pVar) {
            return a(pVar.j());
        }
    }

    /* compiled from: VectorConverters.kt */
    /* loaded from: classes.dex */
    static final class j extends qc.r implements pc.l<s.o, j2.p> {

        /* renamed from: f  reason: collision with root package name */
        public static final j f22745f = new j();

        j() {
            super(1);
        }

        public final long a(s.o oVar) {
            int d10;
            int d11;
            qc.q.i(oVar, "it");
            d10 = sc.c.d(oVar.f());
            d11 = sc.c.d(oVar.g());
            return j2.q.a(d10, d11);
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ j2.p invoke(s.o oVar) {
            return j2.p.b(a(oVar));
        }
    }

    /* compiled from: VectorConverters.kt */
    /* loaded from: classes.dex */
    static final class k extends qc.r implements pc.l<Integer, s.n> {

        /* renamed from: f  reason: collision with root package name */
        public static final k f22746f = new k();

        k() {
            super(1);
        }

        public final s.n a(int i10) {
            return new s.n(i10);
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ s.n invoke(Integer num) {
            return a(num.intValue());
        }
    }

    /* compiled from: VectorConverters.kt */
    /* loaded from: classes.dex */
    static final class l extends qc.r implements pc.l<s.n, Integer> {

        /* renamed from: f  reason: collision with root package name */
        public static final l f22747f = new l();

        l() {
            super(1);
        }

        @Override // pc.l
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final Integer invoke(s.n nVar) {
            qc.q.i(nVar, "it");
            return Integer.valueOf((int) nVar.f());
        }
    }

    /* compiled from: VectorConverters.kt */
    /* loaded from: classes.dex */
    static final class m extends qc.r implements pc.l<z0.f, s.o> {

        /* renamed from: f  reason: collision with root package name */
        public static final m f22748f = new m();

        m() {
            super(1);
        }

        public final s.o a(long j10) {
            return new s.o(z0.f.o(j10), z0.f.p(j10));
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ s.o invoke(z0.f fVar) {
            return a(fVar.x());
        }
    }

    /* compiled from: VectorConverters.kt */
    /* loaded from: classes.dex */
    static final class n extends qc.r implements pc.l<s.o, z0.f> {

        /* renamed from: f  reason: collision with root package name */
        public static final n f22749f = new n();

        n() {
            super(1);
        }

        public final long a(s.o oVar) {
            qc.q.i(oVar, "it");
            return z0.g.a(oVar.f(), oVar.g());
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ z0.f invoke(s.o oVar) {
            return z0.f.d(a(oVar));
        }
    }

    /* compiled from: VectorConverters.kt */
    /* loaded from: classes.dex */
    static final class o extends qc.r implements pc.l<z0.h, s.p> {

        /* renamed from: f  reason: collision with root package name */
        public static final o f22750f = new o();

        o() {
            super(1);
        }

        @Override // pc.l
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final s.p invoke(z0.h hVar) {
            qc.q.i(hVar, "it");
            return new s.p(hVar.i(), hVar.l(), hVar.j(), hVar.e());
        }
    }

    /* compiled from: VectorConverters.kt */
    /* loaded from: classes.dex */
    static final class p extends qc.r implements pc.l<s.p, z0.h> {

        /* renamed from: f  reason: collision with root package name */
        public static final p f22751f = new p();

        p() {
            super(1);
        }

        @Override // pc.l
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final z0.h invoke(s.p pVar) {
            qc.q.i(pVar, "it");
            return new z0.h(pVar.f(), pVar.g(), pVar.h(), pVar.i());
        }
    }

    /* compiled from: VectorConverters.kt */
    /* loaded from: classes.dex */
    static final class q extends qc.r implements pc.l<z0.l, s.o> {

        /* renamed from: f  reason: collision with root package name */
        public static final q f22752f = new q();

        q() {
            super(1);
        }

        public final s.o a(long j10) {
            return new s.o(z0.l.i(j10), z0.l.g(j10));
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ s.o invoke(z0.l lVar) {
            return a(lVar.m());
        }
    }

    /* compiled from: VectorConverters.kt */
    /* loaded from: classes.dex */
    static final class r extends qc.r implements pc.l<s.o, z0.l> {

        /* renamed from: f  reason: collision with root package name */
        public static final r f22753f = new r();

        r() {
            super(1);
        }

        public final long a(s.o oVar) {
            qc.q.i(oVar, "it");
            return z0.m.a(oVar.f(), oVar.g());
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ z0.l invoke(s.o oVar) {
            return z0.l.c(a(oVar));
        }
    }

    public static final <T, V extends s.q> i1<T, V> a(pc.l<? super T, ? extends V> lVar, pc.l<? super V, ? extends T> lVar2) {
        qc.q.i(lVar, "convertToVector");
        qc.q.i(lVar2, "convertFromVector");
        return new j1(lVar, lVar2);
    }

    public static final i1<j2.h, s.n> b(h.a aVar) {
        qc.q.i(aVar, "<this>");
        return f22729c;
    }

    public static final i1<j2.j, s.o> c(j.a aVar) {
        qc.q.i(aVar, "<this>");
        return f22730d;
    }

    public static final i1<j2.l, s.o> d(l.a aVar) {
        qc.q.i(aVar, "<this>");
        return f22733g;
    }

    public static final i1<j2.p, s.o> e(p.a aVar) {
        qc.q.i(aVar, "<this>");
        return f22734h;
    }

    public static final i1<Float, s.n> f(qc.j jVar) {
        qc.q.i(jVar, "<this>");
        return f22727a;
    }

    public static final i1<Integer, s.n> g(qc.p pVar) {
        qc.q.i(pVar, "<this>");
        return f22728b;
    }

    public static final i1<z0.f, s.o> h(f.a aVar) {
        qc.q.i(aVar, "<this>");
        return f22732f;
    }

    public static final i1<z0.h, s.p> i(h.a aVar) {
        qc.q.i(aVar, "<this>");
        return f22735i;
    }

    public static final i1<z0.l, s.o> j(l.a aVar) {
        qc.q.i(aVar, "<this>");
        return f22731e;
    }

    public static final float k(float f10, float f11, float f12) {
        return (f10 * (1 - f12)) + (f11 * f12);
    }
}
