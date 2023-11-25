package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.habitrpg.android.habitica.R;
import com.habitrpg.common.habitica.views.PixelArtView;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class ProfileAchievementItemBinding implements a {
    public final TextView achievementCountLabel;
    public final PixelArtView achievementDrawee;
    public final TextView achievementText;
    private final LinearLayout rootView;

    private ProfileAchievementItemBinding(LinearLayout linearLayout, TextView textView, PixelArtView pixelArtView, TextView textView2) {
        this.rootView = linearLayout;
        this.achievementCountLabel = textView;
        this.achievementDrawee = pixelArtView;
        this.achievementText = textView2;
    }

    public static ProfileAchievementItemBinding bind(View view) {
        int i10 = R.id.achievement_count_label;
        TextView textView = (TextView) b.a(view, R.id.achievement_count_label);
        if (textView != null) {
            i10 = R.id.achievement_drawee;
            PixelArtView pixelArtView = (PixelArtView) b.a(view, R.id.achievement_drawee);
            if (pixelArtView != null) {
                i10 = R.id.achievement_text;
                TextView textView2 = (TextView) b.a(view, R.id.achievement_text);
                if (textView2 != null) {
                    return new ProfileAchievementItemBinding((LinearLayout) view, textView, pixelArtView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static ProfileAchievementItemBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ProfileAchievementItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.profile_achievement_item, viewGroup, false);
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
