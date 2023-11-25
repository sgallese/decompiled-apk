package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.habitrpg.android.habitica.R;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class ValidatingEditTextBinding implements a {
    public final TextInputEditText editText;
    public final TextView errorText;
    public final TextInputLayout inputLayout;
    private final View rootView;

    private ValidatingEditTextBinding(View view, TextInputEditText textInputEditText, TextView textView, TextInputLayout textInputLayout) {
        this.rootView = view;
        this.editText = textInputEditText;
        this.errorText = textView;
        this.inputLayout = textInputLayout;
    }

    public static ValidatingEditTextBinding bind(View view) {
        int i10 = R.id.edit_text;
        TextInputEditText textInputEditText = (TextInputEditText) b.a(view, R.id.edit_text);
        if (textInputEditText != null) {
            i10 = R.id.error_text;
            TextView textView = (TextView) b.a(view, R.id.error_text);
            if (textView != null) {
                i10 = R.id.input_layout;
                TextInputLayout textInputLayout = (TextInputLayout) b.a(view, R.id.input_layout);
                if (textInputLayout != null) {
                    return new ValidatingEditTextBinding(view, textInputEditText, textView, textInputLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static ValidatingEditTextBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.validating_edit_text, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // e4.a
    public View getRoot() {
        return this.rootView;
    }
}
