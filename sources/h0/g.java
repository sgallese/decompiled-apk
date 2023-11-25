package h0;

import a1.o1;
import a1.p1;
import ad.k0;
import ad.l0;
import ad.v;
import ad.x;
import ad.x1;
import androidx.recyclerview.widget.RecyclerView;
import dc.w;
import j0.d3;
import j0.j1;
import kotlin.coroutines.Continuation;
import s.d0;
import s.h1;

/* compiled from: RippleAnimation.kt */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    private z0.f f16362a;

    /* renamed from: b  reason: collision with root package name */
    private final float f16363b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f16364c;

    /* renamed from: d  reason: collision with root package name */
    private Float f16365d;

    /* renamed from: e  reason: collision with root package name */
    private Float f16366e;

    /* renamed from: f  reason: collision with root package name */
    private z0.f f16367f;

    /* renamed from: g  reason: collision with root package name */
    private final s.a<Float, s.n> f16368g;

    /* renamed from: h  reason: collision with root package name */
    private final s.a<Float, s.n> f16369h;

    /* renamed from: i  reason: collision with root package name */
    private final s.a<Float, s.n> f16370i;

    /* renamed from: j  reason: collision with root package name */
    private final v<w> f16371j;

    /* renamed from: k  reason: collision with root package name */
    private final j1 f16372k;

    /* renamed from: l  reason: collision with root package name */
    private final j1 f16373l;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RippleAnimation.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.ripple.RippleAnimation", f = "RippleAnimation.kt", l = {80, 82, 83}, m = "animate")
    /* loaded from: classes.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: f  reason: collision with root package name */
        Object f16374f;

        /* renamed from: m  reason: collision with root package name */
        /* synthetic */ Object f16375m;

        /* renamed from: q  reason: collision with root package name */
        int f16377q;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f16375m = obj;
            this.f16377q |= RecyclerView.UNDEFINED_DURATION;
            return g.this.d(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RippleAnimation.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.ripple.RippleAnimation$fadeIn$2", f = "RippleAnimation.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.l implements pc.p<k0, Continuation<? super x1>, Object> {

        /* renamed from: f  reason: collision with root package name */
        int f16378f;

        /* renamed from: m  reason: collision with root package name */
        private /* synthetic */ Object f16379m;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: RippleAnimation.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.ripple.RippleAnimation$fadeIn$2$1", f = "RippleAnimation.kt", l = {89}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements pc.p<k0, Continuation<? super w>, Object> {

            /* renamed from: f  reason: collision with root package name */
            int f16381f;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ g f16382m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(g gVar, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f16382m = gVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation<w> create(Object obj, Continuation<?> continuation) {
                return new a(this.f16382m, continuation);
            }

            @Override // pc.p
            public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
                return ((a) create(k0Var, continuation)).invokeSuspend(w.f13270a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object d10;
                d10 = ic.d.d();
                int i10 = this.f16381f;
                if (i10 != 0) {
                    if (i10 == 1) {
                        dc.n.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    dc.n.b(obj);
                    s.a aVar = this.f16382m.f16368g;
                    Float c10 = kotlin.coroutines.jvm.internal.b.c(1.0f);
                    h1 i11 = s.k.i(75, 0, d0.c(), 2, null);
                    this.f16381f = 1;
                    if (s.a.f(aVar, c10, i11, null, null, this, 12, null) == d10) {
                        return d10;
                    }
                }
                return w.f13270a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: RippleAnimation.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.ripple.RippleAnimation$fadeIn$2$2", f = "RippleAnimation.kt", l = {95}, m = "invokeSuspend")
        /* renamed from: h0.g$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0386b extends kotlin.coroutines.jvm.internal.l implements pc.p<k0, Continuation<? super w>, Object> {

            /* renamed from: f  reason: collision with root package name */
            int f16383f;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ g f16384m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0386b(g gVar, Continuation<? super C0386b> continuation) {
                super(2, continuation);
                this.f16384m = gVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation<w> create(Object obj, Continuation<?> continuation) {
                return new C0386b(this.f16384m, continuation);
            }

            @Override // pc.p
            public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
                return ((C0386b) create(k0Var, continuation)).invokeSuspend(w.f13270a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object d10;
                d10 = ic.d.d();
                int i10 = this.f16383f;
                if (i10 != 0) {
                    if (i10 == 1) {
                        dc.n.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    dc.n.b(obj);
                    s.a aVar = this.f16384m.f16369h;
                    Float c10 = kotlin.coroutines.jvm.internal.b.c(1.0f);
                    h1 i11 = s.k.i(225, 0, d0.b(), 2, null);
                    this.f16383f = 1;
                    if (s.a.f(aVar, c10, i11, null, null, this, 12, null) == d10) {
                        return d10;
                    }
                }
                return w.f13270a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: RippleAnimation.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.ripple.RippleAnimation$fadeIn$2$3", f = "RippleAnimation.kt", l = {101}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class c extends kotlin.coroutines.jvm.internal.l implements pc.p<k0, Continuation<? super w>, Object> {

            /* renamed from: f  reason: collision with root package name */
            int f16385f;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ g f16386m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(g gVar, Continuation<? super c> continuation) {
                super(2, continuation);
                this.f16386m = gVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation<w> create(Object obj, Continuation<?> continuation) {
                return new c(this.f16386m, continuation);
            }

            @Override // pc.p
            public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
                return ((c) create(k0Var, continuation)).invokeSuspend(w.f13270a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object d10;
                d10 = ic.d.d();
                int i10 = this.f16385f;
                if (i10 != 0) {
                    if (i10 == 1) {
                        dc.n.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    dc.n.b(obj);
                    s.a aVar = this.f16386m.f16370i;
                    Float c10 = kotlin.coroutines.jvm.internal.b.c(1.0f);
                    h1 i11 = s.k.i(225, 0, d0.c(), 2, null);
                    this.f16385f = 1;
                    if (s.a.f(aVar, c10, i11, null, null, this, 12, null) == d10) {
                        return d10;
                    }
                }
                return w.f13270a;
            }
        }

        b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<w> create(Object obj, Continuation<?> continuation) {
            b bVar = new b(continuation);
            bVar.f16379m = obj;
            return bVar;
        }

        @Override // pc.p
        public final Object invoke(k0 k0Var, Continuation<? super x1> continuation) {
            return ((b) create(k0Var, continuation)).invokeSuspend(w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            x1 d10;
            ic.d.d();
            if (this.f16378f == 0) {
                dc.n.b(obj);
                k0 k0Var = (k0) this.f16379m;
                ad.i.d(k0Var, null, null, new a(g.this, null), 3, null);
                ad.i.d(k0Var, null, null, new C0386b(g.this, null), 3, null);
                d10 = ad.i.d(k0Var, null, null, new c(g.this, null), 3, null);
                return d10;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RippleAnimation.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.ripple.RippleAnimation$fadeOut$2", f = "RippleAnimation.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.l implements pc.p<k0, Continuation<? super x1>, Object> {

        /* renamed from: f  reason: collision with root package name */
        int f16387f;

        /* renamed from: m  reason: collision with root package name */
        private /* synthetic */ Object f16388m;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: RippleAnimation.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.ripple.RippleAnimation$fadeOut$2$1", f = "RippleAnimation.kt", l = {112}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements pc.p<k0, Continuation<? super w>, Object> {

            /* renamed from: f  reason: collision with root package name */
            int f16390f;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ g f16391m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(g gVar, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f16391m = gVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation<w> create(Object obj, Continuation<?> continuation) {
                return new a(this.f16391m, continuation);
            }

            @Override // pc.p
            public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
                return ((a) create(k0Var, continuation)).invokeSuspend(w.f13270a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object d10;
                d10 = ic.d.d();
                int i10 = this.f16390f;
                if (i10 != 0) {
                    if (i10 == 1) {
                        dc.n.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    dc.n.b(obj);
                    s.a aVar = this.f16391m.f16368g;
                    Float c10 = kotlin.coroutines.jvm.internal.b.c(0.0f);
                    h1 i11 = s.k.i(150, 0, d0.c(), 2, null);
                    this.f16390f = 1;
                    if (s.a.f(aVar, c10, i11, null, null, this, 12, null) == d10) {
                        return d10;
                    }
                }
                return w.f13270a;
            }
        }

        c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<w> create(Object obj, Continuation<?> continuation) {
            c cVar = new c(continuation);
            cVar.f16388m = obj;
            return cVar;
        }

        @Override // pc.p
        public final Object invoke(k0 k0Var, Continuation<? super x1> continuation) {
            return ((c) create(k0Var, continuation)).invokeSuspend(w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            x1 d10;
            ic.d.d();
            if (this.f16387f == 0) {
                dc.n.b(obj);
                d10 = ad.i.d((k0) this.f16388m, null, null, new a(g.this, null), 3, null);
                return d10;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public /* synthetic */ g(z0.f fVar, float f10, boolean z10, qc.h hVar) {
        this(fVar, f10, z10);
    }

    private final Object f(Continuation<? super w> continuation) {
        Object d10;
        Object e10 = l0.e(new b(null), continuation);
        d10 = ic.d.d();
        if (e10 == d10) {
            return e10;
        }
        return w.f13270a;
    }

    private final Object g(Continuation<? super w> continuation) {
        Object d10;
        Object e10 = l0.e(new c(null), continuation);
        d10 = ic.d.d();
        if (e10 == d10) {
            return e10;
        }
        return w.f13270a;
    }

    private final boolean i() {
        return ((Boolean) this.f16373l.getValue()).booleanValue();
    }

    private final boolean j() {
        return ((Boolean) this.f16372k.getValue()).booleanValue();
    }

    private final void k(boolean z10) {
        this.f16373l.setValue(Boolean.valueOf(z10));
    }

    private final void l(boolean z10) {
        this.f16372k.setValue(Boolean.valueOf(z10));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0065 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0071 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(kotlin.coroutines.Continuation<? super dc.w> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof h0.g.a
            if (r0 == 0) goto L13
            r0 = r7
            h0.g$a r0 = (h0.g.a) r0
            int r1 = r0.f16377q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16377q = r1
            goto L18
        L13:
            h0.g$a r0 = new h0.g$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f16375m
            java.lang.Object r1 = ic.b.d()
            int r2 = r0.f16377q
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L47
            if (r2 == r5) goto L3f
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            dc.n.b(r7)
            goto L72
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L37:
            java.lang.Object r2 = r0.f16374f
            h0.g r2 = (h0.g) r2
            dc.n.b(r7)
            goto L66
        L3f:
            java.lang.Object r2 = r0.f16374f
            h0.g r2 = (h0.g) r2
            dc.n.b(r7)
            goto L56
        L47:
            dc.n.b(r7)
            r0.f16374f = r6
            r0.f16377q = r5
            java.lang.Object r7 = r6.f(r0)
            if (r7 != r1) goto L55
            return r1
        L55:
            r2 = r6
        L56:
            r2.l(r5)
            ad.v<dc.w> r7 = r2.f16371j
            r0.f16374f = r2
            r0.f16377q = r4
            java.lang.Object r7 = r7.E(r0)
            if (r7 != r1) goto L66
            return r1
        L66:
            r7 = 0
            r0.f16374f = r7
            r0.f16377q = r3
            java.lang.Object r7 = r2.g(r0)
            if (r7 != r1) goto L72
            return r1
        L72:
            dc.w r7 = dc.w.f13270a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.g.d(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void e(c1.f fVar, long j10) {
        float floatValue;
        Float valueOf;
        qc.q.i(fVar, "$this$draw");
        if (this.f16365d == null) {
            this.f16365d = Float.valueOf(h.b(fVar.b()));
        }
        if (this.f16366e == null) {
            if (Float.isNaN(this.f16363b)) {
                valueOf = Float.valueOf(h.a(fVar, this.f16364c, fVar.b()));
            } else {
                valueOf = Float.valueOf(fVar.v0(this.f16363b));
            }
            this.f16366e = valueOf;
        }
        if (this.f16362a == null) {
            this.f16362a = z0.f.d(fVar.O0());
        }
        if (this.f16367f == null) {
            this.f16367f = z0.f.d(z0.g.a(z0.l.i(fVar.b()) / 2.0f, z0.l.g(fVar.b()) / 2.0f));
        }
        if (i() && !j()) {
            floatValue = 1.0f;
        } else {
            floatValue = this.f16368g.n().floatValue();
        }
        Float f10 = this.f16365d;
        qc.q.f(f10);
        float floatValue2 = f10.floatValue();
        Float f11 = this.f16366e;
        qc.q.f(f11);
        float a10 = k2.a.a(floatValue2, f11.floatValue(), this.f16369h.n().floatValue());
        z0.f fVar2 = this.f16362a;
        qc.q.f(fVar2);
        float o10 = z0.f.o(fVar2.x());
        z0.f fVar3 = this.f16367f;
        qc.q.f(fVar3);
        float a11 = k2.a.a(o10, z0.f.o(fVar3.x()), this.f16370i.n().floatValue());
        z0.f fVar4 = this.f16362a;
        qc.q.f(fVar4);
        float p10 = z0.f.p(fVar4.x());
        z0.f fVar5 = this.f16367f;
        qc.q.f(fVar5);
        long a12 = z0.g.a(a11, k2.a.a(p10, z0.f.p(fVar5.x()), this.f16370i.n().floatValue()));
        long o11 = p1.o(j10, p1.r(j10) * floatValue, 0.0f, 0.0f, 0.0f, 14, null);
        if (this.f16364c) {
            float i10 = z0.l.i(fVar.b());
            float g10 = z0.l.g(fVar.b());
            int b10 = o1.f133a.b();
            c1.d y02 = fVar.y0();
            long b11 = y02.b();
            y02.d().k();
            y02.a().a(0.0f, 0.0f, i10, g10, b10);
            c1.e.f(fVar, o11, a10, a12, 0.0f, null, null, 0, 120, null);
            y02.d().p();
            y02.c(b11);
            return;
        }
        c1.e.f(fVar, o11, a10, a12, 0.0f, null, null, 0, 120, null);
    }

    public final void h() {
        k(true);
        this.f16371j.i0(w.f13270a);
    }

    private g(z0.f fVar, float f10, boolean z10) {
        j1 e10;
        j1 e11;
        this.f16362a = fVar;
        this.f16363b = f10;
        this.f16364c = z10;
        this.f16368g = s.b.b(0.0f, 0.0f, 2, null);
        this.f16369h = s.b.b(0.0f, 0.0f, 2, null);
        this.f16370i = s.b.b(0.0f, 0.0f, 2, null);
        this.f16371j = x.a(null);
        Boolean bool = Boolean.FALSE;
        e10 = d3.e(bool, null, 2, null);
        this.f16372k = e10;
        e11 = d3.e(bool, null, 2, null);
        this.f16373l = e11;
    }
}
