package com.habitrpg.android.habitica.ui.views;

import com.habitrpg.android.habitica.models.auth.LocalAuthentication;
import com.habitrpg.android.habitica.models.members.Member;
import com.habitrpg.android.habitica.models.user.Authentication;
import com.habitrpg.android.habitica.models.user.Profile;
import com.habitrpg.android.habitica.models.user.Stats;
import ec.b0;
import java.util.ArrayList;
import tc.c;

/* compiled from: GroupPlanMemberList.kt */
/* loaded from: classes4.dex */
final class MemberProvider implements i2.b<Member> {
    @Override // i2.b
    public /* bridge */ /* synthetic */ int getCount() {
        return i2.a.a(this);
    }

    @Override // i2.b
    public xc.g<Member> getValues() {
        xc.g<Member> R;
        LocalAuthentication localAuthentication;
        int i10;
        Integer maxMP;
        int i11;
        Integer toNextLevel;
        ArrayList arrayList = new ArrayList();
        for (int i12 = 0; i12 < 6; i12++) {
            Member member = new Member();
            member.setProfile(new Profile());
            Profile profile = member.getProfile();
            if (profile != null) {
                profile.setName("User " + i12);
            }
            member.setAuthentication(new Authentication());
            Authentication authentication = member.getAuthentication();
            if (authentication != null) {
                authentication.setLocalAuthentication(new LocalAuthentication());
            }
            Authentication authentication2 = member.getAuthentication();
            if (authentication2 != null) {
                localAuthentication = authentication2.getLocalAuthentication();
            } else {
                localAuthentication = null;
            }
            if (localAuthentication != null) {
                localAuthentication.setUsername("user" + i12);
            }
            member.setStats(new Stats());
            Stats stats = member.getStats();
            if (stats != null) {
                stats.setHp(Double.valueOf(tc.c.f23726f.c()));
            }
            Stats stats2 = member.getStats();
            if (stats2 != null) {
                stats2.setMaxHealth(50);
            }
            Stats stats3 = member.getStats();
            if (stats3 != null) {
                stats3.setToNextLevel(Integer.valueOf(tc.c.f23726f.g()));
            }
            Stats stats4 = member.getStats();
            if (stats4 != null) {
                c.a aVar = tc.c.f23726f;
                Stats stats5 = member.getStats();
                if (stats5 != null && (toNextLevel = stats5.getToNextLevel()) != null) {
                    i11 = toNextLevel.intValue();
                } else {
                    i11 = 0;
                }
                stats4.setExp(Double.valueOf(aVar.d(i11)));
            }
            Stats stats6 = member.getStats();
            if (stats6 != null) {
                stats6.setMaxMP(Integer.valueOf(tc.c.f23726f.g()));
            }
            Stats stats7 = member.getStats();
            if (stats7 != null) {
                c.a aVar2 = tc.c.f23726f;
                Stats stats8 = member.getStats();
                if (stats8 != null && (maxMP = stats8.getMaxMP()) != null) {
                    i10 = maxMP.intValue();
                } else {
                    i10 = 0;
                }
                stats7.setMp(Double.valueOf(aVar2.d(i10)));
            }
            Stats stats9 = member.getStats();
            if (stats9 != null) {
                stats9.setLvl(Integer.valueOf(tc.c.f23726f.g()));
            }
            arrayList.add(member);
        }
        R = b0.R(arrayList);
        return R;
    }
}
