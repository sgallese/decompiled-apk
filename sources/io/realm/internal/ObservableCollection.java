package io.realm.internal;

import io.realm.g0;
import io.realm.h0;
import io.realm.internal.j;
import io.realm.u0;

@Keep
/* loaded from: classes4.dex */
public interface ObservableCollection {

    /* loaded from: classes4.dex */
    public static class a implements j.a<b> {

        /* renamed from: a  reason: collision with root package name */
        private final OsCollectionChangeSet f17712a;

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(OsCollectionChangeSet osCollectionChangeSet) {
            this.f17712a = osCollectionChangeSet;
        }

        @Override // io.realm.internal.j.a
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void a(b bVar, Object obj) {
            bVar.a(obj, this.f17712a);
        }
    }

    /* loaded from: classes4.dex */
    public static class b<T> extends j.b<T, Object> {
        /* JADX INFO: Access modifiers changed from: package-private */
        public b(T t10, Object obj) {
            super(t10, obj);
        }

        public void a(T t10, OsCollectionChangeSet osCollectionChangeSet) {
            S s10 = this.f17820b;
            if (s10 instanceof h0) {
                ((h0) s10).a(t10, new r(osCollectionChangeSet));
            } else if (s10 instanceof u0) {
                ((u0) s10).a(t10);
            } else {
                throw new RuntimeException("Unsupported listener type: " + this.f17820b);
            }
        }
    }

    /* loaded from: classes4.dex */
    public static class c<T> implements h0<T> {

        /* renamed from: a  reason: collision with root package name */
        private final u0<T> f17713a;

        public c(u0<T> u0Var) {
            this.f17713a = u0Var;
        }

        @Override // io.realm.h0
        public void a(T t10, g0 g0Var) {
            this.f17713a.a(t10);
        }

        public boolean equals(Object obj) {
            if ((obj instanceof c) && this.f17713a == ((c) obj).f17713a) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f17713a.hashCode();
        }
    }

    void notifyChangeListeners(long j10);
}
