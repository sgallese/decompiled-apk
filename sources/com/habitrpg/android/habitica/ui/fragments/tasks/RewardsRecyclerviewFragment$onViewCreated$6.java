package com.habitrpg.android.habitica.ui.fragments.tasks;

import android.content.Context;
import com.habitrpg.android.habitica.models.shops.ShopItem;
import com.habitrpg.android.habitica.ui.views.shops.PurchaseDialog;
import dc.w;
import pc.l;
import pc.p;
import qc.q;
import qc.r;

/* compiled from: RewardsRecyclerviewFragment.kt */
/* loaded from: classes4.dex */
final class RewardsRecyclerviewFragment$onViewCreated$6 extends r implements p<ShopItem, Boolean, w> {
    final /* synthetic */ RewardsRecyclerviewFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RewardsRecyclerviewFragment.kt */
    /* renamed from: com.habitrpg.android.habitica.ui.fragments.tasks.RewardsRecyclerviewFragment$onViewCreated$6$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends r implements l<ShopItem, w> {
        final /* synthetic */ RewardsRecyclerviewFragment this$0;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: RewardsRecyclerviewFragment.kt */
        /* renamed from: com.habitrpg.android.habitica.ui.fragments.tasks.RewardsRecyclerviewFragment$onViewCreated$6$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C02941 extends r implements pc.a<w> {
            public static final C02941 INSTANCE = new C02941();

            C02941() {
                super(0);
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }

            @Override // pc.a
            public /* bridge */ /* synthetic */ w invoke() {
                invoke2();
                return w.f13270a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(RewardsRecyclerviewFragment rewardsRecyclerviewFragment) {
            super(1);
            this.this$0 = rewardsRecyclerviewFragment;
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ w invoke(ShopItem shopItem) {
            invoke2(shopItem);
            return w.f13270a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(ShopItem shopItem) {
            q.i(shopItem, "it");
            this.this$0.getViewModel().refreshData$Habitica_2311256681_prodRelease(C02941.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RewardsRecyclerviewFragment$onViewCreated$6(RewardsRecyclerviewFragment rewardsRecyclerviewFragment) {
        super(2);
        this.this$0 = rewardsRecyclerviewFragment;
    }

    @Override // pc.p
    public /* bridge */ /* synthetic */ w invoke(ShopItem shopItem, Boolean bool) {
        invoke(shopItem, bool.booleanValue());
        return w.f13270a;
    }

    public final void invoke(ShopItem shopItem, boolean z10) {
        q.i(shopItem, "item");
        Context requireContext = this.this$0.requireContext();
        q.h(requireContext, "requireContext(...)");
        PurchaseDialog purchaseDialog = new PurchaseDialog(requireContext, this.this$0.getUserRepository(), this.this$0.getInventoryRepository(), shopItem, null, 16, null);
        purchaseDialog.setPinned(z10);
        purchaseDialog.setOnShopNeedsRefresh(new AnonymousClass1(this.this$0));
        purchaseDialog.show();
    }
}
