package com.habitrpg.android.habitica.data.local.implementation;

import com.habitrpg.android.habitica.models.user.Items;
import com.habitrpg.android.habitica.models.user.OwnedItem;
import com.habitrpg.android.habitica.models.user.OwnedPet;
import com.habitrpg.android.habitica.models.user.User;
import dc.w;
import io.realm.o0;
import io.realm.x0;
import pc.l;
import qc.q;
import qc.r;

/* compiled from: RealmInventoryLocalRepository.kt */
/* loaded from: classes4.dex */
final class RealmInventoryLocalRepository$hatchPet$1 extends r implements l<o0, w> {
    final /* synthetic */ OwnedItem $egg;
    final /* synthetic */ OwnedItem $hatchingPotion;
    final /* synthetic */ OwnedPet $newPet;
    final /* synthetic */ User $user;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealmInventoryLocalRepository$hatchPet$1(OwnedItem ownedItem, OwnedItem ownedItem2, User user, OwnedPet ownedPet) {
        super(1);
        this.$egg = ownedItem;
        this.$hatchingPotion = ownedItem2;
        this.$user = user;
        this.$newPet = ownedPet;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ w invoke(o0 o0Var) {
        invoke2(o0Var);
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(o0 o0Var) {
        x0<OwnedPet> pets;
        q.i(o0Var, "it");
        this.$egg.setNumberOwned(r2.getNumberOwned() - 1);
        this.$hatchingPotion.setNumberOwned(r2.getNumberOwned() - 1);
        Items items = this.$user.getItems();
        if (items == null || (pets = items.getPets()) == null) {
            return;
        }
        pets.add(this.$newPet);
    }
}
