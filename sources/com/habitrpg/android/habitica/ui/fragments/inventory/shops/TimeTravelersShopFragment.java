package com.habitrpg.android.habitica.ui.fragments.inventory.shops;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import q0.c;
import qc.q;

/* compiled from: TimeTravelersShopFragment.kt */
/* loaded from: classes4.dex */
public final class TimeTravelersShopFragment extends Hilt_TimeTravelersShopFragment {
    public static final int $stable = 0;

    @Override // com.habitrpg.android.habitica.ui.fragments.inventory.shops.ShopFragment
    public void initializeCurrencyViews() {
        getCurrencyView$Habitica_2311256681_prodRelease().setContent(c.c(-1922497775, true, new TimeTravelersShopFragment$initializeCurrencyViews$1(this)));
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.inventory.shops.ShopFragment, com.habitrpg.android.habitica.ui.fragments.BaseMainFragment, com.habitrpg.android.habitica.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        q.i(layoutInflater, "inflater");
        setShopIdentifier("timeTravelersShop");
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.inventory.shops.ShopFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        q.i(view, "view");
        super.onViewCreated(view, bundle);
        initializeCurrencyViews();
    }
}
