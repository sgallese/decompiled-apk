package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.habitrpg.android.habitica.R;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class ActivityVerifyUsernameBinding implements a {
    public final Button confirmUsernameButton;
    public final EditText displayNameEditText;
    public final TextView footerTextView;
    public final TextView issuesTextView;
    private final FrameLayout rootView;
    public final FrameLayout snackbarView;
    public final EditText usernameEditText;
    public final TextView wikiTextView;

    private ActivityVerifyUsernameBinding(FrameLayout frameLayout, Button button, EditText editText, TextView textView, TextView textView2, FrameLayout frameLayout2, EditText editText2, TextView textView3) {
        this.rootView = frameLayout;
        this.confirmUsernameButton = button;
        this.displayNameEditText = editText;
        this.footerTextView = textView;
        this.issuesTextView = textView2;
        this.snackbarView = frameLayout2;
        this.usernameEditText = editText2;
        this.wikiTextView = textView3;
    }

    public static ActivityVerifyUsernameBinding bind(View view) {
        int i10 = R.id.confirm_username_button;
        Button button = (Button) b.a(view, R.id.confirm_username_button);
        if (button != null) {
            i10 = R.id.display_name_edit_text;
            EditText editText = (EditText) b.a(view, R.id.display_name_edit_text);
            if (editText != null) {
                i10 = R.id.footer_text_view;
                TextView textView = (TextView) b.a(view, R.id.footer_text_view);
                if (textView != null) {
                    i10 = R.id.issues_text_view;
                    TextView textView2 = (TextView) b.a(view, R.id.issues_text_view);
                    if (textView2 != null) {
                        i10 = R.id.snackbar_view;
                        FrameLayout frameLayout = (FrameLayout) b.a(view, R.id.snackbar_view);
                        if (frameLayout != null) {
                            i10 = R.id.username_edit_text;
                            EditText editText2 = (EditText) b.a(view, R.id.username_edit_text);
                            if (editText2 != null) {
                                i10 = R.id.wiki_text_view;
                                TextView textView3 = (TextView) b.a(view, R.id.wiki_text_view);
                                if (textView3 != null) {
                                    return new ActivityVerifyUsernameBinding((FrameLayout) view, button, editText, textView, textView2, frameLayout, editText2, textView3);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static ActivityVerifyUsernameBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityVerifyUsernameBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.activity_verify_username, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // e4.a
    public FrameLayout getRoot() {
        return this.rootView;
    }
}
