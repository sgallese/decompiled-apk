package x;

import n1.a1;

/* compiled from: LazyListBeyondBoundsModifier.kt */
/* loaded from: classes.dex */
public final class h implements y.j {

    /* renamed from: a  reason: collision with root package name */
    private final a0 f25560a;

    /* renamed from: b  reason: collision with root package name */
    private final int f25561b;

    public h(a0 a0Var, int i10) {
        qc.q.i(a0Var, "state");
        this.f25560a = a0Var;
        this.f25561b = i10;
    }

    @Override // y.j
    public int c() {
        return this.f25560a.o().a();
    }

    @Override // y.j
    public int d() {
        Object m02;
        int c10 = c() - 1;
        m02 = ec.b0.m0(this.f25560a.o().b());
        return Math.min(c10, ((l) m02).getIndex() + this.f25561b);
    }

    @Override // y.j
    public void e() {
        a1 t10 = this.f25560a.t();
        if (t10 != null) {
            t10.j();
        }
    }

    @Override // y.j
    public boolean f() {
        return !this.f25560a.o().b().isEmpty();
    }

    @Override // y.j
    public int g() {
        return Math.max(0, this.f25560a.l() - this.f25561b);
    }
}
