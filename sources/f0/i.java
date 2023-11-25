package f0;

import a1.q4;
import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import j0.g3;
import j0.i2;
import j0.l3;
import p1.g;
import v0.b;
import w.a;

/* compiled from: Button.kt */
/* loaded from: classes.dex */
public final class i {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Button.kt */
    /* loaded from: classes.dex */
    public static final class a extends qc.r implements pc.l<t1.x, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        public static final a f14774f = new a();

        a() {
            super(1);
        }

        public final void a(t1.x xVar) {
            qc.q.i(xVar, "$this$semantics");
            t1.v.R(xVar, t1.i.f23425b.a());
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ dc.w invoke(t1.x xVar) {
            a(xVar);
            return dc.w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Button.kt */
    /* loaded from: classes.dex */
    public static final class b extends qc.r implements pc.p<j0.l, Integer, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ g3<a1.p1> f14775f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ w.s f14776m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ pc.q<w.a0, j0.l, Integer, dc.w> f14777p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ int f14778q;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Button.kt */
        /* loaded from: classes.dex */
        public static final class a extends qc.r implements pc.p<j0.l, Integer, dc.w> {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ w.s f14779f;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ pc.q<w.a0, j0.l, Integer, dc.w> f14780m;

            /* renamed from: p  reason: collision with root package name */
            final /* synthetic */ int f14781p;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: Button.kt */
            /* renamed from: f0.i$b$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0350a extends qc.r implements pc.p<j0.l, Integer, dc.w> {

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ w.s f14782f;

                /* renamed from: m  reason: collision with root package name */
                final /* synthetic */ pc.q<w.a0, j0.l, Integer, dc.w> f14783m;

                /* renamed from: p  reason: collision with root package name */
                final /* synthetic */ int f14784p;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C0350a(w.s sVar, pc.q<? super w.a0, ? super j0.l, ? super Integer, dc.w> qVar, int i10) {
                    super(2);
                    this.f14782f = sVar;
                    this.f14783m = qVar;
                    this.f14784p = i10;
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
                        j0.n.V(-630330208, i10, -1, "androidx.compose.material.Button.<anonymous>.<anonymous>.<anonymous> (Button.kt:120)");
                    }
                    e.a aVar = androidx.compose.ui.e.f2335a;
                    g gVar = g.f14733a;
                    androidx.compose.ui.e h10 = androidx.compose.foundation.layout.j.h(androidx.compose.foundation.layout.m.a(aVar, gVar.e(), gVar.d()), this.f14782f);
                    a.e b10 = w.a.f25135a.b();
                    b.c h11 = v0.b.f24258a.h();
                    pc.q<w.a0, j0.l, Integer, dc.w> qVar = this.f14783m;
                    int i11 = ((this.f14784p >> 18) & 7168) | 432;
                    lVar.e(693286680);
                    int i12 = i11 >> 3;
                    n1.i0 a10 = w.y.a(b10, h11, lVar, (i12 & 112) | (i12 & 14));
                    lVar.e(-1323940314);
                    int a11 = j0.j.a(lVar, 0);
                    j0.v F = lVar.F();
                    g.a aVar2 = p1.g.f20790l;
                    pc.a<p1.g> a12 = aVar2.a();
                    pc.q<i2<p1.g>, j0.l, Integer, dc.w> a13 = n1.x.a(h10);
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
                    l3.b(a14, a10, aVar2.e());
                    l3.b(a14, F, aVar2.g());
                    pc.p<p1.g, Integer, dc.w> b11 = aVar2.b();
                    if (a14.n() || !qc.q.d(a14.f(), Integer.valueOf(a11))) {
                        a14.J(Integer.valueOf(a11));
                        a14.I(Integer.valueOf(a11), b11);
                    }
                    a13.invoke(i2.a(i2.b(lVar)), lVar, Integer.valueOf((i13 >> 3) & 112));
                    lVar.e(2058660585);
                    qVar.invoke(w.b0.f25155a, lVar, Integer.valueOf(((i11 >> 6) & 112) | 6));
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
            a(w.s sVar, pc.q<? super w.a0, ? super j0.l, ? super Integer, dc.w> qVar, int i10) {
                super(2);
                this.f14779f = sVar;
                this.f14780m = qVar;
                this.f14781p = i10;
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
                    j0.n.V(-1699085201, i10, -1, "androidx.compose.material.Button.<anonymous>.<anonymous> (Button.kt:117)");
                }
                f2.a(s0.f15068a.c(lVar, 6).d(), q0.c.b(lVar, -630330208, true, new C0350a(this.f14779f, this.f14780m, this.f14781p)), lVar, 48);
                if (j0.n.K()) {
                    j0.n.U();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(g3<a1.p1> g3Var, w.s sVar, pc.q<? super w.a0, ? super j0.l, ? super Integer, dc.w> qVar, int i10) {
            super(2);
            this.f14775f = g3Var;
            this.f14776m = sVar;
            this.f14777p = qVar;
            this.f14778q = i10;
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
                j0.n.V(7524271, i10, -1, "androidx.compose.material.Button.<anonymous> (Button.kt:116)");
            }
            j0.u.a(new j0.w1[]{o.a().c(Float.valueOf(a1.p1.r(i.b(this.f14775f))))}, q0.c.b(lVar, -1699085201, true, new a(this.f14776m, this.f14777p, this.f14778q)), lVar, 56);
            if (j0.n.K()) {
                j0.n.U();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Button.kt */
    /* loaded from: classes.dex */
    public static final class c extends qc.r implements pc.p<j0.l, Integer, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ pc.a<dc.w> f14785f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f14786m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ boolean f14787p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ v.m f14788q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ h f14789r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ q4 f14790s;

        /* renamed from: t  reason: collision with root package name */
        final /* synthetic */ t.g f14791t;

        /* renamed from: u  reason: collision with root package name */
        final /* synthetic */ f f14792u;

        /* renamed from: v  reason: collision with root package name */
        final /* synthetic */ w.s f14793v;

        /* renamed from: w  reason: collision with root package name */
        final /* synthetic */ pc.q<w.a0, j0.l, Integer, dc.w> f14794w;

        /* renamed from: x  reason: collision with root package name */
        final /* synthetic */ int f14795x;

        /* renamed from: y  reason: collision with root package name */
        final /* synthetic */ int f14796y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(pc.a<dc.w> aVar, androidx.compose.ui.e eVar, boolean z10, v.m mVar, h hVar, q4 q4Var, t.g gVar, f fVar, w.s sVar, pc.q<? super w.a0, ? super j0.l, ? super Integer, dc.w> qVar, int i10, int i11) {
            super(2);
            this.f14785f = aVar;
            this.f14786m = eVar;
            this.f14787p = z10;
            this.f14788q = mVar;
            this.f14789r = hVar;
            this.f14790s = q4Var;
            this.f14791t = gVar;
            this.f14792u = fVar;
            this.f14793v = sVar;
            this.f14794w = qVar;
            this.f14795x = i10;
            this.f14796y = i11;
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ dc.w invoke(j0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return dc.w.f13270a;
        }

        public final void invoke(j0.l lVar, int i10) {
            i.a(this.f14785f, this.f14786m, this.f14787p, this.f14788q, this.f14789r, this.f14790s, this.f14791t, this.f14792u, this.f14793v, this.f14794w, lVar, j0.z1.a(this.f14795x | 1), this.f14796y);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:181:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0106  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(pc.a<dc.w> r36, androidx.compose.ui.e r37, boolean r38, v.m r39, f0.h r40, a1.q4 r41, t.g r42, f0.f r43, w.s r44, pc.q<? super w.a0, ? super j0.l, ? super java.lang.Integer, dc.w> r45, j0.l r46, int r47, int r48) {
        /*
            Method dump skipped, instructions count: 846
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.i.a(pc.a, androidx.compose.ui.e, boolean, v.m, f0.h, a1.q4, t.g, f0.f, w.s, pc.q, j0.l, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long b(g3<a1.p1> g3Var) {
        return g3Var.getValue().y();
    }

    public static final void c(pc.a<dc.w> aVar, androidx.compose.ui.e eVar, boolean z10, v.m mVar, h hVar, q4 q4Var, t.g gVar, f fVar, w.s sVar, pc.q<? super w.a0, ? super j0.l, ? super Integer, dc.w> qVar, j0.l lVar, int i10, int i11) {
        e.a aVar2;
        boolean z11;
        v.m mVar2;
        h hVar2;
        b0.a aVar3;
        t.g gVar2;
        f fVar2;
        w.s sVar2;
        qc.q.i(aVar, "onClick");
        qc.q.i(qVar, "content");
        lVar.e(-1776134358);
        if ((i11 & 2) != 0) {
            aVar2 = androidx.compose.ui.e.f2335a;
        } else {
            aVar2 = eVar;
        }
        if ((i11 & 4) != 0) {
            z11 = true;
        } else {
            z11 = z10;
        }
        if ((i11 & 8) != 0) {
            lVar.e(-492369756);
            Object f10 = lVar.f();
            if (f10 == j0.l.f18688a.a()) {
                f10 = v.l.a();
                lVar.J(f10);
            }
            lVar.N();
            mVar2 = (v.m) f10;
        } else {
            mVar2 = mVar;
        }
        if ((i11 & 16) != 0) {
            hVar2 = null;
        } else {
            hVar2 = hVar;
        }
        if ((i11 & 32) != 0) {
            aVar3 = s0.f15068a.b(lVar, 6).c();
        } else {
            aVar3 = q4Var;
        }
        if ((i11 & 64) != 0) {
            gVar2 = g.f14733a.f(lVar, 6);
        } else {
            gVar2 = gVar;
        }
        if ((i11 & 128) != 0) {
            fVar2 = g.f14733a.h(0L, 0L, 0L, lVar, 3072, 7);
        } else {
            fVar2 = fVar;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0) {
            sVar2 = g.f14733a.c();
        } else {
            sVar2 = sVar;
        }
        if (j0.n.K()) {
            j0.n.V(-1776134358, i10, -1, "androidx.compose.material.OutlinedButton (Button.kt:167)");
        }
        a(aVar, aVar2, z11, mVar2, hVar2, aVar3, gVar2, fVar2, sVar2, qVar, lVar, (i10 & 14) | (i10 & 112) | (i10 & 896) | (i10 & 7168) | (57344 & i10) | (458752 & i10) | (3670016 & i10) | (29360128 & i10) | (234881024 & i10) | (1879048192 & i10), 0);
        if (j0.n.K()) {
            j0.n.U();
        }
        lVar.N();
    }

    public static final void d(pc.a<dc.w> aVar, androidx.compose.ui.e eVar, boolean z10, v.m mVar, h hVar, q4 q4Var, t.g gVar, f fVar, w.s sVar, pc.q<? super w.a0, ? super j0.l, ? super Integer, dc.w> qVar, j0.l lVar, int i10, int i11) {
        e.a aVar2;
        boolean z11;
        v.m mVar2;
        h hVar2;
        b0.a aVar3;
        t.g gVar2;
        f fVar2;
        w.s sVar2;
        qc.q.i(aVar, "onClick");
        qc.q.i(qVar, "content");
        lVar.e(288797557);
        if ((i11 & 2) != 0) {
            aVar2 = androidx.compose.ui.e.f2335a;
        } else {
            aVar2 = eVar;
        }
        if ((i11 & 4) != 0) {
            z11 = true;
        } else {
            z11 = z10;
        }
        if ((i11 & 8) != 0) {
            lVar.e(-492369756);
            Object f10 = lVar.f();
            if (f10 == j0.l.f18688a.a()) {
                f10 = v.l.a();
                lVar.J(f10);
            }
            lVar.N();
            mVar2 = (v.m) f10;
        } else {
            mVar2 = mVar;
        }
        if ((i11 & 16) != 0) {
            hVar2 = null;
        } else {
            hVar2 = hVar;
        }
        if ((i11 & 32) != 0) {
            aVar3 = s0.f15068a.b(lVar, 6).c();
        } else {
            aVar3 = q4Var;
        }
        if ((i11 & 64) != 0) {
            gVar2 = null;
        } else {
            gVar2 = gVar;
        }
        if ((i11 & 128) != 0) {
            fVar2 = g.f14733a.i(0L, 0L, 0L, lVar, 3072, 7);
        } else {
            fVar2 = fVar;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0) {
            sVar2 = g.f14733a.g();
        } else {
            sVar2 = sVar;
        }
        if (j0.n.K()) {
            j0.n.V(288797557, i10, -1, "androidx.compose.material.TextButton (Button.kt:221)");
        }
        a(aVar, aVar2, z11, mVar2, hVar2, aVar3, gVar2, fVar2, sVar2, qVar, lVar, (i10 & 14) | (i10 & 112) | (i10 & 896) | (i10 & 7168) | (57344 & i10) | (458752 & i10) | (3670016 & i10) | (29360128 & i10) | (234881024 & i10) | (1879048192 & i10), 0);
        if (j0.n.K()) {
            j0.n.U();
        }
        lVar.N();
    }
}
