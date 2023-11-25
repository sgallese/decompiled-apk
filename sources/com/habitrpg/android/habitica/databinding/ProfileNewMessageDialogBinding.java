package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import com.habitrpg.android.habitica.R;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class ProfileNewMessageDialogBinding implements a {
    public final AppCompatEditText editNewMessageText;
    public final TextView newMessageTitle;
    private final LinearLayout rootView;

    private ProfileNewMessageDialogBinding(LinearLayout linearLayout, AppCompatEditText appCompatEditText, TextView textView) {
        this.rootView = linearLayout;
        this.editNewMessageText = appCompatEditText;
        this.newMessageTitle = textView;
    }

    public static ProfileNewMessageDialogBinding bind(View view) {
        int i10 = R.id.edit_new_message_text;
        AppCompatEditText appCompatEditText = (AppCompatEditText) b.a(view, R.id.edit_new_message_text);
        if (appCompatEditText != null) {
            i10 = R.id.new_message_title;
            TextView textView = (TextView) b.a(view, R.id.new_message_title);
            if (textView != null) {
                return new ProfileNewMessageDialogBinding((LinearLayout) view, appCompatEditText, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static ProfileNewMessageDialogBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ProfileNewMessageDialogBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.profile_new_message_dialog, viewGroup, false);
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
