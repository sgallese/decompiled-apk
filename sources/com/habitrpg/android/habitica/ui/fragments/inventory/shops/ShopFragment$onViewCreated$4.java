package com.habitrpg.android.habitica.ui.fragments.inventory.shops;

import android.content.Context;
import com.habitrpg.android.habitica.helpers.Analytics;
import com.habitrpg.android.habitica.helpers.EventCategory;
import com.habitrpg.android.habitica.helpers.HitType;
import com.habitrpg.android.habitica.models.shops.ShopItem;
import com.habitrpg.android.habitica.models.user.User;
import com.habitrpg.android.habitica.ui.fragments.purchases.EventOutcomeSubscriptionBottomSheetFragment;
import com.habitrpg.android.habitica.ui.fragments.purchases.SubscriptionBottomSheetFragment;
import com.habitrpg.android.habitica.ui.views.shops.PurchaseDialog;
import dc.w;
import pc.l;
import pc.p;
import qc.q;
import qc.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ShopFragment.kt */
/* loaded from: classes4.dex */
public final class ShopFragment$onViewCreated$4 extends r implements p<ShopItem, Boolean, w> {
    final /* synthetic */ ShopFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ShopFragment.kt */
    /* renamed from: com.habitrpg.android.habitica.ui.fragments.inventory.shops.ShopFragment$onViewCreated$4$2  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass2 extends r implements l<ShopItem, w> {
        final /* synthetic */ ShopFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(ShopFragment shopFragment) {
            super(1);
            this.this$0 = shopFragment;
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ w invoke(ShopItem shopItem) {
            invoke2(shopItem);
            return w.f13270a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(ShopItem shopItem) {
            q.i(shopItem, "it");
            this.this$0.loadShopInventory();
            if (q.d("market", this.this$0.getShopIdentifier())) {
                this.this$0.loadMarketGear();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopFragment$onViewCreated$4(ShopFragment shopFragment) {
        super(2);
        this.this$0 = shopFragment;
    }

    @Override // pc.p
    public /* bridge */ /* synthetic */ w invoke(ShopItem shopItem, Boolean bool) {
        invoke(shopItem, bool.booleanValue());
        return w.f13270a;
    }

    public final void invoke(ShopItem shopItem, boolean z10) {
        q.i(shopItem, "item");
        if (q.d(shopItem.getKey(), "gem")) {
            User f10 = this.this$0.getUserViewModel().getUser().f();
            boolean z11 = false;
            if (f10 != null && f10.isSubscribed()) {
                z11 = true;
            }
            if (!z11) {
                Analytics.sendEvent$default(Analytics.INSTANCE, "View gems for gold CTA", EventCategory.BEHAVIOUR, HitType.EVENT, null, null, 24, null);
                EventOutcomeSubscriptionBottomSheetFragment eventOutcomeSubscriptionBottomSheetFragment = new EventOutcomeSubscriptionBottomSheetFragment();
                eventOutcomeSubscriptionBottomSheetFragment.setEventType(EventOutcomeSubscriptionBottomSheetFragment.EVENT_GEMS_FOR_GOLD);
                androidx.fragment.app.q activity = this.this$0.getActivity();
                if (activity != null) {
                    eventOutcomeSubscriptionBottomSheetFragment.show(activity.getSupportFragmentManager(), SubscriptionBottomSheetFragment.TAG);
                    return;
                }
                return;
            }
        }
        Context requireContext = this.this$0.requireContext();
        q.h(requireContext, "requireContext(...)");
        PurchaseDialog purchaseDialog = new PurchaseDialog(requireContext, this.this$0.getUserRepository(), this.this$0.getInventoryRepository(), shopItem, this.this$0.getMainActivity());
        purchaseDialog.setShopIdentifier(this.this$0.getShopIdentifier());
        purchaseDialog.setPinned(z10);
        purchaseDialog.setOnShopNeedsRefresh(new AnonymousClass2(this.this$0));
        purchaseDialog.show();
    }
}
