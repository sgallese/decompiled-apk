package b9;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: FieldDescriptor.java */
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final String f8090a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<Class<?>, Object> f8091b;

    /* compiled from: FieldDescriptor.java */
    /* renamed from: b9.b$b  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0185b {

        /* renamed from: a  reason: collision with root package name */
        private final String f8092a;

        /* renamed from: b  reason: collision with root package name */
        private Map<Class<?>, Object> f8093b = null;

        C0185b(String str) {
            this.f8092a = str;
        }

        public b a() {
            Map unmodifiableMap;
            String str = this.f8092a;
            if (this.f8093b == null) {
                unmodifiableMap = Collections.emptyMap();
            } else {
                unmodifiableMap = Collections.unmodifiableMap(new HashMap(this.f8093b));
            }
            return new b(str, unmodifiableMap);
        }

        public <T extends Annotation> C0185b b(T t10) {
            if (this.f8093b == null) {
                this.f8093b = new HashMap();
            }
            this.f8093b.put(t10.annotationType(), t10);
            return this;
        }
    }

    public static C0185b a(String str) {
        return new C0185b(str);
    }

    public static b d(String str) {
        return new b(str, Collections.emptyMap());
    }

    public String b() {
        return this.f8090a;
    }

    public <T extends Annotation> T c(Class<T> cls) {
        return (T) this.f8091b.get(cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f8090a.equals(bVar.f8090a) && this.f8091b.equals(bVar.f8091b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f8090a.hashCode() * 31) + this.f8091b.hashCode();
    }

    public String toString() {
        return "FieldDescriptor{name=" + this.f8090a + ", properties=" + this.f8091b.values() + "}";
    }

    private b(String str, Map<Class<?>, Object> map) {
        this.f8090a = str;
        this.f8091b = map;
    }
}
