package androidx.compose.ui.platform;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;

/* compiled from: AndroidUiDispatcher.android.kt */
/* loaded from: classes.dex */
public final class m0 extends ad.g0 {
    private static final dc.f<hc.f> A;
    private static final ThreadLocal<hc.f> B;

    /* renamed from: y  reason: collision with root package name */
    public static final c f2750y = new c(null);

    /* renamed from: z  reason: collision with root package name */
    public static final int f2751z = 8;

    /* renamed from: m  reason: collision with root package name */
    private final Choreographer f2752m;

    /* renamed from: p  reason: collision with root package name */
    private final Handler f2753p;

    /* renamed from: q  reason: collision with root package name */
    private final Object f2754q;

    /* renamed from: r  reason: collision with root package name */
    private final ec.k<Runnable> f2755r;

    /* renamed from: s  reason: collision with root package name */
    private List<Choreographer.FrameCallback> f2756s;

    /* renamed from: t  reason: collision with root package name */
    private List<Choreographer.FrameCallback> f2757t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f2758u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f2759v;

    /* renamed from: w  reason: collision with root package name */
    private final d f2760w;

    /* renamed from: x  reason: collision with root package name */
    private final j0.y0 f2761x;

    /* compiled from: AndroidUiDispatcher.android.kt */
    /* loaded from: classes.dex */
    static final class a extends qc.r implements pc.a<hc.f> {

        /* renamed from: f  reason: collision with root package name */
        public static final a f2762f = new a();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: AndroidUiDispatcher.android.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.platform.AndroidUiDispatcher$Companion$Main$2$dispatcher$1", f = "AndroidUiDispatcher.android.kt", l = {}, m = "invokeSuspend")
        /* renamed from: androidx.compose.ui.platform.m0$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0043a extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super Choreographer>, Object> {

            /* renamed from: f  reason: collision with root package name */
            int f2763f;

            C0043a(Continuation<? super C0043a> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
                return new C0043a(continuation);
            }

