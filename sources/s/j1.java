package s;

import s.q;

/* compiled from: VectorConverters.kt */
/* loaded from: classes.dex */
final class j1<T, V extends q> implements i1<T, V> {

    /* renamed from: a  reason: collision with root package name */
    private final pc.l<T, V> f22723a;

    /* renamed from: b  reason: collision with root package name */
    private final pc.l<V, T> f22724b;

    /* JADX WARN: Multi-variable type inference failed */
    public j1(pc.l<? super T, ? extends V> lVar, pc.l<? super V, ? extends T> lVar2) {
        qc.q.i(lVar, "convertToVector");
        qc.q.i(lVar2, "convertFromVector");
        this.f22723a = lVar;
        this.f22724b = lVar2;
    }

    @Override // s.i1
    public pc.l<T, V> a() {
        return this.f22723a;
    }

    @Override // s.i1
    public pc.l<V, T> b() {
        return this.f22724b;
    }
}
