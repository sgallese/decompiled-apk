package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.ui.views.UsernameLabel;
import com.habitrpg.common.habitica.views.AvatarView;
import com.habitrpg.common.habitica.views.HabiticaProgressBar;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class PartyMemberBinding implements a {
    public final AvatarView avatarView;
    public final ImageView buffIconView;
    public final ImageView classIconView;
    public final UsernameLabel displayNameTextview;
    public final HabiticaProgressBar experienceBar;
    public final TextView experienceTextview;
    public final HabiticaProgressBar healthBar;
    public final TextView healthTextview;
    public final HabiticaProgressBar manaBar;
    public final TextView manaTextview;
    public final ImageButton moreButton;
    private final LinearLayout rootView;
    public final TextView sublineTextview;
    public final TextView youPill;

    private PartyMemberBinding(LinearLayout linearLayout, AvatarView avatarView, ImageView imageView, ImageView imageView2, UsernameLabel usernameLabel, HabiticaProgressBar habiticaProgressBar, TextView textView, HabiticaProgressBar habiticaProgressBar2, TextView textView2, HabiticaProgressBar habiticaProgressBar3, TextView textView3, ImageButton imageButton, TextView textView4, TextView textView5) {
        this.rootView = linearLayout;
        this.avatarView = avatarView;
        this.buffIconView = imageView;
        this.classIconView = imageView2;
        this.displayNameTextview = usernameLabel;
        this.experienceBar = habiticaProgressBar;
        this.experienceTextview = textView;
        this.healthBar = habiticaProgressBar2;
        this.healthTextview = textView2;
        this.manaBar = habiticaProgressBar3;
        this.manaTextview = textView3;
        this.moreButton = imageButton;
        this.sublineTextview = textView4;
        this.youPill = textView5;
    }

    public static PartyMemberBinding bind(View view) {
        int i10 = R.id.avatarView;
        AvatarView avatarView = (AvatarView) b.a(view, R.id.avatarView);
        if (avatarView != null) {
            i10 = R.id.buff_icon_view;
            ImageView imageView = (ImageView) b.a(view, R.id.buff_icon_view);
            if (imageView != null) {
                i10 = R.id.class_icon_view;
                ImageView imageView2 = (ImageView) b.a(view, R.id.class_icon_view);
                if (imageView2 != null) {
                    i10 = R.id.display_name_textview;
                    UsernameLabel usernameLabel = (UsernameLabel) b.a(view, R.id.display_name_textview);
                    if (usernameLabel != null) {
                        i10 = R.id.experience_bar;
                        HabiticaProgressBar habiticaProgressBar = (HabiticaProgressBar) b.a(view, R.id.experience_bar);
                        if (habiticaProgressBar != null) {
                            i10 = R.id.experience_textview;
                            TextView textView = (TextView) b.a(view, R.id.experience_textview);
                            if (textView != null) {
                                i10 = R.id.health_bar;
                                HabiticaProgressBar habiticaProgressBar2 = (HabiticaProgressBar) b.a(view, R.id.health_bar);
                                if (habiticaProgressBar2 != null) {
                                    i10 = R.id.health_textview;
                                    TextView textView2 = (TextView) b.a(view, R.id.health_textview);
                                    if (textView2 != null) {
                                        i10 = R.id.mana_bar;
                                        HabiticaProgressBar habiticaProgressBar3 = (HabiticaProgressBar) b.a(view, R.id.mana_bar);
                                        if (habiticaProgressBar3 != null) {
                                            i10 = R.id.mana_textview;
                                            TextView textView3 = (TextView) b.a(view, R.id.mana_textview);
                                            if (textView3 != null) {
                                                i10 = R.id.more_button;
                                                ImageButton imageButton = (ImageButton) b.a(view, R.id.more_button);
                                                if (imageButton != null) {
                                                    i10 = R.id.subline_textview;
                                                    TextView textView4 = (TextView) b.a(view, R.id.subline_textview);
                                                    if (textView4 != null) {
                                                        i10 = R.id.you_pill;
                                                        TextView textView5 = (TextView) b.a(view, R.id.you_pill);
                                                        if (textView5 != null) {
                                                            return new PartyMemberBinding((LinearLayout) view, avatarView, imageView, imageView2, usernameLabel, habiticaProgressBar, textView, habiticaProgressBar2, textView2, habiticaProgressBar3, textView3, imageButton, textView4, textView5);
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

    public static PartyMemberBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static PartyMemberBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.party_member, viewGroup, false);
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
