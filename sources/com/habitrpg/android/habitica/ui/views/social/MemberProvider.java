package com.habitrpg.android.habitica.ui.views.social;

import com.habitrpg.android.habitica.models.auth.LocalAuthentication;
import com.habitrpg.android.habitica.models.members.Member;
import com.habitrpg.android.habitica.models.members.MemberFlags;
import com.habitrpg.android.habitica.models.members.MemberPreferences;
import com.habitrpg.android.habitica.models.user.Authentication;
import com.habitrpg.android.habitica.models.user.ContributorInfo;
import com.habitrpg.android.habitica.models.user.Profile;
import com.habitrpg.android.habitica.models.user.Stats;
import ec.b0;
import java.util.ArrayList;
import tc.c;

/* compiled from: PartySeekingListItem.kt */
/* loaded from: classes4.dex */
final class MemberProvider implements i2.b<Member> {
    private final Member generateMember() {
        LocalAuthentication localAuthentication;
        int i10;
        Integer maxMP;
        int i11;
        Integer toNextLevel;
        Member member = new Member();
        member.setProfile(new Profile());
        Profile profile = member.getProfile();
        if (profile != null) {
            profile.setName("User");
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
            localAuthentication.setUsername("username");
        }
        member.setPreferences(new MemberPreferences());
        MemberPreferences preferences = member.getPreferences();
        if (preferences != null) {
            preferences.setDisableClasses(false);
        }
        member.setFlags(new MemberFlags());
        MemberFlags flags = member.getFlags();
        if (flags != null) {
            flags.setClassSelected(true);
        }
        member.setStats(new Stats());
        Stats stats = member.getStats();
        if (stats != null) {
            stats.setHp(Double.valueOf(tc.c.f23726f.e(0.0d, 50.0d)));
        }
        Stats stats2 = member.getStats();
        if (stats2 != null) {
            stats2.setMaxHealth(50);
        }
        Stats stats3 = member.getStats();
        if (stats3 != null) {
            stats3.setToNextLevel(Integer.valueOf(tc.c.f23726f.h(0, 10000)));
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
            stats6.setMaxMP(Integer.valueOf(tc.c.f23726f.h(0, 10000)));
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
            stats9.setLvl(Integer.valueOf(tc.c.f23726f.h(0, 9999)));
        }
        return member;
    }

    @Override // i2.b
    public /* bridge */ /* synthetic */ int getCount() {
        return i2.a.a(this);
    }

    @Override // i2.b
    public xc.g<Member> getValues() {
        xc.g<Member> R;
        ArrayList arrayList = new ArrayList();
        Member generateMember = generateMember();
        Stats stats = generateMember.getStats();
        if (stats != null) {
            stats.setLvl(5);
        }
        arrayList.add(generateMember);
        Member generateMember2 = generateMember();
        Stats stats2 = generateMember2.getStats();
        if (stats2 != null) {
            stats2.setLvl(24);
        }
        Stats stats3 = generateMember2.getStats();
        if (stats3 != null) {
            stats3.setHabitClass(Stats.HEALER);
        }
        MemberFlags flags = generateMember2.getFlags();
        if (flags != null) {
            flags.setClassSelected(false);
        }
        generateMember2.setContributor(new ContributorInfo());
        ContributorInfo contributor = generateMember2.getContributor();
        if (contributor != null) {
            contributor.setLevel(4);
        }
        arrayList.add(generateMember2);
        Member generateMember3 = generateMember();
        Stats stats4 = generateMember3.getStats();
        if (stats4 != null) {
            stats4.setLvl(24);
        }
        Stats stats5 = generateMember3.getStats();
        if (stats5 != null) {
            stats5.setHabitClass(Stats.ROGUE);
        }
        MemberPreferences preferences = generateMember3.getPreferences();
        if (preferences != null) {
            preferences.setDisableClasses(true);
        }
        arrayList.add(generateMember3);
        Member generateMember4 = generateMember();
        Stats stats6 = generateMember4.getStats();
        if (stats6 != null) {
            stats6.setHabitClass(Stats.WARRIOR);
        }
        arrayList.add(generateMember4);
        Member generateMember5 = generateMember();
        Stats stats7 = generateMember5.getStats();
        if (stats7 != null) {
            stats7.setHabitClass(Stats.MAGE);
        }
        arrayList.add(generateMember5);
        R = b0.R(arrayList);
        return R;
    }
}
