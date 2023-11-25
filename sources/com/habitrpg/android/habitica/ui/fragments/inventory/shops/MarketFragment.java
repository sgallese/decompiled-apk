package com.habitrpg.android.habitica.ui.fragments.inventory.shops;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import qc.q;

/* compiled from: MarketFragment.kt */
/* loaded from: classes4.dex */
public final class MarketFragment extends Hilt_MarketFragment {
    public static final int $stable = 0;

    @Override // com.habitrpg.android.habitica.ui.fragments.inventory.shops.ShopFragment, com.habitrpg.android.habitica.ui.fragments.BaseMainFragment, com.habitrpg.android.habitica.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        q.i(layoutInflater, "inflater");
        setShopIdentifier("market");
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }
}
