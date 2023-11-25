package gd;

import dc.m;
import dc.n;
import dc.w;
import fd.j;
import ic.c;
import kotlin.coroutines.Continuation;
import pc.l;
import pc.p;

/* compiled from: Cancellable.kt */
/* loaded from: classes4.dex */
public final class a {
    private static final void a(Continuation<?> continuation, Throwable th) {
        m.a aVar = m.f13253f;
        continuation.resumeWith(m.a(n.a(th)));
        throw th;
    }

    public static final void b(Continuation<? super w> continuation, Continuation<?> continuation2) {
        Continuation c10;
        try {
            c10 = c.c(continuation);
            m.a aVar = m.f13253f;
            j.c(c10, m.a(w.f13270a), null, 2, null);
        } catch (Throwable th) {
            a(continuation2, th);
        }
    }

    public static final <T> void c(l<? super Continuation<? super T>, ? extends Object> lVar, Continuation<? super T> continuation) {
        Continuation a10;
        Continuation c10;
        try {
            a10 = c.a(lVar, continuation);
            c10 = c.c(a10);
            m.a aVar = m.f13253f;
            j.c(c10, m.a(w.f13270a), null, 2, null);
        } catch (Throwable th) {
            a(continuation, th);
        }
    }

    public static final <R, T> void d(p<? super R, ? super Continuation<? super T>, ? extends Object> pVar, R r10, Continuation<? super T> continuation, l<? super Throwable, w> lVar) {
        Continuation b10;
        Continuation c10;
        try {
            b10 = c.b(pVar, r10, continuation);
            c10 = c.c(b10);
            m.a aVar = m.f13253f;
            j.b(c10, m.a(w.f13270a), lVar);
        } catch (Throwable th) {
            a(continuation, th);
        }
    }

    public static /* synthetic */ void e(p pVar, Object obj, Continuation continuation, l lVar, int i10, Object obj2) {
        if ((i10 & 4) != 0) {
            lVar = null;
        }
        d(pVar, obj, continuation, lVar);
    }
}
