package f0;

import a1.q4;
import androidx.compose.ui.e;
import j0.i2;
import j0.l3;
import java.util.List;
import java.util.NoSuchElementException;
import n1.y0;
import p1.g;
import v0.b;
import w.a;

/* compiled from: Snackbar.kt */
/* loaded from: classes.dex */
public final class o1 {

    /* renamed from: c  reason: collision with root package name */
    private static final float f14917c;

    /* renamed from: f  reason: collision with root package name */
    private static final float f14920f;

    /* renamed from: a  reason: collision with root package name */
    private static final float f14915a = j2.h.j(30);

    /* renamed from: b  reason: collision with root package name */
    private static final float f14916b = j2.h.j(16);

    /* renamed from: d  reason: collision with root package name */
    private static final float f14918d = j2.h.j(2);

    /* renamed from: e  reason: collision with root package name */
    private static final float f14919e = j2.h.j(6);

    /* renamed from: g  reason: collision with root package name */
    private static final float f14921g = j2.h.j(12);

    /* renamed from: h  reason: collision with root package name */
    private static final float f14922h = j2.h.j(48);

    /* renamed from: i  reason: collision with root package name */
    private static final float f14923i = j2.h.j(68);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Snackbar.kt */
    /* loaded from: classes.dex */
    public static final class a extends qc.r implements pc.p<j0.l, Integer, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ pc.p<j0.l, Integer, dc.w> f14924f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ pc.p<j0.l, Integer, dc.w> f14925m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ int f14926p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(pc.p<? super j0.l, ? super Integer, dc.w> pVar, pc.p<? super j0.l, ? super Integer, dc.w> pVar2, int i10) {
            super(2);
            this.f14924f = pVar;
            this.f14925m = pVar2;
            this.f14926p = i10;
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ dc.w invoke(j0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return dc.w.f13270a;
        }

