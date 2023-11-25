package ad;

import ad.x1;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CompletionHandlerException;

/* compiled from: CancellableContinuationImpl.kt */
/* loaded from: classes4.dex */
public class n<T> extends x0<T> implements m<T>, kotlin.coroutines.jvm.internal.e, b3 {

    /* renamed from: s  reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f537s = AtomicIntegerFieldUpdater.newUpdater(n.class, "_decisionAndIndex");

    /* renamed from: t  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f538t = AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, "_state");

    /* renamed from: u  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f539u = AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, "_parentHandle");
    private volatile int _decisionAndIndex;
    private volatile Object _parentHandle;
    private volatile Object _state;

    /* renamed from: q  reason: collision with root package name */
    private final Continuation<T> f540q;

    /* renamed from: r  reason: collision with root package name */
    private final hc.f f541r;

    /* JADX WARN: Multi-variable type inference failed */
    public n(Continuation<? super T> continuation, int i10) {
        super(i10);
        this.f540q = continuation;
        this.f541r = continuation.getContext();
        this._decisionAndIndex = 536870911;
        this._state = d.f473f;
    }

    private final c1 B() {
        x1 x1Var = (x1) getContext().get(x1.f574b);
        if (x1Var == null) {
            return null;
        }
        c1 d10 = x1.a.d(x1Var, true, false, new r(this), 2, null);
        androidx.concurrent.futures.b.a(f539u, this, null, d10);
        return d10;
    }

