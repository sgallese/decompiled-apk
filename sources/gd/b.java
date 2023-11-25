package gd;

import ad.a0;
import ad.f2;
import dc.m;
import dc.n;
import fd.c0;
import fd.k0;
import hc.f;
import ic.d;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.h;
import kotlinx.coroutines.TimeoutCancellationException;
import pc.l;
import pc.p;

/* compiled from: Undispatched.kt */
/* loaded from: classes4.dex */
public final class b {
    public static final <T> void a(l<? super Continuation<? super T>, ? extends Object> lVar, Continuation<? super T> continuation) {
        Object d10;
        Continuation a10 = h.a(continuation);
        try {
            f context = continuation.getContext();
            Object c10 = k0.c(context, null);
            try {
                Object invoke = ((l) qc.k0.e(lVar, 1)).invoke(a10);
                d10 = d.d();
                if (invoke != d10) {
                    a10.resumeWith(m.a(invoke));
                }
            } finally {
                k0.a(context, c10);
            }
        } catch (Throwable th) {
            m.a aVar = m.f13253f;
            a10.resumeWith(m.a(n.a(th)));
        }
    }

    public static final <R, T> void b(p<? super R, ? super Continuation<? super T>, ? extends Object> pVar, R r10, Continuation<? super T> continuation) {
        Object d10;
        Continuation a10 = h.a(continuation);
        try {
            f context = continuation.getContext();
            Object c10 = k0.c(context, null);
            try {
                Object invoke = ((p) qc.k0.e(pVar, 2)).invoke(r10, a10);
                d10 = d.d();
                if (invoke != d10) {
                    a10.resumeWith(m.a(invoke));
                }
            } finally {
                k0.a(context, c10);
            }
        } catch (Throwable th) {
            m.a aVar = m.f13253f;
            a10.resumeWith(m.a(n.a(th)));
        }
    }

    public static final <T, R> Object c(c0<? super T> c0Var, R r10, p<? super R, ? super Continuation<? super T>, ? extends Object> pVar) {
        Object a0Var;
        Object d10;
        Object d11;
        Object d12;
        int i10 = 2;
        try {
            a0Var = ((p) qc.k0.e(pVar, 2)).invoke(r10, c0Var);
        } catch (Throwable th) {
            a0Var = new a0(th, false, i10, null);
        }
        d10 = d.d();
        if (a0Var == d10) {
            d12 = d.d();
            return d12;
        }
        Object u02 = c0Var.u0(a0Var);
        if (u02 == f2.f504b) {
            d11 = d.d();
            return d11;
        } else if (!(u02 instanceof a0)) {
            return f2.h(u02);
        } else {
            throw ((a0) u02).f462a;
        }
    }

    public static final <T, R> Object d(c0<? super T> c0Var, R r10, p<? super R, ? super Continuation<? super T>, ? extends Object> pVar) {
        Object a0Var;
        Object d10;
        Object d11;
        Object d12;
        boolean z10 = false;
        int i10 = 2;
        try {
            a0Var = ((p) qc.k0.e(pVar, 2)).invoke(r10, c0Var);
        } catch (Throwable th) {
            a0Var = new a0(th, z10, i10, null);
        }
        d10 = d.d();
        if (a0Var == d10) {
            d12 = d.d();
            return d12;
        }
        Object u02 = c0Var.u0(a0Var);
        if (u02 == f2.f504b) {
            d11 = d.d();
            return d11;
        }
        if (u02 instanceof a0) {
            Throwable th2 = ((a0) u02).f462a;
            if (!(th2 instanceof TimeoutCancellationException) || ((TimeoutCancellationException) th2).f19464f != c0Var) {
                z10 = true;
            }
            if (!z10) {
                if (a0Var instanceof a0) {
                    throw ((a0) a0Var).f462a;
                }
            } else {
                throw th2;
            }
        } else {
            a0Var = f2.h(u02);
        }
        return a0Var;
    }
}