            @Override // pc.p
            public final Object invoke(ad.k0 k0Var, Continuation<? super Choreographer> continuation) {
                return ((C0043a) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                ic.d.d();
                if (this.f2763f == 0) {
                    dc.n.b(obj);
                    return Choreographer.getInstance();
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        a() {
            super(0);
        }

        @Override // pc.a
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final hc.f invoke() {
            boolean b10;
            Choreographer choreographer;
            b10 = n0.b();
            qc.h hVar = null;
            if (b10) {
                choreographer = Choreographer.getInstance();
            } else {
                choreographer = (Choreographer) ad.g.e(ad.a1.c(), new C0043a(null));
            }
            qc.q.h(choreographer, "if (isMainThread()) Chor…eographer.getInstance() }");
            Handler a10 = androidx.core.os.i.a(Looper.getMainLooper());
            qc.q.h(a10, "createAsync(Looper.getMainLooper())");
            m0 m0Var = new m0(choreographer, a10, hVar);
            return m0Var.plus(m0Var.a1());
        }
    }

    /* compiled from: AndroidUiDispatcher.android.kt */
    /* loaded from: classes.dex */
    public static final class b extends ThreadLocal<hc.f> {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public hc.f initialValue() {
            Choreographer choreographer = Choreographer.getInstance();
            qc.q.h(choreographer, "getInstance()");
            Looper myLooper = Looper.myLooper();
            if (myLooper != null) {
                Handler a10 = androidx.core.os.i.a(myLooper);
                qc.q.h(a10, "createAsync(\n           …d\")\n                    )");
                m0 m0Var = new m0(choreographer, a10, null);
                return m0Var.plus(m0Var.a1());
            }
            throw new IllegalStateException("no Looper on this thread".toString());
        }
    }

    /* compiled from: AndroidUiDispatcher.android.kt */
    /* loaded from: classes.dex */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(qc.h hVar) {
            this();
        }

        public final hc.f a() {
            boolean b10;
            b10 = n0.b();
            if (b10) {
                return b();
            }
            hc.f fVar = (hc.f) m0.B.get();
            if (fVar != null) {
                return fVar;
            }
            throw new IllegalStateException("no AndroidUiDispatcher for this thread".toString());
        }

        public final hc.f b() {
            return (hc.f) m0.A.getValue();
        }
    }

    /* compiled from: AndroidUiDispatcher.android.kt */
    /* loaded from: classes.dex */
    public static final class d implements Choreographer.FrameCallback, Runnable {
        d() {
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j10) {
            m0.this.f2753p.removeCallbacks(this);
            m0.this.d1();
            m0.this.c1(j10);
        }

        @Override // java.lang.Runnable
        public void run() {
            m0.this.d1();
            Object obj = m0.this.f2754q;
            m0 m0Var = m0.this;
            synchronized (obj) {
                if (m0Var.f2756s.isEmpty()) {
                    m0Var.Z0().removeFrameCallback(this);
                    m0Var.f2759v = false;
                }
                dc.w wVar = dc.w.f13270a;
            }
        }
    }

    static {
        dc.f<hc.f> b10;
        b10 = dc.h.b(a.f2762f);
        A = b10;
        B = new b();
    }

    public /* synthetic */ m0(Choreographer choreographer, Handler handler, qc.h hVar) {
        this(choreographer, handler);
    }

    private final Runnable b1() {
        Runnable t10;
        synchronized (this.f2754q) {
            t10 = this.f2755r.t();
        }
        return t10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c1(long j10) {
        synchronized (this.f2754q) {
            if (!this.f2759v) {
                return;
            }
            this.f2759v = false;
            List<Choreographer.FrameCallback> list = this.f2756s;
            this.f2756s = this.f2757t;
            this.f2757t = list;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                list.get(i10).doFrame(j10);
            }
            list.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d1() {
        boolean z10;
        do {
            Runnable b12 = b1();
            while (b12 != null) {
                b12.run();
                b12 = b1();
            }
            synchronized (this.f2754q) {
                if (this.f2755r.isEmpty()) {
                    z10 = false;
                    this.f2758u = false;
                } else {
                    z10 = true;
                }
            }
        } while (z10);
    }

    @Override // ad.g0
    public void A0(hc.f fVar, Runnable runnable) {
        qc.q.i(fVar, "context");
        qc.q.i(runnable, "block");
        synchronized (this.f2754q) {
            this.f2755r.h(runnable);
            if (!this.f2758u) {
                this.f2758u = true;
                this.f2753p.post(this.f2760w);
                if (!this.f2759v) {
                    this.f2759v = true;
                    this.f2752m.postFrameCallback(this.f2760w);
                }
            }
            dc.w wVar = dc.w.f13270a;
        }
    }

    public final Choreographer Z0() {
        return this.f2752m;
    }

    public final j0.y0 a1() {
        return this.f2761x;
    }

    public final void e1(Choreographer.FrameCallback frameCallback) {
        qc.q.i(frameCallback, "callback");
        synchronized (this.f2754q) {
            this.f2756s.add(frameCallback);
            if (!this.f2759v) {
                this.f2759v = true;
                this.f2752m.postFrameCallback(this.f2760w);
            }
            dc.w wVar = dc.w.f13270a;
        }
    }

    public final void f1(Choreographer.FrameCallback frameCallback) {
        qc.q.i(frameCallback, "callback");
        synchronized (this.f2754q) {
            this.f2756s.remove(frameCallback);
        }
    }

    private m0(Choreographer choreographer, Handler handler) {
        this.f2752m = choreographer;
        this.f2753p = handler;
        this.f2754q = new Object();
        this.f2755r = new ec.k<>();
        this.f2756s = new ArrayList();
        this.f2757t = new ArrayList();
        this.f2760w = new d();
        this.f2761x = new o0(choreographer, this);
    }
}
