package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;

/* compiled from: SavedStateViewModelFactory.kt */
/* loaded from: classes.dex */
public final class s0 {

    /* renamed from: a  reason: collision with root package name */
    private static final List<Class<?>> f5045a;

    /* renamed from: b  reason: collision with root package name */
    private static final List<Class<?>> f5046b;

    static {
        List<Class<?>> l10;
        List<Class<?>> d10;
        l10 = ec.t.l(Application.class, n0.class);
        f5045a = l10;
        d10 = ec.s.d(n0.class);
        f5046b = d10;
    }

    public static final <T> Constructor<T> c(Class<T> cls, List<? extends Class<?>> list) {
        List b02;
        qc.q.i(cls, "modelClass");
        qc.q.i(list, "signature");
        Constructor<?>[] constructors = cls.getConstructors();
        qc.q.h(constructors, "modelClass.constructors");
        for (Constructor<?> constructor : constructors) {
            Constructor<T> constructor2 = (Constructor<T>) constructor;
            Class<?>[] parameterTypes = constructor2.getParameterTypes();
            qc.q.h(parameterTypes, "constructor.parameterTypes");
            b02 = ec.p.b0(parameterTypes);
            if (qc.q.d(list, b02)) {
                qc.q.g(constructor2, "null cannot be cast to non-null type java.lang.reflect.Constructor<T of androidx.lifecycle.SavedStateViewModelFactoryKt.findMatchingConstructor>");
                return constructor2;
            } else if (list.size() == b02.size() && b02.containsAll(list)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }

    public static final <T extends v0> T d(Class<T> cls, Constructor<T> constructor, Object... objArr) {
        qc.q.i(cls, "modelClass");
        qc.q.i(constructor, "constructor");
        qc.q.i(objArr, "params");
        try {
            return constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Failed to access " + cls, e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException("An exception happened in constructor of " + cls, e12.getCause());
        }
    }
}
