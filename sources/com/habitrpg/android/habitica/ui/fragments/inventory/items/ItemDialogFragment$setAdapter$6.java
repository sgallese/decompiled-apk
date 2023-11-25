package com.habitrpg.android.habitica.ui.fragments.inventory.items;

import com.habitrpg.android.habitica.models.inventory.Food;
import dc.w;
import pc.l;
import qc.q;
import qc.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ItemDialogFragment.kt */
/* loaded from: classes4.dex */
public final class ItemDialogFragment$setAdapter$6 extends r implements l<Food, w> {
    final /* synthetic */ ItemDialogFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ItemDialogFragment$setAdapter$6(ItemDialogFragment itemDialogFragment) {
        super(1);
        this.this$0 = itemDialogFragment;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ w invoke(Food food) {
        invoke2(food);
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Food food) {
        q.i(food, "food");
        this.this$0.feedPet(food);
    }
}
