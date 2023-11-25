package com.habitrpg.android.habitica.data.local.implementation;

import com.habitrpg.android.habitica.models.shops.ShopItem;
import dc.w;
import io.realm.j0;
import io.realm.o0;
import java.util.Iterator;
import java.util.List;
import pc.l;
import qc.q;
import qc.r;

/* compiled from: RealmInventoryLocalRepository.kt */
/* loaded from: classes4.dex */
final class RealmInventoryLocalRepository$saveInAppRewards$1 extends r implements l<o0, w> {
    final /* synthetic */ j0<ShopItem> $localItems;
    final /* synthetic */ List<ShopItem> $onlineItems;
    final /* synthetic */ RealmInventoryLocalRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RealmInventoryLocalRepository$saveInAppRewards$1(j0<ShopItem> j0Var, List<? extends ShopItem> list, RealmInventoryLocalRepository realmInventoryLocalRepository) {
        super(1);
        this.$localItems = j0Var;
        this.$onlineItems = list;
        this.this$0 = realmInventoryLocalRepository;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ w invoke(o0 o0Var) {
        invoke2(o0Var);
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(o0 o0Var) {
        q.i(o0Var, "it");
        Iterator it = this.$localItems.iterator();
        while (it.hasNext()) {
            ShopItem shopItem = (ShopItem) it.next();
            if (!this.$onlineItems.contains(shopItem)) {
                shopItem.deleteFromRealm();
            }
        }
        this.this$0.getRealm().h1(this.$onlineItems);
    }
}
