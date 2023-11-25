package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.tabs.TabLayout;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.ui.views.setup.AvatarCategoryView;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class AvatarSetupDrawerBinding implements a {
    public final AvatarCategoryView bodyButton;
    public final ImageView caretView;
    public final LinearLayout categoryLayout;
    public final RecyclerView customizationList;
    public final AvatarCategoryView extrasButton;
    public final AvatarCategoryView hairButton;
    private final RelativeLayout rootView;
    public final AvatarCategoryView skinButton;
    public final LinearLayout subcategoryLayout;
    public final TabLayout subcategoryTabs;

    private AvatarSetupDrawerBinding(RelativeLayout relativeLayout, AvatarCategoryView avatarCategoryView, ImageView imageView, LinearLayout linearLayout, RecyclerView recyclerView, AvatarCategoryView avatarCategoryView2, AvatarCategoryView avatarCategoryView3, AvatarCategoryView avatarCategoryView4, LinearLayout linearLayout2, TabLayout tabLayout) {
        this.rootView = relativeLayout;
        this.bodyButton = avatarCategoryView;
        this.caretView = imageView;
        this.categoryLayout = linearLayout;
        this.customizationList = recyclerView;
        this.extrasButton = avatarCategoryView2;
        this.hairButton = avatarCategoryView3;
        this.skinButton = avatarCategoryView4;
        this.subcategoryLayout = linearLayout2;
        this.subcategoryTabs = tabLayout;
    }

    public static AvatarSetupDrawerBinding bind(View view) {
        int i10 = R.id.body_button;
        AvatarCategoryView avatarCategoryView = (AvatarCategoryView) b.a(view, R.id.body_button);
        if (avatarCategoryView != null) {
            i10 = R.id.caret_view;
            ImageView imageView = (ImageView) b.a(view, R.id.caret_view);
            if (imageView != null) {
                i10 = R.id.category_layout;
                LinearLayout linearLayout = (LinearLayout) b.a(view, R.id.category_layout);
                if (linearLayout != null) {
                    i10 = R.id.customization_list;
                    RecyclerView recyclerView = (RecyclerView) b.a(view, R.id.customization_list);
                    if (recyclerView != null) {
                        i10 = R.id.extras_button;
                        AvatarCategoryView avatarCategoryView2 = (AvatarCategoryView) b.a(view, R.id.extras_button);
                        if (avatarCategoryView2 != null) {
                            i10 = R.id.hair_button;
                            AvatarCategoryView avatarCategoryView3 = (AvatarCategoryView) b.a(view, R.id.hair_button);
                            if (avatarCategoryView3 != null) {
                                i10 = R.id.skin_button;
                                AvatarCategoryView avatarCategoryView4 = (AvatarCategoryView) b.a(view, R.id.skin_button);
                                if (avatarCategoryView4 != null) {
                                    i10 = R.id.subcategory_layout;
                                    LinearLayout linearLayout2 = (LinearLayout) b.a(view, R.id.subcategory_layout);
                                    if (linearLayout2 != null) {
                                        i10 = R.id.subcategory_tabs;
                                        TabLayout tabLayout = (TabLayout) b.a(view, R.id.subcategory_tabs);
                                        if (tabLayout != null) {
                                            return new AvatarSetupDrawerBinding((RelativeLayout) view, avatarCategoryView, imageView, linearLayout, recyclerView, avatarCategoryView2, avatarCategoryView3, avatarCategoryView4, linearLayout2, tabLayout);
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

    public static AvatarSetupDrawerBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static AvatarSetupDrawerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.avatar_setup_drawer, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // e4.a
    public RelativeLayout getRoot() {
        return this.rootView;
    }
}
