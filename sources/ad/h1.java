package ad;

import ad.t0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: EventLoop.common.kt */
/* loaded from: classes4.dex */
public abstract class h1 extends i1 implements t0 {

    /* renamed from: r  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f518r = AtomicReferenceFieldUpdater.newUpdater(h1.class, Object.class, "_queue");

    /* renamed from: s  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f519s = AtomicReferenceFieldUpdater.newUpdater(h1.class, Object.class, "_delayed");

    /* renamed from: t  reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f520t = AtomicIntegerFieldUpdater.newUpdater(h1.class, "_isCompleted");
    private volatile Object _delayed;
    private volatile int _isCompleted = 0;
    private volatile Object _queue;

    /* compiled from: EventLoop.common.kt */
    /* loaded from: classes4.dex */
    private final class a extends c {

        /* renamed from: p  reason: collision with root package name */
        private final m<dc.w> f521p;

        /* JADX WARN: Multi-variable type inference failed */
        public a(long j10, m<? super dc.w> mVar) {
            super(j10);
            this.f521p = mVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f521p.f(h1.this, dc.w.f13270a);
        }

        @Override // ad.h1.c
        public String toString() {
            return super.toString() + this.f521p;
        }
    }

    /* compiled from: EventLoop.common.kt */
    /* loaded from: classes4.dex */
    private static final class b extends c {

        /* renamed from: p  reason: collision with root package name */
        private final Runnable f523p;

        public b(long j10, Runnable runnable) {
            super(j10);
            this.f523p = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f523p.run();
        }

        @Override // ad.h1.c
        public String toString() {
            return super.toString() + this.f523p;
        }
    }

    /* compiled from: EventLoop.common.kt */
    /* loaded from: classes4.dex */
    public static abstract class c implements Runnable, Comparable<c>, c1, fd.n0 {
        private volatile Object _heap;

        /* renamed from: f  reason: collision with root package name */
        public long f524f;

        /* renamed from: m  reason: collision with root package name */
        private int f525m = -1;

        public c(long j10) {
            this.f524f = j10;
        }

        @Override // fd.n0
        public fd.m0<?> b() {
            Object obj = this._heap;
            if (obj instanceof fd.m0) {
                return (fd.m0) obj;
            }
            return null;
        }

        @Override // ad.c1
        public final void dispose() {
            fd.g0 g0Var;
            d dVar;
            fd.g0 g0Var2;
            synchronized (this) {
                Object obj = this._heap;
                g0Var = k1.f531a;
                if (obj == g0Var) {
                    return;
                }
                if (obj instanceof d) {
                    dVar = (d) obj;
                } else {
                    dVar = null;
                }
                if (dVar != null) {
                    dVar.g(this);
                }
                g0Var2 = k1.f531a;
                this._heap = g0Var2;
                dc.w wVar = dc.w.f13270a;
            }
        }

        @Override // fd.n0
        public void f(fd.m0<?> m0Var) {
            fd.g0 g0Var;
            boolean z10;
            Object obj = this._heap;
            g0Var = k1.f531a;
            if (obj != g0Var) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                this._heap = m0Var;
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        @Override // java.lang.Comparable
        /* renamed from: g  reason: merged with bridge method [inline-methods] */
        public int compareTo(c cVar) {
            long j10 = this.f524f - cVar.f524f;
            if (j10 > 0) {
                return 1;
            }
            if (j10 < 0) {
                return -1;
            }
            return 0;
        }

        @Override // fd.n0
        public int getIndex() {
            return this.f525m;
        }

        public final int i(long j10, d dVar, h1 h1Var) {
            fd.g0 g0Var;
            synchronized (this) {
                Object obj = this._heap;
                g0Var = k1.f531a;
                if (obj == g0Var) {
                    return 2;
                }
                synchronized (dVar) {
                    c b10 = dVar.b();
                    if (h1Var.x0()) {
                        return 1;
                    }
                    if (b10 == null) {
                        dVar.f526c = j10;
                    } else {
                        long j11 = b10.f524f;
                        if (j11 - j10 < 0) {
                            j10 = j11;
                        }
                        if (j10 - dVar.f526c > 0) {
                            dVar.f526c = j10;
                        }
                    }
                    long j12 = this.f524f;
                    long j13 = dVar.f526c;
                    if (j12 - j13 < 0) {
                        this.f524f = j13;
                    }
                    dVar.a(this);
                    return 0;
                }
            }
        }

        public final boolean j(long j10) {
            if (j10 - this.f524f >= 0) {
                return true;
            }
            return false;
        }

        @Override // fd.n0
        public void setIndex(int i10) {
            this.f525m = i10;
        }

        public String toString() {
            return "Delayed[nanos=" + this.f524f + ']';
        }
    }

