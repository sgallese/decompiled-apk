package androidx.paging;

import ad.x1;
import androidx.paging.d1;
import androidx.paging.q0;
import androidx.recyclerview.widget.RecyclerView;
import cd.s;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* compiled from: PageFetcher.kt */
/* loaded from: classes.dex */
public final class e1<Key, Value> {

    /* renamed from: a  reason: collision with root package name */
    private final pc.l<Continuation<? super u1<Key, Value>>, Object> f5507a;

    /* renamed from: b  reason: collision with root package name */
    private final Key f5508b;

    /* renamed from: c  reason: collision with root package name */
    private final r1 f5509c;

    /* renamed from: d  reason: collision with root package name */
    private final k<Boolean> f5510d;

    /* renamed from: e  reason: collision with root package name */
    private final k<dc.w> f5511e;

    /* renamed from: f  reason: collision with root package name */
    private final dd.g<s1<Value>> f5512f;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: PageFetcher.kt */
    /* loaded from: classes.dex */
    public static final class a<Key, Value> {

        /* renamed from: a  reason: collision with root package name */
        private final f1<Key, Value> f5513a;

        /* renamed from: b  reason: collision with root package name */
        private final w1<Key, Value> f5514b;

        /* renamed from: c  reason: collision with root package name */
        private final ad.x1 f5515c;

        public a(f1<Key, Value> f1Var, w1<Key, Value> w1Var, ad.x1 x1Var) {
            qc.q.i(f1Var, "snapshot");
            qc.q.i(x1Var, "job");
            this.f5513a = f1Var;
            this.f5514b = w1Var;
            this.f5515c = x1Var;
        }

        public final ad.x1 a() {
            return this.f5515c;
        }

        public final f1<Key, Value> b() {
            return this.f5513a;
        }

        public final w1<Key, Value> c() {
            return this.f5514b;
        }
    }

    /* compiled from: PageFetcher.kt */
    /* loaded from: classes.dex */
    public final class b<Key, Value> implements b0 {

        /* renamed from: a  reason: collision with root package name */
        private final f1<Key, Value> f5516a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e1<Key, Value> f5517b;

        public b(e1 e1Var, f1<Key, Value> f1Var) {
            qc.q.i(f1Var, "pageFetcherSnapshot");
            this.f5517b = e1Var;
            this.f5516a = f1Var;
        }

        @Override // androidx.paging.b0
        public void a(o2 o2Var) {
            qc.q.i(o2Var, "viewportHint");
            this.f5516a.o(o2Var);
        }
    }

    /* compiled from: PageFetcher.kt */
    /* loaded from: classes.dex */
    public final class c implements m2 {

        /* renamed from: a  reason: collision with root package name */
        private final k<dc.w> f5518a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e1<Key, Value> f5519b;

        public c(e1 e1Var, k<dc.w> kVar) {
            qc.q.i(kVar, "retryEventBus");
            this.f5519b = e1Var;
            this.f5518a = kVar;
        }

        @Override // androidx.paging.m2
        public void a() {
            this.f5519b.l();
        }
    }

    /* compiled from: PageFetcher.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PageFetcher$flow$1", f = "PageFetcher.kt", l = {136}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class d extends kotlin.coroutines.jvm.internal.l implements pc.p<g2<s1<Value>>, Continuation<? super dc.w>, Object> {

        /* renamed from: f  reason: collision with root package name */
        int f5520f;

        /* renamed from: m  reason: collision with root package name */
        private /* synthetic */ Object f5521m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ e1<Key, Value> f5522p;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: PageFetcher.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PageFetcher$flow$1$1", f = "PageFetcher.kt", l = {63, 63}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements pc.p<dd.h<? super Boolean>, Continuation<? super dc.w>, Object> {

            /* renamed from: f  reason: collision with root package name */
            int f5523f;

            /* renamed from: m  reason: collision with root package name */
            private /* synthetic */ Object f5524m;

            /* renamed from: p  reason: collision with root package name */
            final /* synthetic */ d2<Key, Value> f5525p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(d2<Key, Value> d2Var, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f5525p = d2Var;
            }

