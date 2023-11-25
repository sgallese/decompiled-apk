package t0;

import kotlin.KotlinNothingValueException;

/* compiled from: Snapshot.kt */
/* loaded from: classes.dex */
public final class d extends g {

    /* renamed from: g  reason: collision with root package name */
    private final g f23283g;

    /* renamed from: h  reason: collision with root package name */
    private final pc.l<Object, dc.w> f23284h;

    /* compiled from: Snapshot.kt */
    /* loaded from: classes.dex */
    static final class a extends qc.r implements pc.l<Object, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ pc.l<Object, dc.w> f23285f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ pc.l<Object, dc.w> f23286m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(pc.l<Object, dc.w> lVar, pc.l<Object, dc.w> lVar2) {
            super(1);
            this.f23285f = lVar;
            this.f23286m = lVar2;
        }

        public final void a(Object obj) {
            qc.q.i(obj, "state");
            this.f23285f.invoke(obj);
            this.f23286m.invoke(obj);
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ dc.w invoke(Object obj) {
            a(obj);
            return dc.w.f13270a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(int i10, j jVar, pc.l<Object, dc.w> lVar, g gVar) {
        super(i10, jVar, null);
        qc.q.i(jVar, "invalid");
        qc.q.i(gVar, "parent");
        this.f23283g = gVar;
        gVar.m(this);
        if (lVar != null) {
            pc.l<Object, dc.w> h10 = gVar.h();
            if (h10 != null) {
                lVar = new a(lVar, h10);
            }
        } else {
            lVar = gVar.h();
        }
        this.f23284h = lVar;
    }

    @Override // t0.g
    /* renamed from: A  reason: merged with bridge method [inline-methods] */
    public Void m(g gVar) {
        qc.q.i(gVar, "snapshot");
        u.b();
        throw new KotlinNothingValueException();
    }

    @Override // t0.g
    /* renamed from: B  reason: merged with bridge method [inline-methods] */
    public Void n(g gVar) {
        qc.q.i(gVar, "snapshot");
        u.b();
        throw new KotlinNothingValueException();
    }

    @Override // t0.g
    /* renamed from: C  reason: merged with bridge method [inline-methods] */
    public Void p(d0 d0Var) {
        qc.q.i(d0Var, "state");
        l.X();
        throw new KotlinNothingValueException();
    }

    @Override // t0.g
    /* renamed from: D  reason: merged with bridge method [inline-methods] */
    public d x(pc.l<Object, dc.w> lVar) {
        return new d(f(), g(), lVar, this.f23283g);
    }

    @Override // t0.g
    public void d() {
        if (!e()) {
            if (f() != this.f23283g.f()) {
                b();
            }
            this.f23283g.n(this);
            super.d();
        }
    }

    @Override // t0.g
    public pc.l<Object, dc.w> h() {
        return this.f23284h;
    }

    @Override // t0.g
    public boolean i() {
        return true;
    }

    @Override // t0.g
    public pc.l<Object, dc.w> k() {
        return null;
    }

    @Override // t0.g
    public void o() {
    }
}
