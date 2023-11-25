package hd;

import ad.o0;
import dc.w;
import fd.b0;
import fd.g0;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import qc.f0;
import qc.q;

/* compiled from: CoroutineScheduler.kt */
/* loaded from: classes4.dex */
public final class a implements Executor, Closeable {

    /* renamed from: u  reason: collision with root package name */
    public static final C0394a f16605u = new C0394a(null);

    /* renamed from: v  reason: collision with root package name */
    private static final AtomicLongFieldUpdater f16606v = AtomicLongFieldUpdater.newUpdater(a.class, "parkedWorkersStack");

    /* renamed from: w  reason: collision with root package name */
    private static final AtomicLongFieldUpdater f16607w = AtomicLongFieldUpdater.newUpdater(a.class, "controlState");

    /* renamed from: x  reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f16608x = AtomicIntegerFieldUpdater.newUpdater(a.class, "_isTerminated");

    /* renamed from: y  reason: collision with root package name */
    public static final g0 f16609y = new g0("NOT_IN_STACK");
    private volatile int _isTerminated;
    private volatile long controlState;

    /* renamed from: f  reason: collision with root package name */
    public final int f16610f;

    /* renamed from: m  reason: collision with root package name */
    public final int f16611m;

    /* renamed from: p  reason: collision with root package name */
    public final long f16612p;
    private volatile long parkedWorkersStack;

    /* renamed from: q  reason: collision with root package name */
    public final String f16613q;

    /* renamed from: r  reason: collision with root package name */
    public final hd.d f16614r;

    /* renamed from: s  reason: collision with root package name */
    public final hd.d f16615s;

    /* renamed from: t  reason: collision with root package name */
    public final b0<c> f16616t;

