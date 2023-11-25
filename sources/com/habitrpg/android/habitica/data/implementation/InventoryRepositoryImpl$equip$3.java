package com.habitrpg.android.habitica.data.implementation;

import com.habitrpg.android.habitica.models.user.Gear;
import com.habitrpg.android.habitica.models.user.Items;
import com.habitrpg.android.habitica.models.user.Outfit;
import com.habitrpg.android.habitica.models.user.User;
import dc.w;
import pc.l;
import qc.q;
import qc.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: InventoryRepositoryImpl.kt */
/* loaded from: classes4.dex */
public final class InventoryRepositoryImpl$equip$3 extends r implements l<User, w> {
    final /* synthetic */ Items $items;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InventoryRepositoryImpl$equip$3(Items items) {
        super(1);
        this.$items = items;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ w invoke(User user) {
        invoke2(user);
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(User user) {
        Gear gear;
        Gear gear2;
        q.i(user, "liveUser");
        Gear gear3 = this.$items.getGear();
        Outfit outfit = null;
        Outfit equipped = gear3 != null ? gear3.getEquipped() : null;
        Items items = user.getItems();
        Outfit equipped2 = (items == null || (gear2 = items.getGear()) == null) ? null : gear2.getEquipped();
        Gear gear4 = this.$items.getGear();
        Outfit costume = gear4 != null ? gear4.getCostume() : null;
        Items items2 = user.getItems();
        if (items2 != null && (gear = items2.getGear()) != null) {
            outfit = gear.getCostume();
        }
        if (equipped != null && equipped2 != null) {
            equipped2.updateWith(equipped);
        }
        if (costume != null && outfit != null) {
            outfit.updateWith(costume);
        }
        Items items3 = user.getItems();
        if (items3 != null) {
            items3.setCurrentMount(this.$items.getCurrentMount());
        }
        Items items4 = user.getItems();
        if (items4 != null) {
            items4.setCurrentPet(this.$items.getCurrentPet());
        }
        user.setBalance(user.getBalance());
    }
}
