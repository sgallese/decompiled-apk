package hc;

import hc.f;
import java.io.Serializable;
import pc.p;
import qc.q;

/* compiled from: CoroutineContextImpl.kt */
/* loaded from: classes4.dex */
public final class g implements f, Serializable {

    /* renamed from: f  reason: collision with root package name */
    public static final g f16601f = new g();

    private g() {
    }

    @Override // hc.f
    public <R> R fold(R r10, p<? super R, ? super f.b, ? extends R> pVar) {
        q.i(pVar, "operation");
        return r10;
    }

    @Override // hc.f
    public <E extends f.b> E get(f.c<E> cVar) {
        q.i(cVar, "key");
        return null;
    }

    public int hashCode() {
        return 0;
    }

    @Override // hc.f
    public f minusKey(f.c<?> cVar) {
        q.i(cVar, "key");
        return this;
    }

    @Override // hc.f
    public f plus(f fVar) {
        q.i(fVar, "context");
        return fVar;
    }

    public String toString() {
        return "EmptyCoroutineContext";
    }
}
