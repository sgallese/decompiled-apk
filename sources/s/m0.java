package s;

import j0.d3;
import j0.g2;
import j0.g3;
import kotlin.coroutines.Continuation;

/* compiled from: InfiniteTransition.kt */
/* loaded from: classes.dex */
public final class m0 {

    /* renamed from: f  reason: collision with root package name */
    public static final int f22764f = 8;

    /* renamed from: a  reason: collision with root package name */
    private final String f22765a;

    /* renamed from: b  reason: collision with root package name */
    private final k0.f<a<?, ?>> f22766b;

    /* renamed from: c  reason: collision with root package name */
    private final j0.j1 f22767c;

    /* renamed from: d  reason: collision with root package name */
    private long f22768d;

    /* renamed from: e  reason: collision with root package name */
    private final j0.j1 f22769e;

    /* compiled from: InfiniteTransition.kt */
    /* loaded from: classes.dex */
    public final class a<T, V extends q> implements g3<T> {

        /* renamed from: f  reason: collision with root package name */
        private T f22770f;

        /* renamed from: m  reason: collision with root package name */
        private T f22771m;

        /* renamed from: p  reason: collision with root package name */
        private final i1<T, V> f22772p;

        /* renamed from: q  reason: collision with root package name */
        private final String f22773q;

        /* renamed from: r  reason: collision with root package name */
        private final j0.j1 f22774r;

        /* renamed from: s  reason: collision with root package name */
        private j<T> f22775s;

        /* renamed from: t  reason: collision with root package name */
        private d1<T, V> f22776t;

        /* renamed from: u  reason: collision with root package name */
        private boolean f22777u;

        /* renamed from: v  reason: collision with root package name */
        private boolean f22778v;

        /* renamed from: w  reason: collision with root package name */
        private long f22779w;

        /* renamed from: x  reason: collision with root package name */
        final /* synthetic */ m0 f22780x;

        public a(m0 m0Var, T t10, T t11, i1<T, V> i1Var, j<T> jVar, String str) {
            j0.j1 e10;
            qc.q.i(i1Var, "typeConverter");
            qc.q.i(jVar, "animationSpec");
            qc.q.i(str, "label");
            this.f22780x = m0Var;
            this.f22770f = t10;
            this.f22771m = t11;
            this.f22772p = i1Var;
            this.f22773q = str;
            e10 = d3.e(t10, null, 2, null);
            this.f22774r = e10;
            this.f22775s = jVar;
            this.f22776t = new d1<>(this.f22775s, i1Var, this.f22770f, this.f22771m, null, 16, null);
        }

        public final T e() {
            return this.f22770f;
        }

        public final T f() {
            return this.f22771m;
        }

        @Override // j0.g3
        public T getValue() {
            return this.f22774r.getValue();
        }

        public final boolean j() {
            return this.f22777u;
        }

        public final void k(long j10) {
            this.f22780x.l(false);
            if (this.f22778v) {
                this.f22778v = false;
                this.f22779w = j10;
            }
            long j11 = j10 - this.f22779w;
            r(this.f22776t.f(j11));
            this.f22777u = this.f22776t.e(j11);
        }

        public final void m() {
            this.f22778v = true;
        }

        public void r(T t10) {
            this.f22774r.setValue(t10);
        }

        public final void s() {
            r(this.f22776t.g());
            this.f22778v = true;
        }

