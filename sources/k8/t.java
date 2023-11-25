package k8;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: EventBus.java */
/* loaded from: classes3.dex */
class t implements f9.d, f9.c {

    /* renamed from: a  reason: collision with root package name */
    private final Map<Class<?>, ConcurrentHashMap<f9.b<Object>, Executor>> f19423a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private Queue<f9.a<?>> f19424b = new ArrayDeque();

    /* renamed from: c  reason: collision with root package name */
    private final Executor f19425c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public t(Executor executor) {
        this.f19425c = executor;
    }

    private synchronized Set<Map.Entry<f9.b<Object>, Executor>> e(f9.a<?> aVar) {
        Set<Map.Entry<f9.b<Object>, Executor>> entrySet;
        ConcurrentHashMap<f9.b<Object>, Executor> concurrentHashMap = this.f19423a.get(aVar.b());
        if (concurrentHashMap == null) {
            entrySet = Collections.emptySet();
        } else {
            entrySet = concurrentHashMap.entrySet();
        }
        return entrySet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void f(Map.Entry entry, f9.a aVar) {
        ((f9.b) entry.getKey()).a(aVar);
    }

    @Override // f9.d
    public <T> void a(Class<T> cls, f9.b<? super T> bVar) {
        b(cls, this.f19425c, bVar);
    }

    @Override // f9.d
    public synchronized <T> void b(Class<T> cls, Executor executor, f9.b<? super T> bVar) {
        a0.b(cls);
        a0.b(bVar);
        a0.b(executor);
        if (!this.f19423a.containsKey(cls)) {
            this.f19423a.put(cls, new ConcurrentHashMap<>());
        }
        this.f19423a.get(cls).put(bVar, executor);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d() {
        Queue<f9.a<?>> queue;
        synchronized (this) {
            queue = this.f19424b;
            if (queue != null) {
                this.f19424b = null;
            } else {
                queue = null;
            }
        }
        if (queue != null) {
            Iterator<f9.a<?>> it = queue.iterator();
            while (it.hasNext()) {
                g(it.next());
            }
        }
    }

    public void g(final f9.a<?> aVar) {
        a0.b(aVar);
        synchronized (this) {
            Queue<f9.a<?>> queue = this.f19424b;
            if (queue != null) {
                queue.add(aVar);
                return;
            }
            for (final Map.Entry<f9.b<Object>, Executor> entry : e(aVar)) {
                entry.getValue().execute(new Runnable() { // from class: k8.s
                    @Override // java.lang.Runnable
                    public final void run() {
                        t.f(entry, aVar);
                    }
                });
            }
        }
    }
}
