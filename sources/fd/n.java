package fd;

import ad.c1;
import ad.q0;
import ad.t0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: LimitedDispatcher.kt */
/* loaded from: classes4.dex */
public final class n extends ad.g0 implements t0 {

    /* renamed from: t  reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f15653t = AtomicIntegerFieldUpdater.newUpdater(n.class, "runningWorkers");

    /* renamed from: m  reason: collision with root package name */
    private final ad.g0 f15654m;

    /* renamed from: p  reason: collision with root package name */
    private final int f15655p;

    /* renamed from: q  reason: collision with root package name */
    private final /* synthetic */ t0 f15656q;

    /* renamed from: r  reason: collision with root package name */
    private final s<Runnable> f15657r;
    private volatile int runningWorkers;

    /* renamed from: s  reason: collision with root package name */
    private final Object f15658s;

    /* compiled from: LimitedDispatcher.kt */
    /* loaded from: classes4.dex */
    private final class a implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        private Runnable f15659f;

        public a(Runnable runnable) {
            this.f15659f = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i10 = 0;
            while (true) {
                try {
                    this.f15659f.run();
                } catch (Throwable th) {
                    ad.i0.a(hc.g.f16601f, th);
                }
                Runnable N0 = n.this.N0();
                if (N0 == null) {
                    return;
                }
                this.f15659f = N0;
                i10++;
                if (i10 >= 16 && n.this.f15654m.D0(n.this)) {
                    n.this.f15654m.A0(n.this, this);
                    return;
                }
            }
        }
    }

    public n(ad.g0 g0Var, int i10) {
        t0 t0Var;
        this.f15654m = g0Var;
        this.f15655p = i10;
        if (g0Var instanceof t0) {
            t0Var = (t0) g0Var;
        } else {
            t0Var = null;
        }
        this.f15656q = t0Var == null ? q0.a() : t0Var;
        this.f15657r = new s<>(false);
        this.f15658s = new Object();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Runnable N0() {
        while (true) {
            Runnable d10 = this.f15657r.d();
            if (d10 == null) {
                synchronized (this.f15658s) {
                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f15653t;
                    atomicIntegerFieldUpdater.decrementAndGet(this);
                    if (this.f15657r.c() == 0) {
                        return null;
                    }
                    atomicIntegerFieldUpdater.incrementAndGet(this);
                }
            } else {
                return d10;
            }
        }
    }

    private final boolean R0() {
        synchronized (this.f15658s) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f15653t;
            if (atomicIntegerFieldUpdater.get(this) >= this.f15655p) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }

    @Override // ad.g0
    public void A0(hc.f fVar, Runnable runnable) {
        Runnable N0;
        this.f15657r.a(runnable);
        if (f15653t.get(this) < this.f15655p && R0() && (N0 = N0()) != null) {
            this.f15654m.A0(this, new a(N0));
        }
    }

    @Override // ad.g0
    public void C0(hc.f fVar, Runnable runnable) {
        Runnable N0;
        this.f15657r.a(runnable);
        if (f15653t.get(this) < this.f15655p && R0() && (N0 = N0()) != null) {
            this.f15654m.C0(this, new a(N0));
        }
    }

    @Override // ad.g0
    public ad.g0 F0(int i10) {
        o.a(i10);
        if (i10 >= this.f15655p) {
            return this;
        }
        return super.F0(i10);
    }

    @Override // ad.t0
    public void j(long j10, ad.m<? super dc.w> mVar) {
        this.f15656q.j(j10, mVar);
    }

    @Override // ad.t0
    public c1 p0(long j10, Runnable runnable, hc.f fVar) {
        return this.f15656q.p0(j10, runnable, fVar);
    }
}
