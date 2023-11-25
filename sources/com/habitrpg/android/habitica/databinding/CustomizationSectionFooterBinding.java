package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.ui.views.CurrencyView;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class CustomizationSectionFooterBinding implements a {
    public final LinearLayout purchaseSetButton;
    private final FrameLayout rootView;
    public final CurrencyView setPriceLabel;

    private CustomizationSectionFooterBinding(FrameLayout frameLayout, LinearLayout linearLayout, CurrencyView currencyView) {
        this.rootView = frameLayout;
        this.purchaseSetButton = linearLayout;
        this.setPriceLabel = currencyView;
    }

    public static CustomizationSectionFooterBinding bind(View view) {
        int i10 = R.id.purchaseSetButton;
        LinearLayout linearLayout = (LinearLayout) b.a(view, R.id.purchaseSetButton);
        if (linearLayout != null) {
            i10 = R.id.set_price_label;
            CurrencyView currencyView = (CurrencyView) b.a(view, R.id.set_price_label);
            if (currencyView != null) {
                return new CustomizationSectionFooterBinding((FrameLayout) view, linearLayout, currencyView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static CustomizationSectionFooterBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static CustomizationSectionFooterBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.customization_section_footer, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // e4.a
    public FrameLayout getRoot() {
        return this.rootView;
    }
}
