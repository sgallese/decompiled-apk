package com.habitrpg.shared.habitica.models.responses;

import ec.t;
import java.util.List;
import qc.q;

/* compiled from: VerifyUsernameResponse.kt */
/* loaded from: classes4.dex */
public final class VerifyUsernameResponse {
    private boolean isUsable;
    private List<String> issues;

    public VerifyUsernameResponse() {
        List<String> i10;
        i10 = t.i();
        this.issues = i10;
    }

    public final List<String> getIssues() {
        return this.issues;
    }

    public final boolean isUsable() {
        return this.isUsable;
    }

    public final void setIssues(List<String> list) {
        q.i(list, "<set-?>");
        this.issues = list;
    }

    public final void setUsable(boolean z10) {
        this.isUsable = z10;
    }
}
