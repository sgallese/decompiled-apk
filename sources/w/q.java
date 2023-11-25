package w;

import androidx.compose.ui.e;
import p1.l1;

/* compiled from: RowColumnImpl.kt */
/* loaded from: classes.dex */
public final class q extends e.c implements l1 {
    private float A;
    private boolean B;

    public q(float f10, boolean z10) {
        this.A = f10;
        this.B = z10;
    }

    @Override // p1.l1
    /* renamed from: I1  reason: merged with bridge method [inline-methods] */
    public x y(j2.e eVar, Object obj) {
        x xVar;
        qc.q.i(eVar, "<this>");
        if (obj instanceof x) {
            xVar = (x) obj;
        } else {
            xVar = null;
        }
        if (xVar == null) {
            xVar = new x(0.0f, false, null, 7, null);
        }
        xVar.f(this.A);
        xVar.e(this.B);
        return xVar;
    }

    public final void J1(boolean z10) {
        this.B = z10;
    }

    public final void K1(float f10) {
        this.A = f10;
    }
}
