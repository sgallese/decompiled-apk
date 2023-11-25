package hc;

import hc.f;
import pc.p;
import qc.q;

/* compiled from: CoroutineContextImpl.kt */
/* loaded from: classes4.dex */
public abstract class a implements f.b {
    private final f.c<?> key;

    public a(f.c<?> cVar) {
        q.i(cVar, "key");
        this.key = cVar;
    }

    @Override // hc.f
    public <R> R fold(R r10, p<? super R, ? super f.b, ? extends R> pVar) {
        return (R) f.b.a.a(this, r10, pVar);
    }

    @Override // hc.f.b, hc.f
    public <E extends f.b> E get(f.c<E> cVar) {
        return (E) f.b.a.b(this, cVar);
    }

    @Override // hc.f.b
    public f.c<?> getKey() {
        return this.key;
    }

    @Override // hc.f
    public f minusKey(f.c<?> cVar) {
        return f.b.a.c(this, cVar);
    }

    @Override // hc.f
    public f plus(f fVar) {
        return f.b.a.d(this, fVar);
    }
}
