package k1;

import j0.d3;
import j0.j1;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PointerIcon.kt */
/* loaded from: classes.dex */
public final class y implements w, o1.k<y>, o1.d {

    /* renamed from: c  reason: collision with root package name */
    private w f19290c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f19291d;

    /* renamed from: e  reason: collision with root package name */
    private pc.l<? super w, dc.w> f19292e;

    /* renamed from: f  reason: collision with root package name */
    private final j1 f19293f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f19294g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f19295h;

    /* renamed from: i  reason: collision with root package name */
    private final o1.m<y> f19296i;

    /* renamed from: j  reason: collision with root package name */
    private final y f19297j;

    public y(w wVar, boolean z10, pc.l<? super w, dc.w> lVar) {
        j1 e10;
        o1.m<y> mVar;
        qc.q.i(wVar, "icon");
        qc.q.i(lVar, "onSetIcon");
        this.f19290c = wVar;
        this.f19291d = z10;
        this.f19292e = lVar;
        e10 = d3.e(null, null, 2, null);
        this.f19293f = e10;
        mVar = x.f19273a;
        this.f19296i = mVar;
        this.f19297j = this;
    }

    private final boolean A() {
        boolean z10;
        if (this.f19291d) {
            return true;
        }
        y x10 = x();
        if (x10 != null && x10.A()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return true;
        }
        return false;
    }

    private final void B() {
        this.f19294g = true;
        y x10 = x();
        if (x10 != null) {
            x10.B();
        }
    }

    private final void C() {
        this.f19294g = false;
        if (this.f19295h) {
            this.f19292e.invoke(this.f19290c);
        } else if (x() == null) {
            this.f19292e.invoke(null);
        } else {
            y x10 = x();
            if (x10 != null) {
                x10.C();
            }
        }
    }

    private final void D(y yVar) {
        this.f19293f.setValue(yVar);
    }

    private final void v(y yVar) {
        if (this.f19295h) {
            if (yVar == null) {
                this.f19292e.invoke(null);
            } else {
                yVar.C();
            }
        }
        this.f19295h = false;
    }

    private final y x() {
        return (y) this.f19293f.getValue();
    }

    public final boolean E() {
        y x10 = x();
        if (x10 != null && x10.A()) {
            return false;
        }
        return true;
    }

    public final void F(w wVar, boolean z10, pc.l<? super w, dc.w> lVar) {
        qc.q.i(wVar, "icon");
        qc.q.i(lVar, "onSetIcon");
        if (!qc.q.d(this.f19290c, wVar) && this.f19295h && !this.f19294g) {
            lVar.invoke(wVar);
        }
        this.f19290c = wVar;
        this.f19291d = z10;
        this.f19292e = lVar;
    }

    @Override // androidx.compose.ui.e
    public /* synthetic */ androidx.compose.ui.e a(androidx.compose.ui.e eVar) {
        return v0.d.a(this, eVar);
    }

    @Override // androidx.compose.ui.e
    public /* synthetic */ Object b(Object obj, pc.p pVar) {
        return v0.e.b(this, obj, pVar);
    }

    public final void e() {
        this.f19295h = true;
        if (!this.f19294g) {
            y x10 = x();
            if (x10 != null) {
                x10.B();
            }
            this.f19292e.invoke(this.f19290c);
        }
    }

    @Override // o1.k
    public o1.m<y> getKey() {
        return this.f19296i;
    }

    @Override // androidx.compose.ui.e
    public /* synthetic */ boolean h(pc.l lVar) {
        return v0.e.a(this, lVar);
    }

    public final void m() {
        v(x());
    }

    @Override // o1.d
    public void o(o1.l lVar) {
        o1.m mVar;
        qc.q.i(lVar, "scope");
        y x10 = x();
        mVar = x.f19273a;
        D((y) lVar.o(mVar));
        if (x10 != null && x() == null) {
            v(x10);
            this.f19292e = a.f19298f;
        }
    }

    @Override // o1.k
    /* renamed from: z  reason: merged with bridge method [inline-methods] */
    public y getValue() {
        return this.f19297j;
    }

    /* compiled from: PointerIcon.kt */
    /* loaded from: classes.dex */
    static final class a extends qc.r implements pc.l<w, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        public static final a f19298f = new a();

        a() {
            super(1);
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ dc.w invoke(w wVar) {
            a(wVar);
            return dc.w.f13270a;
        }

        public final void a(w wVar) {
        }
    }
}
