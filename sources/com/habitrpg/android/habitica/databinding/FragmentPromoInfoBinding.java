package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.habitrpg.android.habitica.R;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class FragmentPromoInfoBinding implements a {
    public final TextView instructionDescriptionView;
    public final TextView instructionsTitleView;
    public final TextView limitationsDescriptionView;
    public final TextView limitationsTitleView;
    public final RelativeLayout promoBanner;
    public final TextView promoBannerDurationView;
    public final ImageView promoBannerLeftImage;
    public final ImageView promoBannerRightImage;
    public final TextView promoBannerSubtitleView;
    public final ImageView promoBannerTitleImage;
    public final TextView promoBannerTitleText;
    public final TextView promptButton;
    public final TextView promptText;
    private final NestedScrollView rootView;

    private FragmentPromoInfoBinding(NestedScrollView nestedScrollView, TextView textView, TextView textView2, TextView textView3, TextView textView4, RelativeLayout relativeLayout, TextView textView5, ImageView imageView, ImageView imageView2, TextView textView6, ImageView imageView3, TextView textView7, TextView textView8, TextView textView9) {
        this.rootView = nestedScrollView;
        this.instructionDescriptionView = textView;
        this.instructionsTitleView = textView2;
        this.limitationsDescriptionView = textView3;
        this.limitationsTitleView = textView4;
        this.promoBanner = relativeLayout;
        this.promoBannerDurationView = textView5;
        this.promoBannerLeftImage = imageView;
        this.promoBannerRightImage = imageView2;
        this.promoBannerSubtitleView = textView6;
        this.promoBannerTitleImage = imageView3;
        this.promoBannerTitleText = textView7;
        this.promptButton = textView8;
        this.promptText = textView9;
    }

    public static FragmentPromoInfoBinding bind(View view) {
        int i10 = R.id.instruction_description_view;
        TextView textView = (TextView) b.a(view, R.id.instruction_description_view);
        if (textView != null) {
            i10 = R.id.instructions_title_view;
            TextView textView2 = (TextView) b.a(view, R.id.instructions_title_view);
            if (textView2 != null) {
                i10 = R.id.limitations_description_view;
                TextView textView3 = (TextView) b.a(view, R.id.limitations_description_view);
                if (textView3 != null) {
                    i10 = R.id.limitations_title_view;
                    TextView textView4 = (TextView) b.a(view, R.id.limitations_title_view);
                    if (textView4 != null) {
                        i10 = R.id.promo_banner;
                        RelativeLayout relativeLayout = (RelativeLayout) b.a(view, R.id.promo_banner);
                        if (relativeLayout != null) {
                            i10 = R.id.promo_banner_duration_view;
                            TextView textView5 = (TextView) b.a(view, R.id.promo_banner_duration_view);
                            if (textView5 != null) {
                                i10 = R.id.promo_banner_left_image;
                                ImageView imageView = (ImageView) b.a(view, R.id.promo_banner_left_image);
                                if (imageView != null) {
                                    i10 = R.id.promo_banner_right_image;
                                    ImageView imageView2 = (ImageView) b.a(view, R.id.promo_banner_right_image);
                                    if (imageView2 != null) {
                                        i10 = R.id.promo_banner_subtitle_view;
                                        TextView textView6 = (TextView) b.a(view, R.id.promo_banner_subtitle_view);
                                        if (textView6 != null) {
                                            i10 = R.id.promo_banner_title_image;
                                            ImageView imageView3 = (ImageView) b.a(view, R.id.promo_banner_title_image);
                                            if (imageView3 != null) {
                                                i10 = R.id.promo_banner_title_text;
                                                TextView textView7 = (TextView) b.a(view, R.id.promo_banner_title_text);
                                                if (textView7 != null) {
                                                    i10 = R.id.prompt_button;
                                                    TextView textView8 = (TextView) b.a(view, R.id.prompt_button);
                                                    if (textView8 != null) {
                                                        i10 = R.id.prompt_text;
                                                        TextView textView9 = (TextView) b.a(view, R.id.prompt_text);
                                                        if (textView9 != null) {
                                                            return new FragmentPromoInfoBinding((NestedScrollView) view, textView, textView2, textView3, textView4, relativeLayout, textView5, imageView, imageView2, textView6, imageView3, textView7, textView8, textView9);
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

    public static FragmentPromoInfoBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentPromoInfoBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.fragment_promo_info, viewGroup, false);
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
