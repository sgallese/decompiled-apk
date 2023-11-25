package xc;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Sequences.kt */
/* loaded from: classes4.dex */
public final class f<T> implements g<T> {

    /* renamed from: a  reason: collision with root package name */
    private final pc.a<T> f25956a;

    /* renamed from: b  reason: collision with root package name */
    private final pc.l<T, T> f25957b;

    /* compiled from: Sequences.kt */
    /* loaded from: classes4.dex */
    public static final class a implements Iterator<T>, rc.a {

        /* renamed from: f  reason: collision with root package name */
        private T f25958f;

        /* renamed from: m  reason: collision with root package name */
        private int f25959m = -2;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ f<T> f25960p;

        a(f<T> fVar) {
            this.f25960p = fVar;
        }

        private final void a() {
            T t10;
            int i10;
            if (this.f25959m != -2) {
                pc.l lVar = ((f) this.f25960p).f25957b;
                T t11 = this.f25958f;
                qc.q.f(t11);
                t10 = (T) lVar.invoke(t11);
            } else {
                t10 = (T) ((f) this.f25960p).f25956a.invoke();
            }
            this.f25958f = t10;
            if (t10 == null) {
                i10 = 0;
            } else {
                i10 = 1;
            }
            this.f25959m = i10;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f25959m < 0) {
                a();
            }
            if (this.f25959m == 1) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.f25959m < 0) {
                a();
            }
            if (this.f25959m != 0) {
                T t10 = this.f25958f;
                qc.q.g(t10, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
                this.f25959m = -1;
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
    public f(pc.a<? extends T> aVar, pc.l<? super T, ? extends T> lVar) {
        qc.q.i(aVar, "getInitialValue");
        qc.q.i(lVar, "getNextValue");
        this.f25956a = aVar;
        this.f25957b = lVar;
    }

    @Override // xc.g
    public Iterator<T> iterator() {
        return new a(this);
    }
}
