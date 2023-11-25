package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.habitrpg.android.habitica.R;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class DialogChooseMessageRecipientBinding implements a {
    public final TextView errorTextView;
    public final ProgressBar progressCircular;
    private final LinearLayout rootView;
    public final EditText uuidEditText;

    private DialogChooseMessageRecipientBinding(LinearLayout linearLayout, TextView textView, ProgressBar progressBar, EditText editText) {
        this.rootView = linearLayout;
        this.errorTextView = textView;
        this.progressCircular = progressBar;
        this.uuidEditText = editText;
    }

    public static DialogChooseMessageRecipientBinding bind(View view) {
        int i10 = R.id.error_text_view;
        TextView textView = (TextView) b.a(view, R.id.error_text_view);
        if (textView != null) {
            i10 = R.id.progress_circular;
            ProgressBar progressBar = (ProgressBar) b.a(view, R.id.progress_circular);
            if (progressBar != null) {
                i10 = R.id.uuidEditText;
                EditText editText = (EditText) b.a(view, R.id.uuidEditText);
                if (editText != null) {
                    return new DialogChooseMessageRecipientBinding((LinearLayout) view, textView, progressBar, editText);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static DialogChooseMessageRecipientBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static DialogChooseMessageRecipientBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.dialog_choose_message_recipient, viewGroup, false);
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
