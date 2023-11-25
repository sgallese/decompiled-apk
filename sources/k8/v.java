package k8;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LazySet.java */
/* loaded from: classes3.dex */
public class v<T> implements i9.b<Set<T>> {

    /* renamed from: b  reason: collision with root package name */
    private volatile Set<T> f19430b = null;

    /* renamed from: a  reason: collision with root package name */
    private volatile Set<i9.b<T>> f19429a = Collections.newSetFromMap(new ConcurrentHashMap());

    v(Collection<i9.b<T>> collection) {
        this.f19429a.addAll(collection);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static v<?> b(Collection<i9.b<?>> collection) {
        return new v<>((Set) collection);
    }

    private synchronized void d() {
        Iterator<i9.b<T>> it = this.f19429a.iterator();
        while (it.hasNext()) {
            this.f19430b.add(it.next().get());
        }
        this.f19429a = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void a(i9.b<T> bVar) {
        if (this.f19430b == null) {
            this.f19429a.add(bVar);
        } else {
            this.f19430b.add(bVar.get());
        }
    }

    @Override // i9.b
    /* renamed from: c  reason: merged with bridge method [inline-methods] */
    public Set<T> get() {
        if (this.f19430b == null) {
            synchronized (this) {
                if (this.f19430b == null) {
                    this.f19430b = Collections.newSetFromMap(new ConcurrentHashMap());
                    d();
                }
            }
        }
        return Collections.unmodifiableSet(this.f19430b);
    }
}
