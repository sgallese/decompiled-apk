package xc;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: Sequences.kt */
/* loaded from: classes4.dex */
public final class p<T> implements g<T>, c<T> {

    /* renamed from: a  reason: collision with root package name */
    private final g<T> f25973a;

    /* renamed from: b  reason: collision with root package name */
    private final int f25974b;

    /* renamed from: c  reason: collision with root package name */
    private final int f25975c;

    /* compiled from: Sequences.kt */
    /* loaded from: classes4.dex */
    public static final class a implements Iterator<T>, rc.a {

        /* renamed from: f  reason: collision with root package name */
        private final Iterator<T> f25976f;

        /* renamed from: m  reason: collision with root package name */
        private int f25977m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ p<T> f25978p;

        a(p<T> pVar) {
            this.f25978p = pVar;
            this.f25976f = ((p) pVar).f25973a.iterator();
        }

        private final void a() {
            while (this.f25977m < ((p) this.f25978p).f25974b && this.f25976f.hasNext()) {
                this.f25976f.next();
                this.f25977m++;
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            a();
            if (this.f25977m < ((p) this.f25978p).f25975c && this.f25976f.hasNext()) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public T next() {
            a();
            if (this.f25977m < ((p) this.f25978p).f25975c) {
                this.f25977m++;
                return this.f25976f.next();
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public p(g<? extends T> gVar, int i10, int i11) {
        boolean z10;
        boolean z11;
        qc.q.i(gVar, "sequence");
        this.f25973a = gVar;
        this.f25974b = i10;
        this.f25975c = i11;
        if (i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (i11 >= 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                if (i11 >= i10) {
                    return;
                }
                throw new IllegalArgumentException(("endIndex should be not less than startIndex, but was " + i11 + " < " + i10).toString());
            }
            throw new IllegalArgumentException(("endIndex should be non-negative, but is " + i11).toString());
        }
        throw new IllegalArgumentException(("startIndex should be non-negative, but is " + i10).toString());
    }

    private final int f() {
        return this.f25975c - this.f25974b;
    }

    @Override // xc.c
    public g<T> a(int i10) {
        if (i10 >= f()) {
            return this;
        }
        g<T> gVar = this.f25973a;
        int i11 = this.f25974b;
        return new p(gVar, i11, i10 + i11);
    }

    @Override // xc.c
    public g<T> b(int i10) {
        g<T> e10;
        if (i10 >= f()) {
            e10 = m.e();
            return e10;
        }
        return new p(this.f25973a, this.f25974b + i10, this.f25975c);
    }

    @Override // xc.g
    public Iterator<T> iterator() {
        return new a(this);
    }
}
