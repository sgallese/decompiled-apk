package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.ui.helpers.RecyclerViewEmptySupport;
import com.habitrpg.android.habitica.ui.views.social.ChatBarView;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class FragmentInboxMessageListBinding implements a {
    public final ChatBarView chatBarView;
    public final RecyclerViewEmptySupport recyclerView;
    private final LinearLayout rootView;

    private FragmentInboxMessageListBinding(LinearLayout linearLayout, ChatBarView chatBarView, RecyclerViewEmptySupport recyclerViewEmptySupport) {
        this.rootView = linearLayout;
        this.chatBarView = chatBarView;
        this.recyclerView = recyclerViewEmptySupport;
    }

    public static FragmentInboxMessageListBinding bind(View view) {
        int i10 = R.id.chatBarView;
        ChatBarView chatBarView = (ChatBarView) b.a(view, R.id.chatBarView);
        if (chatBarView != null) {
            i10 = R.id.recyclerView;
            RecyclerViewEmptySupport recyclerViewEmptySupport = (RecyclerViewEmptySupport) b.a(view, R.id.recyclerView);
            if (recyclerViewEmptySupport != null) {
                return new FragmentInboxMessageListBinding((LinearLayout) view, chatBarView, recyclerViewEmptySupport);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static FragmentInboxMessageListBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentInboxMessageListBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.fragment_inbox_message_list, viewGroup, false);
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
