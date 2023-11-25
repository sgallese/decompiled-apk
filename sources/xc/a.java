package xc;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: SequencesJVM.kt */
/* loaded from: classes4.dex */
public final class a<T> implements g<T> {

    /* renamed from: a  reason: collision with root package name */
    private final AtomicReference<g<T>> f25943a;

    public a(g<? extends T> gVar) {
        qc.q.i(gVar, "sequence");
        this.f25943a = new AtomicReference<>(gVar);
    }

    @Override // xc.g
    public Iterator<T> iterator() {
        g<T> andSet = this.f25943a.getAndSet(null);
        if (andSet != null) {
            return andSet.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
