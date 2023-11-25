package ed;

import fd.k0;
import kotlin.coroutines.Continuation;

/* compiled from: ChannelFlow.kt */
/* loaded from: classes4.dex */
public final class e {
    public static final /* synthetic */ dd.h a(dd.h hVar, hc.f fVar) {
        return d(hVar, fVar);
    }

    public static final <T, V> Object b(hc.f fVar, V v10, Object obj, pc.p<? super V, ? super Continuation<? super T>, ? extends Object> pVar, Continuation<? super T> continuation) {
        Object d10;
        Object c10 = k0.c(fVar, obj);
        try {
            Object invoke = ((pc.p) qc.k0.e(pVar, 2)).invoke(v10, new w(continuation, fVar));
            k0.a(fVar, c10);
            d10 = ic.d.d();
            if (invoke == d10) {
                kotlin.coroutines.jvm.internal.h.c(continuation);
            }
            return invoke;
        } catch (Throwable th) {
            k0.a(fVar, c10);
            throw th;
        }
    }

    public static /* synthetic */ Object c(hc.f fVar, Object obj, Object obj2, pc.p pVar, Continuation continuation, int i10, Object obj3) {
        if ((i10 & 4) != 0) {
            obj2 = k0.b(fVar);
        }
        return b(fVar, obj, obj2, pVar, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> dd.h<T> d(dd.h<? super T> hVar, hc.f fVar) {
        boolean z10;
        if (hVar instanceof v) {
            z10 = true;
        } else {
            z10 = hVar instanceof q;
        }
        if (!z10) {
            return new y(hVar, fVar);
        }
        return hVar;
    }
}
