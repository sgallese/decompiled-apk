package com.habitrpg.android.habitica.ui.fragments;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.databinding.FragmentNewsBinding;
import com.habitrpg.common.habitica.helpers.ExceptionHandler;
import com.habitrpg.common.habitica.helpers.MainNavigationController;

/* compiled from: NewsFragment.kt */
/* loaded from: classes4.dex */
public final class NewsFragment extends Hilt_NewsFragment<FragmentNewsBinding> {
    public static final int $stable = 8;
    private FragmentNewsBinding binding;
    private final NewsFragment$webviewClient$1 webviewClient = new WebViewClient() { // from class: com.habitrpg.android.habitica.ui.fragments.NewsFragment$webviewClient$1
        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            String str;
            Uri url;
            Uri url2;
            if (webResourceRequest != null && (url2 = webResourceRequest.getUrl()) != null) {
                str = url2.getPath();
            } else {
                str = null;
            }
            if (qc.q.d(str, "/static/new-stuff")) {
                if (webView != null) {
                    webView.loadUrl(webResourceRequest.getUrl().toString());
                    return true;
                }
                return true;
            } else if (webResourceRequest != null && (url = webResourceRequest.getUrl()) != null) {
                MainNavigationController.INSTANCE.navigate(url);
                return true;
            } else {
                return true;
            }
        }
    };

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseMainFragment, com.habitrpg.android.habitica.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        qc.q.i(layoutInflater, "inflater");
        setHidesToolbar(true);
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseMainFragment, com.habitrpg.android.habitica.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        ad.i.d(androidx.lifecycle.w.a(this), ExceptionHandler.Companion.coroutine$default(ExceptionHandler.Companion, null, 1, null), null, new NewsFragment$onResume$1(this, null), 2, null);
    }

    @Override // androidx.fragment.app.Fragment
    @SuppressLint({"SetJavaScriptEnabled"})
    public void onViewCreated(View view, Bundle bundle) {
        String str;
        WebSettings webSettings;
        WebView webView;
        WebView webView2;
        WebView webView3;
        qc.q.i(view, "view");
        super.onViewCreated(view, bundle);
        Context context = getContext();
        WebView webView4 = null;
        if (context != null) {
            str = context.getString(R.string.base_url);
        } else {
            str = null;
        }
        FragmentNewsBinding binding = getBinding();
        if (binding != null && (webView3 = binding.newsWebview) != null) {
            webSettings = webView3.getSettings();
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
            webView = binding2.newsWebview;
        } else {
            webView = null;
        }
        if (webView != null) {
            webView.setWebViewClient(this.webviewClient);
        }
        FragmentNewsBinding binding3 = getBinding();
        if (binding3 != null) {
            webView4 = binding3.newsWebview;
        }
        if (webView4 != null) {
            webView4.setWebChromeClient(new WebChromeClient() { // from class: com.habitrpg.android.habitica.ui.fragments.NewsFragment$onViewCreated$1
            });
        }
        FragmentNewsBinding binding4 = getBinding();
        if (binding4 != null && (webView2 = binding4.newsWebview) != null) {
            webView2.loadUrl(str + "/static/new-stuff");
        }
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
