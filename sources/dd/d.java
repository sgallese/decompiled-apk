package dd;

import kotlin.coroutines.Continuation;

/* compiled from: Builders.kt */
/* loaded from: classes4.dex */
class d<T> extends ed.d<T> {

    /* renamed from: q  reason: collision with root package name */
    private final pc.p<cd.p<? super T>, Continuation<? super dc.w>, Object> f13306q;

    /* JADX WARN: Multi-variable type inference failed */
    public d(pc.p<? super cd.p<? super T>, ? super Continuation<? super dc.w>, ? extends Object> pVar, hc.f fVar, int i10, cd.a aVar) {
        super(fVar, i10, aVar);
        this.f13306q = pVar;
    }

    static /* synthetic */ <T> Object o(d<T> dVar, cd.p<? super T> pVar, Continuation<? super dc.w> continuation) {
        Object d10;
        Object invoke = ((d) dVar).f13306q.invoke(pVar, continuation);
        d10 = ic.d.d();
        if (invoke == d10) {
            return invoke;
        }
        return dc.w.f13270a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ed.d
    public Object i(cd.p<? super T> pVar, Continuation<? super dc.w> continuation) {
        return o(this, pVar, continuation);
    }

    @Override // ed.d
    public String toString() {
        return "block[" + this.f13306q + "] -> " + super.toString();
    }
}
