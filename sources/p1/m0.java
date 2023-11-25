package p1;

import androidx.compose.ui.e;

/* compiled from: LayoutNodeDrawScope.kt */
/* loaded from: classes.dex */
public final class m0 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final e.c b(j jVar) {
        int a10 = z0.a(4);
        int a11 = z0.a(2);
        e.c g12 = jVar.getNode().g1();
        if (g12 == null || (g12.f1() & a10) == 0) {
            return null;
        }
        while (g12 != null && (g12.k1() & a11) == 0) {
            if ((g12.k1() & a10) != 0) {
                return g12;
            }
            g12 = g12.g1();
        }
        return null;
    }
}
