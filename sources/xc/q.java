package xc;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: Sequences.kt */
/* loaded from: classes4.dex */
public final class q<T> implements g<T>, c<T> {

    /* renamed from: a  reason: collision with root package name */
    private final g<T> f25979a;

    /* renamed from: b  reason: collision with root package name */
    private final int f25980b;

    /* compiled from: Sequences.kt */
    /* loaded from: classes4.dex */
    public static final class a implements Iterator<T>, rc.a {

        /* renamed from: f  reason: collision with root package name */
        private int f25981f;

        /* renamed from: m  reason: collision with root package name */
        private final Iterator<T> f25982m;

        a(q<T> qVar) {
            this.f25981f = ((q) qVar).f25980b;
            this.f25982m = ((q) qVar).f25979a.iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f25981f > 0 && this.f25982m.hasNext()) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public T next() {
            int i10 = this.f25981f;
            if (i10 != 0) {
                this.f25981f = i10 - 1;
                return this.f25982m.next();
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public q(g<? extends T> gVar, int i10) {
        boolean z10;
        qc.q.i(gVar, "sequence");
        this.f25979a = gVar;
        this.f25980b = i10;
        if (i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i10 + '.').toString());
    }

    @Override // xc.c
    public g<T> a(int i10) {
        if (i10 >= this.f25980b) {
            return this;
        }
        return new q(this.f25979a, i10);
    }

    @Override // xc.c
    public g<T> b(int i10) {
        g<T> e10;
        int i11 = this.f25980b;
        if (i10 >= i11) {
            e10 = m.e();
            return e10;
        }
        return new p(this.f25979a, i10, i11);
    }

    @Override // xc.g
    public Iterator<T> iterator() {
        return new a(this);
    }
}
