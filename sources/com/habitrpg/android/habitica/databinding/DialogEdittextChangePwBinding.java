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
public final class DialogEdittextChangePwBinding implements a {
    public final ValidatingEditText newPasswordEditText;
    public final ValidatingEditText newPasswordRepeatEditText;
    public final ValidatingEditText oldPasswordEditText;
    private final LinearLayout rootView;

    private DialogEdittextChangePwBinding(LinearLayout linearLayout, ValidatingEditText validatingEditText, ValidatingEditText validatingEditText2, ValidatingEditText validatingEditText3) {
        this.rootView = linearLayout;
        this.newPasswordEditText = validatingEditText;
        this.newPasswordRepeatEditText = validatingEditText2;
        this.oldPasswordEditText = validatingEditText3;
    }

    public static DialogEdittextChangePwBinding bind(View view) {
        int i10 = R.id.new_password_edit_text;
        ValidatingEditText validatingEditText = (ValidatingEditText) b.a(view, R.id.new_password_edit_text);
        if (validatingEditText != null) {
            i10 = R.id.new_password_repeat_edit_text;
            ValidatingEditText validatingEditText2 = (ValidatingEditText) b.a(view, R.id.new_password_repeat_edit_text);
            if (validatingEditText2 != null) {
                i10 = R.id.old_password_edit_text;
                ValidatingEditText validatingEditText3 = (ValidatingEditText) b.a(view, R.id.old_password_edit_text);
                if (validatingEditText3 != null) {
                    return new DialogEdittextChangePwBinding((LinearLayout) view, validatingEditText, validatingEditText2, validatingEditText3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static DialogEdittextChangePwBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static DialogEdittextChangePwBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.dialog_edittext_change_pw, viewGroup, false);
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
