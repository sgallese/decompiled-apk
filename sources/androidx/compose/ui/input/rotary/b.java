package androidx.compose.ui.input.rotary;

import androidx.compose.ui.e;
import pc.l;
import qc.q;

/* compiled from: RotaryInputModifier.kt */
/* loaded from: classes.dex */
final class b extends e.c implements m1.a {
    private l<? super m1.b, Boolean> A;
    private l<? super m1.b, Boolean> B;

    public b(l<? super m1.b, Boolean> lVar, l<? super m1.b, Boolean> lVar2) {
        this.A = lVar;
        this.B = lVar2;
    }

    public final void I1(l<? super m1.b, Boolean> lVar) {
        this.A = lVar;
    }

    public final void J1(l<? super m1.b, Boolean> lVar) {
        this.B = lVar;
    }

    @Override // m1.a
    public boolean Y0(m1.b bVar) {
        q.i(bVar, "event");
        l<? super m1.b, Boolean> lVar = this.B;
        if (lVar != null) {
            return lVar.invoke(bVar).booleanValue();
        }
        return false;
    }

    @Override // m1.a
    public boolean q0(m1.b bVar) {
        q.i(bVar, "event");
        l<? super m1.b, Boolean> lVar = this.A;
        if (lVar != null) {
            return lVar.invoke(bVar).booleanValue();
        }
        return false;
    }
}
