package r8;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: ImmutableList.java */
/* loaded from: classes3.dex */
public final class c0<E> implements List<E>, RandomAccess {

    /* renamed from: f  reason: collision with root package name */
    private final List<E> f22346f;

    private c0(List<E> list) {
        this.f22346f = Collections.unmodifiableList(list);
    }

    public static <E> c0<E> a(List<E> list) {
        return new c0<>(list);
    }

    public static <E> c0<E> e(E... eArr) {
        return new c0<>(Arrays.asList(eArr));
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(E e10) {
        return this.f22346f.add(e10);
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        return this.f22346f.addAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        this.f22346f.clear();
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        return this.f22346f.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        return this.f22346f.containsAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public boolean equals(Object obj) {
        return this.f22346f.equals(obj);
    }

    @Override // java.util.List
    public E get(int i10) {
        return this.f22346f.get(i10);
    }

    @Override // java.util.List, java.util.Collection
    public int hashCode() {
        return this.f22346f.hashCode();
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        return this.f22346f.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.f22346f.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return this.f22346f.iterator();
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        return this.f22346f.lastIndexOf(obj);
    }

    @Override // java.util.List
    public ListIterator<E> listIterator() {
        return this.f22346f.listIterator();
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        return this.f22346f.remove(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        return this.f22346f.removeAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        return this.f22346f.retainAll(collection);
    }

    @Override // java.util.List
    public E set(int i10, E e10) {
        return this.f22346f.set(i10, e10);
    }

    @Override // java.util.List, java.util.Collection
    public int size() {
        return this.f22346f.size();
    }

    @Override // java.util.List
    public List<E> subList(int i10, int i11) {
        return this.f22346f.subList(i10, i11);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return this.f22346f.toArray();
    }

    @Override // java.util.List
    public void add(int i10, E e10) {
        this.f22346f.add(i10, e10);
    }

    @Override // java.util.List
    public boolean addAll(int i10, Collection<? extends E> collection) {
        return this.f22346f.addAll(i10, collection);
    }

    @Override // java.util.List
    public ListIterator<E> listIterator(int i10) {
        return this.f22346f.listIterator(i10);
    }

    @Override // java.util.List
    public E remove(int i10) {
        return this.f22346f.remove(i10);
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) this.f22346f.toArray(tArr);
    }
}
