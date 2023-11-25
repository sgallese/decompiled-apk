package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.habitrpg.android.habitica.R;
import com.habitrpg.common.habitica.views.PixelArtView;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class AchievementGridItemBinding implements a {
    public final LinearLayout achievementContainer;
    public final TextView achievementCountLabel;
    public final PixelArtView achievementIcon;
    public final TextView achievementTitle;
    private final RelativeLayout rootView;

    private AchievementGridItemBinding(RelativeLayout relativeLayout, LinearLayout linearLayout, TextView textView, PixelArtView pixelArtView, TextView textView2) {
        this.rootView = relativeLayout;
        this.achievementContainer = linearLayout;
        this.achievementCountLabel = textView;
        this.achievementIcon = pixelArtView;
        this.achievementTitle = textView2;
    }

    public static AchievementGridItemBinding bind(View view) {
        int i10 = R.id.achievement_container;
        LinearLayout linearLayout = (LinearLayout) b.a(view, R.id.achievement_container);
        if (linearLayout != null) {
            i10 = R.id.achievement_count_label;
            TextView textView = (TextView) b.a(view, R.id.achievement_count_label);
            if (textView != null) {
                i10 = R.id.achievement_icon;
                PixelArtView pixelArtView = (PixelArtView) b.a(view, R.id.achievement_icon);
                if (pixelArtView != null) {
                    i10 = R.id.achievement_title;
                    TextView textView2 = (TextView) b.a(view, R.id.achievement_title);
                    if (textView2 != null) {
                        return new AchievementGridItemBinding((RelativeLayout) view, linearLayout, textView, pixelArtView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static AchievementGridItemBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static AchievementGridItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.achievement_grid_item, viewGroup, false);
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
