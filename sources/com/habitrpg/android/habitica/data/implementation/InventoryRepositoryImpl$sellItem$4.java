package com.habitrpg.android.habitica.data.implementation;

import com.habitrpg.android.habitica.models.user.OwnedItem;
import dc.w;
import io.realm.o0;
import pc.l;
import qc.q;
import qc.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: InventoryRepositoryImpl.kt */
/* loaded from: classes4.dex */
public final class InventoryRepositoryImpl$sellItem$4 extends r implements l<o0, w> {
    final /* synthetic */ OwnedItem $ownedItem;
    final /* synthetic */ InventoryRepositoryImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InventoryRepositoryImpl$sellItem$4(InventoryRepositoryImpl inventoryRepositoryImpl, OwnedItem ownedItem) {
        super(1);
        this.this$0 = inventoryRepositoryImpl;
        this.$ownedItem = ownedItem;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ w invoke(o0 o0Var) {
        invoke2(o0Var);
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(o0 o0Var) {
        q.i(o0Var, "it");
        OwnedItem liveObject = this.this$0.getLocalRepository().getLiveObject(this.$ownedItem);
        if (liveObject == null) {
            return;
        }
        liveObject.setNumberOwned(liveObject.getNumberOwned() - 1);
    }
}
