package hc;

import dc.m;
import dc.w;
import kotlin.coroutines.Continuation;
import pc.l;
import pc.p;
import qc.q;

/* compiled from: Continuation.kt */
/* loaded from: classes4.dex */
public final class e {
    public static final <R, T> Continuation<w> a(p<? super R, ? super Continuation<? super T>, ? extends Object> pVar, R r10, Continuation<? super T> continuation) {
        Continuation b10;
        Continuation c10;
        Object d10;
        q.i(pVar, "<this>");
        q.i(continuation, "completion");
        b10 = ic.c.b(pVar, r10, continuation);
        c10 = ic.c.c(b10);
        d10 = ic.d.d();
        return new h(c10, d10);
    }

    public static final <T> void b(l<? super Continuation<? super T>, ? extends Object> lVar, Continuation<? super T> continuation) {
        Continuation a10;
        Continuation c10;
        q.i(lVar, "<this>");
        q.i(continuation, "completion");
        a10 = ic.c.a(lVar, continuation);
        c10 = ic.c.c(a10);
        m.a aVar = m.f13253f;
        c10.resumeWith(m.a(w.f13270a));
    }

    public static final <R, T> void c(p<? super R, ? super Continuation<? super T>, ? extends Object> pVar, R r10, Continuation<? super T> continuation) {
        Continuation b10;
        Continuation c10;
        q.i(pVar, "<this>");
        q.i(continuation, "completion");
        b10 = ic.c.b(pVar, r10, continuation);
        c10 = ic.c.c(b10);
        m.a aVar = m.f13253f;
        c10.resumeWith(m.a(w.f13270a));
    }
}
