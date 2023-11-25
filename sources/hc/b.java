package hc;

import hc.f;
import hc.f.b;
import pc.l;
import qc.q;

/* compiled from: CoroutineContextImpl.kt */
/* loaded from: classes4.dex */
public abstract class b<B extends f.b, E extends B> implements f.c<E> {

    /* renamed from: f  reason: collision with root package name */
    private final l<f.b, E> f16593f;

    /* renamed from: m  reason: collision with root package name */
    private final f.c<?> f16594m;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, pc.l<hc.f$b, E extends B>, pc.l<? super hc.f$b, ? extends E extends B>] */
    public b(f.c<B> cVar, l<? super f.b, ? extends E> lVar) {
        q.i(cVar, "baseKey");
        q.i(lVar, "safeCast");
        this.f16593f = lVar;
        this.f16594m = cVar instanceof b ? (f.c<B>) ((b) cVar).f16594m : cVar;
    }

    public final boolean a(f.c<?> cVar) {
        q.i(cVar, "key");
        if (cVar != this && this.f16594m != cVar) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Incorrect return type in method signature: (Lhc/f$b;)TE; */
    public final f.b b(f.b bVar) {
        q.i(bVar, "element");
        return (f.b) this.f16593f.invoke(bVar);
    }
}
