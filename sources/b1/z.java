package b1;

import a1.r1;
import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* compiled from: Xyz.kt */
/* loaded from: classes.dex */
public final class z extends c {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(String str, int i10) {
        super(str, b.f7632a.c(), i10, null);
        qc.q.i(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
    }

    private final float o(float f10) {
        float k10;
        k10 = vc.l.k(f10, -2.0f, 2.0f);
        return k10;
    }

    @Override // b1.c
    public float[] b(float[] fArr) {
        qc.q.i(fArr, "v");
        fArr[0] = o(fArr[0]);
        fArr[1] = o(fArr[1]);
        fArr[2] = o(fArr[2]);
        return fArr;
    }

    @Override // b1.c
    public float e(int i10) {
        return 2.0f;
    }

    @Override // b1.c
    public float f(int i10) {
        return -2.0f;
    }

    @Override // b1.c
    public long j(float f10, float f11, float f12) {
        float o10 = o(f10);
        float o11 = o(f11);
        return (Float.floatToIntBits(o11) & 4294967295L) | (Float.floatToIntBits(o10) << 32);
    }

    @Override // b1.c
    public float[] l(float[] fArr) {
        qc.q.i(fArr, "v");
        fArr[0] = o(fArr[0]);
        fArr[1] = o(fArr[1]);
        fArr[2] = o(fArr[2]);
        return fArr;
    }

    @Override // b1.c
    public float m(float f10, float f11, float f12) {
        return o(f12);
    }

    @Override // b1.c
    public long n(float f10, float f11, float f12, float f13, c cVar) {
        qc.q.i(cVar, "colorSpace");
        return r1.a(o(f10), o(f11), o(f12), f13, cVar);
    }
}
