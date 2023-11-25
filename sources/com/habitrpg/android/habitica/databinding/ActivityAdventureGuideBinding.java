package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.habitrpg.android.habitica.R;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class ActivityAdventureGuideBinding implements a {
    public final LinearLayout achievementContainer;
    public final TextView descriptionView;
    public final ProgressBar progressBar;
    public final TextView progressTextview;
    private final LinearLayout rootView;
    public final Toolbar toolbar;

    private ActivityAdventureGuideBinding(LinearLayout linearLayout, LinearLayout linearLayout2, TextView textView, ProgressBar progressBar, TextView textView2, Toolbar toolbar) {
        this.rootView = linearLayout;
        this.achievementContainer = linearLayout2;
        this.descriptionView = textView;
        this.progressBar = progressBar;
        this.progressTextview = textView2;
        this.toolbar = toolbar;
    }

    public static ActivityAdventureGuideBinding bind(View view) {
        int i10 = R.id.achievement_container;
        LinearLayout linearLayout = (LinearLayout) b.a(view, R.id.achievement_container);
        if (linearLayout != null) {
            i10 = R.id.description_view;
            TextView textView = (TextView) b.a(view, R.id.description_view);
            if (textView != null) {
                i10 = R.id.progress_bar;
                ProgressBar progressBar = (ProgressBar) b.a(view, R.id.progress_bar);
                if (progressBar != null) {
                    i10 = R.id.progress_textview;
                    TextView textView2 = (TextView) b.a(view, R.id.progress_textview);
                    if (textView2 != null) {
                        i10 = R.id.toolbar;
                        Toolbar toolbar = (Toolbar) b.a(view, R.id.toolbar);
                        if (toolbar != null) {
                            return new ActivityAdventureGuideBinding((LinearLayout) view, linearLayout, textView, progressBar, textView2, toolbar);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static ActivityAdventureGuideBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityAdventureGuideBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.activity_adventure_guide, viewGroup, false);
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
