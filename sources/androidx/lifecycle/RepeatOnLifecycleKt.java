package androidx.lifecycle;

import androidx.lifecycle.p;
import kotlin.coroutines.Continuation;

/* compiled from: RepeatOnLifecycle.kt */
/* loaded from: classes.dex */
public final class RepeatOnLifecycleKt {
    public static final Object a(p pVar, p.b bVar, pc.p<? super ad.k0, ? super Continuation<? super dc.w>, ? extends Object> pVar2, Continuation<? super dc.w> continuation) {
        boolean z10;
        Object d10;
        if (bVar != p.b.INITIALIZED) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (pVar.b() == p.b.DESTROYED) {
                return dc.w.f13270a;
            }
            Object e10 = ad.l0.e(new RepeatOnLifecycleKt$repeatOnLifecycle$3(pVar, bVar, pVar2, null), continuation);
            d10 = ic.d.d();
            if (e10 == d10) {
                return e10;
            }
            return dc.w.f13270a;
        }
        throw new IllegalArgumentException("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.".toString());
    }

    public static final Object b(v vVar, p.b bVar, pc.p<? super ad.k0, ? super Continuation<? super dc.w>, ? extends Object> pVar, Continuation<? super dc.w> continuation) {
        Object d10;
        Object a10 = a(vVar.getLifecycle(), bVar, pVar, continuation);
        d10 = ic.d.d();
        if (a10 == d10) {
            return a10;
        }
        return dc.w.f13270a;
    }
}
