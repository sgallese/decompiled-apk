package androidx.lifecycle;

import android.app.Application;
import j3.a;
import java.lang.reflect.InvocationTargetException;

/* compiled from: ViewModelProvider.kt */
/* loaded from: classes.dex */
public class y0 {

    /* renamed from: a  reason: collision with root package name */
    private final b1 f5074a;

    /* renamed from: b  reason: collision with root package name */
    private final b f5075b;

    /* renamed from: c  reason: collision with root package name */
    private final j3.a f5076c;

    /* compiled from: ViewModelProvider.kt */
    /* loaded from: classes.dex */
    public interface b {
        <T extends v0> T a(Class<T> cls);

        <T extends v0> T b(Class<T> cls, j3.a aVar);
    }

    /* compiled from: ViewModelProvider.kt */
    /* loaded from: classes.dex */
    public static class c implements b {

        /* renamed from: b  reason: collision with root package name */
        private static c f5083b;

        /* renamed from: a  reason: collision with root package name */
        public static final a f5082a = new a(null);

        /* renamed from: c  reason: collision with root package name */
        public static final a.b<String> f5084c = a.C0103a.f5085a;

        /* compiled from: ViewModelProvider.kt */
        /* loaded from: classes.dex */
        public static final class a {

            /* compiled from: ViewModelProvider.kt */
            /* renamed from: androidx.lifecycle.y0$c$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            private static final class C0103a implements a.b<String> {

                /* renamed from: a  reason: collision with root package name */
                public static final C0103a f5085a = new C0103a();

                private C0103a() {
                }
            }

            private a() {
            }

            public /* synthetic */ a(qc.h hVar) {
                this();
            }

            public final c a() {
                if (c.f5083b == null) {
                    c.f5083b = new c();
                }
                c cVar = c.f5083b;
                qc.q.f(cVar);
                return cVar;
            }
        }

        @Override // androidx.lifecycle.y0.b
        public <T extends v0> T a(Class<T> cls) {
            qc.q.i(cls, "modelClass");
            try {
                T newInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                qc.q.h(newInstance, "{\n                modelC…wInstance()\n            }");
                return newInstance;
            } catch (IllegalAccessException e10) {
                throw new RuntimeException("Cannot create an instance of " + cls, e10);
            } catch (InstantiationException e11) {
                throw new RuntimeException("Cannot create an instance of " + cls, e11);
            } catch (NoSuchMethodException e12) {
                throw new RuntimeException("Cannot create an instance of " + cls, e12);
            }
        }

