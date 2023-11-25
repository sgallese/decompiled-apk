package f0;

import a1.s4;
import j0.g3;
import s.o0;

/* compiled from: ProgressIndicator.kt */
/* loaded from: classes.dex */
public final class d1 {

    /* renamed from: a  reason: collision with root package name */
    private static final float f14512a = c1.f14467a.b();

    /* renamed from: b  reason: collision with root package name */
    private static final float f14513b = j2.h.j(240);

    /* renamed from: c  reason: collision with root package name */
    private static final float f14514c = j2.h.j(40);

    /* renamed from: d  reason: collision with root package name */
    private static final s.w f14515d = new s.w(0.2f, 0.0f, 0.8f, 1.0f);

    /* renamed from: e  reason: collision with root package name */
    private static final s.w f14516e = new s.w(0.4f, 0.0f, 1.0f, 1.0f);

    /* renamed from: f  reason: collision with root package name */
    private static final s.w f14517f = new s.w(0.0f, 0.0f, 0.65f, 1.0f);

    /* renamed from: g  reason: collision with root package name */
    private static final s.w f14518g = new s.w(0.1f, 0.0f, 0.45f, 1.0f);

    /* renamed from: h  reason: collision with root package name */
    private static final s.w f14519h = new s.w(0.4f, 0.0f, 0.2f, 1.0f);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProgressIndicator.kt */
    /* loaded from: classes.dex */
    public static final class a extends qc.r implements pc.l<c1.f, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ long f14520f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ c1.l f14521m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ float f14522p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ long f14523q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ g3<Integer> f14524r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ g3<Float> f14525s;

        /* renamed from: t  reason: collision with root package name */
        final /* synthetic */ g3<Float> f14526t;

