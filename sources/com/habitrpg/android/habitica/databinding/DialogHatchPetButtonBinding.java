package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.ui.views.CurrencyView;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class DialogHatchPetButtonBinding implements a {
    public final CurrencyView currencyView;
    private final LinearLayout rootView;

    private DialogHatchPetButtonBinding(LinearLayout linearLayout, CurrencyView currencyView) {
        this.rootView = linearLayout;
        this.currencyView = currencyView;
    }

    public static DialogHatchPetButtonBinding bind(View view) {
        CurrencyView currencyView = (CurrencyView) b.a(view, R.id.currencyView);
        if (currencyView != null) {
            return new DialogHatchPetButtonBinding((LinearLayout) view, currencyView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.currencyView)));
    }

    public static DialogHatchPetButtonBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static DialogHatchPetButtonBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.dialog_hatch_pet_button, viewGroup, false);
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
