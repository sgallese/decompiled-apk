package f0;

import a1.q4;
import androidx.compose.ui.e;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import j0.i2;
import j0.l3;
import java.util.Map;
import kotlin.coroutines.Continuation;
import p1.g;
import v0.b;

/* compiled from: Drawer.kt */
/* loaded from: classes.dex */
public final class z {

    /* renamed from: a  reason: collision with root package name */
    private static final float f15332a;

    /* renamed from: b  reason: collision with root package name */
    private static final float f15333b;

    /* renamed from: c  reason: collision with root package name */
    private static final float f15334c = j2.h.j(400);

    /* renamed from: d  reason: collision with root package name */
    private static final s.h1<Float> f15335d = new s.h1<>(UserVerificationMethods.USER_VERIFY_HANDPRINT, 0, null, 6, null);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Drawer.kt */
    /* loaded from: classes.dex */
    public static final class a extends qc.r implements pc.q<w.f, j0.l, Integer, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ a0 f15336f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ boolean f15337m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ int f15338p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ long f15339q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ q4 f15340r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ long f15341s;

        /* renamed from: t  reason: collision with root package name */
        final /* synthetic */ long f15342t;

        /* renamed from: u  reason: collision with root package name */
        final /* synthetic */ float f15343u;

        /* renamed from: v  reason: collision with root package name */
        final /* synthetic */ pc.p<j0.l, Integer, dc.w> f15344v;

        /* renamed from: w  reason: collision with root package name */
        final /* synthetic */ ad.k0 f15345w;

        /* renamed from: x  reason: collision with root package name */
        final /* synthetic */ pc.q<w.j, j0.l, Integer, dc.w> f15346x;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Drawer.kt */
        /* renamed from: f0.z$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0367a extends qc.r implements pc.a<dc.w> {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ a0 f15347f;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ j2.e f15348m;

            /* renamed from: p  reason: collision with root package name */
            final /* synthetic */ float f15349p;

            /* renamed from: q  reason: collision with root package name */
            final /* synthetic */ float f15350q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0367a(a0 a0Var, j2.e eVar, float f10, float f11) {
                super(0);
                this.f15347f = a0Var;
                this.f15348m = eVar;
                this.f15349p = f10;
                this.f15350q = f11;
            }

