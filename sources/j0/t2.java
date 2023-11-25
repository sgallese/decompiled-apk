package j0;

import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* compiled from: SnapshotIntState.kt */
/* loaded from: classes.dex */
public class t2 implements t0.d0, g1, t0.q<Integer> {

    /* renamed from: f  reason: collision with root package name */
    private a f18903f;

    /* compiled from: SnapshotIntState.kt */
    /* loaded from: classes.dex */
    private static final class a extends t0.e0 {

        /* renamed from: c  reason: collision with root package name */
        private int f18904c;

        public a(int i10) {
            this.f18904c = i10;
        }

        @Override // t0.e0
        public void c(t0.e0 e0Var) {
            qc.q.i(e0Var, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this.f18904c = ((a) e0Var).f18904c;
        }

        @Override // t0.e0
        public t0.e0 d() {
            return new a(this.f18904c);
        }

        public final int i() {
            return this.f18904c;
        }

        public final void j(int i10) {
            this.f18904c = i10;
        }
    }

    public t2(int i10) {
        this.f18903f = new a(i10);
    }

    @Override // t0.q
    public x2<Integer> c() {
        return y2.o();
    }

    @Override // j0.g1, j0.n0
    public int d() {
        return ((a) t0.l.V(this.f18903f, this)).i();
    }

    @Override // t0.d0
    public t0.e0 e() {
        return this.f18903f;
    }

    @Override // t0.d0
    public t0.e0 f(t0.e0 e0Var, t0.e0 e0Var2, t0.e0 e0Var3) {
        qc.q.i(e0Var, "previous");
        qc.q.i(e0Var2, "current");
        qc.q.i(e0Var3, "applied");
        if (((a) e0Var2).i() != ((a) e0Var3).i()) {
            return null;
        }
        return e0Var2;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // j0.g1, j0.g3
    public /* synthetic */ Integer getValue() {
        return f1.a(this);
    }

    @Override // j0.g1
    public void i(int i10) {
        t0.g b10;
        a aVar = (a) t0.l.D(this.f18903f);
        if (aVar.i() != i10) {
            a aVar2 = this.f18903f;
            t0.l.H();
            synchronized (t0.l.G()) {
                b10 = t0.g.f23297e.b();
                ((a) t0.l.Q(aVar2, this, b10, aVar)).j(i10);
                dc.w wVar = dc.w.f13270a;
            }
            t0.l.O(b10, this);
        }
    }

    @Override // t0.d0
    public void k(t0.e0 e0Var) {
        qc.q.i(e0Var, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        this.f18903f = (a) e0Var;
    }

    @Override // j0.g1
    public /* synthetic */ void o(int i10) {
        f1.c(this, i10);
    }

    @Override // j0.j1
    public /* bridge */ /* synthetic */ void setValue(Integer num) {
        o(num.intValue());
    }

    public String toString() {
        return "MutableIntState(value=" + ((a) t0.l.D(this.f18903f)).i() + ")@" + hashCode();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.lang.Integer] */
    @Override // j0.g3
    public /* bridge */ /* synthetic */ Integer getValue() {
        ?? value;
        value = getValue();
        return value;
    }
}
