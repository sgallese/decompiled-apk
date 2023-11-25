package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.ui.views.CurrencyView;
import com.habitrpg.common.habitica.views.PixelArtView;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class CustomizationGridItemBinding implements a {
    public final FrameLayout buyButton;
    public final PixelArtView imageView;
    public final CurrencyView priceLabel;
    private final LinearLayout rootView;
    public final LinearLayout wrapper;

    private CustomizationGridItemBinding(LinearLayout linearLayout, FrameLayout frameLayout, PixelArtView pixelArtView, CurrencyView currencyView, LinearLayout linearLayout2) {
        this.rootView = linearLayout;
        this.buyButton = frameLayout;
        this.imageView = pixelArtView;
        this.priceLabel = currencyView;
        this.wrapper = linearLayout2;
    }

    public static CustomizationGridItemBinding bind(View view) {
        int i10 = R.id.buy_button;
        FrameLayout frameLayout = (FrameLayout) b.a(view, R.id.buy_button);
        if (frameLayout != null) {
            i10 = R.id.imageView;
            PixelArtView pixelArtView = (PixelArtView) b.a(view, R.id.imageView);
            if (pixelArtView != null) {
                i10 = R.id.price_label;
                CurrencyView currencyView = (CurrencyView) b.a(view, R.id.price_label);
                if (currencyView != null) {
                    LinearLayout linearLayout = (LinearLayout) view;
                    return new CustomizationGridItemBinding(linearLayout, frameLayout, pixelArtView, currencyView, linearLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static CustomizationGridItemBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static CustomizationGridItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.customization_grid_item, viewGroup, false);
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
