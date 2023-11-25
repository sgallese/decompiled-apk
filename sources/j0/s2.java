package j0;

import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* compiled from: SnapshotFloatState.kt */
/* loaded from: classes.dex */
public class s2 implements t0.d0, e1, t0.q<Float> {

    /* renamed from: f  reason: collision with root package name */
    private a f18897f;

    /* compiled from: SnapshotFloatState.kt */
    /* loaded from: classes.dex */
    private static final class a extends t0.e0 {

        /* renamed from: c  reason: collision with root package name */
        private float f18898c;

        public a(float f10) {
            this.f18898c = f10;
        }

        @Override // t0.e0
        public void c(t0.e0 e0Var) {
            qc.q.i(e0Var, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this.f18898c = ((a) e0Var).f18898c;
        }

        @Override // t0.e0
        public t0.e0 d() {
            return new a(this.f18898c);
        }

        public final float i() {
            return this.f18898c;
        }

        public final void j(float f10) {
            this.f18898c = f10;
        }
    }

    public s2(float f10) {
        this.f18897f = new a(f10);
    }

    @Override // j0.e1, j0.i0
    public float b() {
        return ((a) t0.l.V(this.f18897f, this)).i();
    }

    @Override // t0.q
    public x2<Float> c() {
        return y2.o();
    }

    @Override // t0.d0
    public t0.e0 e() {
        return this.f18897f;
    }

    @Override // t0.d0
    public t0.e0 f(t0.e0 e0Var, t0.e0 e0Var2, t0.e0 e0Var3) {
        boolean z10;
        qc.q.i(e0Var, "previous");
        qc.q.i(e0Var2, "current");
        qc.q.i(e0Var3, "applied");
        if (((a) e0Var2).i() == ((a) e0Var3).i()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return null;
        }
        return e0Var2;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // j0.e1, j0.g3
    public /* synthetic */ Float getValue() {
        return d1.a(this);
    }

    @Override // j0.e1
    public void h(float f10) {
        boolean z10;
        t0.g b10;
        a aVar = (a) t0.l.D(this.f18897f);
        if (aVar.i() == f10) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            a aVar2 = this.f18897f;
            t0.l.H();
            synchronized (t0.l.G()) {
                b10 = t0.g.f23297e.b();
                ((a) t0.l.Q(aVar2, this, b10, aVar)).j(f10);
                dc.w wVar = dc.w.f13270a;
            }
            t0.l.O(b10, this);
        }
    }

    @Override // t0.d0
    public void k(t0.e0 e0Var) {
        qc.q.i(e0Var, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        this.f18897f = (a) e0Var;
    }

    @Override // j0.e1
    public /* synthetic */ void p(float f10) {
        d1.c(this, f10);
    }

    @Override // j0.j1
    public /* bridge */ /* synthetic */ void setValue(Float f10) {
        p(f10.floatValue());
    }

    public String toString() {
        return "MutableFloatState(value=" + ((a) t0.l.D(this.f18897f)).i() + ")@" + hashCode();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Float, java.lang.Object] */
    @Override // j0.g3
    public /* bridge */ /* synthetic */ Float getValue() {
        ?? value;
        value = getValue();
        return value;
    }
}
