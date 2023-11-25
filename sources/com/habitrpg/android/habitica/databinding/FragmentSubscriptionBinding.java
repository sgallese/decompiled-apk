package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.core.widget.NestedScrollView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.ui.views.DayNightTextView;
import com.habitrpg.android.habitica.ui.views.subscriptions.SubscriberBenefitView;
import com.habitrpg.android.habitica.ui.views.subscriptions.SubscriptionDetailsView;
import com.habitrpg.android.habitica.ui.views.subscriptions.SubscriptionOptionView;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class FragmentSubscriptionBinding implements a {
    public final Button giftSubscriptionButton;
    public final ImageView headerImageView;
    public final ProgressBar loadingIndicator;
    public final RelativeLayout promoBanner;
    public final TextView promoBannerDurationView;
    public final ImageView promoBannerLeftImage;
    public final ImageView promoBannerRightImage;
    public final ImageView promoBannerTitleImage;
    public final TextView promoBannerTitleText;
    public final ComposeView promoComposeView;
    public final SwipeRefreshLayout refreshLayout;
    private final SwipeRefreshLayout rootView;
    public final NestedScrollView scrollView;
    public final DayNightTextView subscribeBenefitsTitle;
    public final Button subscribeButton;
    public final SubscriberBenefitView subscriberBenefits;
    public final SubscriptionOptionView subscription12month;
    public final SubscriptionOptionView subscription1month;
    public final SubscriptionOptionView subscription3month;
    public final SubscriptionOptionView subscription6month;
    public final SubscriptionDetailsView subscriptionDetails;
    public final LinearLayout subscriptionOptions;
    public final TextView supportTextView;

    private FragmentSubscriptionBinding(SwipeRefreshLayout swipeRefreshLayout, Button button, ImageView imageView, ProgressBar progressBar, RelativeLayout relativeLayout, TextView textView, ImageView imageView2, ImageView imageView3, ImageView imageView4, TextView textView2, ComposeView composeView, SwipeRefreshLayout swipeRefreshLayout2, NestedScrollView nestedScrollView, DayNightTextView dayNightTextView, Button button2, SubscriberBenefitView subscriberBenefitView, SubscriptionOptionView subscriptionOptionView, SubscriptionOptionView subscriptionOptionView2, SubscriptionOptionView subscriptionOptionView3, SubscriptionOptionView subscriptionOptionView4, SubscriptionDetailsView subscriptionDetailsView, LinearLayout linearLayout, TextView textView3) {
        this.rootView = swipeRefreshLayout;
        this.giftSubscriptionButton = button;
        this.headerImageView = imageView;
        this.loadingIndicator = progressBar;
        this.promoBanner = relativeLayout;
        this.promoBannerDurationView = textView;
        this.promoBannerLeftImage = imageView2;
        this.promoBannerRightImage = imageView3;
        this.promoBannerTitleImage = imageView4;
        this.promoBannerTitleText = textView2;
        this.promoComposeView = composeView;
        this.refreshLayout = swipeRefreshLayout2;
        this.scrollView = nestedScrollView;
        this.subscribeBenefitsTitle = dayNightTextView;
        this.subscribeButton = button2;
        this.subscriberBenefits = subscriberBenefitView;
        this.subscription12month = subscriptionOptionView;
        this.subscription1month = subscriptionOptionView2;
        this.subscription3month = subscriptionOptionView3;
        this.subscription6month = subscriptionOptionView4;
        this.subscriptionDetails = subscriptionDetailsView;
        this.subscriptionOptions = linearLayout;
        this.supportTextView = textView3;
    }

    public static FragmentSubscriptionBinding bind(View view) {
        int i10 = R.id.gift_subscription_button;
        Button button = (Button) b.a(view, R.id.gift_subscription_button);
        if (button != null) {
            i10 = R.id.header_image_view;
            ImageView imageView = (ImageView) b.a(view, R.id.header_image_view);
            if (imageView != null) {
                i10 = R.id.loadingIndicator;
                ProgressBar progressBar = (ProgressBar) b.a(view, R.id.loadingIndicator);
                if (progressBar != null) {
                    i10 = R.id.promo_banner;
                    RelativeLayout relativeLayout = (RelativeLayout) b.a(view, R.id.promo_banner);
                    if (relativeLayout != null) {
                        i10 = R.id.promo_banner_duration_view;
                        TextView textView = (TextView) b.a(view, R.id.promo_banner_duration_view);
                        if (textView != null) {
                            i10 = R.id.promo_banner_left_image;
                            ImageView imageView2 = (ImageView) b.a(view, R.id.promo_banner_left_image);
                            if (imageView2 != null) {
                                i10 = R.id.promo_banner_right_image;
                                ImageView imageView3 = (ImageView) b.a(view, R.id.promo_banner_right_image);
                                if (imageView3 != null) {
                                    i10 = R.id.promo_banner_title_image;
                                    ImageView imageView4 = (ImageView) b.a(view, R.id.promo_banner_title_image);
                                    if (imageView4 != null) {
                                        i10 = R.id.promo_banner_title_text;
                                        TextView textView2 = (TextView) b.a(view, R.id.promo_banner_title_text);
                                        if (textView2 != null) {
                                            i10 = R.id.promo_compose_view;
                                            ComposeView composeView = (ComposeView) b.a(view, R.id.promo_compose_view);
                                            if (composeView != null) {
                                                SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) view;
                                                i10 = R.id.scroll_view;
                                                NestedScrollView nestedScrollView = (NestedScrollView) b.a(view, R.id.scroll_view);
                                                if (nestedScrollView != null) {
                                                    i10 = R.id.subscribeBenefitsTitle;
                                                    DayNightTextView dayNightTextView = (DayNightTextView) b.a(view, R.id.subscribeBenefitsTitle);
                                                    if (dayNightTextView != null) {
                                                        i10 = R.id.subscribeButton;
                                                        Button button2 = (Button) b.a(view, R.id.subscribeButton);
                                                        if (button2 != null) {
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
                                                                            i10 = R.id.subscription6month;
                                                                            SubscriptionOptionView subscriptionOptionView4 = (SubscriptionOptionView) b.a(view, R.id.subscription6month);
                                                                            if (subscriptionOptionView4 != null) {
                                                                                i10 = R.id.subscriptionDetails;
                                                                                SubscriptionDetailsView subscriptionDetailsView = (SubscriptionDetailsView) b.a(view, R.id.subscriptionDetails);
                                                                                if (subscriptionDetailsView != null) {
                                                                                    i10 = R.id.subscriptionOptions;
                                                                                    LinearLayout linearLayout = (LinearLayout) b.a(view, R.id.subscriptionOptions);
                                                                                    if (linearLayout != null) {
                                                                                        i10 = R.id.supportTextView;
                                                                                        TextView textView3 = (TextView) b.a(view, R.id.supportTextView);
                                                                                        if (textView3 != null) {
                                                                                            return new FragmentSubscriptionBinding(swipeRefreshLayout, button, imageView, progressBar, relativeLayout, textView, imageView2, imageView3, imageView4, textView2, composeView, swipeRefreshLayout, nestedScrollView, dayNightTextView, button2, subscriberBenefitView, subscriptionOptionView, subscriptionOptionView2, subscriptionOptionView3, subscriptionOptionView4, subscriptionDetailsView, linearLayout, textView3);
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

    public static FragmentSubscriptionBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentSubscriptionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.fragment_subscription, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // e4.a
    public SwipeRefreshLayout getRoot() {
        return this.rootView;
    }
}
