package androidx.collection;

import java.util.Iterator;
import qc.q;

/* compiled from: SparseArray.kt */
/* loaded from: classes.dex */
public final class i {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: SparseArray.kt */
    /* loaded from: classes.dex */
    public static final class a<T> implements Iterator<T>, rc.a {

        /* renamed from: f  reason: collision with root package name */
        private int f1820f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ h f1821m;

        a(h<T> hVar) {
            this.f1821m = hVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f1820f < this.f1821m.q()) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public T next() {
            h hVar = this.f1821m;
            int i10 = this.f1820f;
            this.f1820f = i10 + 1;
            return (T) hVar.r(i10);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public static final <T> Iterator<T> a(h<T> hVar) {
        q.j(hVar, "receiver$0");
        return new a(hVar);
    }
}
