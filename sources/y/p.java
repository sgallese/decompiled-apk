package y;

/* compiled from: LazyLayoutItemProvider.kt */
/* loaded from: classes.dex */
public final class p {
    public static final int a(o oVar, Object obj, int i10) {
        qc.q.i(oVar, "<this>");
        if (obj != null && oVar.c() != 0) {
            if (i10 < oVar.c() && qc.q.d(obj, oVar.a(i10))) {
                return i10;
            }
            int b10 = oVar.b(obj);
            if (b10 != -1) {
                return b10;
            }
        }
        return i10;
    }
}
