package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.habitrpg.android.habitica.R;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class SystemChatMessageBinding implements a {
    private final LinearLayout rootView;
    public final TextView systemMessageTimestamp;
    public final TextView textView;

    private SystemChatMessageBinding(LinearLayout linearLayout, TextView textView, TextView textView2) {
        this.rootView = linearLayout;
        this.systemMessageTimestamp = textView;
        this.textView = textView2;
    }

    public static SystemChatMessageBinding bind(View view) {
        int i10 = R.id.system_message_timestamp;
        TextView textView = (TextView) b.a(view, R.id.system_message_timestamp);
        if (textView != null) {
            i10 = R.id.text_view;
            TextView textView2 = (TextView) b.a(view, R.id.text_view);
            if (textView2 != null) {
                return new SystemChatMessageBinding((LinearLayout) view, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static SystemChatMessageBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static SystemChatMessageBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.system_chat_message, viewGroup, false);
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
