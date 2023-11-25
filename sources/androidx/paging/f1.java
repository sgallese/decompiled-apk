package androidx.paging;

import ad.x1;
import androidx.paging.d1;
import androidx.paging.h1;
import androidx.paging.q0;
import androidx.paging.u1;
import androidx.recyclerview.widget.RecyclerView;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.Continuation;

/* compiled from: PageFetcherSnapshot.kt */
/* loaded from: classes.dex */
public final class f1<Key, Value> {

    /* renamed from: a  reason: collision with root package name */
    private final Key f5589a;

    /* renamed from: b  reason: collision with root package name */
    private final u1<Key, Value> f5590b;

    /* renamed from: c  reason: collision with root package name */
    private final r1 f5591c;

    /* renamed from: d  reason: collision with root package name */
    private final dd.g<dc.w> f5592d;

    /* renamed from: e  reason: collision with root package name */
    private final e2<Key, Value> f5593e;

    /* renamed from: f  reason: collision with root package name */
    private final w1<Key, Value> f5594f;

    /* renamed from: g  reason: collision with root package name */
    private final pc.a<dc.w> f5595g;

    /* renamed from: h  reason: collision with root package name */
    private final z f5596h;

    /* renamed from: i  reason: collision with root package name */
    private final AtomicBoolean f5597i;

    /* renamed from: j  reason: collision with root package name */
    private final cd.d<d1<Value>> f5598j;

    /* renamed from: k  reason: collision with root package name */
    private final h1.a<Key, Value> f5599k;

    /* renamed from: l  reason: collision with root package name */
    private final ad.y f5600l;

    /* renamed from: m  reason: collision with root package name */
    private final dd.g<d1<Value>> f5601m;

    /* compiled from: PageFetcherSnapshot.kt */
    /* loaded from: classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f5602a;

        static {
            int[] iArr = new int[t0.values().length];
            try {
                iArr[t0.REFRESH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[t0.PREPEND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[t0.APPEND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f5602a = iArr;
        }
    }

    /* compiled from: FlowExt.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1", f = "PageFetcherSnapshot.kt", l = {232, 99}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.l implements pc.q<dd.h<? super y>, Integer, Continuation<? super dc.w>, Object> {

        /* renamed from: f  reason: collision with root package name */
        int f5603f;

        /* renamed from: m  reason: collision with root package name */
        private /* synthetic */ Object f5604m;

        /* renamed from: p  reason: collision with root package name */
        /* synthetic */ Object f5605p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ f1 f5606q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ t0 f5607r;

        /* renamed from: s  reason: collision with root package name */
        Object f5608s;

