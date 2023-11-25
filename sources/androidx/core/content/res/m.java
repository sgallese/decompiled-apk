package androidx.core.content.res;

/* compiled from: ViewingConditions.java */
/* loaded from: classes.dex */
final class m {

    /* renamed from: k  reason: collision with root package name */
    static final m f3859k = k(b.f3825c, (float) ((b.h(50.0f) * 63.66197723675813d) / 100.0d), 50.0f, 2.0f, false);

    /* renamed from: a  reason: collision with root package name */
    private final float f3860a;

    /* renamed from: b  reason: collision with root package name */
    private final float f3861b;

    /* renamed from: c  reason: collision with root package name */
    private final float f3862c;

    /* renamed from: d  reason: collision with root package name */
    private final float f3863d;

    /* renamed from: e  reason: collision with root package name */
    private final float f3864e;

    /* renamed from: f  reason: collision with root package name */
    private final float f3865f;

    /* renamed from: g  reason: collision with root package name */
    private final float[] f3866g;

    /* renamed from: h  reason: collision with root package name */
    private final float f3867h;

    /* renamed from: i  reason: collision with root package name */
    private final float f3868i;

    /* renamed from: j  reason: collision with root package name */
    private final float f3869j;

    private m(float f10, float f11, float f12, float f13, float f14, float f15, float[] fArr, float f16, float f17, float f18) {
        this.f3865f = f10;
        this.f3860a = f11;
        this.f3861b = f12;
        this.f3862c = f13;
        this.f3863d = f14;
        this.f3864e = f15;
        this.f3866g = fArr;
        this.f3867h = f16;
        this.f3868i = f17;
        this.f3869j = f18;
    }

    static m k(float[] fArr, float f10, float f11, float f12, boolean z10) {
        float d10;
        float exp;
        float[][] fArr2 = b.f3823a;
        float f13 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f14 = fArr3[0] * f13;
        float f15 = fArr[1];
        float f16 = f14 + (fArr3[1] * f15);
        float f17 = fArr[2];
        float f18 = f16 + (fArr3[2] * f17);
        float[] fArr4 = fArr2[1];
        float f19 = (fArr4[0] * f13) + (fArr4[1] * f15) + (fArr4[2] * f17);
        float[] fArr5 = fArr2[2];
        float f20 = (f13 * fArr5[0]) + (f15 * fArr5[1]) + (f17 * fArr5[2]);
        float f21 = (f12 / 10.0f) + 0.8f;
        if (f21 >= 0.9d) {
            d10 = b.d(0.59f, 0.69f, (f21 - 0.9f) * 10.0f);
        } else {
            d10 = b.d(0.525f, 0.59f, (f21 - 0.8f) * 10.0f);
        }
        float f22 = d10;
        if (z10) {
            exp = 1.0f;
        } else {
            exp = (1.0f - (((float) Math.exp(((-f10) - 42.0f) / 92.0f)) * 0.2777778f)) * f21;
        }
        double d11 = exp;
        if (d11 > 1.0d) {
            exp = 1.0f;
        } else if (d11 < 0.0d) {
            exp = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f18) * exp) + 1.0f) - exp, (((100.0f / f19) * exp) + 1.0f) - exp, (((100.0f / f20) * exp) + 1.0f) - exp};
        float f23 = 1.0f / ((5.0f * f10) + 1.0f);
        float f24 = f23 * f23 * f23 * f23;
        float f25 = 1.0f - f24;
        float cbrt = (f24 * f10) + (0.1f * f25 * f25 * ((float) Math.cbrt(f10 * 5.0d)));
        float h10 = b.h(f11) / fArr[1];
        double d12 = h10;
        float sqrt = ((float) Math.sqrt(d12)) + 1.48f;
        float pow = 0.725f / ((float) Math.pow(d12, 0.2d));
        float pow2 = (float) Math.pow(((fArr6[2] * cbrt) * f20) / 100.0d, 0.42d);
        float[] fArr7 = {(float) Math.pow(((fArr6[0] * cbrt) * f18) / 100.0d, 0.42d), (float) Math.pow(((fArr6[1] * cbrt) * f19) / 100.0d, 0.42d), pow2};
        float f26 = fArr7[0];
        float f27 = fArr7[1];
        return new m(h10, ((((f26 * 400.0f) / (f26 + 27.13f)) * 2.0f) + ((f27 * 400.0f) / (f27 + 27.13f)) + (((400.0f * pow2) / (pow2 + 27.13f)) * 0.05f)) * pow, pow, pow, f22, f21, fArr6, cbrt, (float) Math.pow(cbrt, 0.25d), sqrt);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float a() {
        return this.f3860a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float b() {
        return this.f3863d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float c() {
        return this.f3867h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float d() {
        return this.f3868i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float e() {
        return this.f3865f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float f() {
        return this.f3861b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float g() {
        return this.f3864e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float h() {
        return this.f3862c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float[] i() {
        return this.f3866g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float j() {
        return this.f3869j;
    }
}
