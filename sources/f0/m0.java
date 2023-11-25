package f0;

import a1.q4;
import androidx.compose.ui.e;
import j0.i2;
import j0.l3;
import p1.g;
import v0.b;

/* compiled from: FloatingActionButton.kt */
/* loaded from: classes.dex */
public final class m0 {

    /* renamed from: a  reason: collision with root package name */
    private static final float f14833a = j2.h.j(56);

    /* renamed from: b  reason: collision with root package name */
    private static final float f14834b = j2.h.j(48);

    /* renamed from: c  reason: collision with root package name */
    private static final float f14835c = j2.h.j(12);

    /* renamed from: d  reason: collision with root package name */
    private static final float f14836d = j2.h.j(20);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FloatingActionButton.kt */
    /* loaded from: classes.dex */
    public static final class a extends qc.r implements pc.p<j0.l, Integer, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ pc.p<j0.l, Integer, dc.w> f14837f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ int f14838m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ pc.p<j0.l, Integer, dc.w> f14839p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(pc.p<? super j0.l, ? super Integer, dc.w> pVar, int i10, pc.p<? super j0.l, ? super Integer, dc.w> pVar2) {
            super(2);
            this.f14837f = pVar;
            this.f14838m = i10;
            this.f14839p = pVar2;
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
                j0.n.V(1418981691, i10, -1, "androidx.compose.material.ExtendedFloatingActionButton.<anonymous> (FloatingActionButton.kt:168)");
            }
            float f10 = this.f14837f == null ? m0.f14836d : m0.f14835c;
            e.a aVar = androidx.compose.ui.e.f2335a;
            androidx.compose.ui.e m10 = androidx.compose.foundation.layout.j.m(aVar, f10, 0.0f, m0.f14836d, 0.0f, 10, null);
            b.c h10 = v0.b.f24258a.h();
            pc.p<j0.l, Integer, dc.w> pVar = this.f14837f;
            int i11 = this.f14838m;
            pc.p<j0.l, Integer, dc.w> pVar2 = this.f14839p;
            lVar.e(693286680);
            n1.i0 a10 = w.y.a(w.a.f25135a.e(), h10, lVar, 48);
            lVar.e(-1323940314);
            int a11 = j0.j.a(lVar, 0);
            j0.v F = lVar.F();
            g.a aVar2 = p1.g.f20790l;
            pc.a<p1.g> a12 = aVar2.a();
            pc.q<i2<p1.g>, j0.l, Integer, dc.w> a13 = n1.x.a(m10);
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
            pc.p<p1.g, Integer, dc.w> b10 = aVar2.b();
            if (a14.n() || !qc.q.d(a14.f(), Integer.valueOf(a11))) {
                a14.J(Integer.valueOf(a11));
                a14.I(Integer.valueOf(a11), b10);
            }
            a13.invoke(i2.a(i2.b(lVar)), lVar, 0);
            lVar.e(2058660585);
            w.b0 b0Var = w.b0.f25155a;
            lVar.e(-1435223598);
            if (pVar != null) {
                pVar.invoke(lVar, Integer.valueOf((i11 >> 9) & 14));
                w.d0.a(androidx.compose.foundation.layout.m.s(aVar, m0.f14835c), lVar, 6);
            }
            lVar.N();
            pVar2.invoke(lVar, Integer.valueOf(i11 & 14));
            lVar.N();
            lVar.O();
            lVar.N();
            lVar.N();
            if (j0.n.K()) {
                j0.n.U();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FloatingActionButton.kt */
    /* loaded from: classes.dex */
    public static final class b extends qc.r implements pc.p<j0.l, Integer, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ pc.p<j0.l, Integer, dc.w> f14840f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ pc.a<dc.w> f14841m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f14842p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ pc.p<j0.l, Integer, dc.w> f14843q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ v.m f14844r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ q4 f14845s;

        /* renamed from: t  reason: collision with root package name */
        final /* synthetic */ long f14846t;

        /* renamed from: u  reason: collision with root package name */
        final /* synthetic */ long f14847u;

        /* renamed from: v  reason: collision with root package name */
        final /* synthetic */ l0 f14848v;

        /* renamed from: w  reason: collision with root package name */
        final /* synthetic */ int f14849w;

        /* renamed from: x  reason: collision with root package name */
        final /* synthetic */ int f14850x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(pc.p<? super j0.l, ? super Integer, dc.w> pVar, pc.a<dc.w> aVar, androidx.compose.ui.e eVar, pc.p<? super j0.l, ? super Integer, dc.w> pVar2, v.m mVar, q4 q4Var, long j10, long j11, l0 l0Var, int i10, int i11) {
            super(2);
            this.f14840f = pVar;
            this.f14841m = aVar;
            this.f14842p = eVar;
            this.f14843q = pVar2;
            this.f14844r = mVar;
            this.f14845s = q4Var;
            this.f14846t = j10;
            this.f14847u = j11;
            this.f14848v = l0Var;
            this.f14849w = i10;
            this.f14850x = i11;
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ dc.w invoke(j0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return dc.w.f13270a;
        }

        public final void invoke(j0.l lVar, int i10) {
            m0.a(this.f14840f, this.f14841m, this.f14842p, this.f14843q, this.f14844r, this.f14845s, this.f14846t, this.f14847u, this.f14848v, lVar, j0.z1.a(this.f14849w | 1), this.f14850x);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FloatingActionButton.kt */
    /* loaded from: classes.dex */
    public static final class c extends qc.r implements pc.l<t1.x, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        public static final c f14851f = new c();

        c() {
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
    /* compiled from: FloatingActionButton.kt */
    /* loaded from: classes.dex */
    public static final class d extends qc.r implements pc.p<j0.l, Integer, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ long f14852f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ pc.p<j0.l, Integer, dc.w> f14853m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ int f14854p;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: FloatingActionButton.kt */
        /* loaded from: classes.dex */
        public static final class a extends qc.r implements pc.p<j0.l, Integer, dc.w> {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ pc.p<j0.l, Integer, dc.w> f14855f;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ int f14856m;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: FloatingActionButton.kt */
            /* renamed from: f0.m0$d$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0351a extends qc.r implements pc.p<j0.l, Integer, dc.w> {

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ pc.p<j0.l, Integer, dc.w> f14857f;

                /* renamed from: m  reason: collision with root package name */
                final /* synthetic */ int f14858m;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C0351a(pc.p<? super j0.l, ? super Integer, dc.w> pVar, int i10) {
                    super(2);
                    this.f14857f = pVar;
                    this.f14858m = i10;
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
                        j0.n.V(-1567914264, i10, -1, "androidx.compose.material.FloatingActionButton.<anonymous>.<anonymous>.<anonymous> (FloatingActionButton.kt:101)");
                    }
                    androidx.compose.ui.e a10 = androidx.compose.foundation.layout.m.a(androidx.compose.ui.e.f2335a, m0.f14833a, m0.f14833a);
                    v0.b d10 = v0.b.f24258a.d();
                    pc.p<j0.l, Integer, dc.w> pVar = this.f14857f;
                    int i11 = this.f14858m;
                    lVar.e(733328855);
                    n1.i0 h10 = androidx.compose.foundation.layout.d.h(d10, false, lVar, 6);
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
                    androidx.compose.foundation.layout.e eVar = androidx.compose.foundation.layout.e.f2083a;
                    pVar.invoke(lVar, Integer.valueOf((i11 >> 21) & 14));
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
            a(pc.p<? super j0.l, ? super Integer, dc.w> pVar, int i10) {
                super(2);
                this.f14855f = pVar;
                this.f14856m = i10;
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
                    j0.n.V(1867794295, i10, -1, "androidx.compose.material.FloatingActionButton.<anonymous>.<anonymous> (FloatingActionButton.kt:100)");
                }
                f2.a(s0.f15068a.c(lVar, 6).d(), q0.c.b(lVar, -1567914264, true, new C0351a(this.f14855f, this.f14856m)), lVar, 48);
                if (j0.n.K()) {
                    j0.n.U();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(long j10, pc.p<? super j0.l, ? super Integer, dc.w> pVar, int i10) {
            super(2);
            this.f14852f = j10;
            this.f14853m = pVar;
            this.f14854p = i10;
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
                j0.n.V(1972871863, i10, -1, "androidx.compose.material.FloatingActionButton.<anonymous> (FloatingActionButton.kt:99)");
            }
            j0.u.a(new j0.w1[]{o.a().c(Float.valueOf(a1.p1.r(this.f14852f)))}, q0.c.b(lVar, 1867794295, true, new a(this.f14853m, this.f14854p)), lVar, 56);
            if (j0.n.K()) {
                j0.n.U();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FloatingActionButton.kt */
    /* loaded from: classes.dex */
    public static final class e extends qc.r implements pc.p<j0.l, Integer, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ pc.a<dc.w> f14859f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f14860m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ v.m f14861p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ q4 f14862q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ long f14863r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ long f14864s;

        /* renamed from: t  reason: collision with root package name */
        final /* synthetic */ l0 f14865t;

        /* renamed from: u  reason: collision with root package name */
        final /* synthetic */ pc.p<j0.l, Integer, dc.w> f14866u;

        /* renamed from: v  reason: collision with root package name */
        final /* synthetic */ int f14867v;

        /* renamed from: w  reason: collision with root package name */
        final /* synthetic */ int f14868w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(pc.a<dc.w> aVar, androidx.compose.ui.e eVar, v.m mVar, q4 q4Var, long j10, long j11, l0 l0Var, pc.p<? super j0.l, ? super Integer, dc.w> pVar, int i10, int i11) {
            super(2);
            this.f14859f = aVar;
            this.f14860m = eVar;
            this.f14861p = mVar;
            this.f14862q = q4Var;
            this.f14863r = j10;
            this.f14864s = j11;
            this.f14865t = l0Var;
            this.f14866u = pVar;
            this.f14867v = i10;
            this.f14868w = i11;
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ dc.w invoke(j0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return dc.w.f13270a;
        }

        public final void invoke(j0.l lVar, int i10) {
            m0.b(this.f14859f, this.f14860m, this.f14861p, this.f14862q, this.f14863r, this.f14864s, this.f14865t, this.f14866u, lVar, j0.z1.a(this.f14867v | 1), this.f14868w);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:162:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0116  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(pc.p<? super j0.l, ? super java.lang.Integer, dc.w> r29, pc.a<dc.w> r30, androidx.compose.ui.e r31, pc.p<? super j0.l, ? super java.lang.Integer, dc.w> r32, v.m r33, a1.q4 r34, long r35, long r37, f0.l0 r39, j0.l r40, int r41, int r42) {
        /*
            Method dump skipped, instructions count: 713
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.m0.a(pc.p, pc.a, androidx.compose.ui.e, pc.p, v.m, a1.q4, long, long, f0.l0, j0.l, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(pc.a<dc.w> r28, androidx.compose.ui.e r29, v.m r30, a1.q4 r31, long r32, long r34, f0.l0 r36, pc.p<? super j0.l, ? super java.lang.Integer, dc.w> r37, j0.l r38, int r39, int r40) {
        /*
            Method dump skipped, instructions count: 658
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.m0.b(pc.a, androidx.compose.ui.e, v.m, a1.q4, long, long, f0.l0, pc.p, j0.l, int, int):void");
    }
}
