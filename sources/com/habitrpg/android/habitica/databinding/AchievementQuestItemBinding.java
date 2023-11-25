package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.habitrpg.android.habitica.R;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class AchievementQuestItemBinding implements a {
    public final TextView achievementCountLabel;
    public final TextView achievementTitle;
    private final LinearLayout rootView;

    private AchievementQuestItemBinding(LinearLayout linearLayout, TextView textView, TextView textView2) {
        this.rootView = linearLayout;
        this.achievementCountLabel = textView;
        this.achievementTitle = textView2;
    }

    public static AchievementQuestItemBinding bind(View view) {
        int i10 = R.id.achievement_count_label;
        TextView textView = (TextView) b.a(view, R.id.achievement_count_label);
        if (textView != null) {
            i10 = R.id.achievement_title;
            TextView textView2 = (TextView) b.a(view, R.id.achievement_title);
            if (textView2 != null) {
                return new AchievementQuestItemBinding((LinearLayout) view, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static AchievementQuestItemBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static AchievementQuestItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.achievement_quest_item, viewGroup, false);
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
