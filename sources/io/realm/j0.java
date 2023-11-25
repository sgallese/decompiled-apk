package io.realm;

import io.realm.internal.OsResults;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Locale;

/* compiled from: OrderedRealmCollectionSnapshot.java */
/* loaded from: classes4.dex */
public class j0<E> extends i0<E> {

    /* renamed from: s  reason: collision with root package name */
    private int f17865s;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j0(a aVar, OsResults osResults, Class<E> cls) {
        super(aVar, osResults.g(), cls);
        this.f17865s = -1;
    }

    private UnsupportedOperationException j(String str) {
        return new UnsupportedOperationException(String.format(Locale.US, "'%s()' is not supported by OrderedRealmCollectionSnapshot. Call '%s()' on the original 'RealmCollection' instead.", str, str));
    }

    @Override // io.realm.RealmCollection
    @Deprecated
    public RealmQuery<E> B() {
        throw j("where");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.realm.i0, java.util.AbstractList, java.util.List
    @Deprecated
    public /* bridge */ /* synthetic */ void add(int i10, Object obj) {
        super.add(i10, obj);
    }

    @Override // io.realm.i0, java.util.AbstractList, java.util.List
    @Deprecated
    public /* bridge */ /* synthetic */ boolean addAll(int i10, Collection collection) {
        return super.addAll(i10, collection);
    }

    @Override // io.realm.i0, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    @Deprecated
    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    @Override // io.realm.i0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean contains(Object obj) {
        return super.contains(obj);
    }

    @Override // io.realm.i0, java.util.AbstractList, java.util.List
    public /* bridge */ /* synthetic */ Object get(int i10) {
        return super.get(i10);
    }

    @Override // io.realm.RealmCollection
    public boolean isLoaded() {
        return true;
    }

    @Override // io.realm.i0, io.realm.RealmCollection
    public /* bridge */ /* synthetic */ boolean isValid() {
        return super.isValid();
    }

    @Override // io.realm.i0, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return super.iterator();
    }

    @Override // io.realm.i0, java.util.AbstractList, java.util.List
    public /* bridge */ /* synthetic */ ListIterator listIterator() {
        return super.listIterator();
    }

    @Override // io.realm.i0, java.util.AbstractList, java.util.List
    @Deprecated
    public /* bridge */ /* synthetic */ Object remove(int i10) {
        return super.remove(i10);
    }

    @Override // io.realm.i0, java.util.AbstractCollection, java.util.Collection, java.util.List
    @Deprecated
    public /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    @Override // io.realm.i0, java.util.AbstractCollection, java.util.Collection, java.util.List
    @Deprecated
    public /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.realm.i0, java.util.AbstractList, java.util.List
    @Deprecated
    public /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        return super.set(i10, obj);
    }

    @Override // io.realm.i0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        if (this.f17865s == -1) {
            this.f17865s = super.size();
        }
        return this.f17865s;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.realm.i0, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    @Deprecated
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        return super.add(obj);
    }

    @Override // io.realm.i0, java.util.AbstractCollection, java.util.Collection, java.util.List
    @Deprecated
    public /* bridge */ /* synthetic */ boolean addAll(Collection collection) {
        return super.addAll(collection);
    }

    @Override // io.realm.i0, java.util.AbstractList, java.util.List
    public /* bridge */ /* synthetic */ ListIterator listIterator(int i10) {
        return super.listIterator(i10);
    }

    @Override // io.realm.i0, java.util.AbstractCollection, java.util.Collection, java.util.List
    @Deprecated
    public /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public j0(a aVar, OsResults osResults, String str) {
        super(aVar, osResults.g(), str);
        this.f17865s = -1;
    }
}
