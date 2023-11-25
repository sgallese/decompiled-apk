package cd;

import ad.b3;
import androidx.recyclerview.widget.RecyclerView;
import dc.m;
import dc.w;
import fd.d0;
import fd.e0;
import fd.f0;
import fd.g0;
import fd.y;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.channels.ClosedReceiveChannelException;
import kotlinx.coroutines.channels.ClosedSendChannelException;
import kotlinx.coroutines.internal.UndeliveredElementException;
import qc.k0;

/* compiled from: BufferedChannel.kt */
/* loaded from: classes4.dex */
public class b<E> implements cd.d<E> {

    /* renamed from: q  reason: collision with root package name */
    private static final AtomicLongFieldUpdater f8950q = AtomicLongFieldUpdater.newUpdater(b.class, "sendersAndCloseStatus");

    /* renamed from: r  reason: collision with root package name */
    private static final AtomicLongFieldUpdater f8951r = AtomicLongFieldUpdater.newUpdater(b.class, "receivers");

    /* renamed from: s  reason: collision with root package name */
    private static final AtomicLongFieldUpdater f8952s = AtomicLongFieldUpdater.newUpdater(b.class, "bufferEnd");

    /* renamed from: t  reason: collision with root package name */
    private static final AtomicLongFieldUpdater f8953t = AtomicLongFieldUpdater.newUpdater(b.class, "completedExpandBuffersAndPauseFlag");

    /* renamed from: u  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f8954u = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "sendSegment");

    /* renamed from: v  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f8955v = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "receiveSegment");

    /* renamed from: w  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f8956w = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "bufferEndSegment");

    /* renamed from: x  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f8957x = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_closeCause");

    /* renamed from: y  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f8958y = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "closeHandler");
    private volatile Object _closeCause;
    private volatile long bufferEnd;
    private volatile Object bufferEndSegment;
    private volatile Object closeHandler;
    private volatile long completedExpandBuffersAndPauseFlag;

    /* renamed from: f  reason: collision with root package name */
    private final int f8959f;

    /* renamed from: m  reason: collision with root package name */
    public final pc.l<E, w> f8960m;

    /* renamed from: p  reason: collision with root package name */
    private final pc.q<id.j<?>, Object, Object, pc.l<Throwable, w>> f8961p;
    private volatile Object receiveSegment;
    private volatile long receivers;
    private volatile Object sendSegment;
    private volatile long sendersAndCloseStatus;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: BufferedChannel.kt */
    /* loaded from: classes4.dex */
    public final class a implements cd.f<E>, b3 {

        /* renamed from: f  reason: collision with root package name */
        private Object f8962f;

        /* renamed from: m  reason: collision with root package name */
        private ad.n<? super Boolean> f8963m;

        public a() {
            g0 g0Var;
            g0Var = cd.c.f8998p;
            this.f8962f = g0Var;
        }

        private final Object f(j<E> jVar, int i10, long j10, Continuation<? super Boolean> continuation) {
            Continuation c10;
            g0 g0Var;
            g0 g0Var2;
            Boolean a10;
            g0 g0Var3;
            g0 g0Var4;
            g0 g0Var5;
            Object d10;
            b<E> bVar = b.this;
            c10 = ic.c.c(continuation);
            ad.n b10 = ad.p.b(c10);
            try {
                this.f8963m = b10;
                Object N0 = bVar.N0(jVar, i10, j10, this);
                g0Var = cd.c.f8995m;
                if (N0 == g0Var) {
                    bVar.u0(this, jVar, i10);
                } else {
                    g0Var2 = cd.c.f8997o;
                    pc.l<Throwable, w> lVar = null;
                    if (N0 == g0Var2) {
                        if (j10 < bVar.V()) {
                            jVar.b();
                        }
                        j jVar2 = (j) b.f8955v.get(bVar);
                        while (true) {
                            if (bVar.c0()) {
                                h();
                                break;
                            }
                            long andIncrement = b.f8951r.getAndIncrement(bVar);
                            int i11 = cd.c.f8984b;
                            long j11 = andIncrement / i11;
                            int i12 = (int) (andIncrement % i11);
                            if (jVar2.f15625p != j11) {
                                j O = bVar.O(j11, jVar2);
                                if (O != null) {
                                    jVar2 = O;
                                }
                            }
                            Object N02 = bVar.N0(jVar2, i12, andIncrement, this);
                            g0Var3 = cd.c.f8995m;
                            if (N02 == g0Var3) {
                                bVar.u0(this, jVar2, i12);
                                break;
                            }
                            g0Var4 = cd.c.f8997o;
                            if (N02 != g0Var4) {
                                g0Var5 = cd.c.f8996n;
                                if (N02 != g0Var5) {
                                    jVar2.b();
                                    this.f8962f = N02;
                                    this.f8963m = null;
                                    a10 = kotlin.coroutines.jvm.internal.b.a(true);
                                    pc.l<E, w> lVar2 = bVar.f8960m;
                                    if (lVar2 != null) {
                                        lVar = y.a(lVar2, N02, b10.getContext());
                                    }
                                } else {
                                    throw new IllegalStateException("unexpected".toString());
                                }
                            } else if (andIncrement < bVar.V()) {
                                jVar2.b();
                            }
                        }
                    } else {
                        jVar.b();
                        this.f8962f = N0;
                        this.f8963m = null;
                        a10 = kotlin.coroutines.jvm.internal.b.a(true);
                        pc.l<E, w> lVar3 = bVar.f8960m;
                        if (lVar3 != null) {
                            lVar = y.a(lVar3, N0, b10.getContext());
                        }
                    }
                    b10.d(a10, lVar);
                }
                Object x10 = b10.x();
                d10 = ic.d.d();
                if (x10 == d10) {
                    kotlin.coroutines.jvm.internal.h.c(continuation);
                }
                return x10;
            } catch (Throwable th) {
                b10.J();
                throw th;
            }
        }

