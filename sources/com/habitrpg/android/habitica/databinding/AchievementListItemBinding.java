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
public final class AchievementListItemBinding implements a {
    public final TextView achievementCountLabel;
    public final TextView achievementDescription;
    public final PixelArtView achievementIcon;
    public final TextView achievementTitle;
    private final LinearLayout rootView;

    private AchievementListItemBinding(LinearLayout linearLayout, TextView textView, TextView textView2, PixelArtView pixelArtView, TextView textView3) {
        this.rootView = linearLayout;
        this.achievementCountLabel = textView;
        this.achievementDescription = textView2;
        this.achievementIcon = pixelArtView;
        this.achievementTitle = textView3;
    }

    public static AchievementListItemBinding bind(View view) {
        int i10 = R.id.achievement_count_label;
        TextView textView = (TextView) b.a(view, R.id.achievement_count_label);
        if (textView != null) {
            i10 = R.id.achievement_description;
            TextView textView2 = (TextView) b.a(view, R.id.achievement_description);
            if (textView2 != null) {
                i10 = R.id.achievement_icon;
                PixelArtView pixelArtView = (PixelArtView) b.a(view, R.id.achievement_icon);
                if (pixelArtView != null) {
                    i10 = R.id.achievement_title;
                    TextView textView3 = (TextView) b.a(view, R.id.achievement_title);
                    if (textView3 != null) {
                        return new AchievementListItemBinding((LinearLayout) view, textView, textView2, pixelArtView, textView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static AchievementListItemBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static AchievementListItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.achievement_list_item, viewGroup, false);
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
