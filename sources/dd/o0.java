package dd;

import dc.m;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.Continuation;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: StateFlow.kt */
/* loaded from: classes4.dex */
public final class o0 extends ed.c<m0<?>> {

    /* renamed from: a  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f13400a = AtomicReferenceFieldUpdater.newUpdater(o0.class, Object.class, "_state");
    private volatile Object _state;

    @Override // ed.c
    /* renamed from: d  reason: merged with bridge method [inline-methods] */
    public boolean a(m0<?> m0Var) {
        fd.g0 g0Var;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f13400a;
        if (atomicReferenceFieldUpdater.get(this) == null) {
            g0Var = n0.f13394a;
            atomicReferenceFieldUpdater.set(this, g0Var);
            return true;
        }
        return false;
    }

    public final Object e(Continuation<? super dc.w> continuation) {
        Continuation c10;
        fd.g0 g0Var;
        Object d10;
        Object d11;
        c10 = ic.c.c(continuation);
        ad.n nVar = new ad.n(c10, 1);
        nVar.A();
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f13400a;
        g0Var = n0.f13394a;
        if (!androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, g0Var, nVar)) {
            m.a aVar = dc.m.f13253f;
            nVar.resumeWith(dc.m.a(dc.w.f13270a));
        }
        Object x10 = nVar.x();
        d10 = ic.d.d();
        if (x10 == d10) {
            kotlin.coroutines.jvm.internal.h.c(continuation);
        }
        d11 = ic.d.d();
        if (x10 == d11) {
            return x10;
        }
        return dc.w.f13270a;
    }

    @Override // ed.c
    /* renamed from: f  reason: merged with bridge method [inline-methods] */
    public Continuation<dc.w>[] b(m0<?> m0Var) {
        f13400a.set(this, null);
        return ed.b.f14212a;
    }

    public final void g() {
        fd.g0 g0Var;
        fd.g0 g0Var2;
        fd.g0 g0Var3;
        fd.g0 g0Var4;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f13400a;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj != null) {
                g0Var = n0.f13395b;
                if (obj != g0Var) {
                    g0Var2 = n0.f13394a;
                    if (obj == g0Var2) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f13400a;
                        g0Var3 = n0.f13395b;
                        if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater2, this, obj, g0Var3)) {
                            return;
                        }
                    } else {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = f13400a;
                        g0Var4 = n0.f13394a;
                        if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater3, this, obj, g0Var4)) {
                            m.a aVar = dc.m.f13253f;
                            ((ad.n) obj).resumeWith(dc.m.a(dc.w.f13270a));
                            return;
                        }
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public final boolean h() {
        fd.g0 g0Var;
        fd.g0 g0Var2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f13400a;
        g0Var = n0.f13394a;
        Object andSet = atomicReferenceFieldUpdater.getAndSet(this, g0Var);
        qc.q.f(andSet);
        g0Var2 = n0.f13395b;
        if (andSet == g0Var2) {
            return true;
        }
        return false;
    }
}
