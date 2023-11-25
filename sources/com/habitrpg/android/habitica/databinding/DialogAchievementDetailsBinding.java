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
public final class DialogAchievementDetailsBinding implements a {
    public final ImageView achievementImage;
    public final TextView achievementText;
    public final TextView achievementTitle;
    private final LinearLayout rootView;

    private DialogAchievementDetailsBinding(LinearLayout linearLayout, ImageView imageView, TextView textView, TextView textView2) {
        this.rootView = linearLayout;
        this.achievementImage = imageView;
        this.achievementText = textView;
        this.achievementTitle = textView2;
    }

    public static DialogAchievementDetailsBinding bind(View view) {
        int i10 = R.id.achievement_image;
        ImageView imageView = (ImageView) b.a(view, R.id.achievement_image);
        if (imageView != null) {
            i10 = R.id.achievement_text;
            TextView textView = (TextView) b.a(view, R.id.achievement_text);
            if (textView != null) {
                i10 = R.id.achievement_title;
                TextView textView2 = (TextView) b.a(view, R.id.achievement_title);
                if (textView2 != null) {
                    return new DialogAchievementDetailsBinding((LinearLayout) view, imageView, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static DialogAchievementDetailsBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static DialogAchievementDetailsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.dialog_achievement_details, viewGroup, false);
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
