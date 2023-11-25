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
public final class MenuBottomSheetItemBinding implements a {
    public final CurrencyView currencyView;
    private final LinearLayout rootView;
    public final TextView textView;

    private MenuBottomSheetItemBinding(LinearLayout linearLayout, CurrencyView currencyView, TextView textView) {
        this.rootView = linearLayout;
        this.currencyView = currencyView;
        this.textView = textView;
    }

    public static MenuBottomSheetItemBinding bind(View view) {
        int i10 = R.id.currency_view;
        CurrencyView currencyView = (CurrencyView) b.a(view, R.id.currency_view);
        if (currencyView != null) {
            i10 = R.id.textView;
            TextView textView = (TextView) b.a(view, R.id.textView);
            if (textView != null) {
                return new MenuBottomSheetItemBinding((LinearLayout) view, currencyView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static MenuBottomSheetItemBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static MenuBottomSheetItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.menu_bottom_sheet_item, viewGroup, false);
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
