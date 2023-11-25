package u;

import ad.k0;
import androidx.recyclerview.widget.RecyclerView;
import k1.c0;
import k1.l0;
import kotlin.coroutines.Continuation;
import qc.f0;

/* compiled from: TapGestureDetector.kt */
/* loaded from: classes.dex */
public final class z {

    /* renamed from: a */
    private static final pc.q<q, z0.f, Continuation<? super dc.w>, Object> f23990a = new a(null);

    /* compiled from: TapGestureDetector.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$NoPressGesture$1", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements pc.q<q, z0.f, Continuation<? super dc.w>, Object> {

        /* renamed from: f */
        int f23991f;

        a(Continuation<? super a> continuation) {
            super(3, continuation);
        }

        public final Object a(q qVar, long j10, Continuation<? super dc.w> continuation) {
            return new a(continuation).invokeSuspend(dc.w.f13270a);
        }

        @Override // pc.q
        public /* bridge */ /* synthetic */ Object invoke(q qVar, z0.f fVar, Continuation<? super dc.w> continuation) {
            return a(qVar, fVar.x(), continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            ic.d.d();
            if (this.f23991f == 0) {
                dc.n.b(obj);
                return dc.w.f13270a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: TapGestureDetector.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", f = "TapGestureDetector.kt", l = {279}, m = "awaitFirstDown")
    /* loaded from: classes.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: f */
        Object f23992f;

        /* renamed from: m */
        Object f23993m;

        /* renamed from: p */
        boolean f23994p;

        /* renamed from: q */
        /* synthetic */ Object f23995q;

        /* renamed from: r */
        int f23996r;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f23995q = obj;
            this.f23996r |= RecyclerView.UNDEFINED_DURATION;
            return z.d(null, false, null, this);
        }
    }

    /* compiled from: TapGestureDetector.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitSecondDown$2", f = "TapGestureDetector.kt", l = {212}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.k implements pc.p<k1.e, Continuation<? super c0>, Object> {

        /* renamed from: m */
        long f23997m;

        /* renamed from: p */
        int f23998p;

        /* renamed from: q */
        private /* synthetic */ Object f23999q;

        /* renamed from: r */
        final /* synthetic */ c0 f24000r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(c0 c0Var, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f24000r = c0Var;
        }

        @Override // pc.p
        /* renamed from: a */
        public final Object invoke(k1.e eVar, Continuation<? super c0> continuation) {
            return ((c) create(eVar, continuation)).invokeSuspend(dc.w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
            c cVar = new c(this.f24000r, continuation);
            cVar.f23999q = obj;
            return cVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:28:0x004c A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:29:0x004d  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x005c A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:33:0x005d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x004d -> B:30:0x0052). Please submit an issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                java.lang.Object r0 = ic.b.d()
                int r1 = r12.f23998p
                r2 = 1
                if (r1 == 0) goto L21
                if (r1 != r2) goto L19
                long r3 = r12.f23997m
                java.lang.Object r1 = r12.f23999q
                k1.e r1 = (k1.e) r1
                dc.n.b(r13)
                r9 = r3
                r3 = r1
                r1 = r0
                r0 = r12
                goto L52
            L19:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L21:
                dc.n.b(r13)
                java.lang.Object r13 = r12.f23999q
                k1.e r13 = (k1.e) r13
                k1.c0 r1 = r12.f24000r
                long r3 = r1.n()
                androidx.compose.ui.platform.g4 r1 = r13.getViewConfiguration()
                long r5 = r1.b()
                long r3 = r3 + r5
                r1 = r13
                r9 = r3
                r13 = r12
            L3a:
                r4 = 0
                r5 = 0
                r7 = 3
                r8 = 0
                r13.f23999q = r1
                r13.f23997m = r9
                r13.f23998p = r2
                r3 = r1
                r6 = r13
                java.lang.Object r3 = u.z.e(r3, r4, r5, r6, r7, r8)
                if (r3 != r0) goto L4d
                return r0
            L4d:
                r11 = r0
                r0 = r13
                r13 = r3
                r3 = r1
                r1 = r11
            L52:
                k1.c0 r13 = (k1.c0) r13
                long r4 = r13.n()
                int r6 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
                if (r6 < 0) goto L5d
                return r13
            L5d:
                r13 = r0
                r0 = r1
                r1 = r3
                goto L3a
            */
            throw new UnsupportedOperationException("Method not decompiled: u.z.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: TapGestureDetector.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", f = "TapGestureDetector.kt", l = {195}, m = "consumeUntilUp")
    /* loaded from: classes.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: f */
        Object f24001f;

        /* renamed from: m */
        /* synthetic */ Object f24002m;

        /* renamed from: p */
        int f24003p;

        d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f24002m = obj;
            this.f24003p |= RecyclerView.UNDEFINED_DURATION;
            return z.g(null, this);
        }
    }

    /* compiled from: TapGestureDetector.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2", f = "TapGestureDetector.kt", l = {232}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class e extends kotlin.coroutines.jvm.internal.l implements pc.p<k0, Continuation<? super dc.w>, Object> {

        /* renamed from: f */
        int f24004f;

        /* renamed from: m */
        private /* synthetic */ Object f24005m;

        /* renamed from: p */
        final /* synthetic */ l0 f24006p;

        /* renamed from: q */
        final /* synthetic */ pc.q<q, z0.f, Continuation<? super dc.w>, Object> f24007q;

        /* renamed from: r */
        final /* synthetic */ pc.l<z0.f, dc.w> f24008r;

        /* renamed from: s */
        final /* synthetic */ r f24009s;

