package androidx.paging;

import androidx.paging.n1;
import androidx.paging.u1;

/* compiled from: InitialPagedList.kt */
/* loaded from: classes.dex */
public final class d0<K, V> extends l<K, V> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(ad.k0 k0Var, ad.g0 g0Var, ad.g0 g0Var2, n1.d dVar, K k10) {
        super(new l0(g0Var, new c0()), k0Var, g0Var, g0Var2, null, dVar, u1.b.C0145b.f6103s.a(), k10);
        qc.q.i(k0Var, "coroutineScope");
        qc.q.i(g0Var, "notifyDispatcher");
        qc.q.i(g0Var2, "backgroundDispatcher");
        qc.q.i(dVar, "config");
    }
}
