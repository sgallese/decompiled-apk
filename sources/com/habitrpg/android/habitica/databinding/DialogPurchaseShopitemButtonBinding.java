package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.ui.views.CurrencyView;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class DialogPurchaseShopitemButtonBinding implements a {
    public final LinearLayout buyButton;
    public final TextView buyLabel;
    public final CurrencyView priceLabel;
    private final LinearLayout rootView;

    private DialogPurchaseShopitemButtonBinding(LinearLayout linearLayout, LinearLayout linearLayout2, TextView textView, CurrencyView currencyView) {
        this.rootView = linearLayout;
        this.buyButton = linearLayout2;
        this.buyLabel = textView;
        this.priceLabel = currencyView;
    }

    public static DialogPurchaseShopitemButtonBinding bind(View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i10 = R.id.buy_label;
        TextView textView = (TextView) b.a(view, R.id.buy_label);
        if (textView != null) {
            i10 = R.id.priceLabel;
            CurrencyView currencyView = (CurrencyView) b.a(view, R.id.priceLabel);
            if (currencyView != null) {
                return new DialogPurchaseShopitemButtonBinding(linearLayout, linearLayout, textView, currencyView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static DialogPurchaseShopitemButtonBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static DialogPurchaseShopitemButtonBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.dialog_purchase_shopitem_button, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // e4.a
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
