package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.ui.views.UsernameLabel;
import com.habitrpg.android.habitica.ui.views.subscriptions.SubscriptionOptionView;
import com.habitrpg.common.habitica.views.AvatarView;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class ActivityGiftSubscriptionBinding implements a {
    public final AvatarView avatarView;
    public final UsernameLabel displayNameTextView;
    public final LinearLayout giftSubscriptionContainer;
    private final LinearLayout rootView;
    public final SubscriptionOptionView subscription12MonthView;
    public final SubscriptionOptionView subscription1MonthView;
    public final SubscriptionOptionView subscription3MonthView;
    public final SubscriptionOptionView subscription6MonthView;
    public final Button subscriptionButton;
    public final LinearLayout subscriptionOptions;
    public final Toolbar toolbar;
    public final TextView usernameTextView;

    private ActivityGiftSubscriptionBinding(LinearLayout linearLayout, AvatarView avatarView, UsernameLabel usernameLabel, LinearLayout linearLayout2, SubscriptionOptionView subscriptionOptionView, SubscriptionOptionView subscriptionOptionView2, SubscriptionOptionView subscriptionOptionView3, SubscriptionOptionView subscriptionOptionView4, Button button, LinearLayout linearLayout3, Toolbar toolbar, TextView textView) {
        this.rootView = linearLayout;
        this.avatarView = avatarView;
        this.displayNameTextView = usernameLabel;
        this.giftSubscriptionContainer = linearLayout2;
        this.subscription12MonthView = subscriptionOptionView;
        this.subscription1MonthView = subscriptionOptionView2;
        this.subscription3MonthView = subscriptionOptionView3;
        this.subscription6MonthView = subscriptionOptionView4;
        this.subscriptionButton = button;
        this.subscriptionOptions = linearLayout3;
        this.toolbar = toolbar;
        this.usernameTextView = textView;
    }

    public static ActivityGiftSubscriptionBinding bind(View view) {
        int i10 = R.id.avatar_view;
        AvatarView avatarView = (AvatarView) b.a(view, R.id.avatar_view);
        if (avatarView != null) {
            i10 = R.id.display_name_text_view;
            UsernameLabel usernameLabel = (UsernameLabel) b.a(view, R.id.display_name_text_view);
            if (usernameLabel != null) {
                i10 = R.id.gift_subscription_container;
                LinearLayout linearLayout = (LinearLayout) b.a(view, R.id.gift_subscription_container);
                if (linearLayout != null) {
                    i10 = R.id.subscription12MonthView;
                    SubscriptionOptionView subscriptionOptionView = (SubscriptionOptionView) b.a(view, R.id.subscription12MonthView);
                    if (subscriptionOptionView != null) {
                        i10 = R.id.subscription1MonthView;
                        SubscriptionOptionView subscriptionOptionView2 = (SubscriptionOptionView) b.a(view, R.id.subscription1MonthView);
                        if (subscriptionOptionView2 != null) {
                            i10 = R.id.subscription3MonthView;
                            SubscriptionOptionView subscriptionOptionView3 = (SubscriptionOptionView) b.a(view, R.id.subscription3MonthView);
                            if (subscriptionOptionView3 != null) {
                                i10 = R.id.subscription6MonthView;
                                SubscriptionOptionView subscriptionOptionView4 = (SubscriptionOptionView) b.a(view, R.id.subscription6MonthView);
                                if (subscriptionOptionView4 != null) {
                                    i10 = R.id.subscription_button;
                                    Button button = (Button) b.a(view, R.id.subscription_button);
                                    if (button != null) {
                                        i10 = R.id.subscriptionOptions;
                                        LinearLayout linearLayout2 = (LinearLayout) b.a(view, R.id.subscriptionOptions);
                                        if (linearLayout2 != null) {
                                            i10 = R.id.toolbar;
                                            Toolbar toolbar = (Toolbar) b.a(view, R.id.toolbar);
                                            if (toolbar != null) {
                                                i10 = R.id.username_text_view;
                                                TextView textView = (TextView) b.a(view, R.id.username_text_view);
                                                if (textView != null) {
                                                    return new ActivityGiftSubscriptionBinding((LinearLayout) view, avatarView, usernameLabel, linearLayout, subscriptionOptionView, subscriptionOptionView2, subscriptionOptionView3, subscriptionOptionView4, button, linearLayout2, toolbar, textView);
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

    public static ActivityGiftSubscriptionBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityGiftSubscriptionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.activity_gift_subscription, viewGroup, false);
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
