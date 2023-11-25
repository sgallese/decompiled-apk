package b1;

import a1.r1;
import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* compiled from: Oklab.kt */
/* loaded from: classes.dex */
public final class l extends c {

    /* renamed from: e  reason: collision with root package name */
    public static final a f7690e = new a(null);

    /* renamed from: f  reason: collision with root package name */
    private static final float[] f7691f;

    /* renamed from: g  reason: collision with root package name */
    private static final float[] f7692g;

    /* renamed from: h  reason: collision with root package name */
    private static final float[] f7693h;

    /* renamed from: i  reason: collision with root package name */
    private static final float[] f7694i;

    /* compiled from: Oklab.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }
    }

    static {
        float[] b10 = b1.a.f7627b.a().b();
        j jVar = j.f7678a;
        float[] k10 = d.k(new float[]{0.818933f, 0.032984544f, 0.0482003f, 0.36186674f, 0.9293119f, 0.26436627f, -0.12885971f, 0.03614564f, 0.6338517f}, d.e(b10, jVar.b().c(), jVar.e().c()));
        f7691f = k10;
        float[] fArr = {0.21045426f, 1.9779985f, 0.025904037f, 0.7936178f, -2.4285922f, 0.78277177f, -0.004072047f, 0.4505937f, -0.80867577f};
        f7692g = fArr;
        f7693h = d.j(k10);
        f7694i = d.j(fArr);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(String str, int i10) {
        super(str, b.f7632a.a(), i10, null);
        qc.q.i(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
    }

    @Override // b1.c
    public float[] b(float[] fArr) {
        qc.q.i(fArr, "v");
        d.m(f7691f, fArr);
        double d10 = 0.33333334f;
        fArr[0] = Math.signum(fArr[0]) * ((float) Math.pow(Math.abs(fArr[0]), d10));
        fArr[1] = Math.signum(fArr[1]) * ((float) Math.pow(Math.abs(fArr[1]), d10));
        fArr[2] = Math.signum(fArr[2]) * ((float) Math.pow(Math.abs(fArr[2]), d10));
        d.m(f7692g, fArr);
        return fArr;
    }

    @Override // b1.c
    public float e(int i10) {
        if (i10 == 0) {
            return 1.0f;
        }
        return 0.5f;
    }

    @Override // b1.c
    public float f(int i10) {
        if (i10 == 0) {
            return 0.0f;
        }
        return -0.5f;
    }

    @Override // b1.c
    public long j(float f10, float f11, float f12) {
        float k10;
        float k11;
        float k12;
        k10 = vc.l.k(f10, 0.0f, 1.0f);
        k11 = vc.l.k(f11, -0.5f, 0.5f);
        k12 = vc.l.k(f12, -0.5f, 0.5f);
        float[] fArr = f7694i;
        float n10 = d.n(fArr, k10, k11, k12);
        float o10 = d.o(fArr, k10, k11, k12);
        float p10 = d.p(fArr, k10, k11, k12);
        float f13 = n10 * n10 * n10;
        float f14 = o10 * o10 * o10;
        float f15 = p10 * p10 * p10;
        float[] fArr2 = f7693h;
        float n11 = d.n(fArr2, f13, f14, f15);
        float o11 = d.o(fArr2, f13, f14, f15);
        return (Float.floatToIntBits(n11) << 32) | (Float.floatToIntBits(o11) & 4294967295L);
    }

    @Override // b1.c
    public float[] l(float[] fArr) {
        float k10;
        float k11;
        float k12;
        qc.q.i(fArr, "v");
        k10 = vc.l.k(fArr[0], 0.0f, 1.0f);
        fArr[0] = k10;
        k11 = vc.l.k(fArr[1], -0.5f, 0.5f);
        fArr[1] = k11;
        k12 = vc.l.k(fArr[2], -0.5f, 0.5f);
        fArr[2] = k12;
        d.m(f7694i, fArr);
        float f10 = fArr[0];
        fArr[0] = f10 * f10 * f10;
        float f11 = fArr[1];
        fArr[1] = f11 * f11 * f11;
        float f12 = fArr[2];
        fArr[2] = f12 * f12 * f12;
        d.m(f7693h, fArr);
        return fArr;
    }

    @Override // b1.c
    public float m(float f10, float f11, float f12) {
        float k10;
        float k11;
        float k12;
        k10 = vc.l.k(f10, 0.0f, 1.0f);
        k11 = vc.l.k(f11, -0.5f, 0.5f);
        k12 = vc.l.k(f12, -0.5f, 0.5f);
        float[] fArr = f7694i;
        float n10 = d.n(fArr, k10, k11, k12);
        float o10 = d.o(fArr, k10, k11, k12);
        float p10 = d.p(fArr, k10, k11, k12);
        float f13 = p10 * p10 * p10;
        return d.p(f7693h, n10 * n10 * n10, o10 * o10 * o10, f13);
    }

    @Override // b1.c
    public long n(float f10, float f11, float f12, float f13, c cVar) {
        qc.q.i(cVar, "colorSpace");
        float[] fArr = f7691f;
        float n10 = d.n(fArr, f10, f11, f12);
        float o10 = d.o(fArr, f10, f11, f12);
        float p10 = d.p(fArr, f10, f11, f12);
        double d10 = 0.33333334f;
        float signum = Math.signum(n10) * ((float) Math.pow(Math.abs(n10), d10));
        float signum2 = Math.signum(o10) * ((float) Math.pow(Math.abs(o10), d10));
        float signum3 = Math.signum(p10) * ((float) Math.pow(Math.abs(p10), d10));
        float[] fArr2 = f7692g;
        return r1.a(d.n(fArr2, signum, signum2, signum3), d.o(fArr2, signum, signum2, signum3), d.p(fArr2, signum, signum2, signum3), f13, cVar);
    }
}
