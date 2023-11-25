package com.habitrpg.android.habitica.ui.adapter.inventory;

import android.content.Context;
import com.habitrpg.android.habitica.models.inventory.Egg;
import com.habitrpg.android.habitica.models.inventory.HatchingPotion;
import com.habitrpg.android.habitica.models.inventory.Item;
import com.habitrpg.android.habitica.models.inventory.QuestContent;
import com.habitrpg.android.habitica.models.inventory.SpecialItem;
import com.habitrpg.android.habitica.models.user.OwnedItem;
import com.habitrpg.android.habitica.models.user.User;
import com.habitrpg.android.habitica.ui.adapter.inventory.ItemRecyclerAdapter;
import com.habitrpg.android.habitica.ui.views.dialogs.DetailDialog;
import com.habitrpg.common.habitica.extensions.StringExtensionsKt;
import dc.w;
import pc.l;
import qc.q;
import qc.r;

/* compiled from: ItemRecyclerAdapter.kt */
/* loaded from: classes4.dex */
final class ItemRecyclerAdapter$ItemViewHolder$onClick$1 extends r implements l<Integer, w> {
    final /* synthetic */ Context $context;
    final /* synthetic */ ItemRecyclerAdapter.ItemViewHolder this$0;
    final /* synthetic */ ItemRecyclerAdapter this$1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ItemRecyclerAdapter$ItemViewHolder$onClick$1(ItemRecyclerAdapter.ItemViewHolder itemViewHolder, ItemRecyclerAdapter itemRecyclerAdapter, Context context) {
        super(1);
        this.this$0 = itemViewHolder;
        this.this$1 = itemRecyclerAdapter;
        this.$context = context;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ w invoke(Integer num) {
        invoke(num.intValue());
        return w.f13270a;
    }

    public final void invoke(int i10) {
        l<Item, w> onOpenMysteryItem;
        l<Item, w> onStartHatching;
        OwnedItem ownedItem;
        OwnedItem ownedItem2;
        l<OwnedItem, w> onSellItem;
        OwnedItem ownedItem3;
        OwnedItem ownedItem4;
        String key;
        if (this.this$0.getItem() == null) {
            ownedItem3 = this.this$0.ownedItem;
            if (ownedItem3 != null) {
                SpecialItem specialItem = new SpecialItem();
                ownedItem4 = this.this$0.ownedItem;
                if (ownedItem4 != null && (key = ownedItem4.getKey()) != null) {
                    specialItem.setKey(key);
                    specialItem.setText(StringExtensionsKt.localizedCapitalizeWithSpaces(key));
                }
                l<SpecialItem, w> onUseSpecialItem = this.this$1.getOnUseSpecialItem();
                if (onUseSpecialItem != null) {
                    onUseSpecialItem.invoke(specialItem);
                    return;
                }
                return;
            }
        }
        Item item = this.this$0.getItem();
        if (item != null) {
            ItemRecyclerAdapter.ItemViewHolder itemViewHolder = this.this$0;
            ItemRecyclerAdapter itemRecyclerAdapter = this.this$1;
            Context context = this.$context;
            boolean z10 = item instanceof QuestContent;
            if (!z10 && !(item instanceof SpecialItem)) {
                ownedItem = itemViewHolder.ownedItem;
                if (!q.d(ownedItem != null ? ownedItem.getItemType() : null, "special") && i10 == 0) {
                    ownedItem2 = itemViewHolder.ownedItem;
                    if (ownedItem2 == null || (onSellItem = itemRecyclerAdapter.getOnSellItem()) == null) {
                        return;
                    }
                    onSellItem.invoke(ownedItem2);
                    return;
                }
            }
            if (item instanceof Egg) {
                Item item2 = itemViewHolder.getItem();
                if (item2 == null || (onStartHatching = itemRecyclerAdapter.getOnStartHatching()) == null) {
                    return;
                }
                onStartHatching.invoke(item2);
            } else if (item instanceof HatchingPotion) {
                l<Item, w> onStartHatching2 = itemRecyclerAdapter.getOnStartHatching();
                if (onStartHatching2 != null) {
                    onStartHatching2.invoke(item);
                }
            } else if (!z10) {
                if (item instanceof SpecialItem) {
                    Item item3 = itemViewHolder.getItem();
                    if (!q.d(item3 != null ? item3.getKey() : null, "inventory_present") || (onOpenMysteryItem = itemRecyclerAdapter.getOnOpenMysteryItem()) == null) {
                        return;
                    }
                    onOpenMysteryItem.invoke(item);
                }
            } else if (i10 == 0) {
                DetailDialog detailDialog = new DetailDialog(context);
                detailDialog.setQuest((QuestContent) item);
                detailDialog.show();
            } else {
                User user = itemRecyclerAdapter.getUser();
                boolean z11 = false;
                if (user != null && user.getHasParty()) {
                    z11 = true;
                }
                if (z11) {
                    l<QuestContent, w> onQuestInvitation = itemRecyclerAdapter.getOnQuestInvitation();
                    if (onQuestInvitation != null) {
                        onQuestInvitation.invoke(item);
                        return;
                    }
                    return;
                }
                pc.a<w> onCreateNewParty = itemRecyclerAdapter.getOnCreateNewParty();
                if (onCreateNewParty != null) {
                    onCreateNewParty.invoke();
                }
            }
        }
    }
}
