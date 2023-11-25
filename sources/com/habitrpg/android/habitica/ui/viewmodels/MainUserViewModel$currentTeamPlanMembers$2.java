package com.habitrpg.android.habitica.ui.viewmodels;

import pc.p;
import qc.q;
import qc.r;

/* compiled from: MainUserViewModel.kt */
/* loaded from: classes4.dex */
final class MainUserViewModel$currentTeamPlanMembers$2 extends r implements p<String, String, Boolean> {
    public static final MainUserViewModel$currentTeamPlanMembers$2 INSTANCE = new MainUserViewModel$currentTeamPlanMembers$2();

    MainUserViewModel$currentTeamPlanMembers$2() {
        super(2);
    }

    @Override // pc.p
    public final Boolean invoke(String str, String str2) {
        return Boolean.valueOf(q.d(str, str2));
    }
}
