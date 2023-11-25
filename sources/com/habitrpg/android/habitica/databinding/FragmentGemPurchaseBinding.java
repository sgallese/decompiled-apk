package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.core.widget.NestedScrollView;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.ui.GemPurchaseOptionsView;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class FragmentGemPurchaseBinding implements a {
    public final GemPurchaseOptionsView gems21View;
    public final GemPurchaseOptionsView gems42View;
    public final GemPurchaseOptionsView gems4View;
    public final GemPurchaseOptionsView gems84View;
    public final Button giftGemsButton;
    public final ImageView headerImageView;
    public final RelativeLayout promoBanner;
    public final TextView promoBannerDurationView;
    public final ImageView promoBannerLeftImage;
    public final ImageView promoBannerRightImage;
    public final ImageView promoBannerTitleImage;
    public final TextView promoBannerTitleText;
    public final ComposeView promoComposeView;
    private final NestedScrollView rootView;
    public final TextView supportTextView;

    private FragmentGemPurchaseBinding(NestedScrollView nestedScrollView, GemPurchaseOptionsView gemPurchaseOptionsView, GemPurchaseOptionsView gemPurchaseOptionsView2, GemPurchaseOptionsView gemPurchaseOptionsView3, GemPurchaseOptionsView gemPurchaseOptionsView4, Button button, ImageView imageView, RelativeLayout relativeLayout, TextView textView, ImageView imageView2, ImageView imageView3, ImageView imageView4, TextView textView2, ComposeView composeView, TextView textView3) {
        this.rootView = nestedScrollView;
        this.gems21View = gemPurchaseOptionsView;
        this.gems42View = gemPurchaseOptionsView2;
        this.gems4View = gemPurchaseOptionsView3;
        this.gems84View = gemPurchaseOptionsView4;
        this.giftGemsButton = button;
        this.headerImageView = imageView;
        this.promoBanner = relativeLayout;
        this.promoBannerDurationView = textView;
        this.promoBannerLeftImage = imageView2;
        this.promoBannerRightImage = imageView3;
        this.promoBannerTitleImage = imageView4;
        this.promoBannerTitleText = textView2;
        this.promoComposeView = composeView;
        this.supportTextView = textView3;
    }

    public static FragmentGemPurchaseBinding bind(View view) {
        int i10 = R.id.gems_21_view;
        GemPurchaseOptionsView gemPurchaseOptionsView = (GemPurchaseOptionsView) b.a(view, R.id.gems_21_view);
        if (gemPurchaseOptionsView != null) {
            i10 = R.id.gems_42_view;
            GemPurchaseOptionsView gemPurchaseOptionsView2 = (GemPurchaseOptionsView) b.a(view, R.id.gems_42_view);
            if (gemPurchaseOptionsView2 != null) {
                i10 = R.id.gems_4_view;
                GemPurchaseOptionsView gemPurchaseOptionsView3 = (GemPurchaseOptionsView) b.a(view, R.id.gems_4_view);
                if (gemPurchaseOptionsView3 != null) {
                    i10 = R.id.gems_84_view;
                    GemPurchaseOptionsView gemPurchaseOptionsView4 = (GemPurchaseOptionsView) b.a(view, R.id.gems_84_view);
                    if (gemPurchaseOptionsView4 != null) {
                        i10 = R.id.gift_gems_button;
                        Button button = (Button) b.a(view, R.id.gift_gems_button);
                        if (button != null) {
                            i10 = R.id.header_image_view;
                            ImageView imageView = (ImageView) b.a(view, R.id.header_image_view);
                            if (imageView != null) {
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
                                                            i10 = R.id.supportTextView;
                                                            TextView textView3 = (TextView) b.a(view, R.id.supportTextView);
                                                            if (textView3 != null) {
                                                                return new FragmentGemPurchaseBinding((NestedScrollView) view, gemPurchaseOptionsView, gemPurchaseOptionsView2, gemPurchaseOptionsView3, gemPurchaseOptionsView4, button, imageView, relativeLayout, textView, imageView2, imageView3, imageView4, textView2, composeView, textView3);
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

    public static FragmentGemPurchaseBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentGemPurchaseBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.fragment_gem_purchase, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // e4.a
    public NestedScrollView getRoot() {
        return this.rootView;
    }
}
