package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.habitrpg.android.habitica.R;
import com.habitrpg.common.habitica.views.PixelArtView;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class PetDetailItemBinding implements a {
    public final ImageView activeIndicator;
    public final LinearLayout cardView;
    public final ImageView checkmarkView;
    public final ImageView eggView;
    public final ImageView hatchingPotionView;
    public final PixelArtView imageView;
    public final RelativeLayout itemWrapper;
    private final RelativeLayout rootView;
    public final TextView titleTextView;
    public final ProgressBar trainedProgressBar;

    private PetDetailItemBinding(RelativeLayout relativeLayout, ImageView imageView, LinearLayout linearLayout, ImageView imageView2, ImageView imageView3, ImageView imageView4, PixelArtView pixelArtView, RelativeLayout relativeLayout2, TextView textView, ProgressBar progressBar) {
        this.rootView = relativeLayout;
        this.activeIndicator = imageView;
        this.cardView = linearLayout;
        this.checkmarkView = imageView2;
        this.eggView = imageView3;
        this.hatchingPotionView = imageView4;
        this.imageView = pixelArtView;
        this.itemWrapper = relativeLayout2;
        this.titleTextView = textView;
        this.trainedProgressBar = progressBar;
    }

    public static PetDetailItemBinding bind(View view) {
        int i10 = R.id.active_indicator;
        ImageView imageView = (ImageView) b.a(view, R.id.active_indicator);
        if (imageView != null) {
            i10 = R.id.card_view;
            LinearLayout linearLayout = (LinearLayout) b.a(view, R.id.card_view);
            if (linearLayout != null) {
                i10 = R.id.checkmark_view;
                ImageView imageView2 = (ImageView) b.a(view, R.id.checkmark_view);
                if (imageView2 != null) {
                    i10 = R.id.egg_view;
                    ImageView imageView3 = (ImageView) b.a(view, R.id.egg_view);
                    if (imageView3 != null) {
                        i10 = R.id.hatchingPotion_view;
                        ImageView imageView4 = (ImageView) b.a(view, R.id.hatchingPotion_view);
                        if (imageView4 != null) {
                            i10 = R.id.imageView;
                            PixelArtView pixelArtView = (PixelArtView) b.a(view, R.id.imageView);
                            if (pixelArtView != null) {
                                i10 = R.id.item_wrapper;
                                RelativeLayout relativeLayout = (RelativeLayout) b.a(view, R.id.item_wrapper);
                                if (relativeLayout != null) {
                                    i10 = R.id.titleTextView;
                                    TextView textView = (TextView) b.a(view, R.id.titleTextView);
                                    if (textView != null) {
                                        i10 = R.id.trainedProgressBar;
                                        ProgressBar progressBar = (ProgressBar) b.a(view, R.id.trainedProgressBar);
                                        if (progressBar != null) {
                                            return new PetDetailItemBinding((RelativeLayout) view, imageView, linearLayout, imageView2, imageView3, imageView4, pixelArtView, relativeLayout, textView, progressBar);
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

    public static PetDetailItemBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static PetDetailItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.pet_detail_item, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // e4.a
    public RelativeLayout getRoot() {
        return this.rootView;
    }
}
