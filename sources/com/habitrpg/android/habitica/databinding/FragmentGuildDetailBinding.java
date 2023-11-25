package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.ui.views.UsernameLabel;
import com.habitrpg.common.habitica.views.AvatarView;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class FragmentGuildDetailBinding implements a {
    public final ImageView guildBankIcon;
    public final TextView guildBankText;
    public final TextView guildDescription;
    public final ImageView guildMembersIcon;
    public final TextView guildMembersText;
    public final TextView guildSummary;
    public final Button joinButton;
    public final AvatarView leaderAvatarView;
    public final UsernameLabel leaderProfileName;
    public final TextView leaderUsername;
    public final LinearLayout leaderWrapper;
    public final Button leaveButton;
    public final SwipeRefreshLayout refreshLayout;
    private final SwipeRefreshLayout rootView;
    public final TextView titleView;

    private FragmentGuildDetailBinding(SwipeRefreshLayout swipeRefreshLayout, ImageView imageView, TextView textView, TextView textView2, ImageView imageView2, TextView textView3, TextView textView4, Button button, AvatarView avatarView, UsernameLabel usernameLabel, TextView textView5, LinearLayout linearLayout, Button button2, SwipeRefreshLayout swipeRefreshLayout2, TextView textView6) {
        this.rootView = swipeRefreshLayout;
        this.guildBankIcon = imageView;
        this.guildBankText = textView;
        this.guildDescription = textView2;
        this.guildMembersIcon = imageView2;
        this.guildMembersText = textView3;
        this.guildSummary = textView4;
        this.joinButton = button;
        this.leaderAvatarView = avatarView;
        this.leaderProfileName = usernameLabel;
        this.leaderUsername = textView5;
        this.leaderWrapper = linearLayout;
        this.leaveButton = button2;
        this.refreshLayout = swipeRefreshLayout2;
        this.titleView = textView6;
    }

    public static FragmentGuildDetailBinding bind(View view) {
        int i10 = R.id.guild_bank_icon;
        ImageView imageView = (ImageView) b.a(view, R.id.guild_bank_icon);
        if (imageView != null) {
            i10 = R.id.guild_bank_text;
            TextView textView = (TextView) b.a(view, R.id.guild_bank_text);
            if (textView != null) {
                i10 = R.id.guild_description;
                TextView textView2 = (TextView) b.a(view, R.id.guild_description);
                if (textView2 != null) {
                    i10 = R.id.guild_members_icon;
                    ImageView imageView2 = (ImageView) b.a(view, R.id.guild_members_icon);
                    if (imageView2 != null) {
                        i10 = R.id.guild_members_text;
                        TextView textView3 = (TextView) b.a(view, R.id.guild_members_text);
                        if (textView3 != null) {
                            i10 = R.id.guild_summary;
                            TextView textView4 = (TextView) b.a(view, R.id.guild_summary);
                            if (textView4 != null) {
                                i10 = R.id.join_button;
                                Button button = (Button) b.a(view, R.id.join_button);
                                if (button != null) {
                                    i10 = R.id.leader_avatar_view;
                                    AvatarView avatarView = (AvatarView) b.a(view, R.id.leader_avatar_view);
                                    if (avatarView != null) {
                                        i10 = R.id.leader_profile_name;
                                        UsernameLabel usernameLabel = (UsernameLabel) b.a(view, R.id.leader_profile_name);
                                        if (usernameLabel != null) {
                                            i10 = R.id.leader_username;
                                            TextView textView5 = (TextView) b.a(view, R.id.leader_username);
                                            if (textView5 != null) {
                                                i10 = R.id.leader_wrapper;
                                                LinearLayout linearLayout = (LinearLayout) b.a(view, R.id.leader_wrapper);
                                                if (linearLayout != null) {
                                                    i10 = R.id.leave_button;
                                                    Button button2 = (Button) b.a(view, R.id.leave_button);
                                                    if (button2 != null) {
                                                        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) view;
                                                        i10 = R.id.title_view;
                                                        TextView textView6 = (TextView) b.a(view, R.id.title_view);
                                                        if (textView6 != null) {
                                                            return new FragmentGuildDetailBinding(swipeRefreshLayout, imageView, textView, textView2, imageView2, textView3, textView4, button, avatarView, usernameLabel, textView5, linearLayout, button2, swipeRefreshLayout, textView6);
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

    public static FragmentGuildDetailBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentGuildDetailBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.fragment_guild_detail, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // e4.a
    public SwipeRefreshLayout getRoot() {
        return this.rootView;
    }
}