        /* renamed from: u  reason: collision with root package name */
        final /* synthetic */ g3<Float> f14527u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(long j10, c1.l lVar, float f10, long j11, g3<Integer> g3Var, g3<Float> g3Var2, g3<Float> g3Var3, g3<Float> g3Var4) {
            super(1);
            this.f14520f = j10;
            this.f14521m = lVar;
            this.f14522p = f10;
            this.f14523q = j11;
            this.f14524r = g3Var;
            this.f14525s = g3Var2;
            this.f14526t = g3Var3;
            this.f14527u = g3Var4;
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ dc.w invoke(c1.f fVar) {
            invoke2(fVar);
            return dc.w.f13270a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(c1.f fVar) {
            qc.q.i(fVar, "$this$Canvas");
            d1.q(fVar, this.f14520f, this.f14521m);
            d1.r(fVar, d1.c(this.f14526t) + (((d1.d(this.f14524r) * 216.0f) % 360.0f) - 90.0f) + d1.e(this.f14527u), this.f14522p, Math.abs(d1.b(this.f14525s) - d1.c(this.f14526t)), this.f14523q, this.f14521m);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProgressIndicator.kt */
    /* loaded from: classes.dex */
    public static final class b extends qc.r implements pc.p<j0.l, Integer, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f14528f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ long f14529m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ float f14530p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ long f14531q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ int f14532r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ int f14533s;

        /* renamed from: t  reason: collision with root package name */
        final /* synthetic */ int f14534t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(androidx.compose.ui.e eVar, long j10, float f10, long j11, int i10, int i11, int i12) {
            super(2);
            this.f14528f = eVar;
            this.f14529m = j10;
            this.f14530p = f10;
            this.f14531q = j11;
            this.f14532r = i10;
            this.f14533s = i11;
            this.f14534t = i12;
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ dc.w invoke(j0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return dc.w.f13270a;
        }

        public final void invoke(j0.l lVar, int i10) {
            d1.a(this.f14528f, this.f14529m, this.f14530p, this.f14531q, this.f14532r, lVar, j0.z1.a(this.f14533s | 1), this.f14534t);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProgressIndicator.kt */
    /* loaded from: classes.dex */
    public static final class c extends qc.r implements pc.l<o0.b<Float>, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        public static final c f14535f = new c();

        c() {
            super(1);
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ dc.w invoke(o0.b<Float> bVar) {
            invoke2(bVar);
            return dc.w.f13270a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(o0.b<Float> bVar) {
            qc.q.i(bVar, "$this$keyframes");
            bVar.e(1332);
            bVar.f(bVar.a(Float.valueOf(0.0f), 0), d1.f14519h);
            bVar.a(Float.valueOf(290.0f), 666);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProgressIndicator.kt */
    /* loaded from: classes.dex */
    public static final class d extends qc.r implements pc.l<o0.b<Float>, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        public static final d f14536f = new d();

        d() {
            super(1);
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ dc.w invoke(o0.b<Float> bVar) {
            invoke2(bVar);
            return dc.w.f13270a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(o0.b<Float> bVar) {
            qc.q.i(bVar, "$this$keyframes");
            bVar.e(1332);
            bVar.f(bVar.a(Float.valueOf(0.0f), 666), d1.f14519h);
            bVar.a(Float.valueOf(290.0f), bVar.c());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProgressIndicator.kt */
    /* loaded from: classes.dex */
    public static final class e extends qc.r implements pc.l<c1.f, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ long f14537f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ int f14538m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ float f14539p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ long f14540q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(long j10, int i10, float f10, long j11) {
            super(1);
            this.f14537f = j10;
            this.f14538m = i10;
            this.f14539p = f10;
            this.f14540q = j11;
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ dc.w invoke(c1.f fVar) {
            invoke2(fVar);
            return dc.w.f13270a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(c1.f fVar) {
            qc.q.i(fVar, "$this$Canvas");
            float g10 = z0.l.g(fVar.b());
            d1.t(fVar, this.f14537f, g10, this.f14538m);
            d1.s(fVar, 0.0f, this.f14539p, this.f14540q, g10, this.f14538m);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProgressIndicator.kt */
    /* loaded from: classes.dex */
    public static final class f extends qc.r implements pc.p<j0.l, Integer, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ float f14541f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f14542m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ long f14543p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ long f14544q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ int f14545r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ int f14546s;

        /* renamed from: t  reason: collision with root package name */
        final /* synthetic */ int f14547t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(float f10, androidx.compose.ui.e eVar, long j10, long j11, int i10, int i11, int i12) {
            super(2);
            this.f14541f = f10;
            this.f14542m = eVar;
            this.f14543p = j10;
            this.f14544q = j11;
            this.f14545r = i10;
            this.f14546s = i11;
            this.f14547t = i12;
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ dc.w invoke(j0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return dc.w.f13270a;
        }

        public final void invoke(j0.l lVar, int i10) {
            d1.f(this.f14541f, this.f14542m, this.f14543p, this.f14544q, this.f14545r, lVar, j0.z1.a(this.f14546s | 1), this.f14547t);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(androidx.compose.ui.e r25, long r26, float r28, long r29, int r31, j0.l r32, int r33, int r34) {
        /*
            Method dump skipped, instructions count: 630
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.d1.a(androidx.compose.ui.e, long, float, long, int, j0.l, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float b(g3<Float> g3Var) {
        return g3Var.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float c(g3<Float> g3Var) {
        return g3Var.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int d(g3<Integer> g3Var) {
        return g3Var.getValue().intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float e(g3<Float> g3Var) {
        return g3Var.getValue().floatValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x014c A[LOOP:0: B:85:0x014a->B:86:0x014c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0191  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(float r22, androidx.compose.ui.e r23, long r24, long r26, int r28, j0.l r29, int r30, int r31) {
        /*
            Method dump skipped, instructions count: 419
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.d1.f(float, androidx.compose.ui.e, long, long, int, j0.l, int, int):void");
    }

    private static final void p(c1.f fVar, float f10, float f11, long j10, c1.l lVar) {
        float f12 = 2;
        float f13 = lVar.f() / f12;
        float i10 = z0.l.i(fVar.b()) - (f12 * f13);
        c1.e.d(fVar, j10, f10, f11, false, z0.g.a(f13, f13), z0.m.a(i10, i10), 0.0f, lVar, null, 0, 832, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(c1.f fVar, long j10, c1.l lVar) {
        p(fVar, 0.0f, 360.0f, j10, lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(c1.f fVar, float f10, float f11, float f12, long j10, c1.l lVar) {
        float j11;
        if (s4.g(lVar.b(), s4.f186b.a())) {
            j11 = 0.0f;
        } else {
            j11 = ((f11 / j2.h.j(f14514c / 2)) * 57.29578f) / 2.0f;
        }
        p(fVar, f10 + j11, Math.max(f12, 0.1f), j10, lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(c1.f fVar, float f10, float f11, long j10, float f12, int i10) {
        boolean z10;
        float f13;
        float f14;
        vc.b b10;
        Comparable o10;
        Comparable o11;
        float i11 = z0.l.i(fVar.b());
        float g10 = z0.l.g(fVar.b());
        float f15 = 2;
        float f16 = g10 / f15;
        if (fVar.getLayoutDirection() == j2.r.Ltr) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            f13 = f10;
        } else {
            f13 = 1.0f - f11;
        }
        float f17 = f13 * i11;
        if (z10) {
            f14 = f11;
        } else {
            f14 = 1.0f - f10;
        }
        float f18 = f14 * i11;
        if (!s4.g(i10, s4.f186b.a()) && g10 <= i11) {
            float f19 = f12 / f15;
            b10 = vc.k.b(f19, i11 - f19);
            o10 = vc.l.o(Float.valueOf(f17), b10);
            float floatValue = ((Number) o10).floatValue();
            o11 = vc.l.o(Float.valueOf(f18), b10);
            float floatValue2 = ((Number) o11).floatValue();
            if (Math.abs(f11 - f10) > 0.0f) {
                c1.e.j(fVar, j10, z0.g.a(floatValue, f16), z0.g.a(floatValue2, f16), f12, i10, null, 0.0f, null, 0, 480, null);
                return;
            }
            return;
        }
        c1.e.j(fVar, j10, z0.g.a(f17, f16), z0.g.a(f18, f16), f12, 0, null, 0.0f, null, 0, 496, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(c1.f fVar, long j10, float f10, int i10) {
        s(fVar, 0.0f, 1.0f, j10, f10, i10);
    }
}
