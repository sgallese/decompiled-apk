package com.habitrpg.android.habitica.data.local.implementation;

import com.habitrpg.android.habitica.models.user.OwnedItem;
import com.habitrpg.android.habitica.models.user.Purchases;
import com.habitrpg.android.habitica.models.user.SubscriptionPlan;
import com.habitrpg.android.habitica.models.user.User;
import dc.w;
import io.realm.o0;
import pc.l;
import qc.q;
import qc.r;

/* compiled from: RealmInventoryLocalRepository.kt */
/* loaded from: classes4.dex */
final class RealmInventoryLocalRepository$decrementMysteryItemCount$1 extends r implements l<o0, w> {
    final /* synthetic */ OwnedItem $item;
    final /* synthetic */ User $liveUser;
    final /* synthetic */ User $user;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealmInventoryLocalRepository$decrementMysteryItemCount$1(OwnedItem ownedItem, User user, User user2) {
        super(1);
        this.$item = ownedItem;
        this.$liveUser = user;
        this.$user = user2;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ w invoke(o0 o0Var) {
        invoke2(o0Var);
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(o0 o0Var) {
        SubscriptionPlan plan;
        q.i(o0Var, "it");
        OwnedItem ownedItem = this.$item;
        if (ownedItem != null && ownedItem.isValid()) {
            OwnedItem ownedItem2 = this.$item;
            ownedItem2.setNumberOwned(ownedItem2.getNumberOwned() - 1);
        }
        User user = this.$liveUser;
        int i10 = 0;
        if (user != null && user.isValid()) {
            Purchases purchased = this.$liveUser.getPurchased();
            SubscriptionPlan plan2 = purchased != null ? purchased.getPlan() : null;
            if (plan2 == null) {
                return;
            }
            Purchases purchased2 = this.$user.getPurchased();
            if (purchased2 != null && (plan = purchased2.getPlan()) != null) {
                i10 = plan.getMysteryItemCount();
            }
            plan2.setMysteryItemCount(i10 - 1);
        }
    }
}
