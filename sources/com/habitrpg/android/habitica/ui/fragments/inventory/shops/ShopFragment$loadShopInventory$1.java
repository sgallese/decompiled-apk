package com.habitrpg.android.habitica.ui.fragments.inventory.shops;

import com.habitrpg.android.habitica.databinding.FragmentRefreshRecyclerviewBinding;
import com.habitrpg.android.habitica.ui.helpers.RecyclerViewEmptySupport;
import com.habitrpg.common.habitica.helpers.RecyclerViewState;
import dc.w;
import pc.l;
import qc.q;
import qc.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ShopFragment.kt */
/* loaded from: classes4.dex */
public final class ShopFragment$loadShopInventory$1 extends r implements l<Throwable, w> {
    final /* synthetic */ ShopFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopFragment$loadShopInventory$1(ShopFragment shopFragment) {
        super(1);
        this.this$0 = shopFragment;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ w invoke(Throwable th) {
        invoke2(th);
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable th) {
        q.i(th, "it");
        FragmentRefreshRecyclerviewBinding binding = this.this$0.getBinding();
        RecyclerViewEmptySupport recyclerViewEmptySupport = binding != null ? binding.recyclerView : null;
        if (recyclerViewEmptySupport == null) {
            return;
        }
        recyclerViewEmptySupport.setState(RecyclerViewState.FAILED);
    }
}
