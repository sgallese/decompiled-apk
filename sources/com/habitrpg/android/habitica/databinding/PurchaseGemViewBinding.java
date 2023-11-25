package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.ui.views.DayNightTextView;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class PurchaseGemViewBinding implements a {
    public final TextView footerTextView;
    public final DayNightTextView gemAmount;
    public final ImageView gemImage;
    public final DayNightTextView gemLabel;
    public final TextView purchaseButton;
    private final LinearLayout rootView;

    private PurchaseGemViewBinding(LinearLayout linearLayout, TextView textView, DayNightTextView dayNightTextView, ImageView imageView, DayNightTextView dayNightTextView2, TextView textView2) {
        this.rootView = linearLayout;
        this.footerTextView = textView;
        this.gemAmount = dayNightTextView;
        this.gemImage = imageView;
        this.gemLabel = dayNightTextView2;
        this.purchaseButton = textView2;
    }

    public static PurchaseGemViewBinding bind(View view) {
        int i10 = R.id.footer_text_view;
        TextView textView = (TextView) b.a(view, R.id.footer_text_view);
        if (textView != null) {
            i10 = R.id.gem_amount;
            DayNightTextView dayNightTextView = (DayNightTextView) b.a(view, R.id.gem_amount);
            if (dayNightTextView != null) {
                i10 = R.id.gem_image;
                ImageView imageView = (ImageView) b.a(view, R.id.gem_image);
                if (imageView != null) {
                    i10 = R.id.gem_label;
                    DayNightTextView dayNightTextView2 = (DayNightTextView) b.a(view, R.id.gem_label);
                    if (dayNightTextView2 != null) {
                        i10 = R.id.purchase_button;
                        TextView textView2 = (TextView) b.a(view, R.id.purchase_button);
                        if (textView2 != null) {
                            return new PurchaseGemViewBinding((LinearLayout) view, textView, dayNightTextView, imageView, dayNightTextView2, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static PurchaseGemViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static PurchaseGemViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.purchase_gem_view, viewGroup, false);
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
