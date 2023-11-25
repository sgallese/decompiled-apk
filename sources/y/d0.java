package y;

import ad.k0;
import kotlin.coroutines.Continuation;

/* compiled from: LazyLayoutSemantics.kt */
/* loaded from: classes.dex */
public final class d0 {

    /* compiled from: LazyLayoutSemantics.kt */
    /* loaded from: classes.dex */
    static final class a extends qc.r implements pc.l<t1.x, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ pc.l<Object, Integer> f26025f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ boolean f26026m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ t1.j f26027p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ pc.p<Float, Float, Boolean> f26028q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ pc.l<Integer, Boolean> f26029r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ t1.b f26030s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(pc.l<Object, Integer> lVar, boolean z10, t1.j jVar, pc.p<? super Float, ? super Float, Boolean> pVar, pc.l<? super Integer, Boolean> lVar2, t1.b bVar) {
            super(1);
            this.f26025f = lVar;
            this.f26026m = z10;
            this.f26027p = jVar;
            this.f26028q = pVar;
            this.f26029r = lVar2;
            this.f26030s = bVar;
        }

        public final void a(t1.x xVar) {
            qc.q.i(xVar, "$this$semantics");
            t1.v.Z(xVar, true);
            t1.v.o(xVar, this.f26025f);
            if (this.f26026m) {
                t1.v.a0(xVar, this.f26027p);
            } else {
                t1.v.M(xVar, this.f26027p);
            }
            pc.p<Float, Float, Boolean> pVar = this.f26028q;
            if (pVar != null) {
                t1.v.E(xVar, null, pVar, 1, null);
            }
            pc.l<Integer, Boolean> lVar = this.f26029r;
            if (lVar != null) {
                t1.v.G(xVar, null, lVar, 1, null);
            }
            t1.v.H(xVar, this.f26030s);
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ dc.w invoke(t1.x xVar) {
            a(xVar);
            return dc.w.f13270a;
        }
    }

    /* compiled from: LazyLayoutSemantics.kt */
    /* loaded from: classes.dex */
    static final class b extends qc.r implements pc.a<Float> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ c0 f26031f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(c0 c0Var) {
            super(0);
            this.f26031f = c0Var;
        }

