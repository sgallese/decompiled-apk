package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.habitrpg.android.habitica.R;
import com.habitrpg.common.habitica.views.PixelArtView;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class DialogPetSuggestHatchBinding implements a {
    public final TextView descriptionView;
    public final TextView eggCountView;
    public final FrameLayout eggFrameView;
    public final PixelArtView eggView;
    public final PixelArtView hatchingPotionView;
    public final TextView petTitleView;
    public final PixelArtView petView;
    public final TextView potionCountView;
    public final FrameLayout potionFrameView;
    private final LinearLayout rootView;
    public final ShimmerFrameLayout shimmerView;

    private DialogPetSuggestHatchBinding(LinearLayout linearLayout, TextView textView, TextView textView2, FrameLayout frameLayout, PixelArtView pixelArtView, PixelArtView pixelArtView2, TextView textView3, PixelArtView pixelArtView3, TextView textView4, FrameLayout frameLayout2, ShimmerFrameLayout shimmerFrameLayout) {
        this.rootView = linearLayout;
        this.descriptionView = textView;
        this.eggCountView = textView2;
        this.eggFrameView = frameLayout;
        this.eggView = pixelArtView;
        this.hatchingPotionView = pixelArtView2;
        this.petTitleView = textView3;
        this.petView = pixelArtView3;
        this.potionCountView = textView4;
        this.potionFrameView = frameLayout2;
        this.shimmerView = shimmerFrameLayout;
    }

    public static DialogPetSuggestHatchBinding bind(View view) {
        int i10 = R.id.description_view;
        TextView textView = (TextView) b.a(view, R.id.description_view);
        if (textView != null) {
            i10 = R.id.egg_count_view;
            TextView textView2 = (TextView) b.a(view, R.id.egg_count_view);
            if (textView2 != null) {
                i10 = R.id.egg_frame_view;
                FrameLayout frameLayout = (FrameLayout) b.a(view, R.id.egg_frame_view);
                if (frameLayout != null) {
                    i10 = R.id.egg_view;
                    PixelArtView pixelArtView = (PixelArtView) b.a(view, R.id.egg_view);
                    if (pixelArtView != null) {
                        i10 = R.id.hatchingPotion_view;
                        PixelArtView pixelArtView2 = (PixelArtView) b.a(view, R.id.hatchingPotion_view);
                        if (pixelArtView2 != null) {
                            i10 = R.id.pet_title_view;
                            TextView textView3 = (TextView) b.a(view, R.id.pet_title_view);
                            if (textView3 != null) {
                                i10 = R.id.pet_view;
                                PixelArtView pixelArtView3 = (PixelArtView) b.a(view, R.id.pet_view);
                                if (pixelArtView3 != null) {
                                    i10 = R.id.potion_count_view;
                                    TextView textView4 = (TextView) b.a(view, R.id.potion_count_view);
                                    if (textView4 != null) {
                                        i10 = R.id.potion_frame_view;
                                        FrameLayout frameLayout2 = (FrameLayout) b.a(view, R.id.potion_frame_view);
                                        if (frameLayout2 != null) {
                                            i10 = R.id.shimmer_view;
                                            ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) b.a(view, R.id.shimmer_view);
                                            if (shimmerFrameLayout != null) {
                                                return new DialogPetSuggestHatchBinding((LinearLayout) view, textView, textView2, frameLayout, pixelArtView, pixelArtView2, textView3, pixelArtView3, textView4, frameLayout2, shimmerFrameLayout);
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

    public static DialogPetSuggestHatchBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static DialogPetSuggestHatchBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.dialog_pet_suggest_hatch, viewGroup, false);
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
