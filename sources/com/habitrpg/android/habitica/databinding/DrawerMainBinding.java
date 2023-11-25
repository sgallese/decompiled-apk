package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.habitrpg.android.habitica.R;
import com.habitrpg.common.habitica.views.AvatarView;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class DrawerMainBinding implements a {
    public final AvatarView avatarView;
    public final LinearLayout menuHeaderView;
    public final TextView messagesBadge;
    public final ImageView messagesButton;
    public final RelativeLayout messagesButtonWrapper;
    public final TextView notificationsBadge;
    public final ImageView notificationsButton;
    public final RelativeLayout notificationsButtonWrapper;
    public final RecyclerView recyclerView;
    private final LinearLayout rootView;
    public final TextView settingsBadge;
    public final ImageView settingsButton;
    public final RelativeLayout settingsButtonWrapper;
    public final TextView toolbarTitle;
    public final TextView usernameTextView;

    private DrawerMainBinding(LinearLayout linearLayout, AvatarView avatarView, LinearLayout linearLayout2, TextView textView, ImageView imageView, RelativeLayout relativeLayout, TextView textView2, ImageView imageView2, RelativeLayout relativeLayout2, RecyclerView recyclerView, TextView textView3, ImageView imageView3, RelativeLayout relativeLayout3, TextView textView4, TextView textView5) {
        this.rootView = linearLayout;
        this.avatarView = avatarView;
        this.menuHeaderView = linearLayout2;
        this.messagesBadge = textView;
        this.messagesButton = imageView;
        this.messagesButtonWrapper = relativeLayout;
        this.notificationsBadge = textView2;
        this.notificationsButton = imageView2;
        this.notificationsButtonWrapper = relativeLayout2;
        this.recyclerView = recyclerView;
        this.settingsBadge = textView3;
        this.settingsButton = imageView3;
        this.settingsButtonWrapper = relativeLayout3;
        this.toolbarTitle = textView4;
        this.usernameTextView = textView5;
    }

    public static DrawerMainBinding bind(View view) {
        int i10 = R.id.avatarView;
        AvatarView avatarView = (AvatarView) b.a(view, R.id.avatarView);
        if (avatarView != null) {
            i10 = R.id.menuHeaderView;
            LinearLayout linearLayout = (LinearLayout) b.a(view, R.id.menuHeaderView);
            if (linearLayout != null) {
                i10 = R.id.messagesBadge;
                TextView textView = (TextView) b.a(view, R.id.messagesBadge);
                if (textView != null) {
                    i10 = R.id.messagesButton;
                    ImageView imageView = (ImageView) b.a(view, R.id.messagesButton);
                    if (imageView != null) {
                        i10 = R.id.messagesButtonWrapper;
                        RelativeLayout relativeLayout = (RelativeLayout) b.a(view, R.id.messagesButtonWrapper);
                        if (relativeLayout != null) {
                            i10 = R.id.notificationsBadge;
                            TextView textView2 = (TextView) b.a(view, R.id.notificationsBadge);
                            if (textView2 != null) {
                                i10 = R.id.notificationsButton;
                                ImageView imageView2 = (ImageView) b.a(view, R.id.notificationsButton);
                                if (imageView2 != null) {
                                    i10 = R.id.notificationsButtonWrapper;
                                    RelativeLayout relativeLayout2 = (RelativeLayout) b.a(view, R.id.notificationsButtonWrapper);
                                    if (relativeLayout2 != null) {
                                        i10 = R.id.recyclerView;
                                        RecyclerView recyclerView = (RecyclerView) b.a(view, R.id.recyclerView);
                                        if (recyclerView != null) {
                                            i10 = R.id.settingsBadge;
                                            TextView textView3 = (TextView) b.a(view, R.id.settingsBadge);
                                            if (textView3 != null) {
                                                i10 = R.id.settingsButton;
                                                ImageView imageView3 = (ImageView) b.a(view, R.id.settingsButton);
                                                if (imageView3 != null) {
                                                    i10 = R.id.settingsButtonWrapper;
                                                    RelativeLayout relativeLayout3 = (RelativeLayout) b.a(view, R.id.settingsButtonWrapper);
                                                    if (relativeLayout3 != null) {
                                                        i10 = R.id.toolbarTitle;
                                                        TextView textView4 = (TextView) b.a(view, R.id.toolbarTitle);
                                                        if (textView4 != null) {
                                                            i10 = R.id.usernameTextView;
                                                            TextView textView5 = (TextView) b.a(view, R.id.usernameTextView);
                                                            if (textView5 != null) {
                                                                return new DrawerMainBinding((LinearLayout) view, avatarView, linearLayout, textView, imageView, relativeLayout, textView2, imageView2, relativeLayout2, recyclerView, textView3, imageView3, relativeLayout3, textView4, textView5);
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

    public static DrawerMainBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static DrawerMainBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.drawer_main, viewGroup, false);
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
