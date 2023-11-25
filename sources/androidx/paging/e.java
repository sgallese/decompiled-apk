package androidx.paging;

import ad.x1;
import androidx.paging.d1;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.coroutines.Continuation;

/* compiled from: CachedPageEventFlow.kt */
/* loaded from: classes.dex */
public final class e<T> {

    /* renamed from: a  reason: collision with root package name */
    private final v<T> f5471a;

    /* renamed from: b  reason: collision with root package name */
    private final dd.w<ec.g0<d1<T>>> f5472b;

    /* renamed from: c  reason: collision with root package name */
    private final dd.b0<ec.g0<d1<T>>> f5473c;

    /* renamed from: d  reason: collision with root package name */
    private final ad.x1 f5474d;

    /* renamed from: e  reason: collision with root package name */
    private final dd.g<d1<T>> f5475e;

    /* compiled from: CachedPageEventFlow.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.CachedPageEventFlow$downstreamFlow$1", f = "CachedPageEventFlow.kt", l = {103}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements pc.p<dd.h<? super d1<T>>, Continuation<? super dc.w>, Object> {

        /* renamed from: f  reason: collision with root package name */
        int f5476f;

        /* renamed from: m  reason: collision with root package name */
        private /* synthetic */ Object f5477m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ e<T> f5478p;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: CachedPageEventFlow.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.CachedPageEventFlow$downstreamFlow$1$1", f = "CachedPageEventFlow.kt", l = {}, m = "invokeSuspend")
        /* renamed from: androidx.paging.e$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0122a extends kotlin.coroutines.jvm.internal.l implements pc.p<ec.g0<? extends d1<T>>, Continuation<? super Boolean>, Object> {

            /* renamed from: f  reason: collision with root package name */
            int f5479f;

            /* renamed from: m  reason: collision with root package name */
            /* synthetic */ Object f5480m;

            C0122a(Continuation<? super C0122a> continuation) {
                super(2, continuation);
            }

