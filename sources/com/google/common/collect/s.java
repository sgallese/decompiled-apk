package com.google.common.collect;

import java.util.Comparator;

/* compiled from: Ordering.java */
/* loaded from: classes3.dex */
public abstract class s<T> implements Comparator<T> {
    public static <T> s<T> a(Comparator<T> comparator) {
        if (comparator instanceof s) {
            return (s) comparator;
        }
        return new f(comparator);
    }

    public <F> s<F> b(e8.d<F, ? extends T> dVar) {
        return new c(dVar, this);
    }

    @Override // java.util.Comparator
    public abstract int compare(T t10, T t11);
}
