package s;

/* compiled from: Animation.kt */
/* loaded from: classes.dex */
public final class g {
    public static final <T, V extends q> d1<T, V> a(j<T> jVar, i1<T, V> i1Var, T t10, T t11, T t12) {
        qc.q.i(jVar, "animationSpec");
        qc.q.i(i1Var, "typeConverter");
        return new d1<>(jVar, i1Var, t10, t11, i1Var.a().invoke(t12));
    }

    public static final long b(e<?, ?> eVar) {
        qc.q.i(eVar, "<this>");
        return eVar.b() / 1000000;
    }
}
