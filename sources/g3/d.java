package g3;

import android.view.animation.Interpolator;

/* compiled from: LookupTableInterpolator.java */
/* loaded from: classes.dex */
abstract class d implements Interpolator {

    /* renamed from: a  reason: collision with root package name */
    private final float[] f16106a;

    /* renamed from: b  reason: collision with root package name */
    private final float f16107b;

    /* JADX INFO: Access modifiers changed from: protected */
    public d(float[] fArr) {
        this.f16106a = fArr;
        this.f16107b = 1.0f / ((float) (fArr.length - 1));
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f10) {
        if (f10 >= 1.0f) {
            return 1.0f;
        }
        if (f10 <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f16106a;
        int min = Math.min((int) (((float) (fArr.length - 1)) * f10), fArr.length - 2);
        float f11 = this.f16107b;
        float f12 = (f10 - (min * f11)) / f11;
        float[] fArr2 = this.f16106a;
        float f13 = fArr2[min];
        return f13 + (f12 * (fArr2[min + 1] - f13));
    }
}
