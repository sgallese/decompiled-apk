package q5;

import qc.q;

/* compiled from: IdentifyEvent.kt */
/* loaded from: classes.dex */
public class e extends a {
    private String T = "$identify";

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