        @Override // pc.a
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final Float invoke() {
            return Float.valueOf(this.f26031f.e());
        }
    }

    /* compiled from: LazyLayoutSemantics.kt */
    /* loaded from: classes.dex */
    static final class c extends qc.r implements pc.a<Float> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ pc.a<o> f26032f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ c0 f26033m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(pc.a<? extends o> aVar, c0 c0Var) {
            super(0);
            this.f26032f = aVar;
            this.f26033m = c0Var;
        }

        @Override // pc.a
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final Float invoke() {
            float e10;
            o invoke = this.f26032f.invoke();
            if (this.f26033m.a()) {
                e10 = invoke.c() + 1.0f;
            } else {
                e10 = this.f26033m.e();
            }
            return Float.valueOf(e10);
        }
    }

    /* compiled from: LazyLayoutSemantics.kt */
    /* loaded from: classes.dex */
    static final class d extends qc.r implements pc.l<Object, Integer> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ pc.a<o> f26034f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(pc.a<? extends o> aVar) {
            super(1);
            this.f26034f = aVar;
        }

        @Override // pc.l
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final Integer invoke(Object obj) {
            qc.q.i(obj, "needle");
            o invoke = this.f26034f.invoke();
            int c10 = invoke.c();
            int i10 = 0;
            while (true) {
                if (i10 < c10) {
                    if (qc.q.d(invoke.a(i10), obj)) {
                        break;
                    }
                    i10++;
                } else {
                    i10 = -1;
                    break;
                }
            }
            return Integer.valueOf(i10);
        }
    }

    /* compiled from: LazyLayoutSemantics.kt */
    /* loaded from: classes.dex */
    static final class e extends qc.r implements pc.p<Float, Float, Boolean> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ boolean f26035f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ k0 f26036m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ c0 f26037p;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: LazyLayoutSemantics.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt$lazyLayoutSemantics$1$scrollByAction$1$1", f = "LazyLayoutSemantics.kt", l = {99}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements pc.p<k0, Continuation<? super dc.w>, Object> {

            /* renamed from: f  reason: collision with root package name */
            int f26038f;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ c0 f26039m;

            /* renamed from: p  reason: collision with root package name */
            final /* synthetic */ float f26040p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(c0 c0Var, float f10, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f26039m = c0Var;
                this.f26040p = f10;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
                return new a(this.f26039m, this.f26040p, continuation);
            }

            @Override // pc.p
            public final Object invoke(k0 k0Var, Continuation<? super dc.w> continuation) {
                return ((a) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object d10;
                d10 = ic.d.d();
                int i10 = this.f26038f;
                if (i10 != 0) {
                    if (i10 == 1) {
                        dc.n.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    dc.n.b(obj);
                    c0 c0Var = this.f26039m;
                    float f10 = this.f26040p;
                    this.f26038f = 1;
                    if (c0Var.c(f10, this) == d10) {
                        return d10;
                    }
                }
                return dc.w.f13270a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(boolean z10, k0 k0Var, c0 c0Var) {
            super(2);
            this.f26035f = z10;
            this.f26036m = k0Var;
            this.f26037p = c0Var;
        }

        public final Boolean a(float f10, float f11) {
            if (this.f26035f) {
                f10 = f11;
            }
            ad.i.d(this.f26036m, null, null, new a(this.f26037p, f10, null), 3, null);
            return Boolean.TRUE;
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ Boolean invoke(Float f10, Float f11) {
            return a(f10.floatValue(), f11.floatValue());
        }
    }

    /* compiled from: LazyLayoutSemantics.kt */
    /* loaded from: classes.dex */
    static final class f extends qc.r implements pc.l<Integer, Boolean> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ pc.a<o> f26041f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ k0 f26042m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ c0 f26043p;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: LazyLayoutSemantics.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt$lazyLayoutSemantics$1$scrollToIndexAction$1$2", f = "LazyLayoutSemantics.kt", l = {116}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements pc.p<k0, Continuation<? super dc.w>, Object> {

            /* renamed from: f  reason: collision with root package name */
            int f26044f;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ c0 f26045m;

            /* renamed from: p  reason: collision with root package name */
            final /* synthetic */ int f26046p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(c0 c0Var, int i10, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f26045m = c0Var;
                this.f26046p = i10;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
                return new a(this.f26045m, this.f26046p, continuation);
            }

            @Override // pc.p
            public final Object invoke(k0 k0Var, Continuation<? super dc.w> continuation) {
                return ((a) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object d10;
                d10 = ic.d.d();
                int i10 = this.f26044f;
                if (i10 != 0) {
                    if (i10 == 1) {
                        dc.n.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    dc.n.b(obj);
                    c0 c0Var = this.f26045m;
                    int i11 = this.f26046p;
                    this.f26044f = 1;
                    if (c0Var.b(i11, this) == d10) {
                        return d10;
                    }
                }
                return dc.w.f13270a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(pc.a<? extends o> aVar, k0 k0Var, c0 c0Var) {
            super(1);
            this.f26041f = aVar;
            this.f26042m = k0Var;
            this.f26043p = c0Var;
        }

        public final Boolean a(int i10) {
            boolean z10;
            o invoke = this.f26041f.invoke();
            if (i10 >= 0 && i10 < invoke.c()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                ad.i.d(this.f26042m, null, null, new a(this.f26043p, i10, null), 3, null);
                return Boolean.TRUE;
            }
            throw new IllegalArgumentException(("Can't scroll to index " + i10 + ", it is out of bounds [0, " + invoke.c() + ')').toString());
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ Boolean invoke(Integer num) {
            return a(num.intValue());
        }
    }

    public static final androidx.compose.ui.e a(androidx.compose.ui.e eVar, pc.a<? extends o> aVar, c0 c0Var, u.o oVar, boolean z10, boolean z11, j0.l lVar, int i10) {
        boolean z12;
        e eVar2;
        f fVar;
        qc.q.i(eVar, "<this>");
        qc.q.i(aVar, "itemProviderLambda");
        qc.q.i(c0Var, "state");
        qc.q.i(oVar, "orientation");
        lVar.e(1070136913);
        if (j0.n.K()) {
            j0.n.V(1070136913, i10, -1, "androidx.compose.foundation.lazy.layout.lazyLayoutSemantics (LazyLayoutSemantics.kt:40)");
        }
        lVar.e(773894976);
        lVar.e(-492369756);
        Object f10 = lVar.f();
        if (f10 == j0.l.f18688a.a()) {
            j0.x xVar = new j0.x(j0.h0.h(hc.g.f16601f, lVar));
            lVar.J(xVar);
            f10 = xVar;
        }
        lVar.N();
        k0 a10 = ((j0.x) f10).a();
        lVar.N();
        Object[] objArr = {aVar, c0Var, oVar, Boolean.valueOf(z10)};
        lVar.e(-568225417);
        boolean z13 = false;
        for (int i11 = 0; i11 < 4; i11++) {
            z13 |= lVar.Q(objArr[i11]);
        }
        Object f11 = lVar.f();
        if (z13 || f11 == j0.l.f18688a.a()) {
            if (oVar == u.o.Vertical) {
                z12 = true;
            } else {
                z12 = false;
            }
            d dVar = new d(aVar);
            t1.j jVar = new t1.j(new b(c0Var), new c(aVar, c0Var), z11);
            if (z10) {
                eVar2 = new e(z12, a10, c0Var);
            } else {
                eVar2 = null;
            }
            if (z10) {
                fVar = new f(aVar, a10, c0Var);
            } else {
                fVar = null;
            }
            f11 = t1.o.c(androidx.compose.ui.e.f2335a, false, new a(dVar, z12, jVar, eVar2, fVar, c0Var.d()), 1, null);
            lVar.J(f11);
        }
        lVar.N();
        androidx.compose.ui.e a11 = eVar.a((androidx.compose.ui.e) f11);
        if (j0.n.K()) {
            j0.n.U();
        }
        lVar.N();
        return a11;
    }
}
