package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.habitrpg.android.habitica.R;
import e4.a;

/* loaded from: classes4.dex */
public final class FragmentNewsBinding implements a {
    public final WebView newsWebview;
    private final WebView rootView;

    private FragmentNewsBinding(WebView webView, WebView webView2) {
        this.rootView = webView;
        this.newsWebview = webView2;
    }

    public static FragmentNewsBinding bind(View view) {
        if (view != null) {
            WebView webView = (WebView) view;
            return new FragmentNewsBinding(webView, webView);
        }
        throw new NullPointerException("rootView");
    }

    public static FragmentNewsBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentNewsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.fragment_news, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // e4.a
    public WebView getRoot() {
        return this.rootView;
    }
}
