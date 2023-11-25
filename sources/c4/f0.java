package c4;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.View;

/* compiled from: ViewUtilsApi21.java */
/* loaded from: classes.dex */
class f0 extends d0 {

    /* renamed from: f  reason: collision with root package name */
    private static boolean f8766f = true;

    /* renamed from: g  reason: collision with root package name */
    private static boolean f8767g = true;

    @Override // c4.l0
    @SuppressLint({"NewApi"})
    public void h(View view, Matrix matrix) {
        if (f8766f) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                f8766f = false;
            }
        }
    }

    @Override // c4.l0
    @SuppressLint({"NewApi"})
    public void i(View view, Matrix matrix) {
        if (f8767g) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                f8767g = false;
            }
        }
    }
}
