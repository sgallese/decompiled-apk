package io.realm;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: RealmSet.java */
/* loaded from: classes4.dex */
public class i1<E> implements Set<E>, RealmCollection<E> {

    /* renamed from: f  reason: collision with root package name */
    protected final b<E> f17629f = new c();

    /* compiled from: RealmSet.java */
    /* loaded from: classes4.dex */
    private static abstract class b<E> implements Set<E>, RealmCollection<E> {
        private b() {
        }
    }

    /* compiled from: RealmSet.java */
    /* loaded from: classes4.dex */
    private static class c<E> extends b<E> {

        /* renamed from: f  reason: collision with root package name */
        private final Set<E> f17630f;

        c() {
            super();
            this.f17630f = new HashSet();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(E e10) {
            return this.f17630f.add(e10);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends E> collection) {
            return this.f17630f.addAll(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            this.f17630f.clear();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            return this.f17630f.contains(obj);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            return this.f17630f.containsAll(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return this.f17630f.isEmpty();
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<E> iterator() {
            return this.f17630f.iterator();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            return this.f17630f.remove(obj);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            return this.f17630f.removeAll(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            return this.f17630f.retainAll(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return this.f17630f.size();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            return this.f17630f.toArray();
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) this.f17630f.toArray(tArr);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public boolean add(E e10) {
        return this.f17629f.add(e10);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        return this.f17629f.addAll(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        this.f17629f.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(Object obj) {
        return this.f17629f.contains(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        return this.f17629f.containsAll(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.f17629f.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return this.f17629f.iterator();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object obj) {
        return this.f17629f.remove(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        return this.f17629f.removeAll(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        return this.f17629f.retainAll(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public int size() {
        return this.f17629f.size();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        return this.f17629f.toArray();
    }

    @Override // java.util.Set, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) this.f17629f.toArray(tArr);
    }
}
