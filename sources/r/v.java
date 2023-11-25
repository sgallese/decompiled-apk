package r;

import j0.g3;
import kotlin.NoWhenBranchMatchedException;
import n1.y0;
import s.e1;
import s.z0;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: EnterExitTransition.kt */
/* loaded from: classes.dex */
public final class v extends a0 {

    /* renamed from: c  reason: collision with root package name */
    private final e1<p>.a<j2.p, s.o> f22028c;

    /* renamed from: d  reason: collision with root package name */
    private final e1<p>.a<j2.l, s.o> f22029d;

    /* renamed from: e  reason: collision with root package name */
    private final g3<m> f22030e;

    /* renamed from: f  reason: collision with root package name */
    private final g3<m> f22031f;

    /* renamed from: g  reason: collision with root package name */
    private final g3<v0.b> f22032g;

    /* renamed from: h  reason: collision with root package name */
    private v0.b f22033h;

    /* renamed from: i  reason: collision with root package name */
    private final pc.l<e1.b<p>, s.e0<j2.p>> f22034i;

    /* compiled from: EnterExitTransition.kt */
    /* loaded from: classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f22035a;

        static {
            int[] iArr = new int[p.values().length];
            try {
                iArr[p.Visible.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p.PreEnter.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p.PostExit.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f22035a = iArr;
        }
    }

    /* compiled from: EnterExitTransition.kt */
    /* loaded from: classes.dex */
    static final class b extends qc.r implements pc.l<y0.a, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ y0 f22036f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ long f22037m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ long f22038p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(y0 y0Var, long j10, long j11) {
            super(1);
            this.f22036f = y0Var;
            this.f22037m = j10;
            this.f22038p = j11;
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ dc.w invoke(y0.a aVar) {
            invoke2(aVar);
            return dc.w.f13270a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(y0.a aVar) {
            qc.q.i(aVar, "$this$layout");
            y0.a.n(aVar, this.f22036f, j2.l.j(this.f22037m) + j2.l.j(this.f22038p), j2.l.k(this.f22037m) + j2.l.k(this.f22038p), 0.0f, 4, null);
        }
    }

    /* compiled from: EnterExitTransition.kt */
    /* loaded from: classes.dex */
    static final class c extends qc.r implements pc.l<p, j2.p> {

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ long f22040m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(long j10) {
            super(1);
            this.f22040m = j10;
        }

        public final long a(p pVar) {
            qc.q.i(pVar, "it");
            return v.this.z(pVar, this.f22040m);
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ j2.p invoke(p pVar) {
            return j2.p.b(a(pVar));
        }
    }

    /* compiled from: EnterExitTransition.kt */
    /* loaded from: classes.dex */
    static final class d extends qc.r implements pc.l<e1.b<p>, s.e0<j2.l>> {

        /* renamed from: f  reason: collision with root package name */
        public static final d f22041f = new d();

        d() {
            super(1);
        }

        @Override // pc.l
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final s.e0<j2.l> invoke(e1.b<p> bVar) {
            z0 z0Var;
            qc.q.i(bVar, "$this$animate");
            z0Var = q.f21982d;
            return z0Var;
        }
    }

    /* compiled from: EnterExitTransition.kt */
    /* loaded from: classes.dex */
    static final class e extends qc.r implements pc.l<p, j2.l> {

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ long f22043m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(long j10) {
            super(1);
            this.f22043m = j10;
        }

        public final long a(p pVar) {
            qc.q.i(pVar, "it");
            return v.this.A(pVar, this.f22043m);
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ j2.l invoke(p pVar) {
            return j2.l.b(a(pVar));
        }
    }

    /* compiled from: EnterExitTransition.kt */
    /* loaded from: classes.dex */
    static final class f extends qc.r implements pc.l<e1.b<p>, s.e0<j2.p>> {
        f() {
            super(1);
        }

