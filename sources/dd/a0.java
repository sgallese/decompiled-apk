package dd;

import kotlin.coroutines.Continuation;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Builders.kt */
/* loaded from: classes4.dex */
public final class a0<T> extends a<T> {

    /* renamed from: f  reason: collision with root package name */
    private final pc.p<h<? super T>, Continuation<? super dc.w>, Object> f13277f;

    /* JADX WARN: Multi-variable type inference failed */
    public a0(pc.p<? super h<? super T>, ? super Continuation<? super dc.w>, ? extends Object> pVar) {
        this.f13277f = pVar;
    }

    @Override // dd.a
    public Object f(h<? super T> hVar, Continuation<? super dc.w> continuation) {
        Object d10;
        Object invoke = this.f13277f.invoke(hVar, continuation);
        d10 = ic.d.d();
        if (invoke == d10) {
            return invoke;
        }
        return dc.w.f13270a;
    }
}
