package c0;

import android.view.KeyEvent;
import androidx.compose.ui.e;
import c0.h0;
import j0.g2;
import j0.g3;
import j0.i2;
import j0.l3;
import j0.y2;
import j0.z1;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;
import n1.y0;
import p1.g;
import t0.g;

/* compiled from: CoreTextField.kt */
/* loaded from: classes.dex */
public final class h {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CoreTextField.kt */
    /* loaded from: classes.dex */
    public static final class a extends qc.r implements pc.l<v1.g0, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        public static final a f8284f = new a();

        a() {
            super(1);
        }

        public final void a(v1.g0 g0Var) {
            qc.q.i(g0Var, "it");
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ dc.w invoke(v1.g0 g0Var) {
            a(g0Var);
            return dc.w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CoreTextField.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$2", f = "CoreTextField.kt", l = {336}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super dc.w>, Object> {

        /* renamed from: f  reason: collision with root package name */
        int f8285f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ t0 f8286m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ g3<Boolean> f8287p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ b2.l0 f8288q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ b2.j0 f8289r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ b2.p f8290s;

        /* renamed from: t  reason: collision with root package name */
        final /* synthetic */ b2.x f8291t;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: CoreTextField.kt */
        /* loaded from: classes.dex */
        public static final class a extends qc.r implements pc.a<Boolean> {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ g3<Boolean> f8292f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(g3<Boolean> g3Var) {
                super(0);
                this.f8292f = g3Var;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // pc.a
            public final Boolean invoke() {
                return Boolean.valueOf(h.b(this.f8292f));
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: CoreTextField.kt */
        /* renamed from: c0.h$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0201b implements dd.h<Boolean> {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ t0 f8293f;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ b2.l0 f8294m;

            /* renamed from: p  reason: collision with root package name */
            final /* synthetic */ b2.j0 f8295p;

            /* renamed from: q  reason: collision with root package name */
            final /* synthetic */ b2.p f8296q;

            /* renamed from: r  reason: collision with root package name */
            final /* synthetic */ b2.x f8297r;

            C0201b(t0 t0Var, b2.l0 l0Var, b2.j0 j0Var, b2.p pVar, b2.x xVar) {
                this.f8293f = t0Var;
                this.f8294m = l0Var;
                this.f8295p = j0Var;
                this.f8296q = pVar;
                this.f8297r = xVar;
            }

            public final Object a(boolean z10, Continuation<? super dc.w> continuation) {
                if (!z10 || !this.f8293f.d()) {
                    h.n(this.f8293f);
                } else {
                    h.q(this.f8294m, this.f8293f, this.f8295p, this.f8296q, this.f8297r);
                }
                return dc.w.f13270a;
            }

            @Override // dd.h
            public /* bridge */ /* synthetic */ Object emit(Boolean bool, Continuation continuation) {
                return a(bool.booleanValue(), continuation);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(t0 t0Var, g3<Boolean> g3Var, b2.l0 l0Var, b2.j0 j0Var, b2.p pVar, b2.x xVar, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f8286m = t0Var;
            this.f8287p = g3Var;
            this.f8288q = l0Var;
            this.f8289r = j0Var;
            this.f8290s = pVar;
            this.f8291t = xVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
            return new b(this.f8286m, this.f8287p, this.f8288q, this.f8289r, this.f8290s, this.f8291t, continuation);
        }

        @Override // pc.p
        public final Object invoke(ad.k0 k0Var, Continuation<? super dc.w> continuation) {
            return ((b) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d10;
            d10 = ic.d.d();
            int i10 = this.f8285f;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        dc.n.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    dc.n.b(obj);
                    dd.g n10 = y2.n(new a(this.f8287p));
                    C0201b c0201b = new C0201b(this.f8286m, this.f8288q, this.f8289r, this.f8290s, this.f8291t);
                    this.f8285f = 1;
                    if (n10.collect(c0201b, this) == d10) {
                        return d10;
                    }
                }
                h.n(this.f8286m);
                return dc.w.f13270a;
            } catch (Throwable th) {
                h.n(this.f8286m);
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CoreTextField.kt */
    /* loaded from: classes.dex */
    public static final class c extends qc.r implements pc.l<j0.f0, j0.e0> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ e0.v f8298f;

        /* compiled from: Effects.kt */
        /* loaded from: classes.dex */
        public static final class a implements j0.e0 {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ e0.v f8299a;

            public a(e0.v vVar) {
                this.f8299a = vVar;
            }

            @Override // j0.e0
            public void dispose() {
                this.f8299a.J();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(e0.v vVar) {
            super(1);
            this.f8298f = vVar;
        }

        @Override // pc.l
        public final j0.e0 invoke(j0.f0 f0Var) {
            qc.q.i(f0Var, "$this$DisposableEffect");
            return new a(this.f8298f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CoreTextField.kt */
    /* loaded from: classes.dex */
    public static final class d extends qc.r implements pc.l<j0.f0, j0.e0> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ b2.l0 f8300f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ t0 f8301m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ b2.j0 f8302p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ b2.p f8303q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(b2.l0 l0Var, t0 t0Var, b2.j0 j0Var, b2.p pVar) {
            super(1);
            this.f8300f = l0Var;
            this.f8301m = t0Var;
            this.f8302p = j0Var;
            this.f8303q = pVar;
        }

        @Override // pc.l
        public final j0.e0 invoke(j0.f0 f0Var) {
            qc.q.i(f0Var, "$this$DisposableEffect");
            if (this.f8300f != null && this.f8301m.d()) {
                t0 t0Var = this.f8301m;
                t0Var.w(h0.f8440a.h(this.f8300f, this.f8302p, t0Var.k(), this.f8303q, this.f8301m.j(), this.f8301m.i()));
            }
            return new a();
        }

        /* compiled from: Effects.kt */
        /* loaded from: classes.dex */
        public static final class a implements j0.e0 {
            @Override // j0.e0
            public void dispose() {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CoreTextField.kt */
    /* loaded from: classes.dex */
    public static final class e extends qc.r implements pc.p<j0.l, Integer, dc.w> {
        final /* synthetic */ z.d A;
        final /* synthetic */ e0.v B;
        final /* synthetic */ boolean C;
        final /* synthetic */ boolean D;
        final /* synthetic */ pc.l<v1.g0, dc.w> E;
        final /* synthetic */ b2.x F;
        final /* synthetic */ j2.e G;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ pc.q<pc.p<? super j0.l, ? super Integer, dc.w>, j0.l, Integer, dc.w> f8304f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ int f8305m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ t0 f8306p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ v1.k0 f8307q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ int f8308r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ int f8309s;

        /* renamed from: t  reason: collision with root package name */
        final /* synthetic */ q0 f8310t;

        /* renamed from: u  reason: collision with root package name */
        final /* synthetic */ b2.j0 f8311u;

        /* renamed from: v  reason: collision with root package name */
        final /* synthetic */ b2.t0 f8312v;

        /* renamed from: w  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f8313w;

        /* renamed from: x  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f8314x;

        /* renamed from: y  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f8315y;

        /* renamed from: z  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f8316z;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: CoreTextField.kt */
        /* loaded from: classes.dex */
        public static final class a extends qc.r implements pc.p<j0.l, Integer, dc.w> {
            final /* synthetic */ boolean A;
            final /* synthetic */ boolean B;
            final /* synthetic */ pc.l<v1.g0, dc.w> C;
            final /* synthetic */ b2.x D;
            final /* synthetic */ j2.e E;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ t0 f8317f;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ v1.k0 f8318m;

            /* renamed from: p  reason: collision with root package name */
            final /* synthetic */ int f8319p;

            /* renamed from: q  reason: collision with root package name */
            final /* synthetic */ int f8320q;

            /* renamed from: r  reason: collision with root package name */
            final /* synthetic */ q0 f8321r;

            /* renamed from: s  reason: collision with root package name */
            final /* synthetic */ b2.j0 f8322s;

            /* renamed from: t  reason: collision with root package name */
            final /* synthetic */ b2.t0 f8323t;

            /* renamed from: u  reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.e f8324u;

            /* renamed from: v  reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.e f8325v;

            /* renamed from: w  reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.e f8326w;

            /* renamed from: x  reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.e f8327x;

            /* renamed from: y  reason: collision with root package name */
            final /* synthetic */ z.d f8328y;

            /* renamed from: z  reason: collision with root package name */
            final /* synthetic */ e0.v f8329z;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: CoreTextField.kt */
            /* renamed from: c0.h$e$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0202a extends qc.r implements pc.p<j0.l, Integer, dc.w> {

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ e0.v f8330f;

                /* renamed from: m  reason: collision with root package name */
                final /* synthetic */ t0 f8331m;

                /* renamed from: p  reason: collision with root package name */
                final /* synthetic */ boolean f8332p;

                /* renamed from: q  reason: collision with root package name */
                final /* synthetic */ boolean f8333q;

                /* renamed from: r  reason: collision with root package name */
                final /* synthetic */ pc.l<v1.g0, dc.w> f8334r;

                /* renamed from: s  reason: collision with root package name */
                final /* synthetic */ b2.j0 f8335s;

                /* renamed from: t  reason: collision with root package name */
                final /* synthetic */ b2.x f8336t;

                /* renamed from: u  reason: collision with root package name */
                final /* synthetic */ j2.e f8337u;

                /* renamed from: v  reason: collision with root package name */
                final /* synthetic */ int f8338v;

                /* compiled from: CoreTextField.kt */
                /* renamed from: c0.h$e$a$a$a  reason: collision with other inner class name */
                /* loaded from: classes.dex */
                public static final class C0203a implements n1.i0 {

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ t0 f8339a;

                    /* renamed from: b  reason: collision with root package name */
                    final /* synthetic */ pc.l<v1.g0, dc.w> f8340b;

                    /* renamed from: c  reason: collision with root package name */
                    final /* synthetic */ b2.j0 f8341c;

                    /* renamed from: d  reason: collision with root package name */
                    final /* synthetic */ b2.x f8342d;

                    /* renamed from: e  reason: collision with root package name */
                    final /* synthetic */ j2.e f8343e;

                    /* renamed from: f  reason: collision with root package name */
                    final /* synthetic */ int f8344f;

                    /* compiled from: CoreTextField.kt */
                    /* renamed from: c0.h$e$a$a$a$a  reason: collision with other inner class name */
                    /* loaded from: classes.dex */
                    static final class C0204a extends qc.r implements pc.l<y0.a, dc.w> {

                        /* renamed from: f  reason: collision with root package name */
                        public static final C0204a f8345f = new C0204a();

                        C0204a() {
                            super(1);
                        }

                        /* renamed from: invoke  reason: avoid collision after fix types in other method */
                        public final void invoke2(y0.a aVar) {
                            qc.q.i(aVar, "$this$layout");
                        }

                        @Override // pc.l
                        public /* bridge */ /* synthetic */ dc.w invoke(y0.a aVar) {
                            invoke2(aVar);
                            return dc.w.f13270a;
                        }
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    C0203a(t0 t0Var, pc.l<? super v1.g0, dc.w> lVar, b2.j0 j0Var, b2.x xVar, j2.e eVar, int i10) {
                        this.f8339a = t0Var;
                        this.f8340b = lVar;
                        this.f8341c = j0Var;
                        this.f8342d = xVar;
                        this.f8343e = eVar;
                        this.f8344f = i10;
                    }

                    @Override // n1.i0
                    public /* synthetic */ int maxIntrinsicHeight(n1.n nVar, List list, int i10) {
                        return n1.h0.a(this, nVar, list, i10);
                    }

                    @Override // n1.i0
                    public int maxIntrinsicWidth(n1.n nVar, List<? extends n1.m> list, int i10) {
                        qc.q.i(nVar, "<this>");
                        qc.q.i(list, "measurables");
                        this.f8339a.r().m(nVar.getLayoutDirection());
                        return this.f8339a.r().c();
                    }

                    @Override // n1.i0
                    /* renamed from: measure-3p2s80s */
                    public n1.j0 mo0measure3p2s80s(n1.l0 l0Var, List<? extends n1.g0> list, long j10) {
                        v1.g0 g0Var;
                        int i10;
                        int d10;
                        int d11;
                        Map<n1.a, Integer> k10;
                        qc.q.i(l0Var, "$this$measure");
                        qc.q.i(list, "measurables");
                        g.a aVar = t0.g.f23297e;
                        t0 t0Var = this.f8339a;
                        t0.g a10 = aVar.a();
                        try {
                            t0.g l10 = a10.l();
                            try {
                                v0 g10 = t0Var.g();
                                if (g10 != null) {
                                    g0Var = g10.i();
                                } else {
                                    g0Var = null;
                                }
                                a10.d();
                                dc.q<Integer, Integer, v1.g0> c10 = h0.f8440a.c(this.f8339a.r(), j10, l0Var.getLayoutDirection(), g0Var);
                                int intValue = c10.a().intValue();
                                int intValue2 = c10.b().intValue();
                                v1.g0 c11 = c10.c();
                                if (!qc.q.d(g0Var, c11)) {
                                    this.f8339a.y(new v0(c11));
                                    this.f8340b.invoke(c11);
                                    h.o(this.f8339a, this.f8341c, this.f8342d);
                                }
                                t0 t0Var2 = this.f8339a;
                                j2.e eVar = this.f8343e;
                                if (this.f8344f == 1) {
                                    i10 = e0.a(c11.l(0));
                                } else {
                                    i10 = 0;
                                }
                                t0Var2.z(eVar.h0(i10));
                                n1.k a11 = n1.b.a();
                                d10 = sc.c.d(c11.g());
                                n1.k b10 = n1.b.b();
                                d11 = sc.c.d(c11.j());
                                k10 = ec.n0.k(dc.r.a(a11, Integer.valueOf(d10)), dc.r.a(b10, Integer.valueOf(d11)));
                                return l0Var.e0(intValue, intValue2, k10, C0204a.f8345f);
                            } finally {
                                a10.s(l10);
                            }
                        } catch (Throwable th) {
                            a10.d();
                            throw th;
                        }
                    }

                    @Override // n1.i0
                    public /* synthetic */ int minIntrinsicHeight(n1.n nVar, List list, int i10) {
                        return n1.h0.c(this, nVar, list, i10);
                    }

                    @Override // n1.i0
                    public /* synthetic */ int minIntrinsicWidth(n1.n nVar, List list, int i10) {
                        return n1.h0.d(this, nVar, list, i10);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C0202a(e0.v vVar, t0 t0Var, boolean z10, boolean z11, pc.l<? super v1.g0, dc.w> lVar, b2.j0 j0Var, b2.x xVar, j2.e eVar, int i10) {
                    super(2);
                    this.f8330f = vVar;
                    this.f8331m = t0Var;
                    this.f8332p = z10;
                    this.f8333q = z11;
                    this.f8334r = lVar;
                    this.f8335s = j0Var;
                    this.f8336t = xVar;
                    this.f8337u = eVar;
                    this.f8338v = i10;
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
                        j0.n.V(-363167407, i10, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous>.<anonymous>.<anonymous> (CoreTextField.kt:649)");
                    }
                    C0203a c0203a = new C0203a(this.f8331m, this.f8334r, this.f8335s, this.f8336t, this.f8337u, this.f8338v);
                    lVar.e(-1323940314);
                    e.a aVar = androidx.compose.ui.e.f2335a;
                    boolean z10 = false;
                    int a10 = j0.j.a(lVar, 0);
                    j0.v F = lVar.F();
                    g.a aVar2 = p1.g.f20790l;
                    pc.a<p1.g> a11 = aVar2.a();
                    pc.q<i2<p1.g>, j0.l, Integer, dc.w> a12 = n1.x.a(aVar);
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
                    l3.b(a13, c0203a, aVar2.e());
                    l3.b(a13, F, aVar2.g());
                    pc.p<p1.g, Integer, dc.w> b10 = aVar2.b();
                    if (a13.n() || !qc.q.d(a13.f(), Integer.valueOf(a10))) {
                        a13.J(Integer.valueOf(a10));
                        a13.I(Integer.valueOf(a10), b10);
                    }
                    a12.invoke(i2.a(i2.b(lVar)), lVar, 0);
                    lVar.e(2058660585);
                    lVar.N();
                    lVar.O();
                    lVar.N();
                    e0.v vVar = this.f8330f;
                    if (this.f8331m.c() == c0.m.Selection && this.f8331m.f() != null) {
                        n1.s f10 = this.f8331m.f();
                        qc.q.f(f10);
                        if (f10.r() && this.f8332p) {
                            z10 = true;
                        }
                    }
                    h.d(vVar, z10, lVar, 8);
                    if (this.f8331m.c() == c0.m.Cursor && !this.f8333q && this.f8332p) {
                        h.e(this.f8330f, lVar, 8);
                    }
                    if (j0.n.K()) {
                        j0.n.U();
                    }
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: CoreTextField.kt */
            /* loaded from: classes.dex */
            public static final class b extends qc.r implements pc.a<v0> {

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ t0 f8346f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(t0 t0Var) {
                    super(0);
                    this.f8346f = t0Var;
                }

                @Override // pc.a
                /* renamed from: a  reason: merged with bridge method [inline-methods] */
                public final v0 invoke() {
                    return this.f8346f.g();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(t0 t0Var, v1.k0 k0Var, int i10, int i11, q0 q0Var, b2.j0 j0Var, b2.t0 t0Var2, androidx.compose.ui.e eVar, androidx.compose.ui.e eVar2, androidx.compose.ui.e eVar3, androidx.compose.ui.e eVar4, z.d dVar, e0.v vVar, boolean z10, boolean z11, pc.l<? super v1.g0, dc.w> lVar, b2.x xVar, j2.e eVar5) {
                super(2);
                this.f8317f = t0Var;
                this.f8318m = k0Var;
                this.f8319p = i10;
                this.f8320q = i11;
                this.f8321r = q0Var;
                this.f8322s = j0Var;
                this.f8323t = t0Var2;
                this.f8324u = eVar;
                this.f8325v = eVar2;
                this.f8326w = eVar3;
                this.f8327x = eVar4;
                this.f8328y = dVar;
                this.f8329z = vVar;
                this.A = z10;
                this.B = z11;
                this.C = lVar;
                this.D = xVar;
                this.E = eVar5;
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
                    j0.n.V(2032502107, i10, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous>.<anonymous> (CoreTextField.kt:624)");
                }
                e0.s.a(androidx.compose.foundation.relocation.c.b(s0.a(p0.c(c0.n.a(androidx.compose.foundation.layout.m.k(androidx.compose.ui.e.f2335a, this.f8317f.h(), 0.0f, 2, null), this.f8318m, this.f8319p, this.f8320q), this.f8321r, this.f8322s, this.f8323t, new b(this.f8317f)).a(this.f8324u).a(this.f8325v), this.f8318m).a(this.f8326w).a(this.f8327x), this.f8328y), q0.c.b(lVar, -363167407, true, new C0202a(this.f8329z, this.f8317f, this.A, this.B, this.C, this.f8322s, this.D, this.E, this.f8320q)), lVar, 48, 0);
                if (j0.n.K()) {
                    j0.n.U();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(pc.q<? super pc.p<? super j0.l, ? super Integer, dc.w>, ? super j0.l, ? super Integer, dc.w> qVar, int i10, t0 t0Var, v1.k0 k0Var, int i11, int i12, q0 q0Var, b2.j0 j0Var, b2.t0 t0Var2, androidx.compose.ui.e eVar, androidx.compose.ui.e eVar2, androidx.compose.ui.e eVar3, androidx.compose.ui.e eVar4, z.d dVar, e0.v vVar, boolean z10, boolean z11, pc.l<? super v1.g0, dc.w> lVar, b2.x xVar, j2.e eVar5) {
            super(2);
            this.f8304f = qVar;
            this.f8305m = i10;
            this.f8306p = t0Var;
            this.f8307q = k0Var;
            this.f8308r = i11;
            this.f8309s = i12;
            this.f8310t = q0Var;
            this.f8311u = j0Var;
            this.f8312v = t0Var2;
            this.f8313w = eVar;
            this.f8314x = eVar2;
            this.f8315y = eVar3;
            this.f8316z = eVar4;
            this.A = dVar;
            this.B = vVar;
            this.C = z10;
            this.D = z11;
            this.E = lVar;
            this.F = xVar;
            this.G = eVar5;
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
                j0.n.V(-374338080, i10, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous> (CoreTextField.kt:623)");
            }
            this.f8304f.invoke(q0.c.b(lVar, 2032502107, true, new a(this.f8306p, this.f8307q, this.f8308r, this.f8309s, this.f8310t, this.f8311u, this.f8312v, this.f8313w, this.f8314x, this.f8315y, this.f8316z, this.A, this.B, this.C, this.D, this.E, this.F, this.G)), lVar, Integer.valueOf(((this.f8305m >> 12) & 112) | 6));
            if (j0.n.K()) {
                j0.n.U();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CoreTextField.kt */
    /* loaded from: classes.dex */
    public static final class f extends qc.r implements pc.p<j0.l, Integer, dc.w> {
        final /* synthetic */ boolean A;
        final /* synthetic */ boolean B;
        final /* synthetic */ pc.q<pc.p<? super j0.l, ? super Integer, dc.w>, j0.l, Integer, dc.w> C;
        final /* synthetic */ int D;
        final /* synthetic */ int E;
        final /* synthetic */ int F;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ b2.j0 f8347f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ pc.l<b2.j0, dc.w> f8348m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f8349p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ v1.k0 f8350q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ b2.t0 f8351r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ pc.l<v1.g0, dc.w> f8352s;

        /* renamed from: t  reason: collision with root package name */
        final /* synthetic */ v.m f8353t;

        /* renamed from: u  reason: collision with root package name */
        final /* synthetic */ a1.e1 f8354u;

        /* renamed from: v  reason: collision with root package name */
        final /* synthetic */ boolean f8355v;

        /* renamed from: w  reason: collision with root package name */
        final /* synthetic */ int f8356w;

        /* renamed from: x  reason: collision with root package name */
        final /* synthetic */ int f8357x;

        /* renamed from: y  reason: collision with root package name */
        final /* synthetic */ b2.p f8358y;

        /* renamed from: z  reason: collision with root package name */
        final /* synthetic */ w f8359z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(b2.j0 j0Var, pc.l<? super b2.j0, dc.w> lVar, androidx.compose.ui.e eVar, v1.k0 k0Var, b2.t0 t0Var, pc.l<? super v1.g0, dc.w> lVar2, v.m mVar, a1.e1 e1Var, boolean z10, int i10, int i11, b2.p pVar, w wVar, boolean z11, boolean z12, pc.q<? super pc.p<? super j0.l, ? super Integer, dc.w>, ? super j0.l, ? super Integer, dc.w> qVar, int i12, int i13, int i14) {
            super(2);
            this.f8347f = j0Var;
            this.f8348m = lVar;
            this.f8349p = eVar;
            this.f8350q = k0Var;
            this.f8351r = t0Var;
            this.f8352s = lVar2;
            this.f8353t = mVar;
            this.f8354u = e1Var;
            this.f8355v = z10;
            this.f8356w = i10;
            this.f8357x = i11;
            this.f8358y = pVar;
            this.f8359z = wVar;
            this.A = z11;
            this.B = z12;
            this.C = qVar;
            this.D = i12;
            this.E = i13;
            this.F = i14;
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ dc.w invoke(j0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return dc.w.f13270a;
        }

        public final void invoke(j0.l lVar, int i10) {
            h.a(this.f8347f, this.f8348m, this.f8349p, this.f8350q, this.f8351r, this.f8352s, this.f8353t, this.f8354u, this.f8355v, this.f8356w, this.f8357x, this.f8358y, this.f8359z, this.A, this.B, this.C, lVar, z1.a(this.D | 1), z1.a(this.E), this.F);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CoreTextField.kt */
    /* loaded from: classes.dex */
    public static final class g extends qc.r implements pc.l<n1.s, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ t0 f8360f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(t0 t0Var) {
            super(1);
            this.f8360f = t0Var;
        }

        public final void a(n1.s sVar) {
            qc.q.i(sVar, "it");
            v0 g10 = this.f8360f.g();
            if (g10 != null) {
                g10.l(sVar);
            }
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ dc.w invoke(n1.s sVar) {
            a(sVar);
            return dc.w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CoreTextField.kt */
    /* renamed from: c0.h$h  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0205h extends qc.r implements pc.l<c1.f, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ t0 f8361f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ b2.j0 f8362m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ b2.x f8363p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0205h(t0 t0Var, b2.j0 j0Var, b2.x xVar) {
            super(1);
            this.f8361f = t0Var;
            this.f8362m = j0Var;
            this.f8363p = xVar;
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ dc.w invoke(c1.f fVar) {
            invoke2(fVar);
            return dc.w.f13270a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(c1.f fVar) {
            qc.q.i(fVar, "$this$drawBehind");
            v0 g10 = this.f8361f.g();
            if (g10 != null) {
                b2.j0 j0Var = this.f8362m;
                b2.x xVar = this.f8363p;
                t0 t0Var = this.f8361f;
                h0.f8440a.b(fVar.y0().d(), j0Var, xVar, g10.i(), t0Var.m());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CoreTextField.kt */
    /* loaded from: classes.dex */
    public static final class i extends qc.r implements pc.l<y0.o, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ t0 f8364f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ b2.l0 f8365m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ boolean f8366p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ boolean f8367q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ b2.j0 f8368r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ b2.p f8369s;

        /* renamed from: t  reason: collision with root package name */
        final /* synthetic */ b2.x f8370t;

        /* renamed from: u  reason: collision with root package name */
        final /* synthetic */ e0.v f8371u;

        /* renamed from: v  reason: collision with root package name */
        final /* synthetic */ ad.k0 f8372v;

        /* renamed from: w  reason: collision with root package name */
        final /* synthetic */ z.d f8373w;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: CoreTextField.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$focusModifier$1$1$1", f = "CoreTextField.kt", l = {318}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super dc.w>, Object> {

            /* renamed from: f  reason: collision with root package name */
            int f8374f;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ z.d f8375m;

            /* renamed from: p  reason: collision with root package name */
            final /* synthetic */ b2.j0 f8376p;

            /* renamed from: q  reason: collision with root package name */
            final /* synthetic */ t0 f8377q;

            /* renamed from: r  reason: collision with root package name */
            final /* synthetic */ v0 f8378r;

            /* renamed from: s  reason: collision with root package name */
            final /* synthetic */ b2.x f8379s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(z.d dVar, b2.j0 j0Var, t0 t0Var, v0 v0Var, b2.x xVar, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f8375m = dVar;
                this.f8376p = j0Var;
                this.f8377q = t0Var;
                this.f8378r = v0Var;
                this.f8379s = xVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
                return new a(this.f8375m, this.f8376p, this.f8377q, this.f8378r, this.f8379s, continuation);
            }

            @Override // pc.p
            public final Object invoke(ad.k0 k0Var, Continuation<? super dc.w> continuation) {
                return ((a) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object d10;
                d10 = ic.d.d();
                int i10 = this.f8374f;
                if (i10 != 0) {
                    if (i10 == 1) {
                        dc.n.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    dc.n.b(obj);
                    z.d dVar = this.f8375m;
                    b2.j0 j0Var = this.f8376p;
                    d0 r10 = this.f8377q.r();
                    v1.g0 i11 = this.f8378r.i();
                    b2.x xVar = this.f8379s;
                    this.f8374f = 1;
                    if (h.m(dVar, j0Var, r10, i11, xVar, this) == d10) {
                        return d10;
                    }
                }
                return dc.w.f13270a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(t0 t0Var, b2.l0 l0Var, boolean z10, boolean z11, b2.j0 j0Var, b2.p pVar, b2.x xVar, e0.v vVar, ad.k0 k0Var, z.d dVar) {
            super(1);
            this.f8364f = t0Var;
            this.f8365m = l0Var;
            this.f8366p = z10;
            this.f8367q = z11;
            this.f8368r = j0Var;
            this.f8369s = pVar;
            this.f8370t = xVar;
            this.f8371u = vVar;
            this.f8372v = k0Var;
            this.f8373w = dVar;
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ dc.w invoke(y0.o oVar) {
            invoke2(oVar);
            return dc.w.f13270a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(y0.o oVar) {
            v0 g10;
            qc.q.i(oVar, "it");
            if (this.f8364f.d() == oVar.isFocused()) {
                return;
            }
            this.f8364f.v(oVar.isFocused());
            if (this.f8365m != null) {
                if (!this.f8364f.d() || !this.f8366p || this.f8367q) {
                    h.n(this.f8364f);
                } else {
                    h.q(this.f8365m, this.f8364f, this.f8368r, this.f8369s, this.f8370t);
                }
                if (oVar.isFocused() && (g10 = this.f8364f.g()) != null) {
                    ad.i.d(this.f8372v, null, null, new a(this.f8373w, this.f8368r, this.f8364f, g10, this.f8370t, null), 3, null);
                }
            }
            if (oVar.isFocused()) {
                return;
            }
            e0.v.q(this.f8371u, null, 1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CoreTextField.kt */
    /* loaded from: classes.dex */
    public static final class j extends qc.r implements pc.l<n1.s, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ t0 f8380f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ boolean f8381m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ e0.v f8382p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ b2.j0 f8383q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ b2.x f8384r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(t0 t0Var, boolean z10, e0.v vVar, b2.j0 j0Var, b2.x xVar) {
            super(1);
            this.f8380f = t0Var;
            this.f8381m = z10;
            this.f8382p = vVar;
            this.f8383q = j0Var;
            this.f8384r = xVar;
        }

        public final void a(n1.s sVar) {
            qc.q.i(sVar, "it");
            this.f8380f.x(sVar);
            if (this.f8381m) {
                if (this.f8380f.c() == c0.m.Selection) {
                    if (this.f8380f.o()) {
                        this.f8382p.a0();
                    } else {
                        this.f8382p.J();
                    }
                    this.f8380f.D(e0.w.c(this.f8382p, true));
                    this.f8380f.C(e0.w.c(this.f8382p, false));
                } else if (this.f8380f.c() == c0.m.Cursor) {
                    this.f8380f.A(e0.w.c(this.f8382p, true));
                }
                h.o(this.f8380f, this.f8383q, this.f8384r);
            }
            v0 g10 = this.f8380f.g();
            if (g10 != null) {
                g10.m(sVar);
            }
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ dc.w invoke(n1.s sVar) {
            a(sVar);
            return dc.w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CoreTextField.kt */
    /* loaded from: classes.dex */
    public static final class k extends qc.r implements pc.l<z0.f, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ t0 f8385f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.focus.k f8386m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ boolean f8387p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ e0.v f8388q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ b2.x f8389r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(t0 t0Var, androidx.compose.ui.focus.k kVar, boolean z10, e0.v vVar, b2.x xVar) {
            super(1);
            this.f8385f = t0Var;
            this.f8386m = kVar;
            this.f8387p = z10;
            this.f8388q = vVar;
            this.f8389r = xVar;
        }

        public final void a(long j10) {
            boolean z10 = true;
            h.r(this.f8385f, this.f8386m, !this.f8387p);
            if (this.f8385f.d()) {
                if (this.f8385f.c() != c0.m.Selection) {
                    v0 g10 = this.f8385f.g();
                    if (g10 != null) {
                        t0 t0Var = this.f8385f;
                        h0.f8440a.i(j10, g10, t0Var.k(), this.f8389r, t0Var.j());
                        if (t0Var.r().k().length() <= 0) {
                            z10 = false;
                        }
                        if (z10) {
                            t0Var.u(c0.m.Cursor);
                            return;
                        }
                        return;
                    }
                    return;
                }
                this.f8388q.p(z0.f.d(j10));
            }
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ dc.w invoke(z0.f fVar) {
            a(fVar.x());
            return dc.w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CoreTextField.kt */
    /* loaded from: classes.dex */
    public static final class l extends qc.r implements pc.a<q0> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ u.o f8390f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(u.o oVar) {
            super(0);
            this.f8390f = oVar;
        }

        @Override // pc.a
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final q0 invoke() {
            return new q0(this.f8390f, 0.0f, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CoreTextField.kt */
    /* loaded from: classes.dex */
    public static final class m extends qc.r implements pc.l<t1.x, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ b2.p f8391f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ b2.s0 f8392m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ b2.j0 f8393p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ boolean f8394q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ boolean f8395r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ boolean f8396s;

        /* renamed from: t  reason: collision with root package name */
        final /* synthetic */ t0 f8397t;

        /* renamed from: u  reason: collision with root package name */
        final /* synthetic */ b2.x f8398u;

        /* renamed from: v  reason: collision with root package name */
        final /* synthetic */ e0.v f8399v;

        /* renamed from: w  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.focus.k f8400w;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: CoreTextField.kt */
        /* loaded from: classes.dex */
        public static final class a extends qc.r implements pc.a<Boolean> {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ e0.v f8401f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(e0.v vVar) {
                super(0);
                this.f8401f = vVar;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // pc.a
            public final Boolean invoke() {
                this.f8401f.L();
                return Boolean.TRUE;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: CoreTextField.kt */
        /* loaded from: classes.dex */
        public static final class b extends qc.r implements pc.l<List<v1.g0>, Boolean> {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ t0 f8402f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(t0 t0Var) {
                super(1);
                this.f8402f = t0Var;
            }

            @Override // pc.l
            /* renamed from: a  reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(List<v1.g0> list) {
                boolean z10;
                qc.q.i(list, "it");
                if (this.f8402f.g() != null) {
                    v0 g10 = this.f8402f.g();
                    qc.q.f(g10);
                    list.add(g10.i());
                    z10 = true;
                } else {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: CoreTextField.kt */
        /* loaded from: classes.dex */
        public static final class c extends qc.r implements pc.l<v1.d, Boolean> {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ boolean f8403f;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ boolean f8404m;

            /* renamed from: p  reason: collision with root package name */
            final /* synthetic */ t0 f8405p;

            /* renamed from: q  reason: collision with root package name */
            final /* synthetic */ t1.x f8406q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(boolean z10, boolean z11, t0 t0Var, t1.x xVar) {
                super(1);
                this.f8403f = z10;
                this.f8404m = z11;
                this.f8405p = t0Var;
                this.f8406q = xVar;
            }

            @Override // pc.l
            /* renamed from: a  reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(v1.d dVar) {
                dc.w wVar;
                List<? extends b2.f> l10;
                qc.q.i(dVar, "text");
                if (!this.f8403f && this.f8404m) {
                    b2.r0 e10 = this.f8405p.e();
                    if (e10 != null) {
                        t0 t0Var = this.f8405p;
                        h0.a aVar = h0.f8440a;
                        l10 = ec.t.l(new b2.c(), new b2.b(dVar, 1));
                        aVar.f(l10, t0Var.k(), t0Var.j(), e10);
                        wVar = dc.w.f13270a;
                    } else {
                        wVar = null;
                    }
                    if (wVar == null) {
                        this.f8405p.j().invoke(new b2.j0(dVar.i(), v1.j0.a(dVar.i().length()), (v1.i0) null, 4, (qc.h) null));
                    }
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: CoreTextField.kt */
        /* loaded from: classes.dex */
        public static final class d extends qc.r implements pc.l<v1.d, Boolean> {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ boolean f8407f;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ boolean f8408m;

            /* renamed from: p  reason: collision with root package name */
            final /* synthetic */ t0 f8409p;

            /* renamed from: q  reason: collision with root package name */
            final /* synthetic */ t1.x f8410q;

            /* renamed from: r  reason: collision with root package name */
            final /* synthetic */ b2.j0 f8411r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(boolean z10, boolean z11, t0 t0Var, t1.x xVar, b2.j0 j0Var) {
                super(1);
                this.f8407f = z10;
                this.f8408m = z11;
                this.f8409p = t0Var;
                this.f8410q = xVar;
                this.f8411r = j0Var;
            }

            @Override // pc.l
            /* renamed from: a  reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(v1.d dVar) {
                dc.w wVar;
                CharSequence r02;
                List<? extends b2.f> l10;
                qc.q.i(dVar, "text");
                if (!this.f8407f && this.f8408m) {
                    b2.r0 e10 = this.f8409p.e();
                    if (e10 != null) {
                        t0 t0Var = this.f8409p;
                        h0.a aVar = h0.f8440a;
                        l10 = ec.t.l(new b2.k(), new b2.b(dVar, 1));
                        aVar.f(l10, t0Var.k(), t0Var.j(), e10);
                        wVar = dc.w.f13270a;
                    } else {
                        wVar = null;
                    }
                    if (wVar == null) {
                        b2.j0 j0Var = this.f8411r;
                        t0 t0Var2 = this.f8409p;
                        r02 = yc.w.r0(j0Var.h(), v1.i0.n(j0Var.g()), v1.i0.i(j0Var.g()), dVar);
                        t0Var2.j().invoke(new b2.j0(r02.toString(), v1.j0.a(v1.i0.n(j0Var.g()) + dVar.length()), (v1.i0) null, 4, (qc.h) null));
                    }
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: CoreTextField.kt */
        /* loaded from: classes.dex */
        public static final class e extends qc.r implements pc.q<Integer, Integer, Boolean, Boolean> {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ b2.x f8412f;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ boolean f8413m;

            /* renamed from: p  reason: collision with root package name */
            final /* synthetic */ b2.j0 f8414p;

            /* renamed from: q  reason: collision with root package name */
            final /* synthetic */ e0.v f8415q;

            /* renamed from: r  reason: collision with root package name */
            final /* synthetic */ t0 f8416r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            e(b2.x xVar, boolean z10, b2.j0 j0Var, e0.v vVar, t0 t0Var) {
                super(3);
                this.f8412f = xVar;
                this.f8413m = z10;
                this.f8414p = j0Var;
                this.f8415q = vVar;
                this.f8416r = t0Var;
            }

            public final Boolean a(int i10, int i11, boolean z10) {
                int h10;
                int d10;
                if (!z10) {
                    i10 = this.f8412f.a(i10);
                }
                if (!z10) {
                    i11 = this.f8412f.a(i11);
                }
                boolean z11 = false;
                if (this.f8413m && (i10 != v1.i0.n(this.f8414p.g()) || i11 != v1.i0.i(this.f8414p.g()))) {
                    h10 = vc.l.h(i10, i11);
                    if (h10 >= 0) {
                        d10 = vc.l.d(i10, i11);
                        if (d10 <= this.f8414p.e().length()) {
                            if (!z10 && i10 != i11) {
                                this.f8415q.r();
                            } else {
                                this.f8415q.s();
                            }
                            this.f8416r.j().invoke(new b2.j0(this.f8414p.e(), v1.j0.b(i10, i11), (v1.i0) null, 4, (qc.h) null));
                            z11 = true;
                        }
                    }
                    this.f8415q.s();
                }
                return Boolean.valueOf(z11);
            }

            @Override // pc.q
            public /* bridge */ /* synthetic */ Boolean invoke(Integer num, Integer num2, Boolean bool) {
                return a(num.intValue(), num2.intValue(), bool.booleanValue());
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: CoreTextField.kt */
        /* loaded from: classes.dex */
        public static final class f extends qc.r implements pc.a<Boolean> {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ t0 f8417f;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ b2.p f8418m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            f(t0 t0Var, b2.p pVar) {
                super(0);
                this.f8417f = t0Var;
                this.f8418m = pVar;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // pc.a
            public final Boolean invoke() {
                this.f8417f.i().invoke(b2.o.i(this.f8418m.d()));
                return Boolean.TRUE;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: CoreTextField.kt */
        /* loaded from: classes.dex */
        public static final class g extends qc.r implements pc.a<Boolean> {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ t0 f8419f;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.focus.k f8420m;

            /* renamed from: p  reason: collision with root package name */
            final /* synthetic */ boolean f8421p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            g(t0 t0Var, androidx.compose.ui.focus.k kVar, boolean z10) {
                super(0);
                this.f8419f = t0Var;
                this.f8420m = kVar;
                this.f8421p = z10;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // pc.a
            public final Boolean invoke() {
                h.r(this.f8419f, this.f8420m, !this.f8421p);
                return Boolean.TRUE;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: CoreTextField.kt */
        /* renamed from: c0.h$m$h  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0206h extends qc.r implements pc.a<Boolean> {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ e0.v f8422f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0206h(e0.v vVar) {
                super(0);
                this.f8422f = vVar;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // pc.a
            public final Boolean invoke() {
                this.f8422f.r();
                return Boolean.TRUE;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: CoreTextField.kt */
        /* loaded from: classes.dex */
        public static final class i extends qc.r implements pc.a<Boolean> {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ e0.v f8423f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            i(e0.v vVar) {
                super(0);
                this.f8423f = vVar;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // pc.a
            public final Boolean invoke() {
                e0.v.l(this.f8423f, false, 1, null);
                return Boolean.TRUE;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: CoreTextField.kt */
        /* loaded from: classes.dex */
        public static final class j extends qc.r implements pc.a<Boolean> {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ e0.v f8424f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            j(e0.v vVar) {
                super(0);
                this.f8424f = vVar;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // pc.a
            public final Boolean invoke() {
                this.f8424f.o();
                return Boolean.TRUE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(b2.p pVar, b2.s0 s0Var, b2.j0 j0Var, boolean z10, boolean z11, boolean z12, t0 t0Var, b2.x xVar, e0.v vVar, androidx.compose.ui.focus.k kVar) {
            super(1);
            this.f8391f = pVar;
            this.f8392m = s0Var;
            this.f8393p = j0Var;
            this.f8394q = z10;
            this.f8395r = z11;
            this.f8396s = z12;
            this.f8397t = t0Var;
            this.f8398u = xVar;
            this.f8399v = vVar;
            this.f8400w = kVar;
        }

        public final void a(t1.x xVar) {
            qc.q.i(xVar, "$this$semantics");
            t1.v.N(xVar, this.f8391f.d());
            t1.v.K(xVar, this.f8392m.b());
            t1.v.X(xVar, this.f8393p.g());
            if (!this.f8394q) {
                t1.v.g(xVar);
            }
            if (this.f8395r) {
                t1.v.v(xVar);
            }
            t1.v.n(xVar, null, new b(this.f8397t), 1, null);
            t1.v.W(xVar, null, new c(this.f8396s, this.f8394q, this.f8397t, xVar), 1, null);
            t1.v.q(xVar, null, new d(this.f8396s, this.f8394q, this.f8397t, xVar, this.f8393p), 1, null);
            t1.v.T(xVar, null, new e(this.f8398u, this.f8394q, this.f8393p, this.f8399v, this.f8397t), 1, null);
            t1.v.z(xVar, null, new f(this.f8397t, this.f8391f), 1, null);
            t1.v.s(xVar, null, new g(this.f8397t, this.f8400w, this.f8396s), 1, null);
            t1.v.u(xVar, null, new C0206h(this.f8399v), 1, null);
            if (!v1.i0.h(this.f8393p.g()) && !this.f8395r) {
                t1.v.d(xVar, null, new i(this.f8399v), 1, null);
                if (this.f8394q && !this.f8396s) {
                    t1.v.f(xVar, null, new j(this.f8399v), 1, null);
                }
            }
            if (this.f8394q && !this.f8396s) {
                t1.v.x(xVar, null, new a(this.f8399v), 1, null);
            }
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ dc.w invoke(t1.x xVar) {
            a(xVar);
            return dc.w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CoreTextField.kt */
    /* loaded from: classes.dex */
    public static final class n extends qc.r implements pc.p<j0.l, Integer, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f8425f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ e0.v f8426m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ pc.p<j0.l, Integer, dc.w> f8427p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ int f8428q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        n(androidx.compose.ui.e eVar, e0.v vVar, pc.p<? super j0.l, ? super Integer, dc.w> pVar, int i10) {
            super(2);
            this.f8425f = eVar;
            this.f8426m = vVar;
            this.f8427p = pVar;
            this.f8428q = i10;
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ dc.w invoke(j0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return dc.w.f13270a;
        }

        public final void invoke(j0.l lVar, int i10) {
            h.c(this.f8425f, this.f8426m, this.f8427p, lVar, z1.a(this.f8428q | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CoreTextField.kt */
    /* loaded from: classes.dex */
    public static final class o extends qc.r implements pc.p<j0.l, Integer, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ e0.v f8429f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ boolean f8430m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ int f8431p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(e0.v vVar, boolean z10, int i10) {
            super(2);
            this.f8429f = vVar;
            this.f8430m = z10;
            this.f8431p = i10;
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ dc.w invoke(j0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return dc.w.f13270a;
        }

        public final void invoke(j0.l lVar, int i10) {
            h.d(this.f8429f, this.f8430m, lVar, z1.a(this.f8431p | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CoreTextField.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$1", f = "CoreTextField.kt", l = {1099}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class p extends kotlin.coroutines.jvm.internal.l implements pc.p<k1.l0, Continuation<? super dc.w>, Object> {

        /* renamed from: f  reason: collision with root package name */
        int f8432f;

        /* renamed from: m  reason: collision with root package name */
        private /* synthetic */ Object f8433m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ f0 f8434p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(f0 f0Var, Continuation<? super p> continuation) {
            super(2, continuation);
            this.f8434p = f0Var;
        }

        @Override // pc.p
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final Object invoke(k1.l0 l0Var, Continuation<? super dc.w> continuation) {
            return ((p) create(l0Var, continuation)).invokeSuspend(dc.w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
            p pVar = new p(this.f8434p, continuation);
            pVar.f8433m = obj;
            return pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d10;
            d10 = ic.d.d();
            int i10 = this.f8432f;
            if (i10 != 0) {
                if (i10 == 1) {
                    dc.n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                dc.n.b(obj);
                k1.l0 l0Var = (k1.l0) this.f8433m;
                f0 f0Var = this.f8434p;
                this.f8432f = 1;
                if (y.c(l0Var, f0Var, this) == d10) {
                    return d10;
                }
            }
            return dc.w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CoreTextField.kt */
    /* loaded from: classes.dex */
    public static final class q extends qc.r implements pc.l<t1.x, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ long f8435f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(long j10) {
            super(1);
            this.f8435f = j10;
        }

        public final void a(t1.x xVar) {
            qc.q.i(xVar, "$this$semantics");
            xVar.a(e0.n.d(), new e0.m(c0.l.Cursor, this.f8435f, null));
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ dc.w invoke(t1.x xVar) {
            a(xVar);
            return dc.w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CoreTextField.kt */
    /* loaded from: classes.dex */
    public static final class r extends qc.r implements pc.p<j0.l, Integer, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ e0.v f8436f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ int f8437m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r(e0.v vVar, int i10) {
            super(2);
            this.f8436f = vVar;
            this.f8437m = i10;
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ dc.w invoke(j0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return dc.w.f13270a;
        }

        public final void invoke(j0.l lVar, int i10) {
            h.e(this.f8436f, lVar, z1.a(this.f8437m | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CoreTextField.kt */
    /* loaded from: classes.dex */
    public static final class s extends qc.r implements pc.l<i1.b, Boolean> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ t0 f8438f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ e0.v f8439m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        s(t0 t0Var, e0.v vVar) {
            super(1);
            this.f8438f = t0Var;
            this.f8439m = vVar;
        }

        public final Boolean a(KeyEvent keyEvent) {
            boolean z10;
            qc.q.i(keyEvent, "keyEvent");
            if (this.f8438f.c() == c0.m.Selection && c0.r.a(keyEvent)) {
                z10 = true;
                e0.v.q(this.f8439m, null, 1, null);
            } else {
                z10 = false;
            }
            return Boolean.valueOf(z10);
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ Boolean invoke(i1.b bVar) {
            return a(bVar.f());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:260:0x0445, code lost:
    
        if (r11 == null) goto L263;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x03a9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:244:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0475  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x04e4  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0516  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x057c  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x05a7  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x05e2  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0615  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0622  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0653  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x06ab A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:299:0x06e1  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x06e4  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0733  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0746  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x074d  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x07aa  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x07d0  */
    /* JADX WARN: Removed duplicated region for block: B:321:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0137  */
    /* JADX WARN: Type inference failed for: r0v39, types: [androidx.compose.ui.e] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(b2.j0 r45, pc.l<? super b2.j0, dc.w> r46, androidx.compose.ui.e r47, v1.k0 r48, b2.t0 r49, pc.l<? super v1.g0, dc.w> r50, v.m r51, a1.e1 r52, boolean r53, int r54, int r55, b2.p r56, c0.w r57, boolean r58, boolean r59, pc.q<? super pc.p<? super j0.l, ? super java.lang.Integer, dc.w>, ? super j0.l, ? super java.lang.Integer, dc.w> r60, j0.l r61, int r62, int r63, int r64) {
        /*
            Method dump skipped, instructions count: 2028
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c0.h.a(b2.j0, pc.l, androidx.compose.ui.e, v1.k0, b2.t0, pc.l, v.m, a1.e1, boolean, int, int, b2.p, c0.w, boolean, boolean, pc.q, j0.l, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b(g3<Boolean> g3Var) {
        return g3Var.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(androidx.compose.ui.e eVar, e0.v vVar, pc.p<? super j0.l, ? super Integer, dc.w> pVar, j0.l lVar, int i10) {
        j0.l q10 = lVar.q(-20551815);
        if (j0.n.K()) {
            j0.n.V(-20551815, i10, -1, "androidx.compose.foundation.text.CoreTextFieldRootBox (CoreTextField.kt:723)");
        }
        int i11 = (i10 & 14) | 384;
        q10.e(733328855);
        int i12 = i11 >> 3;
        n1.i0 h10 = androidx.compose.foundation.layout.d.h(v0.b.f24258a.n(), true, q10, (i12 & 112) | (i12 & 14));
        q10.e(-1323940314);
        int a10 = j0.j.a(q10, 0);
        j0.v F = q10.F();
        g.a aVar = p1.g.f20790l;
        pc.a<p1.g> a11 = aVar.a();
        pc.q<i2<p1.g>, j0.l, Integer, dc.w> a12 = n1.x.a(eVar);
        int i13 = ((((i11 << 3) & 112) << 9) & 7168) | 6;
        if (!(q10.u() instanceof j0.f)) {
            j0.j.c();
        }
        q10.s();
        if (q10.n()) {
            q10.B(a11);
        } else {
            q10.H();
        }
        j0.l a13 = l3.a(q10);
        l3.b(a13, h10, aVar.e());
        l3.b(a13, F, aVar.g());
        pc.p<p1.g, Integer, dc.w> b10 = aVar.b();
        if (a13.n() || !qc.q.d(a13.f(), Integer.valueOf(a10))) {
            a13.J(Integer.valueOf(a10));
            a13.I(Integer.valueOf(a10), b10);
        }
        a12.invoke(i2.a(i2.b(q10)), q10, Integer.valueOf((i13 >> 3) & 112));
        q10.e(2058660585);
        androidx.compose.foundation.layout.e eVar2 = androidx.compose.foundation.layout.e.f2083a;
        q10.e(-1985516685);
        pVar.invoke(q10, Integer.valueOf(((((i10 >> 3) & 112) | 8) >> 3) & 14));
        q10.N();
        q10.N();
        q10.O();
        q10.N();
        q10.N();
        if (j0.n.K()) {
            j0.n.U();
        }
        g2 w10 = q10.w();
        if (w10 != null) {
            w10.a(new n(eVar, vVar, pVar, i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(e0.v vVar, boolean z10, j0.l lVar, int i10) {
        boolean z11;
        v0 g10;
        v1.g0 i11;
        boolean z12;
        j0.l q10 = lVar.q(626339208);
        if (j0.n.K()) {
            j0.n.V(626339208, i10, -1, "androidx.compose.foundation.text.SelectionToolbarAndHandles (CoreTextField.kt:1047)");
        }
        if (z10) {
            t0 E = vVar.E();
            v1.g0 g0Var = null;
            boolean z13 = true;
            if (E != null && (g10 = E.g()) != null && (i11 = g10.i()) != null) {
                t0 E2 = vVar.E();
                if (E2 != null) {
                    z12 = E2.t();
                } else {
                    z12 = true;
                }
                if ((!z12) != false) {
                    g0Var = i11;
                }
            }
            if (g0Var != null) {
                if (!v1.i0.h(vVar.H().g())) {
                    int b10 = vVar.C().b(v1.i0.n(vVar.H().g()));
                    int b11 = vVar.C().b(v1.i0.i(vVar.H().g()));
                    g2.i b12 = g0Var.b(b10);
                    g2.i b13 = g0Var.b(Math.max(b11 - 1, 0));
                    q10.e(-498388703);
                    t0 E3 = vVar.E();
                    if (E3 != null && E3.q()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        e0.w.a(true, b12, vVar, q10, 518);
                    }
                    q10.N();
                    t0 E4 = vVar.E();
                    if (E4 == null || !E4.p()) {
                        z13 = false;
                    }
                    if (z13) {
                        e0.w.a(false, b13, vVar, q10, 518);
                    }
                }
                t0 E5 = vVar.E();
                if (E5 != null) {
                    if (vVar.K()) {
                        E5.B(false);
                    }
                    if (E5.d()) {
                        if (E5.o()) {
                            vVar.a0();
                        } else {
                            vVar.J();
                        }
                    }
                }
            }
        } else {
            vVar.J();
        }
        if (j0.n.K()) {
            j0.n.U();
        }
        g2 w10 = q10.w();
        if (w10 != null) {
            w10.a(new o(vVar, z10, i10));
        }
    }

    public static final void e(e0.v vVar, j0.l lVar, int i10) {
        boolean z10;
        qc.q.i(vVar, "manager");
        j0.l q10 = lVar.q(-1436003720);
        if (j0.n.K()) {
            j0.n.V(-1436003720, i10, -1, "androidx.compose.foundation.text.TextFieldCursorHandle (CoreTextField.kt:1090)");
        }
        t0 E = vVar.E();
        if (E != null && E.n()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            q10.e(1157296644);
            boolean Q = q10.Q(vVar);
            Object f10 = q10.f();
            if (Q || f10 == j0.l.f18688a.a()) {
                f10 = vVar.n();
                q10.J(f10);
            }
            q10.N();
            f0 f0Var = (f0) f10;
            long v10 = vVar.v((j2.e) q10.C(androidx.compose.ui.platform.z0.e()));
            androidx.compose.ui.e c10 = k1.u0.c(androidx.compose.ui.e.f2335a, f0Var, new p(f0Var, null));
            z0.f d10 = z0.f.d(v10);
            q10.e(1157296644);
            boolean Q2 = q10.Q(d10);
            Object f11 = q10.f();
            if (Q2 || f11 == j0.l.f18688a.a()) {
                f11 = new q(v10);
                q10.J(f11);
            }
            q10.N();
            c0.a.a(v10, t1.o.c(c10, false, (pc.l) f11, 1, null), null, q10, 384);
        }
        if (j0.n.K()) {
            j0.n.U();
        }
        g2 w10 = q10.w();
        if (w10 != null) {
            w10.a(new r(vVar, i10));
        }
    }

    public static final Object m(z.d dVar, b2.j0 j0Var, d0 d0Var, v1.g0 g0Var, b2.x xVar, Continuation<? super dc.w> continuation) {
        z0.h hVar;
        Object d10;
        int b10 = xVar.b(v1.i0.k(j0Var.g()));
        if (b10 < g0Var.k().j().length()) {
            hVar = g0Var.c(b10);
        } else if (b10 != 0) {
            hVar = g0Var.c(b10 - 1);
        } else {
            hVar = new z0.h(0.0f, 0.0f, 1.0f, j2.p.f(i0.b(d0Var.j(), d0Var.a(), d0Var.b(), null, 0, 24, null)));
        }
        Object a10 = dVar.a(hVar, continuation);
        d10 = ic.d.d();
        if (a10 == d10) {
            return a10;
        }
        return dc.w.f13270a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(t0 t0Var) {
        b2.r0 e10 = t0Var.e();
        if (e10 != null) {
            h0.f8440a.e(e10, t0Var.k(), t0Var.j());
        }
        t0Var.w(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(t0 t0Var, b2.j0 j0Var, b2.x xVar) {
        t0.g a10 = t0.g.f23297e.a();
        try {
            t0.g l10 = a10.l();
            try {
                v0 g10 = t0Var.g();
                if (g10 == null) {
                    return;
                }
                b2.r0 e10 = t0Var.e();
                if (e10 == null) {
                    return;
                }
                n1.s f10 = t0Var.f();
                if (f10 == null) {
                    return;
                }
                h0.f8440a.d(j0Var, t0Var.r(), g10.i(), f10, e10, t0Var.d(), xVar);
                dc.w wVar = dc.w.f13270a;
            } finally {
                a10.s(l10);
            }
        } finally {
            a10.d();
        }
    }

    private static final androidx.compose.ui.e p(androidx.compose.ui.e eVar, t0 t0Var, e0.v vVar) {
        return androidx.compose.ui.input.key.a.b(eVar, new s(t0Var, vVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(b2.l0 l0Var, t0 t0Var, b2.j0 j0Var, b2.p pVar, b2.x xVar) {
        t0Var.w(h0.f8440a.g(l0Var, j0Var, t0Var.k(), pVar, t0Var.j(), t0Var.i()));
        o(t0Var, j0Var, xVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(t0 t0Var, androidx.compose.ui.focus.k kVar, boolean z10) {
        b2.r0 e10;
        if (!t0Var.d()) {
            kVar.e();
        } else if (z10 && (e10 = t0Var.e()) != null) {
            e10.e();
        }
    }
}
