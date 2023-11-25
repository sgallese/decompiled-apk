package fd;

import ad.g1;
import ad.u2;
import ad.x1;
import ad.z2;
import dc.m;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;

/* compiled from: DispatchedContinuation.kt */
/* loaded from: classes4.dex */
public final class j {

    /* renamed from: a */
    private static final g0 f15640a = new g0("UNDEFINED");

    /* renamed from: b */
    public static final g0 f15641b = new g0("REUSABLE_CLAIMED");

    /* JADX WARN: Finally extract failed */
    public static final <T> void b(Continuation<? super T> continuation, Object obj, pc.l<? super Throwable, dc.w> lVar) {
        boolean z10;
        z2<?> z2Var;
        if (continuation instanceof i) {
            i iVar = (i) continuation;
            Object c10 = ad.d0.c(obj, lVar);
            if (iVar.f15635q.D0(iVar.getContext())) {
                iVar.f15637s = c10;
                iVar.f573p = 1;
                iVar.f15635q.A0(iVar.getContext(), iVar);
                return;
            }
            g1 b10 = u2.f562a.b();
            if (b10.Y0()) {
                iVar.f15637s = c10;
                iVar.f573p = 1;
                b10.R0(iVar);
                return;
            }
            b10.V0(true);
            try {
                x1 x1Var = (x1) iVar.getContext().get(x1.f574b);
                if (x1Var != null && !x1Var.b()) {
                    CancellationException B = x1Var.B();
                    iVar.a(c10, B);
                    m.a aVar = dc.m.f13253f;
                    iVar.resumeWith(dc.m.a(dc.n.a(B)));
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    Continuation<T> continuation2 = iVar.f15636r;
                    Object obj2 = iVar.f15638t;
                    hc.f context = continuation2.getContext();
                    Object c11 = k0.c(context, obj2);
                    if (c11 != k0.f15643a) {
                        z2Var = ad.f0.g(continuation2, context, c11);
                    } else {
                        z2Var = null;
                    }
                    try {
                        iVar.f15636r.resumeWith(obj);
                        dc.w wVar = dc.w.f13270a;
                        if (z2Var == null || z2Var.X0()) {
                            k0.a(context, c11);
                        }
                    } catch (Throwable th) {
                        if (z2Var == null || z2Var.X0()) {
                            k0.a(context, c11);
                        }
                        throw th;
                    }
                }
                do {
                } while (b10.b1());
            } finally {
                try {
                    return;
                } finally {
                }
            }
            return;
        }
        continuation.resumeWith(obj);
    }

    public static /* synthetic */ void c(Continuation continuation, Object obj, pc.l lVar, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            lVar = null;
        }
        b(continuation, obj, lVar);
    }

    public static final boolean d(i<? super dc.w> iVar) {
        dc.w wVar = dc.w.f13270a;
        g1 b10 = u2.f562a.b();
        if (b10.Z0()) {
            return false;
        }
        if (b10.Y0()) {
            iVar.f15637s = wVar;
            iVar.f573p = 1;
            b10.R0(iVar);
            return true;
        }
        b10.V0(true);
        try {
            iVar.run();
            do {
            } while (b10.b1());
        } finally {
            try {
                return false;
            } finally {
            }
        }
        return false;
    }
}
