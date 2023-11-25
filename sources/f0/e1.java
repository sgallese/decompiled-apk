package f0;

import a1.q4;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import n1.y0;
import okhttp3.internal.http2.Http2;

/* compiled from: Scaffold.kt */
/* loaded from: classes.dex */
public final class e1 {

    /* renamed from: a  reason: collision with root package name */
    private static final j0.v1<g0> f14604a = j0.u.d(a.f14606f);

    /* renamed from: b  reason: collision with root package name */
    private static final float f14605b = j2.h.j(16);

    /* compiled from: Scaffold.kt */
    /* loaded from: classes.dex */
    static final class a extends qc.r implements pc.a<g0> {

        /* renamed from: f  reason: collision with root package name */
        public static final a f14606f = new a();

        a() {
            super(0);
        }

        @Override // pc.a
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final g0 invoke() {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Scaffold.kt */
    /* loaded from: classes.dex */
    public static final class b extends qc.r implements pc.p<j0.l, Integer, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ pc.q<androidx.compose.ui.e, j0.l, Integer, dc.w> f14607f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(pc.q<? super androidx.compose.ui.e, ? super j0.l, ? super Integer, dc.w> qVar) {
            super(2);
            this.f14607f = qVar;
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
                j0.n.V(100842932, i10, -1, "androidx.compose.material.Scaffold.<anonymous> (Scaffold.kt:205)");
            }
            this.f14607f.invoke(androidx.compose.ui.e.f2335a, lVar, 54);
            if (j0.n.K()) {
                j0.n.U();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Scaffold.kt */
    /* loaded from: classes.dex */
    public static final class c extends qc.r implements pc.p<j0.l, Integer, dc.w> {
        final /* synthetic */ long A;
        final /* synthetic */ long B;
        final /* synthetic */ long C;
        final /* synthetic */ long D;
        final /* synthetic */ pc.q<w.s, j0.l, Integer, dc.w> E;
        final /* synthetic */ int F;
        final /* synthetic */ int G;
        final /* synthetic */ int H;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f14608f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ g1 f14609m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ pc.p<j0.l, Integer, dc.w> f14610p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ pc.p<j0.l, Integer, dc.w> f14611q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ pc.q<n1, j0.l, Integer, dc.w> f14612r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ pc.p<j0.l, Integer, dc.w> f14613s;

        /* renamed from: t  reason: collision with root package name */
        final /* synthetic */ int f14614t;

        /* renamed from: u  reason: collision with root package name */
        final /* synthetic */ boolean f14615u;

        /* renamed from: v  reason: collision with root package name */
        final /* synthetic */ pc.q<w.j, j0.l, Integer, dc.w> f14616v;

        /* renamed from: w  reason: collision with root package name */
        final /* synthetic */ boolean f14617w;

        /* renamed from: x  reason: collision with root package name */
        final /* synthetic */ q4 f14618x;

        /* renamed from: y  reason: collision with root package name */
        final /* synthetic */ float f14619y;

        /* renamed from: z  reason: collision with root package name */
        final /* synthetic */ long f14620z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(androidx.compose.ui.e eVar, g1 g1Var, pc.p<? super j0.l, ? super Integer, dc.w> pVar, pc.p<? super j0.l, ? super Integer, dc.w> pVar2, pc.q<? super n1, ? super j0.l, ? super Integer, dc.w> qVar, pc.p<? super j0.l, ? super Integer, dc.w> pVar3, int i10, boolean z10, pc.q<? super w.j, ? super j0.l, ? super Integer, dc.w> qVar2, boolean z11, q4 q4Var, float f10, long j10, long j11, long j12, long j13, long j14, pc.q<? super w.s, ? super j0.l, ? super Integer, dc.w> qVar3, int i11, int i12, int i13) {
            super(2);
            this.f14608f = eVar;
            this.f14609m = g1Var;
            this.f14610p = pVar;
            this.f14611q = pVar2;
            this.f14612r = qVar;
            this.f14613s = pVar3;
            this.f14614t = i10;
            this.f14615u = z10;
            this.f14616v = qVar2;
            this.f14617w = z11;
            this.f14618x = q4Var;
            this.f14619y = f10;
            this.f14620z = j10;
            this.A = j11;
            this.B = j12;
            this.C = j13;
            this.D = j14;
            this.E = qVar3;
            this.F = i11;
            this.G = i12;
            this.H = i13;
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ dc.w invoke(j0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return dc.w.f13270a;
        }

        public final void invoke(j0.l lVar, int i10) {
            e1.a(this.f14608f, this.f14609m, this.f14610p, this.f14611q, this.f14612r, this.f14613s, this.f14614t, this.f14615u, this.f14616v, this.f14617w, this.f14618x, this.f14619y, this.f14620z, this.A, this.B, this.C, this.D, this.E, lVar, j0.z1.a(this.F | 1), j0.z1.a(this.G), this.H);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Scaffold.kt */
    /* loaded from: classes.dex */
    public static final class d extends qc.r implements pc.q<androidx.compose.ui.e, j0.l, Integer, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ long f14621f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ long f14622m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ int f14623p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ boolean f14624q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ int f14625r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ pc.p<j0.l, Integer, dc.w> f14626s;

        /* renamed from: t  reason: collision with root package name */
        final /* synthetic */ pc.q<w.s, j0.l, Integer, dc.w> f14627t;

        /* renamed from: u  reason: collision with root package name */
        final /* synthetic */ pc.p<j0.l, Integer, dc.w> f14628u;

        /* renamed from: v  reason: collision with root package name */
        final /* synthetic */ pc.p<j0.l, Integer, dc.w> f14629v;

        /* renamed from: w  reason: collision with root package name */
        final /* synthetic */ int f14630w;

        /* renamed from: x  reason: collision with root package name */
        final /* synthetic */ pc.q<n1, j0.l, Integer, dc.w> f14631x;

        /* renamed from: y  reason: collision with root package name */
        final /* synthetic */ g1 f14632y;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Scaffold.kt */
        /* loaded from: classes.dex */
        public static final class a extends qc.r implements pc.p<j0.l, Integer, dc.w> {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ boolean f14633f;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ int f14634m;

            /* renamed from: p  reason: collision with root package name */
            final /* synthetic */ pc.p<j0.l, Integer, dc.w> f14635p;

            /* renamed from: q  reason: collision with root package name */
            final /* synthetic */ pc.q<w.s, j0.l, Integer, dc.w> f14636q;

            /* renamed from: r  reason: collision with root package name */
            final /* synthetic */ pc.p<j0.l, Integer, dc.w> f14637r;

            /* renamed from: s  reason: collision with root package name */
            final /* synthetic */ pc.p<j0.l, Integer, dc.w> f14638s;

            /* renamed from: t  reason: collision with root package name */
            final /* synthetic */ int f14639t;

            /* renamed from: u  reason: collision with root package name */
            final /* synthetic */ int f14640u;

            /* renamed from: v  reason: collision with root package name */
            final /* synthetic */ pc.q<n1, j0.l, Integer, dc.w> f14641v;

            /* renamed from: w  reason: collision with root package name */
            final /* synthetic */ g1 f14642w;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: Scaffold.kt */
            /* renamed from: f0.e1$d$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0348a extends qc.r implements pc.p<j0.l, Integer, dc.w> {

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ pc.q<n1, j0.l, Integer, dc.w> f14643f;

                /* renamed from: m  reason: collision with root package name */
                final /* synthetic */ g1 f14644m;

                /* renamed from: p  reason: collision with root package name */
                final /* synthetic */ int f14645p;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C0348a(pc.q<? super n1, ? super j0.l, ? super Integer, dc.w> qVar, g1 g1Var, int i10) {
                    super(2);
                    this.f14643f = qVar;
                    this.f14644m = g1Var;
                    this.f14645p = i10;
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
                        j0.n.V(533782017, i10, -1, "androidx.compose.material.Scaffold.<anonymous>.<anonymous>.<anonymous> (Scaffold.kt:185)");
                    }
                    this.f14643f.invoke(this.f14644m.b(), lVar, Integer.valueOf((this.f14645p >> 9) & 112));
                    if (j0.n.K()) {
                        j0.n.U();
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(boolean z10, int i10, pc.p<? super j0.l, ? super Integer, dc.w> pVar, pc.q<? super w.s, ? super j0.l, ? super Integer, dc.w> qVar, pc.p<? super j0.l, ? super Integer, dc.w> pVar2, pc.p<? super j0.l, ? super Integer, dc.w> pVar3, int i11, int i12, pc.q<? super n1, ? super j0.l, ? super Integer, dc.w> qVar2, g1 g1Var) {
                super(2);
                this.f14633f = z10;
                this.f14634m = i10;
                this.f14635p = pVar;
                this.f14636q = qVar;
                this.f14637r = pVar2;
                this.f14638s = pVar3;
                this.f14639t = i11;
                this.f14640u = i12;
                this.f14641v = qVar2;
                this.f14642w = g1Var;
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
                    j0.n.V(-1128984656, i10, -1, "androidx.compose.material.Scaffold.<anonymous>.<anonymous> (Scaffold.kt:179)");
                }
                boolean z10 = this.f14633f;
                int i11 = this.f14634m;
                pc.p<j0.l, Integer, dc.w> pVar = this.f14635p;
                pc.q<w.s, j0.l, Integer, dc.w> qVar = this.f14636q;
                q0.a b10 = q0.c.b(lVar, 533782017, true, new C0348a(this.f14641v, this.f14642w, this.f14639t));
                pc.p<j0.l, Integer, dc.w> pVar2 = this.f14637r;
                pc.p<j0.l, Integer, dc.w> pVar3 = this.f14638s;
                int i12 = this.f14639t;
                e1.b(z10, i11, pVar, qVar, b10, pVar2, pVar3, lVar, ((i12 >> 21) & 14) | 24576 | ((i12 >> 15) & 112) | (i12 & 896) | ((this.f14640u >> 12) & 7168) | (458752 & i12) | ((i12 << 9) & 3670016));
                if (j0.n.K()) {
                    j0.n.U();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(long j10, long j11, int i10, boolean z10, int i11, pc.p<? super j0.l, ? super Integer, dc.w> pVar, pc.q<? super w.s, ? super j0.l, ? super Integer, dc.w> qVar, pc.p<? super j0.l, ? super Integer, dc.w> pVar2, pc.p<? super j0.l, ? super Integer, dc.w> pVar3, int i12, pc.q<? super n1, ? super j0.l, ? super Integer, dc.w> qVar2, g1 g1Var) {
            super(3);
            this.f14621f = j10;
            this.f14622m = j11;
            this.f14623p = i10;
            this.f14624q = z10;
            this.f14625r = i11;
            this.f14626s = pVar;
            this.f14627t = qVar;
            this.f14628u = pVar2;
            this.f14629v = pVar3;
            this.f14630w = i12;
            this.f14631x = qVar2;
            this.f14632y = g1Var;
        }

        public final void a(androidx.compose.ui.e eVar, j0.l lVar, int i10) {
            int i11;
            int i12;
            qc.q.i(eVar, "childModifier");
            if ((i10 & 14) == 0) {
                if (lVar.Q(eVar)) {
                    i12 = 4;
                } else {
                    i12 = 2;
                }
                i11 = i10 | i12;
            } else {
                i11 = i10;
            }
            if ((i11 & 91) == 18 && lVar.t()) {
                lVar.z();
                return;
            }
            if (j0.n.K()) {
                j0.n.V(1823402604, i11, -1, "androidx.compose.material.Scaffold.<anonymous> (Scaffold.kt:178)");
            }
            long j10 = this.f14621f;
            long j11 = this.f14622m;
            q0.a b10 = q0.c.b(lVar, -1128984656, true, new a(this.f14624q, this.f14625r, this.f14626s, this.f14627t, this.f14628u, this.f14629v, this.f14630w, this.f14623p, this.f14631x, this.f14632y));
            int i13 = 1572864 | (i11 & 14);
            int i14 = this.f14623p;
            r1.a(eVar, null, j10, j11, null, 0.0f, b10, lVar, i13 | ((i14 >> 9) & 896) | ((i14 >> 9) & 7168), 50);
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
    /* compiled from: Scaffold.kt */
    /* loaded from: classes.dex */
    public static final class e extends qc.r implements pc.p<n1.j1, j2.b, n1.j0> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ pc.p<j0.l, Integer, dc.w> f14646f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ pc.p<j0.l, Integer, dc.w> f14647m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ pc.p<j0.l, Integer, dc.w> f14648p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ int f14649q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ boolean f14650r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ pc.p<j0.l, Integer, dc.w> f14651s;

        /* renamed from: t  reason: collision with root package name */
        final /* synthetic */ int f14652t;

        /* renamed from: u  reason: collision with root package name */
        final /* synthetic */ pc.q<w.s, j0.l, Integer, dc.w> f14653u;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Scaffold.kt */
        /* loaded from: classes.dex */
        public static final class a extends qc.r implements pc.l<y0.a, dc.w> {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ n1.j1 f14654f;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ pc.p<j0.l, Integer, dc.w> f14655m;

            /* renamed from: p  reason: collision with root package name */
            final /* synthetic */ pc.p<j0.l, Integer, dc.w> f14656p;

            /* renamed from: q  reason: collision with root package name */
            final /* synthetic */ pc.p<j0.l, Integer, dc.w> f14657q;

            /* renamed from: r  reason: collision with root package name */
            final /* synthetic */ int f14658r;

            /* renamed from: s  reason: collision with root package name */
            final /* synthetic */ int f14659s;

            /* renamed from: t  reason: collision with root package name */
            final /* synthetic */ boolean f14660t;

            /* renamed from: u  reason: collision with root package name */
            final /* synthetic */ int f14661u;

            /* renamed from: v  reason: collision with root package name */
            final /* synthetic */ long f14662v;

            /* renamed from: w  reason: collision with root package name */
            final /* synthetic */ pc.p<j0.l, Integer, dc.w> f14663w;

            /* renamed from: x  reason: collision with root package name */
            final /* synthetic */ int f14664x;

            /* renamed from: y  reason: collision with root package name */
            final /* synthetic */ pc.q<w.s, j0.l, Integer, dc.w> f14665y;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: Scaffold.kt */
            /* renamed from: f0.e1$e$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0349a extends qc.r implements pc.p<j0.l, Integer, dc.w> {

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ n1.j1 f14666f;

                /* renamed from: m  reason: collision with root package name */
                final /* synthetic */ int f14667m;

                /* renamed from: p  reason: collision with root package name */
                final /* synthetic */ pc.q<w.s, j0.l, Integer, dc.w> f14668p;

                /* renamed from: q  reason: collision with root package name */
                final /* synthetic */ int f14669q;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C0349a(n1.j1 j1Var, int i10, pc.q<? super w.s, ? super j0.l, ? super Integer, dc.w> qVar, int i11) {
                    super(2);
                    this.f14666f = j1Var;
                    this.f14667m = i10;
                    this.f14668p = qVar;
                    this.f14669q = i11;
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
                        j0.n.V(-1132241596, i10, -1, "androidx.compose.material.ScaffoldLayout.<anonymous>.<anonymous>.<anonymous>.<anonymous> (Scaffold.kt:319)");
                    }
                    this.f14668p.invoke(androidx.compose.foundation.layout.j.e(0.0f, 0.0f, 0.0f, this.f14666f.h0(this.f14667m), 7, null), lVar, Integer.valueOf((this.f14669q >> 6) & 112));
                    if (j0.n.K()) {
                        j0.n.U();
                    }
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: Scaffold.kt */
            /* loaded from: classes.dex */
            public static final class b extends qc.r implements pc.p<j0.l, Integer, dc.w> {

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ g0 f14670f;

                /* renamed from: m  reason: collision with root package name */
                final /* synthetic */ pc.p<j0.l, Integer, dc.w> f14671m;

                /* renamed from: p  reason: collision with root package name */
                final /* synthetic */ int f14672p;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                b(g0 g0Var, pc.p<? super j0.l, ? super Integer, dc.w> pVar, int i10) {
                    super(2);
                    this.f14670f = g0Var;
                    this.f14671m = pVar;
                    this.f14672p = i10;
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
                        j0.n.V(1529070963, i10, -1, "androidx.compose.material.ScaffoldLayout.<anonymous>.<anonymous>.<anonymous>.<anonymous> (Scaffold.kt:288)");
                    }
                    j0.u.a(new j0.w1[]{e1.e().c(this.f14670f)}, this.f14671m, lVar, ((this.f14672p >> 15) & 112) | 8);
                    if (j0.n.K()) {
                        j0.n.U();
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(n1.j1 j1Var, pc.p<? super j0.l, ? super Integer, dc.w> pVar, pc.p<? super j0.l, ? super Integer, dc.w> pVar2, pc.p<? super j0.l, ? super Integer, dc.w> pVar3, int i10, int i11, boolean z10, int i12, long j10, pc.p<? super j0.l, ? super Integer, dc.w> pVar4, int i13, pc.q<? super w.s, ? super j0.l, ? super Integer, dc.w> qVar) {
                super(1);
                this.f14654f = j1Var;
                this.f14655m = pVar;
                this.f14656p = pVar2;
                this.f14657q = pVar3;
                this.f14658r = i10;
                this.f14659s = i11;
                this.f14660t = z10;
                this.f14661u = i12;
                this.f14662v = j10;
                this.f14663w = pVar4;
                this.f14664x = i13;
                this.f14665y = qVar;
            }

            @Override // pc.l
            public /* bridge */ /* synthetic */ dc.w invoke(y0.a aVar) {
                invoke2(aVar);
                return dc.w.f13270a;
            }

            /* JADX WARN: Removed duplicated region for block: B:100:0x022c  */
            /* JADX WARN: Removed duplicated region for block: B:101:0x0232  */
            /* JADX WARN: Removed duplicated region for block: B:103:0x0235  */
            /* JADX WARN: Removed duplicated region for block: B:111:0x0269  */
            /* JADX WARN: Removed duplicated region for block: B:113:0x026d  */
            /* JADX WARN: Removed duplicated region for block: B:117:0x0279  */
            /* JADX WARN: Removed duplicated region for block: B:120:0x02a8 A[LOOP:4: B:119:0x02a6->B:120:0x02a8, LOOP_END] */
            /* JADX WARN: Removed duplicated region for block: B:123:0x02db A[LOOP:5: B:122:0x02d9->B:123:0x02db, LOOP_END] */
            /* JADX WARN: Removed duplicated region for block: B:126:0x030b A[LOOP:6: B:125:0x0309->B:126:0x030b, LOOP_END] */
            /* JADX WARN: Removed duplicated region for block: B:129:0x0328 A[LOOP:7: B:128:0x0326->B:129:0x0328, LOOP_END] */
            /* JADX WARN: Removed duplicated region for block: B:132:0x0346 A[LOOP:8: B:131:0x0344->B:132:0x0346, LOOP_END] */
            /* JADX WARN: Removed duplicated region for block: B:135:0x0364  */
            /* JADX WARN: Removed duplicated region for block: B:86:0x01e6 A[LOOP:3: B:85:0x01e4->B:86:0x01e6, LOOP_END] */
            /* JADX WARN: Removed duplicated region for block: B:89:0x01ff  */
            /* JADX WARN: Removed duplicated region for block: B:90:0x0201  */
            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void invoke2(n1.y0.a r30) {
                /*
                    Method dump skipped, instructions count: 906
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: f0.e1.e.a.invoke2(n1.y0$a):void");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(pc.p<? super j0.l, ? super Integer, dc.w> pVar, pc.p<? super j0.l, ? super Integer, dc.w> pVar2, pc.p<? super j0.l, ? super Integer, dc.w> pVar3, int i10, boolean z10, pc.p<? super j0.l, ? super Integer, dc.w> pVar4, int i11, pc.q<? super w.s, ? super j0.l, ? super Integer, dc.w> qVar) {
            super(2);
            this.f14646f = pVar;
            this.f14647m = pVar2;
            this.f14648p = pVar3;
            this.f14649q = i10;
            this.f14650r = z10;
            this.f14651s = pVar4;
            this.f14652t = i11;
            this.f14653u = qVar;
        }

        public final n1.j0 a(n1.j1 j1Var, long j10) {
            qc.q.i(j1Var, "$this$SubcomposeLayout");
            int n10 = j2.b.n(j10);
            int m10 = j2.b.m(j10);
            return n1.k0.b(j1Var, n10, m10, null, new a(j1Var, this.f14646f, this.f14647m, this.f14648p, this.f14649q, n10, this.f14650r, m10, j2.b.e(j10, 0, 0, 0, 0, 10, null), this.f14651s, this.f14652t, this.f14653u), 4, null);
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ n1.j0 invoke(n1.j1 j1Var, j2.b bVar) {
            return a(j1Var, bVar.t());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Scaffold.kt */
    /* loaded from: classes.dex */
    public static final class f extends qc.r implements pc.p<j0.l, Integer, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ boolean f14673f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ int f14674m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ pc.p<j0.l, Integer, dc.w> f14675p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ pc.q<w.s, j0.l, Integer, dc.w> f14676q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ pc.p<j0.l, Integer, dc.w> f14677r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ pc.p<j0.l, Integer, dc.w> f14678s;

        /* renamed from: t  reason: collision with root package name */
        final /* synthetic */ pc.p<j0.l, Integer, dc.w> f14679t;

        /* renamed from: u  reason: collision with root package name */
        final /* synthetic */ int f14680u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(boolean z10, int i10, pc.p<? super j0.l, ? super Integer, dc.w> pVar, pc.q<? super w.s, ? super j0.l, ? super Integer, dc.w> qVar, pc.p<? super j0.l, ? super Integer, dc.w> pVar2, pc.p<? super j0.l, ? super Integer, dc.w> pVar3, pc.p<? super j0.l, ? super Integer, dc.w> pVar4, int i11) {
            super(2);
            this.f14673f = z10;
            this.f14674m = i10;
            this.f14675p = pVar;
            this.f14676q = qVar;
            this.f14677r = pVar2;
            this.f14678s = pVar3;
            this.f14679t = pVar4;
            this.f14680u = i11;
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ dc.w invoke(j0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return dc.w.f13270a;
        }

        public final void invoke(j0.l lVar, int i10) {
            e1.b(this.f14673f, this.f14674m, this.f14675p, this.f14676q, this.f14677r, this.f14678s, this.f14679t, lVar, j0.z1.a(this.f14680u | 1));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:143:0x01b8, code lost:
    
        if (r0.j(r55) == false) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x01d2, code lost:
    
        if (r0.j(r57) == false) goto L157;
     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0499  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x04dd  */
    /* JADX WARN: Removed duplicated region for block: B:300:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x013f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(androidx.compose.ui.e r41, f0.g1 r42, pc.p<? super j0.l, ? super java.lang.Integer, dc.w> r43, pc.p<? super j0.l, ? super java.lang.Integer, dc.w> r44, pc.q<? super f0.n1, ? super j0.l, ? super java.lang.Integer, dc.w> r45, pc.p<? super j0.l, ? super java.lang.Integer, dc.w> r46, int r47, boolean r48, pc.q<? super w.j, ? super j0.l, ? super java.lang.Integer, dc.w> r49, boolean r50, a1.q4 r51, float r52, long r53, long r55, long r57, long r59, long r61, pc.q<? super w.s, ? super j0.l, ? super java.lang.Integer, dc.w> r63, j0.l r64, int r65, int r66, int r67) {
        /*
            Method dump skipped, instructions count: 1275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.e1.a(androidx.compose.ui.e, f0.g1, pc.p, pc.p, pc.q, pc.p, int, boolean, pc.q, boolean, a1.q4, float, long, long, long, long, long, pc.q, j0.l, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(boolean z10, int i10, pc.p<? super j0.l, ? super Integer, dc.w> pVar, pc.q<? super w.s, ? super j0.l, ? super Integer, dc.w> qVar, pc.p<? super j0.l, ? super Integer, dc.w> pVar2, pc.p<? super j0.l, ? super Integer, dc.w> pVar3, pc.p<? super j0.l, ? super Integer, dc.w> pVar4, j0.l lVar, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        j0.l q10 = lVar.q(-1401632215);
        if ((i11 & 14) == 0) {
            if (q10.c(z10)) {
                i21 = 4;
            } else {
                i21 = 2;
            }
            i12 = i21 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            if (q10.i(i10)) {
                i20 = 32;
            } else {
                i20 = 16;
            }
            i12 |= i20;
        }
        if ((i11 & 896) == 0) {
            if (q10.l(pVar)) {
                i19 = UserVerificationMethods.USER_VERIFY_HANDPRINT;
            } else {
                i19 = 128;
            }
            i12 |= i19;
        }
        if ((i11 & 7168) == 0) {
            if (q10.l(qVar)) {
                i18 = RecyclerView.m.FLAG_MOVED;
            } else {
                i18 = UserVerificationMethods.USER_VERIFY_ALL;
            }
            i12 |= i18;
        }
        if ((57344 & i11) == 0) {
            if (q10.l(pVar2)) {
                i17 = Http2.INITIAL_MAX_FRAME_SIZE;
            } else {
                i17 = 8192;
            }
            i12 |= i17;
        }
        if ((458752 & i11) == 0) {
            if (q10.l(pVar3)) {
                i16 = 131072;
            } else {
                i16 = 65536;
            }
            i12 |= i16;
        }
        if ((3670016 & i11) == 0) {
            if (q10.l(pVar4)) {
                i15 = 1048576;
            } else {
                i15 = 524288;
            }
            i12 |= i15;
        }
        int i22 = i12;
        if ((2995931 & i22) == 599186 && q10.t()) {
            q10.z();
        } else {
            if (j0.n.K()) {
                j0.n.V(-1401632215, i22, -1, "androidx.compose.material.ScaffoldLayout (Scaffold.kt:227)");
            }
            Object[] objArr = {pVar, pVar2, pVar3, h0.b(i10), Boolean.valueOf(z10), pVar4, qVar};
            q10.e(-568225417);
            int i23 = 0;
            boolean z11 = false;
            for (int i24 = 7; i23 < i24; i24 = 7) {
                z11 |= q10.Q(objArr[i23]);
                i23++;
            }
            Object f10 = q10.f();
            if (!z11 && f10 != j0.l.f18688a.a()) {
                i13 = 1;
                i14 = 0;
            } else {
                i13 = 1;
                i14 = 0;
                e eVar = new e(pVar, pVar2, pVar3, i10, z10, pVar4, i22, qVar);
                q10.J(eVar);
                f10 = eVar;
            }
            q10.N();
            n1.h1.a(null, (pc.p) f10, q10, i14, i13);
            if (j0.n.K()) {
                j0.n.U();
            }
        }
        j0.g2 w10 = q10.w();
        if (w10 != null) {
            w10.a(new f(z10, i10, pVar, qVar, pVar2, pVar3, pVar4, i11));
        }
    }

    public static final j0.v1<g0> e() {
        return f14604a;
    }

    public static final g1 f(a0 a0Var, n1 n1Var, j0.l lVar, int i10, int i11) {
        lVar.e(1569641925);
        if ((i11 & 1) != 0) {
            a0Var = z.j(b0.Closed, null, lVar, 6, 2);
        }
        if ((i11 & 2) != 0) {
            lVar.e(-492369756);
            Object f10 = lVar.f();
            if (f10 == j0.l.f18688a.a()) {
                f10 = new n1();
                lVar.J(f10);
            }
            lVar.N();
            n1Var = (n1) f10;
        }
        if (j0.n.K()) {
            j0.n.V(1569641925, i10, -1, "androidx.compose.material.rememberScaffoldState (Scaffold.kt:62)");
        }
        lVar.e(-492369756);
        Object f11 = lVar.f();
        if (f11 == j0.l.f18688a.a()) {
            f11 = new g1(a0Var, n1Var);
            lVar.J(f11);
        }
        lVar.N();
        g1 g1Var = (g1) f11;
        if (j0.n.K()) {
            j0.n.U();
        }
        lVar.N();
        return g1Var;
    }
}
