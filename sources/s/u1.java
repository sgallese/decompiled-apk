package s;

import s.q;

/* compiled from: DecayAnimationSpec.kt */
/* loaded from: classes.dex */
final class u1<V extends q> implements o1<V> {

    /* renamed from: a  reason: collision with root package name */
    private final h0 f22843a;

    /* renamed from: b  reason: collision with root package name */
    private V f22844b;

    /* renamed from: c  reason: collision with root package name */
    private V f22845c;

    /* renamed from: d  reason: collision with root package name */
    private V f22846d;

    /* renamed from: e  reason: collision with root package name */
    private final float f22847e;

    public u1(h0 h0Var) {
        qc.q.i(h0Var, "floatDecaySpec");
        this.f22843a = h0Var;
        this.f22847e = h0Var.a();
    }

    @Override // s.o1
    public float a() {
        return this.f22847e;
    }

    @Override // s.o1
    public V b(long j10, V v10, V v11) {
        qc.q.i(v10, "initialValue");
        qc.q.i(v11, "initialVelocity");
        if (this.f22845c == null) {
            this.f22845c = (V) r.d(v10);
        }
        V v12 = this.f22845c;
        if (v12 == null) {
            qc.q.z("velocityVector");
            v12 = null;
        }
        int b10 = v12.b();
        for (int i10 = 0; i10 < b10; i10++) {
            V v13 = this.f22845c;
            if (v13 == null) {
                qc.q.z("velocityVector");
                v13 = null;
            }
            v13.e(i10, this.f22843a.b(j10, v10.a(i10), v11.a(i10)));
        }
        V v14 = this.f22845c;
        if (v14 == null) {
            qc.q.z("velocityVector");
            return null;
        }
        return v14;
    }

    @Override // s.o1
    public long c(V v10, V v11) {
        qc.q.i(v10, "initialValue");
        qc.q.i(v11, "initialVelocity");
        if (this.f22845c == null) {
            this.f22845c = (V) r.d(v10);
        }
        V v12 = this.f22845c;
        if (v12 == null) {
            qc.q.z("velocityVector");
            v12 = null;
        }
        int b10 = v12.b();
        long j10 = 0;
        for (int i10 = 0; i10 < b10; i10++) {
            j10 = Math.max(j10, this.f22843a.c(v10.a(i10), v11.a(i10)));
        }
        return j10;
    }

    @Override // s.o1
    public V d(V v10, V v11) {
        qc.q.i(v10, "initialValue");
        qc.q.i(v11, "initialVelocity");
        if (this.f22846d == null) {
            this.f22846d = (V) r.d(v10);
        }
        V v12 = this.f22846d;
        if (v12 == null) {
            qc.q.z("targetVector");
            v12 = null;
        }
        int b10 = v12.b();
        for (int i10 = 0; i10 < b10; i10++) {
            V v13 = this.f22846d;
            if (v13 == null) {
                qc.q.z("targetVector");
                v13 = null;
            }
            v13.e(i10, this.f22843a.d(v10.a(i10), v11.a(i10)));
        }
        V v14 = this.f22846d;
        if (v14 == null) {
            qc.q.z("targetVector");
            return null;
        }
        return v14;
    }

    @Override // s.o1
    public V e(long j10, V v10, V v11) {
        qc.q.i(v10, "initialValue");
        qc.q.i(v11, "initialVelocity");
        if (this.f22844b == null) {
            this.f22844b = (V) r.d(v10);
        }
        V v12 = this.f22844b;
        if (v12 == null) {
            qc.q.z("valueVector");
            v12 = null;
        }
        int b10 = v12.b();
        for (int i10 = 0; i10 < b10; i10++) {
            V v13 = this.f22844b;
            if (v13 == null) {
                qc.q.z("valueVector");
                v13 = null;
            }
            v13.e(i10, this.f22843a.e(j10, v10.a(i10), v11.a(i10)));
        }
        V v14 = this.f22844b;
        if (v14 == null) {
            qc.q.z("valueVector");
            return null;
        }
        return v14;
    }
}
