package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.habitrpg.android.habitica.R;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class ActivityNotificationsBinding implements a {
    public final FrameLayout fragmentContainer;
    public final LinearLayout notificationItems;
    public final SwipeRefreshLayout notificationsRefreshLayout;
    private final LinearLayout rootView;
    public final Toolbar toolbar;

    private ActivityNotificationsBinding(LinearLayout linearLayout, FrameLayout frameLayout, LinearLayout linearLayout2, SwipeRefreshLayout swipeRefreshLayout, Toolbar toolbar) {
        this.rootView = linearLayout;
        this.fragmentContainer = frameLayout;
        this.notificationItems = linearLayout2;
        this.notificationsRefreshLayout = swipeRefreshLayout;
        this.toolbar = toolbar;
    }

    public static ActivityNotificationsBinding bind(View view) {
        int i10 = R.id.fragment_container;
        FrameLayout frameLayout = (FrameLayout) b.a(view, R.id.fragment_container);
        if (frameLayout != null) {
            i10 = R.id.notification_items;
            LinearLayout linearLayout = (LinearLayout) b.a(view, R.id.notification_items);
            if (linearLayout != null) {
                i10 = R.id.notifications_refresh_layout;
                SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) b.a(view, R.id.notifications_refresh_layout);
                if (swipeRefreshLayout != null) {
                    i10 = R.id.toolbar;
                    Toolbar toolbar = (Toolbar) b.a(view, R.id.toolbar);
                    if (toolbar != null) {
                        return new ActivityNotificationsBinding((LinearLayout) view, frameLayout, linearLayout, swipeRefreshLayout, toolbar);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static ActivityNotificationsBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityNotificationsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.activity_notifications, viewGroup, false);
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
