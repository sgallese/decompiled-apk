package com.habitrpg.android.habitica.ui.fragments.inventory.items;

import com.habitrpg.android.habitica.models.inventory.Egg;
import com.habitrpg.android.habitica.models.inventory.HatchingPotion;
import dc.w;
import pc.p;
import qc.q;
import qc.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ItemRecyclerFragment.kt */
/* loaded from: classes4.dex */
public final class ItemRecyclerFragment$setAdapter$7 extends r implements p<HatchingPotion, Egg, w> {
    final /* synthetic */ ItemRecyclerFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ItemRecyclerFragment$setAdapter$7(ItemRecyclerFragment itemRecyclerFragment) {
        super(2);
        this.this$0 = itemRecyclerFragment;
    }

    @Override // pc.p
    public /* bridge */ /* synthetic */ w invoke(HatchingPotion hatchingPotion, Egg egg) {
        invoke2(hatchingPotion, egg);
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(HatchingPotion hatchingPotion, Egg egg) {
        q.i(hatchingPotion, "pet");
        q.i(egg, "egg");
        this.this$0.hatchPet(hatchingPotion, egg);
    }
}
