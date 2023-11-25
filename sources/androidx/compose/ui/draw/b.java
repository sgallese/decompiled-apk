package androidx.compose.ui.draw;

import c1.f;
import dc.w;
import pc.l;
import qc.q;
import x0.i;

/* compiled from: DrawModifier.kt */
/* loaded from: classes.dex */
public final class b {
    public static final x0.c a(l<? super x0.d, i> lVar) {
        q.i(lVar, "onBuildDrawCache");
        return new a(new x0.d(), lVar);
    }

    public static final androidx.compose.ui.e b(androidx.compose.ui.e eVar, l<? super f, w> lVar) {
        q.i(eVar, "<this>");
        q.i(lVar, "onDraw");
        return eVar.a(new DrawBehindElement(lVar));
    }

    public static final androidx.compose.ui.e c(androidx.compose.ui.e eVar, l<? super x0.d, i> lVar) {
        q.i(eVar, "<this>");
        q.i(lVar, "onBuildDrawCache");
        return eVar.a(new DrawWithCacheElement(lVar));
    }

    public static final androidx.compose.ui.e d(androidx.compose.ui.e eVar, l<? super c1.c, w> lVar) {
        q.i(eVar, "<this>");
        q.i(lVar, "onDraw");
        return eVar.a(new DrawWithContentElement(lVar));
    }
}
