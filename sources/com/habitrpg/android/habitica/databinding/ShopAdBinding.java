package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.habitrpg.android.habitica.R;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class ShopAdBinding implements a {
    public final TextView descriptionView;
    public final ImageView imageView;
    private final LinearLayout rootView;
    public final TextView titleView;

    private ShopAdBinding(LinearLayout linearLayout, TextView textView, ImageView imageView, TextView textView2) {
        this.rootView = linearLayout;
        this.descriptionView = textView;
        this.imageView = imageView;
        this.titleView = textView2;
    }

    public static ShopAdBinding bind(View view) {
        int i10 = R.id.description_view;
        TextView textView = (TextView) b.a(view, R.id.description_view);
        if (textView != null) {
            i10 = R.id.image_view;
            ImageView imageView = (ImageView) b.a(view, R.id.image_view);
            if (imageView != null) {
                i10 = R.id.title_view;
                TextView textView2 = (TextView) b.a(view, R.id.title_view);
                if (textView2 != null) {
                    return new ShopAdBinding((LinearLayout) view, textView, imageView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static ShopAdBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ShopAdBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.shop_ad, viewGroup, false);
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