            @Override // pc.a
            public /* bridge */ /* synthetic */ dc.w invoke() {
                invoke2();
                return dc.w.f13270a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                Map k10;
                this.f15347f.h(this.f15348m);
                k10 = ec.n0.k(dc.r.a(b0.Closed, Float.valueOf(this.f15349p)), dc.r.a(b0.Open, Float.valueOf(this.f15350q)));
                f0.e.O(this.f15347f.c(), k10, null, 2, null);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Drawer.kt */
        /* loaded from: classes.dex */
        public static final class b extends qc.r implements pc.a<dc.w> {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ boolean f15351f;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ a0 f15352m;

            /* renamed from: p  reason: collision with root package name */
            final /* synthetic */ ad.k0 f15353p;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: Drawer.kt */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.DrawerKt$ModalDrawer$1$2$2$1", f = "Drawer.kt", l = {559}, m = "invokeSuspend")
            /* renamed from: f0.z$a$b$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0368a extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super dc.w>, Object> {

                /* renamed from: f  reason: collision with root package name */
                int f15354f;

                /* renamed from: m  reason: collision with root package name */
                final /* synthetic */ a0 f15355m;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0368a(a0 a0Var, Continuation<? super C0368a> continuation) {
                    super(2, continuation);
                    this.f15355m = a0Var;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
                    return new C0368a(this.f15355m, continuation);
                }

                @Override // pc.p
                public final Object invoke(ad.k0 k0Var, Continuation<? super dc.w> continuation) {
                    return ((C0368a) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object d10;
                    d10 = ic.d.d();
                    int i10 = this.f15354f;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            dc.n.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        dc.n.b(obj);
                        a0 a0Var = this.f15355m;
                        this.f15354f = 1;
                        if (a0Var.b(this) == d10) {
                            return d10;
                        }
                    }
                    return dc.w.f13270a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(boolean z10, a0 a0Var, ad.k0 k0Var) {
                super(0);
                this.f15351f = z10;
                this.f15352m = a0Var;
                this.f15353p = k0Var;
            }

            @Override // pc.a
            public /* bridge */ /* synthetic */ dc.w invoke() {
                invoke2();
                return dc.w.f13270a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                if (this.f15351f && this.f15352m.c().u().invoke(b0.Closed).booleanValue()) {
                    ad.i.d(this.f15353p, null, null, new C0368a(this.f15352m, null), 3, null);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Drawer.kt */
        /* loaded from: classes.dex */
        public static final class c extends qc.r implements pc.a<Float> {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ float f15356f;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ float f15357m;

            /* renamed from: p  reason: collision with root package name */
            final /* synthetic */ a0 f15358p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(float f10, float f11, a0 a0Var) {
                super(0);
                this.f15356f = f10;
                this.f15357m = f11;
                this.f15358p = a0Var;
            }

            @Override // pc.a
            /* renamed from: a  reason: merged with bridge method [inline-methods] */
            public final Float invoke() {
                return Float.valueOf(z.i(this.f15356f, this.f15357m, this.f15358p.g()));
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Drawer.kt */
        /* loaded from: classes.dex */
        public static final class d extends qc.r implements pc.l<j2.e, j2.l> {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ a0 f15359f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(a0 a0Var) {
                super(1);
                this.f15359f = a0Var;
            }

            public final long a(j2.e eVar) {
                int d10;
                qc.q.i(eVar, "$this$offset");
                d10 = sc.c.d(this.f15359f.g());
                return j2.m.a(d10, 0);
            }

            @Override // pc.l
            public /* bridge */ /* synthetic */ j2.l invoke(j2.e eVar) {
                return j2.l.b(a(eVar));
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Drawer.kt */
        /* loaded from: classes.dex */
        public static final class e extends qc.r implements pc.l<t1.x, dc.w> {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ String f15360f;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ a0 f15361m;

            /* renamed from: p  reason: collision with root package name */
            final /* synthetic */ ad.k0 f15362p;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: Drawer.kt */
            /* renamed from: f0.z$a$e$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0369a extends qc.r implements pc.a<Boolean> {

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ a0 f15363f;

                /* renamed from: m  reason: collision with root package name */
                final /* synthetic */ ad.k0 f15364m;

                /* JADX INFO: Access modifiers changed from: package-private */
                /* compiled from: Drawer.kt */
                @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.DrawerKt$ModalDrawer$1$2$6$1$1", f = "Drawer.kt", l = {594}, m = "invokeSuspend")
                /* renamed from: f0.z$a$e$a$a  reason: collision with other inner class name */
                /* loaded from: classes.dex */
                public static final class C0370a extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super dc.w>, Object> {

                    /* renamed from: f  reason: collision with root package name */
                    int f15365f;

                    /* renamed from: m  reason: collision with root package name */
                    final /* synthetic */ a0 f15366m;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0370a(a0 a0Var, Continuation<? super C0370a> continuation) {
                        super(2, continuation);
                        this.f15366m = a0Var;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
                        return new C0370a(this.f15366m, continuation);
                    }

                    @Override // pc.p
                    public final Object invoke(ad.k0 k0Var, Continuation<? super dc.w> continuation) {
                        return ((C0370a) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        Object d10;
                        d10 = ic.d.d();
                        int i10 = this.f15365f;
                        if (i10 != 0) {
                            if (i10 == 1) {
                                dc.n.b(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            dc.n.b(obj);
                            a0 a0Var = this.f15366m;
                            this.f15365f = 1;
                            if (a0Var.b(this) == d10) {
                                return d10;
                            }
                        }
                        return dc.w.f13270a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0369a(a0 a0Var, ad.k0 k0Var) {
                    super(0);
                    this.f15363f = a0Var;
                    this.f15364m = k0Var;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // pc.a
                public final Boolean invoke() {
                    if (this.f15363f.c().u().invoke(b0.Closed).booleanValue()) {
                        ad.i.d(this.f15364m, null, null, new C0370a(this.f15363f, null), 3, null);
                    }
                    return Boolean.TRUE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            e(String str, a0 a0Var, ad.k0 k0Var) {
                super(1);
                this.f15360f = str;
                this.f15361m = a0Var;
                this.f15362p = k0Var;
            }

            public final void a(t1.x xVar) {
                qc.q.i(xVar, "$this$semantics");
                t1.v.P(xVar, this.f15360f);
                if (this.f15361m.e()) {
                    t1.v.i(xVar, null, new C0369a(this.f15361m, this.f15362p), 1, null);
                }
            }

            @Override // pc.l
            public /* bridge */ /* synthetic */ dc.w invoke(t1.x xVar) {
                a(xVar);
                return dc.w.f13270a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Drawer.kt */
        /* loaded from: classes.dex */
        public static final class f extends qc.r implements pc.p<j0.l, Integer, dc.w> {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ pc.q<w.j, j0.l, Integer, dc.w> f15367f;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ int f15368m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            f(pc.q<? super w.j, ? super j0.l, ? super Integer, dc.w> qVar, int i10) {
                super(2);
                this.f15367f = qVar;
                this.f15368m = i10;
            }

            @Override // pc.p
            public /* bridge */ /* synthetic */ dc.w invoke(j0.l lVar, Integer num) {
                invoke(lVar, num.intValue());
                return dc.w.f13270a;
            }

            public final void invoke(j0.l lVar, int i10) {
                if ((i10 & 11) == 2 && lVar.t()) {
                    lVar.z();
                    return;
                }
                if (j0.n.K()) {
                    j0.n.V(-1941234439, i10, -1, "androidx.compose.material.ModalDrawer.<anonymous>.<anonymous>.<anonymous> (Drawer.kt:602)");
                }
                androidx.compose.ui.e f10 = androidx.compose.foundation.layout.m.f(androidx.compose.ui.e.f2335a, 0.0f, 1, null);
                pc.q<w.j, j0.l, Integer, dc.w> qVar = this.f15367f;
                int i11 = ((this.f15368m << 9) & 7168) | 6;
                lVar.e(-483455358);
                int i12 = i11 >> 3;
                n1.i0 a10 = w.h.a(w.a.f25135a.f(), v0.b.f24258a.j(), lVar, (i12 & 112) | (i12 & 14));
                lVar.e(-1323940314);
                int a11 = j0.j.a(lVar, 0);
                j0.v F = lVar.F();
                g.a aVar = p1.g.f20790l;
                pc.a<p1.g> a12 = aVar.a();
                pc.q<i2<p1.g>, j0.l, Integer, dc.w> a13 = n1.x.a(f10);
                int i13 = ((((i11 << 3) & 112) << 9) & 7168) | 6;
                if (!(lVar.u() instanceof j0.f)) {
                    j0.j.c();
                }
                lVar.s();
                if (lVar.n()) {
                    lVar.B(a12);
                } else {
                    lVar.H();
                }
                j0.l a14 = l3.a(lVar);
                l3.b(a14, a10, aVar.e());
                l3.b(a14, F, aVar.g());
                pc.p<p1.g, Integer, dc.w> b10 = aVar.b();
                if (a14.n() || !qc.q.d(a14.f(), Integer.valueOf(a11))) {
                    a14.J(Integer.valueOf(a11));
                    a14.I(Integer.valueOf(a11), b10);
                }
                a13.invoke(i2.a(i2.b(lVar)), lVar, Integer.valueOf((i13 >> 3) & 112));
                lVar.e(2058660585);
                qVar.invoke(w.k.f25176a, lVar, Integer.valueOf(((i11 >> 6) & 112) | 6));
                lVar.N();
                lVar.O();
                lVar.N();
                lVar.N();
                if (j0.n.K()) {
                    j0.n.U();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(a0 a0Var, boolean z10, int i10, long j10, q4 q4Var, long j11, long j12, float f10, pc.p<? super j0.l, ? super Integer, dc.w> pVar, ad.k0 k0Var, pc.q<? super w.j, ? super j0.l, ? super Integer, dc.w> qVar) {
            super(3);
            this.f15336f = a0Var;
            this.f15337m = z10;
            this.f15338p = i10;
            this.f15339q = j10;
            this.f15340r = q4Var;
            this.f15341s = j11;
            this.f15342t = j12;
            this.f15343u = f10;
            this.f15344v = pVar;
            this.f15345w = k0Var;
            this.f15346x = qVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r34v0, types: [j0.l, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r6v22 */
        public final void a(w.f fVar, j0.l lVar, int i10) {
            qc.q.i(fVar, "$this$BoxWithConstraints");
            if ((((i10 & 14) == 0 ? (lVar.Q(fVar) ? 4 : 2) | i10 : i10) & 91) == 18 && lVar.t()) {
                lVar.z();
                return;
            }
            if (j0.n.K()) {
                j0.n.V(816674999, i10, -1, "androidx.compose.material.ModalDrawer.<anonymous> (Drawer.kt:522)");
            }
            long c10 = fVar.c();
            if (j2.b.j(c10)) {
                float f10 = -j2.b.n(c10);
                j2.e eVar = (j2.e) lVar.C(androidx.compose.ui.platform.z0.e());
                Object[] objArr = {this.f15336f, eVar, Float.valueOf(f10), Float.valueOf(0.0f)};
                a0 a0Var = this.f15336f;
                lVar.e(-568225417);
                boolean z10 = false;
                for (int i11 = 0; i11 < 4; i11++) {
                    z10 |= lVar.Q(objArr[i11]);
                }
                Object f11 = lVar.f();
                if (z10 || f11 == j0.l.f18688a.a()) {
                    f11 = new C0367a(a0Var, eVar, f10, 0.0f);
                    lVar.J(f11);
                }
                lVar.N();
                j0.h0.f((pc.a) f11, lVar, 0);
                boolean z11 = lVar.C(androidx.compose.ui.platform.z0.j()) == j2.r.Rtl;
                e.a aVar = androidx.compose.ui.e.f2335a;
                androidx.compose.ui.e e10 = f0.d.e(aVar, this.f15336f.c(), u.o.Horizontal, this.f15337m, z11, null, 16, null);
                a0 a0Var2 = this.f15336f;
                int i12 = this.f15338p;
                long j10 = this.f15339q;
                q4 q4Var = this.f15340r;
                long j11 = this.f15341s;
                long j12 = this.f15342t;
                float f12 = this.f15343u;
                pc.p<j0.l, Integer, dc.w> pVar = this.f15344v;
                boolean z12 = this.f15337m;
                ad.k0 k0Var = this.f15345w;
                pc.q<w.j, j0.l, Integer, dc.w> qVar = this.f15346x;
                lVar.e(733328855);
                b.a aVar2 = v0.b.f24258a;
                n1.i0 h10 = androidx.compose.foundation.layout.d.h(aVar2.n(), false, lVar, 0);
                lVar.e(-1323940314);
                int a10 = j0.j.a(lVar, 0);
                j0.v F = lVar.F();
                g.a aVar3 = p1.g.f20790l;
                pc.a<p1.g> a11 = aVar3.a();
                pc.q<i2<p1.g>, j0.l, Integer, dc.w> a12 = n1.x.a(e10);
                if (!(lVar.u() instanceof j0.f)) {
                    j0.j.c();
                }
                lVar.s();
                if (lVar.n()) {
                    lVar.B(a11);
                } else {
                    lVar.H();
                }
                j0.l a13 = l3.a(lVar);
                l3.b(a13, h10, aVar3.e());
                l3.b(a13, F, aVar3.g());
                pc.p<p1.g, Integer, dc.w> b10 = aVar3.b();
                if (a13.n() || !qc.q.d(a13.f(), Integer.valueOf(a10))) {
                    a13.J(Integer.valueOf(a10));
                    a13.I(Integer.valueOf(a10), b10);
                }
                a12.invoke(i2.a(i2.b(lVar)), lVar, 0);
                lVar.e(2058660585);
                androidx.compose.foundation.layout.e eVar2 = androidx.compose.foundation.layout.e.f2083a;
                lVar.e(733328855);
                n1.i0 h11 = androidx.compose.foundation.layout.d.h(aVar2.n(), false, lVar, 0);
                lVar.e(-1323940314);
                int a14 = j0.j.a(lVar, 0);
                j0.v F2 = lVar.F();
                pc.a<p1.g> a15 = aVar3.a();
                pc.q<i2<p1.g>, j0.l, Integer, dc.w> a16 = n1.x.a(aVar);
                if (!(lVar.u() instanceof j0.f)) {
                    j0.j.c();
                }
                lVar.s();
                if (lVar.n()) {
                    lVar.B(a15);
                } else {
                    lVar.H();
                }
                j0.l a17 = l3.a(lVar);
                l3.b(a17, h11, aVar3.e());
                l3.b(a17, F2, aVar3.g());
                pc.p<p1.g, Integer, dc.w> b11 = aVar3.b();
                if (a17.n() || !qc.q.d(a17.f(), Integer.valueOf(a14))) {
                    a17.J(Integer.valueOf(a14));
                    a17.I(Integer.valueOf(a14), b11);
                }
                a16.invoke(i2.a(i2.b(lVar)), lVar, 0);
                lVar.e(2058660585);
                pVar.invoke(lVar, Integer.valueOf((i12 >> 27) & 14));
                lVar.N();
                lVar.O();
                lVar.N();
                lVar.N();
                boolean e11 = a0Var2.e();
                b bVar = new b(z12, a0Var2, k0Var);
                Float valueOf = Float.valueOf(f10);
                Float valueOf2 = Float.valueOf(0.0f);
                lVar.e(1618982084);
                boolean Q = lVar.Q(valueOf) | lVar.Q(valueOf2) | lVar.Q(a0Var2);
                Object f13 = lVar.f();
                if (Q || f13 == j0.l.f18688a.a()) {
                    f13 = new c(f10, 0.0f, a0Var2);
                    lVar.J(f13);
                }
                lVar.N();
                z.b(e11, bVar, f13, j10, lVar, (i12 >> 15) & 7168);
                String a18 = q1.a(p1.f14995a.e(), lVar, 6);
                j2.e eVar3 = (j2.e) lVar.C(androidx.compose.ui.platform.z0.e());
                androidx.compose.ui.e q10 = androidx.compose.foundation.layout.m.q(aVar, eVar3.h0(j2.b.p(c10)), eVar3.h0(j2.b.o(c10)), eVar3.h0(j2.b.n(c10)), eVar3.h0(j2.b.m(c10)));
                lVar.e(1157296644);
                boolean Q2 = lVar.Q(a0Var2);
                Object f14 = lVar.f();
                if (Q2 || f14 == j0.l.f18688a.a()) {
                    f14 = new d(a0Var2);
                    lVar.J(f14);
                }
                lVar.N();
                int i13 = i12 >> 12;
                r1.a(t1.o.c(androidx.compose.foundation.layout.j.m(androidx.compose.foundation.layout.g.a(q10, (pc.l) f14), 0.0f, 0.0f, z.f15332a, 0.0f, 11, null), false, new e(a18, a0Var2, k0Var), 1, null), q4Var, j11, j12, null, f12, q0.c.b(lVar, -1941234439, true, new f(qVar, i12)), lVar, ((i12 >> 9) & 112) | 1572864 | (i13 & 896) | (i13 & 7168) | (458752 & i12), 16);
                lVar.N();
                lVar.O();
                lVar.N();
                lVar.N();
                if (j0.n.K()) {
                    j0.n.U();
                    return;
                }
                return;
            }
            throw new IllegalStateException("Drawer shouldn't have infinite width");
        }

        @Override // pc.q
        public /* bridge */ /* synthetic */ dc.w invoke(w.f fVar, j0.l lVar, Integer num) {
            a(fVar, lVar, num.intValue());
            return dc.w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Drawer.kt */
    /* loaded from: classes.dex */
    public static final class b extends qc.r implements pc.p<j0.l, Integer, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ pc.q<w.j, j0.l, Integer, dc.w> f15369f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f15370m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ a0 f15371p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ boolean f15372q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ q4 f15373r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ float f15374s;

        /* renamed from: t  reason: collision with root package name */
        final /* synthetic */ long f15375t;

        /* renamed from: u  reason: collision with root package name */
        final /* synthetic */ long f15376u;

        /* renamed from: v  reason: collision with root package name */
        final /* synthetic */ long f15377v;

        /* renamed from: w  reason: collision with root package name */
        final /* synthetic */ pc.p<j0.l, Integer, dc.w> f15378w;

        /* renamed from: x  reason: collision with root package name */
        final /* synthetic */ int f15379x;

        /* renamed from: y  reason: collision with root package name */
        final /* synthetic */ int f15380y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(pc.q<? super w.j, ? super j0.l, ? super Integer, dc.w> qVar, androidx.compose.ui.e eVar, a0 a0Var, boolean z10, q4 q4Var, float f10, long j10, long j11, long j12, pc.p<? super j0.l, ? super Integer, dc.w> pVar, int i10, int i11) {
            super(2);
            this.f15369f = qVar;
            this.f15370m = eVar;
            this.f15371p = a0Var;
            this.f15372q = z10;
            this.f15373r = q4Var;
            this.f15374s = f10;
            this.f15375t = j10;
            this.f15376u = j11;
            this.f15377v = j12;
            this.f15378w = pVar;
            this.f15379x = i10;
            this.f15380y = i11;
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ dc.w invoke(j0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return dc.w.f13270a;
        }

        public final void invoke(j0.l lVar, int i10) {
            z.a(this.f15369f, this.f15370m, this.f15371p, this.f15372q, this.f15373r, this.f15374s, this.f15375t, this.f15376u, this.f15377v, this.f15378w, lVar, j0.z1.a(this.f15379x | 1), this.f15380y);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Drawer.kt */
    /* loaded from: classes.dex */
    public static final class c extends qc.r implements pc.l<c1.f, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ long f15381f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ pc.a<Float> f15382m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(long j10, pc.a<Float> aVar) {
            super(1);
            this.f15381f = j10;
            this.f15382m = aVar;
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ dc.w invoke(c1.f fVar) {
            invoke2(fVar);
            return dc.w.f13270a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(c1.f fVar) {
            qc.q.i(fVar, "$this$Canvas");
            c1.e.m(fVar, this.f15381f, 0L, 0L, this.f15382m.invoke().floatValue(), null, null, 0, 118, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Drawer.kt */
    /* loaded from: classes.dex */
    public static final class d extends qc.r implements pc.p<j0.l, Integer, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ boolean f15383f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ pc.a<dc.w> f15384m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ pc.a<Float> f15385p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ long f15386q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ int f15387r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(boolean z10, pc.a<dc.w> aVar, pc.a<Float> aVar2, long j10, int i10) {
            super(2);
            this.f15383f = z10;
            this.f15384m = aVar;
            this.f15385p = aVar2;
            this.f15386q = j10;
            this.f15387r = i10;
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ dc.w invoke(j0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return dc.w.f13270a;
        }

        public final void invoke(j0.l lVar, int i10) {
            z.b(this.f15383f, this.f15384m, this.f15385p, this.f15386q, lVar, j0.z1.a(this.f15387r | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Drawer.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.DrawerKt$Scrim$dismissDrawer$1$1", f = "Drawer.kt", l = {844}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class e extends kotlin.coroutines.jvm.internal.l implements pc.p<k1.l0, Continuation<? super dc.w>, Object> {

        /* renamed from: f  reason: collision with root package name */
        int f15388f;

        /* renamed from: m  reason: collision with root package name */
        private /* synthetic */ Object f15389m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ pc.a<dc.w> f15390p;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Drawer.kt */
        /* loaded from: classes.dex */
        public static final class a extends qc.r implements pc.l<z0.f, dc.w> {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ pc.a<dc.w> f15391f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(pc.a<dc.w> aVar) {
                super(1);
                this.f15391f = aVar;
            }

            public final void a(long j10) {
                this.f15391f.invoke();
            }

            @Override // pc.l
            public /* bridge */ /* synthetic */ dc.w invoke(z0.f fVar) {
                a(fVar.x());
                return dc.w.f13270a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(pc.a<dc.w> aVar, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f15390p = aVar;
        }

        @Override // pc.p
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final Object invoke(k1.l0 l0Var, Continuation<? super dc.w> continuation) {
            return ((e) create(l0Var, continuation)).invokeSuspend(dc.w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
            e eVar = new e(this.f15390p, continuation);
            eVar.f15389m = obj;
            return eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d10;
            d10 = ic.d.d();
            int i10 = this.f15388f;
            if (i10 != 0) {
                if (i10 == 1) {
                    dc.n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                dc.n.b(obj);
                k1.l0 l0Var = (k1.l0) this.f15389m;
                a aVar = new a(this.f15390p);
                this.f15388f = 1;
                if (u.z.j(l0Var, null, null, null, aVar, this, 7, null) == d10) {
                    return d10;
                }
            }
            return dc.w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Drawer.kt */
    /* loaded from: classes.dex */
    public static final class f extends qc.r implements pc.l<t1.x, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f15392f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ pc.a<dc.w> f15393m;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Drawer.kt */
        /* loaded from: classes.dex */
        public static final class a extends qc.r implements pc.a<Boolean> {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ pc.a<dc.w> f15394f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(pc.a<dc.w> aVar) {
                super(0);
                this.f15394f = aVar;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // pc.a
            public final Boolean invoke() {
                this.f15394f.invoke();
                return Boolean.TRUE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, pc.a<dc.w> aVar) {
            super(1);
            this.f15392f = str;
            this.f15393m = aVar;
        }

        public final void a(t1.x xVar) {
            qc.q.i(xVar, "$this$semantics");
            t1.v.J(xVar, this.f15392f);
            t1.v.s(xVar, null, new a(this.f15393m), 1, null);
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ dc.w invoke(t1.x xVar) {
            a(xVar);
            return dc.w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Drawer.kt */
    /* loaded from: classes.dex */
    public static final class g extends qc.r implements pc.l<b0, Boolean> {

        /* renamed from: f  reason: collision with root package name */
        public static final g f15395f = new g();

        g() {
            super(1);
        }

        @Override // pc.l
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(b0 b0Var) {
            qc.q.i(b0Var, "it");
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Drawer.kt */
    /* loaded from: classes.dex */
    public static final class h extends qc.r implements pc.a<a0> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ b0 f15396f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ pc.l<b0, Boolean> f15397m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        h(b0 b0Var, pc.l<? super b0, Boolean> lVar) {
            super(0);
            this.f15396f = b0Var;
            this.f15397m = lVar;
        }

        @Override // pc.a
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final a0 invoke() {
            return new a0(this.f15396f, this.f15397m);
        }
    }

    static {
        float f10 = 56;
        f15332a = j2.h.j(f10);
        f15333b = j2.h.j(f10);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:181:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(pc.q<? super w.j, ? super j0.l, ? super java.lang.Integer, dc.w> r35, androidx.compose.ui.e r36, f0.a0 r37, boolean r38, a1.q4 r39, float r40, long r41, long r43, long r45, pc.p<? super j0.l, ? super java.lang.Integer, dc.w> r47, j0.l r48, int r49, int r50) {
        /*
            Method dump skipped, instructions count: 764
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.z.a(pc.q, androidx.compose.ui.e, f0.a0, boolean, a1.q4, float, long, long, long, pc.p, j0.l, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(boolean z10, pc.a<dc.w> aVar, pc.a<Float> aVar2, long j10, j0.l lVar, int i10) {
        int i11;
        androidx.compose.ui.e eVar;
        int i12;
        int i13;
        int i14;
        int i15;
        j0.l q10 = lVar.q(1983403750);
        if ((i10 & 14) == 0) {
            if (q10.c(z10)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i11 = i15 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            if (q10.l(aVar)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i11 |= i14;
        }
        if ((i10 & 896) == 0) {
            if (q10.l(aVar2)) {
                i13 = UserVerificationMethods.USER_VERIFY_HANDPRINT;
            } else {
                i13 = 128;
            }
            i11 |= i13;
        }
        if ((i10 & 7168) == 0) {
            if (q10.j(j10)) {
                i12 = RecyclerView.m.FLAG_MOVED;
            } else {
                i12 = UserVerificationMethods.USER_VERIFY_ALL;
            }
            i11 |= i12;
        }
        if ((i11 & 5851) == 1170 && q10.t()) {
            q10.z();
        } else {
            if (j0.n.K()) {
                j0.n.V(1983403750, i11, -1, "androidx.compose.material.Scrim (Drawer.kt:834)");
            }
            String a10 = q1.a(p1.f14995a.a(), q10, 6);
            q10.e(1010561092);
            if (z10) {
                e.a aVar3 = androidx.compose.ui.e.f2335a;
                q10.e(1157296644);
                boolean Q = q10.Q(aVar);
                Object f10 = q10.f();
                if (Q || f10 == j0.l.f18688a.a()) {
                    f10 = new e(aVar, null);
                    q10.J(f10);
                }
                q10.N();
                androidx.compose.ui.e c10 = k1.u0.c(aVar3, aVar, (pc.p) f10);
                q10.e(511388516);
                boolean Q2 = q10.Q(a10) | q10.Q(aVar);
                Object f11 = q10.f();
                if (Q2 || f11 == j0.l.f18688a.a()) {
                    f11 = new f(a10, aVar);
                    q10.J(f11);
                }
                q10.N();
                eVar = t1.o.b(c10, true, (pc.l) f11);
            } else {
                eVar = androidx.compose.ui.e.f2335a;
            }
            q10.N();
            androidx.compose.ui.e a11 = androidx.compose.foundation.layout.m.f(androidx.compose.ui.e.f2335a, 0.0f, 1, null).a(eVar);
            a1.p1 g10 = a1.p1.g(j10);
            q10.e(511388516);
            boolean Q3 = q10.Q(g10) | q10.Q(aVar2);
            Object f12 = q10.f();
            if (Q3 || f12 == j0.l.f18688a.a()) {
                f12 = new c(j10, aVar2);
                q10.J(f12);
            }
            q10.N();
            t.i.a(a11, (pc.l) f12, q10, 0);
            if (j0.n.K()) {
                j0.n.U();
            }
        }
        j0.g2 w10 = q10.w();
        if (w10 != null) {
            w10.a(new d(z10, aVar, aVar2, j10, i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float i(float f10, float f11, float f12) {
        float k10;
        k10 = vc.l.k((f12 - f10) / (f11 - f10), 0.0f, 1.0f);
        return k10;
    }

    public static final a0 j(b0 b0Var, pc.l<? super b0, Boolean> lVar, j0.l lVar2, int i10, int i11) {
        qc.q.i(b0Var, "initialValue");
        lVar2.e(-1435874229);
        if ((i11 & 2) != 0) {
            lVar = g.f15395f;
        }
        if (j0.n.K()) {
            j0.n.V(-1435874229, i10, -1, "androidx.compose.material.rememberDrawerState (Drawer.kt:451)");
        }
        Object[] objArr = new Object[0];
        s0.i<a0, b0> a10 = a0.f14304c.a(lVar);
        lVar2.e(511388516);
        boolean Q = lVar2.Q(b0Var) | lVar2.Q(lVar);
        Object f10 = lVar2.f();
        if (Q || f10 == j0.l.f18688a.a()) {
            f10 = new h(b0Var, lVar);
            lVar2.J(f10);
        }
        lVar2.N();
        a0 a0Var = (a0) s0.b.b(objArr, a10, null, (pc.a) f10, lVar2, 72, 4);
        if (j0.n.K()) {
            j0.n.U();
        }
        lVar2.N();
        return a0Var;
    }
}
