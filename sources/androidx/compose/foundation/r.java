package androidx.compose.foundation;

import ad.k0;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.k1;
import androidx.compose.ui.platform.m1;
import androidx.compose.ui.platform.z0;
import dc.w;
import j0.h0;
import kotlin.coroutines.Continuation;
import t.i0;
import t.j0;
import t1.v;
import t1.x;

/* compiled from: Scroll.kt */
/* loaded from: classes.dex */
public final class r {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Scroll.kt */
    /* loaded from: classes.dex */
    public static final class a extends qc.r implements pc.a<s> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f2168f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i10) {
            super(0);
            this.f2168f = i10;
        }

        @Override // pc.a
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final s invoke() {
            return new s(this.f2168f);
        }
    }

    /* compiled from: InspectableValue.kt */
    /* loaded from: classes.dex */
    public static final class b extends qc.r implements pc.l<m1, w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ s f2169f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ boolean f2170m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ u.m f2171p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ boolean f2172q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ boolean f2173r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(s sVar, boolean z10, u.m mVar, boolean z11, boolean z12) {
            super(1);
            this.f2169f = sVar;
            this.f2170m = z10;
            this.f2171p = mVar;
            this.f2172q = z11;
            this.f2173r = z12;
        }

        public final void a(m1 m1Var) {
            qc.q.i(m1Var, "$this$null");
            m1Var.b("scroll");
            m1Var.a().c("state", this.f2169f);
            m1Var.a().c("reverseScrolling", Boolean.valueOf(this.f2170m));
            m1Var.a().c("flingBehavior", this.f2171p);
            m1Var.a().c("isScrollable", Boolean.valueOf(this.f2172q));
            m1Var.a().c("isVertical", Boolean.valueOf(this.f2173r));
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ w invoke(m1 m1Var) {
            a(m1Var);
            return w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Scroll.kt */
    /* loaded from: classes.dex */
    public static final class c extends qc.r implements pc.q<androidx.compose.ui.e, j0.l, Integer, androidx.compose.ui.e> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ boolean f2174f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ boolean f2175m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ s f2176p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ boolean f2177q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ u.m f2178r;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Scroll.kt */
        /* loaded from: classes.dex */
        public static final class a extends qc.r implements pc.l<x, w> {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ boolean f2179f;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ boolean f2180m;

            /* renamed from: p  reason: collision with root package name */
            final /* synthetic */ boolean f2181p;

            /* renamed from: q  reason: collision with root package name */
            final /* synthetic */ s f2182q;

            /* renamed from: r  reason: collision with root package name */
            final /* synthetic */ k0 f2183r;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: Scroll.kt */
            /* renamed from: androidx.compose.foundation.r$c$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0026a extends qc.r implements pc.p<Float, Float, Boolean> {

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ k0 f2184f;

                /* renamed from: m  reason: collision with root package name */
                final /* synthetic */ boolean f2185m;

                /* renamed from: p  reason: collision with root package name */
                final /* synthetic */ s f2186p;

                /* JADX INFO: Access modifiers changed from: package-private */
                /* compiled from: Scroll.kt */
                @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.ScrollKt$scroll$2$semantics$1$1$1", f = "Scroll.kt", l = {288, 290}, m = "invokeSuspend")
                /* renamed from: androidx.compose.foundation.r$c$a$a$a  reason: collision with other inner class name */
                /* loaded from: classes.dex */
                public static final class C0027a extends kotlin.coroutines.jvm.internal.l implements pc.p<k0, Continuation<? super w>, Object> {

                    /* renamed from: f  reason: collision with root package name */
                    int f2187f;

                    /* renamed from: m  reason: collision with root package name */
                    final /* synthetic */ boolean f2188m;

                    /* renamed from: p  reason: collision with root package name */
                    final /* synthetic */ s f2189p;

                    /* renamed from: q  reason: collision with root package name */
                    final /* synthetic */ float f2190q;

                    /* renamed from: r  reason: collision with root package name */
                    final /* synthetic */ float f2191r;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0027a(boolean z10, s sVar, float f10, float f11, Continuation<? super C0027a> continuation) {
                        super(2, continuation);
                        this.f2188m = z10;
                        this.f2189p = sVar;
                        this.f2190q = f10;
                        this.f2191r = f11;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
                        return new C0027a(this.f2188m, this.f2189p, this.f2190q, this.f2191r, continuation);
                    }

                    @Override // pc.p
                    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
                        return ((C0027a) create(k0Var, continuation)).invokeSuspend(w.f13270a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        Object d10;
                        d10 = ic.d.d();
                        int i10 = this.f2187f;
                        if (i10 != 0) {
                            if (i10 != 1 && i10 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            dc.n.b(obj);
                        } else {
                            dc.n.b(obj);
                            if (this.f2188m) {
                                s sVar = this.f2189p;
                                qc.q.g(sVar, "null cannot be cast to non-null type androidx.compose.foundation.gestures.ScrollableState");
                                float f10 = this.f2190q;
                                this.f2187f = 1;
                                if (u.t.b(sVar, f10, null, this, 2, null) == d10) {
                                    return d10;
                                }
                            } else {
                                s sVar2 = this.f2189p;
                                qc.q.g(sVar2, "null cannot be cast to non-null type androidx.compose.foundation.gestures.ScrollableState");
                                float f11 = this.f2191r;
                                this.f2187f = 2;
                                if (u.t.b(sVar2, f11, null, this, 2, null) == d10) {
                                    return d10;
                                }
                            }
                        }
                        return w.f13270a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0026a(k0 k0Var, boolean z10, s sVar) {
                    super(2);
                    this.f2184f = k0Var;
                    this.f2185m = z10;
                    this.f2186p = sVar;
                }

                public final Boolean a(float f10, float f11) {
                    ad.i.d(this.f2184f, null, null, new C0027a(this.f2185m, this.f2186p, f11, f10, null), 3, null);
                    return Boolean.TRUE;
                }

                @Override // pc.p
                public /* bridge */ /* synthetic */ Boolean invoke(Float f10, Float f11) {
                    return a(f10.floatValue(), f11.floatValue());
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: Scroll.kt */
            /* loaded from: classes.dex */
            public static final class b extends qc.r implements pc.a<Float> {

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ s f2192f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(s sVar) {
                    super(0);
                    this.f2192f = sVar;
                }

                @Override // pc.a
                /* renamed from: a  reason: merged with bridge method [inline-methods] */
                public final Float invoke() {
                    return Float.valueOf(this.f2192f.l());
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: Scroll.kt */
            /* renamed from: androidx.compose.foundation.r$c$a$c  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0028c extends qc.r implements pc.a<Float> {

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ s f2193f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0028c(s sVar) {
                    super(0);
                    this.f2193f = sVar;
                }

                @Override // pc.a
                /* renamed from: a  reason: merged with bridge method [inline-methods] */
                public final Float invoke() {
                    return Float.valueOf(this.f2193f.k());
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(boolean z10, boolean z11, boolean z12, s sVar, k0 k0Var) {
                super(1);
                this.f2179f = z10;
                this.f2180m = z11;
                this.f2181p = z12;
                this.f2182q = sVar;
                this.f2183r = k0Var;
            }

            public final void a(x xVar) {
                qc.q.i(xVar, "$this$semantics");
                v.Z(xVar, true);
                t1.j jVar = new t1.j(new b(this.f2182q), new C0028c(this.f2182q), this.f2179f);
                if (this.f2180m) {
                    v.a0(xVar, jVar);
                } else {
                    v.M(xVar, jVar);
                }
                if (this.f2181p) {
                    v.E(xVar, null, new C0026a(this.f2183r, this.f2180m, this.f2182q), 1, null);
                }
            }

            @Override // pc.l
            public /* bridge */ /* synthetic */ w invoke(x xVar) {
                a(xVar);
                return w.f13270a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(boolean z10, boolean z11, s sVar, boolean z12, u.m mVar) {
            super(3);
            this.f2174f = z10;
            this.f2175m = z11;
            this.f2176p = sVar;
            this.f2177q = z12;
            this.f2178r = mVar;
        }

        public final androidx.compose.ui.e a(androidx.compose.ui.e eVar, j0.l lVar, int i10) {
            u.o oVar;
            qc.q.i(eVar, "$this$composed");
            lVar.e(1478351300);
            if (j0.n.K()) {
                j0.n.V(1478351300, i10, -1, "androidx.compose.foundation.scroll.<anonymous> (Scroll.kt:266)");
            }
            u.v vVar = u.v.f23988a;
            i0 b10 = vVar.b(lVar, 6);
            lVar.e(773894976);
            lVar.e(-492369756);
            Object f10 = lVar.f();
            if (f10 == j0.l.f18688a.a()) {
                j0.x xVar = new j0.x(h0.h(hc.g.f16601f, lVar));
                lVar.J(xVar);
                f10 = xVar;
            }
            lVar.N();
            k0 a10 = ((j0.x) f10).a();
            lVar.N();
            e.a aVar = androidx.compose.ui.e.f2335a;
            androidx.compose.ui.e c10 = t1.o.c(aVar, false, new a(this.f2175m, this.f2174f, this.f2177q, this.f2176p, a10), 1, null);
            if (this.f2174f) {
                oVar = u.o.Vertical;
            } else {
                oVar = u.o.Horizontal;
            }
            u.o oVar2 = oVar;
            androidx.compose.ui.e i11 = androidx.compose.foundation.gestures.d.i(aVar, this.f2176p, oVar2, b10, this.f2177q, vVar.c((j2.r) lVar.C(z0.j()), oVar2, this.f2175m), this.f2178r, this.f2176p.j());
            androidx.compose.ui.e a11 = j0.a(t.m.a(c10, oVar2), b10).a(i11).a(new ScrollingLayoutElement(this.f2176p, this.f2175m, this.f2174f));
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

    public static final s a(int i10, j0.l lVar, int i11, int i12) {
        lVar.e(-1464256199);
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if (j0.n.K()) {
            j0.n.V(-1464256199, i11, -1, "androidx.compose.foundation.rememberScrollState (Scroll.kt:72)");
        }
        Object[] objArr = new Object[0];
        s0.i<s, ?> a10 = s.f2225i.a();
        Integer valueOf = Integer.valueOf(i10);
        lVar.e(1157296644);
        boolean Q = lVar.Q(valueOf);
        Object f10 = lVar.f();
        if (Q || f10 == j0.l.f18688a.a()) {
            f10 = new a(i10);
            lVar.J(f10);
        }
        lVar.N();
        s sVar = (s) s0.b.b(objArr, a10, null, (pc.a) f10, lVar, 72, 4);
        if (j0.n.K()) {
            j0.n.U();
        }
        lVar.N();
        return sVar;
    }

    private static final androidx.compose.ui.e b(androidx.compose.ui.e eVar, s sVar, boolean z10, u.m mVar, boolean z11, boolean z12) {
        pc.l a10;
        if (k1.c()) {
            a10 = new b(sVar, z10, mVar, z11, z12);
        } else {
            a10 = k1.a();
        }
        return androidx.compose.ui.c.a(eVar, a10, new c(z12, z10, sVar, z11, mVar));
    }

    public static final androidx.compose.ui.e c(androidx.compose.ui.e eVar, s sVar, boolean z10, u.m mVar, boolean z11) {
        qc.q.i(eVar, "<this>");
        qc.q.i(sVar, "state");
        return b(eVar, sVar, z11, mVar, z10, true);
    }

    public static /* synthetic */ androidx.compose.ui.e d(androidx.compose.ui.e eVar, s sVar, boolean z10, u.m mVar, boolean z11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        if ((i10 & 4) != 0) {
            mVar = null;
        }
        if ((i10 & 8) != 0) {
            z11 = false;
        }
        return c(eVar, sVar, z10, mVar, z11);
    }
}
