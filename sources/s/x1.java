package s;

import s.q;

/* compiled from: VectorizedAnimationSpec.kt */
/* loaded from: classes.dex */
public final class x1<V extends q> implements s1<V> {

    /* renamed from: a  reason: collision with root package name */
    private final float f22877a;

    /* renamed from: b  reason: collision with root package name */
    private final float f22878b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ t1<V> f22879c;

    private x1(float f10, float f11, s sVar) {
        this.f22877a = f10;
        this.f22878b = f11;
        this.f22879c = new t1<>(sVar);
    }

    @Override // s.m1
    public boolean a() {
        return this.f22879c.a();
    }

    @Override // s.m1
    public long b(V v10, V v11, V v12) {
        qc.q.i(v10, "initialValue");
        qc.q.i(v11, "targetValue");
        qc.q.i(v12, "initialVelocity");
        return this.f22879c.b(v10, v11, v12);
    }

    @Override // s.m1
    public V c(long j10, V v10, V v11, V v12) {
        qc.q.i(v10, "initialValue");
        qc.q.i(v11, "targetValue");
        qc.q.i(v12, "initialVelocity");
        return this.f22879c.c(j10, v10, v11, v12);
    }

    @Override // s.m1
    public V d(long j10, V v10, V v11, V v12) {
        qc.q.i(v10, "initialValue");
        qc.q.i(v11, "targetValue");
        qc.q.i(v12, "initialVelocity");
        return this.f22879c.d(j10, v10, v11, v12);
    }

    @Override // s.m1
    public V g(V v10, V v11, V v12) {
        qc.q.i(v10, "initialValue");
        qc.q.i(v11, "targetValue");
        qc.q.i(v12, "initialVelocity");
        return this.f22879c.g(v10, v11, v12);
    }

    public x1(float f10, float f11, V v10) {
        this(f10, f11, n1.b(v10, f10, f11));
    }
}
