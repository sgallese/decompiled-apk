package ad;

import hc.f;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CoroutineContext.kt */
/* loaded from: classes4.dex */
public final class a3 implements f.b, f.c<a3> {

    /* renamed from: f  reason: collision with root package name */
    public static final a3 f467f = new a3();

    private a3() {
    }

    @Override // hc.f
    public <R> R fold(R r10, pc.p<? super R, ? super f.b, ? extends R> pVar) {
        return (R) f.b.a.a(this, r10, pVar);
    }

    @Override // hc.f.b, hc.f
    public <E extends f.b> E get(f.c<E> cVar) {
        return (E) f.b.a.b(this, cVar);
    }

    @Override // hc.f
    public hc.f minusKey(f.c<?> cVar) {
        return f.b.a.c(this, cVar);
    }

    @Override // hc.f
    public hc.f plus(hc.f fVar) {
        return f.b.a.d(this, fVar);
    }

    @Override // hc.f.b
    public f.c<?> getKey() {
        return this;
    }
}
