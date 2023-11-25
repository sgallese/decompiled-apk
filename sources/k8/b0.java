package k8;

import java.lang.annotation.Annotation;

/* compiled from: Qualified.java */
/* loaded from: classes3.dex */
public final class b0<T> {

    /* renamed from: a  reason: collision with root package name */
    private final Class<? extends Annotation> f19364a;

    /* renamed from: b  reason: collision with root package name */
    private final Class<T> f19365b;

    /* compiled from: Qualified.java */
    /* loaded from: classes3.dex */
    private @interface a {
    }

    public b0(Class<? extends Annotation> cls, Class<T> cls2) {
        this.f19364a = cls;
        this.f19365b = cls2;
    }

    public static <T> b0<T> a(Class<? extends Annotation> cls, Class<T> cls2) {
        return new b0<>(cls, cls2);
    }

    public static <T> b0<T> b(Class<T> cls) {
        return new b0<>(a.class, cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b0.class != obj.getClass()) {
            return false;
        }
        b0 b0Var = (b0) obj;
        if (!this.f19365b.equals(b0Var.f19365b)) {
            return false;
        }
        return this.f19364a.equals(b0Var.f19364a);
    }

    public int hashCode() {
        return (this.f19365b.hashCode() * 31) + this.f19364a.hashCode();
    }

    public String toString() {
        if (this.f19364a == a.class) {
            return this.f19365b.getName();
        }
        return "@" + this.f19364a.getName() + " " + this.f19365b.getName();
    }
}
