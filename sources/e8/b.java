package e8;

import java.io.Serializable;

/* compiled from: Equivalence.java */
/* loaded from: classes3.dex */
public abstract class b<T> {

    /* compiled from: Equivalence.java */
    /* loaded from: classes3.dex */
    static final class a extends b<Object> implements Serializable {

        /* renamed from: f  reason: collision with root package name */
        static final a f14120f = new a();

        a() {
        }

        @Override // e8.b
        protected boolean a(Object obj, Object obj2) {
            return obj.equals(obj2);
        }

        @Override // e8.b
        protected int b(Object obj) {
            return obj.hashCode();
        }
    }

    /* compiled from: Equivalence.java */
    /* renamed from: e8.b$b  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    static final class C0333b extends b<Object> implements Serializable {

        /* renamed from: f  reason: collision with root package name */
        static final C0333b f14121f = new C0333b();

        C0333b() {
        }

        @Override // e8.b
        protected boolean a(Object obj, Object obj2) {
            return false;
        }

        @Override // e8.b
        protected int b(Object obj) {
            return System.identityHashCode(obj);
        }
    }

    protected b() {
    }

    public static b<Object> c() {
        return a.f14120f;
    }

    public static b<Object> f() {
        return C0333b.f14121f;
    }

    protected abstract boolean a(T t10, T t11);

    protected abstract int b(T t10);

    public final boolean d(T t10, T t11) {
        if (t10 == t11) {
            return true;
        }
        if (t10 != null && t11 != null) {
            return a(t10, t11);
        }
        return false;
    }

    public final int e(T t10) {
        if (t10 == null) {
            return 0;
        }
        return b(t10);
    }
}
