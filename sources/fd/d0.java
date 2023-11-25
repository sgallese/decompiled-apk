package fd;

import ad.l2;
import fd.d0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: ConcurrentLinkedList.kt */
/* loaded from: classes4.dex */
public abstract class d0<S extends d0<S>> extends e<S> implements l2 {

    /* renamed from: q  reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f15624q = AtomicIntegerFieldUpdater.newUpdater(d0.class, "cleanedAndPointers");
    private volatile int cleanedAndPointers;

    /* renamed from: p  reason: collision with root package name */
    public final long f15625p;

    public d0(long j10, S s10, int i10) {
        super(s10);
        this.f15625p = j10;
        this.cleanedAndPointers = i10 << 16;
    }

    @Override // fd.e
    public boolean h() {
        if (f15624q.get(this) == n() && !i()) {
            return true;
        }
        return false;
    }

    public final boolean m() {
        if (f15624q.addAndGet(this, -65536) == n() && !i()) {
            return true;
        }
        return false;
    }

    public abstract int n();

    public abstract void o(int i10, Throwable th, hc.f fVar);

    public final void p() {
        if (f15624q.incrementAndGet(this) == n()) {
            k();
        }
    }

    public final boolean q() {
        int i10;
        boolean z10;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f15624q;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 == n() && !i()) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (!z10) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, 65536 + i10));
        return true;
    }
}
