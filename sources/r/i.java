package r;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import j0.d3;
import j0.g2;
import j0.i2;
import j0.j1;
import j0.l3;
import j0.y2;
import j0.z1;
import kotlin.coroutines.Continuation;
import okhttp3.internal.http2.Http2;
import p1.g;
import s.e1;
import s.g1;

/* compiled from: AnimatedVisibility.kt */
/* loaded from: classes.dex */
public final class i {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AnimatedVisibility.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$1$1", f = "AnimatedVisibility.kt", l = {748}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super dc.w>, Object> {

        /* renamed from: f  reason: collision with root package name */
        int f21906f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ e1<p> f21907m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ j1<Boolean> f21908p;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: AnimatedVisibility.kt */
        /* renamed from: r.i$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0491a extends qc.r implements pc.a<Boolean> {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ e1<p> f21909f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0491a(e1<p> e1Var) {
                super(0);
                this.f21909f = e1Var;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // pc.a
            public final Boolean invoke() {
                p g10 = this.f21909f.g();
                p pVar = p.Visible;
                return Boolean.valueOf(g10 == pVar || this.f21909f.m() == pVar);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: AnimatedVisibility.kt */
        /* loaded from: classes.dex */
        public static final class b implements dd.h<Boolean> {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ j1<Boolean> f21910f;

            b(j1<Boolean> j1Var) {
                this.f21910f = j1Var;
            }

            public final Object a(boolean z10, Continuation<? super dc.w> continuation) {
                this.f21910f.setValue(kotlin.coroutines.jvm.internal.b.a(z10));
                return dc.w.f13270a;
            }

