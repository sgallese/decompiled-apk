package v;

import dd.d0;
import dd.w;
import kotlin.coroutines.Continuation;

/* compiled from: InteractionSource.kt */
/* loaded from: classes.dex */
final class n implements m {

    /* renamed from: a  reason: collision with root package name */
    private final w<j> f24249a = d0.b(0, 16, cd.a.DROP_OLDEST, 1, null);

    @Override // v.m
    public boolean a(j jVar) {
        qc.q.i(jVar, "interaction");
        return b().e(jVar);
    }

    @Override // v.m
    public Object c(j jVar, Continuation<? super dc.w> continuation) {
        Object d10;
        Object emit = b().emit(jVar, continuation);
        d10 = ic.d.d();
        if (emit == d10) {
            return emit;
        }
        return dc.w.f13270a;
    }

    @Override // v.k
    /* renamed from: d  reason: merged with bridge method [inline-methods] */
    public w<j> b() {
        return this.f24249a;
    }
}
