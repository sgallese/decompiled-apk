package com.habitrpg.android.habitica.ui.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.habitrpg.android.habitica.databinding.FragmentPromoInfoBinding;
import com.habitrpg.android.habitica.helpers.AppConfigManager;
import com.habitrpg.android.habitica.models.promotions.HabiticaPromotion;
import com.habitrpg.android.habitica.ui.activities.MainActivity;

/* compiled from: PromoInfoFragment.kt */
/* loaded from: classes4.dex */
public final class PromoInfoFragment extends Hilt_PromoInfoFragment<FragmentPromoInfoBinding> {
    public static final int $stable = 8;
    private FragmentPromoInfoBinding binding;
    public AppConfigManager configManager;

    public final AppConfigManager getConfigManager() {
        AppConfigManager appConfigManager = this.configManager;
        if (appConfigManager != null) {
            return appConfigManager;
        }
        qc.q.z("configManager");
        return null;
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseMainFragment, com.habitrpg.android.habitica.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        qc.q.i(layoutInflater, "inflater");
        setHidesToolbar(true);
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseMainFragment, com.habitrpg.android.habitica.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        MainActivity mainActivity = getMainActivity();
        if (mainActivity != null) {
            mainActivity.setTitle("");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        qc.q.i(view, "view");
        super.onViewCreated(view, bundle);
        HabiticaPromotion activePromo = getConfigManager().activePromo();
        if (activePromo != null) {
            activePromo.configureInfoFragment(this);
        }
    }

    public final void setConfigManager(AppConfigManager appConfigManager) {
        qc.q.i(appConfigManager, "<set-?>");
        this.configManager = appConfigManager;
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseFragment
    public FragmentPromoInfoBinding createBinding(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        qc.q.i(layoutInflater, "inflater");
        FragmentPromoInfoBinding inflate = FragmentPromoInfoBinding.inflate(layoutInflater, viewGroup, false);
        qc.q.h(inflate, "inflate(...)");
        return inflate;
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseFragment
    public FragmentPromoInfoBinding getBinding() {
        return this.binding;
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseFragment
    public void setBinding(FragmentPromoInfoBinding fragmentPromoInfoBinding) {
        this.binding = fragmentPromoInfoBinding;
    }
}
