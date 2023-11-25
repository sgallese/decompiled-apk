package c4;

import android.annotation.SuppressLint;
import android.view.View;

/* compiled from: ViewUtilsApi19.java */
/* loaded from: classes.dex */
class d0 extends l0 {

    /* renamed from: e  reason: collision with root package name */
    private static boolean f8747e = true;

    @Override // c4.l0
    @SuppressLint({"NewApi"})
    public float c(View view) {
        float transitionAlpha;
        if (f8747e) {
            try {
                transitionAlpha = view.getTransitionAlpha();
                return transitionAlpha;
            } catch (NoSuchMethodError unused) {
                f8747e = false;
            }
        }
        return view.getAlpha();
    }

    @Override // c4.l0
    @SuppressLint({"NewApi"})
    public void f(View view, float f10) {
        if (f8747e) {
            try {
                view.setTransitionAlpha(f10);
                return;
            } catch (NoSuchMethodError unused) {
                f8747e = false;
            }
        }
        view.setAlpha(f10);
    }

    @Override // c4.l0
    public void a(View view) {
    }

    @Override // c4.l0
    public void d(View view) {
    }
}
