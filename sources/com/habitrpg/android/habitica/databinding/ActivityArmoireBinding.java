package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.ui.views.CurrencyView;
import com.habitrpg.android.habitica.ui.views.SparkView;
import com.habitrpg.android.habitica.ui.views.ads.AdButton;
import com.habitrpg.common.habitica.views.PixelArtView;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class ActivityArmoireBinding implements a {
    public final AdButton adButton;
    public final Button closeButton;
    public final FrameLayout confettiAnchor;
    public final TextView dropRateButton;
    public final TextView dropRateButtonUnsubbed;
    public final Button equipButton;
    public final TextView equipmentCountView;
    public final CurrencyView goldView;
    public final PixelArtView iconView;
    public final RelativeLayout iconWrapper;
    public final SparkView leftSparkView;
    public final TextView noEquipmentView;
    public final TextView openArmoireSubscriberButton;
    public final LinearLayout openArmoireSubscriberWrapper;
    public final ComposeView progressView;
    public final SparkView rightSparkView;
    private final FrameLayout rootView;
    public final Button subscribeModalButton;
    public final TextView subtitleView;
    public final TextView titleView;
    public final LinearLayout unsubbedWrapper;

    private ActivityArmoireBinding(FrameLayout frameLayout, AdButton adButton, Button button, FrameLayout frameLayout2, TextView textView, TextView textView2, Button button2, TextView textView3, CurrencyView currencyView, PixelArtView pixelArtView, RelativeLayout relativeLayout, SparkView sparkView, TextView textView4, TextView textView5, LinearLayout linearLayout, ComposeView composeView, SparkView sparkView2, Button button3, TextView textView6, TextView textView7, LinearLayout linearLayout2) {
        this.rootView = frameLayout;
        this.adButton = adButton;
        this.closeButton = button;
        this.confettiAnchor = frameLayout2;
        this.dropRateButton = textView;
        this.dropRateButtonUnsubbed = textView2;
        this.equipButton = button2;
        this.equipmentCountView = textView3;
        this.goldView = currencyView;
        this.iconView = pixelArtView;
        this.iconWrapper = relativeLayout;
        this.leftSparkView = sparkView;
        this.noEquipmentView = textView4;
        this.openArmoireSubscriberButton = textView5;
        this.openArmoireSubscriberWrapper = linearLayout;
        this.progressView = composeView;
        this.rightSparkView = sparkView2;
        this.subscribeModalButton = button3;
        this.subtitleView = textView6;
        this.titleView = textView7;
        this.unsubbedWrapper = linearLayout2;
    }

    public static ActivityArmoireBinding bind(View view) {
        int i10 = R.id.ad_button;
        AdButton adButton = (AdButton) b.a(view, R.id.ad_button);
        if (adButton != null) {
            i10 = R.id.close_button;
            Button button = (Button) b.a(view, R.id.close_button);
            if (button != null) {
                i10 = R.id.confetti_anchor;
                FrameLayout frameLayout = (FrameLayout) b.a(view, R.id.confetti_anchor);
                if (frameLayout != null) {
                    i10 = R.id.drop_rate_button;
                    TextView textView = (TextView) b.a(view, R.id.drop_rate_button);
                    if (textView != null) {
                        i10 = R.id.drop_rate_button_unsubbed;
                        TextView textView2 = (TextView) b.a(view, R.id.drop_rate_button_unsubbed);
                        if (textView2 != null) {
                            i10 = R.id.equip_button;
                            Button button2 = (Button) b.a(view, R.id.equip_button);
                            if (button2 != null) {
                                i10 = R.id.equipment_count_view;
                                TextView textView3 = (TextView) b.a(view, R.id.equipment_count_view);
                                if (textView3 != null) {
                                    i10 = R.id.gold_view;
                                    CurrencyView currencyView = (CurrencyView) b.a(view, R.id.gold_view);
                                    if (currencyView != null) {
                                        i10 = R.id.icon_view;
                                        PixelArtView pixelArtView = (PixelArtView) b.a(view, R.id.icon_view);
                                        if (pixelArtView != null) {
                                            i10 = R.id.icon_wrapper;
                                            RelativeLayout relativeLayout = (RelativeLayout) b.a(view, R.id.icon_wrapper);
                                            if (relativeLayout != null) {
                                                i10 = R.id.left_spark_view;
                                                SparkView sparkView = (SparkView) b.a(view, R.id.left_spark_view);
                                                if (sparkView != null) {
                                                    i10 = R.id.no_equipment_view;
                                                    TextView textView4 = (TextView) b.a(view, R.id.no_equipment_view);
                                                    if (textView4 != null) {
                                                        i10 = R.id.open_armoire_subscriber_button;
                                                        TextView textView5 = (TextView) b.a(view, R.id.open_armoire_subscriber_button);
                                                        if (textView5 != null) {
                                                            i10 = R.id.open_armoire_subscriber_wrapper;
                                                            LinearLayout linearLayout = (LinearLayout) b.a(view, R.id.open_armoire_subscriber_wrapper);
                                                            if (linearLayout != null) {
                                                                i10 = R.id.progress_view;
                                                                ComposeView composeView = (ComposeView) b.a(view, R.id.progress_view);
                                                                if (composeView != null) {
                                                                    i10 = R.id.right_spark_view;
                                                                    SparkView sparkView2 = (SparkView) b.a(view, R.id.right_spark_view);
                                                                    if (sparkView2 != null) {
                                                                        i10 = R.id.subscribe_modal_button;
                                                                        Button button3 = (Button) b.a(view, R.id.subscribe_modal_button);
                                                                        if (button3 != null) {
                                                                            i10 = R.id.subtitle_view;
                                                                            TextView textView6 = (TextView) b.a(view, R.id.subtitle_view);
                                                                            if (textView6 != null) {
                                                                                i10 = R.id.title_view;
                                                                                TextView textView7 = (TextView) b.a(view, R.id.title_view);
                                                                                if (textView7 != null) {
                                                                                    i10 = R.id.unsubbed_wrapper;
                                                                                    LinearLayout linearLayout2 = (LinearLayout) b.a(view, R.id.unsubbed_wrapper);
                                                                                    if (linearLayout2 != null) {
                                                                                        return new ActivityArmoireBinding((FrameLayout) view, adButton, button, frameLayout, textView, textView2, button2, textView3, currencyView, pixelArtView, relativeLayout, sparkView, textView4, textView5, linearLayout, composeView, sparkView2, button3, textView6, textView7, linearLayout2);
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

    public static ActivityArmoireBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityArmoireBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.activity_armoire, viewGroup, false);
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
