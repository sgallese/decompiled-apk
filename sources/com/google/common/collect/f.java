package com.google.common.collect;

import java.io.Serializable;
import java.util.Comparator;

/* compiled from: ComparatorOrdering.java */
/* loaded from: classes3.dex */
final class f<T> extends s<T> implements Serializable {

    /* renamed from: f  reason: collision with root package name */
    final Comparator<T> f11142f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(Comparator<T> comparator) {
        this.f11142f = (Comparator) e8.h.g(comparator);
    }

    @Override // com.google.common.collect.s, java.util.Comparator
    public int compare(T t10, T t11) {
        return this.f11142f.compare(t10, t11);
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            return this.f11142f.equals(((f) obj).f11142f);
        }
        return false;
    }

    public int hashCode() {
        return this.f11142f.hashCode();
    }

    public String toString() {
        return this.f11142f.toString();
    }
}
