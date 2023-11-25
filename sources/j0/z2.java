package j0;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DerivedState.kt */
/* loaded from: classes.dex */
public final /* synthetic */ class z2 {

    /* renamed from: a  reason: collision with root package name */
    private static final e3<Integer> f18942a = new e3<>();

    /* renamed from: b  reason: collision with root package name */
    private static final e3<k0.f<c0>> f18943b = new e3<>();

    public static final k0.f<c0> b() {
        e3<k0.f<c0>> e3Var = f18943b;
        k0.f<c0> a10 = e3Var.a();
        if (a10 == null) {
            k0.f<c0> fVar = new k0.f<>(new c0[0], 0);
            e3Var.b(fVar);
            return fVar;
        }
        return a10;
    }

    public static final <T> g3<T> c(x2<T> x2Var, pc.a<? extends T> aVar) {
        qc.q.i(x2Var, "policy");
        qc.q.i(aVar, "calculation");
        return new a0(aVar, x2Var);
    }

    public static final <T> g3<T> d(pc.a<? extends T> aVar) {
        qc.q.i(aVar, "calculation");
        return new a0(aVar, null);
    }
}
