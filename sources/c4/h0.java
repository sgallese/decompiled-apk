package c4;

import android.annotation.SuppressLint;
import android.view.View;

/* compiled from: ViewUtilsApi22.java */
/* loaded from: classes.dex */
class h0 extends f0 {

    /* renamed from: h  reason: collision with root package name */
    private static boolean f8768h = true;

    @Override // c4.l0
    @SuppressLint({"NewApi"})
    public void e(View view, int i10, int i11, int i12, int i13) {
        if (f8768h) {
            try {
                view.setLeftTopRightBottom(i10, i11, i12, i13);
            } catch (NoSuchMethodError unused) {
                f8768h = false;
            }
        }
    }
}
