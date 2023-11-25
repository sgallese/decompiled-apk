package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.ui.views.social.ChatBarView;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class FragmentChatBinding implements a {
    public final ChatBarView chatBarView;
    public final RecyclerView recyclerView;
    private final LinearLayout rootView;

    private FragmentChatBinding(LinearLayout linearLayout, ChatBarView chatBarView, RecyclerView recyclerView) {
        this.rootView = linearLayout;
        this.chatBarView = chatBarView;
        this.recyclerView = recyclerView;
    }

    public static FragmentChatBinding bind(View view) {
        int i10 = R.id.chatBarView;
        ChatBarView chatBarView = (ChatBarView) b.a(view, R.id.chatBarView);
        if (chatBarView != null) {
            i10 = R.id.recyclerView;
            RecyclerView recyclerView = (RecyclerView) b.a(view, R.id.recyclerView);
            if (recyclerView != null) {
                return new FragmentChatBinding((LinearLayout) view, chatBarView, recyclerView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static FragmentChatBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentChatBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.fragment_chat, viewGroup, false);
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
