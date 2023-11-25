package androidx.lifecycle;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Lifecycling.kt */
/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a  reason: collision with root package name */
    public static final a0 f4930a = new a0();

    /* renamed from: b  reason: collision with root package name */
    private static final Map<Class<?>, Integer> f4931b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private static final Map<Class<?>, List<Constructor<? extends n>>> f4932c = new HashMap();

    private a0() {
    }

    private final n a(Constructor<? extends n> constructor, Object obj) {
        try {
            n newInstance = constructor.newInstance(obj);
            qc.q.h(newInstance, "{\n            constructo…tance(`object`)\n        }");
            return newInstance;
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException(e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException(e12);
        }
    }

    private final Constructor<? extends n> b(Class<?> cls) {
        String str;
        boolean z10;
        boolean z11;
        try {
            Package r02 = cls.getPackage();
            String canonicalName = cls.getCanonicalName();
            if (r02 != null) {
                str = r02.getName();
            } else {
                str = "";
            }
            qc.q.h(str, "fullPackage");
            if (str.length() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                qc.q.h(canonicalName, AppMeasurementSdk.ConditionalUserProperty.NAME);
                canonicalName = canonicalName.substring(str.length() + 1);
                qc.q.h(canonicalName, "this as java.lang.String).substring(startIndex)");
            }
            qc.q.h(canonicalName, "if (fullPackage.isEmpty(…g(fullPackage.length + 1)");
            String c10 = c(canonicalName);
            if (str.length() == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11) {
                c10 = str + '.' + c10;
            }
            Class<?> cls2 = Class.forName(c10);
            qc.q.g(cls2, "null cannot be cast to non-null type java.lang.Class<out androidx.lifecycle.GeneratedAdapter>");
            Constructor declaredConstructor = cls2.getDeclaredConstructor(cls);
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
                return declaredConstructor;
            }
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static final String c(String str) {
        String B;
        qc.q.i(str, "className");
        StringBuilder sb2 = new StringBuilder();
        B = yc.v.B(str, ".", "_", false, 4, null);
        sb2.append(B);
        sb2.append("_LifecycleAdapter");
        return sb2.toString();
    }

    private final int d(Class<?> cls) {
        Map<Class<?>, Integer> map = f4931b;
        Integer num = map.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int g10 = g(cls);
        map.put(cls, Integer.valueOf(g10));
        return g10;
    }

    private final boolean e(Class<?> cls) {
        if (cls != null && u.class.isAssignableFrom(cls)) {
            return true;
        }
        return false;
    }

    public static final s f(Object obj) {
        qc.q.i(obj, "object");
        boolean z10 = obj instanceof s;
        boolean z11 = obj instanceof i;
        if (z10 && z11) {
            return new DefaultLifecycleObserverAdapter((i) obj, (s) obj);
        }
        if (z11) {
            return new DefaultLifecycleObserverAdapter((i) obj, null);
        }
        if (z10) {
            return (s) obj;
        }
        Class<?> cls = obj.getClass();
        a0 a0Var = f4930a;
        if (a0Var.d(cls) == 2) {
            List<Constructor<? extends n>> list = f4932c.get(cls);
            qc.q.f(list);
            List<Constructor<? extends n>> list2 = list;
            if (list2.size() == 1) {
                return new SingleGeneratedAdapterObserver(a0Var.a(list2.get(0), obj));
            }
            int size = list2.size();
            n[] nVarArr = new n[size];
            for (int i10 = 0; i10 < size; i10++) {
                nVarArr[i10] = f4930a.a(list2.get(i10), obj);
            }
            return new CompositeGeneratedAdaptersObserver(nVarArr);
        }
        return new ReflectiveGenericLifecycleObserver(obj);
    }

    private final int g(Class<?> cls) {
        ArrayList arrayList;
        List<Constructor<? extends n>> d10;
        if (cls.getCanonicalName() == null) {
            return 1;
        }
        Constructor<? extends n> b10 = b(cls);
        if (b10 != null) {
            Map<Class<?>, List<Constructor<? extends n>>> map = f4932c;
            d10 = ec.s.d(b10);
            map.put(cls, d10);
            return 2;
        } else if (d.f4951c.d(cls)) {
            return 1;
        } else {
            Class<? super Object> superclass = cls.getSuperclass();
            if (e(superclass)) {
                qc.q.h(superclass, "superclass");
                if (d(superclass) == 1) {
                    return 1;
                }
                List<Constructor<? extends n>> list = f4932c.get(superclass);
                qc.q.f(list);
                arrayList = new ArrayList(list);
            } else {
                arrayList = null;
            }
            Class<?>[] interfaces = cls.getInterfaces();
            qc.q.h(interfaces, "klass.interfaces");
            for (Class<?> cls2 : interfaces) {
                if (e(cls2)) {
                    qc.q.h(cls2, "intrface");
                    if (d(cls2) == 1) {
                        return 1;
                    }
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    List<Constructor<? extends n>> list2 = f4932c.get(cls2);
                    qc.q.f(list2);
                    arrayList.addAll(list2);
                }
            }
            if (arrayList == null) {
                return 1;
            }
            f4932c.put(cls, arrayList);
            return 2;
        }
    }
}
