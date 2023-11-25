package t0;

import java.util.ConcurrentModificationException;
import java.util.ListIterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SnapshotStateList.kt */
/* loaded from: classes.dex */
public final class x<T> implements ListIterator<T>, rc.a {

    /* renamed from: f  reason: collision with root package name */
    private final r<T> f23395f;

    /* renamed from: m  reason: collision with root package name */
    private int f23396m;

    /* renamed from: p  reason: collision with root package name */
    private int f23397p;

    public x(r<T> rVar, int i10) {
        qc.q.i(rVar, "list");
        this.f23395f = rVar;
        this.f23396m = i10 - 1;
        this.f23397p = rVar.a();
    }

    private final void a() {
        if (this.f23395f.a() == this.f23397p) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.ListIterator
    public void add(T t10) {
        a();
        this.f23395f.add(this.f23396m + 1, t10);
        this.f23396m++;
        this.f23397p = this.f23395f.a();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        if (this.f23396m < this.f23395f.size() - 1) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        if (this.f23396m >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public T next() {
        a();
        int i10 = this.f23396m + 1;
        s.e(i10, this.f23395f.size());
        T t10 = this.f23395f.get(i10);
        this.f23396m = i10;
        return t10;
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return this.f23396m + 1;
    }

    @Override // java.util.ListIterator
    public T previous() {
        a();
        s.e(this.f23396m, this.f23395f.size());
        this.f23396m--;
        return this.f23395f.get(this.f23396m);
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return this.f23396m;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        a();
        this.f23395f.remove(this.f23396m);
        this.f23396m--;
        this.f23397p = this.f23395f.a();
    }

    @Override // java.util.ListIterator
    public void set(T t10) {
        a();
        this.f23395f.set(this.f23396m, t10);
        this.f23397p = this.f23395f.a();
    }
}
