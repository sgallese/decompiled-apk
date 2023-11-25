package j0;

import kotlin.coroutines.Continuation;

/* compiled from: Effects.kt */
/* loaded from: classes.dex */
public final class t0 implements f2 {

    /* renamed from: f  reason: collision with root package name */
    private final pc.p<ad.k0, Continuation<? super dc.w>, Object> f18900f;

    /* renamed from: m  reason: collision with root package name */
    private final ad.k0 f18901m;

    /* renamed from: p  reason: collision with root package name */
    private ad.x1 f18902p;

    /* JADX WARN: Multi-variable type inference failed */
    public t0(hc.f fVar, pc.p<? super ad.k0, ? super Continuation<? super dc.w>, ? extends Object> pVar) {
        qc.q.i(fVar, "parentCoroutineContext");
        qc.q.i(pVar, "task");
        this.f18900f = pVar;
        this.f18901m = ad.l0.a(fVar);
    }

    @Override // j0.f2
    public void b() {
        ad.x1 x1Var = this.f18902p;
        if (x1Var != null) {
            x1Var.c(new v0());
        }
        this.f18902p = null;
    }

    @Override // j0.f2
    public void c() {
        ad.x1 x1Var = this.f18902p;
        if (x1Var != null) {
            x1Var.c(new v0());
        }
        this.f18902p = null;
    }

    @Override // j0.f2
    public void d() {
        ad.x1 d10;
        ad.x1 x1Var = this.f18902p;
        if (x1Var != null) {
            ad.c2.e(x1Var, "Old job was still running!", null, 2, null);
        }
        d10 = ad.i.d(this.f18901m, null, null, this.f18900f, 3, null);
        this.f18902p = d10;
    }
}
