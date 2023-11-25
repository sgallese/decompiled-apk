package m0;

import qc.q;

/* compiled from: PersistentVectorIterator.kt */
/* loaded from: classes.dex */
public final class g<T> extends a<T> {

    /* renamed from: p  reason: collision with root package name */
    private final T[] f19719p;

    /* renamed from: q  reason: collision with root package name */
    private final k<T> f19720q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Object[] objArr, T[] tArr, int i10, int i11, int i12) {
        super(i10, i11);
        int h10;
        q.i(objArr, "root");
        q.i(tArr, "tail");
        this.f19719p = tArr;
        int d10 = l.d(i11);
        h10 = vc.l.h(i10, d10);
        this.f19720q = new k<>(objArr, h10, d10, i12);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public T next() {
        a();
        if (this.f19720q.hasNext()) {
            f(d() + 1);
            return this.f19720q.next();
        }
        T[] tArr = this.f19719p;
        int d10 = d();
        f(d10 + 1);
        return tArr[d10 - this.f19720q.e()];
    }

    @Override // java.util.ListIterator
    public T previous() {
        c();
        if (d() > this.f19720q.e()) {
            T[] tArr = this.f19719p;
            f(d() - 1);
            return tArr[d() - this.f19720q.e()];
        }
        f(d() - 1);
        return this.f19720q.previous();
    }
}
