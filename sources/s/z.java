package s;

/* compiled from: DecayAnimationSpec.kt */
/* loaded from: classes.dex */
final class z<T> implements y<T> {

    /* renamed from: a  reason: collision with root package name */
    private final h0 f22885a;

    public z(h0 h0Var) {
        qc.q.i(h0Var, "floatDecaySpec");
        this.f22885a = h0Var;
    }

    @Override // s.y
    public <V extends q> o1<V> a(i1<T, V> i1Var) {
        qc.q.i(i1Var, "typeConverter");
        return new u1(this.f22885a);
    }
}
