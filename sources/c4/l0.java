package c4;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: ViewUtilsBase.java */
/* loaded from: classes.dex */
class l0 {

    /* renamed from: a  reason: collision with root package name */
    private static Method f8796a;

    /* renamed from: b  reason: collision with root package name */
    private static boolean f8797b;

    /* renamed from: c  reason: collision with root package name */
    private static Field f8798c;

    /* renamed from: d  reason: collision with root package name */
    private static boolean f8799d;

    @SuppressLint({"PrivateApi", "SoonBlockedPrivateApi"})
    private void b() {
        if (!f8797b) {
            try {
                Class cls = Integer.TYPE;
                Method declaredMethod = View.class.getDeclaredMethod("setFrame", cls, cls, cls, cls);
                f8796a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e10) {
                Log.i("ViewUtilsBase", "Failed to retrieve setFrame method", e10);
            }
            f8797b = true;
        }
    }

    public void a(View view) {
        throw null;
    }

    public float c(View view) {
        throw null;
    }

    public void d(View view) {
        throw null;
    }

    public void e(View view, int i10, int i11, int i12, int i13) {
        b();
        Method method = f8796a;
        if (method != null) {
            try {
                method.invoke(view, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13));
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e10) {
                throw new RuntimeException(e10.getCause());
            }
        }
    }

    public void f(View view, float f10) {
        throw null;
    }

    public void g(View view, int i10) {
        if (!f8799d) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f8798c = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsBase", "fetchViewFlagsField: ");
            }
            f8799d = true;
        }
        Field field = f8798c;
        if (field != null) {
            try {
                f8798c.setInt(view, i10 | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    public void h(View view, Matrix matrix) {
        throw null;
    }

    public void i(View view, Matrix matrix) {
        throw null;
    }
}
