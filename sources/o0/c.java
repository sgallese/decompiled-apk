package o0;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import qc.q;

/* compiled from: PersistentOrderedSetIterator.kt */
/* loaded from: classes.dex */
public class c<E> implements Iterator<E>, rc.a {

    /* renamed from: f  reason: collision with root package name */
    private Object f20331f;

    /* renamed from: m  reason: collision with root package name */
    private final Map<E, a> f20332m;

    /* renamed from: p  reason: collision with root package name */
    private int f20333p;

    public c(Object obj, Map<E, a> map) {
        q.i(map, "map");
        this.f20331f = obj;
        this.f20332m = map;
    }

    private final void a() {
        if (hasNext()) {
            return;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.f20333p < this.f20332m.size()) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public E next() {
        a();
        E e10 = (E) this.f20331f;
        this.f20333p++;
        a aVar = this.f20332m.get(e10);
        if (aVar != null) {
            this.f20331f = aVar.c();
            return e10;
        }
        throw new ConcurrentModificationException("Hash code of an element (" + e10 + ") has changed after it was added to the persistent set.");
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
