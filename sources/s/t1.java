package s;

import java.util.Iterator;
import s.q;

/* compiled from: VectorizedAnimationSpec.kt */
/* loaded from: classes.dex */
public final class t1<V extends q> implements s1<V> {

    /* renamed from: a  reason: collision with root package name */
    private final s f22824a;

    /* renamed from: b  reason: collision with root package name */
    private V f22825b;

    /* renamed from: c  reason: collision with root package name */
    private V f22826c;

    /* renamed from: d  reason: collision with root package name */
    private V f22827d;

    /* compiled from: VectorizedAnimationSpec.kt */
    /* loaded from: classes.dex */
    public static final class a implements s {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g0 f22828a;

        a(g0 g0Var) {
            this.f22828a = g0Var;
        }

        @Override // s.s
        public g0 get(int i10) {
            return this.f22828a;
        }
    }

    public t1(s sVar) {
        qc.q.i(sVar, "anims");
        this.f22824a = sVar;
    }

    @Override // s.m1
    public /* synthetic */ boolean a() {
        return r1.a(this);
    }

    @Override // s.m1
    public long b(V v10, V v11, V v12) {
        qc.q.i(v10, "initialValue");
        qc.q.i(v11, "targetValue");
        qc.q.i(v12, "initialVelocity");
        Iterator<Integer> it = vc.j.s(0, v10.b()).iterator();
        long j10 = 0;
        while (it.hasNext()) {
            int a10 = ((ec.h0) it).a();
            j10 = Math.max(j10, this.f22824a.get(a10).c(v10.a(a10), v11.a(a10), v12.a(a10)));
        }
        return j10;
    }

    @Override // s.m1
    public V c(long j10, V v10, V v11, V v12) {
        qc.q.i(v10, "initialValue");
        qc.q.i(v11, "targetValue");
        qc.q.i(v12, "initialVelocity");
        if (this.f22826c == null) {
            this.f22826c = (V) r.d(v12);
        }
        V v13 = this.f22826c;
        if (v13 == null) {
            qc.q.z("velocityVector");
            v13 = null;
        }
        int b10 = v13.b();
        for (int i10 = 0; i10 < b10; i10++) {
            V v14 = this.f22826c;
            if (v14 == null) {
                qc.q.z("velocityVector");
                v14 = null;
            }
            v14.e(i10, this.f22824a.get(i10).b(j10, v10.a(i10), v11.a(i10), v12.a(i10)));
        }
        V v15 = this.f22826c;
        if (v15 == null) {
            qc.q.z("velocityVector");
            return null;
        }
        return v15;
    }

    @Override // s.m1
    public V d(long j10, V v10, V v11, V v12) {
        qc.q.i(v10, "initialValue");
        qc.q.i(v11, "targetValue");
        qc.q.i(v12, "initialVelocity");
        if (this.f22825b == null) {
            this.f22825b = (V) r.d(v10);
        }
        V v13 = this.f22825b;
        if (v13 == null) {
            qc.q.z("valueVector");
            v13 = null;
        }
        int b10 = v13.b();
        for (int i10 = 0; i10 < b10; i10++) {
            V v14 = this.f22825b;
            if (v14 == null) {
                qc.q.z("valueVector");
                v14 = null;
            }
            v14.e(i10, this.f22824a.get(i10).e(j10, v10.a(i10), v11.a(i10), v12.a(i10)));
        }
        V v15 = this.f22825b;
        if (v15 == null) {
            qc.q.z("valueVector");
            return null;
        }
        return v15;
    }

    @Override // s.m1
    public V g(V v10, V v11, V v12) {
        qc.q.i(v10, "initialValue");
        qc.q.i(v11, "targetValue");
        qc.q.i(v12, "initialVelocity");
        if (this.f22827d == null) {
            this.f22827d = (V) r.d(v12);
        }
        V v13 = this.f22827d;
        if (v13 == null) {
            qc.q.z("endVelocityVector");
            v13 = null;
        }
        int b10 = v13.b();
        for (int i10 = 0; i10 < b10; i10++) {
            V v14 = this.f22827d;
            if (v14 == null) {
                qc.q.z("endVelocityVector");
                v14 = null;
            }
            v14.e(i10, this.f22824a.get(i10).d(v10.a(i10), v11.a(i10), v12.a(i10)));
        }
        V v15 = this.f22827d;
        if (v15 == null) {
            qc.q.z("endVelocityVector");
            return null;
        }
        return v15;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public t1(g0 g0Var) {
        this(new a(g0Var));
        qc.q.i(g0Var, "anim");
    }
}
