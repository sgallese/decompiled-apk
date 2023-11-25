package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.ui.views.UsernameLabel;
import com.habitrpg.common.habitica.views.AvatarView;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class TavernChatIntroItemBinding implements a {
    public final AvatarView avatarView;
    public final UsernameLabel displayNameTextview;
    public final TextView filler1;
    public final TextView filler2;
    public final TextView messageText;
    private final LinearLayout rootView;
    public final TextView sublineTextview;

    private TavernChatIntroItemBinding(LinearLayout linearLayout, AvatarView avatarView, UsernameLabel usernameLabel, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.rootView = linearLayout;
        this.avatarView = avatarView;
        this.displayNameTextview = usernameLabel;
        this.filler1 = textView;
        this.filler2 = textView2;
        this.messageText = textView3;
        this.sublineTextview = textView4;
    }

    public static TavernChatIntroItemBinding bind(View view) {
        int i10 = R.id.avatar_view;
        AvatarView avatarView = (AvatarView) b.a(view, R.id.avatar_view);
        if (avatarView != null) {
            i10 = R.id.display_name_textview;
            UsernameLabel usernameLabel = (UsernameLabel) b.a(view, R.id.display_name_textview);
            if (usernameLabel != null) {
                i10 = R.id.filler_1;
                TextView textView = (TextView) b.a(view, R.id.filler_1);
                if (textView != null) {
                    i10 = R.id.filler_2;
                    TextView textView2 = (TextView) b.a(view, R.id.filler_2);
                    if (textView2 != null) {
                        i10 = R.id.message_text;
                        TextView textView3 = (TextView) b.a(view, R.id.message_text);
                        if (textView3 != null) {
                            i10 = R.id.subline_textview;
                            TextView textView4 = (TextView) b.a(view, R.id.subline_textview);
                            if (textView4 != null) {
                                return new TavernChatIntroItemBinding((LinearLayout) view, avatarView, usernameLabel, textView, textView2, textView3, textView4);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static TavernChatIntroItemBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static TavernChatIntroItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.tavern_chat_intro_item, viewGroup, false);
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
