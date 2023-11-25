package xc;

import java.util.Iterator;

/* compiled from: Sequences.kt */
/* loaded from: classes4.dex */
public final class b<T> implements g<T>, c<T> {

    /* renamed from: a  reason: collision with root package name */
    private final g<T> f25944a;

    /* renamed from: b  reason: collision with root package name */
    private final int f25945b;

    /* compiled from: Sequences.kt */
    /* loaded from: classes4.dex */
    public static final class a implements Iterator<T>, rc.a {

        /* renamed from: f  reason: collision with root package name */
        private final Iterator<T> f25946f;

        /* renamed from: m  reason: collision with root package name */
        private int f25947m;

        a(b<T> bVar) {
            this.f25946f = ((b) bVar).f25944a.iterator();
            this.f25947m = ((b) bVar).f25945b;
        }

        private final void a() {
            while (this.f25947m > 0 && this.f25946f.hasNext()) {
                this.f25946f.next();
                this.f25947m--;
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            a();
            return this.f25946f.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            a();
            return this.f25946f.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(g<? extends T> gVar, int i10) {
        boolean z10;
        qc.q.i(gVar, "sequence");
        this.f25944a = gVar;
        this.f25945b = i10;
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
        int i11 = this.f25945b;
        int i12 = i11 + i10;
        if (i12 < 0) {
            return new q(this, i10);
        }
        return new p(this.f25944a, i11, i12);
    }

    @Override // xc.c
    public g<T> b(int i10) {
        int i11 = this.f25945b + i10;
        if (i11 < 0) {
            return new b(this, i10);
        }
        return new b(this.f25944a, i11);
    }

    @Override // xc.g
    public Iterator<T> iterator() {
        return new a(this);
    }
}
