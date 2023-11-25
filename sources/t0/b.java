package t0;

import java.util.List;

/* compiled from: Snapshot.kt */
/* loaded from: classes.dex */
public class b extends g {

    /* renamed from: p  reason: collision with root package name */
    private static final a f23269p = new a(null);

    /* renamed from: q  reason: collision with root package name */
    public static final int f23270q = 8;

    /* renamed from: r  reason: collision with root package name */
    private static final int[] f23271r = new int[0];

    /* renamed from: g  reason: collision with root package name */
    private final pc.l<Object, dc.w> f23272g;

    /* renamed from: h  reason: collision with root package name */
    private final pc.l<Object, dc.w> f23273h;

    /* renamed from: i  reason: collision with root package name */
    private int f23274i;

    /* renamed from: j  reason: collision with root package name */
    private k0.c<d0> f23275j;

    /* renamed from: k  reason: collision with root package name */
    private List<? extends d0> f23276k;

    /* renamed from: l  reason: collision with root package name */
    private j f23277l;

    /* renamed from: m  reason: collision with root package name */
    private int[] f23278m;

    /* renamed from: n  reason: collision with root package name */
    private int f23279n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f23280o;

    /* compiled from: Snapshot.kt */
    /* loaded from: classes.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(int i10, j jVar, pc.l<Object, dc.w> lVar, pc.l<Object, dc.w> lVar2) {
        super(i10, jVar, null);
        qc.q.i(jVar, "invalid");
        this.f23272g = lVar;
        this.f23273h = lVar2;
        this.f23277l = j.f23321r.a();
        this.f23278m = f23271r;
        this.f23279n = 1;
    }

    private final void A() {
        boolean T;
        k0.c<d0> E = E();
        if (E != null) {
            Q();
            O(null);
            int f10 = f();
            Object[] j10 = E.j();
            int size = E.size();
            for (int i10 = 0; i10 < size; i10++) {
                Object obj = j10[i10];
                qc.q.g(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                for (e0 e10 = ((d0) obj).e(); e10 != null; e10 = e10.e()) {
                    if (e10.f() != f10) {
                        T = ec.b0.T(this.f23277l, Integer.valueOf(e10.f()));
                        if (!T) {
                        }
                    }
                    e10.h(0);
                }
            }
        }
        b();
    }

    private final void M() {
        int length = this.f23278m.length;
        for (int i10 = 0; i10 < length; i10++) {
            l.W(this.f23278m[i10]);
        }
    }

    private final void Q() {
        if ((!this.f23280o) != false) {
            return;
        }
        throw new IllegalStateException("Unsupported operation on a snapshot that has been applied".toString());
    }

    private final void R() {
        int i10;
        boolean z10;
        boolean z11 = true;
        if (this.f23280o) {
            i10 = ((g) this).f23302d;
            if (i10 >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                z11 = false;
            }
        }
        if (z11) {
            return;
        }
        throw new IllegalStateException("Unsupported operation on a disposed or applied snapshot".toString());
    }

    public final void B() {
        int i10;
        I(f());
        dc.w wVar = dc.w.f13270a;
        if (!D() && !e()) {
            int f10 = f();
            synchronized (l.G()) {
                i10 = l.f23337e;
                l.f23337e = i10 + 1;
                u(i10);
                l.f23336d = l.f23336d.o(f());
            }
            v(l.x(g(), f10 + 1, f()));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00c0 A[Catch: all -> 0x0178, TryCatch #1 {, blocks: (B:8:0x003b, B:10:0x0042, B:13:0x0049, B:17:0x0071, B:28:0x00cc, B:18:0x0095, B:20:0x00b4, B:26:0x00c0), top: B:78:0x003b }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0119 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public t0.h C() {
        /*
            Method dump skipped, instructions count: 379
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.b.C():t0.h");
    }

    public final boolean D() {
        return this.f23280o;
    }

    public k0.c<d0> E() {
        return this.f23275j;
    }

    public final j F() {
        return this.f23277l;
    }

    public final int[] G() {
        return this.f23278m;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0048, code lost:
    
        r15 = t0.l.U(r12, f(), r3);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final t0.h H(int r18, java.util.Map<t0.e0, ? extends t0.e0> r19, t0.j r20) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.b.H(int, java.util.Map, t0.j):t0.h");
    }

    public final void I(int i10) {
        synchronized (l.G()) {
            this.f23277l = this.f23277l.o(i10);
            dc.w wVar = dc.w.f13270a;
        }
    }

    public final void J(j jVar) {
        qc.q.i(jVar, "snapshots");
        synchronized (l.G()) {
            this.f23277l = this.f23277l.n(jVar);
            dc.w wVar = dc.w.f13270a;
        }
    }

    public final void K(int i10) {
        int[] v10;
        if (i10 >= 0) {
            v10 = ec.o.v(this.f23278m, i10);
            this.f23278m = v10;
        }
    }

    public final void L(int[] iArr) {
        boolean z10;
        qc.q.i(iArr, "handles");
        boolean z11 = true;
        if (iArr.length == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return;
        }
        int[] iArr2 = this.f23278m;
        if (iArr2.length != 0) {
            z11 = false;
        }
        if (!z11) {
            iArr = ec.o.w(iArr2, iArr);
        }
        this.f23278m = iArr;
    }

    public final void N(boolean z10) {
        this.f23280o = z10;
    }

    public void O(k0.c<d0> cVar) {
        this.f23275j = cVar;
    }

    public b P(pc.l<Object, dc.w> lVar, pc.l<Object, dc.w> lVar2) {
        int i10;
        c cVar;
        pc.l K;
        int i11;
        z();
        R();
        I(f());
        synchronized (l.G()) {
            i10 = l.f23337e;
            l.f23337e = i10 + 1;
            l.f23336d = l.f23336d.o(i10);
            j g10 = g();
            v(g10.o(i10));
            j x10 = l.x(g10, f() + 1, i10);
            pc.l J = l.J(lVar, h(), false, 4, null);
            K = l.K(lVar2, k());
            cVar = new c(i10, x10, J, K, this);
        }
        if (!D() && !e()) {
            int f10 = f();
            synchronized (l.G()) {
                i11 = l.f23337e;
                l.f23337e = i11 + 1;
                u(i11);
                l.f23336d = l.f23336d.o(f());
                dc.w wVar = dc.w.f13270a;
            }
            v(l.x(g(), f10 + 1, f()));
        }
        return cVar;
    }

    @Override // t0.g
    public void c() {
        l.f23336d = l.f23336d.k(f()).j(this.f23277l);
    }

    @Override // t0.g
    public void d() {
        if (!e()) {
            super.d();
            n(this);
        }
    }

    @Override // t0.g
    public pc.l<Object, dc.w> h() {
        return this.f23272g;
    }

    @Override // t0.g
    public boolean i() {
        return false;
    }

    @Override // t0.g
    public int j() {
        return this.f23274i;
    }

    @Override // t0.g
    public pc.l<Object, dc.w> k() {
        return this.f23273h;
    }

    @Override // t0.g
    public void m(g gVar) {
        qc.q.i(gVar, "snapshot");
        this.f23279n++;
    }

    @Override // t0.g
    public void n(g gVar) {
        boolean z10;
        qc.q.i(gVar, "snapshot");
        int i10 = this.f23279n;
        if (i10 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            int i11 = i10 - 1;
            this.f23279n = i11;
            if (i11 == 0 && !this.f23280o) {
                A();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @Override // t0.g
    public void o() {
        if (!this.f23280o && !e()) {
            B();
        }
    }

    @Override // t0.g
    public void p(d0 d0Var) {
        qc.q.i(d0Var, "state");
        k0.c<d0> E = E();
        if (E == null) {
            E = new k0.c<>();
            O(E);
        }
        E.add(d0Var);
    }

    @Override // t0.g
    public void r() {
        M();
        super.r();
    }

    @Override // t0.g
    public void w(int i10) {
        this.f23274i = i10;
    }

    @Override // t0.g
    public g x(pc.l<Object, dc.w> lVar) {
        int i10;
        d dVar;
        int i11;
        z();
        R();
        int f10 = f();
        I(f());
        synchronized (l.G()) {
            i10 = l.f23337e;
            l.f23337e = i10 + 1;
            l.f23336d = l.f23336d.o(i10);
            dVar = new d(i10, l.x(g(), f10 + 1, i10), lVar, this);
        }
        if (!D() && !e()) {
            int f11 = f();
            synchronized (l.G()) {
                i11 = l.f23337e;
                l.f23337e = i11 + 1;
                u(i11);
                l.f23336d = l.f23336d.o(f());
                dc.w wVar = dc.w.f13270a;
            }
            v(l.x(g(), f11 + 1, f()));
        }
        return dVar;
    }
}