            @Override // pc.p
            /* renamed from: a  reason: merged with bridge method [inline-methods] */
            public final Object invoke(dd.h<? super Boolean> hVar, Continuation<? super dc.w> continuation) {
                return ((a) create(hVar, continuation)).invokeSuspend(dc.w.f13270a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(this.f5525p, continuation);
                aVar.f5524m = obj;
                return aVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:20:0x0043  */
            /* JADX WARN: Removed duplicated region for block: B:23:0x0052 A[RETURN] */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r7) {
                /*
                    r6 = this;
                    java.lang.Object r0 = ic.b.d()
                    int r1 = r6.f5523f
                    r2 = 0
                    r3 = 2
                    r4 = 1
                    if (r1 == 0) goto L23
                    if (r1 == r4) goto L1b
                    if (r1 != r3) goto L13
                    dc.n.b(r7)
                    goto L53
                L13:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r0)
                    throw r7
                L1b:
                    java.lang.Object r1 = r6.f5524m
                    dd.h r1 = (dd.h) r1
                    dc.n.b(r7)
                    goto L3a
                L23:
                    dc.n.b(r7)
                    java.lang.Object r7 = r6.f5524m
                    r1 = r7
                    dd.h r1 = (dd.h) r1
                    androidx.paging.d2<Key, Value> r7 = r6.f5525p
                    if (r7 == 0) goto L3d
                    r6.f5524m = r1
                    r6.f5523f = r4
                    java.lang.Object r7 = r7.c(r6)
                    if (r7 != r0) goto L3a
                    return r0
                L3a:
                    androidx.paging.c2$a r7 = (androidx.paging.c2.a) r7
                    goto L3e
                L3d:
                    r7 = r2
                L3e:
                    androidx.paging.c2$a r5 = androidx.paging.c2.a.LAUNCH_INITIAL_REFRESH
                    if (r7 != r5) goto L43
                    goto L44
                L43:
                    r4 = 0
                L44:
                    java.lang.Boolean r7 = kotlin.coroutines.jvm.internal.b.a(r4)
                    r6.f5524m = r2
                    r6.f5523f = r3
                    java.lang.Object r7 = r1.emit(r7, r6)
                    if (r7 != r0) goto L53
                    return r0
                L53:
                    dc.w r7 = dc.w.f13270a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.paging.e1.d.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: PageFetcher.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PageFetcher$flow$1$2", f = "PageFetcher.kt", l = {73, 77}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class b extends kotlin.coroutines.jvm.internal.l implements pc.q<a<Key, Value>, Boolean, Continuation<? super a<Key, Value>>, Object> {

            /* renamed from: f  reason: collision with root package name */
            Object f5526f;

            /* renamed from: m  reason: collision with root package name */
            int f5527m;

            /* renamed from: p  reason: collision with root package name */
            /* synthetic */ Object f5528p;

            /* renamed from: q  reason: collision with root package name */
            /* synthetic */ boolean f5529q;

            /* renamed from: r  reason: collision with root package name */
            final /* synthetic */ d2<Key, Value> f5530r;

            /* renamed from: s  reason: collision with root package name */
            final /* synthetic */ e1<Key, Value> f5531s;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: PageFetcher.kt */
            /* loaded from: classes.dex */
            public /* synthetic */ class a extends qc.n implements pc.a<dc.w> {
                a(Object obj) {
                    super(0, obj, e1.class, "refresh", "refresh()V", 0);
                }

                public final void h() {
                    ((e1) this.f21661m).l();
                }

                @Override // pc.a
                public /* bridge */ /* synthetic */ dc.w invoke() {
                    h();
                    return dc.w.f13270a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(d2<Key, Value> d2Var, e1<Key, Value> e1Var, Continuation<? super b> continuation) {
                super(3, continuation);
                this.f5530r = d2Var;
                this.f5531s = e1Var;
            }

            public final Object a(a<Key, Value> aVar, boolean z10, Continuation<? super a<Key, Value>> continuation) {
                b bVar = new b(this.f5530r, this.f5531s, continuation);
                bVar.f5528p = aVar;
                bVar.f5529q = z10;
                return bVar.invokeSuspend(dc.w.f13270a);
            }

            @Override // pc.q
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Boolean bool, Object obj2) {
                return a((a) obj, bool.booleanValue(), (Continuation) obj2);
            }

            /* JADX WARN: Removed duplicated region for block: B:36:0x007c  */
            /* JADX WARN: Removed duplicated region for block: B:37:0x0081  */
            /* JADX WARN: Removed duplicated region for block: B:40:0x0087  */
            /* JADX WARN: Removed duplicated region for block: B:46:0x0093  */
            /* JADX WARN: Removed duplicated region for block: B:58:0x00b5  */
            /* JADX WARN: Removed duplicated region for block: B:59:0x00ba  */
            /* JADX WARN: Removed duplicated region for block: B:61:0x00bd  */
            /* JADX WARN: Removed duplicated region for block: B:69:0x00d3  */
            /* JADX WARN: Removed duplicated region for block: B:71:0x00db  */
            /* JADX WARN: Removed duplicated region for block: B:79:0x010e  */
            /* JADX WARN: Removed duplicated region for block: B:83:0x0119  */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r15) {
                /*
                    Method dump skipped, instructions count: 332
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.paging.e1.d.b.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: PageFetcher.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PageFetcher$flow$1$3$downstreamFlow$1", f = "PageFetcher.kt", l = {}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class c extends kotlin.coroutines.jvm.internal.l implements pc.p<d1<Value>, Continuation<? super dc.w>, Object> {

            /* renamed from: f  reason: collision with root package name */
            int f5532f;

            /* renamed from: m  reason: collision with root package name */
            /* synthetic */ Object f5533m;

            c(Continuation<? super c> continuation) {
                super(2, continuation);
            }

            @Override // pc.p
            /* renamed from: a  reason: merged with bridge method [inline-methods] */
            public final Object invoke(d1<Value> d1Var, Continuation<? super dc.w> continuation) {
                return ((c) create(d1Var, continuation)).invokeSuspend(dc.w.f13270a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
                c cVar = new c(continuation);
                cVar.f5533m = obj;
                return cVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                ic.d.d();
                if (this.f5532f == 0) {
                    dc.n.b(obj);
                    d1 d1Var = (d1) this.f5533m;
                    u0 a10 = v0.a();
                    boolean z10 = false;
                    if (a10 != null && a10.a(2)) {
                        z10 = true;
                    }
                    if (z10) {
                        a10.b(2, "Sent " + d1Var, null);
                    }
                    return dc.w.f13270a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: PageFetcher.kt */
        /* renamed from: androidx.paging.e1$d$d  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public /* synthetic */ class C0125d implements dd.h, qc.k {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ g2<s1<Value>> f5534f;

            C0125d(g2<s1<Value>> g2Var) {
                this.f5534f = g2Var;
            }

            @Override // dd.h
            /* renamed from: a  reason: merged with bridge method [inline-methods] */
            public final Object emit(s1<Value> s1Var, Continuation<? super dc.w> continuation) {
                Object d10;
                Object r10 = this.f5534f.r(s1Var, continuation);
                d10 = ic.d.d();
                if (r10 == d10) {
                    return r10;
                }
                return dc.w.f13270a;
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof dd.h) || !(obj instanceof qc.k)) {
                    return false;
                }
                return qc.q.d(getFunctionDelegate(), ((qc.k) obj).getFunctionDelegate());
            }

            @Override // qc.k
            public final dc.c<?> getFunctionDelegate() {
                return new qc.n(2, this.f5534f, g2.class, "send", "send(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }
        }

        /* compiled from: FlowExt.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PageFetcher$flow$1$invokeSuspend$$inlined$simpleMapLatest$1", f = "PageFetcher.kt", l = {106}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class e extends kotlin.coroutines.jvm.internal.l implements pc.q<dd.h<? super s1<Value>>, a<Key, Value>, Continuation<? super dc.w>, Object> {

            /* renamed from: f  reason: collision with root package name */
            int f5535f;

            /* renamed from: m  reason: collision with root package name */
            private /* synthetic */ Object f5536m;

            /* renamed from: p  reason: collision with root package name */
            /* synthetic */ Object f5537p;

            /* renamed from: q  reason: collision with root package name */
            final /* synthetic */ e1 f5538q;

            /* renamed from: r  reason: collision with root package name */
            final /* synthetic */ d2 f5539r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(Continuation continuation, e1 e1Var, d2 d2Var) {
                super(3, continuation);
                this.f5538q = e1Var;
                this.f5539r = d2Var;
            }

            public final Object invoke(dd.h<? super s1<Value>> hVar, a<Key, Value> aVar, Continuation<? super dc.w> continuation) {
                e eVar = new e(continuation, this.f5538q, this.f5539r);
                eVar.f5536m = hVar;
                eVar.f5537p = aVar;
                return eVar.invokeSuspend(dc.w.f13270a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object d10;
                d10 = ic.d.d();
                int i10 = this.f5535f;
                if (i10 != 0) {
                    if (i10 == 1) {
                        dc.n.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    dc.n.b(obj);
                    dd.h hVar = (dd.h) this.f5536m;
                    a aVar = (a) this.f5537p;
                    dd.g J = dd.i.J(this.f5538q.j(aVar.b(), aVar.a(), this.f5539r), new c(null));
                    e1 e1Var = this.f5538q;
                    s1 s1Var = new s1(J, new c(e1Var, e1Var.f5511e), new b(this.f5538q, aVar.b()), null, 8, null);
                    this.f5535f = 1;
                    if (hVar.emit(s1Var, this) == d10) {
                        return d10;
                    }
                }
                return dc.w.f13270a;
            }

            @Override // pc.q
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Continuation<? super dc.w> continuation) {
                return invoke((dd.h) ((dd.h) obj), obj2, continuation);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(c2<Key, Value> c2Var, e1<Key, Value> e1Var, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f5522p = e1Var;
        }

        @Override // pc.p
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final Object invoke(g2<s1<Value>> g2Var, Continuation<? super dc.w> continuation) {
            return ((d) create(g2Var, continuation)).invokeSuspend(dc.w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
            d dVar = new d(null, this.f5522p, continuation);
            dVar.f5521m = obj;
            return dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d10;
            d10 = ic.d.d();
            int i10 = this.f5520f;
            if (i10 != 0) {
                if (i10 == 1) {
                    dc.n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                dc.n.b(obj);
                g2 g2Var = (g2) this.f5521m;
                dd.g d11 = x.d(dd.i.u(x.c(dd.i.K(((e1) this.f5522p).f5510d.a(), new a(null, null)), null, new b(null, this.f5522p, null))), new e(null, this.f5522p, null));
                C0125d c0125d = new C0125d(g2Var);
                this.f5520f = 1;
                if (d11.collect(c0125d, this) == d10) {
                    return d10;
                }
            }
            return dc.w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PageFetcher.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PageFetcher", f = "PageFetcher.kt", l = {210}, m = "generateNewPagingSource")
    /* loaded from: classes.dex */
    public static final class e extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: f  reason: collision with root package name */
        Object f5540f;

        /* renamed from: m  reason: collision with root package name */
        Object f5541m;

        /* renamed from: p  reason: collision with root package name */
        /* synthetic */ Object f5542p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ e1<Key, Value> f5543q;

        /* renamed from: r  reason: collision with root package name */
        int f5544r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(e1<Key, Value> e1Var, Continuation<? super e> continuation) {
            super(continuation);
            this.f5543q = e1Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f5542p = obj;
            this.f5544r |= RecyclerView.UNDEFINED_DURATION;
            return this.f5543q.h(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PageFetcher.kt */
    /* loaded from: classes.dex */
    public /* synthetic */ class f extends qc.n implements pc.a<dc.w> {
        f(Object obj) {
            super(0, obj, e1.class, "invalidate", "invalidate()V", 0);
        }

        public final void h() {
            ((e1) this.f21661m).k();
        }

        @Override // pc.a
        public /* bridge */ /* synthetic */ dc.w invoke() {
            h();
            return dc.w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PageFetcher.kt */
    /* loaded from: classes.dex */
    public /* synthetic */ class g extends qc.n implements pc.a<dc.w> {
        g(Object obj) {
            super(0, obj, e1.class, "invalidate", "invalidate()V", 0);
        }

        public final void h() {
            ((e1) this.f21661m).k();
        }

        @Override // pc.a
        public /* bridge */ /* synthetic */ dc.w invoke() {
            h();
            return dc.w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PageFetcher.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PageFetcher$injectRemoteEvents$1", f = "PageFetcher.kt", l = {203}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class h extends kotlin.coroutines.jvm.internal.l implements pc.p<g2<d1<Value>>, Continuation<? super dc.w>, Object> {

        /* renamed from: f  reason: collision with root package name */
        int f5545f;

        /* renamed from: m  reason: collision with root package name */
        private /* synthetic */ Object f5546m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ d2<Key, Value> f5547p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ f1<Key, Value> f5548q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ y0 f5549r;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: PageFetcher.kt */
        /* loaded from: classes.dex */
        public static final class a<T> implements dd.h {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ g2<d1<Value>> f5550f;

            a(g2<d1<Value>> g2Var) {
                this.f5550f = g2Var;
            }

            @Override // dd.h
            /* renamed from: a  reason: merged with bridge method [inline-methods] */
            public final Object emit(d1<Value> d1Var, Continuation<? super dc.w> continuation) {
                Object d10;
                Object r10 = this.f5550f.r(d1Var, continuation);
                d10 = ic.d.d();
                if (r10 == d10) {
                    return r10;
                }
                return dc.w.f13270a;
            }
        }

        /* compiled from: FlowExt.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1", f = "PageFetcher.kt", l = {162}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class b extends kotlin.coroutines.jvm.internal.l implements pc.p<g2<d1<Value>>, Continuation<? super dc.w>, Object> {

            /* renamed from: f  reason: collision with root package name */
            int f5551f;

            /* renamed from: m  reason: collision with root package name */
            private /* synthetic */ Object f5552m;

            /* renamed from: p  reason: collision with root package name */
            final /* synthetic */ dd.g f5553p;

            /* renamed from: q  reason: collision with root package name */
            final /* synthetic */ dd.g f5554q;

            /* renamed from: r  reason: collision with root package name */
            final /* synthetic */ y0 f5555r;

            /* compiled from: FlowExt.kt */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1$1", f = "PageFetcher.kt", l = {142}, m = "invokeSuspend")
            /* loaded from: classes.dex */
            public static final class a extends kotlin.coroutines.jvm.internal.l implements pc.r<s0, d1<Value>, i, Continuation<? super dc.w>, Object> {

                /* renamed from: f  reason: collision with root package name */
                int f5556f;

                /* renamed from: m  reason: collision with root package name */
                /* synthetic */ Object f5557m;

                /* renamed from: p  reason: collision with root package name */
                /* synthetic */ Object f5558p;

                /* renamed from: q  reason: collision with root package name */
                /* synthetic */ Object f5559q;

                /* renamed from: r  reason: collision with root package name */
                final /* synthetic */ g2<d1<Value>> f5560r;

                /* renamed from: s  reason: collision with root package name */
                final /* synthetic */ y0 f5561s;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(g2 g2Var, Continuation continuation, y0 y0Var) {
                    super(4, continuation);
                    this.f5561s = y0Var;
                    this.f5560r = g2Var;
                }

                @Override // pc.r
                /* renamed from: a  reason: merged with bridge method [inline-methods] */
                public final Object invoke(s0 s0Var, d1<Value> d1Var, i iVar, Continuation<? super dc.w> continuation) {
                    a aVar = new a(this.f5560r, continuation, this.f5561s);
                    aVar.f5557m = s0Var;
                    aVar.f5558p = d1Var;
                    aVar.f5559q = iVar;
                    return aVar.invokeSuspend(dc.w.f13270a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object d10;
                    d10 = ic.d.d();
                    int i10 = this.f5556f;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            dc.n.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        dc.n.b(obj);
                        Object obj2 = this.f5557m;
                        Object obj3 = this.f5558p;
                        i iVar = (i) this.f5559q;
                        g2<d1<Value>> g2Var = this.f5560r;
                        Object obj4 = (d1) obj3;
                        s0 s0Var = (s0) obj2;
                        if (iVar != i.RECEIVER) {
                            if (obj4 instanceof d1.b) {
                                d1.b bVar = (d1.b) obj4;
                                this.f5561s.b(bVar.i());
                                obj4 = d1.b.c(bVar, null, null, 0, 0, bVar.i(), s0Var, 15, null);
                            } else if (obj4 instanceof d1.a) {
                                this.f5561s.c(((d1.a) obj4).a(), q0.c.f6001b.b());
                            } else if (obj4 instanceof d1.c) {
                                d1.c cVar = (d1.c) obj4;
                                this.f5561s.b(cVar.b());
                                obj4 = new d1.c(cVar.b(), s0Var);
                            } else if (obj4 instanceof d1.d) {
                                throw new IllegalStateException("Paging generated an event to display a static list that\n originated from a paginated source. If you see this\n exception, it is most likely a bug in the library.\n Please file a bug so we can fix it at:\n https://issuetracker.google.com/issues/new?component=413106");
                            } else {
                                throw new NoWhenBranchMatchedException();
                            }
                        } else {
                            obj4 = new d1.c(this.f5561s.d(), s0Var);
                        }
                        this.f5556f = 1;
                        if (g2Var.r(obj4, this) == d10) {
                            return d10;
                        }
                    }
                    return dc.w.f13270a;
                }
            }

            /* compiled from: FlowExt.kt */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.FlowExtKt$combineWithoutBatching$2$1$1", f = "FlowExt.kt", l = {148}, m = "invokeSuspend")
            /* renamed from: androidx.paging.e1$h$b$b  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0126b extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super dc.w>, Object> {

                /* renamed from: f  reason: collision with root package name */
                int f5562f;

                /* renamed from: m  reason: collision with root package name */
                final /* synthetic */ g2<d1<Value>> f5563m;

                /* renamed from: p  reason: collision with root package name */
                final /* synthetic */ dd.g f5564p;

                /* renamed from: q  reason: collision with root package name */
                final /* synthetic */ AtomicInteger f5565q;

                /* renamed from: r  reason: collision with root package name */
                final /* synthetic */ n2 f5566r;

                /* renamed from: s  reason: collision with root package name */
                final /* synthetic */ int f5567s;

                /* compiled from: FlowExt.kt */
                /* renamed from: androidx.paging.e1$h$b$b$a */
                /* loaded from: classes.dex */
                public static final class a<T> implements dd.h {

                    /* renamed from: f  reason: collision with root package name */
                    final /* synthetic */ n2 f5568f;

                    /* renamed from: m  reason: collision with root package name */
                    final /* synthetic */ int f5569m;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* compiled from: FlowExt.kt */
                    /* renamed from: androidx.paging.e1$h$b$b$a$a  reason: collision with other inner class name */
                    /* loaded from: classes.dex */
                    public static final class C0127a extends kotlin.coroutines.jvm.internal.d {

                        /* renamed from: f  reason: collision with root package name */
                        /* synthetic */ Object f5570f;

                        /* renamed from: m  reason: collision with root package name */
                        int f5571m;

                        C0127a(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.a
                        public final Object invokeSuspend(Object obj) {
                            this.f5570f = obj;
                            this.f5571m |= RecyclerView.UNDEFINED_DURATION;
                            return a.this.emit(null, this);
                        }
                    }

                    public a(n2 n2Var, int i10) {
                        this.f5568f = n2Var;
                        this.f5569m = i10;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
                    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
                    /* JADX WARN: Removed duplicated region for block: B:21:0x0050 A[RETURN] */
                    @Override // dd.h
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation<? super dc.w> r7) {
                        /*
                            r5 = this;
                            boolean r0 = r7 instanceof androidx.paging.e1.h.b.C0126b.a.C0127a
                            if (r0 == 0) goto L13
                            r0 = r7
                            androidx.paging.e1$h$b$b$a$a r0 = (androidx.paging.e1.h.b.C0126b.a.C0127a) r0
                            int r1 = r0.f5571m
                            r2 = -2147483648(0xffffffff80000000, float:-0.0)
                            r3 = r1 & r2
                            if (r3 == 0) goto L13
                            int r1 = r1 - r2
                            r0.f5571m = r1
                            goto L18
                        L13:
                            androidx.paging.e1$h$b$b$a$a r0 = new androidx.paging.e1$h$b$b$a$a
                            r0.<init>(r7)
                        L18:
                            java.lang.Object r7 = r0.f5570f
                            java.lang.Object r1 = ic.b.d()
                            int r2 = r0.f5571m
                            r3 = 2
                            r4 = 1
                            if (r2 == 0) goto L38
                            if (r2 == r4) goto L34
                            if (r2 != r3) goto L2c
                            dc.n.b(r7)
                            goto L51
                        L2c:
                            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                            r6.<init>(r7)
                            throw r6
                        L34:
                            dc.n.b(r7)
                            goto L48
                        L38:
                            dc.n.b(r7)
                            androidx.paging.n2 r7 = r5.f5568f
                            int r2 = r5.f5569m
                            r0.f5571m = r4
                            java.lang.Object r6 = r7.a(r2, r6, r0)
                            if (r6 != r1) goto L48
                            return r1
                        L48:
                            r0.f5571m = r3
                            java.lang.Object r6 = ad.d3.a(r0)
                            if (r6 != r1) goto L51
                            return r1
                        L51:
                            dc.w r6 = dc.w.f13270a
                            return r6
                        */
                        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.e1.h.b.C0126b.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0126b(dd.g gVar, AtomicInteger atomicInteger, g2 g2Var, n2 n2Var, int i10, Continuation continuation) {
                    super(2, continuation);
                    this.f5564p = gVar;
                    this.f5565q = atomicInteger;
                    this.f5566r = n2Var;
                    this.f5567s = i10;
                    this.f5563m = g2Var;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
                    return new C0126b(this.f5564p, this.f5565q, this.f5563m, this.f5566r, this.f5567s, continuation);
                }

                @Override // pc.p
                public final Object invoke(ad.k0 k0Var, Continuation<? super dc.w> continuation) {
                    return ((C0126b) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object d10;
                    AtomicInteger atomicInteger;
                    d10 = ic.d.d();
                    int i10 = this.f5562f;
                    try {
                        if (i10 != 0) {
                            if (i10 == 1) {
                                dc.n.b(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            dc.n.b(obj);
                            dd.g gVar = this.f5564p;
                            a aVar = new a(this.f5566r, this.f5567s);
                            this.f5562f = 1;
                            if (gVar.collect(aVar, this) == d10) {
                                return d10;
                            }
                        }
                        if (atomicInteger.decrementAndGet() == 0) {
                            s.a.a(this.f5563m, null, 1, null);
                        }
                        return dc.w.f13270a;
                    } finally {
                        if (this.f5565q.decrementAndGet() == 0) {
                            s.a.a(this.f5563m, null, 1, null);
                        }
                    }
                }
            }

            /* compiled from: FlowExt.kt */
            /* loaded from: classes.dex */
            public static final class c extends qc.r implements pc.a<dc.w> {

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ ad.y f5573f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public c(ad.y yVar) {
                    super(0);
                    this.f5573f = yVar;
                }

                @Override // pc.a
                public /* bridge */ /* synthetic */ dc.w invoke() {
                    invoke2();
                    return dc.w.f13270a;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    x1.a.a(this.f5573f, null, 1, null);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(dd.g gVar, dd.g gVar2, Continuation continuation, y0 y0Var) {
                super(2, continuation);
                this.f5553p = gVar;
                this.f5554q = gVar2;
                this.f5555r = y0Var;
            }

            @Override // pc.p
            /* renamed from: a  reason: merged with bridge method [inline-methods] */
            public final Object invoke(g2<d1<Value>> g2Var, Continuation<? super dc.w> continuation) {
                return ((b) create(g2Var, continuation)).invokeSuspend(dc.w.f13270a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
                b bVar = new b(this.f5553p, this.f5554q, continuation, this.f5555r);
                bVar.f5552m = obj;
                return bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object d10;
                ad.y b10;
                d10 = ic.d.d();
                int i10 = this.f5551f;
                if (i10 != 0) {
                    if (i10 == 1) {
                        dc.n.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    dc.n.b(obj);
                    g2 g2Var = (g2) this.f5552m;
                    AtomicInteger atomicInteger = new AtomicInteger(2);
                    n2 n2Var = new n2(new a(g2Var, null, this.f5555r));
                    b10 = ad.c2.b(null, 1, null);
                    dd.g[] gVarArr = {this.f5553p, this.f5554q};
                    int i11 = 0;
                    int i12 = 0;
                    while (i12 < 2) {
                        ad.i.d(g2Var, b10, null, new C0126b(gVarArr[i12], atomicInteger, g2Var, n2Var, i11, null), 2, null);
                        i12++;
                        i11++;
                    }
                    c cVar = new c(b10);
                    this.f5551f = 1;
                    if (g2Var.j(cVar, this) == d10) {
                        return d10;
                    }
                }
                return dc.w.f13270a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(d2<Key, Value> d2Var, f1<Key, Value> f1Var, y0 y0Var, Continuation<? super h> continuation) {
            super(2, continuation);
            this.f5547p = d2Var;
            this.f5548q = f1Var;
            this.f5549r = y0Var;
        }

        @Override // pc.p
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final Object invoke(g2<d1<Value>> g2Var, Continuation<? super dc.w> continuation) {
            return ((h) create(g2Var, continuation)).invokeSuspend(dc.w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
            h hVar = new h(this.f5547p, this.f5548q, this.f5549r, continuation);
            hVar.f5546m = obj;
            return hVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d10;
            d10 = ic.d.d();
            int i10 = this.f5545f;
            if (i10 != 0) {
                if (i10 == 1) {
                    dc.n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                dc.n.b(obj);
                g2 g2Var = (g2) this.f5546m;
                dd.g a10 = f2.a(new b(this.f5547p.getState(), this.f5548q.u(), null, this.f5549r));
                a aVar = new a(g2Var);
                this.f5545f = 1;
                if (a10.collect(aVar, this) == d10) {
                    return d10;
                }
            }
            return dc.w.f13270a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e1(pc.l<? super Continuation<? super u1<Key, Value>>, ? extends Object> lVar, Key key, r1 r1Var, c2<Key, Value> c2Var) {
        qc.q.i(lVar, "pagingSourceFactory");
        qc.q.i(r1Var, "config");
        this.f5507a = lVar;
        this.f5508b = key;
        this.f5509c = r1Var;
        qc.h hVar = null;
        int i10 = 1;
        this.f5510d = new k<>(hVar, i10, hVar);
        this.f5511e = new k<>(hVar, i10, hVar);
        this.f5512f = f2.a(new d(c2Var, this, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(androidx.paging.u1<Key, Value> r5, kotlin.coroutines.Continuation<? super androidx.paging.u1<Key, Value>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof androidx.paging.e1.e
            if (r0 == 0) goto L13
            r0 = r6
            androidx.paging.e1$e r0 = (androidx.paging.e1.e) r0
            int r1 = r0.f5544r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5544r = r1
            goto L18
        L13:
            androidx.paging.e1$e r0 = new androidx.paging.e1$e
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f5542p
            java.lang.Object r1 = ic.b.d()
            int r2 = r0.f5544r
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r5 = r0.f5541m
            androidx.paging.u1 r5 = (androidx.paging.u1) r5
            java.lang.Object r0 = r0.f5540f
            androidx.paging.e1 r0 = (androidx.paging.e1) r0
            dc.n.b(r6)
            goto L4c
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L39:
            dc.n.b(r6)
            pc.l<kotlin.coroutines.Continuation<? super androidx.paging.u1<Key, Value>>, java.lang.Object> r6 = r4.f5507a
            r0.f5540f = r4
            r0.f5541m = r5
            r0.f5544r = r3
            java.lang.Object r6 = r6.invoke(r0)
            if (r6 != r1) goto L4b
            return r1
        L4b:
            r0 = r4
        L4c:
            androidx.paging.u1 r6 = (androidx.paging.u1) r6
            boolean r1 = r6 instanceof androidx.paging.l0
            if (r1 == 0) goto L5c
            r1 = r6
            androidx.paging.l0 r1 = (androidx.paging.l0) r1
            androidx.paging.r1 r2 = r0.f5509c
            int r2 = r2.f6018a
            r1.c(r2)
        L5c:
            r1 = 0
            if (r6 == r5) goto L61
            r2 = 1
            goto L62
        L61:
            r2 = 0
        L62:
            if (r2 == 0) goto La2
            androidx.paging.e1$f r2 = new androidx.paging.e1$f
            r2.<init>(r0)
            r6.registerInvalidatedCallback(r2)
            if (r5 == 0) goto L76
            androidx.paging.e1$g r2 = new androidx.paging.e1$g
            r2.<init>(r0)
            r5.unregisterInvalidatedCallback(r2)
        L76:
            if (r5 == 0) goto L7b
            r5.invalidate()
        L7b:
            androidx.paging.u0 r5 = androidx.paging.v0.a()
            r0 = 3
            if (r5 == 0) goto L89
            boolean r2 = r5.a(r0)
            if (r2 != r3) goto L89
            goto L8a
        L89:
            r3 = 0
        L8a:
            if (r3 == 0) goto La1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Generated new PagingSource "
            r1.append(r2)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            r2 = 0
            r5.b(r0, r1, r2)
        La1:
            return r6
        La2:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "An instance of PagingSource was re-used when Pager expected to create a new\ninstance. Ensure that the pagingSourceFactory passed to Pager always returns a\nnew instance of PagingSource."
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.e1.h(androidx.paging.u1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final dd.g<d1<Value>> j(f1<Key, Value> f1Var, ad.x1 x1Var, d2<Key, Value> d2Var) {
        if (d2Var == null) {
            return f1Var.u();
        }
        return androidx.paging.g.a(x1Var, new h(d2Var, f1Var, new y0(), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k() {
        this.f5510d.b(Boolean.FALSE);
    }

    public final dd.g<s1<Value>> i() {
        return this.f5512f;
    }

    public final void l() {
        this.f5510d.b(Boolean.TRUE);
    }
}
