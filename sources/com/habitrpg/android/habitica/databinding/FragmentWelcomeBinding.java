package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.TextView;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.ui.SpeechBubbleView;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class FragmentWelcomeBinding implements a {
    public final EditText displayNameEditText;
    public final TextView issuesTextView;
    private final ScrollView rootView;
    public final SpeechBubbleView speechBubble;
    public final EditText usernameEditText;

    private FragmentWelcomeBinding(ScrollView scrollView, EditText editText, TextView textView, SpeechBubbleView speechBubbleView, EditText editText2) {
        this.rootView = scrollView;
        this.displayNameEditText = editText;
        this.issuesTextView = textView;
        this.speechBubble = speechBubbleView;
        this.usernameEditText = editText2;
    }

    public static FragmentWelcomeBinding bind(View view) {
        int i10 = R.id.display_name_edit_text;
        EditText editText = (EditText) b.a(view, R.id.display_name_edit_text);
        if (editText != null) {
            i10 = R.id.issues_text_view;
            TextView textView = (TextView) b.a(view, R.id.issues_text_view);
            if (textView != null) {
                i10 = R.id.speech_bubble;
                SpeechBubbleView speechBubbleView = (SpeechBubbleView) b.a(view, R.id.speech_bubble);
                if (speechBubbleView != null) {
                    i10 = R.id.username_edit_text;
                    EditText editText2 = (EditText) b.a(view, R.id.username_edit_text);
                    if (editText2 != null) {
                        return new FragmentWelcomeBinding((ScrollView) view, editText, textView, speechBubbleView, editText2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static FragmentWelcomeBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentWelcomeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.fragment_welcome, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // e4.a
    public ScrollView getRoot() {
        return this.rootView;
    }
}
