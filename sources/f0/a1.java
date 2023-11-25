package f0;

import androidx.compose.ui.e;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import j0.i2;
import j0.l3;
import n1.y0;
import okhttp3.internal.http2.Http2;
import p1.g;
import v0.b;

/* compiled from: OutlinedTextField.kt */
/* loaded from: classes.dex */
public final class a1 {

    /* renamed from: a  reason: collision with root package name */
    private static final float f14312a = j2.h.j(4);

    /* renamed from: b  reason: collision with root package name */
    private static final float f14313b = j2.h.j(8);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OutlinedTextField.kt */
    /* loaded from: classes.dex */
    public static final class a extends qc.r implements pc.p<j0.l, Integer, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f14314f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ pc.p<j0.l, Integer, dc.w> f14315m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ pc.q<androidx.compose.ui.e, j0.l, Integer, dc.w> f14316p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ pc.p<j0.l, Integer, dc.w> f14317q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ pc.p<j0.l, Integer, dc.w> f14318r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ pc.p<j0.l, Integer, dc.w> f14319s;

        /* renamed from: t  reason: collision with root package name */
        final /* synthetic */ boolean f14320t;

        /* renamed from: u  reason: collision with root package name */
        final /* synthetic */ float f14321u;

        /* renamed from: v  reason: collision with root package name */
        final /* synthetic */ pc.l<z0.l, dc.w> f14322v;

        /* renamed from: w  reason: collision with root package name */
        final /* synthetic */ pc.p<j0.l, Integer, dc.w> f14323w;

        /* renamed from: x  reason: collision with root package name */
        final /* synthetic */ w.s f14324x;

        /* renamed from: y  reason: collision with root package name */
        final /* synthetic */ int f14325y;

