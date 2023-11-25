package c0;

import a1.p1;
import a1.r4;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.coroutines.Continuation;
import s.o0;

/* compiled from: TextFieldCursor.kt */
/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: a  reason: collision with root package name */
    private static final s.j<Float> f8268a = s.k.d(s.k.e(b.f8283f), null, 0, 6, null);

    /* renamed from: b  reason: collision with root package name */
    private static final float f8269b = j2.h.j(2);

    /* compiled from: TextFieldCursor.kt */
    /* loaded from: classes.dex */
    static final class a extends qc.r implements pc.q<androidx.compose.ui.e, j0.l, Integer, androidx.compose.ui.e> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ a1.e1 f8270f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ t0 f8271m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ b2.j0 f8272p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ b2.x f8273q;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: TextFieldCursor.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.TextFieldCursorKt$cursor$1$1", f = "TextFieldCursor.kt", l = {51}, m = "invokeSuspend")
        /* renamed from: c0.g0$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0199a extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super dc.w>, Object> {

            /* renamed from: f  reason: collision with root package name */
            int f8274f;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ s.a<Float, s.n> f8275m;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: TextFieldCursor.kt */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.TextFieldCursorKt$cursor$1$1$1", f = "TextFieldCursor.kt", l = {53, 55}, m = "invokeSuspend")
            /* renamed from: c0.g0$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0200a extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super dc.w>, Object> {

                /* renamed from: f  reason: collision with root package name */
                int f8276f;

                /* renamed from: m  reason: collision with root package name */
                final /* synthetic */ s.a<Float, s.n> f8277m;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0200a(s.a<Float, s.n> aVar, Continuation<? super C0200a> continuation) {
                    super(2, continuation);
                    this.f8277m = aVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
                    return new C0200a(this.f8277m, continuation);
                }

                @Override // pc.p
                public final Object invoke(ad.k0 k0Var, Continuation<? super dc.w> continuation) {
                    return ((C0200a) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object d10;
                    d10 = ic.d.d();
                    int i10 = this.f8276f;
                    if (i10 != 0) {
                        if (i10 != 1) {
                            if (i10 == 2) {
                                dc.n.b(obj);
                                return dc.w.f13270a;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        dc.n.b(obj);
                    } else {
                        dc.n.b(obj);
                        s.a<Float, s.n> aVar = this.f8277m;
                        Float c10 = kotlin.coroutines.jvm.internal.b.c(1.0f);
                        this.f8276f = 1;
                        if (aVar.u(c10, this) == d10) {
                            return d10;
                        }
                    }
                    s.a<Float, s.n> aVar2 = this.f8277m;
                    Float c11 = kotlin.coroutines.jvm.internal.b.c(0.0f);
                    s.j jVar = g0.f8268a;
                    this.f8276f = 2;
                    if (s.a.f(aVar2, c11, jVar, null, null, this, 12, null) == d10) {
                        return d10;
                    }
                    return dc.w.f13270a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0199a(s.a<Float, s.n> aVar, Continuation<? super C0199a> continuation) {
                super(2, continuation);
                this.f8275m = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
                return new C0199a(this.f8275m, continuation);
            }

            @Override // pc.p
            public final Object invoke(ad.k0 k0Var, Continuation<? super dc.w> continuation) {
                return ((C0199a) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object d10;
                d10 = ic.d.d();
                int i10 = this.f8274f;
                if (i10 != 0) {
                    if (i10 == 1) {
                        dc.n.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    dc.n.b(obj);
                    k kVar = k.f8451f;
                    C0200a c0200a = new C0200a(this.f8275m, null);
                    this.f8274f = 1;
                    if (ad.g.g(kVar, c0200a, this) == d10) {
                        return d10;
                    }
                }
                return dc.w.f13270a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: TextFieldCursor.kt */
        /* loaded from: classes.dex */
        public static final class b extends qc.r implements pc.l<c1.c, dc.w> {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ s.a<Float, s.n> f8278f;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ b2.x f8279m;

            /* renamed from: p  reason: collision with root package name */
            final /* synthetic */ b2.j0 f8280p;

            /* renamed from: q  reason: collision with root package name */
            final /* synthetic */ t0 f8281q;

            /* renamed from: r  reason: collision with root package name */
            final /* synthetic */ a1.e1 f8282r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(s.a<Float, s.n> aVar, b2.x xVar, b2.j0 j0Var, t0 t0Var, a1.e1 e1Var) {
                super(1);
                this.f8278f = aVar;
                this.f8279m = xVar;
                this.f8280p = j0Var;
                this.f8281q = t0Var;
                this.f8282r = e1Var;
            }

            public final void a(c1.c cVar) {
                float k10;
                boolean z10;
                z0.h hVar;
                float g10;
                v1.g0 i10;
                qc.q.i(cVar, "$this$drawWithContent");
                cVar.d1();
                k10 = vc.l.k(this.f8278f.n().floatValue(), 0.0f, 1.0f);
                if (k10 == 0.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    int b10 = this.f8279m.b(v1.i0.n(this.f8280p.g()));
                    v0 g11 = this.f8281q.g();
                    if (g11 == null || (i10 = g11.i()) == null || (hVar = i10.d(b10)) == null) {
                        hVar = new z0.h(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                    float v02 = cVar.v0(g0.c());
                    float f10 = v02 / 2;
                    g10 = vc.l.g(hVar.i() + f10, z0.l.i(cVar.b()) - f10);
                    c1.e.i(cVar, this.f8282r, z0.g.a(g10, hVar.l()), z0.g.a(g10, hVar.e()), v02, 0, null, k10, null, 0, 432, null);
                }
            }

            @Override // pc.l
            public /* bridge */ /* synthetic */ dc.w invoke(c1.c cVar) {
                a(cVar);
                return dc.w.f13270a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(a1.e1 e1Var, t0 t0Var, b2.j0 j0Var, b2.x xVar) {
            super(3);
            this.f8270f = e1Var;
            this.f8271m = t0Var;
            this.f8272p = j0Var;
            this.f8273q = xVar;
        }

        public final androidx.compose.ui.e a(androidx.compose.ui.e eVar, j0.l lVar, int i10) {
            androidx.compose.ui.e eVar2;
            boolean z10;
            qc.q.i(eVar, "$this$composed");
            lVar.e(1634330012);
            if (j0.n.K()) {
                j0.n.V(1634330012, i10, -1, "androidx.compose.foundation.text.cursor.<anonymous> (TextFieldCursor.kt:44)");
            }
            lVar.e(-492369756);
            Object f10 = lVar.f();
            if (f10 == j0.l.f18688a.a()) {
                f10 = s.b.b(1.0f, 0.0f, 2, null);
                lVar.J(f10);
            }
            lVar.N();
            s.a aVar = (s.a) f10;
            a1.e1 e1Var = this.f8270f;
            boolean z11 = true;
            if (e1Var instanceof r4) {
                if (((r4) e1Var).b() == p1.f146b.e()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    z11 = false;
                }
            }
            if (this.f8271m.d() && v1.i0.h(this.f8272p.g()) && z11) {
                j0.h0.c(this.f8272p.e(), v1.i0.b(this.f8272p.g()), new C0199a(aVar, null), lVar, 512);
                eVar2 = androidx.compose.ui.draw.b.d(eVar, new b(aVar, this.f8273q, this.f8272p, this.f8271m, this.f8270f));
            } else {
                eVar2 = androidx.compose.ui.e.f2335a;
            }
            if (j0.n.K()) {
                j0.n.U();
            }
            lVar.N();
            return eVar2;
        }

        @Override // pc.q
        public /* bridge */ /* synthetic */ androidx.compose.ui.e invoke(androidx.compose.ui.e eVar, j0.l lVar, Integer num) {
            return a(eVar, lVar, num.intValue());
        }
    }

    /* compiled from: TextFieldCursor.kt */
    /* loaded from: classes.dex */
    static final class b extends qc.r implements pc.l<o0.b<Float>, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        public static final b f8283f = new b();

        b() {
            super(1);
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ dc.w invoke(o0.b<Float> bVar) {
            invoke2(bVar);
            return dc.w.f13270a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(o0.b<Float> bVar) {
            qc.q.i(bVar, "$this$keyframes");
            bVar.e(1000);
            Float valueOf = Float.valueOf(1.0f);
            bVar.a(valueOf, 0);
            bVar.a(valueOf, 499);
            Float valueOf2 = Float.valueOf(0.0f);
            bVar.a(valueOf2, 500);
            bVar.a(valueOf2, 999);
        }
    }

    public static final androidx.compose.ui.e b(androidx.compose.ui.e eVar, t0 t0Var, b2.j0 j0Var, b2.x xVar, a1.e1 e1Var, boolean z10) {
        qc.q.i(eVar, "<this>");
        qc.q.i(t0Var, "state");
        qc.q.i(j0Var, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        qc.q.i(xVar, "offsetMapping");
        qc.q.i(e1Var, "cursorBrush");
        if (z10) {
            return androidx.compose.ui.c.b(eVar, null, new a(e1Var, t0Var, j0Var, xVar), 1, null);
        }
        return eVar;
    }

    public static final float c() {
        return f8269b;
    }
}
