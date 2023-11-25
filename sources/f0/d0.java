package f0;

import kotlin.coroutines.Continuation;

/* compiled from: Elevation.kt */
/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a  reason: collision with root package name */
    private static final s.h1<j2.h> f14509a = new s.h1<>(120, 0, s.d0.b(), 2, null);

    /* renamed from: b  reason: collision with root package name */
    private static final s.h1<j2.h> f14510b = new s.h1<>(150, 0, new s.w(0.4f, 0.0f, 0.6f, 1.0f), 2, null);

    /* renamed from: c  reason: collision with root package name */
    private static final s.h1<j2.h> f14511c = new s.h1<>(120, 0, new s.w(0.4f, 0.0f, 0.6f, 1.0f), 2, null);

    public static final Object d(s.a<j2.h, ?> aVar, float f10, v.j jVar, v.j jVar2, Continuation<? super dc.w> continuation) {
        s.j<j2.h> jVar3;
        Object d10;
        Object d11;
        if (jVar2 != null) {
            jVar3 = c0.f14466a.a(jVar2);
        } else if (jVar != null) {
            jVar3 = c0.f14466a.b(jVar);
        } else {
            jVar3 = null;
        }
        s.j<j2.h> jVar4 = jVar3;
        if (jVar4 != null) {
            Object f11 = s.a.f(aVar, j2.h.f(f10), jVar4, null, null, continuation, 12, null);
            d11 = ic.d.d();
            if (f11 == d11) {
                return f11;
            }
            return dc.w.f13270a;
        }
        Object u10 = aVar.u(j2.h.f(f10), continuation);
        d10 = ic.d.d();
        if (u10 == d10) {
            return u10;
        }
        return dc.w.f13270a;
    }
}
