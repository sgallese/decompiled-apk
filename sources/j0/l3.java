package j0;

/* compiled from: Composer.kt */
/* loaded from: classes.dex */
public final class l3<T> {
    public static <T> l a(l lVar) {
        qc.q.i(lVar, "composer");
        return lVar;
    }

    public static final <V> void b(l lVar, V v10, pc.p<? super T, ? super V, dc.w> pVar) {
        qc.q.i(pVar, "block");
        if (lVar.n() || !qc.q.d(lVar.f(), v10)) {
            lVar.J(v10);
            lVar.I(v10, pVar);
        }
    }
}
