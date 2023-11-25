package w;

import androidx.compose.ui.e;
import p1.l1;
import v0.b;

/* compiled from: RowColumnImpl.kt */
/* loaded from: classes.dex */
public final class f0 extends e.c implements l1 {
    private b.c A;

    public f0(b.c cVar) {
        qc.q.i(cVar, "vertical");
        this.A = cVar;
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
        xVar.d(l.f25177a.b(this.A));
        return xVar;
    }

    public final void J1(b.c cVar) {
        qc.q.i(cVar, "<set-?>");
        this.A = cVar;
    }
}
