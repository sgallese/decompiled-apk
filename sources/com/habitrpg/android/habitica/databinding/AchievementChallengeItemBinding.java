package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.habitrpg.android.habitica.R;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class AchievementChallengeItemBinding implements a {
    public final ImageView achievementCountLabel;
    public final TextView achievementTitle;
    private final LinearLayout rootView;

    private AchievementChallengeItemBinding(LinearLayout linearLayout, ImageView imageView, TextView textView) {
        this.rootView = linearLayout;
        this.achievementCountLabel = imageView;
        this.achievementTitle = textView;
    }

    public static AchievementChallengeItemBinding bind(View view) {
        int i10 = R.id.achievement_count_label;
        ImageView imageView = (ImageView) b.a(view, R.id.achievement_count_label);
        if (imageView != null) {
            i10 = R.id.achievement_title;
            TextView textView = (TextView) b.a(view, R.id.achievement_title);
            if (textView != null) {
                return new AchievementChallengeItemBinding((LinearLayout) view, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static AchievementChallengeItemBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static AchievementChallengeItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.achievement_challenge_item, viewGroup, false);
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
