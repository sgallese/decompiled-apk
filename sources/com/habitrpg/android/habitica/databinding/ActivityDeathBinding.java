package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.ui.views.ads.AdButton;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class ActivityDeathBinding implements a {
    public final AdButton adButton;
    public final FrameLayout confettiContainer;
    public final ImageView ghostView;
    public final ImageView heartView;
    public final TextView lossDescription;
    public final Button restartButton;
    public final TextView reviveSubscriberButton;
    public final LinearLayout reviveSubscriberWrapper;
    private final FrameLayout rootView;
    public final FrameLayout snackbarContainer;
    public final Button subscribeModalButton;
    public final TextView subscriberBenefitUsedView;
    public final LinearLayout unsubbedWrapper;

    private ActivityDeathBinding(FrameLayout frameLayout, AdButton adButton, FrameLayout frameLayout2, ImageView imageView, ImageView imageView2, TextView textView, Button button, TextView textView2, LinearLayout linearLayout, FrameLayout frameLayout3, Button button2, TextView textView3, LinearLayout linearLayout2) {
        this.rootView = frameLayout;
        this.adButton = adButton;
        this.confettiContainer = frameLayout2;
        this.ghostView = imageView;
        this.heartView = imageView2;
        this.lossDescription = textView;
        this.restartButton = button;
        this.reviveSubscriberButton = textView2;
        this.reviveSubscriberWrapper = linearLayout;
        this.snackbarContainer = frameLayout3;
        this.subscribeModalButton = button2;
        this.subscriberBenefitUsedView = textView3;
        this.unsubbedWrapper = linearLayout2;
    }

    public static ActivityDeathBinding bind(View view) {
        int i10 = R.id.ad_button;
        AdButton adButton = (AdButton) b.a(view, R.id.ad_button);
        if (adButton != null) {
            i10 = R.id.confetti_container;
            FrameLayout frameLayout = (FrameLayout) b.a(view, R.id.confetti_container);
            if (frameLayout != null) {
                i10 = R.id.ghost_view;
                ImageView imageView = (ImageView) b.a(view, R.id.ghost_view);
                if (imageView != null) {
                    i10 = R.id.heart_view;
                    ImageView imageView2 = (ImageView) b.a(view, R.id.heart_view);
                    if (imageView2 != null) {
                        i10 = R.id.loss_description;
                        TextView textView = (TextView) b.a(view, R.id.loss_description);
                        if (textView != null) {
                            i10 = R.id.restart_button;
                            Button button = (Button) b.a(view, R.id.restart_button);
                            if (button != null) {
                                i10 = R.id.revive_subscriber_button;
                                TextView textView2 = (TextView) b.a(view, R.id.revive_subscriber_button);
                                if (textView2 != null) {
                                    i10 = R.id.revive_subscriber_wrapper;
                                    LinearLayout linearLayout = (LinearLayout) b.a(view, R.id.revive_subscriber_wrapper);
                                    if (linearLayout != null) {
                                        i10 = R.id.snackbar_container;
                                        FrameLayout frameLayout2 = (FrameLayout) b.a(view, R.id.snackbar_container);
                                        if (frameLayout2 != null) {
                                            i10 = R.id.subscribe_modal_button;
                                            Button button2 = (Button) b.a(view, R.id.subscribe_modal_button);
                                            if (button2 != null) {
                                                i10 = R.id.subscriber_benefit_used_view;
                                                TextView textView3 = (TextView) b.a(view, R.id.subscriber_benefit_used_view);
                                                if (textView3 != null) {
                                                    i10 = R.id.unsubbed_wrapper;
                                                    LinearLayout linearLayout2 = (LinearLayout) b.a(view, R.id.unsubbed_wrapper);
                                                    if (linearLayout2 != null) {
                                                        return new ActivityDeathBinding((FrameLayout) view, adButton, frameLayout, imageView, imageView2, textView, button, textView2, linearLayout, frameLayout2, button2, textView3, linearLayout2);
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

    public static ActivityDeathBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityDeathBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.activity_death, viewGroup, false);
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
