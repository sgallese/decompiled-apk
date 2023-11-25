package t0;

import java.util.Set;

/* compiled from: Snapshot.kt */
/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: e  reason: collision with root package name */
    public static final a f23297e = new a(null);

    /* renamed from: f  reason: collision with root package name */
    public static final int f23298f = 8;

    /* renamed from: a  reason: collision with root package name */
    private j f23299a;

    /* renamed from: b  reason: collision with root package name */
    private int f23300b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f23301c;

    /* renamed from: d  reason: collision with root package name */
    private int f23302d;

    /* compiled from: Snapshot.kt */
    /* loaded from: classes.dex */
    public static final class a {

        /* compiled from: Snapshot.kt */
        /* renamed from: t0.g$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        static final class C0548a implements e {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ pc.p<Set<? extends Object>, g, dc.w> f23303a;

            /* JADX WARN: Multi-variable type inference failed */
            C0548a(pc.p<? super Set<? extends Object>, ? super g, dc.w> pVar) {
                this.f23303a = pVar;
            }

            @Override // t0.e
            public final void dispose() {
                pc.p<Set<? extends Object>, g, dc.w> pVar = this.f23303a;
                synchronized (l.G()) {
                    l.e().remove(pVar);
                    dc.w wVar = dc.w.f13270a;
                }
            }
        }

        /* compiled from: Snapshot.kt */
        /* loaded from: classes.dex */
        static final class b implements e {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ pc.l<Object, dc.w> f23304a;

            b(pc.l<Object, dc.w> lVar) {
                this.f23304a = lVar;
            }

            @Override // t0.e
            public final void dispose() {
                pc.l<Object, dc.w> lVar = this.f23304a;
                synchronized (l.G()) {
                    l.h().remove(lVar);
                }
                l.b();
            }
        }

        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }

        public final g a() {
            return l.C((g) l.k().a(), null, false, 6, null);
        }

        public final g b() {
            return l.F();
        }

        public final void c() {
            l.F().o();
        }

        public final <T> T d(pc.l<Object, dc.w> lVar, pc.l<Object, dc.w> lVar2, pc.a<? extends T> aVar) {
            t0.b bVar;
            g g0Var;
            qc.q.i(aVar, "block");
            if (lVar == null && lVar2 == null) {
                return aVar.invoke();
            }
            g gVar = (g) l.k().a();
            if (gVar != null && !(gVar instanceof t0.b)) {
                if (lVar == null) {
                    return aVar.invoke();
                }
                g0Var = gVar.x(lVar);
            } else {
                if (gVar instanceof t0.b) {
                    bVar = (t0.b) gVar;
                } else {
                    bVar = null;
                }
                g0Var = new g0(bVar, lVar, lVar2, true, false);
            }
            try {
                g l10 = g0Var.l();
                try {
                    return aVar.invoke();
                } finally {
                    g0Var.s(l10);
                }
            } finally {
                g0Var.d();
            }
        }

        public final e e(pc.p<? super Set<? extends Object>, ? super g, dc.w> pVar) {
            qc.q.i(pVar, "observer");
            l.a(l.g());
            synchronized (l.G()) {
                l.e().add(pVar);
            }
            return new C0548a(pVar);
        }

        public final e f(pc.l<Object, dc.w> lVar) {
            qc.q.i(lVar, "observer");
            synchronized (l.G()) {
                l.h().add(lVar);
            }
            l.b();
            return new b(lVar);
        }

        public final void g() {
            boolean z10;
            synchronized (l.G()) {
                k0.c<d0> E = ((androidx.compose.runtime.snapshots.a) l.f().get()).E();
                z10 = false;
                if (E != null) {
                    if (E.k()) {
                        z10 = true;
                    }
                }
            }
            if (z10) {
                l.b();
            }
        }

        public final t0.b h(pc.l<Object, dc.w> lVar, pc.l<Object, dc.w> lVar2) {
            t0.b bVar;
            t0.b P;
            g F = l.F();
            if (F instanceof t0.b) {
                bVar = (t0.b) F;
            } else {
                bVar = null;
            }
            if (bVar != null && (P = bVar.P(lVar, lVar2)) != null) {
                return P;
            }
            throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot".toString());
        }

        public final g i(pc.l<Object, dc.w> lVar) {
            return l.F().x(lVar);
        }
    }

    public /* synthetic */ g(int i10, j jVar, qc.h hVar) {
        this(i10, jVar);
    }

    public final void b() {
        synchronized (l.G()) {
            c();
            r();
            dc.w wVar = dc.w.f13270a;
        }
    }

    public void c() {
        l.t(l.j().k(f()));
    }

    public void d() {
        this.f23301c = true;
        synchronized (l.G()) {
            q();
            dc.w wVar = dc.w.f13270a;
        }
    }

    public final boolean e() {
        return this.f23301c;
    }

    public int f() {
        return this.f23300b;
    }

    public j g() {
        return this.f23299a;
    }

    public abstract pc.l<Object, dc.w> h();

    public abstract boolean i();

    public int j() {
        return 0;
    }

    public abstract pc.l<Object, dc.w> k();

    public g l() {
        g gVar = (g) l.k().a();
        l.k().b(this);
        return gVar;
    }

    public abstract void m(g gVar);

    public abstract void n(g gVar);

    public abstract void o();

    public abstract void p(d0 d0Var);

    public final void q() {
        int i10 = this.f23302d;
        if (i10 >= 0) {
            l.W(i10);
            this.f23302d = -1;
        }
    }

    public void r() {
        q();
    }

    public void s(g gVar) {
        l.k().b(gVar);
    }

    public final void t(boolean z10) {
        this.f23301c = z10;
    }

    public void u(int i10) {
        this.f23300b = i10;
    }

    public void v(j jVar) {
        qc.q.i(jVar, "<set-?>");
        this.f23299a = jVar;
    }

    public void w(int i10) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot".toString());
    }

    public abstract g x(pc.l<Object, dc.w> lVar);

    public final int y() {
        int i10 = this.f23302d;
        this.f23302d = -1;
        return i10;
    }

    public final void z() {
        if ((!this.f23301c) != false) {
            return;
        }
        throw new IllegalArgumentException("Cannot use a disposed snapshot".toString());
    }

    private g(int i10, j jVar) {
        this.f23299a = jVar;
        this.f23300b = i10;
        this.f23302d = i10 != 0 ? l.a0(i10, g()) : -1;
    }
}
