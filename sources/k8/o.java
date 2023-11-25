package k8;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.InvalidRegistrarException;
import com.google.firebase.components.MissingDependencyException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import k8.o;
import s.t0;

/* compiled from: ComponentRuntime.java */
/* loaded from: classes3.dex */
public class o implements e, a9.a {

    /* renamed from: h  reason: collision with root package name */
    private static final i9.b<Set<Object>> f19400h = new i9.b() { // from class: k8.l
        @Override // i9.b
        public final Object get() {
            return Collections.emptySet();
        }
    };

    /* renamed from: a  reason: collision with root package name */
    private final Map<c<?>, i9.b<?>> f19401a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<b0<?>, i9.b<?>> f19402b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<b0<?>, v<?>> f19403c;

    /* renamed from: d  reason: collision with root package name */
    private final List<i9.b<ComponentRegistrar>> f19404d;

    /* renamed from: e  reason: collision with root package name */
    private final t f19405e;

    /* renamed from: f  reason: collision with root package name */
    private final AtomicReference<Boolean> f19406f;

    /* renamed from: g  reason: collision with root package name */
    private final j f19407g;

    public static b m(Executor executor) {
        return new b(executor);
    }

    private void n(List<c<?>> list) {
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator<i9.b<ComponentRegistrar>> it = this.f19404d.iterator();
            while (it.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = it.next().get();
                    if (componentRegistrar != null) {
                        list.addAll(this.f19407g.a(componentRegistrar));
                        it.remove();
                    }
                } catch (InvalidRegistrarException e10) {
                    it.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e10);
                }
            }
            if (this.f19401a.isEmpty()) {
                q.a(list);
            } else {
                ArrayList arrayList2 = new ArrayList(this.f19401a.keySet());
                arrayList2.addAll(list);
                q.a(arrayList2);
            }
            for (final c<?> cVar : list) {
                this.f19401a.put(cVar, new u(new i9.b() { // from class: k8.k
                    @Override // i9.b
                    public final Object get() {
                        Object r10;
                        r10 = o.this.r(cVar);
                        return r10;
                    }
                }));
            }
            arrayList.addAll(w(list));
            arrayList.addAll(x());
            v();
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((Runnable) it2.next()).run();
        }
        u();
    }

    private void o(Map<c<?>, i9.b<?>> map, boolean z10) {
        for (Map.Entry<c<?>, i9.b<?>> entry : map.entrySet()) {
            c<?> key = entry.getKey();
            i9.b<?> value = entry.getValue();
            if (key.n() || (key.o() && z10)) {
                value.get();
            }
        }
        this.f19405e.d();
    }

    private static <T> List<T> q(Iterable<T> iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object r(c cVar) {
        return cVar.h().a(new c0(cVar, this));
    }

    private void u() {
        Boolean bool = this.f19406f.get();
        if (bool != null) {
            o(this.f19401a, bool.booleanValue());
        }
    }

    private void v() {
        for (c<?> cVar : this.f19401a.keySet()) {
            for (r rVar : cVar.g()) {
                if (rVar.g() && !this.f19403c.containsKey(rVar.c())) {
                    this.f19403c.put(rVar.c(), v.b(Collections.emptySet()));
                } else if (this.f19402b.containsKey(rVar.c())) {
                    continue;
                } else if (!rVar.f()) {
                    if (!rVar.g()) {
                        this.f19402b.put(rVar.c(), z.e());
                    }
                } else {
                    throw new MissingDependencyException(String.format("Unsatisfied dependency for component %s: %s", cVar, rVar.c()));
                }
            }
        }
    }

    private List<Runnable> w(List<c<?>> list) {
        ArrayList arrayList = new ArrayList();
        for (c<?> cVar : list) {
            if (cVar.p()) {
                final i9.b<?> bVar = this.f19401a.get(cVar);
                for (b0<? super Object> b0Var : cVar.j()) {
                    if (!this.f19402b.containsKey(b0Var)) {
                        this.f19402b.put(b0Var, bVar);
                    } else {
                        final z zVar = (z) this.f19402b.get(b0Var);
                        arrayList.add(new Runnable() { // from class: k8.m
                            @Override // java.lang.Runnable
                            public final void run() {
                                z.this.j(bVar);
                            }
                        });
                    }
                }
            }
        }
        return arrayList;
    }

    private List<Runnable> x() {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        for (Map.Entry<c<?>, i9.b<?>> entry : this.f19401a.entrySet()) {
            c<?> key = entry.getKey();
            if (!key.p()) {
                i9.b<?> value = entry.getValue();
                for (b0<? super Object> b0Var : key.j()) {
                    if (!hashMap.containsKey(b0Var)) {
                        hashMap.put(b0Var, new HashSet());
                    }
                    ((Set) hashMap.get(b0Var)).add(value);
                }
            }
        }
        for (Map.Entry entry2 : hashMap.entrySet()) {
            if (!this.f19403c.containsKey(entry2.getKey())) {
                this.f19403c.put((b0) entry2.getKey(), v.b((Collection) entry2.getValue()));
            } else {
                final v<?> vVar = this.f19403c.get(entry2.getKey());
                for (final i9.b bVar : (Set) entry2.getValue()) {
                    arrayList.add(new Runnable() { // from class: k8.n
                        @Override // java.lang.Runnable
                        public final void run() {
                            v.this.a(bVar);
                        }
                    });
                }
            }
        }
        return arrayList;
    }

    @Override // k8.e
    public /* synthetic */ Object a(Class cls) {
        return d.a(this, cls);
    }

    @Override // k8.e
    public /* synthetic */ Set b(b0 b0Var) {
        return d.f(this, b0Var);
    }

    @Override // k8.e
    public /* synthetic */ i9.b c(Class cls) {
        return d.d(this, cls);
    }

    @Override // k8.e
    public <T> i9.a<T> d(b0<T> b0Var) {
        i9.b<T> e10 = e(b0Var);
        if (e10 == null) {
            return z.e();
        }
        if (e10 instanceof z) {
            return (z) e10;
        }
        return z.i(e10);
    }

    @Override // k8.e
    public synchronized <T> i9.b<T> e(b0<T> b0Var) {
        a0.c(b0Var, "Null interface requested.");
        return (i9.b<T>) this.f19402b.get(b0Var);
    }

    @Override // k8.e
    public /* synthetic */ Object f(b0 b0Var) {
        return d.b(this, b0Var);
    }

    @Override // k8.e
    public /* synthetic */ Set g(Class cls) {
        return d.e(this, cls);
    }

    @Override // k8.e
    public synchronized <T> i9.b<Set<T>> h(b0<T> b0Var) {
        v<?> vVar = this.f19403c.get(b0Var);
        if (vVar != null) {
            return vVar;
        }
        return (i9.b<Set<T>>) f19400h;
    }

    @Override // k8.e
    public /* synthetic */ i9.a i(Class cls) {
        return d.c(this, cls);
    }

    public void p(boolean z10) {
        HashMap hashMap;
        if (!t0.a(this.f19406f, null, Boolean.valueOf(z10))) {
            return;
        }
        synchronized (this) {
            hashMap = new HashMap(this.f19401a);
        }
        o(hashMap, z10);
    }

    private o(Executor executor, Iterable<i9.b<ComponentRegistrar>> iterable, Collection<c<?>> collection, j jVar) {
        this.f19401a = new HashMap();
        this.f19402b = new HashMap();
        this.f19403c = new HashMap();
        this.f19406f = new AtomicReference<>();
        t tVar = new t(executor);
        this.f19405e = tVar;
        this.f19407g = jVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(c.s(tVar, t.class, f9.d.class, f9.c.class));
        arrayList.add(c.s(this, a9.a.class, new Class[0]));
        for (c<?> cVar : collection) {
            if (cVar != null) {
                arrayList.add(cVar);
            }
        }
        this.f19404d = q(iterable);
        n(arrayList);
    }

    /* compiled from: ComponentRuntime.java */
    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final Executor f19408a;

        /* renamed from: b  reason: collision with root package name */
        private final List<i9.b<ComponentRegistrar>> f19409b = new ArrayList();

        /* renamed from: c  reason: collision with root package name */
        private final List<c<?>> f19410c = new ArrayList();

        /* renamed from: d  reason: collision with root package name */
        private j f19411d = j.f19393a;

        b(Executor executor) {
            this.f19408a = executor;
        }

        public b b(c<?> cVar) {
            this.f19410c.add(cVar);
            return this;
        }

        public b c(final ComponentRegistrar componentRegistrar) {
            this.f19409b.add(new i9.b() { // from class: k8.p
                @Override // i9.b
                public final Object get() {
                    ComponentRegistrar f10;
                    f10 = o.b.f(ComponentRegistrar.this);
                    return f10;
                }
            });
            return this;
        }

        public b d(Collection<i9.b<ComponentRegistrar>> collection) {
            this.f19409b.addAll(collection);
            return this;
        }

        public o e() {
            return new o(this.f19408a, this.f19409b, this.f19410c, this.f19411d);
        }

        public b g(j jVar) {
            this.f19411d = jVar;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ ComponentRegistrar f(ComponentRegistrar componentRegistrar) {
            return componentRegistrar;
        }
    }
}
