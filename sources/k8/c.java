package k8;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: Component.java */
/* loaded from: classes3.dex */
public final class c<T> {

    /* renamed from: a  reason: collision with root package name */
    private final String f19366a;

    /* renamed from: b  reason: collision with root package name */
    private final Set<b0<? super T>> f19367b;

    /* renamed from: c  reason: collision with root package name */
    private final Set<r> f19368c;

    /* renamed from: d  reason: collision with root package name */
    private final int f19369d;

    /* renamed from: e  reason: collision with root package name */
    private final int f19370e;

    /* renamed from: f  reason: collision with root package name */
    private final h<T> f19371f;

    /* renamed from: g  reason: collision with root package name */
    private final Set<Class<?>> f19372g;

    public static <T> b<T> c(Class<T> cls) {
        return new b<>(cls, new Class[0]);
    }

    @SafeVarargs
    public static <T> b<T> d(Class<T> cls, Class<? super T>... clsArr) {
        return new b<>(cls, clsArr);
    }

    public static <T> b<T> e(b0<T> b0Var) {
        return new b<>(b0Var, new b0[0]);
    }

    @SafeVarargs
    public static <T> b<T> f(b0<T> b0Var, b0<? super T>... b0VarArr) {
        return new b<>(b0Var, b0VarArr);
    }

    public static <T> c<T> l(final T t10, Class<T> cls) {
        return m(cls).f(new h() { // from class: k8.a
            @Override // k8.h
            public final Object a(e eVar) {
                Object q10;
                q10 = c.q(t10, eVar);
                return q10;
            }
        }).d();
    }

    public static <T> b<T> m(Class<T> cls) {
        return c(cls).g();
    }

    @SafeVarargs
    public static <T> c<T> s(final T t10, Class<T> cls, Class<? super T>... clsArr) {
        return d(cls, clsArr).f(new h() { // from class: k8.b
            @Override // k8.h
            public final Object a(e eVar) {
                Object r10;
                r10 = c.r(t10, eVar);
                return r10;
            }
        }).d();
    }

    public Set<r> g() {
        return this.f19368c;
    }

    public h<T> h() {
        return this.f19371f;
    }

    public String i() {
        return this.f19366a;
    }

    public Set<b0<? super T>> j() {
        return this.f19367b;
    }

    public Set<Class<?>> k() {
        return this.f19372g;
    }

    public boolean n() {
        if (this.f19369d == 1) {
            return true;
        }
        return false;
    }

    public boolean o() {
        if (this.f19369d == 2) {
            return true;
        }
        return false;
    }

    public boolean p() {
        if (this.f19370e == 0) {
            return true;
        }
        return false;
    }

    public c<T> t(h<T> hVar) {
        return new c<>(this.f19366a, this.f19367b, this.f19368c, this.f19369d, this.f19370e, hVar, this.f19372g);
    }

    public String toString() {
        return "Component<" + Arrays.toString(this.f19367b.toArray()) + ">{" + this.f19369d + ", type=" + this.f19370e + ", deps=" + Arrays.toString(this.f19368c.toArray()) + "}";
    }

    /* compiled from: Component.java */
    /* loaded from: classes3.dex */
    public static class b<T> {

        /* renamed from: a  reason: collision with root package name */
        private String f19373a;

        /* renamed from: b  reason: collision with root package name */
        private final Set<b0<? super T>> f19374b;

        /* renamed from: c  reason: collision with root package name */
        private final Set<r> f19375c;

        /* renamed from: d  reason: collision with root package name */
        private int f19376d;

        /* renamed from: e  reason: collision with root package name */
        private int f19377e;

        /* renamed from: f  reason: collision with root package name */
        private h<T> f19378f;

        /* renamed from: g  reason: collision with root package name */
        private final Set<Class<?>> f19379g;

        /* JADX INFO: Access modifiers changed from: private */
        public b<T> g() {
            this.f19377e = 1;
            return this;
        }

        private b<T> i(int i10) {
            boolean z10;
            if (this.f19376d == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            a0.d(z10, "Instantiation type has already been set.");
            this.f19376d = i10;
            return this;
        }

        private void j(b0<?> b0Var) {
            a0.a(!this.f19374b.contains(b0Var), "Components are not allowed to depend on interfaces they themselves provide.");
        }

        public b<T> b(r rVar) {
            a0.c(rVar, "Null dependency");
            j(rVar.c());
            this.f19375c.add(rVar);
            return this;
        }

        public b<T> c() {
            return i(1);
        }

        public c<T> d() {
            boolean z10;
            if (this.f19378f != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            a0.d(z10, "Missing required property: factory.");
            return new c<>(this.f19373a, new HashSet(this.f19374b), new HashSet(this.f19375c), this.f19376d, this.f19377e, this.f19378f, this.f19379g);
        }

        public b<T> e() {
            return i(2);
        }

        public b<T> f(h<T> hVar) {
            this.f19378f = (h) a0.c(hVar, "Null factory");
            return this;
        }

        public b<T> h(String str) {
            this.f19373a = str;
            return this;
        }

        @SafeVarargs
        private b(Class<T> cls, Class<? super T>... clsArr) {
            this.f19373a = null;
            HashSet hashSet = new HashSet();
            this.f19374b = hashSet;
            this.f19375c = new HashSet();
            this.f19376d = 0;
            this.f19377e = 0;
            this.f19379g = new HashSet();
            a0.c(cls, "Null interface");
            hashSet.add(b0.b(cls));
            for (Class<? super T> cls2 : clsArr) {
                a0.c(cls2, "Null interface");
                this.f19374b.add(b0.b(cls2));
            }
        }

        @SafeVarargs
        private b(b0<T> b0Var, b0<? super T>... b0VarArr) {
            this.f19373a = null;
            HashSet hashSet = new HashSet();
            this.f19374b = hashSet;
            this.f19375c = new HashSet();
            this.f19376d = 0;
            this.f19377e = 0;
            this.f19379g = new HashSet();
            a0.c(b0Var, "Null interface");
            hashSet.add(b0Var);
            for (b0<? super T> b0Var2 : b0VarArr) {
                a0.c(b0Var2, "Null interface");
            }
            Collections.addAll(this.f19374b, b0VarArr);
        }
    }

    private c(String str, Set<b0<? super T>> set, Set<r> set2, int i10, int i11, h<T> hVar, Set<Class<?>> set3) {
        this.f19366a = str;
        this.f19367b = Collections.unmodifiableSet(set);
        this.f19368c = Collections.unmodifiableSet(set2);
        this.f19369d = i10;
        this.f19370e = i11;
        this.f19371f = hVar;
        this.f19372g = Collections.unmodifiableSet(set3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object q(Object obj, e eVar) {
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object r(Object obj, e eVar) {
        return obj;
    }
}
