package ed;

import hc.f;

/* compiled from: SafeCollector.kt */
/* loaded from: classes4.dex */
public final class k implements hc.f {

    /* renamed from: f  reason: collision with root package name */
    public final Throwable f14270f;

    /* renamed from: m  reason: collision with root package name */
    private final /* synthetic */ hc.f f14271m;

    public k(Throwable th, hc.f fVar) {
        this.f14270f = th;
        this.f14271m = fVar;
    }

    @Override // hc.f
    public <R> R fold(R r10, pc.p<? super R, ? super f.b, ? extends R> pVar) {
        return (R) this.f14271m.fold(r10, pVar);
    }

    @Override // hc.f
    public <E extends f.b> E get(f.c<E> cVar) {
        return (E) this.f14271m.get(cVar);
    }

    @Override // hc.f
    public hc.f minusKey(f.c<?> cVar) {
        return this.f14271m.minusKey(cVar);
    }

    @Override // hc.f
    public hc.f plus(hc.f fVar) {
        return this.f14271m.plus(fVar);
    }
}
