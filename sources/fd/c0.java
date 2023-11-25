package fd;

import kotlin.coroutines.Continuation;

/* compiled from: Scopes.kt */
/* loaded from: classes4.dex */
public class c0<T> extends ad.a<T> implements kotlin.coroutines.jvm.internal.e {

    /* renamed from: q  reason: collision with root package name */
    public final Continuation<T> f15622q;

    /* JADX WARN: Multi-variable type inference failed */
    public c0(hc.f fVar, Continuation<? super T> continuation) {
        super(fVar, true, true);
        this.f15622q = continuation;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ad.e2
    public void C(Object obj) {
        Continuation c10;
        c10 = ic.c.c(this.f15622q);
        j.c(c10, ad.d0.a(obj, this.f15622q), null, 2, null);
    }

    @Override // ad.a
    protected void T0(Object obj) {
        Continuation<T> continuation = this.f15622q;
        continuation.resumeWith(ad.d0.a(obj, continuation));
    }

    @Override // kotlin.coroutines.jvm.internal.e
    public final kotlin.coroutines.jvm.internal.e getCallerFrame() {
        Continuation<T> continuation = this.f15622q;
        if (continuation instanceof kotlin.coroutines.jvm.internal.e) {
            return (kotlin.coroutines.jvm.internal.e) continuation;
        }
        return null;
    }

    @Override // ad.e2
    protected final boolean n0() {
        return true;
    }
}
