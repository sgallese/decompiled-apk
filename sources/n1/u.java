package n1;

import androidx.compose.ui.e;
import p1.l1;

/* compiled from: LayoutId.kt */
/* loaded from: classes.dex */
public final class u extends e.c implements l1, v {
    private Object A;

    public u(Object obj) {
        qc.q.i(obj, "layoutId");
        this.A = obj;
    }

    public void I1(Object obj) {
        qc.q.i(obj, "<set-?>");
        this.A = obj;
    }

    @Override // n1.v
    public Object L() {
        return this.A;
    }

    @Override // p1.l1
    public Object y(j2.e eVar, Object obj) {
        qc.q.i(eVar, "<this>");
        return this;
    }
}
