package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.ui.views.CurrencyView;
import com.habitrpg.common.habitica.views.PixelArtView;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class RowShopitemBinding implements a {
    public final LinearLayout buyButton;
    public final ImageView completedIndicator;
    public final LinearLayout container;
    public final PixelArtView imageView;
    public final TextView itemDetailIndicator;
    public final ImageView pinIndicator;
    public final CurrencyView priceLabel;
    private final RelativeLayout rootView;
    public final TextView unlockLabel;

    private RowShopitemBinding(RelativeLayout relativeLayout, LinearLayout linearLayout, ImageView imageView, LinearLayout linearLayout2, PixelArtView pixelArtView, TextView textView, ImageView imageView2, CurrencyView currencyView, TextView textView2) {
        this.rootView = relativeLayout;
        this.buyButton = linearLayout;
        this.completedIndicator = imageView;
        this.container = linearLayout2;
        this.imageView = pixelArtView;
        this.itemDetailIndicator = textView;
        this.pinIndicator = imageView2;
        this.priceLabel = currencyView;
        this.unlockLabel = textView2;
    }

    public static RowShopitemBinding bind(View view) {
        int i10 = R.id.buyButton;
        LinearLayout linearLayout = (LinearLayout) b.a(view, R.id.buyButton);
        if (linearLayout != null) {
            i10 = R.id.completed_indicator;
            ImageView imageView = (ImageView) b.a(view, R.id.completed_indicator);
            if (imageView != null) {
                i10 = R.id.container;
                LinearLayout linearLayout2 = (LinearLayout) b.a(view, R.id.container);
                if (linearLayout2 != null) {
                    i10 = R.id.imageView;
                    PixelArtView pixelArtView = (PixelArtView) b.a(view, R.id.imageView);
                    if (pixelArtView != null) {
                        i10 = R.id.item_detail_indicator;
                        TextView textView = (TextView) b.a(view, R.id.item_detail_indicator);
                        if (textView != null) {
                            i10 = R.id.pin_indicator;
                            ImageView imageView2 = (ImageView) b.a(view, R.id.pin_indicator);
                            if (imageView2 != null) {
                                i10 = R.id.priceLabel;
                                CurrencyView currencyView = (CurrencyView) b.a(view, R.id.priceLabel);
                                if (currencyView != null) {
                                    i10 = R.id.unlockLabel;
                                    TextView textView2 = (TextView) b.a(view, R.id.unlockLabel);
                                    if (textView2 != null) {
                                        return new RowShopitemBinding((RelativeLayout) view, linearLayout, imageView, linearLayout2, pixelArtView, textView, imageView2, currencyView, textView2);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static RowShopitemBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static RowShopitemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.row_shopitem, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // e4.a
    public RelativeLayout getRoot() {
        return this.rootView;
    }
}
