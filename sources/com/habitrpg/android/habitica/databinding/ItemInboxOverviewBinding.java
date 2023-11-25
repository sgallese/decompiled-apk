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
public final class ItemInboxOverviewBinding implements a {
    public final AvatarView avatarView;
    public final UsernameLabel displayNameTextview;
    public final TextView messageTextview;
    private final LinearLayout rootView;
    public final TextView timestampTextview;
    public final TextView usernameTextview;

    private ItemInboxOverviewBinding(LinearLayout linearLayout, AvatarView avatarView, UsernameLabel usernameLabel, TextView textView, TextView textView2, TextView textView3) {
        this.rootView = linearLayout;
        this.avatarView = avatarView;
        this.displayNameTextview = usernameLabel;
        this.messageTextview = textView;
        this.timestampTextview = textView2;
        this.usernameTextview = textView3;
    }

    public static ItemInboxOverviewBinding bind(View view) {
        int i10 = R.id.avatar_view;
        AvatarView avatarView = (AvatarView) b.a(view, R.id.avatar_view);
        if (avatarView != null) {
            i10 = R.id.display_name_textview;
            UsernameLabel usernameLabel = (UsernameLabel) b.a(view, R.id.display_name_textview);
            if (usernameLabel != null) {
                i10 = R.id.message_textview;
                TextView textView = (TextView) b.a(view, R.id.message_textview);
                if (textView != null) {
                    i10 = R.id.timestamp_textview;
                    TextView textView2 = (TextView) b.a(view, R.id.timestamp_textview);
                    if (textView2 != null) {
                        i10 = R.id.username_textview;
                        TextView textView3 = (TextView) b.a(view, R.id.username_textview);
                        if (textView3 != null) {
                            return new ItemInboxOverviewBinding((LinearLayout) view, avatarView, usernameLabel, textView, textView2, textView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static ItemInboxOverviewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemInboxOverviewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.item_inbox_overview, viewGroup, false);
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
