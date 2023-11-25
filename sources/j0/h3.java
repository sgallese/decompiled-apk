package j0;

/* compiled from: CompositionLocal.kt */
/* loaded from: classes.dex */
public final class h3<T> extends v1<T> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3(pc.a<? extends T> aVar) {
        super(aVar);
        qc.q.i(aVar, "defaultFactory");
    }

    @Override // j0.t
    public g3<T> b(T t10, l lVar, int i10) {
        lVar.e(-1121811719);
        if (n.K()) {
            n.V(-1121811719, i10, -1, "androidx.compose.runtime.StaticProvidableCompositionLocal.provided (CompositionLocal.kt:139)");
        }
        i3 i3Var = new i3(t10);
        if (n.K()) {
            n.U();
        }
        lVar.N();
        return i3Var;
    }
}
