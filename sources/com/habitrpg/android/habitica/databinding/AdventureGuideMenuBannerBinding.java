package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.habitrpg.android.habitica.R;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class AdventureGuideMenuBannerBinding implements a {
    public final TextView countView;
    public final TextView goldTextview;
    public final ProgressBar progressBar;
    private final FrameLayout rootView;

    private AdventureGuideMenuBannerBinding(FrameLayout frameLayout, TextView textView, TextView textView2, ProgressBar progressBar) {
        this.rootView = frameLayout;
        this.countView = textView;
        this.goldTextview = textView2;
        this.progressBar = progressBar;
    }

    public static AdventureGuideMenuBannerBinding bind(View view) {
        int i10 = R.id.count_view;
        TextView textView = (TextView) b.a(view, R.id.count_view);
        if (textView != null) {
            i10 = R.id.gold_textview;
            TextView textView2 = (TextView) b.a(view, R.id.gold_textview);
            if (textView2 != null) {
                i10 = R.id.progress_bar;
                ProgressBar progressBar = (ProgressBar) b.a(view, R.id.progress_bar);
                if (progressBar != null) {
                    return new AdventureGuideMenuBannerBinding((FrameLayout) view, textView, textView2, progressBar);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static AdventureGuideMenuBannerBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static AdventureGuideMenuBannerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.adventure_guide_menu_banner, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // e4.a
    public FrameLayout getRoot() {
        return this.rootView;
    }
}
