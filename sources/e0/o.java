package e0;

import ad.k0;
import j0.g3;
import j0.h0;
import j0.l;
import j0.y2;
import kotlin.coroutines.Continuation;
import s.i1;
import s.k1;
import s.z0;

/* compiled from: SelectionMagnifier.kt */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    private static final s.o f13653a = new s.o(Float.NaN, Float.NaN);

    /* renamed from: b  reason: collision with root package name */
    private static final i1<z0.f, s.o> f13654b = k1.a(a.f13657f, b.f13658f);

    /* renamed from: c  reason: collision with root package name */
    private static final long f13655c;

    /* renamed from: d  reason: collision with root package name */
    private static final z0<z0.f> f13656d;

    /* compiled from: SelectionMagnifier.kt */
    /* loaded from: classes.dex */
    static final class a extends qc.r implements pc.l<z0.f, s.o> {

        /* renamed from: f  reason: collision with root package name */
        public static final a f13657f = new a();

        a() {
            super(1);
        }

        public final s.o a(long j10) {
            if (!z0.g.c(j10)) {
                return o.f13653a;
            }
            return new s.o(z0.f.o(j10), z0.f.p(j10));
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ s.o invoke(z0.f fVar) {
            return a(fVar.x());
        }
    }

    /* compiled from: SelectionMagnifier.kt */
    /* loaded from: classes.dex */
    static final class b extends qc.r implements pc.l<s.o, z0.f> {

        /* renamed from: f  reason: collision with root package name */
        public static final b f13658f = new b();

        b() {
            super(1);
        }

        public final long a(s.o oVar) {
            qc.q.i(oVar, "it");
            return z0.g.a(oVar.f(), oVar.g());
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ z0.f invoke(s.o oVar) {
            return z0.f.d(a(oVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SelectionMagnifier.kt */
    /* loaded from: classes.dex */
    public static final class c extends qc.r implements pc.q<androidx.compose.ui.e, j0.l, Integer, androidx.compose.ui.e> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ pc.a<z0.f> f13659f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ pc.l<pc.a<z0.f>, androidx.compose.ui.e> f13660m;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: SelectionMagnifier.kt */
        /* loaded from: classes.dex */
        public static final class a extends qc.r implements pc.a<z0.f> {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ g3<z0.f> f13661f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(g3<z0.f> g3Var) {
                super(0);
                this.f13661f = g3Var;
            }

            public final long a() {
                return c.c(this.f13661f);
            }

            @Override // pc.a
            public /* bridge */ /* synthetic */ z0.f invoke() {
                return z0.f.d(a());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(pc.a<z0.f> aVar, pc.l<? super pc.a<z0.f>, ? extends androidx.compose.ui.e> lVar) {
            super(3);
            this.f13659f = aVar;
            this.f13660m = lVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final long c(g3<z0.f> g3Var) {
            return g3Var.getValue().x();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final androidx.compose.ui.e b(androidx.compose.ui.e eVar, j0.l lVar, int i10) {
            qc.q.i(eVar, "$this$composed");
            lVar.e(759876635);
            if (j0.n.K()) {
                j0.n.V(759876635, i10, -1, "androidx.compose.foundation.text.selection.animatedSelectionMagnifier.<anonymous> (SelectionMagnifier.kt:65)");
            }
            g3 h10 = o.h(this.f13659f, lVar, 0);
            pc.l<pc.a<z0.f>, androidx.compose.ui.e> lVar2 = this.f13660m;
            lVar.e(1157296644);
            boolean Q = lVar.Q(h10);
            Object f10 = lVar.f();
            if (Q || f10 == j0.l.f18688a.a()) {
                f10 = new a(h10);
                lVar.J(f10);
            }
            lVar.N();
            androidx.compose.ui.e eVar2 = (androidx.compose.ui.e) lVar2.invoke(f10);
            if (j0.n.K()) {
                j0.n.U();
            }
            lVar.N();
            return eVar2;
        }

        @Override // pc.q
        public /* bridge */ /* synthetic */ androidx.compose.ui.e invoke(androidx.compose.ui.e eVar, j0.l lVar, Integer num) {
            return b(eVar, lVar, num.intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SelectionMagnifier.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.selection.SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1", f = "SelectionMagnifier.kt", l = {87}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.l implements pc.p<k0, Continuation<? super dc.w>, Object> {

        /* renamed from: f  reason: collision with root package name */
        int f13662f;

        /* renamed from: m  reason: collision with root package name */
        private /* synthetic */ Object f13663m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ g3<z0.f> f13664p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ s.a<z0.f, s.o> f13665q;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: SelectionMagnifier.kt */
        /* loaded from: classes.dex */
        public static final class a extends qc.r implements pc.a<z0.f> {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ g3<z0.f> f13666f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(g3<z0.f> g3Var) {
                super(0);
                this.f13666f = g3Var;
            }

            public final long a() {
                return o.i(this.f13666f);
            }

            @Override // pc.a
            public /* bridge */ /* synthetic */ z0.f invoke() {
                return z0.f.d(a());
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: SelectionMagnifier.kt */
        /* loaded from: classes.dex */
        public static final class b implements dd.h<z0.f> {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ s.a<z0.f, s.o> f13667f;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ k0 f13668m;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: SelectionMagnifier.kt */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.selection.SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$2$emit$2", f = "SelectionMagnifier.kt", l = {101}, m = "invokeSuspend")
            /* loaded from: classes.dex */
            public static final class a extends kotlin.coroutines.jvm.internal.l implements pc.p<k0, Continuation<? super dc.w>, Object> {

                /* renamed from: f  reason: collision with root package name */
                int f13669f;

                /* renamed from: m  reason: collision with root package name */
                final /* synthetic */ s.a<z0.f, s.o> f13670m;

                /* renamed from: p  reason: collision with root package name */
                final /* synthetic */ long f13671p;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(s.a<z0.f, s.o> aVar, long j10, Continuation<? super a> continuation) {
                    super(2, continuation);
                    this.f13670m = aVar;
                    this.f13671p = j10;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
                    return new a(this.f13670m, this.f13671p, continuation);
                }

                @Override // pc.p
                public final Object invoke(k0 k0Var, Continuation<? super dc.w> continuation) {
                    return ((a) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object d10;
                    d10 = ic.d.d();
                    int i10 = this.f13669f;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            dc.n.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        dc.n.b(obj);
                        s.a<z0.f, s.o> aVar = this.f13670m;
                        z0.f d11 = z0.f.d(this.f13671p);
                        z0 z0Var = o.f13656d;
                        this.f13669f = 1;
                        if (s.a.f(aVar, d11, z0Var, null, null, this, 12, null) == d10) {
                            return d10;
                        }
                    }
                    return dc.w.f13270a;
                }
            }

            b(s.a<z0.f, s.o> aVar, k0 k0Var) {
                this.f13667f = aVar;
                this.f13668m = k0Var;
            }

            public final Object a(long j10, Continuation<? super dc.w> continuation) {
                Object d10;
                boolean z10;
                if (z0.g.c(this.f13667f.n().x()) && z0.g.c(j10)) {
                    if (z0.f.p(this.f13667f.n().x()) == z0.f.p(j10)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        ad.i.d(this.f13668m, null, null, new a(this.f13667f, j10, null), 3, null);
                        return dc.w.f13270a;
                    }
                }
                Object u10 = this.f13667f.u(z0.f.d(j10), continuation);
                d10 = ic.d.d();
                if (u10 == d10) {
                    return u10;
                }
                return dc.w.f13270a;
            }

            @Override // dd.h
            public /* bridge */ /* synthetic */ Object emit(z0.f fVar, Continuation continuation) {
                return a(fVar.x(), continuation);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(g3<z0.f> g3Var, s.a<z0.f, s.o> aVar, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f13664p = g3Var;
            this.f13665q = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
            d dVar = new d(this.f13664p, this.f13665q, continuation);
            dVar.f13663m = obj;
            return dVar;
        }

        @Override // pc.p
        public final Object invoke(k0 k0Var, Continuation<? super dc.w> continuation) {
            return ((d) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d10;
            d10 = ic.d.d();
            int i10 = this.f13662f;
            if (i10 != 0) {
                if (i10 == 1) {
                    dc.n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                dc.n.b(obj);
                k0 k0Var = (k0) this.f13663m;
                dd.g n10 = y2.n(new a(this.f13664p));
                b bVar = new b(this.f13665q, k0Var);
                this.f13662f = 1;
                if (n10.collect(bVar, this) == d10) {
                    return d10;
                }
            }
            return dc.w.f13270a;
        }
    }

    static {
        long a10 = z0.g.a(0.01f, 0.01f);
        f13655c = a10;
        f13656d = new z0<>(0.0f, 0.0f, z0.f.d(a10), 3, null);
    }

    public static final androidx.compose.ui.e g(androidx.compose.ui.e eVar, pc.a<z0.f> aVar, pc.l<? super pc.a<z0.f>, ? extends androidx.compose.ui.e> lVar) {
        qc.q.i(eVar, "<this>");
        qc.q.i(aVar, "magnifierCenter");
        qc.q.i(lVar, "platformMagnifier");
        return androidx.compose.ui.c.b(eVar, null, new c(aVar, lVar), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g3<z0.f> h(pc.a<z0.f> aVar, j0.l lVar, int i10) {
        lVar.e(-1589795249);
        if (j0.n.K()) {
            j0.n.V(-1589795249, i10, -1, "androidx.compose.foundation.text.selection.rememberAnimatedMagnifierPosition (SelectionMagnifier.kt:75)");
        }
        lVar.e(-492369756);
        Object f10 = lVar.f();
        l.a aVar2 = j0.l.f18688a;
        if (f10 == aVar2.a()) {
            f10 = y2.d(aVar);
            lVar.J(f10);
        }
        lVar.N();
        g3 g3Var = (g3) f10;
        lVar.e(-492369756);
        Object f11 = lVar.f();
        if (f11 == aVar2.a()) {
            f11 = new s.a(z0.f.d(i(g3Var)), f13654b, z0.f.d(f13655c), null, 8, null);
            lVar.J(f11);
        }
        lVar.N();
        s.a aVar3 = (s.a) f11;
        h0.d(dc.w.f13270a, new d(g3Var, aVar3, null), lVar, 70);
        g3<z0.f> g10 = aVar3.g();
        if (j0.n.K()) {
            j0.n.U();
        }
        lVar.N();
        return g10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long i(g3<z0.f> g3Var) {
        return g3Var.getValue().x();
    }
}
