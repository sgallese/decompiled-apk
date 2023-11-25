package androidx.compose.foundation.gestures;

import androidx.recyclerview.widget.RecyclerView;
import dc.n;
import dc.w;
import j0.d3;
import j0.g3;
import j0.j1;
import j2.v;
import kotlin.coroutines.Continuation;
import pc.l;
import pc.p;
import qc.e0;
import qc.q;
import qc.r;
import t.i0;
import u.m;
import u.o;
import u.u;
import u.x;
import z0.f;
import z0.g;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Scrollable.kt */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    private final o f1962a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f1963b;

    /* renamed from: c  reason: collision with root package name */
    private final g3<j1.c> f1964c;

    /* renamed from: d  reason: collision with root package name */
    private final x f1965d;

    /* renamed from: e  reason: collision with root package name */
    private final m f1966e;

    /* renamed from: f  reason: collision with root package name */
    private final i0 f1967f;

    /* renamed from: g  reason: collision with root package name */
    private final j1<Boolean> f1968g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Scrollable.kt */
    /* loaded from: classes.dex */
    public static final class a extends r implements l<f, f> {

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ int f1970m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ u f1971p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i10, u uVar) {
            super(1);
            this.f1970m = i10;
            this.f1971p = uVar;
        }

        public final long a(long j10) {
            j1.c value = e.this.d().getValue();
            long d10 = value.d(j10, this.f1970m);
            long s10 = f.s(j10, d10);
            e eVar = e.this;
            long k10 = eVar.k(eVar.q(this.f1971p.a(eVar.p(eVar.k(s10)))));
            return f.t(f.t(d10, k10), value.b(k10, f.s(s10, k10), this.f1970m));
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ f invoke(f fVar) {
            return f.d(a(fVar.x()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Scrollable.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.ScrollingLogic", f = "Scrollable.kt", l = {488}, m = "doFlingAnimation-QWom1Mo")
    /* loaded from: classes.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: f  reason: collision with root package name */
        Object f1972f;

        /* renamed from: m  reason: collision with root package name */
        /* synthetic */ Object f1973m;

        /* renamed from: q  reason: collision with root package name */
        int f1975q;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f1973m = obj;
            this.f1975q |= RecyclerView.UNDEFINED_DURATION;
            return e.this.b(0L, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Scrollable.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2", f = "Scrollable.kt", l = {500}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.l implements p<u, Continuation<? super w>, Object> {

        /* renamed from: f  reason: collision with root package name */
        Object f1976f;

        /* renamed from: m  reason: collision with root package name */
        Object f1977m;

        /* renamed from: p  reason: collision with root package name */
        long f1978p;

        /* renamed from: q  reason: collision with root package name */
        int f1979q;

        /* renamed from: r  reason: collision with root package name */
        private /* synthetic */ Object f1980r;

        /* renamed from: t  reason: collision with root package name */
        final /* synthetic */ e0 f1982t;

        /* renamed from: u  reason: collision with root package name */
        final /* synthetic */ long f1983u;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Scrollable.kt */
        /* loaded from: classes.dex */
        public static final class a extends r implements l<f, f> {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ e f1984f;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ u f1985m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(e eVar, u uVar) {
                super(1);
                this.f1984f = eVar;
                this.f1985m = uVar;
            }

            public final long a(long j10) {
                e eVar = this.f1984f;
                return eVar.k(eVar.a(this.f1985m, eVar.k(j10), j1.f.f18968a.b()));
            }

            @Override // pc.l
            public /* bridge */ /* synthetic */ f invoke(f fVar) {
                return f.d(a(fVar.x()));
            }
        }

        /* compiled from: Scrollable.kt */
        /* loaded from: classes.dex */
        public static final class b implements u {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ e f1986a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ l<f, f> f1987b;

            /* JADX WARN: Multi-variable type inference failed */
            b(e eVar, l<? super f, f> lVar) {
                this.f1986a = eVar;
                this.f1987b = lVar;
            }

            @Override // u.u
            public float a(float f10) {
                e eVar = this.f1986a;
                return eVar.p(this.f1987b.invoke(f.d(eVar.q(f10))).x());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(e0 e0Var, long j10, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f1982t = e0Var;
            this.f1983u = j10;
        }

        @Override // pc.p
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final Object invoke(u uVar, Continuation<? super w> continuation) {
            return ((c) create(uVar, continuation)).invokeSuspend(w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<w> create(Object obj, Continuation<?> continuation) {
            c cVar = new c(this.f1982t, this.f1983u, continuation);
            cVar.f1980r = obj;
            return cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d10;
            e eVar;
            e0 e0Var;
            e eVar2;
            long j10;
            d10 = ic.d.d();
            int i10 = this.f1979q;
            if (i10 != 0) {
                if (i10 == 1) {
                    j10 = this.f1978p;
                    e0Var = (e0) this.f1977m;
                    eVar = (e) this.f1976f;
                    eVar2 = (e) this.f1980r;
                    n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                n.b(obj);
                b bVar = new b(e.this, new a(e.this, (u) this.f1980r));
                eVar = e.this;
                e0 e0Var2 = this.f1982t;
                long j11 = this.f1983u;
                m c10 = eVar.c();
                long j12 = e0Var2.f21668f;
                float j13 = eVar.j(eVar.o(j11));
                this.f1980r = eVar;
                this.f1976f = eVar;
                this.f1977m = e0Var2;
                this.f1978p = j12;
                this.f1979q = 1;
                obj = c10.a(bVar, j13, this);
                if (obj == d10) {
                    return d10;
                }
                e0Var = e0Var2;
                eVar2 = eVar;
                j10 = j12;
            }
            e0Var.f21668f = eVar.r(j10, eVar2.j(((Number) obj).floatValue()));
            return w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Scrollable.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.ScrollingLogic", f = "Scrollable.kt", l = {477, 479}, m = "onDragStopped-sF-c-tU")
    /* loaded from: classes.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: f  reason: collision with root package name */
        Object f1988f;

        /* renamed from: m  reason: collision with root package name */
        /* synthetic */ Object f1989m;

        /* renamed from: q  reason: collision with root package name */
        int f1991q;

        d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f1989m = obj;
            this.f1991q |= RecyclerView.UNDEFINED_DURATION;
            return e.this.g(0L, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Scrollable.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.ScrollingLogic$onDragStopped$performFling$1", f = "Scrollable.kt", l = {464, 466, 468}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.e$e  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0022e extends kotlin.coroutines.jvm.internal.l implements p<v, Continuation<? super v>, Object> {

        /* renamed from: f  reason: collision with root package name */
        long f1992f;

        /* renamed from: m  reason: collision with root package name */
        int f1993m;

        /* renamed from: p  reason: collision with root package name */
        /* synthetic */ long f1994p;

        C0022e(Continuation<? super C0022e> continuation) {
            super(2, continuation);
        }

        public final Object a(long j10, Continuation<? super v> continuation) {
            return ((C0022e) create(v.b(j10), continuation)).invokeSuspend(w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<w> create(Object obj, Continuation<?> continuation) {
            C0022e c0022e = new C0022e(continuation);
            c0022e.f1994p = ((v) obj).o();
            return c0022e;
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ Object invoke(v vVar, Continuation<? super v> continuation) {
            return a(vVar.o(), continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0093 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0094  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                java.lang.Object r6 = ic.b.d()
                int r0 = r13.f1993m
                r1 = 3
                r2 = 2
                r3 = 1
                if (r0 == 0) goto L35
                if (r0 == r3) goto L2e
                if (r0 == r2) goto L24
                if (r0 != r1) goto L1c
                long r0 = r13.f1992f
                long r2 = r13.f1994p
                dc.n.b(r14)
                r9 = r0
                r0 = r14
                goto L95
            L1c:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L24:
                long r2 = r13.f1992f
                long r4 = r13.f1994p
                dc.n.b(r14)
                r0 = r14
                r7 = r4
                goto L6e
            L2e:
                long r3 = r13.f1994p
                dc.n.b(r14)
                r0 = r14
                goto L52
            L35:
                dc.n.b(r14)
                long r4 = r13.f1994p
                androidx.compose.foundation.gestures.e r0 = androidx.compose.foundation.gestures.e.this
                j0.g3 r0 = r0.d()
                java.lang.Object r0 = r0.getValue()
                j1.c r0 = (j1.c) r0
                r13.f1994p = r4
                r13.f1993m = r3
                java.lang.Object r0 = r0.c(r4, r13)
                if (r0 != r6) goto L51
                return r6
            L51:
                r3 = r4
            L52:
                j2.v r0 = (j2.v) r0
                long r7 = r0.o()
                long r7 = j2.v.k(r3, r7)
                androidx.compose.foundation.gestures.e r0 = androidx.compose.foundation.gestures.e.this
                r13.f1994p = r3
                r13.f1992f = r7
                r13.f1993m = r2
                java.lang.Object r0 = r0.b(r7, r13)
                if (r0 != r6) goto L6b
                return r6
            L6b:
                r11 = r3
                r2 = r7
                r7 = r11
            L6e:
                j2.v r0 = (j2.v) r0
                long r9 = r0.o()
                androidx.compose.foundation.gestures.e r0 = androidx.compose.foundation.gestures.e.this
                j0.g3 r0 = r0.d()
                java.lang.Object r0 = r0.getValue()
                j1.c r0 = (j1.c) r0
                long r2 = j2.v.k(r2, r9)
                r13.f1994p = r7
                r13.f1992f = r9
                r13.f1993m = r1
                r1 = r2
                r3 = r9
                r5 = r13
                java.lang.Object r0 = r0.a(r1, r3, r5)
                if (r0 != r6) goto L94
                return r6
            L94:
                r2 = r7
            L95:
                j2.v r0 = (j2.v) r0
                long r0 = r0.o()
                long r0 = j2.v.k(r9, r0)
                long r0 = j2.v.k(r2, r0)
                j2.v r0 = j2.v.b(r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.e.C0022e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public e(o oVar, boolean z10, g3<j1.c> g3Var, x xVar, m mVar, i0 i0Var) {
        j1<Boolean> e10;
        q.i(oVar, "orientation");
        q.i(g3Var, "nestedScrollDispatcher");
        q.i(xVar, "scrollableState");
        q.i(mVar, "flingBehavior");
        this.f1962a = oVar;
        this.f1963b = z10;
        this.f1964c = g3Var;
        this.f1965d = xVar;
        this.f1966e = mVar;
        this.f1967f = i0Var;
        e10 = d3.e(Boolean.FALSE, null, 2, null);
        this.f1968g = e10;
    }

    private final boolean f() {
        if (!this.f1965d.a() && !this.f1965d.d()) {
            return false;
        }
        return true;
    }

    public final long a(u uVar, long j10, int i10) {
        q.i(uVar, "$this$dispatchScroll");
        long m10 = m(j10);
        a aVar = new a(i10, uVar);
        if (this.f1967f != null && f()) {
            return this.f1967f.a(m10, i10, aVar);
        }
        return aVar.invoke(f.d(m10)).x();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(long r13, kotlin.coroutines.Continuation<? super j2.v> r15) {
        /*
            r12 = this;
            boolean r0 = r15 instanceof androidx.compose.foundation.gestures.e.b
            if (r0 == 0) goto L13
            r0 = r15
            androidx.compose.foundation.gestures.e$b r0 = (androidx.compose.foundation.gestures.e.b) r0
            int r1 = r0.f1975q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1975q = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.e$b r0 = new androidx.compose.foundation.gestures.e$b
            r0.<init>(r15)
        L18:
            r4 = r0
            java.lang.Object r15 = r4.f1973m
            java.lang.Object r0 = ic.b.d()
            int r1 = r4.f1975q
            r2 = 1
            if (r1 == 0) goto L36
            if (r1 != r2) goto L2e
            java.lang.Object r13 = r4.f1972f
            qc.e0 r13 = (qc.e0) r13
            dc.n.b(r15)
            goto L5d
        L2e:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L36:
            dc.n.b(r15)
            qc.e0 r15 = new qc.e0
            r15.<init>()
            r15.f21668f = r13
            u.x r1 = r12.f1965d
            r3 = 0
            androidx.compose.foundation.gestures.e$c r11 = new androidx.compose.foundation.gestures.e$c
            r10 = 0
            r5 = r11
            r6 = r12
            r7 = r15
            r8 = r13
            r5.<init>(r7, r8, r10)
            r5 = 1
            r6 = 0
            r4.f1972f = r15
            r4.f1975q = r2
            r2 = r3
            r3 = r11
            java.lang.Object r13 = u.w.c(r1, r2, r3, r4, r5, r6)
            if (r13 != r0) goto L5c
            return r0
        L5c:
            r13 = r15
        L5d:
            long r13 = r13.f21668f
            j2.v r13 = j2.v.b(r13)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.e.b(long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final m c() {
        return this.f1966e;
    }

    public final g3<j1.c> d() {
        return this.f1964c;
    }

    public final x e() {
        return this.f1965d;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(long r6, kotlin.coroutines.Continuation<? super dc.w> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof androidx.compose.foundation.gestures.e.d
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.foundation.gestures.e$d r0 = (androidx.compose.foundation.gestures.e.d) r0
            int r1 = r0.f1991q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1991q = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.e$d r0 = new androidx.compose.foundation.gestures.e$d
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f1989m
            java.lang.Object r1 = ic.b.d()
            int r2 = r0.f1991q
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L39
            if (r2 == r4) goto L31
            if (r2 != r3) goto L29
            goto L31
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            java.lang.Object r6 = r0.f1988f
            androidx.compose.foundation.gestures.e r6 = (androidx.compose.foundation.gestures.e) r6
            dc.n.b(r8)
            goto L71
        L39:
            dc.n.b(r8)
            r5.i(r4)
            long r6 = r5.n(r6)
            androidx.compose.foundation.gestures.e$e r8 = new androidx.compose.foundation.gestures.e$e
            r2 = 0
            r8.<init>(r2)
            t.i0 r2 = r5.f1967f
            if (r2 == 0) goto L62
            boolean r2 = r5.f()
            if (r2 == 0) goto L62
            t.i0 r2 = r5.f1967f
            r0.f1988f = r5
            r0.f1991q = r4
            java.lang.Object r6 = r2.d(r6, r8, r0)
            if (r6 != r1) goto L60
            return r1
        L60:
            r6 = r5
            goto L71
        L62:
            j2.v r6 = j2.v.b(r6)
            r0.f1988f = r5
            r0.f1991q = r3
            java.lang.Object r6 = r8.invoke(r6, r0)
            if (r6 != r1) goto L60
            return r1
        L71:
            r7 = 0
            r6.i(r7)
            dc.w r6 = dc.w.f13270a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.e.g(long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final long h(long j10) {
        if (this.f1965d.b()) {
            return f.f26354b.c();
        }
        return q(j(this.f1965d.e(j(p(j10)))));
    }

    public final void i(boolean z10) {
        this.f1968g.setValue(Boolean.valueOf(z10));
    }

    public final float j(float f10) {
        if (this.f1963b) {
            return f10 * (-1);
        }
        return f10;
    }

    public final long k(long j10) {
        if (this.f1963b) {
            return f.u(j10, -1.0f);
        }
        return j10;
    }

    public final boolean l() {
        boolean z10;
        if (!this.f1965d.b() && !this.f1968g.getValue().booleanValue()) {
            i0 i0Var = this.f1967f;
            if (i0Var != null) {
                z10 = i0Var.c();
            } else {
                z10 = false;
            }
            if (!z10) {
                return false;
            }
        }
        return true;
    }

    public final long m(long j10) {
        if (this.f1962a == o.Horizontal) {
            return f.i(j10, 0.0f, 0.0f, 1, null);
        }
        return f.i(j10, 0.0f, 0.0f, 2, null);
    }

    public final long n(long j10) {
        if (this.f1962a == o.Horizontal) {
            return v.e(j10, 0.0f, 0.0f, 1, null);
        }
        return v.e(j10, 0.0f, 0.0f, 2, null);
    }

    public final float o(long j10) {
        if (this.f1962a == o.Horizontal) {
            return v.h(j10);
        }
        return v.i(j10);
    }

    public final float p(long j10) {
        if (this.f1962a == o.Horizontal) {
            return f.o(j10);
        }
        return f.p(j10);
    }

    public final long q(float f10) {
        boolean z10;
        if (f10 == 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return f.f26354b.c();
        }
        if (this.f1962a == o.Horizontal) {
            return g.a(f10, 0.0f);
        }
        return g.a(0.0f, f10);
    }

    public final long r(long j10, float f10) {
        if (this.f1962a == o.Horizontal) {
            return v.e(j10, f10, 0.0f, 2, null);
        }
        return v.e(j10, 0.0f, f10, 1, null);
    }
}
