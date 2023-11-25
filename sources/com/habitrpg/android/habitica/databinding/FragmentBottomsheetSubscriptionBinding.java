package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.card.MaterialCardView;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.ui.views.DayNightTextView;
import com.habitrpg.android.habitica.ui.views.subscriptions.SubscriberBenefitView;
import com.habitrpg.android.habitica.ui.views.subscriptions.SubscriptionOptionView;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class FragmentBottomsheetSubscriptionBinding implements a {
    public final ImageView bannerLeftImage;
    public final ImageView bannerRightImage;
    public final ProgressBar loadingIndicator;
    private final MaterialCardView rootView;
    public final NestedScrollView scrollView;
    public final Button seeMoreOptions;
    public final DayNightTextView subscribeBenefits;
    public final Button subscribeButton;
    public final MaterialCardView subscriberBenefitBanner;
    public final SubscriberBenefitView subscriberBenefits;
    public final SubscriptionOptionView subscription12month;
    public final SubscriptionOptionView subscription1month;
    public final SubscriptionOptionView subscription3month;
    public final LinearLayout subscriptionOptions;

    private FragmentBottomsheetSubscriptionBinding(MaterialCardView materialCardView, ImageView imageView, ImageView imageView2, ProgressBar progressBar, NestedScrollView nestedScrollView, Button button, DayNightTextView dayNightTextView, Button button2, MaterialCardView materialCardView2, SubscriberBenefitView subscriberBenefitView, SubscriptionOptionView subscriptionOptionView, SubscriptionOptionView subscriptionOptionView2, SubscriptionOptionView subscriptionOptionView3, LinearLayout linearLayout) {
        this.rootView = materialCardView;
        this.bannerLeftImage = imageView;
        this.bannerRightImage = imageView2;
        this.loadingIndicator = progressBar;
        this.scrollView = nestedScrollView;
        this.seeMoreOptions = button;
        this.subscribeBenefits = dayNightTextView;
        this.subscribeButton = button2;
        this.subscriberBenefitBanner = materialCardView2;
        this.subscriberBenefits = subscriberBenefitView;
        this.subscription12month = subscriptionOptionView;
        this.subscription1month = subscriptionOptionView2;
        this.subscription3month = subscriptionOptionView3;
        this.subscriptionOptions = linearLayout;
    }

    public static FragmentBottomsheetSubscriptionBinding bind(View view) {
        int i10 = R.id.banner_left_image;
        ImageView imageView = (ImageView) b.a(view, R.id.banner_left_image);
        if (imageView != null) {
            i10 = R.id.banner_right_image;
            ImageView imageView2 = (ImageView) b.a(view, R.id.banner_right_image);
            if (imageView2 != null) {
                i10 = R.id.loadingIndicator;
                ProgressBar progressBar = (ProgressBar) b.a(view, R.id.loadingIndicator);
                if (progressBar != null) {
                    i10 = R.id.scroll_view;
                    NestedScrollView nestedScrollView = (NestedScrollView) b.a(view, R.id.scroll_view);
                    if (nestedScrollView != null) {
                        i10 = R.id.see_more_options;
                        Button button = (Button) b.a(view, R.id.see_more_options);
                        if (button != null) {
                            i10 = R.id.subscribe_benefits;
                            DayNightTextView dayNightTextView = (DayNightTextView) b.a(view, R.id.subscribe_benefits);
                            if (dayNightTextView != null) {
                                i10 = R.id.subscribeButton;
                                Button button2 = (Button) b.a(view, R.id.subscribeButton);
                                if (button2 != null) {
                                    i10 = R.id.subscriber_benefit_banner;
                                    MaterialCardView materialCardView = (MaterialCardView) b.a(view, R.id.subscriber_benefit_banner);
                                    if (materialCardView != null) {
                                        i10 = R.id.subscriber_benefits;
                                        SubscriberBenefitView subscriberBenefitView = (SubscriberBenefitView) b.a(view, R.id.subscriber_benefits);
                                        if (subscriberBenefitView != null) {
                                            i10 = R.id.subscription12month;
                                            SubscriptionOptionView subscriptionOptionView = (SubscriptionOptionView) b.a(view, R.id.subscription12month);
                                            if (subscriptionOptionView != null) {
                                                i10 = R.id.subscription1month;
                                                SubscriptionOptionView subscriptionOptionView2 = (SubscriptionOptionView) b.a(view, R.id.subscription1month);
                                                if (subscriptionOptionView2 != null) {
                                                    i10 = R.id.subscription3month;
                                                    SubscriptionOptionView subscriptionOptionView3 = (SubscriptionOptionView) b.a(view, R.id.subscription3month);
                                                    if (subscriptionOptionView3 != null) {
                                                        i10 = R.id.subscriptionOptions;
                                                        LinearLayout linearLayout = (LinearLayout) b.a(view, R.id.subscriptionOptions);
                                                        if (linearLayout != null) {
                                                            return new FragmentBottomsheetSubscriptionBinding((MaterialCardView) view, imageView, imageView2, progressBar, nestedScrollView, button, dayNightTextView, button2, materialCardView, subscriberBenefitView, subscriptionOptionView, subscriptionOptionView2, subscriptionOptionView3, linearLayout);
                                                        }
                                                    }
                                                }
                                            }
                                        }
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

    public static FragmentBottomsheetSubscriptionBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentBottomsheetSubscriptionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.fragment_bottomsheet_subscription, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // e4.a
    public MaterialCardView getRoot() {
        return this.rootView;
    }
}
