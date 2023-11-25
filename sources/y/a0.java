package y;

import android.os.Trace;
import android.view.Choreographer;
import android.view.View;
import j0.f2;
import java.util.concurrent.TimeUnit;
import n1.i1;
import y.z;

/* compiled from: LazyLayoutPrefetcher.android.kt */
/* loaded from: classes.dex */
public final class a0 implements f2, z.b, Runnable, Choreographer.FrameCallback {

    /* renamed from: x  reason: collision with root package name */
    public static final a f26000x = new a(null);

    /* renamed from: y  reason: collision with root package name */
    private static long f26001y;

    /* renamed from: f  reason: collision with root package name */
    private final z f26002f;

    /* renamed from: m  reason: collision with root package name */
    private final i1 f26003m;

    /* renamed from: p  reason: collision with root package name */
    private final m f26004p;

    /* renamed from: q  reason: collision with root package name */
    private final View f26005q;

    /* renamed from: r  reason: collision with root package name */
    private final k0.f<b> f26006r;

    /* renamed from: s  reason: collision with root package name */
    private long f26007s;

    /* renamed from: t  reason: collision with root package name */
    private long f26008t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f26009u;

    /* renamed from: v  reason: collision with root package name */
    private final Choreographer f26010v;

    /* renamed from: w  reason: collision with root package name */
    private boolean f26011w;

    /* compiled from: LazyLayoutPrefetcher.android.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
        
            if (r6 >= 30.0f) goto L11;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void b(android.view.View r6) {
            /*
                r5 = this;
                long r0 = y.a0.e()
                r2 = 0
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 != 0) goto L2c
                android.view.Display r0 = r6.getDisplay()
                boolean r6 = r6.isInEditMode()
                if (r6 != 0) goto L21
                if (r0 == 0) goto L21
                float r6 = r0.getRefreshRate()
                r0 = 1106247680(0x41f00000, float:30.0)
                int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
                if (r0 < 0) goto L21
                goto L23
            L21:
                r6 = 1114636288(0x42700000, float:60.0)
            L23:
                r0 = 1000000000(0x3b9aca00, float:0.0047237873)
                float r0 = (float) r0
                float r0 = r0 / r6
                long r0 = (long) r0
                y.a0.f(r0)
            L2c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: y.a0.a.b(android.view.View):void");
        }
    }

    /* compiled from: LazyLayoutPrefetcher.android.kt */
    /* loaded from: classes.dex */
    private static final class b implements z.a {

        /* renamed from: a  reason: collision with root package name */
        private final int f26012a;

        /* renamed from: b  reason: collision with root package name */
        private final long f26013b;

        /* renamed from: c  reason: collision with root package name */
        private i1.a f26014c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f26015d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f26016e;

        public /* synthetic */ b(int i10, long j10, qc.h hVar) {
            this(i10, j10);
        }

        public final boolean a() {
            return this.f26015d;
        }

        public final long b() {
            return this.f26013b;
        }

        public final int c() {
            return this.f26012a;
        }

        @Override // y.z.a
        public void cancel() {
            if (!this.f26015d) {
                this.f26015d = true;
                i1.a aVar = this.f26014c;
                if (aVar != null) {
                    aVar.dispose();
                }
                this.f26014c = null;
            }
        }

        public final boolean d() {
            return this.f26016e;
        }

        public final i1.a e() {
            return this.f26014c;
        }

        public final void f(i1.a aVar) {
            this.f26014c = aVar;
        }

        private b(int i10, long j10) {
            this.f26012a = i10;
            this.f26013b = j10;
        }
    }

    public a0(z zVar, i1 i1Var, m mVar, View view) {
        qc.q.i(zVar, "prefetchState");
        qc.q.i(i1Var, "subcomposeLayoutState");
        qc.q.i(mVar, "itemContentFactory");
        qc.q.i(view, "view");
        this.f26002f = zVar;
        this.f26003m = i1Var;
        this.f26004p = mVar;
        this.f26005q = view;
        this.f26006r = new k0.f<>(new b[16], 0);
        this.f26010v = Choreographer.getInstance();
        f26000x.b(view);
    }

    private final long g(long j10, long j11) {
        if (j11 != 0) {
            long j12 = 4;
            return (j10 / j12) + ((j11 / j12) * 3);
        }
        return j10;
    }

    private final boolean h(long j10, long j11, long j12) {
        if (j10 <= j11 && j10 + j12 >= j11) {
            return false;
        }
        return true;
    }

    @Override // y.z.b
    public z.a a(int i10, long j10) {
        b bVar = new b(i10, j10, null);
        this.f26006r.d(bVar);
        if (!this.f26009u) {
            this.f26009u = true;
            this.f26005q.post(this);
        }
        return bVar;
    }

    @Override // j0.f2
    public void c() {
        this.f26011w = false;
        this.f26002f.b(null);
        this.f26005q.removeCallbacks(this);
        this.f26010v.removeFrameCallback(this);
    }

    @Override // j0.f2
    public void d() {
        this.f26002f.b(this);
        this.f26011w = true;
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j10) {
        if (this.f26011w) {
            this.f26005q.post(this);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z10;
        if (!this.f26006r.r() && this.f26009u && this.f26011w && this.f26005q.getWindowVisibility() == 0) {
            long nanos = TimeUnit.MILLISECONDS.toNanos(this.f26005q.getDrawingTime()) + f26001y;
            boolean z11 = false;
            while (this.f26006r.s() && !z11) {
                b bVar = this.f26006r.n()[0];
                o invoke = this.f26004p.d().invoke();
                if (!bVar.a()) {
                    int c10 = invoke.c();
                    int c11 = bVar.c();
                    if (c11 >= 0 && c11 < c10) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        if (bVar.e() == null) {
                            Trace.beginSection("compose:lazylist:prefetch:compose");
                            try {
                                long nanoTime = System.nanoTime();
                                if (h(nanoTime, nanos, this.f26007s)) {
                                    Object a10 = invoke.a(bVar.c());
                                    bVar.f(this.f26003m.k(a10, this.f26004p.b(bVar.c(), a10, invoke.d(bVar.c()))));
                                    this.f26007s = g(System.nanoTime() - nanoTime, this.f26007s);
                                } else {
                                    z11 = true;
                                }
                                dc.w wVar = dc.w.f13270a;
                            } finally {
                            }
                        } else if ((!bVar.d()) != false) {
                            Trace.beginSection("compose:lazylist:prefetch:measure");
                            try {
                                long nanoTime2 = System.nanoTime();
                                if (h(nanoTime2, nanos, this.f26008t)) {
                                    i1.a e10 = bVar.e();
                                    qc.q.f(e10);
                                    int a11 = e10.a();
                                    for (int i10 = 0; i10 < a11; i10++) {
                                        e10.b(i10, bVar.b());
                                    }
                                    this.f26008t = g(System.nanoTime() - nanoTime2, this.f26008t);
                                    this.f26006r.x(0);
                                } else {
                                    dc.w wVar2 = dc.w.f13270a;
                                    z11 = true;
                                }
                            } finally {
                            }
                        } else {
                            throw new IllegalStateException("Check failed.".toString());
                        }
                    }
                }
                this.f26006r.x(0);
            }
            if (z11) {
                this.f26010v.postFrameCallback(this);
                return;
            } else {
                this.f26009u = false;
                return;
            }
        }
        this.f26009u = false;
    }

    @Override // j0.f2
    public void b() {
    }
}