        private final boolean g() {
            this.f8962f = cd.c.z();
            Throwable R = b.this.R();
            if (R == null) {
                return false;
            }
            throw f0.a(R);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void h() {
            ad.n<? super Boolean> nVar = this.f8963m;
            qc.q.f(nVar);
            this.f8963m = null;
            this.f8962f = cd.c.z();
            Throwable R = b.this.R();
            if (R == null) {
                m.a aVar = dc.m.f13253f;
                nVar.resumeWith(dc.m.a(Boolean.FALSE));
                return;
            }
            m.a aVar2 = dc.m.f13253f;
            nVar.resumeWith(dc.m.a(dc.n.a(R)));
        }

        @Override // cd.f
        public Object a(Continuation<? super Boolean> continuation) {
            j<E> jVar;
            g0 g0Var;
            g0 g0Var2;
            g0 g0Var3;
            b<E> bVar = b.this;
            j<E> jVar2 = (j) b.f8955v.get(bVar);
            while (!bVar.c0()) {
                long andIncrement = b.f8951r.getAndIncrement(bVar);
                int i10 = cd.c.f8984b;
                long j10 = andIncrement / i10;
                int i11 = (int) (andIncrement % i10);
                if (jVar2.f15625p != j10) {
                    j<E> O = bVar.O(j10, jVar2);
                    if (O == null) {
                        continue;
                    } else {
                        jVar = O;
                    }
                } else {
                    jVar = jVar2;
                }
                Object N0 = bVar.N0(jVar, i11, andIncrement, null);
                g0Var = cd.c.f8995m;
                if (N0 != g0Var) {
                    g0Var2 = cd.c.f8997o;
                    if (N0 != g0Var2) {
                        g0Var3 = cd.c.f8996n;
                        if (N0 == g0Var3) {
                            return f(jVar, i11, andIncrement, continuation);
                        }
                        jVar.b();
                        this.f8962f = N0;
                        return kotlin.coroutines.jvm.internal.b.a(true);
                    }
                    if (andIncrement < bVar.V()) {
                        jVar.b();
                    }
                    jVar2 = jVar;
                } else {
                    throw new IllegalStateException("unreachable".toString());
                }
            }
            return kotlin.coroutines.jvm.internal.b.a(g());
        }

        @Override // ad.b3
        public void b(d0<?> d0Var, int i10) {
            ad.n<? super Boolean> nVar = this.f8963m;
            if (nVar != null) {
                nVar.b(d0Var, i10);
            }
        }

        public final boolean i(E e10) {
            boolean B;
            ad.n<? super Boolean> nVar = this.f8963m;
            qc.q.f(nVar);
            pc.l<Throwable, w> lVar = null;
            this.f8963m = null;
            this.f8962f = e10;
            Boolean bool = Boolean.TRUE;
            pc.l<E, w> lVar2 = b.this.f8960m;
            if (lVar2 != null) {
                lVar = y.a(lVar2, e10, nVar.getContext());
            }
            B = cd.c.B(nVar, bool, lVar);
            return B;
        }

        public final void j() {
            ad.n<? super Boolean> nVar = this.f8963m;
            qc.q.f(nVar);
            this.f8963m = null;
            this.f8962f = cd.c.z();
            Throwable R = b.this.R();
            if (R == null) {
                m.a aVar = dc.m.f13253f;
                nVar.resumeWith(dc.m.a(Boolean.FALSE));
                return;
            }
            m.a aVar2 = dc.m.f13253f;
            nVar.resumeWith(dc.m.a(dc.n.a(R)));
        }

        @Override // cd.f
        public E next() {
            g0 g0Var;
            boolean z10;
            g0 g0Var2;
            E e10 = (E) this.f8962f;
            g0Var = cd.c.f8998p;
            if (e10 != g0Var) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                g0Var2 = cd.c.f8998p;
                this.f8962f = g0Var2;
                if (e10 != cd.c.z()) {
                    return e10;
                }
                throw f0.a(b.this.S());
            }
            throw new IllegalStateException("`hasNext()` has not been invoked".toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: BufferedChannel.kt */
    /* renamed from: cd.b$b  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0225b implements b3 {

        /* renamed from: f  reason: collision with root package name */
        private final ad.m<Boolean> f8965f;

        /* renamed from: m  reason: collision with root package name */
        private final /* synthetic */ ad.n<Boolean> f8966m;

        public final ad.m<Boolean> a() {
            return this.f8965f;
        }

        @Override // ad.b3
        public void b(d0<?> d0Var, int i10) {
            this.f8966m.b(d0Var, i10);
        }
    }

    /* compiled from: BufferedChannel.kt */
    /* loaded from: classes4.dex */
    /* synthetic */ class c extends qc.n implements pc.q<b<?>, id.j<?>, Object, w> {

        /* renamed from: w  reason: collision with root package name */
        public static final c f8967w = new c();

        c() {
            super(3, b.class, "registerSelectForReceive", "registerSelectForReceive(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
        }

        public final void h(b<?> bVar, id.j<?> jVar, Object obj) {
            bVar.B0(jVar, obj);
        }

        @Override // pc.q
        public /* bridge */ /* synthetic */ w invoke(b<?> bVar, id.j<?> jVar, Object obj) {
            h(bVar, jVar, obj);
            return w.f13270a;
        }
    }

    /* compiled from: BufferedChannel.kt */
    /* loaded from: classes4.dex */
    /* synthetic */ class d extends qc.n implements pc.q<b<?>, Object, Object, Object> {

        /* renamed from: w  reason: collision with root package name */
        public static final d f8968w = new d();

        d() {
            super(3, b.class, "processResultSelectReceiveCatching", "processResultSelectReceiveCatching(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
        }

        @Override // pc.q
        /* renamed from: h  reason: merged with bridge method [inline-methods] */
        public final Object invoke(b<?> bVar, Object obj, Object obj2) {
            return bVar.w0(obj, obj2);
        }
    }

    /* compiled from: BufferedChannel.kt */
    /* loaded from: classes4.dex */
    static final class e extends qc.r implements pc.q<id.j<?>, Object, Object, pc.l<? super Throwable, ? extends w>> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ b<E> f8969f;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: BufferedChannel.kt */
        /* loaded from: classes4.dex */
        public static final class a extends qc.r implements pc.l<Throwable, w> {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ Object f8970f;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ b<E> f8971m;

            /* renamed from: p  reason: collision with root package name */
            final /* synthetic */ id.j<?> f8972p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Object obj, b<E> bVar, id.j<?> jVar) {
                super(1);
                this.f8970f = obj;
                this.f8971m = bVar;
                this.f8972p = jVar;
            }

            @Override // pc.l
            public /* bridge */ /* synthetic */ w invoke(Throwable th) {
                invoke2(th);
                return w.f13270a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                if (this.f8970f != cd.c.z()) {
                    y.b(this.f8971m.f8960m, this.f8970f, this.f8972p.getContext());
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(b<E> bVar) {
            super(3);
            this.f8969f = bVar;
        }

        @Override // pc.q
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final pc.l<Throwable, w> invoke(id.j<?> jVar, Object obj, Object obj2) {
            return new a(obj2, this.f8969f, jVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BufferedChannel.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.BufferedChannel", f = "BufferedChannel.kt", l = {739}, m = "receiveCatching-JP2dKIU$suspendImpl")
    /* loaded from: classes4.dex */
    public static final class f<E> extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f8973f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ b<E> f8974m;

        /* renamed from: p  reason: collision with root package name */
        int f8975p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(b<E> bVar, Continuation<? super f> continuation) {
            super(continuation);
            this.f8974m = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d10;
            this.f8973f = obj;
            this.f8975p |= RecyclerView.UNDEFINED_DURATION;
            Object y02 = b.y0(this.f8974m, this);
            d10 = ic.d.d();
            if (y02 == d10) {
                return y02;
            }
            return h.b(y02);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BufferedChannel.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.BufferedChannel", f = "BufferedChannel.kt", l = {3056}, m = "receiveCatchingOnNoWaiterSuspend-GKJJFZk")
    /* loaded from: classes4.dex */
    public static final class g extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: f  reason: collision with root package name */
        Object f8976f;

        /* renamed from: m  reason: collision with root package name */
        Object f8977m;

        /* renamed from: p  reason: collision with root package name */
        int f8978p;

        /* renamed from: q  reason: collision with root package name */
        long f8979q;

        /* renamed from: r  reason: collision with root package name */
        /* synthetic */ Object f8980r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ b<E> f8981s;

        /* renamed from: t  reason: collision with root package name */
        int f8982t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(b<E> bVar, Continuation<? super g> continuation) {
            super(continuation);
            this.f8981s = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d10;
            this.f8980r = obj;
            this.f8982t |= RecyclerView.UNDEFINED_DURATION;
            Object z02 = this.f8981s.z0(null, 0, 0L, this);
            d10 = ic.d.d();
            if (z02 == d10) {
                return z02;
            }
            return h.b(z02);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(int i10, pc.l<? super E, w> lVar) {
        boolean z10;
        long A;
        e eVar;
        g0 g0Var;
        this.f8959f = i10;
        this.f8960m = lVar;
        if (i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            A = cd.c.A(i10);
            this.bufferEnd = A;
            this.completedExpandBuffersAndPauseFlag = Q();
            j jVar = new j(0L, null, this, 3);
            this.sendSegment = jVar;
            this.receiveSegment = jVar;
            if (g0()) {
                jVar = cd.c.f8983a;
                qc.q.g(jVar, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
            }
            this.bufferEndSegment = jVar;
            if (lVar != 0) {
                eVar = new e(this);
            } else {
                eVar = null;
            }
            this.f8961p = eVar;
            g0Var = cd.c.f9001s;
            this._closeCause = g0Var;
            return;
        }
        throw new IllegalArgumentException(("Invalid channel capacity: " + i10 + ", should be >=0").toString());
    }

    private final Object A0(j<E> jVar, int i10, long j10, Continuation<? super E> continuation) {
        Continuation c10;
        g0 g0Var;
        g0 g0Var2;
        g0 g0Var3;
        g0 g0Var4;
        g0 g0Var5;
        Object d10;
        c10 = ic.c.c(continuation);
        ad.n b10 = ad.p.b(c10);
        try {
            Object N0 = N0(jVar, i10, j10, b10);
            g0Var = cd.c.f8995m;
            if (N0 == g0Var) {
                u0(b10, jVar, i10);
            } else {
                g0Var2 = cd.c.f8997o;
                pc.l<Throwable, w> lVar = null;
                lVar = null;
                ad.n nVar = null;
                if (N0 == g0Var2) {
                    if (j10 < V()) {
                        jVar.b();
                    }
                    j jVar2 = (j) f8955v.get(this);
                    while (true) {
                        if (c0()) {
                            o0(b10);
                            break;
                        }
                        long andIncrement = f8951r.getAndIncrement(this);
                        int i11 = cd.c.f8984b;
                        long j11 = andIncrement / i11;
                        int i12 = (int) (andIncrement % i11);
                        if (jVar2.f15625p != j11) {
                            j O = O(j11, jVar2);
                            if (O != null) {
                                jVar2 = O;
                            }
                        }
                        N0 = N0(jVar2, i12, andIncrement, b10);
                        g0Var3 = cd.c.f8995m;
                        if (N0 != g0Var3) {
                            g0Var4 = cd.c.f8997o;
                            if (N0 != g0Var4) {
                                g0Var5 = cd.c.f8996n;
                                if (N0 != g0Var5) {
                                    jVar2.b();
                                    pc.l<E, w> lVar2 = this.f8960m;
                                    if (lVar2 != null) {
                                        lVar = y.a(lVar2, N0, b10.getContext());
                                    }
                                } else {
                                    throw new IllegalStateException("unexpected".toString());
                                }
                            } else if (andIncrement < V()) {
                                jVar2.b();
                            }
                        } else {
                            if (b10 instanceof b3) {
                                nVar = b10;
                            }
                            if (nVar != null) {
                                u0(nVar, jVar2, i12);
                            }
                        }
                    }
                } else {
                    jVar.b();
                    pc.l<E, w> lVar3 = this.f8960m;
                    if (lVar3 != null) {
                        lVar = y.a(lVar3, N0, b10.getContext());
                    }
                }
                b10.d(N0, lVar);
            }
            Object x10 = b10.x();
            d10 = ic.d.d();
            if (x10 == d10) {
                kotlin.coroutines.jvm.internal.h.c(continuation);
            }
            return x10;
        } catch (Throwable th) {
            b10.J();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B0(id.j<?> jVar, Object obj) {
        g0 g0Var;
        b3 b3Var;
        g0 g0Var2;
        g0 g0Var3;
        j jVar2 = (j) f8955v.get(this);
        while (!c0()) {
            long andIncrement = f8951r.getAndIncrement(this);
            int i10 = cd.c.f8984b;
            long j10 = andIncrement / i10;
            int i11 = (int) (andIncrement % i10);
            if (jVar2.f15625p != j10) {
                j O = O(j10, jVar2);
                if (O == null) {
                    continue;
                } else {
                    jVar2 = O;
                }
            }
            Object N0 = N0(jVar2, i11, andIncrement, jVar);
            g0Var = cd.c.f8995m;
            if (N0 != g0Var) {
                g0Var2 = cd.c.f8997o;
                if (N0 != g0Var2) {
                    g0Var3 = cd.c.f8996n;
                    if (N0 != g0Var3) {
                        jVar2.b();
                        jVar.f(N0);
                        return;
                    }
                    throw new IllegalStateException("unexpected".toString());
                } else if (andIncrement < V()) {
                    jVar2.b();
                }
            } else {
                if (jVar instanceof b3) {
                    b3Var = (b3) jVar;
                } else {
                    b3Var = null;
                }
                if (b3Var != null) {
                    u0(b3Var, jVar2, i11);
                    return;
                }
                return;
            }
        }
        p0(jVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b4, code lost:
    
        r13 = (cd.j) r13.g();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void C0(cd.j<E> r13) {
        /*
            r12 = this;
            pc.l<E, dc.w> r0 = r12.f8960m
            r1 = 0
            r2 = 1
            java.lang.Object r3 = fd.m.b(r1, r2, r1)
        L8:
            int r4 = cd.c.f8984b
            int r4 = r4 - r2
        Lb:
            r5 = -1
            if (r5 >= r4) goto Lb4
            long r6 = r13.f15625p
            int r8 = cd.c.f8984b
            long r8 = (long) r8
            long r6 = r6 * r8
            long r8 = (long) r4
            long r6 = r6 + r8
        L17:
            java.lang.Object r8 = r13.w(r4)
            fd.g0 r9 = cd.c.f()
            if (r8 == r9) goto Lbc
            fd.g0 r9 = cd.c.f8986d
            if (r8 != r9) goto L49
            long r9 = r12.T()
            int r11 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r11 < 0) goto Lbc
            fd.g0 r9 = cd.c.z()
            boolean r8 = r13.r(r4, r8, r9)
            if (r8 == 0) goto L17
            if (r0 == 0) goto L41
            java.lang.Object r5 = r13.v(r4)
            kotlinx.coroutines.internal.UndeliveredElementException r1 = fd.y.c(r0, r5, r1)
        L41:
            r13.s(r4)
            r13.p()
            goto Lb0
        L49:
            fd.g0 r9 = cd.c.k()
            if (r8 == r9) goto La3
            if (r8 != 0) goto L52
            goto La3
        L52:
            boolean r9 = r8 instanceof ad.b3
            if (r9 != 0) goto L6f
            boolean r9 = r8 instanceof cd.t
            if (r9 == 0) goto L5b
            goto L6f
        L5b:
            fd.g0 r9 = cd.c.p()
            if (r8 == r9) goto Lbc
            fd.g0 r9 = cd.c.q()
            if (r8 != r9) goto L68
            goto Lbc
        L68:
            fd.g0 r9 = cd.c.p()
            if (r8 == r9) goto L17
            goto Lb0
        L6f:
            long r9 = r12.T()
            int r11 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r11 < 0) goto Lbc
            boolean r9 = r8 instanceof cd.t
            if (r9 == 0) goto L81
            r9 = r8
            cd.t r9 = (cd.t) r9
            ad.b3 r9 = r9.f9020a
            goto L84
        L81:
            r9 = r8
            ad.b3 r9 = (ad.b3) r9
        L84:
            fd.g0 r10 = cd.c.z()
            boolean r8 = r13.r(r4, r8, r10)
            if (r8 == 0) goto L17
            if (r0 == 0) goto L98
            java.lang.Object r5 = r13.v(r4)
            kotlinx.coroutines.internal.UndeliveredElementException r1 = fd.y.c(r0, r5, r1)
        L98:
            java.lang.Object r3 = fd.m.c(r3, r9)
            r13.s(r4)
            r13.p()
            goto Lb0
        La3:
            fd.g0 r9 = cd.c.z()
            boolean r8 = r13.r(r4, r8, r9)
            if (r8 == 0) goto L17
            r13.p()
        Lb0:
            int r4 = r4 + (-1)
            goto Lb
        Lb4:
            fd.e r13 = r13.g()
            cd.j r13 = (cd.j) r13
            if (r13 != 0) goto L8
        Lbc:
            if (r3 == 0) goto Le2
            boolean r13 = r3 instanceof java.util.ArrayList
            if (r13 != 0) goto Lc8
            ad.b3 r3 = (ad.b3) r3
            r12.E0(r3)
            goto Le2
        Lc8:
            java.lang.String r13 = "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }"
            qc.q.g(r3, r13)
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r13 = r3.size()
            int r13 = r13 - r2
        Ld4:
            if (r5 >= r13) goto Le2
            java.lang.Object r0 = r3.get(r13)
            ad.b3 r0 = (ad.b3) r0
            r12.E0(r0)
            int r13 = r13 + (-1)
            goto Ld4
        Le2:
            if (r1 != 0) goto Le5
            return
        Le5:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: cd.b.C0(cd.j):void");
    }

    private final boolean D(long j10) {
        if (j10 >= Q() && j10 >= T() + this.f8959f) {
            return false;
        }
        return true;
    }

    private final void D0(b3 b3Var) {
        F0(b3Var, true);
    }

    private final void E0(b3 b3Var) {
        F0(b3Var, false);
    }

    private final void F(j<E> jVar, long j10) {
        g0 g0Var;
        Object b10 = fd.m.b(null, 1, null);
        loop0: while (jVar != null) {
            for (int i10 = cd.c.f8984b - 1; -1 < i10; i10--) {
                if ((jVar.f15625p * cd.c.f8984b) + i10 < j10) {
                    break loop0;
                }
                while (true) {
                    Object w10 = jVar.w(i10);
                    if (w10 != null) {
                        g0Var = cd.c.f8987e;
                        if (w10 != g0Var) {
                            if (w10 instanceof t) {
                                if (jVar.r(i10, w10, cd.c.z())) {
                                    b10 = fd.m.c(b10, ((t) w10).f9020a);
                                    jVar.x(i10, true);
                                    break;
                                }
                            } else if (!(w10 instanceof b3)) {
                                break;
                            } else if (jVar.r(i10, w10, cd.c.z())) {
                                b10 = fd.m.c(b10, w10);
                                jVar.x(i10, true);
                                break;
                            }
                        }
                    }
                    if (jVar.r(i10, w10, cd.c.z())) {
                        jVar.p();
                        break;
                    }
                }
            }
            jVar = (j) jVar.g();
        }
        if (b10 != null) {
            if (!(b10 instanceof ArrayList)) {
                D0((b3) b10);
                return;
            }
            qc.q.g(b10, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }");
            ArrayList arrayList = (ArrayList) b10;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                D0((b3) arrayList.get(size));
            }
        }
    }

    private final void F0(b3 b3Var, boolean z10) {
        Throwable U;
        if (b3Var instanceof C0225b) {
            ad.m<Boolean> a10 = ((C0225b) b3Var).a();
            m.a aVar = dc.m.f13253f;
            a10.resumeWith(dc.m.a(Boolean.FALSE));
        } else if (b3Var instanceof ad.m) {
            Continuation continuation = (Continuation) b3Var;
            m.a aVar2 = dc.m.f13253f;
            if (z10) {
                U = S();
            } else {
                U = U();
            }
            continuation.resumeWith(dc.m.a(dc.n.a(U)));
        } else if (b3Var instanceof q) {
            ad.n<h<? extends E>> nVar = ((q) b3Var).f9019f;
            m.a aVar3 = dc.m.f13253f;
            nVar.resumeWith(dc.m.a(h.b(h.f9007b.a(R()))));
        } else if (b3Var instanceof a) {
            ((a) b3Var).j();
        } else if (b3Var instanceof id.j) {
            ((id.j) b3Var).c(this, cd.c.z());
        } else {
            throw new IllegalStateException(("Unexpected waiter: " + b3Var).toString());
        }
    }

    private final j<E> G() {
        j jVar = f8956w.get(this);
        j jVar2 = (j) f8954u.get(this);
        if (jVar2.f15625p > ((j) jVar).f15625p) {
            jVar = jVar2;
        }
        j jVar3 = (j) f8955v.get(this);
        if (jVar3.f15625p > ((j) jVar).f15625p) {
            jVar = jVar3;
        }
        return (j) fd.d.b((fd.e) jVar);
    }

    static /* synthetic */ <E> Object G0(b<E> bVar, E e10, Continuation<? super w> continuation) {
        j<E> jVar;
        Object d10;
        Object d11;
        Object d12;
        Object d13;
        j<E> jVar2 = (j) f8954u.get(bVar);
        while (true) {
            long andIncrement = f8950q.getAndIncrement(bVar);
            long j10 = andIncrement & 1152921504606846975L;
            boolean e02 = bVar.e0(andIncrement);
            int i10 = cd.c.f8984b;
            long j11 = j10 / i10;
            int i11 = (int) (j10 % i10);
            if (jVar2.f15625p != j11) {
                j<E> P = bVar.P(j11, jVar2);
                if (P == null) {
                    if (e02) {
                        Object q02 = bVar.q0(e10, continuation);
                        d13 = ic.d.d();
                        if (q02 == d13) {
                            return q02;
                        }
                    }
                } else {
                    jVar = P;
                }
            } else {
                jVar = jVar2;
            }
            int P0 = bVar.P0(jVar, i11, e10, j10, null, e02);
            if (P0 != 0) {
                if (P0 == 1) {
                    break;
                } else if (P0 != 2) {
                    if (P0 != 3) {
                        if (P0 != 4) {
                            if (P0 == 5) {
                                jVar.b();
                            }
                            jVar2 = jVar;
                        } else {
                            if (j10 < bVar.T()) {
                                jVar.b();
                            }
                            Object q03 = bVar.q0(e10, continuation);
                            d12 = ic.d.d();
                            if (q03 == d12) {
                                return q03;
                            }
                        }
                    } else {
                        Object H0 = bVar.H0(jVar, i11, e10, j10, continuation);
                        d11 = ic.d.d();
                        if (H0 == d11) {
                            return H0;
                        }
                    }
                } else if (e02) {
                    jVar.p();
                    Object q04 = bVar.q0(e10, continuation);
                    d10 = ic.d.d();
                    if (q04 == d10) {
                        return q04;
                    }
                }
            } else {
                jVar.b();
                break;
            }
        }
        return w.f13270a;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0122 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0123  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object H0(cd.j<E> r21, int r22, E r23, long r24, kotlin.coroutines.Continuation<? super dc.w> r26) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cd.b.H0(cd.j, int, java.lang.Object, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final void I(long j10) {
        C0(J(j10));
    }

    private final boolean I0(long j10) {
        if (e0(j10)) {
            return false;
        }
        return !D(j10 & 1152921504606846975L);
    }

    private final j<E> J(long j10) {
        j<E> G = G();
        if (f0()) {
            long h02 = h0(G);
            if (h02 != -1) {
                L(h02);
            }
        }
        F(G, j10);
        return G;
    }

    private final boolean J0(Object obj, E e10) {
        boolean B;
        boolean B2;
        if (obj instanceof id.j) {
            return ((id.j) obj).c(this, e10);
        }
        pc.l<Throwable, w> lVar = null;
        if (obj instanceof q) {
            qc.q.g(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveCatching<E of kotlinx.coroutines.channels.BufferedChannel>");
            q qVar = (q) obj;
            ad.n<h<? extends E>> nVar = qVar.f9019f;
            h b10 = h.b(h.f9007b.c(e10));
            pc.l<E, w> lVar2 = this.f8960m;
            if (lVar2 != null) {
                lVar = y.a(lVar2, e10, qVar.f9019f.getContext());
            }
            B2 = cd.c.B(nVar, b10, lVar);
            return B2;
        } else if (obj instanceof a) {
            qc.q.g(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
            return ((a) obj).i(e10);
        } else if (obj instanceof ad.m) {
            qc.q.g(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
            ad.m mVar = (ad.m) obj;
            pc.l<E, w> lVar3 = this.f8960m;
            if (lVar3 != null) {
                lVar = y.a(lVar3, e10, mVar.getContext());
            }
            B = cd.c.B(mVar, e10, lVar);
            return B;
        } else {
            throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
        }
    }

    private final void K() {
        s();
    }

    private final boolean K0(Object obj, j<E> jVar, int i10) {
        if (obj instanceof ad.m) {
            qc.q.g(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            return cd.c.C((ad.m) obj, w.f13270a, null, 2, null);
        } else if (obj instanceof id.j) {
            qc.q.g(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
            id.l w10 = ((id.i) obj).w(this, w.f13270a);
            if (w10 == id.l.REREGISTER) {
                jVar.s(i10);
            }
            if (w10 == id.l.SUCCESSFUL) {
                return true;
            }
            return false;
        } else if (obj instanceof C0225b) {
            return cd.c.C(((C0225b) obj).a(), Boolean.TRUE, null, 2, null);
        } else {
            throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
        }
    }

    private final boolean L0(j<E> jVar, int i10, long j10) {
        g0 g0Var;
        g0 g0Var2;
        Object w10 = jVar.w(i10);
        if ((w10 instanceof b3) && j10 >= f8951r.get(this)) {
            g0Var = cd.c.f8989g;
            if (jVar.r(i10, w10, g0Var)) {
                if (!K0(w10, jVar, i10)) {
                    g0Var2 = cd.c.f8992j;
                    jVar.A(i10, g0Var2);
                    jVar.x(i10, false);
                    return false;
                }
                jVar.A(i10, cd.c.f8986d);
                return true;
            }
        }
        return M0(jVar, i10, j10);
    }

    private final void M() {
        if (g0()) {
            return;
        }
        j<E> jVar = (j) f8956w.get(this);
        while (true) {
            long andIncrement = f8952s.getAndIncrement(this);
            int i10 = cd.c.f8984b;
            long j10 = andIncrement / i10;
            if (V() <= andIncrement) {
                if (jVar.f15625p < j10 && jVar.e() != 0) {
                    l0(j10, jVar);
                }
                Y(this, 0L, 1, null);
                return;
            }
            if (jVar.f15625p != j10) {
                j<E> N = N(j10, jVar, andIncrement);
                if (N == null) {
                    continue;
                } else {
                    jVar = N;
                }
            }
            if (L0(jVar, (int) (andIncrement % i10), andIncrement)) {
                Y(this, 0L, 1, null);
                return;
            }
            Y(this, 0L, 1, null);
        }
    }

    private final boolean M0(j<E> jVar, int i10, long j10) {
        g0 g0Var;
        g0 g0Var2;
        g0 g0Var3;
        g0 g0Var4;
        g0 g0Var5;
        g0 g0Var6;
        g0 g0Var7;
        g0 g0Var8;
        while (true) {
            Object w10 = jVar.w(i10);
            if (!(w10 instanceof b3)) {
                g0Var3 = cd.c.f8992j;
                if (w10 == g0Var3) {
                    return false;
                }
                if (w10 == null) {
                    g0Var4 = cd.c.f8987e;
                    if (jVar.r(i10, w10, g0Var4)) {
                        return true;
                    }
                } else if (w10 != cd.c.f8986d) {
                    g0Var5 = cd.c.f8990h;
                    if (w10 == g0Var5) {
                        break;
                    }
                    g0Var6 = cd.c.f8991i;
                    if (w10 == g0Var6) {
                        break;
                    }
                    g0Var7 = cd.c.f8993k;
                    if (w10 != g0Var7 && w10 != cd.c.z()) {
                        g0Var8 = cd.c.f8988f;
                        if (w10 != g0Var8) {
                            throw new IllegalStateException(("Unexpected cell state: " + w10).toString());
                        }
                    } else {
                        return true;
                    }
                } else {
                    return true;
                }
            } else if (j10 >= f8951r.get(this)) {
                g0Var = cd.c.f8989g;
                if (jVar.r(i10, w10, g0Var)) {
                    if (!K0(w10, jVar, i10)) {
                        g0Var2 = cd.c.f8992j;
                        jVar.A(i10, g0Var2);
                        jVar.x(i10, false);
                        return false;
                    }
                    jVar.A(i10, cd.c.f8986d);
                    return true;
                }
            } else if (jVar.r(i10, w10, new t((b3) w10))) {
                return true;
            }
        }
    }

    private final j<E> N(long j10, j<E> jVar, long j11) {
        Object c10;
        boolean z10;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8956w;
        pc.p pVar = (pc.p) cd.c.y();
        do {
            c10 = fd.d.c(jVar, j10, pVar);
            if (e0.c(c10)) {
                break;
            }
            d0 b10 = e0.b(c10);
            while (true) {
                d0 d0Var = (d0) atomicReferenceFieldUpdater.get(this);
                if (d0Var.f15625p >= b10.f15625p) {
                    break;
                } else if (!b10.q()) {
                    z10 = false;
                    break;
                } else if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, d0Var, b10)) {
                    if (d0Var.m()) {
                        d0Var.k();
                    }
                } else if (b10.m()) {
                    b10.k();
                }
            }
            z10 = true;
        } while (!z10);
        if (e0.c(c10)) {
            K();
            l0(j10, jVar);
            Y(this, 0L, 1, null);
            return null;
        }
        j<E> jVar2 = (j) e0.b(c10);
        long j12 = jVar2.f15625p;
        if (j12 > j10) {
            int i10 = cd.c.f8984b;
            if (f8952s.compareAndSet(this, j11 + 1, i10 * j12)) {
                X((jVar2.f15625p * i10) - j11);
                return null;
            }
            Y(this, 0L, 1, null);
            return null;
        }
        return jVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object N0(j<E> jVar, int i10, long j10, Object obj) {
        g0 g0Var;
        g0 g0Var2;
        g0 g0Var3;
        Object w10 = jVar.w(i10);
        if (w10 == null) {
            if (j10 >= (f8950q.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    g0Var3 = cd.c.f8996n;
                    return g0Var3;
                } else if (jVar.r(i10, w10, obj)) {
                    M();
                    g0Var2 = cd.c.f8995m;
                    return g0Var2;
                }
            }
        } else if (w10 == cd.c.f8986d) {
            g0Var = cd.c.f8991i;
            if (jVar.r(i10, w10, g0Var)) {
                M();
                return jVar.y(i10);
            }
        }
        return O0(jVar, i10, j10, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final j<E> O(long j10, j<E> jVar) {
        Object c10;
        boolean z10;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8955v;
        pc.p pVar = (pc.p) cd.c.y();
        do {
            c10 = fd.d.c(jVar, j10, pVar);
            if (!e0.c(c10)) {
                d0 b10 = e0.b(c10);
                while (true) {
                    d0 d0Var = (d0) atomicReferenceFieldUpdater.get(this);
                    z10 = true;
                    if (d0Var.f15625p >= b10.f15625p) {
                        break;
                    } else if (!b10.q()) {
                        z10 = false;
                        break;
                    } else if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, d0Var, b10)) {
                        if (d0Var.m()) {
                            d0Var.k();
                        }
                    } else if (b10.m()) {
                        b10.k();
                    }
                }
            } else {
                break;
            }
        } while (!z10);
        if (e0.c(c10)) {
            K();
            if (jVar.f15625p * cd.c.f8984b >= V()) {
                return null;
            }
            jVar.b();
            return null;
        }
        j<E> jVar2 = (j) e0.b(c10);
        if (!g0() && j10 <= Q() / cd.c.f8984b) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f8956w;
            while (true) {
                d0 d0Var2 = (d0) atomicReferenceFieldUpdater2.get(this);
                if (d0Var2.f15625p >= jVar2.f15625p || !jVar2.q()) {
                    break;
                } else if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater2, this, d0Var2, jVar2)) {
                    if (d0Var2.m()) {
                        d0Var2.k();
                    }
                } else if (jVar2.m()) {
                    jVar2.k();
                }
            }
        }
        long j11 = jVar2.f15625p;
        if (j11 > j10) {
            int i10 = cd.c.f8984b;
            R0(j11 * i10);
            if (jVar2.f15625p * i10 >= V()) {
                return null;
            }
            jVar2.b();
            return null;
        }
        return jVar2;
    }

    private final Object O0(j<E> jVar, int i10, long j10, Object obj) {
        g0 g0Var;
        g0 g0Var2;
        g0 g0Var3;
        g0 g0Var4;
        g0 g0Var5;
        g0 g0Var6;
        g0 g0Var7;
        g0 g0Var8;
        g0 g0Var9;
        g0 g0Var10;
        g0 g0Var11;
        g0 g0Var12;
        g0 g0Var13;
        g0 g0Var14;
        g0 g0Var15;
        g0 g0Var16;
        while (true) {
            Object w10 = jVar.w(i10);
            if (w10 != null) {
                g0Var5 = cd.c.f8987e;
                if (w10 != g0Var5) {
                    if (w10 == cd.c.f8986d) {
                        g0Var6 = cd.c.f8991i;
                        if (jVar.r(i10, w10, g0Var6)) {
                            M();
                            return jVar.y(i10);
                        }
                    } else {
                        g0Var7 = cd.c.f8992j;
                        if (w10 == g0Var7) {
                            g0Var8 = cd.c.f8997o;
                            return g0Var8;
                        }
                        g0Var9 = cd.c.f8990h;
                        if (w10 == g0Var9) {
                            g0Var10 = cd.c.f8997o;
                            return g0Var10;
                        } else if (w10 != cd.c.z()) {
                            g0Var12 = cd.c.f8989g;
                            if (w10 != g0Var12) {
                                g0Var13 = cd.c.f8988f;
                                if (jVar.r(i10, w10, g0Var13)) {
                                    boolean z10 = w10 instanceof t;
                                    if (z10) {
                                        w10 = ((t) w10).f9020a;
                                    }
                                    if (K0(w10, jVar, i10)) {
                                        g0Var16 = cd.c.f8991i;
                                        jVar.A(i10, g0Var16);
                                        M();
                                        return jVar.y(i10);
                                    }
                                    g0Var14 = cd.c.f8992j;
                                    jVar.A(i10, g0Var14);
                                    jVar.x(i10, false);
                                    if (z10) {
                                        M();
                                    }
                                    g0Var15 = cd.c.f8997o;
                                    return g0Var15;
                                }
                            } else {
                                continue;
                            }
                        } else {
                            M();
                            g0Var11 = cd.c.f8997o;
                            return g0Var11;
                        }
                    }
                }
            }
            if (j10 < (f8950q.get(this) & 1152921504606846975L)) {
                g0Var = cd.c.f8990h;
                if (jVar.r(i10, w10, g0Var)) {
                    M();
                    g0Var2 = cd.c.f8997o;
                    return g0Var2;
                }
            } else if (obj == null) {
                g0Var3 = cd.c.f8996n;
                return g0Var3;
            } else if (jVar.r(i10, w10, obj)) {
                M();
                g0Var4 = cd.c.f8995m;
                return g0Var4;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final j<E> P(long j10, j<E> jVar) {
        Object c10;
        boolean z10;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8954u;
        pc.p pVar = (pc.p) cd.c.y();
        do {
            c10 = fd.d.c(jVar, j10, pVar);
            if (!e0.c(c10)) {
                d0 b10 = e0.b(c10);
                while (true) {
                    d0 d0Var = (d0) atomicReferenceFieldUpdater.get(this);
                    z10 = true;
                    if (d0Var.f15625p >= b10.f15625p) {
                        break;
                    } else if (!b10.q()) {
                        z10 = false;
                        break;
                    } else if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, d0Var, b10)) {
                        if (d0Var.m()) {
                            d0Var.k();
                        }
                    } else if (b10.m()) {
                        b10.k();
                    }
                }
            } else {
                break;
            }
        } while (!z10);
        if (e0.c(c10)) {
            K();
            if (jVar.f15625p * cd.c.f8984b >= T()) {
                return null;
            }
            jVar.b();
            return null;
        }
        j<E> jVar2 = (j) e0.b(c10);
        long j11 = jVar2.f15625p;
        if (j11 > j10) {
            int i10 = cd.c.f8984b;
            S0(j11 * i10);
            if (jVar2.f15625p * i10 >= T()) {
                return null;
            }
            jVar2.b();
            return null;
        }
        return jVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int P0(j<E> jVar, int i10, E e10, long j10, Object obj, boolean z10) {
        g0 g0Var;
        g0 g0Var2;
        g0 g0Var3;
        jVar.B(i10, e10);
        if (z10) {
            return Q0(jVar, i10, e10, j10, obj, z10);
        }
        Object w10 = jVar.w(i10);
        if (w10 == null) {
            if (D(j10)) {
                if (jVar.r(i10, null, cd.c.f8986d)) {
                    return 1;
                }
            } else if (obj == null) {
                return 3;
            } else {
                if (jVar.r(i10, null, obj)) {
                    return 2;
                }
            }
        } else if (w10 instanceof b3) {
            jVar.s(i10);
            if (J0(w10, e10)) {
                g0Var3 = cd.c.f8991i;
                jVar.A(i10, g0Var3);
                s0();
                return 0;
            }
            g0Var = cd.c.f8993k;
            Object t10 = jVar.t(i10, g0Var);
            g0Var2 = cd.c.f8993k;
            if (t10 != g0Var2) {
                jVar.x(i10, true);
            }
            return 5;
        }
        return Q0(jVar, i10, e10, j10, obj, z10);
    }

    private final long Q() {
        return f8952s.get(this);
    }

    private final int Q0(j<E> jVar, int i10, E e10, long j10, Object obj, boolean z10) {
        g0 g0Var;
        g0 g0Var2;
        g0 g0Var3;
        g0 g0Var4;
        g0 g0Var5;
        g0 g0Var6;
        g0 g0Var7;
        while (true) {
            Object w10 = jVar.w(i10);
            if (w10 != null) {
                g0Var2 = cd.c.f8987e;
                if (w10 != g0Var2) {
                    g0Var3 = cd.c.f8993k;
                    if (w10 != g0Var3) {
                        g0Var4 = cd.c.f8990h;
                        if (w10 == g0Var4) {
                            jVar.s(i10);
                            return 5;
                        } else if (w10 == cd.c.z()) {
                            jVar.s(i10);
                            K();
                            return 4;
                        } else {
                            jVar.s(i10);
                            if (w10 instanceof t) {
                                w10 = ((t) w10).f9020a;
                            }
                            if (J0(w10, e10)) {
                                g0Var7 = cd.c.f8991i;
                                jVar.A(i10, g0Var7);
                                s0();
                                return 0;
                            }
                            g0Var5 = cd.c.f8993k;
                            Object t10 = jVar.t(i10, g0Var5);
                            g0Var6 = cd.c.f8993k;
                            if (t10 != g0Var6) {
                                jVar.x(i10, true);
                            }
                            return 5;
                        }
                    }
                    jVar.s(i10);
                    return 5;
                } else if (jVar.r(i10, w10, cd.c.f8986d)) {
                    return 1;
                }
            } else if (D(j10) && !z10) {
                if (jVar.r(i10, null, cd.c.f8986d)) {
                    return 1;
                }
            } else if (z10) {
                g0Var = cd.c.f8992j;
                if (jVar.r(i10, null, g0Var)) {
                    jVar.x(i10, false);
                    return 4;
                }
            } else if (obj == null) {
                return 3;
            } else {
                if (jVar.r(i10, null, obj)) {
                    return 2;
                }
            }
        }
    }

    private final void R0(long j10) {
        long j11;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f8951r;
        do {
            j11 = atomicLongFieldUpdater.get(this);
            if (j11 >= j10) {
                return;
            }
        } while (!f8951r.compareAndSet(this, j11, j10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Throwable S() {
        Throwable R = R();
        if (R == null) {
            return new ClosedReceiveChannelException("Channel was closed");
        }
        return R;
    }

    private final void S0(long j10) {
        long j11;
        long w10;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f8950q;
        do {
            j11 = atomicLongFieldUpdater.get(this);
            long j12 = 1152921504606846975L & j11;
            if (j12 < j10) {
                w10 = cd.c.w(j12, (int) (j11 >> 60));
            } else {
                return;
            }
        } while (!f8950q.compareAndSet(this, j11, w10));
    }

    private final void X(long j10) {
        boolean z10;
        boolean z11;
        if ((f8953t.addAndGet(this, j10) & 4611686018427387904L) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return;
        }
        do {
            if ((f8953t.get(this) & 4611686018427387904L) != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
        } while (z11);
    }

    static /* synthetic */ void Y(b bVar, long j10, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 1) != 0) {
                j10 = 1;
            }
            bVar.X(j10);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incCompletedExpandBufferAttempts");
    }

    private final void Z() {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8958y;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
        } while (!androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, obj, obj == null ? cd.c.f8999q : cd.c.f9000r));
        if (obj == null) {
            return;
        }
        pc.l lVar = (pc.l) k0.e(obj, 1);
        ((pc.l) obj).invoke(R());
    }

    private final boolean a0(j<E> jVar, int i10, long j10) {
        Object w10;
        g0 g0Var;
        g0 g0Var2;
        g0 g0Var3;
        g0 g0Var4;
        g0 g0Var5;
        g0 g0Var6;
        g0 g0Var7;
        do {
            w10 = jVar.w(i10);
            if (w10 != null) {
                g0Var2 = cd.c.f8987e;
                if (w10 != g0Var2) {
                    if (w10 != cd.c.f8986d) {
                        g0Var3 = cd.c.f8992j;
                        if (w10 != g0Var3 && w10 != cd.c.z()) {
                            g0Var4 = cd.c.f8991i;
                            if (w10 != g0Var4) {
                                g0Var5 = cd.c.f8990h;
                                if (w10 != g0Var5) {
                                    g0Var6 = cd.c.f8989g;
                                    if (w10 != g0Var6) {
                                        g0Var7 = cd.c.f8988f;
                                        if (w10 == g0Var7 || j10 != T()) {
                                            return false;
                                        }
                                        return true;
                                    }
                                    return true;
                                }
                                return false;
                            }
                            return false;
                        }
                        return false;
                    }
                    return true;
                }
            }
            g0Var = cd.c.f8990h;
        } while (!jVar.r(i10, w10, g0Var));
        M();
        return false;
    }

    private final boolean b0(long j10, boolean z10) {
        int i10 = (int) (j10 >> 60);
        if (i10 == 0 || i10 == 1) {
            return false;
        }
        if (i10 != 2) {
            if (i10 == 3) {
                I(j10 & 1152921504606846975L);
            } else {
                throw new IllegalStateException(("unexpected close status: " + i10).toString());
            }
        } else {
            J(j10 & 1152921504606846975L);
            if (z10 && W()) {
                return false;
            }
        }
        return true;
    }

    private final boolean d0(long j10) {
        return b0(j10, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean e0(long j10) {
        return b0(j10, false);
    }

    private final boolean g0() {
        long Q = Q();
        if (Q != 0 && Q != Long.MAX_VALUE) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003d, code lost:
    
        r9 = (cd.j) r9.g();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final long h0(cd.j<E> r9) {
        /*
            r8 = this;
        L0:
            int r0 = cd.c.f8984b
            int r0 = r0 + (-1)
        L4:
            r1 = -1
            r3 = -1
            if (r3 >= r0) goto L3d
            long r3 = r9.f15625p
            int r5 = cd.c.f8984b
            long r5 = (long) r5
            long r3 = r3 * r5
            long r5 = (long) r0
            long r3 = r3 + r5
            long r5 = r8.T()
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 >= 0) goto L1b
            return r1
        L1b:
            java.lang.Object r1 = r9.w(r0)
            if (r1 == 0) goto L2d
            fd.g0 r2 = cd.c.k()
            if (r1 != r2) goto L28
            goto L2d
        L28:
            fd.g0 r2 = cd.c.f8986d
            if (r1 != r2) goto L3a
            return r3
        L2d:
            fd.g0 r2 = cd.c.z()
            boolean r1 = r9.r(r0, r1, r2)
            if (r1 == 0) goto L1b
            r9.p()
        L3a:
            int r0 = r0 + (-1)
            goto L4
        L3d:
            fd.e r9 = r9.g()
            cd.j r9 = (cd.j) r9
            if (r9 != 0) goto L0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: cd.b.h0(cd.j):long");
    }

    private final void i0() {
        long j10;
        long w10;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f8950q;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            if (((int) (j10 >> 60)) == 0) {
                w10 = cd.c.w(1152921504606846975L & j10, 1);
            } else {
                return;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j10, w10));
    }

    private final void j0() {
        long j10;
        long w10;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f8950q;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            w10 = cd.c.w(1152921504606846975L & j10, 3);
        } while (!atomicLongFieldUpdater.compareAndSet(this, j10, w10));
    }

    private final void k0() {
        long j10;
        long w10;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f8950q;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            int i10 = (int) (j10 >> 60);
            if (i10 == 0) {
                w10 = cd.c.w(j10 & 1152921504606846975L, 2);
            } else if (i10 == 1) {
                w10 = cd.c.w(j10 & 1152921504606846975L, 3);
            } else {
                return;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j10, w10));
    }

    private final void l0(long j10, j<E> jVar) {
        boolean z10;
        j<E> jVar2;
        j<E> jVar3;
        while (jVar.f15625p < j10 && (jVar3 = (j) jVar.e()) != null) {
            jVar = jVar3;
        }
        while (true) {
            if (jVar.h() && (jVar2 = (j) jVar.e()) != null) {
                jVar = jVar2;
            } else {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8956w;
                while (true) {
                    d0 d0Var = (d0) atomicReferenceFieldUpdater.get(this);
                    z10 = true;
                    if (d0Var.f15625p >= jVar.f15625p) {
                        break;
                    } else if (!jVar.q()) {
                        z10 = false;
                        break;
                    } else if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, d0Var, jVar)) {
                        if (d0Var.m()) {
                            d0Var.k();
                        }
                    } else if (jVar.m()) {
                        jVar.k();
                    }
                }
                if (z10) {
                    return;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n0(ad.m<? super h<? extends E>> mVar) {
        m.a aVar = dc.m.f13253f;
        mVar.resumeWith(dc.m.a(h.b(h.f9007b.a(R()))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o0(ad.m<? super E> mVar) {
        m.a aVar = dc.m.f13253f;
        mVar.resumeWith(dc.m.a(dc.n.a(S())));
    }

    private final void p0(id.j<?> jVar) {
        jVar.f(cd.c.z());
    }

    private final Object q0(E e10, Continuation<? super w> continuation) {
        Continuation c10;
        Object d10;
        Object d11;
        UndeliveredElementException d12;
        c10 = ic.c.c(continuation);
        ad.n nVar = new ad.n(c10, 1);
        nVar.A();
        pc.l<E, w> lVar = this.f8960m;
        if (lVar != null && (d12 = y.d(lVar, e10, null, 2, null)) != null) {
            dc.b.a(d12, U());
            m.a aVar = dc.m.f13253f;
            nVar.resumeWith(dc.m.a(dc.n.a(d12)));
        } else {
            Throwable U = U();
            m.a aVar2 = dc.m.f13253f;
            nVar.resumeWith(dc.m.a(dc.n.a(U)));
        }
        Object x10 = nVar.x();
        d10 = ic.d.d();
        if (x10 == d10) {
            kotlin.coroutines.jvm.internal.h.c(continuation);
        }
        d11 = ic.d.d();
        if (x10 == d11) {
            return x10;
        }
        return w.f13270a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r0(E e10, ad.m<? super w> mVar) {
        pc.l<E, w> lVar = this.f8960m;
        if (lVar != null) {
            y.b(lVar, e10, mVar.getContext());
        }
        Throwable U = U();
        m.a aVar = dc.m.f13253f;
        mVar.resumeWith(dc.m.a(dc.n.a(U)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u0(b3 b3Var, j<E> jVar, int i10) {
        t0();
        b3Var.b(jVar, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v0(b3 b3Var, j<E> jVar, int i10) {
        b3Var.b(jVar, i10 + cd.c.f8984b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object w0(Object obj, Object obj2) {
        Object c10;
        if (obj2 == cd.c.z()) {
            c10 = h.f9007b.a(R());
        } else {
            c10 = h.f9007b.c(obj2);
        }
        return h.b(c10);
    }

    static /* synthetic */ <E> Object x0(b<E> bVar, Continuation<? super E> continuation) {
        j<E> jVar;
        g0 g0Var;
        g0 g0Var2;
        g0 g0Var3;
        j<E> jVar2 = (j) f8955v.get(bVar);
        while (!bVar.c0()) {
            long andIncrement = f8951r.getAndIncrement(bVar);
            int i10 = cd.c.f8984b;
            long j10 = andIncrement / i10;
            int i11 = (int) (andIncrement % i10);
            if (jVar2.f15625p != j10) {
                j<E> O = bVar.O(j10, jVar2);
                if (O == null) {
                    continue;
                } else {
                    jVar = O;
                }
            } else {
                jVar = jVar2;
            }
            Object N0 = bVar.N0(jVar, i11, andIncrement, null);
            g0Var = cd.c.f8995m;
            if (N0 != g0Var) {
                g0Var2 = cd.c.f8997o;
                if (N0 != g0Var2) {
                    g0Var3 = cd.c.f8996n;
                    if (N0 == g0Var3) {
                        return bVar.A0(jVar, i11, andIncrement, continuation);
                    }
                    jVar.b();
                    return N0;
                }
                if (andIncrement < bVar.V()) {
                    jVar.b();
                }
                jVar2 = jVar;
            } else {
                throw new IllegalStateException("unexpected".toString());
            }
        }
        throw f0.a(bVar.S());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ <E> java.lang.Object y0(cd.b<E> r14, kotlin.coroutines.Continuation<? super cd.h<? extends E>> r15) {
        /*
            boolean r0 = r15 instanceof cd.b.f
            if (r0 == 0) goto L13
            r0 = r15
            cd.b$f r0 = (cd.b.f) r0
            int r1 = r0.f8975p
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8975p = r1
            goto L18
        L13:
            cd.b$f r0 = new cd.b$f
            r0.<init>(r14, r15)
        L18:
            r6 = r0
            java.lang.Object r15 = r6.f8973f
            java.lang.Object r0 = ic.b.d()
            int r1 = r6.f8975p
            r2 = 1
            if (r1 == 0) goto L39
            if (r1 != r2) goto L31
            dc.n.b(r15)
            cd.h r15 = (cd.h) r15
            java.lang.Object r14 = r15.k()
            goto Lb6
        L31:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L39:
            dc.n.b(r15)
            r15 = 0
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = f()
            java.lang.Object r1 = r1.get(r14)
            cd.j r1 = (cd.j) r1
        L47:
            boolean r3 = r14.c0()
            if (r3 == 0) goto L59
            cd.h$b r15 = cd.h.f9007b
            java.lang.Throwable r14 = r14.R()
            java.lang.Object r14 = r15.a(r14)
            goto Lb6
        L59:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = m()
            long r4 = r3.getAndIncrement(r14)
            int r3 = cd.c.f8984b
            long r7 = (long) r3
            long r7 = r4 / r7
            long r9 = (long) r3
            long r9 = r4 % r9
            int r3 = (int) r9
            long r9 = r1.f15625p
            int r11 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r11 == 0) goto L79
            cd.j r7 = b(r14, r7, r1)
            if (r7 != 0) goto L77
            goto L47
        L77:
            r13 = r7
            goto L7a
        L79:
            r13 = r1
        L7a:
            r7 = r14
            r8 = r13
            r9 = r3
            r10 = r4
            r12 = r15
            java.lang.Object r1 = B(r7, r8, r9, r10, r12)
            fd.g0 r7 = cd.c.r()
            if (r1 == r7) goto Lb7
            fd.g0 r7 = cd.c.h()
            if (r1 != r7) goto L9c
            long r7 = r14.V()
            int r1 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r1 >= 0) goto L9a
            r13.b()
        L9a:
            r1 = r13
            goto L47
        L9c:
            fd.g0 r15 = cd.c.s()
            if (r1 != r15) goto Lad
            r6.f8975p = r2
            r1 = r14
            r2 = r13
            java.lang.Object r14 = r1.z0(r2, r3, r4, r6)
            if (r14 != r0) goto Lb6
            return r0
        Lad:
            r13.b()
            cd.h$b r14 = cd.h.f9007b
            java.lang.Object r14 = r14.c(r1)
        Lb6:
            return r14
        Lb7:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "unexpected"
            java.lang.String r15 = r15.toString()
            r14.<init>(r15)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: cd.b.y0(cd.b, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object z0(cd.j<E> r11, int r12, long r13, kotlin.coroutines.Continuation<? super cd.h<? extends E>> r15) {
        /*
            Method dump skipped, instructions count: 317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cd.b.z0(cd.j, int, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public boolean E(Throwable th) {
        if (th == null) {
            th = new CancellationException("Channel was cancelled");
        }
        return H(th, true);
    }

    protected boolean H(Throwable th, boolean z10) {
        g0 g0Var;
        if (z10) {
            i0();
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8957x;
        g0Var = cd.c.f9001s;
        boolean a10 = androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, g0Var, th);
        if (z10) {
            j0();
        } else {
            k0();
        }
        K();
        m0();
        if (a10) {
            Z();
        }
        return a10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void L(long j10) {
        g0 g0Var;
        UndeliveredElementException d10;
        j<E> jVar = (j) f8955v.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f8951r;
            long j11 = atomicLongFieldUpdater.get(this);
            if (j10 < Math.max(this.f8959f + j11, Q())) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j11, j11 + 1)) {
                int i10 = cd.c.f8984b;
                long j12 = j11 / i10;
                int i11 = (int) (j11 % i10);
                if (jVar.f15625p != j12) {
                    j<E> O = O(j12, jVar);
                    if (O == null) {
                        continue;
                    } else {
                        jVar = O;
                    }
                }
                Object N0 = N0(jVar, i11, j11, null);
                g0Var = cd.c.f8997o;
                if (N0 == g0Var) {
                    if (j11 < V()) {
                        jVar.b();
                    }
                } else {
                    jVar.b();
                    pc.l<E, w> lVar = this.f8960m;
                    if (lVar != null && (d10 = y.d(lVar, N0, null, 2, null)) != null) {
                        throw d10;
                    }
                }
            }
        }
    }

    protected final Throwable R() {
        return (Throwable) f8957x.get(this);
    }

    public final long T() {
        return f8951r.get(this);
    }

    public final void T0(long j10) {
        int i10;
        long j11;
        long v10;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        boolean z10;
        long v11;
        long j12;
        long v12;
        if (g0()) {
            return;
        }
        do {
        } while (Q() <= j10);
        i10 = cd.c.f8985c;
        for (int i11 = 0; i11 < i10; i11++) {
            long Q = Q();
            if (Q == (f8953t.get(this) & 4611686018427387903L) && Q == Q()) {
                return;
            }
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f8953t;
        do {
            j11 = atomicLongFieldUpdater2.get(this);
            v10 = cd.c.v(j11 & 4611686018427387903L, true);
        } while (!atomicLongFieldUpdater2.compareAndSet(this, j11, v10));
        while (true) {
            long Q2 = Q();
            atomicLongFieldUpdater = f8953t;
            long j13 = atomicLongFieldUpdater.get(this);
            long j14 = j13 & 4611686018427387903L;
            if ((4611686018427387904L & j13) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (Q2 == j14 && Q2 == Q()) {
                break;
            } else if (!z10) {
                v11 = cd.c.v(j14, true);
                atomicLongFieldUpdater.compareAndSet(this, j13, v11);
            }
        }
        do {
            j12 = atomicLongFieldUpdater.get(this);
            v12 = cd.c.v(j12 & 4611686018427387903L, false);
        } while (!atomicLongFieldUpdater.compareAndSet(this, j12, v12));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Throwable U() {
        Throwable R = R();
        if (R == null) {
            return new ClosedSendChannelException("Channel was closed");
        }
        return R;
    }

    public final long V() {
        return f8950q.get(this) & 1152921504606846975L;
    }

    public final boolean W() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8955v;
            j<E> jVar = (j) atomicReferenceFieldUpdater.get(this);
            long T = T();
            if (V() <= T) {
                return false;
            }
            int i10 = cd.c.f8984b;
            long j10 = T / i10;
            if (jVar.f15625p != j10 && (jVar = O(j10, jVar)) == null) {
                if (((j) atomicReferenceFieldUpdater.get(this)).f15625p < j10) {
                    return false;
                }
            } else {
                jVar.b();
                if (a0(jVar, (int) (T % i10), T)) {
                    return true;
                }
                f8951r.compareAndSet(this, T, T + 1);
            }
        }
    }

    @Override // cd.r
    public id.f<h<E>> a() {
        c cVar = c.f8967w;
        qc.q.g(cVar, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'select')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = 'param')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }");
        pc.q qVar = (pc.q) k0.e(cVar, 3);
        d dVar = d.f8968w;
        qc.q.g(dVar, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'param')] kotlin.Any?, @[ParameterName(name = 'clauseResult')] kotlin.Any?, kotlin.Any?>{ kotlinx.coroutines.selects.SelectKt.ProcessResultFunction }");
        return new id.g(this, qVar, (pc.q) k0.e(dVar, 3), this.f8961p);
    }

    @Override // cd.r
    public final void c(CancellationException cancellationException) {
        E(cancellationException);
    }

    public boolean c0() {
        return d0(f8950q.get(this));
    }

    protected boolean f0() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // cd.r
    public Object g() {
        g0 g0Var;
        j jVar;
        g0 g0Var2;
        b3 b3Var;
        g0 g0Var3;
        g0 g0Var4;
        long j10 = f8951r.get(this);
        long j11 = f8950q.get(this);
        if (d0(j11)) {
            return h.f9007b.a(R());
        }
        if (j10 < (j11 & 1152921504606846975L)) {
            g0Var = cd.c.f8993k;
            j jVar2 = (j) f8955v.get(this);
            while (!c0()) {
                long andIncrement = f8951r.getAndIncrement(this);
                int i10 = cd.c.f8984b;
                long j12 = andIncrement / i10;
                int i11 = (int) (andIncrement % i10);
                if (jVar2.f15625p != j12) {
                    j O = O(j12, jVar2);
                    if (O == null) {
                        continue;
                    } else {
                        jVar = O;
                    }
                } else {
                    jVar = jVar2;
                }
                Object N0 = N0(jVar, i11, andIncrement, g0Var);
                g0Var2 = cd.c.f8995m;
                if (N0 != g0Var2) {
                    g0Var3 = cd.c.f8997o;
                    if (N0 != g0Var3) {
                        g0Var4 = cd.c.f8996n;
                        if (N0 != g0Var4) {
                            jVar.b();
                            return h.f9007b.c(N0);
                        }
                        throw new IllegalStateException("unexpected".toString());
                    }
                    if (andIncrement < V()) {
                        jVar.b();
                    }
                    jVar2 = jVar;
                } else {
                    if (g0Var instanceof b3) {
                        b3Var = (b3) g0Var;
                    } else {
                        b3Var = null;
                    }
                    if (b3Var != null) {
                        u0(b3Var, jVar, i11);
                    }
                    T0(andIncrement);
                    jVar.p();
                    return h.f9007b.b();
                }
            }
            return h.f9007b.a(R());
        }
        return h.f9007b.b();
    }

    @Override // cd.s
    public void h(pc.l<? super Throwable, w> lVar) {
        g0 g0Var;
        g0 g0Var2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        g0 g0Var3;
        g0 g0Var4;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f8958y;
        if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater2, this, null, lVar)) {
            return;
        }
        do {
            Object obj = atomicReferenceFieldUpdater2.get(this);
            g0Var = cd.c.f8999q;
            if (obj != g0Var) {
                g0Var2 = cd.c.f9000r;
                if (obj == g0Var2) {
                    throw new IllegalStateException("Another handler was already registered and successfully invoked".toString());
                }
                throw new IllegalStateException(("Another handler is already registered: " + obj).toString());
            }
            atomicReferenceFieldUpdater = f8958y;
            g0Var3 = cd.c.f8999q;
            g0Var4 = cd.c.f9000r;
        } while (!androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, g0Var3, g0Var4));
        lVar.invoke(R());
    }

    @Override // cd.r
    public Object i(Continuation<? super h<? extends E>> continuation) {
        return y0(this, continuation);
    }

    @Override // cd.r
    public cd.f<E> iterator() {
        return new a();
    }

    @Override // cd.r
    public Object k(Continuation<? super E> continuation) {
        return x0(this, continuation);
    }

    @Override // cd.s
    public boolean l(Throwable th) {
        return H(th, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00bb, code lost:
    
        return cd.h.f9007b.c(dc.w.f13270a);
     */
    @Override // cd.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object p(E r15) {
        /*
            r14 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = cd.b.f8950q
            long r0 = r0.get(r14)
            boolean r0 = r14.I0(r0)
            if (r0 == 0) goto L13
            cd.h$b r15 = cd.h.f9007b
            java.lang.Object r15 = r15.b()
            return r15
        L13:
            fd.g0 r8 = cd.c.j()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = n()
            java.lang.Object r0 = r0.get(r14)
            cd.j r0 = (cd.j) r0
        L21:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = o()
            long r1 = r1.getAndIncrement(r14)
            r3 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r9 = r1 & r3
            boolean r11 = q(r14, r1)
            int r1 = cd.c.f8984b
            long r2 = (long) r1
            long r2 = r9 / r2
            long r4 = (long) r1
            long r4 = r9 % r4
            int r12 = (int) r4
            long r4 = r0.f15625p
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 == 0) goto L4e
            cd.j r1 = d(r14, r2, r0)
            if (r1 != 0) goto L4c
            if (r11 == 0) goto L21
            goto L8e
        L4c:
            r13 = r1
            goto L4f
        L4e:
            r13 = r0
        L4f:
            r0 = r14
            r1 = r13
            r2 = r12
            r3 = r15
            r4 = r9
            r6 = r8
            r7 = r11
            int r0 = C(r0, r1, r2, r3, r4, r6, r7)
            if (r0 == 0) goto Lb0
            r1 = 1
            if (r0 == r1) goto Lb3
            r1 = 2
            if (r0 == r1) goto L89
            r1 = 3
            if (r0 == r1) goto L7d
            r1 = 4
            if (r0 == r1) goto L71
            r1 = 5
            if (r0 == r1) goto L6c
            goto L6f
        L6c:
            r13.b()
        L6f:
            r0 = r13
            goto L21
        L71:
            long r0 = r14.T()
            int r15 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r15 >= 0) goto L8e
            r13.b()
            goto L8e
        L7d:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "unexpected"
            java.lang.String r0 = r0.toString()
            r15.<init>(r0)
            throw r15
        L89:
            if (r11 == 0) goto L99
            r13.p()
        L8e:
            cd.h$b r15 = cd.h.f9007b
            java.lang.Throwable r0 = r14.U()
            java.lang.Object r15 = r15.a(r0)
            goto Lbb
        L99:
            boolean r15 = r8 instanceof ad.b3
            if (r15 == 0) goto La0
            ad.b3 r8 = (ad.b3) r8
            goto La1
        La0:
            r8 = 0
        La1:
            if (r8 == 0) goto La6
            x(r14, r8, r13, r12)
        La6:
            r13.p()
            cd.h$b r15 = cd.h.f9007b
            java.lang.Object r15 = r15.b()
            goto Lbb
        Lb0:
            r13.b()
        Lb3:
            cd.h$b r15 = cd.h.f9007b
            dc.w r0 = dc.w.f13270a
            java.lang.Object r15 = r15.c(r0)
        Lbb:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: cd.b.p(java.lang.Object):java.lang.Object");
    }

    @Override // cd.s
    public Object r(E e10, Continuation<? super w> continuation) {
        return G0(this, e10, continuation);
    }

    @Override // cd.s
    public boolean s() {
        return e0(f8950q.get(this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:94:0x01e2, code lost:
    
        r3 = (cd.j) r3.e();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 532
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cd.b.toString():java.lang.String");
    }

    protected void m0() {
    }

    protected void s0() {
    }

    protected void t0() {
    }
}
