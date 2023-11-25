package ad;

import java.util.concurrent.locks.LockSupport;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Builders.kt */
/* loaded from: classes4.dex */
public final class e<T> extends a<T> {

    /* renamed from: q  reason: collision with root package name */
    private final Thread f476q;

    /* renamed from: r  reason: collision with root package name */
    private final g1 f477r;

    public e(hc.f fVar, Thread thread, g1 g1Var) {
        super(fVar, true, true);
        this.f476q = thread;
        this.f477r = g1Var;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ad.e2
    public void C(Object obj) {
        if (!qc.q.d(Thread.currentThread(), this.f476q)) {
            Thread thread = this.f476q;
            c.a();
            LockSupport.unpark(thread);
        }
    }

    public final T X0() {
        long j10;
        c.a();
        try {
            g1 g1Var = this.f477r;
            a0 a0Var = null;
            if (g1Var != null) {
                g1.X0(g1Var, false, 1, null);
            }
            while (!Thread.interrupted()) {
                try {
                    g1 g1Var2 = this.f477r;
                    if (g1Var2 != null) {
                        j10 = g1Var2.a1();
                    } else {
                        j10 = Long.MAX_VALUE;
                    }
                    if (!x0()) {
                        c.a();
                        LockSupport.parkNanos(this, j10);
                    } else {
                        c.a();
                        T t10 = (T) f2.h(h0());
                        if (t10 instanceof a0) {
                            a0Var = (a0) t10;
                        }
                        if (a0Var == null) {
                            return t10;
                        }
                        throw a0Var.f462a;
                    }
                } finally {
                    g1 g1Var3 = this.f477r;
                    if (g1Var3 != null) {
                        g1.J0(g1Var3, false, 1, null);
                    }
                }
            }
            InterruptedException interruptedException = new InterruptedException();
            G(interruptedException);
            throw interruptedException;
        } catch (Throwable th) {
            c.a();
            throw th;
        }
    }

    @Override // ad.e2
    protected boolean n0() {
        return true;
    }
}
