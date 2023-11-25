package com.habitrpg.android.habitica.ui.fragments.inventory.shops;

import android.content.Context;
import androidx.compose.ui.platform.ComposeView;
import qc.q;
import qc.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ShopFragment.kt */
/* loaded from: classes4.dex */
public final class ShopFragment$currencyView$2 extends r implements pc.a<ComposeView> {
    final /* synthetic */ ShopFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopFragment$currencyView$2(ShopFragment shopFragment) {
        super(0);
        this.this$0 = shopFragment;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // pc.a
    public final ComposeView invoke() {
        Context requireContext = this.this$0.requireContext();
        q.h(requireContext, "requireContext(...)");
        return new ComposeView(requireContext, null, 0, 6, null);
    }
}
