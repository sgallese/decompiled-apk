package f0;

import a1.p1;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.habitrpg.android.habitica.ui.activities.TaskFormActivity;
import j0.i2;
import j0.l3;
import okhttp3.internal.http2.Http2;
import p1.g;

/* compiled from: TextFieldImpl.kt */
/* loaded from: classes.dex */
public final class a2 {

    /* renamed from: a  reason: collision with root package name */
    private static final long f14330a = j2.c.a(0, 0, 0, 0);

    /* renamed from: b  reason: collision with root package name */
    private static final float f14331b = j2.h.j(16);

    /* renamed from: c  reason: collision with root package name */
    private static final float f14332c = j2.h.j(12);

    /* renamed from: d  reason: collision with root package name */
    private static final androidx.compose.ui.e f14333d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TextFieldImpl.kt */
    /* loaded from: classes.dex */
    public static final class a extends qc.r implements pc.t<Float, a1.p1, a1.p1, Float, j0.l, Integer, dc.w> {
        final /* synthetic */ boolean A;
        final /* synthetic */ w.s B;
        final /* synthetic */ boolean C;
        final /* synthetic */ pc.p<j0.l, Integer, dc.w> D;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ pc.p<j0.l, Integer, dc.w> f14334f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ pc.p<j0.l, Integer, dc.w> f14335m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ String f14336p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ boolean f14337q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ int f14338r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ w1 f14339s;

        /* renamed from: t  reason: collision with root package name */
        final /* synthetic */ boolean f14340t;

        /* renamed from: u  reason: collision with root package name */
        final /* synthetic */ v.k f14341u;

        /* renamed from: v  reason: collision with root package name */
        final /* synthetic */ int f14342v;

        /* renamed from: w  reason: collision with root package name */
        final /* synthetic */ pc.p<j0.l, Integer, dc.w> f14343w;

        /* renamed from: x  reason: collision with root package name */
        final /* synthetic */ pc.p<j0.l, Integer, dc.w> f14344x;

        /* renamed from: y  reason: collision with root package name */
        final /* synthetic */ e2 f14345y;

        /* renamed from: z  reason: collision with root package name */
        final /* synthetic */ pc.p<j0.l, Integer, dc.w> f14346z;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: TextFieldImpl.kt */
        /* renamed from: f0.a2$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0345a extends qc.r implements pc.l<z0.l, dc.w> {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ float f14347f;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ j0.j1<z0.l> f14348m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0345a(float f10, j0.j1<z0.l> j1Var) {
                super(1);
                this.f14347f = f10;
                this.f14348m = j1Var;
            }

            public final void a(long j10) {
                boolean z10;
                float i10 = z0.l.i(j10) * this.f14347f;
                float g10 = z0.l.g(j10) * this.f14347f;
                boolean z11 = true;
                if (z0.l.i(this.f14348m.getValue().m()) == i10) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    if (z0.l.g(this.f14348m.getValue().m()) != g10) {
                        z11 = false;
                    }
                    if (z11) {
                        return;
                    }
                }
                this.f14348m.setValue(z0.l.c(z0.m.a(i10, g10)));
            }

            @Override // pc.l
            public /* bridge */ /* synthetic */ dc.w invoke(z0.l lVar) {
                a(lVar.m());
                return dc.w.f13270a;
            }
        }

