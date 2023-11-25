package androidx.compose.ui.layout;

import androidx.compose.ui.e;
import dc.w;
import n1.s;
import p1.u;
import pc.l;
import qc.q;

/* compiled from: OnGloballyPositionedModifier.kt */
/* loaded from: classes.dex */
final class d extends e.c implements u {
    private l<? super s, w> A;

    public d(l<? super s, w> lVar) {
        q.i(lVar, "callback");
        this.A = lVar;
    }

    public final void I1(l<? super s, w> lVar) {
        q.i(lVar, "<set-?>");
        this.A = lVar;
    }

    @Override // p1.u
    public void w(s sVar) {
        q.i(sVar, "coordinates");
        this.A.invoke(sVar);
    }
}
