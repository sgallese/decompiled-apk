package b1;

import a1.r1;
import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* compiled from: Lab.kt */
/* loaded from: classes.dex */
public final class k extends c {

    /* renamed from: e  reason: collision with root package name */
    public static final a f7689e = new a(null);

    /* compiled from: Lab.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(String str, int i10) {
        super(str, b.f7632a.a(), i10, null);
        qc.q.i(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
    }

    @Override // b1.c
    public float[] b(float[] fArr) {
        float f10;
        float f11;
        float f12;
        float k10;
        float k11;
        float k12;
        qc.q.i(fArr, "v");
        float f13 = fArr[0];
        j jVar = j.f7678a;
        float f14 = f13 / jVar.c()[0];
        float f15 = fArr[1] / jVar.c()[1];
        float f16 = fArr[2] / jVar.c()[2];
        if (f14 > 0.008856452f) {
            f10 = (float) Math.pow(f14, 0.33333334f);
        } else {
            f10 = (f14 * 7.787037f) + 0.13793103f;
        }
        if (f15 > 0.008856452f) {
            f11 = (float) Math.pow(f15, 0.33333334f);
        } else {
            f11 = (f15 * 7.787037f) + 0.13793103f;
        }
        if (f16 > 0.008856452f) {
            f12 = (float) Math.pow(f16, 0.33333334f);
        } else {
            f12 = (f16 * 7.787037f) + 0.13793103f;
        }
        float f17 = (116.0f * f11) - 16.0f;
        float f18 = (f10 - f11) * 500.0f;
        float f19 = (f11 - f12) * 200.0f;
        k10 = vc.l.k(f17, 0.0f, 100.0f);
        fArr[0] = k10;
        k11 = vc.l.k(f18, -128.0f, 128.0f);
        fArr[1] = k11;
        k12 = vc.l.k(f19, -128.0f, 128.0f);
        fArr[2] = k12;
        return fArr;
    }

    @Override // b1.c
    public float e(int i10) {
        if (i10 == 0) {
            return 100.0f;
        }
        return 128.0f;
    }

    @Override // b1.c
    public float f(int i10) {
        if (i10 == 0) {
            return 0.0f;
        }
        return -128.0f;
    }

    @Override // b1.c
    public long j(float f10, float f11, float f12) {
        float k10;
        float k11;
        float f13;
        float f14;
        k10 = vc.l.k(f10, 0.0f, 100.0f);
        k11 = vc.l.k(f10, -128.0f, 128.0f);
        float f15 = (k10 + 16.0f) / 116.0f;
        float f16 = (k11 * 0.002f) + f15;
        if (f16 > 0.20689656f) {
            f13 = f16 * f16 * f16;
        } else {
            f13 = (f16 - 0.13793103f) * 0.12841855f;
        }
        if (f15 > 0.20689656f) {
            f14 = f15 * f15 * f15;
        } else {
            f14 = (f15 - 0.13793103f) * 0.12841855f;
        }
        j jVar = j.f7678a;
        float f17 = f13 * jVar.c()[0];
        float f18 = f14 * jVar.c()[1];
        return (Float.floatToIntBits(f17) << 32) | (Float.floatToIntBits(f18) & 4294967295L);
    }

    @Override // b1.c
    public float[] l(float[] fArr) {
        float k10;
        float k11;
        float k12;
        float f10;
        float f11;
        float f12;
        qc.q.i(fArr, "v");
        k10 = vc.l.k(fArr[0], 0.0f, 100.0f);
        fArr[0] = k10;
        k11 = vc.l.k(fArr[1], -128.0f, 128.0f);
        fArr[1] = k11;
        k12 = vc.l.k(fArr[2], -128.0f, 128.0f);
        fArr[2] = k12;
        float f13 = (fArr[0] + 16.0f) / 116.0f;
        float f14 = (fArr[1] * 0.002f) + f13;
        float f15 = f13 - (k12 * 0.005f);
        if (f14 > 0.20689656f) {
            f10 = f14 * f14 * f14;
        } else {
            f10 = (f14 - 0.13793103f) * 0.12841855f;
        }
        if (f13 > 0.20689656f) {
            f11 = f13 * f13 * f13;
        } else {
            f11 = (f13 - 0.13793103f) * 0.12841855f;
        }
        if (f15 > 0.20689656f) {
            f12 = f15 * f15 * f15;
        } else {
            f12 = (f15 - 0.13793103f) * 0.12841855f;
        }
        j jVar = j.f7678a;
        fArr[0] = f10 * jVar.c()[0];
        fArr[1] = f11 * jVar.c()[1];
        fArr[2] = f12 * jVar.c()[2];
        return fArr;
    }

    @Override // b1.c
    public float m(float f10, float f11, float f12) {
        float k10;
        float k11;
        float f13;
        k10 = vc.l.k(f10, 0.0f, 100.0f);
        k11 = vc.l.k(f12, -128.0f, 128.0f);
        float f14 = ((k10 + 16.0f) / 116.0f) - (k11 * 0.005f);
        if (f14 > 0.20689656f) {
            f13 = f14 * f14 * f14;
        } else {
            f13 = 0.12841855f * (f14 - 0.13793103f);
        }
        return f13 * j.f7678a.c()[2];
    }

    @Override // b1.c
    public long n(float f10, float f11, float f12, float f13, c cVar) {
        float f14;
        float f15;
        float f16;
        float k10;
        float k11;
        float k12;
        qc.q.i(cVar, "colorSpace");
        j jVar = j.f7678a;
        float f17 = f10 / jVar.c()[0];
        float f18 = f11 / jVar.c()[1];
        float f19 = f12 / jVar.c()[2];
        if (f17 > 0.008856452f) {
            f14 = (float) Math.pow(f17, 0.33333334f);
        } else {
            f14 = (f17 * 7.787037f) + 0.13793103f;
        }
        if (f18 > 0.008856452f) {
            f15 = (float) Math.pow(f18, 0.33333334f);
        } else {
            f15 = (f18 * 7.787037f) + 0.13793103f;
        }
        if (f19 > 0.008856452f) {
            f16 = (float) Math.pow(f19, 0.33333334f);
        } else {
            f16 = (f19 * 7.787037f) + 0.13793103f;
        }
        float f20 = (116.0f * f15) - 16.0f;
        float f21 = (f14 - f15) * 500.0f;
        float f22 = (f15 - f16) * 200.0f;
        k10 = vc.l.k(f20, 0.0f, 100.0f);
        k11 = vc.l.k(f21, -128.0f, 128.0f);
        k12 = vc.l.k(f22, -128.0f, 128.0f);
        return r1.a(k10, k11, k12, f13, cVar);
    }
}
