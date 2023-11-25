package ad;

import dc.m;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;

/* compiled from: DispatchedTask.kt */
/* loaded from: classes4.dex */
public abstract class x0<T> extends hd.h {

    /* renamed from: p  reason: collision with root package name */
    public int f573p;

    public x0(int i10) {
        this.f573p = i10;
    }

    public abstract Continuation<T> c();

    public Throwable e(Object obj) {
        a0 a0Var;
        if (obj instanceof a0) {
            a0Var = (a0) obj;
        } else {
            a0Var = null;
        }
        if (a0Var == null) {
            return null;
        }
        return a0Var.f462a;
    }

    public final void h(Throwable th, Throwable th2) {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            dc.b.a(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        qc.q.f(th);
        i0.a(c().getContext(), new n0("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object i();

    @Override // java.lang.Runnable
    public final void run() {
        Object a10;
        z2<?> z2Var;
        x1 x1Var;
        Object a11;
        hd.i iVar = this.f16637m;
        try {
            Continuation<T> c10 = c();
            qc.q.g(c10, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            fd.i iVar2 = (fd.i) c10;
            Continuation<T> continuation = iVar2.f15636r;
            Object obj = iVar2.f15638t;
            hc.f context = continuation.getContext();
            Object c11 = fd.k0.c(context, obj);
            if (c11 != fd.k0.f15643a) {
                z2Var = f0.g(continuation, context, c11);
            } else {
                z2Var = null;
            }
            try {
                hc.f context2 = continuation.getContext();
                Object i10 = i();
                Throwable e10 = e(i10);
                if (e10 == null && y0.b(this.f573p)) {
                    x1Var = (x1) context2.get(x1.f574b);
                } else {
                    x1Var = null;
                }
                if (x1Var != null && !x1Var.b()) {
                    CancellationException B = x1Var.B();
                    a(i10, B);
                    m.a aVar = dc.m.f13253f;
                    continuation.resumeWith(dc.m.a(dc.n.a(B)));
                } else if (e10 != null) {
                    m.a aVar2 = dc.m.f13253f;
                    continuation.resumeWith(dc.m.a(dc.n.a(e10)));
                } else {
                    m.a aVar3 = dc.m.f13253f;
                    continuation.resumeWith(dc.m.a(g(i10)));
                }
                dc.w wVar = dc.w.f13270a;
                try {
                    iVar.a();
                    a11 = dc.m.a(dc.w.f13270a);
                } catch (Throwable th) {
                    m.a aVar4 = dc.m.f13253f;
                    a11 = dc.m.a(dc.n.a(th));
                }
                h(null, dc.m.b(a11));
            } finally {
                if (z2Var == null || z2Var.X0()) {
                    fd.k0.a(context, c11);
                }
            }
        } catch (Throwable th2) {
            try {
                m.a aVar5 = dc.m.f13253f;
                iVar.a();
                a10 = dc.m.a(dc.w.f13270a);
            } catch (Throwable th3) {
                m.a aVar6 = dc.m.f13253f;
                a10 = dc.m.a(dc.n.a(th3));
            }
            h(th2, dc.m.b(a10));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T g(Object obj) {
        return obj;
    }

    public void a(Object obj, Throwable th) {
    }
}
