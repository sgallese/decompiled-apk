package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.habitrpg.android.habitica.R;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class ActivityGemPurchaseBinding implements a {
    public final AppBarLayout appbar;
    public final DrawerLayout drawerLayout;
    public final FrameLayout fragmentContainer;
    public final FrameLayout overlayFrameLayout;
    private final FrameLayout rootView;
    public final Toolbar toolbar;

    private ActivityGemPurchaseBinding(FrameLayout frameLayout, AppBarLayout appBarLayout, DrawerLayout drawerLayout, FrameLayout frameLayout2, FrameLayout frameLayout3, Toolbar toolbar) {
        this.rootView = frameLayout;
        this.appbar = appBarLayout;
        this.drawerLayout = drawerLayout;
        this.fragmentContainer = frameLayout2;
        this.overlayFrameLayout = frameLayout3;
        this.toolbar = toolbar;
    }

    public static ActivityGemPurchaseBinding bind(View view) {
        int i10 = R.id.appbar;
        AppBarLayout appBarLayout = (AppBarLayout) b.a(view, R.id.appbar);
        if (appBarLayout != null) {
            i10 = R.id.drawer_layout;
            DrawerLayout drawerLayout = (DrawerLayout) b.a(view, R.id.drawer_layout);
            if (drawerLayout != null) {
                i10 = R.id.fragment_container;
                FrameLayout frameLayout = (FrameLayout) b.a(view, R.id.fragment_container);
                if (frameLayout != null) {
                    FrameLayout frameLayout2 = (FrameLayout) view;
                    i10 = R.id.toolbar;
                    Toolbar toolbar = (Toolbar) b.a(view, R.id.toolbar);
                    if (toolbar != null) {
                        return new ActivityGemPurchaseBinding(frameLayout2, appBarLayout, drawerLayout, frameLayout, frameLayout2, toolbar);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static ActivityGemPurchaseBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityGemPurchaseBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.activity_gem_purchase, viewGroup, false);
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
