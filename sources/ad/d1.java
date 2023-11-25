package ad;

/* compiled from: CancellableContinuation.kt */
/* loaded from: classes4.dex */
final class d1 extends k {

    /* renamed from: f  reason: collision with root package name */
    private final c1 f474f;

    public d1(c1 c1Var) {
        this.f474f = c1Var;
    }

    @Override // ad.l
    public void g(Throwable th) {
        this.f474f.dispose();
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ dc.w invoke(Throwable th) {
        g(th);
        return dc.w.f13270a;
    }

    public String toString() {
        return "DisposeOnCancel[" + this.f474f + ']';
    }
}
