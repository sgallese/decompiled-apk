package j0;

/* compiled from: CompositionLocal.kt */
/* loaded from: classes.dex */
public final class g0<T> extends v1<T> {

    /* renamed from: b  reason: collision with root package name */
    private final x2<T> f18637b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(x2<T> x2Var, pc.a<? extends T> aVar) {
        super(aVar);
        qc.q.i(x2Var, "policy");
        qc.q.i(aVar, "defaultFactory");
        this.f18637b = x2Var;
    }

    @Override // j0.t
    public g3<T> b(T t10, l lVar, int i10) {
        lVar.e(-84026900);
        if (n.K()) {
            n.V(-84026900, i10, -1, "androidx.compose.runtime.DynamicProvidableCompositionLocal.provided (CompositionLocal.kt:125)");
        }
        lVar.e(-492369756);
        Object f10 = lVar.f();
        if (f10 == l.f18688a.a()) {
            f10 = y2.h(t10, this.f18637b);
            lVar.J(f10);
        }
        lVar.N();
        j1 j1Var = (j1) f10;
        j1Var.setValue(t10);
        if (n.K()) {
            n.U();
        }
        lVar.N();
        return j1Var;
    }
}
