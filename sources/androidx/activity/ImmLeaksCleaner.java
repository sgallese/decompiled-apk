package androidx.activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.p;
import androidx.lifecycle.s;
import androidx.lifecycle.v;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
final class ImmLeaksCleaner implements s {

    /* renamed from: m  reason: collision with root package name */
    private static int f607m;

    /* renamed from: p  reason: collision with root package name */
    private static Field f608p;

    /* renamed from: q  reason: collision with root package name */
    private static Field f609q;

    /* renamed from: r  reason: collision with root package name */
    private static Field f610r;

    /* renamed from: f  reason: collision with root package name */
    private Activity f611f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ImmLeaksCleaner(Activity activity) {
        this.f611f = activity;
    }

    @SuppressLint({"SoonBlockedPrivateApi"})
    private static void a() {
        try {
            f607m = 2;
            Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
            f609q = declaredField;
            declaredField.setAccessible(true);
            Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
            f610r = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
            f608p = declaredField3;
            declaredField3.setAccessible(true);
            f607m = 1;
        } catch (NoSuchFieldException unused) {
        }
    }

    @Override // androidx.lifecycle.s
    public void c(v vVar, p.a aVar) {
        if (aVar != p.a.ON_DESTROY) {
            return;
        }
        if (f607m == 0) {
            a();
        }
        if (f607m == 1) {
            InputMethodManager inputMethodManager = (InputMethodManager) this.f611f.getSystemService("input_method");
            try {
                Object obj = f608p.get(inputMethodManager);
                if (obj == null) {
                    return;
                }
                synchronized (obj) {
                    try {
                        try {
                            View view = (View) f609q.get(inputMethodManager);
                            if (view == null) {
                                return;
                            }
                            if (view.isAttachedToWindow()) {
                                return;
                            }
                            try {
                                f610r.set(inputMethodManager, null);
                                inputMethodManager.isActive();
                            } catch (IllegalAccessException unused) {
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    } catch (ClassCastException unused2) {
                    } catch (IllegalAccessException unused3) {
                    }
                }
            } catch (IllegalAccessException unused4) {
            }
        }
    }
}
