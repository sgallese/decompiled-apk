package s;

import s.q;

/* compiled from: VectorizedAnimationSpec.kt */
/* loaded from: classes.dex */
public final class y1<V extends q> implements q1<V> {

    /* renamed from: a  reason: collision with root package name */
    private final int f22881a;

    /* renamed from: b  reason: collision with root package name */
    private final int f22882b;

    /* renamed from: c  reason: collision with root package name */
    private final c0 f22883c;

    /* renamed from: d  reason: collision with root package name */
    private final t1<V> f22884d;

    public y1(int i10, int i11, c0 c0Var) {
        qc.q.i(c0Var, "easing");
        this.f22881a = i10;
        this.f22882b = i11;
        this.f22883c = c0Var;
        this.f22884d = new t1<>(new j0(f(), e(), c0Var));
    }

    @Override // s.m1
    public /* synthetic */ boolean a() {
        return r1.a(this);
    }

    @Override // s.m1
    public /* synthetic */ long b(q qVar, q qVar2, q qVar3) {
        return p1.a(this, qVar, qVar2, qVar3);
    }

    @Override // s.m1
    public V c(long j10, V v10, V v11, V v12) {
        qc.q.i(v10, "initialValue");
        qc.q.i(v11, "targetValue");
        qc.q.i(v12, "initialVelocity");
        return this.f22884d.c(j10, v10, v11, v12);
    }

    @Override // s.m1
    public V d(long j10, V v10, V v11, V v12) {
        qc.q.i(v10, "initialValue");
        qc.q.i(v11, "targetValue");
        qc.q.i(v12, "initialVelocity");
        return this.f22884d.d(j10, v10, v11, v12);
    }

    @Override // s.q1
    public int e() {
        return this.f22882b;
    }

    @Override // s.q1
    public int f() {
        return this.f22881a;
    }

    @Override // s.m1
    public /* synthetic */ q g(q qVar, q qVar2, q qVar3) {
        return l1.a(this, qVar, qVar2, qVar3);
    }
}
