package ga;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* compiled from: UnsafeAllocator.java */
/* loaded from: classes3.dex */
public abstract class l {

    /* compiled from: UnsafeAllocator.java */
    /* loaded from: classes3.dex */
    static class a extends l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Method f16318a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Object f16319b;

        a(Method method, Object obj) {
            this.f16318a = method;
            this.f16319b = obj;
        }

        @Override // ga.l
        public <T> T c(Class<T> cls) throws Exception {
            l.a(cls);
            return (T) this.f16318a.invoke(this.f16319b, cls);
        }
    }

    /* compiled from: UnsafeAllocator.java */
    /* loaded from: classes3.dex */
    static class b extends l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Method f16320a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f16321b;

        b(Method method, int i10) {
            this.f16320a = method;
            this.f16321b = i10;
        }

        @Override // ga.l
        public <T> T c(Class<T> cls) throws Exception {
            l.a(cls);
            return (T) this.f16320a.invoke(null, cls, Integer.valueOf(this.f16321b));
        }
    }

    /* compiled from: UnsafeAllocator.java */
    /* loaded from: classes3.dex */
    static class c extends l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Method f16322a;

        c(Method method) {
            this.f16322a = method;
        }

        @Override // ga.l
        public <T> T c(Class<T> cls) throws Exception {
            l.a(cls);
            return (T) this.f16322a.invoke(null, cls, Object.class);
        }
    }

    /* compiled from: UnsafeAllocator.java */
    /* loaded from: classes3.dex */
    static class d extends l {
        d() {
        }

        @Override // ga.l
        public <T> T c(Class<T> cls) {
            throw new UnsupportedOperationException("Cannot allocate " + cls);
        }
    }

    static void a(Class<?> cls) {
        int modifiers = cls.getModifiers();
        if (!Modifier.isInterface(modifiers)) {
            if (!Modifier.isAbstract(modifiers)) {
                return;
            }
            throw new UnsupportedOperationException("Abstract class can't be instantiated! Class name: " + cls.getName());
        }
        throw new UnsupportedOperationException("Interface can't be instantiated! Interface name: " + cls.getName());
    }

    public static l b() {
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            return new a(cls.getMethod("allocateInstance", Class.class), declaredField.get(null));
        } catch (Exception unused) {
            try {
                try {
                    Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                    declaredMethod.setAccessible(true);
                    int intValue = ((Integer) declaredMethod.invoke(null, Object.class)).intValue();
                    Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                    declaredMethod2.setAccessible(true);
                    return new b(declaredMethod2, intValue);
                } catch (Exception unused2) {
                    Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                    declaredMethod3.setAccessible(true);
                    return new c(declaredMethod3);
                }
            } catch (Exception unused3) {
                return new d();
            }
        }
    }

    public abstract <T> T c(Class<T> cls) throws Exception;
}
