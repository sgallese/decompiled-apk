package p1;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: LayoutModifierNodeCoordinator.kt */
/* loaded from: classes.dex */
public final class g0 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final int b(r0 r0Var, n1.a aVar) {
        boolean z10;
        int j10;
        r0 Z0 = r0Var.Z0();
        if (Z0 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (r0Var.g1().d().containsKey(aVar)) {
                Integer num = r0Var.g1().d().get(aVar);
                if (num == null) {
                    return RecyclerView.UNDEFINED_DURATION;
                }
                return num.intValue();
            }
            int G = Z0.G(aVar);
            if (G == Integer.MIN_VALUE) {
                return RecyclerView.UNDEFINED_DURATION;
            }
            Z0.o1(true);
            r0Var.n1(true);
            r0Var.m1();
            Z0.o1(false);
            r0Var.n1(false);
            if (aVar instanceof n1.k) {
                j10 = j2.l.k(Z0.i1());
            } else {
                j10 = j2.l.j(Z0.i1());
            }
            return G + j10;
        }
        throw new IllegalStateException(("Child of " + r0Var + " cannot be null when calculating alignment line").toString());
    }
}