        /* compiled from: TapGestureDetector.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1", f = "TapGestureDetector.kt", l = {237, 245}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.k implements pc.p<k1.e, Continuation<? super dc.w>, Object> {

            /* renamed from: m */
            int f24010m;

            /* renamed from: p */
            private /* synthetic */ Object f24011p;

            /* renamed from: q */
            final /* synthetic */ k0 f24012q;

            /* renamed from: r */
            final /* synthetic */ pc.q<q, z0.f, Continuation<? super dc.w>, Object> f24013r;

            /* renamed from: s */
            final /* synthetic */ pc.l<z0.f, dc.w> f24014s;

            /* renamed from: t */
            final /* synthetic */ r f24015t;

            /* compiled from: TapGestureDetector.kt */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$1", f = "TapGestureDetector.kt", l = {234}, m = "invokeSuspend")
            /* renamed from: u.z$e$a$a */
            /* loaded from: classes.dex */
            public static final class C0560a extends kotlin.coroutines.jvm.internal.l implements pc.p<k0, Continuation<? super dc.w>, Object> {

                /* renamed from: f */
                int f24016f;

                /* renamed from: m */
                final /* synthetic */ r f24017m;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0560a(r rVar, Continuation<? super C0560a> continuation) {
                    super(2, continuation);
                    this.f24017m = rVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
                    return new C0560a(this.f24017m, continuation);
                }

                @Override // pc.p
                public final Object invoke(k0 k0Var, Continuation<? super dc.w> continuation) {
                    return ((C0560a) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object d10;
                    d10 = ic.d.d();
                    int i10 = this.f24016f;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            dc.n.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        dc.n.b(obj);
                        r rVar = this.f24017m;
                        this.f24016f = 1;
                        if (rVar.g(this) == d10) {
                            return d10;
                        }
                    }
                    return dc.w.f13270a;
                }
            }

            /* compiled from: TapGestureDetector.kt */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$2", f = "TapGestureDetector.kt", l = {241}, m = "invokeSuspend")
            /* loaded from: classes.dex */
            public static final class b extends kotlin.coroutines.jvm.internal.l implements pc.p<k0, Continuation<? super dc.w>, Object> {

                /* renamed from: f */
                int f24018f;

                /* renamed from: m */
                final /* synthetic */ pc.q<q, z0.f, Continuation<? super dc.w>, Object> f24019m;

                /* renamed from: p */
                final /* synthetic */ r f24020p;

                /* renamed from: q */
                final /* synthetic */ c0 f24021q;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                b(pc.q<? super q, ? super z0.f, ? super Continuation<? super dc.w>, ? extends Object> qVar, r rVar, c0 c0Var, Continuation<? super b> continuation) {
                    super(2, continuation);
                    this.f24019m = qVar;
                    this.f24020p = rVar;
                    this.f24021q = c0Var;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
                    return new b(this.f24019m, this.f24020p, this.f24021q, continuation);
                }

                @Override // pc.p
                public final Object invoke(k0 k0Var, Continuation<? super dc.w> continuation) {
                    return ((b) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object d10;
                    d10 = ic.d.d();
                    int i10 = this.f24018f;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            dc.n.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        dc.n.b(obj);
                        pc.q<q, z0.f, Continuation<? super dc.w>, Object> qVar = this.f24019m;
                        r rVar = this.f24020p;
                        z0.f d11 = z0.f.d(this.f24021q.g());
                        this.f24018f = 1;
                        if (qVar.invoke(rVar, d11, this) == d10) {
                            return d10;
                        }
                    }
                    return dc.w.f13270a;
                }
            }

