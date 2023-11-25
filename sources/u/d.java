package u;

import ad.a2;
import ad.c2;
import ad.k0;
import ad.m0;
import ad.x1;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import n1.r0;
import n1.s0;

/* compiled from: ContentInViewModifier.kt */
/* loaded from: classes.dex */
public final class d implements z.e, s0, r0 {

    /* renamed from: c  reason: collision with root package name */
    private final k0 f23780c;

    /* renamed from: d  reason: collision with root package name */
    private final o f23781d;

    /* renamed from: e  reason: collision with root package name */
    private final x f23782e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f23783f;

    /* renamed from: g  reason: collision with root package name */
    private final u.c f23784g;

    /* renamed from: h  reason: collision with root package name */
    private n1.s f23785h;

    /* renamed from: i  reason: collision with root package name */
    private n1.s f23786i;

    /* renamed from: j  reason: collision with root package name */
    private z0.h f23787j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f23788k;

    /* renamed from: l  reason: collision with root package name */
    private long f23789l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f23790m;

    /* renamed from: n  reason: collision with root package name */
    private final a0 f23791n;

    /* renamed from: o  reason: collision with root package name */
    private final androidx.compose.ui.e f23792o;

    /* compiled from: ContentInViewModifier.kt */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final pc.a<z0.h> f23793a;

        /* renamed from: b  reason: collision with root package name */
        private final ad.m<dc.w> f23794b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(pc.a<z0.h> aVar, ad.m<? super dc.w> mVar) {
            qc.q.i(aVar, "currentBounds");
            qc.q.i(mVar, "continuation");
            this.f23793a = aVar;
            this.f23794b = mVar;
        }

        public final ad.m<dc.w> a() {
            return this.f23794b;
        }

        public final pc.a<z0.h> b() {
            return this.f23793a;
        }

        /* JADX WARN: Code restructure failed: missing block: B:9:0x004e, code lost:
        
            if (r0 == null) goto L10;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.String toString() {
            /*
                r4 = this;
                ad.m<dc.w> r0 = r4.f23794b
                hc.f r0 = r0.getContext()
                ad.j0$a r1 = ad.j0.f529m
                hc.f$b r0 = r0.get(r1)
                ad.j0 r0 = (ad.j0) r0
                if (r0 == 0) goto L15
                java.lang.String r0 = r0.A0()
                goto L16
            L15:
                r0 = 0
            L16:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Request@"
                r1.append(r2)
                int r2 = r4.hashCode()
                r3 = 16
                int r3 = yc.a.a(r3)
                java.lang.String r2 = java.lang.Integer.toString(r2, r3)
                java.lang.String r3 = "toString(this, checkRadix(radix))"
                qc.q.h(r2, r3)
                r1.append(r2)
                if (r0 == 0) goto L50
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r3 = 91
                r2.append(r3)
                r2.append(r0)
                java.lang.String r0 = "]("
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                if (r0 != 0) goto L52
            L50:
                java.lang.String r0 = "("
            L52:
                r1.append(r0)
                java.lang.String r0 = "currentBounds()="
                r1.append(r0)
                pc.a<z0.h> r0 = r4.f23793a
                java.lang.Object r0 = r0.invoke()
                r1.append(r0)
                java.lang.String r0 = ", continuation="
                r1.append(r0)
                ad.m<dc.w> r0 = r4.f23794b
                r1.append(r0)
                r0 = 41
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: u.d.a.toString():java.lang.String");
        }
    }

    /* compiled from: ContentInViewModifier.kt */
    /* loaded from: classes.dex */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f23795a;

