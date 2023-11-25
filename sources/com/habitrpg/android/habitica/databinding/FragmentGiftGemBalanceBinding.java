package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.textfield.TextInputEditText;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.ui.views.UsernameLabel;
import com.habitrpg.common.habitica.views.AvatarView;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class FragmentGiftGemBalanceBinding implements a {
    public final AvatarView avatarView;
    public final UsernameLabel displayNameTextview;
    public final Button giftButton;
    public final TextInputEditText giftEditText;
    public final ProgressBar progressBar;
    private final NestedScrollView rootView;
    public final TextView usernameTextview;

    private FragmentGiftGemBalanceBinding(NestedScrollView nestedScrollView, AvatarView avatarView, UsernameLabel usernameLabel, Button button, TextInputEditText textInputEditText, ProgressBar progressBar, TextView textView) {
        this.rootView = nestedScrollView;
        this.avatarView = avatarView;
        this.displayNameTextview = usernameLabel;
        this.giftButton = button;
        this.giftEditText = textInputEditText;
        this.progressBar = progressBar;
        this.usernameTextview = textView;
    }

    public static FragmentGiftGemBalanceBinding bind(View view) {
        int i10 = R.id.avatar_view;
        AvatarView avatarView = (AvatarView) b.a(view, R.id.avatar_view);
        if (avatarView != null) {
            i10 = R.id.display_name_textview;
            UsernameLabel usernameLabel = (UsernameLabel) b.a(view, R.id.display_name_textview);
            if (usernameLabel != null) {
                i10 = R.id.gift_button;
                Button button = (Button) b.a(view, R.id.gift_button);
                if (button != null) {
                    i10 = R.id.gift_edit_text;
                    TextInputEditText textInputEditText = (TextInputEditText) b.a(view, R.id.gift_edit_text);
                    if (textInputEditText != null) {
                        i10 = R.id.progress_bar;
                        ProgressBar progressBar = (ProgressBar) b.a(view, R.id.progress_bar);
                        if (progressBar != null) {
                            i10 = R.id.username_textview;
                            TextView textView = (TextView) b.a(view, R.id.username_textview);
                            if (textView != null) {
                                return new FragmentGiftGemBalanceBinding((NestedScrollView) view, avatarView, usernameLabel, button, textInputEditText, progressBar, textView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static FragmentGiftGemBalanceBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentGiftGemBalanceBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.fragment_gift_gem_balance, viewGroup, false);
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
