package androidx.collection;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: IndexBasedArrayIterator.java */
/* loaded from: classes.dex */
abstract class d<T> implements Iterator<T> {

    /* renamed from: f  reason: collision with root package name */
    private int f1800f;

    /* renamed from: m  reason: collision with root package name */
    private int f1801m;

    /* renamed from: p  reason: collision with root package name */
    private boolean f1802p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(int i10) {
        this.f1800f = i10;
    }

    protected abstract T a(int i10);

    protected abstract void c(int i10);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f1801m < this.f1800f) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public T next() {
        if (hasNext()) {
            T a10 = a(this.f1801m);
            this.f1801m++;
            this.f1802p = true;
            return a10;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public void remove() {
        if (this.f1802p) {
            int i10 = this.f1801m - 1;
            this.f1801m = i10;
            c(i10);
            this.f1800f--;
            this.f1802p = false;
            return;
        }
        throw new IllegalStateException();
    }
}
