package androidx.compose.ui.platform;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;

/* compiled from: AndroidComposeView.android.kt */
/* loaded from: classes.dex */
final class w0 implements t0 {

    /* renamed from: a  reason: collision with root package name */
    private final Matrix f2862a = new Matrix();

    /* renamed from: b  reason: collision with root package name */
    private final int[] f2863b = new int[2];

    @Override // androidx.compose.ui.platform.t0
    public void a(View view, float[] fArr) {
        qc.q.i(view, "view");
        qc.q.i(fArr, "matrix");
        this.f2862a.reset();
        view.transformMatrixToGlobal(this.f2862a);
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            view = (View) parent;
            parent = view.getParent();
        }
        view.getLocationOnScreen(this.f2863b);
        int[] iArr = this.f2863b;
        int i10 = iArr[0];
        int i11 = iArr[1];
        view.getLocationInWindow(iArr);
        int[] iArr2 = this.f2863b;
        this.f2862a.postTranslate(iArr2[0] - i10, iArr2[1] - i11);
        a1.m0.b(fArr, this.f2862a);
    }
}
