package com.google.common.collect;

/* compiled from: RegularImmutableSet.java */
/* loaded from: classes3.dex */
final class w<E> extends k<E> {

    /* renamed from: u  reason: collision with root package name */
    private static final Object[] f11236u;

    /* renamed from: v  reason: collision with root package name */
    static final w<Object> f11237v;

    /* renamed from: p  reason: collision with root package name */
    final transient Object[] f11238p;

    /* renamed from: q  reason: collision with root package name */
    private final transient int f11239q;

    /* renamed from: r  reason: collision with root package name */
    final transient Object[] f11240r;

    /* renamed from: s  reason: collision with root package name */
    private final transient int f11241s;

    /* renamed from: t  reason: collision with root package name */
    private final transient int f11242t;

    static {
        Object[] objArr = new Object[0];
        f11236u = objArr;
        f11237v = new w<>(objArr, 0, objArr, 0, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public w(Object[] objArr, int i10, Object[] objArr2, int i11, int i12) {
        this.f11238p = objArr;
        this.f11239q = i10;
        this.f11240r = objArr2;
        this.f11241s = i11;
        this.f11242t = i12;
    }

    @Override // com.google.common.collect.h
    int a(Object[] objArr, int i10) {
        System.arraycopy(this.f11238p, 0, objArr, i10, this.f11242t);
        return i10 + this.f11242t;
    }

    @Override // com.google.common.collect.h, java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        Object[] objArr = this.f11240r;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int b10 = g.b(obj);
        while (true) {
            int i10 = b10 & this.f11241s;
            Object obj2 = objArr[i10];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            b10 = i10 + 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.h
    public Object[] e() {
        return this.f11238p;
    }

    @Override // com.google.common.collect.h
    int f() {
        return this.f11242t;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.h
    public int g() {
        return 0;
    }

    @Override // com.google.common.collect.k, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: h */
    public a0<E> iterator() {
        return i().iterator();
    }

    @Override // com.google.common.collect.k, java.util.Collection, java.util.Set
    public int hashCode() {
        return this.f11239q;
    }

    @Override // com.google.common.collect.k
    i<E> l() {
        return i.j(this.f11238p, this.f11242t);
    }

    @Override // com.google.common.collect.k
    boolean m() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f11242t;
    }
}
