package androidx.lifecycle;

import ad.s2;

/* compiled from: Lifecycle.kt */
/* loaded from: classes.dex */
public final class t {
    public static final q a(p pVar) {
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl;
        qc.q.i(pVar, "<this>");
        do {
            LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl2 = (LifecycleCoroutineScopeImpl) pVar.c().get();
            if (lifecycleCoroutineScopeImpl2 != null) {
                return lifecycleCoroutineScopeImpl2;
            }
            lifecycleCoroutineScopeImpl = new LifecycleCoroutineScopeImpl(pVar, s2.b(null, 1, null).plus(ad.a1.c().I0()));
        } while (!s.t0.a(pVar.c(), null, lifecycleCoroutineScopeImpl));
        lifecycleCoroutineScopeImpl.b();
        return lifecycleCoroutineScopeImpl;
    }
}
