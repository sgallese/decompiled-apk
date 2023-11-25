package xc;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: Sequences.kt */
/* loaded from: classes4.dex */
public final class e<T> implements g<T> {

    /* renamed from: a  reason: collision with root package name */
    private final g<T> f25949a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f25950b;

    /* renamed from: c  reason: collision with root package name */
    private final pc.l<T, Boolean> f25951c;

    /* compiled from: Sequences.kt */
    /* loaded from: classes4.dex */
    public static final class a implements Iterator<T>, rc.a {

        /* renamed from: f  reason: collision with root package name */
        private final Iterator<T> f25952f;

        /* renamed from: m  reason: collision with root package name */
        private int f25953m = -1;

        /* renamed from: p  reason: collision with root package name */
        private T f25954p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ e<T> f25955q;

        a(e<T> eVar) {
            this.f25955q = eVar;
            this.f25952f = ((e) eVar).f25949a.iterator();
        }

        private final void a() {
            while (this.f25952f.hasNext()) {
                T next = this.f25952f.next();
                if (((Boolean) ((e) this.f25955q).f25951c.invoke(next)).booleanValue() == ((e) this.f25955q).f25950b) {
                    this.f25954p = next;
                    this.f25953m = 1;
                    return;
                }
            }
            this.f25953m = 0;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f25953m == -1) {
                a();
            }
            if (this.f25953m == 1) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.f25953m == -1) {
                a();
            }
            if (this.f25953m != 0) {
                T t10 = this.f25954p;
                this.f25954p = null;
                this.f25953m = -1;
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
    public e(g<? extends T> gVar, boolean z10, pc.l<? super T, Boolean> lVar) {
        qc.q.i(gVar, "sequence");
        qc.q.i(lVar, "predicate");
        this.f25949a = gVar;
        this.f25950b = z10;
        this.f25951c = lVar;
    }

    @Override // xc.g
    public Iterator<T> iterator() {
        return new a(this);
    }
}
