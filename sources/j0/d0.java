package j0;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Effects.kt */
/* loaded from: classes.dex */
public final class d0 implements f2 {

    /* renamed from: f  reason: collision with root package name */
    private final pc.l<f0, e0> f18630f;

    /* renamed from: m  reason: collision with root package name */
    private e0 f18631m;

    /* JADX WARN: Multi-variable type inference failed */
    public d0(pc.l<? super f0, ? extends e0> lVar) {
        qc.q.i(lVar, "effect");
        this.f18630f = lVar;
    }

    @Override // j0.f2
    public void c() {
        e0 e0Var = this.f18631m;
        if (e0Var != null) {
            e0Var.dispose();
        }
        this.f18631m = null;
    }

    @Override // j0.f2
    public void d() {
        f0 f0Var;
        pc.l<f0, e0> lVar = this.f18630f;
        f0Var = h0.f18647a;
        this.f18631m = lVar.invoke(f0Var);
    }

    @Override // j0.f2
    public void b() {
    }
}
