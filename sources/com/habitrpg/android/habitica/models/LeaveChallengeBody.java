package com.habitrpg.android.habitica.models;

import qc.q;

/* compiled from: LeaveChallengeBody.kt */
/* loaded from: classes4.dex */
public final class LeaveChallengeBody {
    public static final int $stable = 8;
    private String keep;

    public LeaveChallengeBody(String str) {
        q.i(str, "keep");
        this.keep = str;
    }

    public final String getKeep() {
        return this.keep;
    }

    public final void setKeep(String str) {
        q.i(str, "<set-?>");
        this.keep = str;
    }
}
