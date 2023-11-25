package w;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import j0.g2;
import j0.z1;
import n1.h1;
import n1.i0;
import n1.j0;
import n1.j1;

/* compiled from: BoxWithConstraints.kt */
/* loaded from: classes.dex */
public final class e {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BoxWithConstraints.kt */
    /* loaded from: classes.dex */
    public static final class a extends qc.r implements pc.p<j1, j2.b, j0> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ i0 f25156f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ pc.q<f, j0.l, Integer, dc.w> f25157m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ int f25158p;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: BoxWithConstraints.kt */
        /* renamed from: w.e$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0577a extends qc.r implements pc.p<j0.l, Integer, dc.w> {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ pc.q<f, j0.l, Integer, dc.w> f25159f;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ g f25160m;

            /* renamed from: p  reason: collision with root package name */
            final /* synthetic */ int f25161p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0577a(pc.q<? super f, ? super j0.l, ? super Integer, dc.w> qVar, g gVar, int i10) {
                super(2);
                this.f25159f = qVar;
                this.f25160m = gVar;
                this.f25161p = i10;
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
                    j0.n.V(-1945019079, i10, -1, "androidx.compose.foundation.layout.BoxWithConstraints.<anonymous>.<anonymous>.<anonymous> (BoxWithConstraints.kt:68)");
                }
                this.f25159f.invoke(this.f25160m, lVar, Integer.valueOf((this.f25161p >> 6) & 112));
                if (j0.n.K()) {
                    j0.n.U();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(i0 i0Var, pc.q<? super f, ? super j0.l, ? super Integer, dc.w> qVar, int i10) {
            super(2);
            this.f25156f = i0Var;
            this.f25157m = qVar;
            this.f25158p = i10;
        }

        public final j0 a(j1 j1Var, long j10) {
            qc.q.i(j1Var, "$this$SubcomposeLayout");
            return this.f25156f.mo0measure3p2s80s(j1Var, j1Var.u0(dc.w.f13270a, q0.c.c(-1945019079, true, new C0577a(this.f25157m, new g(j1Var, j10, null), this.f25158p))), j10);
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ j0 invoke(j1 j1Var, j2.b bVar) {
            return a(j1Var, bVar.t());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BoxWithConstraints.kt */
    /* loaded from: classes.dex */
    public static final class b extends qc.r implements pc.p<j0.l, Integer, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f25162f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ v0.b f25163m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ boolean f25164p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ pc.q<f, j0.l, Integer, dc.w> f25165q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ int f25166r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ int f25167s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(androidx.compose.ui.e eVar, v0.b bVar, boolean z10, pc.q<? super f, ? super j0.l, ? super Integer, dc.w> qVar, int i10, int i11) {
            super(2);
            this.f25162f = eVar;
            this.f25163m = bVar;
            this.f25164p = z10;
            this.f25165q = qVar;
            this.f25166r = i10;
            this.f25167s = i11;
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ dc.w invoke(j0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return dc.w.f13270a;
        }

        public final void invoke(j0.l lVar, int i10) {
            e.a(this.f25162f, this.f25163m, this.f25164p, this.f25165q, lVar, z1.a(this.f25166r | 1), this.f25167s);
        }
    }

    public static final void a(androidx.compose.ui.e eVar, v0.b bVar, boolean z10, pc.q<? super f, ? super j0.l, ? super Integer, dc.w> qVar, j0.l lVar, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        qc.q.i(qVar, "content");
        j0.l q10 = lVar.q(1781813501);
        int i17 = i11 & 1;
        if (i17 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            if (q10.Q(eVar)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i10;
        } else {
            i12 = i10;
        }
        int i18 = i11 & 2;
        if (i18 != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            if (q10.Q(bVar)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        int i19 = i11 & 4;
        if (i19 != 0) {
            i12 |= 384;
        } else if ((i10 & 896) == 0) {
            if (q10.c(z10)) {
                i15 = UserVerificationMethods.USER_VERIFY_HANDPRINT;
            } else {
                i15 = 128;
            }
            i12 |= i15;
        }
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 7168) == 0) {
            if (q10.l(qVar)) {
                i16 = RecyclerView.m.FLAG_MOVED;
            } else {
                i16 = UserVerificationMethods.USER_VERIFY_ALL;
            }
            i12 |= i16;
        }
        if ((i12 & 5851) == 1170 && q10.t()) {
            q10.z();
        } else {
            if (i17 != 0) {
                eVar = androidx.compose.ui.e.f2335a;
            }
            if (i18 != 0) {
                bVar = v0.b.f24258a.n();
            }
            if (i19 != 0) {
                z10 = false;
            }
            if (j0.n.K()) {
                j0.n.V(1781813501, i12, -1, "androidx.compose.foundation.layout.BoxWithConstraints (BoxWithConstraints.kt:58)");
            }
            int i20 = i12 >> 3;
            i0 h10 = androidx.compose.foundation.layout.d.h(bVar, z10, q10, (i20 & 112) | (i20 & 14));
            q10.e(511388516);
            boolean Q = q10.Q(qVar) | q10.Q(h10);
            Object f10 = q10.f();
            if (Q || f10 == j0.l.f18688a.a()) {
                f10 = new a(h10, qVar, i12);
                q10.J(f10);
            }
            q10.N();
            h1.a(eVar, (pc.p) f10, q10, i12 & 14, 0);
            if (j0.n.K()) {
                j0.n.U();
            }
        }
        androidx.compose.ui.e eVar2 = eVar;
        v0.b bVar2 = bVar;
        boolean z11 = z10;
        g2 w10 = q10.w();
        if (w10 != null) {
            w10.a(new b(eVar2, bVar2, z11, qVar, i10, i11));
        }
    }
}
