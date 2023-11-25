package t;

import android.os.Build;
import android.view.View;
import androidx.compose.ui.platform.k1;
import androidx.compose.ui.platform.m1;
import androidx.compose.ui.platform.z0;
import j0.d3;
import j0.g3;
import j0.j1;
import j0.l;
import j0.y2;
import kotlin.coroutines.Continuation;

/* compiled from: Magnifier.kt */
/* loaded from: classes.dex */
public final class z {

    /* renamed from: a  reason: collision with root package name */
    private static final t1.w<pc.a<z0.f>> f23225a;

    /* compiled from: InspectableValue.kt */
    /* loaded from: classes.dex */
    public static final class a extends qc.r implements pc.l<m1, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ pc.l f23226f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ pc.l f23227m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ float f23228p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ a0 f23229q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(pc.l lVar, pc.l lVar2, float f10, a0 a0Var) {
            super(1);
            this.f23226f = lVar;
            this.f23227m = lVar2;
            this.f23228p = f10;
            this.f23229q = a0Var;
        }

        public final void a(m1 m1Var) {
            String str;
            qc.q.i(m1Var, "$this$null");
            if (z.c(0, 1, null)) {
                str = "magnifier";
            } else {
                str = "magnifier (not supported)";
            }
            m1Var.b(str);
            m1Var.a().c("sourceCenter", this.f23226f);
            m1Var.a().c("magnifierCenter", this.f23227m);
            m1Var.a().c("zoom", Float.valueOf(this.f23228p));
            m1Var.a().c("style", this.f23229q);
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ dc.w invoke(m1 m1Var) {
            a(m1Var);
            return dc.w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Magnifier.kt */
    /* loaded from: classes.dex */
    public static final class b extends qc.r implements pc.l<j2.e, z0.f> {

        /* renamed from: f  reason: collision with root package name */
        public static final b f23230f = new b();

        b() {
            super(1);
        }

        public final long a(j2.e eVar) {
            qc.q.i(eVar, "$this$null");
            return z0.f.f26354b.b();
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ z0.f invoke(j2.e eVar) {
            return z0.f.d(a(eVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Magnifier.kt */
    /* loaded from: classes.dex */
    public static final class c extends qc.r implements pc.q<androidx.compose.ui.e, j0.l, Integer, androidx.compose.ui.e> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ pc.l<j2.e, z0.f> f23231f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ pc.l<j2.e, z0.f> f23232m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ float f23233p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ pc.l<j2.k, dc.w> f23234q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ l0 f23235r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ a0 f23236s;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Magnifier.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.MagnifierKt$magnifier$4$1", f = "Magnifier.kt", l = {363}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super dc.w>, Object> {
            final /* synthetic */ g3<Float> A;

            /* renamed from: f  reason: collision with root package name */
            int f23237f;

            /* renamed from: m  reason: collision with root package name */
            private /* synthetic */ Object f23238m;

            /* renamed from: p  reason: collision with root package name */
            final /* synthetic */ l0 f23239p;

            /* renamed from: q  reason: collision with root package name */
            final /* synthetic */ a0 f23240q;

            /* renamed from: r  reason: collision with root package name */
            final /* synthetic */ View f23241r;

            /* renamed from: s  reason: collision with root package name */
            final /* synthetic */ j2.e f23242s;

            /* renamed from: t  reason: collision with root package name */
            final /* synthetic */ float f23243t;

            /* renamed from: u  reason: collision with root package name */
            final /* synthetic */ dd.w<dc.w> f23244u;

            /* renamed from: v  reason: collision with root package name */
            final /* synthetic */ g3<pc.l<j2.k, dc.w>> f23245v;

            /* renamed from: w  reason: collision with root package name */
            final /* synthetic */ g3<Boolean> f23246w;

            /* renamed from: x  reason: collision with root package name */
            final /* synthetic */ g3<z0.f> f23247x;

            /* renamed from: y  reason: collision with root package name */
            final /* synthetic */ g3<pc.l<j2.e, z0.f>> f23248y;

            /* renamed from: z  reason: collision with root package name */
            final /* synthetic */ j1<z0.f> f23249z;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: Magnifier.kt */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.MagnifierKt$magnifier$4$1$1", f = "Magnifier.kt", l = {}, m = "invokeSuspend")
            /* renamed from: t.z$c$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0546a extends kotlin.coroutines.jvm.internal.l implements pc.p<dc.w, Continuation<? super dc.w>, Object> {

                /* renamed from: f  reason: collision with root package name */
                int f23250f;

                /* renamed from: m  reason: collision with root package name */
                final /* synthetic */ k0 f23251m;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0546a(k0 k0Var, Continuation<? super C0546a> continuation) {
                    super(2, continuation);
                    this.f23251m = k0Var;
                }

                @Override // pc.p
                /* renamed from: a  reason: merged with bridge method [inline-methods] */
                public final Object invoke(dc.w wVar, Continuation<? super dc.w> continuation) {
                    return ((C0546a) create(wVar, continuation)).invokeSuspend(dc.w.f13270a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
                    return new C0546a(this.f23251m, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    ic.d.d();
                    if (this.f23250f == 0) {
                        dc.n.b(obj);
                        this.f23251m.c();
                        return dc.w.f13270a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: Magnifier.kt */
            /* loaded from: classes.dex */
            public static final class b extends qc.r implements pc.a<dc.w> {

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ k0 f23252f;

                /* renamed from: m  reason: collision with root package name */
                final /* synthetic */ j2.e f23253m;

                /* renamed from: p  reason: collision with root package name */
                final /* synthetic */ g3<Boolean> f23254p;

                /* renamed from: q  reason: collision with root package name */
                final /* synthetic */ g3<z0.f> f23255q;

                /* renamed from: r  reason: collision with root package name */
                final /* synthetic */ g3<pc.l<j2.e, z0.f>> f23256r;

                /* renamed from: s  reason: collision with root package name */
                final /* synthetic */ j1<z0.f> f23257s;

                /* renamed from: t  reason: collision with root package name */
                final /* synthetic */ g3<Float> f23258t;

                /* renamed from: u  reason: collision with root package name */
                final /* synthetic */ qc.e0 f23259u;

                /* renamed from: v  reason: collision with root package name */
                final /* synthetic */ g3<pc.l<j2.k, dc.w>> f23260v;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                b(k0 k0Var, j2.e eVar, g3<Boolean> g3Var, g3<z0.f> g3Var2, g3<? extends pc.l<? super j2.e, z0.f>> g3Var3, j1<z0.f> j1Var, g3<Float> g3Var4, qc.e0 e0Var, g3<? extends pc.l<? super j2.k, dc.w>> g3Var5) {
                    super(0);
                    this.f23252f = k0Var;
                    this.f23253m = eVar;
                    this.f23254p = g3Var;
                    this.f23255q = g3Var2;
                    this.f23256r = g3Var3;
                    this.f23257s = j1Var;
                    this.f23258t = g3Var4;
                    this.f23259u = e0Var;
                    this.f23260v = g3Var5;
                }

                @Override // pc.a
                public /* bridge */ /* synthetic */ dc.w invoke() {
                    invoke2();
                    return dc.w.f13270a;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    long b10;
                    if (c.k(this.f23254p)) {
                        k0 k0Var = this.f23252f;
                        long q10 = c.q(this.f23255q);
                        Object invoke = c.n(this.f23256r).invoke(this.f23253m);
                        j1<z0.f> j1Var = this.f23257s;
                        long x10 = ((z0.f) invoke).x();
                        if (z0.g.c(x10)) {
                            b10 = z0.f.t(c.j(j1Var), x10);
                        } else {
                            b10 = z0.f.f26354b.b();
                        }
                        k0Var.b(q10, b10, c.o(this.f23258t));
                        long a10 = this.f23252f.a();
                        qc.e0 e0Var = this.f23259u;
                        j2.e eVar = this.f23253m;
                        g3<pc.l<j2.k, dc.w>> g3Var = this.f23260v;
                        if (j2.p.e(a10, e0Var.f21668f)) {
                            return;
                        }
                        e0Var.f21668f = a10;
                        pc.l p10 = c.p(g3Var);
                        if (p10 != null) {
                            p10.invoke(j2.k.c(eVar.K(j2.q.c(a10))));
                            return;
                        }
                        return;
                    }
                    this.f23252f.dismiss();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(l0 l0Var, a0 a0Var, View view, j2.e eVar, float f10, dd.w<dc.w> wVar, g3<? extends pc.l<? super j2.k, dc.w>> g3Var, g3<Boolean> g3Var2, g3<z0.f> g3Var3, g3<? extends pc.l<? super j2.e, z0.f>> g3Var4, j1<z0.f> j1Var, g3<Float> g3Var5, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f23239p = l0Var;
                this.f23240q = a0Var;
                this.f23241r = view;
                this.f23242s = eVar;
                this.f23243t = f10;
                this.f23244u = wVar;
                this.f23245v = g3Var;
                this.f23246w = g3Var2;
                this.f23247x = g3Var3;
                this.f23248y = g3Var4;
                this.f23249z = j1Var;
                this.A = g3Var5;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(this.f23239p, this.f23240q, this.f23241r, this.f23242s, this.f23243t, this.f23244u, this.f23245v, this.f23246w, this.f23247x, this.f23248y, this.f23249z, this.A, continuation);
                aVar.f23238m = obj;
                return aVar;
            }

            @Override // pc.p
            public final Object invoke(ad.k0 k0Var, Continuation<? super dc.w> continuation) {
                return ((a) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object d10;
                k0 k0Var;
                d10 = ic.d.d();
                int i10 = this.f23237f;
                if (i10 != 0) {
                    if (i10 == 1) {
                        k0Var = (k0) this.f23238m;
                        try {
                            dc.n.b(obj);
                        } catch (Throwable th) {
                            th = th;
                            k0Var.dismiss();
                            throw th;
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    dc.n.b(obj);
                    ad.k0 k0Var2 = (ad.k0) this.f23238m;
                    k0 b10 = this.f23239p.b(this.f23240q, this.f23241r, this.f23242s, this.f23243t);
                    qc.e0 e0Var = new qc.e0();
                    long a10 = b10.a();
                    j2.e eVar = this.f23242s;
                    pc.l p10 = c.p(this.f23245v);
                    if (p10 != null) {
                        p10.invoke(j2.k.c(eVar.K(j2.q.c(a10))));
                    }
                    e0Var.f21668f = a10;
                    dd.i.E(dd.i.J(this.f23244u, new C0546a(b10, null)), k0Var2);
                    try {
                        dd.g n10 = y2.n(new b(b10, this.f23242s, this.f23246w, this.f23247x, this.f23248y, this.f23249z, this.A, e0Var, this.f23245v));
                        this.f23238m = b10;
                        this.f23237f = 1;
                        if (dd.i.f(n10, this) == d10) {
                            return d10;
                        }
                        k0Var = b10;
                    } catch (Throwable th2) {
                        th = th2;
                        k0Var = b10;
                        k0Var.dismiss();
                        throw th;
                    }
                }
                k0Var.dismiss();
                return dc.w.f13270a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Magnifier.kt */
        /* loaded from: classes.dex */
        public static final class b extends qc.r implements pc.l<n1.s, dc.w> {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ j1<z0.f> f23261f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(j1<z0.f> j1Var) {
                super(1);
                this.f23261f = j1Var;
            }

            public final void a(n1.s sVar) {
                qc.q.i(sVar, "it");
                c.l(this.f23261f, n1.t.e(sVar));
            }

            @Override // pc.l
            public /* bridge */ /* synthetic */ dc.w invoke(n1.s sVar) {
                a(sVar);
                return dc.w.f13270a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Magnifier.kt */
        /* renamed from: t.z$c$c  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0547c extends qc.r implements pc.l<c1.f, dc.w> {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ dd.w<dc.w> f23262f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0547c(dd.w<dc.w> wVar) {
                super(1);
                this.f23262f = wVar;
            }

            @Override // pc.l
            public /* bridge */ /* synthetic */ dc.w invoke(c1.f fVar) {
                invoke2(fVar);
                return dc.w.f13270a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(c1.f fVar) {
                qc.q.i(fVar, "$this$drawBehind");
                this.f23262f.e(dc.w.f13270a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Magnifier.kt */
        /* loaded from: classes.dex */
        public static final class d extends qc.r implements pc.l<t1.x, dc.w> {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ g3<z0.f> f23263f;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: Magnifier.kt */
            /* loaded from: classes.dex */
            public static final class a extends qc.r implements pc.a<z0.f> {

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ g3<z0.f> f23264f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(g3<z0.f> g3Var) {
                    super(0);
                    this.f23264f = g3Var;
                }

                public final long a() {
                    return c.q(this.f23264f);
                }

                @Override // pc.a
                public /* bridge */ /* synthetic */ z0.f invoke() {
                    return z0.f.d(a());
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(g3<z0.f> g3Var) {
                super(1);
                this.f23263f = g3Var;
            }

            public final void a(t1.x xVar) {
                qc.q.i(xVar, "$this$semantics");
                xVar.a(z.a(), new a(this.f23263f));
            }

            @Override // pc.l
            public /* bridge */ /* synthetic */ dc.w invoke(t1.x xVar) {
                a(xVar);
                return dc.w.f13270a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Magnifier.kt */
        /* loaded from: classes.dex */
        public static final class e extends qc.r implements pc.a<Boolean> {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ g3<z0.f> f23265f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            e(g3<z0.f> g3Var) {
                super(0);
                this.f23265f = g3Var;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // pc.a
            public final Boolean invoke() {
                return Boolean.valueOf(z0.g.c(c.q(this.f23265f)));
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Magnifier.kt */
        /* loaded from: classes.dex */
        public static final class f extends qc.r implements pc.a<z0.f> {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ j2.e f23266f;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ g3<pc.l<j2.e, z0.f>> f23267m;

            /* renamed from: p  reason: collision with root package name */
            final /* synthetic */ j1<z0.f> f23268p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            f(j2.e eVar, g3<? extends pc.l<? super j2.e, z0.f>> g3Var, j1<z0.f> j1Var) {
                super(0);
                this.f23266f = eVar;
                this.f23267m = g3Var;
                this.f23268p = j1Var;
            }

            public final long a() {
                long x10 = ((z0.f) c.m(this.f23267m).invoke(this.f23266f)).x();
                if (z0.g.c(c.j(this.f23268p)) && z0.g.c(x10)) {
                    return z0.f.t(c.j(this.f23268p), x10);
                }
                return z0.f.f26354b.b();
            }

            @Override // pc.a
            public /* bridge */ /* synthetic */ z0.f invoke() {
                return z0.f.d(a());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(pc.l<? super j2.e, z0.f> lVar, pc.l<? super j2.e, z0.f> lVar2, float f10, pc.l<? super j2.k, dc.w> lVar3, l0 l0Var, a0 a0Var) {
            super(3);
            this.f23231f = lVar;
            this.f23232m = lVar2;
            this.f23233p = f10;
            this.f23234q = lVar3;
            this.f23235r = l0Var;
            this.f23236s = a0Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final long j(j1<z0.f> j1Var) {
            return j1Var.getValue().x();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean k(g3<Boolean> g3Var) {
            return g3Var.getValue().booleanValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void l(j1<z0.f> j1Var, long j10) {
            j1Var.setValue(z0.f.d(j10));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final pc.l<j2.e, z0.f> m(g3<? extends pc.l<? super j2.e, z0.f>> g3Var) {
            return (pc.l) g3Var.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final pc.l<j2.e, z0.f> n(g3<? extends pc.l<? super j2.e, z0.f>> g3Var) {
            return (pc.l) g3Var.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final float o(g3<Float> g3Var) {
            return g3Var.getValue().floatValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final pc.l<j2.k, dc.w> p(g3<? extends pc.l<? super j2.k, dc.w>> g3Var) {
            return (pc.l) g3Var.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final long q(g3<z0.f> g3Var) {
            return g3Var.getValue().x();
        }

        public final androidx.compose.ui.e i(androidx.compose.ui.e eVar, j0.l lVar, int i10) {
            float f10;
            qc.q.i(eVar, "$this$composed");
            lVar.e(-454877003);
            if (j0.n.K()) {
                j0.n.V(-454877003, i10, -1, "androidx.compose.foundation.magnifier.<anonymous> (Magnifier.kt:270)");
            }
            View view = (View) lVar.C(androidx.compose.ui.platform.j0.k());
            j2.e eVar2 = (j2.e) lVar.C(z0.e());
            lVar.e(-492369756);
            Object f11 = lVar.f();
            l.a aVar = j0.l.f18688a;
            if (f11 == aVar.a()) {
                f11 = d3.e(z0.f.d(z0.f.f26354b.b()), null, 2, null);
                lVar.J(f11);
            }
            lVar.N();
            j1 j1Var = (j1) f11;
            g3 m10 = y2.m(this.f23231f, lVar, 0);
            g3 m11 = y2.m(this.f23232m, lVar, 0);
            g3 m12 = y2.m(Float.valueOf(this.f23233p), lVar, 0);
            g3 m13 = y2.m(this.f23234q, lVar, 0);
            lVar.e(-492369756);
            Object f12 = lVar.f();
            if (f12 == aVar.a()) {
                f12 = y2.d(new f(eVar2, m10, j1Var));
                lVar.J(f12);
            }
            lVar.N();
            g3 g3Var = (g3) f12;
            lVar.e(-492369756);
            Object f13 = lVar.f();
            if (f13 == aVar.a()) {
                f13 = y2.d(new e(g3Var));
                lVar.J(f13);
            }
            lVar.N();
            g3 g3Var2 = (g3) f13;
            lVar.e(-492369756);
            Object f14 = lVar.f();
            if (f14 == aVar.a()) {
                f14 = dd.d0.b(1, 0, cd.a.DROP_OLDEST, 2, null);
                lVar.J(f14);
            }
            lVar.N();
            dd.w wVar = (dd.w) f14;
            if (this.f23235r.a()) {
                f10 = 0.0f;
            } else {
                f10 = this.f23233p;
            }
            a0 a0Var = this.f23236s;
            j0.h0.e(new Object[]{view, eVar2, Float.valueOf(f10), a0Var, Boolean.valueOf(qc.q.d(a0Var, a0.f23106g.b()))}, new a(this.f23235r, this.f23236s, view, eVar2, this.f23233p, wVar, m13, g3Var2, g3Var, m11, j1Var, m12, null), lVar, 72);
            lVar.e(1157296644);
            boolean Q = lVar.Q(j1Var);
            Object f15 = lVar.f();
            if (Q || f15 == aVar.a()) {
                f15 = new b(j1Var);
                lVar.J(f15);
            }
            lVar.N();
            androidx.compose.ui.e b10 = androidx.compose.ui.draw.b.b(androidx.compose.ui.layout.c.a(eVar, (pc.l) f15), new C0547c(wVar));
            lVar.e(1157296644);
            boolean Q2 = lVar.Q(g3Var);
            Object f16 = lVar.f();
            if (Q2 || f16 == aVar.a()) {
                f16 = new d(g3Var);
                lVar.J(f16);
            }
            lVar.N();
            androidx.compose.ui.e c10 = t1.o.c(b10, false, (pc.l) f16, 1, null);
            if (j0.n.K()) {
                j0.n.U();
            }
            lVar.N();
            return c10;
        }

        @Override // pc.q
        public /* bridge */ /* synthetic */ androidx.compose.ui.e invoke(androidx.compose.ui.e eVar, j0.l lVar, Integer num) {
            return i(eVar, lVar, num.intValue());
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [pc.p, qc.h] */
    static {
        ?? r12 = 0;
        f23225a = new t1.w<>("MagnifierPositionInRoot", r12, 2, r12);
    }

    public static final t1.w<pc.a<z0.f>> a() {
        return f23225a;
    }

    public static final boolean b(int i10) {
        if (i10 >= 28) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ boolean c(int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = Build.VERSION.SDK_INT;
        }
        return b(i10);
    }

    public static final androidx.compose.ui.e d(androidx.compose.ui.e eVar, pc.l<? super j2.e, z0.f> lVar, pc.l<? super j2.e, z0.f> lVar2, float f10, a0 a0Var, pc.l<? super j2.k, dc.w> lVar3) {
        pc.l a10;
        qc.q.i(eVar, "<this>");
        qc.q.i(lVar, "sourceCenter");
        qc.q.i(lVar2, "magnifierCenter");
        qc.q.i(a0Var, "style");
        if (k1.c()) {
            a10 = new a(lVar, lVar2, f10, a0Var);
        } else {
            a10 = k1.a();
        }
        androidx.compose.ui.e eVar2 = androidx.compose.ui.e.f2335a;
        if (c(0, 1, null)) {
            eVar2 = e(eVar2, lVar, lVar2, f10, a0Var, lVar3, l0.f23184a.a());
        }
        return k1.b(eVar, a10, eVar2);
    }

    public static final androidx.compose.ui.e e(androidx.compose.ui.e eVar, pc.l<? super j2.e, z0.f> lVar, pc.l<? super j2.e, z0.f> lVar2, float f10, a0 a0Var, pc.l<? super j2.k, dc.w> lVar3, l0 l0Var) {
        qc.q.i(eVar, "<this>");
        qc.q.i(lVar, "sourceCenter");
        qc.q.i(lVar2, "magnifierCenter");
        qc.q.i(a0Var, "style");
        qc.q.i(l0Var, "platformMagnifierFactory");
        return androidx.compose.ui.c.b(eVar, null, new c(lVar, lVar2, f10, lVar3, l0Var, a0Var), 1, null);
    }

    public static /* synthetic */ androidx.compose.ui.e f(androidx.compose.ui.e eVar, pc.l lVar, pc.l lVar2, float f10, a0 a0Var, pc.l lVar3, int i10, Object obj) {
        float f11;
        if ((i10 & 2) != 0) {
            lVar2 = b.f23230f;
        }
        pc.l lVar4 = lVar2;
        if ((i10 & 4) != 0) {
            f11 = Float.NaN;
        } else {
            f11 = f10;
        }
        if ((i10 & 8) != 0) {
            a0Var = a0.f23106g.a();
        }
        a0 a0Var2 = a0Var;
        if ((i10 & 16) != 0) {
            lVar3 = null;
        }
        return d(eVar, lVar, lVar4, f11, a0Var2, lVar3);
    }
}
