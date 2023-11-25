package ed;

import kotlin.coroutines.Continuation;

/* compiled from: ChannelFlow.kt */
/* loaded from: classes4.dex */
public final class g<T> extends f<T, T> {
    public /* synthetic */ g(dd.g gVar, hc.f fVar, int i10, cd.a aVar, int i11, qc.h hVar) {
        this(gVar, (i11 & 2) != 0 ? hc.g.f16601f : fVar, (i11 & 4) != 0 ? -3 : i10, (i11 & 8) != 0 ? cd.a.SUSPEND : aVar);
    }

    @Override // ed.d
    protected d<T> j(hc.f fVar, int i10, cd.a aVar) {
        return new g(this.f14223q, fVar, i10, aVar);
    }

    @Override // ed.d
    public dd.g<T> k() {
        return (dd.g<T>) this.f14223q;
    }

    @Override // ed.f
    protected Object r(dd.h<? super T> hVar, Continuation<? super dc.w> continuation) {
        Object d10;
        Object collect = this.f14223q.collect(hVar, continuation);
        d10 = ic.d.d();
        if (collect == d10) {
            return collect;
        }
        return dc.w.f13270a;
    }

    public g(dd.g<? extends T> gVar, hc.f fVar, int i10, cd.a aVar) {
        super(gVar, fVar, i10, aVar);
    }
}
