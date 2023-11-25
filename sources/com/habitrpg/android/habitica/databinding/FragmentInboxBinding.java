package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.habitrpg.android.habitica.R;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class FragmentInboxBinding implements a {
    public final LinearLayout inboxMessages;
    public final SwipeRefreshLayout inboxRefreshLayout;
    public final LinearLayout optOutView;
    private final SwipeRefreshLayout rootView;

    private FragmentInboxBinding(SwipeRefreshLayout swipeRefreshLayout, LinearLayout linearLayout, SwipeRefreshLayout swipeRefreshLayout2, LinearLayout linearLayout2) {
        this.rootView = swipeRefreshLayout;
        this.inboxMessages = linearLayout;
        this.inboxRefreshLayout = swipeRefreshLayout2;
        this.optOutView = linearLayout2;
    }

    public static FragmentInboxBinding bind(View view) {
        int i10 = R.id.inbox_messages;
        LinearLayout linearLayout = (LinearLayout) b.a(view, R.id.inbox_messages);
        if (linearLayout != null) {
            SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) view;
            LinearLayout linearLayout2 = (LinearLayout) b.a(view, R.id.opt_out_view);
            if (linearLayout2 != null) {
                return new FragmentInboxBinding(swipeRefreshLayout, linearLayout, swipeRefreshLayout, linearLayout2);
            }
            i10 = R.id.opt_out_view;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static FragmentInboxBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentInboxBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.fragment_inbox, viewGroup, false);
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
