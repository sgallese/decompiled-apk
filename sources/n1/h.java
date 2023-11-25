package n1;

/* compiled from: Layout.kt */
/* loaded from: classes.dex */
public final class h implements g0 {

    /* renamed from: f  reason: collision with root package name */
    private final m f19974f;

    /* renamed from: m  reason: collision with root package name */
    private final o f19975m;

    /* renamed from: p  reason: collision with root package name */
    private final p f19976p;

    public h(m mVar, o oVar, p pVar) {
        qc.q.i(mVar, "measurable");
        qc.q.i(oVar, "minMax");
        qc.q.i(pVar, "widthHeight");
        this.f19974f = mVar;
        this.f19975m = oVar;
        this.f19976p = pVar;
    }

    @Override // n1.m
    public Object A() {
        return this.f19974f.A();
    }

    @Override // n1.m
    public int a0(int i10) {
        return this.f19974f.a0(i10);
    }

    @Override // n1.m
    public int g(int i10) {
        return this.f19974f.g(i10);
    }

    @Override // n1.m
    public int s(int i10) {
        return this.f19974f.s(i10);
    }

    @Override // n1.m
    public int t(int i10) {
        return this.f19974f.t(i10);
    }

    @Override // n1.g0
    public y0 w(long j10) {
        int a02;
        int s10;
        if (this.f19976p == p.Width) {
            if (this.f19975m == o.Max) {
                s10 = this.f19974f.t(j2.b.m(j10));
            } else {
                s10 = this.f19974f.s(j2.b.m(j10));
            }
            return new j(s10, j2.b.m(j10));
        }
        if (this.f19975m == o.Max) {
            a02 = this.f19974f.g(j2.b.n(j10));
        } else {
            a02 = this.f19974f.a0(j2.b.n(j10));
        }
        return new j(j2.b.n(j10), a02);
    }
}
