package com.habitrpg.android.habitica.data.implementation;

import com.habitrpg.android.habitica.models.user.Gear;
import com.habitrpg.android.habitica.models.user.Items;
import com.habitrpg.android.habitica.models.user.Outfit;
import com.habitrpg.android.habitica.models.user.User;
import dc.w;
import ec.b0;
import java.util.List;
import pc.l;
import qc.q;
import qc.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: InventoryRepositoryImpl.kt */
/* loaded from: classes4.dex */
public final class InventoryRepositoryImpl$equip$2 extends r implements l<User, w> {
    final /* synthetic */ String $key;
    final /* synthetic */ String $type;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InventoryRepositoryImpl$equip$2(String str, String str2) {
        super(1);
        this.$type = str;
        this.$key = str2;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ w invoke(User user) {
        invoke2(user);
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(User user) {
        Items items;
        Gear gear;
        List x02;
        Object c02;
        Gear gear2;
        q.i(user, "user");
        if (q.d(this.$type, "mount")) {
            Items items2 = user.getItems();
            if (items2 != null) {
                items2.setCurrentMount(this.$key);
            }
        } else if (q.d(this.$type, "pet") && (items = user.getItems()) != null) {
            items.setCurrentPet(this.$key);
        }
        Outfit outfit = null;
        if (q.d(this.$type, "costume")) {
            Items items3 = user.getItems();
            if (items3 != null && (gear2 = items3.getGear()) != null) {
                outfit = gear2.getCostume();
            }
        } else {
            Items items4 = user.getItems();
            if (items4 != null && (gear = items4.getGear()) != null) {
                outfit = gear.getEquipped();
            }
        }
        x02 = yc.w.x0(this.$key, new String[]{"_"}, false, 0, 6, null);
        c02 = b0.c0(x02);
        String str = (String) c02;
        if (str != null) {
            switch (str.hashCode()) {
                case -1290360528:
                    if (str.equals("eyewear") && outfit != null) {
                        outfit.setEyeWear(this.$key);
                        return;
                    }
                    return;
                case -1089848046:
                    if (str.equals("headAccessory") && outfit != null) {
                        outfit.setHeadAccessory(this.$key);
                        return;
                    }
                    return;
                case -903340183:
                    if (str.equals("shield") && outfit != null) {
                        outfit.setShield(this.$key);
                        return;
                    }
                    return;
                case -791821796:
                    if (str.equals("weapon") && outfit != null) {
                        outfit.setWeapon(this.$key);
                        return;
                    }
                    return;
                case 3015911:
                    if (str.equals("back") && outfit != null) {
                        outfit.setBack(this.$key);
                        return;
                    }
                    return;
                case 3029410:
                    if (str.equals("body") && outfit != null) {
                        outfit.setBody(this.$key);
                        return;
                    }
                    return;
                case 3198432:
                    if (str.equals("head") && outfit != null) {
                        outfit.setHead(this.$key);
                        return;
                    }
                    return;
                case 93086015:
                    if (str.equals("armor") && outfit != null) {
                        outfit.setArmor(this.$key);
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }
}