    private final void C(Object obj) {
        boolean z10;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f538t;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof d) {
                if (androidx.concurrent.futures.b.a(f538t, this, obj2, obj)) {
                    return;
                }
            } else {
                if (obj2 instanceof k) {
                    z10 = true;
                } else {
                    z10 = obj2 instanceof fd.d0;
                }
                if (z10) {
                    G(obj, obj2);
                } else {
                    boolean z11 = obj2 instanceof a0;
                    if (z11) {
                        a0 a0Var = (a0) obj2;
                        if (!a0Var.b()) {
                            G(obj, obj2);
                        }
                        if (obj2 instanceof q) {
                            Throwable th = null;
                            if (!z11) {
                                a0Var = null;
                            }
                            if (a0Var != null) {
                                th = a0Var.f462a;
                            }
                            if (obj instanceof k) {
                                k((k) obj, th);
                                return;
                            }
                            qc.q.g(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                            m((fd.d0) obj, th);
                            return;
                        }
                        return;
                    } else if (obj2 instanceof z) {
                        z zVar = (z) obj2;
                        if (zVar.f583b != null) {
                            G(obj, obj2);
                        }
                        if (obj instanceof fd.d0) {
                            return;
                        }
                        qc.q.g(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                        k kVar = (k) obj;
                        if (zVar.c()) {
                            k(kVar, zVar.f586e);
                            return;
                        }
                        if (androidx.concurrent.futures.b.a(f538t, this, obj2, z.b(zVar, null, kVar, null, null, null, 29, null))) {
                            return;
                        }
                    } else if (obj instanceof fd.d0) {
                        return;
                    } else {
                        qc.q.g(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                        if (androidx.concurrent.futures.b.a(f538t, this, obj2, new z(obj2, (k) obj, null, null, null, 28, null))) {
                            return;
                        }
                    }
                }
            }
        }
    }

    private final boolean E() {
        if (y0.c(this.f573p)) {
            Continuation<T> continuation = this.f540q;
            qc.q.g(continuation, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            if (((fd.i) continuation).p()) {
                return true;
            }
        }
        return false;
    }

    private final k F(pc.l<? super Throwable, dc.w> lVar) {
        if (lVar instanceof k) {
            return (k) lVar;
        }
        return new u1(lVar);
    }

    private final void G(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    private final void L(Object obj, int i10, pc.l<? super Throwable, dc.w> lVar) {
        Object obj2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f538t;
        do {
            obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof l2) {
            } else {
                if (obj2 instanceof q) {
                    q qVar = (q) obj2;
                    if (qVar.c()) {
                        if (lVar != null) {
                            l(lVar, qVar.f462a);
                            return;
                        }
                        return;
                    }
                }
                j(obj);
                throw new KotlinNothingValueException();
            }
        } while (!androidx.concurrent.futures.b.a(f538t, this, obj2, N((l2) obj2, obj, i10, lVar, null)));
        r();
        s(i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void M(n nVar, Object obj, int i10, pc.l lVar, int i11, Object obj2) {
        if (obj2 == null) {
            if ((i11 & 4) != 0) {
                lVar = null;
            }
            nVar.L(obj, i10, lVar);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resumeImpl");
    }

    private final Object N(l2 l2Var, Object obj, int i10, pc.l<? super Throwable, dc.w> lVar, Object obj2) {
        k kVar;
        if (!(obj instanceof a0)) {
            if (y0.b(i10) || obj2 != null) {
                if (lVar != null || (l2Var instanceof k) || obj2 != null) {
                    if (l2Var instanceof k) {
                        kVar = (k) l2Var;
                    } else {
                        kVar = null;
                    }
                    return new z(obj, kVar, lVar, obj2, null, 16, null);
                }
                return obj;
            }
            return obj;
        }
        return obj;
    }

    private final boolean O() {
        int i10;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f537s;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            int i11 = i10 >> 29;
            if (i11 != 0) {
                if (i11 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f537s.compareAndSet(this, i10, 1073741824 + (536870911 & i10)));
        return true;
    }

    private final fd.g0 P(Object obj, Object obj2, pc.l<? super Throwable, dc.w> lVar) {
        Object obj3;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f538t;
        do {
            obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj3 instanceof l2) {
            } else if (!(obj3 instanceof z) || obj2 == null || ((z) obj3).f585d != obj2) {
                return null;
            } else {
                return o.f544a;
            }
        } while (!androidx.concurrent.futures.b.a(f538t, this, obj3, N((l2) obj3, obj, this.f573p, lVar, obj2)));
        r();
        return o.f544a;
    }

    private final boolean Q() {
        int i10;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f537s;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            int i11 = i10 >> 29;
            if (i11 != 0) {
                if (i11 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!f537s.compareAndSet(this, i10, 536870912 + (536870911 & i10)));
        return true;
    }

    private final Void j(Object obj) {
        throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
    }

    private final void m(fd.d0<?> d0Var, Throwable th) {
        boolean z10;
        int i10 = f537s.get(this) & 536870911;
        if (i10 != 536870911) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            try {
                d0Var.o(i10, th, getContext());
                return;
            } catch (Throwable th2) {
                i0.a(getContext(), new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th2));
                return;
            }
        }
        throw new IllegalStateException("The index for Segment.onCancellation(..) is broken".toString());
    }

    private final boolean p(Throwable th) {
        if (!E()) {
            return false;
        }
        Continuation<T> continuation = this.f540q;
        qc.q.g(continuation, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return ((fd.i) continuation).q(th);
    }

    private final void r() {
        if (!E()) {
            q();
        }
    }

    private final void s(int i10) {
        if (O()) {
            return;
        }
        y0.a(this, i10);
    }

    private final c1 v() {
        return (c1) f539u.get(this);
    }

    private final String z() {
        Object y10 = y();
        if (y10 instanceof l2) {
            return "Active";
        }
        if (y10 instanceof q) {
            return "Cancelled";
        }
        return "Completed";
    }

    public void A() {
        c1 B = B();
        if (B != null && D()) {
            B.dispose();
            f539u.set(this, k2.f533f);
        }
    }

    public boolean D() {
        return !(y() instanceof l2);
    }

    protected String H() {
        return "CancellableContinuation";
    }

    public final void I(Throwable th) {
        if (p(th)) {
            return;
        }
        o(th);
        r();
    }

    public final void J() {
        fd.i iVar;
        Throwable s10;
        Continuation<T> continuation = this.f540q;
        if (continuation instanceof fd.i) {
            iVar = (fd.i) continuation;
        } else {
            iVar = null;
        }
        if (iVar != null && (s10 = iVar.s(this)) != null) {
            q();
            o(s10);
        }
    }

    public final boolean K() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f538t;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if ((obj instanceof z) && ((z) obj).f585d != null) {
            q();
            return false;
        }
        f537s.set(this, 536870911);
        atomicReferenceFieldUpdater.set(this, d.f473f);
        return true;
    }

    @Override // ad.x0
    public void a(Object obj, Throwable th) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f538t;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof l2)) {
                if (obj2 instanceof a0) {
                    return;
                }
                if (obj2 instanceof z) {
                    z zVar = (z) obj2;
                    if ((!zVar.c()) != false) {
                        if (androidx.concurrent.futures.b.a(f538t, this, obj2, z.b(zVar, null, null, null, null, th, 15, null))) {
                            zVar.d(this, th);
                            return;
                        }
                    } else {
                        throw new IllegalStateException("Must be called at most once".toString());
                    }
                } else if (androidx.concurrent.futures.b.a(f538t, this, obj2, new z(obj2, null, null, null, th, 14, null))) {
                    return;
                }
            } else {
                throw new IllegalStateException("Not completed".toString());
            }
        }
    }

