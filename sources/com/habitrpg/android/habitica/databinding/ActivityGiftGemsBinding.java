package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.habitrpg.android.habitica.R;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class ActivityGiftGemsBinding implements a {
    private final FrameLayout rootView;
    public final TabLayout tabLayout;
    public final Toolbar toolbar;
    public final FrameLayout toolbarAccessoryContainer;
    public final TextView toolbarTitle;
    public final ViewPager2 viewPager;

    private ActivityGiftGemsBinding(FrameLayout frameLayout, TabLayout tabLayout, Toolbar toolbar, FrameLayout frameLayout2, TextView textView, ViewPager2 viewPager2) {
        this.rootView = frameLayout;
        this.tabLayout = tabLayout;
        this.toolbar = toolbar;
        this.toolbarAccessoryContainer = frameLayout2;
        this.toolbarTitle = textView;
        this.viewPager = viewPager2;
    }

    public static ActivityGiftGemsBinding bind(View view) {
        int i10 = R.id.tab_layout;
        TabLayout tabLayout = (TabLayout) b.a(view, R.id.tab_layout);
        if (tabLayout != null) {
            i10 = R.id.toolbar;
            Toolbar toolbar = (Toolbar) b.a(view, R.id.toolbar);
            if (toolbar != null) {
                i10 = R.id.toolbar_accessory_container;
                FrameLayout frameLayout = (FrameLayout) b.a(view, R.id.toolbar_accessory_container);
                if (frameLayout != null) {
                    i10 = R.id.toolbar_title;
                    TextView textView = (TextView) b.a(view, R.id.toolbar_title);
                    if (textView != null) {
                        i10 = R.id.viewPager;
                        ViewPager2 viewPager2 = (ViewPager2) b.a(view, R.id.viewPager);
                        if (viewPager2 != null) {
                            return new ActivityGiftGemsBinding((FrameLayout) view, tabLayout, toolbar, frameLayout, textView, viewPager2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static ActivityGiftGemsBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityGiftGemsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.activity_gift_gems, viewGroup, false);
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
