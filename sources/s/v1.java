package s;

import s.q;

/* compiled from: VectorizedAnimationSpec.kt */
/* loaded from: classes.dex */
public final class v1<V extends q> implements m1<V> {

    /* renamed from: a  reason: collision with root package name */
    private final q1<V> f22848a;

    /* renamed from: b  reason: collision with root package name */
    private final v0 f22849b;

    /* renamed from: c  reason: collision with root package name */
    private final long f22850c;

    /* renamed from: d  reason: collision with root package name */
    private final long f22851d;

    public /* synthetic */ v1(q1 q1Var, v0 v0Var, long j10, qc.h hVar) {
        this(q1Var, v0Var, j10);
    }

    private final long h(long j10) {
        long j11 = this.f22851d;
        if (j10 + j11 <= 0) {
            return 0L;
        }
        long j12 = j10 + j11;
        long j13 = this.f22850c;
        long j14 = j12 / j13;
        if (this.f22849b != v0.Restart && j14 % 2 != 0) {
            return ((j14 + 1) * j13) - j12;
        }
        Long.signum(j14);
        return j12 - (j14 * j13);
    }

    private final V i(long j10, V v10, V v11, V v12) {
        long j11 = this.f22851d;
        long j12 = j10 + j11;
        long j13 = this.f22850c;
        if (j12 > j13) {
            return c(j13 - j11, v10, v11, v12);
        }
        return v11;
    }

    @Override // s.m1
    public boolean a() {
        return true;
    }

    @Override // s.m1
    public long b(V v10, V v11, V v12) {
        qc.q.i(v10, "initialValue");
        qc.q.i(v11, "targetValue");
        qc.q.i(v12, "initialVelocity");
        return Long.MAX_VALUE;
    }

    @Override // s.m1
    public V c(long j10, V v10, V v11, V v12) {
        qc.q.i(v10, "initialValue");
        qc.q.i(v11, "targetValue");
        qc.q.i(v12, "initialVelocity");
        return this.f22848a.c(h(j10), v10, v11, i(j10, v10, v12, v11));
    }

    @Override // s.m1
    public V d(long j10, V v10, V v11, V v12) {
        qc.q.i(v10, "initialValue");
        qc.q.i(v11, "targetValue");
        qc.q.i(v12, "initialVelocity");
        return this.f22848a.d(h(j10), v10, v11, i(j10, v10, v12, v11));
    }

    @Override // s.m1
    public /* synthetic */ q g(q qVar, q qVar2, q qVar3) {
        return l1.a(this, qVar, qVar2, qVar3);
    }

    private v1(q1<V> q1Var, v0 v0Var, long j10) {
        qc.q.i(q1Var, "animation");
        qc.q.i(v0Var, "repeatMode");
        this.f22848a = q1Var;
        this.f22849b = v0Var;
        this.f22850c = (q1Var.e() + q1Var.f()) * 1000000;
        this.f22851d = j10 * 1000000;
    }
}
