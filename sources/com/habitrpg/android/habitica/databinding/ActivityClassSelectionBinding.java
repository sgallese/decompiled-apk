package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.habitrpg.android.habitica.R;
import com.habitrpg.common.habitica.views.AvatarView;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class ActivityClassSelectionBinding implements a {
    public final AvatarView healerAvatarView;
    public final TextView healerButton;
    public final LinearLayout healerWrapper;
    public final AvatarView mageAvatarView;
    public final TextView mageButton;
    public final LinearLayout mageWrapper;
    public final AvatarView rogueAvatarView;
    public final TextView rogueButton;
    public final LinearLayout rogueWrapper;
    private final LinearLayout rootView;
    public final TextView selectedButton;
    public final TextView selectedDescriptionTextView;
    public final TextView selectedTitleTextView;
    public final LinearLayout selectedWrapperView;
    public final Toolbar toolbar;
    public final AvatarView warriorAvatarView;
    public final TextView warriorButton;
    public final LinearLayout warriorWrapper;

    private ActivityClassSelectionBinding(LinearLayout linearLayout, AvatarView avatarView, TextView textView, LinearLayout linearLayout2, AvatarView avatarView2, TextView textView2, LinearLayout linearLayout3, AvatarView avatarView3, TextView textView3, LinearLayout linearLayout4, TextView textView4, TextView textView5, TextView textView6, LinearLayout linearLayout5, Toolbar toolbar, AvatarView avatarView4, TextView textView7, LinearLayout linearLayout6) {
        this.rootView = linearLayout;
        this.healerAvatarView = avatarView;
        this.healerButton = textView;
        this.healerWrapper = linearLayout2;
        this.mageAvatarView = avatarView2;
        this.mageButton = textView2;
        this.mageWrapper = linearLayout3;
        this.rogueAvatarView = avatarView3;
        this.rogueButton = textView3;
        this.rogueWrapper = linearLayout4;
        this.selectedButton = textView4;
        this.selectedDescriptionTextView = textView5;
        this.selectedTitleTextView = textView6;
        this.selectedWrapperView = linearLayout5;
        this.toolbar = toolbar;
        this.warriorAvatarView = avatarView4;
        this.warriorButton = textView7;
        this.warriorWrapper = linearLayout6;
    }

    public static ActivityClassSelectionBinding bind(View view) {
        int i10 = R.id.healerAvatarView;
        AvatarView avatarView = (AvatarView) b.a(view, R.id.healerAvatarView);
        if (avatarView != null) {
            i10 = R.id.healerButton;
            TextView textView = (TextView) b.a(view, R.id.healerButton);
            if (textView != null) {
                i10 = R.id.healerWrapper;
                LinearLayout linearLayout = (LinearLayout) b.a(view, R.id.healerWrapper);
                if (linearLayout != null) {
                    i10 = R.id.mageAvatarView;
                    AvatarView avatarView2 = (AvatarView) b.a(view, R.id.mageAvatarView);
                    if (avatarView2 != null) {
                        i10 = R.id.mageButton;
                        TextView textView2 = (TextView) b.a(view, R.id.mageButton);
                        if (textView2 != null) {
                            i10 = R.id.mageWrapper;
                            LinearLayout linearLayout2 = (LinearLayout) b.a(view, R.id.mageWrapper);
                            if (linearLayout2 != null) {
                                i10 = R.id.rogueAvatarView;
                                AvatarView avatarView3 = (AvatarView) b.a(view, R.id.rogueAvatarView);
                                if (avatarView3 != null) {
                                    i10 = R.id.rogueButton;
                                    TextView textView3 = (TextView) b.a(view, R.id.rogueButton);
                                    if (textView3 != null) {
                                        i10 = R.id.rogueWrapper;
                                        LinearLayout linearLayout3 = (LinearLayout) b.a(view, R.id.rogueWrapper);
                                        if (linearLayout3 != null) {
                                            i10 = R.id.selected_button;
                                            TextView textView4 = (TextView) b.a(view, R.id.selected_button);
                                            if (textView4 != null) {
                                                i10 = R.id.selected_description_text_view;
                                                TextView textView5 = (TextView) b.a(view, R.id.selected_description_text_view);
                                                if (textView5 != null) {
                                                    i10 = R.id.selected_title_text_view;
                                                    TextView textView6 = (TextView) b.a(view, R.id.selected_title_text_view);
                                                    if (textView6 != null) {
                                                        i10 = R.id.selected_wrapper_view;
                                                        LinearLayout linearLayout4 = (LinearLayout) b.a(view, R.id.selected_wrapper_view);
                                                        if (linearLayout4 != null) {
                                                            i10 = R.id.toolbar;
                                                            Toolbar toolbar = (Toolbar) b.a(view, R.id.toolbar);
                                                            if (toolbar != null) {
                                                                i10 = R.id.warriorAvatarView;
                                                                AvatarView avatarView4 = (AvatarView) b.a(view, R.id.warriorAvatarView);
                                                                if (avatarView4 != null) {
                                                                    i10 = R.id.warriorButton;
                                                                    TextView textView7 = (TextView) b.a(view, R.id.warriorButton);
                                                                    if (textView7 != null) {
                                                                        i10 = R.id.warriorWrapper;
                                                                        LinearLayout linearLayout5 = (LinearLayout) b.a(view, R.id.warriorWrapper);
                                                                        if (linearLayout5 != null) {
                                                                            return new ActivityClassSelectionBinding((LinearLayout) view, avatarView, textView, linearLayout, avatarView2, textView2, linearLayout2, avatarView3, textView3, linearLayout3, textView4, textView5, textView6, linearLayout4, toolbar, avatarView4, textView7, linearLayout5);
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
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static ActivityClassSelectionBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityClassSelectionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.activity_class_selection, viewGroup, false);
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
