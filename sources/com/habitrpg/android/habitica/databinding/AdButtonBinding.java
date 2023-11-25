package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.ui.views.CurrencyView;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class AdButtonBinding implements a {
    public final CurrencyView currencyView;
    public final ProgressBar loadingIndicator;
    private final View rootView;
    public final TextView textView;

    private AdButtonBinding(View view, CurrencyView currencyView, ProgressBar progressBar, TextView textView) {
        this.rootView = view;
        this.currencyView = currencyView;
        this.loadingIndicator = progressBar;
        this.textView = textView;
    }

    public static AdButtonBinding bind(View view) {
        int i10 = R.id.currency_view;
        CurrencyView currencyView = (CurrencyView) b.a(view, R.id.currency_view);
        if (currencyView != null) {
            i10 = R.id.loading_indicator;
            ProgressBar progressBar = (ProgressBar) b.a(view, R.id.loading_indicator);
            if (progressBar != null) {
                i10 = R.id.text_view;
                TextView textView = (TextView) b.a(view, R.id.text_view);
                if (textView != null) {
                    return new AdButtonBinding(view, currencyView, progressBar, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static AdButtonBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.ad_button, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // e4.a
    public View getRoot() {
        return this.rootView;
    }
}