        @Override // androidx.lifecycle.y0.b
        public /* synthetic */ v0 b(Class cls, j3.a aVar) {
            return z0.b(this, cls, aVar);
        }
    }

    /* compiled from: ViewModelProvider.kt */
    /* loaded from: classes.dex */
    public static class d {
        public void c(v0 v0Var) {
            qc.q.i(v0Var, "viewModel");
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public y0(b1 b1Var, b bVar) {
        this(b1Var, bVar, null, 4, null);
        qc.q.i(b1Var, "store");
        qc.q.i(bVar, "factory");
    }

    public <T extends v0> T a(Class<T> cls) {
        qc.q.i(cls, "modelClass");
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return (T) b("androidx.lifecycle.ViewModelProvider.DefaultKey:" + canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public <T extends v0> T b(String str, Class<T> cls) {
        T t10;
        d dVar;
        qc.q.i(str, "key");
        qc.q.i(cls, "modelClass");
        T t11 = (T) this.f5074a.b(str);
        if (cls.isInstance(t11)) {
            b bVar = this.f5075b;
            if (bVar instanceof d) {
                dVar = (d) bVar;
            } else {
                dVar = null;
            }
            if (dVar != null) {
                qc.q.f(t11);
                dVar.c(t11);
            }
            qc.q.g(t11, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
            return t11;
        }
        j3.d dVar2 = new j3.d(this.f5076c);
        dVar2.c(c.f5084c, str);
        try {
            t10 = (T) this.f5075b.b(cls, dVar2);
        } catch (AbstractMethodError unused) {
            t10 = (T) this.f5075b.a(cls);
        }
        this.f5074a.d(str, t10);
        return t10;
    }

    /* compiled from: ViewModelProvider.kt */
    /* loaded from: classes.dex */
    public static class a extends c {

        /* renamed from: f  reason: collision with root package name */
        private static a f5078f;

        /* renamed from: d  reason: collision with root package name */
        private final Application f5080d;

        /* renamed from: e  reason: collision with root package name */
        public static final C0101a f5077e = new C0101a(null);

        /* renamed from: g  reason: collision with root package name */
        public static final a.b<Application> f5079g = C0101a.C0102a.f5081a;

        /* compiled from: ViewModelProvider.kt */
        /* renamed from: androidx.lifecycle.y0$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0101a {

            /* compiled from: ViewModelProvider.kt */
            /* renamed from: androidx.lifecycle.y0$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            private static final class C0102a implements a.b<Application> {

                /* renamed from: a  reason: collision with root package name */
                public static final C0102a f5081a = new C0102a();

                private C0102a() {
                }
            }

            private C0101a() {
            }

            public /* synthetic */ C0101a(qc.h hVar) {
                this();
            }

            public final b a(c1 c1Var) {
                qc.q.i(c1Var, "owner");
                if (c1Var instanceof o) {
                    return ((o) c1Var).getDefaultViewModelProviderFactory();
                }
                return c.f5082a.a();
            }

            public final a b(Application application) {
                qc.q.i(application, "application");
                if (a.f5078f == null) {
                    a.f5078f = new a(application);
                }
                a aVar = a.f5078f;
                qc.q.f(aVar);
                return aVar;
            }
        }

        private a(Application application, int i10) {
            this.f5080d = application;
        }

        private final <T extends v0> T g(Class<T> cls, Application application) {
            if (androidx.lifecycle.b.class.isAssignableFrom(cls)) {
                try {
                    T newInstance = cls.getConstructor(Application.class).newInstance(application);
                    qc.q.h(newInstance, "{\n                try {\n…          }\n            }");
                    return newInstance;
                } catch (IllegalAccessException e10) {
                    throw new RuntimeException("Cannot create an instance of " + cls, e10);
                } catch (InstantiationException e11) {
                    throw new RuntimeException("Cannot create an instance of " + cls, e11);
                } catch (NoSuchMethodException e12) {
                    throw new RuntimeException("Cannot create an instance of " + cls, e12);
                } catch (InvocationTargetException e13) {
                    throw new RuntimeException("Cannot create an instance of " + cls, e13);
                }
            }
            return (T) super.a(cls);
        }

        @Override // androidx.lifecycle.y0.c, androidx.lifecycle.y0.b
        public <T extends v0> T a(Class<T> cls) {
            qc.q.i(cls, "modelClass");
            Application application = this.f5080d;
            if (application != null) {
                return (T) g(cls, application);
            }
            throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        }

        @Override // androidx.lifecycle.y0.c, androidx.lifecycle.y0.b
        public <T extends v0> T b(Class<T> cls, j3.a aVar) {
            qc.q.i(cls, "modelClass");
            qc.q.i(aVar, "extras");
            if (this.f5080d != null) {
                return (T) a(cls);
            }
            Application application = (Application) aVar.a(f5079g);
            if (application != null) {
                return (T) g(cls, application);
            }
            if (!androidx.lifecycle.b.class.isAssignableFrom(cls)) {
                return (T) super.a(cls);
            }
            throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
        }

        public a() {
            this(null, 0);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(Application application) {
            this(application, 0);
            qc.q.i(application, "application");
        }
    }

    public y0(b1 b1Var, b bVar, j3.a aVar) {
        qc.q.i(b1Var, "store");
        qc.q.i(bVar, "factory");
        qc.q.i(aVar, "defaultCreationExtras");
        this.f5074a = b1Var;
        this.f5075b = bVar;
        this.f5076c = aVar;
    }

    public /* synthetic */ y0(b1 b1Var, b bVar, j3.a aVar, int i10, qc.h hVar) {
        this(b1Var, bVar, (i10 & 4) != 0 ? a.C0424a.f19017b : aVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public y0(c1 c1Var) {
        this(c1Var.getViewModelStore(), a.f5077e.a(c1Var), a1.a(c1Var));
        qc.q.i(c1Var, "owner");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public y0(c1 c1Var, b bVar) {
        this(c1Var.getViewModelStore(), bVar, a1.a(c1Var));
        qc.q.i(c1Var, "owner");
        qc.q.i(bVar, "factory");
    }
}
