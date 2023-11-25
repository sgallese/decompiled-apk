package b1;

import a1.r1;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Arrays;

/* compiled from: Rgb.kt */
/* loaded from: classes.dex */
public final class w extends b1.c {

    /* renamed from: t  reason: collision with root package name */
    public static final a f7708t = new a(null);

    /* renamed from: u  reason: collision with root package name */
    private static final i f7709u = new i() { // from class: b1.p
        @Override // b1.i
        public final double a(double d10) {
            double x10;
            x10 = w.x(d10);
            return x10;
        }
    };

    /* renamed from: e  reason: collision with root package name */
    private final y f7710e;

    /* renamed from: f  reason: collision with root package name */
    private final float f7711f;

    /* renamed from: g  reason: collision with root package name */
    private final float f7712g;

    /* renamed from: h  reason: collision with root package name */
    private final x f7713h;

    /* renamed from: i  reason: collision with root package name */
    private final float[] f7714i;

    /* renamed from: j  reason: collision with root package name */
    private final float[] f7715j;

    /* renamed from: k  reason: collision with root package name */
    private final float[] f7716k;

    /* renamed from: l  reason: collision with root package name */
    private final i f7717l;

    /* renamed from: m  reason: collision with root package name */
    private final pc.l<Double, Double> f7718m;

    /* renamed from: n  reason: collision with root package name */
    private final i f7719n;

    /* renamed from: o  reason: collision with root package name */
    private final i f7720o;

    /* renamed from: p  reason: collision with root package name */
    private final pc.l<Double, Double> f7721p;

    /* renamed from: q  reason: collision with root package name */
    private final i f7722q;

    /* renamed from: r  reason: collision with root package name */
    private final boolean f7723r;

    /* renamed from: s  reason: collision with root package name */
    private final boolean f7724s;

