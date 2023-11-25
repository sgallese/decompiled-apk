package com.habitrpg.android.habitica.ui.fragments.inventory.shops;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.w;
import com.habitrpg.common.habitica.helpers.ExceptionHandlerKt;
import qc.q;

/* compiled from: QuestShopFragment.kt */
/* loaded from: classes4.dex */
public final class QuestShopFragment extends Hilt_QuestShopFragment {
    public static final int $stable = 0;

    @Override // com.habitrpg.android.habitica.ui.fragments.inventory.shops.ShopFragment, com.habitrpg.android.habitica.ui.fragments.BaseMainFragment, com.habitrpg.android.habitica.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        q.i(layoutInflater, "inflater");
        setShopIdentifier("questShop");
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.inventory.shops.ShopFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        q.i(view, "view");
        super.onViewCreated(view, bundle);
        ExceptionHandlerKt.launchCatching$default(w.a(this), null, new QuestShopFragment$onViewCreated$1(this, null), 1, null);
    }
}
