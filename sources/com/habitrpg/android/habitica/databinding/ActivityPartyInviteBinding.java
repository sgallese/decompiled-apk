package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.habitrpg.android.habitica.R;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class ActivityPartyInviteBinding implements a {
    private final FrameLayout rootView;
    public final FrameLayout snackbarView;
    public final TabLayout tabLayout;
    public final Toolbar toolbar;
    public final ViewPager2 viewPager;

    private ActivityPartyInviteBinding(FrameLayout frameLayout, FrameLayout frameLayout2, TabLayout tabLayout, Toolbar toolbar, ViewPager2 viewPager2) {
        this.rootView = frameLayout;
        this.snackbarView = frameLayout2;
        this.tabLayout = tabLayout;
        this.toolbar = toolbar;
        this.viewPager = viewPager2;
    }

    public static ActivityPartyInviteBinding bind(View view) {
        int i10 = R.id.snackbar_view;
        FrameLayout frameLayout = (FrameLayout) b.a(view, R.id.snackbar_view);
        if (frameLayout != null) {
            i10 = R.id.tab_layout;
            TabLayout tabLayout = (TabLayout) b.a(view, R.id.tab_layout);
            if (tabLayout != null) {
                i10 = R.id.toolbar;
                Toolbar toolbar = (Toolbar) b.a(view, R.id.toolbar);
                if (toolbar != null) {
                    i10 = R.id.viewPager;
                    ViewPager2 viewPager2 = (ViewPager2) b.a(view, R.id.viewPager);
                    if (viewPager2 != null) {
                        return new ActivityPartyInviteBinding((FrameLayout) view, frameLayout, tabLayout, toolbar, viewPager2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static ActivityPartyInviteBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityPartyInviteBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.activity_party_invite, viewGroup, false);
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
