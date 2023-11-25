package com.google.common.collect;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: Iterators.java */
/* loaded from: classes3.dex */
public final class l {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Iterators.java */
    /* loaded from: classes3.dex */
    class a<T> extends a0<T> {

        /* renamed from: f  reason: collision with root package name */
        boolean f11162f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ Object f11163m;

        a(Object obj) {
            this.f11163m = obj;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return !this.f11162f;
        }

        @Override // java.util.Iterator
        public T next() {
            if (!this.f11162f) {
                this.f11162f = true;
                return (T) this.f11163m;
            }
            throw new NoSuchElementException();
        }
    }

    public static <T> boolean a(Collection<T> collection, Iterator<? extends T> it) {
        e8.h.g(collection);
        e8.h.g(it);
        boolean z10 = false;
        while (it.hasNext()) {
            z10 |= collection.add(it.next());
        }
        return z10;
    }

    public static boolean b(Iterator<?> it, Iterator<?> it2) {
        while (it.hasNext()) {
            if (!it2.hasNext() || !e8.f.a(it.next(), it2.next())) {
                return false;
            }
        }
        return !it2.hasNext();
    }

    public static <T> a0<T> c(T t10) {
        return new a(t10);
    }
}
