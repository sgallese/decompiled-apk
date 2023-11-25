package fd;

import fd.e;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: ConcurrentLinkedList.kt */
/* loaded from: classes4.dex */
public abstract class e<N extends e<N>> {

    /* renamed from: f  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f15626f = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "_next");

    /* renamed from: m  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f15627m = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "_prev");
    private volatile Object _next;
    private volatile Object _prev;

    public e(N n10) {
        this._prev = n10;
    }

    private final N c() {
        N g10 = g();
        while (g10 != null && g10.h()) {
            g10 = (N) f15627m.get(g10);
        }
        return g10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [fd.e] */
    private final N d() {
        N e10 = e();
        qc.q.f(e10);
        while (e10.h()) {
            ?? e11 = e10.e();
            if (e11 == 0) {
                return e10;
            }
            e10 = e11;
        }
        return e10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object f() {
        return f15626f.get(this);
    }

    public final void b() {
        f15627m.lazySet(this, null);
    }

    public final N e() {
        Object f10 = f();
        if (f10 == d.a()) {
            return null;
        }
        return (N) f10;
    }

    public final N g() {
        return (N) f15627m.get(this);
    }

    public abstract boolean h();

    public final boolean i() {
        if (e() == null) {
            return true;
        }
        return false;
    }

    public final boolean j() {
        return androidx.concurrent.futures.b.a(f15626f, this, null, d.a());
    }

    public final void k() {
        Object obj;
        N n10;
        if (i()) {
            return;
        }
        while (true) {
            N c10 = c();
            N d10 = d();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15627m;
            do {
                obj = atomicReferenceFieldUpdater.get(d10);
                if (((e) obj) == null) {
                    n10 = null;
                } else {
                    n10 = c10;
                }
            } while (!androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, d10, obj, n10));
            if (c10 != null) {
                f15626f.set(c10, d10);
            }
            if (!d10.h() || d10.i()) {
                if (c10 == null || !c10.h()) {
                    return;
                }
            }
        }
    }

    public final boolean l(N n10) {
        return androidx.concurrent.futures.b.a(f15626f, this, null, n10);
    }
}
