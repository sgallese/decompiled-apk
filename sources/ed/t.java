package ed;

import kotlin.coroutines.Continuation;
import qc.k0;

/* compiled from: SafeCollector.kt */
/* loaded from: classes4.dex */
public final class t {

    /* renamed from: a  reason: collision with root package name */
    private static final pc.q<dd.h<Object>, Object, Continuation<? super dc.w>, Object> f14289a;

    /* compiled from: SafeCollector.kt */
    /* loaded from: classes4.dex */
    /* synthetic */ class a extends qc.n implements pc.q<dd.h<? super Object>, Object, Continuation<? super dc.w>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public static final a f14290w = new a();

        a() {
            super(3, dd.h.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // pc.q
        /* renamed from: h  reason: merged with bridge method [inline-methods] */
        public final Object invoke(dd.h<Object> hVar, Object obj, Continuation<? super dc.w> continuation) {
            return hVar.emit(obj, continuation);
        }
    }

    static {
        a aVar = a.f14290w;
        qc.q.g(aVar, "null cannot be cast to non-null type kotlin.Function3<kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>, kotlin.Any?, kotlin.coroutines.Continuation<kotlin.Unit>, kotlin.Any?>");
        f14289a = (pc.q) k0.e(aVar, 3);
    }

    public static final /* synthetic */ pc.q a() {
        return f14289a;
    }
}
