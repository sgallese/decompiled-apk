package p1;

import androidx.compose.ui.e;

/* compiled from: NodeCoordinator.kt */
/* loaded from: classes.dex */
public final class y0 {
    public static final /* synthetic */ e.c a(j jVar, int i10, int i11) {
        return b(jVar, i10, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final e.c b(j jVar, int i10, int i11) {
        e.c g12 = jVar.getNode().g1();
        if (g12 == null || (g12.f1() & i10) == 0) {
            return null;
        }
        while (g12 != null) {
            int k12 = g12.k1();
            if ((k12 & i11) != 0) {
                return null;
            }
            if ((k12 & i10) != 0) {
                return g12;
            }
            g12 = g12.g1();
        }
        return null;
    }
}