        /* compiled from: TextFieldImpl.kt */
        /* loaded from: classes.dex */
        public /* synthetic */ class b {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f14349a;

            static {
                int[] iArr = new int[e2.values().length];
                try {
                    iArr[e2.Filled.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[e2.Outlined.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f14349a = iArr;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: TextFieldImpl.kt */
        /* loaded from: classes.dex */
        public static final class c extends qc.r implements pc.p<j0.l, Integer, dc.w> {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ float f14350f;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ long f14351m;

            /* renamed from: p  reason: collision with root package name */
            final /* synthetic */ pc.p<j0.l, Integer, dc.w> f14352p;

            /* renamed from: q  reason: collision with root package name */
            final /* synthetic */ int f14353q;

            /* renamed from: r  reason: collision with root package name */
            final /* synthetic */ boolean f14354r;

            /* renamed from: s  reason: collision with root package name */
            final /* synthetic */ long f14355s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            c(float f10, long j10, pc.p<? super j0.l, ? super Integer, dc.w> pVar, int i10, boolean z10, long j11) {
                super(2);
                this.f14350f = f10;
                this.f14351m = j10;
                this.f14352p = pVar;
                this.f14353q = i10;
                this.f14354r = z10;
                this.f14355s = j11;
            }

            @Override // pc.p
            public /* bridge */ /* synthetic */ dc.w invoke(j0.l lVar, Integer num) {
                invoke(lVar, num.intValue());
                return dc.w.f13270a;
            }

            public final void invoke(j0.l lVar, int i10) {
                v1.k0 k0Var;
                v1.k0 b10;
                if ((i10 & 11) == 2 && lVar.t()) {
                    lVar.z();
                    return;
                }
                if (j0.n.K()) {
                    j0.n.V(362863774, i10, -1, "androidx.compose.material.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (TextFieldImpl.kt:121)");
                }
                s0 s0Var = s0.f15068a;
                v1.k0 c10 = v1.l0.c(s0Var.c(lVar, 6).m(), s0Var.c(lVar, 6).e(), this.f14350f);
                boolean z10 = this.f14354r;
                long j10 = this.f14355s;
                if (z10) {
                    b10 = c10.b((r48 & 1) != 0 ? c10.f24475a.g() : j10, (r48 & 2) != 0 ? c10.f24475a.k() : 0L, (r48 & 4) != 0 ? c10.f24475a.n() : null, (r48 & 8) != 0 ? c10.f24475a.l() : null, (r48 & 16) != 0 ? c10.f24475a.m() : null, (r48 & 32) != 0 ? c10.f24475a.i() : null, (r48 & 64) != 0 ? c10.f24475a.j() : null, (r48 & 128) != 0 ? c10.f24475a.o() : 0L, (r48 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? c10.f24475a.e() : null, (r48 & 512) != 0 ? c10.f24475a.u() : null, (r48 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? c10.f24475a.p() : null, (r48 & RecyclerView.m.FLAG_MOVED) != 0 ? c10.f24475a.d() : 0L, (r48 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? c10.f24475a.s() : null, (r48 & 8192) != 0 ? c10.f24475a.r() : null, (r48 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? c10.f24475a.h() : null, (r48 & 32768) != 0 ? c10.f24476b.j() : null, (r48 & 65536) != 0 ? c10.f24476b.l() : null, (r48 & 131072) != 0 ? c10.f24476b.g() : 0L, (r48 & 262144) != 0 ? c10.f24476b.m() : null, (r48 & 524288) != 0 ? c10.f24477c : null, (r48 & 1048576) != 0 ? c10.f24476b.h() : null, (r48 & 2097152) != 0 ? c10.f24476b.e() : null, (r48 & 4194304) != 0 ? c10.f24476b.c() : null, (r48 & 8388608) != 0 ? c10.f24476b.n() : null);
                    k0Var = b10;
                } else {
                    k0Var = c10;
                }
                a2.b(this.f14351m, k0Var, null, this.f14352p, lVar, ((this.f14353q >> 6) & 14) | 384, 0);
                if (j0.n.K()) {
                    j0.n.U();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: TextFieldImpl.kt */
        /* loaded from: classes.dex */
        public static final class d extends qc.r implements pc.p<j0.l, Integer, dc.w> {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ long f14356f;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ pc.p<j0.l, Integer, dc.w> f14357m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            d(long j10, pc.p<? super j0.l, ? super Integer, dc.w> pVar) {
                super(2);
                this.f14356f = j10;
                this.f14357m = pVar;
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
                    j0.n.V(1505327088, i10, -1, "androidx.compose.material.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (TextFieldImpl.kt:160)");
                }
                a2.b(this.f14356f, null, null, this.f14357m, lVar, 0, 6);
                if (j0.n.K()) {
                    j0.n.U();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: TextFieldImpl.kt */
        /* loaded from: classes.dex */
        public static final class e extends qc.r implements pc.q<androidx.compose.ui.e, j0.l, Integer, dc.w> {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ float f14358f;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ w1 f14359m;

            /* renamed from: p  reason: collision with root package name */
            final /* synthetic */ boolean f14360p;

            /* renamed from: q  reason: collision with root package name */
            final /* synthetic */ int f14361q;

            /* renamed from: r  reason: collision with root package name */
            final /* synthetic */ int f14362r;

            /* renamed from: s  reason: collision with root package name */
            final /* synthetic */ pc.p<j0.l, Integer, dc.w> f14363s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            e(float f10, w1 w1Var, boolean z10, int i10, int i11, pc.p<? super j0.l, ? super Integer, dc.w> pVar) {
                super(3);
                this.f14358f = f10;
                this.f14359m = w1Var;
                this.f14360p = z10;
                this.f14361q = i10;
                this.f14362r = i11;
                this.f14363s = pVar;
            }

            public final void a(androidx.compose.ui.e eVar, j0.l lVar, int i10) {
                int i11;
                int i12;
                qc.q.i(eVar, "modifier");
                if ((i10 & 14) == 0) {
                    if (lVar.Q(eVar)) {
                        i12 = 4;
                    } else {
                        i12 = 2;
                    }
                    i11 = i12 | i10;
                } else {
                    i11 = i10;
                }
                if ((i11 & 91) == 18 && lVar.t()) {
                    lVar.z();
                    return;
                }
                if (j0.n.K()) {
                    j0.n.V(1120552650, i10, -1, "androidx.compose.material.CommonDecorationBox.<anonymous>.<anonymous> (TextFieldImpl.kt:137)");
                }
                androidx.compose.ui.e a10 = x0.a.a(eVar, this.f14358f);
                w1 w1Var = this.f14359m;
                boolean z10 = this.f14360p;
                int i13 = this.f14361q;
                int i14 = this.f14362r;
                pc.p<j0.l, Integer, dc.w> pVar = this.f14363s;
                lVar.e(733328855);
                n1.i0 h10 = androidx.compose.foundation.layout.d.h(v0.b.f24258a.n(), false, lVar, 0);
                lVar.e(-1323940314);
                int a11 = j0.j.a(lVar, 0);
                j0.v F = lVar.F();
                g.a aVar = p1.g.f20790l;
                pc.a<p1.g> a12 = aVar.a();
                pc.q<i2<p1.g>, j0.l, Integer, dc.w> a13 = n1.x.a(a10);
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
                l3.b(a14, h10, aVar.e());
                l3.b(a14, F, aVar.g());
                pc.p<p1.g, Integer, dc.w> b10 = aVar.b();
                if (a14.n() || !qc.q.d(a14.f(), Integer.valueOf(a11))) {
                    a14.J(Integer.valueOf(a11));
                    a14.I(Integer.valueOf(a11), b10);
                }
                a13.invoke(i2.a(i2.b(lVar)), lVar, 0);
                lVar.e(2058660585);
                androidx.compose.foundation.layout.e eVar2 = androidx.compose.foundation.layout.e.f2083a;
                a2.b(w1Var.j(z10, lVar, ((i13 >> 27) & 14) | ((i14 >> 6) & 112)).getValue().y(), s0.f15068a.c(lVar, 6).m(), null, pVar, lVar, (i13 >> 6) & 7168, 4);
                lVar.N();
                lVar.O();
                lVar.N();
                lVar.N();
                if (j0.n.K()) {
                    j0.n.U();
                }
            }

            @Override // pc.q
            public /* bridge */ /* synthetic */ dc.w invoke(androidx.compose.ui.e eVar, j0.l lVar, Integer num) {
                a(eVar, lVar, num.intValue());
                return dc.w.f13270a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: TextFieldImpl.kt */
        /* loaded from: classes.dex */
        public static final class f extends qc.r implements pc.p<j0.l, Integer, dc.w> {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ long f14364f;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ pc.p<j0.l, Integer, dc.w> f14365m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            f(long j10, pc.p<? super j0.l, ? super Integer, dc.w> pVar) {
                super(2);
                this.f14364f = j10;
                this.f14365m = pVar;
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
                    j0.n.V(-1894727196, i10, -1, "androidx.compose.material.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (TextFieldImpl.kt:171)");
                }
                a2.b(this.f14364f, null, null, this.f14365m, lVar, 0, 6);
                if (j0.n.K()) {
                    j0.n.U();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: TextFieldImpl.kt */
        /* loaded from: classes.dex */
        public static final class g extends qc.r implements pc.l<t1.x, dc.w> {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ boolean f14366f;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ String f14367m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            g(boolean z10, String str) {
                super(1);
                this.f14366f = z10;
                this.f14367m = str;
            }

            public final void a(t1.x xVar) {
                qc.q.i(xVar, "$this$semantics");
                if (this.f14366f) {
                    t1.v.j(xVar, this.f14367m);
                }
            }

            @Override // pc.l
            public /* bridge */ /* synthetic */ dc.w invoke(t1.x xVar) {
                a(xVar);
                return dc.w.f13270a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: TextFieldImpl.kt */
        /* loaded from: classes.dex */
        public static final class h extends qc.r implements pc.p<j0.l, Integer, dc.w> {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ j0.j1<z0.l> f14368f;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ w.s f14369m;

            /* renamed from: p  reason: collision with root package name */
            final /* synthetic */ pc.p<j0.l, Integer, dc.w> f14370p;

            /* renamed from: q  reason: collision with root package name */
            final /* synthetic */ int f14371q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            h(j0.j1<z0.l> j1Var, w.s sVar, pc.p<? super j0.l, ? super Integer, dc.w> pVar, int i10) {
                super(2);
                this.f14368f = j1Var;
                this.f14369m = sVar;
                this.f14370p = pVar;
                this.f14371q = i10;
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
                    j0.n.V(139886979, i10, -1, "androidx.compose.material.CommonDecorationBox.<anonymous>.<anonymous> (TextFieldImpl.kt:193)");
                }
                androidx.compose.ui.e h10 = a1.h(androidx.compose.ui.layout.a.b(androidx.compose.ui.e.f2335a, "border"), this.f14368f.getValue().m(), this.f14369m);
                pc.p<j0.l, Integer, dc.w> pVar = this.f14370p;
                int i11 = this.f14371q;
                lVar.e(733328855);
                n1.i0 h11 = androidx.compose.foundation.layout.d.h(v0.b.f24258a.n(), true, lVar, 48);
                lVar.e(-1323940314);
                int a10 = j0.j.a(lVar, 0);
                j0.v F = lVar.F();
                g.a aVar = p1.g.f20790l;
                pc.a<p1.g> a11 = aVar.a();
                pc.q<i2<p1.g>, j0.l, Integer, dc.w> a12 = n1.x.a(h10);
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
                l3.b(a13, h11, aVar.e());
                l3.b(a13, F, aVar.g());
                pc.p<p1.g, Integer, dc.w> b10 = aVar.b();
                if (a13.n() || !qc.q.d(a13.f(), Integer.valueOf(a10))) {
                    a13.J(Integer.valueOf(a10));
                    a13.I(Integer.valueOf(a10), b10);
                }
                a12.invoke(i2.a(i2.b(lVar)), lVar, 0);
                lVar.e(2058660585);
                androidx.compose.foundation.layout.e eVar = androidx.compose.foundation.layout.e.f2083a;
                lVar.e(1661576646);
                if (pVar != null) {
                    pVar.invoke(lVar, Integer.valueOf((i11 >> 12) & 14));
                }
                lVar.N();
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
        a(pc.p<? super j0.l, ? super Integer, dc.w> pVar, pc.p<? super j0.l, ? super Integer, dc.w> pVar2, String str, boolean z10, int i10, w1 w1Var, boolean z11, v.k kVar, int i11, pc.p<? super j0.l, ? super Integer, dc.w> pVar3, pc.p<? super j0.l, ? super Integer, dc.w> pVar4, e2 e2Var, pc.p<? super j0.l, ? super Integer, dc.w> pVar5, boolean z12, w.s sVar, boolean z13, pc.p<? super j0.l, ? super Integer, dc.w> pVar6) {
            super(6);
            this.f14334f = pVar;
            this.f14335m = pVar2;
            this.f14336p = str;
            this.f14337q = z10;
            this.f14338r = i10;
            this.f14339s = w1Var;
            this.f14340t = z11;
            this.f14341u = kVar;
            this.f14342v = i11;
            this.f14343w = pVar3;
            this.f14344x = pVar4;
            this.f14345y = e2Var;
            this.f14346z = pVar5;
            this.A = z12;
            this.B = sVar;
            this.C = z13;
            this.D = pVar6;
        }

        /* JADX WARN: Removed duplicated region for block: B:63:0x0117  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x014e  */
        /* JADX WARN: Removed duplicated region for block: B:67:0x0181  */
        /* JADX WARN: Removed duplicated region for block: B:68:0x0190  */
        /* JADX WARN: Removed duplicated region for block: B:71:0x0198  */
        /* JADX WARN: Removed duplicated region for block: B:72:0x01cf  */
        /* JADX WARN: Removed duplicated region for block: B:75:0x0202  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x0210  */
        /* JADX WARN: Removed duplicated region for block: B:79:0x021d  */
        /* JADX WARN: Removed duplicated region for block: B:91:0x02d2  */
        /* JADX WARN: Removed duplicated region for block: B:94:0x0311  */
        /* JADX WARN: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r14v0 */
        /* JADX WARN: Type inference failed for: r14v1, types: [boolean, int] */
        /* JADX WARN: Type inference failed for: r14v4 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void a(float r21, long r22, long r24, float r26, j0.l r27, int r28) {
            /*
                Method dump skipped, instructions count: 789
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: f0.a2.a.a(float, long, long, float, j0.l, int):void");
        }

        @Override // pc.t
        public /* bridge */ /* synthetic */ dc.w t0(Float f10, a1.p1 p1Var, a1.p1 p1Var2, Float f11, j0.l lVar, Integer num) {
            a(f10.floatValue(), p1Var.y(), p1Var2.y(), f11.floatValue(), lVar, num.intValue());
            return dc.w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TextFieldImpl.kt */
    /* loaded from: classes.dex */
    public static final class b extends qc.r implements pc.p<j0.l, Integer, dc.w> {
        final /* synthetic */ w1 A;
        final /* synthetic */ pc.p<j0.l, Integer, dc.w> B;
        final /* synthetic */ int C;
        final /* synthetic */ int D;
        final /* synthetic */ int E;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ e2 f14372f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ String f14373m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ pc.p<j0.l, Integer, dc.w> f14374p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ b2.t0 f14375q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ pc.p<j0.l, Integer, dc.w> f14376r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ pc.p<j0.l, Integer, dc.w> f14377s;

        /* renamed from: t  reason: collision with root package name */
        final /* synthetic */ pc.p<j0.l, Integer, dc.w> f14378t;

        /* renamed from: u  reason: collision with root package name */
        final /* synthetic */ pc.p<j0.l, Integer, dc.w> f14379u;

        /* renamed from: v  reason: collision with root package name */
        final /* synthetic */ boolean f14380v;

        /* renamed from: w  reason: collision with root package name */
        final /* synthetic */ boolean f14381w;

        /* renamed from: x  reason: collision with root package name */
        final /* synthetic */ boolean f14382x;

        /* renamed from: y  reason: collision with root package name */
        final /* synthetic */ v.k f14383y;

        /* renamed from: z  reason: collision with root package name */
        final /* synthetic */ w.s f14384z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(e2 e2Var, String str, pc.p<? super j0.l, ? super Integer, dc.w> pVar, b2.t0 t0Var, pc.p<? super j0.l, ? super Integer, dc.w> pVar2, pc.p<? super j0.l, ? super Integer, dc.w> pVar3, pc.p<? super j0.l, ? super Integer, dc.w> pVar4, pc.p<? super j0.l, ? super Integer, dc.w> pVar5, boolean z10, boolean z11, boolean z12, v.k kVar, w.s sVar, w1 w1Var, pc.p<? super j0.l, ? super Integer, dc.w> pVar6, int i10, int i11, int i12) {
            super(2);
            this.f14372f = e2Var;
            this.f14373m = str;
            this.f14374p = pVar;
            this.f14375q = t0Var;
            this.f14376r = pVar2;
            this.f14377s = pVar3;
            this.f14378t = pVar4;
            this.f14379u = pVar5;
            this.f14380v = z10;
            this.f14381w = z11;
            this.f14382x = z12;
            this.f14383y = kVar;
            this.f14384z = sVar;
            this.A = w1Var;
            this.B = pVar6;
            this.C = i10;
            this.D = i11;
            this.E = i12;
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ dc.w invoke(j0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return dc.w.f13270a;
        }

        public final void invoke(j0.l lVar, int i10) {
            a2.a(this.f14372f, this.f14373m, this.f14374p, this.f14375q, this.f14376r, this.f14377s, this.f14378t, this.f14379u, this.f14380v, this.f14381w, this.f14382x, this.f14383y, this.f14384z, this.A, this.B, lVar, j0.z1.a(this.C | 1), j0.z1.a(this.D), this.E);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TextFieldImpl.kt */
    /* loaded from: classes.dex */
    public static final class c extends qc.r implements pc.q<n0, j0.l, Integer, a1.p1> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ w1 f14385f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ boolean f14386m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ boolean f14387p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ v.k f14388q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ int f14389r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ int f14390s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(w1 w1Var, boolean z10, boolean z11, v.k kVar, int i10, int i11) {
            super(3);
            this.f14385f = w1Var;
            this.f14386m = z10;
            this.f14387p = z11;
            this.f14388q = kVar;
            this.f14389r = i10;
            this.f14390s = i11;
        }

        public final long a(n0 n0Var, j0.l lVar, int i10) {
            boolean z10;
            qc.q.i(n0Var, "it");
            lVar.e(697243846);
            if (j0.n.K()) {
                j0.n.V(697243846, i10, -1, "androidx.compose.material.CommonDecorationBox.<anonymous> (TextFieldImpl.kt:91)");
            }
            w1 w1Var = this.f14385f;
            boolean z11 = this.f14386m;
            if (n0Var == n0.UnfocusedEmpty) {
                z10 = false;
            } else {
                z10 = this.f14387p;
            }
            v.k kVar = this.f14388q;
            int i11 = (this.f14389r >> 27) & 14;
            int i12 = this.f14390s;
            long y10 = w1Var.i(z11, z10, kVar, lVar, i11 | ((i12 << 3) & 896) | (i12 & 7168)).getValue().y();
            if (j0.n.K()) {
                j0.n.U();
            }
            lVar.N();
            return y10;
        }

        @Override // pc.q
        public /* bridge */ /* synthetic */ a1.p1 invoke(n0 n0Var, j0.l lVar, Integer num) {
            return a1.p1.g(a(n0Var, lVar, num.intValue()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TextFieldImpl.kt */
    /* loaded from: classes.dex */
    public static final class d extends qc.r implements pc.p<j0.l, Integer, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ long f14391f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ v1.k0 f14392m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ Float f14393p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ pc.p<j0.l, Integer, dc.w> f14394q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ int f14395r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ int f14396s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(long j10, v1.k0 k0Var, Float f10, pc.p<? super j0.l, ? super Integer, dc.w> pVar, int i10, int i11) {
            super(2);
            this.f14391f = j10;
            this.f14392m = k0Var;
            this.f14393p = f10;
            this.f14394q = pVar;
            this.f14395r = i10;
            this.f14396s = i11;
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ dc.w invoke(j0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return dc.w.f13270a;
        }

        public final void invoke(j0.l lVar, int i10) {
            a2.b(this.f14391f, this.f14392m, this.f14393p, this.f14394q, lVar, j0.z1.a(this.f14395r | 1), this.f14396s);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TextFieldImpl.kt */
    /* loaded from: classes.dex */
    public static final class e extends qc.r implements pc.p<j0.l, Integer, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ long f14397f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ Float f14398m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ pc.p<j0.l, Integer, dc.w> f14399p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ int f14400q;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: TextFieldImpl.kt */
        /* loaded from: classes.dex */
        public static final class a extends qc.r implements pc.p<j0.l, Integer, dc.w> {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ Float f14401f;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ pc.p<j0.l, Integer, dc.w> f14402m;

            /* renamed from: p  reason: collision with root package name */
            final /* synthetic */ int f14403p;

            /* renamed from: q  reason: collision with root package name */
            final /* synthetic */ long f14404q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(Float f10, pc.p<? super j0.l, ? super Integer, dc.w> pVar, int i10, long j10) {
                super(2);
                this.f14401f = f10;
                this.f14402m = pVar;
                this.f14403p = i10;
                this.f14404q = j10;
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
                    j0.n.V(-1132188434, i10, -1, "androidx.compose.material.Decoration.<anonymous>.<anonymous> (TextFieldImpl.kt:240)");
                }
                if (this.f14401f != null) {
                    lVar.e(-452621938);
                    j0.u.a(new j0.w1[]{o.a().c(this.f14401f)}, this.f14402m, lVar, ((this.f14403p >> 6) & 112) | 8);
                    lVar.N();
                } else {
                    lVar.e(-452621758);
                    j0.u.a(new j0.w1[]{o.a().c(Float.valueOf(a1.p1.r(this.f14404q)))}, this.f14402m, lVar, ((this.f14403p >> 6) & 112) | 8);
                    lVar.N();
                }
                if (j0.n.K()) {
                    j0.n.U();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(long j10, Float f10, pc.p<? super j0.l, ? super Integer, dc.w> pVar, int i10) {
            super(2);
            this.f14397f = j10;
            this.f14398m = f10;
            this.f14399p = pVar;
            this.f14400q = i10;
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
                j0.n.V(494684590, i10, -1, "androidx.compose.material.Decoration.<anonymous> (TextFieldImpl.kt:239)");
            }
            j0.u.a(new j0.w1[]{p.a().c(a1.p1.g(this.f14397f))}, q0.c.b(lVar, -1132188434, true, new a(this.f14398m, this.f14399p, this.f14400q, this.f14397f)), lVar, 56);
            if (j0.n.K()) {
                j0.n.U();
            }
        }
    }

    static {
        float f10 = 48;
        f14333d = androidx.compose.foundation.layout.m.a(androidx.compose.ui.e.f2335a, j2.h.j(f10), j2.h.j(f10));
    }

    public static final void a(e2 e2Var, String str, pc.p<? super j0.l, ? super Integer, dc.w> pVar, b2.t0 t0Var, pc.p<? super j0.l, ? super Integer, dc.w> pVar2, pc.p<? super j0.l, ? super Integer, dc.w> pVar3, pc.p<? super j0.l, ? super Integer, dc.w> pVar4, pc.p<? super j0.l, ? super Integer, dc.w> pVar5, boolean z10, boolean z11, boolean z12, v.k kVar, w.s sVar, w1 w1Var, pc.p<? super j0.l, ? super Integer, dc.w> pVar6, j0.l lVar, int i10, int i11, int i12) {
        int i13;
        int i14;
        n0 n0Var;
        j0.l lVar2;
        pc.p<? super j0.l, ? super Integer, dc.w> pVar7;
        pc.p<? super j0.l, ? super Integer, dc.w> pVar8;
        pc.p<? super j0.l, ? super Integer, dc.w> pVar9;
        boolean z13;
        boolean z14;
        boolean z15;
        pc.p<? super j0.l, ? super Integer, dc.w> pVar10;
        qc.q.i(e2Var, TaskFormActivity.TASK_TYPE_KEY);
        qc.q.i(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        qc.q.i(pVar, "innerTextField");
        qc.q.i(t0Var, "visualTransformation");
        qc.q.i(kVar, "interactionSource");
        qc.q.i(sVar, "contentPadding");
        qc.q.i(w1Var, "colors");
        j0.l q10 = lVar.q(-712568069);
        if ((i12 & 1) != 0) {
            i13 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i13 = (q10.Q(e2Var) ? 4 : 2) | i10;
        } else {
            i13 = i10;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i10 & 112) == 0) {
            i13 |= q10.Q(str) ? 32 : 16;
        }
        int i15 = i12 & 4;
        int i16 = UserVerificationMethods.USER_VERIFY_HANDPRINT;
        if (i15 != 0) {
            i13 |= 384;
        } else if ((i10 & 896) == 0) {
            i13 |= q10.l(pVar) ? UserVerificationMethods.USER_VERIFY_HANDPRINT : 128;
        }
        int i17 = i12 & 8;
        int i18 = RecyclerView.m.FLAG_MOVED;
        if (i17 != 0) {
            i13 |= 3072;
        } else if ((i10 & 7168) == 0) {
            i13 |= q10.Q(t0Var) ? RecyclerView.m.FLAG_MOVED : UserVerificationMethods.USER_VERIFY_ALL;
        }
        int i19 = i12 & 16;
        int i20 = Http2.INITIAL_MAX_FRAME_SIZE;
        if (i19 != 0) {
            i13 |= 24576;
        } else if ((57344 & i10) == 0) {
            i13 |= q10.l(pVar2) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        int i21 = i12 & 32;
        if (i21 != 0) {
            i13 |= 196608;
        } else if ((i10 & 458752) == 0) {
            i13 |= q10.l(pVar3) ? 131072 : 65536;
        }
        int i22 = i12 & 64;
        if (i22 != 0) {
            i13 |= 1572864;
        } else if ((i10 & 3670016) == 0) {
            i13 |= q10.l(pVar4) ? 1048576 : 524288;
        }
        int i23 = i12 & 128;
        if (i23 != 0) {
            i13 |= 12582912;
        } else if ((i10 & 29360128) == 0) {
            i13 |= q10.l(pVar5) ? 8388608 : 4194304;
        }
        int i24 = i12 & UserVerificationMethods.USER_VERIFY_HANDPRINT;
        if (i24 != 0) {
            i13 |= 100663296;
        } else if ((i10 & 234881024) == 0) {
            i13 |= q10.c(z10) ? 67108864 : 33554432;
        }
        int i25 = i12 & 512;
        if (i25 != 0) {
            i13 |= 805306368;
        } else if ((i10 & 1879048192) == 0) {
            i13 |= q10.c(z11) ? 536870912 : 268435456;
        }
        int i26 = i12 & UserVerificationMethods.USER_VERIFY_ALL;
        if (i26 != 0) {
            i14 = i11 | 6;
        } else if ((i11 & 14) == 0) {
            i14 = i11 | (q10.c(z12) ? 4 : 2);
        } else {
            i14 = i11;
        }
        if ((i12 & RecyclerView.m.FLAG_MOVED) != 0) {
            i14 |= 48;
        } else if ((i11 & 112) == 0) {
            i14 |= q10.Q(kVar) ? 32 : 16;
        }
        int i27 = i14;
        if ((i12 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0) {
            i27 |= 384;
        } else if ((i11 & 896) == 0) {
            if (!q10.Q(sVar)) {
                i16 = 128;
            }
            i27 |= i16;
        }
        if ((i12 & 8192) != 0) {
            i27 |= 3072;
        } else if ((i11 & 7168) == 0) {
            if (!q10.Q(w1Var)) {
                i18 = UserVerificationMethods.USER_VERIFY_ALL;
            }
            i27 |= i18;
        }
        int i28 = i12 & Http2.INITIAL_MAX_FRAME_SIZE;
        if (i28 != 0) {
            i27 |= 24576;
        } else if ((i11 & 57344) == 0) {
            if (!q10.l(pVar6)) {
                i20 = 8192;
            }
            i27 |= i20;
        }
        if ((i13 & 1533916891) == 306783378 && (46811 & i27) == 9362 && q10.t()) {
            q10.z();
            pVar7 = pVar3;
            pVar8 = pVar4;
            pVar9 = pVar5;
            z13 = z10;
            z14 = z11;
            z15 = z12;
            pVar10 = pVar6;
            lVar2 = q10;
        } else {
            pc.p<? super j0.l, ? super Integer, dc.w> pVar11 = i21 != 0 ? null : pVar3;
            pc.p<? super j0.l, ? super Integer, dc.w> pVar12 = i22 != 0 ? null : pVar4;
            pc.p<? super j0.l, ? super Integer, dc.w> pVar13 = i23 != 0 ? null : pVar5;
            boolean z16 = i24 != 0 ? false : z10;
            boolean z17 = i25 != 0 ? true : z11;
            boolean z18 = i26 != 0 ? false : z12;
            pc.p<? super j0.l, ? super Integer, dc.w> pVar14 = i28 != 0 ? null : pVar6;
            if (j0.n.K()) {
                j0.n.V(-712568069, i13, i27, "androidx.compose.material.CommonDecorationBox (TextFieldImpl.kt:63)");
            }
            q10.e(511388516);
            boolean Q = q10.Q(str) | q10.Q(t0Var);
            Object f10 = q10.f();
            if (Q || f10 == j0.l.f18688a.a()) {
                f10 = t0Var.a(new v1.d(str, null, null, 6, null));
                q10.J(f10);
            }
            q10.N();
            String i29 = ((b2.s0) f10).b().i();
            if (v.f.a(kVar, q10, (i27 >> 3) & 14).getValue().booleanValue()) {
                n0Var = n0.Focused;
            } else {
                n0Var = i29.length() == 0 ? n0.UnfocusedEmpty : n0.UnfocusedNotEmpty;
            }
            n0 n0Var2 = n0Var;
            int i30 = i13;
            c cVar = new c(w1Var, z17, z18, kVar, i30, i27);
            s0 s0Var = s0.f15068a;
            g2 c10 = s0Var.c(q10, 6);
            v1.k0 m10 = c10.m();
            v1.k0 e10 = c10.e();
            long h10 = m10.h();
            p1.a aVar = a1.p1.f146b;
            boolean z19 = (a1.p1.q(h10, aVar.e()) && !a1.p1.q(e10.h(), aVar.e())) || (!a1.p1.q(m10.h(), aVar.e()) && a1.p1.q(e10.h(), aVar.e()));
            d2 d2Var = d2.f14548a;
            q10.e(2129141006);
            long h11 = s0Var.c(q10, 6).e().h();
            if (z19) {
                if (!(h11 != aVar.e())) {
                    h11 = cVar.invoke(n0Var2, q10, 0).y();
                }
            }
            long j10 = h11;
            q10.N();
            q10.e(2129141197);
            long h12 = s0Var.c(q10, 6).m().h();
            if (z19) {
                if (!(h12 != aVar.e())) {
                    h12 = cVar.invoke(n0Var2, q10, 0).y();
                }
            }
            long j11 = h12;
            q10.N();
            lVar2 = q10;
            d2Var.a(n0Var2, j10, j11, cVar, pVar2 != null, q0.c.b(lVar2, 341865432, true, new a(pVar2, pVar11, i29, z18, i27, w1Var, z17, kVar, i30, pVar12, pVar13, e2Var, pVar, z16, sVar, z19, pVar14)), lVar2, 1769472);
            if (j0.n.K()) {
                j0.n.U();
            }
            pVar7 = pVar11;
            pVar8 = pVar12;
            pVar9 = pVar13;
            z13 = z16;
            z14 = z17;
            z15 = z18;
            pVar10 = pVar14;
        }
        j0.g2 w10 = lVar2.w();
        if (w10 == null) {
            return;
        }
        w10.a(new b(e2Var, str, pVar, t0Var, pVar2, pVar7, pVar8, pVar9, z13, z14, z15, kVar, sVar, w1Var, pVar10, i10, i11, i12));
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(long r15, v1.k0 r17, java.lang.Float r18, pc.p<? super j0.l, ? super java.lang.Integer, dc.w> r19, j0.l r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.a2.b(long, v1.k0, java.lang.Float, pc.p, j0.l, int, int):void");
    }

    public static final float c() {
        return f14332c;
    }

    public static final androidx.compose.ui.e d() {
        return f14333d;
    }

    public static final Object e(n1.m mVar) {
        n1.v vVar;
        qc.q.i(mVar, "<this>");
        Object A = mVar.A();
        if (A instanceof n1.v) {
            vVar = (n1.v) A;
        } else {
            vVar = null;
        }
        if (vVar == null) {
            return null;
        }
        return vVar.L();
    }

    public static final float f() {
        return f14331b;
    }

    public static final long g() {
        return f14330a;
    }

    public static final int h(n1.y0 y0Var) {
        if (y0Var != null) {
            return y0Var.l0();
        }
        return 0;
    }

    public static final int i(n1.y0 y0Var) {
        if (y0Var != null) {
            return y0Var.A0();
        }
        return 0;
    }
}
