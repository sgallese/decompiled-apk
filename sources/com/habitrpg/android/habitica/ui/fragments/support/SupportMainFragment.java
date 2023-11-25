package com.habitrpg.android.habitica.ui.fragments.support;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.lifecycle.w;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.data.FAQRepository;
import com.habitrpg.android.habitica.databinding.FragmentSupportMainBinding;
import com.habitrpg.android.habitica.helpers.AppConfigManager;
import com.habitrpg.common.habitica.helpers.ExceptionHandler;
import com.habitrpg.common.habitica.helpers.MainNavigationController;
import qc.q;
import yc.v;

/* compiled from: SupportMainFragment.kt */
/* loaded from: classes4.dex */
public final class SupportMainFragment extends Hilt_SupportMainFragment<FragmentSupportMainBinding> {
    public static final int $stable = 8;
    public AppConfigManager appConfigManager;
    private FragmentSupportMainBinding binding;
    public FAQRepository faqRepository;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$0(View view) {
        MainNavigationController.navigate$default(MainNavigationController.INSTANCE, R.id.FAQOverviewFragment, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$1(View view) {
        MainNavigationController.navigate$default(MainNavigationController.INSTANCE, R.id.bugFixFragment, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$2(SupportMainFragment supportMainFragment, View view) {
        boolean u10;
        q.i(supportMainFragment, "this$0");
        u10 = v.u(supportMainFragment.getAppConfigManager().feedbackURL());
        if ((!u10) != false) {
            supportMainFragment.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(supportMainFragment.getAppConfigManager().feedbackURL())));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$3(SupportMainFragment supportMainFragment, View view) {
        q.i(supportMainFragment, "this$0");
        ad.i.d(w.a(supportMainFragment), ExceptionHandler.Companion.coroutine$default(ExceptionHandler.Companion, null, 1, null), null, new SupportMainFragment$onViewCreated$4$1(supportMainFragment, null), 2, null);
    }

    public final AppConfigManager getAppConfigManager() {
        AppConfigManager appConfigManager = this.appConfigManager;
        if (appConfigManager != null) {
            return appConfigManager;
        }
        q.z("appConfigManager");
        return null;
    }

    public final FAQRepository getFaqRepository() {
        FAQRepository fAQRepository = this.faqRepository;
        if (fAQRepository != null) {
            return fAQRepository;
        }
        q.z("faqRepository");
        return null;
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseMainFragment, com.habitrpg.android.habitica.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        q.i(layoutInflater, "inflater");
        setHidesToolbar(true);
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseMainFragment, com.habitrpg.android.habitica.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        getFaqRepository().close();
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Button button;
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        LinearLayout linearLayout3;
        q.i(view, "view");
        super.onViewCreated(view, bundle);
        FragmentSupportMainBinding binding = getBinding();
        if (binding != null && (linearLayout3 = binding.usingHabiticaWrapper) != null) {
            linearLayout3.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.fragments.support.h
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    SupportMainFragment.onViewCreated$lambda$0(view2);
                }
            });
        }
        FragmentSupportMainBinding binding2 = getBinding();
        if (binding2 != null && (linearLayout2 = binding2.bugsFixesWrapper) != null) {
            linearLayout2.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.fragments.support.i
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    SupportMainFragment.onViewCreated$lambda$1(view2);
                }
            });
        }
        FragmentSupportMainBinding binding3 = getBinding();
        if (binding3 != null && (linearLayout = binding3.suggestionsFeedbackWrapper) != null) {
            linearLayout.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.fragments.support.j
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    SupportMainFragment.onViewCreated$lambda$2(SupportMainFragment.this, view2);
                }
            });
        }
        FragmentSupportMainBinding binding4 = getBinding();
        if (binding4 != null && (button = binding4.resetTutorialButton) != null) {
            button.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.fragments.support.k
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    SupportMainFragment.onViewCreated$lambda$3(SupportMainFragment.this, view2);
                }
            });
        }
    }

    public final void setAppConfigManager(AppConfigManager appConfigManager) {
        q.i(appConfigManager, "<set-?>");
        this.appConfigManager = appConfigManager;
    }

    public final void setFaqRepository(FAQRepository fAQRepository) {
        q.i(fAQRepository, "<set-?>");
        this.faqRepository = fAQRepository;
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseFragment
    public FragmentSupportMainBinding createBinding(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        q.i(layoutInflater, "inflater");
        FragmentSupportMainBinding inflate = FragmentSupportMainBinding.inflate(layoutInflater, viewGroup, false);
        q.h(inflate, "inflate(...)");
        return inflate;
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseFragment
    public FragmentSupportMainBinding getBinding() {
        return this.binding;
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseFragment
    public void setBinding(FragmentSupportMainBinding fragmentSupportMainBinding) {
        this.binding = fragmentSupportMainBinding;
    }
}
