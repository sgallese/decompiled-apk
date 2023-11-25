package m0;

import java.util.NoSuchElementException;
import qc.q;

/* compiled from: BufferIterator.kt */
/* loaded from: classes.dex */
public final class c<T> extends a<T> {

    /* renamed from: p  reason: collision with root package name */
    private final T[] f19704p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(T[] tArr, int i10, int i11) {
        super(i10, i11);
        q.i(tArr, "buffer");
        this.f19704p = tArr;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public T next() {
        if (hasNext()) {
            T[] tArr = this.f19704p;
            int d10 = d();
            f(d10 + 1);
            return tArr[d10];
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public T previous() {
        if (hasPrevious()) {
            T[] tArr = this.f19704p;
            f(d() - 1);
            return tArr[d()];
        }
        throw new NoSuchElementException();
    }
}
