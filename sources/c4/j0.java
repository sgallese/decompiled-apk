package c4;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;

/* compiled from: ViewUtilsApi23.java */
/* loaded from: classes.dex */
class j0 extends h0 {

    /* renamed from: i  reason: collision with root package name */
    private static boolean f8772i = true;

    @Override // c4.l0
    @SuppressLint({"NewApi"})
    public void g(View view, int i10) {
        if (Build.VERSION.SDK_INT == 28) {
            super.g(view, i10);
        } else if (f8772i) {
            try {
                view.setTransitionVisibility(i10);
            } catch (NoSuchMethodError unused) {
                f8772i = false;
            }
        }
    }
}
