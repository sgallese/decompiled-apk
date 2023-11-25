package ad;

/* compiled from: CancellableContinuationImpl.kt */
/* loaded from: classes4.dex */
final class u1 extends k {

    /* renamed from: f  reason: collision with root package name */
    private final pc.l<Throwable, dc.w> f561f;

    /* JADX WARN: Multi-variable type inference failed */
    public u1(pc.l<? super Throwable, dc.w> lVar) {
        this.f561f = lVar;
    }

    @Override // ad.l
    public void g(Throwable th) {
        this.f561f.invoke(th);
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ dc.w invoke(Throwable th) {
        g(th);
        return dc.w.f13270a;
    }

    public String toString() {
        return "InvokeOnCancel[" + o0.a(this.f561f) + '@' + o0.b(this) + ']';
    }
}
