package j0;

/* compiled from: ValueHolders.kt */
/* loaded from: classes.dex */
public final class u0<T> implements g3<T> {

    /* renamed from: f  reason: collision with root package name */
    private final dc.f f18908f;

    public u0(pc.a<? extends T> aVar) {
        qc.q.i(aVar, "valueProducer");
        this.f18908f = dc.g.b(aVar);
    }

    private final T e() {
        return (T) this.f18908f.getValue();
    }

    @Override // j0.g3
    public T getValue() {
        return e();
    }
}
