package com.habitrpg.android.habitica.ui.fragments;

import android.content.Context;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.extensions.DateExtensionsKt;
import com.habitrpg.android.habitica.models.promotions.HabiticaPromotion;
import com.habitrpg.android.habitica.ui.adapter.NavigationDrawerAdapter;
import com.habitrpg.android.habitica.ui.menu.HabiticaDrawerItem;
import qc.f0;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NavigationDrawerFragment.kt */
/* loaded from: classes4.dex */
public final class NavigationDrawerFragment$updatePromo$1$4 extends qc.r implements pc.a<dc.w> {
    final /* synthetic */ HabiticaPromotion $activePromo;
    final /* synthetic */ f0<HabiticaDrawerItem> $promotedItem;
    final /* synthetic */ NavigationDrawerFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationDrawerFragment$updatePromo$1$4(HabiticaPromotion habiticaPromotion, f0<HabiticaDrawerItem> f0Var, NavigationDrawerFragment navigationDrawerFragment) {
        super(0);
        this.$activePromo = habiticaPromotion;
        this.$promotedItem = f0Var;
        this.this$0 = navigationDrawerFragment;
    }

    @Override // pc.a
    public /* bridge */ /* synthetic */ dc.w invoke() {
        invoke2();
        return dc.w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        NavigationDrawerAdapter navigationDrawerAdapter;
        NavigationDrawerAdapter navigationDrawerAdapter2;
        NavigationDrawerAdapter navigationDrawerAdapter3 = null;
        if (this.$activePromo.isActive()) {
            HabiticaDrawerItem habiticaDrawerItem = this.$promotedItem.f21676f;
            Context context = this.this$0.getContext();
            habiticaDrawerItem.setSubtitle(context != null ? context.getString(R.string.sale_ends_in, DateExtensionsKt.getShortRemainingString(this.$activePromo.getEndDate())) : null);
            navigationDrawerAdapter2 = this.this$0.adapter;
            if (navigationDrawerAdapter2 == null) {
                qc.q.z("adapter");
            } else {
                navigationDrawerAdapter3 = navigationDrawerAdapter2;
            }
            navigationDrawerAdapter3.updateItem(this.$promotedItem.f21676f);
            return;
        }
        this.$promotedItem.f21676f.setSubtitle(null);
        this.$promotedItem.f21676f.setPillText(null);
        navigationDrawerAdapter = this.this$0.adapter;
        if (navigationDrawerAdapter == null) {
            qc.q.z("adapter");
        } else {
            navigationDrawerAdapter3 = navigationDrawerAdapter;
        }
        navigationDrawerAdapter3.updateItem(this.$promotedItem.f21676f);
    }
}
