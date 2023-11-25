package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.habitrpg.android.habitica.R;
import com.habitrpg.common.habitica.views.PixelArtView;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class CanHatchItemBinding implements a {
    public final LinearLayout cardView;
    public final ImageView checkmarkView;
    public final PixelArtView eggView;
    public final PixelArtView hatchingPotionView;
    public final RelativeLayout itemWrapper;
    private final FrameLayout rootView;

    private CanHatchItemBinding(FrameLayout frameLayout, LinearLayout linearLayout, ImageView imageView, PixelArtView pixelArtView, PixelArtView pixelArtView2, RelativeLayout relativeLayout) {
        this.rootView = frameLayout;
        this.cardView = linearLayout;
        this.checkmarkView = imageView;
        this.eggView = pixelArtView;
        this.hatchingPotionView = pixelArtView2;
        this.itemWrapper = relativeLayout;
    }

    public static CanHatchItemBinding bind(View view) {
        int i10 = R.id.card_view;
        LinearLayout linearLayout = (LinearLayout) b.a(view, R.id.card_view);
        if (linearLayout != null) {
            i10 = R.id.checkmark_view;
            ImageView imageView = (ImageView) b.a(view, R.id.checkmark_view);
            if (imageView != null) {
                i10 = R.id.egg_view;
                PixelArtView pixelArtView = (PixelArtView) b.a(view, R.id.egg_view);
                if (pixelArtView != null) {
                    i10 = R.id.hatchingPotion_view;
                    PixelArtView pixelArtView2 = (PixelArtView) b.a(view, R.id.hatchingPotion_view);
                    if (pixelArtView2 != null) {
                        i10 = R.id.item_wrapper;
                        RelativeLayout relativeLayout = (RelativeLayout) b.a(view, R.id.item_wrapper);
                        if (relativeLayout != null) {
                            return new CanHatchItemBinding((FrameLayout) view, linearLayout, imageView, pixelArtView, pixelArtView2, relativeLayout);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static CanHatchItemBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static CanHatchItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.can_hatch_item, viewGroup, false);
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
