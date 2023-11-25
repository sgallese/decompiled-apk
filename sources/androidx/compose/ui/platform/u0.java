package androidx.compose.ui.platform;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;

/* compiled from: AndroidComposeView.android.kt */
/* loaded from: classes.dex */
final class u0 implements t0 {

    /* renamed from: a  reason: collision with root package name */
    private final int[] f2847a = new int[2];

    /* renamed from: b  reason: collision with root package name */
    private final float[] f2848b = a1.x3.c(null, 1, null);

    private final void b(float[] fArr, Matrix matrix) {
        a1.m0.b(this.f2848b, matrix);
        i0.f(fArr, this.f2848b);
    }

    private final void c(float[] fArr, float f10, float f11) {
        a1.x3.h(this.f2848b);
        a1.x3.m(this.f2848b, f10, f11, 0.0f, 4, null);
        i0.f(fArr, this.f2848b);
    }

    private final void d(View view, float[] fArr) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            d((View) parent, fArr);
            c(fArr, -view.getScrollX(), -view.getScrollY());
            c(fArr, view.getLeft(), view.getTop());
        } else {
            view.getLocationInWindow(this.f2847a);
            c(fArr, -view.getScrollX(), -view.getScrollY());
            c(fArr, r0[0], r0[1]);
        }
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            qc.q.h(matrix, "viewMatrix");
            b(fArr, matrix);
        }
    }

    @Override // androidx.compose.ui.platform.t0
    public void a(View view, float[] fArr) {
        qc.q.i(view, "view");
        qc.q.i(fArr, "matrix");
        a1.x3.h(fArr);
        d(view, fArr);
    }
}
