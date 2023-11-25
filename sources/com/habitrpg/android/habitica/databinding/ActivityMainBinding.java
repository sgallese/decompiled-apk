package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentContainerView;
import com.habitrpg.android.habitica.R;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class ActivityMainBinding implements a {
    public final ActivityMainContentBinding content;
    public final DrawerLayout drawerLayout;
    public final FragmentContainerView navigationDrawer;
    private final DrawerLayout rootView;

    private ActivityMainBinding(DrawerLayout drawerLayout, ActivityMainContentBinding activityMainContentBinding, DrawerLayout drawerLayout2, FragmentContainerView fragmentContainerView) {
        this.rootView = drawerLayout;
        this.content = activityMainContentBinding;
        this.drawerLayout = drawerLayout2;
        this.navigationDrawer = fragmentContainerView;
    }

    public static ActivityMainBinding bind(View view) {
        int i10 = R.id.content;
        View a10 = b.a(view, R.id.content);
        if (a10 != null) {
            ActivityMainContentBinding bind = ActivityMainContentBinding.bind(a10);
            DrawerLayout drawerLayout = (DrawerLayout) view;
            FragmentContainerView fragmentContainerView = (FragmentContainerView) b.a(view, R.id.navigation_drawer);
            if (fragmentContainerView != null) {
                return new ActivityMainBinding(drawerLayout, bind, drawerLayout, fragmentContainerView);
            }
            i10 = R.id.navigation_drawer;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static ActivityMainBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityMainBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.activity_main, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // e4.a
    public DrawerLayout getRoot() {
        return this.rootView;
    }
}
