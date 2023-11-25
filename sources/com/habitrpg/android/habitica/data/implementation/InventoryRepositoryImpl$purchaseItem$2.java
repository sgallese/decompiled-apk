package com.habitrpg.android.habitica.data.implementation;

import com.habitrpg.android.habitica.models.user.Purchases;
import com.habitrpg.android.habitica.models.user.SubscriptionPlan;
import com.habitrpg.android.habitica.models.user.User;
import dc.w;
import io.realm.o0;
import pc.l;
import qc.q;
import qc.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: InventoryRepositoryImpl.kt */
/* loaded from: classes4.dex */
public final class InventoryRepositoryImpl$purchaseItem$2 extends r implements l<o0, w> {
    final /* synthetic */ int $purchaseQuantity;
    final /* synthetic */ User $user;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InventoryRepositoryImpl$purchaseItem$2(User user, int i10) {
        super(1);
        this.$user = user;
        this.$purchaseQuantity = i10;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ w invoke(o0 o0Var) {
        invoke2(o0Var);
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(o0 o0Var) {
        Purchases purchased;
        SubscriptionPlan plan;
        Integer gemsBought;
        Purchases purchased2;
        q.i(o0Var, "it");
        User user = this.$user;
        SubscriptionPlan plan2 = (user == null || (purchased2 = user.getPurchased()) == null) ? null : purchased2.getPlan();
        if (plan2 == null) {
            return;
        }
        int i10 = this.$purchaseQuantity;
        User user2 = this.$user;
        plan2.setGemsBought(Integer.valueOf(i10 + ((user2 == null || (purchased = user2.getPurchased()) == null || (plan = purchased.getPlan()) == null || (gemsBought = plan.getGemsBought()) == null) ? 0 : gemsBought.intValue())));
    }
}
