package com.habitrpg.android.habitica.ui.fragments.inventory.customization;

import android.content.Context;
import com.habitrpg.android.habitica.models.shops.ShopItem;
import com.habitrpg.android.habitica.ui.views.shops.PurchaseDialog;
import dc.w;
import qc.q;
import qc.r;

/* compiled from: AvatarCustomizationFragment.kt */
/* loaded from: classes4.dex */
final class AvatarCustomizationFragment$onCreateView$2 extends r implements pc.l<ShopItem, w> {
    final /* synthetic */ AvatarCustomizationFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AvatarCustomizationFragment$onCreateView$2(AvatarCustomizationFragment avatarCustomizationFragment) {
        super(1);
        this.this$0 = avatarCustomizationFragment;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ w invoke(ShopItem shopItem) {
        invoke2(shopItem);
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(ShopItem shopItem) {
        q.i(shopItem, "item");
        Context requireContext = this.this$0.requireContext();
        q.h(requireContext, "requireContext(...)");
        new PurchaseDialog(requireContext, this.this$0.getUserRepository(), this.this$0.getInventoryRepository(), shopItem, null, 16, null).show();
    }
}