        static {
            int[] iArr = new int[o.values().length];
            try {
                iArr[o.Vertical.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[o.Horizontal.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f23795a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ContentInViewModifier.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.ContentInViewModifier$launchAnimation$1", f = "ContentInViewModifier.kt", l = {193}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.l implements pc.p<k0, Continuation<? super dc.w>, Object> {

        /* renamed from: f  reason: collision with root package name */
        int f23796f;

        /* renamed from: m  reason: collision with root package name */
        private /* synthetic */ Object f23797m;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ContentInViewModifier.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.ContentInViewModifier$launchAnimation$1$1", f = "ContentInViewModifier.kt", l = {198}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements pc.p<u, Continuation<? super dc.w>, Object> {

            /* renamed from: f  reason: collision with root package name */
            int f23799f;

            /* renamed from: m  reason: collision with root package name */
            private /* synthetic */ Object f23800m;

            /* renamed from: p  reason: collision with root package name */
            final /* synthetic */ d f23801p;

            /* renamed from: q  reason: collision with root package name */
            final /* synthetic */ x1 f23802q;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: ContentInViewModifier.kt */
            /* renamed from: u.d$c$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0552a extends qc.r implements pc.l<Float, dc.w> {

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ d f23803f;

                /* renamed from: m  reason: collision with root package name */
                final /* synthetic */ u f23804m;

                /* renamed from: p  reason: collision with root package name */
                final /* synthetic */ x1 f23805p;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0552a(d dVar, u uVar, x1 x1Var) {
                    super(1);
                    this.f23803f = dVar;
                    this.f23804m = uVar;
                    this.f23805p = x1Var;
                }

                public final void a(float f10) {
                    float f11;
                    if (this.f23803f.f23783f) {
                        f11 = 1.0f;
                    } else {
                        f11 = -1.0f;
                    }
                    float a10 = f11 * this.f23804m.a(f11 * f10);
                    if (a10 < f10) {
                        c2.e(this.f23805p, "Scroll animation cancelled because scroll was not consumed (" + a10 + " < " + f10 + ')', null, 2, null);
                    }
                }

                @Override // pc.l
                public /* bridge */ /* synthetic */ dc.w invoke(Float f10) {
                    a(f10.floatValue());
                    return dc.w.f13270a;
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: ContentInViewModifier.kt */
            /* loaded from: classes.dex */
            public static final class b extends qc.r implements pc.a<dc.w> {

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ d f23806f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(d dVar) {
                    super(0);
                    this.f23806f = dVar;
                }

                @Override // pc.a
                public /* bridge */ /* synthetic */ dc.w invoke() {
                    invoke2();
                    return dc.w.f13270a;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    u.c cVar = this.f23806f.f23784g;
                    d dVar = this.f23806f;
                    while (true) {
                        if (!cVar.f23777a.s()) {
                            break;
                        }
                        z0.h invoke = ((a) cVar.f23777a.t()).b().invoke();
                        if (!(invoke == null ? true : d.R(dVar, invoke, 0L, 1, null))) {
                            break;
                        }
                        ((a) cVar.f23777a.x(cVar.f23777a.o() - 1)).a().resumeWith(dc.m.a(dc.w.f13270a));
                    }
                    if (this.f23806f.f23788k) {
                        z0.h O = this.f23806f.O();
                        if (O != null && d.R(this.f23806f, O, 0L, 1, null)) {
                            this.f23806f.f23788k = false;
                        }
                    }
                    this.f23806f.f23791n.j(this.f23806f.J());
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(d dVar, x1 x1Var, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f23801p = dVar;
                this.f23802q = x1Var;
            }

            @Override // pc.p
            /* renamed from: a  reason: merged with bridge method [inline-methods] */
            public final Object invoke(u uVar, Continuation<? super dc.w> continuation) {
                return ((a) create(uVar, continuation)).invokeSuspend(dc.w.f13270a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(this.f23801p, this.f23802q, continuation);
                aVar.f23800m = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object d10;
                d10 = ic.d.d();
                int i10 = this.f23799f;
                if (i10 != 0) {
                    if (i10 == 1) {
                        dc.n.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    dc.n.b(obj);
                    u uVar = (u) this.f23800m;
                    this.f23801p.f23791n.j(this.f23801p.J());
                    a0 a0Var = this.f23801p.f23791n;
                    C0552a c0552a = new C0552a(this.f23801p, uVar, this.f23802q);
                    b bVar = new b(this.f23801p);
                    this.f23799f = 1;
                    if (a0Var.h(c0552a, bVar, this) == d10) {
                        return d10;
                    }
                }
                return dc.w.f13270a;
            }
        }

        c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
            c cVar = new c(continuation);
            cVar.f23797m = obj;
            return cVar;
        }

        @Override // pc.p
        public final Object invoke(k0 k0Var, Continuation<? super dc.w> continuation) {
            return ((c) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d10;
            d10 = ic.d.d();
            int i10 = this.f23796f;
            try {
                try {
                    if (i10 != 0) {
                        if (i10 == 1) {
                            dc.n.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        dc.n.b(obj);
                        x1 l10 = a2.l(((k0) this.f23797m).getCoroutineContext());
                        d.this.f23790m = true;
                        x xVar = d.this.f23782e;
                        a aVar = new a(d.this, l10, null);
                        this.f23796f = 1;
                        if (w.c(xVar, null, aVar, this, 1, null) == d10) {
                            return d10;
                        }
                    }
                    d.this.f23784g.d();
                    d.this.f23790m = false;
                    d.this.f23784g.b(null);
                    d.this.f23788k = false;
                    return dc.w.f13270a;
                } catch (CancellationException e10) {
                    throw e10;
                }
            } catch (Throwable th) {
                d.this.f23790m = false;
                d.this.f23784g.b(null);
                d.this.f23788k = false;
                throw th;
            }
        }
    }

    /* compiled from: ContentInViewModifier.kt */
    /* renamed from: u.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static final class C0553d extends qc.r implements pc.l<n1.s, dc.w> {
        C0553d() {
            super(1);
        }

        public final void a(n1.s sVar) {
            d.this.f23786i = sVar;
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ dc.w invoke(n1.s sVar) {
            a(sVar);
            return dc.w.f13270a;
        }
    }

    public d(k0 k0Var, o oVar, x xVar, boolean z10) {
        qc.q.i(k0Var, "scope");
        qc.q.i(oVar, "orientation");
        qc.q.i(xVar, "scrollState");
        this.f23780c = k0Var;
        this.f23781d = oVar;
        this.f23782e = xVar;
        this.f23783f = z10;
        this.f23784g = new u.c();
        this.f23789l = j2.p.f19001b.a();
        this.f23791n = new a0();
        this.f23792o = androidx.compose.foundation.relocation.e.b(androidx.compose.foundation.n.b(this, new C0553d()), this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float J() {
        if (j2.p.e(this.f23789l, j2.p.f19001b.a())) {
            return 0.0f;
        }
        z0.h N = N();
        if (N == null) {
            if (this.f23788k) {
                N = O();
            } else {
                N = null;
            }
            if (N == null) {
                return 0.0f;
            }
        }
        long c10 = j2.q.c(this.f23789l);
        int i10 = b.f23795a[this.f23781d.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                return T(N.i(), N.j(), z0.l.i(c10));
            }
            throw new NoWhenBranchMatchedException();
        }
        return T(N.l(), N.e(), z0.l.g(c10));
    }

    private final int K(long j10, long j11) {
        int i10 = b.f23795a[this.f23781d.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                return qc.q.k(j2.p.g(j10), j2.p.g(j11));
            }
            throw new NoWhenBranchMatchedException();
        }
        return qc.q.k(j2.p.f(j10), j2.p.f(j11));
    }

    private final int L(long j10, long j11) {
        int i10 = b.f23795a[this.f23781d.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                return Float.compare(z0.l.i(j10), z0.l.i(j11));
            }
            throw new NoWhenBranchMatchedException();
        }
        return Float.compare(z0.l.g(j10), z0.l.g(j11));
    }

    private final z0.h M(z0.h hVar, long j10) {
        return hVar.r(z0.f.w(U(hVar, j10)));
    }

    private final z0.h N() {
        k0.f fVar = this.f23784g.f23777a;
        int o10 = fVar.o();
        z0.h hVar = null;
        if (o10 > 0) {
            int i10 = o10 - 1;
            Object[] n10 = fVar.n();
            do {
                z0.h invoke = ((a) n10[i10]).b().invoke();
                if (invoke != null) {
                    if (L(invoke.k(), j2.q.c(this.f23789l)) <= 0) {
                        hVar = invoke;
                    } else {
                        return hVar;
                    }
                }
                i10--;
            } while (i10 >= 0);
        }
        return hVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final z0.h O() {
        n1.s sVar;
        n1.s sVar2 = this.f23785h;
        if (sVar2 != null) {
            if (!sVar2.r()) {
                sVar2 = null;
            }
            if (sVar2 != null && (sVar = this.f23786i) != null) {
                if (!sVar.r()) {
                    sVar = null;
                }
                if (sVar != null) {
                    return sVar2.L(sVar, false);
                }
            }
        }
        return null;
    }

    private final boolean Q(z0.h hVar, long j10) {
        return z0.f.l(U(hVar, j10), z0.f.f26354b.c());
    }

    static /* synthetic */ boolean R(d dVar, z0.h hVar, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = dVar.f23789l;
        }
        return dVar.Q(hVar, j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void S() {
        if ((!this.f23790m) != false) {
            ad.i.d(this.f23780c, null, m0.UNDISPATCHED, new c(null), 1, null);
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    private final float T(float f10, float f11, float f12) {
        if ((f10 >= 0.0f && f11 <= f12) || (f10 < 0.0f && f11 > f12)) {
            return 0.0f;
        }
        float f13 = f11 - f12;
        if (Math.abs(f10) >= Math.abs(f13)) {
            return f13;
        }
        return f10;
    }

    private final long U(z0.h hVar, long j10) {
        long c10 = j2.q.c(j10);
        int i10 = b.f23795a[this.f23781d.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                return z0.g.a(T(hVar.i(), hVar.j(), z0.l.i(c10)), 0.0f);
            }
            throw new NoWhenBranchMatchedException();
        }
        return z0.g.a(0.0f, T(hVar.l(), hVar.e(), z0.l.g(c10)));
    }

    public final androidx.compose.ui.e P() {
        return this.f23792o;
    }

    @Override // androidx.compose.ui.e
    public /* synthetic */ androidx.compose.ui.e a(androidx.compose.ui.e eVar) {
        return v0.d.a(this, eVar);
    }

    @Override // androidx.compose.ui.e
    public /* synthetic */ Object b(Object obj, pc.p pVar) {
        return v0.e.b(this, obj, pVar);
    }

    @Override // z.e
    public Object e(pc.a<z0.h> aVar, Continuation<? super dc.w> continuation) {
        Continuation c10;
        Object d10;
        Object d11;
        z0.h invoke = aVar.invoke();
        boolean z10 = false;
        if (invoke != null && !R(this, invoke, 0L, 1, null)) {
            z10 = true;
        }
        if (z10) {
            c10 = ic.c.c(continuation);
            ad.n nVar = new ad.n(c10, 1);
            nVar.A();
            if (this.f23784g.c(new a(aVar, nVar)) && !this.f23790m) {
                S();
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
            return dc.w.f13270a;
        }
        return dc.w.f13270a;
    }

    @Override // n1.s0
    public void g(long j10) {
        z0.h O;
        long j11 = this.f23789l;
        this.f23789l = j10;
        if (K(j10, j11) < 0 && (O = O()) != null) {
            z0.h hVar = this.f23787j;
            if (hVar == null) {
                hVar = O;
            }
            if (!this.f23790m && !this.f23788k && Q(hVar, j11) && !Q(O, j10)) {
                this.f23788k = true;
                S();
            }
            this.f23787j = O;
        }
    }

    @Override // androidx.compose.ui.e
    public /* synthetic */ boolean h(pc.l lVar) {
        return v0.e.a(this, lVar);
    }

    @Override // z.e
    public z0.h m(z0.h hVar) {
        qc.q.i(hVar, "localRect");
        if ((!j2.p.e(this.f23789l, j2.p.f19001b.a())) != false) {
            return M(hVar, this.f23789l);
        }
        throw new IllegalStateException("Expected BringIntoViewRequester to not be used before parents are placed.".toString());
    }

    @Override // n1.r0
    public void p(n1.s sVar) {
        qc.q.i(sVar, "coordinates");
        this.f23785h = sVar;
    }
}
