package j0;

import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* compiled from: SnapshotLongState.kt */
/* loaded from: classes.dex */
public class u2 implements t0.d0, i1, t0.q<Long> {

    /* renamed from: f  reason: collision with root package name */
    private a f18911f;

    /* compiled from: SnapshotLongState.kt */
    /* loaded from: classes.dex */
    private static final class a extends t0.e0 {

        /* renamed from: c  reason: collision with root package name */
        private long f18912c;

        public a(long j10) {
            this.f18912c = j10;
        }

        @Override // t0.e0
        public void c(t0.e0 e0Var) {
            qc.q.i(e0Var, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this.f18912c = ((a) e0Var).f18912c;
        }

        @Override // t0.e0
        public t0.e0 d() {
            return new a(this.f18912c);
        }

        public final long i() {
            return this.f18912c;
        }

        public final void j(long j10) {
            this.f18912c = j10;
        }
    }

    public u2(long j10) {
        this.f18911f = new a(j10);
    }

    @Override // j0.i1, j0.w0
    public long a() {
        return ((a) t0.l.V(this.f18911f, this)).i();
    }

    @Override // t0.q
    public x2<Long> c() {
        return y2.o();
    }

    @Override // t0.d0
    public t0.e0 e() {
        return this.f18911f;
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
    @Override // j0.i1, j0.g3
    public /* synthetic */ Long getValue() {
        return h1.a(this);
    }

    @Override // t0.d0
    public void k(t0.e0 e0Var) {
        qc.q.i(e0Var, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        this.f18911f = (a) e0Var;
    }

    @Override // j0.i1
    public void l(long j10) {
        t0.g b10;
        a aVar = (a) t0.l.D(this.f18911f);
        if (aVar.i() != j10) {
            a aVar2 = this.f18911f;
            t0.l.H();
            synchronized (t0.l.G()) {
                b10 = t0.g.f23297e.b();
                ((a) t0.l.Q(aVar2, this, b10, aVar)).j(j10);
                dc.w wVar = dc.w.f13270a;
            }
            t0.l.O(b10, this);
        }
    }

    @Override // j0.i1
    public /* synthetic */ void n(long j10) {
        h1.c(this, j10);
    }

    @Override // j0.j1
    public /* bridge */ /* synthetic */ void setValue(Long l10) {
        n(l10.longValue());
    }

    public String toString() {
        return "MutableLongState(value=" + ((a) t0.l.D(this.f18911f)).i() + ")@" + hashCode();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Long, java.lang.Object] */
    @Override // j0.g3
    public /* bridge */ /* synthetic */ Long getValue() {
        ?? value;
        value = getValue();
        return value;
    }
}
