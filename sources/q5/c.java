package q5;

import qc.q;

/* compiled from: GroupIdentifyEvent.kt */
/* loaded from: classes.dex */
public class c extends a {
    private String T = "$groupidentify";

    @Override // q5.a
    public String D0() {
        return this.T;
    }

    @Override // q5.a
    public boolean H0() {
        if (F0() != null && E0() != null) {
            return true;
        }
        return false;
    }

    @Override // q5.a
    public void K0(String str) {
        q.i(str, "<set-?>");
        this.T = str;
    }
}