    /* compiled from: Rgb.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }

        private final float e(float[] fArr) {
            float f10 = fArr[0];
            float f11 = fArr[1];
            float f12 = fArr[2];
            float f13 = fArr[3];
            float f14 = fArr[4];
            float f15 = fArr[5];
            float f16 = ((((((f10 * f13) + (f11 * f14)) + (f12 * f15)) - (f13 * f14)) - (f11 * f12)) - (f10 * f15)) * 0.5f;
            if (f16 < 0.0f) {
                return -f16;
            }
            return f16;
        }

        private final boolean f(double d10, i iVar, i iVar2) {
            if (Math.abs(iVar.a(d10) - iVar2.a(d10)) <= 0.001d) {
                return true;
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float[] g(float[] fArr, y yVar) {
            float f10 = fArr[0];
            float f11 = fArr[1];
            float f12 = fArr[2];
            float f13 = fArr[3];
            float f14 = fArr[4];
            float f15 = fArr[5];
            float a10 = yVar.a();
            float b10 = yVar.b();
            float f16 = 1;
            float f17 = (f16 - f10) / f11;
            float f18 = (f16 - f12) / f13;
            float f19 = (f16 - f14) / f15;
            float f20 = (f16 - a10) / b10;
            float f21 = f10 / f11;
            float f22 = (f12 / f13) - f21;
            float f23 = (a10 / b10) - f21;
            float f24 = f18 - f17;
            float f25 = (f14 / f15) - f21;
            float f26 = (((f20 - f17) * f22) - (f23 * f24)) / (((f19 - f17) * f22) - (f24 * f25));
            float f27 = (f23 - (f25 * f26)) / f22;
            float f28 = (1.0f - f27) - f26;
            float f29 = f28 / f11;
            float f30 = f27 / f13;
            float f31 = f26 / f15;
            return new float[]{f29 * f10, f28, f29 * ((1.0f - f10) - f11), f30 * f12, f27, f30 * ((1.0f - f12) - f13), f31 * f14, f26, f31 * ((1.0f - f14) - f15)};
        }

        private final boolean h(float[] fArr, float[] fArr2) {
            float f10 = fArr[0] - fArr2[0];
            float f11 = fArr[1] - fArr2[1];
            float[] fArr3 = {f10, f11, fArr[2] - fArr2[2], fArr[3] - fArr2[3], fArr[4] - fArr2[4], fArr[5] - fArr2[5]};
            if (i(f10, f11, fArr2[0] - fArr2[4], fArr2[1] - fArr2[5]) < 0.0f || i(fArr2[0] - fArr2[2], fArr2[1] - fArr2[3], fArr3[0], fArr3[1]) < 0.0f || i(fArr3[2], fArr3[3], fArr2[2] - fArr2[0], fArr2[3] - fArr2[1]) < 0.0f || i(fArr2[2] - fArr2[4], fArr2[3] - fArr2[5], fArr3[2], fArr3[3]) < 0.0f || i(fArr3[4], fArr3[5], fArr2[4] - fArr2[2], fArr2[5] - fArr2[3]) < 0.0f || i(fArr2[4] - fArr2[0], fArr2[5] - fArr2[1], fArr3[4], fArr3[5]) < 0.0f) {
                return false;
            }
            return true;
        }

        private final float i(float f10, float f11, float f12, float f13) {
            return (f10 * f13) - (f11 * f12);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean j(float[] fArr, y yVar, i iVar, i iVar2, float f10, float f11, int i10) {
            boolean z10;
            boolean z11;
            if (i10 == 0) {
                return true;
            }
            g gVar = g.f7641a;
            if (!d.g(fArr, gVar.x()) || !d.f(yVar, j.f7678a.e())) {
                return false;
            }
            if (f10 == 0.0f) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                return false;
            }
            if (f11 == 1.0f) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11) {
                return false;
            }
            w w10 = gVar.w();
            for (double d10 = 0.0d; d10 <= 1.0d; d10 += 0.00392156862745098d) {
                if (!f(d10, iVar, w10.N()) || !f(d10, iVar2, w10.J())) {
                    return false;
                }
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean k(float[] fArr, float f10, float f11) {
            float e10 = e(fArr);
            g gVar = g.f7641a;
            if ((e10 / e(gVar.s()) > 0.9f && h(fArr, gVar.x())) || (f10 < 0.0f && f11 > 1.0f)) {
                return true;
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float[] l(float[] fArr) {
            float[] fArr2 = new float[6];
            if (fArr.length != 9) {
                ec.o.k(fArr, fArr2, 0, 0, 6, 6, null);
            } else {
                float f10 = fArr[0];
                float f11 = fArr[1];
                float f12 = f10 + f11 + fArr[2];
                fArr2[0] = f10 / f12;
                fArr2[1] = f11 / f12;
                float f13 = fArr[3];
                float f14 = fArr[4];
                float f15 = f13 + f14 + fArr[5];
                fArr2[2] = f13 / f15;
                fArr2[3] = f14 / f15;
                float f16 = fArr[6];
                float f17 = fArr[7];
                float f18 = f16 + f17 + fArr[8];
                fArr2[4] = f16 / f18;
                fArr2[5] = f17 / f18;
            }
            return fArr2;
        }
    }

    /* compiled from: Rgb.kt */
    /* loaded from: classes.dex */
    static final class b extends qc.r implements pc.l<Double, Double> {
        b() {
            super(1);
        }

        public final Double a(double d10) {
            double j10;
            i J = w.this.J();
            j10 = vc.l.j(d10, w.this.f7711f, w.this.f7712g);
            return Double.valueOf(J.a(j10));
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ Double invoke(Double d10) {
            return a(d10.doubleValue());
        }
    }

    /* compiled from: Rgb.kt */
    /* loaded from: classes.dex */
    static final class c extends qc.r implements pc.l<Double, Double> {
        c() {
            super(1);
        }