    /* compiled from: EventLoop.common.kt */
    /* loaded from: classes4.dex */
    public static final class d extends fd.m0<c> {

        /* renamed from: c  reason: collision with root package name */
        public long f526c;

        public d(long j10) {
            this.f526c = j10;
        }
    }

    private final void h1() {
        fd.g0 g0Var;
        fd.g0 g0Var2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f518r;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f518r;
                g0Var = k1.f532b;
                if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater2, this, null, g0Var)) {
                    return;
                }
            } else if (!(obj instanceof fd.t)) {
                g0Var2 = k1.f532b;
                if (obj == g0Var2) {
                    return;
                }
                fd.t tVar = new fd.t(8, true);
                qc.q.g(obj, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                tVar.a((Runnable) obj);
                if (androidx.concurrent.futures.b.a(f518r, this, obj, tVar)) {
                    return;
                }
            } else {
                ((fd.t) obj).d();
                return;
            }
        }
    }

    private final Runnable i1() {
        fd.g0 g0Var;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f518r;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                return null;
            }
            if (!(obj instanceof fd.t)) {
                g0Var = k1.f532b;
                if (obj == g0Var) {
                    return null;
                }
                if (androidx.concurrent.futures.b.a(f518r, this, obj, null)) {
                    qc.q.g(obj, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                    return (Runnable) obj;
                }
            } else {
                qc.q.g(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }>{ kotlinx.coroutines.EventLoop_commonKt.Queue<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }> }");
                fd.t tVar = (fd.t) obj;
                Object j10 = tVar.j();
                if (j10 != fd.t.f15675h) {
                    return (Runnable) j10;
                }
                androidx.concurrent.futures.b.a(f518r, this, obj, tVar.i());
            }
        }
    }

    private final boolean k1(Runnable runnable) {
        fd.g0 g0Var;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f518r;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (x0()) {
                return false;
            }
            if (obj == null) {
                if (androidx.concurrent.futures.b.a(f518r, this, null, runnable)) {
                    return true;
                }
            } else if (!(obj instanceof fd.t)) {
                g0Var = k1.f532b;
                if (obj == g0Var) {
                    return false;
                }
                fd.t tVar = new fd.t(8, true);
                qc.q.g(obj, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                tVar.a((Runnable) obj);
                tVar.a(runnable);
                if (androidx.concurrent.futures.b.a(f518r, this, obj, tVar)) {
                    return true;
                }
            } else {
                qc.q.g(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }>{ kotlinx.coroutines.EventLoop_commonKt.Queue<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }> }");
                fd.t tVar2 = (fd.t) obj;
                int a10 = tVar2.a(runnable);
                if (a10 == 0) {
                    return true;
                }
                if (a10 != 1) {
                    if (a10 == 2) {
                        return false;
                    }
                } else {
                    androidx.concurrent.futures.b.a(f518r, this, obj, tVar2.i());
                }
            }
        }
    }

    private final void m1() {
        c i10;
        ad.c.a();
        long nanoTime = System.nanoTime();
        while (true) {
            d dVar = (d) f519s.get(this);
            if (dVar != null && (i10 = dVar.i()) != null) {
                e1(nanoTime, i10);
            } else {
                return;
            }
        }
    }

    private final int p1(long j10, c cVar) {
        if (x0()) {
            return 1;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f519s;
        d dVar = (d) atomicReferenceFieldUpdater.get(this);
        if (dVar == null) {
            androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, null, new d(j10));
            Object obj = atomicReferenceFieldUpdater.get(this);
            qc.q.f(obj);
            dVar = (d) obj;
        }
        return cVar.i(j10, dVar, this);
    }

    private final void r1(boolean z10) {
        f520t.set(this, z10 ? 1 : 0);
    }

    private final boolean s1(c cVar) {
        c cVar2;
        d dVar = (d) f519s.get(this);
        if (dVar != null) {
            cVar2 = dVar.e();
        } else {
            cVar2 = null;
        }
        if (cVar2 == cVar) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean x0() {
        if (f520t.get(this) != 0) {
            return true;
        }
        return false;
    }

    @Override // ad.g0
    public final void A0(hc.f fVar, Runnable runnable) {
        j1(runnable);
    }

    @Override // ad.g1
    protected long T0() {
        c e10;
        long e11;
        fd.g0 g0Var;
        if (super.T0() == 0) {
            return 0L;
        }
        Object obj = f518r.get(this);
        if (obj != null) {
            if (!(obj instanceof fd.t)) {
                g0Var = k1.f532b;
                if (obj != g0Var) {
                    return 0L;
                }
                return Long.MAX_VALUE;
            } else if (!((fd.t) obj).g()) {
                return 0L;
            }
        }
        d dVar = (d) f519s.get(this);
        if (dVar == null || (e10 = dVar.e()) == null) {
            return Long.MAX_VALUE;
        }
        long j10 = e10.f524f;
        ad.c.a();
        e11 = vc.l.e(j10 - System.nanoTime(), 0L);
        return e11;
    }

    @Override // ad.g1
    public long a1() {
        c cVar;
        boolean z10;
        if (b1()) {
            return 0L;
        }
        d dVar = (d) f519s.get(this);
        if (dVar != null && !dVar.d()) {
            ad.c.a();
            long nanoTime = System.nanoTime();
            do {
                synchronized (dVar) {
                    c b10 = dVar.b();
                    cVar = null;
                    if (b10 != null) {
                        c cVar2 = b10;
                        if (cVar2.j(nanoTime)) {
                            z10 = k1(cVar2);
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            cVar = dVar.h(0);
                        }
                    }
                }
            } while (cVar != null);
        }
        Runnable i12 = i1();
        if (i12 != null) {
            i12.run();
            return 0L;
        }
        return T0();
    }

    @Override // ad.t0
    public void j(long j10, m<? super dc.w> mVar) {
        long c10 = k1.c(j10);
        if (c10 < 4611686018427387903L) {
            ad.c.a();
            long nanoTime = System.nanoTime();
            a aVar = new a(c10 + nanoTime, mVar);
            o1(nanoTime, aVar);
            p.a(mVar, aVar);
        }
    }

    public void j1(Runnable runnable) {
        if (k1(runnable)) {
            f1();
        } else {
            p0.f546u.j1(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean l1() {
        fd.g0 g0Var;
        if (!Z0()) {
            return false;
        }
        d dVar = (d) f519s.get(this);
        if (dVar != null && !dVar.d()) {
            return false;
        }
        Object obj = f518r.get(this);
        if (obj != null) {
            if (!(obj instanceof fd.t)) {
                g0Var = k1.f532b;
                if (obj != g0Var) {
                    return false;
                }
            } else {
                return ((fd.t) obj).g();
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void n1() {
        f518r.set(this, null);
        f519s.set(this, null);
    }

    public final void o1(long j10, c cVar) {
        int p12 = p1(j10, cVar);
        if (p12 != 0) {
            if (p12 != 1) {
                if (p12 != 2) {
                    throw new IllegalStateException("unexpected result".toString());
                }
                return;
            }
            e1(j10, cVar);
        } else if (s1(cVar)) {
            f1();
        }
    }

    @Override // ad.t0
    public c1 p0(long j10, Runnable runnable, hc.f fVar) {
        return t0.a.a(this, j10, runnable, fVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final c1 q1(long j10, Runnable runnable) {
        long c10 = k1.c(j10);
        if (c10 < 4611686018427387903L) {
            ad.c.a();
            long nanoTime = System.nanoTime();
            b bVar = new b(c10 + nanoTime, runnable);
            o1(nanoTime, bVar);
            return bVar;
        }
        return k2.f533f;
    }

    @Override // ad.g1
    public void shutdown() {
        u2.f562a.c();
        r1(true);
        h1();
        do {
        } while (a1() <= 0);
        m1();
    }
}
