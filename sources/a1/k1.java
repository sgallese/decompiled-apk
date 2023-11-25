package a1;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: CanvasUtils.android.kt */
/* loaded from: classes.dex */
public final class k1 {

    /* renamed from: a  reason: collision with root package name */
    public static final k1 f114a = new k1();

    /* renamed from: b  reason: collision with root package name */
    private static Method f115b;

    /* renamed from: c  reason: collision with root package name */
    private static Method f116c;

    /* renamed from: d  reason: collision with root package name */
    private static boolean f117d;

    private k1() {
    }

    @SuppressLint({"SoonBlockedPrivateApi"})
    public final void a(Canvas canvas, boolean z10) {
        Method method;
        qc.q.i(canvas, "canvas");
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            n1.f128a.a(canvas, z10);
            return;
        }
        if (!f117d) {
            try {
                if (i10 == 28) {
                    Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass());
                    f115b = (Method) declaredMethod.invoke(Canvas.class, "insertReorderBarrier", new Class[0]);
                    f116c = (Method) declaredMethod.invoke(Canvas.class, "insertInorderBarrier", new Class[0]);
                } else {
                    f115b = Canvas.class.getDeclaredMethod("insertReorderBarrier", new Class[0]);
                    f116c = Canvas.class.getDeclaredMethod("insertInorderBarrier", new Class[0]);
                }
                Method method2 = f115b;
                if (method2 != null) {
                    method2.setAccessible(true);
                }
                Method method3 = f116c;
                if (method3 != null) {
                    method3.setAccessible(true);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
            f117d = true;
        }
        if (z10) {
            try {
                Method method4 = f115b;
                if (method4 != null) {
                    qc.q.f(method4);
                    method4.invoke(canvas, new Object[0]);
                }
            } catch (IllegalAccessException | InvocationTargetException unused2) {
                return;
            }
        }
        if (!z10 && (method = f116c) != null) {
            qc.q.f(method);
            method.invoke(canvas, new Object[0]);
        }
    }
}
