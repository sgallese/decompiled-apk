package com.habitrpg.android.habitica.ui.fragments.inventory.items;

import com.habitrpg.android.habitica.models.inventory.SpecialItem;
import dc.w;
import pc.l;
import qc.q;
import qc.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ItemRecyclerFragment.kt */
/* loaded from: classes4.dex */
public final class ItemRecyclerFragment$setAdapter$2 extends r implements l<SpecialItem, w> {
    final /* synthetic */ ItemRecyclerFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ItemRecyclerFragment$setAdapter$2(ItemRecyclerFragment itemRecyclerFragment) {
        super(1);
        this.this$0 = itemRecyclerFragment;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ w invoke(SpecialItem specialItem) {
        invoke2(specialItem);
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(SpecialItem specialItem) {
        q.i(specialItem, "it");
        this.this$0.onSpecialItemSelected(specialItem);
    }
}
