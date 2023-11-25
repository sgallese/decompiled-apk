package com.habitrpg.android.habitica.ui.fragments.inventory.shops;

import com.habitrpg.android.habitica.models.shops.ShopItem;
import java.util.List;
import pc.l;
import qc.q;
import qc.r;

/* compiled from: ShopFragment.kt */
/* loaded from: classes4.dex */
final class ShopFragment$loadMarketGear$1$items$1 extends r implements l<ShopItem, Boolean> {
    final /* synthetic */ List<String> $equipment;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopFragment$loadMarketGear$1$items$1(List<String> list) {
        super(1);
        this.$equipment = list;
    }

    @Override // pc.l
    public final Boolean invoke(ShopItem shopItem) {
        q.i(shopItem, "it");
        List<String> list = this.$equipment;
        boolean z10 = false;
        if (list != null && !list.contains(shopItem.getKey())) {
            z10 = true;
        }
        return Boolean.valueOf(z10);
    }
}
