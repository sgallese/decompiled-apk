package w6;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;

/* compiled from: MatrixEvaluator.java */
/* loaded from: classes3.dex */
public class g implements TypeEvaluator<Matrix> {

    /* renamed from: a  reason: collision with root package name */
    private final float[] f25420a = new float[9];

    /* renamed from: b  reason: collision with root package name */
    private final float[] f25421b = new float[9];

    /* renamed from: c  reason: collision with root package name */
    private final Matrix f25422c = new Matrix();

    public Matrix a(float f10, Matrix matrix, Matrix matrix2) {
        matrix.getValues(this.f25420a);
        matrix2.getValues(this.f25421b);
        for (int i10 = 0; i10 < 9; i10++) {
            float[] fArr = this.f25421b;
            float f11 = fArr[i10];
            float f12 = this.f25420a[i10];
            fArr[i10] = f12 + ((f11 - f12) * f10);
        }
        this.f25422c.setValues(this.f25421b);
        return this.f25422c;
    }
}
