package androidx.compose.ui.graphics;

import a1.l4;
import a1.q4;
import dc.w;
import pc.l;
import qc.q;

/* compiled from: GraphicsLayerModifier.kt */
/* loaded from: classes.dex */
public final class c {
    public static final androidx.compose.ui.e a(androidx.compose.ui.e eVar, l<? super d, w> lVar) {
        q.i(eVar, "<this>");
        q.i(lVar, "block");
        return eVar.a(new BlockGraphicsLayerElement(lVar));
    }

    public static final androidx.compose.ui.e b(androidx.compose.ui.e eVar, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, long j10, q4 q4Var, boolean z10, l4 l4Var, long j11, long j12, int i10) {
        q.i(eVar, "$this$graphicsLayer");
        q.i(q4Var, "shape");
        return eVar.a(new GraphicsLayerElement(f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, j10, q4Var, z10, l4Var, j11, j12, i10, null));
    }
}
