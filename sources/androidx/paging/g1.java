package androidx.paging;

/* compiled from: PageFetcherSnapshot.kt */
/* loaded from: classes.dex */
public final class g1 {
    public static final boolean a(y yVar, y yVar2, t0 t0Var) {
        qc.q.i(yVar, "<this>");
        qc.q.i(yVar2, "previous");
        qc.q.i(t0Var, "loadType");
        if (yVar.a() > yVar2.a()) {
            return true;
        }
        if (yVar.a() < yVar2.a()) {
            return false;
        }
        return a0.a(yVar.b(), yVar2.b(), t0Var);
    }
}
