package ga;

import com.google.gson.JsonIOException;
import com.google.gson.reflect.TypeToken;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;

/* compiled from: ConstructorConstructor.java */
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final Map<Type, com.google.gson.h<?>> f16264a;

    /* renamed from: b  reason: collision with root package name */
    private final ia.b f16265b = ia.b.a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: ConstructorConstructor.java */
    /* loaded from: classes3.dex */
    public class a<T> implements ga.h<T> {
        a() {
        }

        @Override // ga.h
        public T a() {
            return (T) new ConcurrentHashMap();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: ConstructorConstructor.java */
    /* loaded from: classes3.dex */
    public class b<T> implements ga.h<T> {
        b() {
        }

        @Override // ga.h
        public T a() {
            return (T) new TreeMap();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: ConstructorConstructor.java */
    /* renamed from: ga.c$c  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public class C0382c<T> implements ga.h<T> {
        C0382c() {
        }

        @Override // ga.h
        public T a() {
            return (T) new LinkedHashMap();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: ConstructorConstructor.java */
    /* loaded from: classes3.dex */
    public class d<T> implements ga.h<T> {
        d() {
        }

        @Override // ga.h
        public T a() {
            return (T) new ga.g();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: ConstructorConstructor.java */
    /* loaded from: classes3.dex */
    public class e<T> implements ga.h<T> {

        /* renamed from: a  reason: collision with root package name */
        private final ga.l f16270a = ga.l.b();

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Class f16271b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Type f16272c;

        e(Class cls, Type type) {
            this.f16271b = cls;
            this.f16272c = type;
        }

        @Override // ga.h
        public T a() {
            try {
                return (T) this.f16270a.c(this.f16271b);
            } catch (Exception e10) {
                throw new RuntimeException("Unable to invoke no-args constructor for " + this.f16272c + ". Registering an InstanceCreator with Gson for this type may fix this problem.", e10);
            }
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: ConstructorConstructor.java */
    /* loaded from: classes3.dex */
    class f<T> implements ga.h<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.google.gson.h f16274a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Type f16275b;

        f(com.google.gson.h hVar, Type type) {
            this.f16274a = hVar;
            this.f16275b = type;
        }

        @Override // ga.h
        public T a() {
            return (T) this.f16274a.a(this.f16275b);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: ConstructorConstructor.java */
    /* loaded from: classes3.dex */
    class g<T> implements ga.h<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.google.gson.h f16277a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Type f16278b;

        g(com.google.gson.h hVar, Type type) {
            this.f16277a = hVar;
            this.f16278b = type;
        }

        @Override // ga.h
        public T a() {
            return (T) this.f16277a.a(this.f16278b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: ConstructorConstructor.java */
    /* loaded from: classes3.dex */
    public class h<T> implements ga.h<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Constructor f16280a;

        h(Constructor constructor) {
            this.f16280a = constructor;
        }

        @Override // ga.h
        public T a() {
            try {
                return (T) this.f16280a.newInstance(null);
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            } catch (InstantiationException e11) {
                throw new RuntimeException("Failed to invoke " + this.f16280a + " with no args", e11);
            } catch (InvocationTargetException e12) {
                throw new RuntimeException("Failed to invoke " + this.f16280a + " with no args", e12.getTargetException());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: ConstructorConstructor.java */
    /* loaded from: classes3.dex */
    public class i<T> implements ga.h<T> {
        i() {
        }

        @Override // ga.h
        public T a() {
            return (T) new TreeSet();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: ConstructorConstructor.java */
    /* loaded from: classes3.dex */
    public class j<T> implements ga.h<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Type f16283a;

        j(Type type) {
            this.f16283a = type;
        }

        @Override // ga.h
        public T a() {
            Type type = this.f16283a;
            if (type instanceof ParameterizedType) {
                Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
                if (type2 instanceof Class) {
                    return (T) EnumSet.noneOf((Class) type2);
                }
                throw new JsonIOException("Invalid EnumSet type: " + this.f16283a.toString());
            }
            throw new JsonIOException("Invalid EnumSet type: " + this.f16283a.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: ConstructorConstructor.java */
    /* loaded from: classes3.dex */
    public class k<T> implements ga.h<T> {
        k() {
        }

        @Override // ga.h
        public T a() {
            return (T) new LinkedHashSet();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: ConstructorConstructor.java */
    /* loaded from: classes3.dex */
    public class l<T> implements ga.h<T> {
        l() {
        }

        @Override // ga.h
        public T a() {
            return (T) new ArrayDeque();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: ConstructorConstructor.java */
    /* loaded from: classes3.dex */
    public class m<T> implements ga.h<T> {
        m() {
        }

        @Override // ga.h
        public T a() {
            return (T) new ArrayList();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: ConstructorConstructor.java */
    /* loaded from: classes3.dex */
    public class n<T> implements ga.h<T> {
        n() {
        }

        @Override // ga.h
        public T a() {
            return (T) new ConcurrentSkipListMap();
        }
    }

    public c(Map<Type, com.google.gson.h<?>> map) {
        this.f16264a = map;
    }

    private <T> ga.h<T> b(Class<? super T> cls) {
        try {
            Constructor<? super T> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            if (!declaredConstructor.isAccessible()) {
                this.f16265b.b(declaredConstructor);
            }
            return new h(declaredConstructor);
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    private <T> ga.h<T> c(Type type, Class<? super T> cls) {
        if (Collection.class.isAssignableFrom(cls)) {
            if (SortedSet.class.isAssignableFrom(cls)) {
                return new i();
            }
            if (EnumSet.class.isAssignableFrom(cls)) {
                return new j(type);
            }
            if (Set.class.isAssignableFrom(cls)) {
                return new k();
            }
            if (Queue.class.isAssignableFrom(cls)) {
                return new l();
            }
            return new m();
        } else if (Map.class.isAssignableFrom(cls)) {
            if (ConcurrentNavigableMap.class.isAssignableFrom(cls)) {
                return new n();
            }
            if (ConcurrentMap.class.isAssignableFrom(cls)) {
                return new a();
            }
            if (SortedMap.class.isAssignableFrom(cls)) {
                return new b();
            }
            if ((type instanceof ParameterizedType) && !String.class.isAssignableFrom(TypeToken.get(((ParameterizedType) type).getActualTypeArguments()[0]).getRawType())) {
                return new C0382c();
            }
            return new d();
        } else {
            return null;
        }
    }

    private <T> ga.h<T> d(Type type, Class<? super T> cls) {
        return new e(cls, type);
    }

    public <T> ga.h<T> a(TypeToken<T> typeToken) {
        Type type = typeToken.getType();
        Class<? super T> rawType = typeToken.getRawType();
        com.google.gson.h<?> hVar = this.f16264a.get(type);
        if (hVar != null) {
            return new f(hVar, type);
        }
        com.google.gson.h<?> hVar2 = this.f16264a.get(rawType);
        if (hVar2 != null) {
            return new g(hVar2, type);
        }
        ga.h<T> b10 = b(rawType);
        if (b10 != null) {
            return b10;
        }
        ga.h<T> c10 = c(type, rawType);
        if (c10 != null) {
            return c10;
        }
        return d(type, rawType);
    }

    public String toString() {
        return this.f16264a.toString();
    }
}
