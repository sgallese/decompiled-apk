package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.ui.views.CurrencyView;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class ShopSectionHeaderBinding implements a {
    public final LinearLayout changeClassButton;
    public final CurrencyView changeClassCurrencyView;
    public final TextView changeClassDescription;
    public final TextView changeClassLabel;
    public final Spinner classSelectionSpinner;
    public final TextView headerNotesView;
    public final TextView label;
    private final LinearLayout rootView;

    private ShopSectionHeaderBinding(LinearLayout linearLayout, LinearLayout linearLayout2, CurrencyView currencyView, TextView textView, TextView textView2, Spinner spinner, TextView textView3, TextView textView4) {
        this.rootView = linearLayout;
        this.changeClassButton = linearLayout2;
        this.changeClassCurrencyView = currencyView;
        this.changeClassDescription = textView;
        this.changeClassLabel = textView2;
        this.classSelectionSpinner = spinner;
        this.headerNotesView = textView3;
        this.label = textView4;
    }

    public static ShopSectionHeaderBinding bind(View view) {
        int i10 = R.id.change_class_button;
        LinearLayout linearLayout = (LinearLayout) b.a(view, R.id.change_class_button);
        if (linearLayout != null) {
            i10 = R.id.change_class_currency_view;
            CurrencyView currencyView = (CurrencyView) b.a(view, R.id.change_class_currency_view);
            if (currencyView != null) {
                i10 = R.id.change_class_description;
                TextView textView = (TextView) b.a(view, R.id.change_class_description);
                if (textView != null) {
                    i10 = R.id.change_class_label;
                    TextView textView2 = (TextView) b.a(view, R.id.change_class_label);
                    if (textView2 != null) {
                        i10 = R.id.classSelectionSpinner;
                        Spinner spinner = (Spinner) b.a(view, R.id.classSelectionSpinner);
                        if (spinner != null) {
                            i10 = R.id.headerNotesView;
                            TextView textView3 = (TextView) b.a(view, R.id.headerNotesView);
                            if (textView3 != null) {
                                i10 = R.id.label;
                                TextView textView4 = (TextView) b.a(view, R.id.label);
                                if (textView4 != null) {
                                    return new ShopSectionHeaderBinding((LinearLayout) view, linearLayout, currencyView, textView, textView2, spinner, textView3, textView4);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static ShopSectionHeaderBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ShopSectionHeaderBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.shop_section_header, viewGroup, false);
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
