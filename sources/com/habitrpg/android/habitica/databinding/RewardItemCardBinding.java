package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.habitrpg.android.habitica.R;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class RewardItemCardBinding implements a {
    public final LinearLayout buyButton;
    public final ImageButton errorIcon;
    public final ImageView goldIcon;
    public final LinearLayout mainTaskWrapper;
    public final TextView priceLabel;
    private final FrameLayout rootView;
    public final ProgressBar syncingView;

    private RewardItemCardBinding(FrameLayout frameLayout, LinearLayout linearLayout, ImageButton imageButton, ImageView imageView, LinearLayout linearLayout2, TextView textView, ProgressBar progressBar) {
        this.rootView = frameLayout;
        this.buyButton = linearLayout;
        this.errorIcon = imageButton;
        this.goldIcon = imageView;
        this.mainTaskWrapper = linearLayout2;
        this.priceLabel = textView;
        this.syncingView = progressBar;
    }

    public static RewardItemCardBinding bind(View view) {
        int i10 = R.id.buyButton;
        LinearLayout linearLayout = (LinearLayout) b.a(view, R.id.buyButton);
        if (linearLayout != null) {
            i10 = R.id.error_icon;
            ImageButton imageButton = (ImageButton) b.a(view, R.id.error_icon);
            if (imageButton != null) {
                i10 = R.id.gold_icon;
                ImageView imageView = (ImageView) b.a(view, R.id.gold_icon);
                if (imageView != null) {
                    i10 = R.id.main_task_wrapper;
                    LinearLayout linearLayout2 = (LinearLayout) b.a(view, R.id.main_task_wrapper);
                    if (linearLayout2 != null) {
                        i10 = R.id.priceLabel;
                        TextView textView = (TextView) b.a(view, R.id.priceLabel);
                        if (textView != null) {
                            i10 = R.id.syncing_view;
                            ProgressBar progressBar = (ProgressBar) b.a(view, R.id.syncing_view);
                            if (progressBar != null) {
                                return new RewardItemCardBinding((FrameLayout) view, linearLayout, imageButton, imageView, linearLayout2, textView, progressBar);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static RewardItemCardBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static RewardItemCardBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.reward_item_card, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // e4.a
    public FrameLayout getRoot() {
        return this.rootView;
    }
}
