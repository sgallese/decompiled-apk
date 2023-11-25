package com.habitrpg.android.habitica.ui.fragments.inventory.shops;

import com.habitrpg.android.habitica.models.user.Stats;
import com.habitrpg.android.habitica.models.user.User;
import com.habitrpg.android.habitica.ui.adapter.inventory.ShopRecyclerAdapter;
import dc.w;
import j0.j1;
import pc.l;
import qc.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ShopFragment.kt */
/* loaded from: classes4.dex */
public final class ShopFragment$onViewCreated$9 extends r implements l<User, w> {
    final /* synthetic */ ShopFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopFragment$onViewCreated$9(ShopFragment shopFragment) {
        super(1);
        this.this$0 = shopFragment;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ w invoke(User user) {
        invoke2(user);
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(User user) {
        j1 j1Var;
        j1 j1Var2;
        Double valueOf;
        Stats stats;
        ShopRecyclerAdapter adapter = this.this$0.getAdapter();
        if (adapter != null) {
            adapter.setUser(user);
        }
        this.this$0.getHourglasses$Habitica_2311256681_prodRelease().setValue(user != null ? Double.valueOf(user.getHourglassCount()) : Double.valueOf(0.0d));
        j1Var = this.this$0.gems;
        j1Var.setValue(user != null ? Double.valueOf(user.getGemCount()) : Double.valueOf(0.0d));
        j1Var2 = this.this$0.gold;
        if (user == null || (stats = user.getStats()) == null || (valueOf = stats.getGp()) == null) {
            valueOf = Double.valueOf(0.0d);
        }
        j1Var2.setValue(valueOf);
    }
}
