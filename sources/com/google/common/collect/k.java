package com.google.common.collect;

import j$.util.Objects;
import java.util.Arrays;
import java.util.Set;

/* compiled from: ImmutableSet.java */
/* loaded from: classes3.dex */
public abstract class k<E> extends h<E> implements Set<E> {

    /* renamed from: m  reason: collision with root package name */
    private transient i<E> f11161m;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int j(int i10) {
        int max = Math.max(i10, 2);
        boolean z10 = true;
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1) << 1;
            while (highestOneBit * 0.7d < max) {
                highestOneBit <<= 1;
            }
            return highestOneBit;
        }
        if (max >= 1073741824) {
            z10 = false;
        }
        e8.h.d(z10, "collection too large");
        return 1073741824;
    }

    private static <E> k<E> k(int i10, Object... objArr) {
        if (i10 != 0) {
            if (i10 != 1) {
                int j10 = j(i10);
                Object[] objArr2 = new Object[j10];
                int i11 = j10 - 1;
                int i12 = 0;
                int i13 = 0;
                for (int i14 = 0; i14 < i10; i14++) {
                    Object a10 = r.a(objArr[i14], i14);
                    int hashCode = a10.hashCode();
                    int a11 = g.a(hashCode);
                    while (true) {
                        int i15 = a11 & i11;
                        Object obj = objArr2[i15];
                        if (obj == null) {
                            objArr[i13] = a10;
                            objArr2[i15] = a10;
                            i12 += hashCode;
                            i13++;
                            break;
                        } else if (obj.equals(a10)) {
                            break;
                        } else {
                            a11++;
                        }
                    }
                }
                Arrays.fill(objArr, i13, i10, (Object) null);
                if (i13 == 1) {
                    Object obj2 = objArr[0];
                    Objects.requireNonNull(obj2);
                    return new y(obj2);
                } else if (j(i13) < j10 / 2) {
                    return k(i13, objArr);
                } else {
                    if (s(i13, objArr.length)) {
                        objArr = Arrays.copyOf(objArr, i13);
                    }
                    return new w(objArr, i12, objArr2, i11, i13);
                }
            }
            Object obj3 = objArr[0];
            Objects.requireNonNull(obj3);
            return o(obj3);
        }
        return n();
    }

    public static <E> k<E> n() {
        return w.f11237v;
    }

    public static <E> k<E> o(E e10) {
        return new y(e10);
    }

    public static <E> k<E> p(E e10, E e11, E e12) {
        return k(3, e10, e11, e12);
    }

    @SafeVarargs
    public static <E> k<E> r(E e10, E e11, E e12, E e13, E e14, E e15, E... eArr) {
        boolean z10;
        if (eArr.length <= 2147483641) {
            z10 = true;
        } else {
            z10 = false;
        }
        e8.h.d(z10, "the total number of elements must fit in an int");
        int length = eArr.length + 6;
        Object[] objArr = new Object[length];
        objArr[0] = e10;
        objArr[1] = e11;
        objArr[2] = e12;
        objArr[3] = e13;
        objArr[4] = e14;
        objArr[5] = e15;
        System.arraycopy(eArr, 0, objArr, 6, eArr.length);
        return k(length, objArr);
    }

    private static boolean s(int i10, int i11) {
        if (i10 < (i11 >> 1) + (i11 >> 2)) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof k) && m() && ((k) obj).m() && hashCode() != obj.hashCode()) {
            return false;
        }
        return x.a(this, obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: h */
    public abstract a0<E> iterator();

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return x.b(this);
    }

    public i<E> i() {
        i<E> iVar = this.f11161m;
        if (iVar == null) {
            i<E> l10 = l();
            this.f11161m = l10;
            return l10;
        }
        return iVar;
    }

    i<E> l() {
        return i.i(toArray());
    }

    boolean m() {
        return false;
    }
}
