package com.google.common.collect;

import java.io.Serializable;

/* compiled from: ByFunctionOrdering.java */
/* loaded from: classes3.dex */
final class c<F, T> extends s<F> implements Serializable {

    /* renamed from: f  reason: collision with root package name */
    final e8.d<F, ? extends T> f11140f;

    /* renamed from: m  reason: collision with root package name */
    final s<T> f11141m;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(e8.d<F, ? extends T> dVar, s<T> sVar) {
        this.f11140f = (e8.d) e8.h.g(dVar);
        this.f11141m = (s) e8.h.g(sVar);
    }

    @Override // com.google.common.collect.s, java.util.Comparator
    public int compare(F f10, F f11) {
        return this.f11141m.compare(this.f11140f.apply(f10), this.f11140f.apply(f11));
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f11140f.equals(cVar.f11140f) && this.f11141m.equals(cVar.f11141m)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return e8.f.b(this.f11140f, this.f11141m);
    }

    public String toString() {
        String valueOf = String.valueOf(this.f11141m);
        String valueOf2 = String.valueOf(this.f11140f);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 13 + valueOf2.length());
        sb2.append(valueOf);
        sb2.append(".onResultOf(");
        sb2.append(valueOf2);
        sb2.append(")");
        return sb2.toString();
    }
}
