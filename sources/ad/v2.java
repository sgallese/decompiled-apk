package ad;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.KotlinNothingValueException;

/* compiled from: Interruptible.kt */
/* loaded from: classes4.dex */
final class v2 implements pc.l<Throwable, dc.w> {

    /* renamed from: q  reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f566q = AtomicIntegerFieldUpdater.newUpdater(v2.class, "_state");
    private volatile int _state;

    /* renamed from: f  reason: collision with root package name */
    private final x1 f567f;

    /* renamed from: m  reason: collision with root package name */
    private final Thread f568m = Thread.currentThread();

    /* renamed from: p  reason: collision with root package name */
    private c1 f569p;

    public v2(x1 x1Var) {
        this.f567f = x1Var;
    }

    private final Void b(int i10) {
        throw new IllegalStateException(("Illegal state " + i10).toString());
    }

    public final void a() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f566q;
        while (true) {
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        Thread.interrupted();
                        return;
                    } else {
                        b(i10);
                        throw new KotlinNothingValueException();
                    }
                }
            } else if (f566q.compareAndSet(this, i10, 1)) {
                c1 c1Var = this.f569p;
                if (c1Var != null) {
                    c1Var.dispose();
                    return;
                }
                return;
            }
        }
    }

    public void c(Throwable th) {
        int i10;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = f566q;
        do {
            i10 = atomicIntegerFieldUpdater2.get(this);
            if (i10 != 0) {
                if (i10 != 1 && i10 != 2 && i10 != 3) {
                    b(i10);
                    throw new KotlinNothingValueException();
                }
                return;
            }
            atomicIntegerFieldUpdater = f566q;
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, 2));
        this.f568m.interrupt();
        atomicIntegerFieldUpdater.set(this, 3);
    }

    public final void d() {
        int i10;
        this.f569p = this.f567f.Q(true, true, this);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f566q;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 != 2 && i10 != 3) {
                    b(i10);
                    throw new KotlinNothingValueException();
                }
                return;
            }
        } while (!f566q.compareAndSet(this, i10, 0));
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ dc.w invoke(Throwable th) {
        c(th);
        return dc.w.f13270a;
    }
}
