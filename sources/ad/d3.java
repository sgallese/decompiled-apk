package ad;

import kotlin.coroutines.Continuation;

/* compiled from: Yield.kt */
/* loaded from: classes4.dex */
public final class d3 {
    public static final Object a(Continuation<? super dc.w> continuation) {
        Continuation c10;
        fd.i iVar;
        Object d10;
        Object d11;
        Object d12;
        hc.f context = continuation.getContext();
        a2.k(context);
        c10 = ic.c.c(continuation);
        if (c10 instanceof fd.i) {
            iVar = (fd.i) c10;
        } else {
            iVar = null;
        }
        if (iVar == null) {
            d10 = dc.w.f13270a;
        } else {
            if (iVar.f15635q.D0(context)) {
                iVar.l(context, dc.w.f13270a);
            } else {
                c3 c3Var = new c3();
                hc.f plus = context.plus(c3Var);
                dc.w wVar = dc.w.f13270a;
                iVar.l(plus, wVar);
                if (c3Var.f472f) {
                    d10 = fd.j.d(iVar) ? ic.d.d() : wVar;
                }
            }
            d10 = ic.d.d();
        }
        d11 = ic.d.d();
        if (d10 == d11) {
            kotlin.coroutines.jvm.internal.h.c(continuation);
        }
        d12 = ic.d.d();
        if (d10 == d12) {
            return d10;
        }
        return dc.w.f13270a;
    }
}
