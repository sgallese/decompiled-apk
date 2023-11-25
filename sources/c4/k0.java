package c4;

import android.graphics.Matrix;
import android.view.View;

/* compiled from: ViewUtilsApi29.java */
/* loaded from: classes.dex */
class k0 extends j0 {
    @Override // c4.d0, c4.l0
    public float c(View view) {
        float transitionAlpha;
        transitionAlpha = view.getTransitionAlpha();
        return transitionAlpha;
    }

    @Override // c4.h0, c4.l0
    public void e(View view, int i10, int i11, int i12, int i13) {
        view.setLeftTopRightBottom(i10, i11, i12, i13);
    }

    @Override // c4.d0, c4.l0
    public void f(View view, float f10) {
        view.setTransitionAlpha(f10);
    }

    @Override // c4.j0, c4.l0
    public void g(View view, int i10) {
        view.setTransitionVisibility(i10);
    }

    @Override // c4.f0, c4.l0
    public void h(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // c4.f0, c4.l0
    public void i(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