            @Override // pc.p
            /* renamed from: a  reason: merged with bridge method [inline-methods] */
            public final Object invoke(ec.g0<? extends d1<T>> g0Var, Continuation<? super Boolean> continuation) {
                return ((C0122a) create(g0Var, continuation)).invokeSuspend(dc.w.f13270a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
                C0122a c0122a = new C0122a(continuation);
                c0122a.f5480m = obj;
                return c0122a;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                boolean z10;
                ic.d.d();
                if (this.f5479f == 0) {
                    dc.n.b(obj);
                    if (((ec.g0) this.f5480m) != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    return kotlin.coroutines.jvm.internal.b.a(z10);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: CachedPageEventFlow.kt */
        /* loaded from: classes.dex */
        public static final class b<T> implements dd.h {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ qc.d0 f5481f;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ dd.h<d1<T>> f5482m;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: CachedPageEventFlow.kt */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.CachedPageEventFlow$downstreamFlow$1$2", f = "CachedPageEventFlow.kt", l = {106}, m = "emit")
            /* renamed from: androidx.paging.e$a$b$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0123a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: f  reason: collision with root package name */
                Object f5483f;

                /* renamed from: m  reason: collision with root package name */
                Object f5484m;

                /* renamed from: p  reason: collision with root package name */
                /* synthetic */ Object f5485p;

                /* renamed from: q  reason: collision with root package name */
                final /* synthetic */ b<T> f5486q;

                /* renamed from: r  reason: collision with root package name */
                int f5487r;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C0123a(b<? super T> bVar, Continuation<? super C0123a> continuation) {
                    super(continuation);
                    this.f5486q = bVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f5485p = obj;
                    this.f5487r |= RecyclerView.UNDEFINED_DURATION;
                    return this.f5486q.emit(null, this);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            b(qc.d0 d0Var, dd.h<? super d1<T>> hVar) {
                this.f5481f = d0Var;
                this.f5482m = hVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
            @Override // dd.h
            /* renamed from: a  reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(ec.g0<? extends androidx.paging.d1<T>> r5, kotlin.coroutines.Continuation<? super dc.w> r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof androidx.paging.e.a.b.C0123a
                    if (r0 == 0) goto L13
                    r0 = r6
                    androidx.paging.e$a$b$a r0 = (androidx.paging.e.a.b.C0123a) r0
                    int r1 = r0.f5487r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f5487r = r1
                    goto L18
                L13:
                    androidx.paging.e$a$b$a r0 = new androidx.paging.e$a$b$a
                    r0.<init>(r4, r6)
                L18:
                    java.lang.Object r6 = r0.f5485p
                    java.lang.Object r1 = ic.b.d()
                    int r2 = r0.f5487r
                    r3 = 1
                    if (r2 == 0) goto L39
                    if (r2 != r3) goto L31
                    java.lang.Object r5 = r0.f5484m
                    ec.g0 r5 = (ec.g0) r5
                    java.lang.Object r0 = r0.f5483f
                    androidx.paging.e$a$b r0 = (androidx.paging.e.a.b) r0
                    dc.n.b(r6)
                    goto L5d
                L31:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L39:
                    dc.n.b(r6)
                    qc.q.f(r5)
                    int r6 = r5.a()
                    qc.d0 r2 = r4.f5481f
                    int r2 = r2.f21667f
                    if (r6 <= r2) goto L65
                    dd.h<androidx.paging.d1<T>> r6 = r4.f5482m
                    java.lang.Object r2 = r5.b()
                    r0.f5483f = r4
                    r0.f5484m = r5
                    r0.f5487r = r3
                    java.lang.Object r6 = r6.emit(r2, r0)
                    if (r6 != r1) goto L5c
                    return r1
                L5c:
                    r0 = r4
                L5d:
                    qc.d0 r6 = r0.f5481f
                    int r5 = r5.a()
                    r6.f21667f = r5
                L65:
                    dc.w r5 = dc.w.f13270a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.paging.e.a.b.emit(ec.g0, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(e<T> eVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f5478p = eVar;
        }

        @Override // pc.p
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final Object invoke(dd.h<? super d1<T>> hVar, Continuation<? super dc.w> continuation) {
            return ((a) create(hVar, continuation)).invokeSuspend(dc.w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
            a aVar = new a(this.f5478p, continuation);
            aVar.f5477m = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d10;
            d10 = ic.d.d();
            int i10 = this.f5476f;
            if (i10 != 0) {
                if (i10 == 1) {
                    dc.n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                dc.n.b(obj);
                dd.h hVar = (dd.h) this.f5477m;
                qc.d0 d0Var = new qc.d0();
                d0Var.f21667f = RecyclerView.UNDEFINED_DURATION;
                dd.g Q = dd.i.Q(((e) this.f5478p).f5473c, new C0122a(null));
                b bVar = new b(d0Var, hVar);
                this.f5476f = 1;
                if (Q.collect(bVar, this) == d10) {
                    return d10;
                }
            }
            return dc.w.f13270a;
        }
    }

    /* compiled from: CachedPageEventFlow.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.CachedPageEventFlow$job$1", f = "CachedPageEventFlow.kt", l = {77}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class b extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super dc.w>, Object> {

        /* renamed from: f  reason: collision with root package name */
        int f5488f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ dd.g<d1<T>> f5489m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ e<T> f5490p;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: CachedPageEventFlow.kt */
        /* loaded from: classes.dex */
        public static final class a<T> implements dd.h {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ e<T> f5491f;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: CachedPageEventFlow.kt */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.CachedPageEventFlow$job$1$1", f = "CachedPageEventFlow.kt", l = {78, 79}, m = "emit")
            /* renamed from: androidx.paging.e$b$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0124a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: f  reason: collision with root package name */
                Object f5492f;

                /* renamed from: m  reason: collision with root package name */
                Object f5493m;

                /* renamed from: p  reason: collision with root package name */
                /* synthetic */ Object f5494p;

                /* renamed from: q  reason: collision with root package name */
                final /* synthetic */ a<T> f5495q;

                /* renamed from: r  reason: collision with root package name */
                int f5496r;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C0124a(a<? super T> aVar, Continuation<? super C0124a> continuation) {
                    super(continuation);
                    this.f5495q = aVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f5494p = obj;
                    this.f5496r |= RecyclerView.UNDEFINED_DURATION;
                    return this.f5495q.emit(null, this);
                }
            }

            a(e<T> eVar) {
                this.f5491f = eVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
            /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
            /* JADX WARN: Removed duplicated region for block: B:22:0x006a A[RETURN] */
            @Override // dd.h
            /* renamed from: a  reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(ec.g0<? extends androidx.paging.d1<T>> r6, kotlin.coroutines.Continuation<? super dc.w> r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof androidx.paging.e.b.a.C0124a
                    if (r0 == 0) goto L13
                    r0 = r7
                    androidx.paging.e$b$a$a r0 = (androidx.paging.e.b.a.C0124a) r0
                    int r1 = r0.f5496r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f5496r = r1
                    goto L18
                L13:
                    androidx.paging.e$b$a$a r0 = new androidx.paging.e$b$a$a
                    r0.<init>(r5, r7)
                L18:
                    java.lang.Object r7 = r0.f5494p
                    java.lang.Object r1 = ic.b.d()
                    int r2 = r0.f5496r
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L40
                    if (r2 == r4) goto L34
                    if (r2 != r3) goto L2c
                    dc.n.b(r7)
                    goto L6b
                L2c:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L34:
                    java.lang.Object r6 = r0.f5493m
                    ec.g0 r6 = (ec.g0) r6
                    java.lang.Object r2 = r0.f5492f
                    androidx.paging.e$b$a r2 = (androidx.paging.e.b.a) r2
                    dc.n.b(r7)
                    goto L57
                L40:
                    dc.n.b(r7)
                    androidx.paging.e<T> r7 = r5.f5491f
                    dd.w r7 = androidx.paging.e.b(r7)
                    r0.f5492f = r5
                    r0.f5493m = r6
                    r0.f5496r = r4
                    java.lang.Object r7 = r7.emit(r6, r0)
                    if (r7 != r1) goto L56
                    return r1
                L56:
                    r2 = r5
                L57:
                    androidx.paging.e<T> r7 = r2.f5491f
                    androidx.paging.v r7 = androidx.paging.e.c(r7)
                    r2 = 0
                    r0.f5492f = r2
                    r0.f5493m = r2
                    r0.f5496r = r3
                    java.lang.Object r6 = r7.c(r6, r0)
                    if (r6 != r1) goto L6b
                    return r1
                L6b:
                    dc.w r6 = dc.w.f13270a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.paging.e.b.a.emit(ec.g0, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(dd.g<? extends d1<T>> gVar, e<T> eVar, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f5489m = gVar;
            this.f5490p = eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
            return new b(this.f5489m, this.f5490p, continuation);
        }

        @Override // pc.p
        public final Object invoke(ad.k0 k0Var, Continuation<? super dc.w> continuation) {
            return ((b) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d10;
            d10 = ic.d.d();
            int i10 = this.f5488f;
            if (i10 != 0) {
                if (i10 == 1) {
                    dc.n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                dc.n.b(obj);
                dd.g S = dd.i.S(this.f5489m);
                a aVar = new a(this.f5490p);
                this.f5488f = 1;
                if (S.collect(aVar, this) == d10) {
                    return d10;
                }
            }
            return dc.w.f13270a;
        }
    }

    /* compiled from: CachedPageEventFlow.kt */
    /* loaded from: classes.dex */
    static final class c extends qc.r implements pc.l<Throwable, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ e<T> f5497f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(e<T> eVar) {
            super(1);
            this.f5497f = eVar;
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ dc.w invoke(Throwable th) {
            invoke2(th);
            return dc.w.f13270a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            ((e) this.f5497f).f5472b.e(null);
        }
    }

    /* compiled from: CachedPageEventFlow.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.CachedPageEventFlow$sharedForDownstream$1", f = "CachedPageEventFlow.kt", l = {63, 68}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class d extends kotlin.coroutines.jvm.internal.l implements pc.p<dd.h<? super ec.g0<? extends d1<T>>>, Continuation<? super dc.w>, Object> {

        /* renamed from: f  reason: collision with root package name */
        Object f5498f;

        /* renamed from: m  reason: collision with root package name */
        int f5499m;

        /* renamed from: p  reason: collision with root package name */
        private /* synthetic */ Object f5500p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ e<T> f5501q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(e<T> eVar, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f5501q = eVar;
        }

        @Override // pc.p
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final Object invoke(dd.h<? super ec.g0<? extends d1<T>>> hVar, Continuation<? super dc.w> continuation) {
            return ((d) create(hVar, continuation)).invokeSuspend(dc.w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
            d dVar = new d(this.f5501q, continuation);
            dVar.f5500p = obj;
            return dVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x005d  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = ic.b.d()
                int r1 = r5.f5499m
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L2a
                if (r1 == r3) goto L22
                if (r1 != r2) goto L1a
                java.lang.Object r1 = r5.f5498f
                java.util.Iterator r1 = (java.util.Iterator) r1
                java.lang.Object r3 = r5.f5500p
                dd.h r3 = (dd.h) r3
                dc.n.b(r6)
                goto L56
            L1a:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L22:
                java.lang.Object r1 = r5.f5500p
                dd.h r1 = (dd.h) r1
                dc.n.b(r6)
                goto L43
            L2a:
                dc.n.b(r6)
                java.lang.Object r6 = r5.f5500p
                r1 = r6
                dd.h r1 = (dd.h) r1
                androidx.paging.e<T> r6 = r5.f5501q
                androidx.paging.v r6 = androidx.paging.e.c(r6)
                r5.f5500p = r1
                r5.f5499m = r3
                java.lang.Object r6 = r6.b(r5)
                if (r6 != r0) goto L43
                return r0
            L43:
                java.util.List r6 = (java.util.List) r6
                androidx.paging.e<T> r3 = r5.f5501q
                ad.x1 r3 = androidx.paging.e.a(r3)
                r3.start()
                java.lang.Iterable r6 = (java.lang.Iterable) r6
                java.util.Iterator r6 = r6.iterator()
                r3 = r1
                r1 = r6
            L56:
                r6 = r5
            L57:
                boolean r4 = r1.hasNext()
                if (r4 == 0) goto L70
                java.lang.Object r4 = r1.next()
                ec.g0 r4 = (ec.g0) r4
                r6.f5500p = r3
                r6.f5498f = r1
                r6.f5499m = r2
                java.lang.Object r4 = r3.emit(r4, r6)
                if (r4 != r0) goto L57
                return r0
            L70:
                dc.w r6 = dc.w.f13270a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.e.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public e(dd.g<? extends d1<T>> gVar, ad.k0 k0Var) {
        ad.x1 d10;
        qc.q.i(gVar, "src");
        qc.q.i(k0Var, "scope");
        this.f5471a = new v<>();
        dd.w<ec.g0<d1<T>>> a10 = dd.d0.a(1, Integer.MAX_VALUE, cd.a.SUSPEND);
        this.f5472b = a10;
        this.f5473c = dd.i.L(a10, new d(this, null));
        d10 = ad.i.d(k0Var, null, ad.m0.LAZY, new b(gVar, this, null), 1, null);
        d10.s0(new c(this));
        this.f5474d = d10;
        this.f5475e = dd.i.z(new a(this, null));
    }

    public final void e() {
        x1.a.a(this.f5474d, null, 1, null);
    }

    public final d1.b<T> f() {
        return this.f5471a.a();
    }

    public final dd.g<d1<T>> g() {
        return this.f5475e;
    }
}
