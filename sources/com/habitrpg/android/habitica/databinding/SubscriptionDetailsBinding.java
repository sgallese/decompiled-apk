package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.material.card.MaterialCardView;
import com.habitrpg.android.habitica.R;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class SubscriptionDetailsBinding implements a {
    public final Button changeSubscriptionButton;
    public final TextView changeSubscriptionDescription;
    public final TextView changeSubscriptionTitle;
    public final LinearLayout changeSubscriptionWrapper;
    public final View divider;
    public final TextView gemCapTextView;
    public final ImageView heartIcon;
    public final LinearLayout monthsSubscribedLayout;
    public final TextView monthsSubscribedTextView;
    public final RelativeLayout nextHourglassContainer;
    public final TextView nextHourglassTextview;
    public final ImageView paymentProcessorImageView;
    public final LinearLayout paymentProcessorWrapper;
    private final LinearLayout rootView;
    public final MaterialCardView subscriptionCreditCard;
    public final TextView subscriptionCreditTextView;
    public final LinearLayout subscriptionDetails;
    public final TextView subscriptionDurationTextView;
    public final TextView subscriptionPaymentMethodTextview;
    public final TextView subscriptionStatusActive;
    public final TextView subscriptionStatusCancelled;
    public final TextView subscriptionStatusGroupPlan;
    public final TextView subscriptionStatusInactive;
    public final TextView subscriptionStatusNotRecurring;

    private SubscriptionDetailsBinding(LinearLayout linearLayout, Button button, TextView textView, TextView textView2, LinearLayout linearLayout2, View view, TextView textView3, ImageView imageView, LinearLayout linearLayout3, TextView textView4, RelativeLayout relativeLayout, TextView textView5, ImageView imageView2, LinearLayout linearLayout4, MaterialCardView materialCardView, TextView textView6, LinearLayout linearLayout5, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, TextView textView12, TextView textView13) {
        this.rootView = linearLayout;
        this.changeSubscriptionButton = button;
        this.changeSubscriptionDescription = textView;
        this.changeSubscriptionTitle = textView2;
        this.changeSubscriptionWrapper = linearLayout2;
        this.divider = view;
        this.gemCapTextView = textView3;
        this.heartIcon = imageView;
        this.monthsSubscribedLayout = linearLayout3;
        this.monthsSubscribedTextView = textView4;
        this.nextHourglassContainer = relativeLayout;
        this.nextHourglassTextview = textView5;
        this.paymentProcessorImageView = imageView2;
        this.paymentProcessorWrapper = linearLayout4;
        this.subscriptionCreditCard = materialCardView;
        this.subscriptionCreditTextView = textView6;
        this.subscriptionDetails = linearLayout5;
        this.subscriptionDurationTextView = textView7;
        this.subscriptionPaymentMethodTextview = textView8;
        this.subscriptionStatusActive = textView9;
        this.subscriptionStatusCancelled = textView10;
        this.subscriptionStatusGroupPlan = textView11;
        this.subscriptionStatusInactive = textView12;
        this.subscriptionStatusNotRecurring = textView13;
    }

    public static SubscriptionDetailsBinding bind(View view) {
        int i10 = R.id.change_subscription_button;
        Button button = (Button) b.a(view, R.id.change_subscription_button);
        if (button != null) {
            i10 = R.id.change_subscription_description;
            TextView textView = (TextView) b.a(view, R.id.change_subscription_description);
            if (textView != null) {
                i10 = R.id.change_subscription_title;
                TextView textView2 = (TextView) b.a(view, R.id.change_subscription_title);
                if (textView2 != null) {
                    i10 = R.id.change_subscription_wrapper;
                    LinearLayout linearLayout = (LinearLayout) b.a(view, R.id.change_subscription_wrapper);
                    if (linearLayout != null) {
                        i10 = R.id.divider;
                        View a10 = b.a(view, R.id.divider);
                        if (a10 != null) {
                            i10 = R.id.gemCapTextView;
                            TextView textView3 = (TextView) b.a(view, R.id.gemCapTextView);
                            if (textView3 != null) {
                                i10 = R.id.heart_icon;
                                ImageView imageView = (ImageView) b.a(view, R.id.heart_icon);
                                if (imageView != null) {
                                    i10 = R.id.months_subscribed_layout;
                                    LinearLayout linearLayout2 = (LinearLayout) b.a(view, R.id.months_subscribed_layout);
                                    if (linearLayout2 != null) {
                                        i10 = R.id.monthsSubscribedTextView;
                                        TextView textView4 = (TextView) b.a(view, R.id.monthsSubscribedTextView);
                                        if (textView4 != null) {
                                            i10 = R.id.next_hourglass_container;
                                            RelativeLayout relativeLayout = (RelativeLayout) b.a(view, R.id.next_hourglass_container);
                                            if (relativeLayout != null) {
                                                i10 = R.id.next_hourglass_textview;
                                                TextView textView5 = (TextView) b.a(view, R.id.next_hourglass_textview);
                                                if (textView5 != null) {
                                                    i10 = R.id.paymentProcessorImageView;
                                                    ImageView imageView2 = (ImageView) b.a(view, R.id.paymentProcessorImageView);
                                                    if (imageView2 != null) {
                                                        i10 = R.id.payment_processor_wrapper;
                                                        LinearLayout linearLayout3 = (LinearLayout) b.a(view, R.id.payment_processor_wrapper);
                                                        if (linearLayout3 != null) {
                                                            i10 = R.id.subscription_credit_card;
                                                            MaterialCardView materialCardView = (MaterialCardView) b.a(view, R.id.subscription_credit_card);
                                                            if (materialCardView != null) {
                                                                i10 = R.id.subscription_credit_text_view;
                                                                TextView textView6 = (TextView) b.a(view, R.id.subscription_credit_text_view);
                                                                if (textView6 != null) {
                                                                    LinearLayout linearLayout4 = (LinearLayout) view;
                                                                    i10 = R.id.subscriptionDurationTextView;
                                                                    TextView textView7 = (TextView) b.a(view, R.id.subscriptionDurationTextView);
                                                                    if (textView7 != null) {
                                                                        i10 = R.id.subscription_payment_method_textview;
                                                                        TextView textView8 = (TextView) b.a(view, R.id.subscription_payment_method_textview);
                                                                        if (textView8 != null) {
                                                                            i10 = R.id.subscriptionStatusActive;
                                                                            TextView textView9 = (TextView) b.a(view, R.id.subscriptionStatusActive);
                                                                            if (textView9 != null) {
                                                                                i10 = R.id.subscriptionStatusCancelled;
                                                                                TextView textView10 = (TextView) b.a(view, R.id.subscriptionStatusCancelled);
                                                                                if (textView10 != null) {
                                                                                    i10 = R.id.subscription_status_group_plan;
                                                                                    TextView textView11 = (TextView) b.a(view, R.id.subscription_status_group_plan);
                                                                                    if (textView11 != null) {
                                                                                        i10 = R.id.subscriptionStatusInactive;
                                                                                        TextView textView12 = (TextView) b.a(view, R.id.subscriptionStatusInactive);
                                                                                        if (textView12 != null) {
                                                                                            i10 = R.id.subscriptionStatusNotRecurring;
                                                                                            TextView textView13 = (TextView) b.a(view, R.id.subscriptionStatusNotRecurring);
                                                                                            if (textView13 != null) {
                                                                                                return new SubscriptionDetailsBinding(linearLayout4, button, textView, textView2, linearLayout, a10, textView3, imageView, linearLayout2, textView4, relativeLayout, textView5, imageView2, linearLayout3, materialCardView, textView6, linearLayout4, textView7, textView8, textView9, textView10, textView11, textView12, textView13);
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static SubscriptionDetailsBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static SubscriptionDetailsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.subscription_details, viewGroup, false);
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
