package androidx.paging;

import androidx.recyclerview.widget.RecyclerView;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;

/* compiled from: SingleRunner.kt */
/* loaded from: classes.dex */
public final class i2 {

    /* renamed from: b */
    public static final b f5766b = new b(null);

    /* renamed from: a */
    private final c f5767a;

    /* compiled from: SingleRunner.kt */
    /* loaded from: classes.dex */
    public static final class a extends CancellationException {

        /* renamed from: f */
        private final i2 f5768f;

        public a(i2 i2Var) {
            qc.q.i(i2Var, "runner");
            this.f5768f = i2Var;
        }

        public final i2 a() {
            return this.f5768f;
        }
    }

    /* compiled from: SingleRunner.kt */
    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(qc.h hVar) {
            this();
        }
    }

    /* compiled from: SingleRunner.kt */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a */
        private final i2 f5769a;

        /* renamed from: b */
        private final boolean f5770b;

        /* renamed from: c */
        private final jd.a f5771c;

        /* renamed from: d */
        private ad.x1 f5772d;

        /* renamed from: e */
        private int f5773e;

        /* compiled from: SingleRunner.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.SingleRunner$Holder", f = "SingleRunner.kt", l = {129}, m = "onFinish")
        /* loaded from: classes.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: f */
            Object f5774f;

            /* renamed from: m */
            Object f5775m;

            /* renamed from: p */
            Object f5776p;

            /* renamed from: q */
            /* synthetic */ Object f5777q;

            /* renamed from: s */
            int f5779s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Continuation<? super a> continuation) {
                super(continuation);
                c.this = r1;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f5777q = obj;
                this.f5779s |= RecyclerView.UNDEFINED_DURATION;
                return c.this.a(null, this);
            }
        }

        /* compiled from: SingleRunner.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.SingleRunner$Holder", f = "SingleRunner.kt", l = {129, 100}, m = "tryEnqueue")
        /* loaded from: classes.dex */
        public static final class b extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: f */
            Object f5780f;

            /* renamed from: m */
            Object f5781m;

            /* renamed from: p */
            Object f5782p;

            /* renamed from: q */
            int f5783q;

            /* renamed from: r */
            /* synthetic */ Object f5784r;

            /* renamed from: t */
            int f5786t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(Continuation<? super b> continuation) {
                super(continuation);
                c.this = r1;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f5784r = obj;
                this.f5786t |= RecyclerView.UNDEFINED_DURATION;
                return c.this.b(0, null, this);
            }
        }

        public c(i2 i2Var, boolean z10) {
            qc.q.i(i2Var, "singleRunner");
            this.f5769a = i2Var;
            this.f5770b = z10;
            this.f5771c = jd.c.b(false, 1, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:39:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x0040  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x0059 A[Catch: all -> 0x0063, TryCatch #0 {all -> 0x0063, blocks: (B:47:0x0055, B:49:0x0059, B:50:0x005b), top: B:56:0x0055 }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object a(ad.x1 r6, kotlin.coroutines.Continuation<? super dc.w> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof androidx.paging.i2.c.a
                if (r0 == 0) goto L13
                r0 = r7
                androidx.paging.i2$c$a r0 = (androidx.paging.i2.c.a) r0
                int r1 = r0.f5779s
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f5779s = r1
                goto L18
            L13:
                androidx.paging.i2$c$a r0 = new androidx.paging.i2$c$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f5777q
                java.lang.Object r1 = ic.b.d()
                int r2 = r0.f5779s
                r3 = 1
                r4 = 0
                if (r2 == 0) goto L40
                if (r2 != r3) goto L38
                java.lang.Object r6 = r0.f5776p
                jd.a r6 = (jd.a) r6
                java.lang.Object r1 = r0.f5775m
                ad.x1 r1 = (ad.x1) r1
                java.lang.Object r0 = r0.f5774f
                androidx.paging.i2$c r0 = (androidx.paging.i2.c) r0
                dc.n.b(r7)
                r7 = r6
                r6 = r1
                goto L55
            L38:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L40:
                dc.n.b(r7)
                jd.a r7 = r5.f5771c
                r0.f5774f = r5
                r0.f5775m = r6
                r0.f5776p = r7
                r0.f5779s = r3
                java.lang.Object r0 = r7.c(r4, r0)
                if (r0 != r1) goto L54
                return r1
            L54:
                r0 = r5
            L55:
                ad.x1 r1 = r0.f5772d     // Catch: java.lang.Throwable -> L63
                if (r6 != r1) goto L5b
                r0.f5772d = r4     // Catch: java.lang.Throwable -> L63
            L5b:
                dc.w r6 = dc.w.f13270a     // Catch: java.lang.Throwable -> L63
                r7.d(r4)
                dc.w r6 = dc.w.f13270a
                return r6
            L63:
                r6 = move-exception
                r7.d(r4)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.i2.c.a(ad.x1, kotlin.coroutines.Continuation):java.lang.Object");
        }

        /* JADX WARN: Code restructure failed: missing block: B:87:0x008b, code lost:
        
            r12.c(new androidx.paging.i2.a(r6.f5769a));
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:61:0x0025  */
        /* JADX WARN: Removed duplicated region for block: B:71:0x0059  */
        /* JADX WARN: Removed duplicated region for block: B:89:0x0097 A[Catch: all -> 0x003c, TryCatch #0 {all -> 0x003c, blocks: (B:64:0x0037, B:94:0x00ac, B:95:0x00b0, B:75:0x0072, B:77:0x0076, B:79:0x007c, B:82:0x0082, B:87:0x008b, B:89:0x0097), top: B:100:0x0023 }] */
        /* JADX WARN: Type inference failed for: r11v0, types: [ad.x1, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r11v1, types: [jd.a] */
        /* JADX WARN: Type inference failed for: r11v14 */
        /* JADX WARN: Type inference failed for: r11v15 */
        /* JADX WARN: Type inference failed for: r11v4, types: [jd.a] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object b(int r10, ad.x1 r11, kotlin.coroutines.Continuation<? super java.lang.Boolean> r12) {
            /*
                r9 = this;
                boolean r0 = r12 instanceof androidx.paging.i2.c.b
                if (r0 == 0) goto L13
                r0 = r12
                androidx.paging.i2$c$b r0 = (androidx.paging.i2.c.b) r0
                int r1 = r0.f5786t
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f5786t = r1
                goto L18
            L13:
                androidx.paging.i2$c$b r0 = new androidx.paging.i2$c$b
                r0.<init>(r12)
            L18:
                java.lang.Object r12 = r0.f5784r
                java.lang.Object r1 = ic.b.d()
                int r2 = r0.f5786t
                r3 = 2
                r4 = 0
                r5 = 1
                if (r2 == 0) goto L59
                if (r2 == r5) goto L47
                if (r2 != r3) goto L3f
                int r10 = r0.f5783q
                java.lang.Object r11 = r0.f5782p
                jd.a r11 = (jd.a) r11
                java.lang.Object r1 = r0.f5781m
                ad.x1 r1 = (ad.x1) r1
                java.lang.Object r0 = r0.f5780f
                androidx.paging.i2$c r0 = (androidx.paging.i2.c) r0
                dc.n.b(r12)     // Catch: java.lang.Throwable -> L3c
                goto Laa
            L3c:
                r10 = move-exception
                goto Lb8
            L3f:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r11)
                throw r10
            L47:
                int r10 = r0.f5783q
                java.lang.Object r11 = r0.f5782p
                jd.a r11 = (jd.a) r11
                java.lang.Object r2 = r0.f5781m
                ad.x1 r2 = (ad.x1) r2
                java.lang.Object r6 = r0.f5780f
                androidx.paging.i2$c r6 = (androidx.paging.i2.c) r6
                dc.n.b(r12)
                goto L72
            L59:
                dc.n.b(r12)
                jd.a r12 = r9.f5771c
                r0.f5780f = r9
                r0.f5781m = r11
                r0.f5782p = r12
                r0.f5783q = r10
                r0.f5786t = r5
                java.lang.Object r2 = r12.c(r4, r0)
                if (r2 != r1) goto L6f
                return r1
            L6f:
                r6 = r9
                r2 = r11
                r11 = r12
            L72:
                ad.x1 r12 = r6.f5772d     // Catch: java.lang.Throwable -> L3c
                if (r12 == 0) goto L89
                boolean r7 = r12.b()     // Catch: java.lang.Throwable -> L3c
                if (r7 == 0) goto L89
                int r7 = r6.f5773e     // Catch: java.lang.Throwable -> L3c
                if (r7 < r10) goto L89
                if (r7 != r10) goto L87
                boolean r7 = r6.f5770b     // Catch: java.lang.Throwable -> L3c
                if (r7 == 0) goto L87
                goto L89
            L87:
                r5 = 0
                goto Lb0
            L89:
                if (r12 == 0) goto L95
                androidx.paging.i2$a r7 = new androidx.paging.i2$a     // Catch: java.lang.Throwable -> L3c
                androidx.paging.i2 r8 = r6.f5769a     // Catch: java.lang.Throwable -> L3c
                r7.<init>(r8)     // Catch: java.lang.Throwable -> L3c
                r12.c(r7)     // Catch: java.lang.Throwable -> L3c
            L95:
                if (r12 == 0) goto Lac
                r0.f5780f = r6     // Catch: java.lang.Throwable -> L3c
                r0.f5781m = r2     // Catch: java.lang.Throwable -> L3c
                r0.f5782p = r11     // Catch: java.lang.Throwable -> L3c
                r0.f5783q = r10     // Catch: java.lang.Throwable -> L3c
                r0.f5786t = r3     // Catch: java.lang.Throwable -> L3c
                java.lang.Object r12 = r12.z(r0)     // Catch: java.lang.Throwable -> L3c
                if (r12 != r1) goto La8
                return r1
            La8:
                r1 = r2
                r0 = r6
            Laa:
                r6 = r0
                r2 = r1
            Lac:
                r6.f5772d = r2     // Catch: java.lang.Throwable -> L3c
                r6.f5773e = r10     // Catch: java.lang.Throwable -> L3c
            Lb0:
                java.lang.Boolean r10 = kotlin.coroutines.jvm.internal.b.a(r5)     // Catch: java.lang.Throwable -> L3c
                r11.d(r4)
                return r10
            Lb8:
                r11.d(r4)
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.i2.c.b(int, ad.x1, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* compiled from: SingleRunner.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.SingleRunner", f = "SingleRunner.kt", l = {49}, m = "runInIsolation")
    /* loaded from: classes.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: f */
        Object f5787f;

        /* renamed from: m */
        /* synthetic */ Object f5788m;

        /* renamed from: q */
        int f5790q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Continuation<? super d> continuation) {
            super(continuation);
            i2.this = r1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f5788m = obj;
            this.f5790q |= RecyclerView.UNDEFINED_DURATION;
            return i2.this.b(0, null, this);
        }
    }

    /* compiled from: SingleRunner.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.SingleRunner$runInIsolation$2", f = "SingleRunner.kt", l = {53, 59, 61, 61}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class e extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super dc.w>, Object> {

        /* renamed from: f */
        int f5791f;

        /* renamed from: m */
        private /* synthetic */ Object f5792m;

        /* renamed from: q */
        final /* synthetic */ int f5794q;

        /* renamed from: r */
        final /* synthetic */ pc.l<Continuation<? super dc.w>, Object> f5795r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(int i10, pc.l<? super Continuation<? super dc.w>, ? extends Object> lVar, Continuation<? super e> continuation) {
            super(2, continuation);
            i2.this = r1;
            this.f5794q = i10;
            this.f5795r = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
            e eVar = new e(this.f5794q, this.f5795r, continuation);
            eVar.f5792m = obj;
            return eVar;
        }

        @Override // pc.p
        public final Object invoke(ad.k0 k0Var, Continuation<? super dc.w> continuation) {
            return ((e) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:75:0x008d A[RETURN] */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [ad.x1] */
        /* JADX WARN: Type inference failed for: r1v14 */
        /* JADX WARN: Type inference failed for: r1v15 */
        /* JADX WARN: Type inference failed for: r1v9, types: [ad.x1] */
        /* JADX WARN: Type inference failed for: r3v2, types: [androidx.paging.i2$c] */
        /* JADX WARN: Type inference failed for: r9v15, types: [androidx.paging.i2$c] */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = ic.b.d()
                int r1 = r8.f5791f
                r2 = 4
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L3c
                if (r1 == r5) goto L34
                if (r1 == r4) goto L2a
                if (r1 == r3) goto L25
                if (r1 == r2) goto L1c
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L1c:
                java.lang.Object r0 = r8.f5792m
                java.lang.Throwable r0 = (java.lang.Throwable) r0
                dc.n.b(r9)
                goto La0
            L25:
                dc.n.b(r9)
                goto La1
            L2a:
                java.lang.Object r1 = r8.f5792m
                ad.x1 r1 = (ad.x1) r1
                dc.n.b(r9)     // Catch: java.lang.Throwable -> L32
                goto L7c
            L32:
                r9 = move-exception
                goto L8e
            L34:
                java.lang.Object r1 = r8.f5792m
                ad.x1 r1 = (ad.x1) r1
                dc.n.b(r9)
                goto L67
            L3c:
                dc.n.b(r9)
                java.lang.Object r9 = r8.f5792m
                ad.k0 r9 = (ad.k0) r9
                hc.f r9 = r9.getCoroutineContext()
                ad.x1$b r1 = ad.x1.f574b
                hc.f$b r9 = r9.get(r1)
                if (r9 == 0) goto La4
                ad.x1 r9 = (ad.x1) r9
                androidx.paging.i2 r1 = androidx.paging.i2.this
                androidx.paging.i2$c r1 = androidx.paging.i2.a(r1)
                int r6 = r8.f5794q
                r8.f5792m = r9
                r8.f5791f = r5
                java.lang.Object r1 = r1.b(r6, r9, r8)
                if (r1 != r0) goto L64
                return r0
            L64:
                r7 = r1
                r1 = r9
                r9 = r7
            L67:
                java.lang.Boolean r9 = (java.lang.Boolean) r9
                boolean r9 = r9.booleanValue()
                if (r9 == 0) goto La1
                pc.l<kotlin.coroutines.Continuation<? super dc.w>, java.lang.Object> r9 = r8.f5795r     // Catch: java.lang.Throwable -> L32
                r8.f5792m = r1     // Catch: java.lang.Throwable -> L32
                r8.f5791f = r4     // Catch: java.lang.Throwable -> L32
                java.lang.Object r9 = r9.invoke(r8)     // Catch: java.lang.Throwable -> L32
                if (r9 != r0) goto L7c
                return r0
            L7c:
                androidx.paging.i2 r9 = androidx.paging.i2.this
                androidx.paging.i2$c r9 = androidx.paging.i2.a(r9)
                r2 = 0
                r8.f5792m = r2
                r8.f5791f = r3
                java.lang.Object r9 = r9.a(r1, r8)
                if (r9 != r0) goto La1
                return r0
            L8e:
                androidx.paging.i2 r3 = androidx.paging.i2.this
                androidx.paging.i2$c r3 = androidx.paging.i2.a(r3)
                r8.f5792m = r9
                r8.f5791f = r2
                java.lang.Object r1 = r3.a(r1, r8)
                if (r1 != r0) goto L9f
                return r0
            L9f:
                r0 = r9
            La0:
                throw r0
            La1:
                dc.w r9 = dc.w.f13270a
                return r9
            La4:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "Internal error. coroutineScope should've created a job."
                java.lang.String r0 = r0.toString()
                r9.<init>(r0)
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.i2.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public i2() {
        this(false, 1, null);
    }

    public static /* synthetic */ Object c(i2 i2Var, int i10, pc.l lVar, Continuation continuation, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        return i2Var.b(i10, lVar, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(int r5, pc.l<? super kotlin.coroutines.Continuation<? super dc.w>, ? extends java.lang.Object> r6, kotlin.coroutines.Continuation<? super dc.w> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof androidx.paging.i2.d
            if (r0 == 0) goto L13
            r0 = r7
            androidx.paging.i2$d r0 = (androidx.paging.i2.d) r0
            int r1 = r0.f5790q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5790q = r1
            goto L18
        L13:
            androidx.paging.i2$d r0 = new androidx.paging.i2$d
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f5788m
            java.lang.Object r1 = ic.b.d()
            int r2 = r0.f5790q
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r5 = r0.f5787f
            androidx.paging.i2 r5 = (androidx.paging.i2) r5
            dc.n.b(r7)     // Catch: androidx.paging.i2.a -> L2d
            goto L53
        L2d:
            r6 = move-exception
            goto L4d
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            dc.n.b(r7)
            androidx.paging.i2$e r7 = new androidx.paging.i2$e     // Catch: androidx.paging.i2.a -> L4b
            r2 = 0
            r7.<init>(r5, r6, r2)     // Catch: androidx.paging.i2.a -> L4b
            r0.f5787f = r4     // Catch: androidx.paging.i2.a -> L4b
            r0.f5790q = r3     // Catch: androidx.paging.i2.a -> L4b
            java.lang.Object r5 = ad.l0.e(r7, r0)     // Catch: androidx.paging.i2.a -> L4b
            if (r5 != r1) goto L53
            return r1
        L4b:
            r6 = move-exception
            r5 = r4
        L4d:
            androidx.paging.i2 r7 = r6.a()
            if (r7 != r5) goto L56
        L53:
            dc.w r5 = dc.w.f13270a
            return r5
        L56:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.i2.b(int, pc.l, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public i2(boolean z10) {
        this.f5767a = new c(this, z10);
    }

    public /* synthetic */ i2(boolean z10, int i10, qc.h hVar) {
        this((i10 & 1) != 0 ? true : z10);
    }
}
