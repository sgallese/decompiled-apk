package com.google.protobuf;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: LazyStringArrayList.java */
/* loaded from: classes3.dex */
public class e0 extends c<String> implements f0, RandomAccess {

    /* renamed from: p  reason: collision with root package name */
    private static final e0 f12284p;

    /* renamed from: q  reason: collision with root package name */
    public static final f0 f12285q;

    /* renamed from: m  reason: collision with root package name */
    private final List<Object> f12286m;

    static {
        e0 e0Var = new e0();
        f12284p = e0Var;
        e0Var.c();
        f12285q = e0Var;
    }

    public e0() {
        this(10);
    }

    private static String f(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof h) {
            return ((h) obj).x();
        }
        return z.j((byte[]) obj);
    }

    @Override // com.google.protobuf.f0
    public Object J0(int i10) {
        return this.f12286m.get(i10);
    }

    @Override // com.google.protobuf.c, com.google.protobuf.z.i
    public /* bridge */ /* synthetic */ boolean R0() {
        return super.R0();
    }

    @Override // com.google.protobuf.f0
    public List<?> T() {
        return Collections.unmodifiableList(this.f12286m);
    }

    @Override // com.google.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        a();
        this.f12286m.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.f0
    public void d(h hVar) {
        a();
        this.f12286m.add(hVar);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: e  reason: merged with bridge method [inline-methods] */
    public void add(int i10, String str) {
        a();
        this.f12286m.add(i10, str);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: g  reason: merged with bridge method [inline-methods] */
    public String get(int i10) {
        Object obj = this.f12286m.get(i10);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            String x10 = hVar.x();
            if (hVar.l()) {
                this.f12286m.set(i10, x10);
            }
            return x10;
        }
        byte[] bArr = (byte[]) obj;
        String j10 = z.j(bArr);
        if (z.g(bArr)) {
            this.f12286m.set(i10, j10);
        }
        return j10;
    }

    @Override // com.google.protobuf.z.i
    /* renamed from: h  reason: merged with bridge method [inline-methods] */
    public e0 b2(int i10) {
        if (i10 >= size()) {
            ArrayList arrayList = new ArrayList(i10);
            arrayList.addAll(this.f12286m);
            return new e0(arrayList);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.List
    /* renamed from: i  reason: merged with bridge method [inline-methods] */
    public String remove(int i10) {
        a();
        Object remove = this.f12286m.remove(i10);
        ((AbstractList) this).modCount++;
        return f(remove);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: j  reason: merged with bridge method [inline-methods] */
    public String set(int i10, String str) {
        a();
        return f(this.f12286m.set(i10, str));
    }

    @Override // com.google.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    @Override // com.google.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f12286m.size();
    }

    @Override // com.google.protobuf.f0
    public f0 z0() {
        if (R0()) {
            return new o1(this);
        }
        return this;
    }

    public e0(int i10) {
        this(new ArrayList(i10));
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.List
    public boolean addAll(int i10, Collection<? extends String> collection) {
        a();
        if (collection instanceof f0) {
            collection = ((f0) collection).T();
        }
        boolean addAll = this.f12286m.addAll(i10, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // com.google.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    private e0(ArrayList<Object> arrayList) {
        this.f12286m = arrayList;
    }
}
