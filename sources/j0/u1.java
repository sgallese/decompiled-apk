package j0;

/* compiled from: ProduceState.kt */
/* loaded from: classes.dex */
final class u1<T> implements t1<T>, j1<T> {

    /* renamed from: f  reason: collision with root package name */
    private final hc.f f18909f;

    /* renamed from: m  reason: collision with root package name */
    private final /* synthetic */ j1<T> f18910m;

    public u1(j1<T> j1Var, hc.f fVar) {
        qc.q.i(j1Var, "state");
        qc.q.i(fVar, "coroutineContext");
        this.f18909f = fVar;
        this.f18910m = j1Var;
    }

    @Override // ad.k0
    public hc.f getCoroutineContext() {
        return this.f18909f;
    }

    @Override // j0.j1, j0.g3
    public T getValue() {
        return this.f18910m.getValue();
    }

    @Override // j0.j1
    public void setValue(T t10) {
        this.f18910m.setValue(t10);
    }
}
