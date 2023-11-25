package io.realm;

import io.realm.internal.OsResults;
import io.realm.log.RealmLog;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* compiled from: RealmResults.java */
/* loaded from: classes4.dex */
public class g1<E> extends i0<E> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public g1(a aVar, OsResults osResults, Class<E> cls) {
        this(aVar, osResults, (Class) cls, false);
    }

    private void k(Object obj) {
        if (obj != null) {
            this.f17618f.e();
            this.f17618f.f17242r.capabilities.c("Listeners cannot be used on current thread.");
            return;
        }
        throw new IllegalArgumentException("Listener should not be null");
    }

    private void l(Object obj, boolean z10) {
        if (z10 && obj == null) {
            throw new IllegalArgumentException("Listener should not be null");
        }
        if (this.f17618f.isClosed()) {
            RealmLog.g("Calling removeChangeListener on a closed Realm %s, make sure to close all listeners before closing the Realm.", this.f17618f.f17240p.l());
        }
    }

    @Override // io.realm.RealmCollection
    public RealmQuery<E> B() {
        this.f17618f.e();
        return RealmQuery.h(this);
    }

    @Override // io.realm.i0
    public /* bridge */ /* synthetic */ j0 a() {
        return super.a();
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

    @Override // io.realm.i0
    public /* bridge */ /* synthetic */ boolean e() {
        return super.e();
    }

    @Override // io.realm.i0
    public /* bridge */ /* synthetic */ Object first() {
        return super.first();
    }

    @Override // io.realm.i0, java.util.AbstractList, java.util.List
    public /* bridge */ /* synthetic */ Object get(int i10) {
        return super.get(i10);
    }

    @Override // io.realm.RealmCollection
    public boolean isLoaded() {
        this.f17618f.e();
        return this.f17621q.n();
    }

    @Override // io.realm.i0, io.realm.RealmCollection
    public /* bridge */ /* synthetic */ boolean isValid() {
        return super.isValid();
    }

    @Override // io.realm.i0, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return super.iterator();
    }

    public void j(u0<g1<E>> u0Var) {
        k(u0Var);
        this.f17621q.d(this, u0Var);
    }

    @Override // io.realm.i0, java.util.AbstractList, java.util.List
    public /* bridge */ /* synthetic */ ListIterator listIterator() {
        return super.listIterator();
    }

    public g1<E> m() {
        if (isValid()) {
            a z10 = this.f17618f.z();
            OsResults i10 = this.f17621q.i(z10.f17242r);
            String str = this.f17620p;
            if (str != null) {
                return new g1<>(z10, i10, str);
            }
            return new g1<>(z10, i10, this.f17619m);
        }
        throw new IllegalStateException("Only valid, managed RealmResults can be frozen.");
    }

    public boolean n() {
        this.f17618f.e();
        this.f17621q.p();
        return true;
    }

    public void o(u0<g1<E>> u0Var) {
        l(u0Var, true);
        this.f17621q.r(this, u0Var);
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
    public /* bridge */ /* synthetic */ int size() {
        return super.size();
    }

    g1(a aVar, OsResults osResults, Class<E> cls, boolean z10) {
        super(aVar, osResults, cls, i0.g(z10, aVar, osResults, cls, null));
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
    public g1(a aVar, OsResults osResults, String str) {
        this(aVar, osResults, str, false);
    }

    g1(a aVar, OsResults osResults, String str, boolean z10) {
        super(aVar, osResults, str, i0.g(z10, aVar, osResults, null, str));
    }
}
