package t5;

/* compiled from: AnalyticsIdentityListener.kt */
/* loaded from: classes.dex */
public final class a implements v5.f {

    /* renamed from: a  reason: collision with root package name */
    private final p5.e f23630a;

    public a(p5.e eVar) {
        qc.q.i(eVar, "state");
        this.f23630a = eVar;
    }

    @Override // v5.f
    public void a(String str) {
        this.f23630a.e(str);
    }

    @Override // v5.f
    public void b(String str) {
        this.f23630a.f(str);
    }

    @Override // v5.f
    public void c(v5.c cVar, v5.k kVar) {
        qc.q.i(cVar, "identity");
        qc.q.i(kVar, "updateType");
        if (kVar == v5.k.Initialized) {
            this.f23630a.f(cVar.b());
            this.f23630a.e(cVar.a());
        }
    }
}
