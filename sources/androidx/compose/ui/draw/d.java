package androidx.compose.ui.draw;

import a1.q1;
import n1.f;
import qc.q;

/* compiled from: PainterModifier.kt */
/* loaded from: classes.dex */
public final class d {
    public static final androidx.compose.ui.e a(androidx.compose.ui.e eVar, d1.c cVar, boolean z10, v0.b bVar, f fVar, float f10, q1 q1Var) {
        q.i(eVar, "<this>");
        q.i(cVar, "painter");
        q.i(bVar, "alignment");
        q.i(fVar, "contentScale");
        return eVar.a(new PainterElement(cVar, z10, bVar, fVar, f10, q1Var));
    }

    public static /* synthetic */ androidx.compose.ui.e b(androidx.compose.ui.e eVar, d1.c cVar, boolean z10, v0.b bVar, f fVar, float f10, q1 q1Var, int i10, Object obj) {
        boolean z11;
        float f11;
        if ((i10 & 2) != 0) {
            z11 = true;
        } else {
            z11 = z10;
        }
        if ((i10 & 4) != 0) {
            bVar = v0.b.f24258a.d();
        }
        v0.b bVar2 = bVar;
        if ((i10 & 8) != 0) {
            fVar = f.f19964a.b();
        }
        f fVar2 = fVar;
        if ((i10 & 16) != 0) {
            f11 = 1.0f;
        } else {
            f11 = f10;
        }
        if ((i10 & 32) != 0) {
            q1Var = null;
        }
        return a(eVar, cVar, z11, bVar2, fVar2, f11, q1Var);
    }
}
