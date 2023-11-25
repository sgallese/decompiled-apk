package dd;

/* compiled from: StateFlow.kt */
/* loaded from: classes4.dex */
public final class n0 {

    /* renamed from: a  reason: collision with root package name */
    private static final fd.g0 f13394a = new fd.g0("NONE");

    /* renamed from: b  reason: collision with root package name */
    private static final fd.g0 f13395b = new fd.g0("PENDING");

    public static final <T> x<T> a(T t10) {
        if (t10 == null) {
            t10 = (T) ed.r.f14280a;
        }
        return new m0(t10);
    }

    public static final <T> g<T> d(l0<? extends T> l0Var, hc.f fVar, int i10, cd.a aVar) {
        boolean z10 = false;
        if (i10 >= 0 && i10 < 2) {
            z10 = true;
        }
        if ((z10 || i10 == -2) && aVar == cd.a.DROP_OLDEST) {
            return l0Var;
        }
        return d0.e(l0Var, fVar, i10, aVar);
    }
}
