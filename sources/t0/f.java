package t0;

import kotlin.KotlinNothingValueException;

/* compiled from: Snapshot.kt */
/* loaded from: classes.dex */
public final class f extends g {

    /* renamed from: g  reason: collision with root package name */
    private final pc.l<Object, dc.w> f23289g;

    /* renamed from: h  reason: collision with root package name */
    private int f23290h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(int i10, j jVar, pc.l<Object, dc.w> lVar) {
        super(i10, jVar, null);
        qc.q.i(jVar, "invalid");
        this.f23289g = lVar;
        this.f23290h = 1;
    }

    @Override // t0.g
    public void d() {
        if (!e()) {
            n(this);
            super.d();
        }
    }

    @Override // t0.g
    public pc.l<Object, dc.w> h() {
        return this.f23289g;
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
    public void m(g gVar) {
        qc.q.i(gVar, "snapshot");
        this.f23290h++;
    }

    @Override // t0.g
    public void n(g gVar) {
        qc.q.i(gVar, "snapshot");
        int i10 = this.f23290h - 1;
        this.f23290h = i10;
        if (i10 == 0) {
            b();
        }
    }

    @Override // t0.g
    public void p(d0 d0Var) {
        qc.q.i(d0Var, "state");
        l.X();
        throw new KotlinNothingValueException();
    }

    @Override // t0.g
    public g x(pc.l<Object, dc.w> lVar) {
        l.e0(this);
        return new d(f(), g(), lVar, this);
    }

    @Override // t0.g
    public void o() {
    }
}