            @Override // dd.h
            public /* bridge */ /* synthetic */ Object emit(Boolean bool, Continuation continuation) {
                return a(bool.booleanValue(), continuation);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(e1<p> e1Var, j1<Boolean> j1Var, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f21907m = e1Var;
            this.f21908p = j1Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
            return new a(this.f21907m, this.f21908p, continuation);
        }

        @Override // pc.p
        public final Object invoke(ad.k0 k0Var, Continuation<? super dc.w> continuation) {
            return ((a) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d10;
            d10 = ic.d.d();
            int i10 = this.f21906f;
            if (i10 != 0) {
                if (i10 == 1) {
                    dc.n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                dc.n.b(obj);
                dd.g n10 = y2.n(new C0491a(this.f21907m));
                b bVar = new b(this.f21908p);
                this.f21906f = 1;
                if (n10.collect(bVar, this) == d10) {
                    return d10;
                }
            }
            return dc.w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AnimatedVisibility.kt */
    /* loaded from: classes.dex */
    public static final class b extends qc.r implements pc.p<j0.l, Integer, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ e1<T> f21911f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ pc.l<T, Boolean> f21912m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f21913p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ r f21914q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ t f21915r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ pc.q<j, j0.l, Integer, dc.w> f21916s;

        /* renamed from: t  reason: collision with root package name */
        final /* synthetic */ int f21917t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(e1<T> e1Var, pc.l<? super T, Boolean> lVar, androidx.compose.ui.e eVar, r rVar, t tVar, pc.q<? super j, ? super j0.l, ? super Integer, dc.w> qVar, int i10) {
            super(2);
            this.f21911f = e1Var;
            this.f21912m = lVar;
            this.f21913p = eVar;
            this.f21914q = rVar;
            this.f21915r = tVar;
            this.f21916s = qVar;
            this.f21917t = i10;
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ dc.w invoke(j0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return dc.w.f13270a;
        }

        public final void invoke(j0.l lVar, int i10) {
            i.a(this.f21911f, this.f21912m, this.f21913p, this.f21914q, this.f21915r, this.f21916s, lVar, z1.a(this.f21917t | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AnimatedVisibility.kt */
    /* loaded from: classes.dex */
    public static final class c extends qc.r implements pc.p<j0.l, Integer, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ e1<T> f21918f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ pc.l<T, Boolean> f21919m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f21920p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ r f21921q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ t f21922r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ pc.q<j, j0.l, Integer, dc.w> f21923s;

        /* renamed from: t  reason: collision with root package name */
        final /* synthetic */ int f21924t;

        /* renamed from: u  reason: collision with root package name */
        final /* synthetic */ int f21925u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(e1<T> e1Var, pc.l<? super T, Boolean> lVar, androidx.compose.ui.e eVar, r rVar, t tVar, pc.q<? super j, ? super j0.l, ? super Integer, dc.w> qVar, int i10, int i11) {
            super(2);
            this.f21918f = e1Var;
            this.f21919m = lVar;
            this.f21920p = eVar;
            this.f21921q = rVar;
            this.f21922r = tVar;
            this.f21923s = qVar;
            this.f21924t = i10;
            this.f21925u = i11;
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ dc.w invoke(j0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return dc.w.f13270a;
        }

        public final void invoke(j0.l lVar, int i10) {
            i.b(this.f21918f, this.f21919m, this.f21920p, this.f21921q, this.f21922r, this.f21923s, lVar, z1.a(this.f21924t | 1), this.f21925u);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AnimatedVisibility.kt */
    /* loaded from: classes.dex */
    public static final class d extends qc.r implements pc.l<Boolean, Boolean> {

        /* renamed from: f  reason: collision with root package name */
        public static final d f21926f = new d();

        d() {
            super(1);
        }

        public final Boolean a(boolean z10) {
            return Boolean.valueOf(z10);
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
            return a(bool.booleanValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AnimatedVisibility.kt */
    /* loaded from: classes.dex */
    public static final class e extends qc.r implements pc.p<j0.l, Integer, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ boolean f21927f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f21928m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ r f21929p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ t f21930q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ String f21931r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ pc.q<j, j0.l, Integer, dc.w> f21932s;

        /* renamed from: t  reason: collision with root package name */
        final /* synthetic */ int f21933t;

        /* renamed from: u  reason: collision with root package name */
        final /* synthetic */ int f21934u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(boolean z10, androidx.compose.ui.e eVar, r rVar, t tVar, String str, pc.q<? super j, ? super j0.l, ? super Integer, dc.w> qVar, int i10, int i11) {
            super(2);
            this.f21927f = z10;
            this.f21928m = eVar;
            this.f21929p = rVar;
            this.f21930q = tVar;
            this.f21931r = str;
            this.f21932s = qVar;
            this.f21933t = i10;
            this.f21934u = i11;
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ dc.w invoke(j0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return dc.w.f13270a;
        }

        public final void invoke(j0.l lVar, int i10) {
            i.e(this.f21927f, this.f21928m, this.f21929p, this.f21930q, this.f21931r, this.f21932s, lVar, z1.a(this.f21933t | 1), this.f21934u);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AnimatedVisibility.kt */
    /* loaded from: classes.dex */
    public static final class f extends qc.r implements pc.l<Boolean, Boolean> {

        /* renamed from: f  reason: collision with root package name */
        public static final f f21935f = new f();

        f() {
            super(1);
        }

        public final Boolean a(boolean z10) {
            return Boolean.valueOf(z10);
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
            return a(bool.booleanValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AnimatedVisibility.kt */
    /* loaded from: classes.dex */
    public static final class g extends qc.r implements pc.p<j0.l, Integer, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ w.a0 f21936f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ boolean f21937m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f21938p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ r f21939q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ t f21940r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ String f21941s;

        /* renamed from: t  reason: collision with root package name */
        final /* synthetic */ pc.q<j, j0.l, Integer, dc.w> f21942t;

        /* renamed from: u  reason: collision with root package name */
        final /* synthetic */ int f21943u;

        /* renamed from: v  reason: collision with root package name */
        final /* synthetic */ int f21944v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        g(w.a0 a0Var, boolean z10, androidx.compose.ui.e eVar, r rVar, t tVar, String str, pc.q<? super j, ? super j0.l, ? super Integer, dc.w> qVar, int i10, int i11) {
            super(2);
            this.f21936f = a0Var;
            this.f21937m = z10;
            this.f21938p = eVar;
            this.f21939q = rVar;
            this.f21940r = tVar;
            this.f21941s = str;
            this.f21942t = qVar;
            this.f21943u = i10;
            this.f21944v = i11;
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ dc.w invoke(j0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return dc.w.f13270a;
        }

        public final void invoke(j0.l lVar, int i10) {
            i.d(this.f21936f, this.f21937m, this.f21938p, this.f21939q, this.f21940r, this.f21941s, this.f21942t, lVar, z1.a(this.f21943u | 1), this.f21944v);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AnimatedVisibility.kt */
    /* loaded from: classes.dex */
    public static final class h extends qc.r implements pc.l<Boolean, Boolean> {

        /* renamed from: f  reason: collision with root package name */
        public static final h f21945f = new h();

        h() {
            super(1);
        }

        public final Boolean a(boolean z10) {
            return Boolean.valueOf(z10);
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
            return a(bool.booleanValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AnimatedVisibility.kt */
    /* renamed from: r.i$i  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0492i extends qc.r implements pc.p<j0.l, Integer, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ w.j f21946f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ boolean f21947m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f21948p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ r f21949q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ t f21950r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ String f21951s;

        /* renamed from: t  reason: collision with root package name */
        final /* synthetic */ pc.q<j, j0.l, Integer, dc.w> f21952t;

        /* renamed from: u  reason: collision with root package name */
        final /* synthetic */ int f21953u;

        /* renamed from: v  reason: collision with root package name */
        final /* synthetic */ int f21954v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C0492i(w.j jVar, boolean z10, androidx.compose.ui.e eVar, r rVar, t tVar, String str, pc.q<? super j, ? super j0.l, ? super Integer, dc.w> qVar, int i10, int i11) {
            super(2);
            this.f21946f = jVar;
            this.f21947m = z10;
            this.f21948p = eVar;
            this.f21949q = rVar;
            this.f21950r = tVar;
            this.f21951s = str;
            this.f21952t = qVar;
            this.f21953u = i10;
            this.f21954v = i11;
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ dc.w invoke(j0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return dc.w.f13270a;
        }

        public final void invoke(j0.l lVar, int i10) {
            i.c(this.f21946f, this.f21947m, this.f21948p, this.f21949q, this.f21950r, this.f21951s, this.f21952t, lVar, z1.a(this.f21953u | 1), this.f21954v);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> void a(e1<T> e1Var, pc.l<? super T, Boolean> lVar, androidx.compose.ui.e eVar, r rVar, t tVar, pc.q<? super j, ? super j0.l, ? super Integer, dc.w> qVar, j0.l lVar2, int i10) {
        int i11;
        j0.l lVar3;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        j0.l q10 = lVar2.q(808253933);
        if ((i10 & 14) == 0) {
            if (q10.Q(e1Var)) {
                i17 = 4;
            } else {
                i17 = 2;
            }
            i11 = i17 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            if (q10.l(lVar)) {
                i16 = 32;
            } else {
                i16 = 16;
            }
            i11 |= i16;
        }
        if ((i10 & 896) == 0) {
            if (q10.Q(eVar)) {
                i15 = UserVerificationMethods.USER_VERIFY_HANDPRINT;
            } else {
                i15 = 128;
            }
            i11 |= i15;
        }
        if ((i10 & 7168) == 0) {
            if (q10.Q(rVar)) {
                i14 = RecyclerView.m.FLAG_MOVED;
            } else {
                i14 = UserVerificationMethods.USER_VERIFY_ALL;
            }
            i11 |= i14;
        }
        if ((i10 & 57344) == 0) {
            if (q10.Q(tVar)) {
                i13 = Http2.INITIAL_MAX_FRAME_SIZE;
            } else {
                i13 = 8192;
            }
            i11 |= i13;
        }
        if ((458752 & i10) == 0) {
            if (q10.l(qVar)) {
                i12 = 131072;
            } else {
                i12 = 65536;
            }
            i11 |= i12;
        }
        int i18 = i11;
        if ((374491 & i18) == 74898 && q10.t()) {
            q10.z();
            lVar3 = q10;
        } else {
            if (j0.n.K()) {
                j0.n.V(808253933, i18, -1, "androidx.compose.animation.AnimatedEnterExitImpl (AnimatedVisibility.kt:726)");
            }
            int i19 = i18 & 14;
            q10.e(1157296644);
            boolean Q = q10.Q(e1Var);
            Object f10 = q10.f();
            if (Q || f10 == j0.l.f18688a.a()) {
                f10 = d3.e(lVar.invoke(e1Var.g()), null, 2, null);
                q10.J(f10);
            }
            q10.N();
            j1 j1Var = (j1) f10;
            if (!lVar.invoke(e1Var.m()).booleanValue() && !((Boolean) j1Var.getValue()).booleanValue() && !e1Var.q()) {
                lVar3 = q10;
            } else {
                int i20 = i19 | 48;
                q10.e(1215497572);
                int i21 = i20 & 14;
                q10.e(1157296644);
                boolean Q2 = q10.Q(e1Var);
                Object f11 = q10.f();
                if (Q2 || f11 == j0.l.f18688a.a()) {
                    f11 = e1Var.g();
                    q10.J(f11);
                }
                q10.N();
                if (e1Var.q()) {
                    f11 = e1Var.g();
                }
                int i22 = (i20 >> 3) & 112;
                q10.e(-1220581778);
                if (j0.n.K()) {
                    j0.n.V(-1220581778, i22, -1, "androidx.compose.animation.AnimatedEnterExitImpl.<anonymous> (AnimatedVisibility.kt:739)");
                }
                int i23 = i19 | (i18 & 112) | ((i22 << 6) & 896);
                p g10 = g(e1Var, lVar, f11, q10, i23);
                if (j0.n.K()) {
                    j0.n.U();
                }
                q10.N();
                T m10 = e1Var.m();
                q10.e(-1220581778);
                if (j0.n.K()) {
                    j0.n.V(-1220581778, i22, -1, "androidx.compose.animation.AnimatedEnterExitImpl.<anonymous> (AnimatedVisibility.kt:739)");
                }
                p g11 = g(e1Var, lVar, m10, q10, i23);
                if (j0.n.K()) {
                    j0.n.U();
                }
                q10.N();
                e1 a10 = g1.a(e1Var, g10, g11, "EnterExitTransition", q10, i21 | ((i20 << 6) & 7168));
                q10.N();
                q10.e(511388516);
                boolean Q3 = q10.Q(a10) | q10.Q(j1Var);
                Object f12 = q10.f();
                if (Q3 || f12 == j0.l.f18688a.a()) {
                    f12 = new a(a10, j1Var, null);
                    q10.J(f12);
                }
                q10.N();
                j0.h0.d(a10, (pc.p) f12, q10, 64);
                int i24 = i18 >> 3;
                int i25 = (i24 & 57344) | (i24 & 112) | (i24 & 896) | (i24 & 7168);
                q10.e(-1967270694);
                Object g12 = a10.g();
                p pVar = p.Visible;
                if (g12 != pVar && a10.m() != pVar) {
                    lVar3 = q10;
                } else {
                    int i26 = i25 & 14;
                    q10.e(1157296644);
                    boolean Q4 = q10.Q(a10);
                    Object f13 = q10.f();
                    if (Q4 || f13 == j0.l.f18688a.a()) {
                        f13 = new k(a10);
                        q10.J(f13);
                    }
                    q10.N();
                    k kVar = (k) f13;
                    int i27 = i25 >> 3;
                    lVar3 = q10;
                    androidx.compose.ui.e a11 = eVar.a(q.g(a10, rVar, tVar, "Built-in", q10, i26 | 3072 | (i27 & 112) | (i27 & 896)));
                    lVar3.e(-492369756);
                    Object f14 = lVar3.f();
                    if (f14 == j0.l.f18688a.a()) {
                        f14 = new r.h(kVar);
                        lVar3.J(f14);
                    }
                    lVar3.N();
                    n1.i0 i0Var = (n1.i0) f14;
                    lVar3.e(-1323940314);
                    int a12 = j0.j.a(lVar3, 0);
                    j0.v F = lVar3.F();
                    g.a aVar = p1.g.f20790l;
                    pc.a<p1.g> a13 = aVar.a();
                    pc.q<i2<p1.g>, j0.l, Integer, dc.w> a14 = n1.x.a(a11);
                    if (!(lVar3.u() instanceof j0.f)) {
                        j0.j.c();
                    }
                    lVar3.s();
                    if (lVar3.n()) {
                        lVar3.B(a13);
                    } else {
                        lVar3.H();
                    }
                    j0.l a15 = l3.a(lVar3);
                    l3.b(a15, i0Var, aVar.e());
                    l3.b(a15, F, aVar.g());
                    pc.p<p1.g, Integer, dc.w> b10 = aVar.b();
                    if (a15.n() || !qc.q.d(a15.f(), Integer.valueOf(a12))) {
                        a15.J(Integer.valueOf(a12));
                        a15.I(Integer.valueOf(a12), b10);
                    }
                    a14.invoke(i2.a(i2.b(lVar3)), lVar3, 0);
                    lVar3.e(2058660585);
                    qVar.invoke(kVar, lVar3, Integer.valueOf(((i25 >> 9) & 112) | 8));
                    lVar3.N();
                    lVar3.O();
                    lVar3.N();
                }
                lVar3.N();
            }
            if (j0.n.K()) {
                j0.n.U();
            }
        }
        g2 w10 = lVar3.w();
        if (w10 != null) {
            w10.a(new b(e1Var, lVar, eVar, rVar, tVar, qVar, i10));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> void b(s.e1<T> r23, pc.l<? super T, java.lang.Boolean> r24, androidx.compose.ui.e r25, r.r r26, r.t r27, pc.q<? super r.j, ? super j0.l, ? super java.lang.Integer, dc.w> r28, j0.l r29, int r30, int r31) {
        /*
            Method dump skipped, instructions count: 369
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r.i.b(s.e1, pc.l, androidx.compose.ui.e, r.r, r.t, pc.q, j0.l, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(w.j r24, boolean r25, androidx.compose.ui.e r26, r.r r27, r.t r28, java.lang.String r29, pc.q<? super r.j, ? super j0.l, ? super java.lang.Integer, dc.w> r30, j0.l r31, int r32, int r33) {
        /*
            Method dump skipped, instructions count: 401
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r.i.c(w.j, boolean, androidx.compose.ui.e, r.r, r.t, java.lang.String, pc.q, j0.l, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(w.a0 r24, boolean r25, androidx.compose.ui.e r26, r.r r27, r.t r28, java.lang.String r29, pc.q<? super r.j, ? super j0.l, ? super java.lang.Integer, dc.w> r30, j0.l r31, int r32, int r33) {
        /*
            Method dump skipped, instructions count: 401
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r.i.d(w.a0, boolean, androidx.compose.ui.e, r.r, r.t, java.lang.String, pc.q, j0.l, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(boolean r24, androidx.compose.ui.e r25, r.r r26, r.t r27, java.lang.String r28, pc.q<? super r.j, ? super j0.l, ? super java.lang.Integer, dc.w> r29, j0.l r30, int r31, int r32) {
        /*
            Method dump skipped, instructions count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r.i.e(boolean, androidx.compose.ui.e, r.r, r.t, java.lang.String, pc.q, j0.l, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <T> p g(e1<T> e1Var, pc.l<? super T, Boolean> lVar, T t10, j0.l lVar2, int i10) {
        p pVar;
        lVar2.e(361571134);
        if (j0.n.K()) {
            j0.n.V(361571134, i10, -1, "androidx.compose.animation.targetEnterExit (AnimatedVisibility.kt:830)");
        }
        lVar2.r(-721837504, e1Var);
        if (e1Var.q()) {
            if (lVar.invoke(t10).booleanValue()) {
                pVar = p.Visible;
            } else if (lVar.invoke(e1Var.g()).booleanValue()) {
                pVar = p.PostExit;
            } else {
                pVar = p.PreEnter;
            }
        } else {
            lVar2.e(-492369756);
            Object f10 = lVar2.f();
            if (f10 == j0.l.f18688a.a()) {
                f10 = d3.e(Boolean.FALSE, null, 2, null);
                lVar2.J(f10);
            }
            lVar2.N();
            j1 j1Var = (j1) f10;
            if (lVar.invoke(e1Var.g()).booleanValue()) {
                j1Var.setValue(Boolean.TRUE);
            }
            if (lVar.invoke(t10).booleanValue()) {
                pVar = p.Visible;
            } else if (((Boolean) j1Var.getValue()).booleanValue()) {
                pVar = p.PostExit;
            } else {
                pVar = p.PreEnter;
            }
        }
        lVar2.M();
        if (j0.n.K()) {
            j0.n.U();
        }
        lVar2.N();
        return pVar;
    }
}
