package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.ui.platform.ComposeView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.FragmentContainerView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.tabs.TabLayout;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.ui.views.navigation.HabiticaBottomNavigationView;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class ActivityMainContentBinding implements a {
    public final AppBarLayout appbar;
    public final HabiticaBottomNavigationView bottomNavigation;
    public final CollapsingToolbarLayout collapsingToolbar;
    public final TextView connectionIssueTextview;
    public final FrameLayout connectionIssueView;
    public final TabLayout detailTabs;
    public final ComposeView headerView;
    public final FragmentContainerView navHostFragment;
    public final RelativeLayout overlayFrameLayout;
    private final CoordinatorLayout rootView;
    public final FrameLayout snackbarContainer;
    public final Toolbar toolbar;
    public final FrameLayout toolbarAccessoryContainer;
    public final TextView toolbarTitle;

    private ActivityMainContentBinding(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, HabiticaBottomNavigationView habiticaBottomNavigationView, CollapsingToolbarLayout collapsingToolbarLayout, TextView textView, FrameLayout frameLayout, TabLayout tabLayout, ComposeView composeView, FragmentContainerView fragmentContainerView, RelativeLayout relativeLayout, FrameLayout frameLayout2, Toolbar toolbar, FrameLayout frameLayout3, TextView textView2) {
        this.rootView = coordinatorLayout;
        this.appbar = appBarLayout;
        this.bottomNavigation = habiticaBottomNavigationView;
        this.collapsingToolbar = collapsingToolbarLayout;
        this.connectionIssueTextview = textView;
        this.connectionIssueView = frameLayout;
        this.detailTabs = tabLayout;
        this.headerView = composeView;
        this.navHostFragment = fragmentContainerView;
        this.overlayFrameLayout = relativeLayout;
        this.snackbarContainer = frameLayout2;
        this.toolbar = toolbar;
        this.toolbarAccessoryContainer = frameLayout3;
        this.toolbarTitle = textView2;
    }

    public static ActivityMainContentBinding bind(View view) {
        int i10 = R.id.appbar;
        AppBarLayout appBarLayout = (AppBarLayout) b.a(view, R.id.appbar);
        if (appBarLayout != null) {
            i10 = R.id.bottom_navigation;
            HabiticaBottomNavigationView habiticaBottomNavigationView = (HabiticaBottomNavigationView) b.a(view, R.id.bottom_navigation);
            if (habiticaBottomNavigationView != null) {
                i10 = R.id.collapsing_toolbar;
                CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) b.a(view, R.id.collapsing_toolbar);
                if (collapsingToolbarLayout != null) {
                    i10 = R.id.connection_issue_textview;
                    TextView textView = (TextView) b.a(view, R.id.connection_issue_textview);
                    if (textView != null) {
                        i10 = R.id.connection_issue_view;
                        FrameLayout frameLayout = (FrameLayout) b.a(view, R.id.connection_issue_view);
                        if (frameLayout != null) {
                            i10 = R.id.detail_tabs;
                            TabLayout tabLayout = (TabLayout) b.a(view, R.id.detail_tabs);
                            if (tabLayout != null) {
                                i10 = R.id.header_view;
                                ComposeView composeView = (ComposeView) b.a(view, R.id.header_view);
                                if (composeView != null) {
                                    i10 = R.id.nav_host_fragment;
                                    FragmentContainerView fragmentContainerView = (FragmentContainerView) b.a(view, R.id.nav_host_fragment);
                                    if (fragmentContainerView != null) {
                                        i10 = R.id.overlayFrameLayout;
                                        RelativeLayout relativeLayout = (RelativeLayout) b.a(view, R.id.overlayFrameLayout);
                                        if (relativeLayout != null) {
                                            i10 = R.id.snackbar_container;
                                            FrameLayout frameLayout2 = (FrameLayout) b.a(view, R.id.snackbar_container);
                                            if (frameLayout2 != null) {
                                                i10 = R.id.toolbar;
                                                Toolbar toolbar = (Toolbar) b.a(view, R.id.toolbar);
                                                if (toolbar != null) {
                                                    i10 = R.id.toolbar_accessory_container;
                                                    FrameLayout frameLayout3 = (FrameLayout) b.a(view, R.id.toolbar_accessory_container);
                                                    if (frameLayout3 != null) {
                                                        i10 = R.id.toolbar_title;
                                                        TextView textView2 = (TextView) b.a(view, R.id.toolbar_title);
                                                        if (textView2 != null) {
                                                            return new ActivityMainContentBinding((CoordinatorLayout) view, appBarLayout, habiticaBottomNavigationView, collapsingToolbarLayout, textView, frameLayout, tabLayout, composeView, fragmentContainerView, relativeLayout, frameLayout2, toolbar, frameLayout3, textView2);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static ActivityMainContentBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityMainContentBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.activity_main_content, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // e4.a
    public CoordinatorLayout getRoot() {
        return this.rootView;
    }
}
