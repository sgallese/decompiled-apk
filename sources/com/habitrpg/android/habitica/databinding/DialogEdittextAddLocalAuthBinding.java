package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.ui.views.ValidatingEditText;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class DialogEdittextAddLocalAuthBinding implements a {
    public final ValidatingEditText emailEditText;
    public final ValidatingEditText passwordEditText;
    public final ValidatingEditText passwordRepeatEditText;
    private final LinearLayout rootView;

    private DialogEdittextAddLocalAuthBinding(LinearLayout linearLayout, ValidatingEditText validatingEditText, ValidatingEditText validatingEditText2, ValidatingEditText validatingEditText3) {
        this.rootView = linearLayout;
        this.emailEditText = validatingEditText;
        this.passwordEditText = validatingEditText2;
        this.passwordRepeatEditText = validatingEditText3;
    }

    public static DialogEdittextAddLocalAuthBinding bind(View view) {
        int i10 = R.id.email_edit_text;
        ValidatingEditText validatingEditText = (ValidatingEditText) b.a(view, R.id.email_edit_text);
        if (validatingEditText != null) {
            i10 = R.id.password_edit_text;
            ValidatingEditText validatingEditText2 = (ValidatingEditText) b.a(view, R.id.password_edit_text);
            if (validatingEditText2 != null) {
                i10 = R.id.password_repeat_edit_text;
                ValidatingEditText validatingEditText3 = (ValidatingEditText) b.a(view, R.id.password_repeat_edit_text);
                if (validatingEditText3 != null) {
                    return new DialogEdittextAddLocalAuthBinding((LinearLayout) view, validatingEditText, validatingEditText2, validatingEditText3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static DialogEdittextAddLocalAuthBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static DialogEdittextAddLocalAuthBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.dialog_edittext_add_local_auth, viewGroup, false);
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
