package androidx.paging;

import androidx.paging.o2;

/* compiled from: HintHandler.kt */
/* loaded from: classes.dex */
public final class a0 {
    public static final boolean a(o2 o2Var, o2 o2Var2, t0 t0Var) {
        qc.q.i(o2Var, "<this>");
        qc.q.i(t0Var, "loadType");
        if (o2Var2 == null) {
            return true;
        }
        if ((o2Var2 instanceof o2.b) && (o2Var instanceof o2.a)) {
            return true;
        }
        if ((!(o2Var instanceof o2.b) || !(o2Var2 instanceof o2.a)) && (o2Var.a() != o2Var2.a() || o2Var.b() != o2Var2.b() || o2Var2.e(t0Var) > o2Var.e(t0Var))) {
            return true;
        }
        return false;
    }
}
