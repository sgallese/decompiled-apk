package h2;

import java.lang.reflect.Constructor;
import java.util.Iterator;
import qc.q;
import xc.g;
import xc.o;

/* compiled from: PreviewUtils.kt */
/* loaded from: classes.dex */
public final class d {
    public static final Class<? extends i2.b<?>> a(String str) {
        q.i(str, "<this>");
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e10) {
            c.f16448a.a("Unable to find PreviewProvider '" + str + '\'', e10);
            return null;
        }
    }

    public static final Object[] b(Class<? extends i2.b<?>> cls, int i10) {
        Object k10;
        boolean z10;
        if (cls != null) {
            try {
                Constructor<?>[] constructors = cls.getConstructors();
                q.h(constructors, "parameterProviderClass.constructors");
                int length = constructors.length;
                Constructor<?> constructor = null;
                Constructor<?> constructor2 = null;
                int i11 = 0;
                boolean z11 = false;
                while (true) {
                    if (i11 < length) {
                        Constructor<?> constructor3 = constructors[i11];
                        Class<?>[] parameterTypes = constructor3.getParameterTypes();
                        q.h(parameterTypes, "it.parameterTypes");
                        if (parameterTypes.length == 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            if (z11) {
                                break;
                            }
                            constructor2 = constructor3;
                            z11 = true;
                        }
                        i11++;
                    } else if (z11) {
                        constructor = constructor2;
                    }
                }
                Constructor<?> constructor4 = constructor;
                if (constructor4 != null) {
                    constructor4.setAccessible(true);
                    Object newInstance = constructor4.newInstance(new Object[0]);
                    q.g(newInstance, "null cannot be cast to non-null type androidx.compose.ui.tooling.preview.PreviewParameterProvider<*>");
                    i2.b bVar = (i2.b) newInstance;
                    if (i10 >= 0) {
                        k10 = o.k(bVar.getValues(), i10);
                        return new Object[]{k10};
                    }
                    return c(bVar.getValues(), bVar.getCount());
                }
                throw new IllegalArgumentException("PreviewParameterProvider constructor can not have parameters");
            } catch (oc.b unused) {
                throw new IllegalStateException("Deploying Compose Previews with PreviewParameterProvider arguments requires adding a dependency to the kotlin-reflect library.\nConsider adding 'debugImplementation \"org.jetbrains.kotlin:kotlin-reflect:$kotlin_version\"' to the module's build.gradle.");
            }
        }
        return new Object[0];
    }

    private static final Object[] c(g<? extends Object> gVar, int i10) {
        Iterator<? extends Object> it = gVar.iterator();
        Object[] objArr = new Object[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = it.next();
        }
        return objArr;
    }
}
