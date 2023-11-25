package androidx.core.content.res;

/* compiled from: CamColor.java */
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private final float f3814a;

    /* renamed from: b  reason: collision with root package name */
    private final float f3815b;

    /* renamed from: c  reason: collision with root package name */
    private final float f3816c;

    /* renamed from: d  reason: collision with root package name */
    private final float f3817d;

    /* renamed from: e  reason: collision with root package name */
    private final float f3818e;

    /* renamed from: f  reason: collision with root package name */
    private final float f3819f;

    /* renamed from: g  reason: collision with root package name */
    private final float f3820g;

    /* renamed from: h  reason: collision with root package name */
    private final float f3821h;

    /* renamed from: i  reason: collision with root package name */
    private final float f3822i;

    a(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18) {
        this.f3814a = f10;
        this.f3815b = f11;
        this.f3816c = f12;
        this.f3817d = f13;
        this.f3818e = f14;
        this.f3819f = f15;
        this.f3820g = f16;
        this.f3821h = f17;
        this.f3822i = f18;
    }

    private static a b(float f10, float f11, float f12) {
        float f13 = 100.0f;
        float f14 = 1000.0f;
        a aVar = null;
        float f15 = 1000.0f;
        float f16 = 0.0f;
        while (Math.abs(f16 - f13) > 0.01f) {
            float f17 = ((f13 - f16) / 2.0f) + f16;
            int p10 = e(f17, f11, f10).p();
            float b10 = b.b(p10);
            float abs = Math.abs(f12 - b10);
            if (abs < 0.2f) {
                a c10 = c(p10);
                float a10 = c10.a(e(c10.k(), c10.i(), f10));
                if (a10 <= 1.0f) {
                    aVar = c10;
                    f14 = abs;
                    f15 = a10;
                }
            }
            if (f14 == 0.0f && f15 == 0.0f) {
                break;
            } else if (b10 < f12) {
                f16 = f17;
            } else {
                f13 = f17;
            }
        }
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static a c(int i10) {
        float[] fArr = new float[7];
        float[] fArr2 = new float[3];
        d(i10, m.f3859k, fArr, fArr2);
        return new a(fArr2[0], fArr2[1], fArr[0], fArr[1], fArr[2], fArr[3], fArr[4], fArr[5], fArr[6]);
    }

    static void d(int i10, m mVar, float[] fArr, float[] fArr2) {
        float f10;
        b.f(i10, fArr2);
        float[][] fArr3 = b.f3823a;
        float f11 = fArr2[0];
        float[] fArr4 = fArr3[0];
        float f12 = fArr4[0] * f11;
        float f13 = fArr2[1];
        float f14 = f12 + (fArr4[1] * f13);
        float f15 = fArr2[2];
        float f16 = f14 + (fArr4[2] * f15);
        float[] fArr5 = fArr3[1];
        float f17 = (fArr5[0] * f11) + (fArr5[1] * f13) + (fArr5[2] * f15);
        float[] fArr6 = fArr3[2];
        float f18 = (f11 * fArr6[0]) + (f13 * fArr6[1]) + (f15 * fArr6[2]);
        float f19 = mVar.i()[0] * f16;
        float f20 = mVar.i()[1] * f17;
        float f21 = mVar.i()[2] * f18;
        float pow = (float) Math.pow((mVar.c() * Math.abs(f19)) / 100.0d, 0.42d);
        float pow2 = (float) Math.pow((mVar.c() * Math.abs(f20)) / 100.0d, 0.42d);
        float pow3 = (float) Math.pow((mVar.c() * Math.abs(f21)) / 100.0d, 0.42d);
        float signum = ((Math.signum(f19) * 400.0f) * pow) / (pow + 27.13f);
        float signum2 = ((Math.signum(f20) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum3 = ((Math.signum(f21) * 400.0f) * pow3) / (pow3 + 27.13f);
        double d10 = signum3;
        float f22 = ((float) (((signum * 11.0d) + (signum2 * (-12.0d))) + d10)) / 11.0f;
        float f23 = ((float) ((signum + signum2) - (d10 * 2.0d))) / 9.0f;
        float f24 = signum2 * 20.0f;
        float f25 = (((signum * 20.0f) + f24) + (21.0f * signum3)) / 20.0f;
        float f26 = (((signum * 40.0f) + f24) + signum3) / 20.0f;
        float atan2 = (((float) Math.atan2(f23, f22)) * 180.0f) / 3.1415927f;
        if (atan2 < 0.0f) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f27 = (3.1415927f * atan2) / 180.0f;
        float pow4 = ((float) Math.pow((f26 * mVar.f()) / mVar.a(), mVar.b() * mVar.j())) * 100.0f;
        float b10 = (4.0f / mVar.b()) * ((float) Math.sqrt(pow4 / 100.0f)) * (mVar.a() + 4.0f) * mVar.d();
        if (atan2 < 20.14d) {
            f10 = 360.0f + atan2;
        } else {
            f10 = atan2;
        }
        float sqrt = ((float) Math.sqrt(pow4 / 100.0d)) * ((float) Math.pow(1.64d - Math.pow(0.29d, mVar.e()), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos(((f10 * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * mVar.g()) * mVar.h()) * ((float) Math.sqrt((f22 * f22) + (f23 * f23)))) / (f25 + 0.305f), 0.9d));
        float d11 = mVar.d() * sqrt;
        float sqrt2 = ((float) Math.sqrt((r7 * mVar.b()) / (mVar.a() + 4.0f))) * 50.0f;
        float f28 = (1.7f * pow4) / ((0.007f * pow4) + 1.0f);
        float log = ((float) Math.log((0.0228f * d11) + 1.0f)) * 43.85965f;
        double d12 = f27;
        float cos = ((float) Math.cos(d12)) * log;
        float sin = log * ((float) Math.sin(d12));
        fArr2[0] = atan2;
        fArr2[1] = sqrt;
        if (fArr != null) {
            fArr[0] = pow4;
            fArr[1] = b10;
            fArr[2] = d11;
            fArr[3] = sqrt2;
            fArr[4] = f28;
            fArr[5] = cos;
            fArr[6] = sin;
        }
    }

    private static a e(float f10, float f11, float f12) {
        return f(f10, f11, f12, m.f3859k);
    }

    private static a f(float f10, float f11, float f12, m mVar) {
        float b10 = (4.0f / mVar.b()) * ((float) Math.sqrt(f10 / 100.0d)) * (mVar.a() + 4.0f) * mVar.d();
        float d10 = f11 * mVar.d();
        float sqrt = ((float) Math.sqrt(((f11 / ((float) Math.sqrt(r4))) * mVar.b()) / (mVar.a() + 4.0f))) * 50.0f;
        float f13 = (1.7f * f10) / ((0.007f * f10) + 1.0f);
        float log = ((float) Math.log((d10 * 0.0228d) + 1.0d)) * 43.85965f;
        double d11 = (3.1415927f * f12) / 180.0f;
        return new a(f12, f11, f10, b10, d10, sqrt, f13, log * ((float) Math.cos(d11)), log * ((float) Math.sin(d11)));
    }

    public static int m(float f10, float f11, float f12) {
        return n(f10, f11, f12, m.f3859k);
    }

    static int n(float f10, float f11, float f12, m mVar) {
        float min;
        if (f11 >= 1.0d && Math.round(f12) > 0.0d && Math.round(f12) < 100.0d) {
            if (f10 < 0.0f) {
                min = 0.0f;
            } else {
                min = Math.min(360.0f, f10);
            }
            float f13 = f11;
            a aVar = null;
            float f14 = 0.0f;
            boolean z10 = true;
            while (Math.abs(f14 - f11) >= 0.4f) {
                a b10 = b(min, f13, f12);
                if (z10) {
                    if (b10 != null) {
                        return b10.o(mVar);
                    }
                    f13 = ((f11 - f14) / 2.0f) + f14;
                    z10 = false;
                } else {
                    if (b10 == null) {
                        f11 = f13;
                    } else {
                        f14 = f13;
                        aVar = b10;
                    }
                    f13 = ((f11 - f14) / 2.0f) + f14;
                }
            }
            if (aVar == null) {
                return b.a(f12);
            }
            return aVar.o(mVar);
        }
        return b.a(f12);
    }

    float a(a aVar) {
        float l10 = l() - aVar.l();
        float g10 = g() - aVar.g();
        float h10 = h() - aVar.h();
        return (float) (Math.pow(Math.sqrt((l10 * l10) + (g10 * g10) + (h10 * h10)), 0.63d) * 1.41d);
    }

    float g() {
        return this.f3821h;
    }

    float h() {
        return this.f3822i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float i() {
        return this.f3815b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float j() {
        return this.f3814a;
    }

    float k() {
        return this.f3816c;
    }

    float l() {
        return this.f3820g;
    }

    int o(m mVar) {
        float f10;
        if (i() != 0.0d && k() != 0.0d) {
            f10 = i() / ((float) Math.sqrt(k() / 100.0d));
        } else {
            f10 = 0.0f;
        }
        float pow = (float) Math.pow(f10 / Math.pow(1.64d - Math.pow(0.29d, mVar.e()), 0.73d), 1.1111111111111112d);
        double j10 = (j() * 3.1415927f) / 180.0f;
        float cos = ((float) (Math.cos(2.0d + j10) + 3.8d)) * 0.25f;
        float a10 = mVar.a() * ((float) Math.pow(k() / 100.0d, (1.0d / mVar.b()) / mVar.j()));
        float g10 = cos * 3846.1538f * mVar.g() * mVar.h();
        float f11 = a10 / mVar.f();
        float sin = (float) Math.sin(j10);
        float cos2 = (float) Math.cos(j10);
        float f12 = (((0.305f + f11) * 23.0f) * pow) / (((g10 * 23.0f) + ((11.0f * pow) * cos2)) + ((pow * 108.0f) * sin));
        float f13 = cos2 * f12;
        float f14 = f12 * sin;
        float f15 = f11 * 460.0f;
        float f16 = (((451.0f * f13) + f15) + (288.0f * f14)) / 1403.0f;
        float f17 = ((f15 - (891.0f * f13)) - (261.0f * f14)) / 1403.0f;
        float signum = Math.signum(f16) * (100.0f / mVar.c()) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f16) * 27.13d) / (400.0d - Math.abs(f16))), 2.380952380952381d));
        float signum2 = Math.signum(f17) * (100.0f / mVar.c()) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f17) * 27.13d) / (400.0d - Math.abs(f17))), 2.380952380952381d));
        float signum3 = Math.signum(((f15 - (f13 * 220.0f)) - (f14 * 6300.0f)) / 1403.0f) * (100.0f / mVar.c()) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(r8) * 27.13d) / (400.0d - Math.abs(r8))), 2.380952380952381d));
        float f18 = signum / mVar.i()[0];
        float f19 = signum2 / mVar.i()[1];
        float f20 = signum3 / mVar.i()[2];
        float[][] fArr = b.f3824b;
        float[] fArr2 = fArr[0];
        float f21 = (fArr2[0] * f18) + (fArr2[1] * f19) + (fArr2[2] * f20);
        float[] fArr3 = fArr[1];
        float f22 = (fArr3[0] * f18) + (fArr3[1] * f19) + (fArr3[2] * f20);
        float[] fArr4 = fArr[2];
        return androidx.core.graphics.a.b(f21, f22, (f18 * fArr4[0]) + (f19 * fArr4[1]) + (f20 * fArr4[2]));
    }

    int p() {
        return o(m.f3859k);
    }
}
