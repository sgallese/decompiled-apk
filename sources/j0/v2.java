package j0;

import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* compiled from: SnapshotState.kt */
/* loaded from: classes.dex */
public class v2<T> implements t0.d0, t0.q<T> {

    /* renamed from: f  reason: collision with root package name */
    private final x2<T> f18916f;

    /* renamed from: m  reason: collision with root package name */
    private a<T> f18917m;

    /* compiled from: SnapshotState.kt */
    /* loaded from: classes.dex */
    private static final class a<T> extends t0.e0 {

        /* renamed from: c  reason: collision with root package name */
        private T f18918c;

        public a(T t10) {
            this.f18918c = t10;
        }

        @Override // t0.e0
        public void c(t0.e0 e0Var) {
            qc.q.i(e0Var, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this.f18918c = ((a) e0Var).f18918c;
        }

        @Override // t0.e0
        public t0.e0 d() {
            return new a(this.f18918c);
        }

        public final T i() {
            return this.f18918c;
        }

        public final void j(T t10) {
            this.f18918c = t10;
        }
    }

    public v2(T t10, x2<T> x2Var) {
        qc.q.i(x2Var, "policy");
        this.f18916f = x2Var;
        this.f18917m = new a<>(t10);
    }

    @Override // t0.q
    public x2<T> c() {
        return this.f18916f;
    }

    @Override // t0.d0
    public t0.e0 e() {
        return this.f18917m;
    }

    @Override // t0.d0
    public t0.e0 f(t0.e0 e0Var, t0.e0 e0Var2, t0.e0 e0Var3) {
        qc.q.i(e0Var, "previous");
        qc.q.i(e0Var2, "current");
        qc.q.i(e0Var3, "applied");
        a aVar = (a) e0Var;
        a aVar2 = (a) e0Var2;
        a aVar3 = (a) e0Var3;
        if (!c().a((T) aVar2.i(), (T) aVar3.i())) {
            T b10 = c().b((T) aVar.i(), (T) aVar2.i(), (T) aVar3.i());
            if (b10 != null) {
                t0.e0 d10 = aVar3.d();
                qc.q.g(d10, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl.mergeRecords$lambda$2>");
                ((a) d10).j(b10);
                return d10;
            }
            return null;
        }
        return e0Var2;
    }

    @Override // j0.j1, j0.g3
    public T getValue() {
        return (T) ((a) t0.l.V(this.f18917m, this)).i();
    }

    @Override // t0.d0
    public void k(t0.e0 e0Var) {
        qc.q.i(e0Var, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        this.f18917m = (a) e0Var;
    }

    @Override // j0.j1
    public void setValue(T t10) {
        t0.g b10;
        a aVar = (a) t0.l.D(this.f18917m);
        if (!c().a((T) aVar.i(), t10)) {
            a<T> aVar2 = this.f18917m;
            t0.l.H();
            synchronized (t0.l.G()) {
                b10 = t0.g.f23297e.b();
                ((a) t0.l.Q(aVar2, this, b10, aVar)).j(t10);
                dc.w wVar = dc.w.f13270a;
            }
            t0.l.O(b10, this);
        }
    }

    public String toString() {
        return "MutableState(value=" + ((a) t0.l.D(this.f18917m)).i() + ")@" + hashCode();
    }
}
