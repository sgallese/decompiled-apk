package xc;

import java.util.Iterator;

/* compiled from: Sequences.kt */
/* loaded from: classes4.dex */
public final class s<T, R> implements g<R> {

    /* renamed from: a  reason: collision with root package name */
    private final g<T> f25989a;

    /* renamed from: b  reason: collision with root package name */
    private final pc.l<T, R> f25990b;

    /* compiled from: Sequences.kt */
    /* loaded from: classes4.dex */
    public static final class a implements Iterator<R>, rc.a {

        /* renamed from: f  reason: collision with root package name */
        private final Iterator<T> f25991f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ s<T, R> f25992m;

        a(s<T, R> sVar) {
            this.f25992m = sVar;
            this.f25991f = ((s) sVar).f25989a.iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f25991f.hasNext();
        }

        @Override // java.util.Iterator
        public R next() {
            return (R) ((s) this.f25992m).f25990b.invoke(this.f25991f.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public s(g<? extends T> gVar, pc.l<? super T, ? extends R> lVar) {
        qc.q.i(gVar, "sequence");
        qc.q.i(lVar, "transformer");
        this.f25989a = gVar;
        this.f25990b = lVar;
    }

    @Override // xc.g
    public Iterator<R> iterator() {
        return new a(this);
    }
}
