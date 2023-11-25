package xc;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: Sequences.kt */
/* loaded from: classes4.dex */
public final class r<T> implements g<T> {

    /* renamed from: a  reason: collision with root package name */
    private final g<T> f25983a;

    /* renamed from: b  reason: collision with root package name */
    private final pc.l<T, Boolean> f25984b;

    /* compiled from: Sequences.kt */
    /* loaded from: classes4.dex */
    public static final class a implements Iterator<T>, rc.a {

        /* renamed from: f  reason: collision with root package name */
        private final Iterator<T> f25985f;

        /* renamed from: m  reason: collision with root package name */
        private int f25986m = -1;

        /* renamed from: p  reason: collision with root package name */
        private T f25987p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ r<T> f25988q;

        a(r<T> rVar) {
            this.f25988q = rVar;
            this.f25985f = ((r) rVar).f25983a.iterator();
        }

        private final void a() {
            if (this.f25985f.hasNext()) {
                T next = this.f25985f.next();
                if (((Boolean) ((r) this.f25988q).f25984b.invoke(next)).booleanValue()) {
                    this.f25986m = 1;
                    this.f25987p = next;
                    return;
                }
            }
            this.f25986m = 0;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f25986m == -1) {
                a();
            }
            if (this.f25986m == 1) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.f25986m == -1) {
                a();
            }
            if (this.f25986m != 0) {
                T t10 = this.f25987p;
                this.f25987p = null;
                this.f25986m = -1;
                return t10;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public r(g<? extends T> gVar, pc.l<? super T, Boolean> lVar) {
        qc.q.i(gVar, "sequence");
        qc.q.i(lVar, "predicate");
        this.f25983a = gVar;
        this.f25984b = lVar;
    }

    @Override // xc.g
    public Iterator<T> iterator() {
        return new a(this);
    }
}
