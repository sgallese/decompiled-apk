package com.habitrpg.android.habitica.ui.fragments.inventory.shops;

import dc.w;
import qc.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ShopFragment.kt */
/* loaded from: classes4.dex */
public final class ShopFragment$onViewCreated$1 extends r implements pc.a<w> {
    final /* synthetic */ ShopFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopFragment$onViewCreated$1(ShopFragment shopFragment) {
        super(0);
        this.this$0 = shopFragment;
    }

    @Override // pc.a
    public /* bridge */ /* synthetic */ w invoke() {
        invoke2();
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.this$0.loadShopInventory();
    }
}