        /* renamed from: t  reason: collision with root package name */
        int f5609t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Continuation continuation, f1 f1Var, t0 t0Var) {
            super(3, continuation);
            this.f5606q = f1Var;
            this.f5607r = t0Var;
        }

        @Override // pc.q
        public final Object invoke(dd.h<? super y> hVar, Integer num, Continuation<? super dc.w> continuation) {
            b bVar = new b(continuation, this.f5606q, this.f5607r);
            bVar.f5604m = hVar;
            bVar.f5605p = num;
            return bVar.invokeSuspend(dc.w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d10;
            dd.h hVar;
            int intValue;
            h1.a aVar;
            jd.a a10;
            dd.g eVar;
            d10 = ic.d.d();
            int i10 = this.f5603f;
            int i11 = 1;
            try {
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            dc.n.b(obj);
                            return dc.w.f13270a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    intValue = this.f5609t;
                    a10 = (jd.a) this.f5608s;
                    aVar = (h1.a) this.f5605p;
                    hVar = (dd.h) this.f5604m;
                    dc.n.b(obj);
                } else {
                    dc.n.b(obj);
                    hVar = (dd.h) this.f5604m;
                    intValue = ((Number) this.f5605p).intValue();
                    aVar = this.f5606q.f5599k;
                    a10 = h1.a.a(aVar);
                    this.f5604m = hVar;
                    this.f5605p = aVar;
                    this.f5608s = a10;
                    this.f5609t = intValue;
                    this.f5603f = 1;
                    if (a10.c(null, this) == d10) {
                        return d10;
                    }
                }
                h1 b10 = h1.a.b(aVar);
                q0 a11 = b10.p().a(this.f5607r);
                q0.c.a aVar2 = q0.c.f6001b;
                if (qc.q.d(a11, aVar2.a())) {
                    eVar = dd.i.C(new y[0]);
                } else {
                    if (!(b10.p().a(this.f5607r) instanceof q0.a)) {
                        b10.p().c(this.f5607r, aVar2.b());
                    }
                    dc.w wVar = dc.w.f13270a;
                    a10.d(null);
                    dd.g<o2> c10 = this.f5606q.f5596h.c(this.f5607r);
                    if (intValue == 0) {
                        i11 = 0;
                    }
                    eVar = new e(dd.i.o(c10, i11), intValue);
                }
                this.f5604m = null;
                this.f5605p = null;
                this.f5608s = null;
                this.f5603f = 2;
                if (dd.i.r(hVar, eVar, this) == d10) {
                    return d10;
                }
                return dc.w.f13270a;
            } finally {
                a10.d(null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PageFetcherSnapshot.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PageFetcherSnapshot$collectAsGenerationalViewportHints$3", f = "PageFetcherSnapshot.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.l implements pc.q<y, y, Continuation<? super y>, Object> {

        /* renamed from: f  reason: collision with root package name */
        int f5610f;

        /* renamed from: m  reason: collision with root package name */
        /* synthetic */ Object f5611m;

        /* renamed from: p  reason: collision with root package name */
        /* synthetic */ Object f5612p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ t0 f5613q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(t0 t0Var, Continuation<? super c> continuation) {
            super(3, continuation);
            this.f5613q = t0Var;
        }

        @Override // pc.q
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final Object invoke(y yVar, y yVar2, Continuation<? super y> continuation) {
            c cVar = new c(this.f5613q, continuation);
            cVar.f5611m = yVar;
            cVar.f5612p = yVar2;
            return cVar.invokeSuspend(dc.w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            ic.d.d();
            if (this.f5610f == 0) {
                dc.n.b(obj);
                y yVar = (y) this.f5611m;
                y yVar2 = (y) this.f5612p;
                if (g1.a(yVar2, yVar, this.f5613q)) {
                    return yVar2;
                }
                return yVar;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PageFetcherSnapshot.kt */
    /* loaded from: classes.dex */
    public static final class d<T> implements dd.h {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ f1<Key, Value> f5614f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ t0 f5615m;

        d(f1<Key, Value> f1Var, t0 t0Var) {
            this.f5614f = f1Var;
            this.f5615m = t0Var;
        }

        @Override // dd.h
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final Object emit(y yVar, Continuation<? super dc.w> continuation) {
            Object d10;
            Object t10 = this.f5614f.t(this.f5615m, yVar, continuation);
            d10 = ic.d.d();
            if (t10 == d10) {
                return t10;
            }
            return dc.w.f13270a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    /* loaded from: classes.dex */
    public static final class e implements dd.g<y> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ dd.g f5616f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ int f5617m;

        /* compiled from: Emitters.kt */
        /* loaded from: classes.dex */
        public static final class a<T> implements dd.h {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ dd.h f5618f;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ int f5619m;

            /* compiled from: Emitters.kt */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PageFetcherSnapshot$collectAsGenerationalViewportHints$lambda$5$$inlined$map$1$2", f = "PageFetcherSnapshot.kt", l = {223}, m = "emit")
            /* renamed from: androidx.paging.f1$e$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0130a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: f  reason: collision with root package name */
                /* synthetic */ Object f5620f;

                /* renamed from: m  reason: collision with root package name */
                int f5621m;

                public C0130a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f5620f = obj;
                    this.f5621m |= RecyclerView.UNDEFINED_DURATION;
                    return a.this.emit(null, this);
                }
            }

            public a(dd.h hVar, int i10) {
                this.f5618f = hVar;
                this.f5619m = i10;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
            @Override // dd.h
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof androidx.paging.f1.e.a.C0130a
                    if (r0 == 0) goto L13
                    r0 = r7
                    androidx.paging.f1$e$a$a r0 = (androidx.paging.f1.e.a.C0130a) r0
                    int r1 = r0.f5621m
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f5621m = r1
                    goto L18
                L13:
                    androidx.paging.f1$e$a$a r0 = new androidx.paging.f1$e$a$a
                    r0.<init>(r7)
                L18:
                    java.lang.Object r7 = r0.f5620f
                    java.lang.Object r1 = ic.b.d()
                    int r2 = r0.f5621m
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    dc.n.b(r7)
                    goto L48
                L29:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L31:
                    dc.n.b(r7)
                    dd.h r7 = r5.f5618f
                    androidx.paging.o2 r6 = (androidx.paging.o2) r6
                    androidx.paging.y r2 = new androidx.paging.y
                    int r4 = r5.f5619m
                    r2.<init>(r4, r6)
                    r0.f5621m = r3
                    java.lang.Object r6 = r7.emit(r2, r0)
                    if (r6 != r1) goto L48
                    return r1
                L48:
                    dc.w r6 = dc.w.f13270a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.paging.f1.e.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public e(dd.g gVar, int i10) {
            this.f5616f = gVar;
            this.f5617m = i10;
        }

        @Override // dd.g
        public Object collect(dd.h<? super y> hVar, Continuation continuation) {
            Object d10;
            Object collect = this.f5616f.collect(new a(hVar, this.f5617m), continuation);
            d10 = ic.d.d();
            if (collect == d10) {
                return collect;
            }
            return dc.w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PageFetcherSnapshot.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PageFetcherSnapshot", f = "PageFetcherSnapshot.kt", l = {645}, m = "currentPagingState")
    /* loaded from: classes.dex */
    public static final class f extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: f  reason: collision with root package name */
        Object f5623f;

        /* renamed from: m  reason: collision with root package name */
        Object f5624m;

        /* renamed from: p  reason: collision with root package name */
        Object f5625p;

        /* renamed from: q  reason: collision with root package name */
        /* synthetic */ Object f5626q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ f1<Key, Value> f5627r;

        /* renamed from: s  reason: collision with root package name */
        int f5628s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(f1<Key, Value> f1Var, Continuation<? super f> continuation) {
            super(continuation);
            this.f5627r = f1Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f5626q = obj;
            this.f5628s |= RecyclerView.UNDEFINED_DURATION;
            return this.f5627r.r(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PageFetcherSnapshot.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PageFetcherSnapshot", f = "PageFetcherSnapshot.kt", l = {645, 284, 290, 667, 689, 326, 711, 733, 354}, m = "doInitialLoad")
    /* loaded from: classes.dex */
    public static final class g extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: f  reason: collision with root package name */
        Object f5629f;

        /* renamed from: m  reason: collision with root package name */
        Object f5630m;

        /* renamed from: p  reason: collision with root package name */
        Object f5631p;

        /* renamed from: q  reason: collision with root package name */
        Object f5632q;

        /* renamed from: r  reason: collision with root package name */
        /* synthetic */ Object f5633r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ f1<Key, Value> f5634s;

        /* renamed from: t  reason: collision with root package name */
        int f5635t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(f1<Key, Value> f1Var, Continuation<? super g> continuation) {
            super(continuation);
            this.f5634s = f1Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f5633r = obj;
            this.f5635t |= RecyclerView.UNDEFINED_DURATION;
            return this.f5634s.s(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PageFetcherSnapshot.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PageFetcherSnapshot", f = "PageFetcherSnapshot.kt", l = {646, 658, 415, 424, 680, 722, 472, 744, 495, 521, 756}, m = "doLoad")
    /* loaded from: classes.dex */
    public static final class h extends kotlin.coroutines.jvm.internal.d {
        /* synthetic */ Object A;
        final /* synthetic */ f1<Key, Value> B;
        int C;

        /* renamed from: f  reason: collision with root package name */
        Object f5636f;

        /* renamed from: m  reason: collision with root package name */
        Object f5637m;

        /* renamed from: p  reason: collision with root package name */
        Object f5638p;

        /* renamed from: q  reason: collision with root package name */
        Object f5639q;

        /* renamed from: r  reason: collision with root package name */
        Object f5640r;

        /* renamed from: s  reason: collision with root package name */
        Object f5641s;

        /* renamed from: t  reason: collision with root package name */
        Object f5642t;

        /* renamed from: u  reason: collision with root package name */
        Object f5643u;

        /* renamed from: v  reason: collision with root package name */
        Object f5644v;

        /* renamed from: w  reason: collision with root package name */
        Object f5645w;

        /* renamed from: x  reason: collision with root package name */
        Object f5646x;

        /* renamed from: y  reason: collision with root package name */
        int f5647y;

        /* renamed from: z  reason: collision with root package name */
        int f5648z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(f1<Key, Value> f1Var, Continuation<? super h> continuation) {
            super(continuation);
            this.B = f1Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.A = obj;
            this.C |= RecyclerView.UNDEFINED_DURATION;
            return this.B.t(null, null, this);
        }
    }

    /* compiled from: PageFetcherSnapshot.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$1", f = "PageFetcherSnapshot.kt", l = {645, 168, 657}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class i extends kotlin.coroutines.jvm.internal.l implements pc.p<g2<d1<Value>>, Continuation<? super dc.w>, Object> {

        /* renamed from: f  reason: collision with root package name */
        Object f5649f;

        /* renamed from: m  reason: collision with root package name */
        Object f5650m;

        /* renamed from: p  reason: collision with root package name */
        Object f5651p;

        /* renamed from: q  reason: collision with root package name */
        int f5652q;

        /* renamed from: r  reason: collision with root package name */
        private /* synthetic */ Object f5653r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ f1<Key, Value> f5654s;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: PageFetcherSnapshot.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$1$2", f = "PageFetcherSnapshot.kt", l = {91}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super dc.w>, Object> {

            /* renamed from: f  reason: collision with root package name */
            int f5655f;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ f1<Key, Value> f5656m;

            /* renamed from: p  reason: collision with root package name */
            final /* synthetic */ g2<d1<Value>> f5657p;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: PageFetcherSnapshot.kt */
            /* renamed from: androidx.paging.f1$i$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0131a<T> implements dd.h {

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ g2<d1<Value>> f5658f;

                /* JADX INFO: Access modifiers changed from: package-private */
                /* compiled from: PageFetcherSnapshot.kt */
                @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$1$2$1", f = "PageFetcherSnapshot.kt", l = {95}, m = "emit")
                /* renamed from: androidx.paging.f1$i$a$a$a  reason: collision with other inner class name */
                /* loaded from: classes.dex */
                public static final class C0132a extends kotlin.coroutines.jvm.internal.d {

                    /* renamed from: f  reason: collision with root package name */
                    /* synthetic */ Object f5659f;

                    /* renamed from: m  reason: collision with root package name */
                    final /* synthetic */ C0131a<T> f5660m;

                    /* renamed from: p  reason: collision with root package name */
                    int f5661p;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    C0132a(C0131a<? super T> c0131a, Continuation<? super C0132a> continuation) {
                        super(continuation);
                        this.f5660m = c0131a;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.f5659f = obj;
                        this.f5661p |= RecyclerView.UNDEFINED_DURATION;
                        return this.f5660m.emit(null, this);
                    }
                }

                C0131a(g2<d1<Value>> g2Var) {
                    this.f5658f = g2Var;
                }

                /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|23|6|7|(0)(0)|11|12|13) */
                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
                @Override // dd.h
                /* renamed from: a  reason: merged with bridge method [inline-methods] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(androidx.paging.d1<Value> r5, kotlin.coroutines.Continuation<? super dc.w> r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof androidx.paging.f1.i.a.C0131a.C0132a
                        if (r0 == 0) goto L13
                        r0 = r6
                        androidx.paging.f1$i$a$a$a r0 = (androidx.paging.f1.i.a.C0131a.C0132a) r0
                        int r1 = r0.f5661p
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f5661p = r1
                        goto L18
                    L13:
                        androidx.paging.f1$i$a$a$a r0 = new androidx.paging.f1$i$a$a$a
                        r0.<init>(r4, r6)
                    L18:
                        java.lang.Object r6 = r0.f5659f
                        java.lang.Object r1 = ic.b.d()
                        int r2 = r0.f5661p
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        dc.n.b(r6)     // Catch: kotlinx.coroutines.channels.ClosedSendChannelException -> L3f
                        goto L3f
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        dc.n.b(r6)
                        androidx.paging.g2<androidx.paging.d1<Value>> r6 = r4.f5658f     // Catch: kotlinx.coroutines.channels.ClosedSendChannelException -> L3f
                        r0.f5661p = r3     // Catch: kotlinx.coroutines.channels.ClosedSendChannelException -> L3f
                        java.lang.Object r5 = r6.r(r5, r0)     // Catch: kotlinx.coroutines.channels.ClosedSendChannelException -> L3f
                        if (r5 != r1) goto L3f
                        return r1
                    L3f:
                        dc.w r5 = dc.w.f13270a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.paging.f1.i.a.C0131a.emit(androidx.paging.d1, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(f1<Key, Value> f1Var, g2<d1<Value>> g2Var, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f5656m = f1Var;
                this.f5657p = g2Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
                return new a(this.f5656m, this.f5657p, continuation);
            }

            @Override // pc.p
            public final Object invoke(ad.k0 k0Var, Continuation<? super dc.w> continuation) {
                return ((a) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object d10;
                d10 = ic.d.d();
                int i10 = this.f5655f;
                if (i10 != 0) {
                    if (i10 == 1) {
                        dc.n.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    dc.n.b(obj);
                    dd.g i11 = dd.i.i(((f1) this.f5656m).f5598j);
                    C0131a c0131a = new C0131a(this.f5657p);
                    this.f5655f = 1;
                    if (i11.collect(c0131a, this) == d10) {
                        return d10;
                    }
                }
                return dc.w.f13270a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: PageFetcherSnapshot.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$1$3", f = "PageFetcherSnapshot.kt", l = {105}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class b extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super dc.w>, Object> {

            /* renamed from: f  reason: collision with root package name */
            int f5662f;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ f1<Key, Value> f5663m;

            /* renamed from: p  reason: collision with root package name */
            final /* synthetic */ cd.d<dc.w> f5664p;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: PageFetcherSnapshot.kt */
            /* loaded from: classes.dex */
            public static final class a<T> implements dd.h {

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ cd.d<dc.w> f5665f;

                a(cd.d<dc.w> dVar) {
                    this.f5665f = dVar;
                }

                @Override // dd.h
                /* renamed from: a  reason: merged with bridge method [inline-methods] */
                public final Object emit(dc.w wVar, Continuation<? super dc.w> continuation) {
                    this.f5665f.p(wVar);
                    return dc.w.f13270a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(f1<Key, Value> f1Var, cd.d<dc.w> dVar, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f5663m = f1Var;
                this.f5664p = dVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
                return new b(this.f5663m, this.f5664p, continuation);
            }

            @Override // pc.p
            public final Object invoke(ad.k0 k0Var, Continuation<? super dc.w> continuation) {
                return ((b) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object d10;
                d10 = ic.d.d();
                int i10 = this.f5662f;
                if (i10 != 0) {
                    if (i10 == 1) {
                        dc.n.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    dc.n.b(obj);
                    dd.g gVar = ((f1) this.f5663m).f5592d;
                    a aVar = new a(this.f5664p);
                    this.f5662f = 1;
                    if (gVar.collect(aVar, this) == d10) {
                        return d10;
                    }
                }
                return dc.w.f13270a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: PageFetcherSnapshot.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$1$4", f = "PageFetcherSnapshot.kt", l = {110}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class c extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super dc.w>, Object> {

            /* renamed from: f  reason: collision with root package name */
            int f5666f;

            /* renamed from: m  reason: collision with root package name */
            private /* synthetic */ Object f5667m;

            /* renamed from: p  reason: collision with root package name */
            final /* synthetic */ cd.d<dc.w> f5668p;

            /* renamed from: q  reason: collision with root package name */
            final /* synthetic */ f1<Key, Value> f5669q;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: PageFetcherSnapshot.kt */
            /* loaded from: classes.dex */
            public static final class a<T> implements dd.h {

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ f1<Key, Value> f5670f;

                /* renamed from: m  reason: collision with root package name */
                final /* synthetic */ ad.k0 f5671m;

                /* compiled from: PageFetcherSnapshot.kt */
                /* renamed from: androidx.paging.f1$i$c$a$a  reason: collision with other inner class name */
                /* loaded from: classes.dex */
                public /* synthetic */ class C0133a {

                    /* renamed from: a  reason: collision with root package name */
                    public static final /* synthetic */ int[] f5672a;

                    static {
                        int[] iArr = new int[t0.values().length];
                        try {
                            iArr[t0.REFRESH.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        f5672a = iArr;
                    }
                }

                /* JADX INFO: Access modifiers changed from: package-private */
                /* compiled from: PageFetcherSnapshot.kt */
                @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$1$4$1", f = "PageFetcherSnapshot.kt", l = {645, 658, 125, 670, 128, 682, 695, 125, 707, 128, 719, 732, 125, 744, 128, 756}, m = "emit")
                /* loaded from: classes.dex */
                public static final class b extends kotlin.coroutines.jvm.internal.d {

                    /* renamed from: f  reason: collision with root package name */
                    Object f5673f;

                    /* renamed from: m  reason: collision with root package name */
                    Object f5674m;

                    /* renamed from: p  reason: collision with root package name */
                    Object f5675p;

                    /* renamed from: q  reason: collision with root package name */
                    Object f5676q;

                    /* renamed from: r  reason: collision with root package name */
                    Object f5677r;

                    /* renamed from: s  reason: collision with root package name */
                    Object f5678s;

                    /* renamed from: t  reason: collision with root package name */
                    Object f5679t;

                    /* renamed from: u  reason: collision with root package name */
                    Object f5680u;

                    /* renamed from: v  reason: collision with root package name */
                    /* synthetic */ Object f5681v;

                    /* renamed from: w  reason: collision with root package name */
                    final /* synthetic */ a<T> f5682w;

                    /* renamed from: x  reason: collision with root package name */
                    int f5683x;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    b(a<? super T> aVar, Continuation<? super b> continuation) {
                        super(continuation);
                        this.f5682w = aVar;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.f5681v = obj;
                        this.f5683x |= RecyclerView.UNDEFINED_DURATION;
                        return this.f5682w.emit(null, this);
                    }
                }

                a(f1<Key, Value> f1Var, ad.k0 k0Var) {
                    this.f5670f = f1Var;
                    this.f5671m = k0Var;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:107:0x0387  */
                /* JADX WARN: Removed duplicated region for block: B:108:0x038b  */
                /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
                /* JADX WARN: Removed duplicated region for block: B:116:0x03df A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:117:0x03e0  */
                /* JADX WARN: Removed duplicated region for block: B:120:0x03e8  */
                /* JADX WARN: Removed duplicated region for block: B:126:0x041a  */
                /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
                /* JADX WARN: Removed duplicated region for block: B:136:0x0436  */
                /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
                /* JADX WARN: Removed duplicated region for block: B:144:0x0473 A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:145:0x0474  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0056  */
                /* JADX WARN: Removed duplicated region for block: B:153:0x0490  */
                /* JADX WARN: Removed duplicated region for block: B:154:0x0494  */
                /* JADX WARN: Removed duplicated region for block: B:15:0x0077  */
                /* JADX WARN: Removed duplicated region for block: B:162:0x04e6 A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:163:0x04e7  */
                /* JADX WARN: Removed duplicated region for block: B:166:0x04ec  */
                /* JADX WARN: Removed duplicated region for block: B:173:0x051f  */
                /* JADX WARN: Removed duplicated region for block: B:20:0x008f  */
                /* JADX WARN: Removed duplicated region for block: B:21:0x00a9  */
                /* JADX WARN: Removed duplicated region for block: B:22:0x00c2  */
                /* JADX WARN: Removed duplicated region for block: B:23:0x00da  */
                /* JADX WARN: Removed duplicated region for block: B:24:0x00ff  */
                /* JADX WARN: Removed duplicated region for block: B:29:0x011b  */
                /* JADX WARN: Removed duplicated region for block: B:30:0x013a  */
                /* JADX WARN: Removed duplicated region for block: B:31:0x0153  */
                /* JADX WARN: Removed duplicated region for block: B:32:0x016b  */
                /* JADX WARN: Removed duplicated region for block: B:33:0x0190  */
                /* JADX WARN: Removed duplicated region for block: B:38:0x01aa  */
                /* JADX WARN: Removed duplicated region for block: B:47:0x01f1  */
                /* JADX WARN: Removed duplicated region for block: B:48:0x0205  */
                /* JADX WARN: Removed duplicated region for block: B:55:0x0259  */
                /* JADX WARN: Removed duplicated region for block: B:58:0x026c  */
                /* JADX WARN: Removed duplicated region for block: B:61:0x027a  */
                /* JADX WARN: Removed duplicated region for block: B:62:0x027e  */
                /* JADX WARN: Removed duplicated region for block: B:70:0x02d0 A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:71:0x02d1  */
                /* JADX WARN: Removed duplicated region for block: B:74:0x02d9  */
                /* JADX WARN: Removed duplicated region for block: B:80:0x030a  */
                /* JADX WARN: Removed duplicated region for block: B:90:0x0326  */
                /* JADX WARN: Removed duplicated region for block: B:98:0x0368 A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:99:0x0369  */
                /* JADX WARN: Type inference failed for: r1v0, types: [int] */
                /* JADX WARN: Type inference failed for: r1v1, types: [jd.a] */
                /* JADX WARN: Type inference failed for: r1v14, types: [jd.a] */
                /* JADX WARN: Type inference failed for: r1v2, types: [jd.a] */
                /* JADX WARN: Type inference failed for: r1v3, types: [jd.a] */
                /* JADX WARN: Type inference failed for: r1v39, types: [jd.a] */
                /* JADX WARN: Type inference failed for: r1v68, types: [jd.a] */
                /* JADX WARN: Type inference failed for: r1v86 */
                /* JADX WARN: Type inference failed for: r1v87 */
                /* JADX WARN: Type inference failed for: r1v88 */
                /* JADX WARN: Type inference failed for: r1v89 */
                /* JADX WARN: Type inference failed for: r1v90 */
                /* JADX WARN: Type inference failed for: r1v91 */
                @Override // dd.h
                /* renamed from: a  reason: merged with bridge method [inline-methods] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(dc.w r14, kotlin.coroutines.Continuation<? super dc.w> r15) {
                    /*
                        Method dump skipped, instructions count: 1372
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.paging.f1.i.c.a.emit(dc.w, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(cd.d<dc.w> dVar, f1<Key, Value> f1Var, Continuation<? super c> continuation) {
                super(2, continuation);
                this.f5668p = dVar;
                this.f5669q = f1Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
                c cVar = new c(this.f5668p, this.f5669q, continuation);
                cVar.f5667m = obj;
                return cVar;
            }

            @Override // pc.p
            public final Object invoke(ad.k0 k0Var, Continuation<? super dc.w> continuation) {
                return ((c) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object d10;
                d10 = ic.d.d();
                int i10 = this.f5666f;
                if (i10 != 0) {
                    if (i10 == 1) {
                        dc.n.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    dc.n.b(obj);
                    ad.k0 k0Var = (ad.k0) this.f5667m;
                    dd.g i11 = dd.i.i(this.f5668p);
                    a aVar = new a(this.f5669q, k0Var);
                    this.f5666f = 1;
                    if (i11.collect(aVar, this) == d10) {
                        return d10;
                    }
                }
                return dc.w.f13270a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(f1<Key, Value> f1Var, Continuation<? super i> continuation) {
            super(2, continuation);
            this.f5654s = f1Var;
        }

        @Override // pc.p
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final Object invoke(g2<d1<Value>> g2Var, Continuation<? super dc.w> continuation) {
            return ((i) create(g2Var, continuation)).invokeSuspend(dc.w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
            i iVar = new i(this.f5654s, continuation);
            iVar.f5653r = obj;
            return iVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:30:0x00dc A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00f5 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00f6  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x010d  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                Method dump skipped, instructions count: 294
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.f1.i.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: PageFetcherSnapshot.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$2", f = "PageFetcherSnapshot.kt", l = {645, 179}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class j extends kotlin.coroutines.jvm.internal.l implements pc.p<dd.h<? super d1<Value>>, Continuation<? super dc.w>, Object> {

        /* renamed from: f  reason: collision with root package name */
        Object f5684f;

        /* renamed from: m  reason: collision with root package name */
        Object f5685m;

        /* renamed from: p  reason: collision with root package name */
        int f5686p;

        /* renamed from: q  reason: collision with root package name */
        private /* synthetic */ Object f5687q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ f1<Key, Value> f5688r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(f1<Key, Value> f1Var, Continuation<? super j> continuation) {
            super(2, continuation);
            this.f5688r = f1Var;
        }

        @Override // pc.p
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final Object invoke(dd.h<? super d1<Value>> hVar, Continuation<? super dc.w> continuation) {
            return ((j) create(hVar, continuation)).invokeSuspend(dc.w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
            j jVar = new j(this.f5688r, continuation);
            jVar.f5687q = obj;
            return jVar;
        }

        /* JADX WARN: Type inference failed for: r4v0, types: [qc.h, androidx.paging.s0] */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d10;
            dd.h hVar;
            h1.a aVar;
            jd.a aVar2;
            d10 = ic.d.d();
            int i10 = this.f5686p;
            int i11 = 2;
            ?? r42 = 0;
            try {
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            dc.n.b(obj);
                            return dc.w.f13270a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    hVar = (dd.h) this.f5685m;
                    aVar2 = (jd.a) this.f5684f;
                    aVar = (h1.a) this.f5687q;
                    dc.n.b(obj);
                } else {
                    dc.n.b(obj);
                    hVar = (dd.h) this.f5687q;
                    aVar = ((f1) this.f5688r).f5599k;
                    jd.a a10 = h1.a.a(aVar);
                    this.f5687q = aVar;
                    this.f5684f = a10;
                    this.f5685m = hVar;
                    this.f5686p = 1;
                    if (a10.c(null, this) == d10) {
                        return d10;
                    }
                    aVar2 = a10;
                }
                s0 d11 = h1.a.b(aVar).p().d();
                aVar2.d(null);
                d1.c cVar = new d1.c(d11, r42, i11, r42);
                this.f5687q = null;
                this.f5684f = null;
                this.f5685m = null;
                this.f5686p = 2;
                if (hVar.emit(cVar, this) == d10) {
                    return d10;
                }
                return dc.w.f13270a;
            } catch (Throwable th) {
                aVar2.d(null);
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PageFetcherSnapshot.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PageFetcherSnapshot$startConsumingHints$1", f = "PageFetcherSnapshot.kt", l = {220}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class k extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super dc.w>, Object> {

        /* renamed from: f  reason: collision with root package name */
        int f5689f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ f1<Key, Value> f5690m;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: PageFetcherSnapshot.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PageFetcherSnapshot$startConsumingHints$1$jumpHint$1", f = "PageFetcherSnapshot.kt", l = {}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements pc.p<o2, Continuation<? super Boolean>, Object> {

            /* renamed from: f  reason: collision with root package name */
            int f5691f;

            /* renamed from: m  reason: collision with root package name */
            /* synthetic */ Object f5692m;

            /* renamed from: p  reason: collision with root package name */
            final /* synthetic */ f1<Key, Value> f5693p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(f1<Key, Value> f1Var, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f5693p = f1Var;
            }

            @Override // pc.p
            /* renamed from: a  reason: merged with bridge method [inline-methods] */
            public final Object invoke(o2 o2Var, Continuation<? super Boolean> continuation) {
                return ((a) create(o2Var, continuation)).invokeSuspend(dc.w.f13270a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(this.f5693p, continuation);
                aVar.f5692m = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                boolean z10;
                ic.d.d();
                if (this.f5691f == 0) {
                    dc.n.b(obj);
                    o2 o2Var = (o2) this.f5692m;
                    if (o2Var.d() * (-1) <= ((f1) this.f5693p).f5591c.f6023f && o2Var.c() * (-1) <= ((f1) this.f5693p).f5591c.f6023f) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    return kotlin.coroutines.jvm.internal.b.a(z10);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(f1<Key, Value> f1Var, Continuation<? super k> continuation) {
            super(2, continuation);
            this.f5690m = f1Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
            return new k(this.f5690m, continuation);
        }

        @Override // pc.p
        public final Object invoke(ad.k0 k0Var, Continuation<? super dc.w> continuation) {
            return ((k) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d10;
            d10 = ic.d.d();
            int i10 = this.f5689f;
            boolean z10 = false;
            if (i10 != 0) {
                if (i10 == 1) {
                    dc.n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                dc.n.b(obj);
                dd.g H = dd.i.H(((f1) this.f5690m).f5596h.c(t0.APPEND), ((f1) this.f5690m).f5596h.c(t0.PREPEND));
                a aVar = new a(this.f5690m, null);
                this.f5689f = 1;
                obj = dd.i.y(H, aVar, this);
                if (obj == d10) {
                    return d10;
                }
            }
            o2 o2Var = (o2) obj;
            if (o2Var != null) {
                f1<Key, Value> f1Var = this.f5690m;
                u0 a10 = v0.a();
                if (a10 != null && a10.a(3)) {
                    z10 = true;
                }
                if (z10) {
                    a10.b(3, "Jump triggered on PagingSource " + f1Var.v() + " by " + o2Var, null);
                }
                ((f1) this.f5690m).f5595g.invoke();
            }
            return dc.w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PageFetcherSnapshot.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PageFetcherSnapshot$startConsumingHints$2", f = "PageFetcherSnapshot.kt", l = {645, 233}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class l extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super dc.w>, Object> {

        /* renamed from: f  reason: collision with root package name */
        Object f5694f;

        /* renamed from: m  reason: collision with root package name */
        Object f5695m;

        /* renamed from: p  reason: collision with root package name */
        Object f5696p;

        /* renamed from: q  reason: collision with root package name */
        int f5697q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ f1<Key, Value> f5698r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(f1<Key, Value> f1Var, Continuation<? super l> continuation) {
            super(2, continuation);
            this.f5698r = f1Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
            return new l(this.f5698r, continuation);
        }

        @Override // pc.p
        public final Object invoke(ad.k0 k0Var, Continuation<? super dc.w> continuation) {
            return ((l) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d10;
            f1<Key, Value> f1Var;
            h1.a aVar;
            jd.a aVar2;
            d10 = ic.d.d();
            int i10 = this.f5697q;
            try {
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            dc.n.b(obj);
                            return dc.w.f13270a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    f1Var = (f1) this.f5696p;
                    aVar2 = (jd.a) this.f5695m;
                    aVar = (h1.a) this.f5694f;
                    dc.n.b(obj);
                } else {
                    dc.n.b(obj);
                    f1Var = this.f5698r;
                    aVar = ((f1) f1Var).f5599k;
                    jd.a a10 = h1.a.a(aVar);
                    this.f5694f = aVar;
                    this.f5695m = a10;
                    this.f5696p = f1Var;
                    this.f5697q = 1;
                    if (a10.c(null, this) == d10) {
                        return d10;
                    }
                    aVar2 = a10;
                }
                dd.g<Integer> f10 = h1.a.b(aVar).f();
                aVar2.d(null);
                t0 t0Var = t0.PREPEND;
                this.f5694f = null;
                this.f5695m = null;
                this.f5696p = null;
                this.f5697q = 2;
                if (f1Var.q(f10, t0Var, this) == d10) {
                    return d10;
                }
                return dc.w.f13270a;
            } catch (Throwable th) {
                aVar2.d(null);
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PageFetcherSnapshot.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PageFetcherSnapshot$startConsumingHints$3", f = "PageFetcherSnapshot.kt", l = {645, 238}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class m extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super dc.w>, Object> {

        /* renamed from: f  reason: collision with root package name */
        Object f5699f;

        /* renamed from: m  reason: collision with root package name */
        Object f5700m;

        /* renamed from: p  reason: collision with root package name */
        Object f5701p;

        /* renamed from: q  reason: collision with root package name */
        int f5702q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ f1<Key, Value> f5703r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(f1<Key, Value> f1Var, Continuation<? super m> continuation) {
            super(2, continuation);
            this.f5703r = f1Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
            return new m(this.f5703r, continuation);
        }

        @Override // pc.p
        public final Object invoke(ad.k0 k0Var, Continuation<? super dc.w> continuation) {
            return ((m) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d10;
            f1<Key, Value> f1Var;
            h1.a aVar;
            jd.a aVar2;
            d10 = ic.d.d();
            int i10 = this.f5702q;
            try {
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            dc.n.b(obj);
                            return dc.w.f13270a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    f1Var = (f1) this.f5701p;
                    aVar2 = (jd.a) this.f5700m;
                    aVar = (h1.a) this.f5699f;
                    dc.n.b(obj);
                } else {
                    dc.n.b(obj);
                    f1Var = this.f5703r;
                    aVar = ((f1) f1Var).f5599k;
                    jd.a a10 = h1.a.a(aVar);
                    this.f5699f = aVar;
                    this.f5700m = a10;
                    this.f5701p = f1Var;
                    this.f5702q = 1;
                    if (a10.c(null, this) == d10) {
                        return d10;
                    }
                    aVar2 = a10;
                }
                dd.g<Integer> e10 = h1.a.b(aVar).e();
                aVar2.d(null);
                t0 t0Var = t0.APPEND;
                this.f5699f = null;
                this.f5700m = null;
                this.f5701p = null;
                this.f5702q = 2;
                if (f1Var.q(e10, t0Var, this) == d10) {
                    return d10;
                }
                return dc.w.f13270a;
            } catch (Throwable th) {
                aVar2.d(null);
                throw th;
            }
        }
    }

    public f1(Key key, u1<Key, Value> u1Var, r1 r1Var, dd.g<dc.w> gVar, e2<Key, Value> e2Var, w1<Key, Value> w1Var, pc.a<dc.w> aVar) {
        boolean z10;
        ad.y b10;
        qc.q.i(u1Var, "pagingSource");
        qc.q.i(r1Var, "config");
        qc.q.i(gVar, "retryFlow");
        qc.q.i(aVar, "jumpCallback");
        this.f5589a = key;
        this.f5590b = u1Var;
        this.f5591c = r1Var;
        this.f5592d = gVar;
        this.f5593e = e2Var;
        this.f5594f = w1Var;
        this.f5595g = aVar;
        if (r1Var.f6023f != Integer.MIN_VALUE && !u1Var.getJumpingSupported()) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            this.f5596h = new z();
            this.f5597i = new AtomicBoolean(false);
            this.f5598j = cd.g.b(-2, null, null, 6, null);
            this.f5599k = new h1.a<>(r1Var);
            b10 = ad.c2.b(null, 1, null);
            this.f5600l = b10;
            this.f5601m = dd.i.K(androidx.paging.g.a(b10, new i(this, null)), new j(this, null));
            return;
        }
        throw new IllegalArgumentException("PagingConfig.jumpThreshold was set, but the associated PagingSource has not marked support for jumps by overriding PagingSource.jumpingSupported to true.".toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object A(t0 t0Var, o2 o2Var, Continuation<? super dc.w> continuation) {
        Object d10;
        boolean z10 = true;
        if (a.f5602a[t0Var.ordinal()] == 1) {
            Object s10 = s(continuation);
            d10 = ic.d.d();
            if (s10 == d10) {
                return s10;
            }
            return dc.w.f13270a;
        }
        if (o2Var == null) {
            z10 = false;
        }
        if (z10) {
            this.f5596h.a(t0Var, o2Var);
            return dc.w.f13270a;
        }
        throw new IllegalStateException("Cannot retry APPEND / PREPEND load on PagingSource without ViewportHint".toString());
    }

    private final Object B(h1<Key, Value> h1Var, t0 t0Var, q0.a aVar, Continuation<? super dc.w> continuation) {
        Object d10;
        if (!qc.q.d(h1Var.p().a(t0Var), aVar)) {
            h1Var.p().c(t0Var, aVar);
            Object r10 = this.f5598j.r(new d1.c(h1Var.p().d(), null), continuation);
            d10 = ic.d.d();
            if (r10 == d10) {
                return r10;
            }
            return dc.w.f13270a;
        }
        return dc.w.f13270a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object C(h1<Key, Value> h1Var, t0 t0Var, Continuation<? super dc.w> continuation) {
        Object d10;
        q0 a10 = h1Var.p().a(t0Var);
        q0.b bVar = q0.b.f6000b;
        if (!qc.q.d(a10, bVar)) {
            h1Var.p().c(t0Var, bVar);
            Object r10 = this.f5598j.r(new d1.c(h1Var.p().d(), null), continuation);
            d10 = ic.d.d();
            if (r10 == d10) {
                return r10;
            }
            return dc.w.f13270a;
        }
        return dc.w.f13270a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D(ad.k0 k0Var) {
        if (this.f5591c.f6023f != Integer.MIN_VALUE) {
            ad.i.d(k0Var, null, null, new k(this, null), 3, null);
        }
        ad.i.d(k0Var, null, null, new l(this, null), 3, null);
        ad.i.d(k0Var, null, null, new m(this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object q(dd.g<Integer> gVar, t0 t0Var, Continuation<? super dc.w> continuation) {
        Object d10;
        Object collect = dd.i.h(x.b(x.d(gVar, new b(null, this, t0Var)), new c(t0Var, null))).collect(new d(this, t0Var), continuation);
        d10 = ic.d.d();
        if (collect == d10) {
            return collect;
        }
        return dc.w.f13270a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02ff A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00fe A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x014c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0192 A[Catch: all -> 0x029a, TryCatch #2 {all -> 0x029a, blocks: (B:60:0x016f, B:62:0x0192, B:63:0x019f, B:65:0x01a8), top: B:153:0x016f }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01a8 A[Catch: all -> 0x029a, TRY_LEAVE, TryCatch #2 {all -> 0x029a, blocks: (B:60:0x016f, B:62:0x0192, B:63:0x019f, B:65:0x01a8), top: B:153:0x016f }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x020f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x023d  */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1, types: [jd.a] */
    /* JADX WARN: Type inference failed for: r4v2, types: [jd.a] */
    /* JADX WARN: Type inference failed for: r4v35, types: [jd.a] */
    /* JADX WARN: Type inference failed for: r4v47 */
    /* JADX WARN: Type inference failed for: r4v48 */
    /* JADX WARN: Type inference failed for: r4v49 */
    /* JADX WARN: Type inference failed for: r4v50 */
    /* JADX WARN: Type inference failed for: r4v8, types: [jd.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object s(kotlin.coroutines.Continuation<? super dc.w> r17) {
        /*
            Method dump skipped, instructions count: 814
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.f1.s(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x04f5, code lost:
    
        if (r0.a(2) == true) goto L171;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0473  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0492  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x04e4  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x054f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0550  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0575  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0578  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x05a3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x05a4  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x05b9 A[Catch: all -> 0x06ec, TRY_LEAVE, TryCatch #3 {all -> 0x06ec, blocks: (B:195:0x05ab, B:197:0x05b9), top: B:270:0x05ab }] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x05eb  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0604 A[Catch: all -> 0x00bb, TryCatch #2 {all -> 0x00bb, blocks: (B:201:0x05e4, B:203:0x05ed, B:205:0x0604, B:207:0x0610, B:209:0x0618, B:211:0x0625, B:210:0x061f, B:212:0x0628, B:216:0x0659, B:14:0x0086, B:17:0x00b6), top: B:268:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0618 A[Catch: all -> 0x00bb, TryCatch #2 {all -> 0x00bb, blocks: (B:201:0x05e4, B:203:0x05ed, B:205:0x0604, B:207:0x0610, B:209:0x0618, B:211:0x0625, B:210:0x061f, B:212:0x0628, B:216:0x0659, B:14:0x0086, B:17:0x00b6), top: B:268:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:210:0x061f A[Catch: all -> 0x00bb, TryCatch #2 {all -> 0x00bb, blocks: (B:201:0x05e4, B:203:0x05ed, B:205:0x0604, B:207:0x0610, B:209:0x0618, B:211:0x0625, B:210:0x061f, B:212:0x0628, B:216:0x0659, B:14:0x0086, B:17:0x00b6), top: B:268:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0652 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0653  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x06c9  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x06d2  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x06ff A[Catch: all -> 0x0705, TRY_ENTER, TryCatch #0 {all -> 0x0705, blocks: (B:46:0x0225, B:69:0x02d4, B:53:0x023c, B:55:0x024d, B:56:0x025a, B:58:0x0264, B:60:0x027d, B:61:0x0280, B:63:0x0299, B:66:0x02b8, B:68:0x02d1, B:258:0x06ff, B:259:0x0704), top: B:265:0x0225 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0324 A[Catch: all -> 0x06f7, TRY_LEAVE, TryCatch #1 {all -> 0x06f7, blocks: (B:74:0x030b, B:76:0x0324), top: B:266:0x030b }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0357  */
    /* JADX WARN: Type inference failed for: r1v16, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v14, types: [T] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [jd.a] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v5, types: [jd.a] */
    /* JADX WARN: Type inference failed for: r5v0, types: [int] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [jd.a] */
    /* JADX WARN: Type inference failed for: r5v42, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v48 */
    /* JADX WARN: Type inference failed for: r5v80 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:236:0x06ae -> B:277:0x06b5). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:247:0x06e4 -> B:84:0x0353). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object t(androidx.paging.t0 r18, androidx.paging.y r19, kotlin.coroutines.Continuation<? super dc.w> r20) {
        /*
            Method dump skipped, instructions count: 1842
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.f1.t(androidx.paging.t0, androidx.paging.y, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final u1.a<Key> x(t0 t0Var, Key key) {
        int i10;
        u1.a.b bVar = u1.a.f6095c;
        if (t0Var == t0.REFRESH) {
            i10 = this.f5591c.f6021d;
        } else {
            i10 = this.f5591c.f6018a;
        }
        return bVar.a(t0Var, key, i10, this.f5591c.f6020c);
    }

    private final String y(t0 t0Var, Key key, u1.b<Key, Value> bVar) {
        if (bVar == null) {
            return "End " + t0Var + " with loadkey " + key + ". Load CANCELLED.";
        }
        return "End " + t0Var + " with loadKey " + key + ". Returned " + bVar;
    }

    private final Key z(h1<Key, Value> h1Var, t0 t0Var, int i10, int i11) {
        Object m02;
        Object a02;
        if (i10 != h1Var.j(t0Var) || (h1Var.p().a(t0Var) instanceof q0.a) || i11 >= this.f5591c.f6019b) {
            return null;
        }
        if (t0Var == t0.PREPEND) {
            a02 = ec.b0.a0(h1Var.m());
            return (Key) ((u1.b.C0145b) a02).j();
        }
        m02 = ec.b0.m0(h1Var.m());
        return (Key) ((u1.b.C0145b) m02).i();
    }

    public final void o(o2 o2Var) {
        qc.q.i(o2Var, "viewportHint");
        this.f5596h.d(o2Var);
    }

    public final void p() {
        x1.a.a(this.f5600l, null, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(kotlin.coroutines.Continuation<? super androidx.paging.w1<Key, Value>> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof androidx.paging.f1.f
            if (r0 == 0) goto L13
            r0 = r6
            androidx.paging.f1$f r0 = (androidx.paging.f1.f) r0
            int r1 = r0.f5628s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5628s = r1
            goto L18
        L13:
            androidx.paging.f1$f r0 = new androidx.paging.f1$f
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f5626q
            java.lang.Object r1 = ic.b.d()
            int r2 = r0.f5628s
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 != r4) goto L36
            java.lang.Object r1 = r0.f5625p
            jd.a r1 = (jd.a) r1
            java.lang.Object r2 = r0.f5624m
            androidx.paging.h1$a r2 = (androidx.paging.h1.a) r2
            java.lang.Object r0 = r0.f5623f
            androidx.paging.f1 r0 = (androidx.paging.f1) r0
            dc.n.b(r6)
            goto L58
        L36:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L3e:
            dc.n.b(r6)
            androidx.paging.h1$a<Key, Value> r2 = r5.f5599k
            jd.a r6 = androidx.paging.h1.a.a(r2)
            r0.f5623f = r5
            r0.f5624m = r2
            r0.f5625p = r6
            r0.f5628s = r4
            java.lang.Object r0 = r6.c(r3, r0)
            if (r0 != r1) goto L56
            return r1
        L56:
            r0 = r5
            r1 = r6
        L58:
            androidx.paging.h1 r6 = androidx.paging.h1.a.b(r2)     // Catch: java.lang.Throwable -> L6a
            androidx.paging.z r0 = r0.f5596h     // Catch: java.lang.Throwable -> L6a
            androidx.paging.o2$a r0 = r0.b()     // Catch: java.lang.Throwable -> L6a
            androidx.paging.w1 r6 = r6.g(r0)     // Catch: java.lang.Throwable -> L6a
            r1.d(r3)
            return r6
        L6a:
            r6 = move-exception
            r1.d(r3)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.f1.r(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final dd.g<d1<Value>> u() {
        return this.f5601m;
    }

    public final u1<Key, Value> v() {
        return this.f5590b;
    }

    public final e2<Key, Value> w() {
        return this.f5593e;
    }
}
