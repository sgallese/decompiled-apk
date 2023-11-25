package hd;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import qc.f0;

/* compiled from: WorkQueue.kt */
/* loaded from: classes4.dex */
public final class n {

    /* renamed from: b  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f16649b = AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, "lastScheduledTask");

    /* renamed from: c  reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f16650c = AtomicIntegerFieldUpdater.newUpdater(n.class, "producerIndex");

    /* renamed from: d  reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f16651d = AtomicIntegerFieldUpdater.newUpdater(n.class, "consumerIndex");

    /* renamed from: e  reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f16652e = AtomicIntegerFieldUpdater.newUpdater(n.class, "blockingTasksInBuffer");

    /* renamed from: a  reason: collision with root package name */
    private final AtomicReferenceArray<h> f16653a = new AtomicReferenceArray<>(128);
    private volatile int blockingTasksInBuffer;
    private volatile int consumerIndex;
    private volatile Object lastScheduledTask;
    private volatile int producerIndex;

    private final h b(h hVar) {
        if (d() == 127) {
            return hVar;
        }
        boolean z10 = true;
        if (hVar.f16637m.b() != 1) {
            z10 = false;
        }
        if (z10) {
            f16652e.incrementAndGet(this);
        }
        int i10 = f16650c.get(this) & 127;
        while (this.f16653a.get(i10) != null) {
            Thread.yield();
        }
        this.f16653a.lazySet(i10, hVar);
        f16650c.incrementAndGet(this);
        return null;
    }

    private final void c(h hVar) {
        if (hVar != null) {
            boolean z10 = true;
            if (hVar.f16637m.b() != 1) {
                z10 = false;
            }
            if (z10) {
                f16652e.decrementAndGet(this);
            }
        }
    }

    private final int d() {
        return f16650c.get(this) - f16651d.get(this);
    }

    private final h i() {
        h andSet;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f16651d;
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 - f16650c.get(this) == 0) {
                return null;
            }
            int i11 = i10 & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i10, i10 + 1) && (andSet = this.f16653a.getAndSet(i11, null)) != null) {
                c(andSet);
                return andSet;
            }
        }
    }

    private final boolean j(d dVar) {
        h i10 = i();
        if (i10 == null) {
            return false;
        }
        dVar.a(i10);
        return true;
    }

    private final h k(boolean z10) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        h hVar;
        do {
            atomicReferenceFieldUpdater = f16649b;
            hVar = (h) atomicReferenceFieldUpdater.get(this);
            if (hVar != null) {
                boolean z11 = true;
                if (hVar.f16637m.b() != 1) {
                    z11 = false;
                }
                if (z11 == z10) {
                }
            }
            int i10 = f16651d.get(this);
            int i11 = f16650c.get(this);
            while (i10 != i11) {
                if (z10 && f16652e.get(this) == 0) {
                    return null;
                }
                i11--;
                h m10 = m(i11, z10);
                if (m10 != null) {
                    return m10;
                }
            }
            return null;
        } while (!androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, hVar, null));
        return hVar;
    }

    private final h l(int i10) {
        int i11 = f16651d.get(this);
        int i12 = f16650c.get(this);
        boolean z10 = true;
        if (i10 != 1) {
            z10 = false;
        }
        while (i11 != i12) {
            if (z10 && f16652e.get(this) == 0) {
                return null;
            }
            int i13 = i11 + 1;
            h m10 = m(i11, z10);
            if (m10 == null) {
                i11 = i13;
            } else {
                return m10;
            }
        }
        return null;
    }

    private final h m(int i10, boolean z10) {
        int i11 = i10 & 127;
        h hVar = this.f16653a.get(i11);
        if (hVar != null) {
            boolean z11 = true;
            if (hVar.f16637m.b() != 1) {
                z11 = false;
            }
            if (z11 == z10 && cd.i.a(this.f16653a, i11, hVar, null)) {
                if (z10) {
                    f16652e.decrementAndGet(this);
                }
                return hVar;
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, hd.h, java.lang.Object] */
    private final long o(int i10, f0<h> f0Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        ?? r12;
        boolean z10;
        do {
            atomicReferenceFieldUpdater = f16649b;
            r12 = (h) atomicReferenceFieldUpdater.get(this);
            if (r12 == 0) {
                return -2L;
            }
            int i11 = 1;
            if (r12.f16637m.b() == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                i11 = 2;
            }
            if ((i11 & i10) == 0) {
                return -2L;
            }
            long a10 = l.f16645f.a() - r12.f16636f;
            long j10 = l.f16641b;
            if (a10 < j10) {
                return j10 - a10;
            }
        } while (!androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, r12, null));
        f0Var.f21676f = r12;
        return -1L;
    }

    public final h a(h hVar, boolean z10) {
        if (z10) {
            return b(hVar);
        }
        h hVar2 = (h) f16649b.getAndSet(this, hVar);
        if (hVar2 == null) {
            return null;
        }
        return b(hVar2);
    }

    public final int e() {
        if (f16649b.get(this) != null) {
            return d() + 1;
        }
        return d();
    }

    public final void f(d dVar) {
        h hVar = (h) f16649b.getAndSet(this, null);
        if (hVar != null) {
            dVar.a(hVar);
        }
        do {
        } while (j(dVar));
    }

    public final h g() {
        h hVar = (h) f16649b.getAndSet(this, null);
        if (hVar == null) {
            return i();
        }
        return hVar;
    }

    public final h h() {
        return k(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long n(int i10, f0<h> f0Var) {
        T t10;
        if (i10 == 3) {
            t10 = i();
        } else {
            t10 = l(i10);
        }
        if (t10 != 0) {
            f0Var.f21676f = t10;
            return -1L;
        }
        return o(i10, f0Var);
    }
}
