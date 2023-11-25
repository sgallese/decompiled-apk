package t1;

import androidx.compose.ui.e;
import p1.s1;

/* compiled from: SemanticsModifier.kt */
/* loaded from: classes.dex */
public final class d extends e.c implements s1 {
    private boolean A;
    private boolean B;
    private pc.l<? super x, dc.w> C;

    public d(boolean z10, boolean z11, pc.l<? super x, dc.w> lVar) {
        qc.q.i(lVar, "properties");
        this.A = z10;
        this.B = z11;
        this.C = lVar;
    }

    public final void I1(boolean z10) {
        this.A = z10;
    }

    public final void J1(pc.l<? super x, dc.w> lVar) {
        qc.q.i(lVar, "<set-?>");
        this.C = lVar;
    }

    @Override // p1.s1
    public void Z0(x xVar) {
        qc.q.i(xVar, "<this>");
        this.C.invoke(xVar);
    }

    @Override // p1.s1
    public boolean b0() {
        return this.B;
    }

    @Override // p1.s1
    public boolean b1() {
        return this.A;
    }
}
