package ad;

import dc.m;
import kotlin.coroutines.Continuation;

/* compiled from: DispatchedTask.kt */
/* loaded from: classes4.dex */
public final class y0 {
    public static final <T> void a(x0<? super T> x0Var, int i10) {
        boolean z10;
        Continuation<? super T> c10 = x0Var.c();
        if (i10 == 4) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 && (c10 instanceof fd.i) && b(i10) == b(x0Var.f573p)) {
            g0 g0Var = ((fd.i) c10).f15635q;
            hc.f context = c10.getContext();
            if (g0Var.D0(context)) {
                g0Var.A0(context, x0Var);
                return;
            } else {
                e(x0Var);
                return;
            }
        }
        d(x0Var, c10, z10);
    }

    public static final boolean b(int i10) {
        if (i10 == 1 || i10 == 2) {
            return true;
        }
        return false;
    }

    public static final boolean c(int i10) {
        if (i10 == 2) {
            return true;
        }
        return false;
    }

    public static final <T> void d(x0<? super T> x0Var, Continuation<? super T> continuation, boolean z10) {
        Object g10;
        z2<?> z2Var;
        boolean X0;
        Object i10 = x0Var.i();
        Throwable e10 = x0Var.e(i10);
        if (e10 != null) {
            m.a aVar = dc.m.f13253f;
            g10 = dc.n.a(e10);
        } else {
            m.a aVar2 = dc.m.f13253f;
            g10 = x0Var.g(i10);
        }
        Object a10 = dc.m.a(g10);
        if (z10) {
            qc.q.g(continuation, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
            fd.i iVar = (fd.i) continuation;
            Continuation<T> continuation2 = iVar.f15636r;
            Object obj = iVar.f15638t;
            hc.f context = continuation2.getContext();
            Object c10 = fd.k0.c(context, obj);
            if (c10 != fd.k0.f15643a) {
                z2Var = f0.g(continuation2, context, c10);
            } else {
                z2Var = null;
            }
            try {
                iVar.f15636r.resumeWith(a10);
                dc.w wVar = dc.w.f13270a;
                if (z2Var != null) {
                    if (!X0) {
                        return;
                    }
                }
                return;
            } finally {
                if (z2Var == null || z2Var.X0()) {
                    fd.k0.a(context, c10);
                }
            }
        }
        continuation.resumeWith(a10);
    }

    private static final void e(x0<?> x0Var) {
        g1 b10 = u2.f562a.b();
        if (b10.Y0()) {
            b10.R0(x0Var);
            return;
        }
        b10.V0(true);
        try {
            d(x0Var, x0Var.c(), true);
            do {
            } while (b10.b1());
        } finally {
            try {
            } finally {
            }
        }
    }
}
