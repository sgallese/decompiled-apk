package com.habitrpg.android.habitica.data.local.implementation;

import com.habitrpg.android.habitica.models.user.Items;
import com.habitrpg.android.habitica.models.user.OwnedItem;
import com.habitrpg.android.habitica.models.user.OwnedMount;
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
final class RealmInventoryLocalRepository$feedPet$1 extends r implements l<o0, w> {
    final /* synthetic */ int $feedValue;
    final /* synthetic */ OwnedItem $food;
    final /* synthetic */ OwnedPet $pet;
    final /* synthetic */ String $petKey;
    final /* synthetic */ User $user;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealmInventoryLocalRepository$feedPet$1(OwnedPet ownedPet, int i10, OwnedItem ownedItem, String str, User user) {
        super(1);
        this.$pet = ownedPet;
        this.$feedValue = i10;
        this.$food = ownedItem;
        this.$petKey = str;
        this.$user = user;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ w invoke(o0 o0Var) {
        invoke2(o0Var);
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(o0 o0Var) {
        x0<OwnedMount> mounts;
        q.i(o0Var, "it");
        this.$pet.setTrained(this.$feedValue);
        OwnedItem ownedItem = this.$food;
        ownedItem.setNumberOwned(ownedItem.getNumberOwned() - 1);
        if (this.$feedValue < 0) {
            OwnedMount ownedMount = new OwnedMount();
            ownedMount.setKey(this.$petKey);
            ownedMount.setOwned(true);
            Items items = this.$user.getItems();
            if (items == null || (mounts = items.getMounts()) == null) {
                return;
            }
            mounts.add(ownedMount);
        }
    }
}
