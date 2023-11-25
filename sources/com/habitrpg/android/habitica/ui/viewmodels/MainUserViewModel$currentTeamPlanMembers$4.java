package com.habitrpg.android.habitica.ui.viewmodels;

import com.habitrpg.android.habitica.models.members.Member;
import ec.t;
import ec.u;
import java.util.ArrayList;
import java.util.List;
import pc.p;
import qc.q;
import qc.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MainUserViewModel.kt */
/* loaded from: classes4.dex */
public final class MainUserViewModel$currentTeamPlanMembers$4 extends r implements p<List<? extends Member>, List<? extends Member>, Boolean> {
    public static final MainUserViewModel$currentTeamPlanMembers$4 INSTANCE = new MainUserViewModel$currentTeamPlanMembers$4();

    MainUserViewModel$currentTeamPlanMembers$4() {
        super(2);
    }

    @Override // pc.p
    public final Boolean invoke(List<? extends Member> list, List<? extends Member> list2) {
        int s10;
        q.i(list, "old");
        q.i(list2, "new");
        boolean z10 = false;
        if (list.size() == list2.size()) {
            List<? extends Member> list3 = list;
            s10 = u.s(list3, 10);
            ArrayList arrayList = new ArrayList(s10);
            int i10 = 0;
            for (Object obj : list3) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    t.r();
                }
                arrayList.add(Boolean.valueOf(q.d(((Member) obj).getId(), list2.get(i10).getId())));
                i10 = i11;
            }
            if (!arrayList.contains(Boolean.FALSE)) {
                z10 = true;
            }
        }
        return Boolean.valueOf(z10);
    }
}
