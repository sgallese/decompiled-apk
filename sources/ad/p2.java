package ad;

/* compiled from: Executors.kt */
/* loaded from: classes4.dex */
final class p2 implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    private final g0 f549f;

    /* renamed from: m  reason: collision with root package name */
    private final m<dc.w> f550m;

    /* JADX WARN: Multi-variable type inference failed */
    public p2(g0 g0Var, m<? super dc.w> mVar) {
        this.f549f = g0Var;
        this.f550m = mVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f550m.f(this.f549f, dc.w.f13270a);
    }
}