            /* compiled from: TapGestureDetector.kt */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$3", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend")
            /* loaded from: classes.dex */
            public static final class c extends kotlin.coroutines.jvm.internal.l implements pc.p<k0, Continuation<? super dc.w>, Object> {

                /* renamed from: f */
                int f24022f;

                /* renamed from: m */
                final /* synthetic */ r f24023m;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                c(r rVar, Continuation<? super c> continuation) {
                    super(2, continuation);
                    this.f24023m = rVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
                    return new c(this.f24023m, continuation);
                }

                @Override // pc.p
                public final Object invoke(k0 k0Var, Continuation<? super dc.w> continuation) {
                    return ((c) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    ic.d.d();
                    if (this.f24022f == 0) {
                        dc.n.b(obj);
                        this.f24023m.d();
                        return dc.w.f13270a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            /* compiled from: TapGestureDetector.kt */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$4", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend")
            /* loaded from: classes.dex */
            public static final class d extends kotlin.coroutines.jvm.internal.l implements pc.p<k0, Continuation<? super dc.w>, Object> {

                /* renamed from: f */
                int f24024f;

                /* renamed from: m */
                final /* synthetic */ r f24025m;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                d(r rVar, Continuation<? super d> continuation) {
                    super(2, continuation);
                    this.f24025m = rVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
                    return new d(this.f24025m, continuation);
                }

                @Override // pc.p
                public final Object invoke(k0 k0Var, Continuation<? super dc.w> continuation) {
                    return ((d) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    ic.d.d();
                    if (this.f24024f == 0) {
                        dc.n.b(obj);
                        this.f24025m.f();
                        return dc.w.f13270a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(k0 k0Var, pc.q<? super q, ? super z0.f, ? super Continuation<? super dc.w>, ? extends Object> qVar, pc.l<? super z0.f, dc.w> lVar, r rVar, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f24012q = k0Var;
                this.f24013r = qVar;
                this.f24014s = lVar;
                this.f24015t = rVar;
            }

            @Override // pc.p
            /* renamed from: a */
            public final Object invoke(k1.e eVar, Continuation<? super dc.w> continuation) {
                return ((a) create(eVar, continuation)).invokeSuspend(dc.w.f13270a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(this.f24012q, this.f24013r, this.f24014s, this.f24015t, continuation);
                aVar.f24011p = obj;
                return aVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:48:0x0081  */
            /* JADX WARN: Removed duplicated region for block: B:49:0x0093  */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r24) {
                /*
                    r23 = this;
                    r6 = r23
                    java.lang.Object r7 = ic.b.d()
                    int r0 = r6.f24010m
                    r8 = 2
                    r9 = 1
                    r10 = 0
                    if (r0 == 0) goto L2a
                    if (r0 == r9) goto L1f
                    if (r0 != r8) goto L17
                    dc.n.b(r24)
                    r0 = r24
                    goto L7d
                L17:
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                    r0.<init>(r1)
                    throw r0
                L1f:
                    java.lang.Object r0 = r6.f24011p
                    k1.e r0 = (k1.e) r0
                    dc.n.b(r24)
                    r11 = r0
                    r0 = r24
                    goto L51
                L2a:
                    dc.n.b(r24)
                    java.lang.Object r0 = r6.f24011p
                    r11 = r0
                    k1.e r11 = (k1.e) r11
                    ad.k0 r0 = r6.f24012q
                    r1 = 0
                    r2 = 0
                    u.z$e$a$a r3 = new u.z$e$a$a
                    u.r r4 = r6.f24015t
                    r3.<init>(r4, r10)
                    r4 = 3
                    r5 = 0
                    ad.g.d(r0, r1, r2, r3, r4, r5)
                    r1 = 0
                    r6.f24011p = r11
                    r6.f24010m = r9
                    r0 = r11
                    r3 = r23
                    java.lang.Object r0 = u.z.e(r0, r1, r2, r3, r4, r5)
                    if (r0 != r7) goto L51
                    return r7
                L51:
                    k1.c0 r0 = (k1.c0) r0
                    r0.a()
                    pc.q<u.q, z0.f, kotlin.coroutines.Continuation<? super dc.w>, java.lang.Object> r1 = r6.f24013r
                    pc.q r2 = u.z.c()
                    if (r1 == r2) goto L72
                    ad.k0 r12 = r6.f24012q
                    r13 = 0
                    r14 = 0
                    u.z$e$a$b r15 = new u.z$e$a$b
                    pc.q<u.q, z0.f, kotlin.coroutines.Continuation<? super dc.w>, java.lang.Object> r1 = r6.f24013r
                    u.r r2 = r6.f24015t
                    r15.<init>(r1, r2, r0, r10)
                    r16 = 3
                    r17 = 0
                    ad.g.d(r12, r13, r14, r15, r16, r17)
                L72:
                    r6.f24011p = r10
                    r6.f24010m = r8
                    java.lang.Object r0 = u.z.l(r11, r10, r6, r9, r10)
                    if (r0 != r7) goto L7d
                    return r7
                L7d:
                    k1.c0 r0 = (k1.c0) r0
                    if (r0 != 0) goto L93
                    ad.k0 r11 = r6.f24012q
                    r12 = 0
                    r13 = 0
                    u.z$e$a$c r14 = new u.z$e$a$c
                    u.r r0 = r6.f24015t
                    r14.<init>(r0, r10)
                    r15 = 3
                    r16 = 0
                    ad.g.d(r11, r12, r13, r14, r15, r16)
                    goto Lbd
                L93:
                    r0.a()
                    ad.k0 r1 = r6.f24012q
                    r18 = 0
                    r19 = 0
                    u.z$e$a$d r2 = new u.z$e$a$d
                    u.r r3 = r6.f24015t
                    r2.<init>(r3, r10)
                    r21 = 3
                    r22 = 0
                    r17 = r1
                    r20 = r2
                    ad.g.d(r17, r18, r19, r20, r21, r22)
                    pc.l<z0.f, dc.w> r1 = r6.f24014s
                    if (r1 == 0) goto Lbd
                    long r2 = r0.g()
                    z0.f r0 = z0.f.d(r2)
                    r1.invoke(r0)
                Lbd:
                    dc.w r0 = dc.w.f13270a
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: u.z.e.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(l0 l0Var, pc.q<? super q, ? super z0.f, ? super Continuation<? super dc.w>, ? extends Object> qVar, pc.l<? super z0.f, dc.w> lVar, r rVar, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f24006p = l0Var;
            this.f24007q = qVar;
            this.f24008r = lVar;
            this.f24009s = rVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
            e eVar = new e(this.f24006p, this.f24007q, this.f24008r, this.f24009s, continuation);
            eVar.f24005m = obj;
            return eVar;
        }

        @Override // pc.p
        public final Object invoke(k0 k0Var, Continuation<? super dc.w> continuation) {
            return ((e) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d10;
            d10 = ic.d.d();
            int i10 = this.f24004f;
            if (i10 != 0) {
                if (i10 == 1) {
                    dc.n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                dc.n.b(obj);
                k0 k0Var = (k0) this.f24005m;
                l0 l0Var = this.f24006p;
                a aVar = new a(k0Var, this.f24007q, this.f24008r, this.f24009s, null);
                this.f24004f = 1;
                if (n.c(l0Var, aVar, this) == d10) {
                    return d10;
                }
            }
            return dc.w.f13270a;
        }
    }

    /* compiled from: TapGestureDetector.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2", f = "TapGestureDetector.kt", l = {99}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class f extends kotlin.coroutines.jvm.internal.l implements pc.p<k0, Continuation<? super dc.w>, Object> {

        /* renamed from: f */
        int f24026f;

        /* renamed from: m */
        private /* synthetic */ Object f24027m;

        /* renamed from: p */
        final /* synthetic */ l0 f24028p;

        /* renamed from: q */
        final /* synthetic */ pc.q<q, z0.f, Continuation<? super dc.w>, Object> f24029q;

        /* renamed from: r */
        final /* synthetic */ pc.l<z0.f, dc.w> f24030r;

        /* renamed from: s */
        final /* synthetic */ pc.l<z0.f, dc.w> f24031s;

        /* renamed from: t */
        final /* synthetic */ pc.l<z0.f, dc.w> f24032t;

        /* compiled from: TapGestureDetector.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1", f = "TapGestureDetector.kt", l = {100, 114, 129, 141, 156, 178}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.k implements pc.p<k1.e, Continuation<? super dc.w>, Object> {

            /* renamed from: m */
            Object f24033m;

            /* renamed from: p */
            Object f24034p;

            /* renamed from: q */
            Object f24035q;

            /* renamed from: r */
            long f24036r;

            /* renamed from: s */
            int f24037s;

            /* renamed from: t */
            private /* synthetic */ Object f24038t;

            /* renamed from: u */
            final /* synthetic */ k0 f24039u;

            /* renamed from: v */
            final /* synthetic */ pc.q<q, z0.f, Continuation<? super dc.w>, Object> f24040v;

            /* renamed from: w */
            final /* synthetic */ pc.l<z0.f, dc.w> f24041w;

            /* renamed from: x */
            final /* synthetic */ pc.l<z0.f, dc.w> f24042x;

            /* renamed from: y */
            final /* synthetic */ pc.l<z0.f, dc.w> f24043y;

            /* renamed from: z */
            final /* synthetic */ r f24044z;

            /* compiled from: TapGestureDetector.kt */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$10", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend")
            /* renamed from: u.z$f$a$a */
            /* loaded from: classes.dex */
            public static final class C0561a extends kotlin.coroutines.jvm.internal.l implements pc.p<k0, Continuation<? super dc.w>, Object> {

                /* renamed from: f */
                int f24045f;

                /* renamed from: m */
                final /* synthetic */ r f24046m;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0561a(r rVar, Continuation<? super C0561a> continuation) {
                    super(2, continuation);
                    this.f24046m = rVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
                    return new C0561a(this.f24046m, continuation);
                }

                @Override // pc.p
                public final Object invoke(k0 k0Var, Continuation<? super dc.w> continuation) {
                    return ((C0561a) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    ic.d.d();
                    if (this.f24045f == 0) {
                        dc.n.b(obj);
                        this.f24046m.f();
                        return dc.w.f13270a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            /* compiled from: TapGestureDetector.kt */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$1", f = "TapGestureDetector.kt", l = {103}, m = "invokeSuspend")
            /* loaded from: classes.dex */
            public static final class b extends kotlin.coroutines.jvm.internal.l implements pc.p<k0, Continuation<? super dc.w>, Object> {

                /* renamed from: f */
                int f24047f;

                /* renamed from: m */
                final /* synthetic */ r f24048m;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(r rVar, Continuation<? super b> continuation) {
                    super(2, continuation);
                    this.f24048m = rVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
                    return new b(this.f24048m, continuation);
                }

                @Override // pc.p
                public final Object invoke(k0 k0Var, Continuation<? super dc.w> continuation) {
                    return ((b) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object d10;
                    d10 = ic.d.d();
                    int i10 = this.f24047f;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            dc.n.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        dc.n.b(obj);
                        r rVar = this.f24048m;
                        this.f24047f = 1;
                        if (rVar.g(this) == d10) {
                            return d10;
                        }
                    }
                    return dc.w.f13270a;
                }
            }

            /* compiled from: TapGestureDetector.kt */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$2", f = "TapGestureDetector.kt", l = {106}, m = "invokeSuspend")
            /* loaded from: classes.dex */
            public static final class c extends kotlin.coroutines.jvm.internal.l implements pc.p<k0, Continuation<? super dc.w>, Object> {

                /* renamed from: f */
                int f24049f;

                /* renamed from: m */
                final /* synthetic */ pc.q<q, z0.f, Continuation<? super dc.w>, Object> f24050m;

                /* renamed from: p */
                final /* synthetic */ r f24051p;

                /* renamed from: q */
                final /* synthetic */ c0 f24052q;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                c(pc.q<? super q, ? super z0.f, ? super Continuation<? super dc.w>, ? extends Object> qVar, r rVar, c0 c0Var, Continuation<? super c> continuation) {
                    super(2, continuation);
                    this.f24050m = qVar;
                    this.f24051p = rVar;
                    this.f24052q = c0Var;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
                    return new c(this.f24050m, this.f24051p, this.f24052q, continuation);
                }

                @Override // pc.p
                public final Object invoke(k0 k0Var, Continuation<? super dc.w> continuation) {
                    return ((c) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object d10;
                    d10 = ic.d.d();
                    int i10 = this.f24049f;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            dc.n.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        dc.n.b(obj);
                        pc.q<q, z0.f, Continuation<? super dc.w>, Object> qVar = this.f24050m;
                        r rVar = this.f24051p;
                        z0.f d11 = z0.f.d(this.f24052q.g());
                        this.f24049f = 1;
                        if (qVar.invoke(rVar, d11, this) == d10) {
                            return d10;
                        }
                    }
                    return dc.w.f13270a;
                }
            }

            /* compiled from: TapGestureDetector.kt */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$3", f = "TapGestureDetector.kt", l = {115}, m = "invokeSuspend")
            /* loaded from: classes.dex */
            public static final class d extends kotlin.coroutines.jvm.internal.k implements pc.p<k1.e, Continuation<? super c0>, Object> {

                /* renamed from: m */
                int f24053m;

                /* renamed from: p */
                private /* synthetic */ Object f24054p;

                d(Continuation<? super d> continuation) {
                    super(2, continuation);
                }

                @Override // pc.p
                /* renamed from: a */
                public final Object invoke(k1.e eVar, Continuation<? super c0> continuation) {
                    return ((d) create(eVar, continuation)).invokeSuspend(dc.w.f13270a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
                    d dVar = new d(continuation);
                    dVar.f24054p = obj;
                    return dVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object d10;
                    d10 = ic.d.d();
                    int i10 = this.f24053m;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            dc.n.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        dc.n.b(obj);
                        k1.e eVar = (k1.e) this.f24054p;
                        this.f24053m = 1;
                        obj = z.l(eVar, null, this, 1, null);
                        if (obj == d10) {
                            return d10;
                        }
                    }
                    return obj;
                }
            }

            /* compiled from: TapGestureDetector.kt */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$4", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend")
            /* loaded from: classes.dex */
            public static final class e extends kotlin.coroutines.jvm.internal.l implements pc.p<k0, Continuation<? super dc.w>, Object> {

                /* renamed from: f */
                int f24055f;

                /* renamed from: m */
                final /* synthetic */ r f24056m;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                e(r rVar, Continuation<? super e> continuation) {
                    super(2, continuation);
                    this.f24056m = rVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
                    return new e(this.f24056m, continuation);
                }

                @Override // pc.p
                public final Object invoke(k0 k0Var, Continuation<? super dc.w> continuation) {
                    return ((e) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    ic.d.d();
                    if (this.f24055f == 0) {
                        dc.n.b(obj);
                        this.f24056m.d();
                        return dc.w.f13270a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            /* compiled from: TapGestureDetector.kt */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$5", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend")
            /* renamed from: u.z$f$a$f */
            /* loaded from: classes.dex */
            public static final class C0562f extends kotlin.coroutines.jvm.internal.l implements pc.p<k0, Continuation<? super dc.w>, Object> {

                /* renamed from: f */
                int f24057f;

                /* renamed from: m */
                final /* synthetic */ r f24058m;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0562f(r rVar, Continuation<? super C0562f> continuation) {
                    super(2, continuation);
                    this.f24058m = rVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
                    return new C0562f(this.f24058m, continuation);
                }

                @Override // pc.p
                public final Object invoke(k0 k0Var, Continuation<? super dc.w> continuation) {
                    return ((C0562f) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    ic.d.d();
                    if (this.f24057f == 0) {
                        dc.n.b(obj);
                        this.f24058m.f();
                        return dc.w.f13270a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            /* compiled from: TapGestureDetector.kt */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$6", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend")
            /* loaded from: classes.dex */
            public static final class g extends kotlin.coroutines.jvm.internal.l implements pc.p<k0, Continuation<? super dc.w>, Object> {

                /* renamed from: f */
                int f24059f;

                /* renamed from: m */
                final /* synthetic */ r f24060m;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                g(r rVar, Continuation<? super g> continuation) {
                    super(2, continuation);
                    this.f24060m = rVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
                    return new g(this.f24060m, continuation);
                }

                @Override // pc.p
                public final Object invoke(k0 k0Var, Continuation<? super dc.w> continuation) {
                    return ((g) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    ic.d.d();
                    if (this.f24059f == 0) {
                        dc.n.b(obj);
                        this.f24060m.f();
                        return dc.w.f13270a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            /* compiled from: TapGestureDetector.kt */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$7", f = "TapGestureDetector.kt", l = {148}, m = "invokeSuspend")
            /* loaded from: classes.dex */
            public static final class h extends kotlin.coroutines.jvm.internal.l implements pc.p<k0, Continuation<? super dc.w>, Object> {

                /* renamed from: f */
                int f24061f;

                /* renamed from: m */
                final /* synthetic */ r f24062m;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                h(r rVar, Continuation<? super h> continuation) {
                    super(2, continuation);
                    this.f24062m = rVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
                    return new h(this.f24062m, continuation);
                }

                @Override // pc.p
                public final Object invoke(k0 k0Var, Continuation<? super dc.w> continuation) {
                    return ((h) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object d10;
                    d10 = ic.d.d();
                    int i10 = this.f24061f;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            dc.n.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        dc.n.b(obj);
                        r rVar = this.f24062m;
                        this.f24061f = 1;
                        if (rVar.g(this) == d10) {
                            return d10;
                        }
                    }
                    return dc.w.f13270a;
                }
            }

            /* compiled from: TapGestureDetector.kt */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$8", f = "TapGestureDetector.kt", l = {151}, m = "invokeSuspend")
            /* loaded from: classes.dex */
            public static final class i extends kotlin.coroutines.jvm.internal.l implements pc.p<k0, Continuation<? super dc.w>, Object> {

                /* renamed from: f */
                int f24063f;

                /* renamed from: m */
                final /* synthetic */ pc.q<q, z0.f, Continuation<? super dc.w>, Object> f24064m;

                /* renamed from: p */
                final /* synthetic */ r f24065p;

                /* renamed from: q */
                final /* synthetic */ c0 f24066q;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                i(pc.q<? super q, ? super z0.f, ? super Continuation<? super dc.w>, ? extends Object> qVar, r rVar, c0 c0Var, Continuation<? super i> continuation) {
                    super(2, continuation);
                    this.f24064m = qVar;
                    this.f24065p = rVar;
                    this.f24066q = c0Var;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
                    return new i(this.f24064m, this.f24065p, this.f24066q, continuation);
                }

                @Override // pc.p
                public final Object invoke(k0 k0Var, Continuation<? super dc.w> continuation) {
                    return ((i) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object d10;
                    d10 = ic.d.d();
                    int i10 = this.f24063f;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            dc.n.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        dc.n.b(obj);
                        pc.q<q, z0.f, Continuation<? super dc.w>, Object> qVar = this.f24064m;
                        r rVar = this.f24065p;
                        z0.f d11 = z0.f.d(this.f24066q.g());
                        this.f24063f = 1;
                        if (qVar.invoke(rVar, d11, this) == d10) {
                            return d10;
                        }
                    }
                    return dc.w.f13270a;
                }
            }

            /* compiled from: TapGestureDetector.kt */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$9", f = "TapGestureDetector.kt", l = {157}, m = "invokeSuspend")
            /* loaded from: classes.dex */
            public static final class j extends kotlin.coroutines.jvm.internal.k implements pc.p<k1.e, Continuation<? super dc.w>, Object> {

                /* renamed from: m */
                int f24067m;

                /* renamed from: p */
                private /* synthetic */ Object f24068p;

                /* renamed from: q */
                final /* synthetic */ k0 f24069q;

                /* renamed from: r */
                final /* synthetic */ pc.l<z0.f, dc.w> f24070r;

                /* renamed from: s */
                final /* synthetic */ pc.l<z0.f, dc.w> f24071s;

                /* renamed from: t */
                final /* synthetic */ f0<c0> f24072t;

                /* renamed from: u */
                final /* synthetic */ r f24073u;

                /* compiled from: TapGestureDetector.kt */
                @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$9$1", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend")
                /* renamed from: u.z$f$a$j$a */
                /* loaded from: classes.dex */
                public static final class C0563a extends kotlin.coroutines.jvm.internal.l implements pc.p<k0, Continuation<? super dc.w>, Object> {

                    /* renamed from: f */
                    int f24074f;

                    /* renamed from: m */
                    final /* synthetic */ r f24075m;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0563a(r rVar, Continuation<? super C0563a> continuation) {
                        super(2, continuation);
                        this.f24075m = rVar;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
                        return new C0563a(this.f24075m, continuation);
                    }

                    @Override // pc.p
                    public final Object invoke(k0 k0Var, Continuation<? super dc.w> continuation) {
                        return ((C0563a) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        ic.d.d();
                        if (this.f24074f == 0) {
                            dc.n.b(obj);
                            this.f24075m.f();
                            return dc.w.f13270a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }

                /* compiled from: TapGestureDetector.kt */
                @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$9$2", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend")
                /* loaded from: classes.dex */
                public static final class b extends kotlin.coroutines.jvm.internal.l implements pc.p<k0, Continuation<? super dc.w>, Object> {

                    /* renamed from: f */
                    int f24076f;

                    /* renamed from: m */
                    final /* synthetic */ r f24077m;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    b(r rVar, Continuation<? super b> continuation) {
                        super(2, continuation);
                        this.f24077m = rVar;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
                        return new b(this.f24077m, continuation);
                    }

                    @Override // pc.p
                    public final Object invoke(k0 k0Var, Continuation<? super dc.w> continuation) {
                        return ((b) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        ic.d.d();
                        if (this.f24076f == 0) {
                            dc.n.b(obj);
                            this.f24077m.d();
                            return dc.w.f13270a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                j(k0 k0Var, pc.l<? super z0.f, dc.w> lVar, pc.l<? super z0.f, dc.w> lVar2, f0<c0> f0Var, r rVar, Continuation<? super j> continuation) {
                    super(2, continuation);
                    this.f24069q = k0Var;
                    this.f24070r = lVar;
                    this.f24071s = lVar2;
                    this.f24072t = f0Var;
                    this.f24073u = rVar;
                }

                @Override // pc.p
                /* renamed from: a */
                public final Object invoke(k1.e eVar, Continuation<? super dc.w> continuation) {
                    return ((j) create(eVar, continuation)).invokeSuspend(dc.w.f13270a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
                    j jVar = new j(this.f24069q, this.f24070r, this.f24071s, this.f24072t, this.f24073u, continuation);
                    jVar.f24068p = obj;
                    return jVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object d10;
                    d10 = ic.d.d();
                    int i10 = this.f24067m;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            dc.n.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        dc.n.b(obj);
                        k1.e eVar = (k1.e) this.f24068p;
                        this.f24067m = 1;
                        obj = z.l(eVar, null, this, 1, null);
                        if (obj == d10) {
                            return d10;
                        }
                    }
                    c0 c0Var = (c0) obj;
                    if (c0Var == null) {
                        ad.i.d(this.f24069q, null, null, new b(this.f24073u, null), 3, null);
                        pc.l<z0.f, dc.w> lVar = this.f24071s;
                        if (lVar == null) {
                            return null;
                        }
                        lVar.invoke(z0.f.d(this.f24072t.f21676f.g()));
                        return dc.w.f13270a;
                    }
                    c0Var.a();
                    ad.i.d(this.f24069q, null, null, new C0563a(this.f24073u, null), 3, null);
                    this.f24070r.invoke(z0.f.d(c0Var.g()));
                    return dc.w.f13270a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(k0 k0Var, pc.q<? super q, ? super z0.f, ? super Continuation<? super dc.w>, ? extends Object> qVar, pc.l<? super z0.f, dc.w> lVar, pc.l<? super z0.f, dc.w> lVar2, pc.l<? super z0.f, dc.w> lVar3, r rVar, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f24039u = k0Var;
                this.f24040v = qVar;
                this.f24041w = lVar;
                this.f24042x = lVar2;
                this.f24043y = lVar3;
                this.f24044z = rVar;
            }

            @Override // pc.p
            /* renamed from: a */
            public final Object invoke(k1.e eVar, Continuation<? super dc.w> continuation) {
                return ((a) create(eVar, continuation)).invokeSuspend(dc.w.f13270a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(this.f24039u, this.f24040v, this.f24041w, this.f24042x, this.f24043y, this.f24044z, continuation);
                aVar.f24038t = obj;
                return aVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:120:0x00b4  */
            /* JADX WARN: Removed duplicated region for block: B:123:0x00ca  */
            /* JADX WARN: Removed duplicated region for block: B:124:0x00d3  */
            /* JADX WARN: Removed duplicated region for block: B:128:0x00f5 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:129:0x00f6  */
            /* JADX WARN: Removed duplicated region for block: B:132:0x00ff A[Catch: PointerEventTimeoutCancellationException -> 0x0126, TryCatch #4 {PointerEventTimeoutCancellationException -> 0x0126, blocks: (B:130:0x00f9, B:132:0x00ff, B:133:0x0110), top: B:188:0x00f9 }] */
            /* JADX WARN: Removed duplicated region for block: B:133:0x0110 A[Catch: PointerEventTimeoutCancellationException -> 0x0126, TRY_LEAVE, TryCatch #4 {PointerEventTimeoutCancellationException -> 0x0126, blocks: (B:130:0x00f9, B:132:0x00ff, B:133:0x0110), top: B:188:0x00f9 }] */
            /* JADX WARN: Removed duplicated region for block: B:139:0x0132  */
            /* JADX WARN: Removed duplicated region for block: B:142:0x0150 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:146:0x0167  */
            /* JADX WARN: Removed duplicated region for block: B:157:0x0199  */
            /* JADX WARN: Removed duplicated region for block: B:160:0x01ae  */
            /* JADX WARN: Removed duplicated region for block: B:169:0x0200  */
            /* JADX WARN: Removed duplicated region for block: B:172:0x0213  */
            /* JADX WARN: Removed duplicated region for block: B:175:0x022d A[RETURN] */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r17) {
                /*
                    Method dump skipped, instructions count: 596
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: u.z.f.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(l0 l0Var, pc.q<? super q, ? super z0.f, ? super Continuation<? super dc.w>, ? extends Object> qVar, pc.l<? super z0.f, dc.w> lVar, pc.l<? super z0.f, dc.w> lVar2, pc.l<? super z0.f, dc.w> lVar3, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f24028p = l0Var;
            this.f24029q = qVar;
            this.f24030r = lVar;
            this.f24031s = lVar2;
            this.f24032t = lVar3;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
            f fVar = new f(this.f24028p, this.f24029q, this.f24030r, this.f24031s, this.f24032t, continuation);
            fVar.f24027m = obj;
            return fVar;
        }

        @Override // pc.p
        public final Object invoke(k0 k0Var, Continuation<? super dc.w> continuation) {
            return ((f) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d10;
            d10 = ic.d.d();
            int i10 = this.f24026f;
            if (i10 != 0) {
                if (i10 == 1) {
                    dc.n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                dc.n.b(obj);
                k0 k0Var = (k0) this.f24027m;
                r rVar = new r(this.f24028p);
                l0 l0Var = this.f24028p;
                a aVar = new a(k0Var, this.f24029q, this.f24030r, this.f24031s, this.f24032t, rVar, null);
                this.f24026f = 1;
                if (n.c(l0Var, aVar, this) == d10) {
                    return d10;
                }
            }
            return dc.w.f13270a;
        }
    }

    /* compiled from: TapGestureDetector.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", f = "TapGestureDetector.kt", l = {305, 320}, m = "waitForUpOrCancellation")
    /* loaded from: classes.dex */
    public static final class g extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: f */
        Object f24078f;

        /* renamed from: m */
        Object f24079m;

        /* renamed from: p */
        /* synthetic */ Object f24080p;

        /* renamed from: q */
        int f24081q;

        g(Continuation<? super g> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f24080p = obj;
            this.f24081q |= RecyclerView.UNDEFINED_DURATION;
            return z.k(null, null, this);
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0050 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0077 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x004e -> B:51:0x0051). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(k1.e r9, boolean r10, k1.t r11, kotlin.coroutines.Continuation<? super k1.c0> r12) {
        /*
            boolean r0 = r12 instanceof u.z.b
            if (r0 == 0) goto L13
            r0 = r12
            u.z$b r0 = (u.z.b) r0
            int r1 = r0.f23996r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f23996r = r1
            goto L18
        L13:
            u.z$b r0 = new u.z$b
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f23995q
            java.lang.Object r1 = ic.b.d()
            int r2 = r0.f23996r
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            boolean r9 = r0.f23994p
            java.lang.Object r10 = r0.f23993m
            k1.t r10 = (k1.t) r10
            java.lang.Object r11 = r0.f23992f
            k1.e r11 = (k1.e) r11
            dc.n.b(r12)
            r8 = r10
            r10 = r9
            r9 = r11
            r11 = r8
            goto L51
        L37:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3f:
            dc.n.b(r12)
        L42:
            r0.f23992f = r9
            r0.f23993m = r11
            r0.f23994p = r10
            r0.f23996r = r3
            java.lang.Object r12 = r9.X(r11, r0)
            if (r12 != r1) goto L51
            return r1
        L51:
            k1.r r12 = (k1.r) r12
            java.util.List r2 = r12.c()
            int r4 = r2.size()
            r5 = 0
            r6 = 0
        L5d:
            if (r6 >= r4) goto L77
            java.lang.Object r7 = r2.get(r6)
            k1.c0 r7 = (k1.c0) r7
            if (r10 == 0) goto L6c
            boolean r7 = k1.s.a(r7)
            goto L70
        L6c:
            boolean r7 = k1.s.b(r7)
        L70:
            if (r7 != 0) goto L74
            r2 = 0
            goto L78
        L74:
            int r6 = r6 + 1
            goto L5d
        L77:
            r2 = 1
        L78:
            if (r2 == 0) goto L42
            java.util.List r9 = r12.c()
            java.lang.Object r9 = r9.get(r5)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: u.z.d(k1.e, boolean, k1.t, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static /* synthetic */ Object e(k1.e eVar, boolean z10, k1.t tVar, Continuation continuation, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        if ((i10 & 2) != 0) {
            tVar = k1.t.Main;
        }
        return d(eVar, z10, tVar, continuation);
    }

    public static final Object f(k1.e eVar, c0 c0Var, Continuation<? super c0> continuation) {
        return eVar.N(eVar.getViewConfiguration().a(), new c(c0Var, null), continuation);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0052 A[LOOP:0: B:52:0x0050->B:53:0x0052, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x007a A[EDGE_INSN: B:65:0x007a->B:60:0x007a BREAK  A[LOOP:1: B:55:0x0067->B:59:0x0077], SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x0041 -> B:51:0x0044). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object g(k1.e r8, kotlin.coroutines.Continuation<? super dc.w> r9) {
        /*
            boolean r0 = r9 instanceof u.z.d
            if (r0 == 0) goto L13
            r0 = r9
            u.z$d r0 = (u.z.d) r0
            int r1 = r0.f24003p
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f24003p = r1
            goto L18
        L13:
            u.z$d r0 = new u.z$d
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f24002m
            java.lang.Object r1 = ic.b.d()
            int r2 = r0.f24003p
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r8 = r0.f24001f
            k1.e r8 = (k1.e) r8
            dc.n.b(r9)
            goto L44
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            dc.n.b(r9)
        L38:
            r0.f24001f = r8
            r0.f24003p = r3
            r9 = 0
            java.lang.Object r9 = k1.d.a(r8, r9, r0, r3, r9)
            if (r9 != r1) goto L44
            return r1
        L44:
            k1.r r9 = (k1.r) r9
            java.util.List r2 = r9.c()
            int r4 = r2.size()
            r5 = 0
            r6 = 0
        L50:
            if (r6 >= r4) goto L5e
            java.lang.Object r7 = r2.get(r6)
            k1.c0 r7 = (k1.c0) r7
            r7.a()
            int r6 = r6 + 1
            goto L50
        L5e:
            java.util.List r9 = r9.c()
            int r2 = r9.size()
            r4 = 0
        L67:
            if (r4 >= r2) goto L7a
            java.lang.Object r6 = r9.get(r4)
            k1.c0 r6 = (k1.c0) r6
            boolean r6 = r6.h()
            if (r6 == 0) goto L77
            r5 = 1
            goto L7a
        L77:
            int r4 = r4 + 1
            goto L67
        L7a:
            if (r5 != 0) goto L38
            dc.w r8 = dc.w.f13270a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: u.z.g(k1.e, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final Object h(l0 l0Var, pc.q<? super q, ? super z0.f, ? super Continuation<? super dc.w>, ? extends Object> qVar, pc.l<? super z0.f, dc.w> lVar, Continuation<? super dc.w> continuation) {
        Object d10;
        Object e10 = ad.l0.e(new e(l0Var, qVar, lVar, new r(l0Var), null), continuation);
        d10 = ic.d.d();
        if (e10 == d10) {
            return e10;
        }
        return dc.w.f13270a;
    }

    public static final Object i(l0 l0Var, pc.l<? super z0.f, dc.w> lVar, pc.l<? super z0.f, dc.w> lVar2, pc.q<? super q, ? super z0.f, ? super Continuation<? super dc.w>, ? extends Object> qVar, pc.l<? super z0.f, dc.w> lVar3, Continuation<? super dc.w> continuation) {
        Object d10;
        Object e10 = ad.l0.e(new f(l0Var, qVar, lVar2, lVar, lVar3, null), continuation);
        d10 = ic.d.d();
        if (e10 == d10) {
            return e10;
        }
        return dc.w.f13270a;
    }

    public static /* synthetic */ Object j(l0 l0Var, pc.l lVar, pc.l lVar2, pc.q qVar, pc.l lVar3, Continuation continuation, int i10, Object obj) {
        pc.l lVar4;
        pc.l lVar5;
        pc.l lVar6;
        if ((i10 & 1) != 0) {
            lVar4 = null;
        } else {
            lVar4 = lVar;
        }
        if ((i10 & 2) != 0) {
            lVar5 = null;
        } else {
            lVar5 = lVar2;
        }
        if ((i10 & 4) != 0) {
            qVar = f23990a;
        }
        pc.q qVar2 = qVar;
        if ((i10 & 8) != 0) {
            lVar6 = null;
        } else {
            lVar6 = lVar3;
        }
        return i(l0Var, lVar4, lVar5, qVar2, lVar6, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0102 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x00ff A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0092 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x009e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:114:0x00de -> B:79:0x0037). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object k(k1.e r18, k1.t r19, kotlin.coroutines.Continuation<? super k1.c0> r20) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u.z.k(k1.e, k1.t, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static /* synthetic */ Object l(k1.e eVar, k1.t tVar, Continuation continuation, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            tVar = k1.t.Main;
        }
        return k(eVar, tVar, continuation);
    }
}
