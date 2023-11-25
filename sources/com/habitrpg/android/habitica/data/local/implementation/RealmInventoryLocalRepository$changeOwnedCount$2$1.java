package com.habitrpg.android.habitica.data.local.implementation;

import com.habitrpg.android.habitica.models.user.OwnedItem;
import dc.w;
import io.realm.o0;
import pc.l;
import qc.q;
import qc.r;

/* compiled from: RealmInventoryLocalRepository.kt */
/* loaded from: classes4.dex */
final class RealmInventoryLocalRepository$changeOwnedCount$2$1 extends r implements l<o0, w> {
    final /* synthetic */ int $amount;
    final /* synthetic */ OwnedItem $liveItem;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealmInventoryLocalRepository$changeOwnedCount$2$1(OwnedItem ownedItem, int i10) {
        super(1);
        this.$liveItem = ownedItem;
        this.$amount = i10;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ w invoke(o0 o0Var) {
        invoke2(o0Var);
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(o0 o0Var) {
        q.i(o0Var, "it");
        OwnedItem ownedItem = this.$liveItem;
        ownedItem.setNumberOwned(ownedItem.getNumberOwned() + this.$amount);
    }
}
