package bd;

import ad.h0;
import android.os.Build;
import java.lang.Thread;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* compiled from: AndroidExceptionPreHandler.kt */
/* loaded from: classes4.dex */
public final class b extends hc.a implements h0 {
    private volatile Object _preHandler;

    public b() {
        super(h0.f516a);
        this._preHandler = this;
    }

    private final Method A0() {
        Object obj = this._preHandler;
        if (obj != this) {
            return (Method) obj;
        }
        Method method = null;
        try {
            boolean z10 = false;
            Method declaredMethod = Thread.class.getDeclaredMethod("getUncaughtExceptionPreHandler", new Class[0]);
            if (Modifier.isPublic(declaredMethod.getModifiers())) {
                if (Modifier.isStatic(declaredMethod.getModifiers())) {
                    z10 = true;
                }
            }
            if (z10) {
                method = declaredMethod;
            }
        } catch (Throwable unused) {
        }
        this._preHandler = method;
        return method;
    }

    @Override // ad.h0
    public void handleException(hc.f fVar, Throwable th) {
        boolean z10;
        Object obj;
        int i10 = Build.VERSION.SDK_INT;
        if (26 <= i10 && i10 < 28) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            Method A0 = A0();
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = null;
            if (A0 != null) {
                obj = A0.invoke(null, new Object[0]);
            } else {
                obj = null;
            }
            if (obj instanceof Thread.UncaughtExceptionHandler) {
                uncaughtExceptionHandler = (Thread.UncaughtExceptionHandler) obj;
            }
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
            }
        }
    }
}
