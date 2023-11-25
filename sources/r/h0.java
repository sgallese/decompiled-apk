package r;

import j0.g3;
import kotlin.NoWhenBranchMatchedException;
import n1.y0;
import s.e1;
import s.z0;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: EnterExitTransition.kt */
/* loaded from: classes.dex */
public final class h0 extends a0 {

    /* renamed from: c  reason: collision with root package name */
    private final e1<p>.a<j2.l, s.o> f21895c;

    /* renamed from: d  reason: collision with root package name */
    private final g3<g0> f21896d;

    /* renamed from: e  reason: collision with root package name */
    private final g3<g0> f21897e;

    /* renamed from: f  reason: collision with root package name */
    private final pc.l<e1.b<p>, s.e0<j2.l>> f21898f;

    /* compiled from: EnterExitTransition.kt */
    /* loaded from: classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f21899a;

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
            f21899a = iArr;
        }
    }

    /* compiled from: EnterExitTransition.kt */
    /* loaded from: classes.dex */
    static final class b extends qc.r implements pc.l<y0.a, dc.w> {

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ y0 f21901m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ long f21902p;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: EnterExitTransition.kt */
        /* loaded from: classes.dex */
        public static final class a extends qc.r implements pc.l<p, j2.l> {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ h0 f21903f;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ long f21904m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(h0 h0Var, long j10) {
                super(1);
                this.f21903f = h0Var;
                this.f21904m = j10;
            }

            public final long a(p pVar) {
                qc.q.i(pVar, "it");
                return this.f21903f.z(pVar, this.f21904m);
            }

            @Override // pc.l
            public /* bridge */ /* synthetic */ j2.l invoke(p pVar) {
                return j2.l.b(a(pVar));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(y0 y0Var, long j10) {
            super(1);
            this.f21901m = y0Var;
            this.f21902p = j10;
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ dc.w invoke(y0.a aVar) {
            invoke2(aVar);
            return dc.w.f13270a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(y0.a aVar) {
            qc.q.i(aVar, "$this$layout");
            y0.a.z(aVar, this.f21901m, h0.this.e().a(h0.this.x(), new a(h0.this, this.f21902p)).getValue().n(), 0.0f, null, 6, null);
        }
    }

    /* compiled from: EnterExitTransition.kt */
    /* loaded from: classes.dex */
    static final class c extends qc.r implements pc.l<e1.b<p>, s.e0<j2.l>> {
        c() {
            super(1);
        }

        @Override // pc.l
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final s.e0<j2.l> invoke(e1.b<p> bVar) {
            z0 z0Var;
            z0 z0Var2;
            s.e0<j2.l> a10;
            z0 z0Var3;
            s.e0<j2.l> a11;
            qc.q.i(bVar, "$this$null");
            p pVar = p.PreEnter;
            p pVar2 = p.Visible;
            if (bVar.b(pVar, pVar2)) {
                g0 value = h0.this.m().getValue();
                if (value == null || (a11 = value.a()) == null) {
                    z0Var3 = q.f21982d;
                    return z0Var3;
                }
                return a11;
            } else if (!bVar.b(pVar2, p.PostExit)) {
                z0Var = q.f21982d;
                return z0Var;
            } else {
                g0 value2 = h0.this.v().getValue();
                if (value2 == null || (a10 = value2.a()) == null) {
                    z0Var2 = q.f21982d;
                    return z0Var2;
                }
                return a10;
            }
        }
    }

    public h0(e1<p>.a<j2.l, s.o> aVar, g3<g0> g3Var, g3<g0> g3Var2) {
        qc.q.i(aVar, "lazyAnimation");
        qc.q.i(g3Var, "slideIn");
        qc.q.i(g3Var2, "slideOut");
        this.f21895c = aVar;
        this.f21896d = g3Var;
        this.f21897e = g3Var2;
        this.f21898f = new c();
    }

    @Override // n1.z
    public n1.j0 d(n1.l0 l0Var, n1.g0 g0Var, long j10) {
        qc.q.i(l0Var, "$this$measure");
        qc.q.i(g0Var, "measurable");
        y0 w10 = g0Var.w(j10);
        return n1.k0.b(l0Var, w10.A0(), w10.l0(), null, new b(w10, j2.q.a(w10.A0(), w10.l0())), 4, null);
    }

    public final e1<p>.a<j2.l, s.o> e() {
        return this.f21895c;
    }

    public final g3<g0> m() {
        return this.f21896d;
    }

    public final g3<g0> v() {
        return this.f21897e;
    }

    public final pc.l<e1.b<p>, s.e0<j2.l>> x() {
        return this.f21898f;
    }

    public final long z(p pVar, long j10) {
        long a10;
        long a11;
        pc.l<j2.p, j2.l> b10;
        pc.l<j2.p, j2.l> b11;
        qc.q.i(pVar, "targetState");
        g0 value = this.f21896d.getValue();
        if (value != null && (b11 = value.b()) != null) {
            a10 = b11.invoke(j2.p.b(j10)).n();
        } else {
            a10 = j2.l.f18992b.a();
        }
        g0 value2 = this.f21897e.getValue();
        if (value2 != null && (b10 = value2.b()) != null) {
            a11 = b10.invoke(j2.p.b(j10)).n();
        } else {
            a11 = j2.l.f18992b.a();
        }
        int i10 = a.f21899a[pVar.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    return a11;
                }
                throw new NoWhenBranchMatchedException();
            }
            return a10;
        }
        return j2.l.f18992b.a();
    }
}
