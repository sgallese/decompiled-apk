package com.habitrpg.android.habitica.ui.viewmodels;

import pc.p;
import qc.q;
import qc.r;

/* compiled from: MainUserViewModel.kt */
/* loaded from: classes4.dex */
final class MainUserViewModel$currentTeamPlanGroup$2 extends r implements p<String, String, Boolean> {
    public static final MainUserViewModel$currentTeamPlanGroup$2 INSTANCE = new MainUserViewModel$currentTeamPlanGroup$2();

    MainUserViewModel$currentTeamPlanGroup$2() {
        super(2);
    }

    @Override // pc.p
    public final Boolean invoke(String str, String str2) {
        return Boolean.valueOf(q.d(str, str2));
    }
}