    /* compiled from: CoroutineScheduler.kt */
    /* renamed from: hd.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0394a {
        private C0394a() {
        }

        public /* synthetic */ C0394a(qc.h hVar) {
            this();
        }
    }

    /* compiled from: CoroutineScheduler.kt */
    /* loaded from: classes4.dex */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f16617a;

        static {
            int[] iArr = new int[d.values().length];
            try {
                iArr[d.PARKING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d.BLOCKING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[d.CPU_ACQUIRED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[d.DORMANT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[d.TERMINATED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f16617a = iArr;
        }
    }

    /* compiled from: CoroutineScheduler.kt */
    /* loaded from: classes4.dex */
    public enum d {
        CPU_ACQUIRED,
        BLOCKING,
        PARKING,
        DORMANT,
        TERMINATED
    }

    public a(int i10, int i11, long j10, String str) {
        boolean z10;
        boolean z11;
        boolean z12;
        this.f16610f = i10;
        this.f16611m = i11;
        this.f16612p = j10;
        this.f16613q = str;
        if (i10 >= 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (i11 >= i10) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                if (i11 <= 2097150) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    if (j10 > 0) {
                        this.f16614r = new hd.d();
                        this.f16615s = new hd.d();
                        this.f16616t = new b0<>((i10 + 1) * 2);
                        this.controlState = i10 << 42;
                        this._isTerminated = 0;
                        return;
                    }
                    throw new IllegalArgumentException(("Idle worker keep alive time " + j10 + " must be positive").toString());
                }
                throw new IllegalArgumentException(("Max pool size " + i11 + " should not exceed maximal supported number of threads 2097150").toString());
            }
            throw new IllegalArgumentException(("Max pool size " + i11 + " should be greater than or equals to core pool size " + i10).toString());
        }
        throw new IllegalArgumentException(("Core pool size " + i10 + " should be at least 1").toString());
    }

    private final c B() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f16606v;
        while (true) {
            long j10 = atomicLongFieldUpdater.get(this);
            c b10 = this.f16616t.b((int) (2097151 & j10));
            if (b10 == null) {
                return null;
            }
            long j11 = (2097152 + j10) & (-2097152);
            int z10 = z(b10);
            if (z10 >= 0 && f16606v.compareAndSet(this, j10, z10 | j11)) {
                b10.r(f16609y);
                return b10;
            }
        }
    }

    private final void R(long j10, boolean z10) {
        if (z10 || i0() || Y(j10)) {
            return;
        }
        i0();
    }

    private final h V(c cVar, h hVar, boolean z10) {
        if (cVar == null) {
            return hVar;
        }
        if (cVar.f16621p == d.TERMINATED) {
            return hVar;
        }
        if (hVar.f16637m.b() == 0 && cVar.f16621p == d.BLOCKING) {
            return hVar;
        }
        cVar.f16625t = true;
        return cVar.f16619f.a(hVar, z10);
    }

    private final boolean Y(long j10) {
        int d10;
        d10 = vc.l.d(((int) (2097151 & j10)) - ((int) ((j10 & 4398044413952L) >> 21)), 0);
        if (d10 < this.f16610f) {
            int e10 = e();
            if (e10 == 1 && this.f16610f > 1) {
                e();
            }
            if (e10 > 0) {
                return true;
            }
        }
        return false;
    }

    private final boolean c(h hVar) {
        boolean z10 = true;
        if (hVar.f16637m.b() != 1) {
            z10 = false;
        }
        if (z10) {
            return this.f16615s.a(hVar);
        }
        return this.f16614r.a(hVar);
    }

    private final int e() {
        int d10;
        boolean z10;
        synchronized (this.f16616t) {
            if (isTerminated()) {
                return -1;
            }
            AtomicLongFieldUpdater atomicLongFieldUpdater = f16607w;
            long j10 = atomicLongFieldUpdater.get(this);
            int i10 = (int) (j10 & 2097151);
            boolean z11 = false;
            d10 = vc.l.d(i10 - ((int) ((j10 & 4398044413952L) >> 21)), 0);
            if (d10 >= this.f16610f) {
                return 0;
            }
            if (i10 >= this.f16611m) {
                return 0;
            }
            int i11 = ((int) (f16607w.get(this) & 2097151)) + 1;
            if (i11 > 0 && this.f16616t.b(i11) == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                c cVar = new c(this, i11);
                this.f16616t.c(i11, cVar);
                if (i11 == ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    z11 = true;
                }
                if (z11) {
                    int i12 = d10 + 1;
                    cVar.start();
                    return i12;
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    static /* synthetic */ boolean f0(a aVar, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = f16607w.get(aVar);
        }
        return aVar.Y(j10);
    }

    private final boolean i0() {
        c B;
        do {
            B = B();
            if (B == null) {
                return false;
            }
        } while (!c.j().compareAndSet(B, -1, 0));
        LockSupport.unpark(B);
        return true;
    }

    private final c m() {
        c cVar;
        Thread currentThread = Thread.currentThread();
        if (currentThread instanceof c) {
            cVar = (c) currentThread;
        } else {
            cVar = null;
        }
        if (cVar == null || !q.d(a.this, this)) {
            return null;
        }
        return cVar;
    }

    public static /* synthetic */ void x(a aVar, Runnable runnable, i iVar, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            iVar = l.f16646g;
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        aVar.q(runnable, iVar, z10);
    }

    private final int z(c cVar) {
        Object i10 = cVar.i();
        while (i10 != f16609y) {
            if (i10 == null) {
                return 0;
            }
            c cVar2 = (c) i10;
            int h10 = cVar2.h();
            if (h10 != 0) {
                return h10;
            }
            i10 = cVar2.i();
        }
        return -1;
    }

    public final boolean E(c cVar) {
        long j10;
        int h10;
        if (cVar.i() != f16609y) {
            return false;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = f16606v;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            h10 = cVar.h();
            cVar.r(this.f16616t.b((int) (2097151 & j10)));
        } while (!f16606v.compareAndSet(this, j10, ((2097152 + j10) & (-2097152)) | h10));
        return true;
    }

    public final void I(c cVar, int i10, int i11) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f16606v;
        while (true) {
            long j10 = atomicLongFieldUpdater.get(this);
            int i12 = (int) (2097151 & j10);
            long j11 = (2097152 + j10) & (-2097152);
            if (i12 == i10) {
                if (i11 == 0) {
                    i12 = z(cVar);
                } else {
                    i12 = i11;
                }
            }
            if (i12 >= 0 && f16606v.compareAndSet(this, j10, j11 | i12)) {
                return;
            }
        }
    }

    public final void L(h hVar) {
        try {
            hVar.run();
        } finally {
            try {
            } finally {
            }
        }
    }

    public final void Q(long j10) {
        int i10;
        h d10;
        if (!f16608x.compareAndSet(this, 0, 1)) {
            return;
        }
        c m10 = m();
        synchronized (this.f16616t) {
            i10 = (int) (f16607w.get(this) & 2097151);
        }
        if (1 <= i10) {
            int i11 = 1;
            while (true) {
                c b10 = this.f16616t.b(i11);
                q.f(b10);
                c cVar = b10;
                if (cVar != m10) {
                    while (cVar.isAlive()) {
                        LockSupport.unpark(cVar);
                        cVar.join(j10);
                    }
                    cVar.f16619f.f(this.f16615s);
                }
                if (i11 == i10) {
                    break;
                }
                i11++;
            }
        }
        this.f16615s.b();
        this.f16614r.b();
        while (true) {
            if (m10 != null) {
                d10 = m10.g(true);
                if (d10 != null) {
                    continue;
                    L(d10);
                }
            }
            d10 = this.f16614r.d();
            if (d10 == null && (d10 = this.f16615s.d()) == null) {
                break;
            }
            L(d10);
        }
        if (m10 != null) {
            m10.u(d.TERMINATED);
        }
        f16606v.set(this, 0L);
        f16607w.set(this, 0L);
    }

    public final void T() {
        if (i0() || f0(this, 0L, 1, null)) {
            return;
        }
        i0();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Q(10000L);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        x(this, runnable, null, false, 6, null);
    }

    public final boolean isTerminated() {
        if (f16608x.get(this) != 0) {
            return true;
        }
        return false;
    }

    public final h j(Runnable runnable, i iVar) {
        long a10 = l.f16645f.a();
        if (runnable instanceof h) {
            h hVar = (h) runnable;
            hVar.f16636f = a10;
            hVar.f16637m = iVar;
            return hVar;
        }
        return new k(runnable, a10, iVar);
    }

    public final void q(Runnable runnable, i iVar, boolean z10) {
        boolean z11;
        long j10;
        ad.c.a();
        h j11 = j(runnable, iVar);
        boolean z12 = false;
        if (j11.f16637m.b() == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            j10 = f16607w.addAndGet(this, 2097152L);
        } else {
            j10 = 0;
        }
        c m10 = m();
        h V = V(m10, j11, z10);
        if (V != null && !c(V)) {
            throw new RejectedExecutionException(this.f16613q + " was terminated");
        }
        if (z10 && m10 != null) {
            z12 = true;
        }
        if (z11) {
            R(j10, z12);
        } else if (z12) {
        } else {
            T();
        }
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        int a10 = this.f16616t.a();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 1; i15 < a10; i15++) {
            c b10 = this.f16616t.b(i15);
            if (b10 != null) {
                int e10 = b10.f16619f.e();
                int i16 = b.f16617a[b10.f16621p.ordinal()];
                if (i16 != 1) {
                    if (i16 != 2) {
                        if (i16 != 3) {
                            if (i16 != 4) {
                                if (i16 == 5) {
                                    i14++;
                                }
                            } else {
                                i13++;
                                if (e10 > 0) {
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append(e10);
                                    sb2.append('d');
                                    arrayList.add(sb2.toString());
                                }
                            }
                        } else {
                            i10++;
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(e10);
                            sb3.append('c');
                            arrayList.add(sb3.toString());
                        }
                    } else {
                        i11++;
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(e10);
                        sb4.append('b');
                        arrayList.add(sb4.toString());
                    }
                } else {
                    i12++;
                }
            }
        }
        long j10 = f16607w.get(this);
        return this.f16613q + '@' + o0.b(this) + "[Pool Size {core = " + this.f16610f + ", max = " + this.f16611m + "}, Worker States {CPU = " + i10 + ", blocking = " + i11 + ", parked = " + i12 + ", dormant = " + i13 + ", terminated = " + i14 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.f16614r.c() + ", global blocking queue size = " + this.f16615s.c() + ", Control State {created workers= " + ((int) (2097151 & j10)) + ", blocking tasks = " + ((int) ((4398044413952L & j10) >> 21)) + ", CPUs acquired = " + (this.f16610f - ((int) ((9223367638808264704L & j10) >> 42))) + "}]";
    }

    /* compiled from: CoroutineScheduler.kt */
    /* loaded from: classes4.dex */
    public final class c extends Thread {

        /* renamed from: v  reason: collision with root package name */
        private static final AtomicIntegerFieldUpdater f16618v = AtomicIntegerFieldUpdater.newUpdater(c.class, "workerCtl");

        /* renamed from: f  reason: collision with root package name */
        public final n f16619f;
        private volatile int indexInArray;

        /* renamed from: m  reason: collision with root package name */
        private final f0<h> f16620m;
        private volatile Object nextParkedWorker;

        /* renamed from: p  reason: collision with root package name */
        public d f16621p;

        /* renamed from: q  reason: collision with root package name */
        private long f16622q;

        /* renamed from: r  reason: collision with root package name */
        private long f16623r;

        /* renamed from: s  reason: collision with root package name */
        private int f16624s;

        /* renamed from: t  reason: collision with root package name */
        public boolean f16625t;
        private volatile int workerCtl;

        private c() {
            setDaemon(true);
            this.f16619f = new n();
            this.f16620m = new f0<>();
            this.f16621p = d.DORMANT;
            this.nextParkedWorker = a.f16609y;
            this.f16624s = tc.c.f23726f.g();
        }

        private final void b(int i10) {
            if (i10 == 0) {
                return;
            }
            a.f16607w.addAndGet(a.this, -2097152L);
            if (this.f16621p != d.TERMINATED) {
                this.f16621p = d.DORMANT;
            }
        }

        private final void c(int i10) {
            if (i10 != 0 && u(d.BLOCKING)) {
                a.this.T();
            }
        }

        private final void d(h hVar) {
            int b10 = hVar.f16637m.b();
            k(b10);
            c(b10);
            a.this.L(hVar);
            b(b10);
        }

        private final h e(boolean z10) {
            boolean z11;
            h o10;
            h o11;
            if (z10) {
                if (m(a.this.f16610f * 2) == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11 && (o11 = o()) != null) {
                    return o11;
                }
                h g10 = this.f16619f.g();
                if (g10 != null) {
                    return g10;
                }
                if (!z11 && (o10 = o()) != null) {
                    return o10;
                }
            } else {
                h o12 = o();
                if (o12 != null) {
                    return o12;
                }
            }
            return v(3);
        }

        private final h f() {
            h h10 = this.f16619f.h();
            if (h10 == null) {
                h d10 = a.this.f16615s.d();
                if (d10 == null) {
                    return v(1);
                }
                return d10;
            }
            return h10;
        }

        public static final AtomicIntegerFieldUpdater j() {
            return f16618v;
        }

        private final void k(int i10) {
            this.f16622q = 0L;
            if (this.f16621p == d.PARKING) {
                this.f16621p = d.BLOCKING;
            }
        }

        private final boolean l() {
            if (this.nextParkedWorker != a.f16609y) {
                return true;
            }
            return false;
        }

        private final void n() {
            if (this.f16622q == 0) {
                this.f16622q = System.nanoTime() + a.this.f16612p;
            }
            LockSupport.parkNanos(a.this.f16612p);
            if (System.nanoTime() - this.f16622q >= 0) {
                this.f16622q = 0L;
                w();
            }
        }

        private final h o() {
            if (m(2) == 0) {
                h d10 = a.this.f16614r.d();
                if (d10 != null) {
                    return d10;
                }
                return a.this.f16615s.d();
            }
            h d11 = a.this.f16615s.d();
            if (d11 != null) {
                return d11;
            }
            return a.this.f16614r.d();
        }

        private final void p() {
            loop0: while (true) {
                boolean z10 = false;
                while (!a.this.isTerminated() && this.f16621p != d.TERMINATED) {
                    h g10 = g(this.f16625t);
                    if (g10 != null) {
                        this.f16623r = 0L;
                        d(g10);
                    } else {
                        this.f16625t = false;
                        if (this.f16623r != 0) {
                            if (!z10) {
                                z10 = true;
                            } else {
                                u(d.PARKING);
                                Thread.interrupted();
                                LockSupport.parkNanos(this.f16623r);
                                this.f16623r = 0L;
                            }
                        } else {
                            t();
                        }
                    }
                }
            }
            u(d.TERMINATED);
        }

        private final boolean s() {
            boolean z10;
            if (this.f16621p == d.CPU_ACQUIRED) {
                return true;
            }
            a aVar = a.this;
            AtomicLongFieldUpdater atomicLongFieldUpdater = a.f16607w;
            while (true) {
                long j10 = atomicLongFieldUpdater.get(aVar);
                if (((int) ((9223367638808264704L & j10) >> 42)) != 0) {
                    if (a.f16607w.compareAndSet(aVar, j10, j10 - 4398046511104L)) {
                        z10 = true;
                        break;
                    }
                } else {
                    z10 = false;
                    break;
                }
            }
            if (z10) {
                this.f16621p = d.CPU_ACQUIRED;
                return true;
            }
            return false;
        }

        private final void t() {
            if (!l()) {
                a.this.E(this);
                return;
            }
            f16618v.set(this, -1);
            while (l() && f16618v.get(this) == -1 && !a.this.isTerminated() && this.f16621p != d.TERMINATED) {
                u(d.PARKING);
                Thread.interrupted();
                n();
            }
        }

        private final h v(int i10) {
            int i11 = (int) (a.f16607w.get(a.this) & 2097151);
            if (i11 < 2) {
                return null;
            }
            int m10 = m(i11);
            a aVar = a.this;
            long j10 = Long.MAX_VALUE;
            for (int i12 = 0; i12 < i11; i12++) {
                m10++;
                if (m10 > i11) {
                    m10 = 1;
                }
                c b10 = aVar.f16616t.b(m10);
                if (b10 != null && b10 != this) {
                    long n10 = b10.f16619f.n(i10, this.f16620m);
                    if (n10 == -1) {
                        f0<h> f0Var = this.f16620m;
                        h hVar = f0Var.f21676f;
                        f0Var.f21676f = null;
                        return hVar;
                    } else if (n10 > 0) {
                        j10 = Math.min(j10, n10);
                    }
                }
            }
            if (j10 == Long.MAX_VALUE) {
                j10 = 0;
            }
            this.f16623r = j10;
            return null;
        }

        private final void w() {
            a aVar = a.this;
            synchronized (aVar.f16616t) {
                if (aVar.isTerminated()) {
                    return;
                }
                if (((int) (a.f16607w.get(aVar) & 2097151)) <= aVar.f16610f) {
                    return;
                }
                if (!f16618v.compareAndSet(this, -1, 1)) {
                    return;
                }
                int i10 = this.indexInArray;
                q(0);
                aVar.I(this, i10, 0);
                int andDecrement = (int) (a.f16607w.getAndDecrement(aVar) & 2097151);
                if (andDecrement != i10) {
                    c b10 = aVar.f16616t.b(andDecrement);
                    q.f(b10);
                    c cVar = b10;
                    aVar.f16616t.c(i10, cVar);
                    cVar.q(i10);
                    aVar.I(cVar, andDecrement, i10);
                }
                aVar.f16616t.c(andDecrement, null);
                w wVar = w.f13270a;
                this.f16621p = d.TERMINATED;
            }
        }

        public final h g(boolean z10) {
            if (s()) {
                return e(z10);
            }
            return f();
        }

        public final int h() {
            return this.indexInArray;
        }

        public final Object i() {
            return this.nextParkedWorker;
        }

        public final int m(int i10) {
            int i11 = this.f16624s;
            int i12 = i11 ^ (i11 << 13);
            int i13 = i12 ^ (i12 >> 17);
            int i14 = i13 ^ (i13 << 5);
            this.f16624s = i14;
            int i15 = i10 - 1;
            if ((i15 & i10) == 0) {
                return i14 & i15;
            }
            return (i14 & Integer.MAX_VALUE) % i10;
        }

        public final void q(int i10) {
            String valueOf;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(a.this.f16613q);
            sb2.append("-worker-");
            if (i10 == 0) {
                valueOf = "TERMINATED";
            } else {
                valueOf = String.valueOf(i10);
            }
            sb2.append(valueOf);
            setName(sb2.toString());
            this.indexInArray = i10;
        }

        public final void r(Object obj) {
            this.nextParkedWorker = obj;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            p();
        }

        public final boolean u(d dVar) {
            boolean z10;
            d dVar2 = this.f16621p;
            if (dVar2 == d.CPU_ACQUIRED) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                a.f16607w.addAndGet(a.this, 4398046511104L);
            }
            if (dVar2 != dVar) {
                this.f16621p = dVar;
            }
            return z10;
        }

        public c(a aVar, int i10) {
            this();
            q(i10);
        }
    }
}
