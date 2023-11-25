package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.habitrpg.android.habitica.R;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class DialogInsufficientGemsBinding implements a {
    public final ImageView imageView;
    public final ProgressBar loadingIndicator;
    public final Button purchaseButton;
    public final TextView purchaseTextview;
    public final LinearLayout purchaseWrapper;
    private final LinearLayout rootView;
    public final TextView textView;

    private DialogInsufficientGemsBinding(LinearLayout linearLayout, ImageView imageView, ProgressBar progressBar, Button button, TextView textView, LinearLayout linearLayout2, TextView textView2) {
        this.rootView = linearLayout;
        this.imageView = imageView;
        this.loadingIndicator = progressBar;
        this.purchaseButton = button;
        this.purchaseTextview = textView;
        this.purchaseWrapper = linearLayout2;
        this.textView = textView2;
    }

    public static DialogInsufficientGemsBinding bind(View view) {
        int i10 = R.id.imageView;
        ImageView imageView = (ImageView) b.a(view, R.id.imageView);
        if (imageView != null) {
            i10 = R.id.loading_indicator;
            ProgressBar progressBar = (ProgressBar) b.a(view, R.id.loading_indicator);
            if (progressBar != null) {
                i10 = R.id.purchase_button;
                Button button = (Button) b.a(view, R.id.purchase_button);
                if (button != null) {
                    i10 = R.id.purchase_textview;
                    TextView textView = (TextView) b.a(view, R.id.purchase_textview);
                    if (textView != null) {
                        i10 = R.id.purchase_wrapper;
                        LinearLayout linearLayout = (LinearLayout) b.a(view, R.id.purchase_wrapper);
                        if (linearLayout != null) {
                            i10 = R.id.textView;
                            TextView textView2 = (TextView) b.a(view, R.id.textView);
                            if (textView2 != null) {
                                return new DialogInsufficientGemsBinding((LinearLayout) view, imageView, progressBar, button, textView, linearLayout, textView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static DialogInsufficientGemsBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static DialogInsufficientGemsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.dialog_insufficient_gems, viewGroup, false);
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
