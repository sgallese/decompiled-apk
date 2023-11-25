package c0;

import ad.x1;
import kotlin.coroutines.Continuation;

/* compiled from: LongPressTextDragObserver.kt */
/* loaded from: classes.dex */
public final class y {

    /* compiled from: LongPressTextDragObserver.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2", f = "LongPressTextDragObserver.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super x1>, Object> {

        /* renamed from: f  reason: collision with root package name */
        int f8618f;

        /* renamed from: m  reason: collision with root package name */
        private /* synthetic */ Object f8619m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ k1.l0 f8620p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ f0 f8621q;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: LongPressTextDragObserver.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2$1", f = "LongPressTextDragObserver.kt", l = {83}, m = "invokeSuspend")
        /* renamed from: c0.y$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0219a extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super dc.w>, Object> {

            /* renamed from: f  reason: collision with root package name */
            int f8622f;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ k1.l0 f8623m;

            /* renamed from: p  reason: collision with root package name */
            final /* synthetic */ f0 f8624p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0219a(k1.l0 l0Var, f0 f0Var, Continuation<? super C0219a> continuation) {
                super(2, continuation);
                this.f8623m = l0Var;
                this.f8624p = f0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
                return new C0219a(this.f8623m, this.f8624p, continuation);
            }

            @Override // pc.p
            public final Object invoke(ad.k0 k0Var, Continuation<? super dc.w> continuation) {
                return ((C0219a) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object d10;
                d10 = ic.d.d();
                int i10 = this.f8622f;
                if (i10 != 0) {
                    if (i10 == 1) {
                        dc.n.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    dc.n.b(obj);
                    k1.l0 l0Var = this.f8623m;
                    f0 f0Var = this.f8624p;
                    this.f8622f = 1;
                    if (y.f(l0Var, f0Var, this) == d10) {
                        return d10;
                    }
                }
                return dc.w.f13270a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: LongPressTextDragObserver.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2$2", f = "LongPressTextDragObserver.kt", l = {86}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class b extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super dc.w>, Object> {

            /* renamed from: f  reason: collision with root package name */
            int f8625f;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ k1.l0 f8626m;

            /* renamed from: p  reason: collision with root package name */
            final /* synthetic */ f0 f8627p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(k1.l0 l0Var, f0 f0Var, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f8626m = l0Var;
                this.f8627p = f0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
                return new b(this.f8626m, this.f8627p, continuation);
            }

            @Override // pc.p
            public final Object invoke(ad.k0 k0Var, Continuation<? super dc.w> continuation) {
                return ((b) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object d10;
                d10 = ic.d.d();
                int i10 = this.f8625f;
                if (i10 != 0) {
                    if (i10 == 1) {
                        dc.n.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    dc.n.b(obj);
                    k1.l0 l0Var = this.f8626m;
                    f0 f0Var = this.f8627p;
                    this.f8625f = 1;
                    if (y.e(l0Var, f0Var, this) == d10) {
                        return d10;
                    }
                }
                return dc.w.f13270a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(k1.l0 l0Var, f0 f0Var, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f8620p = l0Var;
            this.f8621q = f0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
            a aVar = new a(this.f8620p, this.f8621q, continuation);
            aVar.f8619m = obj;
            return aVar;
        }

        @Override // pc.p
        public final Object invoke(ad.k0 k0Var, Continuation<? super x1> continuation) {
            return ((a) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            x1 d10;
            ic.d.d();
            if (this.f8618f == 0) {
                dc.n.b(obj);
                ad.k0 k0Var = (ad.k0) this.f8619m;
                ad.m0 m0Var = ad.m0.UNDISPATCHED;
                ad.i.d(k0Var, null, m0Var, new C0219a(this.f8620p, this.f8621q, null), 1, null);
                d10 = ad.i.d(k0Var, null, m0Var, new b(this.f8620p, this.f8621q, null), 1, null);
                return d10;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: LongPressTextDragObserver.kt */
    /* loaded from: classes.dex */
    static final class b extends qc.r implements pc.l<z0.f, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ f0 f8628f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(f0 f0Var) {
            super(1);
            this.f8628f = f0Var;
        }

        public final void a(long j10) {
            this.f8628f.c(j10);
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ dc.w invoke(z0.f fVar) {
            a(fVar.x());
            return dc.w.f13270a;
        }
    }

    /* compiled from: LongPressTextDragObserver.kt */
    /* loaded from: classes.dex */
    static final class c extends qc.r implements pc.a<dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ f0 f8629f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(f0 f0Var) {
            super(0);
            this.f8629f = f0Var;
        }

        @Override // pc.a
        public /* bridge */ /* synthetic */ dc.w invoke() {
            invoke2();
            return dc.w.f13270a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f8629f.onStop();
        }
    }

    /* compiled from: LongPressTextDragObserver.kt */
    /* loaded from: classes.dex */
    static final class d extends qc.r implements pc.a<dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ f0 f8630f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(f0 f0Var) {
            super(0);
            this.f8630f = f0Var;
        }

        @Override // pc.a
        public /* bridge */ /* synthetic */ dc.w invoke() {
            invoke2();
            return dc.w.f13270a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f8630f.a();
        }
    }

    /* compiled from: LongPressTextDragObserver.kt */
    /* loaded from: classes.dex */
    static final class e extends qc.r implements pc.p<k1.c0, z0.f, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ f0 f8631f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(f0 f0Var) {
            super(2);
            this.f8631f = f0Var;
        }

        public final void a(k1.c0 c0Var, long j10) {
            qc.q.i(c0Var, "<anonymous parameter 0>");
            this.f8631f.e(j10);
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ dc.w invoke(k1.c0 c0Var, z0.f fVar) {
            a(c0Var, fVar.x());
            return dc.w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LongPressTextDragObserver.kt */
    /* loaded from: classes.dex */
    public static final class f extends qc.r implements pc.l<z0.f, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ f0 f8632f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(f0 f0Var) {
            super(1);
            this.f8632f = f0Var;
        }

        public final void a(long j10) {
            this.f8632f.c(j10);
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ dc.w invoke(z0.f fVar) {
            a(fVar.x());
            return dc.w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LongPressTextDragObserver.kt */
    /* loaded from: classes.dex */
    public static final class g extends qc.r implements pc.a<dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ f0 f8633f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(f0 f0Var) {
            super(0);
            this.f8633f = f0Var;
        }

        @Override // pc.a
        public /* bridge */ /* synthetic */ dc.w invoke() {
            invoke2();
            return dc.w.f13270a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f8633f.onStop();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LongPressTextDragObserver.kt */
    /* loaded from: classes.dex */
    public static final class h extends qc.r implements pc.a<dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ f0 f8634f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(f0 f0Var) {
            super(0);
            this.f8634f = f0Var;
        }

        @Override // pc.a
        public /* bridge */ /* synthetic */ dc.w invoke() {
            invoke2();
            return dc.w.f13270a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f8634f.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LongPressTextDragObserver.kt */
    /* loaded from: classes.dex */
    public static final class i extends qc.r implements pc.p<k1.c0, z0.f, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ f0 f8635f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(f0 f0Var) {
            super(2);
            this.f8635f = f0Var;
        }

        public final void a(k1.c0 c0Var, long j10) {
            qc.q.i(c0Var, "<anonymous parameter 0>");
            this.f8635f.e(j10);
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ dc.w invoke(k1.c0 c0Var, z0.f fVar) {
            a(c0Var, fVar.x());
            return dc.w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LongPressTextDragObserver.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2", f = "LongPressTextDragObserver.kt", l = {99, 103}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class j extends kotlin.coroutines.jvm.internal.k implements pc.p<k1.e, Continuation<? super dc.w>, Object> {

        /* renamed from: m  reason: collision with root package name */
        Object f8636m;

        /* renamed from: p  reason: collision with root package name */
        int f8637p;

        /* renamed from: q  reason: collision with root package name */
        private /* synthetic */ Object f8638q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ f0 f8639r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(f0 f0Var, Continuation<? super j> continuation) {
            super(2, continuation);
            this.f8639r = f0Var;
        }

        @Override // pc.p
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final Object invoke(k1.e eVar, Continuation<? super dc.w> continuation) {
            return ((j) create(eVar, continuation)).invokeSuspend(dc.w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
            j jVar = new j(this.f8639r, continuation);
            jVar.f8638q = obj;
            return jVar;
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
            */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0066 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0075  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x009b  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0099 A[EDGE_INSN: B:32:0x0099->B:28:0x0099 BREAK  A[LOOP:0: B:18:0x0073->B:27:0x0096], SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0064 -> B:17:0x0067). Please submit an issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                r16 = this;
                r6 = r16
                java.lang.Object r7 = ic.b.d()
                int r0 = r6.f8637p
                r8 = 2
                r9 = 1
                if (r0 == 0) goto L32
                if (r0 == r9) goto L27
                if (r0 != r8) goto L1f
                java.lang.Object r0 = r6.f8636m
                k1.c0 r0 = (k1.c0) r0
                java.lang.Object r1 = r6.f8638q
                k1.e r1 = (k1.e) r1
                dc.n.b(r17)
                r3 = r17
                r2 = r6
                goto L67
            L1f:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L27:
                java.lang.Object r0 = r6.f8638q
                k1.e r0 = (k1.e) r0
                dc.n.b(r17)
                r10 = r0
                r0 = r17
                goto L4c
            L32:
                dc.n.b(r17)
                java.lang.Object r0 = r6.f8638q
                r10 = r0
                k1.e r10 = (k1.e) r10
                r1 = 0
                r2 = 0
                r4 = 3
                r5 = 0
                r6.f8638q = r10
                r6.f8637p = r9
                r0 = r10
                r3 = r16
                java.lang.Object r0 = u.z.e(r0, r1, r2, r3, r4, r5)
                if (r0 != r7) goto L4c
                return r7
            L4c:
                k1.c0 r0 = (k1.c0) r0
                c0.f0 r1 = r6.f8639r
                long r2 = r0.g()
                r1.b(r2)
                r2 = r6
                r1 = r10
            L59:
                r2.f8638q = r1
                r2.f8636m = r0
                r2.f8637p = r8
                r3 = 0
                java.lang.Object r3 = k1.d.a(r1, r3, r2, r9, r3)
                if (r3 != r7) goto L67
                return r7
            L67:
                k1.r r3 = (k1.r) r3
                java.util.List r3 = r3.c()
                int r4 = r3.size()
                r5 = 0
                r10 = 0
            L73:
                if (r10 >= r4) goto L99
                java.lang.Object r11 = r3.get(r10)
                k1.c0 r11 = (k1.c0) r11
                long r12 = r11.f()
                long r14 = r0.f()
                boolean r12 = k1.b0.d(r12, r14)
                if (r12 == 0) goto L91
                boolean r11 = r11.h()
                if (r11 == 0) goto L91
                r11 = 1
                goto L92
            L91:
                r11 = 0
            L92:
                if (r11 == 0) goto L96
                r5 = 1
                goto L99
            L96:
                int r10 = r10 + 1
                goto L73
            L99:
                if (r5 != 0) goto L59
                c0.f0 r0 = r2.f8639r
                r0.d()
                dc.w r0 = dc.w.f13270a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: c0.y.j.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final Object c(k1.l0 l0Var, f0 f0Var, Continuation<? super dc.w> continuation) {
        Object d10;
        Object e10 = ad.l0.e(new a(l0Var, f0Var, null), continuation);
        d10 = ic.d.d();
        if (e10 == d10) {
            return e10;
        }
        return dc.w.f13270a;
    }

    public static final Object d(k1.l0 l0Var, f0 f0Var, Continuation<? super dc.w> continuation) {
        Object d10;
        Object e10 = u.h.e(l0Var, new b(f0Var), new c(f0Var), new d(f0Var), new e(f0Var), continuation);
        d10 = ic.d.d();
        if (e10 == d10) {
            return e10;
        }
        return dc.w.f13270a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object e(k1.l0 l0Var, f0 f0Var, Continuation<? super dc.w> continuation) {
        Object d10;
        Object d11 = u.h.d(l0Var, new f(f0Var), new g(f0Var), new h(f0Var), new i(f0Var), continuation);
        d10 = ic.d.d();
        if (d11 == d10) {
            return d11;
        }
        return dc.w.f13270a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object f(k1.l0 l0Var, f0 f0Var, Continuation<? super dc.w> continuation) {
        Object d10;
        Object c10 = u.n.c(l0Var, new j(f0Var, null), continuation);
        d10 = ic.d.d();
        if (c10 == d10) {
            return c10;
        }
        return dc.w.f13270a;
    }
}