    @Override // ad.b3
    public void b(fd.d0<?> d0Var, int i10) {
        int i11;
        boolean z10;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f537s;
        do {
            i11 = atomicIntegerFieldUpdater.get(this);
            if ((i11 & 536870911) == 536870911) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once".toString());
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i11, ((i11 >> 29) << 29) + i10));
        C(d0Var);
    }

    @Override // ad.x0
    public final Continuation<T> c() {
        return this.f540q;
    }

    @Override // ad.m
    public void d(T t10, pc.l<? super Throwable, dc.w> lVar) {
        L(t10, this.f573p, lVar);
    }

    @Override // ad.x0
    public Throwable e(Object obj) {
        Throwable e10 = super.e(obj);
        if (e10 == null) {
            return null;
        }
        return e10;
    }

    @Override // ad.m
    public void f(g0 g0Var, T t10) {
        fd.i iVar;
        int i10;
        Continuation<T> continuation = this.f540q;
        g0 g0Var2 = null;
        if (continuation instanceof fd.i) {
            iVar = (fd.i) continuation;
        } else {
            iVar = null;
        }
        if (iVar != null) {
            g0Var2 = iVar.f15635q;
        }
        if (g0Var2 == g0Var) {
            i10 = 4;
        } else {
            i10 = this.f573p;
        }
        M(this, t10, i10, null, 4, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ad.x0
    public <T> T g(Object obj) {
        if (obj instanceof z) {
            return (T) ((z) obj).f582a;
        }
        return obj;
    }

    @Override // kotlin.coroutines.jvm.internal.e
    public kotlin.coroutines.jvm.internal.e getCallerFrame() {
        Continuation<T> continuation = this.f540q;
        if (continuation instanceof kotlin.coroutines.jvm.internal.e) {
            return (kotlin.coroutines.jvm.internal.e) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.Continuation
    public hc.f getContext() {
        return this.f541r;
    }

    @Override // ad.x0
    public Object i() {
        return y();
    }

    public final void k(k kVar, Throwable th) {
        try {
            kVar.g(th);
        } catch (Throwable th2) {
            i0.a(getContext(), new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void l(pc.l<? super Throwable, dc.w> lVar, Throwable th) {
        try {
            lVar.invoke(th);
        } catch (Throwable th2) {
            i0.a(getContext(), new CompletionHandlerException("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    @Override // ad.m
    public void n(pc.l<? super Throwable, dc.w> lVar) {
        C(F(lVar));
    }

    @Override // ad.m
    public boolean o(Throwable th) {
        Object obj;
        boolean z10;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f538t;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            z10 = false;
            if (!(obj instanceof l2)) {
                return false;
            }
            if ((obj instanceof k) || (obj instanceof fd.d0)) {
                z10 = true;
            }
        } while (!androidx.concurrent.futures.b.a(f538t, this, obj, new q(this, th, z10)));
        l2 l2Var = (l2) obj;
        if (l2Var instanceof k) {
            k((k) obj, th);
        } else if (l2Var instanceof fd.d0) {
            m((fd.d0) obj, th);
        }
        r();
        s(this.f573p);
        return true;
    }

    public final void q() {
        c1 v10 = v();
        if (v10 == null) {
            return;
        }
        v10.dispose();
        f539u.set(this, k2.f533f);
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(Object obj) {
        M(this, d0.b(obj, this), this.f573p, null, 4, null);
    }

    @Override // ad.m
    public Object t(T t10, Object obj, pc.l<? super Throwable, dc.w> lVar) {
        return P(t10, obj, lVar);
    }

    public String toString() {
        return H() + '(' + o0.c(this.f540q) + "){" + z() + "}@" + o0.b(this);
    }

    public Throwable u(x1 x1Var) {
        return x1Var.B();
    }

    @Override // ad.m
    public void w(Object obj) {
        s(this.f573p);
    }

    public final Object x() {
        x1 x1Var;
        Object d10;
        boolean E = E();
        if (Q()) {
            if (v() == null) {
                B();
            }
            if (E) {
                J();
            }
            d10 = ic.d.d();
            return d10;
        }
        if (E) {
            J();
        }
        Object y10 = y();
        if (!(y10 instanceof a0)) {
            if (y0.b(this.f573p) && (x1Var = (x1) getContext().get(x1.f574b)) != null && !x1Var.b()) {
                CancellationException B = x1Var.B();
                a(y10, B);
                throw B;
            }
            return g(y10);
        }
        throw ((a0) y10).f462a;
    }

    public final Object y() {
        return f538t.get(this);
    }
}
