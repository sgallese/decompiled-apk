package androidx.lifecycle;

import androidx.lifecycle.p;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: ClassesInfoCache.java */
@Deprecated
/* loaded from: classes.dex */
final class d {

    /* renamed from: c  reason: collision with root package name */
    static d f4951c = new d();

    /* renamed from: a  reason: collision with root package name */
    private final Map<Class<?>, a> f4952a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final Map<Class<?>, Boolean> f4953b = new HashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ClassesInfoCache.java */
    @Deprecated
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        final Map<p.a, List<b>> f4954a = new HashMap();

        /* renamed from: b  reason: collision with root package name */
        final Map<b, p.a> f4955b;

        a(Map<b, p.a> map) {
            this.f4955b = map;
            for (Map.Entry<b, p.a> entry : map.entrySet()) {
                p.a value = entry.getValue();
                List<b> list = this.f4954a.get(value);
                if (list == null) {
                    list = new ArrayList<>();
                    this.f4954a.put(value, list);
                }
                list.add(entry.getKey());
            }
        }

        private static void b(List<b> list, v vVar, p.a aVar, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    list.get(size).a(vVar, aVar, obj);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void a(v vVar, p.a aVar, Object obj) {
            b(this.f4954a.get(aVar), vVar, aVar, obj);
            b(this.f4954a.get(p.a.ON_ANY), vVar, aVar, obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ClassesInfoCache.java */
    @Deprecated
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        final int f4956a;

        /* renamed from: b  reason: collision with root package name */
        final Method f4957b;

        b(int i10, Method method) {
            this.f4956a = i10;
            this.f4957b = method;
            method.setAccessible(true);
        }

        void a(v vVar, p.a aVar, Object obj) {
            try {
                int i10 = this.f4956a;
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            this.f4957b.invoke(obj, vVar, aVar);
                            return;
                        }
                        return;
                    }
                    this.f4957b.invoke(obj, vVar);
                    return;
                }
                this.f4957b.invoke(obj, new Object[0]);
            } catch (IllegalAccessException e10) {
                throw new RuntimeException(e10);
            } catch (InvocationTargetException e11) {
                throw new RuntimeException("Failed to call observer method", e11.getCause());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f4956a == bVar.f4956a && this.f4957b.getName().equals(bVar.f4957b.getName())) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.f4956a * 31) + this.f4957b.getName().hashCode();
        }
    }

    d() {
    }

    private a a(Class<?> cls, Method[] methodArr) {
        int i10;
        a c10;
        Class<? super Object> superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (superclass != null && (c10 = c(superclass)) != null) {
            hashMap.putAll(c10.f4955b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry<b, p.a> entry : c(cls2).f4955b.entrySet()) {
                e(hashMap, entry.getKey(), entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = b(cls);
        }
        boolean z10 = false;
        for (Method method : methodArr) {
            h0 h0Var = (h0) method.getAnnotation(h0.class);
            if (h0Var != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length > 0) {
                    if (v.class.isAssignableFrom(parameterTypes[0])) {
                        i10 = 1;
                    } else {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                } else {
                    i10 = 0;
                }
                p.a value = h0Var.value();
                if (parameterTypes.length > 1) {
                    if (p.a.class.isAssignableFrom(parameterTypes[1])) {
                        if (value == p.a.ON_ANY) {
                            i10 = 2;
                        } else {
                            throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                        }
                    } else {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                }
                if (parameterTypes.length <= 2) {
                    e(hashMap, new b(i10, method), value, cls);
                    z10 = true;
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
        }
        a aVar = new a(hashMap);
        this.f4952a.put(cls, aVar);
        this.f4953b.put(cls, Boolean.valueOf(z10));
        return aVar;
    }

    private Method[] b(Class<?> cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e10) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e10);
        }
    }

    private void e(Map<b, p.a> map, b bVar, p.a aVar, Class<?> cls) {
        p.a aVar2 = map.get(bVar);
        if (aVar2 != null && aVar != aVar2) {
            throw new IllegalArgumentException("Method " + bVar.f4957b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + aVar2 + ", new value " + aVar);
        } else if (aVar2 == null) {
            map.put(bVar, aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a c(Class<?> cls) {
        a aVar = this.f4952a.get(cls);
        if (aVar != null) {
            return aVar;
        }
        return a(cls, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean d(Class<?> cls) {
        Boolean bool = this.f4953b.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        Method[] b10 = b(cls);
        for (Method method : b10) {
            if (((h0) method.getAnnotation(h0.class)) != null) {
                a(cls, b10);
                return true;
            }
        }
        this.f4953b.put(cls, Boolean.FALSE);
        return false;
    }
}
