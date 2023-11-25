package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.ui.views.CurrencyView;
import com.habitrpg.common.habitica.views.PixelArtView;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class ShopArmoireGearBinding implements a {
    public final CurrencyView currencyView;
    public final TextView descriptionView;
    public final FrameLayout footerLayout;
    public final PixelArtView iconView;
    private final LinearLayout rootView;
    public final TextView titleView;

    private ShopArmoireGearBinding(LinearLayout linearLayout, CurrencyView currencyView, TextView textView, FrameLayout frameLayout, PixelArtView pixelArtView, TextView textView2) {
        this.rootView = linearLayout;
        this.currencyView = currencyView;
        this.descriptionView = textView;
        this.footerLayout = frameLayout;
        this.iconView = pixelArtView;
        this.titleView = textView2;
    }

    public static ShopArmoireGearBinding bind(View view) {
        int i10 = R.id.currency_view;
        CurrencyView currencyView = (CurrencyView) b.a(view, R.id.currency_view);
        if (currencyView != null) {
            i10 = R.id.description_view;
            TextView textView = (TextView) b.a(view, R.id.description_view);
            if (textView != null) {
                i10 = R.id.footer_layout;
                FrameLayout frameLayout = (FrameLayout) b.a(view, R.id.footer_layout);
                if (frameLayout != null) {
                    i10 = R.id.icon_view;
                    PixelArtView pixelArtView = (PixelArtView) b.a(view, R.id.icon_view);
                    if (pixelArtView != null) {
                        i10 = R.id.title_view;
                        TextView textView2 = (TextView) b.a(view, R.id.title_view);
                        if (textView2 != null) {
                            return new ShopArmoireGearBinding((LinearLayout) view, currencyView, textView, frameLayout, pixelArtView, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static ShopArmoireGearBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ShopArmoireGearBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.shop_armoire_gear, viewGroup, false);
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
