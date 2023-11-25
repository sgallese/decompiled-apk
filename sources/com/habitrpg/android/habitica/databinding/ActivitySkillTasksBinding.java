package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.habitrpg.android.habitica.R;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class ActivitySkillTasksBinding implements a {
    private final LinearLayout rootView;
    public final TabLayout tabLayout;
    public final Toolbar toolbar;
    public final ViewPager2 viewPager;

    private ActivitySkillTasksBinding(LinearLayout linearLayout, TabLayout tabLayout, Toolbar toolbar, ViewPager2 viewPager2) {
        this.rootView = linearLayout;
        this.tabLayout = tabLayout;
        this.toolbar = toolbar;
        this.viewPager = viewPager2;
    }

    public static ActivitySkillTasksBinding bind(View view) {
        int i10 = R.id.tab_layout;
        TabLayout tabLayout = (TabLayout) b.a(view, R.id.tab_layout);
        if (tabLayout != null) {
            i10 = R.id.toolbar;
            Toolbar toolbar = (Toolbar) b.a(view, R.id.toolbar);
            if (toolbar != null) {
                i10 = R.id.viewPager;
                ViewPager2 viewPager2 = (ViewPager2) b.a(view, R.id.viewPager);
                if (viewPager2 != null) {
                    return new ActivitySkillTasksBinding((LinearLayout) view, tabLayout, toolbar, viewPager2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static ActivitySkillTasksBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivitySkillTasksBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.activity_skill_tasks, viewGroup, false);
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
