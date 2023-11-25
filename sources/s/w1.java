package s;

import java.util.Map;
import s.q;

/* compiled from: VectorizedAnimationSpec.kt */
/* loaded from: classes.dex */
public final class w1<V extends q> implements q1<V> {

    /* renamed from: a  reason: collision with root package name */
    private final Map<Integer, dc.l<V, c0>> f22856a;

    /* renamed from: b  reason: collision with root package name */
    private final int f22857b;

    /* renamed from: c  reason: collision with root package name */
    private final int f22858c;

    /* renamed from: d  reason: collision with root package name */
    private V f22859d;

    /* renamed from: e  reason: collision with root package name */
    private V f22860e;

    /* JADX WARN: Multi-variable type inference failed */
    public w1(Map<Integer, ? extends dc.l<? extends V, ? extends c0>> map, int i10, int i11) {
        qc.q.i(map, "keyframes");
        this.f22856a = map;
        this.f22857b = i10;
        this.f22858c = i11;
    }

    private final void h(V v10) {
        if (this.f22859d == null) {
            this.f22859d = (V) r.d(v10);
            this.f22860e = (V) r.d(v10);
        }
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
        long a10 = n1.a(this, j10 / 1000000);
        if (a10 <= 0) {
            return v12;
        }
        q e10 = n1.e(this, a10 - 1, v10, v11, v12);
        q e11 = n1.e(this, a10, v10, v11, v12);
        h(v10);
        int b10 = e10.b();
        int i10 = 0;
        while (true) {
            V v13 = null;
            if (i10 >= b10) {
                break;
            }
            V v14 = this.f22860e;
            if (v14 == null) {
                qc.q.z("velocityVector");
            } else {
                v13 = v14;
            }
            v13.e(i10, (e10.a(i10) - e11.a(i10)) * 1000.0f);
            i10++;
        }
        V v15 = this.f22860e;
        if (v15 == null) {
            qc.q.z("velocityVector");
            return null;
        }
        return v15;
    }

    @Override // s.m1
    public V d(long j10, V v10, V v11, V v12) {
        Object i10;
        qc.q.i(v10, "initialValue");
        qc.q.i(v11, "targetValue");
        qc.q.i(v12, "initialVelocity");
        int a10 = (int) n1.a(this, j10 / 1000000);
        if (this.f22856a.containsKey(Integer.valueOf(a10))) {
            i10 = ec.n0.i(this.f22856a, Integer.valueOf(a10));
            return (V) ((dc.l) i10).c();
        } else if (a10 >= f()) {
            return v11;
        } else {
            if (a10 <= 0) {
                return v10;
            }
            int f10 = f();
            c0 c10 = d0.c();
            int i11 = 0;
            V v13 = v10;
            int i12 = 0;
            for (Map.Entry<Integer, dc.l<V, c0>> entry : this.f22856a.entrySet()) {
                int intValue = entry.getKey().intValue();
                dc.l<V, c0> value = entry.getValue();
                if (a10 > intValue && intValue >= i12) {
                    v13 = value.c();
                    c10 = value.d();
                    i12 = intValue;
                } else if (a10 < intValue && intValue <= f10) {
                    v11 = value.c();
                    f10 = intValue;
                }
            }
            float a11 = c10.a((a10 - i12) / (f10 - i12));
            h(v10);
            int b10 = v13.b();
            while (true) {
                V v14 = null;
                if (i11 >= b10) {
                    break;
                }
                V v15 = this.f22859d;
                if (v15 == null) {
                    qc.q.z("valueVector");
                } else {
                    v14 = v15;
                }
                v14.e(i11, k1.k(v13.a(i11), v11.a(i11), a11));
                i11++;
            }
            V v16 = this.f22859d;
            if (v16 == null) {
                qc.q.z("valueVector");
                return null;
            }
            return v16;
        }
    }

    @Override // s.q1
    public int e() {
        return this.f22858c;
    }

    @Override // s.q1
    public int f() {
        return this.f22857b;
    }

    @Override // s.m1
    public /* synthetic */ q g(q qVar, q qVar2, q qVar3) {
        return l1.a(this, qVar, qVar2, qVar3);
    }
}
