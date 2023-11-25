package xc;

import dc.m;
import dc.w;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.coroutines.Continuation;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SequenceBuilder.kt */
/* loaded from: classes4.dex */
public final class h<T> extends i<T> implements Iterator<T>, Continuation<w>, rc.a {

    /* renamed from: f  reason: collision with root package name */
    private int f25961f;

    /* renamed from: m  reason: collision with root package name */
    private T f25962m;

    /* renamed from: p  reason: collision with root package name */
    private Iterator<? extends T> f25963p;

    /* renamed from: q  reason: collision with root package name */
    private Continuation<? super w> f25964q;

    private final Throwable h() {
        int i10 = this.f25961f;
        if (i10 != 4) {
            if (i10 != 5) {
                return new IllegalStateException("Unexpected state of the iterator: " + this.f25961f);
            }
            return new IllegalStateException("Iterator has failed.");
        }
        return new NoSuchElementException();
    }

    private final T i() {
        if (hasNext()) {
            return next();
        }
        throw new NoSuchElementException();
    }

    @Override // xc.i
    public Object a(T t10, Continuation<? super w> continuation) {
        Object d10;
        Object d11;
        Object d12;
        this.f25962m = t10;
        this.f25961f = 3;
        this.f25964q = continuation;
        d10 = ic.d.d();
        d11 = ic.d.d();
        if (d10 == d11) {
            kotlin.coroutines.jvm.internal.h.c(continuation);
        }
        d12 = ic.d.d();
        if (d10 == d12) {
            return d10;
        }
        return w.f13270a;
    }

    @Override // xc.i
    public Object c(Iterator<? extends T> it, Continuation<? super w> continuation) {
        Object d10;
        Object d11;
        Object d12;
        if (!it.hasNext()) {
            return w.f13270a;
        }
        this.f25963p = it;
        this.f25961f = 2;
        this.f25964q = continuation;
        d10 = ic.d.d();
        d11 = ic.d.d();
        if (d10 == d11) {
            kotlin.coroutines.jvm.internal.h.c(continuation);
        }
        d12 = ic.d.d();
        if (d10 == d12) {
            return d10;
        }
        return w.f13270a;
    }

    @Override // kotlin.coroutines.Continuation
    public hc.f getContext() {
        return hc.g.f16601f;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        while (true) {
            int i10 = this.f25961f;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2 || i10 == 3) {
                        return true;
                    }
                    if (i10 == 4) {
                        return false;
                    }
                    throw h();
                }
                Iterator<? extends T> it = this.f25963p;
                qc.q.f(it);
                if (it.hasNext()) {
                    this.f25961f = 2;
                    return true;
                }
                this.f25963p = null;
            }
            this.f25961f = 5;
            Continuation<? super w> continuation = this.f25964q;
            qc.q.f(continuation);
            this.f25964q = null;
            m.a aVar = dc.m.f13253f;
            continuation.resumeWith(dc.m.a(w.f13270a));
        }
    }

    public final void j(Continuation<? super w> continuation) {
        this.f25964q = continuation;
    }

    @Override // java.util.Iterator
    public T next() {
        int i10 = this.f25961f;
        if (i10 != 0 && i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    this.f25961f = 0;
                    T t10 = this.f25962m;
                    this.f25962m = null;
                    return t10;
                }
                throw h();
            }
            this.f25961f = 1;
            Iterator<? extends T> it = this.f25963p;
            qc.q.f(it);
            return it.next();
        }
        return i();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(Object obj) {
        dc.n.b(obj);
        this.f25961f = 4;
    }
}
