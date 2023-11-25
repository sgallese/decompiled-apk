package com.habitrpg.android.habitica.ui.adapter.inventory;

import androidx.recyclerview.widget.RecyclerView;
import com.habitrpg.android.habitica.ui.viewHolders.SectionViewHolder;
import dc.w;
import qc.q;
import qc.r;

/* compiled from: ShopRecyclerAdapter.kt */
/* loaded from: classes4.dex */
final class ShopRecyclerAdapter$onBindViewHolder$1$1 extends r implements pc.a<w> {
    final /* synthetic */ RecyclerView.f0 $holder;
    final /* synthetic */ ShopRecyclerAdapter this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopRecyclerAdapter$onBindViewHolder$1$1(ShopRecyclerAdapter shopRecyclerAdapter, RecyclerView.f0 f0Var) {
        super(0);
        this.this$0 = shopRecyclerAdapter;
        this.$holder = f0Var;
    }

    @Override // pc.a
    public /* bridge */ /* synthetic */ w invoke() {
        invoke2();
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        if (q.d(this.this$0.getSelectedGearCategory$Habitica_2311256681_prodRelease(), this.this$0.getGearCategories().get(((SectionViewHolder) this.$holder).getSelectedItem()).getIdentifier())) {
            return;
        }
        ShopRecyclerAdapter shopRecyclerAdapter = this.this$0;
        shopRecyclerAdapter.setSelectedGearCategory$Habitica_2311256681_prodRelease(shopRecyclerAdapter.getGearCategories().get(((SectionViewHolder) this.$holder).getSelectedItem()).getIdentifier());
    }
}
