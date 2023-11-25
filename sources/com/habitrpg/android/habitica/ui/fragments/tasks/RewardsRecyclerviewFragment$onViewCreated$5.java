package com.habitrpg.android.habitica.ui.fragments.tasks;

import android.content.Intent;
import com.habitrpg.android.habitica.models.shops.ShopItem;
import com.habitrpg.android.habitica.ui.activities.SkillMemberActivity;
import dc.w;
import pc.l;
import qc.q;
import qc.r;

/* compiled from: RewardsRecyclerviewFragment.kt */
/* loaded from: classes4.dex */
final class RewardsRecyclerviewFragment$onViewCreated$5 extends r implements l<ShopItem, w> {
    final /* synthetic */ RewardsRecyclerviewFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RewardsRecyclerviewFragment$onViewCreated$5(RewardsRecyclerviewFragment rewardsRecyclerviewFragment) {
        super(1);
        this.this$0 = rewardsRecyclerviewFragment;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ w invoke(ShopItem shopItem) {
        invoke2(shopItem);
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(ShopItem shopItem) {
        androidx.activity.result.b bVar;
        q.i(shopItem, "it");
        this.this$0.selectedCard = shopItem;
        Intent intent = new Intent(this.this$0.getActivity(), SkillMemberActivity.class);
        bVar = this.this$0.cardSelectedResult;
        bVar.a(intent);
    }
}