        public final void t(T t10, T t11, j<T> jVar) {
            qc.q.i(jVar, "animationSpec");
            this.f22770f = t10;
            this.f22771m = t11;
            this.f22775s = jVar;
            this.f22776t = new d1<>(jVar, this.f22772p, t10, t11, null, 16, null);
            this.f22780x.l(true);
            this.f22777u = false;
            this.f22778v = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: InfiniteTransition.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.animation.core.InfiniteTransition$run$1", f = "InfiniteTransition.kt", l = {181, 205}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super dc.w>, Object> {

        /* renamed from: f  reason: collision with root package name */
        Object f22781f;

        /* renamed from: m  reason: collision with root package name */
        int f22782m;

        /* renamed from: p  reason: collision with root package name */
        private /* synthetic */ Object f22783p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ j0.j1<g3<Long>> f22784q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ m0 f22785r;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: InfiniteTransition.kt */
        /* loaded from: classes.dex */
        public static final class a extends qc.r implements pc.l<Long, dc.w> {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ j0.j1<g3<Long>> f22786f;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ m0 f22787m;

            /* renamed from: p  reason: collision with root package name */
            final /* synthetic */ qc.c0 f22788p;

            /* renamed from: q  reason: collision with root package name */
            final /* synthetic */ ad.k0 f22789q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(j0.j1<g3<Long>> j1Var, m0 m0Var, qc.c0 c0Var, ad.k0 k0Var) {
                super(1);
                this.f22786f = j1Var;
                this.f22787m = m0Var;
                this.f22788p = c0Var;
                this.f22789q = k0Var;
            }

            /* JADX WARN: Code restructure failed: missing block: B:12:0x0039, code lost:
            
                if (r2 == false) goto L13;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void a(long r10) {
                /*
                    r9 = this;
                    j0.j1<j0.g3<java.lang.Long>> r0 = r9.f22786f
                    java.lang.Object r0 = r0.getValue()
                    j0.g3 r0 = (j0.g3) r0
                    if (r0 == 0) goto L15
                    java.lang.Object r0 = r0.getValue()
                    java.lang.Number r0 = (java.lang.Number) r0
                    long r0 = r0.longValue()
                    goto L16
                L15:
                    r0 = r10
                L16:
                    s.m0 r2 = r9.f22787m
                    long r2 = s.m0.a(r2)
                    r4 = -9223372036854775808
                    r6 = 1
                    r7 = 0
                    int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                    if (r8 == 0) goto L3b
                    qc.c0 r2 = r9.f22788p
                    float r2 = r2.f21658f
                    ad.k0 r3 = r9.f22789q
                    hc.f r3 = r3.getCoroutineContext()
                    float r3 = s.c1.l(r3)
                    int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
                    if (r2 != 0) goto L38
                    r2 = 1
                    goto L39
                L38:
                    r2 = 0
                L39:
                    if (r2 != 0) goto L69
                L3b:
                    s.m0 r2 = r9.f22787m
                    s.m0.e(r2, r10)
                    s.m0 r10 = r9.f22787m
                    k0.f r10 = s.m0.b(r10)
                    int r11 = r10.o()
                    if (r11 <= 0) goto L5b
                    java.lang.Object[] r10 = r10.n()
                    r2 = 0
                L51:
                    r3 = r10[r2]
                    s.m0$a r3 = (s.m0.a) r3
                    r3.m()
                    int r2 = r2 + r6
                    if (r2 < r11) goto L51
                L5b:
                    qc.c0 r10 = r9.f22788p
                    ad.k0 r11 = r9.f22789q
                    hc.f r11 = r11.getCoroutineContext()
                    float r11 = s.c1.l(r11)
                    r10.f21658f = r11
                L69:
                    qc.c0 r10 = r9.f22788p
                    float r10 = r10.f21658f
                    r11 = 0
                    int r10 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
                    if (r10 != 0) goto L74
                    r10 = 1
                    goto L75
                L74:
                    r10 = 0
                L75:
                    if (r10 == 0) goto L92
                    s.m0 r10 = r9.f22787m
                    k0.f r10 = s.m0.b(r10)
                    int r11 = r10.o()
                    if (r11 <= 0) goto La5
                    java.lang.Object[] r10 = r10.n()
                L87:
                    r0 = r10[r7]
                    s.m0$a r0 = (s.m0.a) r0
                    r0.s()
                    int r7 = r7 + r6
                    if (r7 < r11) goto L87
                    goto La5
                L92:
                    s.m0 r10 = r9.f22787m
                    long r10 = s.m0.a(r10)
                    long r0 = r0 - r10
                    float r10 = (float) r0
                    qc.c0 r11 = r9.f22788p
                    float r11 = r11.f21658f
                    float r10 = r10 / r11
                    long r10 = (long) r10
                    s.m0 r0 = r9.f22787m
                    s.m0.c(r0, r10)
                La5:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: s.m0.b.a.a(long):void");
            }

            @Override // pc.l
            public /* bridge */ /* synthetic */ dc.w invoke(Long l10) {
                a(l10.longValue());
                return dc.w.f13270a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: InfiniteTransition.kt */
        /* renamed from: s.m0$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0524b extends qc.r implements pc.a<Float> {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ ad.k0 f22790f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0524b(ad.k0 k0Var) {
                super(0);
                this.f22790f = k0Var;
            }

            @Override // pc.a
            /* renamed from: a  reason: merged with bridge method [inline-methods] */
            public final Float invoke() {
                return Float.valueOf(c1.l(this.f22790f.getCoroutineContext()));
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: InfiniteTransition.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.animation.core.InfiniteTransition$run$1$3", f = "InfiniteTransition.kt", l = {}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class c extends kotlin.coroutines.jvm.internal.l implements pc.p<Float, Continuation<? super Boolean>, Object> {

            /* renamed from: f  reason: collision with root package name */
            int f22791f;

            /* renamed from: m  reason: collision with root package name */
            /* synthetic */ float f22792m;

            c(Continuation<? super c> continuation) {
                super(2, continuation);
            }

            public final Object a(float f10, Continuation<? super Boolean> continuation) {
                return ((c) create(Float.valueOf(f10), continuation)).invokeSuspend(dc.w.f13270a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
                c cVar = new c(continuation);
                cVar.f22792m = ((Number) obj).floatValue();
                return cVar;
            }

            @Override // pc.p
            public /* bridge */ /* synthetic */ Object invoke(Float f10, Continuation<? super Boolean> continuation) {
                return a(f10.floatValue(), continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                boolean z10;
                ic.d.d();
                if (this.f22791f == 0) {
                    dc.n.b(obj);
                    if (this.f22792m > 0.0f) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    return kotlin.coroutines.jvm.internal.b.a(z10);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(j0.j1<g3<Long>> j1Var, m0 m0Var, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f22784q = j1Var;
            this.f22785r = m0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
            b bVar = new b(this.f22784q, this.f22785r, continuation);
            bVar.f22783p = obj;
            return bVar;
        }

        @Override // pc.p
        public final Object invoke(ad.k0 k0Var, Continuation<? super dc.w> continuation) {
            return ((b) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
            */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0057 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:17:0x005f  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0061  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0064  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0062 -> B:12:0x0042). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x007d -> B:12:0x0042). Please submit an issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = ic.b.d()
                int r1 = r8.f22782m
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L31
                if (r1 == r3) goto L23
                if (r1 != r2) goto L1b
                java.lang.Object r1 = r8.f22781f
                qc.c0 r1 = (qc.c0) r1
                java.lang.Object r4 = r8.f22783p
                ad.k0 r4 = (ad.k0) r4
                dc.n.b(r9)
                r9 = r4
                goto L41
            L1b:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L23:
                java.lang.Object r1 = r8.f22781f
                qc.c0 r1 = (qc.c0) r1
                java.lang.Object r4 = r8.f22783p
                ad.k0 r4 = (ad.k0) r4
                dc.n.b(r9)
                r9 = r4
                r4 = r8
                goto L58
            L31:
                dc.n.b(r9)
                java.lang.Object r9 = r8.f22783p
                ad.k0 r9 = (ad.k0) r9
                qc.c0 r1 = new qc.c0
                r1.<init>()
                r4 = 1065353216(0x3f800000, float:1.0)
                r1.f21658f = r4
            L41:
                r4 = r8
            L42:
                s.m0$b$a r5 = new s.m0$b$a
                j0.j1<j0.g3<java.lang.Long>> r6 = r4.f22784q
                s.m0 r7 = r4.f22785r
                r5.<init>(r6, r7, r1, r9)
                r4.f22783p = r9
                r4.f22781f = r1
                r4.f22782m = r3
                java.lang.Object r5 = s.k0.a(r5, r4)
                if (r5 != r0) goto L58
                return r0
            L58:
                float r5 = r1.f21658f
                r6 = 0
                int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
                if (r5 != 0) goto L61
                r5 = 1
                goto L62
            L61:
                r5 = 0
            L62:
                if (r5 == 0) goto L42
                s.m0$b$b r5 = new s.m0$b$b
                r5.<init>(r9)
                dd.g r5 = j0.y2.n(r5)
                s.m0$b$c r6 = new s.m0$b$c
                r7 = 0
                r6.<init>(r7)
                r4.f22783p = r9
                r4.f22781f = r1
                r4.f22782m = r2
                java.lang.Object r5 = dd.i.w(r5, r6, r4)
                if (r5 != r0) goto L42
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: s.m0.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: InfiniteTransition.kt */
    /* loaded from: classes.dex */
    public static final class c extends qc.r implements pc.p<j0.l, Integer, dc.w> {

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ int f22794m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(int i10) {
            super(2);
            this.f22794m = i10;
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ dc.w invoke(j0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return dc.w.f13270a;
        }

        public final void invoke(j0.l lVar, int i10) {
            m0.this.k(lVar, j0.z1.a(this.f22794m | 1));
        }
    }

    public m0(String str) {
        j0.j1 e10;
        j0.j1 e11;
        qc.q.i(str, "label");
        this.f22765a = str;
        this.f22766b = new k0.f<>(new a[16], 0);
        e10 = d3.e(Boolean.FALSE, null, 2, null);
        this.f22767c = e10;
        this.f22768d = Long.MIN_VALUE;
        e11 = d3.e(Boolean.TRUE, null, 2, null);
        this.f22769e = e11;
    }

    private final boolean g() {
        return ((Boolean) this.f22767c.getValue()).booleanValue();
    }

    private final boolean h() {
        return ((Boolean) this.f22769e.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i(long j10) {
        boolean z10;
        k0.f<a<?, ?>> fVar = this.f22766b;
        int o10 = fVar.o();
        if (o10 > 0) {
            a<?, ?>[] n10 = fVar.n();
            int i10 = 0;
            z10 = true;
            do {
                a<?, ?> aVar = n10[i10];
                if (!aVar.j()) {
                    aVar.k(j10);
                }
                if (!aVar.j()) {
                    z10 = false;
                }
                i10++;
            } while (i10 < o10);
        } else {
            z10 = true;
        }
        m(!z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l(boolean z10) {
        this.f22767c.setValue(Boolean.valueOf(z10));
    }

    private final void m(boolean z10) {
        this.f22769e.setValue(Boolean.valueOf(z10));
    }

    public final void f(a<?, ?> aVar) {
        qc.q.i(aVar, "animation");
        this.f22766b.d(aVar);
        l(true);
    }

    public final void j(a<?, ?> aVar) {
        qc.q.i(aVar, "animation");
        this.f22766b.v(aVar);
    }

    public final void k(j0.l lVar, int i10) {
        j0.l q10 = lVar.q(-318043801);
        if (j0.n.K()) {
            j0.n.V(-318043801, i10, -1, "androidx.compose.animation.core.InfiniteTransition.run (InfiniteTransition.kt:171)");
        }
        q10.e(-492369756);
        Object f10 = q10.f();
        if (f10 == j0.l.f18688a.a()) {
            f10 = d3.e(null, null, 2, null);
            q10.J(f10);
        }
        q10.N();
        j0.j1 j1Var = (j0.j1) f10;
        if (h() || g()) {
            j0.h0.d(this, new b(j1Var, this, null), q10, 72);
        }
        if (j0.n.K()) {
            j0.n.U();
        }
        g2 w10 = q10.w();
        if (w10 != null) {
            w10.a(new c(i10));
        }
    }
}