        public final void invoke(j0.l lVar, int i10) {
            o1.a(this.f14924f, this.f14925m, lVar, j0.z1.a(this.f14926p | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Snackbar.kt */
    /* loaded from: classes.dex */
    public static final class b implements n1.i0 {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f14927a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f14928b;

        /* compiled from: Snackbar.kt */
        /* loaded from: classes.dex */
        static final class a extends qc.r implements pc.l<y0.a, dc.w> {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ n1.y0 f14929f;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ int f14930m;

            /* renamed from: p  reason: collision with root package name */
            final /* synthetic */ n1.y0 f14931p;

            /* renamed from: q  reason: collision with root package name */
            final /* synthetic */ int f14932q;

            /* renamed from: r  reason: collision with root package name */
            final /* synthetic */ int f14933r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(n1.y0 y0Var, int i10, n1.y0 y0Var2, int i11, int i12) {
                super(1);
                this.f14929f = y0Var;
                this.f14930m = i10;
                this.f14931p = y0Var2;
                this.f14932q = i11;
                this.f14933r = i12;
            }

            @Override // pc.l
            public /* bridge */ /* synthetic */ dc.w invoke(y0.a aVar) {
                invoke2(aVar);
                return dc.w.f13270a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(y0.a aVar) {
                qc.q.i(aVar, "$this$layout");
                y0.a.r(aVar, this.f14929f, 0, this.f14930m, 0.0f, 4, null);
                y0.a.r(aVar, this.f14931p, this.f14932q, this.f14933r, 0.0f, 4, null);
            }
        }

        b(String str, String str2) {
            this.f14927a = str;
            this.f14928b = str2;
        }

        @Override // n1.i0
        public /* synthetic */ int maxIntrinsicHeight(n1.n nVar, List list, int i10) {
            return n1.h0.a(this, nVar, list, i10);
        }

        @Override // n1.i0
        public /* synthetic */ int maxIntrinsicWidth(n1.n nVar, List list, int i10) {
            return n1.h0.b(this, nVar, list, i10);
        }

        @Override // n1.i0
        /* renamed from: measure-3p2s80s */
        public final n1.j0 mo0measure3p2s80s(n1.l0 l0Var, List<? extends n1.g0> list, long j10) {
            int d10;
            boolean z10;
            boolean z11;
            int i10;
            int l02;
            int i11;
            qc.q.i(l0Var, "$this$Layout");
            qc.q.i(list, "measurables");
            List<? extends n1.g0> list2 = list;
            String str = this.f14927a;
            for (n1.g0 g0Var : list2) {
                if (qc.q.d(androidx.compose.ui.layout.a.a(g0Var), str)) {
                    n1.y0 w10 = g0Var.w(j10);
                    d10 = vc.l.d((j2.b.n(j10) - w10.A0()) - l0Var.K0(o1.f14920f), j2.b.p(j10));
                    String str2 = this.f14928b;
                    for (n1.g0 g0Var2 : list2) {
                        if (qc.q.d(androidx.compose.ui.layout.a.a(g0Var2), str2)) {
                            n1.y0 w11 = g0Var2.w(j2.b.e(j10, 0, d10, 0, 0, 9, null));
                            int G = w11.G(n1.b.a());
                            boolean z12 = true;
                            int i12 = 0;
                            if (G != Integer.MIN_VALUE) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z10) {
                                int G2 = w11.G(n1.b.b());
                                if (G2 != Integer.MIN_VALUE) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                if (z11) {
                                    if (G != G2) {
                                        z12 = false;
                                    }
                                    int n10 = j2.b.n(j10) - w10.A0();
                                    if (z12) {
                                        i11 = Math.max(l0Var.K0(o1.f14922h), w10.l0());
                                        int l03 = (i11 - w11.l0()) / 2;
                                        int G3 = w10.G(n1.b.a());
                                        if (G3 != Integer.MIN_VALUE) {
                                            i12 = (G + l03) - G3;
                                        }
                                        l02 = i12;
                                        i10 = l03;
                                    } else {
                                        int K0 = l0Var.K0(o1.f14915a) - G;
                                        int max = Math.max(l0Var.K0(o1.f14923i), w11.l0() + K0);
                                        i10 = K0;
                                        l02 = (max - w10.l0()) / 2;
                                        i11 = max;
                                    }
                                    return n1.k0.b(l0Var, j2.b.n(j10), i11, null, new a(w11, i10, w10, n10, l02), 4, null);
                                }
                                throw new IllegalArgumentException("No baselines for text".toString());
                            }
                            throw new IllegalArgumentException("No baselines for text".toString());
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Snackbar.kt */
    /* loaded from: classes.dex */
    public static final class c extends qc.r implements pc.p<j0.l, Integer, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ pc.p<j0.l, Integer, dc.w> f14934f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ pc.p<j0.l, Integer, dc.w> f14935m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ int f14936p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(pc.p<? super j0.l, ? super Integer, dc.w> pVar, pc.p<? super j0.l, ? super Integer, dc.w> pVar2, int i10) {
            super(2);
            this.f14934f = pVar;
            this.f14935m = pVar2;
            this.f14936p = i10;
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ dc.w invoke(j0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return dc.w.f13270a;
        }

        public final void invoke(j0.l lVar, int i10) {
            o1.b(this.f14934f, this.f14935m, lVar, j0.z1.a(this.f14936p | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Snackbar.kt */
    /* loaded from: classes.dex */
    public static final class d extends qc.r implements pc.p<j0.l, Integer, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ pc.p<j0.l, Integer, dc.w> f14937f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ pc.p<j0.l, Integer, dc.w> f14938m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ int f14939p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ boolean f14940q;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Snackbar.kt */
        /* loaded from: classes.dex */
        public static final class a extends qc.r implements pc.p<j0.l, Integer, dc.w> {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ pc.p<j0.l, Integer, dc.w> f14941f;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ pc.p<j0.l, Integer, dc.w> f14942m;

            /* renamed from: p  reason: collision with root package name */
            final /* synthetic */ int f14943p;

            /* renamed from: q  reason: collision with root package name */
            final /* synthetic */ boolean f14944q;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: Snackbar.kt */
            /* renamed from: f0.o1$d$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0355a extends qc.r implements pc.p<j0.l, Integer, dc.w> {

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ pc.p<j0.l, Integer, dc.w> f14945f;

                /* renamed from: m  reason: collision with root package name */
                final /* synthetic */ pc.p<j0.l, Integer, dc.w> f14946m;

                /* renamed from: p  reason: collision with root package name */
                final /* synthetic */ int f14947p;

                /* renamed from: q  reason: collision with root package name */
                final /* synthetic */ boolean f14948q;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C0355a(pc.p<? super j0.l, ? super Integer, dc.w> pVar, pc.p<? super j0.l, ? super Integer, dc.w> pVar2, int i10, boolean z10) {
                    super(2);
                    this.f14945f = pVar;
                    this.f14946m = pVar2;
                    this.f14947p = i10;
                    this.f14948q = z10;
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
                        j0.n.V(225114541, i10, -1, "androidx.compose.material.Snackbar.<anonymous>.<anonymous>.<anonymous> (Snackbar.kt:99)");
                    }
                    if (this.f14945f == null) {
                        lVar.e(59708346);
                        o1.e(this.f14946m, lVar, (this.f14947p >> 21) & 14);
                        lVar.N();
                    } else if (this.f14948q) {
                        lVar.e(59708411);
                        pc.p<j0.l, Integer, dc.w> pVar = this.f14946m;
                        pc.p<j0.l, Integer, dc.w> pVar2 = this.f14945f;
                        int i11 = this.f14947p;
                        o1.a(pVar, pVar2, lVar, (i11 & 112) | ((i11 >> 21) & 14));
                        lVar.N();
                    } else {
                        lVar.e(59708478);
                        pc.p<j0.l, Integer, dc.w> pVar3 = this.f14946m;
                        pc.p<j0.l, Integer, dc.w> pVar4 = this.f14945f;
                        int i12 = this.f14947p;
                        o1.b(pVar3, pVar4, lVar, (i12 & 112) | ((i12 >> 21) & 14));
                        lVar.N();
                    }
                    if (j0.n.K()) {
                        j0.n.U();
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(pc.p<? super j0.l, ? super Integer, dc.w> pVar, pc.p<? super j0.l, ? super Integer, dc.w> pVar2, int i10, boolean z10) {
                super(2);
                this.f14941f = pVar;
                this.f14942m = pVar2;
                this.f14943p = i10;
                this.f14944q = z10;
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
                    j0.n.V(1939362236, i10, -1, "androidx.compose.material.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:97)");
                }
                f2.a(s0.f15068a.c(lVar, 6).c(), q0.c.b(lVar, 225114541, true, new C0355a(this.f14941f, this.f14942m, this.f14943p, this.f14944q)), lVar, 48);
                if (j0.n.K()) {
                    j0.n.U();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(pc.p<? super j0.l, ? super Integer, dc.w> pVar, pc.p<? super j0.l, ? super Integer, dc.w> pVar2, int i10, boolean z10) {
            super(2);
            this.f14937f = pVar;
            this.f14938m = pVar2;
            this.f14939p = i10;
            this.f14940q = z10;
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
                j0.n.V(-2084221700, i10, -1, "androidx.compose.material.Snackbar.<anonymous> (Snackbar.kt:96)");
            }
            j0.u.a(new j0.w1[]{o.a().c(Float.valueOf(n.f14905a.c(lVar, 6)))}, q0.c.b(lVar, 1939362236, true, new a(this.f14937f, this.f14938m, this.f14939p, this.f14940q)), lVar, 56);
            if (j0.n.K()) {
                j0.n.U();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Snackbar.kt */
    /* loaded from: classes.dex */
    public static final class e extends qc.r implements pc.p<j0.l, Integer, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f14949f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ pc.p<j0.l, Integer, dc.w> f14950m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ boolean f14951p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ q4 f14952q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ long f14953r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ long f14954s;

        /* renamed from: t  reason: collision with root package name */
        final /* synthetic */ float f14955t;

        /* renamed from: u  reason: collision with root package name */
        final /* synthetic */ pc.p<j0.l, Integer, dc.w> f14956u;

        /* renamed from: v  reason: collision with root package name */
        final /* synthetic */ int f14957v;

        /* renamed from: w  reason: collision with root package name */
        final /* synthetic */ int f14958w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(androidx.compose.ui.e eVar, pc.p<? super j0.l, ? super Integer, dc.w> pVar, boolean z10, q4 q4Var, long j10, long j11, float f10, pc.p<? super j0.l, ? super Integer, dc.w> pVar2, int i10, int i11) {
            super(2);
            this.f14949f = eVar;
            this.f14950m = pVar;
            this.f14951p = z10;
            this.f14952q = q4Var;
            this.f14953r = j10;
            this.f14954s = j11;
            this.f14955t = f10;
            this.f14956u = pVar2;
            this.f14957v = i10;
            this.f14958w = i11;
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ dc.w invoke(j0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return dc.w.f13270a;
        }

        public final void invoke(j0.l lVar, int i10) {
            o1.c(this.f14949f, this.f14950m, this.f14951p, this.f14952q, this.f14953r, this.f14954s, this.f14955t, this.f14956u, lVar, j0.z1.a(this.f14957v | 1), this.f14958w);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Snackbar.kt */
    /* loaded from: classes.dex */
    public static final class f extends qc.r implements pc.p<j0.l, Integer, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ j1 f14959f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(j1 j1Var) {
            super(2);
            this.f14959f = j1Var;
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
                j0.n.V(-261845785, i10, -1, "androidx.compose.material.Snackbar.<anonymous> (Snackbar.kt:175)");
            }
            f2.b(this.f14959f.a(), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, lVar, 0, 0, 131070);
            if (j0.n.K()) {
                j0.n.U();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Snackbar.kt */
    /* loaded from: classes.dex */
    public static final class g extends qc.r implements pc.p<j0.l, Integer, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ j1 f14960f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f14961m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ boolean f14962p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ q4 f14963q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ long f14964r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ long f14965s;

        /* renamed from: t  reason: collision with root package name */
        final /* synthetic */ long f14966t;

        /* renamed from: u  reason: collision with root package name */
        final /* synthetic */ float f14967u;

        /* renamed from: v  reason: collision with root package name */
        final /* synthetic */ int f14968v;

        /* renamed from: w  reason: collision with root package name */
        final /* synthetic */ int f14969w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(j1 j1Var, androidx.compose.ui.e eVar, boolean z10, q4 q4Var, long j10, long j11, long j12, float f10, int i10, int i11) {
            super(2);
            this.f14960f = j1Var;
            this.f14961m = eVar;
            this.f14962p = z10;
            this.f14963q = q4Var;
            this.f14964r = j10;
            this.f14965s = j11;
            this.f14966t = j12;
            this.f14967u = f10;
            this.f14968v = i10;
            this.f14969w = i11;
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ dc.w invoke(j0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return dc.w.f13270a;
        }

        public final void invoke(j0.l lVar, int i10) {
            o1.d(this.f14960f, this.f14961m, this.f14962p, this.f14963q, this.f14964r, this.f14965s, this.f14966t, this.f14967u, lVar, j0.z1.a(this.f14968v | 1), this.f14969w);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Snackbar.kt */
    /* loaded from: classes.dex */
    public static final class h extends qc.r implements pc.p<j0.l, Integer, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ long f14970f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ int f14971m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ j1 f14972p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ String f14973q;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Snackbar.kt */
        /* loaded from: classes.dex */
        public static final class a extends qc.r implements pc.a<dc.w> {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ j1 f14974f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(j1 j1Var) {
                super(0);
                this.f14974f = j1Var;
            }

            @Override // pc.a
            public /* bridge */ /* synthetic */ dc.w invoke() {
                invoke2();
                return dc.w.f13270a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.f14974f.b();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Snackbar.kt */
        /* loaded from: classes.dex */
        public static final class b extends qc.r implements pc.q<w.a0, j0.l, Integer, dc.w> {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ String f14975f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(String str) {
                super(3);
                this.f14975f = str;
            }

            @Override // pc.q
            public /* bridge */ /* synthetic */ dc.w invoke(w.a0 a0Var, j0.l lVar, Integer num) {
                invoke(a0Var, lVar, num.intValue());
                return dc.w.f13270a;
            }

            public final void invoke(w.a0 a0Var, j0.l lVar, int i10) {
                qc.q.i(a0Var, "$this$TextButton");
                if ((i10 & 81) == 16 && lVar.t()) {
                    lVar.z();
                    return;
                }
                if (j0.n.K()) {
                    j0.n.V(-929149933, i10, -1, "androidx.compose.material.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:167)");
                }
                f2.b(this.f14975f, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, lVar, 0, 0, 131070);
                if (j0.n.K()) {
                    j0.n.U();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(long j10, int i10, j1 j1Var, String str) {
            super(2);
            this.f14970f = j10;
            this.f14971m = i10;
            this.f14972p = j1Var;
            this.f14973q = str;
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
                j0.n.V(1843479216, i10, -1, "androidx.compose.material.Snackbar.<anonymous> (Snackbar.kt:163)");
            }
            f0.i.d(new a(this.f14972p), null, false, null, null, null, null, f0.g.f14733a.i(0L, this.f14970f, 0L, lVar, ((this.f14971m >> 15) & 112) | 3072, 5), null, q0.c.b(lVar, -929149933, true, new b(this.f14973q)), lVar, 805306368, 382);
            if (j0.n.K()) {
                j0.n.U();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Snackbar.kt */
    /* loaded from: classes.dex */
    public static final class i implements n1.i0 {

        /* renamed from: a  reason: collision with root package name */
        public static final i f14976a = new i();

        /* compiled from: Snackbar.kt */
        /* loaded from: classes.dex */
        static final class a extends qc.r implements pc.l<y0.a, dc.w> {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ int f14977f;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ n1.y0 f14978m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(int i10, n1.y0 y0Var) {
                super(1);
                this.f14977f = i10;
                this.f14978m = y0Var;
            }

            @Override // pc.l
            public /* bridge */ /* synthetic */ dc.w invoke(y0.a aVar) {
                invoke2(aVar);
                return dc.w.f13270a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(y0.a aVar) {
                qc.q.i(aVar, "$this$layout");
                y0.a.r(aVar, this.f14978m, 0, (this.f14977f - this.f14978m.l0()) / 2, 0.0f, 4, null);
            }
        }

        i() {
        }

        @Override // n1.i0
        public /* synthetic */ int maxIntrinsicHeight(n1.n nVar, List list, int i10) {
            return n1.h0.a(this, nVar, list, i10);
        }

        @Override // n1.i0
        public /* synthetic */ int maxIntrinsicWidth(n1.n nVar, List list, int i10) {
            return n1.h0.b(this, nVar, list, i10);
        }

        @Override // n1.i0
        /* renamed from: measure-3p2s80s */
        public final n1.j0 mo0measure3p2s80s(n1.l0 l0Var, List<? extends n1.g0> list, long j10) {
            boolean z10;
            Object a02;
            boolean z11;
            qc.q.i(l0Var, "$this$Layout");
            qc.q.i(list, "measurables");
            boolean z12 = false;
            if (list.size() == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                a02 = ec.b0.a0(list);
                n1.y0 w10 = ((n1.g0) a02).w(j10);
                int G = w10.G(n1.b.a());
                int G2 = w10.G(n1.b.b());
                if (G != Integer.MIN_VALUE) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    if (G2 != Integer.MIN_VALUE) {
                        z12 = true;
                    }
                    if (z12) {
                        int max = Math.max(l0Var.K0(G == G2 ? o1.f14922h : o1.f14923i), w10.l0());
                        return n1.k0.b(l0Var, j2.b.n(j10), max, null, new a(max, w10), 4, null);
                    }
                    throw new IllegalArgumentException("No baselines for text".toString());
                }
                throw new IllegalArgumentException("No baselines for text".toString());
            }
            throw new IllegalArgumentException("text for Snackbar expected to have exactly only one child".toString());
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Snackbar.kt */
    /* loaded from: classes.dex */
    public static final class j extends qc.r implements pc.p<j0.l, Integer, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ pc.p<j0.l, Integer, dc.w> f14979f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ int f14980m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        j(pc.p<? super j0.l, ? super Integer, dc.w> pVar, int i10) {
            super(2);
            this.f14979f = pVar;
            this.f14980m = i10;
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ dc.w invoke(j0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return dc.w.f13270a;
        }

        public final void invoke(j0.l lVar, int i10) {
            o1.e(this.f14979f, lVar, j0.z1.a(this.f14980m | 1));
        }
    }

    static {
        float f10 = 8;
        f14917c = j2.h.j(f10);
        f14920f = j2.h.j(f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(pc.p<? super j0.l, ? super Integer, dc.w> pVar, pc.p<? super j0.l, ? super Integer, dc.w> pVar2, j0.l lVar, int i10) {
        int i11;
        int i12;
        int i13;
        j0.l q10 = lVar.q(-1229075900);
        if ((i10 & 14) == 0) {
            if (q10.l(pVar)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i11 = i13 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            if (q10.l(pVar2)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i11 |= i12;
        }
        if ((i11 & 91) == 18 && q10.t()) {
            q10.z();
        } else {
            if (j0.n.K()) {
                j0.n.V(-1229075900, i11, -1, "androidx.compose.material.NewLineButtonSnackbar (Snackbar.kt:270)");
            }
            e.a aVar = androidx.compose.ui.e.f2335a;
            androidx.compose.ui.e h10 = androidx.compose.foundation.layout.m.h(aVar, 0.0f, 1, null);
            float f10 = f14916b;
            float f11 = f14917c;
            androidx.compose.ui.e m10 = androidx.compose.foundation.layout.j.m(h10, f10, 0.0f, f11, f14918d, 2, null);
            q10.e(-483455358);
            a.l f12 = w.a.f25135a.f();
            b.a aVar2 = v0.b.f24258a;
            n1.i0 a10 = w.h.a(f12, aVar2.j(), q10, 0);
            q10.e(-1323940314);
            int a11 = j0.j.a(q10, 0);
            j0.v F = q10.F();
            g.a aVar3 = p1.g.f20790l;
            pc.a<p1.g> a12 = aVar3.a();
            pc.q<i2<p1.g>, j0.l, Integer, dc.w> a13 = n1.x.a(m10);
            if (!(q10.u() instanceof j0.f)) {
                j0.j.c();
            }
            q10.s();
            if (q10.n()) {
                q10.B(a12);
            } else {
                q10.H();
            }
            j0.l a14 = l3.a(q10);
            l3.b(a14, a10, aVar3.e());
            l3.b(a14, F, aVar3.g());
            pc.p<p1.g, Integer, dc.w> b10 = aVar3.b();
            if (a14.n() || !qc.q.d(a14.f(), Integer.valueOf(a11))) {
                a14.J(Integer.valueOf(a11));
                a14.I(Integer.valueOf(a11), b10);
            }
            a13.invoke(i2.a(i2.b(q10)), q10, 0);
            q10.e(2058660585);
            w.k kVar = w.k.f25176a;
            androidx.compose.ui.e m11 = androidx.compose.foundation.layout.j.m(androidx.compose.foundation.layout.a.g(aVar, f14915a, f14921g), 0.0f, 0.0f, f11, 0.0f, 11, null);
            q10.e(733328855);
            n1.i0 h11 = androidx.compose.foundation.layout.d.h(aVar2.n(), false, q10, 0);
            q10.e(-1323940314);
            int a15 = j0.j.a(q10, 0);
            j0.v F2 = q10.F();
            pc.a<p1.g> a16 = aVar3.a();
            pc.q<i2<p1.g>, j0.l, Integer, dc.w> a17 = n1.x.a(m11);
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
            l3.b(a18, h11, aVar3.e());
            l3.b(a18, F2, aVar3.g());
            pc.p<p1.g, Integer, dc.w> b11 = aVar3.b();
            if (a18.n() || !qc.q.d(a18.f(), Integer.valueOf(a15))) {
                a18.J(Integer.valueOf(a15));
                a18.I(Integer.valueOf(a15), b11);
            }
            a17.invoke(i2.a(i2.b(q10)), q10, 0);
            q10.e(2058660585);
            androidx.compose.foundation.layout.e eVar = androidx.compose.foundation.layout.e.f2083a;
            pVar.invoke(q10, Integer.valueOf(i11 & 14));
            q10.N();
            q10.O();
            q10.N();
            q10.N();
            androidx.compose.ui.e b12 = kVar.b(aVar, aVar2.i());
            q10.e(733328855);
            n1.i0 h12 = androidx.compose.foundation.layout.d.h(aVar2.n(), false, q10, 0);
            q10.e(-1323940314);
            int a19 = j0.j.a(q10, 0);
            j0.v F3 = q10.F();
            pc.a<p1.g> a20 = aVar3.a();
            pc.q<i2<p1.g>, j0.l, Integer, dc.w> a21 = n1.x.a(b12);
            if (!(q10.u() instanceof j0.f)) {
                j0.j.c();
            }
            q10.s();
            if (q10.n()) {
                q10.B(a20);
            } else {
                q10.H();
            }
            j0.l a22 = l3.a(q10);
            l3.b(a22, h12, aVar3.e());
            l3.b(a22, F3, aVar3.g());
            pc.p<p1.g, Integer, dc.w> b13 = aVar3.b();
            if (a22.n() || !qc.q.d(a22.f(), Integer.valueOf(a19))) {
                a22.J(Integer.valueOf(a19));
                a22.I(Integer.valueOf(a19), b13);
            }
            a21.invoke(i2.a(i2.b(q10)), q10, 0);
            q10.e(2058660585);
            pVar2.invoke(q10, Integer.valueOf((i11 >> 3) & 14));
            q10.N();
            q10.O();
            q10.N();
            q10.N();
            q10.N();
            q10.O();
            q10.N();
            q10.N();
            if (j0.n.K()) {
                j0.n.U();
            }
        }
        j0.g2 w10 = q10.w();
        if (w10 != null) {
            w10.a(new a(pVar, pVar2, i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(pc.p<? super j0.l, ? super Integer, dc.w> pVar, pc.p<? super j0.l, ? super Integer, dc.w> pVar2, j0.l lVar, int i10) {
        int i11;
        int i12;
        int i13;
        j0.l q10 = lVar.q(-534813202);
        if ((i10 & 14) == 0) {
            if (q10.l(pVar)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i11 = i13 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            if (q10.l(pVar2)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i11 |= i12;
        }
        if ((i11 & 91) == 18 && q10.t()) {
            q10.z();
        } else {
            if (j0.n.K()) {
                j0.n.V(-534813202, i11, -1, "androidx.compose.material.OneRowSnackbar (Snackbar.kt:291)");
            }
            e.a aVar = androidx.compose.ui.e.f2335a;
            androidx.compose.ui.e m10 = androidx.compose.foundation.layout.j.m(aVar, f14916b, 0.0f, f14917c, 0.0f, 10, null);
            b bVar = new b("action", "text");
            q10.e(-1323940314);
            int a10 = j0.j.a(q10, 0);
            j0.v F = q10.F();
            g.a aVar2 = p1.g.f20790l;
            pc.a<p1.g> a11 = aVar2.a();
            pc.q<i2<p1.g>, j0.l, Integer, dc.w> a12 = n1.x.a(m10);
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
            l3.b(a13, bVar, aVar2.e());
            l3.b(a13, F, aVar2.g());
            pc.p<p1.g, Integer, dc.w> b10 = aVar2.b();
            if (a13.n() || !qc.q.d(a13.f(), Integer.valueOf(a10))) {
                a13.J(Integer.valueOf(a10));
                a13.I(Integer.valueOf(a10), b10);
            }
            a12.invoke(i2.a(i2.b(q10)), q10, 0);
            q10.e(2058660585);
            androidx.compose.ui.e k10 = androidx.compose.foundation.layout.j.k(androidx.compose.ui.layout.a.b(aVar, "text"), 0.0f, f14919e, 1, null);
            q10.e(733328855);
            b.a aVar3 = v0.b.f24258a;
            n1.i0 h10 = androidx.compose.foundation.layout.d.h(aVar3.n(), false, q10, 0);
            q10.e(-1323940314);
            int a14 = j0.j.a(q10, 0);
            j0.v F2 = q10.F();
            pc.a<p1.g> a15 = aVar2.a();
            pc.q<i2<p1.g>, j0.l, Integer, dc.w> a16 = n1.x.a(k10);
            if (!(q10.u() instanceof j0.f)) {
                j0.j.c();
            }
            q10.s();
            if (q10.n()) {
                q10.B(a15);
            } else {
                q10.H();
            }
            j0.l a17 = l3.a(q10);
            l3.b(a17, h10, aVar2.e());
            l3.b(a17, F2, aVar2.g());
            pc.p<p1.g, Integer, dc.w> b11 = aVar2.b();
            if (a17.n() || !qc.q.d(a17.f(), Integer.valueOf(a14))) {
                a17.J(Integer.valueOf(a14));
                a17.I(Integer.valueOf(a14), b11);
            }
            a16.invoke(i2.a(i2.b(q10)), q10, 0);
            q10.e(2058660585);
            androidx.compose.foundation.layout.e eVar = androidx.compose.foundation.layout.e.f2083a;
            pVar.invoke(q10, Integer.valueOf(i11 & 14));
            q10.N();
            q10.O();
            q10.N();
            q10.N();
            androidx.compose.ui.e b12 = androidx.compose.ui.layout.a.b(aVar, "action");
            q10.e(733328855);
            n1.i0 h11 = androidx.compose.foundation.layout.d.h(aVar3.n(), false, q10, 0);
            q10.e(-1323940314);
            int a18 = j0.j.a(q10, 0);
            j0.v F3 = q10.F();
            pc.a<p1.g> a19 = aVar2.a();
            pc.q<i2<p1.g>, j0.l, Integer, dc.w> a20 = n1.x.a(b12);
            if (!(q10.u() instanceof j0.f)) {
                j0.j.c();
            }
            q10.s();
            if (q10.n()) {
                q10.B(a19);
            } else {
                q10.H();
            }
            j0.l a21 = l3.a(q10);
            l3.b(a21, h11, aVar2.e());
            l3.b(a21, F3, aVar2.g());
            pc.p<p1.g, Integer, dc.w> b13 = aVar2.b();
            if (a21.n() || !qc.q.d(a21.f(), Integer.valueOf(a18))) {
                a21.J(Integer.valueOf(a18));
                a21.I(Integer.valueOf(a18), b13);
            }
            a20.invoke(i2.a(i2.b(q10)), q10, 0);
            q10.e(2058660585);
            pVar2.invoke(q10, Integer.valueOf((i11 >> 3) & 14));
            q10.N();
            q10.O();
            q10.N();
            q10.N();
            q10.N();
            q10.O();
            q10.N();
            if (j0.n.K()) {
                j0.n.U();
            }
        }
        j0.g2 w10 = q10.w();
        if (w10 != null) {
            w10.a(new c(pVar, pVar2, i10));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:142:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0121  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(androidx.compose.ui.e r27, pc.p<? super j0.l, ? super java.lang.Integer, dc.w> r28, boolean r29, a1.q4 r30, long r31, long r33, float r35, pc.p<? super j0.l, ? super java.lang.Integer, dc.w> r36, j0.l r37, int r38, int r39) {
        /*
            Method dump skipped, instructions count: 517
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.o1.c(androidx.compose.ui.e, pc.p, boolean, a1.q4, long, long, float, pc.p, j0.l, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:153:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0126  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(f0.j1 r29, androidx.compose.ui.e r30, boolean r31, a1.q4 r32, long r33, long r35, long r37, float r39, j0.l r40, int r41, int r42) {
        /*
            Method dump skipped, instructions count: 587
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.o1.d(f0.j1, androidx.compose.ui.e, boolean, a1.q4, long, long, long, float, j0.l, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(pc.p<? super j0.l, ? super Integer, dc.w> pVar, j0.l lVar, int i10) {
        int i11;
        int i12;
        j0.l q10 = lVar.q(917397959);
        if ((i10 & 14) == 0) {
            if (q10.l(pVar)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i11 = i12 | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 11) == 2 && q10.t()) {
            q10.z();
        } else {
            if (j0.n.K()) {
                j0.n.V(917397959, i11, -1, "androidx.compose.material.TextOnlySnackbar (Snackbar.kt:235)");
            }
            i iVar = i.f14976a;
            q10.e(-1323940314);
            e.a aVar = androidx.compose.ui.e.f2335a;
            int a10 = j0.j.a(q10, 0);
            j0.v F = q10.F();
            g.a aVar2 = p1.g.f20790l;
            pc.a<p1.g> a11 = aVar2.a();
            pc.q<i2<p1.g>, j0.l, Integer, dc.w> a12 = n1.x.a(aVar);
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
            l3.b(a13, iVar, aVar2.e());
            l3.b(a13, F, aVar2.g());
            pc.p<p1.g, Integer, dc.w> b10 = aVar2.b();
            if (a13.n() || !qc.q.d(a13.f(), Integer.valueOf(a10))) {
                a13.J(Integer.valueOf(a10));
                a13.I(Integer.valueOf(a10), b10);
            }
            a12.invoke(i2.a(i2.b(q10)), q10, 0);
            q10.e(2058660585);
            androidx.compose.ui.e j10 = androidx.compose.foundation.layout.j.j(aVar, f14916b, f14919e);
            q10.e(733328855);
            n1.i0 h10 = androidx.compose.foundation.layout.d.h(v0.b.f24258a.n(), false, q10, 0);
            q10.e(-1323940314);
            int a14 = j0.j.a(q10, 0);
            j0.v F2 = q10.F();
            pc.a<p1.g> a15 = aVar2.a();
            pc.q<i2<p1.g>, j0.l, Integer, dc.w> a16 = n1.x.a(j10);
            if (!(q10.u() instanceof j0.f)) {
                j0.j.c();
            }
            q10.s();
            if (q10.n()) {
                q10.B(a15);
            } else {
                q10.H();
            }
            j0.l a17 = l3.a(q10);
            l3.b(a17, h10, aVar2.e());
            l3.b(a17, F2, aVar2.g());
            pc.p<p1.g, Integer, dc.w> b11 = aVar2.b();
            if (a17.n() || !qc.q.d(a17.f(), Integer.valueOf(a14))) {
                a17.J(Integer.valueOf(a14));
                a17.I(Integer.valueOf(a14), b11);
            }
            a16.invoke(i2.a(i2.b(q10)), q10, 0);
            q10.e(2058660585);
            androidx.compose.foundation.layout.e eVar = androidx.compose.foundation.layout.e.f2083a;
            pVar.invoke(q10, Integer.valueOf(i11 & 14));
            q10.N();
            q10.O();
            q10.N();
            q10.N();
            q10.N();
            q10.O();
            q10.N();
            if (j0.n.K()) {
                j0.n.U();
            }
        }
        j0.g2 w10 = q10.w();
        if (w10 != null) {
            w10.a(new j(pVar, i10));
        }
    }
}
