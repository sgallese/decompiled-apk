package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.ui.GemPurchaseOptionsView;
import com.habitrpg.android.habitica.ui.views.UsernameLabel;
import com.habitrpg.common.habitica.views.AvatarView;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class FragmentGiftGemPurchaseBinding implements a {
    public final AvatarView avatarView;
    public final UsernameLabel displayNameTextview;
    public final GemPurchaseOptionsView gems21View;
    public final GemPurchaseOptionsView gems42View;
    public final GemPurchaseOptionsView gems4View;
    public final GemPurchaseOptionsView gems84View;
    private final NestedScrollView rootView;
    public final TextView usernameTextview;

    private FragmentGiftGemPurchaseBinding(NestedScrollView nestedScrollView, AvatarView avatarView, UsernameLabel usernameLabel, GemPurchaseOptionsView gemPurchaseOptionsView, GemPurchaseOptionsView gemPurchaseOptionsView2, GemPurchaseOptionsView gemPurchaseOptionsView3, GemPurchaseOptionsView gemPurchaseOptionsView4, TextView textView) {
        this.rootView = nestedScrollView;
        this.avatarView = avatarView;
        this.displayNameTextview = usernameLabel;
        this.gems21View = gemPurchaseOptionsView;
        this.gems42View = gemPurchaseOptionsView2;
        this.gems4View = gemPurchaseOptionsView3;
        this.gems84View = gemPurchaseOptionsView4;
        this.usernameTextview = textView;
    }

    public static FragmentGiftGemPurchaseBinding bind(View view) {
        int i10 = R.id.avatar_view;
        AvatarView avatarView = (AvatarView) b.a(view, R.id.avatar_view);
        if (avatarView != null) {
            i10 = R.id.display_name_textview;
            UsernameLabel usernameLabel = (UsernameLabel) b.a(view, R.id.display_name_textview);
            if (usernameLabel != null) {
                i10 = R.id.gems_21_view;
                GemPurchaseOptionsView gemPurchaseOptionsView = (GemPurchaseOptionsView) b.a(view, R.id.gems_21_view);
                if (gemPurchaseOptionsView != null) {
                    i10 = R.id.gems_42_view;
                    GemPurchaseOptionsView gemPurchaseOptionsView2 = (GemPurchaseOptionsView) b.a(view, R.id.gems_42_view);
                    if (gemPurchaseOptionsView2 != null) {
                        i10 = R.id.gems_4_view;
                        GemPurchaseOptionsView gemPurchaseOptionsView3 = (GemPurchaseOptionsView) b.a(view, R.id.gems_4_view);
                        if (gemPurchaseOptionsView3 != null) {
                            i10 = R.id.gems_84_view;
                            GemPurchaseOptionsView gemPurchaseOptionsView4 = (GemPurchaseOptionsView) b.a(view, R.id.gems_84_view);
                            if (gemPurchaseOptionsView4 != null) {
                                i10 = R.id.username_textview;
                                TextView textView = (TextView) b.a(view, R.id.username_textview);
                                if (textView != null) {
                                    return new FragmentGiftGemPurchaseBinding((NestedScrollView) view, avatarView, usernameLabel, gemPurchaseOptionsView, gemPurchaseOptionsView2, gemPurchaseOptionsView3, gemPurchaseOptionsView4, textView);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static FragmentGiftGemPurchaseBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentGiftGemPurchaseBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.fragment_gift_gem_purchase, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // e4.a
    public NestedScrollView getRoot() {
        return this.rootView;
    }
}
