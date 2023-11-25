package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.habitrpg.android.habitica.R;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class PurchaseSubscriptionViewBinding implements a {
    public final TextView descriptionTextView;
    public final ImageView flagFlap;
    public final TextView flagTextview;
    public final TextView gemCapTextView;
    public final TextView hourglassTextView;
    public final TextView priceLabel;
    private final LinearLayout rootView;
    public final FrameLayout subscriptionSelectedFrameView;
    public final View subscriptionSelectedView;
    public final LinearLayout wrapper;

    private PurchaseSubscriptionViewBinding(LinearLayout linearLayout, TextView textView, ImageView imageView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, FrameLayout frameLayout, View view, LinearLayout linearLayout2) {
        this.rootView = linearLayout;
        this.descriptionTextView = textView;
        this.flagFlap = imageView;
        this.flagTextview = textView2;
        this.gemCapTextView = textView3;
        this.hourglassTextView = textView4;
        this.priceLabel = textView5;
        this.subscriptionSelectedFrameView = frameLayout;
        this.subscriptionSelectedView = view;
        this.wrapper = linearLayout2;
    }

    public static PurchaseSubscriptionViewBinding bind(View view) {
        int i10 = R.id.descriptionTextView;
        TextView textView = (TextView) b.a(view, R.id.descriptionTextView);
        if (textView != null) {
            i10 = R.id.flag_flap;
            ImageView imageView = (ImageView) b.a(view, R.id.flag_flap);
            if (imageView != null) {
                i10 = R.id.flag_textview;
                TextView textView2 = (TextView) b.a(view, R.id.flag_textview);
                if (textView2 != null) {
                    i10 = R.id.gemCapTextView;
                    TextView textView3 = (TextView) b.a(view, R.id.gemCapTextView);
                    if (textView3 != null) {
                        i10 = R.id.hourglassTextView;
                        TextView textView4 = (TextView) b.a(view, R.id.hourglassTextView);
                        if (textView4 != null) {
                            i10 = R.id.priceLabel;
                            TextView textView5 = (TextView) b.a(view, R.id.priceLabel);
                            if (textView5 != null) {
                                i10 = R.id.subscriptionSelectedFrameView;
                                FrameLayout frameLayout = (FrameLayout) b.a(view, R.id.subscriptionSelectedFrameView);
                                if (frameLayout != null) {
                                    i10 = R.id.subscriptionSelectedView;
                                    View a10 = b.a(view, R.id.subscriptionSelectedView);
                                    if (a10 != null) {
                                        LinearLayout linearLayout = (LinearLayout) view;
                                        return new PurchaseSubscriptionViewBinding(linearLayout, textView, imageView, textView2, textView3, textView4, textView5, frameLayout, a10, linearLayout);
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

    public static PurchaseSubscriptionViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static PurchaseSubscriptionViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.purchase_subscription_view, viewGroup, false);
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
