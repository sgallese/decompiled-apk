package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.ui.views.navigation.BottomNavigationItem;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class MainNavigationViewBinding implements a {
    public final ImageButton addButton;
    public final FrameLayout addButtonBackground;
    public final LinearLayout bottomNavigationBackground;
    public final ImageView cutoutBackground;
    public final View cutoutFill;
    public final Space cutoutSpace;
    public final LinearLayout cutoutWrapper;
    public final BottomNavigationItem dailiesTab;
    public final BottomNavigationItem habitsTab;
    public final LinearLayout itemWrapper;
    public final BottomNavigationItem rewardsTab;
    private final View rootView;
    public final LinearLayout submenuWrapper;
    public final BottomNavigationItem todosTab;

    private MainNavigationViewBinding(View view, ImageButton imageButton, FrameLayout frameLayout, LinearLayout linearLayout, ImageView imageView, View view2, Space space, LinearLayout linearLayout2, BottomNavigationItem bottomNavigationItem, BottomNavigationItem bottomNavigationItem2, LinearLayout linearLayout3, BottomNavigationItem bottomNavigationItem3, LinearLayout linearLayout4, BottomNavigationItem bottomNavigationItem4) {
        this.rootView = view;
        this.addButton = imageButton;
        this.addButtonBackground = frameLayout;
        this.bottomNavigationBackground = linearLayout;
        this.cutoutBackground = imageView;
        this.cutoutFill = view2;
        this.cutoutSpace = space;
        this.cutoutWrapper = linearLayout2;
        this.dailiesTab = bottomNavigationItem;
        this.habitsTab = bottomNavigationItem2;
        this.itemWrapper = linearLayout3;
        this.rewardsTab = bottomNavigationItem3;
        this.submenuWrapper = linearLayout4;
        this.todosTab = bottomNavigationItem4;
    }

    public static MainNavigationViewBinding bind(View view) {
        int i10 = R.id.add_button;
        ImageButton imageButton = (ImageButton) b.a(view, R.id.add_button);
        if (imageButton != null) {
            i10 = R.id.add_button_background;
            FrameLayout frameLayout = (FrameLayout) b.a(view, R.id.add_button_background);
            if (frameLayout != null) {
                i10 = R.id.bottom_navigation_background;
                LinearLayout linearLayout = (LinearLayout) b.a(view, R.id.bottom_navigation_background);
                if (linearLayout != null) {
                    i10 = R.id.cutout_background;
                    ImageView imageView = (ImageView) b.a(view, R.id.cutout_background);
                    if (imageView != null) {
                        i10 = R.id.cutout_fill;
                        View a10 = b.a(view, R.id.cutout_fill);
                        if (a10 != null) {
                            i10 = R.id.cutout_space;
                            Space space = (Space) b.a(view, R.id.cutout_space);
                            if (space != null) {
                                i10 = R.id.cutout_wrapper;
                                LinearLayout linearLayout2 = (LinearLayout) b.a(view, R.id.cutout_wrapper);
                                if (linearLayout2 != null) {
                                    i10 = R.id.dailies_tab;
                                    BottomNavigationItem bottomNavigationItem = (BottomNavigationItem) b.a(view, R.id.dailies_tab);
                                    if (bottomNavigationItem != null) {
                                        i10 = R.id.habits_tab;
                                        BottomNavigationItem bottomNavigationItem2 = (BottomNavigationItem) b.a(view, R.id.habits_tab);
                                        if (bottomNavigationItem2 != null) {
                                            i10 = R.id.item_wrapper;
                                            LinearLayout linearLayout3 = (LinearLayout) b.a(view, R.id.item_wrapper);
                                            if (linearLayout3 != null) {
                                                i10 = R.id.rewards_tab;
                                                BottomNavigationItem bottomNavigationItem3 = (BottomNavigationItem) b.a(view, R.id.rewards_tab);
                                                if (bottomNavigationItem3 != null) {
                                                    i10 = R.id.submenu_wrapper;
                                                    LinearLayout linearLayout4 = (LinearLayout) b.a(view, R.id.submenu_wrapper);
                                                    if (linearLayout4 != null) {
                                                        i10 = R.id.todos_tab;
                                                        BottomNavigationItem bottomNavigationItem4 = (BottomNavigationItem) b.a(view, R.id.todos_tab);
                                                        if (bottomNavigationItem4 != null) {
                                                            return new MainNavigationViewBinding(view, imageButton, frameLayout, linearLayout, imageView, a10, space, linearLayout2, bottomNavigationItem, bottomNavigationItem2, linearLayout3, bottomNavigationItem3, linearLayout4, bottomNavigationItem4);
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

    public static MainNavigationViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.main_navigation_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // e4.a
    public View getRoot() {
        return this.rootView;
    }
}
