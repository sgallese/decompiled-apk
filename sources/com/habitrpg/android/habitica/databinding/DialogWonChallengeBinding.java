package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.habitrpg.android.habitica.R;
import com.habitrpg.common.habitica.views.PixelArtView;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class DialogWonChallengeBinding implements a {
    public final ImageView achievementConfettiLeft;
    public final ImageView achievementConfettiRight;
    public final ImageView achievementConfettiView;
    public final PixelArtView achievementView;
    public final TextView descriptionView;
    private final LinearLayout rootView;

    private DialogWonChallengeBinding(LinearLayout linearLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, PixelArtView pixelArtView, TextView textView) {
        this.rootView = linearLayout;
        this.achievementConfettiLeft = imageView;
        this.achievementConfettiRight = imageView2;
        this.achievementConfettiView = imageView3;
        this.achievementView = pixelArtView;
        this.descriptionView = textView;
    }

    public static DialogWonChallengeBinding bind(View view) {
        int i10 = R.id.achievement_confetti_left;
        ImageView imageView = (ImageView) b.a(view, R.id.achievement_confetti_left);
        if (imageView != null) {
            i10 = R.id.achievement_confetti_right;
            ImageView imageView2 = (ImageView) b.a(view, R.id.achievement_confetti_right);
            if (imageView2 != null) {
                i10 = R.id.achievement_confetti_view;
                ImageView imageView3 = (ImageView) b.a(view, R.id.achievement_confetti_view);
                if (imageView3 != null) {
                    i10 = R.id.achievement_view;
                    PixelArtView pixelArtView = (PixelArtView) b.a(view, R.id.achievement_view);
                    if (pixelArtView != null) {
                        i10 = R.id.description_view;
                        TextView textView = (TextView) b.a(view, R.id.description_view);
                        if (textView != null) {
                            return new DialogWonChallengeBinding((LinearLayout) view, imageView, imageView2, imageView3, pixelArtView, textView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static DialogWonChallengeBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static DialogWonChallengeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.dialog_won_challenge, viewGroup, false);
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
