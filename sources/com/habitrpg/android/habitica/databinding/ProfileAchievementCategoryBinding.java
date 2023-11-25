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
public final class ProfileAchievementCategoryBinding implements a {
    public final TextView label;
    private final LinearLayout rootView;

    private ProfileAchievementCategoryBinding(LinearLayout linearLayout, TextView textView) {
        this.rootView = linearLayout;
        this.label = textView;
    }

    public static ProfileAchievementCategoryBinding bind(View view) {
        TextView textView = (TextView) b.a(view, R.id.label);
        if (textView != null) {
            return new ProfileAchievementCategoryBinding((LinearLayout) view, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.label)));
    }

    public static ProfileAchievementCategoryBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ProfileAchievementCategoryBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.profile_achievement_category, viewGroup, false);
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
