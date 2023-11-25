package androidx.paging;

import cd.s;
import kotlin.coroutines.Continuation;

/* compiled from: SimpleChannelFlow.kt */
/* loaded from: classes.dex */
public final class f2 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: SimpleChannelFlow.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1", f = "SimpleChannelFlow.kt", l = {49}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class a<T> extends kotlin.coroutines.jvm.internal.l implements pc.p<dd.h<? super T>, Continuation<? super dc.w>, Object> {

        /* renamed from: f  reason: collision with root package name */
        int f5704f;

        /* renamed from: m  reason: collision with root package name */
        private /* synthetic */ Object f5705m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ pc.p<g2<T>, Continuation<? super dc.w>, Object> f5706p;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: SimpleChannelFlow.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1$1", f = "SimpleChannelFlow.kt", l = {67, 68}, m = "invokeSuspend")
        /* renamed from: androidx.paging.f2$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0134a extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super dc.w>, Object> {

            /* renamed from: f  reason: collision with root package name */
            Object f5707f;

            /* renamed from: m  reason: collision with root package name */
            int f5708m;

            /* renamed from: p  reason: collision with root package name */
            private /* synthetic */ Object f5709p;

            /* renamed from: q  reason: collision with root package name */
            final /* synthetic */ dd.h<T> f5710q;

            /* renamed from: r  reason: collision with root package name */
            final /* synthetic */ pc.p<g2<T>, Continuation<? super dc.w>, Object> f5711r;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: SimpleChannelFlow.kt */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1$1$producer$1", f = "SimpleChannelFlow.kt", l = {55}, m = "invokeSuspend")
            /* renamed from: androidx.paging.f2$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0135a extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super dc.w>, Object> {

                /* renamed from: f  reason: collision with root package name */
                int f5712f;

                /* renamed from: m  reason: collision with root package name */
                final /* synthetic */ cd.d<T> f5713m;

                /* renamed from: p  reason: collision with root package name */
                final /* synthetic */ pc.p<g2<T>, Continuation<? super dc.w>, Object> f5714p;

                /* JADX INFO: Access modifiers changed from: package-private */
                /* compiled from: SimpleChannelFlow.kt */
                @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1$1$producer$1$1", f = "SimpleChannelFlow.kt", l = {60}, m = "invokeSuspend")
                /* renamed from: androidx.paging.f2$a$a$a$a  reason: collision with other inner class name */
                /* loaded from: classes.dex */
                public static final class C0136a extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super dc.w>, Object> {

                    /* renamed from: f  reason: collision with root package name */
                    int f5715f;

                    /* renamed from: m  reason: collision with root package name */
                    private /* synthetic */ Object f5716m;

                    /* renamed from: p  reason: collision with root package name */
                    final /* synthetic */ cd.d<T> f5717p;

                    /* renamed from: q  reason: collision with root package name */
                    final /* synthetic */ pc.p<g2<T>, Continuation<? super dc.w>, Object> f5718q;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    C0136a(cd.d<T> dVar, pc.p<? super g2<T>, ? super Continuation<? super dc.w>, ? extends Object> pVar, Continuation<? super C0136a> continuation) {
                        super(2, continuation);
                        this.f5717p = dVar;
                        this.f5718q = pVar;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
                        C0136a c0136a = new C0136a(this.f5717p, this.f5718q, continuation);
                        c0136a.f5716m = obj;
                        return c0136a;
                    }

                    @Override // pc.p
                    public final Object invoke(ad.k0 k0Var, Continuation<? super dc.w> continuation) {
                        return ((C0136a) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        Object d10;
                        d10 = ic.d.d();
                        int i10 = this.f5715f;
                        if (i10 != 0) {
                            if (i10 == 1) {
                                dc.n.b(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            dc.n.b(obj);
                            h2 h2Var = new h2((ad.k0) this.f5716m, this.f5717p);
                            pc.p<g2<T>, Continuation<? super dc.w>, Object> pVar = this.f5718q;
                            this.f5715f = 1;
                            if (pVar.invoke(h2Var, this) == d10) {
                                return d10;
                            }
                        }
                        return dc.w.f13270a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C0135a(cd.d<T> dVar, pc.p<? super g2<T>, ? super Continuation<? super dc.w>, ? extends Object> pVar, Continuation<? super C0135a> continuation) {
                    super(2, continuation);
                    this.f5713m = dVar;
                    this.f5714p = pVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
                    return new C0135a(this.f5713m, this.f5714p, continuation);
                }

                @Override // pc.p
                public final Object invoke(ad.k0 k0Var, Continuation<? super dc.w> continuation) {
                    return ((C0135a) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object d10;
                    d10 = ic.d.d();
                    int i10 = this.f5712f;
                    try {
                        if (i10 != 0) {
                            if (i10 == 1) {
                                dc.n.b(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            dc.n.b(obj);
                            C0136a c0136a = new C0136a(this.f5713m, this.f5714p, null);
                            this.f5712f = 1;
                            if (ad.l0.e(c0136a, this) == d10) {
                                return d10;
                            }
                        }
                        s.a.a(this.f5713m, null, 1, null);
                    } catch (Throwable th) {
                        this.f5713m.l(th);
                    }
                    return dc.w.f13270a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0134a(dd.h<? super T> hVar, pc.p<? super g2<T>, ? super Continuation<? super dc.w>, ? extends Object> pVar, Continuation<? super C0134a> continuation) {
                super(2, continuation);
                this.f5710q = hVar;
                this.f5711r = pVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
                C0134a c0134a = new C0134a(this.f5710q, this.f5711r, continuation);
                c0134a.f5709p = obj;
                return c0134a;
            }

            @Override // pc.p
            public final Object invoke(ad.k0 k0Var, Continuation<? super dc.w> continuation) {
                return ((C0134a) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0060 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:15:0x0061  */
            /* JADX WARN: Removed duplicated region for block: B:18:0x006e  */
            /* JADX WARN: Removed duplicated region for block: B:22:0x0085  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0081 -> B:12:0x0054). Please submit an issue!!! */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r13) {
                /*
                    r12 = this;
                    java.lang.Object r0 = ic.b.d()
                    int r1 = r12.f5708m
                    r2 = 2
                    r3 = 1
                    r4 = 0
                    if (r1 == 0) goto L32
                    if (r1 == r3) goto L25
                    if (r1 != r2) goto L1d
                    java.lang.Object r1 = r12.f5707f
                    cd.f r1 = (cd.f) r1
                    java.lang.Object r5 = r12.f5709p
                    ad.x1 r5 = (ad.x1) r5
                    dc.n.b(r13)
                    r13 = r1
                    r1 = r5
                    goto L53
                L1d:
                    java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r13.<init>(r0)
                    throw r13
                L25:
                    java.lang.Object r1 = r12.f5707f
                    cd.f r1 = (cd.f) r1
                    java.lang.Object r5 = r12.f5709p
                    ad.x1 r5 = (ad.x1) r5
                    dc.n.b(r13)
                    r6 = r12
                    goto L66
                L32:
                    dc.n.b(r13)
                    java.lang.Object r13 = r12.f5709p
                    r5 = r13
                    ad.k0 r5 = (ad.k0) r5
                    r13 = 0
                    r1 = 6
                    cd.d r13 = cd.g.b(r13, r4, r4, r1, r4)
                    r6 = 0
                    r7 = 0
                    androidx.paging.f2$a$a$a r8 = new androidx.paging.f2$a$a$a
                    pc.p<androidx.paging.g2<T>, kotlin.coroutines.Continuation<? super dc.w>, java.lang.Object> r1 = r12.f5711r
                    r8.<init>(r13, r1, r4)
                    r9 = 3
                    r10 = 0
                    ad.x1 r1 = ad.g.d(r5, r6, r7, r8, r9, r10)
                    cd.f r13 = r13.iterator()
                L53:
                    r5 = r12
                L54:
                    r5.f5709p = r1
                    r5.f5707f = r13
                    r5.f5708m = r3
                    java.lang.Object r6 = r13.a(r5)
                    if (r6 != r0) goto L61
                    return r0
                L61:
                    r11 = r1
                    r1 = r13
                    r13 = r6
                    r6 = r5
                    r5 = r11
                L66:
                    java.lang.Boolean r13 = (java.lang.Boolean) r13
                    boolean r13 = r13.booleanValue()
                    if (r13 == 0) goto L85
                    java.lang.Object r13 = r1.next()
                    dd.h<T> r7 = r6.f5710q
                    r6.f5709p = r5
                    r6.f5707f = r1
                    r6.f5708m = r2
                    java.lang.Object r13 = r7.emit(r13, r6)
                    if (r13 != r0) goto L81
                    return r0
                L81:
                    r13 = r1
                    r1 = r5
                    r5 = r6
                    goto L54
                L85:
                    ad.x1.a.a(r5, r4, r3, r4)
                    dc.w r13 = dc.w.f13270a
                    return r13
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.paging.f2.a.C0134a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(pc.p<? super g2<T>, ? super Continuation<? super dc.w>, ? extends Object> pVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f5706p = pVar;
        }

        @Override // pc.p
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final Object invoke(dd.h<? super T> hVar, Continuation<? super dc.w> continuation) {
            return ((a) create(hVar, continuation)).invokeSuspend(dc.w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
            a aVar = new a(this.f5706p, continuation);
            aVar.f5705m = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d10;
            d10 = ic.d.d();
            int i10 = this.f5704f;
            if (i10 != 0) {
                if (i10 == 1) {
                    dc.n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                dc.n.b(obj);
                C0134a c0134a = new C0134a((dd.h) this.f5705m, this.f5706p, null);
                this.f5704f = 1;
                if (ad.l0.e(c0134a, this) == d10) {
                    return d10;
                }
            }
            return dc.w.f13270a;
        }
    }

    public static final <T> dd.g<T> a(pc.p<? super g2<T>, ? super Continuation<? super dc.w>, ? extends Object> pVar) {
        dd.g<T> b10;
        qc.q.i(pVar, "block");
        b10 = dd.m.b(dd.i.z(new a(pVar, null)), -2, null, 2, null);
        return b10;
    }
}