        @Override // pc.l
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final s.e0<j2.p> invoke(e1.b<p> bVar) {
            z0 z0Var;
            qc.q.i(bVar, "$this$null");
            p pVar = p.PreEnter;
            p pVar2 = p.Visible;
            s.e0<j2.p> e0Var = null;
            if (bVar.b(pVar, pVar2)) {
                m value = v.this.m().getValue();
                if (value != null) {
                    e0Var = value.b();
                }
            } else if (!bVar.b(pVar2, p.PostExit)) {
                e0Var = q.f21983e;
            } else {
                m value2 = v.this.v().getValue();
                if (value2 != null) {
                    e0Var = value2.b();
                }
            }
            if (e0Var == null) {
                z0Var = q.f21983e;
                return z0Var;
            }
            return e0Var;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public v(e1<p>.a<j2.p, s.o> aVar, e1<p>.a<j2.l, s.o> aVar2, g3<m> g3Var, g3<m> g3Var2, g3<? extends v0.b> g3Var3) {
        qc.q.i(aVar, "sizeAnimation");
        qc.q.i(aVar2, "offsetAnimation");
        qc.q.i(g3Var, "expand");
        qc.q.i(g3Var2, "shrink");
        qc.q.i(g3Var3, "alignment");
        this.f22028c = aVar;
        this.f22029d = aVar2;
        this.f22030e = g3Var;
        this.f22031f = g3Var2;
        this.f22032g = g3Var3;
        this.f22034i = new f();
    }

    public final long A(p pVar, long j10) {
        qc.q.i(pVar, "targetState");
        if (this.f22033h == null) {
            return j2.l.f18992b.a();
        }
        if (this.f22032g.getValue() == null) {
            return j2.l.f18992b.a();
        }
        if (qc.q.d(this.f22033h, this.f22032g.getValue())) {
            return j2.l.f18992b.a();
        }
        int i10 = a.f22035a[pVar.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    m value = this.f22031f.getValue();
                    if (value != null) {
                        long j11 = value.d().invoke(j2.p.b(j10)).j();
                        v0.b value2 = this.f22032g.getValue();
                        qc.q.f(value2);
                        v0.b bVar = value2;
                        j2.r rVar = j2.r.Ltr;
                        long a10 = bVar.a(j10, j11, rVar);
                        v0.b bVar2 = this.f22033h;
                        qc.q.f(bVar2);
                        long a11 = bVar2.a(j10, j11, rVar);
                        return j2.m.a(j2.l.j(a10) - j2.l.j(a11), j2.l.k(a10) - j2.l.k(a11));
                    }
                    return j2.l.f18992b.a();
                }
                throw new NoWhenBranchMatchedException();
            }
            return j2.l.f18992b.a();
        }
        return j2.l.f18992b.a();
    }

    @Override // n1.z
    public n1.j0 d(n1.l0 l0Var, n1.g0 g0Var, long j10) {
        long a10;
        qc.q.i(l0Var, "$this$measure");
        qc.q.i(g0Var, "measurable");
        y0 w10 = g0Var.w(j10);
        long a11 = j2.q.a(w10.A0(), w10.l0());
        long j11 = this.f22028c.a(this.f22034i, new c(a11)).getValue().j();
        long n10 = this.f22029d.a(d.f22041f, new e(a11)).getValue().n();
        v0.b bVar = this.f22033h;
        if (bVar != null) {
            a10 = bVar.a(a11, j11, j2.r.Ltr);
        } else {
            a10 = j2.l.f18992b.a();
        }
        return n1.k0.b(l0Var, j2.p.g(j11), j2.p.f(j11), null, new b(w10, a10, n10), 4, null);
    }

    public final v0.b e() {
        return this.f22033h;
    }

    public final g3<m> m() {
        return this.f22030e;
    }

    public final g3<m> v() {
        return this.f22031f;
    }

    public final void x(v0.b bVar) {
        this.f22033h = bVar;
    }

    public final long z(p pVar, long j10) {
        long j11;
        long j12;
        qc.q.i(pVar, "targetState");
        m value = this.f22030e.getValue();
        if (value != null) {
            j11 = value.d().invoke(j2.p.b(j10)).j();
        } else {
            j11 = j10;
        }
        m value2 = this.f22031f.getValue();
        if (value2 != null) {
            j12 = value2.d().invoke(j2.p.b(j10)).j();
        } else {
            j12 = j10;
        }
        int i10 = a.f22035a[pVar.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    return j12;
                }
                throw new NoWhenBranchMatchedException();
            }
            return j11;
        }
        return j10;
    }
}
