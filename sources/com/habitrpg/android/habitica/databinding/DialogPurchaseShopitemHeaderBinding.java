package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.ui.views.CurrencyViews;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class DialogPurchaseShopitemHeaderBinding implements a {
    public final CurrencyViews currencyView;
    public final TextView limitedTextView;
    public final LinearLayout pinButton;
    public final ImageView pinIcon;
    public final TextView pinText;
    private final LinearLayout rootView;

    private DialogPurchaseShopitemHeaderBinding(LinearLayout linearLayout, CurrencyViews currencyViews, TextView textView, LinearLayout linearLayout2, ImageView imageView, TextView textView2) {
        this.rootView = linearLayout;
        this.currencyView = currencyViews;
        this.limitedTextView = textView;
        this.pinButton = linearLayout2;
        this.pinIcon = imageView;
        this.pinText = textView2;
    }

    public static DialogPurchaseShopitemHeaderBinding bind(View view) {
        int i10 = R.id.currencyView;
        CurrencyViews currencyViews = (CurrencyViews) b.a(view, R.id.currencyView);
        if (currencyViews != null) {
            i10 = R.id.limitedTextView;
            TextView textView = (TextView) b.a(view, R.id.limitedTextView);
            if (textView != null) {
                i10 = R.id.pin_button;
                LinearLayout linearLayout = (LinearLayout) b.a(view, R.id.pin_button);
                if (linearLayout != null) {
                    i10 = R.id.pin_icon;
                    ImageView imageView = (ImageView) b.a(view, R.id.pin_icon);
                    if (imageView != null) {
                        i10 = R.id.pin_text;
                        TextView textView2 = (TextView) b.a(view, R.id.pin_text);
                        if (textView2 != null) {
                            return new DialogPurchaseShopitemHeaderBinding((LinearLayout) view, currencyViews, textView, linearLayout, imageView, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static DialogPurchaseShopitemHeaderBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static DialogPurchaseShopitemHeaderBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.dialog_purchase_shopitem_header, viewGroup, false);
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
