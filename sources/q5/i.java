package q5;

import qc.q;

/* compiled from: RevenueEvent.kt */
/* loaded from: classes.dex */
public class i extends a {
    private String T = "revenue_amount";

    @Override // q5.a
    public String D0() {
        return this.T;
    }

    @Override // q5.a
    public void K0(String str) {
        q.i(str, "<set-?>");
        this.T = str;
    }
}
