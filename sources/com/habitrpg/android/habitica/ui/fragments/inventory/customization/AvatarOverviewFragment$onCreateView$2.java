package com.habitrpg.android.habitica.ui.fragments.inventory.customization;

import com.habitrpg.android.habitica.models.user.Gear;
import com.habitrpg.android.habitica.models.user.Items;
import com.habitrpg.android.habitica.models.user.Outfit;
import com.habitrpg.android.habitica.models.user.User;
import qc.r;

/* compiled from: AvatarOverviewFragment.kt */
/* loaded from: classes4.dex */
final class AvatarOverviewFragment$onCreateView$2 extends r implements pc.l<User, dc.l<String, String>> {
    public static final AvatarOverviewFragment$onCreateView$2 INSTANCE = new AvatarOverviewFragment$onCreateView$2();

    AvatarOverviewFragment$onCreateView$2() {
        super(1);
    }

    @Override // pc.l
    public final dc.l<String, String> invoke(User user) {
        Items items;
        Gear gear;
        Outfit costume;
        Items items2;
        Gear gear2;
        Outfit equipped;
        String str = null;
        String weapon = (user == null || (items2 = user.getItems()) == null || (gear2 = items2.getGear()) == null || (equipped = gear2.getEquipped()) == null) ? null : equipped.getWeapon();
        if (user != null && (items = user.getItems()) != null && (gear = items.getGear()) != null && (costume = gear.getCostume()) != null) {
            str = costume.getWeapon();
        }
        return new dc.l<>(weapon, str);
    }
}
