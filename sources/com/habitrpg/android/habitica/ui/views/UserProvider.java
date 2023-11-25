package com.habitrpg.android.habitica.ui.views;

import com.habitrpg.android.habitica.models.TeamPlan;
import com.habitrpg.android.habitica.models.auth.LocalAuthentication;
import com.habitrpg.android.habitica.models.user.Authentication;
import com.habitrpg.android.habitica.models.user.Flags;
import com.habitrpg.android.habitica.models.user.Preferences;
import com.habitrpg.android.habitica.models.user.Profile;
import com.habitrpg.android.habitica.models.user.Purchases;
import com.habitrpg.android.habitica.models.user.Stats;
import com.habitrpg.android.habitica.models.user.SubscriptionPlan;
import com.habitrpg.android.habitica.models.user.User;
import ec.b0;
import java.util.ArrayList;
import tc.c;

/* compiled from: AppHeaderView.kt */
/* loaded from: classes4.dex */
final class UserProvider implements i2.b<dc.l<? extends User, ? extends TeamPlan>> {
    private final User generateMember() {
        LocalAuthentication localAuthentication;
        int i10;
        Integer maxMP;
        int i11;
        Integer toNextLevel;
        User user = new User();
        user.setProfile(new Profile());
        Profile profile = user.getProfile();
        if (profile != null) {
            profile.setName("User");
        }
        user.setAuthentication(new Authentication());
        Authentication authentication = user.getAuthentication();
        if (authentication != null) {
            authentication.setLocalAuthentication(new LocalAuthentication());
        }
        Authentication authentication2 = user.getAuthentication();
        if (authentication2 != null) {
            localAuthentication = authentication2.getLocalAuthentication();
        } else {
            localAuthentication = null;
        }
        if (localAuthentication != null) {
            localAuthentication.setUsername("username");
        }
        user.setPreferences(new Preferences());
        Preferences preferences = user.getPreferences();
        if (preferences != null) {
            preferences.setDisableClasses(false);
        }
        user.setFlags(new Flags());
        Flags flags = user.getFlags();
        if (flags != null) {
            flags.setClassSelected(true);
        }
        user.setPurchased(new Purchases());
        Purchases purchased = user.getPurchased();
        if (purchased != null) {
            purchased.setPlan(new SubscriptionPlan());
        }
        user.setStats(new Stats());
        Stats stats = user.getStats();
        if (stats != null) {
            stats.setHp(Double.valueOf(tc.c.f23726f.e(0.0d, 50.0d)));
        }
        Stats stats2 = user.getStats();
        if (stats2 != null) {
            stats2.setMaxHealth(50);
        }
        Stats stats3 = user.getStats();
        if (stats3 != null) {
            stats3.setToNextLevel(Integer.valueOf(tc.c.f23726f.h(0, 10000)));
        }
        Stats stats4 = user.getStats();
        if (stats4 != null) {
            c.a aVar = tc.c.f23726f;
            Stats stats5 = user.getStats();
            if (stats5 != null && (toNextLevel = stats5.getToNextLevel()) != null) {
                i11 = toNextLevel.intValue();
            } else {
                i11 = 0;
            }
            stats4.setExp(Double.valueOf(aVar.d(i11)));
        }
        Stats stats6 = user.getStats();
        if (stats6 != null) {
            stats6.setMaxMP(Integer.valueOf(tc.c.f23726f.h(0, 10000)));
        }
        Stats stats7 = user.getStats();
        if (stats7 != null) {
            c.a aVar2 = tc.c.f23726f;
            Stats stats8 = user.getStats();
            if (stats8 != null && (maxMP = stats8.getMaxMP()) != null) {
                i10 = maxMP.intValue();
            } else {
                i10 = 0;
            }
            stats7.setMp(Double.valueOf(aVar2.d(i10)));
        }
        Stats stats9 = user.getStats();
        if (stats9 != null) {
            stats9.setLvl(Integer.valueOf(tc.c.f23726f.h(0, 9999)));
        }
        return user;
    }

    @Override // i2.b
    public /* bridge */ /* synthetic */ int getCount() {
        return i2.a.a(this);
    }

    @Override // i2.b
    public xc.g<dc.l<? extends User, ? extends TeamPlan>> getValues() {
        SubscriptionPlan subscriptionPlan;
        SubscriptionPlan subscriptionPlan2;
        xc.g<dc.l<? extends User, ? extends TeamPlan>> R;
        ArrayList arrayList = new ArrayList();
        User generateMember = generateMember();
        Stats stats = generateMember.getStats();
        if (stats != null) {
            stats.setLvl(5);
        }
        arrayList.add(new dc.l(generateMember, null));
        User generateMember2 = generateMember();
        Stats stats2 = generateMember2.getStats();
        if (stats2 != null) {
            stats2.setLvl(24);
        }
        Stats stats3 = generateMember2.getStats();
        if (stats3 != null) {
            stats3.setHabitClass(Stats.HEALER);
        }
        Flags flags = generateMember2.getFlags();
        if (flags != null) {
            flags.setClassSelected(false);
        }
        arrayList.add(new dc.l(generateMember2, null));
        User generateMember3 = generateMember();
        Stats stats4 = generateMember3.getStats();
        if (stats4 != null) {
            stats4.setLvl(24);
        }
        Stats stats5 = generateMember3.getStats();
        if (stats5 != null) {
            stats5.setHabitClass(Stats.ROGUE);
        }
        Preferences preferences = generateMember3.getPreferences();
        if (preferences != null) {
            preferences.setDisableClasses(true);
        }
        arrayList.add(new dc.l(generateMember3, null));
        User generateMember4 = generateMember();
        Purchases purchased = generateMember4.getPurchased();
        if (purchased != null) {
            subscriptionPlan = purchased.getPlan();
        } else {
            subscriptionPlan = null;
        }
        if (subscriptionPlan != null) {
            subscriptionPlan.realmSet$planId("basic_earned");
        }
        Purchases purchased2 = generateMember4.getPurchased();
        if (purchased2 != null) {
            subscriptionPlan2 = purchased2.getPlan();
        } else {
            subscriptionPlan2 = null;
        }
        if (subscriptionPlan2 != null) {
            subscriptionPlan2.setCustomerId("123");
        }
        Stats stats6 = generateMember4.getStats();
        if (stats6 != null) {
            stats6.setHabitClass(Stats.WARRIOR);
        }
        arrayList.add(new dc.l(generateMember4, null));
        User generateMember5 = generateMember();
        generateMember5.setHourglassCount(3);
        Stats stats7 = generateMember5.getStats();
        if (stats7 != null) {
            stats7.setHabitClass(Stats.MAGE);
        }
        arrayList.add(new dc.l(generateMember5, null));
        arrayList.add(new dc.l(generateMember(), new TeamPlan()));
        R = b0.R(arrayList);
        return R;
    }
}
