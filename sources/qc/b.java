package qc;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: ArrayIterator.kt */
/* loaded from: classes4.dex */
final class b<T> implements Iterator<T>, rc.a {

    /* renamed from: f  reason: collision with root package name */
    private final T[] f21655f;

    /* renamed from: m  reason: collision with root package name */
    private int f21656m;

    public b(T[] tArr) {
        q.i(tArr, "array");
        this.f21655f = tArr;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.f21656m < this.f21655f.length) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public T next() {
        try {
            T[] tArr = this.f21655f;
            int i10 = this.f21656m;
            this.f21656m = i10 + 1;
            return tArr[i10];
        } catch (ArrayIndexOutOfBoundsException e10) {
            this.f21656m--;
            throw new NoSuchElementException(e10.getMessage());
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