        public final Double a(double d10) {
            double j10;
            j10 = vc.l.j(w.this.N().a(d10), w.this.f7711f, w.this.f7712g);
            return Double.valueOf(j10);
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ Double invoke(Double d10) {
            return a(d10.doubleValue());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(String str, float[] fArr, y yVar, float[] fArr2, i iVar, i iVar2, float f10, float f11, x xVar, int i10) {
        super(str, b1.b.f7632a.b(), i10, null);
        qc.q.i(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        qc.q.i(fArr, "primaries");
        qc.q.i(yVar, "whitePoint");
        qc.q.i(iVar, "oetf");
        qc.q.i(iVar2, "eotf");
        this.f7710e = yVar;
        this.f7711f = f10;
        this.f7712g = f11;
        this.f7713h = xVar;
        this.f7717l = iVar;
        this.f7718m = new c();
        this.f7719n = new i() { // from class: b1.n
            @Override // b1.i
            public final double a(double d10) {
                double S;
                S = w.S(w.this, d10);
                return S;
            }
        };
        this.f7720o = iVar2;
        this.f7721p = new b();
        this.f7722q = new i() { // from class: b1.o
            @Override // b1.i
            public final double a(double d10) {
                double G;
                G = w.G(w.this, d10);
                return G;
            }
        };
        if (fArr.length != 6 && fArr.length != 9) {
            throw new IllegalArgumentException("The color space's primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ");
        }
        if (f10 < f11) {
            a aVar = f7708t;
            float[] l10 = aVar.l(fArr);
            this.f7714i = l10;
            if (fArr2 == null) {
                this.f7715j = aVar.g(l10, yVar);
            } else if (fArr2.length == 9) {
                this.f7715j = fArr2;
            } else {
                throw new IllegalArgumentException("Transform must have 9 entries! Has " + fArr2.length);
            }
            this.f7716k = d.j(this.f7715j);
            this.f7723r = aVar.k(l10, f10, f11);
            this.f7724s = aVar.j(l10, yVar, iVar, iVar2, f10, f11, i10);
            return;
        }
        throw new IllegalArgumentException("Invalid range: min=" + f10 + ", max=" + f11 + "; min must be strictly < max");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double A(x xVar, double d10) {
        qc.q.i(xVar, "$function");
        return d.q(d10, xVar.a(), xVar.b(), xVar.c(), xVar.d(), xVar.g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double B(x xVar, double d10) {
        qc.q.i(xVar, "$function");
        return d.r(d10, xVar.a(), xVar.b(), xVar.c(), xVar.d(), xVar.e(), xVar.f(), xVar.g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double C(x xVar, double d10) {
        qc.q.i(xVar, "$function");
        return d.s(d10, xVar.a(), xVar.b(), xVar.c(), xVar.d(), xVar.g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double D(x xVar, double d10) {
        qc.q.i(xVar, "$function");
        return d.t(d10, xVar.a(), xVar.b(), xVar.c(), xVar.d(), xVar.e(), xVar.f(), xVar.g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double G(w wVar, double d10) {
        double j10;
        qc.q.i(wVar, "this$0");
        i iVar = wVar.f7720o;
        j10 = vc.l.j(d10, wVar.f7711f, wVar.f7712g);
        return iVar.a(j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double S(w wVar, double d10) {
        double j10;
        qc.q.i(wVar, "this$0");
        j10 = vc.l.j(wVar.f7717l.a(d10), wVar.f7711f, wVar.f7712g);
        return j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double y(double d10, double d11) {
        if (d11 < 0.0d) {
            d11 = 0.0d;
        }
        return Math.pow(d11, 1.0d / d10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double z(double d10, double d11) {
        if (d11 < 0.0d) {
            d11 = 0.0d;
        }
        return Math.pow(d11, d10);
    }

    public final pc.l<Double, Double> H() {
        return this.f7721p;
    }

    public final i I() {
        return this.f7722q;
    }

    public final i J() {
        return this.f7720o;
    }

    public final float[] K() {
        return this.f7716k;
    }

    public final pc.l<Double, Double> L() {
        return this.f7718m;
    }

    public final i M() {
        return this.f7719n;
    }

    public final i N() {
        return this.f7717l;
    }

    public final float[] O() {
        return this.f7714i;
    }

    public final x P() {
        return this.f7713h;
    }

    public final float[] Q() {
        return this.f7715j;
    }

    public final y R() {
        return this.f7710e;
    }

    @Override // b1.c
    public float[] b(float[] fArr) {
        qc.q.i(fArr, "v");
        d.m(this.f7716k, fArr);
        fArr[0] = (float) this.f7719n.a(fArr[0]);
        fArr[1] = (float) this.f7719n.a(fArr[1]);
        fArr[2] = (float) this.f7719n.a(fArr[2]);
        return fArr;
    }

    @Override // b1.c
    public float e(int i10) {
        return this.f7712g;
    }

    @Override // b1.c
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || w.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        w wVar = (w) obj;
        if (Float.compare(wVar.f7711f, this.f7711f) != 0 || Float.compare(wVar.f7712g, this.f7712g) != 0 || !qc.q.d(this.f7710e, wVar.f7710e) || !Arrays.equals(this.f7714i, wVar.f7714i)) {
            return false;
        }
        x xVar = this.f7713h;
        if (xVar != null) {
            return qc.q.d(xVar, wVar.f7713h);
        }
        if (wVar.f7713h == null) {
            return true;
        }
        if (!qc.q.d(this.f7717l, wVar.f7717l)) {
            return false;
        }
        return qc.q.d(this.f7720o, wVar.f7720o);
    }

    @Override // b1.c
    public float f(int i10) {
        return this.f7711f;
    }

    @Override // b1.c
    public int hashCode() {
        boolean z10;
        int i10;
        int i11;
        int hashCode = ((((super.hashCode() * 31) + this.f7710e.hashCode()) * 31) + Arrays.hashCode(this.f7714i)) * 31;
        float f10 = this.f7711f;
        boolean z11 = true;
        int i12 = 0;
        if (f10 == 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            i10 = Float.floatToIntBits(f10);
        } else {
            i10 = 0;
        }
        int i13 = (hashCode + i10) * 31;
        float f11 = this.f7712g;
        if (f11 != 0.0f) {
            z11 = false;
        }
        if (!z11) {
            i11 = Float.floatToIntBits(f11);
        } else {
            i11 = 0;
        }
        int i14 = (i13 + i11) * 31;
        x xVar = this.f7713h;
        if (xVar != null) {
            i12 = xVar.hashCode();
        }
        int i15 = i14 + i12;
        if (this.f7713h == null) {
            return (((i15 * 31) + this.f7717l.hashCode()) * 31) + this.f7720o.hashCode();
        }
        return i15;
    }

    @Override // b1.c
    public boolean i() {
        return this.f7724s;
    }

    @Override // b1.c
    public long j(float f10, float f11, float f12) {
        float a10 = (float) this.f7722q.a(f10);
        float a11 = (float) this.f7722q.a(f11);
        float a12 = (float) this.f7722q.a(f12);
        float n10 = d.n(this.f7715j, a10, a11, a12);
        float o10 = d.o(this.f7715j, a10, a11, a12);
        return (Float.floatToIntBits(n10) << 32) | (Float.floatToIntBits(o10) & 4294967295L);
    }

    @Override // b1.c
    public float[] l(float[] fArr) {
        qc.q.i(fArr, "v");
        fArr[0] = (float) this.f7722q.a(fArr[0]);
        fArr[1] = (float) this.f7722q.a(fArr[1]);
        fArr[2] = (float) this.f7722q.a(fArr[2]);
        return d.m(this.f7715j, fArr);
    }

    @Override // b1.c
    public float m(float f10, float f11, float f12) {
        return d.p(this.f7715j, (float) this.f7722q.a(f10), (float) this.f7722q.a(f11), (float) this.f7722q.a(f12));
    }

    @Override // b1.c
    public long n(float f10, float f11, float f12, float f13, b1.c cVar) {
        qc.q.i(cVar, "colorSpace");
        return r1.a((float) this.f7719n.a(d.n(this.f7716k, f10, f11, f12)), (float) this.f7719n.a(d.o(this.f7716k, f10, f11, f12)), (float) this.f7719n.a(d.p(this.f7716k, f10, f11, f12)), f13, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double x(double d10) {
        return d10;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public w(java.lang.String r15, float[] r16, b1.y r17, final b1.x r18, int r19) {
        /*
            r14 = this;
            r9 = r18
            java.lang.String r0 = "name"
            r1 = r15
            qc.q.i(r15, r0)
            java.lang.String r0 = "primaries"
            r2 = r16
            qc.q.i(r2, r0)
            java.lang.String r0 = "whitePoint"
            r3 = r17
            qc.q.i(r3, r0)
            java.lang.String r0 = "function"
            qc.q.i(r9, r0)
            r4 = 0
            double r5 = r18.e()
            r0 = 1
            r7 = 0
            r10 = 0
            int r8 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r8 != 0) goto L2a
            r5 = 1
            goto L2b
        L2a:
            r5 = 0
        L2b:
            if (r5 == 0) goto L40
            double r5 = r18.f()
            int r8 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r8 != 0) goto L37
            r5 = 1
            goto L38
        L37:
            r5 = 0
        L38:
            if (r5 == 0) goto L40
            b1.q r5 = new b1.q
            r5.<init>()
            goto L45
        L40:
            b1.r r5 = new b1.r
            r5.<init>()
        L45:
            double r12 = r18.e()
            int r6 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r6 != 0) goto L4f
            r6 = 1
            goto L50
        L4f:
            r6 = 0
        L50:
            if (r6 == 0) goto L64
            double r12 = r18.f()
            int r6 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r6 != 0) goto L5b
            goto L5c
        L5b:
            r0 = 0
        L5c:
            if (r0 == 0) goto L64
            b1.s r0 = new b1.s
            r0.<init>()
            goto L69
        L64:
            b1.t r0 = new b1.t
            r0.<init>()
        L69:
            r6 = r0
            r7 = 0
            r8 = 1065353216(0x3f800000, float:1.0)
            r0 = r14
            r1 = r15
            r2 = r16
            r3 = r17
            r9 = r18
            r10 = r19
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b1.w.<init>(java.lang.String, float[], b1.y, b1.x, int):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public w(java.lang.String r24, float[] r25, b1.y r26, final double r27, float r29, float r30, int r31) {
        /*
            r23 = this;
            r1 = r27
            java.lang.String r0 = "name"
            r15 = r24
            qc.q.i(r15, r0)
            java.lang.String r0 = "primaries"
            r13 = r25
            qc.q.i(r13, r0)
            java.lang.String r0 = "whitePoint"
            r14 = r26
            qc.q.i(r14, r0)
            r17 = 0
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r0 = 1
            r5 = 0
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 != 0) goto L23
            r3 = 1
            goto L24
        L23:
            r3 = 0
        L24:
            if (r3 == 0) goto L29
            b1.i r3 = b1.w.f7709u
            goto L2e
        L29:
            b1.u r3 = new b1.u
            r3.<init>()
        L2e:
            r18 = r3
            if (r6 != 0) goto L33
            goto L34
        L33:
            r0 = 0
        L34:
            if (r0 == 0) goto L39
            b1.i r0 = b1.w.f7709u
            goto L3e
        L39:
            b1.v r0 = new b1.v
            r0.<init>()
        L3e:
            r19 = r0
            b1.x r20 = new b1.x
            r0 = r20
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r5 = 0
            r7 = 0
            r9 = 0
            r11 = 0
            r21 = 0
            r13 = r21
            r16 = 96
            r15 = r16
            r16 = 0
            r1 = r27
            r0.<init>(r1, r3, r5, r7, r9, r11, r13, r15, r16)
            r1 = r23
            r2 = r24
            r3 = r25
            r4 = r26
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r29
            r9 = r30
            r10 = r20
            r11 = r31
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b1.w.<init>(java.lang.String, float[], b1.y, double, float, float, int):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public w(w wVar, float[] fArr, y yVar) {
        this(wVar.h(), wVar.f7714i, yVar, fArr, wVar.f7717l, wVar.f7720o, wVar.f7711f, wVar.f7712g, wVar.f7713h, -1);
        qc.q.i(wVar, "colorSpace");
        qc.q.i(fArr, "transform");
        qc.q.i(yVar, "whitePoint");
    }
}
