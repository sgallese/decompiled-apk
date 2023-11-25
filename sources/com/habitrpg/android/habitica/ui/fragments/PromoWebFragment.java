package com.habitrpg.android.habitica.ui.fragments;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.habitrpg.android.habitica.databinding.FragmentNewsBinding;
import com.habitrpg.android.habitica.ui.viewmodels.MainUserViewModel;

/* compiled from: PromoWebFragment.kt */
/* loaded from: classes4.dex */
public final class PromoWebFragment extends Hilt_PromoWebFragment<FragmentNewsBinding> {
    public static final int $stable = 8;
    private FragmentNewsBinding binding;
    public MainUserViewModel userViewModel;

    public final MainUserViewModel getUserViewModel() {
        MainUserViewModel mainUserViewModel = this.userViewModel;
        if (mainUserViewModel != null) {
            return mainUserViewModel;
        }
        qc.q.z("userViewModel");
        return null;
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseMainFragment, com.habitrpg.android.habitica.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        qc.q.i(layoutInflater, "inflater");
        setHidesToolbar(true);
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // androidx.fragment.app.Fragment
    @SuppressLint({"SetJavaScriptEnabled"})
    public void onViewCreated(View view, Bundle bundle) {
        WebSettings webSettings;
        String B;
        WebView webView;
        WebView webView2;
        qc.q.i(view, "view");
        super.onViewCreated(view, bundle);
        FragmentNewsBinding binding = getBinding();
        WebView webView3 = null;
        if (binding != null && (webView2 = binding.newsWebview) != null) {
            webSettings = webView2.getSettings();
        } else {
            webSettings = null;
        }
        if (webSettings != null) {
            webSettings.setJavaScriptEnabled(true);
        }
        if (webSettings != null) {
            webSettings.setDomStorageEnabled(true);
        }
        FragmentNewsBinding binding2 = getBinding();
        if (binding2 != null) {
            webView3 = binding2.newsWebview;
        }
        if (webView3 != null) {
            webView3.setWebChromeClient(new WebChromeClient() { // from class: com.habitrpg.android.habitica.ui.fragments.PromoWebFragment$onViewCreated$1
            });
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            PromoWebFragmentArgs fromBundle = PromoWebFragmentArgs.fromBundle(arguments);
            qc.q.h(fromBundle, "fromBundle(...)");
            String url = fromBundle.getUrl();
            qc.q.h(url, "getUrl(...)");
            B = yc.v.B(url, "USER_ID", getUserViewModel().getUserID(), false, 4, null);
            FragmentNewsBinding binding3 = getBinding();
            if (binding3 != null && (webView = binding3.newsWebview) != null) {
                webView.loadUrl(B);
            }
        }
    }

    public final void setUserViewModel(MainUserViewModel mainUserViewModel) {
        qc.q.i(mainUserViewModel, "<set-?>");
        this.userViewModel = mainUserViewModel;
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseFragment
    public FragmentNewsBinding createBinding(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        qc.q.i(layoutInflater, "inflater");
        FragmentNewsBinding inflate = FragmentNewsBinding.inflate(layoutInflater, viewGroup, false);
        qc.q.h(inflate, "inflate(...)");
        return inflate;
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseFragment
    public FragmentNewsBinding getBinding() {
        return this.binding;
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseFragment
    public void setBinding(FragmentNewsBinding fragmentNewsBinding) {
        this.binding = fragmentNewsBinding;
    }
}
