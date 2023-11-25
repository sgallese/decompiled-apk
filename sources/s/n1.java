package s;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: VectorizedAnimationSpec.kt */
/* loaded from: classes.dex */
public final class n1 {

    /* compiled from: VectorizedAnimationSpec.kt */
    /* loaded from: classes.dex */
    public static final class a implements s {

        /* renamed from: a */
        private final List<i0> f22805a;

        a(q qVar, float f10, float f11) {
            vc.f s10;
            int s11;
            s10 = vc.l.s(0, qVar.b());
            s11 = ec.u.s(s10, 10);
            ArrayList arrayList = new ArrayList(s11);
            Iterator<Integer> it = s10.iterator();
            while (it.hasNext()) {
                arrayList.add(new i0(f10, f11, qVar.a(((ec.h0) it).a())));
            }
            this.f22805a = arrayList;
        }

        @Override // s.s
        /* renamed from: a */
        public i0 get(int i10) {
            return this.f22805a.get(i10);
        }
    }

    /* compiled from: VectorizedAnimationSpec.kt */
    /* loaded from: classes.dex */
    public static final class b implements s {

        /* renamed from: a */
        private final i0 f22806a;

        b(float f10, float f11) {
            this.f22806a = new i0(f10, f11, 0.0f, 4, null);
        }

        @Override // s.s
        /* renamed from: a */
        public i0 get(int i10) {
            return this.f22806a;
        }
    }

    public static final /* synthetic */ long a(q1 q1Var, long j10) {
        return c(q1Var, j10);
    }

    public static final /* synthetic */ s b(q qVar, float f10, float f11) {
        return d(qVar, f10, f11);
    }

    public static final long c(q1<?> q1Var, long j10) {
        long n10;
        n10 = vc.l.n(j10 - q1Var.e(), 0L, q1Var.f());
        return n10;
    }

    public static final <V extends q> s d(V v10, float f10, float f11) {
        if (v10 != null) {
            return new a(v10, f10, f11);
        }
        return new b(f10, f11);
    }

    public static final <V extends q> V e(m1<V> m1Var, long j10, V v10, V v11, V v12) {
        qc.q.i(m1Var, "<this>");
        qc.q.i(v10, "start");
        qc.q.i(v11, "end");
        qc.q.i(v12, "startVelocity");
        return m1Var.d(j10 * 1000000, v10, v11, v12);
    }
}
