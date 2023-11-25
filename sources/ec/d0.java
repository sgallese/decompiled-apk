package ec;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import okhttp3.HttpUrl;

/* compiled from: Collections.kt */
/* loaded from: classes4.dex */
public final class d0 implements List, Serializable, RandomAccess, rc.a {

    /* renamed from: f  reason: collision with root package name */
    public static final d0 f14173f = new d0();

    private d0() {
    }

    public boolean a(Void r22) {
        qc.q.i(r22, "element");
        return false;
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ void add(int i10, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i10, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof Void)) {
            return false;
        }
        return a((Void) obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection collection) {
        qc.q.i(collection, "elements");
        return collection.isEmpty();
    }

    @Override // java.util.List
    /* renamed from: e  reason: merged with bridge method [inline-methods] */
    public Void get(int i10) {
        throw new IndexOutOfBoundsException("Empty list doesn't contain element at index " + i10 + '.');
    }

    @Override // java.util.List, java.util.Collection
    public boolean equals(Object obj) {
        if ((obj instanceof List) && ((List) obj).isEmpty()) {
            return true;
        }
        return false;
    }

    public int f() {
        return 0;
    }

    public int h(Void r22) {
        qc.q.i(r22, "element");
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public int hashCode() {
        return 1;
    }

    public int i(Void r22) {
        qc.q.i(r22, "element");
        return -1;
    }

    @Override // java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof Void)) {
            return -1;
        }
        return h((Void) obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return true;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return c0.f14170f;
    }

    @Override // java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof Void)) {
            return -1;
        }
        return i((Void) obj);
    }

    @Override // java.util.List
    public ListIterator listIterator() {
        return c0.f14170f;
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ Object remove(int i10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return f();
    }

    @Override // java.util.List
    public List subList(int i10, int i11) {
        if (i10 == 0 && i11 == 0) {
            return this;
        }
        throw new IndexOutOfBoundsException("fromIndex: " + i10 + ", toIndex: " + i11);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return qc.g.a(this);
    }

    public String toString() {
        return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
    }

    @Override // java.util.List, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public ListIterator listIterator(int i10) {
        if (i10 == 0) {
            return c0.f14170f;
        }
        throw new IndexOutOfBoundsException("Index: " + i10);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        qc.q.i(tArr, "array");
        return (T[]) qc.g.b(this, tArr);
    }
}
