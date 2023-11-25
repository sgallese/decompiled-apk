package androidx.compose.foundation.gestures;

import ad.k0;
import androidx.compose.foundation.FocusableKt;
import androidx.compose.ui.platform.k1;
import androidx.compose.ui.platform.m1;
import androidx.recyclerview.widget.RecyclerView;
import dc.n;
import dc.w;
import hc.f;
import j0.d3;
import j0.g3;
import j0.h0;
import j0.j1;
import j0.l;
import j0.y2;
import j2.v;
import k1.c0;
import k1.q0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.l;
import o1.m;
import pc.p;
import pc.q;
import qc.r;
import t.i0;
import u.o;
import u.s;
import u.u;
import u.x;
import v0.g;

/* compiled from: Scrollable.kt */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a */
    private static final q<k0, z0.f, Continuation<? super w>, Object> f1923a = new c(null);

    /* renamed from: b */
    private static final u f1924b = new C0021d();

    /* renamed from: c */
    private static final m<Boolean> f1925c = o1.e.a(b.f1927f);

    /* renamed from: d */
    private static final v0.g f1926d = new a();

    /* compiled from: Scrollable.kt */
    /* loaded from: classes.dex */
    public static final class a implements v0.g {
        a() {
        }

        @Override // v0.g
        public float I() {
            return 1.0f;
        }

        @Override // hc.f
        public <R> R fold(R r10, p<? super R, ? super f.b, ? extends R> pVar) {
            return (R) g.a.a(this, r10, pVar);
        }

        @Override // hc.f.b, hc.f
        public <E extends f.b> E get(f.c<E> cVar) {
            return (E) g.a.b(this, cVar);
        }

        @Override // hc.f.b
        public /* synthetic */ f.c getKey() {
            return v0.f.a(this);
        }

        @Override // hc.f
        public hc.f minusKey(f.c<?> cVar) {
            return g.a.c(this, cVar);
        }

        @Override // hc.f
        public hc.f plus(hc.f fVar) {
            return g.a.d(this, fVar);
        }
    }

    /* compiled from: Scrollable.kt */
    /* loaded from: classes.dex */
    static final class b extends r implements pc.a<Boolean> {

        /* renamed from: f */
        public static final b f1927f = new b();

        b() {
            super(0);
        }

        @Override // pc.a
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    /* compiled from: Scrollable.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.ScrollableKt$NoOpOnDragStarted$1", f = "Scrollable.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class c extends l implements q<k0, z0.f, Continuation<? super w>, Object> {

        /* renamed from: f */
        int f1928f;

        c(Continuation<? super c> continuation) {
            super(3, continuation);
        }

        public final Object a(k0 k0Var, long j10, Continuation<? super w> continuation) {
            return new c(continuation).invokeSuspend(w.f13270a);
        }

        @Override // pc.q
        public /* bridge */ /* synthetic */ Object invoke(k0 k0Var, z0.f fVar, Continuation<? super w> continuation) {
            return a(k0Var, fVar.x(), continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            ic.d.d();
            if (this.f1928f == 0) {
                n.b(obj);
                return w.f13270a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: Scrollable.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.ScrollableKt", f = "Scrollable.kt", l = {371}, m = "awaitScrollEvent")
    /* loaded from: classes.dex */
    public static final class e extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: f */
        Object f1929f;

        /* renamed from: m */
        /* synthetic */ Object f1930m;

        /* renamed from: p */
        int f1931p;

        e(Continuation<? super e> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f1930m = obj;
            this.f1931p |= RecyclerView.UNDEFINED_DURATION;
            return d.e(null, this);
        }
    }

    /* compiled from: Scrollable.kt */
    /* loaded from: classes.dex */
    public static final class f extends r implements pc.l<c0, Boolean> {

        /* renamed from: f */
        public static final f f1932f = new f();

        f() {
            super(1);
        }

        @Override // pc.l
        /* renamed from: a */
        public final Boolean invoke(c0 c0Var) {
            qc.q.i(c0Var, "down");
            return Boolean.valueOf(!q0.g(c0Var.m(), q0.f19226a.b()));
        }
    }

    /* compiled from: Scrollable.kt */
    /* loaded from: classes.dex */
    public static final class g extends r implements pc.a<Boolean> {

        /* renamed from: f */
        final /* synthetic */ g3<androidx.compose.foundation.gestures.e> f1933f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(g3<androidx.compose.foundation.gestures.e> g3Var) {
            super(0);
            this.f1933f = g3Var;
        }

        @Override // pc.a
        public final Boolean invoke() {
            return Boolean.valueOf(this.f1933f.getValue().l());
        }
    }

    /* compiled from: Scrollable.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.ScrollableKt$pointerScrollable$3$1", f = "Scrollable.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class h extends l implements q<k0, v, Continuation<? super w>, Object> {

        /* renamed from: f */
        int f1934f;

        /* renamed from: m */
        /* synthetic */ long f1935m;

        /* renamed from: p */
        final /* synthetic */ j1<j1.c> f1936p;

        /* renamed from: q */
        final /* synthetic */ g3<androidx.compose.foundation.gestures.e> f1937q;

        /* compiled from: Scrollable.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.ScrollableKt$pointerScrollable$3$1$1", f = "Scrollable.kt", l = {286}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class a extends l implements p<k0, Continuation<? super w>, Object> {

            /* renamed from: f */
            int f1938f;

            /* renamed from: m */
            final /* synthetic */ g3<androidx.compose.foundation.gestures.e> f1939m;

            /* renamed from: p */
            final /* synthetic */ long f1940p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(g3<androidx.compose.foundation.gestures.e> g3Var, long j10, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f1939m = g3Var;
                this.f1940p = j10;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation<w> create(Object obj, Continuation<?> continuation) {
                return new a(this.f1939m, this.f1940p, continuation);
            }

            @Override // pc.p
            public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
                return ((a) create(k0Var, continuation)).invokeSuspend(w.f13270a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object d10;
                d10 = ic.d.d();
                int i10 = this.f1938f;
                if (i10 != 0) {
                    if (i10 == 1) {
                        n.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    n.b(obj);
                    androidx.compose.foundation.gestures.e value = this.f1939m.getValue();
                    long j10 = this.f1940p;
                    this.f1938f = 1;
                    if (value.g(j10, this) == d10) {
                        return d10;
                    }
                }
                return w.f13270a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(j1<j1.c> j1Var, g3<androidx.compose.foundation.gestures.e> g3Var, Continuation<? super h> continuation) {
            super(3, continuation);
            this.f1936p = j1Var;
            this.f1937q = g3Var;
        }

        public final Object a(k0 k0Var, long j10, Continuation<? super w> continuation) {
            h hVar = new h(this.f1936p, this.f1937q, continuation);
            hVar.f1935m = j10;
            return hVar.invokeSuspend(w.f13270a);
        }

        @Override // pc.q
        public /* bridge */ /* synthetic */ Object invoke(k0 k0Var, v vVar, Continuation<? super w> continuation) {
            return a(k0Var, vVar.o(), continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            ic.d.d();
            if (this.f1934f == 0) {
                n.b(obj);
                ad.i.d(this.f1936p.getValue().e(), null, null, new a(this.f1937q, this.f1935m, null), 3, null);
                return w.f13270a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: InspectableValue.kt */
    /* loaded from: classes.dex */
    public static final class i extends r implements pc.l<m1, w> {

        /* renamed from: f */
        final /* synthetic */ o f1941f;

        /* renamed from: m */
        final /* synthetic */ x f1942m;

        /* renamed from: p */
        final /* synthetic */ i0 f1943p;

        /* renamed from: q */
        final /* synthetic */ boolean f1944q;

        /* renamed from: r */
        final /* synthetic */ boolean f1945r;

        /* renamed from: s */
        final /* synthetic */ u.m f1946s;

        /* renamed from: t */
        final /* synthetic */ v.m f1947t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(o oVar, x xVar, i0 i0Var, boolean z10, boolean z11, u.m mVar, v.m mVar2) {
            super(1);
            this.f1941f = oVar;
            this.f1942m = xVar;
            this.f1943p = i0Var;
            this.f1944q = z10;
            this.f1945r = z11;
            this.f1946s = mVar;
            this.f1947t = mVar2;
        }

        public final void a(m1 m1Var) {
            qc.q.i(m1Var, "$this$null");
            m1Var.b("scrollable");
            m1Var.a().c("orientation", this.f1941f);
            m1Var.a().c("state", this.f1942m);
            m1Var.a().c("overscrollEffect", this.f1943p);
            m1Var.a().c("enabled", Boolean.valueOf(this.f1944q));
            m1Var.a().c("reverseDirection", Boolean.valueOf(this.f1945r));
            m1Var.a().c("flingBehavior", this.f1946s);
            m1Var.a().c("interactionSource", this.f1947t);
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ w invoke(m1 m1Var) {
            a(m1Var);
            return w.f13270a;
        }
    }

    /* compiled from: Scrollable.kt */
    /* loaded from: classes.dex */
    public static final class j extends r implements q<androidx.compose.ui.e, j0.l, Integer, androidx.compose.ui.e> {

        /* renamed from: f */
        final /* synthetic */ o f1948f;

        /* renamed from: m */
        final /* synthetic */ x f1949m;

        /* renamed from: p */
        final /* synthetic */ boolean f1950p;

        /* renamed from: q */
        final /* synthetic */ v.m f1951q;

        /* renamed from: r */
        final /* synthetic */ u.m f1952r;

        /* renamed from: s */
        final /* synthetic */ i0 f1953s;

        /* renamed from: t */
        final /* synthetic */ boolean f1954t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(o oVar, x xVar, boolean z10, v.m mVar, u.m mVar2, i0 i0Var, boolean z11) {
            super(3);
            this.f1948f = oVar;
            this.f1949m = xVar;
            this.f1950p = z10;
            this.f1951q = mVar;
            this.f1952r = mVar2;
            this.f1953s = i0Var;
            this.f1954t = z11;
        }

        public final androidx.compose.ui.e a(androidx.compose.ui.e eVar, j0.l lVar, int i10) {
            qc.q.i(eVar, "$this$composed");
            lVar.e(-629830927);
            if (j0.n.K()) {
                j0.n.V(-629830927, i10, -1, "androidx.compose.foundation.gestures.scrollable.<anonymous> (Scrollable.kt:161)");
            }
            lVar.e(773894976);
            lVar.e(-492369756);
            Object f10 = lVar.f();
            if (f10 == j0.l.f18688a.a()) {
                Object xVar = new j0.x(h0.h(hc.g.f16601f, lVar));
                lVar.J(xVar);
                f10 = xVar;
            }
            lVar.N();
            k0 a10 = ((j0.x) f10).a();
            lVar.N();
            Object[] objArr = {a10, this.f1948f, this.f1949m, Boolean.valueOf(this.f1950p)};
            o oVar = this.f1948f;
            x xVar2 = this.f1949m;
            boolean z10 = this.f1950p;
            lVar.e(-568225417);
            boolean z11 = false;
            for (int i11 = 0; i11 < 4; i11++) {
                z11 |= lVar.Q(objArr[i11]);
            }
            Object f11 = lVar.f();
            if (z11 || f11 == j0.l.f18688a.a()) {
                f11 = new u.d(a10, oVar, xVar2, z10);
                lVar.J(f11);
            }
            lVar.N();
            androidx.compose.ui.e eVar2 = androidx.compose.ui.e.f2335a;
            androidx.compose.ui.e h10 = d.h(FocusableKt.a(eVar2).a(((u.d) f11).P()), this.f1951q, this.f1948f, this.f1950p, this.f1949m, this.f1952r, this.f1953s, this.f1954t, lVar, 0);
            if (this.f1954t) {
                eVar2 = androidx.compose.foundation.gestures.a.f1908c;
            }
            androidx.compose.ui.e a11 = h10.a(eVar2);
            if (j0.n.K()) {
                j0.n.U();
            }
            lVar.N();
            return a11;
        }

        @Override // pc.q
        public /* bridge */ /* synthetic */ androidx.compose.ui.e invoke(androidx.compose.ui.e eVar, j0.l lVar, Integer num) {
            return a(eVar, lVar, num.intValue());
        }
    }

    /* compiled from: Scrollable.kt */
    /* loaded from: classes.dex */
    public static final class k implements j1.b {

        /* renamed from: f */
        final /* synthetic */ g3<androidx.compose.foundation.gestures.e> f1955f;

        /* renamed from: m */
        final /* synthetic */ boolean f1956m;

        /* compiled from: Scrollable.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.ScrollableKt$scrollableNestedScrollConnection$1", f = "Scrollable.kt", l = {574}, m = "onPostFling-RZ2iAVY")
        /* loaded from: classes.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: f */
            Object f1957f;

            /* renamed from: m */
            long f1958m;

            /* renamed from: p */
            /* synthetic */ Object f1959p;

            /* renamed from: r */
            int f1961r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Continuation<? super a> continuation) {
                super(continuation);
                k.this = r1;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f1959p = obj;
                this.f1961r |= RecyclerView.UNDEFINED_DURATION;
                return k.this.H(0L, 0L, this);
            }
        }

        k(g3<androidx.compose.foundation.gestures.e> g3Var, boolean z10) {
            this.f1955f = g3Var;
            this.f1956m = z10;
        }

        @Override // j1.b
        public /* synthetic */ Object A0(long j10, Continuation continuation) {
            return j1.a.c(this, j10, continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:34:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0037  */
        @Override // j1.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object H(long r3, long r5, kotlin.coroutines.Continuation<? super j2.v> r7) {
            /*
                r2 = this;
                boolean r3 = r7 instanceof androidx.compose.foundation.gestures.d.k.a
                if (r3 == 0) goto L13
                r3 = r7
                androidx.compose.foundation.gestures.d$k$a r3 = (androidx.compose.foundation.gestures.d.k.a) r3
                int r4 = r3.f1961r
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r1 = r4 & r0
                if (r1 == 0) goto L13
                int r4 = r4 - r0
                r3.f1961r = r4
                goto L18
            L13:
                androidx.compose.foundation.gestures.d$k$a r3 = new androidx.compose.foundation.gestures.d$k$a
                r3.<init>(r7)
            L18:
                java.lang.Object r4 = r3.f1959p
                java.lang.Object r7 = ic.b.d()
                int r0 = r3.f1961r
                r1 = 1
                if (r0 == 0) goto L37
                if (r0 != r1) goto L2f
                long r5 = r3.f1958m
                java.lang.Object r3 = r3.f1957f
                androidx.compose.foundation.gestures.d$k r3 = (androidx.compose.foundation.gestures.d.k) r3
                dc.n.b(r4)
                goto L54
            L2f:
                java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
                r3.<init>(r4)
                throw r3
            L37:
                dc.n.b(r4)
                boolean r4 = r2.f1956m
                if (r4 == 0) goto L5f
                j0.g3<androidx.compose.foundation.gestures.e> r4 = r2.f1955f
                java.lang.Object r4 = r4.getValue()
                androidx.compose.foundation.gestures.e r4 = (androidx.compose.foundation.gestures.e) r4
                r3.f1957f = r2
                r3.f1958m = r5
                r3.f1961r = r1
                java.lang.Object r4 = r4.b(r5, r3)
                if (r4 != r7) goto L53
                return r7
            L53:
                r3 = r2
            L54:
                j2.v r4 = (j2.v) r4
                long r0 = r4.o()
                long r4 = j2.v.k(r5, r0)
                goto L66
            L5f:
                j2.v$a r3 = j2.v.f19013b
                long r4 = r3.a()
                r3 = r2
            L66:
                j2.v r4 = j2.v.b(r4)
                j0.g3<androidx.compose.foundation.gestures.e> r3 = r3.f1955f
                r4.o()
                java.lang.Object r3 = r3.getValue()
                androidx.compose.foundation.gestures.e r3 = (androidx.compose.foundation.gestures.e) r3
                r5 = 0
                r3.i(r5)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.d.k.H(long, long, kotlin.coroutines.Continuation):java.lang.Object");
        }

        @Override // j1.b
        public long T0(long j10, long j11, int i10) {
            if (this.f1956m) {
                return this.f1955f.getValue().h(j11);
            }
            return z0.f.f26354b.c();
        }

        @Override // j1.b
        public long o0(long j10, int i10) {
            if (j1.f.d(i10, j1.f.f18968a.b())) {
                this.f1955f.getValue().i(true);
            }
            return z0.f.f26354b.c();
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0056 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x0041 -> B:39:0x0044). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e(k1.e r5, kotlin.coroutines.Continuation<? super k1.r> r6) {
        /*
            boolean r0 = r6 instanceof androidx.compose.foundation.gestures.d.e
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.foundation.gestures.d$e r0 = (androidx.compose.foundation.gestures.d.e) r0
            int r1 = r0.f1931p
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1931p = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.d$e r0 = new androidx.compose.foundation.gestures.d$e
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f1930m
            java.lang.Object r1 = ic.b.d()
            int r2 = r0.f1931p
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.f1929f
            k1.e r5 = (k1.e) r5
            dc.n.b(r6)
            goto L44
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            dc.n.b(r6)
        L38:
            r0.f1929f = r5
            r0.f1931p = r3
            r6 = 0
            java.lang.Object r6 = k1.d.a(r5, r6, r0, r3, r6)
            if (r6 != r1) goto L44
            return r1
        L44:
            k1.r r6 = (k1.r) r6
            int r2 = r6.f()
            k1.u$a r4 = k1.u.f19238a
            int r4 = r4.f()
            boolean r2 = k1.u.i(r2, r4)
            if (r2 == 0) goto L38
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.d.e(k1.e, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final v0.g f() {
        return f1926d;
    }

    public static final m<Boolean> g() {
        return f1925c;
    }

    public static final androidx.compose.ui.e h(androidx.compose.ui.e eVar, v.m mVar, o oVar, boolean z10, x xVar, u.m mVar2, i0 i0Var, boolean z11, j0.l lVar, int i10) {
        u.m mVar3;
        lVar.e(-2012025036);
        if (j0.n.K()) {
            j0.n.V(-2012025036, i10, -1, "androidx.compose.foundation.gestures.pointerScrollable (Scrollable.kt:247)");
        }
        lVar.e(-1730185954);
        if (mVar2 == null) {
            mVar3 = u.v.f23988a.a(lVar, 6);
        } else {
            mVar3 = mVar2;
        }
        lVar.N();
        lVar.e(-492369756);
        Object f10 = lVar.f();
        l.a aVar = j0.l.f18688a;
        if (f10 == aVar.a()) {
            f10 = d3.e(new j1.c(), null, 2, null);
            lVar.J(f10);
        }
        lVar.N();
        j1 j1Var = (j1) f10;
        g3 m10 = y2.m(new androidx.compose.foundation.gestures.e(oVar, z10, j1Var, xVar, mVar3, i0Var), lVar, 0);
        Object valueOf = Boolean.valueOf(z11);
        lVar.e(1157296644);
        boolean Q = lVar.Q(valueOf);
        Object f11 = lVar.f();
        if (Q || f11 == aVar.a()) {
            f11 = l(m10, z11);
            lVar.J(f11);
        }
        lVar.N();
        j1.b bVar = (j1.b) f11;
        lVar.e(-492369756);
        Object f12 = lVar.f();
        if (f12 == aVar.a()) {
            f12 = new androidx.compose.foundation.gestures.c(m10);
            lVar.J(f12);
        }
        lVar.N();
        androidx.compose.foundation.gestures.c cVar = (androidx.compose.foundation.gestures.c) f12;
        s a10 = u.b.a(lVar, 0);
        q<k0, z0.f, Continuation<? super w>, Object> qVar = f1923a;
        f fVar = f.f1932f;
        lVar.e(1157296644);
        boolean Q2 = lVar.Q(m10);
        Object f13 = lVar.f();
        if (Q2 || f13 == aVar.a()) {
            f13 = new g(m10);
            lVar.J(f13);
        }
        lVar.N();
        pc.a aVar2 = (pc.a) f13;
        lVar.e(511388516);
        boolean Q3 = lVar.Q(j1Var) | lVar.Q(m10);
        Object f14 = lVar.f();
        if (Q3 || f14 == aVar.a()) {
            f14 = new h(j1Var, m10, null);
            lVar.J(f14);
        }
        lVar.N();
        androidx.compose.ui.e a11 = androidx.compose.ui.input.nestedscroll.a.a(eVar.a(new DraggableElement(cVar, fVar, oVar, z11, mVar, aVar2, qVar, (q) f14, false)).a(new MouseWheelScrollElement(m10, a10)), bVar, (j1.c) j1Var.getValue());
        if (j0.n.K()) {
            j0.n.U();
        }
        lVar.N();
        return a11;
    }

    public static final androidx.compose.ui.e i(androidx.compose.ui.e eVar, x xVar, o oVar, i0 i0Var, boolean z10, boolean z11, u.m mVar, v.m mVar2) {
        pc.l a10;
        qc.q.i(eVar, "<this>");
        qc.q.i(xVar, "state");
        qc.q.i(oVar, "orientation");
        if (k1.c()) {
            a10 = new i(oVar, xVar, i0Var, z10, z11, mVar, mVar2);
        } else {
            a10 = k1.a();
        }
        return androidx.compose.ui.c.a(eVar, a10, new j(oVar, xVar, z11, mVar2, mVar, i0Var, z10));
    }

    public static final androidx.compose.ui.e j(androidx.compose.ui.e eVar, x xVar, o oVar, boolean z10, boolean z11, u.m mVar, v.m mVar2) {
        qc.q.i(eVar, "<this>");
        qc.q.i(xVar, "state");
        qc.q.i(oVar, "orientation");
        return i(eVar, xVar, oVar, null, z10, z11, mVar, mVar2);
    }

    public static /* synthetic */ androidx.compose.ui.e k(androidx.compose.ui.e eVar, x xVar, o oVar, boolean z10, boolean z11, u.m mVar, v.m mVar2, int i10, Object obj) {
        boolean z12;
        boolean z13;
        u.m mVar3;
        v.m mVar4;
        if ((i10 & 4) != 0) {
            z12 = true;
        } else {
            z12 = z10;
        }
        if ((i10 & 8) != 0) {
            z13 = false;
        } else {
            z13 = z11;
        }
        if ((i10 & 16) != 0) {
            mVar3 = null;
        } else {
            mVar3 = mVar;
        }
        if ((i10 & 32) != 0) {
            mVar4 = null;
        } else {
            mVar4 = mVar2;
        }
        return j(eVar, xVar, oVar, z12, z13, mVar3, mVar4);
    }

    public static final j1.b l(g3<androidx.compose.foundation.gestures.e> g3Var, boolean z10) {
        return new k(g3Var, z10);
    }

    /* compiled from: Scrollable.kt */
    /* renamed from: androidx.compose.foundation.gestures.d$d */
    /* loaded from: classes.dex */
    public static final class C0021d implements u {
        C0021d() {
        }

        @Override // u.u
        public float a(float f10) {
            return f10;
        }
    }
}
