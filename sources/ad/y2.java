package ad;

/* compiled from: Unconfined.kt */
/* loaded from: classes4.dex */
public final class y2 extends g0 {

    /* renamed from: m  reason: collision with root package name */
    public static final y2 f581m = new y2();

    private y2() {
    }

    @Override // ad.g0
    public void A0(hc.f fVar, Runnable runnable) {
        c3 c3Var = (c3) fVar.get(c3.f471m);
        if (c3Var != null) {
            c3Var.f472f = true;
            return;
        }
        throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
    }

    @Override // ad.g0
    public boolean D0(hc.f fVar) {
        return false;
    }

    @Override // ad.g0
    public g0 F0(int i10) {
        throw new UnsupportedOperationException("limitedParallelism is not supported for Dispatchers.Unconfined");
    }

    @Override // ad.g0
    public String toString() {
        return "Dispatchers.Unconfined";
    }
}
