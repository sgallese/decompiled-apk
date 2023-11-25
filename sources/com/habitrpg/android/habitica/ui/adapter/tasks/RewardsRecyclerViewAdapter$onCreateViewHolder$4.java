package com.habitrpg.android.habitica.ui.adapter.tasks;

import com.habitrpg.android.habitica.models.shops.ShopItem;
import dc.w;
import pc.l;
import qc.q;
import qc.r;

/* compiled from: RewardsRecyclerViewAdapter.kt */
/* loaded from: classes4.dex */
final class RewardsRecyclerViewAdapter$onCreateViewHolder$4 extends r implements l<ShopItem, w> {
    final /* synthetic */ RewardsRecyclerViewAdapter this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RewardsRecyclerViewAdapter$onCreateViewHolder$4(RewardsRecyclerViewAdapter rewardsRecyclerViewAdapter) {
        super(1);
        this.this$0 = rewardsRecyclerViewAdapter;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ w invoke(ShopItem shopItem) {
        invoke2(shopItem);
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(ShopItem shopItem) {
        q.i(shopItem, "it");
        l<ShopItem, w> purchaseCardEvents = this.this$0.getPurchaseCardEvents();
        if (purchaseCardEvents != null) {
            purchaseCardEvents.invoke(shopItem);
        }
    }
}
