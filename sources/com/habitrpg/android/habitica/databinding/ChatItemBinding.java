package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.flexbox.FlexboxLayout;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.ui.views.UsernameLabel;
import com.habitrpg.common.habitica.views.AvatarView;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class ChatItemBinding implements a {
    public final AvatarView avatarView;
    public final FlexboxLayout buttonsWrapper;
    public final Button copyButton;
    public final Button deleteButton;
    public final TextView flagCountTextview;
    public final LinearLayout likeBackgroundLayout;
    public final TextView messageText;
    public final LinearLayout messageWrapper;
    public final TextView modView;
    public final Button replyButton;
    public final Button reportButton;
    private final LinearLayout rootView;
    public final TextView sublineTextview;
    public final TextView tvLikes;
    public final UsernameLabel userLabel;

    private ChatItemBinding(LinearLayout linearLayout, AvatarView avatarView, FlexboxLayout flexboxLayout, Button button, Button button2, TextView textView, LinearLayout linearLayout2, TextView textView2, LinearLayout linearLayout3, TextView textView3, Button button3, Button button4, TextView textView4, TextView textView5, UsernameLabel usernameLabel) {
        this.rootView = linearLayout;
        this.avatarView = avatarView;
        this.buttonsWrapper = flexboxLayout;
        this.copyButton = button;
        this.deleteButton = button2;
        this.flagCountTextview = textView;
        this.likeBackgroundLayout = linearLayout2;
        this.messageText = textView2;
        this.messageWrapper = linearLayout3;
        this.modView = textView3;
        this.replyButton = button3;
        this.reportButton = button4;
        this.sublineTextview = textView4;
        this.tvLikes = textView5;
        this.userLabel = usernameLabel;
    }

    public static ChatItemBinding bind(View view) {
        int i10 = R.id.avatar_view;
        AvatarView avatarView = (AvatarView) b.a(view, R.id.avatar_view);
        if (avatarView != null) {
            i10 = R.id.buttons_wrapper;
            FlexboxLayout flexboxLayout = (FlexboxLayout) b.a(view, R.id.buttons_wrapper);
            if (flexboxLayout != null) {
                i10 = R.id.copy_button;
                Button button = (Button) b.a(view, R.id.copy_button);
                if (button != null) {
                    i10 = R.id.delete_button;
                    Button button2 = (Button) b.a(view, R.id.delete_button);
                    if (button2 != null) {
                        i10 = R.id.flag_count_textview;
                        TextView textView = (TextView) b.a(view, R.id.flag_count_textview);
                        if (textView != null) {
                            i10 = R.id.like_background_layout;
                            LinearLayout linearLayout = (LinearLayout) b.a(view, R.id.like_background_layout);
                            if (linearLayout != null) {
                                i10 = R.id.message_text;
                                TextView textView2 = (TextView) b.a(view, R.id.message_text);
                                if (textView2 != null) {
                                    i10 = R.id.message_wrapper;
                                    LinearLayout linearLayout2 = (LinearLayout) b.a(view, R.id.message_wrapper);
                                    if (linearLayout2 != null) {
                                        i10 = R.id.mod_view;
                                        TextView textView3 = (TextView) b.a(view, R.id.mod_view);
                                        if (textView3 != null) {
                                            i10 = R.id.reply_button;
                                            Button button3 = (Button) b.a(view, R.id.reply_button);
                                            if (button3 != null) {
                                                i10 = R.id.report_button;
                                                Button button4 = (Button) b.a(view, R.id.report_button);
                                                if (button4 != null) {
                                                    i10 = R.id.subline_textview;
                                                    TextView textView4 = (TextView) b.a(view, R.id.subline_textview);
                                                    if (textView4 != null) {
                                                        i10 = R.id.tvLikes;
                                                        TextView textView5 = (TextView) b.a(view, R.id.tvLikes);
                                                        if (textView5 != null) {
                                                            i10 = R.id.user_label;
                                                            UsernameLabel usernameLabel = (UsernameLabel) b.a(view, R.id.user_label);
                                                            if (usernameLabel != null) {
                                                                return new ChatItemBinding((LinearLayout) view, avatarView, flexboxLayout, button, button2, textView, linearLayout, textView2, linearLayout2, textView3, button3, button4, textView4, textView5, usernameLabel);
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

    public static ChatItemBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ChatItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.chat_item, viewGroup, false);
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