        /* renamed from: z  reason: collision with root package name */
        final /* synthetic */ int f14326z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(androidx.compose.ui.e eVar, pc.p<? super j0.l, ? super Integer, dc.w> pVar, pc.q<? super androidx.compose.ui.e, ? super j0.l, ? super Integer, dc.w> qVar, pc.p<? super j0.l, ? super Integer, dc.w> pVar2, pc.p<? super j0.l, ? super Integer, dc.w> pVar3, pc.p<? super j0.l, ? super Integer, dc.w> pVar4, boolean z10, float f10, pc.l<? super z0.l, dc.w> lVar, pc.p<? super j0.l, ? super Integer, dc.w> pVar5, w.s sVar, int i10, int i11) {
            super(2);
            this.f14314f = eVar;
            this.f14315m = pVar;
            this.f14316p = qVar;
            this.f14317q = pVar2;
            this.f14318r = pVar3;
            this.f14319s = pVar4;
            this.f14320t = z10;
            this.f14321u = f10;
            this.f14322v = lVar;
            this.f14323w = pVar5;
            this.f14324x = sVar;
            this.f14325y = i10;
            this.f14326z = i11;
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ dc.w invoke(j0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return dc.w.f13270a;
        }

        public final void invoke(j0.l lVar, int i10) {
            a1.a(this.f14314f, this.f14315m, this.f14316p, this.f14317q, this.f14318r, this.f14319s, this.f14320t, this.f14321u, this.f14322v, this.f14323w, this.f14324x, lVar, j0.z1.a(this.f14325y | 1), j0.z1.a(this.f14326z));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OutlinedTextField.kt */
    /* loaded from: classes.dex */
    public static final class b extends qc.r implements pc.l<c1.c, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ long f14327f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ w.s f14328m;

        /* compiled from: OutlinedTextField.kt */
        /* loaded from: classes.dex */
        public /* synthetic */ class a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f14329a;

            static {
                int[] iArr = new int[j2.r.values().length];
                try {
                    iArr[j2.r.Rtl.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                f14329a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(long j10, w.s sVar) {
            super(1);
            this.f14327f = j10;
            this.f14328m = sVar;
        }

        public final void a(c1.c cVar) {
            float c10;
            float c11;
            qc.q.i(cVar, "$this$drawWithContent");
            float i10 = z0.l.i(this.f14327f);
            if (i10 > 0.0f) {
                float v02 = cVar.v0(a1.f14312a);
                float v03 = cVar.v0(this.f14328m.c(cVar.getLayoutDirection())) - v02;
                float f10 = 2;
                float f11 = i10 + v03 + (v02 * f10);
                j2.r layoutDirection = cVar.getLayoutDirection();
                int[] iArr = a.f14329a;
                if (iArr[layoutDirection.ordinal()] != 1) {
                    c10 = vc.l.c(v03, 0.0f);
                } else {
                    c10 = z0.l.i(cVar.b()) - f11;
                }
                float f12 = c10;
                if (iArr[cVar.getLayoutDirection().ordinal()] == 1) {
                    float i11 = z0.l.i(cVar.b());
                    c11 = vc.l.c(v03, 0.0f);
                    f11 = i11 - c11;
                }
                float f13 = f11;
                float g10 = z0.l.g(this.f14327f);
                float f14 = (-g10) / f10;
                float f15 = g10 / f10;
                int a10 = a1.o1.f133a.a();
                c1.d y02 = cVar.y0();
                long b10 = y02.b();
                y02.d().k();
                y02.a().a(f12, f14, f13, f15, a10);
                cVar.d1();
                y02.d().p();
                y02.c(b10);
                return;
            }
            cVar.d1();
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ dc.w invoke(c1.c cVar) {
            a(cVar);
            return dc.w.f13270a;
        }
    }

    public static final void a(androidx.compose.ui.e eVar, pc.p<? super j0.l, ? super Integer, dc.w> pVar, pc.q<? super androidx.compose.ui.e, ? super j0.l, ? super Integer, dc.w> qVar, pc.p<? super j0.l, ? super Integer, dc.w> pVar2, pc.p<? super j0.l, ? super Integer, dc.w> pVar3, pc.p<? super j0.l, ? super Integer, dc.w> pVar4, boolean z10, float f10, pc.l<? super z0.l, dc.w> lVar, pc.p<? super j0.l, ? super Integer, dc.w> pVar5, w.s sVar, j0.l lVar2, int i10, int i11) {
        int i12;
        float c10;
        float c11;
        qc.q.i(eVar, "modifier");
        qc.q.i(pVar, "textField");
        qc.q.i(lVar, "onLabelMeasured");
        qc.q.i(pVar5, "border");
        qc.q.i(sVar, "paddingValues");
        j0.l q10 = lVar2.q(-2049536174);
        int i13 = (i10 & 14) == 0 ? (q10.Q(eVar) ? 4 : 2) | i10 : i10;
        if ((i10 & 112) == 0) {
            i13 |= q10.l(pVar) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i13 |= q10.l(qVar) ? UserVerificationMethods.USER_VERIFY_HANDPRINT : 128;
        }
        if ((i10 & 7168) == 0) {
            i13 |= q10.l(pVar2) ? RecyclerView.m.FLAG_MOVED : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((57344 & i10) == 0) {
            i13 |= q10.l(pVar3) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((458752 & i10) == 0) {
            i13 |= q10.l(pVar4) ? 131072 : 65536;
        }
        if ((3670016 & i10) == 0) {
            i13 |= q10.c(z10) ? 1048576 : 524288;
        }
        if ((29360128 & i10) == 0) {
            i13 |= q10.g(f10) ? 8388608 : 4194304;
        }
        if ((234881024 & i10) == 0) {
            i13 |= q10.l(lVar) ? 67108864 : 33554432;
        }
        if ((1879048192 & i10) == 0) {
            i13 |= q10.l(pVar5) ? 536870912 : 268435456;
        }
        int i14 = (i11 & 14) == 0 ? i11 | (q10.Q(sVar) ? 4 : 2) : i11;
        if ((i13 & 1533916891) == 306783378 && (i14 & 11) == 2 && q10.t()) {
            q10.z();
        } else {
            if (j0.n.K()) {
                j0.n.V(-2049536174, i13, i14, "androidx.compose.material.OutlinedTextFieldLayout (OutlinedTextField.kt:476)");
            }
            Object[] objArr = {lVar, Boolean.valueOf(z10), Float.valueOf(f10), sVar};
            q10.e(-568225417);
            int i15 = 0;
            boolean z11 = false;
            for (int i16 = 4; i15 < i16; i16 = 4) {
                z11 |= q10.Q(objArr[i15]);
                i15++;
            }
            Object f11 = q10.f();
            if (z11 || f11 == j0.l.f18688a.a()) {
                f11 = new b1(lVar, z10, f10, sVar);
                q10.J(f11);
            }
            q10.N();
            b1 b1Var = (b1) f11;
            j2.r rVar = (j2.r) q10.C(androidx.compose.ui.platform.z0.j());
            q10.e(-1323940314);
            int a10 = j0.j.a(q10, 0);
            j0.v F = q10.F();
            g.a aVar = p1.g.f20790l;
            pc.a<p1.g> a11 = aVar.a();
            pc.q<i2<p1.g>, j0.l, Integer, dc.w> a12 = n1.x.a(eVar);
            int i17 = ((((i13 << 3) & 112) << 9) & 7168) | 6;
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
            l3.b(a13, b1Var, aVar.e());
            l3.b(a13, F, aVar.g());
            pc.p<p1.g, Integer, dc.w> b10 = aVar.b();
            if (a13.n() || !qc.q.d(a13.f(), Integer.valueOf(a10))) {
                a13.J(Integer.valueOf(a10));
                a13.I(Integer.valueOf(a10), b10);
            }
            a12.invoke(i2.a(i2.b(q10)), q10, Integer.valueOf((i17 >> 3) & 112));
            q10.e(2058660585);
            pVar5.invoke(q10, Integer.valueOf((i13 >> 27) & 14));
            q10.e(1169918076);
            if (pVar3 != null) {
                androidx.compose.ui.e a14 = androidx.compose.ui.layout.a.b(androidx.compose.ui.e.f2335a, "Leading").a(a2.d());
                v0.b d10 = v0.b.f24258a.d();
                q10.e(733328855);
                n1.i0 h10 = androidx.compose.foundation.layout.d.h(d10, false, q10, 6);
                q10.e(-1323940314);
                int a15 = j0.j.a(q10, 0);
                j0.v F2 = q10.F();
                pc.a<p1.g> a16 = aVar.a();
                pc.q<i2<p1.g>, j0.l, Integer, dc.w> a17 = n1.x.a(a14);
                if (!(q10.u() instanceof j0.f)) {
                    j0.j.c();
                }
                q10.s();
                if (q10.n()) {
                    q10.B(a16);
                } else {
                    q10.H();
                }
                j0.l a18 = l3.a(q10);
                l3.b(a18, h10, aVar.e());
                l3.b(a18, F2, aVar.g());
                pc.p<p1.g, Integer, dc.w> b11 = aVar.b();
                if (a18.n() || !qc.q.d(a18.f(), Integer.valueOf(a15))) {
                    a18.J(Integer.valueOf(a15));
                    a18.I(Integer.valueOf(a15), b11);
                }
                a17.invoke(i2.a(i2.b(q10)), q10, 0);
                q10.e(2058660585);
                androidx.compose.foundation.layout.e eVar2 = androidx.compose.foundation.layout.e.f2083a;
                pVar3.invoke(q10, Integer.valueOf((i13 >> 12) & 14));
                q10.N();
                q10.O();
                q10.N();
                q10.N();
            }
            q10.N();
            q10.e(1169918361);
            if (pVar4 != null) {
                androidx.compose.ui.e a19 = androidx.compose.ui.layout.a.b(androidx.compose.ui.e.f2335a, "Trailing").a(a2.d());
                v0.b d11 = v0.b.f24258a.d();
                q10.e(733328855);
                n1.i0 h11 = androidx.compose.foundation.layout.d.h(d11, false, q10, 6);
                q10.e(-1323940314);
                int a20 = j0.j.a(q10, 0);
                j0.v F3 = q10.F();
                pc.a<p1.g> a21 = aVar.a();
                pc.q<i2<p1.g>, j0.l, Integer, dc.w> a22 = n1.x.a(a19);
                if (!(q10.u() instanceof j0.f)) {
                    j0.j.c();
                }
                q10.s();
                if (q10.n()) {
                    q10.B(a21);
                } else {
                    q10.H();
                }
                j0.l a23 = l3.a(q10);
                l3.b(a23, h11, aVar.e());
                l3.b(a23, F3, aVar.g());
                pc.p<p1.g, Integer, dc.w> b12 = aVar.b();
                if (a23.n() || !qc.q.d(a23.f(), Integer.valueOf(a20))) {
                    a23.J(Integer.valueOf(a20));
                    a23.I(Integer.valueOf(a20), b12);
                }
                a22.invoke(i2.a(i2.b(q10)), q10, 0);
                q10.e(2058660585);
                androidx.compose.foundation.layout.e eVar3 = androidx.compose.foundation.layout.e.f2083a;
                pVar4.invoke(q10, Integer.valueOf((i13 >> 15) & 14));
                q10.N();
                q10.O();
                q10.N();
                q10.N();
            }
            q10.N();
            float g10 = androidx.compose.foundation.layout.j.g(sVar, rVar);
            float f12 = androidx.compose.foundation.layout.j.f(sVar, rVar);
            e.a aVar2 = androidx.compose.ui.e.f2335a;
            if (pVar3 != null) {
                i12 = 0;
                c11 = vc.l.c(j2.h.j(g10 - a2.c()), j2.h.j(0));
                g10 = j2.h.j(c11);
            } else {
                i12 = 0;
            }
            float f13 = g10;
            if (pVar4 != null) {
                c10 = vc.l.c(j2.h.j(f12 - a2.c()), j2.h.j(i12));
                f12 = j2.h.j(c10);
            }
            androidx.compose.ui.e m10 = androidx.compose.foundation.layout.j.m(aVar2, f13, 0.0f, f12, 0.0f, 10, null);
            q10.e(1169919372);
            if (qVar != null) {
                qVar.invoke(androidx.compose.ui.layout.a.b(aVar2, "Hint").a(m10), q10, Integer.valueOf((i13 >> 3) & 112));
            }
            q10.N();
            androidx.compose.ui.e a24 = androidx.compose.ui.layout.a.b(aVar2, "TextField").a(m10);
            q10.e(733328855);
            b.a aVar3 = v0.b.f24258a;
            n1.i0 h12 = androidx.compose.foundation.layout.d.h(aVar3.n(), true, q10, 48);
            q10.e(-1323940314);
            int a25 = j0.j.a(q10, 0);
            j0.v F4 = q10.F();
            pc.a<p1.g> a26 = aVar.a();
            pc.q<i2<p1.g>, j0.l, Integer, dc.w> a27 = n1.x.a(a24);
            if (!(q10.u() instanceof j0.f)) {
                j0.j.c();
            }
            q10.s();
            if (q10.n()) {
                q10.B(a26);
            } else {
                q10.H();
            }
            j0.l a28 = l3.a(q10);
            l3.b(a28, h12, aVar.e());
            l3.b(a28, F4, aVar.g());
            pc.p<p1.g, Integer, dc.w> b13 = aVar.b();
            if (a28.n() || !qc.q.d(a28.f(), Integer.valueOf(a25))) {
                a28.J(Integer.valueOf(a25));
                a28.I(Integer.valueOf(a25), b13);
            }
            a27.invoke(i2.a(i2.b(q10)), q10, 0);
            q10.e(2058660585);
            androidx.compose.foundation.layout.e eVar4 = androidx.compose.foundation.layout.e.f2083a;
            pVar.invoke(q10, Integer.valueOf((i13 >> 3) & 14));
            q10.N();
            q10.O();
            q10.N();
            q10.N();
            q10.e(-614207951);
            if (pVar2 != null) {
                androidx.compose.ui.e b14 = androidx.compose.ui.layout.a.b(aVar2, "Label");
                q10.e(733328855);
                n1.i0 h13 = androidx.compose.foundation.layout.d.h(aVar3.n(), false, q10, 0);
                q10.e(-1323940314);
                int a29 = j0.j.a(q10, 0);
                j0.v F5 = q10.F();
                pc.a<p1.g> a30 = aVar.a();
                pc.q<i2<p1.g>, j0.l, Integer, dc.w> a31 = n1.x.a(b14);
                if (!(q10.u() instanceof j0.f)) {
                    j0.j.c();
                }
                q10.s();
                if (q10.n()) {
                    q10.B(a30);
                } else {
                    q10.H();
                }
                j0.l a32 = l3.a(q10);
                l3.b(a32, h13, aVar.e());
                l3.b(a32, F5, aVar.g());
                pc.p<p1.g, Integer, dc.w> b15 = aVar.b();
                if (a32.n() || !qc.q.d(a32.f(), Integer.valueOf(a29))) {
                    a32.J(Integer.valueOf(a29));
                    a32.I(Integer.valueOf(a29), b15);
                }
                a31.invoke(i2.a(i2.b(q10)), q10, 0);
                q10.e(2058660585);
                pVar2.invoke(q10, Integer.valueOf((i13 >> 9) & 14));
                q10.N();
                q10.O();
                q10.N();
                q10.N();
            }
            q10.N();
            q10.N();
            q10.O();
            q10.N();
            if (j0.n.K()) {
                j0.n.U();
            }
        }
        j0.g2 w10 = q10.w();
        if (w10 == null) {
            return;
        }
        w10.a(new a(eVar, pVar, qVar, pVar2, pVar3, pVar4, z10, f10, lVar, pVar5, sVar, i10, i11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int f(int i10, int i11, int i12, int i13, int i14, float f10, long j10, float f11, w.s sVar) {
        int d10;
        int max = Math.max(i12, Math.max(i14, k2.a.b(i13, 0, f10)));
        float d11 = sVar.d() * f11;
        float a10 = k2.a.a(d11, Math.max(d11, i13 / 2.0f), f10) + max + (sVar.a() * f11);
        int o10 = j2.b.o(j10);
        d10 = sc.c.d(a10);
        return Math.max(o10, Math.max(i10, Math.max(i11, d10)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int g(int i10, int i11, int i12, int i13, int i14, float f10, long j10, float f11, w.s sVar) {
        int d10;
        int max = i10 + Math.max(i12, Math.max(k2.a.b(i13, 0, f10), i14)) + i11;
        j2.r rVar = j2.r.Ltr;
        d10 = sc.c.d((i13 + (j2.h.j(sVar.c(rVar) + sVar.b(rVar)) * f11)) * f10);
        return Math.max(max, Math.max(d10, j2.b.p(j10)));
    }

    public static final androidx.compose.ui.e h(androidx.compose.ui.e eVar, long j10, w.s sVar) {
        qc.q.i(eVar, "$this$outlineCutout");
        qc.q.i(sVar, "paddingValues");
        return androidx.compose.ui.draw.b.d(eVar, new b(j10, sVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(y0.a aVar, int i10, int i11, n1.y0 y0Var, n1.y0 y0Var2, n1.y0 y0Var3, n1.y0 y0Var4, n1.y0 y0Var5, n1.y0 y0Var6, float f10, boolean z10, float f11, j2.r rVar, w.s sVar) {
        int d10;
        int d11;
        int d12;
        d10 = sc.c.d(sVar.d() * f11);
        d11 = sc.c.d(androidx.compose.foundation.layout.j.g(sVar, rVar) * f11);
        float c10 = a2.c() * f11;
        if (y0Var != null) {
            y0.a.r(aVar, y0Var, 0, v0.b.f24258a.h().a(y0Var.l0(), i10), 0.0f, 4, null);
        }
        if (y0Var2 != null) {
            y0.a.r(aVar, y0Var2, i11 - y0Var2.A0(), v0.b.f24258a.h().a(y0Var2.l0(), i10), 0.0f, 4, null);
        }
        if (y0Var4 != null) {
            int b10 = k2.a.b(z10 ? v0.b.f24258a.h().a(y0Var4.l0(), i10) : d10, -(y0Var4.l0() / 2), f10);
            d12 = sc.c.d(y0Var == null ? 0.0f : (a2.i(y0Var) - c10) * (1 - f10));
            y0.a.r(aVar, y0Var4, d12 + d11, b10, 0.0f, 4, null);
        }
        y0.a.r(aVar, y0Var3, a2.i(y0Var), Math.max(z10 ? v0.b.f24258a.h().a(y0Var3.l0(), i10) : d10, a2.h(y0Var4) / 2), 0.0f, 4, null);
        if (y0Var5 != null) {
            if (z10) {
                d10 = v0.b.f24258a.h().a(y0Var5.l0(), i10);
            }
            y0.a.r(aVar, y0Var5, a2.i(y0Var), Math.max(d10, a2.h(y0Var4) / 2), 0.0f, 4, null);
        }
        y0.a.p(aVar, y0Var6, j2.l.f18992b.a(), 0.0f, 2, null);
    }
}
