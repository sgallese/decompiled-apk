package ed;

import kotlin.coroutines.Continuation;

/* compiled from: SendingCollector.kt */
/* loaded from: classes4.dex */
public final class v<T> implements dd.h<T> {

    /* renamed from: f  reason: collision with root package name */
    private final cd.s<T> f14292f;

    /* JADX WARN: Multi-variable type inference failed */
    public v(cd.s<? super T> sVar) {
        this.f14292f = sVar;
    }

    @Override // dd.h
    public Object emit(T t10, Continuation<? super dc.w> continuation) {
        Object d10;
        Object r10 = this.f14292f.r(t10, continuation);
        d10 = ic.d.d();
        if (r10 == d10) {
            return r10;
        }
        return dc.w.f13270a;
    }
}
