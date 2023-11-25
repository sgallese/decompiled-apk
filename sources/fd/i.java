package fd;

import ad.g1;
import ad.u2;
import ad.x0;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.Continuation;

/* compiled from: DispatchedContinuation.kt */
/* loaded from: classes4.dex */
public final class i<T> extends x0<T> implements kotlin.coroutines.jvm.internal.e, Continuation<T> {

    /* renamed from: u  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f15634u = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "_reusableCancellableContinuation");
    private volatile Object _reusableCancellableContinuation;

    /* renamed from: q  reason: collision with root package name */
    public final ad.g0 f15635q;

    /* renamed from: r  reason: collision with root package name */
    public final Continuation<T> f15636r;

    /* renamed from: s  reason: collision with root package name */
    public Object f15637s;

    /* renamed from: t  reason: collision with root package name */
    public final Object f15638t;

    /* JADX WARN: Multi-variable type inference failed */
    public i(ad.g0 g0Var, Continuation<? super T> continuation) {
        super(-1);
        this.f15635q = g0Var;
        this.f15636r = continuation;
        this.f15637s = j.a();
        this.f15638t = k0.b(getContext());
    }

    private final ad.n<?> m() {
        Object obj = f15634u.get(this);
        if (obj instanceof ad.n) {
            return (ad.n) obj;
        }
        return null;
    }

    @Override // ad.x0
    public void a(Object obj, Throwable th) {
        if (obj instanceof ad.b0) {
            ((ad.b0) obj).f469b.invoke(th);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.e
    public kotlin.coroutines.jvm.internal.e getCallerFrame() {
        Continuation<T> continuation = this.f15636r;
        if (continuation instanceof kotlin.coroutines.jvm.internal.e) {
            return (kotlin.coroutines.jvm.internal.e) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.Continuation
    public hc.f getContext() {
        return this.f15636r.getContext();
    }

    @Override // ad.x0
    public Object i() {
        Object obj = this.f15637s;
        this.f15637s = j.a();
        return obj;
    }

    public final void j() {
        do {
        } while (f15634u.get(this) == j.f15641b);
    }

    public final ad.n<T> k() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15634u;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                f15634u.set(this, j.f15641b);
                return null;
            } else if (obj instanceof ad.n) {
                if (androidx.concurrent.futures.b.a(f15634u, this, obj, j.f15641b)) {
                    return (ad.n) obj;
                }
            } else if (obj != j.f15641b && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
    }

    public final void l(hc.f fVar, T t10) {
        this.f15637s = t10;
        this.f573p = 1;
        this.f15635q.C0(fVar, this);
    }

    public final boolean p() {
        if (f15634u.get(this) != null) {
            return true;
        }
        return false;
    }

    public final boolean q(Throwable th) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15634u;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            g0 g0Var = j.f15641b;
            if (qc.q.d(obj, g0Var)) {
                if (androidx.concurrent.futures.b.a(f15634u, this, g0Var, th)) {
                    return true;
                }
            } else if (obj instanceof Throwable) {
                return true;
            } else {
                if (androidx.concurrent.futures.b.a(f15634u, this, obj, null)) {
                    return false;
                }
            }
        }
    }

    public final void r() {
        j();
        ad.n<?> m10 = m();
        if (m10 != null) {
            m10.q();
        }
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(Object obj) {
        hc.f context = this.f15636r.getContext();
        Object d10 = ad.d0.d(obj, null, 1, null);
        if (this.f15635q.D0(context)) {
            this.f15637s = d10;
            this.f573p = 0;
            this.f15635q.A0(context, this);
            return;
        }
        g1 b10 = u2.f562a.b();
        if (b10.Y0()) {
            this.f15637s = d10;
            this.f573p = 0;
            b10.R0(this);
            return;
        }
        b10.V0(true);
        try {
            hc.f context2 = getContext();
            Object c10 = k0.c(context2, this.f15638t);
            try {
                this.f15636r.resumeWith(obj);
                dc.w wVar = dc.w.f13270a;
                do {
                } while (b10.b1());
            } finally {
                k0.a(context2, c10);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public final Throwable s(ad.m<?> mVar) {
        g0 g0Var;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15634u;
        do {
            Object obj = atomicReferenceFieldUpdater.get(this);
            g0Var = j.f15641b;
            if (obj != g0Var) {
                if (obj instanceof Throwable) {
                    if (androidx.concurrent.futures.b.a(f15634u, this, obj, null)) {
                        return (Throwable) obj;
                    }
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        } while (!androidx.concurrent.futures.b.a(f15634u, this, g0Var, mVar));
        return null;
    }

    public String toString() {
        return "DispatchedContinuation[" + this.f15635q + ", " + ad.o0.c(this.f15636r) + ']';
    }

    @Override // ad.x0
    public Continuation<T> c() {
        return this;
    }
}
