package ad;

import ad.x1;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;

/* compiled from: Job.kt */
/* loaded from: classes4.dex */
public final /* synthetic */ class c2 {
    public static final y a(x1 x1Var) {
        return new z1(x1Var);
    }

    public static /* synthetic */ y b(x1 x1Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            x1Var = null;
        }
        return a2.a(x1Var);
    }

    public static final void c(x1 x1Var, String str, Throwable th) {
        x1Var.c(l1.a(str, th));
    }

    public static final void d(hc.f fVar, CancellationException cancellationException) {
        x1 x1Var = (x1) fVar.get(x1.f574b);
        if (x1Var != null) {
            x1Var.c(cancellationException);
        }
    }

    public static /* synthetic */ void e(x1 x1Var, String str, Throwable th, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            th = null;
        }
        a2.c(x1Var, str, th);
    }

    public static /* synthetic */ void f(hc.f fVar, CancellationException cancellationException, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cancellationException = null;
        }
        a2.d(fVar, cancellationException);
    }

    public static final Object g(x1 x1Var, Continuation<? super dc.w> continuation) {
        Object d10;
        x1.a.a(x1Var, null, 1, null);
        Object z10 = x1Var.z(continuation);
        d10 = ic.d.d();
        if (z10 == d10) {
            return z10;
        }
        return dc.w.f13270a;
    }

    public static final c1 h(x1 x1Var, c1 c1Var) {
        return x1Var.s0(new e1(c1Var));
    }

    public static final void i(x1 x1Var) {
        if (x1Var.b()) {
            return;
        }
        throw x1Var.B();
    }

    public static final void j(hc.f fVar) {
        x1 x1Var = (x1) fVar.get(x1.f574b);
        if (x1Var != null) {
            a2.j(x1Var);
        }
    }

    public static final x1 k(hc.f fVar) {
        x1 x1Var = (x1) fVar.get(x1.f574b);
        if (x1Var != null) {
            return x1Var;
        }
        throw new IllegalStateException(("Current context doesn't contain Job in it: " + fVar).toString());
    }

    public static final boolean l(hc.f fVar) {
        x1 x1Var = (x1) fVar.get(x1.f574b);
        if (x1Var != null) {
            return x1Var.b();
        }
        return true;
    }
}
