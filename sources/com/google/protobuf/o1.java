package com.google.protobuf;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: UnmodifiableLazyStringList.java */
/* loaded from: classes3.dex */
public class o1 extends AbstractList<String> implements f0, RandomAccess {

    /* renamed from: f  reason: collision with root package name */
    private final f0 f12390f;

    /* compiled from: UnmodifiableLazyStringList.java */
    /* loaded from: classes3.dex */
    class a implements ListIterator<String> {

        /* renamed from: f  reason: collision with root package name */
        ListIterator<String> f12391f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ int f12392m;

        a(int i10) {
            this.f12392m = i10;
            this.f12391f = o1.this.f12390f.listIterator(i10);
        }

        @Override // java.util.ListIterator
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public void add(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        /* renamed from: c  reason: merged with bridge method [inline-methods] */
        public String next() {
            return this.f12391f.next();
        }

        @Override // java.util.ListIterator
        /* renamed from: d  reason: merged with bridge method [inline-methods] */
        public String previous() {
            return this.f12391f.previous();
        }

        @Override // java.util.ListIterator
        /* renamed from: e  reason: merged with bridge method [inline-methods] */
        public void set(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f12391f.hasNext();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f12391f.hasPrevious();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f12391f.nextIndex();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f12391f.previousIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* compiled from: UnmodifiableLazyStringList.java */
    /* loaded from: classes3.dex */
    class b implements Iterator<String> {

        /* renamed from: f  reason: collision with root package name */
        Iterator<String> f12394f;

        b() {
            this.f12394f = o1.this.f12390f.iterator();
        }

        @Override // java.util.Iterator
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public String next() {
            return this.f12394f.next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f12394f.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public o1(f0 f0Var) {
        this.f12390f = f0Var;
    }

    @Override // com.google.protobuf.f0
    public Object J0(int i10) {
        return this.f12390f.J0(i10);
    }

    @Override // com.google.protobuf.f0
    public List<?> T() {
        return this.f12390f.T();
    }

    @Override // com.google.protobuf.f0
    public void d(h hVar) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: e  reason: merged with bridge method [inline-methods] */
    public String get(int i10) {
        return (String) this.f12390f.get(i10);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<String> iterator() {
        return new b();
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<String> listIterator(int i10) {
        return new a(i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f12390f.size();
    }

    @Override // com.google.protobuf.f0
    public f0 z0() {
        return this;
    }
}
