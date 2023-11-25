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
public final class AutocompleteEmojiBinding implements a {
    public final TextView emojiTextview;
    public final TextView label;
    private final LinearLayout rootView;

    private AutocompleteEmojiBinding(LinearLayout linearLayout, TextView textView, TextView textView2) {
        this.rootView = linearLayout;
        this.emojiTextview = textView;
        this.label = textView2;
    }

    public static AutocompleteEmojiBinding bind(View view) {
        int i10 = R.id.emoji_textview;
        TextView textView = (TextView) b.a(view, R.id.emoji_textview);
        if (textView != null) {
            i10 = R.id.label;
            TextView textView2 = (TextView) b.a(view, R.id.label);
            if (textView2 != null) {
                return new AutocompleteEmojiBinding((LinearLayout) view, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static AutocompleteEmojiBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static AutocompleteEmojiBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.autocomplete_emoji, viewGroup, false);
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
