package androidx.paging;

import kotlin.coroutines.Continuation;

/* compiled from: FlowExt.kt */
/* loaded from: classes.dex */
public final class h<T> implements dd.h<T> {

    /* renamed from: f  reason: collision with root package name */
    private final cd.s<T> f5725f;

    /* JADX WARN: Multi-variable type inference failed */
    public h(cd.s<? super T> sVar) {
        qc.q.i(sVar, "channel");
        this.f5725f = sVar;
    }

    @Override // dd.h
    public Object emit(T t10, Continuation<? super dc.w> continuation) {
        Object d10;
        Object r10 = this.f5725f.r(t10, continuation);
        d10 = ic.d.d();
        if (r10 == d10) {
            return r10;
        }
        return dc.w.f13270a;
    }
}
