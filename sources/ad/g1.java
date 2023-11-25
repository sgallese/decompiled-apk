package ad;

/* compiled from: EventLoop.common.kt */
/* loaded from: classes4.dex */
public abstract class g1 extends g0 {

    /* renamed from: m  reason: collision with root package name */
    private long f512m;

    /* renamed from: p  reason: collision with root package name */
    private boolean f513p;

    /* renamed from: q  reason: collision with root package name */
    private ec.k<x0<?>> f514q;

    public static /* synthetic */ void J0(g1 g1Var, boolean z10, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            g1Var.I0(z10);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decrementUseCount");
    }

    private final long N0(boolean z10) {
        if (z10) {
            return 4294967296L;
        }
        return 1L;
    }

    public static /* synthetic */ void X0(g1 g1Var, boolean z10, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            g1Var.V0(z10);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
    }

    @Override // ad.g0
    public final g0 F0(int i10) {
        fd.o.a(i10);
        return this;
    }

    public final void I0(boolean z10) {
        long N0 = this.f512m - N0(z10);
        this.f512m = N0;
        if (N0 <= 0 && this.f513p) {
            shutdown();
        }
    }

    public final void R0(x0<?> x0Var) {
        ec.k<x0<?>> kVar = this.f514q;
        if (kVar == null) {
            kVar = new ec.k<>();
            this.f514q = kVar;
        }
        kVar.h(x0Var);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public long T0() {
        ec.k<x0<?>> kVar = this.f514q;
        if (kVar == null || kVar.isEmpty()) {
            return Long.MAX_VALUE;
        }
        return 0L;
    }

    public final void V0(boolean z10) {
        this.f512m += N0(z10);
        if (!z10) {
            this.f513p = true;
        }
    }

    public final boolean Y0() {
        if (this.f512m >= N0(true)) {
            return true;
        }
        return false;
    }

    public final boolean Z0() {
        ec.k<x0<?>> kVar = this.f514q;
        if (kVar != null) {
            return kVar.isEmpty();
        }
        return true;
    }

    public long a1() {
        if (!b1()) {
            return Long.MAX_VALUE;
        }
        return 0L;
    }

    public final boolean b1() {
        x0<?> t10;
        ec.k<x0<?>> kVar = this.f514q;
        if (kVar == null || (t10 = kVar.t()) == null) {
            return false;
        }
        t10.run();
        return true;
    }

    public boolean c1() {
        return false;
    }

    public void shutdown() {
    }
}
