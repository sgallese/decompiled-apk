package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.habitrpg.android.habitica.R;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class NotificationsHeaderBinding implements a {
    public final Button dismissAllButton;
    public final TextView notificationsTitleBadge;
    private final LinearLayout rootView;
    public final TextView title;

    private NotificationsHeaderBinding(LinearLayout linearLayout, Button button, TextView textView, TextView textView2) {
        this.rootView = linearLayout;
        this.dismissAllButton = button;
        this.notificationsTitleBadge = textView;
        this.title = textView2;
    }

    public static NotificationsHeaderBinding bind(View view) {
        int i10 = R.id.dismiss_all_button;
        Button button = (Button) b.a(view, R.id.dismiss_all_button);
        if (button != null) {
            i10 = R.id.notifications_title_badge;
            TextView textView = (TextView) b.a(view, R.id.notifications_title_badge);
            if (textView != null) {
                i10 = 16908310;
                TextView textView2 = (TextView) b.a(view, 16908310);
                if (textView2 != null) {
                    return new NotificationsHeaderBinding((LinearLayout) view, button, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static NotificationsHeaderBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static NotificationsHeaderBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.notifications_header, viewGroup, false);
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
