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
public final class AchievementSectionHeaderBinding implements a {
    public final TextView countLabel;
    private final LinearLayout rootView;
    public final TextView title;

    private AchievementSectionHeaderBinding(LinearLayout linearLayout, TextView textView, TextView textView2) {
        this.rootView = linearLayout;
        this.countLabel = textView;
        this.title = textView2;
    }

    public static AchievementSectionHeaderBinding bind(View view) {
        int i10 = R.id.count_label;
        TextView textView = (TextView) b.a(view, R.id.count_label);
        if (textView != null) {
            i10 = R.id.title;
            TextView textView2 = (TextView) b.a(view, R.id.title);
            if (textView2 != null) {
                return new AchievementSectionHeaderBinding((LinearLayout) view, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static AchievementSectionHeaderBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static AchievementSectionHeaderBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.achievement_section_header, viewGroup, false);
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
