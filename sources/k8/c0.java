package k8;

import com.google.firebase.components.DependencyException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: RestrictedComponentContainer.java */
/* loaded from: classes3.dex */
final class c0 implements e {

    /* renamed from: a  reason: collision with root package name */
    private final Set<b0<?>> f19380a;

    /* renamed from: b  reason: collision with root package name */
    private final Set<b0<?>> f19381b;

    /* renamed from: c  reason: collision with root package name */
    private final Set<b0<?>> f19382c;

    /* renamed from: d  reason: collision with root package name */
    private final Set<b0<?>> f19383d;

    /* renamed from: e  reason: collision with root package name */
    private final Set<b0<?>> f19384e;

    /* renamed from: f  reason: collision with root package name */
    private final Set<Class<?>> f19385f;

    /* renamed from: g  reason: collision with root package name */
    private final e f19386g;

    /* compiled from: RestrictedComponentContainer.java */
    /* loaded from: classes3.dex */
    private static class a implements f9.c {

        /* renamed from: a  reason: collision with root package name */
        private final Set<Class<?>> f19387a;

        /* renamed from: b  reason: collision with root package name */
        private final f9.c f19388b;

        public a(Set<Class<?>> set, f9.c cVar) {
            this.f19387a = set;
            this.f19388b = cVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c0(c<?> cVar, e eVar) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (r rVar : cVar.g()) {
            if (rVar.e()) {
                if (rVar.g()) {
                    hashSet4.add(rVar.c());
                } else {
                    hashSet.add(rVar.c());
                }
            } else if (rVar.d()) {
                hashSet3.add(rVar.c());
            } else if (rVar.g()) {
                hashSet5.add(rVar.c());
            } else {
                hashSet2.add(rVar.c());
            }
        }
        if (!cVar.k().isEmpty()) {
            hashSet.add(b0.b(f9.c.class));
        }
        this.f19380a = Collections.unmodifiableSet(hashSet);
        this.f19381b = Collections.unmodifiableSet(hashSet2);
        this.f19382c = Collections.unmodifiableSet(hashSet3);
        this.f19383d = Collections.unmodifiableSet(hashSet4);
        this.f19384e = Collections.unmodifiableSet(hashSet5);
        this.f19385f = cVar.k();
        this.f19386g = eVar;
    }

    @Override // k8.e
    public <T> T a(Class<T> cls) {
        if (this.f19380a.contains(b0.b(cls))) {
            T t10 = (T) this.f19386g.a(cls);
            if (!cls.equals(f9.c.class)) {
                return t10;
            }
            return (T) new a(this.f19385f, (f9.c) t10);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency %s.", cls));
    }

    @Override // k8.e
    public <T> Set<T> b(b0<T> b0Var) {
        if (this.f19383d.contains(b0Var)) {
            return this.f19386g.b(b0Var);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Set<%s>.", b0Var));
    }

    @Override // k8.e
    public <T> i9.b<T> c(Class<T> cls) {
        return e(b0.b(cls));
    }

    @Override // k8.e
    public <T> i9.a<T> d(b0<T> b0Var) {
        if (this.f19382c.contains(b0Var)) {
            return this.f19386g.d(b0Var);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Deferred<%s>.", b0Var));
    }

    @Override // k8.e
    public <T> i9.b<T> e(b0<T> b0Var) {
        if (this.f19381b.contains(b0Var)) {
            return this.f19386g.e(b0Var);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Provider<%s>.", b0Var));
    }

    @Override // k8.e
    public <T> T f(b0<T> b0Var) {
        if (this.f19380a.contains(b0Var)) {
            return (T) this.f19386g.f(b0Var);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency %s.", b0Var));
    }

    @Override // k8.e
    public /* synthetic */ Set g(Class cls) {
        return d.e(this, cls);
    }

    @Override // k8.e
    public <T> i9.b<Set<T>> h(b0<T> b0Var) {
        if (this.f19384e.contains(b0Var)) {
            return this.f19386g.h(b0Var);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", b0Var));
    }

    @Override // k8.e
    public <T> i9.a<T> i(Class<T> cls) {
        return d(b0.b(cls));
    }
}
