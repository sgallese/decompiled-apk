package ad;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.Continuation;

/* compiled from: Builders.common.kt */
/* loaded from: classes4.dex */
public final class w0<T> extends fd.c0<T> {

    /* renamed from: r  reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f570r = AtomicIntegerFieldUpdater.newUpdater(w0.class, "_decision");
    private volatile int _decision;

    public w0(hc.f fVar, Continuation<? super T> continuation) {
        super(fVar, continuation);
    }

    private final boolean Y0() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f570r;
        do {
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f570r.compareAndSet(this, 0, 2));
        return true;
    }

    private final boolean Z0() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f570r;
        do {
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!f570r.compareAndSet(this, 0, 1));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // fd.c0, ad.e2
    public void C(Object obj) {
        T0(obj);
    }

    @Override // fd.c0, ad.a
    protected void T0(Object obj) {
        Continuation c10;
        if (!Y0()) {
            c10 = ic.c.c(this.f15622q);
            fd.j.c(c10, d0.a(obj, this.f15622q), null, 2, null);
        }
    }

    public final Object X0() {
        Object d10;
        if (Z0()) {
            d10 = ic.d.d();
            return d10;
        }
        Object h10 = f2.h(h0());
        if (!(h10 instanceof a0)) {
            return h10;
        }
        throw ((a0) h10).f462a;
    }
}
